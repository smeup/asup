/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.dtaq.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;
import org.smeup.sys.os.dtaq.DataQueueSearchType;
import org.smeup.sys.os.dtaq.DataQueueType;
import org.smeup.sys.os.dtaq.QDataQueue;
import org.smeup.sys.os.dtaq.QDataQueueContent;
import org.smeup.sys.os.dtaq.QDataQueueEntry;
import org.smeup.sys.os.dtaq.QDataQueueManager;
import org.smeup.sys.os.dtaq.QOperatingSystemDataQueueFactory;
import org.smeup.sys.os.dtaq.QOperatingSystemDataQueuePackage;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemDataQueuePackageImpl extends EPackageImpl implements QOperatingSystemDataQueuePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataQueueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataQueueContentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataQueueEntryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataQueueManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataQueueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataQueueSearchTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.smeup.sys.os.dtaq.QOperatingSystemDataQueuePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemDataQueuePackageImpl() {
		super(eNS_URI, QOperatingSystemDataQueueFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QOperatingSystemDataQueuePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemDataQueuePackage init() {
		if (isInited) return (QOperatingSystemDataQueuePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemDataQueuePackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemDataQueuePackageImpl theOperatingSystemDataQueuePackage = (OperatingSystemDataQueuePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemDataQueuePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemDataQueuePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QOperatingSystemTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemDataQueuePackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemDataQueuePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemDataQueuePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemDataQueuePackage.eNS_URI, theOperatingSystemDataQueuePackage);
		return theOperatingSystemDataQueuePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataQueue() {
		return dataQueueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataQueue_DataQueueType() {
		return (EAttribute)dataQueueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataQueue_KeyLength() {
		return (EAttribute)dataQueueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataQueue_MaxEntryLength() {
		return (EAttribute)dataQueueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataQueue_SenderInfo() {
		return (EAttribute)dataQueueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataQueue_Content() {
		return (EReference)dataQueueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataQueueContent() {
		return dataQueueContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataQueueContent_Entries() {
		return (EReference)dataQueueContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataQueueEntry() {
		return dataQueueEntryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataQueueEntry_Key() {
		return (EAttribute)dataQueueEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataQueueEntry_Value() {
		return (EAttribute)dataQueueEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataQueueManager() {
		return dataQueueManagerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataQueueType() {
		return dataQueueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataQueueSearchType() {
		return dataQueueSearchTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemDataQueueFactory getOperatingSystemDataQueueFactory() {
		return (QOperatingSystemDataQueueFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		dataQueueEClass = createEClass(DATA_QUEUE);
		createEAttribute(dataQueueEClass, DATA_QUEUE__DATA_QUEUE_TYPE);
		createEAttribute(dataQueueEClass, DATA_QUEUE__KEY_LENGTH);
		createEAttribute(dataQueueEClass, DATA_QUEUE__MAX_ENTRY_LENGTH);
		createEAttribute(dataQueueEClass, DATA_QUEUE__SENDER_INFO);
		createEReference(dataQueueEClass, DATA_QUEUE__CONTENT);

		dataQueueContentEClass = createEClass(DATA_QUEUE_CONTENT);
		createEReference(dataQueueContentEClass, DATA_QUEUE_CONTENT__ENTRIES);

		dataQueueEntryEClass = createEClass(DATA_QUEUE_ENTRY);
		createEAttribute(dataQueueEntryEClass, DATA_QUEUE_ENTRY__KEY);
		createEAttribute(dataQueueEntryEClass, DATA_QUEUE_ENTRY__VALUE);

		dataQueueManagerEClass = createEClass(DATA_QUEUE_MANAGER);

		// Create enums
		dataQueueTypeEEnum = createEEnum(DATA_QUEUE_TYPE);
		dataQueueSearchTypeEEnum = createEEnum(DATA_QUEUE_SEARCH_TYPE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
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
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QOperatingSystemJobsPackage theOperatingSystemJobsPackage = (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);
		QIntegratedLanguageDataPackage theIntegratedLanguageDataPackage = (QIntegratedLanguageDataPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataQueueEClass.getESuperTypes().add(theOperatingSystemTypePackage.getTypedObject());
		dataQueueContentEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		dataQueueEntryEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(dataQueueEClass, QDataQueue.class, "DataQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataQueue_DataQueueType(), this.getDataQueueType(), "dataQueueType", null, 1, 1, QDataQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataQueue_KeyLength(), ecorePackage.getEInt(), "keyLength", null, 1, 1, QDataQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataQueue_MaxEntryLength(), ecorePackage.getEInt(), "maxEntryLength", null, 1, 1, QDataQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataQueue_SenderInfo(), ecorePackage.getEBoolean(), "senderInfo", null, 0, 1, QDataQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataQueue_Content(), this.getDataQueueContent(), null, "content", null, 0, 1, QDataQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataQueueContentEClass, QDataQueueContent.class, "DataQueueContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataQueueContent_Entries(), this.getDataQueueEntry(), null, "entries", null, 0, -1, QDataQueueContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataQueueEntryEClass, QDataQueueEntry.class, "DataQueueEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataQueueEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, QDataQueueEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataQueueEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, QDataQueueEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataQueueManagerEClass, QDataQueueManager.class, "DataQueueManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(dataQueueManagerEClass, null, "writeDataQueue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataQueueManagerEClass, ecorePackage.getEString(), "readDataQueue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataQueueSearchType(), "searchType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataQueueManagerEClass, null, "clearDataQueue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataQueueManagerEClass, ecorePackage.getEString(), "peekDataQueue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataQueueSearchType(), "searchType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataQueueManagerEClass, null, "createDataQueue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataQueueType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "maxEntryLength", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataQueueManagerEClass, null, "writeDataQueue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataQueueManagerEClass, null, "deleteDataQueue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataQueueTypeEEnum, DataQueueType.class, "DataQueueType");
		addEEnumLiteral(dataQueueTypeEEnum, DataQueueType.FIFO);
		addEEnumLiteral(dataQueueTypeEEnum, DataQueueType.LIFO);
		addEEnumLiteral(dataQueueTypeEEnum, DataQueueType.KEYED);

		initEEnum(dataQueueSearchTypeEEnum, DataQueueSearchType.class, "DataQueueSearchType");
		addEEnumLiteral(dataQueueSearchTypeEEnum, DataQueueSearchType.EQUAL);
		addEEnumLiteral(dataQueueSearchTypeEEnum, DataQueueSearchType.NOT_EQUAL);
		addEEnumLiteral(dataQueueSearchTypeEEnum, DataQueueSearchType.LESS_THAN);
		addEEnumLiteral(dataQueueSearchTypeEEnum, DataQueueSearchType.GREATER_THAN);
		addEEnumLiteral(dataQueueSearchTypeEEnum, DataQueueSearchType.LESS_THAN_OR_EQUAL);
		addEEnumLiteral(dataQueueSearchTypeEEnum, DataQueueSearchType.GREATER_THAN_OR_EQUAL);

		// Create resource
		createResource(eNS_URI);
	}

} // OSDataQueueCorePackageImpl
