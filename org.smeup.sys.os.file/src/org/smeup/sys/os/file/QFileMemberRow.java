/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file;

import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Member Row</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.file.QFileMemberRow#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.smeup.sys.os.file.QFileMemberRow#getDate <em>Date</em>}</li>
 *   <li>{@link org.smeup.sys.os.file.QFileMemberRow#getContent <em>Content</em>}</li>
 *   <li>{@link org.smeup.sys.os.file.QFileMemberRow#getFileMember <em>File Member</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileMemberRow()
 * @model
 * @generated
 */
public interface QFileMemberRow extends QObject {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(int)
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileMemberRow_Sequence()
	 * @model
	 * @generated
	 */
	int getSequence();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.os.file.QFileMemberRow#getSequence
	 * <em>Sequence</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(int)
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileMemberRow_Date()
	 * @model
	 * @generated
	 */
	int getDate();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.file.QFileMemberRow#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(int value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileMemberRow_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.file.QFileMemberRow#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>File Member</b></em>' container
	 * reference. It is bidirectional and its opposite is '
	 * {@link org.smeup.sys.os.file.QFileMember#getRows <em>Rows</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Member</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>File Member</em>' container reference.
	 * @see #setFileMember(QFileMember)
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileMemberRow_FileMember()
	 * @see org.smeup.sys.os.file.QFileMember#getRows
	 * @model opposite="rows" required="true" transient="false"
	 * @generated
	 */
	QFileMember getFileMember();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.file.QFileMemberRow#getFileMember <em>File Member</em>}' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>File Member</em>' container reference.
	 * @see #getFileMember()
	 * @generated
	 */
	void setFileMember(QFileMember value);

} // QFileMemberRow
