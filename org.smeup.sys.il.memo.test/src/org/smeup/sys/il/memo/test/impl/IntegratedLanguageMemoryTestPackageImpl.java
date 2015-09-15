/**
 */
package org.smeup.sys.il.memo.test.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.memo.test.Enum1;
import org.smeup.sys.il.memo.test.QIntegratedLanguageMemoryTestFactory;
import org.smeup.sys.il.memo.test.QIntegratedLanguageMemoryTestPackage;
import org.smeup.sys.il.memo.test.QObjectA;
import org.smeup.sys.il.memo.test.QObjectB;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegratedLanguageMemoryTestPackageImpl extends EPackageImpl implements QIntegratedLanguageMemoryTestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enum1EEnum = null;

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
	 * @see org.smeup.sys.il.memo.test.QIntegratedLanguageMemoryTestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageMemoryTestPackageImpl() {
		super(eNS_URI, QIntegratedLanguageMemoryTestFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QIntegratedLanguageMemoryTestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageMemoryTestPackage init() {
		if (isInited) return (QIntegratedLanguageMemoryTestPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageMemoryTestPackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageMemoryTestPackageImpl theIntegratedLanguageMemoryTestPackage = (IntegratedLanguageMemoryTestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageMemoryTestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegratedLanguageMemoryTestPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIntegratedLanguageMemoryTestPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageMemoryTestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageMemoryTestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageMemoryTestPackage.eNS_URI, theIntegratedLanguageMemoryTestPackage);
		return theIntegratedLanguageMemoryTestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectA() {
		return objectAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectA_Name() {
		return (EAttribute)objectAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectA_Text() {
		return (EAttribute)objectAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectA_ObjectB() {
		return (EReference)objectAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectB() {
		return objectBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectB_Name() {
		return (EAttribute)objectBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectB_Enum1() {
		return (EAttribute)objectBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnum1() {
		return enum1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIntegratedLanguageMemoryTestFactory getIntegratedLanguageMemoryTestFactory() {
		return (QIntegratedLanguageMemoryTestFactory)getEFactoryInstance();
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
		objectAEClass = createEClass(OBJECT_A);
		createEAttribute(objectAEClass, OBJECT_A__NAME);
		createEAttribute(objectAEClass, OBJECT_A__TEXT);
		createEReference(objectAEClass, OBJECT_A__OBJECT_B);

		objectBEClass = createEClass(OBJECT_B);
		createEAttribute(objectBEClass, OBJECT_B__NAME);
		createEAttribute(objectBEClass, OBJECT_B__ENUM1);

		// Create enums
		enum1EEnum = createEEnum(ENUM1);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		objectAEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObjectNameable());
		objectBEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(objectAEClass, QObjectA.class, "ObjectA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectA_Name(), ecorePackage.getEString(), "name", null, 0, 1, QObjectA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectA_Text(), ecorePackage.getEString(), "text", null, 0, 1, QObjectA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectA_ObjectB(), this.getObjectB(), null, "objectB", null, 1, 1, QObjectA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectBEClass, QObjectB.class, "ObjectB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectB_Name(), ecorePackage.getEString(), "name", null, 1, 1, QObjectB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectB_Enum1(), this.getEnum1(), "enum1", null, 1, 1, QObjectB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enum1EEnum, Enum1.class, "Enum1");
		addEEnumLiteral(enum1EEnum, Enum1.VALUE1);
		addEEnumLiteral(enum1EEnum, Enum1.VALUE2);

		// Create resource
		createResource(eNS_URI);
	}

} //IntegratedLanguageMemoryTestPackageImpl
