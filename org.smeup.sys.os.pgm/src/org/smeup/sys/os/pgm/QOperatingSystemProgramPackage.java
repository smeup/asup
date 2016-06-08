/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.mi.core.util.QMachineInterfaceUtilPackage;
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
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GROUP__NAME = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GROUP__PROGRAMS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activation Group</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GROUP_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

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
	int ACTIVATION_GROUP_MANAGER_FEATURE_COUNT = QMachineInterfaceUtilPackage.SINGLETON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.pgm.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.os.pgm.impl.ProgramImpl
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 2;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROGRAM__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__FACETS = QOperatingSystemTypePackage.TYPED_OBJECT__FACETS;

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
	 * The feature id for the '<em><b>Base Program</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__BASE_PROGRAM = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Creation Params</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CREATION_PARAMS = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SOURCE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Program</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.pgm.impl.ProgramCallableImpl <em>Program Callable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.pgm.impl.ProgramCallableImpl
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramCallable()
	 * @generated
	 */
	int PROGRAM_CALLABLE = 3;

	/**
	 * The feature id for the '<em><b>Activation Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CALLABLE__ACTIVATION_GROUP = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CALLABLE_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.pgm.impl.ProgramContainerImpl <em>Program Container</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.pgm.impl.ProgramContainerImpl
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramContainer()
	 * @generated
	 */
	int PROGRAM_CONTAINER = 4;

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
	 * The meta object id for the '{@link org.smeup.sys.os.pgm.impl.ProgramInfoImpl <em>Program Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.pgm.impl.ProgramInfoImpl
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramInfo()
	 * @generated
	 */
	int PROGRAM_INFO = 5;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_INFO__MEMORY_SIZE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Load Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_INFO__LOAD_TIME = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Call Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_INFO__CALL_TIME = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Program Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_INFO_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

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
	 * The number of structural features of the '<em>Program Stack</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STACK_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.pgm.QProgramStatus <em>Program Status</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.pgm.QProgramStatus
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramStatus()
	 * @generated
	 */
	int PROGRAM_STATUS = 9;

	/**
	 * The number of structural features of the '<em>Program Status</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STATUS_FEATURE_COUNT = QIntegratedLanguageDataPackage.DATA_STRUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.pgm.ProgramStackOrder <em>Program Stack Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.pgm.ProgramStackOrder
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramStackOrder()
	 * @generated
	 */
	int PROGRAM_STACK_ORDER = 10;

	/**
	 * The meta object id for the '<em>Parameter List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getParameterList()
	 * @generated
	 */
	int PARAMETER_LIST = 11;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.pgm.QActivationGroup <em>Activation Group</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Group</em>'.
	 * @see org.smeup.sys.os.pgm.QActivationGroup
	 * @generated
	 */
	EClass getActivationGroup();

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
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.pgm.QProgram#getBaseProgram <em>Base Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Program</em>'.
	 * @see org.smeup.sys.os.pgm.QProgram#getBaseProgram()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_BaseProgram();

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
	 * Returns the meta object for class '{@link org.smeup.sys.os.pgm.QProgramCallable <em>Program Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Callable</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramCallable
	 * @generated
	 */
	EClass getProgramCallable();

	/**
	 * Returns the meta object for the container reference '{@link org.smeup.sys.os.pgm.QProgramCallable#getActivationGroup <em>Activation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activation Group</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramCallable#getActivationGroup()
	 * @see #getProgramCallable()
	 * @generated
	 */
	EReference getProgramCallable_ActivationGroup();

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
	 * Returns the meta object for class '{@link org.smeup.sys.os.pgm.QProgramInfo <em>Program Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Info</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramInfo
	 * @generated
	 */
	EClass getProgramInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.pgm.QProgramInfo#getMemorySize <em>Memory Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Size</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramInfo#getMemorySize()
	 * @see #getProgramInfo()
	 * @generated
	 */
	EAttribute getProgramInfo_MemorySize();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.pgm.QProgramInfo#getLoadTime <em>Load Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Time</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramInfo#getLoadTime()
	 * @see #getProgramInfo()
	 * @generated
	 */
	EAttribute getProgramInfo_LoadTime();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.pgm.QProgramInfo#getCallTime <em>Call Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Time</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramInfo#getCallTime()
	 * @see #getProgramInfo()
	 * @generated
	 */
	EAttribute getProgramInfo_CallTime();

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
	 * Returns the meta object for class '{@link org.smeup.sys.os.pgm.QProgramStatus <em>Program Status</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Status</em>'.
	 * @see org.smeup.sys.os.pgm.QProgramStatus
	 * @generated
	 */
	EClass getProgramStatus();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.os.pgm.ProgramStackOrder <em>Program Stack Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Program Stack Order</em>'.
	 * @see org.smeup.sys.os.pgm.ProgramStackOrder
	 * @generated
	 */
	EEnum getProgramStackOrder();

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
		 * The meta object literal for the '<em><b>Base Program</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__BASE_PROGRAM = eINSTANCE.getProgram_BaseProgram();

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
		 * The meta object literal for the '{@link org.smeup.sys.os.pgm.impl.ProgramCallableImpl <em>Program Callable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.pgm.impl.ProgramCallableImpl
		 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramCallable()
		 * @generated
		 */
		EClass PROGRAM_CALLABLE = eINSTANCE.getProgramCallable();

		/**
		 * The meta object literal for the '<em><b>Activation Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_CALLABLE__ACTIVATION_GROUP = eINSTANCE.getProgramCallable_ActivationGroup();

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
		 * The meta object literal for the '{@link org.smeup.sys.os.pgm.impl.ProgramInfoImpl <em>Program Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.pgm.impl.ProgramInfoImpl
		 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramInfo()
		 * @generated
		 */
		EClass PROGRAM_INFO = eINSTANCE.getProgramInfo();

		/**
		 * The meta object literal for the '<em><b>Memory Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_INFO__MEMORY_SIZE = eINSTANCE.getProgramInfo_MemorySize();

		/**
		 * The meta object literal for the '<em><b>Load Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_INFO__LOAD_TIME = eINSTANCE.getProgramInfo_LoadTime();

		/**
		 * The meta object literal for the '<em><b>Call Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_INFO__CALL_TIME = eINSTANCE.getProgramInfo_CallTime();

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
		 * The meta object literal for the '{@link org.smeup.sys.os.pgm.QProgramStatus <em>Program Status</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.pgm.QProgramStatus
		 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramStatus()
		 * @generated
		 */
		EClass PROGRAM_STATUS = eINSTANCE.getProgramStatus();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.pgm.ProgramStackOrder <em>Program Stack Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.pgm.ProgramStackOrder
		 * @see org.smeup.sys.os.pgm.impl.OperatingSystemProgramPackageImpl#getProgramStackOrder()
		 * @generated
		 */
		EEnum PROGRAM_STACK_ORDER = eINSTANCE.getProgramStackOrder();

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
