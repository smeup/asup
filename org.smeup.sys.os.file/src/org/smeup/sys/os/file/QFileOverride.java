/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file;

import org.smeup.sys.il.core.QObjectNameable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>File Override</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.smeup.sys.os.file.QFileOverride#getName <em>Name</em>}</li>
 * <li>{@link org.smeup.sys.os.file.QFileOverride#getFileTo <em>File To</em>}</li>
 * <li>{@link org.smeup.sys.os.file.QFileOverride#getMemberTo <em>Member To
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileOverride()
 * @model
 * @generated
 */
public interface QFileOverride extends QObjectNameable {
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
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileOverride_Name()
	 * @model required="true"
	 * @generated
	 */
	@Override
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.os.file.QFileOverride#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>File To</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File To</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>File To</em>' reference.
	 * @see #setFileTo(QFile)
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileOverride_FileTo()
	 * @model required="true"
	 * @generated
	 */
	QFile getFileTo();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.os.file.QFileOverride#getFileTo <em>File To</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>File To</em>' reference.
	 * @see #getFileTo()
	 * @generated
	 */
	void setFileTo(QFile value);

	/**
	 * Returns the value of the '<em><b>Member To</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member To</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Member To</em>' attribute.
	 * @see #setMemberTo(String)
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileOverride_MemberTo()
	 * @model required="true"
	 * @generated
	 */
	String getMemberTo();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.os.file.QFileOverride#getMemberTo
	 * <em>Member To</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Member To</em>' attribute.
	 * @see #getMemberTo()
	 * @generated
	 */
	void setMemberTo(String value);

} // QFileOverride
