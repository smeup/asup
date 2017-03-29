/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.esql.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.db.esql.CursorType;
import org.smeup.sys.db.esql.FetchPositioning;
import org.smeup.sys.db.esql.QCommunicationArea;
import org.smeup.sys.db.esql.QCursor;
import org.smeup.sys.db.esql.QCursorTerm;
import org.smeup.sys.db.esql.QDescriptorArea;
import org.smeup.sys.db.esql.QDescriptorVariable;
import org.smeup.sys.db.esql.QESqlFactory;
import org.smeup.sys.db.esql.QESqlManager;
import org.smeup.sys.db.esql.QESqlObject;
import org.smeup.sys.db.esql.QESqlTerm;
import org.smeup.sys.db.esql.QEsqlContext;
import org.smeup.sys.db.esql.QIntegratedLanguageEmbeddedSQLFactory;
import org.smeup.sys.db.esql.QIntegratedLanguageEmbeddedSQLPackage;
import org.smeup.sys.db.esql.QStatement;
import org.smeup.sys.db.esql.QStatementTerm;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermPackage;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegratedLanguageEmbeddedSQLPackageImpl extends EPackageImpl implements QIntegratedLanguageEmbeddedSQLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cursorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cursorTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptorAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptorVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esqlContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eSqlObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eSqlTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eSqlManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eSqlFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cursorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fetchPositioningEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cursorParametersEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cursorRecordEDataType = null;

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
	 * @see org.smeup.sys.db.esql.QIntegratedLanguageEmbeddedSQLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageEmbeddedSQLPackageImpl() {
		super(eNS_URI, QIntegratedLanguageEmbeddedSQLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QIntegratedLanguageEmbeddedSQLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageEmbeddedSQLPackage init() {
		if (isInited) return (QIntegratedLanguageEmbeddedSQLPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageEmbeddedSQLPackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageEmbeddedSQLPackageImpl theIntegratedLanguageEmbeddedSQLPackage = (IntegratedLanguageEmbeddedSQLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageEmbeddedSQLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegratedLanguageEmbeddedSQLPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageDataPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIntegratedLanguageEmbeddedSQLPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageEmbeddedSQLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageEmbeddedSQLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageEmbeddedSQLPackage.eNS_URI, theIntegratedLanguageEmbeddedSQLPackage);
		return theIntegratedLanguageEmbeddedSQLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationArea() {
		return communicationAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCursor() {
		return cursorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCursorTerm() {
		return cursorTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCursorTerm_CursorType() {
		return (EAttribute)cursorTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCursorTerm_Hold() {
		return (EAttribute)cursorTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCursorTerm_Sql() {
		return (EAttribute)cursorTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCursorTerm_StatementName() {
		return (EAttribute)cursorTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptorArea() {
		return descriptorAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptorVariable() {
		return descriptorVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEsqlContext() {
		return esqlContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESqlObject() {
		return eSqlObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESqlTerm() {
		return eSqlTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESqlTerm_Name() {
		return (EAttribute)eSqlTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementTerm() {
		return statementTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESqlManager() {
		return eSqlManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESqlFactory() {
		return eSqlFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCursorType() {
		return cursorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFetchPositioning() {
		return fetchPositioningEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCursorParameters() {
		return cursorParametersEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCursorRecord() {
		return cursorRecordEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIntegratedLanguageEmbeddedSQLFactory getIntegratedLanguageEmbeddedSQLFactory() {
		return (QIntegratedLanguageEmbeddedSQLFactory)getEFactoryInstance();
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
		communicationAreaEClass = createEClass(COMMUNICATION_AREA);

		cursorEClass = createEClass(CURSOR);

		cursorTermEClass = createEClass(CURSOR_TERM);
		createEAttribute(cursorTermEClass, CURSOR_TERM__CURSOR_TYPE);
		createEAttribute(cursorTermEClass, CURSOR_TERM__HOLD);
		createEAttribute(cursorTermEClass, CURSOR_TERM__SQL);
		createEAttribute(cursorTermEClass, CURSOR_TERM__STATEMENT_NAME);

		descriptorAreaEClass = createEClass(DESCRIPTOR_AREA);

		descriptorVariableEClass = createEClass(DESCRIPTOR_VARIABLE);

		esqlContextEClass = createEClass(ESQL_CONTEXT);

		eSqlFactoryEClass = createEClass(ESQL_FACTORY);

		eSqlManagerEClass = createEClass(ESQL_MANAGER);

		eSqlObjectEClass = createEClass(ESQL_OBJECT);

		eSqlTermEClass = createEClass(ESQL_TERM);
		createEAttribute(eSqlTermEClass, ESQL_TERM__NAME);

		statementEClass = createEClass(STATEMENT);

		statementTermEClass = createEClass(STATEMENT_TERM);

		// Create enums
		cursorTypeEEnum = createEEnum(CURSOR_TYPE);
		fetchPositioningEEnum = createEEnum(FETCH_POSITIONING);

		// Create data types
		cursorParametersEDataType = createEDataType(CURSOR_PARAMETERS);
		cursorRecordEDataType = createEDataType(CURSOR_RECORD);
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
		QIntegratedLanguageDataPackage theIntegratedLanguageDataPackage = (QIntegratedLanguageDataPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI);
		QMachineInterfaceCorePackage theMachineInterfaceCorePackage = (QMachineInterfaceCorePackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI);
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);
		QIntegratedLanguageCoreTermPackage theIntegratedLanguageCoreTermPackage = (QIntegratedLanguageCoreTermPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreTermPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		communicationAreaEClass.getESuperTypes().add(theIntegratedLanguageDataPackage.getDataStruct());
		cursorEClass.getESuperTypes().add(this.getESqlObject());
		cursorEClass.getESuperTypes().add(theMachineInterfaceCorePackage.getJavaCloseable());
		cursorTermEClass.getESuperTypes().add(this.getESqlTerm());
		descriptorAreaEClass.getESuperTypes().add(theIntegratedLanguageDataPackage.getDataStruct());
		descriptorVariableEClass.getESuperTypes().add(theIntegratedLanguageDataPackage.getDataStruct());
		esqlContextEClass.getESuperTypes().add(theIntegratedLanguageCoreCtxPackage.getContextProvider());
		eSqlTermEClass.getESuperTypes().add(theIntegratedLanguageCoreTermPackage.getTerm());
		statementEClass.getESuperTypes().add(this.getESqlObject());
		statementEClass.getESuperTypes().add(theMachineInterfaceCorePackage.getJavaCloseable());
		statementTermEClass.getESuperTypes().add(this.getESqlTerm());

		// Initialize classes and features; add operations and parameters
		initEClass(communicationAreaEClass, QCommunicationArea.class, "CommunicationArea", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(communicationAreaEClass, ecorePackage.getEInt(), "getSqlCode", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(communicationAreaEClass, null, "setSqlCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "sqlCode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cursorEClass, QCursor.class, "Cursor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(cursorEClass, null, "after", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cursorEClass, null, "before", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cursorEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "first", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getBufferedData(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "first", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCursorRecord(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "first", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getDataStruct(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "first", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "descriptor", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "last", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getBufferedData(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "last", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCursorRecord(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "last", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getDataStruct(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "last", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "descriptor", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "next", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getBufferedData(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "next", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCursorRecord(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "next", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getDataStruct(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "next", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "descriptor", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cursorEClass, null, "next", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cursorEClass, null, "open", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "prior", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getBufferedData(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "prior", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCursorRecord(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "prior", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getDataStruct(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "prior", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "descriptor", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "relative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getNumeric(), "position", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "descriptor", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "relative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getNumeric(), "position", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cursorTermEClass, QCursorTerm.class, "CursorTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCursorTerm_CursorType(), this.getCursorType(), "cursorType", null, 0, 1, QCursorTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCursorTerm_Hold(), ecorePackage.getEBoolean(), "hold", null, 1, 1, QCursorTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCursorTerm_Sql(), ecorePackage.getEString(), "sql", null, 0, 1, QCursorTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCursorTerm_StatementName(), ecorePackage.getEString(), "statementName", null, 0, 1, QCursorTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptorAreaEClass, QDescriptorArea.class, "DescriptorArea", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(descriptorAreaEClass, ecorePackage.getEInt(), "getColumnsNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(descriptorAreaEClass, this.getDescriptorVariable(), "getVariable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(descriptorAreaEClass, null, "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(descriptorAreaEClass, null, "setVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDescriptorVariable(), "variable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(descriptorVariableEClass, QDescriptorVariable.class, "DescriptorVariable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esqlContextEClass, QEsqlContext.class, "EsqlContext", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(esqlContextEClass, this.getDescriptorArea(), "allocateDescriptorArea", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "maxColumns", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(esqlContextEClass, this.getDescriptorArea(), "deallocateDescriptorArea", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(esqlContextEClass, this.getCommunicationArea(), "getCommunicationArea", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(esqlContextEClass, theIntegratedLanguageDataPackage.getDataContext(), "getDataContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(esqlContextEClass, this.getDescriptorArea(), "getDescriptorArea", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(esqlContextEClass, this.getESqlFactory(), "getEsqlFactory", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eSqlFactoryEClass, QESqlFactory.class, "ESqlFactory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(eSqlFactoryEClass, this.getCursor(), "createCursor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCursorType(), "cursorType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "hold", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eSqlFactoryEClass, this.getCursor(), "createCursor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCursorType(), "cursorType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "hold", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCursorParameters(), "parameters", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eSqlFactoryEClass, this.getCursor(), "createCursor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCursorType(), "cursorType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "hold", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStatement(), "statement", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eSqlFactoryEClass, this.getCursorTerm(), "createCursorTerm", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaAnnotation(), "annotations", 1, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eSqlFactoryEClass, this.getStatement(), "createStatement", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eSqlFactoryEClass, this.getStatementTerm(), "createStatementTerm", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaAnnotation(), "annotations", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(eSqlManagerEClass, QESqlManager.class, "ESqlManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(eSqlManagerEClass, this.getEsqlContext(), "createEsqlContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "connection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getDataContext(), "dataContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCommunicationArea(), "communicationArea", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eSqlObjectEClass, QESqlObject.class, "ESqlObject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eSqlTermEClass, QESqlTerm.class, "ESqlTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESqlTerm_Name(), ecorePackage.getEString(), "name", null, 1, 1, QESqlTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, QStatement.class, "Statement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(statementEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementEClass, null, "describe", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "descriptor", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementEClass, null, "prepare", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getString(), "sql", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementEClass, null, "prepare", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementEClass, null, "prepare", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCursorParameters(), "parameters", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(statementEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(statementEClass, ecorePackage.getEJavaObject(), "executeQuery", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(statementTermEClass, QStatementTerm.class, "StatementTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(cursorTypeEEnum, CursorType.class, "CursorType");
		addEEnumLiteral(cursorTypeEEnum, CursorType.NOT_SCROLLABLE);
		addEEnumLiteral(cursorTypeEEnum, CursorType.SCROLLABLE);
		addEEnumLiteral(cursorTypeEEnum, CursorType.DYNAMIC_SCROLL);

		initEEnum(fetchPositioningEEnum, FetchPositioning.class, "FetchPositioning");
		addEEnumLiteral(fetchPositioningEEnum, FetchPositioning.NEXT);
		addEEnumLiteral(fetchPositioningEEnum, FetchPositioning.PRIOR);
		addEEnumLiteral(fetchPositioningEEnum, FetchPositioning.FIRST);
		addEEnumLiteral(fetchPositioningEEnum, FetchPositioning.LAST);
		addEEnumLiteral(fetchPositioningEEnum, FetchPositioning.BEFORE);
		addEEnumLiteral(fetchPositioningEEnum, FetchPositioning.AFTER);
		addEEnumLiteral(fetchPositioningEEnum, FetchPositioning.CURRENT);
		addEEnumLiteral(fetchPositioningEEnum, FetchPositioning.RELATIVE);

		// Initialize data types
		initEDataType(cursorParametersEDataType, QBufferedElement[].class, "CursorParameters", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cursorRecordEDataType, QBufferedData[].class, "CursorRecord", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //IntegratedLanguageEmbeddedSQLPackageImpl
