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
	 * The feature id for the '<em><b>Scheduled Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__SCHEDULED_DATE = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scheduled Day</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__SCHEDULED_DAY = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Scheduled Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__SCHEDULED_TIME = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__SYSTEM = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__USER = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__PASSWORD = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__ENVIRONMENT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Schedule Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 12;


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
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduleEntry#getScheduledDate <em>Scheduled Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduled Date</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getScheduledDate()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_ScheduledDate();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.os.scde.QScheduleEntry#getScheduledDay <em>Scheduled Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scheduled Day</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getScheduledDay()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_ScheduledDay();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduleEntry#getScheduledTime <em>Scheduled Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduled Time</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getScheduledTime()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_ScheduledTime();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduleEntry#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getSystem()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_System();

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
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduleEntry#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getPassword()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduleEntry#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see org.smeup.sys.os.scde.QScheduleEntry#getEnvironment()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EAttribute getScheduleEntry_Environment();

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
		 * The meta object literal for the '<em><b>Scheduled Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__SCHEDULED_DATE = eINSTANCE.getScheduleEntry_ScheduledDate();

		/**
		 * The meta object literal for the '<em><b>Scheduled Day</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__SCHEDULED_DAY = eINSTANCE.getScheduleEntry_ScheduledDay();

		/**
		 * The meta object literal for the '<em><b>Scheduled Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__SCHEDULED_TIME = eINSTANCE.getScheduleEntry_ScheduledTime();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__SYSTEM = eINSTANCE.getScheduleEntry_System();

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
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__PASSWORD = eINSTANCE.getScheduleEntry_Password();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_ENTRY__ENVIRONMENT = eINSTANCE.getScheduleEntry_Environment();

	}

} //QOperativeSystemScheduleEntryPackage
