/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.source.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.dk.source.QDevelopmentKitSourceFactory;
import org.smeup.sys.dk.source.QDevelopmentKitSourcePackage;
import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.QProjectDef;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.dk.source.QSourceNode;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.java.QIntegratedLanguageCoreJavaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class DevelopmentKitSourcePackageImpl extends EPackageImpl implements QDevelopmentKitSourcePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEntryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceNodeEClass = null;

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
	 * @see org.smeup.sys.dk.source.QDevelopmentKitSourcePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DevelopmentKitSourcePackageImpl() {
		super(eNS_URI, QDevelopmentKitSourceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QDevelopmentKitSourcePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDevelopmentKitSourcePackage init() {
		if (isInited) return (QDevelopmentKitSourcePackage)EPackage.Registry.INSTANCE.getEPackage(QDevelopmentKitSourcePackage.eNS_URI);

		// Obtain or create and register package
		DevelopmentKitSourcePackageImpl theDevelopmentKitSourcePackage = (DevelopmentKitSourcePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DevelopmentKitSourcePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DevelopmentKitSourcePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDevelopmentKitSourcePackage.createPackageContents();

		// Initialize created meta-data
		theDevelopmentKitSourcePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDevelopmentKitSourcePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDevelopmentKitSourcePackage.eNS_URI, theDevelopmentKitSourcePackage);
		return theDevelopmentKitSourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectDef() {
		return projectDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectDef_Name() {
		return (EAttribute)projectDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectDef_Text() {
		return (EAttribute)projectDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceEntry() {
		return sourceEntryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceManager() {
		return sourceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceNode() {
		return sourceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDevelopmentKitSourceFactory getDevelopmentKitSourceFactory() {
		return (QDevelopmentKitSourceFactory)getEFactoryInstance();
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
		projectEClass = createEClass(PROJECT);

		projectDefEClass = createEClass(PROJECT_DEF);
		createEAttribute(projectDefEClass, PROJECT_DEF__NAME);
		createEAttribute(projectDefEClass, PROJECT_DEF__TEXT);

		sourceEntryEClass = createEClass(SOURCE_ENTRY);

		sourceManagerEClass = createEClass(SOURCE_MANAGER);

		sourceNodeEClass = createEClass(SOURCE_NODE);
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
		projectEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObjectNameable());
		projectEClass.getESuperTypes().add(this.getSourceNode());
		projectDefEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		sourceEntryEClass.getESuperTypes().add(this.getSourceNode());
		sourceNodeEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(projectEClass, QProject.class, "Project", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(projectEClass, ecorePackage.getEString(), "getText", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(projectDefEClass, QProjectDef.class, "ProjectDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectDef_Name(), ecorePackage.getEString(), "name", null, 1, 1, QProjectDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectDef_Text(), ecorePackage.getEString(), "text", null, 1, 1, QProjectDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceEntryEClass, QSourceEntry.class, "SourceEntry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(sourceEntryEClass, theIntegratedLanguageCoreJavaPackage.getJavaInputStream(), "getInputStream", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIntegratedLanguageCoreJavaPackage.getJavaIOException());

		initEClass(sourceManagerEClass, QSourceManager.class, "SourceManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(sourceManagerEClass, this.getProject(), "createProject", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProjectDef(), "project", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "replace", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIntegratedLanguageCoreJavaPackage.getJavaIOException());

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "createChildEntry", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSourceNode(), "parent", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "replace", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreJavaPackage.getJavaInputStream(), "content", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIntegratedLanguageCoreJavaPackage.getJavaIOException());

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "createObjectEntry", 1, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		EGenericType g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "project", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "replace", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreJavaPackage.getJavaInputStream(), "content", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIntegratedLanguageCoreJavaPackage.getJavaIOException());

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "createObjectEntry", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "project", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "replace", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "content", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIntegratedLanguageCoreJavaPackage.getJavaIOException());

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "getChildEntry", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSourceNode(), "parent", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "getObjectEntry", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "project", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sourceManagerEClass, this.getProject(), "getProject", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "project", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "listChildEntries", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSourceNode(), "parent", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "listObjectEntries", 0, -1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "project", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nameFilter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sourceManagerEClass, this.getProject(), "listProjects", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sourceManagerEClass, null, "refreshEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSourceEntry(), "entry", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sourceManagerEClass, null, "removeEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSourceEntry(), "entry", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIntegratedLanguageCoreJavaPackage.getJavaIOException());

		initEClass(sourceNodeEClass, QSourceNode.class, "SourceNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(sourceNodeEClass, theIntegratedLanguageCoreJavaPackage.getJavaURI(), "getLocation", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sourceNodeEClass, this.getSourceNode(), "getParent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sourceNodeEClass, this.getProject(), "getProject", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sourceNodeEClass, ecorePackage.getEBoolean(), "isRoot", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // DevelopmentKitSourcePackageImpl
