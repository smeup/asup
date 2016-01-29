/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Database File Format</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.file.QDatabaseFileFormat#getFormatKey <em>Format Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getDatabaseFileFormat()
 * @model
 * @generated
 */
public interface QDatabaseFileFormat extends QFileFormat<QDatabaseFileFormatDef> {

	/**
	 * Returns the value of the '<em><b>Format Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format Key</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Key</em>' containment reference.
	 * @see #setFormatKey(QFileFormatKey)
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getDatabaseFileFormat_FormatKey()
	 * @model containment="true"
	 * @generated
	 */
	QFileFormatKey getFormatKey();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.file.QDatabaseFileFormat#getFormatKey <em>Format Key</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Format Key</em>' containment reference.
	 * @see #getFormatKey()
	 * @generated
	 */
	void setFormatKey(QFileFormatKey value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isEmpty();
} // QDatabaseFileFormat
