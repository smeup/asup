/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;
import org.smeup.sys.mi.core.util.QMachineInterfaceUtilPackage;

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
 * @see org.smeup.sys.il.core.QIntegratedLanguageCoreFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/il/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageCorePackage eINSTANCE = org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.QNameable <em>Nameable</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.QNameable
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getNameable()
	 * @generated
	 */
	int NAMEABLE = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.ObjectImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Nameable</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.ObjectContainerImpl <em>Object Container</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.ObjectContainerImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectContainer()
	 * @generated
	 */
	int OBJECT_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONTAINER__CONTENTS = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Container</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONTAINER_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.QObjectIterator <em>Object Iterator</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.QObjectIterator
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectIterator()
	 * @generated
	 */
	int OBJECT_ITERATOR = 3;

	/**
	 * The number of structural features of the '<em>Object Iterator</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ITERATOR_FEATURE_COUNT = QMachineInterfaceCorePackage.JAVA_ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.ObjectNameableImpl <em>Object Nameable</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.ObjectNameableImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectNameable()
	 * @generated
	 */
	int OBJECT_NAMEABLE = 4;

	/**
	 * The number of structural features of the '<em>Object Nameable</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NAMEABLE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.QObjectRegistry <em>Object Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.QObjectRegistry
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectRegistry()
	 * @generated
	 */
	int OBJECT_REGISTRY = 5;

	/**
	 * The number of structural features of the '<em>Object Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REGISTRY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.QObjectRegistryFactory <em>Object Registry Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.QObjectRegistryFactory
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectRegistryFactory()
	 * @generated
	 */
	int OBJECT_REGISTRY_FACTORY = 6;

	/**
	 * The number of structural features of the '<em>Object Registry Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REGISTRY_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.ObjectRegistryKeyImpl <em>Object Registry Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.ObjectRegistryKeyImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectRegistryKey()
	 * @generated
	 */
	int OBJECT_REGISTRY_KEY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REGISTRY_KEY__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REGISTRY_KEY__TEXT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REGISTRY_KEY__VERSION = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REGISTRY_KEY__VENDOR = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Object Registry Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REGISTRY_KEY_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.QThread <em>Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.QThread
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getThread()
	 * @generated
	 */
	int THREAD = 8;

	/**
	 * The number of structural features of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.QThreadManager <em>Thread Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.QThreadManager
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getThreadManager()
	 * @generated
	 */
	int THREAD_MANAGER = 9;

	/**
	 * The number of structural features of the '<em>Thread Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_MANAGER_FEATURE_COUNT = QMachineInterfaceUtilPackage.SINGLETON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.ThreadStatus <em>Thread Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.ThreadStatus
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getThreadStatus()
	 * @generated
	 */
	int THREAD_STATUS = 10;

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.QNameable <em>Nameable</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Nameable</em>'.
	 * @see org.smeup.sys.il.core.QNameable
	 * @generated
	 */
	EClass getNameable();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QObject <em>Object</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.smeup.sys.il.core.QObject
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QObjectContainer <em>Object Container</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Container</em>'.
	 * @see org.smeup.sys.il.core.QObjectContainer
	 * @generated
	 */
	EClass getObjectContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.il.core.QObjectContainer#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.smeup.sys.il.core.QObjectContainer#getContents()
	 * @see #getObjectContainer()
	 * @generated
	 */
	EReference getObjectContainer_Contents();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QObjectIterator <em>Object Iterator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Iterator</em>'.
	 * @see org.smeup.sys.il.core.QObjectIterator
	 * @generated
	 */
	EClass getObjectIterator();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QObjectNameable <em>Object Nameable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Nameable</em>'.
	 * @see org.smeup.sys.il.core.QObjectNameable
	 * @generated
	 */
	EClass getObjectNameable();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QObjectRegistry <em>Object Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Registry</em>'.
	 * @see org.smeup.sys.il.core.QObjectRegistry
	 * @generated
	 */
	EClass getObjectRegistry();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QObjectRegistryFactory <em>Object Registry Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Registry Factory</em>'.
	 * @see org.smeup.sys.il.core.QObjectRegistryFactory
	 * @generated
	 */
	EClass getObjectRegistryFactory();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QObjectRegistryKey <em>Object Registry Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Registry Key</em>'.
	 * @see org.smeup.sys.il.core.QObjectRegistryKey
	 * @generated
	 */
	EClass getObjectRegistryKey();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.QObjectRegistryKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.il.core.QObjectRegistryKey#getName()
	 * @see #getObjectRegistryKey()
	 * @generated
	 */
	EAttribute getObjectRegistryKey_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.QObjectRegistryKey#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.smeup.sys.il.core.QObjectRegistryKey#getText()
	 * @see #getObjectRegistryKey()
	 * @generated
	 */
	EAttribute getObjectRegistryKey_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.QObjectRegistryKey#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.smeup.sys.il.core.QObjectRegistryKey#getVersion()
	 * @see #getObjectRegistryKey()
	 * @generated
	 */
	EAttribute getObjectRegistryKey_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.QObjectRegistryKey#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.smeup.sys.il.core.QObjectRegistryKey#getVendor()
	 * @see #getObjectRegistryKey()
	 * @generated
	 */
	EAttribute getObjectRegistryKey_Vendor();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QThread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread</em>'.
	 * @see org.smeup.sys.il.core.QThread
	 * @generated
	 */
	EClass getThread();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QThreadManager <em>Thread Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread Manager</em>'.
	 * @see org.smeup.sys.il.core.QThreadManager
	 * @generated
	 */
	EClass getThreadManager();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.il.core.ThreadStatus <em>Thread Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Thread Status</em>'.
	 * @see org.smeup.sys.il.core.ThreadStatus
	 * @generated
	 */
	EEnum getThreadStatus();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageCoreFactory getIntegratedLanguageCoreFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.il.core.QNameable <em>Nameable</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.QNameable
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getNameable()
		 * @generated
		 */
		EClass NAMEABLE = eINSTANCE.getNameable();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.ObjectImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.ObjectContainerImpl <em>Object Container</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.ObjectContainerImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectContainer()
		 * @generated
		 */
		EClass OBJECT_CONTAINER = eINSTANCE.getObjectContainer();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CONTAINER__CONTENTS = eINSTANCE.getObjectContainer_Contents();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.QObjectIterator <em>Object Iterator</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.QObjectIterator
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectIterator()
		 * @generated
		 */
		EClass OBJECT_ITERATOR = eINSTANCE.getObjectIterator();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.ObjectNameableImpl <em>Object Nameable</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.ObjectNameableImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectNameable()
		 * @generated
		 */
		EClass OBJECT_NAMEABLE = eINSTANCE.getObjectNameable();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.QObjectRegistry <em>Object Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.QObjectRegistry
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectRegistry()
		 * @generated
		 */
		EClass OBJECT_REGISTRY = eINSTANCE.getObjectRegistry();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.QObjectRegistryFactory <em>Object Registry Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.QObjectRegistryFactory
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectRegistryFactory()
		 * @generated
		 */
		EClass OBJECT_REGISTRY_FACTORY = eINSTANCE.getObjectRegistryFactory();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.ObjectRegistryKeyImpl <em>Object Registry Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.ObjectRegistryKeyImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectRegistryKey()
		 * @generated
		 */
		EClass OBJECT_REGISTRY_KEY = eINSTANCE.getObjectRegistryKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REGISTRY_KEY__NAME = eINSTANCE.getObjectRegistryKey_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REGISTRY_KEY__TEXT = eINSTANCE.getObjectRegistryKey_Text();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REGISTRY_KEY__VERSION = eINSTANCE.getObjectRegistryKey_Version();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REGISTRY_KEY__VENDOR = eINSTANCE.getObjectRegistryKey_Vendor();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.QThread <em>Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.QThread
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getThread()
		 * @generated
		 */
		EClass THREAD = eINSTANCE.getThread();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.QThreadManager <em>Thread Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.QThreadManager
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getThreadManager()
		 * @generated
		 */
		EClass THREAD_MANAGER = eINSTANCE.getThreadManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.ThreadStatus <em>Thread Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.ThreadStatus
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getThreadStatus()
		 * @generated
		 */
		EEnum THREAD_STATUS = eINSTANCE.getThreadStatus();

	}

} // QIntegratedLanguageCorePackage
