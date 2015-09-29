/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.lock.QIntegratedLanguageLockPackage;

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
 * @see org.smeup.sys.os.core.QOperatingSystemCoreFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QOperatingSystemCorePackage eINSTANCE = org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.impl.CreationInfoImpl <em>Creation Info</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.impl.CreationInfoImpl
	 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getCreationInfo()
	 * @generated
	 */
	int CREATION_INFO = 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CREATION_INFO__CREATION_DATE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation User</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CREATION_INFO__CREATION_USER = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation System</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CREATION_INFO__CREATION_SYSTEM = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Creation Info</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_INFO_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.impl.SystemImpl
	 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Lock Read</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LOCK_READ = QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_READ;

	/**
	 * The feature id for the '<em><b>Lock Write</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LOCK_WRITE = QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_WRITE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTEXT = QIntegratedLanguageLockPackage.OBJECT_LOCKABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CREATION_INFO = QIntegratedLanguageLockPackage.OBJECT_LOCKABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Install Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__INSTALL_PATH = QIntegratedLanguageLockPackage.OBJECT_LOCKABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Job Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LAST_JOB_NUMBER = QIntegratedLanguageLockPackage.OBJECT_LOCKABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = QIntegratedLanguageLockPackage.OBJECT_LOCKABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__STATUS = QIntegratedLanguageLockPackage.OBJECT_LOCKABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>System Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEM_LIBRARY = QIntegratedLanguageLockPackage.OBJECT_LOCKABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>System User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEM_USER = QIntegratedLanguageLockPackage.OBJECT_LOCKABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = QIntegratedLanguageLockPackage.OBJECT_LOCKABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.QSystemManager <em>System Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.QSystemManager
	 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getSystemManager()
	 * @generated
	 */
	int SYSTEM_MANAGER = 2;

	/**
	 * The number of structural features of the '<em>System Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.QExceptionManager <em>Exception Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.QExceptionManager
	 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getExceptionManager()
	 * @generated
	 */
	int EXCEPTION_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>Exception Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.SystemStatus <em>System Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.SystemStatus
	 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getSystemStatus()
	 * @generated
	 */
	int SYSTEM_STATUS = 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.DateFormat <em>Date Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.DateFormat
	 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getDateFormat()
	 * @generated
	 */
	int DATE_FORMAT = 5;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.TimeFormat <em>Time Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.TimeFormat
	 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getTimeFormat()
	 * @generated
	 */
	int TIME_FORMAT = 6;

	/**
	 * The meta object id for the '<em>Message Variable List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getMessageVariableList()
	 * @generated
	 */
	int MESSAGE_VARIABLE_LIST = 7;

	/**
	 * The meta object id for the '<em>Message Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.OperatingSystemMessageException
	 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getMessageException()
	 * @generated
	 */
	int MESSAGE_EXCEPTION = 8;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.QCreationInfo <em>Creation Info</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation Info</em>'.
	 * @see org.smeup.sys.os.core.QCreationInfo
	 * @generated
	 */
	EClass getCreationInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.QCreationInfo#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.smeup.sys.os.core.QCreationInfo#getCreationDate()
	 * @see #getCreationInfo()
	 * @generated
	 */
	EAttribute getCreationInfo_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.QCreationInfo#getCreationUser <em>Creation User</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation User</em>'.
	 * @see org.smeup.sys.os.core.QCreationInfo#getCreationUser()
	 * @see #getCreationInfo()
	 * @generated
	 */
	EAttribute getCreationInfo_CreationUser();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.QCreationInfo#getCreationSystem <em>Creation System</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation System</em>'.
	 * @see org.smeup.sys.os.core.QCreationInfo#getCreationSystem()
	 * @see #getCreationInfo()
	 * @generated
	 */
	EAttribute getCreationInfo_CreationSystem();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.QSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.smeup.sys.os.core.QSystem
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.os.core.QSystem#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.smeup.sys.os.core.QSystem#getContext()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Context();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.os.core.QSystem#getCreationInfo <em>Creation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation Info</em>'.
	 * @see org.smeup.sys.os.core.QSystem#getCreationInfo()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_CreationInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.QSystem#getInstallPath <em>Install Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Install Path</em>'.
	 * @see org.smeup.sys.os.core.QSystem#getInstallPath()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_InstallPath();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.QSystem#getLastJobNumber <em>Last Job Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Job Number</em>'.
	 * @see org.smeup.sys.os.core.QSystem#getLastJobNumber()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_LastJobNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.QSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.os.core.QSystem#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.QSystem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.smeup.sys.os.core.QSystem#getStatus()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.QSystem#getSystemLibrary <em>System Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Library</em>'.
	 * @see org.smeup.sys.os.core.QSystem#getSystemLibrary()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_SystemLibrary();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.QSystem#getSystemUser <em>System User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System User</em>'.
	 * @see org.smeup.sys.os.core.QSystem#getSystemUser()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_SystemUser();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.QSystemManager <em>System Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Manager</em>'.
	 * @see org.smeup.sys.os.core.QSystemManager
	 * @generated
	 */
	EClass getSystemManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.QExceptionManager <em>Exception Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Manager</em>'.
	 * @see org.smeup.sys.os.core.QExceptionManager
	 * @generated
	 */
	EClass getExceptionManager();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.os.core.SystemStatus <em>System Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Status</em>'.
	 * @see org.smeup.sys.os.core.SystemStatus
	 * @generated
	 */
	EEnum getSystemStatus();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.os.core.DateFormat <em>Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date Format</em>'.
	 * @see org.smeup.sys.os.core.DateFormat
	 * @generated
	 */
	EEnum getDateFormat();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.os.core.TimeFormat <em>Time Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Format</em>'.
	 * @see org.smeup.sys.os.core.TimeFormat
	 * @generated
	 */
	EEnum getTimeFormat();

	/**
	 * Returns the meta object for data type '<em>Message Variable List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Variable List</em>'.
	 * @model instanceClass="java.lang.Object[]"
	 * @generated
	 */
	EDataType getMessageVariableList();

	/**
	 * Returns the meta object for data type '{@link org.smeup.sys.os.core.OperatingSystemMessageException <em>Message Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Exception</em>'.
	 * @see org.smeup.sys.os.core.OperatingSystemMessageException
	 * @model instanceClass="org.smeup.sys.os.core.OperatingSystemMessageException"
	 * @generated
	 */
	EDataType getMessageException();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemCoreFactory getOperatingSystemCoreFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.os.core.impl.CreationInfoImpl <em>Creation Info</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.impl.CreationInfoImpl
		 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getCreationInfo()
		 * @generated
		 */
		EClass CREATION_INFO = eINSTANCE.getCreationInfo();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION_INFO__CREATION_DATE = eINSTANCE.getCreationInfo_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Creation User</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION_INFO__CREATION_USER = eINSTANCE.getCreationInfo_CreationUser();

		/**
		 * The meta object literal for the '<em><b>Creation System</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION_INFO__CREATION_SYSTEM = eINSTANCE.getCreationInfo_CreationSystem();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.impl.SystemImpl
		 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONTEXT = eINSTANCE.getSystem_Context();

		/**
		 * The meta object literal for the '<em><b>Creation Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CREATION_INFO = eINSTANCE.getSystem_CreationInfo();

		/**
		 * The meta object literal for the '<em><b>Install Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__INSTALL_PATH = eINSTANCE.getSystem_InstallPath();

		/**
		 * The meta object literal for the '<em><b>Last Job Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__LAST_JOB_NUMBER = eINSTANCE.getSystem_LastJobNumber();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__STATUS = eINSTANCE.getSystem_Status();

		/**
		 * The meta object literal for the '<em><b>System Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__SYSTEM_LIBRARY = eINSTANCE.getSystem_SystemLibrary();

		/**
		 * The meta object literal for the '<em><b>System User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__SYSTEM_USER = eINSTANCE.getSystem_SystemUser();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.QSystemManager <em>System Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.QSystemManager
		 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getSystemManager()
		 * @generated
		 */
		EClass SYSTEM_MANAGER = eINSTANCE.getSystemManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.QExceptionManager <em>Exception Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.QExceptionManager
		 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getExceptionManager()
		 * @generated
		 */
		EClass EXCEPTION_MANAGER = eINSTANCE.getExceptionManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.SystemStatus <em>System Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.SystemStatus
		 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getSystemStatus()
		 * @generated
		 */
		EEnum SYSTEM_STATUS = eINSTANCE.getSystemStatus();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.DateFormat <em>Date Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.DateFormat
		 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getDateFormat()
		 * @generated
		 */
		EEnum DATE_FORMAT = eINSTANCE.getDateFormat();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.TimeFormat <em>Time Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.TimeFormat
		 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getTimeFormat()
		 * @generated
		 */
		EEnum TIME_FORMAT = eINSTANCE.getTimeFormat();

		/**
		 * The meta object literal for the '<em>Message Variable List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getMessageVariableList()
		 * @generated
		 */
		EDataType MESSAGE_VARIABLE_LIST = eINSTANCE.getMessageVariableList();

		/**
		 * The meta object literal for the '<em>Message Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.OperatingSystemMessageException
		 * @see org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl#getMessageException()
		 * @generated
		 */
		EDataType MESSAGE_EXCEPTION = eINSTANCE.getMessageException();

	}

} // OSCorePackage
