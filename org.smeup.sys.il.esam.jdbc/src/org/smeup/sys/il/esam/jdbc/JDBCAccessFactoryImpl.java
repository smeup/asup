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
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.esam.AccessMode;
import org.smeup.sys.il.esam.OperationDirection;
import org.smeup.sys.il.esam.QAccessFactory;
import org.smeup.sys.il.esam.QIndex;
import org.smeup.sys.il.esam.QIndexColumn;
import org.smeup.sys.il.esam.QKSDataSet;
import org.smeup.sys.il.esam.QRRDataSet;
import org.smeup.sys.il.esam.QSMDataSet;
import org.smeup.sys.il.esam.annotation.Descend;
import org.smeup.sys.il.esam.annotation.Index;
import org.smeup.sys.il.esam.jdbc.JDBCDataSetImpl.InfoStruct;
import org.smeup.sys.os.file.base.BaseFileMemberDataSetImpl;
import org.smeup.sys.os.file.base.BaseFileMemberProvider;

public class JDBCAccessFactoryImpl implements QAccessFactory {

	private QContext context;
	private QConnection connection;
	private QDataFactory dataFactory;

	public JDBCAccessFactoryImpl(QContext context, QConnection connection, QDataFactory dataFactory) {
		this.context = context;
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

	@Override
	public <R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen) {
		return createKeySequencedDataSet(wrapper, accessMode, userOpen, null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct) {

		R record = null;
		if (QDataStruct.class.isAssignableFrom(wrapper))
			record = (R) this.dataFactory.createDataStruct((Class<QDataStruct>) wrapper, 0, true);
		else
			throw new IntegratedLanguageDataRuntimeException("Invalid record class: " + wrapper);

		return createKeySequencedDataSet(record, wrapper.getSimpleName(), accessMode, userOpen, infoStruct);
	}

	@Override
	public <R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(R record, String name, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct) {

		QIndex index = getIndex(record);
		if (index == null)
			index = TABLE_INDEX_RELATIVE_RECORD_NUMBER;

		InfoStruct internalInfoStruct = null;
		if (infoStruct != null) {
			internalInfoStruct = dataFactory.createDataStruct(InfoStruct.class, 0, false);
			infoStruct.assign(internalInfoStruct);
		} else {
			internalInfoStruct = dataFactory.createDataStruct(InfoStruct.class, 0, true);
		}

		return new JDBCKeySequencedDataSetImpl<R>(connection, new JDBCTableProvider(connection), index, record, name, accessMode, userOpen, internalInfoStruct, dataFactory.getDataContext());

	}

	@Override
	public <R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(Class<R> wrapper) {

		return createRelativeRecordDataSet(wrapper, AccessMode.INPUT);
	}

	@Override
	public <R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(Class<R> wrapper, AccessMode accessMode) {
		return createRelativeRecordDataSet(wrapper, accessMode, true);
	}

	@Override
	public <R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen) {
		return createRelativeRecordDataSet(wrapper, accessMode, userOpen, null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct) {

		R record = null;
		if (QDataStruct.class.isAssignableFrom(wrapper))
			record = (R) this.dataFactory.createDataStruct((Class<QDataStruct>) wrapper, 0, true);
		else
			throw new IntegratedLanguageDataRuntimeException("Invalid record class: " + wrapper);

		return createRelativeRecordDataSet(record, wrapper.getSimpleName(), accessMode, userOpen, infoStruct);
	}

	@Override
	public <R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(R record, String name, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct) {

		QIndex index = getIndex(record);
		if (index == null)
			index = TABLE_INDEX_RELATIVE_RECORD_NUMBER;

		InfoStruct internalInfoStruct = null;
		if (infoStruct != null) {
			internalInfoStruct = dataFactory.createDataStruct(InfoStruct.class, 0, false);
			infoStruct.assign(internalInfoStruct);
		} else {
			internalInfoStruct = dataFactory.createDataStruct(InfoStruct.class, 0, true);
		}

		return new JDBCRelativeRecordDataSetImpl<R>(connection, new JDBCTableProvider(connection), index, record, name, accessMode, userOpen, internalInfoStruct, dataFactory.getDataContext());
	}

	@Override
	public <R extends QRecord> QSMDataSet<R> createSourceMemberDataSet(Class<R> wrapper) {
		return createSourceMemberDataSet(wrapper, AccessMode.INPUT);
	}

	@Override
	public <R extends QRecord> QSMDataSet<R> createSourceMemberDataSet(Class<R> wrapper, AccessMode accessMode) {
		return createSourceMemberDataSet(wrapper, accessMode, true);
	}
	
	@Override
	public <R extends QRecord> QSMDataSet<R> createSourceMemberDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen) {
		return createSourceMemberDataSet(wrapper, accessMode, userOpen, null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <R extends QRecord> QSMDataSet<R> createSourceMemberDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct) {

		R record = null;
		if (QDataStruct.class.isAssignableFrom(wrapper))
			record = (R) this.dataFactory.createDataStruct((Class<QDataStruct>) wrapper, 0, true);
		else
			throw new IntegratedLanguageDataRuntimeException("Invalid record class: " + wrapper);

		return createSourceMemberDataSet(record, wrapper.getSimpleName(), accessMode, userOpen, infoStruct);
	}

	@Override
	public <R extends QRecord> QSMDataSet<R> createSourceMemberDataSet(R record, String name, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct) {

		BaseFileMemberProvider fileMemberProvider = new BaseFileMemberProvider(context, name);

		QSMDataSet<R> dataSet = new BaseFileMemberDataSetImpl<R>(fileMemberProvider, record, accessMode, userOpen);
		
		return dataSet;
	}


	public QIndex getIndex(Object object) {

		QIndex index = null;

		try {

			Class<?> keyKlass = null;

			for (Class<?> declaredClass : object.getClass().getDeclaredClasses())
				if (declaredClass.getAnnotation(Index.class) != null) {
					keyKlass = declaredClass;
					break;
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

			if (this.columns.isEmpty())
				synchronized (this.columns) {
					for (Field field : klass.getFields())
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
							if (length == 0)
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
}