/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.usrprf;

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
 * @see org.smeup.sys.os.usrprf.QOperatingSystemUserProfileFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemUserProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "usrprf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/usrprf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-usrprf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QOperatingSystemUserProfilePackage eINSTANCE = org.smeup.sys.os.usrprf.impl.OperatingSystemUserProfilePackageImpl.init();

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.os.usrprf.impl.UserProfileImpl
	 * <em>User Profile</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.os.usrprf.impl.UserProfileImpl
	 * @see org.smeup.sys.os.usrprf.impl.OperatingSystemUserProfilePackageImpl#getUserProfile()
	 * @generated
	 */
	int USER_PROFILE = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__FACETS = QOperatingSystemTypePackage.TYPED_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__LIBRARY = QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Job Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__JOB_DESCRIPTION = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Program</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__INITIAL_PROGRAM = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Queue</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__MESSAGE_QUEUE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Out Queue</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__OUT_QUEUE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__USER_CLASS = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__ENABLED = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>User Profile</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.usrprf.QUserProfileManager <em>User Profile Manager</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.usrprf.QUserProfileManager
	 * @see org.smeup.sys.os.usrprf.impl.OperatingSystemUserProfilePackageImpl#getUserProfileManager()
	 * @generated
	 */
	int USER_PROFILE_MANAGER = 1;

	/**
	 * The number of structural features of the '<em>User Profile Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.usrprf.UserClass <em>User Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.usrprf.UserClass
	 * @see org.smeup.sys.os.usrprf.impl.OperatingSystemUserProfilePackageImpl#getUserClass()
	 * @generated
	 */
	int USER_CLASS = 2;

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.usrprf.QUserProfile <em>User Profile</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>User Profile</em>'.
	 * @see org.smeup.sys.os.usrprf.QUserProfile
	 * @generated
	 */
	EClass getUserProfile();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.usrprf.QUserProfile#getJobDescription <em>Job Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Description</em>'.
	 * @see org.smeup.sys.os.usrprf.QUserProfile#getJobDescription()
	 * @see #getUserProfile()
	 * @generated
	 */
	EAttribute getUserProfile_JobDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.usrprf.QUserProfile#getInitialProgram <em>Initial Program</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Program</em>'.
	 * @see org.smeup.sys.os.usrprf.QUserProfile#getInitialProgram()
	 * @see #getUserProfile()
	 * @generated
	 */
	EAttribute getUserProfile_InitialProgram();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.usrprf.QUserProfile#getMessageQueue <em>Message Queue</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Queue</em>'.
	 * @see org.smeup.sys.os.usrprf.QUserProfile#getMessageQueue()
	 * @see #getUserProfile()
	 * @generated
	 */
	EAttribute getUserProfile_MessageQueue();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.usrprf.QUserProfile#getOutQueue <em>Out Queue</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Queue</em>'.
	 * @see org.smeup.sys.os.usrprf.QUserProfile#getOutQueue()
	 * @see #getUserProfile()
	 * @generated
	 */
	EAttribute getUserProfile_OutQueue();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.usrprf.QUserProfile#getUserClass <em>User Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Class</em>'.
	 * @see org.smeup.sys.os.usrprf.QUserProfile#getUserClass()
	 * @see #getUserProfile()
	 * @generated
	 */
	EAttribute getUserProfile_UserClass();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.usrprf.QUserProfile#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.smeup.sys.os.usrprf.QUserProfile#isEnabled()
	 * @see #getUserProfile()
	 * @generated
	 */
	EAttribute getUserProfile_Enabled();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.usrprf.QUserProfileManager <em>User Profile Manager</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>User Profile Manager</em>'.
	 * @see org.smeup.sys.os.usrprf.QUserProfileManager
	 * @generated
	 */
	EClass getUserProfileManager();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.os.usrprf.UserClass <em>User Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Class</em>'.
	 * @see org.smeup.sys.os.usrprf.UserClass
	 * @generated
	 */
	EEnum getUserClass();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemUserProfileFactory getOperatingSystemUserProfileFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.os.usrprf.impl.UserProfileImpl <em>User Profile</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.usrprf.impl.UserProfileImpl
		 * @see org.smeup.sys.os.usrprf.impl.OperatingSystemUserProfilePackageImpl#getUserProfile()
		 * @generated
		 */
		EClass USER_PROFILE = eINSTANCE.getUserProfile();

		/**
		 * The meta object literal for the '<em><b>Job Description</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE__JOB_DESCRIPTION = eINSTANCE.getUserProfile_JobDescription();

		/**
		 * The meta object literal for the '<em><b>Initial Program</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE__INITIAL_PROGRAM = eINSTANCE.getUserProfile_InitialProgram();

		/**
		 * The meta object literal for the '<em><b>Message Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE__MESSAGE_QUEUE = eINSTANCE.getUserProfile_MessageQueue();

		/**
		 * The meta object literal for the '<em><b>Out Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE__OUT_QUEUE = eINSTANCE.getUserProfile_OutQueue();

		/**
		 * The meta object literal for the '<em><b>User Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE__USER_CLASS = eINSTANCE.getUserProfile_UserClass();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE__ENABLED = eINSTANCE.getUserProfile_Enabled();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.usrprf.QUserProfileManager <em>User Profile Manager</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.usrprf.QUserProfileManager
		 * @see org.smeup.sys.os.usrprf.impl.OperatingSystemUserProfilePackageImpl#getUserProfileManager()
		 * @generated
		 */
		EClass USER_PROFILE_MANAGER = eINSTANCE.getUserProfileManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.usrprf.UserClass <em>User Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.usrprf.UserClass
		 * @see org.smeup.sys.os.usrprf.impl.OperatingSystemUserProfilePackageImpl#getUserClass()
		 * @generated
		 */
		EEnum USER_CLASS = eINSTANCE.getUserClass();

	}

} // OSUserProfileCorePackage
