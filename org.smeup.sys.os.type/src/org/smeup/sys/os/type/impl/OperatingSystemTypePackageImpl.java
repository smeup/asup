/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.type.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.dk.core.QDevelopmentKitCorePackage;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.os.core.QOperatingSystemCorePackage;
import org.smeup.sys.os.type.QOperatingSystemTypeFactory;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeContainer;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedContainer;
import org.smeup.sys.os.type.QTypedObject;
import org.smeup.sys.os.type.QTypedRef;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemTypePackageImpl extends EPackageImpl implements QOperatingSystemTypePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedContainerEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedObjectEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeContainerEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeRegistryEClass = null;
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
	 * @see org.smeup.sys.os.type.QOperatingSystemTypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemTypePackageImpl() {
		super(eNS_URI, QOperatingSystemTypeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QOperatingSystemTypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemTypePackage init() {
		if (isInited) return (QOperatingSystemTypePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemTypePackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemTypePackageImpl theOperatingSystemTypePackage = (OperatingSystemTypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemTypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemTypePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QOperatingSystemCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemTypePackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemTypePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemTypePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemTypePackage.eNS_URI, theOperatingSystemTypePackage);
		return theOperatingSystemTypePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_TypedClassName() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Persistent() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypedContainer() {
		return typedContainerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypedObject() {
		return typedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedObject_Application() {
		return (EAttribute)typedObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedObject_Facets() {
		return (EReference)typedObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypedObject_CreationInfo() {
		return (EReference)typedObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedRef() {
		return typedRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedRef_Library() {
		return (EAttribute)typedRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedRef_Name() {
		return (EAttribute)typedRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeContainer() {
		return typeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedObject_Name() {
		return (EAttribute)typedObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedObject_Text() {
		return (EAttribute)typedObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeRegistry() {
		return typeRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemTypeFactory getOperatingSystemTypeFactory() {
		return (QOperatingSystemTypeFactory)getEFactoryInstance();
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
		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__TYPED_CLASS_NAME);
		createEAttribute(typeEClass, TYPE__PERSISTENT);

		typeRegistryEClass = createEClass(TYPE_REGISTRY);

		typedContainerEClass = createEClass(TYPED_CONTAINER);

		typedObjectEClass = createEClass(TYPED_OBJECT);
		createEAttribute(typedObjectEClass, TYPED_OBJECT__APPLICATION);
		createEReference(typedObjectEClass, TYPED_OBJECT__FACETS);
		createEAttribute(typedObjectEClass, TYPED_OBJECT__NAME);
		createEAttribute(typedObjectEClass, TYPED_OBJECT__TEXT);
		createEReference(typedObjectEClass, TYPED_OBJECT__CREATION_INFO);

		typedRefEClass = createEClass(TYPED_REF);
		createEAttribute(typedRefEClass, TYPED_REF__LIBRARY);
		createEAttribute(typedRefEClass, TYPED_REF__NAME);

		typeContainerEClass = createEClass(TYPE_CONTAINER);
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
		QIntegratedLanguageCoreMetaPackage theIntegratedLanguageCoreMetaPackage = (QIntegratedLanguageCoreMetaPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreMetaPackage.eNS_URI);
		QOperatingSystemCorePackage theOperatingSystemCorePackage = (QOperatingSystemCorePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter typeEClass_T = addETypeParameter(typeEClass, "T");
		ETypeParameter typedContainerEClass_T = addETypeParameter(typedContainerEClass, "T");
		ETypeParameter typedRefEClass_T = addETypeParameter(typedRefEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getTypedObject());
		typeEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getTypedObject());
		typedContainerEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getTypedObject());
		typedRefEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		typeEClass.getESuperTypes().add(this.getTypedObject());
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObjectContainer());
		EGenericType g2 = createEGenericType(typedContainerEClass_T);
		g1.getETypeArguments().add(g2);
		typedContainerEClass.getEGenericSuperTypes().add(g1);
		typedObjectEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObjectNameable());
		typedRefEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		g1 = createEGenericType(this.getTypedContainer());
		g2 = createEGenericType(this.getType());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		typeContainerEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(typeEClass, QType.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_TypedClassName(), ecorePackage.getEString(), "typedClassName", null, 1, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_Persistent(), ecorePackage.getEBoolean(), "persistent", "true", 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(typeEClass, null, "getTypedClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(typeEClass_T);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(typeRegistryEClass, QTypeRegistry.class, "TypeRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(typeRegistryEClass, null, "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "typedClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getType());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(typeRegistryEClass, null, "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getType());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(typeRegistryEClass, null, "list", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getType());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(typedContainerEClass, QTypedContainer.class, "TypedContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedObjectEClass, QTypedObject.class, "TypedObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedObject_Application(), ecorePackage.getEString(), "application", null, 0, 1, QTypedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedObject_Facets(), theIntegratedLanguageCoreMetaPackage.getFacet(), null, "facets", null, 0, -1, QTypedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, QTypedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedObject_Text(), ecorePackage.getEString(), "text", null, 0, 1, QTypedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedObject_CreationInfo(), theOperatingSystemCorePackage.getCreationInfo(), null, "creationInfo", null, 0, 1, QTypedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(typedObjectEClass, ecorePackage.getEString(), "getAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(typedObjectEClass, ecorePackage.getEString(), "getLibrary", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typedRefEClass, QTypedRef.class, "TypedRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedRef_Library(), ecorePackage.getEString(), "library", null, 1, 1, QTypedRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedRef_Name(), ecorePackage.getEString(), "name", null, 0, 1, QTypedRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeContainerEClass, QTypeContainer.class, "TypeContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// il-data
		createIldataAnnotations();
		// dk-core
		createDkcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>il-data</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIldataAnnotations() {
		String source = "il-data";	
		addAnnotation
		  (typedObjectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "length", "5"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (typedObjectEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getTypedObject_Application(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getTypedObject_Name(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getTypedObject_Text(), 
		   source, 
		   new String[] {
			 "length", "50"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getTypedObject_CreationInfo(), 
		   source, 
		   new String[] {
			 "length", "30"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getTypedRef_Library(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getTypedRef_Name(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });
	}

	/**
	 * Initializes the annotations for <b>dk-core</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDkcoreAnnotations() {
		String source = "dk-core";	
		addAnnotation
		  (getTypedObject_Facets(), 
		   source, 
		   new String[] {
			 "text", "Per ora metto i facets sul typedObject, ma non ne sono tanto sicuro\nAlmeno per\u00f2 posso annotare gli oggetti tipizzati"
		   },
		   new URI[] {
			 URI.createURI(QDevelopmentKitCorePackage.eNS_URI).appendFragment("//Comment")
		   });
	}

} // OSTypePackageImpl
