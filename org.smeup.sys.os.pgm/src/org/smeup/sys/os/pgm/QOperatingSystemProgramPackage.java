/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemProgramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pgm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/pgm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-pgm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QOperatingSystemProgramPackage eINSTANCE = org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.pgm.impl.ActivationGroupImpl <em>Activation Group</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.pgm.impl.ActivationGroupImpl
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getActivationGroup()
	 * @generated
	 */
	int ACTIVATION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Framework Context</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GROUP__FRAMEWORK_CONTEXT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GROUP__NAME = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GROUP__PROGRAMS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activation Group</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GROUP_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.pgm.QActivationGroupManager <em>Activation Group Manager</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.pgm.QActivationGroupManager
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getActivationGroupManager()
	 * @generated
	 */
	int ACTIVATION_GROUP_MANAGER = 1;

	/**
	 * The number of structural features of the '<em>Activation Group Manager</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GROUP_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.pgm.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.os.pgm.impl.ProgramImpl
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.pgm.impl.CallableProgramImpl <em>Callable Program</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.pgm.impl.CallableProgramImpl
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getCallableProgram()
	 * @generated
	 */
	int CALLABLE_PROGRAM = 2;

	/**
	 * The feature id for the '<em><b>QActivation Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_PROGRAM__QACTIVATION_GROUP = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>QEntry</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CALLABLE_PROGRAM__QENTRY = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>QProgram</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CALLABLE_PROGRAM__QPROGRAM = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Callable Program</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_PROGRAM_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.pgm.QCallableProgramDelegator <em>Callable Program Delegator</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.pgm.QCallableProgramDelegator
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getCallableProgramDelegator()
	 * @generated
	 */
	int CALLABLE_PROGRAM_DELEGATOR = 3;

	/**
	 * The number of structural features of the '<em>Callable Program Delegator</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_PROGRAM_DELEGATOR_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROGRAM__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROGRAM__LIBRARY = QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROGRAM__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Activation Group</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ACTIVATION_GROUP = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ADDRESS = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Params</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CREATION_PARAMS = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SOURCE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Program</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.pgm.impl.ProgramContainerImpl <em>Program Container</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.pgm.impl.ProgramContainerImpl
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramContainer()
	 * @generated
	 */
	int PROGRAM_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONTAINER__CONTENTS = QOperatingSystemTypePackage.TYPED_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONTAINER__BASE_PACKAGE = QOperatingSystemTypePackage.TYPED_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scan Package</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONTAINER__SCAN_PACKAGE = QOperatingSystemTypePackage.TYPED_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Program Container</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONTAINER_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.pgm.QProgramManager <em>Program Manager</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.pgm.QProgramManager
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramManager()
	 * @generated
	 */
	int PROGRAM_MANAGER = 6;

	/**
	 * The number of structural features of the '<em>Program Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.pgm.impl.ProgramSourceImpl <em>Program Source</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.pgm.impl.ProgramSourceImpl
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramSource()
	 * @generated
	 */
	int PROGRAM_SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SOURCE__TYPE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SOURCE__CONTENT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Program Source</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SOURCE_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.pgm.impl.ProgramStackImpl <em>Program Stack</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.os.pgm.impl.ProgramStackImpl
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramStack()
	 * @generated
	 */
	int PROGRAM_STACK = 8;

	/**
	 * The feature id for the '<em><b>Date Enter</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STACK__DATE_ENTER = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Exit</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STACK__DATE_EXIT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Program Stack</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STACK_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.pgm.impl.ProgramStatusImpl <em>Program Status</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.pgm.impl.ProgramStatusImpl
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramStatus()
	 * @generated
	 */
	int PROGRAM_STATUS = 9;

	/**
	 * The feature id for the '<em><b>Callable Program</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STATUS__CALLABLE_PROGRAM = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program Status</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STATUS_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Parameter List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getParameterList()
	 * @generated
	 */
	int PARAMETER_LIST = 10;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.pgm.QActivationGroup <em>Activation Group</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Group</em>'.
	 * @see org.smeup.sys.os.pgm.QActivationGroup
	 * @generated
	 */
	EClass getActivationGroup();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.smeup.sys.os.pgm.QActivationGroup#getFrameworkContext
	 * <em>Framework Context</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for the containment reference '
	 *         <em>Framework Context</em>'.
	 * @see org.smeup.sys.os.pgm.QActivationGroup#getFrameworkContext()
	 * @see #getActivationGroup()
	 * @generated
	 */
	EReference getActivationGroup_FrameworkContext();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.pgm.QActivationGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.os.pgm.QActivationGroup#getName()
	 * @see #getActivationGroup()
	 * @generated
	 */
	EAttribute getActivationGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.os.pgm.QActivationGroup#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see org.smeup.sys.os.pgm.QActivationGroup#getPrograms()
	 * @see #getActivationGroup()
	 * @generated
	 */
	EReference getActivationGroup_Programs();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.pgm.QActivationGroupManager <em>Activation Group Manager</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Activation Group Manager</em>'.
	 * @see org.smeup.sys.os.pgm.QActivationGroupManager
	 * @generated
	 */
	EClass getActivationGroupManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.pgm.QProgram <em>Program</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see org.smeup.sys.os.pgm.QProgram
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.pgm.QProgram#getActivationGroup
	 * <em>Activation Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for the attribute '<em>Activation Group</em>'.
	 * @see org.smeup.sys.os.pgm.QProgram#getActivationGroup()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_ActivationGroup();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.pgm.QProgram#getAddress <em>Address</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.smeup.sys.os.pgm.QProgram#getAddress()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Address();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.os.pgm.QProgram#getCreationParams <em>Creation Params</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Creation Params</em>'.
	 * @see org.smeup.sys.os.pgm.QProgram#getCreationParams()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_CreationParams();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.smeup.sys.os.pgm.QProgram#getSource <em>Source</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.smeup.sys.os.pgm.QProgram#getSource()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Source();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.pgm.QCallableProgram <em>Callable Program</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Program</em>'.
	 * @see org.smeup.sys.os.pgm.QCallableProgram
	 * @generated
	 */
	EClass getCallableProgram();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.smeup.sys.os.pgm.QCallableProgram#getQActivationGroup
	 * <em>QActivation Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for the container reference '
	 *         <em>QActivation Group</em>'.
	 * @see org.smeup.sys.os.pgm.QCallableProgram#getQActivationGroup()
	 * @see #getCallableProgram()
	 * @generated
	 */
	EReference getCallableProgram_QActivationGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.pgm.QCallableProgram#getQEntry <em>QEntry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QEntry</em>'.
	 * @see org.smeup.sys.os.pgm.QCallableProgram#getQEntry()
	 * @see #getCallableProgram()
	 * @generated
	 */
	EAttribute getCallableProgram_QEntry();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.os.pgm.QCallableProgram#getQProgram <em>QProgram</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>QProgram</em>'.
	 * @see org.smeup.sys.os.pgm.QCallableProgram#getQProgram()
	 * @see #getCallableProgram()
	 * @generated
	 */
	EReference getCallableProgram_QProgram();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.pgm.QCallableProgramDelegator <em>Callable Program Delegator</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Callable Program Delegator</em>'.
	 * @see org.smeup.sys.os.pgm.QCallableProgramDelegator
	 * @generated
	 */
	EClass getCallableProgramDelegator();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.pgm.QProgramContainer <em>Program Container</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Container</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramContainer
	 * @generated
	 */
	EClass getProgramContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.pgm.QProgramContainer#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramContainer#getBasePackage()
	 * @see #getProgramContainer()
	 * @generated
	 */
	EAttribute getProgramContainer_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.pgm.QProgramContainer#isScanPackage <em>Scan Package</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scan Package</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramContainer#isScanPackage()
	 * @see #getProgramContainer()
	 * @generated
	 */
	EAttribute getProgramContainer_ScanPackage();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.pgm.QProgramManager <em>Program Manager</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Manager</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramManager
	 * @generated
	 */
	EClass getProgramManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.pgm.QProgramSource <em>Program Source</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Source</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramSource
	 * @generated
	 */
	EClass getProgramSource();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.pgm.QProgramSource#getType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramSource#getType()
	 * @see #getProgramSource()
	 * @generated
	 */
	EAttribute getProgramSource_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.pgm.QProgramSource#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramSource#getContent()
	 * @see #getProgramSource()
	 * @generated
	 */
	EAttribute getProgramSource_Content();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.pgm.QProgramStack <em>Program Stack</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Program Stack</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramStack
	 * @generated
	 */
	EClass getProgramStack();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.pgm.QProgramStack#getDateEnter <em>Date Enter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Enter</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramStack#getDateEnter()
	 * @see #getProgramStack()
	 * @generated
	 */
	EAttribute getProgramStack_DateEnter();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.pgm.QProgramStack#getDateExit <em>Date Exit</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Exit</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramStack#getDateExit()
	 * @see #getProgramStack()
	 * @generated
	 */
	EAttribute getProgramStack_DateExit();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.pgm.QProgramStatus <em>Program Status</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Status</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramStatus
	 * @generated
	 */
	EClass getProgramStatus();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.smeup.sys.os.pgm.QProgramStatus#getCallableProgram
	 * <em>Callable Program</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for the reference '<em>Callable Program</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramStatus#getCallableProgram()
	 * @see #getProgramStatus()
	 * @generated
	 */
	EReference getProgramStatus_CallableProgram();

	/**
	 * Returns the meta object for data type '<em>Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parameter List</em>'.
	 * @model instanceClass="org.smeup.sys.il.data.QData[]"
	 * @generated
	 */
	EDataType getParameterList();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemProgramFactory getOperatingSystemProgramFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.pgm.impl.ActivationGroupImpl <em>Activation Group</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.pgm.impl.ActivationGroupImpl
		 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getActivationGroup()
		 * @generated
		 */
		EClass ACTIVATION_GROUP = eINSTANCE.getActivationGroup();

		/**
		 * The meta object literal for the '<em><b>Framework Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_GROUP__FRAMEWORK_CONTEXT = eINSTANCE.getActivationGroup_FrameworkContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_GROUP__NAME = eINSTANCE.getActivationGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_GROUP__PROGRAMS = eINSTANCE.getActivationGroup_Programs();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.pgm.QActivationGroupManager <em>Activation Group Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.pgm.QActivationGroupManager
		 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getActivationGroupManager()
		 * @generated
		 */
		EClass ACTIVATION_GROUP_MANAGER = eINSTANCE.getActivationGroupManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.pgm.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.os.pgm.impl.ProgramImpl
		 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Activation Group</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__ACTIVATION_GROUP = eINSTANCE.getProgram_ActivationGroup();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__ADDRESS = eINSTANCE.getProgram_Address();

		/**
		 * The meta object literal for the '<em><b>Creation Params</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__CREATION_PARAMS = eINSTANCE.getProgram_CreationParams();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SOURCE = eINSTANCE.getProgram_Source();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.pgm.impl.CallableProgramImpl <em>Callable Program</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.pgm.impl.CallableProgramImpl
		 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getCallableProgram()
		 * @generated
		 */
		EClass CALLABLE_PROGRAM = eINSTANCE.getCallableProgram();

		/**
		 * The meta object literal for the '<em><b>QActivation Group</b></em>' container reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_PROGRAM__QACTIVATION_GROUP = eINSTANCE.getCallableProgram_QActivationGroup();

		/**
		 * The meta object literal for the '<em><b>QEntry</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE_PROGRAM__QENTRY = eINSTANCE.getCallableProgram_QEntry();

		/**
		 * The meta object literal for the '<em><b>QProgram</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_PROGRAM__QPROGRAM = eINSTANCE.getCallableProgram_QProgram();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.pgm.QCallableProgramDelegator <em>Callable Program Delegator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.pgm.QCallableProgramDelegator
		 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getCallableProgramDelegator()
		 * @generated
		 */
		EClass CALLABLE_PROGRAM_DELEGATOR = eINSTANCE.getCallableProgramDelegator();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.pgm.impl.ProgramContainerImpl <em>Program Container</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.pgm.impl.ProgramContainerImpl
		 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramContainer()
		 * @generated
		 */
		EClass PROGRAM_CONTAINER = eINSTANCE.getProgramContainer();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_CONTAINER__BASE_PACKAGE = eINSTANCE.getProgramContainer_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Scan Package</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_CONTAINER__SCAN_PACKAGE = eINSTANCE.getProgramContainer_ScanPackage();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.pgm.QProgramManager <em>Program Manager</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.pgm.QProgramManager
		 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramManager()
		 * @generated
		 */
		EClass PROGRAM_MANAGER = eINSTANCE.getProgramManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.pgm.impl.ProgramSourceImpl <em>Program Source</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.pgm.impl.ProgramSourceImpl
		 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramSource()
		 * @generated
		 */
		EClass PROGRAM_SOURCE = eINSTANCE.getProgramSource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_SOURCE__TYPE = eINSTANCE.getProgramSource_Type();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_SOURCE__CONTENT = eINSTANCE.getProgramSource_Content();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.pgm.impl.ProgramStackImpl <em>Program Stack</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.pgm.impl.ProgramStackImpl
		 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramStack()
		 * @generated
		 */
		EClass PROGRAM_STACK = eINSTANCE.getProgramStack();

		/**
		 * The meta object literal for the '<em><b>Date Enter</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_STACK__DATE_ENTER = eINSTANCE.getProgramStack_DateEnter();

		/**
		 * The meta object literal for the '<em><b>Date Exit</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_STACK__DATE_EXIT = eINSTANCE.getProgramStack_DateExit();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.pgm.impl.ProgramStatusImpl <em>Program Status</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.pgm.impl.ProgramStatusImpl
		 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramStatus()
		 * @generated
		 */
		EClass PROGRAM_STATUS = eINSTANCE.getProgramStatus();

		/**
		 * The meta object literal for the '<em><b>Callable Program</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_STATUS__CALLABLE_PROGRAM = eINSTANCE.getProgramStatus_CallableProgram();

		/**
		 * The meta object literal for the '<em>Parameter List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getParameterList()
		 * @generated
		 */
		EDataType PARAMETER_LIST = eINSTANCE.getParameterList();

	}

} // OSProgramCorePackage
