/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.msgf;

import java.util.List;

import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Message Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.msgf.QMessageDescription#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.msgf.QMessageDescription#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.smeup.sys.os.msgf.QMessageDescription#getMessageHelp <em>Message Help</em>}</li>
 *   <li>{@link org.smeup.sys.os.msgf.QMessageDescription#getMessageText <em>Message Text</em>}</li>
 *   <li>{@link org.smeup.sys.os.msgf.QMessageDescription#getMessageDataFields <em>Message Data Fields</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.msgf.QOperatingSystemMessageFilePackage#getMessageDescription()
 * @model
 * @generated
 */
public interface QMessageDescription extends QObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.smeup.sys.os.msgf.QOperatingSystemMessageFilePackage#getMessageDescription_Name()
	 * @model required="true" annotation="il-data length='7'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.msgf.QMessageDescription#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(int)
	 * @see org.smeup.sys.os.msgf.QOperatingSystemMessageFilePackage#getMessageDescription_Severity()
	 * @model
	 * @generated
	 */
	int getSeverity();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.os.msgf.QMessageDescription#getSeverity
	 * <em>Severity</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(int value);

	/**
	 * Returns the value of the '<em><b>Message Help</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Help</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Message Help</em>' attribute.
	 * @see #setMessageHelp(String)
	 * @see org.smeup.sys.os.msgf.QOperatingSystemMessageFilePackage#getMessageDescription_MessageHelp()
	 * @model annotation="il-data length='50'"
	 * @generated
	 */
	String getMessageHelp();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.msgf.QMessageDescription#getMessageHelp <em>Message Help</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Message Help</em>' attribute.
	 * @see #getMessageHelp()
	 * @generated
	 */
	void setMessageHelp(String value);

	/**
	 * Returns the value of the '<em><b>Message Text</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Message Text</em>' attribute.
	 * @see #setMessageText(String)
	 * @see org.smeup.sys.os.msgf.QOperatingSystemMessageFilePackage#getMessageDescription_MessageText()
	 * @model annotation="il-data length='50'"
	 * @generated
	 */
	String getMessageText();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.msgf.QMessageDescription#getMessageText <em>Message Text</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Message Text</em>' attribute.
	 * @see #getMessageText()
	 * @generated
	 */
	void setMessageText(String value);

	/**
	 * Returns the value of the '<em><b>Message Data Fields</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link org.smeup.sys.os.msgf.QMessageDescriptionDataField}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Data Fields</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Message Data Fields</em>' containment
	 *         reference list.
	 * @see org.smeup.sys.os.msgf.QOperatingSystemMessageFilePackage#getMessageDescription_MessageDataFields()
	 * @model containment="true"
	 * @generated
	 */
	List<QMessageDataField> getMessageDataFields();

} // QMessageDescription
