/**
 */
package org.smeup.sys.os.scde.cron;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

import org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage;

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
 * @see org.smeup.sys.os.scde.cron.QOperativeSystemCronScheduleEntryFactory
 * @model kind="package"
 * @generated
 */
public interface QOperativeSystemCronScheduleEntryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cron";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/scde/cron";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-scde-cron";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperativeSystemCronScheduleEntryPackage eINSTANCE = org.smeup.sys.os.scde.cron.impl.OperativeSystemCronScheduleEntryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.scde.cron.impl.CronScheduleEntryImpl <em>Cron Schedule Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.scde.cron.impl.CronScheduleEntryImpl
	 * @see org.smeup.sys.os.scde.cron.impl.OperativeSystemCronScheduleEntryPackageImpl#getCronScheduleEntry()
	 * @generated
	 */
	int CRON_SCHEDULE_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Command To Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_ENTRY__COMMAND_TO_RUN = QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__COMMAND_TO_RUN;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_ENTRY__DESCRIPTION = QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_ENTRY__ENTRY_NUMBER = QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__ENTRY_NUMBER;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_ENTRY__FREQUENCY = QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_ENTRY__JOB_NAME = QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__JOB_NAME;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_ENTRY__SCHEDULE_DATE = QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Day</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_ENTRY__SCHEDULE_DAY = QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_DAY;

	/**
	 * The feature id for the '<em><b>Schedule Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_ENTRY__SCHEDULE_TIME = QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_ENTRY__STATE = QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__STATE;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_ENTRY__USER = QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__USER;

	/**
	 * The feature id for the '<em><b>Wsip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_ENTRY__WSIP = QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wsport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_ENTRY__WSPORT = QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_ENTRY__SYSTEM = QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_ENTRY__PASSWORD = QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_ENTRY__ENVIRONMENT = QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Cron Schedule Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_ENTRY_FEATURE_COUNT = QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.scde.cron.impl.CronSchedulerConfigImpl <em>Cron Scheduler Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.scde.cron.impl.CronSchedulerConfigImpl
	 * @see org.smeup.sys.os.scde.cron.impl.OperativeSystemCronScheduleEntryPackageImpl#getCronSchedulerConfig()
	 * @generated
	 */
	int CRON_SCHEDULER_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Wsip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULER_CONFIG__WSIP = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wsport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULER_CONFIG__WSPORT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULER_CONFIG__SYSTEM = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULER_CONFIG__USER = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULER_CONFIG__PASSWORD = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULER_CONFIG__ENVIRONMENT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Cron Scheduler Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULER_CONFIG_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.scde.cron.QCronScheduleEntry <em>Cron Schedule Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cron Schedule Entry</em>'.
	 * @see org.smeup.sys.os.scde.cron.QCronScheduleEntry
	 * @generated
	 */
	EClass getCronScheduleEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.cron.QCronScheduleEntry#getWsip <em>Wsip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsip</em>'.
	 * @see org.smeup.sys.os.scde.cron.QCronScheduleEntry#getWsip()
	 * @see #getCronScheduleEntry()
	 * @generated
	 */
	EAttribute getCronScheduleEntry_Wsip();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.cron.QCronScheduleEntry#getWsport <em>Wsport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsport</em>'.
	 * @see org.smeup.sys.os.scde.cron.QCronScheduleEntry#getWsport()
	 * @see #getCronScheduleEntry()
	 * @generated
	 */
	EAttribute getCronScheduleEntry_Wsport();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.cron.QCronScheduleEntry#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.smeup.sys.os.scde.cron.QCronScheduleEntry#getSystem()
	 * @see #getCronScheduleEntry()
	 * @generated
	 */
	EAttribute getCronScheduleEntry_System();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.cron.QCronScheduleEntry#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.smeup.sys.os.scde.cron.QCronScheduleEntry#getPassword()
	 * @see #getCronScheduleEntry()
	 * @generated
	 */
	EAttribute getCronScheduleEntry_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.cron.QCronScheduleEntry#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see org.smeup.sys.os.scde.cron.QCronScheduleEntry#getEnvironment()
	 * @see #getCronScheduleEntry()
	 * @generated
	 */
	EAttribute getCronScheduleEntry_Environment();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.scde.cron.QCronSchedulerConfig <em>Cron Scheduler Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cron Scheduler Config</em>'.
	 * @see org.smeup.sys.os.scde.cron.QCronSchedulerConfig
	 * @generated
	 */
	EClass getCronSchedulerConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.cron.QCronSchedulerConfig#getWsip <em>Wsip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsip</em>'.
	 * @see org.smeup.sys.os.scde.cron.QCronSchedulerConfig#getWsip()
	 * @see #getCronSchedulerConfig()
	 * @generated
	 */
	EAttribute getCronSchedulerConfig_Wsip();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.cron.QCronSchedulerConfig#getWsport <em>Wsport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsport</em>'.
	 * @see org.smeup.sys.os.scde.cron.QCronSchedulerConfig#getWsport()
	 * @see #getCronSchedulerConfig()
	 * @generated
	 */
	EAttribute getCronSchedulerConfig_Wsport();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.cron.QCronSchedulerConfig#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.smeup.sys.os.scde.cron.QCronSchedulerConfig#getSystem()
	 * @see #getCronSchedulerConfig()
	 * @generated
	 */
	EAttribute getCronSchedulerConfig_System();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.cron.QCronSchedulerConfig#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.smeup.sys.os.scde.cron.QCronSchedulerConfig#getUser()
	 * @see #getCronSchedulerConfig()
	 * @generated
	 */
	EAttribute getCronSchedulerConfig_User();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.cron.QCronSchedulerConfig#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.smeup.sys.os.scde.cron.QCronSchedulerConfig#getPassword()
	 * @see #getCronSchedulerConfig()
	 * @generated
	 */
	EAttribute getCronSchedulerConfig_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.cron.QCronSchedulerConfig#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see org.smeup.sys.os.scde.cron.QCronSchedulerConfig#getEnvironment()
	 * @see #getCronSchedulerConfig()
	 * @generated
	 */
	EAttribute getCronSchedulerConfig_Environment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperativeSystemCronScheduleEntryFactory getOperativeSystemCronScheduleEntryFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.os.scde.cron.impl.CronScheduleEntryImpl <em>Cron Schedule Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.scde.cron.impl.CronScheduleEntryImpl
		 * @see org.smeup.sys.os.scde.cron.impl.OperativeSystemCronScheduleEntryPackageImpl#getCronScheduleEntry()
		 * @generated
		 */
		EClass CRON_SCHEDULE_ENTRY = eINSTANCE.getCronScheduleEntry();

		/**
		 * The meta object literal for the '<em><b>Wsip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_SCHEDULE_ENTRY__WSIP = eINSTANCE.getCronScheduleEntry_Wsip();

		/**
		 * The meta object literal for the '<em><b>Wsport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_SCHEDULE_ENTRY__WSPORT = eINSTANCE.getCronScheduleEntry_Wsport();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_SCHEDULE_ENTRY__SYSTEM = eINSTANCE.getCronScheduleEntry_System();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_SCHEDULE_ENTRY__PASSWORD = eINSTANCE.getCronScheduleEntry_Password();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_SCHEDULE_ENTRY__ENVIRONMENT = eINSTANCE.getCronScheduleEntry_Environment();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.scde.cron.impl.CronSchedulerConfigImpl <em>Cron Scheduler Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.scde.cron.impl.CronSchedulerConfigImpl
		 * @see org.smeup.sys.os.scde.cron.impl.OperativeSystemCronScheduleEntryPackageImpl#getCronSchedulerConfig()
		 * @generated
		 */
		EClass CRON_SCHEDULER_CONFIG = eINSTANCE.getCronSchedulerConfig();

		/**
		 * The meta object literal for the '<em><b>Wsip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_SCHEDULER_CONFIG__WSIP = eINSTANCE.getCronSchedulerConfig_Wsip();

		/**
		 * The meta object literal for the '<em><b>Wsport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_SCHEDULER_CONFIG__WSPORT = eINSTANCE.getCronSchedulerConfig_Wsport();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_SCHEDULER_CONFIG__SYSTEM = eINSTANCE.getCronSchedulerConfig_System();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_SCHEDULER_CONFIG__USER = eINSTANCE.getCronSchedulerConfig_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_SCHEDULER_CONFIG__PASSWORD = eINSTANCE.getCronSchedulerConfig_Password();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_SCHEDULER_CONFIG__ENVIRONMENT = eINSTANCE.getCronSchedulerConfig_Environment();

	}

} //QOperativeSystemCronScheduleEntryPackage
