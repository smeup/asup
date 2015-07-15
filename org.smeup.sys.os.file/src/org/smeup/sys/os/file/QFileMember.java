/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file;

import java.util.List;

import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Member</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.smeup.sys.os.file.QFileMember#getFile <em>File</em>}</li>
 * <li>{@link org.smeup.sys.os.file.QFileMember#getName <em>Name</em>}</li>
 * <li>{@link org.smeup.sys.os.file.QFileMember#getRows <em>Rows</em>}</li>
 * <li>{@link org.smeup.sys.os.file.QFileMember#getText <em>Text</em>}</li>
 * <li>{@link org.smeup.sys.os.file.QFileMember#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileMember()
 * @model
 * @generated
 */
public interface QFileMember extends QObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileMember_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.file.QFileMember#getType
	 * <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileMember_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.file.QFileMember#getText
	 * <em>Text</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.smeup.sys.os.file.QFileMemberRow}. It is bidirectional and its
	 * opposite is '{@link org.smeup.sys.os.file.QFileMemberRow#getFileMember
	 * <em>File Member</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileMember_Rows()
	 * @see org.smeup.sys.os.file.QFileMemberRow#getFileMember
	 * @model opposite="fileMember" containment="true"
	 * @generated
	 */
	List<QFileMemberRow> getRows();

	/**
	 * Returns the value of the '<em><b>File</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>File</em>' reference.
	 * @see #setFile(QFileMembered)
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileMember_File()
	 * @model required="true"
	 * @generated
	 */
	QFileMembered getFile();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.file.QFileMember#getFile
	 * <em>File</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(QFileMembered value);

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
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileMember_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.file.QFileMember#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // QFileMember
