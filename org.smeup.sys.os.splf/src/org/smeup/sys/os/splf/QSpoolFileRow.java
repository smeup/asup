/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.splf;

import org.smeup.sys.il.core.QObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spool File Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.splf.QSpoolFileRow#getSpoolFile <em>Spool File</em>}</li>
 *   <li>{@link org.smeup.sys.os.splf.QSpoolFileRow#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.splf.QOperatingSystemSpoolfilePackage#getSpoolFileRow()
 * @model
 * @generated
 */
public interface QSpoolFileRow extends QObject {
	/**
	 * Returns the value of the '<em><b>Spool File</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.smeup.sys.os.splf.QSpoolFile#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spool File</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spool File</em>' container reference.
	 * @see #setSpoolFile(QSpoolFile)
	 * @see org.smeup.sys.os.splf.QOperatingSystemSpoolfilePackage#getSpoolFileRow_SpoolFile()
	 * @see org.smeup.sys.os.splf.QSpoolFile#getRows
	 * @model opposite="rows" required="true" transient="false"
	 * @generated
	 */
	QSpoolFile getSpoolFile();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.splf.QSpoolFileRow#getSpoolFile <em>Spool File</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spool File</em>' container reference.
	 * @see #getSpoolFile()
	 * @generated
	 */
	void setSpoolFile(QSpoolFile value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.smeup.sys.os.splf.QOperatingSystemSpoolfilePackage#getSpoolFileRow_Content()
	 * @model required="true"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.splf.QSpoolFileRow#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // QSpoolFileRow
