/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.out.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl;
import org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl;
import org.smeup.sys.il.core.java.QIntegratedLanguageCoreJavaPackage;
import org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;
import org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl;
import org.smeup.sys.il.core.out.QIntegratedLanguageCoreOutFactory;
import org.smeup.sys.il.core.out.QIntegratedLanguageCoreOutPackage;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QObjectWriterFactory;
import org.smeup.sys.il.core.out.QObjectWriterFactoryRegistry;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermPackage;
import org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class IntegratedLanguageCoreOutPackageImpl extends EPackageImpl implements QIntegratedLanguageCoreOutPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectWriterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectWriterFactoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectWriterFactoryRegistryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputManagerEClass = null;

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
	 * @see org.smeup.sys.il.core.out.QIntegratedLanguageCoreOutPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageCoreOutPackageImpl() {
		super(eNS_URI, QIntegratedLanguageCoreOutFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QIntegratedLanguageCoreOutPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageCoreOutPackage init() {
		if (isInited) return (QIntegratedLanguageCoreOutPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreOutPackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageCoreOutPackageImpl theIntegratedLanguageCoreOutPackage = (IntegratedLanguageCoreOutPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageCoreOutPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegratedLanguageCoreOutPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IntegratedLanguageCorePackageImpl theIntegratedLanguageCorePackage = (IntegratedLanguageCorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI) instanceof IntegratedLanguageCorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI) : QIntegratedLanguageCorePackage.eINSTANCE);
		IntegratedLanguageCoreCtxPackageImpl theIntegratedLanguageCoreCtxPackage = (IntegratedLanguageCoreCtxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI) instanceof IntegratedLanguageCoreCtxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI) : QIntegratedLanguageCoreCtxPackage.eINSTANCE);
		IntegratedLanguageCoreJavaPackageImpl theIntegratedLanguageCoreJavaPackage = (IntegratedLanguageCoreJavaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreJavaPackage.eNS_URI) instanceof IntegratedLanguageCoreJavaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreJavaPackage.eNS_URI) : QIntegratedLanguageCoreJavaPackage.eINSTANCE);
		IntegratedLanguageCoreMetaPackageImpl theIntegratedLanguageCoreMetaPackage = (IntegratedLanguageCoreMetaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreMetaPackage.eNS_URI) instanceof IntegratedLanguageCoreMetaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreMetaPackage.eNS_URI) : QIntegratedLanguageCoreMetaPackage.eINSTANCE);
		IntegratedLanguageCoreTermPackageImpl theIntegratedLanguageCoreTermPackage = (IntegratedLanguageCoreTermPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreTermPackage.eNS_URI) instanceof IntegratedLanguageCoreTermPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreTermPackage.eNS_URI) : QIntegratedLanguageCoreTermPackage.eINSTANCE);

		// Create package meta-data objects
		theIntegratedLanguageCoreOutPackage.createPackageContents();
		theIntegratedLanguageCorePackage.createPackageContents();
		theIntegratedLanguageCoreCtxPackage.createPackageContents();
		theIntegratedLanguageCoreJavaPackage.createPackageContents();
		theIntegratedLanguageCoreMetaPackage.createPackageContents();
		theIntegratedLanguageCoreTermPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageCoreOutPackage.initializePackageContents();
		theIntegratedLanguageCorePackage.initializePackageContents();
		theIntegratedLanguageCoreCtxPackage.initializePackageContents();
		theIntegratedLanguageCoreJavaPackage.initializePackageContents();
		theIntegratedLanguageCoreMetaPackage.initializePackageContents();
		theIntegratedLanguageCoreTermPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageCoreOutPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageCoreOutPackage.eNS_URI, theIntegratedLanguageCoreOutPackage);
		return theIntegratedLanguageCoreOutPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectWriter() {
		return objectWriterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectWriterFactory() {
		return objectWriterFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectWriterFactoryRegistry() {
		return objectWriterFactoryRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputManager() {
		return outputManagerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIntegratedLanguageCoreOutFactory getIntegratedLanguageCoreOutFactory() {
		return (QIntegratedLanguageCoreOutFactory)getEFactoryInstance();
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
		objectWriterEClass = createEClass(OBJECT_WRITER);

		objectWriterFactoryEClass = createEClass(OBJECT_WRITER_FACTORY);

		objectWriterFactoryRegistryEClass = createEClass(OBJECT_WRITER_FACTORY_REGISTRY);

		outputManagerEClass = createEClass(OUTPUT_MANAGER);
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
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QIntegratedLanguageCoreJavaPackage theIntegratedLanguageCoreJavaPackage = (QIntegratedLanguageCoreJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreJavaPackage.eNS_URI);
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theIntegratedLanguageCoreCtxPackage.getPluginRegistry());
		EGenericType g2 = createEGenericType(this.getObjectWriterFactory());
		g1.getETypeArguments().add(g2);
		objectWriterFactoryRegistryEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(objectWriterEClass, QObjectWriter.class, "ObjectWriter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(objectWriterEClass, null, "flush", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectWriterEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(objectWriterEClass, null, "write", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCorePackage.getObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIntegratedLanguageCoreJavaPackage.getJavaIOException());

		initEClass(objectWriterFactoryEClass, QObjectWriterFactory.class, "ObjectWriterFactory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(objectWriterFactoryEClass, this.getObjectWriter(), "createObjectWriter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectWriterFactoryRegistryEClass, QObjectWriterFactoryRegistry.class, "ObjectWriterFactoryRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputManagerEClass, QOutputManager.class, "OutputManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(outputManagerEClass, this.getObjectWriter(), "getDefaultWriter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(outputManagerEClass, this.getObjectWriter(), "getObjectWriter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(outputManagerEClass, null, "registerWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObjectWriter(), "writer", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(outputManagerEClass, null, "setDefaultWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
	}

} // IntegratedLanguageCoreOutPackageImpl
