/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.outq.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.os.outq.QOperatingSystemOutQueueFactory;
import org.smeup.sys.os.outq.QOperatingSystemOutQueuePackage;
import org.smeup.sys.os.outq.QOutQueue;
import org.smeup.sys.os.outq.QOutQueueManager;
import org.smeup.sys.os.outq.SequenceType;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemOutQueuePackageImpl extends EPackageImpl implements QOperatingSystemOutQueuePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outQueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outQueueManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sequenceTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.smeup.sys.os.outq.QOperatingSystemOutQueuePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemOutQueuePackageImpl() {
		super(eNS_URI, QOperatingSystemOutQueueFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QOperatingSystemOutQueuePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemOutQueuePackage init() {
		if (isInited) return (QOperatingSystemOutQueuePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemOutQueuePackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemOutQueuePackageImpl theOperatingSystemOutQueuePackage = (OperatingSystemOutQueuePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemOutQueuePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemOutQueuePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QOperatingSystemTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemOutQueuePackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemOutQueuePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemOutQueuePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemOutQueuePackage.eNS_URI, theOperatingSystemOutQueuePackage);
		return theOperatingSystemOutQueuePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutQueue() {
		return outQueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutQueue_Sequence() {
		return (EAttribute)outQueueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutQueueManager() {
		return outQueueManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSequenceType() {
		return sequenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemOutQueueFactory getOperatingSystemOutQueueFactory() {
		return (QOperatingSystemOutQueueFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		outQueueEClass = createEClass(OUT_QUEUE);
		createEAttribute(outQueueEClass, OUT_QUEUE__SEQUENCE);

		outQueueManagerEClass = createEClass(OUT_QUEUE_MANAGER);

		// Create enums
		sequenceTypeEEnum = createEEnum(SEQUENCE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QOperatingSystemTypePackage theOperatingSystemTypePackage = (QOperatingSystemTypePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		outQueueEClass.getESuperTypes().add(theOperatingSystemTypePackage.getTypedObject());

		// Initialize classes and features; add operations and parameters
		initEClass(outQueueEClass, QOutQueue.class, "OutQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutQueue_Sequence(), this.getSequenceType(), "sequence", null, 1, 1, QOutQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outQueueManagerEClass, QOutQueueManager.class, "OutQueueManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(sequenceTypeEEnum, SequenceType.class, "SequenceType");
		addEEnumLiteral(sequenceTypeEEnum, SequenceType.FIRST_IN_FIRST_OUT);
		addEEnumLiteral(sequenceTypeEEnum, SequenceType.JOB_NUMBER);

		// Create resource
		createResource(eNS_URI);
	}

} //OperatingSystemOutQueuePackageImpl
