/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dml.impl;

import org.eclipse.datatools.modelbase.sql.query.SQLQueryModelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.db.core.QDatabaseCorePackage;
import org.smeup.sys.db.syntax.QDatabaseSyntaxPackage;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl;
import org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage;
import org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl;
import org.smeup.sys.db.syntax.dml.QDatabaseSyntaxDMLFactory;
import org.smeup.sys.db.syntax.dml.QDatabaseSyntaxDMLPackage;
import org.smeup.sys.db.syntax.dml.QExtendedQueryExpressionBody;
import org.smeup.sys.db.syntax.dml.QExtendedQuerySelect;
import org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseSyntaxDMLPackageImpl extends EPackageImpl implements QDatabaseSyntaxDMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedQuerySelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedQueryExpressionBodyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.smeup.sys.db.syntax.dml.QDatabaseSyntaxDMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabaseSyntaxDMLPackageImpl() {
		super(eNS_URI, QDatabaseSyntaxDMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QDatabaseSyntaxDMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDatabaseSyntaxDMLPackage init() {
		if (isInited) return (QDatabaseSyntaxDMLPackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDMLPackage.eNS_URI);

		// Obtain or create and register package
		DatabaseSyntaxDMLPackageImpl theDatabaseSyntaxDMLPackage = (DatabaseSyntaxDMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatabaseSyntaxDMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatabaseSyntaxDMLPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QDatabaseCorePackage.eINSTANCE.eClass();
		SQLQueryModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DatabaseSyntaxPackageImpl theDatabaseSyntaxPackage = (DatabaseSyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxPackage.eNS_URI) instanceof DatabaseSyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxPackage.eNS_URI) : QDatabaseSyntaxPackage.eINSTANCE);
		DatabaseSyntaxDDLPackageImpl theDatabaseSyntaxDDLPackage = (DatabaseSyntaxDDLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDDLPackage.eNS_URI) instanceof DatabaseSyntaxDDLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDDLPackage.eNS_URI) : QDatabaseSyntaxDDLPackage.eINSTANCE);
		DatabaseSyntaxDBLPackageImpl theDatabaseSyntaxDBLPackage = (DatabaseSyntaxDBLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDBLPackage.eNS_URI) instanceof DatabaseSyntaxDBLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDBLPackage.eNS_URI) : QDatabaseSyntaxDBLPackage.eINSTANCE);

		// Create package meta-data objects
		theDatabaseSyntaxDMLPackage.createPackageContents();
		theDatabaseSyntaxPackage.createPackageContents();
		theDatabaseSyntaxDDLPackage.createPackageContents();
		theDatabaseSyntaxDBLPackage.createPackageContents();

		// Initialize created meta-data
		theDatabaseSyntaxDMLPackage.initializePackageContents();
		theDatabaseSyntaxPackage.initializePackageContents();
		theDatabaseSyntaxDDLPackage.initializePackageContents();
		theDatabaseSyntaxDBLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatabaseSyntaxDMLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDatabaseSyntaxDMLPackage.eNS_URI, theDatabaseSyntaxDMLPackage);
		return theDatabaseSyntaxDMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedQuerySelect() {
		return extendedQuerySelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedQueryExpressionBody() {
		return extendedQueryExpressionBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedQueryExpressionBody_OptimizeRecordsNumber() {
		return (EAttribute)extendedQueryExpressionBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabaseSyntaxDMLFactory getDatabaseSyntaxDMLFactory() {
		return (QDatabaseSyntaxDMLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		extendedQuerySelectEClass = createEClass(EXTENDED_QUERY_SELECT);

		extendedQueryExpressionBodyEClass = createEClass(EXTENDED_QUERY_EXPRESSION_BODY);
		createEAttribute(extendedQueryExpressionBodyEClass, EXTENDED_QUERY_EXPRESSION_BODY__OPTIMIZE_RECORDS_NUMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SQLQueryModelPackage theSQLQueryModelPackage = (SQLQueryModelPackage)EPackage.Registry.INSTANCE.getEPackage(SQLQueryModelPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		extendedQuerySelectEClass.getESuperTypes().add(this.getExtendedQueryExpressionBody());
		extendedQuerySelectEClass.getESuperTypes().add(theSQLQueryModelPackage.getQuerySelect());
		extendedQueryExpressionBodyEClass.getESuperTypes().add(theSQLQueryModelPackage.getQueryExpressionBody());

		// Initialize classes and features; add operations and parameters
		initEClass(extendedQuerySelectEClass, QExtendedQuerySelect.class, "ExtendedQuerySelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(extendedQuerySelectEClass, ecorePackage.getEString(), "getQuerySelectSQL", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(extendedQueryExpressionBodyEClass, QExtendedQueryExpressionBody.class, "ExtendedQueryExpressionBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtendedQueryExpressionBody_OptimizeRecordsNumber(), theEcorePackage.getEInt(), "optimizeRecordsNumber", null, 0, 1, QExtendedQueryExpressionBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DatabaseSyntaxDMLPackageImpl
