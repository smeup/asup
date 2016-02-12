/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.dtaq;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;

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
 * @see org.smeup.sys.os.dtaq.QOperatingSystemDataQueueFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemDataQueuePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dtaq";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/dtaq";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-dtaq";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QOperatingSystemDataQueuePackage eINSTANCE = org.smeup.sys.os.dtaq.impl.OperatingSystemDataQueuePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.dtaq.impl.DataQueueImpl <em>Data Queue</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.os.dtaq.impl.DataQueueImpl
	 * @see org.smeup.sys.os.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueue()
	 * @generated
	 */
	int DATA_QUEUE = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__FACETS = QOperatingSystemTypePackage.TYPED_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Data Queue Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__DATA_QUEUE_TYPE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Length</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__KEY_LENGTH = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Entry Length</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__MAX_ENTRY_LENGTH = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sender Info</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__SENDER_INFO = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__CONTENT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Queue</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.dtaq.impl.DataQueueContentImpl <em>Data Queue Content</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.dtaq.impl.DataQueueContentImpl
	 * @see org.smeup.sys.os.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueContent()
	 * @generated
	 */
	int DATA_QUEUE_CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_CONTENT__ENTRIES = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Queue Content</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_CONTENT_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.dtaq.impl.DataQueueEntryImpl <em>Data Queue Entry</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.dtaq.impl.DataQueueEntryImpl
	 * @see org.smeup.sys.os.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueEntry()
	 * @generated
	 */
	int DATA_QUEUE_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_ENTRY__KEY = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_ENTRY__VALUE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Queue Entry</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_ENTRY_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.dtaq.QDataQueueManager <em>Data Queue Manager</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.dtaq.QDataQueueManager
	 * @see org.smeup.sys.os.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueManager()
	 * @generated
	 */
	int DATA_QUEUE_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>Data Queue Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.dtaq.DataQueueType <em>Data Queue Type</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.dtaq.DataQueueType
	 * @see org.smeup.sys.os.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueType()
	 * @generated
	 */
	int DATA_QUEUE_TYPE = 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.dtaq.DataQueueSearchType <em>Data Queue Search Type</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.dtaq.DataQueueSearchType
	 * @see org.smeup.sys.os.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueSearchType()
	 * @generated
	 */
	int DATA_QUEUE_SEARCH_TYPE = 5;

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.dtaq.QDataQueue <em>Data Queue</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Data Queue</em>'.
	 * @see org.smeup.sys.os.dtaq.QDataQueue
	 * @generated
	 */
	EClass getDataQueue();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.dtaq.QDataQueue#getDataQueueType <em>Data Queue Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Queue Type</em>'.
	 * @see org.smeup.sys.os.dtaq.QDataQueue#getDataQueueType()
	 * @see #getDataQueue()
	 * @generated
	 */
	EAttribute getDataQueue_DataQueueType();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.dtaq.QDataQueue#getKeyLength <em>Key Length</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Length</em>'.
	 * @see org.smeup.sys.os.dtaq.QDataQueue#getKeyLength()
	 * @see #getDataQueue()
	 * @generated
	 */
	EAttribute getDataQueue_KeyLength();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.dtaq.QDataQueue#getMaxEntryLength
	 * <em>Max Entry Length</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for the attribute '<em>Max Entry Length</em>'.
	 * @see org.smeup.sys.os.dtaq.QDataQueue#getMaxEntryLength()
	 * @see #getDataQueue()
	 * @generated
	 */
	EAttribute getDataQueue_MaxEntryLength();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.dtaq.QDataQueue#isSenderInfo <em>Sender Info</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sender Info</em>'.
	 * @see org.smeup.sys.os.dtaq.QDataQueue#isSenderInfo()
	 * @see #getDataQueue()
	 * @generated
	 */
	EAttribute getDataQueue_SenderInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.os.dtaq.QDataQueue#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.smeup.sys.os.dtaq.QDataQueue#getContent()
	 * @see #getDataQueue()
	 * @generated
	 */
	EReference getDataQueue_Content();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.dtaq.QDataQueueContent
	 * <em>Data Queue Content</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Data Queue Content</em>'.
	 * @see org.smeup.sys.os.dtaq.QDataQueueContent
	 * @generated
	 */
	EClass getDataQueueContent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.os.dtaq.QDataQueueContent#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.smeup.sys.os.dtaq.QDataQueueContent#getEntries()
	 * @see #getDataQueueContent()
	 * @generated
	 */
	EReference getDataQueueContent_Entries();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.dtaq.QDataQueueEntry <em>Data Queue Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Queue Entry</em>'.
	 * @see org.smeup.sys.os.dtaq.QDataQueueEntry
	 * @generated
	 */
	EClass getDataQueueEntry();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.dtaq.QDataQueueEntry#getKey <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.smeup.sys.os.dtaq.QDataQueueEntry#getKey()
	 * @see #getDataQueueEntry()
	 * @generated
	 */
	EAttribute getDataQueueEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.dtaq.QDataQueueEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.smeup.sys.os.dtaq.QDataQueueEntry#getValue()
	 * @see #getDataQueueEntry()
	 * @generated
	 */
	EAttribute getDataQueueEntry_Value();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.dtaq.QDataQueueManager
	 * <em>Data Queue Manager</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Data Queue Manager</em>'.
	 * @see org.smeup.sys.os.dtaq.QDataQueueManager
	 * @generated
	 */
	EClass getDataQueueManager();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.os.dtaq.DataQueueType <em>Data Queue Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Queue Type</em>'.
	 * @see org.smeup.sys.os.dtaq.DataQueueType
	 * @generated
	 */
	EEnum getDataQueueType();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.os.dtaq.DataQueueSearchType <em>Data Queue Search Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Data Queue Search Type</em>'.
	 * @see org.smeup.sys.os.dtaq.DataQueueSearchType
	 * @generated
	 */
	EEnum getDataQueueSearchType();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemDataQueueFactory getOperatingSystemDataQueueFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.os.dtaq.impl.DataQueueImpl <em>Data Queue</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.os.dtaq.impl.DataQueueImpl
		 * @see org.smeup.sys.os.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueue()
		 * @generated
		 */
		EClass DATA_QUEUE = eINSTANCE.getDataQueue();

		/**
		 * The meta object literal for the '<em><b>Data Queue Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUEUE__DATA_QUEUE_TYPE = eINSTANCE.getDataQueue_DataQueueType();

		/**
		 * The meta object literal for the '<em><b>Key Length</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUEUE__KEY_LENGTH = eINSTANCE.getDataQueue_KeyLength();

		/**
		 * The meta object literal for the '<em><b>Max Entry Length</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUEUE__MAX_ENTRY_LENGTH = eINSTANCE.getDataQueue_MaxEntryLength();

		/**
		 * The meta object literal for the '<em><b>Sender Info</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUEUE__SENDER_INFO = eINSTANCE.getDataQueue_SenderInfo();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_QUEUE__CONTENT = eINSTANCE.getDataQueue_Content();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.dtaq.impl.DataQueueContentImpl <em>Data Queue Content</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.dtaq.impl.DataQueueContentImpl
		 * @see org.smeup.sys.os.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueContent()
		 * @generated
		 */
		EClass DATA_QUEUE_CONTENT = eINSTANCE.getDataQueueContent();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_QUEUE_CONTENT__ENTRIES = eINSTANCE.getDataQueueContent_Entries();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.dtaq.impl.DataQueueEntryImpl <em>Data Queue Entry</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.dtaq.impl.DataQueueEntryImpl
		 * @see org.smeup.sys.os.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueEntry()
		 * @generated
		 */
		EClass DATA_QUEUE_ENTRY = eINSTANCE.getDataQueueEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUEUE_ENTRY__KEY = eINSTANCE.getDataQueueEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUEUE_ENTRY__VALUE = eINSTANCE.getDataQueueEntry_Value();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.dtaq.QDataQueueManager <em>Data Queue Manager</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.dtaq.QDataQueueManager
		 * @see org.smeup.sys.os.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueManager()
		 * @generated
		 */
		EClass DATA_QUEUE_MANAGER = eINSTANCE.getDataQueueManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.dtaq.DataQueueType <em>Data Queue Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.os.dtaq.DataQueueType
		 * @see org.smeup.sys.os.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueType()
		 * @generated
		 */
		EEnum DATA_QUEUE_TYPE = eINSTANCE.getDataQueueType();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.dtaq.DataQueueSearchType <em>Data Queue Search Type</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.dtaq.DataQueueSearchType
		 * @see org.smeup.sys.os.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueSearchType()
		 * @generated
		 */
		EEnum DATA_QUEUE_SEARCH_TYPE = eINSTANCE.getDataQueueSearchType();

	}

} // OSDataQueueCorePackage
