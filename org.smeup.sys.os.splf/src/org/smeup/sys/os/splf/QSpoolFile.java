/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.splf;

import java.util.List;

import org.smeup.sys.il.core.QObjectNameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spool File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.splf.QSpoolFile#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.splf.QSpoolFile#getJobName <em>Job Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.splf.QSpoolFile#getJobNumber <em>Job Number</em>}</li>
 *   <li>{@link org.smeup.sys.os.splf.QSpoolFile#getJobUser <em>Job User</em>}</li>
 *   <li>{@link org.smeup.sys.os.splf.QSpoolFile#getOutQueue <em>Out Queue</em>}</li>
 *   <li>{@link org.smeup.sys.os.splf.QSpoolFile#getRows <em>Rows</em>}</li>
 *   <li>{@link org.smeup.sys.os.splf.QSpoolFile#getSpoolID <em>Spool ID</em>}</li>
 *   <li>{@link org.smeup.sys.os.splf.QSpoolFile#getUserData <em>User Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.splf.QOperatingSystemSpoolFilePackage#getSpoolFile()
 * @model
 * @generated
 */
public interface QSpoolFile extends QObjectNameable {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.smeup.sys.os.splf.QOperatingSystemSpoolFilePackage#getSpoolFile_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.splf.QSpoolFile#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Name</em>' attribute.
	 * @see #setJobName(String)
	 * @see org.smeup.sys.os.splf.QOperatingSystemSpoolFilePackage#getSpoolFile_JobName()
	 * @model annotation="il-data length='10'"
	 * @generated
	 */
	String getJobName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.splf.QSpoolFile#getJobName <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Name</em>' attribute.
	 * @see #getJobName()
	 * @generated
	 */
	void setJobName(String value);

	/**
	 * Returns the value of the '<em><b>Job Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Number</em>' attribute.
	 * @see #setJobNumber(int)
	 * @see org.smeup.sys.os.splf.QOperatingSystemSpoolFilePackage#getSpoolFile_JobNumber()
	 * @model annotation="il-data precision='6'"
	 * @generated
	 */
	int getJobNumber();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.splf.QSpoolFile#getJobNumber <em>Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Number</em>' attribute.
	 * @see #getJobNumber()
	 * @generated
	 */
	void setJobNumber(int value);

	/**
	 * Returns the value of the '<em><b>Job User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job User</em>' attribute.
	 * @see #setJobUser(String)
	 * @see org.smeup.sys.os.splf.QOperatingSystemSpoolFilePackage#getSpoolFile_JobUser()
	 * @model annotation="il-data length='10'"
	 * @generated
	 */
	String getJobUser();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.splf.QSpoolFile#getJobUser <em>Job User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job User</em>' attribute.
	 * @see #getJobUser()
	 * @generated
	 */
	void setJobUser(String value);

	/**
	 * Returns the value of the '<em><b>Out Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Queue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Queue</em>' attribute.
	 * @see #setOutQueue(String)
	 * @see org.smeup.sys.os.splf.QOperatingSystemSpoolFilePackage#getSpoolFile_OutQueue()
	 * @model annotation="il-data length='10'"
	 * @generated
	 */
	String getOutQueue();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.splf.QSpoolFile#getOutQueue <em>Out Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Queue</em>' attribute.
	 * @see #getOutQueue()
	 * @generated
	 */
	void setOutQueue(String value);

	/**
	 * Returns the value of the '<em><b>Spool ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spool ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spool ID</em>' attribute.
	 * @see #setSpoolID(String)
	 * @see org.smeup.sys.os.splf.QOperatingSystemSpoolFilePackage#getSpoolFile_SpoolID()
	 * @model id="true" required="true"
	 *        annotation="il-data length='36'"
	 * @generated
	 */
	String getSpoolID();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.splf.QSpoolFile#getSpoolID <em>Spool ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spool ID</em>' attribute.
	 * @see #getSpoolID()
	 * @generated
	 */
	void setSpoolID(String value);

	/**
	 * Returns the value of the '<em><b>User Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Data</em>' attribute.
	 * @see #setUserData(String)
	 * @see org.smeup.sys.os.splf.QOperatingSystemSpoolFilePackage#getSpoolFile_UserData()
	 * @model annotation="il-data length='48'"
	 * @generated
	 */
	String getUserData();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.splf.QSpoolFile#getUserData <em>User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data</em>' attribute.
	 * @see #getUserData()
	 * @generated
	 */
	void setUserData(String value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.os.splf.QSpoolFileRow}.
	 * It is bidirectional and its opposite is '{@link org.smeup.sys.os.splf.QSpoolFileRow#getSpoolFile <em>Spool File</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see org.smeup.sys.os.splf.QOperatingSystemSpoolFilePackage#getSpoolFile_Rows()
	 * @see org.smeup.sys.os.splf.QSpoolFileRow#getSpoolFile
	 * @model opposite="spoolFile" containment="true"
	 * @generated
	 */
	List<QSpoolFileRow> getRows();

} // QSpoolFile
