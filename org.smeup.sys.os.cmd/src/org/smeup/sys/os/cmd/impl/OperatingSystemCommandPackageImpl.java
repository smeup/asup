/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.os.cmd.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.def.QDefPackage;
import org.smeup.sys.il.data.term.QTermPackage;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;
import org.smeup.sys.os.cmd.CommandOrder;
import org.smeup.sys.os.cmd.CommandParameterOrder;
import org.smeup.sys.os.cmd.CommandStatus;
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommand;
import org.smeup.sys.os.cmd.QCommandContainer;
import org.smeup.sys.os.cmd.QCommandData;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.cmd.QCommandParameter;
import org.smeup.sys.os.cmd.QCommandSource;
import org.smeup.sys.os.cmd.QOperatingSystemCommandFactory;
import org.smeup.sys.os.cmd.QOperatingSystemCommandPackage;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemCommandPackageImpl extends EPackageImpl implements QOperatingSystemCommandPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callableCommandEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandDataEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandParameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandSourceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commandStatusEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commandParameterOrderEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commandOrderEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemCommandPackageImpl() {
		super(eNS_URI, QOperatingSystemCommandFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QOperatingSystemCommandPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemCommandPackage init() {
		if (isInited) return (QOperatingSystemCommandPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCommandPackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemCommandPackageImpl theOperatingSystemCommandPackage = (OperatingSystemCommandPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemCommandPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemCommandPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QOperatingSystemTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemCommandPackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemCommandPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemCommandPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemCommandPackage.eNS_URI, theOperatingSystemCommandPackage);
		return theOperatingSystemCommandPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallableCommand() {
		return callableCommandEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallableCommand_Command() {
		return (EReference)callableCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallableCommand_CommandString() {
		return (EAttribute)callableCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallableCommand_Variables() {
		return (EAttribute)callableCommandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallableCommand_DataContainer() {
		return (EReference)callableCommandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommand_Address() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommand_AllowBatch() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommand_Parameters() {
		return (EReference)commandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommand_Program() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommand_Source() {
		return (EReference)commandEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommand_Status() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommand_TypeName() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommand_ClassCMD() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommandContainer() {
		return commandContainerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommandContainer_TypeName() {
		return (EAttribute)commandContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommandData() {
		return commandDataEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommandManager() {
		return commandManagerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommandParameter() {
		return commandParameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommandParameter_AllowVariable() {
		return (EAttribute)commandParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommandParameter_DataTerm() {
		return (EReference)commandParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommandParameter_Name() {
		return (EAttribute)commandParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommandParameter_Position() {
		return (EAttribute)commandParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommandParameter_Status() {
		return (EAttribute)commandParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommandParameter_Hidden() {
		return (EAttribute)commandParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommandSource() {
		return commandSourceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommandSource_Type() {
		return (EAttribute)commandSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommandSource_Content() {
		return (EAttribute)commandSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCommandStatus() {
		return commandStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCommandParameterOrder() {
		return commandParameterOrderEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCommandOrder() {
		return commandOrderEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemCommandFactory getOperatingSystemCommandFactory() {
		return (QOperatingSystemCommandFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		callableCommandEClass = createEClass(CALLABLE_COMMAND);
		createEReference(callableCommandEClass, CALLABLE_COMMAND__COMMAND);
		createEAttribute(callableCommandEClass, CALLABLE_COMMAND__COMMAND_STRING);
		createEAttribute(callableCommandEClass, CALLABLE_COMMAND__VARIABLES);
		createEReference(callableCommandEClass, CALLABLE_COMMAND__DATA_CONTAINER);

		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__ADDRESS);
		createEAttribute(commandEClass, COMMAND__ALLOW_BATCH);
		createEAttribute(commandEClass, COMMAND__CLASS_CMD);
		createEReference(commandEClass, COMMAND__PARAMETERS);
		createEAttribute(commandEClass, COMMAND__PROGRAM);
		createEReference(commandEClass, COMMAND__SOURCE);
		createEAttribute(commandEClass, COMMAND__STATUS);
		createEAttribute(commandEClass, COMMAND__TYPE_NAME);

		commandContainerEClass = createEClass(COMMAND_CONTAINER);
		createEAttribute(commandContainerEClass, COMMAND_CONTAINER__TYPE_NAME);

		commandDataEClass = createEClass(COMMAND_DATA);

		commandManagerEClass = createEClass(COMMAND_MANAGER);

		commandParameterEClass = createEClass(COMMAND_PARAMETER);
		createEAttribute(commandParameterEClass, COMMAND_PARAMETER__ALLOW_VARIABLE);
		createEReference(commandParameterEClass, COMMAND_PARAMETER__DATA_TERM);
		createEAttribute(commandParameterEClass, COMMAND_PARAMETER__NAME);
		createEAttribute(commandParameterEClass, COMMAND_PARAMETER__POSITION);
		createEAttribute(commandParameterEClass, COMMAND_PARAMETER__STATUS);
		createEAttribute(commandParameterEClass, COMMAND_PARAMETER__HIDDEN);

		commandSourceEClass = createEClass(COMMAND_SOURCE);
		createEAttribute(commandSourceEClass, COMMAND_SOURCE__TYPE);
		createEAttribute(commandSourceEClass, COMMAND_SOURCE__CONTENT);

		// Create enums
		commandStatusEEnum = createEEnum(COMMAND_STATUS);
		commandParameterOrderEEnum = createEEnum(COMMAND_PARAMETER_ORDER);
		commandOrderEEnum = createEEnum(COMMAND_ORDER);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
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
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QMachineInterfaceCorePackage theMachineInterfaceCorePackage = (QMachineInterfaceCorePackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI);
		QIntegratedLanguageDataPackage theIntegratedLanguageDataPackage = (QIntegratedLanguageDataPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI);
		QOperatingSystemTypePackage theOperatingSystemTypePackage = (QOperatingSystemTypePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemTypePackage.eNS_URI);
		QTermPackage theTermPackage = (QTermPackage)EPackage.Registry.INSTANCE.getEPackage(QTermPackage.eNS_URI);
		QDefPackage theDefPackage = (QDefPackage)EPackage.Registry.INSTANCE.getEPackage(QDefPackage.eNS_URI);
		QOperatingSystemJobsPackage theOperatingSystemJobsPackage = (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		callableCommandEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		callableCommandEClass.getESuperTypes().add(theMachineInterfaceCorePackage.getJavaCloseable());
		commandEClass.getESuperTypes().add(theOperatingSystemTypePackage.getTypedObject());
		EGenericType g1 = createEGenericType(theOperatingSystemTypePackage.getTypedContainer());
		EGenericType g2 = createEGenericType(this.getCommand());
		g1.getETypeArguments().add(g2);
		commandContainerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTermPackage.getDataTerm());
		g2 = createEGenericType(theDefPackage.getDataDef());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		commandDataEClass.getEGenericSuperTypes().add(g1);
		commandParameterEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		commandSourceEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(callableCommandEClass, QCallableCommand.class, "CallableCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallableCommand_Command(), this.getCommand(), null, "command", null, 1, 1, QCallableCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallableCommand_CommandString(), ecorePackage.getEString(), "commandString", null, 1, 1, QCallableCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEAttribute(getCallableCommand_Variables(), g1, "variables", null, 1, 1, QCallableCommand.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallableCommand_DataContainer(), theIntegratedLanguageDataPackage.getDataContainer(), null, "dataContainer", null, 1, 1, QCallableCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(callableCommandEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commandEClass, QCommand.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_Address(), ecorePackage.getEString(), "address", null, 0, 1, QCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_AllowBatch(), ecorePackage.getEBoolean(), "allowBatch", "true", 0, 1, QCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_ClassCMD(), ecorePackage.getEBoolean(), "classCMD", "false", 0, 1, QCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommand_Parameters(), this.getCommandParameter(), null, "parameters", null, 0, -1, QCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_Program(), ecorePackage.getEString(), "program", null, 0, 1, QCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommand_Source(), this.getCommandSource(), null, "source", null, 0, 1, QCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_Status(), this.getCommandStatus(), "status", "SUP", 0, 1, QCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, QCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(commandEClass, this.getCommandParameter(), "getParameter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commandEClass, this.getCommandParameter(), "getParameters", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCommandParameterOrder(), "order", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(commandEClass, ecorePackage.getEBoolean(), "isSupported", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commandContainerEClass, QCommandContainer.class, "CommandContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandContainer_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, QCommandContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(commandContainerEClass, this.getCommand(), "getCommands", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCommandOrder(), "order", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commandDataEClass, QCommandData.class, "CommandData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandManagerEClass, QCommandManager.class, "CommandManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(commandManagerEClass, theIntegratedLanguageDataPackage.getDataContainer(), "decodeCommand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "command", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commandManagerEClass, theIntegratedLanguageDataPackage.getDataContainer(), "decodeCommand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "variables", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "command", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commandManagerEClass, theIntegratedLanguageDataPackage.getDataContainer(), "decodeCommand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "command", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commandManagerEClass, ecorePackage.getEString(), "encodeCommand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getDataContainer(), "container", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "showDefaults", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commandManagerEClass, ecorePackage.getEString(), "encodeCommand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getDataContainer(), "container", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "showDefaults", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commandManagerEClass, null, "executeCommand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCallableCommand(), "command", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commandManagerEClass, null, "executeCommand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "command", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "variables", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commandManagerEClass, this.getCallableCommand(), "prepareCommand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "command", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "variables", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "controlRequiredParms", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commandManagerEClass, theOperatingSystemJobsPackage.getJobCapability(), "submitCommand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "caller", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "command", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "jobName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "hold", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "copyEnvironmentVariables", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commandParameterEClass, QCommandParameter.class, "CommandParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandParameter_AllowVariable(), ecorePackage.getEBoolean(), "allowVariable", null, 1, 1, QCommandParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandParameter_DataTerm(), this.getCommandData(), null, "dataTerm", null, 1, 1, QCommandParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, QCommandParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandParameter_Position(), ecorePackage.getEInt(), "position", null, 1, 1, QCommandParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandParameter_Status(), this.getCommandStatus(), "status", "SUP", 0, 1, QCommandParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandParameter_Hidden(), ecorePackage.getEBoolean(), "hidden", null, 1, 1, QCommandParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(commandParameterEClass, ecorePackage.getEBoolean(), "isCompound", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(commandParameterEClass, ecorePackage.getEBoolean(), "isMany", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(commandParameterEClass, ecorePackage.getEBoolean(), "isRequired", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(commandParameterEClass, ecorePackage.getEBoolean(), "isSupported", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commandSourceEClass, QCommandSource.class, "CommandSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandSource_Type(), ecorePackage.getEString(), "type", "ASUP", 0, 1, QCommandSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandSource_Content(), ecorePackage.getEString(), "content", null, 0, 1, QCommandSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(commandStatusEEnum, CommandStatus.class, "CommandStatus");
		addEEnumLiteral(commandStatusEEnum, CommandStatus.POSSIBLE);
		addEEnumLiteral(commandStatusEEnum, CommandStatus.SUPPORTED);
		addEEnumLiteral(commandStatusEEnum, CommandStatus.UNSUPPORTED);
		addEEnumLiteral(commandStatusEEnum, CommandStatus.TODO);

		initEEnum(commandParameterOrderEEnum, CommandParameterOrder.class, "CommandParameterOrder");
		addEEnumLiteral(commandParameterOrderEEnum, CommandParameterOrder.NAME);
		addEEnumLiteral(commandParameterOrderEEnum, CommandParameterOrder.POSITION);

		initEEnum(commandOrderEEnum, CommandOrder.class, "CommandOrder");
		addEEnumLiteral(commandOrderEEnum, CommandOrder.NAME);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// il-data
		createIldataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>il-data</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIldataAnnotations() {
		String source = "il-data";	
		addAnnotation
		  (getCommand_Address(), 
		   source, 
		   new String[] {
			 "length", "128"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getCommand_Program(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getCommand_Status(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getCommand_TypeName(), 
		   source, 
		   new String[] {
			 "length", "128"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getCommandParameter_Name(), 
		   source, 
		   new String[] {
			 "length", "15"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });
	}

} // OSCommandCorePackageImpl
