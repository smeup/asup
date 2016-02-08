/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.ctx.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.ContextInjectionStrategy;
import org.smeup.sys.il.core.ctx.QAdapterFactory;
import org.smeup.sys.il.core.ctx.QCapability;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextDescription;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.core.ctx.QIdentity;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxFactory;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.ctx.QPluginRegistry;
import org.smeup.sys.il.core.ctx.QPluginRegistryFactory;
import org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;
import org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl;
import org.smeup.sys.il.core.out.QIntegratedLanguageCoreOutPackage;
import org.smeup.sys.il.core.out.impl.IntegratedLanguageCoreOutPackageImpl;
import org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermPackage;
import org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl;
import org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage;
import org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class IntegratedLanguageCoreCtxPackageImpl extends EPackageImpl implements QIntegratedLanguageCoreCtxPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapterFactoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginRegistryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginRegistryFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contextInjectionStrategyEEnum = null;

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
	 * @see org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageCoreCtxPackageImpl() {
		super(eNS_URI, QIntegratedLanguageCoreCtxFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QIntegratedLanguageCoreCtxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageCoreCtxPackage init() {
		if (isInited) return (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageCoreCtxPackageImpl theIntegratedLanguageCoreCtxPackage = (IntegratedLanguageCoreCtxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageCoreCtxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegratedLanguageCoreCtxPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QMachineInterfaceCorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		IntegratedLanguageCorePackageImpl theIntegratedLanguageCorePackage = (IntegratedLanguageCorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI) instanceof IntegratedLanguageCorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI) : QIntegratedLanguageCorePackage.eINSTANCE);
		IntegratedLanguageCoreMetaPackageImpl theIntegratedLanguageCoreMetaPackage = (IntegratedLanguageCoreMetaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreMetaPackage.eNS_URI) instanceof IntegratedLanguageCoreMetaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreMetaPackage.eNS_URI) : QIntegratedLanguageCoreMetaPackage.eINSTANCE);
		IntegratedLanguageCoreOutPackageImpl theIntegratedLanguageCoreOutPackage = (IntegratedLanguageCoreOutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreOutPackage.eNS_URI) instanceof IntegratedLanguageCoreOutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreOutPackage.eNS_URI) : QIntegratedLanguageCoreOutPackage.eINSTANCE);
		IntegratedLanguageCoreTermPackageImpl theIntegratedLanguageCoreTermPackage = (IntegratedLanguageCoreTermPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreTermPackage.eNS_URI) instanceof IntegratedLanguageCoreTermPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreTermPackage.eNS_URI) : QIntegratedLanguageCoreTermPackage.eINSTANCE);
		IntegratedLanguageDataPackageImpl theIntegratedLanguageDataPackage = (IntegratedLanguageDataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI) instanceof IntegratedLanguageDataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI) : QIntegratedLanguageDataPackage.eINSTANCE);
		IntegratedLanguageDataDefPackageImpl theIntegratedLanguageDataDefPackage = (IntegratedLanguageDataDefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataDefPackage.eNS_URI) instanceof IntegratedLanguageDataDefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataDefPackage.eNS_URI) : QIntegratedLanguageDataDefPackage.eINSTANCE);
		IntegratedLanguageDataTermPackageImpl theIntegratedLanguageDataTermPackage = (IntegratedLanguageDataTermPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataTermPackage.eNS_URI) instanceof IntegratedLanguageDataTermPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataTermPackage.eNS_URI) : QIntegratedLanguageDataTermPackage.eINSTANCE);

		// Create package meta-data objects
		theIntegratedLanguageCoreCtxPackage.createPackageContents();
		theIntegratedLanguageCorePackage.createPackageContents();
		theIntegratedLanguageCoreMetaPackage.createPackageContents();
		theIntegratedLanguageCoreOutPackage.createPackageContents();
		theIntegratedLanguageCoreTermPackage.createPackageContents();
		theIntegratedLanguageDataPackage.createPackageContents();
		theIntegratedLanguageDataDefPackage.createPackageContents();
		theIntegratedLanguageDataTermPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageCoreCtxPackage.initializePackageContents();
		theIntegratedLanguageCorePackage.initializePackageContents();
		theIntegratedLanguageCoreMetaPackage.initializePackageContents();
		theIntegratedLanguageCoreOutPackage.initializePackageContents();
		theIntegratedLanguageCoreTermPackage.initializePackageContents();
		theIntegratedLanguageDataPackage.initializePackageContents();
		theIntegratedLanguageDataDefPackage.initializePackageContents();
		theIntegratedLanguageDataTermPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageCoreCtxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageCoreCtxPackage.eNS_URI, theIntegratedLanguageCoreCtxPackage);
		return theIntegratedLanguageCoreCtxPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdapterFactory() {
		return adapterFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextDescription() {
		return contextDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextProvider() {
		return contextProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPluginRegistry() {
		return pluginRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPluginRegistryFactory() {
		return pluginRegistryFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentity() {
		return identityEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContextInjectionStrategy() {
		return contextInjectionStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIntegratedLanguageCoreCtxFactory getIntegratedLanguageCoreCtxFactory() {
		return (QIntegratedLanguageCoreCtxFactory)getEFactoryInstance();
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
		adapterFactoryEClass = createEClass(ADAPTER_FACTORY);

		capabilityEClass = createEClass(CAPABILITY);

		contextEClass = createEClass(CONTEXT);

		contextDescriptionEClass = createEClass(CONTEXT_DESCRIPTION);

		contextProviderEClass = createEClass(CONTEXT_PROVIDER);

		pluginRegistryEClass = createEClass(PLUGIN_REGISTRY);

		pluginRegistryFactoryEClass = createEClass(PLUGIN_REGISTRY_FACTORY);

		identityEClass = createEClass(IDENTITY);

		// Create enums
		contextInjectionStrategyEEnum = createEEnum(CONTEXT_INJECTION_STRATEGY);
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
		QMachineInterfaceCorePackage theMachineInterfaceCorePackage = (QMachineInterfaceCorePackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter capabilityEClass_T = addETypeParameter(capabilityEClass, "T");
		ETypeParameter pluginRegistryEClass_T = addETypeParameter(pluginRegistryEClass, "T");
		ETypeParameter identityEClass_T = addETypeParameter(identityEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theIntegratedLanguageCorePackage.getObject());
		capabilityEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObject());
		identityEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		capabilityEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		g1 = createEGenericType(this.getCapability());
		EGenericType g2 = createEGenericType(identityEClass_T);
		g1.getETypeArguments().add(g2);
		identityEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(adapterFactoryEClass, QAdapterFactory.class, "AdapterFactory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(adapterFactoryEClass, null, "getAdapter", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaObject());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "adaptable", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "adapterType", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(capabilityEClass, QCapability.class, "Capability", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(capabilityEClass, theMachineInterfaceCorePackage.getJavaURI(), "getObjectAddress", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(capabilityEClass, ecorePackage.getEString(), "getObjectID", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextEClass, QContext.class, "Context", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(contextEClass, null, "close", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, this.getContext(), "createChildContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, this.getContext(), "createChildContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContextInjectionStrategy(), "injectionStrategy", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, this.getContext(), "createChildContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContextDescription(), "contextDescription", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContextInjectionStrategy(), "injectionStrategy", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, null, "get", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "clazz", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(contextEClass, null, "getAdapter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaObject());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEJavaObject(), "adaptable", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "adapter", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		addEOperation(contextEClass, this.getContextDescription(), "getContextDescription", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contextEClass, ecorePackage.getEString(), "getID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, null, "inject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contextEClass, ecorePackage.getEBoolean(), "isClosed", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, null, "loadClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "address", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(contextEClass, null, "loadClassByName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "className", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(contextEClass, null, "invoke", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "A");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaAnnotation());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "qualifier", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, null, "make", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(contextEClass, null, "registerAdapterFactory", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaObject());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getAdapterFactory(), "factory", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "adapterType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, ecorePackage.getEString(), "resolveAlias", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, ecorePackage.getEString(), "resolveAliases", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "values", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, null, "set", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, null, "set", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextDescriptionEClass, QContextDescription.class, "ContextDescription", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(contextDescriptionEClass, ecorePackage.getEString(), "getCurrentLibrary", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contextDescriptionEClass, ecorePackage.getEString(), "getLibraryPath", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contextDescriptionEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contextDescriptionEClass, ecorePackage.getEString(), "getSystemLibrary", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contextDescriptionEClass, ecorePackage.getEString(), "getTemporaryLibrary", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextProviderEClass, QContextProvider.class, "ContextProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(contextProviderEClass, this.getContext(), "getContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pluginRegistryEClass, QPluginRegistry.class, "PluginRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(pluginRegistryEClass, null, "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(pluginRegistryEClass_T);
		initEOperation(op, g1);

		op = addEOperation(pluginRegistryEClass, null, "list", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(pluginRegistryEClass_T);
		initEOperation(op, g1);

		op = addEOperation(pluginRegistryEClass, null, "lookupByVendorVersion", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "vendor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "version", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(pluginRegistryEClass_T);
		initEOperation(op, g1);

		initEClass(pluginRegistryFactoryEClass, QPluginRegistryFactory.class, "PluginRegistryFactory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(pluginRegistryFactoryEClass, null, "createPluginRegistry", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getPluginRegistry());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(identityEClass, QIdentity.class, "Identity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(identityEClass, theMachineInterfaceCorePackage.getJavaPrincipal(), "getJavaPrincipal", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(contextInjectionStrategyEEnum, ContextInjectionStrategy.class, "ContextInjectionStrategy");
		addEEnumLiteral(contextInjectionStrategyEEnum, ContextInjectionStrategy.LOCAL);
		addEEnumLiteral(contextInjectionStrategyEEnum, ContextInjectionStrategy.REMOTE);
	}

} // IntegratedLanguageCoreCtxPackageImpl
