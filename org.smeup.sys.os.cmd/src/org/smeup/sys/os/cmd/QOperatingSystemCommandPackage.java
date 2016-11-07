/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.cmd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.data.term.QTermPackage;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemCommandPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cmd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/cmd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-cmd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QOperatingSystemCommandPackage eINSTANCE = org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.cmd.impl.CallableCommandImpl <em>Callable Command</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.cmd.impl.CallableCommandImpl
	 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCallableCommand()
	 * @generated
	 */
	int CALLABLE_COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CALLABLE_COMMAND__COMMAND = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Command String</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CALLABLE_COMMAND__COMMAND_STRING = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CALLABLE_COMMAND__VARIABLES = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Container</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_COMMAND__DATA_CONTAINER = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Callable Command</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_COMMAND_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.cmd.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.os.cmd.impl.CommandImpl
	 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__FACETS = QOperatingSystemTypePackage.TYPED_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND__ADDRESS = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allow Batch</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND__ALLOW_BATCH = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class CMD</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND__CLASS_CMD = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__PARAMETERS = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Program</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND__PROGRAM = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__SOURCE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND__STATUS = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND__TYPE_NAME = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Command</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.cmd.impl.CommandContainerImpl <em>Command Container</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.cmd.impl.CommandContainerImpl
	 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommandContainer()
	 * @generated
	 */
	int COMMAND_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER__CONTENTS = QOperatingSystemTypePackage.TYPED_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER__TYPE_NAME = QOperatingSystemTypePackage.TYPED_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command Container</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.cmd.impl.CommandDataImpl <em>Command Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.cmd.impl.CommandDataImpl
	 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommandData()
	 * @generated
	 */
	int COMMAND_DATA = 3;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_DATA__FACETS = QTermPackage.DATA_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_DATA__BASED = QTermPackage.DATA_TERM__BASED;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_DATA__CARDINALITY = QTermPackage.DATA_TERM__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_DATA__CONSTANT = QTermPackage.DATA_TERM__CONSTANT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_DATA__DEFAULT = QTermPackage.DATA_TERM__DEFAULT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_DATA__DEFINITION = QTermPackage.DATA_TERM__DEFINITION;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_DATA__KEY = QTermPackage.DATA_TERM__KEY;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_DATA__INITIALIZED = QTermPackage.DATA_TERM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_DATA__LIKE = QTermPackage.DATA_TERM__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_DATA__NAME = QTermPackage.DATA_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_DATA__RESTRICTED = QTermPackage.DATA_TERM__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_DATA__TEXT = QTermPackage.DATA_TERM__TEXT;

	/**
	 * The number of structural features of the '<em>Command Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_DATA_FEATURE_COUNT = QTermPackage.DATA_TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.cmd.QCommandManager <em>Command Manager</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.cmd.QCommandManager
	 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommandManager()
	 * @generated
	 */
	int COMMAND_MANAGER = 4;

	/**
	 * The number of structural features of the '<em>Command Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.cmd.impl.CommandParameterImpl <em>Command Parameter</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.cmd.impl.CommandParameterImpl
	 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommandParameter()
	 * @generated
	 */
	int COMMAND_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Allow Variable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER__ALLOW_VARIABLE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Term</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER__DATA_TERM = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER__NAME = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER__POSITION = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER__STATUS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER__HIDDEN = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Command Parameter</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.cmd.impl.CommandSourceImpl <em>Command Source</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.cmd.impl.CommandSourceImpl
	 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommandSource()
	 * @generated
	 */
	int COMMAND_SOURCE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND_SOURCE__TYPE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMAND_SOURCE__CONTENT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Command Source</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SOURCE_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.cmd.CommandStatus
	 * <em>Command Status</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.os.cmd.CommandStatus
	 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommandStatus()
	 * @generated
	 */
	int COMMAND_STATUS = 7;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.cmd.CommandParameterOrder <em>Command Parameter Order</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.cmd.CommandParameterOrder
	 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommandParameterOrder()
	 * @generated
	 */
	int COMMAND_PARAMETER_ORDER = 8;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.cmd.CommandOrder
	 * <em>Command Order</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.os.cmd.CommandOrder
	 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommandOrder()
	 * @generated
	 */
	int COMMAND_ORDER = 9;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.cmd.QCallableCommand <em>Callable Command</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Command</em>'.
	 * @see org.smeup.sys.os.cmd.QCallableCommand
	 * @generated
	 */
	EClass getCallableCommand();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.os.cmd.QCallableCommand#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see org.smeup.sys.os.cmd.QCallableCommand#getCommand()
	 * @see #getCallableCommand()
	 * @generated
	 */
	EReference getCallableCommand_Command();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.cmd.QCallableCommand#getCommandString <em>Command String</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command String</em>'.
	 * @see org.smeup.sys.os.cmd.QCallableCommand#getCommandString()
	 * @see #getCallableCommand()
	 * @generated
	 */
	EAttribute getCallableCommand_CommandString();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.cmd.QCallableCommand#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variables</em>'.
	 * @see org.smeup.sys.os.cmd.QCallableCommand#getVariables()
	 * @see #getCallableCommand()
	 * @generated
	 */
	EAttribute getCallableCommand_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.os.cmd.QCallableCommand#getDataContainer <em>Data Container</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Container</em>'.
	 * @see org.smeup.sys.os.cmd.QCallableCommand#getDataContainer()
	 * @see #getCallableCommand()
	 * @generated
	 */
	EReference getCallableCommand_DataContainer();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.cmd.QCommand <em>Command</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see org.smeup.sys.os.cmd.QCommand
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.cmd.QCommand#getAddress <em>Address</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.smeup.sys.os.cmd.QCommand#getAddress()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.cmd.QCommand#isAllowBatch <em>Allow Batch</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Batch</em>'.
	 * @see org.smeup.sys.os.cmd.QCommand#isAllowBatch()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_AllowBatch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.os.cmd.QCommand#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.smeup.sys.os.cmd.QCommand#getParameters()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Parameters();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.cmd.QCommand#getProgram <em>Program</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Program</em>'.
	 * @see org.smeup.sys.os.cmd.QCommand#getProgram()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Program();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.smeup.sys.os.cmd.QCommand#getSource <em>Source</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.smeup.sys.os.cmd.QCommand#getSource()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Source();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.cmd.QCommand#getStatus <em>Status</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.smeup.sys.os.cmd.QCommand#getStatus()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.cmd.QCommand#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see org.smeup.sys.os.cmd.QCommand#getTypeName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.cmd.QCommand#isClassCMD <em>Class CMD</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class CMD</em>'.
	 * @see org.smeup.sys.os.cmd.QCommand#isClassCMD()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_ClassCMD();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.cmd.QCommandContainer <em>Command Container</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Container</em>'.
	 * @see org.smeup.sys.os.cmd.QCommandContainer
	 * @generated
	 */
	EClass getCommandContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.cmd.QCommandContainer#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see org.smeup.sys.os.cmd.QCommandContainer#getTypeName()
	 * @see #getCommandContainer()
	 * @generated
	 */
	EAttribute getCommandContainer_TypeName();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.cmd.QCommandData <em>Command Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Data</em>'.
	 * @see org.smeup.sys.os.cmd.QCommandData
	 * @generated
	 */
	EClass getCommandData();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.cmd.QCommandManager <em>Command Manager</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Manager</em>'.
	 * @see org.smeup.sys.os.cmd.QCommandManager
	 * @generated
	 */
	EClass getCommandManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.cmd.QCommandParameter <em>Command Parameter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Parameter</em>'.
	 * @see org.smeup.sys.os.cmd.QCommandParameter
	 * @generated
	 */
	EClass getCommandParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.cmd.QCommandParameter#isAllowVariable <em>Allow Variable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Variable</em>'.
	 * @see org.smeup.sys.os.cmd.QCommandParameter#isAllowVariable()
	 * @see #getCommandParameter()
	 * @generated
	 */
	EAttribute getCommandParameter_AllowVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.os.cmd.QCommandParameter#getDataTerm <em>Data Term</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Term</em>'.
	 * @see org.smeup.sys.os.cmd.QCommandParameter#getDataTerm()
	 * @see #getCommandParameter()
	 * @generated
	 */
	EReference getCommandParameter_DataTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.cmd.QCommandParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.os.cmd.QCommandParameter#getName()
	 * @see #getCommandParameter()
	 * @generated
	 */
	EAttribute getCommandParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.cmd.QCommandParameter#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.smeup.sys.os.cmd.QCommandParameter#getPosition()
	 * @see #getCommandParameter()
	 * @generated
	 */
	EAttribute getCommandParameter_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.cmd.QCommandParameter#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.smeup.sys.os.cmd.QCommandParameter#getStatus()
	 * @see #getCommandParameter()
	 * @generated
	 */
	EAttribute getCommandParameter_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.cmd.QCommandParameter#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.smeup.sys.os.cmd.QCommandParameter#isHidden()
	 * @see #getCommandParameter()
	 * @generated
	 */
	EAttribute getCommandParameter_Hidden();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.cmd.QCommandSource <em>Command Source</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Source</em>'.
	 * @see org.smeup.sys.os.cmd.QCommandSource
	 * @generated
	 */
	EClass getCommandSource();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.cmd.QCommandSource#getType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.smeup.sys.os.cmd.QCommandSource#getType()
	 * @see #getCommandSource()
	 * @generated
	 */
	EAttribute getCommandSource_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.cmd.QCommandSource#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.smeup.sys.os.cmd.QCommandSource#getContent()
	 * @see #getCommandSource()
	 * @generated
	 */
	EAttribute getCommandSource_Content();

	/**
	 * Returns the meta object for enum '
	 * {@link org.smeup.sys.os.cmd.CommandStatus <em>Command Status</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Command Status</em>'.
	 * @see org.smeup.sys.os.cmd.CommandStatus
	 * @generated
	 */
	EEnum getCommandStatus();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.os.cmd.CommandParameterOrder <em>Command Parameter Order</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Command Parameter Order</em>'.
	 * @see org.smeup.sys.os.cmd.CommandParameterOrder
	 * @generated
	 */
	EEnum getCommandParameterOrder();

	/**
	 * Returns the meta object for enum '
	 * {@link org.smeup.sys.os.cmd.CommandOrder <em>Command Order</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Command Order</em>'.
	 * @see org.smeup.sys.os.cmd.CommandOrder
	 * @generated
	 */
	EEnum getCommandOrder();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemCommandFactory getOperatingSystemCommandFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.cmd.impl.CallableCommandImpl <em>Callable Command</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.cmd.impl.CallableCommandImpl
		 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCallableCommand()
		 * @generated
		 */
		EClass CALLABLE_COMMAND = eINSTANCE.getCallableCommand();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_COMMAND__COMMAND = eINSTANCE.getCallableCommand_Command();

		/**
		 * The meta object literal for the '<em><b>Command String</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE_COMMAND__COMMAND_STRING = eINSTANCE.getCallableCommand_CommandString();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE_COMMAND__VARIABLES = eINSTANCE.getCallableCommand_Variables();

		/**
		 * The meta object literal for the '<em><b>Data Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_COMMAND__DATA_CONTAINER = eINSTANCE.getCallableCommand_DataContainer();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.cmd.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.os.cmd.impl.CommandImpl
		 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__ADDRESS = eINSTANCE.getCommand_Address();

		/**
		 * The meta object literal for the '<em><b>Allow Batch</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__ALLOW_BATCH = eINSTANCE.getCommand_AllowBatch();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__PARAMETERS = eINSTANCE.getCommand_Parameters();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__PROGRAM = eINSTANCE.getCommand_Program();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__SOURCE = eINSTANCE.getCommand_Source();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__STATUS = eINSTANCE.getCommand_Status();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__TYPE_NAME = eINSTANCE.getCommand_TypeName();

		/**
		 * The meta object literal for the '<em><b>Class CMD</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__CLASS_CMD = eINSTANCE.getCommand_ClassCMD();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.cmd.impl.CommandContainerImpl <em>Command Container</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.cmd.impl.CommandContainerImpl
		 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommandContainer()
		 * @generated
		 */
		EClass COMMAND_CONTAINER = eINSTANCE.getCommandContainer();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_CONTAINER__TYPE_NAME = eINSTANCE.getCommandContainer_TypeName();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.cmd.impl.CommandDataImpl <em>Command Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.cmd.impl.CommandDataImpl
		 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommandData()
		 * @generated
		 */
		EClass COMMAND_DATA = eINSTANCE.getCommandData();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.cmd.QCommandManager <em>Command Manager</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.cmd.QCommandManager
		 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommandManager()
		 * @generated
		 */
		EClass COMMAND_MANAGER = eINSTANCE.getCommandManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.cmd.impl.CommandParameterImpl <em>Command Parameter</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.cmd.impl.CommandParameterImpl
		 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommandParameter()
		 * @generated
		 */
		EClass COMMAND_PARAMETER = eINSTANCE.getCommandParameter();

		/**
		 * The meta object literal for the '<em><b>Allow Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PARAMETER__ALLOW_VARIABLE = eINSTANCE.getCommandParameter_AllowVariable();

		/**
		 * The meta object literal for the '<em><b>Data Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_PARAMETER__DATA_TERM = eINSTANCE.getCommandParameter_DataTerm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PARAMETER__NAME = eINSTANCE.getCommandParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PARAMETER__POSITION = eINSTANCE.getCommandParameter_Position();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PARAMETER__STATUS = eINSTANCE.getCommandParameter_Status();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PARAMETER__HIDDEN = eINSTANCE.getCommandParameter_Hidden();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.cmd.impl.CommandSourceImpl <em>Command Source</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.cmd.impl.CommandSourceImpl
		 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommandSource()
		 * @generated
		 */
		EClass COMMAND_SOURCE = eINSTANCE.getCommandSource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_SOURCE__TYPE = eINSTANCE.getCommandSource_Type();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_SOURCE__CONTENT = eINSTANCE.getCommandSource_Content();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.cmd.CommandStatus <em>Command Status</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.os.cmd.CommandStatus
		 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommandStatus()
		 * @generated
		 */
		EEnum COMMAND_STATUS = eINSTANCE.getCommandStatus();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.cmd.CommandParameterOrder <em>Command Parameter Order</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.cmd.CommandParameterOrder
		 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommandParameterOrder()
		 * @generated
		 */
		EEnum COMMAND_PARAMETER_ORDER = eINSTANCE.getCommandParameterOrder();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.cmd.CommandOrder <em>Command Order</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.os.cmd.CommandOrder
		 * @see org.smeup.sys.os.cmd.impl.OperatingSystemCommandPackageImpl#getCommandOrder()
		 * @generated
		 */
		EEnum COMMAND_ORDER = eINSTANCE.getCommandOrder();

	}

} // QOperatingSystemCommandPackage
