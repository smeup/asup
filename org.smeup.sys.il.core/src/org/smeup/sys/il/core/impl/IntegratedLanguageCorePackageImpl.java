/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCoreFactory;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.QNameable;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectContainer;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.QObjectRegistry;
import org.smeup.sys.il.core.QObjectRegistryFactory;
import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.QThreadInfo;
import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.il.core.ThreadStatus;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;
import org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl;
import org.smeup.sys.il.core.out.QIntegratedLanguageCoreOutPackage;
import org.smeup.sys.il.core.out.impl.IntegratedLanguageCoreOutPackageImpl;
import org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermPackage;
import org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;
import org.smeup.sys.mi.core.util.QMachineInterfaceUtilPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class IntegratedLanguageCorePackageImpl extends EPackageImpl implements QIntegratedLanguageCorePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectContainerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectIteratorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectNameableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectRegistryFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum threadStatusEEnum = null;

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
	 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageCorePackageImpl() {
		super(eNS_URI, QIntegratedLanguageCoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QIntegratedLanguageCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageCorePackage init() {
		if (isInited) return (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageCorePackageImpl theIntegratedLanguageCorePackage = (IntegratedLanguageCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegratedLanguageCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QMachineInterfaceCorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		IntegratedLanguageCoreCtxPackageImpl theIntegratedLanguageCoreCtxPackage = (IntegratedLanguageCoreCtxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI) instanceof IntegratedLanguageCoreCtxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI) : QIntegratedLanguageCoreCtxPackage.eINSTANCE);
		IntegratedLanguageCoreMetaPackageImpl theIntegratedLanguageCoreMetaPackage = (IntegratedLanguageCoreMetaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreMetaPackage.eNS_URI) instanceof IntegratedLanguageCoreMetaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreMetaPackage.eNS_URI) : QIntegratedLanguageCoreMetaPackage.eINSTANCE);
		IntegratedLanguageCoreOutPackageImpl theIntegratedLanguageCoreOutPackage = (IntegratedLanguageCoreOutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreOutPackage.eNS_URI) instanceof IntegratedLanguageCoreOutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreOutPackage.eNS_URI) : QIntegratedLanguageCoreOutPackage.eINSTANCE);
		IntegratedLanguageCoreTermPackageImpl theIntegratedLanguageCoreTermPackage = (IntegratedLanguageCoreTermPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreTermPackage.eNS_URI) instanceof IntegratedLanguageCoreTermPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreTermPackage.eNS_URI) : QIntegratedLanguageCoreTermPackage.eINSTANCE);

		// Create package meta-data objects
		theIntegratedLanguageCorePackage.createPackageContents();
		theIntegratedLanguageCoreCtxPackage.createPackageContents();
		theIntegratedLanguageCoreMetaPackage.createPackageContents();
		theIntegratedLanguageCoreOutPackage.createPackageContents();
		theIntegratedLanguageCoreTermPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageCorePackage.initializePackageContents();
		theIntegratedLanguageCoreCtxPackage.initializePackageContents();
		theIntegratedLanguageCoreMetaPackage.initializePackageContents();
		theIntegratedLanguageCoreOutPackage.initializePackageContents();
		theIntegratedLanguageCoreTermPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageCorePackage.eNS_URI, theIntegratedLanguageCorePackage);
		return theIntegratedLanguageCorePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameable() {
		return nameableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectContainer() {
		return objectContainerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectContainer_Contents() {
		return (EReference)objectContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectIterator() {
		return objectIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectNameable() {
		return objectNameableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectRegistry() {
		return objectRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectRegistryFactory() {
		return objectRegistryFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThread() {
		return threadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreadInfo() {
		return threadInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadInfo_ThreadName() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadInfo_ThreadId() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadInfo_ThreadPriority() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadInfo_ThreadCPUUsage() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadInfo_ThreadStatus() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadInfo_ThreadRunnable() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadInfo_ThreadInterrupted() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadInfo_ThreadNative() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadInfo_ThreadSuspended() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadInfo_ThreadDaemon() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreadManager() {
		return threadManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getThreadStatus() {
		return threadStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIntegratedLanguageCoreFactory getIntegratedLanguageCoreFactory() {
		return (QIntegratedLanguageCoreFactory)getEFactoryInstance();
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
		nameableEClass = createEClass(NAMEABLE);

		objectEClass = createEClass(OBJECT);

		objectContainerEClass = createEClass(OBJECT_CONTAINER);
		createEReference(objectContainerEClass, OBJECT_CONTAINER__CONTENTS);

		objectIteratorEClass = createEClass(OBJECT_ITERATOR);

		objectNameableEClass = createEClass(OBJECT_NAMEABLE);

		objectRegistryEClass = createEClass(OBJECT_REGISTRY);

		objectRegistryFactoryEClass = createEClass(OBJECT_REGISTRY_FACTORY);

		threadEClass = createEClass(THREAD);

		threadInfoEClass = createEClass(THREAD_INFO);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_NAME);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_ID);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_PRIORITY);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_CPU_USAGE);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_STATUS);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_RUNNABLE);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_INTERRUPTED);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_NATIVE);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_SUSPENDED);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_DAEMON);

		threadManagerEClass = createEClass(THREAD_MANAGER);

		// Create enums
		threadStatusEEnum = createEEnum(THREAD_STATUS);
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
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);
		QIntegratedLanguageCoreMetaPackage theIntegratedLanguageCoreMetaPackage = (QIntegratedLanguageCoreMetaPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreMetaPackage.eNS_URI);
		QIntegratedLanguageCoreOutPackage theIntegratedLanguageCoreOutPackage = (QIntegratedLanguageCoreOutPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreOutPackage.eNS_URI);
		QIntegratedLanguageCoreTermPackage theIntegratedLanguageCoreTermPackage = (QIntegratedLanguageCoreTermPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreTermPackage.eNS_URI);
		QMachineInterfaceCorePackage theMachineInterfaceCorePackage = (QMachineInterfaceCorePackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI);
		QMachineInterfaceUtilPackage theMachineInterfaceUtilPackage = (QMachineInterfaceUtilPackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceUtilPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theIntegratedLanguageCoreCtxPackage);
		getESubpackages().add(theIntegratedLanguageCoreMetaPackage);
		getESubpackages().add(theIntegratedLanguageCoreOutPackage);
		getESubpackages().add(theIntegratedLanguageCoreTermPackage);

		// Create type parameters
		ETypeParameter objectContainerEClass_T = addETypeParameter(objectContainerEClass, "T");
		ETypeParameter objectIteratorEClass_T = addETypeParameter(objectIteratorEClass, "T");
		ETypeParameter objectRegistryEClass_T = addETypeParameter(objectRegistryEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getObject());
		objectContainerEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getObject());
		objectIteratorEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		objectContainerEClass.getESuperTypes().add(this.getObject());
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaIterator());
		EGenericType g2 = createEGenericType(objectIteratorEClass_T);
		g1.getETypeArguments().add(g2);
		objectIteratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaIterable());
		g2 = createEGenericType(objectIteratorEClass_T);
		g1.getETypeArguments().add(g2);
		objectIteratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaCloseable());
		objectIteratorEClass.getEGenericSuperTypes().add(g1);
		objectNameableEClass.getESuperTypes().add(this.getObject());
		objectNameableEClass.getESuperTypes().add(this.getNameable());
		threadEClass.getESuperTypes().add(this.getObject());
		threadInfoEClass.getESuperTypes().add(this.getObject());
		g1 = createEGenericType(theMachineInterfaceUtilPackage.getSingleton());
		g2 = createEGenericType(this.getThreadManager());
		g1.getETypeArguments().add(g2);
		threadManagerEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(nameableEClass, QNameable.class, "Nameable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(nameableEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectEClass, QObject.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectContainerEClass, QObjectContainer.class, "ObjectContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(objectContainerEClass_T);
		initEReference(getObjectContainer_Contents(), g1, null, "contents", null, 0, -1, QObjectContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(objectContainerEClass, null, "lookupByName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(objectContainerEClass_T);
		initEOperation(op, g1);

		initEClass(objectIteratorEClass, QObjectIterator.class, "ObjectIterator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(objectIteratorEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectIteratorEClass, ecorePackage.getEBoolean(), "hasNext", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectIteratorEClass, null, "next", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(objectIteratorEClass_T);
		initEOperation(op, g1);

		addEOperation(objectIteratorEClass, null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectNameableEClass, QObjectNameable.class, "ObjectNameable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(objectNameableEClass, theMachineInterfaceCorePackage.getJavaURI(), "qURI", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectRegistryEClass, QObjectRegistry.class, "ObjectRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(objectRegistryEClass, null, "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(objectRegistryEClass_T);
		initEOperation(op, g1);

		op = addEOperation(objectRegistryEClass, null, "list", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(objectRegistryEClass_T);
		initEOperation(op, g1);

		op = addEOperation(objectRegistryEClass, null, "lookupByPort", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "port", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(objectRegistryEClass_T);
		initEOperation(op, g1);

		op = addEOperation(objectRegistryEClass, null, "lookupByVendorVersion", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "vendor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "version", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(objectRegistryEClass_T);
		initEOperation(op, g1);

		initEClass(objectRegistryFactoryEClass, QObjectRegistryFactory.class, "ObjectRegistryFactory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(objectRegistryFactoryEClass, null, "createObjectRegistry", 1, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getObjectRegistry());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(threadEClass, QThread.class, "Thread", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(threadEClass, ecorePackage.getEBoolean(), "checkRunnable", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, theMachineInterfaceCorePackage.getJavaThread(), "getJavaThread", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, ecorePackage.getELong(), "getThreadID", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, ecorePackage.getEString(), "getThreadName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, ecorePackage.getEInt(), "getThreadPriority", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, ecorePackage.getEDouble(), "getThreadCPUUsage", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, this.getThreadStatus(), "getThreadStatus", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, ecorePackage.getEBoolean(), "isInterrupted", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, ecorePackage.getEBoolean(), "isNative", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, ecorePackage.getEBoolean(), "isSuspended", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, ecorePackage.getEBoolean(), "isThreadDaemon", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(threadInfoEClass, QThreadInfo.class, "ThreadInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreadInfo_ThreadName(), ecorePackage.getEString(), "threadName", null, 1, 1, QThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadId(), ecorePackage.getELong(), "threadId", null, 1, 1, QThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadPriority(), ecorePackage.getEInt(), "threadPriority", null, 1, 1, QThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadCPUUsage(), ecorePackage.getEDouble(), "threadCPUUsage", null, 1, 1, QThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadStatus(), this.getThreadStatus(), "threadStatus", null, 1, 1, QThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadRunnable(), ecorePackage.getEBoolean(), "threadRunnable", null, 1, 1, QThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadInterrupted(), ecorePackage.getEBoolean(), "threadInterrupted", null, 1, 1, QThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadNative(), ecorePackage.getEBoolean(), "threadNative", null, 1, 1, QThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadSuspended(), ecorePackage.getEBoolean(), "threadSuspended", null, 1, 1, QThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadDaemon(), ecorePackage.getEBoolean(), "threadDaemon", null, 1, 1, QThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threadManagerEClass, QThreadManager.class, "ThreadManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(threadManagerEClass, this.getThread(), "createThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaRunnable(), "runnable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, this.getThread(), "createThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaRunnable(), "runnable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "daemon", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadManagerEClass, this.getThread(), "currentThread", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, this.getThreadInfo(), "getThreadInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getThread(), "thread", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadManagerEClass, this.getThread(), "listThreads", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, this.getThread(), "lookupThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, this.getThread(), "lookupThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, null, "release", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getThread(), "thread", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getThread(), "thread", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getThread(), "thread", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, null, "suspend", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getThread(), "thread", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(threadStatusEEnum, ThreadStatus.class, "ThreadStatus");
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.NEW);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.RUNNABLE);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.BLOCKED);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.WAITING);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.TIMED_WAITING);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.TERMINATED);

		// Create resource
		createResource(eNS_URI);
	}

} // IntegratedLanguageCorePackageImpl
