/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.ctx;

import org.eclipse.emf.ecore.EAttribute;
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
	int CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.ctx.QContextProvider <em>Context Provider</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.ctx.QContextProvider
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getContextProvider()
	 * @generated
	 */
	int CONTEXT_PROVIDER = 2;

	/**
	 * The number of structural features of the '<em>Context Provider</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.core.ctx.impl.CredentialsImpl
	 * <em>Credentials</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.core.ctx.impl.CredentialsImpl
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getCredentials()
	 * @generated
	 */
	int CREDENTIALS = 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__USER = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__PASSWORD = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Credentials</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.ctx.QPluginRegistry <em>Plugin Registry</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.ctx.QPluginRegistry
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getPluginRegistry()
	 * @generated
	 */
	int PLUGIN_REGISTRY = 4;

	/**
	 * The number of structural features of the '<em>Plugin Registry</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_REGISTRY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.ctx.QPluginRegistryFactory <em>Plugin Registry Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.ctx.QPluginRegistryFactory
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getPluginRegistryFactory()
	 * @generated
	 */
	int PLUGIN_REGISTRY_FACTORY = 5;

	/**
	 * The number of structural features of the '<em>Plugin Registry Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_REGISTRY_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.ctx.ContextInjectionStrategy <em>Context Injection Strategy</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.ctx.ContextInjectionStrategy
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getContextInjectionStrategy()
	 * @generated
	 */
	int CONTEXT_INJECTION_STRATEGY = 6;

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
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.ctx.QCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credentials</em>'.
	 * @see org.smeup.sys.il.core.ctx.QCredentials
	 * @generated
	 */
	EClass getCredentials();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.ctx.QCredentials#getUser <em>User</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.smeup.sys.il.core.ctx.QCredentials#getUser()
	 * @see #getCredentials()
	 * @generated
	 */
	EAttribute getCredentials_User();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.ctx.QCredentials#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.smeup.sys.il.core.ctx.QCredentials#getPassword()
	 * @see #getCredentials()
	 * @generated
	 */
	EAttribute getCredentials_Password();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Registry Factory</em>'.
	 * @see org.smeup.sys.il.core.ctx.QPluginRegistryFactory
	 * @generated
	 */
	EClass getPluginRegistryFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.il.core.ctx.QContextProvider <em>Context Provider</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.ctx.QContextProvider
		 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getContextProvider()
		 * @generated
		 */
		EClass CONTEXT_PROVIDER = eINSTANCE.getContextProvider();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.ctx.impl.CredentialsImpl <em>Credentials</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.ctx.impl.CredentialsImpl
		 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getCredentials()
		 * @generated
		 */
		EClass CREDENTIALS = eINSTANCE.getCredentials();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIALS__USER = eINSTANCE.getCredentials_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIALS__PASSWORD = eINSTANCE.getCredentials_Password();

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
