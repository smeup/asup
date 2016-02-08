/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.ctx;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

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
 * @see org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageCoreCtxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ctx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/il/core/ctx";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-core-ctx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageCoreCtxPackage eINSTANCE = org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.ctx.QAdapterFactory <em>Adapter Factory</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.ctx.QAdapterFactory
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getAdapterFactory()
	 * @generated
	 */
	int ADAPTER_FACTORY = 0;

	/**
	 * The number of structural features of the '<em>Adapter Factory</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.ctx.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.ctx.impl.ContextImpl
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.ctx.QContextDescription <em>Context Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.ctx.QContextDescription
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getContextDescription()
	 * @generated
	 */
	int CONTEXT_DESCRIPTION = 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.ctx.QContextProvider <em>Context Provider</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.ctx.QContextProvider
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getContextProvider()
	 * @generated
	 */
	int CONTEXT_PROVIDER = 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.ctx.QCapability <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.ctx.QCapability
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 1;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Context Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Context Provider</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.ctx.QPluginRegistry <em>Plugin Registry</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.ctx.QPluginRegistry
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getPluginRegistry()
	 * @generated
	 */
	int PLUGIN_REGISTRY = 5;

	/**
	 * The number of structural features of the '<em>Plugin Registry</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_REGISTRY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.ctx.QPluginRegistryFactory <em>Plugin Registry Factory</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.ctx.QPluginRegistryFactory
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getPluginRegistryFactory()
	 * @generated
	 */
	int PLUGIN_REGISTRY_FACTORY = 6;

	/**
	 * The number of structural features of the '<em>Plugin Registry Factory</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_REGISTRY_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.ctx.QIdentity <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.ctx.QIdentity
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getIdentity()
	 * @generated
	 */
	int IDENTITY = 7;

	/**
	 * The number of structural features of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.ctx.ContextInjectionStrategy <em>Context Injection Strategy</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.ctx.ContextInjectionStrategy
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getContextInjectionStrategy()
	 * @generated
	 */
	int CONTEXT_INJECTION_STRATEGY = 8;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.ctx.QAdapterFactory <em>Adapter Factory</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter Factory</em>'.
	 * @see org.smeup.sys.il.core.ctx.QAdapterFactory
	 * @generated
	 */
	EClass getAdapterFactory();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.ctx.QContext <em>Context</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.smeup.sys.il.core.ctx.QContext
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.ctx.QContextDescription <em>Context Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Description</em>'.
	 * @see org.smeup.sys.il.core.ctx.QContextDescription
	 * @generated
	 */
	EClass getContextDescription();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.ctx.QContextProvider
	 * <em>Context Provider</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Context Provider</em>'.
	 * @see org.smeup.sys.il.core.ctx.QContextProvider
	 * @generated
	 */
	EClass getContextProvider();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.ctx.QCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see org.smeup.sys.il.core.ctx.QCapability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.ctx.QPluginRegistry <em>Plugin Registry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Registry</em>'.
	 * @see org.smeup.sys.il.core.ctx.QPluginRegistry
	 * @generated
	 */
	EClass getPluginRegistry();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.ctx.QPluginRegistryFactory <em>Plugin Registry Factory</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Plugin Registry Factory</em>'.
	 * @see org.smeup.sys.il.core.ctx.QPluginRegistryFactory
	 * @generated
	 */
	EClass getPluginRegistryFactory();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.ctx.QIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see org.smeup.sys.il.core.ctx.QIdentity
	 * @generated
	 */
	EClass getIdentity();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.il.core.ctx.ContextInjectionStrategy <em>Context Injection Strategy</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Context Injection Strategy</em>'.
	 * @see org.smeup.sys.il.core.ctx.ContextInjectionStrategy
	 * @generated
	 */
	EEnum getContextInjectionStrategy();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageCoreCtxFactory getIntegratedLanguageCoreCtxFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.il.core.ctx.QAdapterFactory <em>Adapter Factory</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.ctx.QAdapterFactory
		 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getAdapterFactory()
		 * @generated
		 */
		EClass ADAPTER_FACTORY = eINSTANCE.getAdapterFactory();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.ctx.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.ctx.impl.ContextImpl
		 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.ctx.QContextDescription <em>Context Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.ctx.QContextDescription
		 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getContextDescription()
		 * @generated
		 */
		EClass CONTEXT_DESCRIPTION = eINSTANCE.getContextDescription();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.ctx.QContextProvider <em>Context Provider</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.ctx.QContextProvider
		 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getContextProvider()
		 * @generated
		 */
		EClass CONTEXT_PROVIDER = eINSTANCE.getContextProvider();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.ctx.QCapability <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.ctx.QCapability
		 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.ctx.QPluginRegistry <em>Plugin Registry</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.ctx.QPluginRegistry
		 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getPluginRegistry()
		 * @generated
		 */
		EClass PLUGIN_REGISTRY = eINSTANCE.getPluginRegistry();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.ctx.QPluginRegistryFactory <em>Plugin Registry Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.ctx.QPluginRegistryFactory
		 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getPluginRegistryFactory()
		 * @generated
		 */
		EClass PLUGIN_REGISTRY_FACTORY = eINSTANCE.getPluginRegistryFactory();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.ctx.QIdentity <em>Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.ctx.QIdentity
		 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getIdentity()
		 * @generated
		 */
		EClass IDENTITY = eINSTANCE.getIdentity();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.ctx.ContextInjectionStrategy <em>Context Injection Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.ctx.ContextInjectionStrategy
		 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getContextInjectionStrategy()
		 * @generated
		 */
		EEnum CONTEXT_INJECTION_STRATEGY = eINSTANCE.getContextInjectionStrategy();

	}

} // QIntegratedLanguageCoreCtxPackage
