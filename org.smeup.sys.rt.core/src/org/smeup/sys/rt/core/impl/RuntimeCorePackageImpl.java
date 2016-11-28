/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;
import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.core.QApplicationComponent;
import org.smeup.sys.rt.core.QApplicationManager;
import org.smeup.sys.rt.core.QApplicationModule;
import org.smeup.sys.rt.core.QBundleManager;
import org.smeup.sys.rt.core.QBundleVisitor;
import org.smeup.sys.rt.core.QLogger;
import org.smeup.sys.rt.core.QRuntimeCoreFactory;
import org.smeup.sys.rt.core.QRuntimeCorePackage;
import org.smeup.sys.rt.core.QServiceCommandProvider;
import org.smeup.sys.rt.core.QServiceExecutor;
import org.smeup.sys.rt.core.QServiceHook;
import org.smeup.sys.rt.core.QServiceRef;
import org.smeup.sys.rt.core.QServiceRegistry;
import org.smeup.sys.rt.core.QServiceRegistryEntry;
import org.smeup.sys.rt.core.QServiceResourceListener;
import org.smeup.sys.rt.core.QServiceResourceProvider;
import org.smeup.sys.rt.core.QServiceTester;
import org.smeup.sys.rt.core.ServiceStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeCorePackageImpl extends EPackageImpl implements QRuntimeCorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceCommandProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceHookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceExecutorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceResourceListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceResourceProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRegistryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceStatusEEnum = null;

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
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RuntimeCorePackageImpl() {
		super(eNS_URI, QRuntimeCoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QRuntimeCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QRuntimeCorePackage init() {
		if (isInited) return (QRuntimeCorePackage)EPackage.Registry.INSTANCE.getEPackage(QRuntimeCorePackage.eNS_URI);

		// Obtain or create and register package
		RuntimeCorePackageImpl theRuntimeCorePackage = (RuntimeCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RuntimeCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RuntimeCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRuntimeCorePackage.createPackageContents();

		// Initialize created meta-data
		theRuntimeCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRuntimeCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QRuntimeCorePackage.eNS_URI, theRuntimeCorePackage);
		return theRuntimeCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Commands() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Components() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Context() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Hooks() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplication_Name() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Port() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplication_Text() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationComponent() {
		return applicationComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationComponent_Commands() {
		return (EReference)applicationComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplicationComponent_Hooks() {
		return (EReference)applicationComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplicationComponent_Modules() {
		return (EReference)applicationComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationComponent_Name() {
		return (EAttribute)applicationComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplicationComponent_Configs() {
		return (EReference)applicationComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationModule() {
		return applicationModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationModule_Name() {
		return (EAttribute)applicationModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationModule_Services() {
		return (EReference)applicationModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationManager() {
		return applicationManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundleManager() {
		return bundleManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundleVisitor() {
		return bundleVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogger() {
		return loggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceCommandProvider() {
		return serviceCommandProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCommandProvider_InterfaceName() {
		return (EAttribute)serviceCommandProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceHook() {
		return serviceHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceExecutor() {
		return serviceExecutorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceExecutor_InterfaceName() {
		return (EAttribute)serviceExecutorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceExecutor_RemoteExport() {
		return (EAttribute)serviceExecutorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceRef() {
		return serviceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceRef_ClassName() {
		return (EAttribute)serviceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceRef_Status() {
		return (EAttribute)serviceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceResourceListener() {
		return serviceResourceListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceResourceListener_InterfaceName() {
		return (EAttribute)serviceResourceListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceResourceProvider() {
		return serviceResourceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceResourceProvider_InterfaceName() {
		return (EAttribute)serviceResourceProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRegistry() {
		return serviceRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRegistry_Entries() {
		return (EReference)serviceRegistryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistry_InterfaceName() {
		return (EAttribute)serviceRegistryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistry_Name() {
		return (EAttribute)serviceRegistryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRegistryEntry() {
		return serviceRegistryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistryEntry_InterfaceName() {
		return (EAttribute)serviceRegistryEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistryEntry_Name() {
		return (EAttribute)serviceRegistryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistryEntry_Vendor() {
		return (EAttribute)serviceRegistryEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistryEntry_Version() {
		return (EAttribute)serviceRegistryEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceTester() {
		return serviceTesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceTester_InterfaceName() {
		return (EAttribute)serviceTesterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServiceStatus() {
		return serviceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QRuntimeCoreFactory getRuntimeCoreFactory() {
		return (QRuntimeCoreFactory)getEFactoryInstance();
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
		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__COMMANDS);
		createEReference(applicationEClass, APPLICATION__COMPONENTS);
		createEReference(applicationEClass, APPLICATION__CONTEXT);
		createEReference(applicationEClass, APPLICATION__HOOKS);
		createEAttribute(applicationEClass, APPLICATION__NAME);
		createEAttribute(applicationEClass, APPLICATION__PORT);
		createEAttribute(applicationEClass, APPLICATION__TEXT);

		applicationComponentEClass = createEClass(APPLICATION_COMPONENT);
		createEReference(applicationComponentEClass, APPLICATION_COMPONENT__COMMANDS);
		createEReference(applicationComponentEClass, APPLICATION_COMPONENT__CONFIGS);
		createEReference(applicationComponentEClass, APPLICATION_COMPONENT__HOOKS);
		createEReference(applicationComponentEClass, APPLICATION_COMPONENT__MODULES);
		createEAttribute(applicationComponentEClass, APPLICATION_COMPONENT__NAME);

		applicationManagerEClass = createEClass(APPLICATION_MANAGER);

		applicationModuleEClass = createEClass(APPLICATION_MODULE);
		createEAttribute(applicationModuleEClass, APPLICATION_MODULE__NAME);
		createEReference(applicationModuleEClass, APPLICATION_MODULE__SERVICES);

		bundleManagerEClass = createEClass(BUNDLE_MANAGER);

		bundleVisitorEClass = createEClass(BUNDLE_VISITOR);

		loggerEClass = createEClass(LOGGER);

		serviceCommandProviderEClass = createEClass(SERVICE_COMMAND_PROVIDER);
		createEAttribute(serviceCommandProviderEClass, SERVICE_COMMAND_PROVIDER__INTERFACE_NAME);

		serviceHookEClass = createEClass(SERVICE_HOOK);

		serviceExecutorEClass = createEClass(SERVICE_EXECUTOR);
		createEAttribute(serviceExecutorEClass, SERVICE_EXECUTOR__INTERFACE_NAME);
		createEAttribute(serviceExecutorEClass, SERVICE_EXECUTOR__REMOTE_EXPORT);

		serviceRefEClass = createEClass(SERVICE_REF);
		createEAttribute(serviceRefEClass, SERVICE_REF__CLASS_NAME);
		createEAttribute(serviceRefEClass, SERVICE_REF__STATUS);

		serviceResourceListenerEClass = createEClass(SERVICE_RESOURCE_LISTENER);
		createEAttribute(serviceResourceListenerEClass, SERVICE_RESOURCE_LISTENER__INTERFACE_NAME);

		serviceResourceProviderEClass = createEClass(SERVICE_RESOURCE_PROVIDER);
		createEAttribute(serviceResourceProviderEClass, SERVICE_RESOURCE_PROVIDER__INTERFACE_NAME);

		serviceRegistryEClass = createEClass(SERVICE_REGISTRY);
		createEReference(serviceRegistryEClass, SERVICE_REGISTRY__ENTRIES);
		createEAttribute(serviceRegistryEClass, SERVICE_REGISTRY__INTERFACE_NAME);
		createEAttribute(serviceRegistryEClass, SERVICE_REGISTRY__NAME);

		serviceRegistryEntryEClass = createEClass(SERVICE_REGISTRY_ENTRY);
		createEAttribute(serviceRegistryEntryEClass, SERVICE_REGISTRY_ENTRY__INTERFACE_NAME);
		createEAttribute(serviceRegistryEntryEClass, SERVICE_REGISTRY_ENTRY__NAME);
		createEAttribute(serviceRegistryEntryEClass, SERVICE_REGISTRY_ENTRY__VENDOR);
		createEAttribute(serviceRegistryEntryEClass, SERVICE_REGISTRY_ENTRY__VERSION);

		serviceTesterEClass = createEClass(SERVICE_TESTER);
		createEAttribute(serviceTesterEClass, SERVICE_TESTER__INTERFACE_NAME);

		// Create enums
		serviceStatusEEnum = createEEnum(SERVICE_STATUS);
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
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);
		QMachineInterfaceCorePackage theMachineInterfaceCorePackage = (QMachineInterfaceCorePackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		applicationEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObjectNameable());
		applicationEClass.getESuperTypes().add(theIntegratedLanguageCoreCtxPackage.getContextProvider());
		applicationComponentEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		applicationComponentEClass.getESuperTypes().add(theIntegratedLanguageCoreCtxPackage.getContextProvider());
		applicationModuleEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		serviceCommandProviderEClass.getESuperTypes().add(this.getServiceRef());
		serviceHookEClass.getESuperTypes().add(this.getServiceRef());
		serviceExecutorEClass.getESuperTypes().add(this.getServiceRef());
		serviceRefEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		serviceResourceListenerEClass.getESuperTypes().add(this.getServiceRef());
		serviceResourceProviderEClass.getESuperTypes().add(this.getServiceRef());
		serviceRegistryEClass.getESuperTypes().add(this.getServiceRef());
		serviceRegistryEntryEClass.getESuperTypes().add(this.getServiceRef());
		serviceTesterEClass.getESuperTypes().add(this.getServiceRef());

		// Initialize classes and features; add operations and parameters
		initEClass(applicationEClass, QApplication.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_Commands(), this.getServiceCommandProvider(), null, "commands", null, 0, -1, QApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Components(), this.getApplicationComponent(), null, "components", null, 0, -1, QApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Context(), theIntegratedLanguageCoreCtxPackage.getContext(), null, "context", null, 0, 1, QApplication.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Hooks(), this.getServiceHook(), null, "hooks", null, 0, -1, QApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, QApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Port(), ecorePackage.getEInt(), "port", null, 0, 1, QApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Text(), ecorePackage.getEString(), "text", null, 0, 1, QApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationComponentEClass, QApplicationComponent.class, "ApplicationComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationComponent_Commands(), this.getServiceCommandProvider(), null, "commands", null, 0, -1, QApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationComponent_Configs(), theIntegratedLanguageCorePackage.getObject(), null, "configs", null, 0, -1, QApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationComponent_Hooks(), this.getServiceHook(), null, "hooks", null, 0, -1, QApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationComponent_Modules(), this.getApplicationModule(), null, "modules", null, 0, -1, QApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationComponent_Name(), ecorePackage.getEString(), "name", null, 1, 1, QApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationManagerEClass, QApplicationManager.class, "ApplicationManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(applicationManagerEClass, this.getApplication(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getApplication(), "application", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaOutputStream(), "output", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(applicationManagerEClass, null, "restart", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(applicationManagerEClass, ecorePackage.getEBoolean(), "restartCalled", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(applicationManagerEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(applicationManagerEClass, ecorePackage.getEBoolean(), "stopCalled", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(applicationModuleEClass, QApplicationModule.class, "ApplicationModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, QApplicationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationModule_Services(), this.getServiceRef(), null, "services", null, 0, -1, QApplicationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleManagerEClass, QBundleManager.class, "BundleManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(bundleManagerEClass, ecorePackage.getEBoolean(), "isRegisterable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "bundleName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bundleManagerEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "bundleName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBundleVisitor(), "visitor", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bundleManagerEClass, null, "register", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "bundleName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bundleManagerEClass, null, "unregister", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "symbolicName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bundleVisitorEClass, QBundleVisitor.class, "BundleVisitor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(bundleVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCorePackage.getObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bundleVisitorEClass, null, "visitEnter", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectContainer());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "container", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bundleVisitorEClass, null, "visitExit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectContainer());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "container", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(loggerEClass, QLogger.class, "Logger", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(loggerEClass, null, "debug", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "debug", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "debug", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "info", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "info", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "info", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceCommandProviderEClass, QServiceCommandProvider.class, "ServiceCommandProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceCommandProvider_InterfaceName(), ecorePackage.getEString(), "interfaceName", "org.eclipse.osgi.framework.console.CommandProvider", 1, 1, QServiceCommandProvider.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceHookEClass, QServiceHook.class, "ServiceHook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceExecutorEClass, QServiceExecutor.class, "ServiceExecutor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceExecutor_InterfaceName(), ecorePackage.getEString(), "interfaceName", null, 1, 1, QServiceExecutor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceExecutor_RemoteExport(), ecorePackage.getEBoolean(), "remoteExport", null, 1, 1, QServiceExecutor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceRefEClass, QServiceRef.class, "ServiceRef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceRef_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, QServiceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceRef_Status(), this.getServiceStatus(), "status", null, 1, 1, QServiceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(serviceRefEClass, ecorePackage.getEString(), "getInterfaceName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceResourceListenerEClass, QServiceResourceListener.class, "ServiceResourceListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceResourceListener_InterfaceName(), ecorePackage.getEString(), "interfaceName", "org.smeup.sys.il.memo.QResourceListener", 1, 1, QServiceResourceListener.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceResourceProviderEClass, QServiceResourceProvider.class, "ServiceResourceProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceResourceProvider_InterfaceName(), ecorePackage.getEString(), "interfaceName", "org.smeup.sys.il.memo.QResourceProvider", 1, 1, QServiceResourceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceRegistryEClass, QServiceRegistry.class, "ServiceRegistry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceRegistry_Entries(), this.getServiceRegistryEntry(), null, "entries", null, 0, -1, QServiceRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceRegistry_InterfaceName(), ecorePackage.getEString(), "interfaceName", null, 1, 1, QServiceRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceRegistry_Name(), ecorePackage.getEString(), "name", null, 1, 1, QServiceRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceRegistryEntryEClass, QServiceRegistryEntry.class, "ServiceRegistryEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceRegistryEntry_InterfaceName(), ecorePackage.getEString(), "interfaceName", null, 1, 1, QServiceRegistryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceRegistryEntry_Name(), ecorePackage.getEString(), "name", null, 1, 1, QServiceRegistryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceRegistryEntry_Vendor(), ecorePackage.getEString(), "vendor", null, 0, 1, QServiceRegistryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceRegistryEntry_Version(), ecorePackage.getEString(), "version", null, 0, 1, QServiceRegistryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceTesterEClass, QServiceTester.class, "ServiceTester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceTester_InterfaceName(), ecorePackage.getEString(), "interfaceName", "org.smeup.sys.dk.test.QTestSuiteLauncher", 1, 1, QServiceTester.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(serviceStatusEEnum, ServiceStatus.class, "ServiceStatus");
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.ACTIVE);
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.STOPPED);
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.TESTING);

		// Create resource
		createResource(eNS_URI);
	}

} //FrameworkCorePackageImpl
