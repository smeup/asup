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
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.QString;
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
import org.smeup.sys.os.file.base.BaseFileMemberDataSetImpl;
import org.smeup.sys.os.file.base.BaseFileMemberProvider;
import org.smeup.sys.os.file.base.BaseInfoStruct;

public class JDBCAccessFactoryImpl implements QAccessFactory {

	private QContextProvider contextProvider;
	private QConnection connection;
	private QDataContext dataContext;

	public JDBCAccessFactoryImpl(QContextProvider contextProvider, QConnection connection, QDataContext dataContext) {
		this.contextProvider = contextProvider;
		this.connection = connection;
		this.dataContext = dataContext;
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

		R record = (R) this.dataContext.getDataFactory().createDataStruct((Class<QDataStruct>) wrapper, 0, true);
		return createKeySequencedDataSet(wrapper, record, accessMode, userOpen, infoStruct);
	}

	@Override
	public <R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper, R record, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct) {

		return createKeySequencedDataSet(wrapper, record, accessMode, userOpen, infoStruct, null);
	}

	@Override
	public <R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper, R record, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct, QString tableName) {

		QIndex index = getIndex(wrapper);
		if (index == null)
			index = TABLE_INDEX_RELATIVE_RECORD_NUMBER;

		JDBCInfoStruct internalInfoStruct = null;
		if (infoStruct != null) {
			internalInfoStruct = dataContext.getDataFactory().createDataStruct(JDBCInfoStruct.class, 0, false);
			infoStruct.slice(internalInfoStruct);
		} else {
			internalInfoStruct = dataContext.getDataFactory().createDataStruct(JDBCInfoStruct.class, 0, true);
		}
		
		if(tableName == null) {
			tableName = dataContext.getDataFactory().createCharacter(21, false, true);
			tableName.eval(wrapper.getSimpleName());

		}
		
		return new JDBCKeySequencedDataSetImpl<R>(connection, tableName, index, record, accessMode, userOpen, internalInfoStruct, dataContext);
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

		R record = (R) this.dataContext.getDataFactory().createDataStruct((Class<QDataStruct>) wrapper, 0, true);
		return createRelativeRecordDataSet(wrapper, record, accessMode, userOpen, infoStruct);
	}

	@Override
	public <R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(Class<R> wrapper, R record, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct) {

		return createRelativeRecordDataSet(wrapper, record, accessMode, userOpen, infoStruct, null);
	}

	@Override
	public <R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(Class<R> wrapper, R record, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct, QString tableName) {

		QIndex index = TABLE_INDEX_RELATIVE_RECORD_NUMBER;

		JDBCInfoStruct internalInfoStruct = null;
		if (infoStruct != null) {
			internalInfoStruct = dataContext.getDataFactory().createDataStruct(JDBCInfoStruct.class, 0, false);
			infoStruct.slice(internalInfoStruct);
		} else {
			internalInfoStruct = dataContext.getDataFactory().createDataStruct(JDBCInfoStruct.class, 0, true);
		}

		if(tableName == null) {
			tableName = dataContext.getDataFactory().createCharacter(21, false, true);
			tableName.eval(wrapper.getSimpleName());
		}
		
		return new JDBCRelativeRecordDataSetImpl<R>(connection, tableName, index, record, accessMode, userOpen, internalInfoStruct, dataContext);
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

		R record = (R) this.dataContext.getDataFactory().createDataStruct((Class<QDataStruct>) wrapper, 0, true);

		return createSourceMemberDataSet(wrapper, record, accessMode, userOpen, infoStruct);
	}

	@Override
	public <R extends QRecord> QSMDataSet<R> createSourceMemberDataSet(Class<R> wrapper, R record, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct) {
		return createSourceMemberDataSet(wrapper, record, accessMode, userOpen, infoStruct, null, null);
	}

	@Override
	public <R extends QRecord> QSMDataSet<R> createSourceMemberDataSet(Class<R> wrapper, R record, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct, QString fileName, QString memberName) {
		
		if(fileName == null) {
			fileName = dataContext.getDataFactory().createCharacter(21, false, true);
			fileName.eval(wrapper.getSimpleName());
		}

		if(memberName == null)
			memberName = dataContext.getDataFactory().createCharacter(10, false, true);
		
		BaseFileMemberProvider fileMemberProvider = new BaseFileMemberProvider(contextProvider, fileName, memberName);
		BaseInfoStruct internalInfoStruct = dataContext.getDataFactory().createDataStruct(BaseInfoStruct.class, 0, true);
		QSMDataSet<R> dataSet = new BaseFileMemberDataSetImpl<R>(fileMemberProvider, record, accessMode, userOpen, internalInfoStruct, dataContext);

		return dataSet;
	}

	public <R extends QRecord> QIndex getIndex(Class<R> klass) {

		QIndex index = null;

		try {
			Class<?> keyKlass = null;
			if (klass.getAnnotation(Index.class) != null) {
				keyKlass = klass;
			} else {
				for (Class<?> declaredClass : klass.getDeclaredClasses())
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

			if (this.columns.isEmpty())
				synchronized (this.columns) {
					for (Field field : klass.getFields())
						try {

							DataDef dataDef = field.getAnnotation(DataDef.class);
							if (dataDef == null) {
								Class<?> dictionaryClass = klass.getDeclaringClass();
								Field dictionaryField = dictionaryClass.getField(field.getName());
								if (dictionaryField == null) {
									dictionaryClass = klass.getDeclaringClass().getSuperclass();
									dictionaryField = dictionaryClass.getField(field.getName());
								}

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