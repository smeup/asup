/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.mi.core.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.smeup.sys.mi.core.util.QMachineInterfaceCoreUtilFactory
 * @model kind="package"
 * @generated
 */
public interface QMachineInterfaceCoreUtilPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "util";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/mi/core/util";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mi-core-util";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QMachineInterfaceCoreUtilPackage eINSTANCE = org.smeup.sys.mi.core.util.impl.MachineInterfaceCoreUtilPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.mi.core.util.QFiles <em>Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.mi.core.util.QFiles
	 * @see org.smeup.sys.mi.core.util.impl.MachineInterfaceCoreUtilPackageImpl#getFiles()
	 * @generated
	 */
	int FILES = 0;

	/**
	 * The number of structural features of the '<em>Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.mi.core.util.QStreams <em>Streams</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.mi.core.util.QStreams
	 * @see org.smeup.sys.mi.core.util.impl.MachineInterfaceCoreUtilPackageImpl#getStreams()
	 * @generated
	 */
	int STREAMS = 1;

	/**
	 * The number of structural features of the '<em>Streams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.mi.core.util.QLists <em>Lists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.mi.core.util.QLists
	 * @see org.smeup.sys.mi.core.util.impl.MachineInterfaceCoreUtilPackageImpl#getLists()
	 * @generated
	 */
	int LISTS = 2;

	/**
	 * The number of structural features of the '<em>Lists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.mi.core.util.QStrings <em>Strings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.mi.core.util.QStrings
	 * @see org.smeup.sys.mi.core.util.impl.MachineInterfaceCoreUtilPackageImpl#getStrings()
	 * @generated
	 */
	int STRINGS = 3;

	/**
	 * The number of structural features of the '<em>Strings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.mi.core.util.QURIs <em>UR Is</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.mi.core.util.QURIs
	 * @see org.smeup.sys.mi.core.util.impl.MachineInterfaceCoreUtilPackageImpl#getURIs()
	 * @generated
	 */
	int UR_IS = 4;

	/**
	 * The number of structural features of the '<em>UR Is</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_IS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.mi.core.util.QThreads <em>Threads</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.mi.core.util.QThreads
	 * @see org.smeup.sys.mi.core.util.impl.MachineInterfaceCoreUtilPackageImpl#getThreads()
	 * @generated
	 */
	int THREADS = 5;

	/**
	 * The number of structural features of the '<em>Threads</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADS_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.mi.core.util.QFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Files</em>'.
	 * @see org.smeup.sys.mi.core.util.QFiles
	 * @generated
	 */
	EClass getFiles();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.mi.core.util.QStreams <em>Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Streams</em>'.
	 * @see org.smeup.sys.mi.core.util.QStreams
	 * @generated
	 */
	EClass getStreams();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.mi.core.util.QLists <em>Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lists</em>'.
	 * @see org.smeup.sys.mi.core.util.QLists
	 * @generated
	 */
	EClass getLists();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.mi.core.util.QStrings <em>Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strings</em>'.
	 * @see org.smeup.sys.mi.core.util.QStrings
	 * @generated
	 */
	EClass getStrings();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.mi.core.util.QURIs <em>UR Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UR Is</em>'.
	 * @see org.smeup.sys.mi.core.util.QURIs
	 * @generated
	 */
	EClass getURIs();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.mi.core.util.QThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threads</em>'.
	 * @see org.smeup.sys.mi.core.util.QThreads
	 * @generated
	 */
	EClass getThreads();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QMachineInterfaceCoreUtilFactory getMachineInterfaceCoreUtilFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.mi.core.util.QFiles <em>Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.mi.core.util.QFiles
		 * @see org.smeup.sys.mi.core.util.impl.MachineInterfaceCoreUtilPackageImpl#getFiles()
		 * @generated
		 */
		EClass FILES = eINSTANCE.getFiles();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.mi.core.util.QStreams <em>Streams</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.mi.core.util.QStreams
		 * @see org.smeup.sys.mi.core.util.impl.MachineInterfaceCoreUtilPackageImpl#getStreams()
		 * @generated
		 */
		EClass STREAMS = eINSTANCE.getStreams();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.mi.core.util.QLists <em>Lists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.mi.core.util.QLists
		 * @see org.smeup.sys.mi.core.util.impl.MachineInterfaceCoreUtilPackageImpl#getLists()
		 * @generated
		 */
		EClass LISTS = eINSTANCE.getLists();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.mi.core.util.QStrings <em>Strings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.mi.core.util.QStrings
		 * @see org.smeup.sys.mi.core.util.impl.MachineInterfaceCoreUtilPackageImpl#getStrings()
		 * @generated
		 */
		EClass STRINGS = eINSTANCE.getStrings();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.mi.core.util.QURIs <em>UR Is</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.mi.core.util.QURIs
		 * @see org.smeup.sys.mi.core.util.impl.MachineInterfaceCoreUtilPackageImpl#getURIs()
		 * @generated
		 */
		EClass UR_IS = eINSTANCE.getURIs();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.mi.core.util.QThreads <em>Threads</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.mi.core.util.QThreads
		 * @see org.smeup.sys.mi.core.util.impl.MachineInterfaceCoreUtilPackageImpl#getThreads()
		 * @generated
		 */
		EClass THREADS = eINSTANCE.getThreads();

	}

} //QMachineInterfaceCoreUtilPackage
