/**
 */
package org.smeup.sys.os.scde.cron.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage;

import org.smeup.sys.os.scde.cron.QCronScheduleEntry;
import org.smeup.sys.os.scde.cron.QCronSchedulerConfig;
import org.smeup.sys.os.scde.cron.QOperativeSystemCronScheduleEntryFactory;
import org.smeup.sys.os.scde.cron.QOperativeSystemCronScheduleEntryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperativeSystemCronScheduleEntryPackageImpl extends EPackageImpl implements QOperativeSystemCronScheduleEntryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cronScheduleEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cronSchedulerConfigEClass = null;

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
	 * @see org.smeup.sys.os.scde.cron.QOperativeSystemCronScheduleEntryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperativeSystemCronScheduleEntryPackageImpl() {
		super(eNS_URI, QOperativeSystemCronScheduleEntryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QOperativeSystemCronScheduleEntryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperativeSystemCronScheduleEntryPackage init() {
		if (isInited) return (QOperativeSystemCronScheduleEntryPackage)EPackage.Registry.INSTANCE.getEPackage(QOperativeSystemCronScheduleEntryPackage.eNS_URI);

		// Obtain or create and register package
		OperativeSystemCronScheduleEntryPackageImpl theOperativeSystemCronScheduleEntryPackage = (OperativeSystemCronScheduleEntryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperativeSystemCronScheduleEntryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperativeSystemCronScheduleEntryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QOperativeSystemScheduleEntryPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperativeSystemCronScheduleEntryPackage.createPackageContents();

		// Initialize created meta-data
		theOperativeSystemCronScheduleEntryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperativeSystemCronScheduleEntryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperativeSystemCronScheduleEntryPackage.eNS_URI, theOperativeSystemCronScheduleEntryPackage);
		return theOperativeSystemCronScheduleEntryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCronScheduleEntry() {
		return cronScheduleEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCronScheduleEntry_Wsip() {
		return (EAttribute)cronScheduleEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCronScheduleEntry_Wsport() {
		return (EAttribute)cronScheduleEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCronScheduleEntry_System() {
		return (EAttribute)cronScheduleEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCronScheduleEntry_Password() {
		return (EAttribute)cronScheduleEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCronScheduleEntry_Environment() {
		return (EAttribute)cronScheduleEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCronSchedulerConfig() {
		return cronSchedulerConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCronSchedulerConfig_Wsip() {
		return (EAttribute)cronSchedulerConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCronSchedulerConfig_Wsport() {
		return (EAttribute)cronSchedulerConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCronSchedulerConfig_System() {
		return (EAttribute)cronSchedulerConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCronSchedulerConfig_User() {
		return (EAttribute)cronSchedulerConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCronSchedulerConfig_Password() {
		return (EAttribute)cronSchedulerConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCronSchedulerConfig_Environment() {
		return (EAttribute)cronSchedulerConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperativeSystemCronScheduleEntryFactory getOperativeSystemCronScheduleEntryFactory() {
		return (QOperativeSystemCronScheduleEntryFactory)getEFactoryInstance();
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
		cronScheduleEntryEClass = createEClass(CRON_SCHEDULE_ENTRY);
		createEAttribute(cronScheduleEntryEClass, CRON_SCHEDULE_ENTRY__WSIP);
		createEAttribute(cronScheduleEntryEClass, CRON_SCHEDULE_ENTRY__WSPORT);
		createEAttribute(cronScheduleEntryEClass, CRON_SCHEDULE_ENTRY__SYSTEM);
		createEAttribute(cronScheduleEntryEClass, CRON_SCHEDULE_ENTRY__PASSWORD);
		createEAttribute(cronScheduleEntryEClass, CRON_SCHEDULE_ENTRY__ENVIRONMENT);

		cronSchedulerConfigEClass = createEClass(CRON_SCHEDULER_CONFIG);
		createEAttribute(cronSchedulerConfigEClass, CRON_SCHEDULER_CONFIG__WSIP);
		createEAttribute(cronSchedulerConfigEClass, CRON_SCHEDULER_CONFIG__WSPORT);
		createEAttribute(cronSchedulerConfigEClass, CRON_SCHEDULER_CONFIG__SYSTEM);
		createEAttribute(cronSchedulerConfigEClass, CRON_SCHEDULER_CONFIG__USER);
		createEAttribute(cronSchedulerConfigEClass, CRON_SCHEDULER_CONFIG__PASSWORD);
		createEAttribute(cronSchedulerConfigEClass, CRON_SCHEDULER_CONFIG__ENVIRONMENT);
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
		QOperativeSystemScheduleEntryPackage theOperativeSystemScheduleEntryPackage = (QOperativeSystemScheduleEntryPackage)EPackage.Registry.INSTANCE.getEPackage(QOperativeSystemScheduleEntryPackage.eNS_URI);
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cronScheduleEntryEClass.getESuperTypes().add(theOperativeSystemScheduleEntryPackage.getScheduleEntry());
		cronSchedulerConfigEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(cronScheduleEntryEClass, QCronScheduleEntry.class, "CronScheduleEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCronScheduleEntry_Wsip(), ecorePackage.getEString(), "wsip", null, 0, 1, QCronScheduleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCronScheduleEntry_Wsport(), ecorePackage.getEString(), "wsport", null, 0, 1, QCronScheduleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCronScheduleEntry_System(), ecorePackage.getEString(), "system", null, 0, 1, QCronScheduleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCronScheduleEntry_Password(), ecorePackage.getEString(), "password", null, 0, 1, QCronScheduleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCronScheduleEntry_Environment(), ecorePackage.getEString(), "environment", null, 0, 1, QCronScheduleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cronSchedulerConfigEClass, QCronSchedulerConfig.class, "CronSchedulerConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCronSchedulerConfig_Wsip(), ecorePackage.getEString(), "wsip", null, 0, 1, QCronSchedulerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCronSchedulerConfig_Wsport(), ecorePackage.getEString(), "wsport", null, 0, 1, QCronSchedulerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCronSchedulerConfig_System(), ecorePackage.getEString(), "system", null, 0, 1, QCronSchedulerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCronSchedulerConfig_User(), ecorePackage.getEString(), "user", null, 0, 1, QCronSchedulerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCronSchedulerConfig_Password(), ecorePackage.getEString(), "password", null, 0, 1, QCronSchedulerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCronSchedulerConfig_Environment(), ecorePackage.getEString(), "environment", null, 0, 1, QCronSchedulerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OperativeSystemCronScheduleEntryPackageImpl
