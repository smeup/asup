/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.lib;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.os.lib.QOperatingSystemLibraryFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemLibraryPackage extends EPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012, 2015 Sme.UP and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html";

	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lib";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/lib";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-lib";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QOperatingSystemLibraryPackage eINSTANCE = org.smeup.sys.os.lib.impl.OperatingSystemLibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.lib.QLibraryManager <em>Library Manager</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.lib.QLibraryManager
	 * @see org.smeup.sys.os.lib.impl.OperatingSystemLibraryPackageImpl#getLibraryManager()
	 * @generated
	 */
	int LIBRARY_MANAGER = 0;

	/**
	 * The number of structural features of the '<em>Library Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.lib.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.os.lib.impl.LibraryImpl
	 * @see org.smeup.sys.os.lib.impl.OperatingSystemLibraryPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__FACETS = QOperatingSystemTypePackage.TYPED_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__BASE_PACKAGE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DEPENDENCIES = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Library Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__LIBRARY_TYPE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Library</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__PARENT_LIBRARY = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__SYNCHRONIZED = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Library</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.lib.LibraryType <em>Library Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.lib.LibraryType
	 * @see org.smeup.sys.os.lib.impl.OperatingSystemLibraryPackageImpl#getLibraryType()
	 * @generated
	 */
	int LIBRARY_TYPE = 2;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.lib.QLibraryManager <em>Library Manager</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Manager</em>'.
	 * @see org.smeup.sys.os.lib.QLibraryManager
	 * @generated
	 */
	EClass getLibraryManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.lib.QLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.smeup.sys.os.lib.QLibrary
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.os.lib.QLibrary#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dependencies</em>'.
	 * @see org.smeup.sys.os.lib.QLibrary#getDependencies()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Dependencies();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.lib.QLibrary#getLibraryType <em>Library Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Type</em>'.
	 * @see org.smeup.sys.os.lib.QLibrary#getLibraryType()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_LibraryType();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.lib.QLibrary#getParentLibrary <em>Parent Library</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Library</em>'.
	 * @see org.smeup.sys.os.lib.QLibrary#getParentLibrary()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_ParentLibrary();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.lib.QLibrary#isSynchronized <em>Synchronized</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronized</em>'.
	 * @see org.smeup.sys.os.lib.QLibrary#isSynchronized()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Synchronized();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.os.lib.LibraryType <em>Library Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Library Type</em>'.
	 * @see org.smeup.sys.os.lib.LibraryType
	 * @generated
	 */
	EEnum getLibraryType();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.lib.QLibrary#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.smeup.sys.os.lib.QLibrary#getBasePackage()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_BasePackage();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemLibraryFactory getOperatingSystemLibraryFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.lib.QLibraryManager <em>Library Manager</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.os.lib.QLibraryManager
		 * @see org.smeup.sys.os.lib.impl.OperatingSystemLibraryPackageImpl#getLibraryManager()
		 * @generated
		 */
		EClass LIBRARY_MANAGER = eINSTANCE.getLibraryManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.lib.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.os.lib.impl.LibraryImpl
		 * @see org.smeup.sys.os.lib.impl.OperatingSystemLibraryPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__DEPENDENCIES = eINSTANCE.getLibrary_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Library Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__LIBRARY_TYPE = eINSTANCE.getLibrary_LibraryType();

		/**
		 * The meta object literal for the '<em><b>Parent Library</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__PARENT_LIBRARY = eINSTANCE.getLibrary_ParentLibrary();

		/**
		 * The meta object literal for the '<em><b>Synchronized</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__SYNCHRONIZED = eINSTANCE.getLibrary_Synchronized();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.lib.LibraryType <em>Library Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.lib.LibraryType
		 * @see org.smeup.sys.os.lib.impl.OperatingSystemLibraryPackageImpl#getLibraryType()
		 * @generated
		 */
		EEnum LIBRARY_TYPE = eINSTANCE.getLibraryType();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__BASE_PACKAGE = eINSTANCE.getLibrary_BasePackage();

	}

} // OSLibraryCorePackage
