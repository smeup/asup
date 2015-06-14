/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.resources;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.smeup.sys.os.core.resources.QOperatingSystemResourcesFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemResourcesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resources";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/core/resources";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-core-resources";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QOperatingSystemResourcesPackage eINSTANCE = org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.resources.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.resources.impl.ResourceImpl
	 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Job</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE__JOB = 0;

	/**
	 * The feature id for the '<em><b>Notifier</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NOTIFIER = 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.resources.impl.ResourceEventImpl <em>Resource Event</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.core.resources.impl.ResourceEventImpl
	 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceEvent()
	 * @generated
	 */
	int RESOURCE_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT__RESOURCE = 2;

	/**
	 * The number of structural features of the '<em>Resource Event</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.resources.QResourceProvider <em>Resource Provider</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.core.resources.QResourceProvider
	 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceProvider()
	 * @generated
	 */
	int RESOURCE_PROVIDER = 5;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.resources.QResourceManager <em>Resource Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.resources.QResourceManager
	 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceManager()
	 * @generated
	 */
	int RESOURCE_MANAGER = 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.resources.QResourceListener <em>Resource Listener</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.core.resources.QResourceListener
	 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceListener()
	 * @generated
	 */
	int RESOURCE_LISTENER = 2;

	/**
	 * The number of structural features of the '<em>Resource Listener</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Resource Provider</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Resource Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER_FEATURE_COUNT = RESOURCE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.resources.impl.ResourceNotifierImpl <em>Resource Notifier</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.core.resources.impl.ResourceNotifierImpl
	 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceNotifier()
	 * @generated
	 */
	int RESOURCE_NOTIFIER = 4;

	/**
	 * The number of structural features of the '<em>Resource Notifier</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_NOTIFIER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.resources.impl.ResourceReaderImpl <em>Resource Reader</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.core.resources.impl.ResourceReaderImpl
	 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceReader()
	 * @generated
	 */
	int RESOURCE_READER = 6;

	/**
	 * The feature id for the '<em><b>Job</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER__JOB = RESOURCE__JOB;

	/**
	 * The feature id for the '<em><b>Notifier</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER__NOTIFIER = RESOURCE__NOTIFIER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER__CONTAINER = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Reader</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_READER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.resources.impl.ResourceSetReaderImpl <em>Resource Set Reader</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.core.resources.impl.ResourceSetReaderImpl
	 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceSetReader()
	 * @generated
	 */
	int RESOURCE_SET_READER = 7;

	/**
	 * The feature id for the '<em><b>Job</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SET_READER__JOB = RESOURCE_READER__JOB;

	/**
	 * The feature id for the '<em><b>Notifier</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SET_READER__NOTIFIER = RESOURCE_READER__NOTIFIER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SET_READER__CONTAINER = RESOURCE_READER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SET_READER__CONTAINERS = RESOURCE_READER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Set Reader</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SET_READER_FEATURE_COUNT = RESOURCE_READER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.resources.impl.ResourceWriterImpl <em>Resource Writer</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.core.resources.impl.ResourceWriterImpl
	 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceWriter()
	 * @generated
	 */
	int RESOURCE_WRITER = 8;

	/**
	 * The feature id for the '<em><b>Job</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER__JOB = RESOURCE_READER__JOB;

	/**
	 * The feature id for the '<em><b>Notifier</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER__NOTIFIER = RESOURCE_READER__NOTIFIER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER__CONTAINER = RESOURCE_READER__CONTAINER;

	/**
	 * The number of structural features of the '<em>Resource Writer</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_WRITER_FEATURE_COUNT = RESOURCE_READER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.resources.ResourceEventType <em>Resource Event Type</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.core.resources.ResourceEventType
	 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceEventType()
	 * @generated
	 */
	int RESOURCE_EVENT_TYPE = 9;

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.core.resources.QResource <em>Resource</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.smeup.sys.os.core.resources.QResource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.smeup.sys.os.core.resources.QResource#getJob <em>Job</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Job</em>'.
	 * @see org.smeup.sys.os.core.resources.QResource#getJob()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Job();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.os.core.resources.QResource#getNotifier <em>Notifier</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notifier</em>'.
	 * @see org.smeup.sys.os.core.resources.QResource#getNotifier()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Notifier();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.resources.QResourceEvent <em>Resource Event</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Event</em>'.
	 * @see org.smeup.sys.os.core.resources.QResourceEvent
	 * @generated
	 */
	EClass getResourceEvent();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.os.core.resources.QResourceEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.smeup.sys.os.core.resources.QResourceEvent#getSource()
	 * @see #getResourceEvent()
	 * @generated
	 */
	EReference getResourceEvent_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.resources.QResourceEvent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.smeup.sys.os.core.resources.QResourceEvent#getType()
	 * @see #getResourceEvent()
	 * @generated
	 */
	EAttribute getResourceEvent_Type();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.os.core.resources.QResourceEvent#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see org.smeup.sys.os.core.resources.QResourceEvent#getResource()
	 * @see #getResourceEvent()
	 * @generated
	 */
	EReference getResourceEvent_Resource();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.resources.QResourceManager <em>Resource Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Manager</em>'.
	 * @see org.smeup.sys.os.core.resources.QResourceManager
	 * @generated
	 */
	EClass getResourceManager();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.core.resources.QResourceListener
	 * <em>Resource Listener</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Resource Listener</em>'.
	 * @see org.smeup.sys.os.core.resources.QResourceListener
	 * @generated
	 */
	EClass getResourceListener();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.core.resources.QResourceNotifier
	 * <em>Resource Notifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Resource Notifier</em>'.
	 * @see org.smeup.sys.os.core.resources.QResourceNotifier
	 * @generated
	 */
	EClass getResourceNotifier();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.core.resources.QResourceProvider
	 * <em>Resource Provider</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Resource Provider</em>'.
	 * @see org.smeup.sys.os.core.resources.QResourceProvider
	 * @generated
	 */
	EClass getResourceProvider();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.resources.QResourceReader <em>Resource Reader</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Reader</em>'.
	 * @see org.smeup.sys.os.core.resources.QResourceReader
	 * @generated
	 */
	EClass getResourceReader();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.resources.QResourceReader#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see org.smeup.sys.os.core.resources.QResourceReader#getContainer()
	 * @see #getResourceReader()
	 * @generated
	 */
	EAttribute getResourceReader_Container();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.core.resources.QResourceSetReader
	 * <em>Resource Set Reader</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Resource Set Reader</em>'.
	 * @see org.smeup.sys.os.core.resources.QResourceSetReader
	 * @generated
	 */
	EClass getResourceSetReader();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.os.core.resources.QResourceSetReader#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Containers</em>'.
	 * @see org.smeup.sys.os.core.resources.QResourceSetReader#getContainers()
	 * @see #getResourceSetReader()
	 * @generated
	 */
	EAttribute getResourceSetReader_Containers();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.resources.QResourceWriter <em>Resource Writer</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Writer</em>'.
	 * @see org.smeup.sys.os.core.resources.QResourceWriter
	 * @generated
	 */
	EClass getResourceWriter();

	/**
	 * Returns the meta object for enum '
	 * {@link org.smeup.sys.os.core.resources.ResourceEventType
	 * <em>Resource Event Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for enum '<em>Resource Event Type</em>'.
	 * @see org.smeup.sys.os.core.resources.ResourceEventType
	 * @generated
	 */
	EEnum getResourceEventType();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemResourcesFactory getOperatingSystemResourcesFactory();

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
		 * The meta object literal for the '
		 * {@link org.smeup.sys.os.core.resources.impl.ResourceImpl
		 * <em>Resource</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see org.smeup.sys.os.core.resources.impl.ResourceImpl
		 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__JOB = eINSTANCE.getResource_Job();

		/**
		 * The meta object literal for the '<em><b>Notifier</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__NOTIFIER = eINSTANCE.getResource_Notifier();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.resources.impl.ResourceEventImpl <em>Resource Event</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.core.resources.impl.ResourceEventImpl
		 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceEvent()
		 * @generated
		 */
		EClass RESOURCE_EVENT = eINSTANCE.getResourceEvent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_EVENT__SOURCE = eINSTANCE.getResourceEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_EVENT__TYPE = eINSTANCE.getResourceEvent_Type();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_EVENT__RESOURCE = eINSTANCE.getResourceEvent_Resource();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.resources.QResourceManager <em>Resource Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.resources.QResourceManager
		 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceManager()
		 * @generated
		 */
		EClass RESOURCE_MANAGER = eINSTANCE.getResourceManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.resources.QResourceListener <em>Resource Listener</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.core.resources.QResourceListener
		 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceListener()
		 * @generated
		 */
		EClass RESOURCE_LISTENER = eINSTANCE.getResourceListener();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.resources.impl.ResourceNotifierImpl <em>Resource Notifier</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.core.resources.impl.ResourceNotifierImpl
		 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceNotifier()
		 * @generated
		 */
		EClass RESOURCE_NOTIFIER = eINSTANCE.getResourceNotifier();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.resources.QResourceProvider <em>Resource Provider</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.core.resources.QResourceProvider
		 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceProvider()
		 * @generated
		 */
		EClass RESOURCE_PROVIDER = eINSTANCE.getResourceProvider();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.resources.impl.ResourceReaderImpl <em>Resource Reader</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.core.resources.impl.ResourceReaderImpl
		 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceReader()
		 * @generated
		 */
		EClass RESOURCE_READER = eINSTANCE.getResourceReader();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_READER__CONTAINER = eINSTANCE.getResourceReader_Container();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.resources.impl.ResourceSetReaderImpl <em>Resource Set Reader</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.core.resources.impl.ResourceSetReaderImpl
		 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceSetReader()
		 * @generated
		 */
		EClass RESOURCE_SET_READER = eINSTANCE.getResourceSetReader();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_SET_READER__CONTAINERS = eINSTANCE.getResourceSetReader_Containers();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.resources.impl.ResourceWriterImpl <em>Resource Writer</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.core.resources.impl.ResourceWriterImpl
		 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceWriter()
		 * @generated
		 */
		EClass RESOURCE_WRITER = eINSTANCE.getResourceWriter();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.resources.ResourceEventType <em>Resource Event Type</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.core.resources.ResourceEventType
		 * @see org.smeup.sys.os.core.resources.impl.OperatingSystemResourcesPackageImpl#getResourceEventType()
		 * @generated
		 */
		EEnum RESOURCE_EVENT_TYPE = eINSTANCE.getResourceEventType();

	}

} // OSCoreResourcePackage
