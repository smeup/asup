/**
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.il.esam.jdbc;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QDatabaseManager;
import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.esam.AccessMode;
import org.smeup.sys.il.esam.OperationDirection;
import org.smeup.sys.il.esam.QIndex;
import org.smeup.sys.il.esam.QIndexColumn;
import org.smeup.sys.il.esam.QAccessFactory;
import org.smeup.sys.il.esam.QKSDataSet;
import org.smeup.sys.il.esam.QRRDataSet;
import org.smeup.sys.il.esam.annotation.Descend;
import org.smeup.sys.il.esam.annotation.Index;

public class JDBCAccessFactoryImpl implements QAccessFactory {

	private QConnection connection;
	private QDataFactory dataFactory;

	private static final QIndex TABLE_INDEX_RELATIVE_RECORD_NUMBER = new QIndex() {

		List<QIndexColumn> columns = new ArrayList<QIndexColumn>();

		@Override
		public List<QIndexColumn> getColumns() {

			if (this.columns.isEmpty())
				synchronized (this.columns) {
					QIndexColumn indexColumn = new QIndexColumn() {

						@Override
						public OperationDirection getDirection() {
							return OperationDirection.FORWARD;
						}

						@Override
						public int getLength() {
							return QDatabaseManager.TABLE_COLUMN_RELATIVE_RECORD_NUMBER_LENGTH;
						}

						@Override
						public String getName() {
							return QDatabaseManager.TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME;
						}

						@Override
						public boolean isNumeric() {
							return true;
						}

					};
					this.columns.add(indexColumn);
				}
			return this.columns;
		}
	};

	public JDBCAccessFactoryImpl(QConnection connection, QDataFactory dataFactory) {
		this.connection = connection;
		this.dataFactory = dataFactory;
	}

	@Override
	public <R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper) {
		return createKeySequencedDataSet(wrapper, AccessMode.INPUT);
	}

	@Override
	public <R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper, AccessMode accessMode) {
		return createKeySequencedDataSet(wrapper, accessMode, true);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen) {
		try {

			R record = null;
			if (QDataStruct.class.isAssignableFrom(wrapper))
				record = (R) this.dataFactory.createDataStruct((Class<QDataStruct>) wrapper, 0, true);
			else
				throw new IntegratedLanguageDataRuntimeException("Invalid record class: " + wrapper);

			QIndex index = getIndex(record);
			if (index == null)
				index = TABLE_INDEX_RELATIVE_RECORD_NUMBER;

			return new JDBCKeySequencedDataSetImpl<R>(connection, new JDBCTableProvider(connection), index, record, accessMode, userOpen);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public <R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(Class<R> wrapper) {

		return createRelativeRecordDataSet(wrapper, AccessMode.INPUT);
	}

	@Override
	public <R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(Class<R> wrapper, AccessMode accessMode) {
		return createRelativeRecordDataSet(wrapper, accessMode, true);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen) {

		try {
			R record = null;
			if (QDataStruct.class.isAssignableFrom(wrapper))
				record = (R) this.dataFactory.createDataStruct((Class<QDataStruct>) wrapper, 0, true);
			else
				throw new IntegratedLanguageDataRuntimeException("Invalid record class: " + wrapper);

			QIndex index = getIndex(record);
			if (index == null)
				index = TABLE_INDEX_RELATIVE_RECORD_NUMBER;

			return new JDBCRelativeRecordDataSetImpl<R>(connection, new JDBCTableProvider(connection), index, record, accessMode, userOpen);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public QIndex getIndex(Object object) {

		QIndex index = null;

		try {

			Class<?> keyKlass = null;

			for (Class<?> declaredClass : object.getClass().getDeclaredClasses()) {

				if (declaredClass.getAnnotation(Index.class) != null) {
					keyKlass = declaredClass;
					break;
				}
			}

			if (keyKlass == null)
				return null;

			index = new VirtualIndex(keyKlass);
		} catch (SecurityException | IllegalArgumentException e) {
			throw new IntegratedLanguageCoreRuntimeException(e);
		}

		return index;
	}

	public static class VirtualIndex implements QIndex {

		private Class<?> klass;

		public VirtualIndex(Class<?> klass) {
			this.klass = klass;
		}

		List<QIndexColumn> columns = new ArrayList<QIndexColumn>();

		@Override
		public List<QIndexColumn> getColumns() {

			if (this.columns.isEmpty()) {
				synchronized (this.columns) {
					for (Field field : klass.getFields()) {

						try {

							DataDef dataDef = field.getAnnotation(DataDef.class);
							if (dataDef == null) {
								Class<?> dictionaryClass = klass.getDeclaringClass().getSuperclass();
								Field dictionaryField = dictionaryClass.getField(field.getName());
								if (dictionaryField == null)
									continue;

								dataDef = dictionaryField.getAnnotation(DataDef.class);
							}

							if (dataDef == null)
								continue;

							int length = dataDef.precision();
							if(length == 0)
								length = dataDef.length();
							
							OperationDirection operationDirection = null;
							if (field.getAnnotation(Descend.class) != null)
								operationDirection = OperationDirection.BACKWARD;
							else
								operationDirection = OperationDirection.FORWARD;

							this.columns.add(new VirtualColumn(field.getName(), length, dataDef.precision() != 0, operationDirection));

						} catch (NoSuchFieldException | SecurityException e1) {
							e1.printStackTrace();
						}
					}

				}
			}
			return this.columns;
		}
	}

	private static class VirtualColumn implements QIndexColumn {

		protected VirtualColumn(String name, int length, boolean isNumeric, OperationDirection operationDirection) {
			super();
			this.name = name;
			this.length = length;
			this.isNumeric = isNumeric;
			this.operationDirection = operationDirection;
		}

		private String name;
		private int length;
		private boolean isNumeric;
		private OperationDirection operationDirection;


		@Override
		public String getName() {
			return name;
		}

		@Override
		public OperationDirection getDirection() {
			return operationDirection;
		}

		@Override
		public boolean isNumeric() {
			return isNumeric;
		}

		@Override
		public int getLength() {
			return length;
		}

	}
}