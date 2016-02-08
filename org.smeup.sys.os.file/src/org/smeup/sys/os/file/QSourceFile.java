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
 * <em><b>Source File</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.file.QSourceFile#getFileType <em>File Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getSourceFile()
 * @model
 * @generated
 */
public interface QSourceFile extends QFile, QFileMembered {

	/**
	 * Returns the value of the '<em><b>File Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Type</em>' attribute.
	 * @see #setFileType(String)
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getSourceFile_FileType()
	 * @model
	 * @generated
	 */
	String getFileType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.file.QSourceFile#getFileType <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Type</em>' attribute.
	 * @see #getFileType()
	 * @generated
	 */
	void setFileType(String value);
} // QSourceFile
