/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Database File</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.file.QDatabaseFile#getDatabaseFormat <em>Database Format</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getDatabaseFile()
 * @model abstract="true"
 * @generated
 */
public interface QDatabaseFile extends QFile {

	/**
	 * Returns the value of the '<em><b>Database Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Format</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Format</em>' containment reference.
	 * @see #setDatabaseFormat(QDatabaseFileFormat)
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getDatabaseFile_DatabaseFormat()
	 * @model containment="true"
	 * @generated
	 */
	QDatabaseFileFormat getDatabaseFormat();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.file.QDatabaseFile#getDatabaseFormat <em>Database Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Format</em>' containment reference.
	 * @see #getDatabaseFormat()
	 * @generated
	 */
	void setDatabaseFormat(QDatabaseFileFormat value);
} // QDatabaseFile
