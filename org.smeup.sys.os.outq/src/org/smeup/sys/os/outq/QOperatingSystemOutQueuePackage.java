/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.outq;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;

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
 * @see org.smeup.sys.os.outq.QOperatingSystemOutQueueFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemOutQueuePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "outq";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/outq";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-outq";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemOutQueuePackage eINSTANCE = org.smeup.sys.os.outq.impl.OperatingSystemOutQueuePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.outq.impl.OutQueueImpl <em>Out Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.outq.impl.OutQueueImpl
	 * @see org.smeup.sys.os.outq.impl.OperatingSystemOutQueuePackageImpl#getOutQueue()
	 * @generated
	 */
	int OUT_QUEUE = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_QUEUE__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_QUEUE__FACETS = QOperatingSystemTypePackage.TYPED_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_QUEUE__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_QUEUE__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_QUEUE__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_QUEUE__SEQUENCE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Out Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_QUEUE_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.outq.QOutQueueManager <em>Out Queue Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.outq.QOutQueueManager
	 * @see org.smeup.sys.os.outq.impl.OperatingSystemOutQueuePackageImpl#getOutQueueManager()
	 * @generated
	 */
	int OUT_QUEUE_MANAGER = 1;

	/**
	 * The number of structural features of the '<em>Out Queue Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_QUEUE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.outq.SequenceType <em>Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.outq.SequenceType
	 * @see org.smeup.sys.os.outq.impl.OperatingSystemOutQueuePackageImpl#getSequenceType()
	 * @generated
	 */
	int SEQUENCE_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.outq.QOutQueue <em>Out Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Queue</em>'.
	 * @see org.smeup.sys.os.outq.QOutQueue
	 * @generated
	 */
	EClass getOutQueue();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.outq.QOutQueue#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see org.smeup.sys.os.outq.QOutQueue#getSequence()
	 * @see #getOutQueue()
	 * @generated
	 */
	EAttribute getOutQueue_Sequence();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.outq.QOutQueueManager <em>Out Queue Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Queue Manager</em>'.
	 * @see org.smeup.sys.os.outq.QOutQueueManager
	 * @generated
	 */
	EClass getOutQueueManager();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.os.outq.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sequence Type</em>'.
	 * @see org.smeup.sys.os.outq.SequenceType
	 * @generated
	 */
	EEnum getSequenceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemOutQueueFactory getOperatingSystemOutQueueFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.os.outq.impl.OutQueueImpl <em>Out Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.outq.impl.OutQueueImpl
		 * @see org.smeup.sys.os.outq.impl.OperatingSystemOutQueuePackageImpl#getOutQueue()
		 * @generated
		 */
		EClass OUT_QUEUE = eINSTANCE.getOutQueue();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_QUEUE__SEQUENCE = eINSTANCE.getOutQueue_Sequence();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.outq.QOutQueueManager <em>Out Queue Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.outq.QOutQueueManager
		 * @see org.smeup.sys.os.outq.impl.OperatingSystemOutQueuePackageImpl#getOutQueueManager()
		 * @generated
		 */
		EClass OUT_QUEUE_MANAGER = eINSTANCE.getOutQueueManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.outq.SequenceType <em>Sequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.outq.SequenceType
		 * @see org.smeup.sys.os.outq.impl.OperatingSystemOutQueuePackageImpl#getSequenceType()
		 * @generated
		 */
		EEnum SEQUENCE_TYPE = eINSTANCE.getSequenceType();

	}

} //QOperatingSystemOutQueuePackage
