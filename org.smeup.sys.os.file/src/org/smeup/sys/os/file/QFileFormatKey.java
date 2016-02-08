/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
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
 * <em><b>File Format Key</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.file.QFileFormatKey#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.smeup.sys.os.file.QFileFormatKey#getKeyFields <em>Key Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileFormatKey()
 * @model
 * @generated
 */
public interface QFileFormatKey extends QObject {
	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileFormatKey_Unique()
	 * @model required="true"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.file.QFileFormatKey#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Key Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.os.file.QFileFormatKeyField}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Key Fields</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Fields</em>' containment reference list.
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileFormatKey_KeyFields()
	 * @model containment="true"
	 * @generated
	 */
	List<QFileFormatKeyField> getKeyFields();

} // QFileFormatKey
