/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.type;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.os.type.QOperatingSystemTypeFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemTypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "type";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/type";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-type";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemTypePackage eINSTANCE = org.smeup.sys.os.type.impl.OperatingSystemTypePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.type.impl.TypedObjectImpl <em>Typed Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.type.impl.TypedObjectImpl
	 * @see org.smeup.sys.os.type.impl.OperatingSystemTypePackageImpl#getTypedObject()
	 * @generated
	 */
	int TYPED_OBJECT = 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.type.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.type.impl.TypeImpl
	 * @see org.smeup.sys.os.type.impl.OperatingSystemTypePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.type.QTypeRegistry <em>Type Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.type.QTypeRegistry
	 * @see org.smeup.sys.os.type.impl.OperatingSystemTypePackageImpl#getTypeRegistry()
	 * @generated
	 */
	int TYPE_REGISTRY = 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.type.impl.TypedContainerImpl <em>Typed Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.type.impl.TypedContainerImpl
	 * @see org.smeup.sys.os.type.impl.OperatingSystemTypePackageImpl#getTypedContainer()
	 * @generated
	 */
	int TYPED_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__APPLICATION = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__LIBRARY = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__NAME = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__TEXT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__CREATION_INFO = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Typed Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__APPLICATION = TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__LIBRARY = TYPED_OBJECT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TEXT = TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CREATION_INFO = TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Typed Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPED_CLASS_NAME = TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REGISTRY_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_CONTAINER__CONTENTS = QIntegratedLanguageCorePackage.OBJECT_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Typed Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_CONTAINER_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.type.impl.TypedRefImpl <em>Typed Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.type.impl.TypedRefImpl
	 * @see org.smeup.sys.os.type.impl.OperatingSystemTypePackageImpl#getTypedRef()
	 * @generated
	 */
	int TYPED_REF = 4;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_REF__LIBRARY = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_REF__NAME = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Typed Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_REF_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.type.impl.TypeContainerImpl <em>Type Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.type.impl.TypeContainerImpl
	 * @see org.smeup.sys.os.type.impl.OperatingSystemTypePackageImpl#getTypeContainer()
	 * @generated
	 */
	int TYPE_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINER__CONTENTS = TYPED_CONTAINER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Type Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINER_FEATURE_COUNT = TYPED_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.type.QType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.smeup.sys.os.type.QType
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.type.QType#getTypedClassName <em>Typed Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typed Class Name</em>'.
	 * @see org.smeup.sys.os.type.QType#getTypedClassName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_TypedClassName();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.type.QTypeRegistry <em>Type Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Registry</em>'.
	 * @see org.smeup.sys.os.type.QTypeRegistry
	 * @generated
	 */
	EClass getTypeRegistry();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.type.QTypedContainer <em>Typed Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Container</em>'.
	 * @see org.smeup.sys.os.type.QTypedContainer
	 * @generated
	 */
	EClass getTypedContainer();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.type.QTypedObject <em>Typed Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Object</em>'.
	 * @see org.smeup.sys.os.type.QTypedObject
	 * @generated
	 */
	EClass getTypedObject();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.type.QTypedObject#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see org.smeup.sys.os.type.QTypedObject#getApplication()
	 * @see #getTypedObject()
	 * @generated
	 */
	EAttribute getTypedObject_Application();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.type.QTypedObject#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see org.smeup.sys.os.type.QTypedObject#getLibrary()
	 * @see #getTypedObject()
	 * @generated
	 */
	EAttribute getTypedObject_Library();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.type.QTypedObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.os.type.QTypedObject#getName()
	 * @see #getTypedObject()
	 * @generated
	 */
	EAttribute getTypedObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.type.QTypedObject#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.smeup.sys.os.type.QTypedObject#getText()
	 * @see #getTypedObject()
	 * @generated
	 */
	EAttribute getTypedObject_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.os.type.QTypedObject#getCreationInfo <em>Creation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation Info</em>'.
	 * @see org.smeup.sys.os.type.QTypedObject#getCreationInfo()
	 * @see #getTypedObject()
	 * @generated
	 */
	EReference getTypedObject_CreationInfo();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.type.QTypedRef <em>Typed Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Ref</em>'.
	 * @see org.smeup.sys.os.type.QTypedRef
	 * @generated
	 */
	EClass getTypedRef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.type.QTypedRef#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see org.smeup.sys.os.type.QTypedRef#getLibrary()
	 * @see #getTypedRef()
	 * @generated
	 */
	EAttribute getTypedRef_Library();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.type.QTypedRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.os.type.QTypedRef#getName()
	 * @see #getTypedRef()
	 * @generated
	 */
	EAttribute getTypedRef_Name();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.type.QTypeContainer <em>Type Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Container</em>'.
	 * @see org.smeup.sys.os.type.QTypeContainer
	 * @generated
	 */
	EClass getTypeContainer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemTypeFactory getOperatingSystemTypeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.type.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.type.impl.TypeImpl
		 * @see org.smeup.sys.os.type.impl.OperatingSystemTypePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Typed Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__TYPED_CLASS_NAME = eINSTANCE.getType_TypedClassName();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.type.QTypeRegistry <em>Type Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.type.QTypeRegistry
		 * @see org.smeup.sys.os.type.impl.OperatingSystemTypePackageImpl#getTypeRegistry()
		 * @generated
		 */
		EClass TYPE_REGISTRY = eINSTANCE.getTypeRegistry();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.type.impl.TypedContainerImpl <em>Typed Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.type.impl.TypedContainerImpl
		 * @see org.smeup.sys.os.type.impl.OperatingSystemTypePackageImpl#getTypedContainer()
		 * @generated
		 */
		EClass TYPED_CONTAINER = eINSTANCE.getTypedContainer();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.type.impl.TypedObjectImpl <em>Typed Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.type.impl.TypedObjectImpl
		 * @see org.smeup.sys.os.type.impl.OperatingSystemTypePackageImpl#getTypedObject()
		 * @generated
		 */
		EClass TYPED_OBJECT = eINSTANCE.getTypedObject();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_OBJECT__APPLICATION = eINSTANCE.getTypedObject_Application();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_OBJECT__LIBRARY = eINSTANCE.getTypedObject_Library();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_OBJECT__NAME = eINSTANCE.getTypedObject_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_OBJECT__TEXT = eINSTANCE.getTypedObject_Text();

		/**
		 * The meta object literal for the '<em><b>Creation Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_OBJECT__CREATION_INFO = eINSTANCE.getTypedObject_CreationInfo();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.type.impl.TypedRefImpl <em>Typed Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.type.impl.TypedRefImpl
		 * @see org.smeup.sys.os.type.impl.OperatingSystemTypePackageImpl#getTypedRef()
		 * @generated
		 */
		EClass TYPED_REF = eINSTANCE.getTypedRef();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_REF__LIBRARY = eINSTANCE.getTypedRef_Library();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_REF__NAME = eINSTANCE.getTypedRef_Name();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.type.impl.TypeContainerImpl <em>Type Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.type.impl.TypeContainerImpl
		 * @see org.smeup.sys.os.type.impl.OperatingSystemTypePackageImpl#getTypeContainer()
		 * @generated
		 */
		EClass TYPE_CONTAINER = eINSTANCE.getTypeContainer();

	}

} //QOperatingSystemTypePackage
