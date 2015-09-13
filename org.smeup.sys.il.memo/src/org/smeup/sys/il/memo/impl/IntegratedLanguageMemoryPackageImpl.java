/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
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
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.QResourceListener;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceNotifier;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceSetReader;
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
	private EClass resourceEventEClass = null;
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
	private EClass resourceSetReaderEClass = null;
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
	public EReference getResource_ContextProvider() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Notifier() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
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
	public EReference getResourceEvent_Source() {
		return (EReference)resourceEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceEvent_Type() {
		return (EAttribute)resourceEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEvent_Resource() {
		return (EReference)resourceEventEClass.getEStructuralFeatures().get(2);
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
	public EClass getResourceSetReader() {
		return resourceSetReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceSetReader_Resources() {
		return (EAttribute)resourceSetReaderEClass.getEStructuralFeatures().get(0);
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
		createEReference(resourceEClass, RESOURCE__CONTEXT_PROVIDER);
		createEReference(resourceEClass, RESOURCE__NOTIFIER);
		createEAttribute(resourceEClass, RESOURCE__NAME);

		resourceEventEClass = createEClass(RESOURCE_EVENT);
		createEReference(resourceEventEClass, RESOURCE_EVENT__SOURCE);
		createEAttribute(resourceEventEClass, RESOURCE_EVENT__TYPE);
		createEReference(resourceEventEClass, RESOURCE_EVENT__RESOURCE);

		resourceListenerEClass = createEClass(RESOURCE_LISTENER);

		resourceManagerEClass = createEClass(RESOURCE_MANAGER);

		resourceNotifierEClass = createEClass(RESOURCE_NOTIFIER);

		resourceProviderEClass = createEClass(RESOURCE_PROVIDER);

		resourceReaderEClass = createEClass(RESOURCE_READER);

		resourceSetReaderEClass = createEClass(RESOURCE_SET_READER);
		createEAttribute(resourceSetReaderEClass, RESOURCE_SET_READER__RESOURCES);

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
		ETypeParameter resourceEClass_T = addETypeParameter(resourceEClass, "T");
		ETypeParameter resourceEventEClass_T = addETypeParameter(resourceEventEClass, "T");
		ETypeParameter resourceListenerEClass_T = addETypeParameter(resourceListenerEClass, "T");
		ETypeParameter resourceNotifierEClass_T = addETypeParameter(resourceNotifierEClass, "T");
		ETypeParameter resourceReaderEClass_T = addETypeParameter(resourceReaderEClass, "T");
		ETypeParameter resourceSetReaderEClass_T = addETypeParameter(resourceSetReaderEClass, "T");
		ETypeParameter resourceWriterEClass_T = addETypeParameter(resourceWriterEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		resourceEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		resourceEventEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		resourceListenerEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		resourceNotifierEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		resourceReaderEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		resourceSetReaderEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		resourceWriterEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		resourceEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getNameable());
		resourceManagerEClass.getESuperTypes().add(this.getResourceProvider());
		g1 = createEGenericType(this.getResource());
		EGenericType g2 = createEGenericType(resourceReaderEClass_T);
		g1.getETypeArguments().add(g2);
		resourceReaderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(resourceSetReaderEClass_T);
		g1.getETypeArguments().add(g2);
		resourceSetReaderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(resourceWriterEClass_T);
		g1.getETypeArguments().add(g2);
		resourceWriterEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(resourceEClass, QResource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_ContextProvider(), theIntegratedLanguageCoreCtxPackage.getContextProvider(), null, "contextProvider", null, 1, 1, QResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getResourceNotifier());
		g2 = createEGenericType(resourceEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getResource_Notifier(), g1, null, "notifier", null, 0, 1, QResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 1, 1, QResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(resourceEClass, null, "fireEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceEvent());
		g2 = createEGenericType(resourceEClass_T);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "event", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResourceEventType(), "eventType", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceEventEClass, QResourceEvent.class, "ResourceEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(resourceEventEClass_T);
		initEReference(getResourceEvent_Source(), g1, null, "source", null, 0, 1, QResourceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceEvent_Type(), this.getResourceEventType(), "type", null, 1, 1, QResourceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(resourceEventEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getResourceEvent_Resource(), g1, null, "resource", null, 0, 1, QResourceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(resourceNotifierEClass, QResourceNotifier.class, "ResourceNotifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceNotifierEClass, null, "fireEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceEvent());
		g2 = createEGenericType(resourceNotifierEClass_T);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "event", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceNotifierEClass, null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceListener());
		g2 = createEGenericType(resourceNotifierEClass_T);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceProviderEClass, QResourceProvider.class, "ResourceProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceProviderEClass, null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
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
		addEParameter(op, this.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceSetReader());
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
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceWriter());
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
		addEParameter(op, this.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(resourceReaderEClass, QResourceReader.class, "ResourceReader", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceReaderEClass, ecorePackage.getEBoolean(), "exists", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceReaderEClass, null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nameFilter", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		initEClass(resourceSetReaderEClass, QResourceSetReader.class, "ResourceSetReader", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceSetReader_Resources(), ecorePackage.getEString(), "resources", null, 1, -1, QResourceSetReader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(resourceSetReaderEClass, ecorePackage.getEBoolean(), "exists", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "container", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceSetReaderEClass, null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resource", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nameFilter", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectIterator());
		g2 = createEGenericType(resourceSetReaderEClass_T);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(resourceSetReaderEClass, null, "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resource", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceSetReaderEClass_T);
		initEOperation(op, g1);

		initEClass(resourceWriterEClass, QResourceWriter.class, "ResourceWriter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resourceWriterEClass, null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceWriterEClass, null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceWriterEClass, null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "replace", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resourceEventTypeEEnum, ResourceEventType.class, "ResourceEventType");
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.PRE_SAVE);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.POST_SAVE);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.POST_LOAD);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.PRE_DELETE);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.POST_DELETE);

		initEEnum(scopeEEnum, Scope.class, "Scope");
		addEEnumLiteral(scopeEEnum, Scope.ALL);
		addEEnumLiteral(scopeEEnum, Scope.LIBRARY_LIST);
		addEEnumLiteral(scopeEEnum, Scope.CURRENT_LIBRARY);
		addEEnumLiteral(scopeEEnum, Scope.USER_LIBRARY_LIST);
		addEEnumLiteral(scopeEEnum, Scope.ALL_USER);

		// Create resource
		createResource(eNS_URI);
	}

} //IntegratedLanguageMemoryPackageImpl
