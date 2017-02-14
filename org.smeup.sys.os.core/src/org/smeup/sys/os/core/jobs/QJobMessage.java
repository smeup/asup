/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.jobs;

import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJobMessage#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJobMessage#getMessageText <em>Message Text</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobMessage()
 * @model
 * @generated
 */
public interface QJobMessage extends QObject {
	/**
	 * Returns the value of the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Id</em>' attribute.
	 * @see #setMessageId(String)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobMessage_MessageId()
	 * @model
	 * @generated
	 */
	String getMessageId();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJobMessage#getMessageId <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Id</em>' attribute.
	 * @see #getMessageId()
	 * @generated
	 */
	void setMessageId(String value);

	/**
	 * Returns the value of the '<em><b>Message Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Text</em>' attribute.
	 * @see #setMessageText(String)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobMessage_MessageText()
	 * @model required="true"
	 * @generated
	 */
	String getMessageText();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJobMessage#getMessageText <em>Message Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Text</em>' attribute.
	 * @see #getMessageText()
	 * @generated
	 */
	void setMessageText(String value);

} // QJobMessage
