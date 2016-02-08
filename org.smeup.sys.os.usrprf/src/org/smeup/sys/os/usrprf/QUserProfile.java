/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.usrprf;

import org.smeup.sys.os.type.QTypedObject;


/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QUser Profile</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.usrprf.QUserProfile#getJobDescription <em>Job Description</em>}</li>
 *   <li>{@link org.smeup.sys.os.usrprf.QUserProfile#getInitialProgram <em>Initial Program</em>}</li>
 *   <li>{@link org.smeup.sys.os.usrprf.QUserProfile#getMessageQueue <em>Message Queue</em>}</li>
 *   <li>{@link org.smeup.sys.os.usrprf.QUserProfile#getOutQueue <em>Out Queue</em>}</li>
 *   <li>{@link org.smeup.sys.os.usrprf.QUserProfile#getUserClass <em>User Class</em>}</li>
 *   <li>{@link org.smeup.sys.os.usrprf.QUserProfile#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.usrprf.QOperatingSystemUserProfilePackage#getUserProfile()
 * @model
 * @generated
 */
public interface QUserProfile extends QTypedObject {
	/**
	 * Returns the value of the '<em><b>Job Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Description</em>' attribute.
	 * @see #setJobDescription(String)
	 * @see org.smeup.sys.os.usrprf.QOperatingSystemUserProfilePackage#getUserProfile_JobDescription()
	 * @model
	 * @generated
	 */
	String getJobDescription();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.usrprf.QUserProfile#getJobDescription <em>Job Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Job Description</em>' attribute.
	 * @see #getJobDescription()
	 * @generated
	 */
	void setJobDescription(String value);

	/**
	 * Returns the value of the '<em><b>Initial Program</b></em>' attribute.
	 * The default value is <code>"*NONE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Program</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Program</em>' attribute.
	 * @see #setInitialProgram(String)
	 * @see org.smeup.sys.os.usrprf.QOperatingSystemUserProfilePackage#getUserProfile_InitialProgram()
	 * @model default="*NONE"
	 * @generated
	 */
	String getInitialProgram();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.usrprf.QUserProfile#getInitialProgram <em>Initial Program</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Initial Program</em>' attribute.
	 * @see #getInitialProgram()
	 * @generated
	 */
	void setInitialProgram(String value);

	/**
	 * Returns the value of the '<em><b>Message Queue</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Queue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Message Queue</em>' attribute.
	 * @see #setMessageQueue(String)
	 * @see org.smeup.sys.os.usrprf.QOperatingSystemUserProfilePackage#getUserProfile_MessageQueue()
	 * @model
	 * @generated
	 */
	String getMessageQueue();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.usrprf.QUserProfile#getMessageQueue <em>Message Queue</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Message Queue</em>' attribute.
	 * @see #getMessageQueue()
	 * @generated
	 */
	void setMessageQueue(String value);

	/**
	 * Returns the value of the '<em><b>Out Queue</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Queue</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Out Queue</em>' attribute.
	 * @see #setOutQueue(String)
	 * @see org.smeup.sys.os.usrprf.QOperatingSystemUserProfilePackage#getUserProfile_OutQueue()
	 * @model
	 * @generated
	 */
	String getOutQueue();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.os.usrprf.QUserProfile#getOutQueue
	 * <em>Out Queue</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Out Queue</em>' attribute.
	 * @see #getOutQueue()
	 * @generated
	 */
	void setOutQueue(String value);

	/**
	 * Returns the value of the '<em><b>User Class</b></em>' attribute.
	 * The default value is <code>"*USER"</code>.
	 * The literals are from the enumeration {@link org.smeup.sys.os.usrprf.UserClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Class</em>' attribute.
	 * @see org.smeup.sys.os.usrprf.UserClass
	 * @see #setUserClass(UserClass)
	 * @see org.smeup.sys.os.usrprf.QOperatingSystemUserProfilePackage#getUserProfile_UserClass()
	 * @model default="*USER" required="true" derived="true"
	 * @generated
	 */
	UserClass getUserClass();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.usrprf.QUserProfile#getUserClass <em>User Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Class</em>' attribute.
	 * @see org.smeup.sys.os.usrprf.UserClass
	 * @see #getUserClass()
	 * @generated
	 */
	void setUserClass(UserClass value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.smeup.sys.os.usrprf.QOperatingSystemUserProfilePackage#getUserProfile_Enabled()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.usrprf.QUserProfile#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

} // QUserProfile
