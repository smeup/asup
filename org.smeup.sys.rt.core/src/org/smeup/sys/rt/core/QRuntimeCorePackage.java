/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.rt.core.QRuntimeCoreFactory
 * @model kind="package"
 * @generated
 */
public interface QRuntimeCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/rt/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rt-core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QRuntimeCorePackage eINSTANCE = org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.impl.ApplicationImpl
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__COMMANDS = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__COMPONENTS = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONTEXT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.QApplicationManager <em>Application Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.QApplicationManager
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getApplicationManager()
	 * @generated
	 */
	int APPLICATION_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HOOKS = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PORT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__TEXT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.impl.ApplicationComponentImpl <em>Application Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.impl.ApplicationComponentImpl
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getApplicationComponent()
	 * @generated
	 */
	int APPLICATION_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__CONFIG = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__HOOKS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__COMMANDS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__MODULES = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__NAME = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Application Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.impl.ApplicationModuleImpl <em>Application Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.impl.ApplicationModuleImpl
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getApplicationModule()
	 * @generated
	 */
	int APPLICATION_MODULE = 3;

	/**
	 * The number of structural features of the '<em>Application Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE__NAME = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE__SERVICES = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Application Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.QBundleManager <em>Bundle Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.QBundleManager
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getBundleManager()
	 * @generated
	 */
	int BUNDLE_MANAGER = 4;

	/**
	 * The number of structural features of the '<em>Bundle Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.impl.BundleVisitorImpl <em>Bundle Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.impl.BundleVisitorImpl
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getBundleVisitor()
	 * @generated
	 */
	int BUNDLE_VISITOR = 5;

	/**
	 * The number of structural features of the '<em>Bundle Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.impl.ConfigImpl
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 6;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__OBJECTS = 0;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.QLogger <em>Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.QLogger
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getLogger()
	 * @generated
	 */
	int LOGGER = 7;

	/**
	 * The number of structural features of the '<em>Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.impl.ServiceRefImpl <em>Service Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.impl.ServiceRefImpl
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceRef()
	 * @generated
	 */
	int SERVICE_REF = 11;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__CLASS_NAME = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__STATUS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.impl.ServiceCommandProviderImpl <em>Service Command Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.impl.ServiceCommandProviderImpl
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceCommandProvider()
	 * @generated
	 */
	int SERVICE_COMMAND_PROVIDER = 8;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMMAND_PROVIDER__CLASS_NAME = SERVICE_REF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMMAND_PROVIDER__STATUS = SERVICE_REF__STATUS;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMMAND_PROVIDER__INTERFACE_NAME = SERVICE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Command Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMMAND_PROVIDER_FEATURE_COUNT = SERVICE_REF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.impl.ServiceExecutorImpl <em>Service Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.impl.ServiceExecutorImpl
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceExecutor()
	 * @generated
	 */
	int SERVICE_EXECUTOR = 10;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.impl.ServiceHookImpl <em>Service Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.impl.ServiceHookImpl
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceHook()
	 * @generated
	 */
	int SERVICE_HOOK = 9;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HOOK__CLASS_NAME = SERVICE_REF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HOOK__STATUS = SERVICE_REF__STATUS;

	/**
	 * The number of structural features of the '<em>Service Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HOOK_FEATURE_COUNT = SERVICE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTOR__CLASS_NAME = SERVICE_REF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTOR__STATUS = SERVICE_REF__STATUS;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTOR__INTERFACE_NAME = SERVICE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remote Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTOR__REMOTE_EXPORT = SERVICE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTOR_FEATURE_COUNT = SERVICE_REF_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.impl.ServiceResourceListenerImpl <em>Service Resource Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.impl.ServiceResourceListenerImpl
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceResourceListener()
	 * @generated
	 */
	int SERVICE_RESOURCE_LISTENER = 12;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_LISTENER__CLASS_NAME = SERVICE_REF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_LISTENER__STATUS = SERVICE_REF__STATUS;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_LISTENER__INTERFACE_NAME = SERVICE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Resource Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_LISTENER_FEATURE_COUNT = SERVICE_REF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.impl.ServiceResourceProviderImpl <em>Service Resource Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.impl.ServiceResourceProviderImpl
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceResourceProvider()
	 * @generated
	 */
	int SERVICE_RESOURCE_PROVIDER = 13;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_PROVIDER__CLASS_NAME = SERVICE_REF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_PROVIDER__STATUS = SERVICE_REF__STATUS;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_PROVIDER__INTERFACE_NAME = SERVICE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Resource Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_PROVIDER_FEATURE_COUNT = SERVICE_REF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.impl.ServiceRegistryImpl <em>Service Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.impl.ServiceRegistryImpl
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceRegistry()
	 * @generated
	 */
	int SERVICE_REGISTRY = 14;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY__CLASS_NAME = SERVICE_REF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY__STATUS = SERVICE_REF__STATUS;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY__ENTRIES = SERVICE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY__INTERFACE_NAME = SERVICE_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY__NAME = SERVICE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FEATURE_COUNT = SERVICE_REF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.impl.ServiceRegistryEntryImpl <em>Service Registry Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.impl.ServiceRegistryEntryImpl
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceRegistryEntry()
	 * @generated
	 */
	int SERVICE_REGISTRY_ENTRY = 15;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY__CLASS_NAME = SERVICE_REF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY__STATUS = SERVICE_REF__STATUS;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY__INTERFACE_NAME = SERVICE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY__NAME = SERVICE_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY__VENDOR = SERVICE_REF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY__VERSION = SERVICE_REF_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service Registry Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_ENTRY_FEATURE_COUNT = SERVICE_REF_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.impl.ServiceTesterImpl <em>Service Tester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.impl.ServiceTesterImpl
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceTester()
	 * @generated
	 */
	int SERVICE_TESTER = 16;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TESTER__CLASS_NAME = SERVICE_REF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TESTER__STATUS = SERVICE_REF__STATUS;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TESTER__INTERFACE_NAME = SERVICE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Tester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TESTER_FEATURE_COUNT = SERVICE_REF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.ServiceStatus <em>Service Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.ServiceStatus
	 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceStatus()
	 * @generated
	 */
	int SERVICE_STATUS = 17;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.smeup.sys.rt.core.QApplication
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.rt.core.QApplication#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see org.smeup.sys.rt.core.QApplication#getCommands()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Commands();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.rt.core.QApplication#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.smeup.sys.rt.core.QApplication#getComponents()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Components();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.rt.core.QApplication#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.smeup.sys.rt.core.QApplication#getContext()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.rt.core.QApplication#getHooks <em>Hooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hooks</em>'.
	 * @see org.smeup.sys.rt.core.QApplication#getHooks()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Hooks();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.rt.core.QApplication#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QApplication#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.smeup.sys.rt.core.QApplication#getPort()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QApplication#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.smeup.sys.rt.core.QApplication#getText()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Text();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QApplicationComponent <em>Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Component</em>'.
	 * @see org.smeup.sys.rt.core.QApplicationComponent
	 * @generated
	 */
	EClass getApplicationComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.rt.core.QApplicationComponent#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.smeup.sys.rt.core.QApplicationComponent#getConfig()
	 * @see #getApplicationComponent()
	 * @generated
	 */
	EReference getApplicationComponent_Config();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.rt.core.QApplicationComponent#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see org.smeup.sys.rt.core.QApplicationComponent#getCommands()
	 * @see #getApplicationComponent()
	 * @generated
	 */
	EReference getApplicationComponent_Commands();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.rt.core.QApplicationComponent#getHooks <em>Hooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hooks</em>'.
	 * @see org.smeup.sys.rt.core.QApplicationComponent#getHooks()
	 * @see #getApplicationComponent()
	 * @generated
	 */
	EReference getApplicationComponent_Hooks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.rt.core.QApplicationComponent#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.smeup.sys.rt.core.QApplicationComponent#getModules()
	 * @see #getApplicationComponent()
	 * @generated
	 */
	EReference getApplicationComponent_Modules();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QApplicationComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.rt.core.QApplicationComponent#getName()
	 * @see #getApplicationComponent()
	 * @generated
	 */
	EAttribute getApplicationComponent_Name();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QApplicationModule <em>Application Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Module</em>'.
	 * @see org.smeup.sys.rt.core.QApplicationModule
	 * @generated
	 */
	EClass getApplicationModule();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QApplicationModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.rt.core.QApplicationModule#getName()
	 * @see #getApplicationModule()
	 * @generated
	 */
	EAttribute getApplicationModule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.rt.core.QApplicationModule#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.smeup.sys.rt.core.QApplicationModule#getServices()
	 * @see #getApplicationModule()
	 * @generated
	 */
	EReference getApplicationModule_Services();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QApplicationManager <em>Application Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Manager</em>'.
	 * @see org.smeup.sys.rt.core.QApplicationManager
	 * @generated
	 */
	EClass getApplicationManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QBundleManager <em>Bundle Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Manager</em>'.
	 * @see org.smeup.sys.rt.core.QBundleManager
	 * @generated
	 */
	EClass getBundleManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QBundleVisitor <em>Bundle Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Visitor</em>'.
	 * @see org.smeup.sys.rt.core.QBundleVisitor
	 * @generated
	 */
	EClass getBundleVisitor();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see org.smeup.sys.rt.core.QConfig
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.rt.core.QConfig#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see org.smeup.sys.rt.core.QConfig#getObjects()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Objects();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logger</em>'.
	 * @see org.smeup.sys.rt.core.QLogger
	 * @generated
	 */
	EClass getLogger();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QServiceCommandProvider <em>Service Command Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Command Provider</em>'.
	 * @see org.smeup.sys.rt.core.QServiceCommandProvider
	 * @generated
	 */
	EClass getServiceCommandProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QServiceCommandProvider#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.smeup.sys.rt.core.QServiceCommandProvider#getInterfaceName()
	 * @see #getServiceCommandProvider()
	 * @generated
	 */
	EAttribute getServiceCommandProvider_InterfaceName();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QServiceHook <em>Service Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Hook</em>'.
	 * @see org.smeup.sys.rt.core.QServiceHook
	 * @generated
	 */
	EClass getServiceHook();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QServiceExecutor <em>Service Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Executor</em>'.
	 * @see org.smeup.sys.rt.core.QServiceExecutor
	 * @generated
	 */
	EClass getServiceExecutor();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QServiceExecutor#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.smeup.sys.rt.core.QServiceExecutor#getInterfaceName()
	 * @see #getServiceExecutor()
	 * @generated
	 */
	EAttribute getServiceExecutor_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QServiceExecutor#isRemoteExport <em>Remote Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Export</em>'.
	 * @see org.smeup.sys.rt.core.QServiceExecutor#isRemoteExport()
	 * @see #getServiceExecutor()
	 * @generated
	 */
	EAttribute getServiceExecutor_RemoteExport();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Ref</em>'.
	 * @see org.smeup.sys.rt.core.QServiceRef
	 * @generated
	 */
	EClass getServiceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QServiceRef#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.smeup.sys.rt.core.QServiceRef#getClassName()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QServiceRef#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.smeup.sys.rt.core.QServiceRef#getStatus()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_Status();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QServiceResourceListener <em>Service Resource Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Resource Listener</em>'.
	 * @see org.smeup.sys.rt.core.QServiceResourceListener
	 * @generated
	 */
	EClass getServiceResourceListener();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QServiceResourceListener#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.smeup.sys.rt.core.QServiceResourceListener#getInterfaceName()
	 * @see #getServiceResourceListener()
	 * @generated
	 */
	EAttribute getServiceResourceListener_InterfaceName();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QServiceResourceProvider <em>Service Resource Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Resource Provider</em>'.
	 * @see org.smeup.sys.rt.core.QServiceResourceProvider
	 * @generated
	 */
	EClass getServiceResourceProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QServiceResourceProvider#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.smeup.sys.rt.core.QServiceResourceProvider#getInterfaceName()
	 * @see #getServiceResourceProvider()
	 * @generated
	 */
	EAttribute getServiceResourceProvider_InterfaceName();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QServiceRegistry <em>Service Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Registry</em>'.
	 * @see org.smeup.sys.rt.core.QServiceRegistry
	 * @generated
	 */
	EClass getServiceRegistry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.rt.core.QServiceRegistry#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.smeup.sys.rt.core.QServiceRegistry#getEntries()
	 * @see #getServiceRegistry()
	 * @generated
	 */
	EReference getServiceRegistry_Entries();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QServiceRegistry#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.smeup.sys.rt.core.QServiceRegistry#getInterfaceName()
	 * @see #getServiceRegistry()
	 * @generated
	 */
	EAttribute getServiceRegistry_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QServiceRegistry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.rt.core.QServiceRegistry#getName()
	 * @see #getServiceRegistry()
	 * @generated
	 */
	EAttribute getServiceRegistry_Name();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QServiceRegistryEntry <em>Service Registry Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Registry Entry</em>'.
	 * @see org.smeup.sys.rt.core.QServiceRegistryEntry
	 * @generated
	 */
	EClass getServiceRegistryEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QServiceRegistryEntry#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.smeup.sys.rt.core.QServiceRegistryEntry#getInterfaceName()
	 * @see #getServiceRegistryEntry()
	 * @generated
	 */
	EAttribute getServiceRegistryEntry_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QServiceRegistryEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.rt.core.QServiceRegistryEntry#getName()
	 * @see #getServiceRegistryEntry()
	 * @generated
	 */
	EAttribute getServiceRegistryEntry_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QServiceRegistryEntry#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.smeup.sys.rt.core.QServiceRegistryEntry#getVendor()
	 * @see #getServiceRegistryEntry()
	 * @generated
	 */
	EAttribute getServiceRegistryEntry_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QServiceRegistryEntry#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.smeup.sys.rt.core.QServiceRegistryEntry#getVersion()
	 * @see #getServiceRegistryEntry()
	 * @generated
	 */
	EAttribute getServiceRegistryEntry_Version();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.QServiceTester <em>Service Tester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Tester</em>'.
	 * @see org.smeup.sys.rt.core.QServiceTester
	 * @generated
	 */
	EClass getServiceTester();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.core.QServiceTester#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.smeup.sys.rt.core.QServiceTester#getInterfaceName()
	 * @see #getServiceTester()
	 * @generated
	 */
	EAttribute getServiceTester_InterfaceName();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.rt.core.ServiceStatus <em>Service Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Status</em>'.
	 * @see org.smeup.sys.rt.core.ServiceStatus
	 * @generated
	 */
	EEnum getServiceStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QRuntimeCoreFactory getRuntimeCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.impl.ApplicationImpl
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__COMMANDS = eINSTANCE.getApplication_Commands();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__COMPONENTS = eINSTANCE.getApplication_Components();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CONTEXT = eINSTANCE.getApplication_Context();

		/**
		 * The meta object literal for the '<em><b>Hooks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HOOKS = eINSTANCE.getApplication_Hooks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__PORT = eINSTANCE.getApplication_Port();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__TEXT = eINSTANCE.getApplication_Text();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.impl.ApplicationComponentImpl <em>Application Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.impl.ApplicationComponentImpl
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getApplicationComponent()
		 * @generated
		 */
		EClass APPLICATION_COMPONENT = eINSTANCE.getApplicationComponent();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_COMPONENT__CONFIG = eINSTANCE.getApplicationComponent_Config();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_COMPONENT__COMMANDS = eINSTANCE.getApplicationComponent_Commands();

		/**
		 * The meta object literal for the '<em><b>Hooks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_COMPONENT__HOOKS = eINSTANCE.getApplicationComponent_Hooks();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_COMPONENT__MODULES = eINSTANCE.getApplicationComponent_Modules();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_COMPONENT__NAME = eINSTANCE.getApplicationComponent_Name();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.impl.ApplicationModuleImpl <em>Application Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.impl.ApplicationModuleImpl
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getApplicationModule()
		 * @generated
		 */
		EClass APPLICATION_MODULE = eINSTANCE.getApplicationModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_MODULE__NAME = eINSTANCE.getApplicationModule_Name();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_MODULE__SERVICES = eINSTANCE.getApplicationModule_Services();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.QApplicationManager <em>Application Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.QApplicationManager
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getApplicationManager()
		 * @generated
		 */
		EClass APPLICATION_MANAGER = eINSTANCE.getApplicationManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.QBundleManager <em>Bundle Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.QBundleManager
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getBundleManager()
		 * @generated
		 */
		EClass BUNDLE_MANAGER = eINSTANCE.getBundleManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.impl.BundleVisitorImpl <em>Bundle Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.impl.BundleVisitorImpl
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getBundleVisitor()
		 * @generated
		 */
		EClass BUNDLE_VISITOR = eINSTANCE.getBundleVisitor();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.impl.ConfigImpl
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__OBJECTS = eINSTANCE.getConfig_Objects();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.QLogger <em>Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.QLogger
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getLogger()
		 * @generated
		 */
		EClass LOGGER = eINSTANCE.getLogger();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.impl.ServiceCommandProviderImpl <em>Service Command Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.impl.ServiceCommandProviderImpl
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceCommandProvider()
		 * @generated
		 */
		EClass SERVICE_COMMAND_PROVIDER = eINSTANCE.getServiceCommandProvider();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMMAND_PROVIDER__INTERFACE_NAME = eINSTANCE.getServiceCommandProvider_InterfaceName();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.impl.ServiceHookImpl <em>Service Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.impl.ServiceHookImpl
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceHook()
		 * @generated
		 */
		EClass SERVICE_HOOK = eINSTANCE.getServiceHook();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.impl.ServiceExecutorImpl <em>Service Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.impl.ServiceExecutorImpl
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceExecutor()
		 * @generated
		 */
		EClass SERVICE_EXECUTOR = eINSTANCE.getServiceExecutor();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_EXECUTOR__INTERFACE_NAME = eINSTANCE.getServiceExecutor_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Remote Export</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_EXECUTOR__REMOTE_EXPORT = eINSTANCE.getServiceExecutor_RemoteExport();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.impl.ServiceRefImpl <em>Service Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.impl.ServiceRefImpl
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceRef()
		 * @generated
		 */
		EClass SERVICE_REF = eINSTANCE.getServiceRef();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF__CLASS_NAME = eINSTANCE.getServiceRef_ClassName();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF__STATUS = eINSTANCE.getServiceRef_Status();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.impl.ServiceResourceListenerImpl <em>Service Resource Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.impl.ServiceResourceListenerImpl
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceResourceListener()
		 * @generated
		 */
		EClass SERVICE_RESOURCE_LISTENER = eINSTANCE.getServiceResourceListener();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_RESOURCE_LISTENER__INTERFACE_NAME = eINSTANCE.getServiceResourceListener_InterfaceName();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.impl.ServiceResourceProviderImpl <em>Service Resource Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.impl.ServiceResourceProviderImpl
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceResourceProvider()
		 * @generated
		 */
		EClass SERVICE_RESOURCE_PROVIDER = eINSTANCE.getServiceResourceProvider();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_RESOURCE_PROVIDER__INTERFACE_NAME = eINSTANCE.getServiceResourceProvider_InterfaceName();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.impl.ServiceRegistryImpl <em>Service Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.impl.ServiceRegistryImpl
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceRegistry()
		 * @generated
		 */
		EClass SERVICE_REGISTRY = eINSTANCE.getServiceRegistry();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REGISTRY__ENTRIES = eINSTANCE.getServiceRegistry_Entries();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY__INTERFACE_NAME = eINSTANCE.getServiceRegistry_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY__NAME = eINSTANCE.getServiceRegistry_Name();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.impl.ServiceRegistryEntryImpl <em>Service Registry Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.impl.ServiceRegistryEntryImpl
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceRegistryEntry()
		 * @generated
		 */
		EClass SERVICE_REGISTRY_ENTRY = eINSTANCE.getServiceRegistryEntry();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_ENTRY__INTERFACE_NAME = eINSTANCE.getServiceRegistryEntry_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_ENTRY__NAME = eINSTANCE.getServiceRegistryEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_ENTRY__VENDOR = eINSTANCE.getServiceRegistryEntry_Vendor();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_ENTRY__VERSION = eINSTANCE.getServiceRegistryEntry_Version();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.impl.ServiceTesterImpl <em>Service Tester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.impl.ServiceTesterImpl
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceTester()
		 * @generated
		 */
		EClass SERVICE_TESTER = eINSTANCE.getServiceTester();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TESTER__INTERFACE_NAME = eINSTANCE.getServiceTester_InterfaceName();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.ServiceStatus <em>Service Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.ServiceStatus
		 * @see org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl#getServiceStatus()
		 * @generated
		 */
		EEnum SERVICE_STATUS = eINSTANCE.getServiceStatus();

	}

} //QFrameworkCorePackage
