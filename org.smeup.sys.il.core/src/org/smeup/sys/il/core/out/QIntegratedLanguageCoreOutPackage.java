/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.out;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;

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
 * @see org.smeup.sys.il.core.out.QIntegratedLanguageCoreOutFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageCoreOutPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "out";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/il/core/out";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-core-out";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageCoreOutPackage eINSTANCE = org.smeup.sys.il.core.out.impl.IntegratedLanguageCoreOutPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.out.QObjectWriter <em>Object Writer</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.out.QObjectWriter
	 * @see org.smeup.sys.il.core.out.impl.IntegratedLanguageCoreOutPackageImpl#getObjectWriter()
	 * @generated
	 */
	int OBJECT_WRITER = 0;

	/**
	 * The number of structural features of the '<em>Object Writer</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WRITER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.out.QWritableObject <em>Writable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.out.QWritableObject
	 * @see org.smeup.sys.il.core.out.impl.IntegratedLanguageCoreOutPackageImpl#getWritableObject()
	 * @generated
	 */
	int WRITABLE_OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Writable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITABLE_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.out.QObjectWriterFactory <em>Object Writer Factory</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.out.QObjectWriterFactory
	 * @see org.smeup.sys.il.core.out.impl.IntegratedLanguageCoreOutPackageImpl#getObjectWriterFactory()
	 * @generated
	 */
	int OBJECT_WRITER_FACTORY = 2;

	/**
	 * The number of structural features of the '<em>Object Writer Factory</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WRITER_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.out.QObjectWriterFactoryRegistry <em>Object Writer Factory Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.out.QObjectWriterFactoryRegistry
	 * @see org.smeup.sys.il.core.out.impl.IntegratedLanguageCoreOutPackageImpl#getObjectWriterFactoryRegistry()
	 * @generated
	 */
	int OBJECT_WRITER_FACTORY_REGISTRY = 3;

	/**
	 * The number of structural features of the '<em>Object Writer Factory Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WRITER_FACTORY_REGISTRY_FEATURE_COUNT = QIntegratedLanguageCoreCtxPackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.out.QOutputManager <em>Output Manager</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.out.QOutputManager
	 * @see org.smeup.sys.il.core.out.impl.IntegratedLanguageCoreOutPackageImpl#getOutputManager()
	 * @generated
	 */
	int OUTPUT_MANAGER = 4;

	/**
	 * The number of structural features of the '<em>Output Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MANAGER_FEATURE_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.out.QObjectWriter <em>Object Writer</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Writer</em>'.
	 * @see org.smeup.sys.il.core.out.QObjectWriter
	 * @generated
	 */
	EClass getObjectWriter();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.out.QWritableObject <em>Writable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writable Object</em>'.
	 * @see org.smeup.sys.il.core.out.QWritableObject
	 * @generated
	 */
	EClass getWritableObject();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.out.QObjectWriterFactory <em>Object Writer Factory</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Object Writer Factory</em>'.
	 * @see org.smeup.sys.il.core.out.QObjectWriterFactory
	 * @generated
	 */
	EClass getObjectWriterFactory();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.out.QObjectWriterFactoryRegistry <em>Object Writer Factory Registry</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Object Writer Factory Registry</em>'.
	 * @see org.smeup.sys.il.core.out.QObjectWriterFactoryRegistry
	 * @generated
	 */
	EClass getObjectWriterFactoryRegistry();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.out.QOutputManager <em>Output Manager</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Manager</em>'.
	 * @see org.smeup.sys.il.core.out.QOutputManager
	 * @generated
	 */
	EClass getOutputManager();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageCoreOutFactory getIntegratedLanguageCoreOutFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.il.core.out.QObjectWriter <em>Object Writer</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.out.QObjectWriter
		 * @see org.smeup.sys.il.core.out.impl.IntegratedLanguageCoreOutPackageImpl#getObjectWriter()
		 * @generated
		 */
		EClass OBJECT_WRITER = eINSTANCE.getObjectWriter();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.out.QWritableObject <em>Writable Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.out.QWritableObject
		 * @see org.smeup.sys.il.core.out.impl.IntegratedLanguageCoreOutPackageImpl#getWritableObject()
		 * @generated
		 */
		EClass WRITABLE_OBJECT = eINSTANCE.getWritableObject();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.out.QObjectWriterFactory <em>Object Writer Factory</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.out.QObjectWriterFactory
		 * @see org.smeup.sys.il.core.out.impl.IntegratedLanguageCoreOutPackageImpl#getObjectWriterFactory()
		 * @generated
		 */
		EClass OBJECT_WRITER_FACTORY = eINSTANCE.getObjectWriterFactory();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.out.QObjectWriterFactoryRegistry <em>Object Writer Factory Registry</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.out.QObjectWriterFactoryRegistry
		 * @see org.smeup.sys.il.core.out.impl.IntegratedLanguageCoreOutPackageImpl#getObjectWriterFactoryRegistry()
		 * @generated
		 */
		EClass OBJECT_WRITER_FACTORY_REGISTRY = eINSTANCE.getObjectWriterFactoryRegistry();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.out.QOutputManager <em>Output Manager</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.out.QOutputManager
		 * @see org.smeup.sys.il.core.out.impl.IntegratedLanguageCoreOutPackageImpl#getOutputManager()
		 * @generated
		 */
		EClass OUTPUT_MANAGER = eINSTANCE.getOutputManager();

	}

} // QIntegratedLanguageCoreOutPackage
