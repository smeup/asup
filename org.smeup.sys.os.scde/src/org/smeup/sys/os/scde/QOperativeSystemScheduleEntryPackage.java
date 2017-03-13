/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.scde;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryFactory
 * @model kind="package"
 * @generated
 */
public interface QOperativeSystemScheduleEntryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scde";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/scde";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-scde";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperativeSystemScheduleEntryPackage eINSTANCE = org.smeup.sys.os.scde.impl.OperativeSystemScheduleEntryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl <em>Schedule Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.scde.impl.ScheduleEntryImpl
	 * @see org.smeup.sys.os.scde.impl.OperativeSystemScheduleEntryPackageImpl#getScheduleEntry()
	 * @generated
	 */
	int SCHEDULE_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Command To Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__COMMAND_TO_RUN = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__DESCRIPTION = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entry Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__ENTRY_NUMBER = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__FREQUENCY = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__JOB_NAME = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__SCHEDULE_DATE = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Schedule Day</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__SCHEDULE_DAY = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Omit Date</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__OMIT_DATE = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Relative Day Of Month</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__RELATIVE_DAY_OF_MONTH = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Schedule Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__SCHEDULE_TIME = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__STATE = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__USER = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Schedule Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 12;


	/**
	 * The meta object id for the '{@link org.smeup.sys.os.scde.QScheduleManager <em>Schedule Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.scde.QScheduleManager
	 * @see org.smeup.sys.os.scde.impl.OperativeSystemScheduleEntryPackageImpl#getScheduleManager()
	 * @generated
	 */
	int SCHEDULE_MANAGER = 1;

	/**
	 * The number of structural features of the '<em>Schedule Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.scde.ScheduleState <em>Schedule State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.scde.ScheduleState
	 * @see org.smeup.sys.os.scde.impl.OperativeSystemScheduleEntryPackageImpl#getScheduleState()
	 * @generated
	 */
	int SCHEDULE_STATE = 2;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.scde.QScheduleEntry <em>Schedule Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Entry</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry
	 * @generated
	 */
	EClass getScheduleEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduleEntry#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getState()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_State();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduleEntry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getDescription()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduleEntry#getEntryNumber <em>Entry Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Number</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getEntryNumber()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_EntryNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduleEntry#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getFrequency()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduleEntry#getJobName <em>Job Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Name</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getJobName()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_JobName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduleEntry#getScheduleDate <em>Schedule Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Date</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getScheduleDate()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_ScheduleDate();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.os.scde.QScheduleEntry#getScheduleDay <em>Schedule Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Schedule Day</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getScheduleDay()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_ScheduleDay();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.os.scde.QScheduleEntry#getOmitDate <em>Omit Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Omit Date</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getOmitDate()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_OmitDate();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.os.scde.QScheduleEntry#getRelativeDayOfMonth <em>Relative Day Of Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Relative Day Of Month</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getRelativeDayOfMonth()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_RelativeDayOfMonth();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduleEntry#getScheduleTime <em>Schedule Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Time</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getScheduleTime()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_ScheduleTime();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduleEntry#getCommandToRun <em>Command To Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command To Run</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getCommandToRun()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_CommandToRun();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduleEntry#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getUser()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_User();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.scde.QScheduleManager <em>Schedule Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Manager</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleManager
	 * @generated
	 */
	EClass getScheduleManager();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.os.scde.ScheduleState <em>Schedule State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Schedule State</em>'.
	 * @see org.smeup.sys.os.scde.ScheduleState
	 * @generated
	 */
	EEnum getScheduleState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperativeSystemScheduleEntryFactory getOperativeSystemScheduleEntryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl <em>Schedule Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.scde.impl.ScheduleEntryImpl
		 * @see org.smeup.sys.os.scde.impl.OperativeSystemScheduleEntryPackageImpl#getScheduleEntry()
		 * @generated
		 */
		EClass SCHEDULE_ENTRY = eINSTANCE.getScheduleEntry();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__STATE = eINSTANCE.getScheduleEntry_State();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__DESCRIPTION = eINSTANCE.getScheduleEntry_Description();

		/**
		 * The meta object literal for the '<em><b>Entry Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__ENTRY_NUMBER = eINSTANCE.getScheduleEntry_EntryNumber();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__FREQUENCY = eINSTANCE.getScheduleEntry_Frequency();

		/**
		 * The meta object literal for the '<em><b>Job Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__JOB_NAME = eINSTANCE.getScheduleEntry_JobName();

		/**
		 * The meta object literal for the '<em><b>Schedule Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__SCHEDULE_DATE = eINSTANCE.getScheduleEntry_ScheduleDate();

		/**
		 * The meta object literal for the '<em><b>Schedule Day</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__SCHEDULE_DAY = eINSTANCE.getScheduleEntry_ScheduleDay();

		/**
		 * The meta object literal for the '<em><b>Omit Date</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__OMIT_DATE = eINSTANCE.getScheduleEntry_OmitDate();

		/**
		 * The meta object literal for the '<em><b>Relative Day Of Month</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__RELATIVE_DAY_OF_MONTH = eINSTANCE.getScheduleEntry_RelativeDayOfMonth();

		/**
		 * The meta object literal for the '<em><b>Schedule Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__SCHEDULE_TIME = eINSTANCE.getScheduleEntry_ScheduleTime();

		/**
		 * The meta object literal for the '<em><b>Command To Run</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__COMMAND_TO_RUN = eINSTANCE.getScheduleEntry_CommandToRun();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__USER = eINSTANCE.getScheduleEntry_User();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.scde.QScheduleManager <em>Schedule Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.scde.QScheduleManager
		 * @see org.smeup.sys.os.scde.impl.OperativeSystemScheduleEntryPackageImpl#getScheduleManager()
		 * @generated
		 */
		EClass SCHEDULE_MANAGER = eINSTANCE.getScheduleManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.scde.ScheduleState <em>Schedule State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.scde.ScheduleState
		 * @see org.smeup.sys.os.scde.impl.OperativeSystemScheduleEntryPackageImpl#getScheduleState()
		 * @generated
		 */
		EEnum SCHEDULE_STATE = eINSTANCE.getScheduleState();

	}

} //QOperativeSystemScheduleEntryPackage
