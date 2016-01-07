/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
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
import org.smeup.sys.il.core.ConversionStatus;
import org.smeup.sys.il.core.FormatType;
import org.smeup.sys.il.core.QAnnotation;
import org.smeup.sys.il.core.QAnnotationScope;
import org.smeup.sys.il.core.QAnnotationTest;
import org.smeup.sys.il.core.QConversion;
import org.smeup.sys.il.core.QDerived;
import org.smeup.sys.il.core.QFormat;
import org.smeup.sys.il.core.QIntegratedLanguageCoreFactory;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.QNameable;
import org.smeup.sys.il.core.QNamedNode;
import org.smeup.sys.il.core.QNode;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectContainer;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.QOverlay;
import org.smeup.sys.il.core.QRemap;
import org.smeup.sys.il.core.QSpecial;
import org.smeup.sys.il.core.QSpecialElement;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;
import org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl;
import org.smeup.sys.il.core.out.QIntegratedLanguageCoreOutPackage;
import org.smeup.sys.il.core.out.impl.IntegratedLanguageCoreOutPackageImpl;
import org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermPackage;
import org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;

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
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationScopeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTestEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formatEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedNodeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overlayEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remapEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conversionStatusEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formatTypeEEnum = null;

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
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationScope() {
		return annotationScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationScope_Name() {
		return (EAttribute)annotationScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTest() {
		return annotationTestEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationTest_Expression() {
		return (EAttribute)annotationTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationTest_Message() {
		return (EAttribute)annotationTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConversion() {
		return conversionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConversion_Status() {
		return (EAttribute)conversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDerived() {
		return derivedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormat() {
		return formatEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormat_Expression() {
		return (EAttribute)formatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormat_Type() {
		return (EAttribute)formatEClass.getEStructuralFeatures().get(1);
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
	public EClass getNamedNode() {
		return namedNodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Facets() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOverlay() {
		return overlayEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOverlay_Name() {
		return (EAttribute)overlayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOverlay_Position() {
		return (EAttribute)overlayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemap() {
		return remapEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemap_Name() {
		return (EAttribute)remapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemap_Index() {
		return (EAttribute)remapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecial() {
		return specialEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecial_ClassDelegate() {
		return (EAttribute)specialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecial_Elements() {
		return (EReference)specialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecialElement() {
		return specialElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecialElement_Name() {
		return (EAttribute)specialElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecialElement_Text() {
		return (EAttribute)specialElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecialElement_Unary() {
		return (EAttribute)specialElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecialElement_Value() {
		return (EAttribute)specialElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConversionStatus() {
		return conversionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFormatType() {
		return formatTypeEEnum;
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
		annotationEClass = createEClass(ANNOTATION);

		annotationScopeEClass = createEClass(ANNOTATION_SCOPE);
		createEAttribute(annotationScopeEClass, ANNOTATION_SCOPE__NAME);

		annotationTestEClass = createEClass(ANNOTATION_TEST);
		createEAttribute(annotationTestEClass, ANNOTATION_TEST__EXPRESSION);
		createEAttribute(annotationTestEClass, ANNOTATION_TEST__MESSAGE);

		conversionEClass = createEClass(CONVERSION);
		createEAttribute(conversionEClass, CONVERSION__STATUS);

		derivedEClass = createEClass(DERIVED);

		formatEClass = createEClass(FORMAT);
		createEAttribute(formatEClass, FORMAT__EXPRESSION);
		createEAttribute(formatEClass, FORMAT__TYPE);

		nameableEClass = createEClass(NAMEABLE);

		namedNodeEClass = createEClass(NAMED_NODE);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__FACETS);

		objectEClass = createEClass(OBJECT);

		objectContainerEClass = createEClass(OBJECT_CONTAINER);
		createEReference(objectContainerEClass, OBJECT_CONTAINER__CONTENTS);

		objectIteratorEClass = createEClass(OBJECT_ITERATOR);

		objectNameableEClass = createEClass(OBJECT_NAMEABLE);

		overlayEClass = createEClass(OVERLAY);
		createEAttribute(overlayEClass, OVERLAY__NAME);
		createEAttribute(overlayEClass, OVERLAY__POSITION);

		remapEClass = createEClass(REMAP);
		createEAttribute(remapEClass, REMAP__NAME);
		createEAttribute(remapEClass, REMAP__INDEX);

		specialEClass = createEClass(SPECIAL);
		createEAttribute(specialEClass, SPECIAL__CLASS_DELEGATE);
		createEReference(specialEClass, SPECIAL__ELEMENTS);

		specialElementEClass = createEClass(SPECIAL_ELEMENT);
		createEAttribute(specialElementEClass, SPECIAL_ELEMENT__NAME);
		createEAttribute(specialElementEClass, SPECIAL_ELEMENT__TEXT);
		createEAttribute(specialElementEClass, SPECIAL_ELEMENT__UNARY);
		createEAttribute(specialElementEClass, SPECIAL_ELEMENT__VALUE);

		// Create enums
		conversionStatusEEnum = createEEnum(CONVERSION_STATUS);
		formatTypeEEnum = createEEnum(FORMAT_TYPE);
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

		// Add subpackages
		getESubpackages().add(theIntegratedLanguageCoreCtxPackage);
		getESubpackages().add(theIntegratedLanguageCoreMetaPackage);
		getESubpackages().add(theIntegratedLanguageCoreOutPackage);
		getESubpackages().add(theIntegratedLanguageCoreTermPackage);

		// Create type parameters
		ETypeParameter objectContainerEClass_T = addETypeParameter(objectContainerEClass, "T");
		ETypeParameter objectIteratorEClass_T = addETypeParameter(objectIteratorEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getObject());
		objectContainerEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getObject());
		objectIteratorEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		annotationEClass.getESuperTypes().add(theIntegratedLanguageCoreMetaPackage.getFacet());
		annotationScopeEClass.getESuperTypes().add(this.getAnnotation());
		annotationTestEClass.getESuperTypes().add(this.getAnnotation());
		conversionEClass.getESuperTypes().add(theIntegratedLanguageCoreMetaPackage.getFacet());
		derivedEClass.getESuperTypes().add(theIntegratedLanguageCoreMetaPackage.getFacet());
		formatEClass.getESuperTypes().add(theIntegratedLanguageCoreMetaPackage.getFacet());
		namedNodeEClass.getESuperTypes().add(this.getNode());
		namedNodeEClass.getESuperTypes().add(this.getNameable());
		objectContainerEClass.getESuperTypes().add(this.getObject());
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaIterator());
		EGenericType g2 = createEGenericType(objectIteratorEClass_T);
		g1.getETypeArguments().add(g2);
		objectIteratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaCloseable());
		objectIteratorEClass.getEGenericSuperTypes().add(g1);
		objectNameableEClass.getESuperTypes().add(this.getObject());
		objectNameableEClass.getESuperTypes().add(this.getNameable());
		overlayEClass.getESuperTypes().add(theIntegratedLanguageCoreMetaPackage.getFacet());
		remapEClass.getESuperTypes().add(theIntegratedLanguageCoreMetaPackage.getFacet());
		specialEClass.getESuperTypes().add(theIntegratedLanguageCoreMetaPackage.getFacet());
		specialElementEClass.getESuperTypes().add(this.getNamedNode());

		// Initialize classes and features; add operations and parameters
		initEClass(annotationEClass, QAnnotation.class, "Annotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationScopeEClass, QAnnotationScope.class, "AnnotationScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationScope_Name(), ecorePackage.getEString(), "name", null, 0, 1, QAnnotationScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationTestEClass, QAnnotationTest.class, "AnnotationTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationTest_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, QAnnotationTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationTest_Message(), ecorePackage.getEString(), "message", null, 0, 1, QAnnotationTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conversionEClass, QConversion.class, "Conversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConversion_Status(), this.getConversionStatus(), "status", null, 1, 1, QConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedEClass, QDerived.class, "Derived", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formatEClass, QFormat.class, "Format", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormat_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, QFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormat_Type(), this.getFormatType(), "type", null, 1, 1, QFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameableEClass, QNameable.class, "Nameable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(nameableEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedNodeEClass, QNamedNode.class, "NamedNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, QNode.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Facets(), theIntegratedLanguageCoreMetaPackage.getFacet(), null, "facets", null, 0, -1, QNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(nodeEClass, this.getNode(), "getParent", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(nodeEClass, ecorePackage.getEBoolean(), "isChild", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(nodeEClass, null, "getFacet", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "F");
		g1 = createEGenericType(theIntegratedLanguageCoreMetaPackage.getFacet());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(objectEClass, QObject.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectContainerEClass, QObjectContainer.class, "ObjectContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(objectContainerEClass_T);
		initEReference(getObjectContainer_Contents(), g1, null, "contents", null, 0, -1, QObjectContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(objectContainerEClass, null, "lookupByName", 1, 1, IS_UNIQUE, IS_ORDERED);
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

		initEClass(overlayEClass, QOverlay.class, "Overlay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverlay_Name(), ecorePackage.getEString(), "name", null, 0, 1, QOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOverlay_Position(), ecorePackage.getEInt(), "position", null, 0, 1, QOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remapEClass, QRemap.class, "Remap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemap_Name(), ecorePackage.getEString(), "name", null, 1, 1, QRemap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemap_Index(), ecorePackage.getEString(), "index", null, 1, 1, QRemap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialEClass, QSpecial.class, "Special", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecial_ClassDelegate(), ecorePackage.getEString(), "classDelegate", null, 0, 1, QSpecial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecial_Elements(), this.getSpecialElement(), null, "elements", null, 0, -1, QSpecial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialElementEClass, QSpecialElement.class, "SpecialElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecialElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, QSpecialElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialElement_Text(), ecorePackage.getEString(), "text", null, 0, 1, QSpecialElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialElement_Unary(), ecorePackage.getEBoolean(), "unary", null, 0, 1, QSpecialElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialElement_Value(), ecorePackage.getEString(), "value", null, 0, 1, QSpecialElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(conversionStatusEEnum, ConversionStatus.class, "ConversionStatus");
		addEEnumLiteral(conversionStatusEEnum, ConversionStatus.POSSIBLE);
		addEEnumLiteral(conversionStatusEEnum, ConversionStatus.SUPPORTED);
		addEEnumLiteral(conversionStatusEEnum, ConversionStatus.UNSUPPORTED);
		addEEnumLiteral(conversionStatusEEnum, ConversionStatus.TODO);

		initEEnum(formatTypeEEnum, FormatType.class, "FormatType");
		addEEnumLiteral(formatTypeEEnum, FormatType.COMMUNICATIONS_NAME);
		addEEnumLiteral(formatTypeEEnum, FormatType.COMMAND_STRING);
		addEEnumLiteral(formatTypeEEnum, FormatType.GENERIC);
		addEEnumLiteral(formatTypeEEnum, FormatType.NAME);
		addEEnumLiteral(formatTypeEEnum, FormatType.PATH_NAME);
		addEEnumLiteral(formatTypeEEnum, FormatType.REGULAR_EXPRESSION);
		addEEnumLiteral(formatTypeEEnum, FormatType.SIMPLE_NAME);

		// Create resource
		createResource(eNS_URI);
	}

} // IntegratedLanguageCorePackageImpl
