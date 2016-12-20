/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.memo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage;
import org.smeup.sys.il.memo.QIntegratedLanguageMemoryFactory;
import org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage;
import org.smeup.sys.il.memo.QResource;
import org.smeup.sys.il.memo.QResourceDef;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.QResourceHandler;
import org.smeup.sys.il.memo.QResourceListener;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceNotifier;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.ResourceEventType;
import org.smeup.sys.il.memo.Scope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegratedLanguageMemoryPackageImpl extends EPackageImpl implements QIntegratedLanguageMemoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceDefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEventEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceHandlerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceListenerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceManagerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceNotifierEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceProviderEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceReaderEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceWriterEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceEventTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeEEnum = null;
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
	 * @see org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageMemoryPackageImpl() {
		super(eNS_URI, QIntegratedLanguageMemoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QIntegratedLanguageMemoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageMemoryPackage init() {
		if (isInited) return (QIntegratedLanguageMemoryPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageMemoryPackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageMemoryPackageImpl theIntegratedLanguageMemoryPackage = (IntegratedLanguageMemoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageMemoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegratedLanguageMemoryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageExpressionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIntegratedLanguageMemoryPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageMemoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageMemoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageMemoryPackage.eNS_URI, theIntegratedLanguageMemoryPackage);
		return theIntegratedLanguageMemoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceDef() {
		return resourceDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDef_Name() {
		return (EAttribute)resourceDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDef_Text() {
		return (EAttribute)resourceDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceEvent() {
		return resourceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceHandler() {
		return resourceHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceHandler_ContextProvider() {
		return (EReference)resourceHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceListener() {
		return resourceListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceManager() {
		return resourceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceNotifier() {
		return resourceNotifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceProvider() {
		return resourceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceReader() {
		return resourceReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceReader_Notifier() {
		return (EReference)resourceReaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceWriter() {
		return resourceWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceEventType() {
		return resourceEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScope() {
		return scopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIntegratedLanguageMemoryFactory getIntegratedLanguageMemoryFactory() {
		return (QIntegratedLanguageMemoryFactory)getEFactoryInstance();
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
		resourceEClass = createEClass(RESOURCE);

		resourceDefEClass = createEClass(RESOURCE_DEF);
		createEAttribute(resourceDefEClass, RESOURCE_DEF__NAME);
		createEAttribute(resourceDefEClass, RESOURCE_DEF__TEXT);

		resourceEventEClass = createEClass(RESOURCE_EVENT);

		resourceHandlerEClass = createEClass(RESOURCE_HANDLER);
		createEReference(resourceHandlerEClass, RESOURCE_HANDLER__CONTEXT_PROVIDER);

		resourceListenerEClass = createEClass(RESOURCE_LISTENER);

		resourceManagerEClass = createEClass(RESOURCE_MANAGER);

		resourceNotifierEClass = createEClass(RESOURCE_NOTIFIER);

		resourceProviderEClass = createEClass(RESOURCE_PROVIDER);

		resourceReaderEClass = createEClass(RESOURCE_READER);
		createEReference(resourceReaderEClass, RESOURCE_READER__NOTIFIER);

		resourceWriterEClass = createEClass(RESOURCE_WRITER);

		// Create enums
		resourceEventTypeEEnum = createEEnum(RESOURCE_EVENT_TYPE);
		scopeEEnum = createEEnum(SCOPE);
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
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);
		QIntegratedLanguageExpressionPackage theIntegratedLanguageExpressionPackage = (QIntegratedLanguageExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageExpressionPackage.eNS_URI);

		// Create type parameters
		ETypeParameter resourceEventEClass_T = addETypeParameter(resourceEventEClass, "T");
		ETypeParameter resourceHandlerEClass_T = addETypeParameter(resourceHandlerEClass, "T");
		ETypeParameter resourceListenerEClass_T = addETypeParameter(resourceListenerEClass, "T");
		ETypeParameter resourceNotifierEClass_T = addETypeParameter(resourceNotifierEClass, "T");
		ETypeParameter resourceReaderEClass_T = addETypeParameter(resourceReaderEClass, "T");
		ETypeParameter resourceWriterEClass_T = addETypeParameter(resourceWriterEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		resourceEventEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		resourceHandlerEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		resourceListenerEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		resourceNotifierEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		resourceReaderEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		resourceWriterEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		resourceEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getNameable());
		resourceDefEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObjectNameable());
		resourceHandlerEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		resourceManagerEClass.getESuperTypes().add(this.getResourceProvider());
		g1 = createEGenericType(this.getResourceHandler());
		EGenericType g2 = createEGenericType(resourceReaderEClass_T);
		g1.getETypeArguments().add(g2);
		resourceReaderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(resourceWriterEClass_T);
		g1.getETypeArguments().add(g2);
		resourceWriterEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(resourceEClass, QResource.class, "Resource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceDefEClass, QResourceDef.class, "ResourceDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceDef_Name(), ecorePackage.getEString(), "name", null, 1, 1, QResourceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceDef_Text(), ecorePackage.getEString(), "text", null, 1, 1, QResourceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEventEClass, QResourceEvent.class, "ResourceEvent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(resourceEventEClass, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "getContextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resourceEventEClass, this.getResourceEventType(), "getEventType", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resourceEventEClass, ecorePackage.getEString(), "getNewName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resourceEventEClass, ecorePackage.getEString(), "getOldName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resourceEventEClass, this.getResource(), "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(resourceEventEClass, null, "getSource", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceEventEClass_T);
		initEOperation(op, g1);

		initEClass(resourceHandlerEClass, QResourceHandler.class, "ResourceHandler", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceHandler_ContextProvider(), theIntegratedLanguageCoreCtxPackage.getContextProvider(), null, "contextProvider", null, 1, 1, QResourceHandler.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceListenerEClass, QResourceListener.class, "ResourceListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceListenerEClass, null, "handleEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceEvent());
		g2 = createEGenericType(resourceListenerEClass_T);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "event", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceManagerEClass, QResourceManager.class, "ResourceManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceManagerEClass, null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceListener());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceManagerEClass, null, "registerProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResourceProvider(), "provider", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceManagerEClass, null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resource", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceManagerEClass, null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resource", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(resourceNotifierEClass, QResourceNotifier.class, "ResourceNotifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceNotifierEClass, null, "fireEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceEvent());
		g2 = createEGenericType(resourceNotifierEClass_T);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "event", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceNotifierEClass, null, "getListeners", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceListener());
		g2 = createEGenericType(resourceNotifierEClass_T);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceNotifierEClass, null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceListener());
		g2 = createEGenericType(resourceNotifierEClass_T);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceProviderEClass, QResourceProvider.class, "ResourceProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceProviderEClass, null, "createResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResourceDef(), "resource", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "replace", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceProviderEClass, null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resource", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceProviderEClass, null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resources", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceProviderEClass, null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resource", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(resourceReaderEClass, QResourceReader.class, "ResourceReader", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getResourceNotifier());
		g2 = createEGenericType(resourceReaderEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getResourceReader_Notifier(), g1, null, "notifier", null, 0, 1, QResourceReader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(resourceReaderEClass, ecorePackage.getEBoolean(), "exists", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceReaderEClass, null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectIterator());
		g2 = createEGenericType(resourceReaderEClass_T);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceReaderEClass, null, "findByExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageExpressionPackage.getPredicateExpression(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectIterator());
		g2 = createEGenericType(resourceReaderEClass_T);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceReaderEClass, null, "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceReaderEClass_T);
		initEOperation(op, g1);

		initEClass(resourceWriterEClass, QResourceWriter.class, "ResourceWriter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceWriterEClass, null, "copy", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_T);
		initEOperation(op, g1);

		op = addEOperation(resourceWriterEClass, null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resourceWriterEClass, this.getResource(), "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceWriterEClass, null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceWriterEClass, null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "replace", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceWriterEClass, null, "rename", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "newName", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resourceEventTypeEEnum, ResourceEventType.class, "ResourceEventType");
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.PRE_SAVE);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.POST_SAVE);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.PRE_DELETE);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.POST_DELETE);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.PRE_RENAME);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.POST_RENAME);

		initEEnum(scopeEEnum, Scope.class, "Scope");
		addEEnumLiteral(scopeEEnum, Scope.ALL);
		addEEnumLiteral(scopeEEnum, Scope.LIBRARY_LIST);
		addEEnumLiteral(scopeEEnum, Scope.CURRENT_LIBRARY);
		addEEnumLiteral(scopeEEnum, Scope.USER_LIBRARY_LIST);
		addEEnumLiteral(scopeEEnum, Scope.ALL_USER);
		addEEnumLiteral(scopeEEnum, Scope.SYSTEM_LIBRARY);
		addEEnumLiteral(scopeEEnum, Scope.OTHER);

		// Create resource
		createResource(eNS_URI);
	}

} //IntegratedLanguageMemoryPackageImpl
