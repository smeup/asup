/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
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
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;

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
	 * The meta object id for the '{@link org.smeup.sys.il.core.ctx.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.ctx.impl.CapabilityImpl
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 1;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__RIGHTS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__OBJECT_URI = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Context</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = QMachineInterfaceCorePackage.JAVA_CLOSEABLE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link org.smeup.sys.il.core.ctx.impl.IdentityImpl <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.ctx.impl.IdentityImpl
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getIdentity()
	 * @generated
	 */
	int IDENTITY = 5;

	/**
	 * The number of structural features of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.ctx.CapabilityRight <em>Capability Right</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.ctx.CapabilityRight
	 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getCapabilityRight()
	 * @generated
	 */
	int CAPABILITY_RIGHT = 6;

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
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.il.core.ctx.QCapability#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rights</em>'.
	 * @see org.smeup.sys.il.core.ctx.QCapability#getRights()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Rights();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.ctx.QCapability#getObjectURI <em>Object URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object URI</em>'.
	 * @see org.smeup.sys.il.core.ctx.QCapability#getObjectURI()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_ObjectURI();

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
	 * Returns the meta object for enum '{@link org.smeup.sys.il.core.ctx.CapabilityRight <em>Capability Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Capability Right</em>'.
	 * @see org.smeup.sys.il.core.ctx.CapabilityRight
	 * @generated
	 */
	EEnum getCapabilityRight();

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
		 * The meta object literal for the '{@link org.smeup.sys.il.core.ctx.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.ctx.impl.CapabilityImpl
		 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__RIGHTS = eINSTANCE.getCapability_Rights();

		/**
		 * The meta object literal for the '<em><b>Object URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__OBJECT_URI = eINSTANCE.getCapability_ObjectURI();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.ctx.impl.IdentityImpl <em>Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.ctx.impl.IdentityImpl
		 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getIdentity()
		 * @generated
		 */
		EClass IDENTITY = eINSTANCE.getIdentity();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.ctx.CapabilityRight <em>Capability Right</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.ctx.CapabilityRight
		 * @see org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl#getCapabilityRight()
		 * @generated
		 */
		EEnum CAPABILITY_RIGHT = eINSTANCE.getCapabilityRight();

	}

} // QIntegratedLanguageCoreCtxPackage
