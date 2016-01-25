/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.memo;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.il.memo.QIntegratedLanguageMemoryFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageMemoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "memo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/il/memo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-memo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageMemoryPackage eINSTANCE = org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.memo.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.memo.impl.ResourceImpl
	 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Context Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTEXT_PROVIDER = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NOTIFIER = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.memo.QResourceEvent <em>Resource Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.memo.QResourceEvent
	 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResourceEvent()
	 * @generated
	 */
	int RESOURCE_EVENT = 1;

	/**
	 * The number of structural features of the '<em>Resource Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.memo.QResourceListener <em>Resource Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.memo.QResourceListener
	 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResourceListener()
	 * @generated
	 */
	int RESOURCE_LISTENER = 2;

	/**
	 * The number of structural features of the '<em>Resource Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.memo.QResourceProvider <em>Resource Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.memo.QResourceProvider
	 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResourceProvider()
	 * @generated
	 */
	int RESOURCE_PROVIDER = 5;

	/**
	 * The number of structural features of the '<em>Resource Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.memo.QResourceManager <em>Resource Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.memo.QResourceManager
	 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResourceManager()
	 * @generated
	 */
	int RESOURCE_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>Resource Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER_FEATURE_COUNT = RESOURCE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.memo.impl.ResourceNotifierImpl <em>Resource Notifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.memo.impl.ResourceNotifierImpl
	 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResourceNotifier()
	 * @generated
	 */
	int RESOURCE_NOTIFIER = 4;

	/**
	 * The number of structural features of the '<em>Resource Notifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_NOTIFIER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.memo.impl.ResourceReaderImpl <em>Resource Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.memo.impl.ResourceReaderImpl
	 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResourceReader()
	 * @generated
	 */
	int RESOURCE_READER = 6;

	/**
	 * The feature id for the '<em><b>Context Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER__CONTEXT_PROVIDER = RESOURCE__CONTEXT_PROVIDER;

	/**
	 * The feature id for the '<em><b>Notifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER__NOTIFIER = RESOURCE__NOTIFIER;

	/**
	 * The number of structural features of the '<em>Resource Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.memo.QResourceWriter <em>Resource Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.memo.QResourceWriter
	 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResourceWriter()
	 * @generated
	 */
	int RESOURCE_WRITER = 7;

	/**
	 * The feature id for the '<em><b>Context Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER__CONTEXT_PROVIDER = RESOURCE_READER__CONTEXT_PROVIDER;

	/**
	 * The feature id for the '<em><b>Notifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER__NOTIFIER = RESOURCE_READER__NOTIFIER;

	/**
	 * The number of structural features of the '<em>Resource Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER_FEATURE_COUNT = RESOURCE_READER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.memo.ResourceEventType <em>Resource Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.memo.ResourceEventType
	 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResourceEventType()
	 * @generated
	 */
	int RESOURCE_EVENT_TYPE = 8;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.memo.Scope <em>Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.memo.Scope
	 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 9;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.memo.QResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.smeup.sys.il.memo.QResource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.il.memo.QResource#getContextProvider <em>Context Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Provider</em>'.
	 * @see org.smeup.sys.il.memo.QResource#getContextProvider()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ContextProvider();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.il.memo.QResource#getNotifier <em>Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notifier</em>'.
	 * @see org.smeup.sys.il.memo.QResource#getNotifier()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Notifier();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.memo.QResourceEvent <em>Resource Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Event</em>'.
	 * @see org.smeup.sys.il.memo.QResourceEvent
	 * @generated
	 */
	EClass getResourceEvent();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.memo.QResourceListener <em>Resource Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Listener</em>'.
	 * @see org.smeup.sys.il.memo.QResourceListener
	 * @generated
	 */
	EClass getResourceListener();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.memo.QResourceManager <em>Resource Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Manager</em>'.
	 * @see org.smeup.sys.il.memo.QResourceManager
	 * @generated
	 */
	EClass getResourceManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.memo.QResourceNotifier <em>Resource Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Notifier</em>'.
	 * @see org.smeup.sys.il.memo.QResourceNotifier
	 * @generated
	 */
	EClass getResourceNotifier();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.memo.QResourceProvider <em>Resource Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Provider</em>'.
	 * @see org.smeup.sys.il.memo.QResourceProvider
	 * @generated
	 */
	EClass getResourceProvider();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.memo.QResourceReader <em>Resource Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Reader</em>'.
	 * @see org.smeup.sys.il.memo.QResourceReader
	 * @generated
	 */
	EClass getResourceReader();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.memo.QResourceWriter <em>Resource Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Writer</em>'.
	 * @see org.smeup.sys.il.memo.QResourceWriter
	 * @generated
	 */
	EClass getResourceWriter();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.il.memo.ResourceEventType <em>Resource Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Event Type</em>'.
	 * @see org.smeup.sys.il.memo.ResourceEventType
	 * @generated
	 */
	EEnum getResourceEventType();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.il.memo.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope</em>'.
	 * @see org.smeup.sys.il.memo.Scope
	 * @generated
	 */
	EEnum getScope();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageMemoryFactory getIntegratedLanguageMemoryFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.il.memo.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.memo.impl.ResourceImpl
		 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();
		/**
		 * The meta object literal for the '<em><b>Context Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__CONTEXT_PROVIDER = eINSTANCE.getResource_ContextProvider();
		/**
		 * The meta object literal for the '<em><b>Notifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__NOTIFIER = eINSTANCE.getResource_Notifier();
		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.memo.QResourceEvent <em>Resource Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.memo.QResourceEvent
		 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResourceEvent()
		 * @generated
		 */
		EClass RESOURCE_EVENT = eINSTANCE.getResourceEvent();
		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.memo.QResourceListener <em>Resource Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.memo.QResourceListener
		 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResourceListener()
		 * @generated
		 */
		EClass RESOURCE_LISTENER = eINSTANCE.getResourceListener();
		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.memo.QResourceManager <em>Resource Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.memo.QResourceManager
		 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResourceManager()
		 * @generated
		 */
		EClass RESOURCE_MANAGER = eINSTANCE.getResourceManager();
		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.memo.impl.ResourceNotifierImpl <em>Resource Notifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.memo.impl.ResourceNotifierImpl
		 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResourceNotifier()
		 * @generated
		 */
		EClass RESOURCE_NOTIFIER = eINSTANCE.getResourceNotifier();
		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.memo.QResourceProvider <em>Resource Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.memo.QResourceProvider
		 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResourceProvider()
		 * @generated
		 */
		EClass RESOURCE_PROVIDER = eINSTANCE.getResourceProvider();
		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.memo.impl.ResourceReaderImpl <em>Resource Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.memo.impl.ResourceReaderImpl
		 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResourceReader()
		 * @generated
		 */
		EClass RESOURCE_READER = eINSTANCE.getResourceReader();
		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.memo.QResourceWriter <em>Resource Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.memo.QResourceWriter
		 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResourceWriter()
		 * @generated
		 */
		EClass RESOURCE_WRITER = eINSTANCE.getResourceWriter();
		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.memo.ResourceEventType <em>Resource Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.memo.ResourceEventType
		 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getResourceEventType()
		 * @generated
		 */
		EEnum RESOURCE_EVENT_TYPE = eINSTANCE.getResourceEventType();
		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.memo.Scope <em>Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.memo.Scope
		 * @see org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryPackageImpl#getScope()
		 * @generated
		 */
		EEnum SCOPE = eINSTANCE.getScope();

	}

} //QIntegratedLanguageMemoryPackage
