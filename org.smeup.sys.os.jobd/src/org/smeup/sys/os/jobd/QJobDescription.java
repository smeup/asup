/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.jobd;

import java.util.List;
import org.smeup.sys.os.type.QTypedObject;
import org.smeup.sys.os.type.QTypedRef;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QJob Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.jobd.QJobDescription#getJobQueue <em>Job Queue</em>}</li>
 *   <li>{@link org.smeup.sys.os.jobd.QJobDescription#getJobPriorityOnJobq <em>Job Priority On Jobq</em>}</li>
 *   <li>{@link org.smeup.sys.os.jobd.QJobDescription#getOutQueue <em>Out Queue</em>}</li>
 *   <li>{@link org.smeup.sys.os.jobd.QJobDescription#getOutputPriorityOnOutq <em>Output Priority On Outq</em>}</li>
 *   <li>{@link org.smeup.sys.os.jobd.QJobDescription#getUser <em>User</em>}</li>
 *   <li>{@link org.smeup.sys.os.jobd.QJobDescription#getLibraries <em>Libraries</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.jobd.QOperatingSystemJobDescriptionPackage#getJobDescription()
 * @model
 * @generated
 */
public interface QJobDescription extends QTypedObject {
	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' attribute list.
	 * @see org.smeup.sys.os.jobd.QOperatingSystemJobDescriptionPackage#getJobDescription_Libraries()
	 * @model
	 * @generated
	 */
	List<String> getLibraries();

	/**
	 * Returns the value of the '<em><b>Job Queue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Queue</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Queue</em>' containment reference.
	 * @see #setJobQueue(QTypedRef)
	 * @see org.smeup.sys.os.jobd.QOperatingSystemJobDescriptionPackage#getJobDescription_JobQueue()
	 * @model containment="true"
	 * @generated
	 */
	QTypedRef<?> getJobQueue();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.jobd.QJobDescription#getJobQueue <em>Job Queue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Queue</em>' containment reference.
	 * @see #getJobQueue()
	 * @generated
	 */
	void setJobQueue(QTypedRef<?> value);

	/**
	 * Returns the value of the '<em><b>Job Priority On Jobq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Priority On Jobq</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Priority On Jobq</em>' attribute.
	 * @see #setJobPriorityOnJobq(String)
	 * @see org.smeup.sys.os.jobd.QOperatingSystemJobDescriptionPackage#getJobDescription_JobPriorityOnJobq()
	 * @model
	 * @generated
	 */
	String getJobPriorityOnJobq();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.jobd.QJobDescription#getJobPriorityOnJobq <em>Job Priority On Jobq</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Job Priority On Jobq</em>' attribute.
	 * @see #getJobPriorityOnJobq()
	 * @generated
	 */
	void setJobPriorityOnJobq(String value);

	/**
	 * Returns the value of the '<em><b>Output Priority On Outq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Priority On Outq</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Priority On Outq</em>' attribute.
	 * @see #setOutputPriorityOnOutq(String)
	 * @see org.smeup.sys.os.jobd.QOperatingSystemJobDescriptionPackage#getJobDescription_OutputPriorityOnOutq()
	 * @model
	 * @generated
	 */
	String getOutputPriorityOnOutq();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.jobd.QJobDescription#getOutputPriorityOnOutq <em>Output Priority On Outq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Priority On Outq</em>' attribute.
	 * @see #getOutputPriorityOnOutq()
	 * @generated
	 */
	void setOutputPriorityOnOutq(String value);

	/**
	 * Returns the value of the '<em><b>Out Queue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Queue</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Queue</em>' containment reference.
	 * @see #setOutQueue(QTypedRef)
	 * @see org.smeup.sys.os.jobd.QOperatingSystemJobDescriptionPackage#getJobDescription_OutQueue()
	 * @model containment="true"
	 * @generated
	 */
	QTypedRef<?> getOutQueue();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.jobd.QJobDescription#getOutQueue <em>Out Queue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Queue</em>' containment reference.
	 * @see #getOutQueue()
	 * @generated
	 */
	void setOutQueue(QTypedRef<?> value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.smeup.sys.os.jobd.QOperatingSystemJobDescriptionPackage#getJobDescription_User()
	 * @model annotation="il-data length='10'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.jobd.QJobDescription#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

} // QJobDescription
