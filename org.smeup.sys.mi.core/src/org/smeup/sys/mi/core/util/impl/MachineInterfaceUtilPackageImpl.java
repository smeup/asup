/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.mi.core.util.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;

import org.smeup.sys.mi.core.impl.MachineInterfaceCorePackageImpl;

import org.smeup.sys.mi.core.util.QFiles;
import org.smeup.sys.mi.core.util.QLists;
import org.smeup.sys.mi.core.util.QMachineInterfaceUtilFactory;
import org.smeup.sys.mi.core.util.QMachineInterfaceUtilPackage;
import org.smeup.sys.mi.core.util.QSingleton;
import org.smeup.sys.mi.core.util.QStreams;
import org.smeup.sys.mi.core.util.QStrings;
import org.smeup.sys.mi.core.util.QThreads;
import org.smeup.sys.mi.core.util.QURIs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MachineInterfaceUtilPackageImpl extends EPackageImpl implements QMachineInterfaceUtilPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urIsEClass = null;

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
	 * @see org.smeup.sys.mi.core.util.QMachineInterfaceUtilPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MachineInterfaceUtilPackageImpl() {
		super(eNS_URI, QMachineInterfaceUtilFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QMachineInterfaceUtilPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QMachineInterfaceUtilPackage init() {
		if (isInited) return (QMachineInterfaceUtilPackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceUtilPackage.eNS_URI);

		// Obtain or create and register package
		MachineInterfaceUtilPackageImpl theMachineInterfaceUtilPackage = (MachineInterfaceUtilPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MachineInterfaceUtilPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MachineInterfaceUtilPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MachineInterfaceCorePackageImpl theMachineInterfaceCorePackage = (MachineInterfaceCorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI) instanceof MachineInterfaceCorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI) : QMachineInterfaceCorePackage.eINSTANCE);

		// Create package meta-data objects
		theMachineInterfaceUtilPackage.createPackageContents();
		theMachineInterfaceCorePackage.createPackageContents();

		// Initialize created meta-data
		theMachineInterfaceUtilPackage.initializePackageContents();
		theMachineInterfaceCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMachineInterfaceUtilPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QMachineInterfaceUtilPackage.eNS_URI, theMachineInterfaceUtilPackage);
		return theMachineInterfaceUtilPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFiles() {
		return filesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStreams() {
		return streamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLists() {
		return listsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleton() {
		return singletonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrings() {
		return stringsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreads() {
		return threadsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURIs() {
		return urIsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMachineInterfaceUtilFactory getMachineInterfaceUtilFactory() {
		return (QMachineInterfaceUtilFactory)getEFactoryInstance();
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
		filesEClass = createEClass(FILES);

		streamsEClass = createEClass(STREAMS);

		listsEClass = createEClass(LISTS);

		singletonEClass = createEClass(SINGLETON);

		stringsEClass = createEClass(STRINGS);

		threadsEClass = createEClass(THREADS);

		urIsEClass = createEClass(UR_IS);
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
		QMachineInterfaceCorePackage theMachineInterfaceCorePackage = (QMachineInterfaceCorePackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter singletonEClass_S = addETypeParameter(singletonEClass, "S");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaObject());
		singletonEClass_S.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getSingleton());
		EGenericType g2 = createEGenericType(this.getStrings());
		g1.getETypeArguments().add(g2);
		stringsEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSingleton());
		g2 = createEGenericType(this.getThreads());
		g1.getETypeArguments().add(g2);
		threadsEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(filesEClass, QFiles.class, "Files", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(filesEClass, ecorePackage.getEString(), "getBaseName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(streamsEClass, QStreams.class, "Streams", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(streamsEClass, null, "copy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaInputStream(), "input", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listsEClass, QLists.class, "Lists", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(listsEClass, null, "addFirst", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listsEClass, null, "addLast", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listsEClass, null, "addBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "oldElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "newElement", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listsEClass, null, "addAfter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "oldElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "newElement", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(singletonEClass, QSingleton.class, "Singleton", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringsEClass, QStrings.class, "Strings", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "appendChars", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "chars", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "times", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "before", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEBooleanObject(), "checkEquals", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string2", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "escape", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "firstToUpper", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "firstToLower", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEBooleanObject(), "isEmptyTrim", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEBooleanObject(), "isOneOf", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "values", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "left", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfChars", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "lSet", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfChars", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "lSet", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfChars", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filler", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "removeFirstChar", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "removeLastChar", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "right", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfChars", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "rSet", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfChars", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "rSet", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfChars", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filler", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfChars", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filler", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "trimL", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "trimR", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(threadsEClass, QThreads.class, "Threads", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(threadsEClass, theMachineInterfaceCorePackage.getJavaThread(), "listThreads", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theMachineInterfaceCorePackage.getJavaThread(), "listThreads", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "threadGroup", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theMachineInterfaceCorePackage.getJavaThread(), "listThreads", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaThreadGroup(), "threadGroup", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadsEClass, theMachineInterfaceCorePackage.getJavaThreadInfo(), "listThreadInfos", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadsEClass, theMachineInterfaceCorePackage.getJavaThreadGroup(), "listThreadGroups", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theMachineInterfaceCorePackage.getJavaThread(), "lookupBlockingThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaThread(), "thread", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theMachineInterfaceCorePackage.getJavaThread(), "lookupLockingThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theMachineInterfaceCorePackage.getJavaThread(), "lookupThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theMachineInterfaceCorePackage.getJavaThread(), "lookupThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theMachineInterfaceCorePackage.getJavaThread(), "lookupThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaThreadInfo(), "info", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theMachineInterfaceCorePackage.getJavaThreadGroup(), "lookupThreadGroup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theMachineInterfaceCorePackage.getJavaThreadInfo(), "lookupThreadInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theMachineInterfaceCorePackage.getJavaThreadInfo(), "lookupThreadInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theMachineInterfaceCorePackage.getJavaThreadInfo(), "lookupThreadInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaThread(), "thread", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(urIsEClass, QURIs.class, "URIs", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(urIsEClass, ecorePackage.getEString(), "getBaseName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaURI(), "uri", 1, 1, IS_UNIQUE, IS_ORDERED);
	}

} //MachineInterfaceUtilPackageImpl
