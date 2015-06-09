/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.db.core.DatabaseCoreException;
import org.smeup.sys.db.core.DatabaseCoreRuntimeException;
import org.smeup.sys.db.core.OrderingType;
import org.smeup.sys.db.core.QCatalogContainer;
import org.smeup.sys.db.core.QCatalogGenerationStrategy;
import org.smeup.sys.db.core.QConnectionConfig;
import org.smeup.sys.db.core.QConnectionCredentials;
import org.smeup.sys.db.core.QDatabaseContainer;
import org.smeup.sys.db.core.QDatabaseCoreFactory;
import org.smeup.sys.db.core.QDatabaseCorePackage;
import org.smeup.sys.db.core.QIndexColumnDef;
import org.smeup.sys.db.core.QIndexDef;
import org.smeup.sys.db.core.QQualifiedName;
import org.smeup.sys.db.core.QSchemaDef;
import org.smeup.sys.db.core.QTableColumnDef;
import org.smeup.sys.db.core.QTableDef;
import org.smeup.sys.db.core.QViewDef;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class DatabaseCoreFactoryImpl extends EFactoryImpl implements QDatabaseCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QDatabaseCoreFactory init() {
		try {
			QDatabaseCoreFactory theDatabaseCoreFactory = (QDatabaseCoreFactory)EPackage.Registry.INSTANCE.getEFactory(QDatabaseCorePackage.eNS_URI);
			if (theDatabaseCoreFactory != null) {
				return theDatabaseCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatabaseCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public DatabaseCoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QDatabaseCorePackage.CATALOG_CONTAINER: return (EObject)createCatalogContainer();
			case QDatabaseCorePackage.CATALOG_GENERATION_STRATEGY: return (EObject)createCatalogGenerationStrategy();
			case QDatabaseCorePackage.CONNECTION_CONFIG: return (EObject)createConnectionConfig();
			case QDatabaseCorePackage.CONNECTION_CREDENTIALS: return (EObject)createConnectionCredentials();
			case QDatabaseCorePackage.DATABASE_CONTAINER: return (EObject)createDatabaseContainer();
			case QDatabaseCorePackage.INDEX_DEF: return (EObject)createIndexDef();
			case QDatabaseCorePackage.INDEX_COLUMN_DEF: return (EObject)createIndexColumnDef();
			case QDatabaseCorePackage.QUALIFIED_NAME: return (EObject)createQualifiedName();
			case QDatabaseCorePackage.SCHEMA_DEF: return (EObject)createSchemaDef();
			case QDatabaseCorePackage.TABLE_DEF: return (EObject)createTableDef();
			case QDatabaseCorePackage.TABLE_COLUMN_DEF: return (EObject)createTableColumnDef();
			case QDatabaseCorePackage.VIEW_DEF: return (EObject)createViewDef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QDatabaseCorePackage.ORDERING_TYPE:
				return createOrderingTypeFromString(eDataType, initialValue);
			case QDatabaseCorePackage.DATABASE_CORE_EXCEPTION:
				return createDatabaseCoreExceptionFromString(eDataType, initialValue);
			case QDatabaseCorePackage.DATABASE_CORE_RUNTIME_EXCEPTION:
				return createDatabaseCoreRuntimeExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QDatabaseCorePackage.ORDERING_TYPE:
				return convertOrderingTypeToString(eDataType, instanceValue);
			case QDatabaseCorePackage.DATABASE_CORE_EXCEPTION:
				return convertDatabaseCoreExceptionToString(eDataType, instanceValue);
			case QDatabaseCorePackage.DATABASE_CORE_RUNTIME_EXCEPTION:
				return convertDatabaseCoreRuntimeExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCatalogContainer createCatalogContainer() {
		CatalogContainerImpl catalogContainer = new CatalogContainerImpl();
		return catalogContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCatalogGenerationStrategy createCatalogGenerationStrategy() {
		CatalogGenerationStrategyImpl catalogGenerationStrategy = new CatalogGenerationStrategyImpl();
		return catalogGenerationStrategy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QConnectionConfig createConnectionConfig() {
		ConnectionConfigImpl connectionConfig = new ConnectionConfigImpl();
		return connectionConfig;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QConnectionCredentials createConnectionCredentials() {
		ConnectionCredentialsImpl connectionCredentials = new ConnectionCredentialsImpl();
		return connectionCredentials;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDatabaseContainer createDatabaseContainer() {
		DatabaseContainerImpl databaseContainer = new DatabaseContainerImpl();
		return databaseContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIndexDef createIndexDef() {
		IndexDefImpl indexDef = new IndexDefImpl();
		return indexDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIndexColumnDef createIndexColumnDef() {
		IndexColumnDefImpl indexColumnDef = new IndexColumnDefImpl();
		return indexColumnDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QQualifiedName createQualifiedName() {
		QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QSchemaDef createSchemaDef() {
		SchemaDefImpl schemaDef = new SchemaDefImpl();
		return schemaDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QTableDef createTableDef() {
		TableDefImpl tableDef = new TableDefImpl();
		return tableDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QTableColumnDef createTableColumnDef() {
		TableColumnDefImpl tableColumnDef = new TableColumnDefImpl();
		return tableColumnDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QViewDef createViewDef() {
		ViewDefImpl viewDef = new ViewDefImpl();
		return viewDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OrderingType createOrderingTypeFromString(EDataType eDataType, String initialValue) {
		OrderingType result = OrderingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseCoreException createDatabaseCoreExceptionFromString(EDataType eDataType, String initialValue) {
		return (DatabaseCoreException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatabaseCoreExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseCoreRuntimeException createDatabaseCoreRuntimeExceptionFromString(EDataType eDataType, String initialValue) {
		return (DatabaseCoreRuntimeException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatabaseCoreRuntimeExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDatabaseCorePackage getDatabaseCorePackage() {
		return (QDatabaseCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QDatabaseCorePackage getPackage() {
		return QDatabaseCorePackage.eINSTANCE;
	}

} // DatabaseCoreFactoryImpl
