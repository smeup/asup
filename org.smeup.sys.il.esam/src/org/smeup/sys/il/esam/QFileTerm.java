/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
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
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.esam.QFileTerm#getFormat <em>Format</em>}</li>
 *   <li>{@link org.smeup.sys.il.esam.QFileTerm#getInfoStruct <em>Info Struct</em>}</li>
 *   <li>{@link org.smeup.sys.il.esam.QFileTerm#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.il.esam.QFileTerm#isUserOpen <em>User Open</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getFileTerm()
 * @model abstract="true"
 * @generated
 */
public interface QFileTerm extends QTerm {
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

	/**
	 * Returns the value of the '<em><b>Info Struct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Struct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Struct</em>' attribute.
	 * @see #setInfoStruct(String)
	 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getFileTerm_InfoStruct()
	 * @model
	 * @generated
	 */
	String getInfoStruct();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.esam.QFileTerm#getInfoStruct <em>Info Struct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Struct</em>' attribute.
	 * @see #getInfoStruct()
	 * @generated
	 */
	void setInfoStruct(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getFileTerm_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.esam.QFileTerm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // QFileTerm
