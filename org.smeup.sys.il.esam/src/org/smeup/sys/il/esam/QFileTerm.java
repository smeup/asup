/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam;

import org.smeup.sys.il.core.term.QTerm;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.term.QDataTerm;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>File Term</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.esam.QFileTerm#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.smeup.sys.il.esam.QFileTerm#isUserOpen <em>User Open</em>}</li>
 *   <li>{@link org.smeup.sys.il.esam.QFileTerm#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getFileTerm()
 * @model abstract="true"
 * @generated
 */
public interface QFileTerm extends QTerm {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getFileTerm_FileName()
	 * @model required="true"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.esam.QFileTerm#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>User Open</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Imposta
	 * il tipo di accesso al data set. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>User Open</em>' attribute.
	 * @see #setUserOpen(boolean)
	 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getFileTerm_UserOpen()
	 * @model required="true"
	 * @generated
	 */
	boolean isUserOpen();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.esam.QFileTerm#isUserOpen
	 * <em>User Open</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>User Open</em>' attribute.
	 * @see #isUserOpen()
	 * @generated
	 */
	void setUserOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' containment reference.
	 * @see #setFormat(QDataTerm)
	 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getFileTerm_Format()
	 * @model containment="true"
	 * @generated
	 */
	QDataTerm<QCompoundDataDef<?, QDataTerm<?>>> getFormat();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.esam.QFileTerm#getFormat <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' containment reference.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(QDataTerm<QCompoundDataDef<?, QDataTerm<?>>> value);

} // QFileTerm
