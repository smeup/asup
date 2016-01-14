/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import java.util.List;

import org.smeup.sys.il.data.QStruct;
import org.smeup.sys.il.data.term.QDataTerm;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Compound Data Def</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.QCompoundDataDef#getClassDelegator <em>Class Delegator</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.QCompoundDataDef#getElements <em>Elements</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.QCompoundDataDef#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.QCompoundDataDef#isQualified <em>Qualified</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getCompoundDataDef()
 * @model abstract="true"
 * @generated
 */
public interface QCompoundDataDef<D extends QStruct<?>, E extends QDataTerm<?>> extends QDataDef<D> {

	/**
	 * Returns the value of the '<em><b>Class Delegator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Delegator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Delegator</em>' attribute.
	 * @see #setClassDelegator(String)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getCompoundDataDef_ClassDelegator()
	 * @model
	 * @generated
	 */
	String getClassDelegator();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.def.QCompoundDataDef#getClassDelegator <em>Class Delegator</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Class Delegator</em>' attribute.
	 * @see #getClassDelegator()
	 * @generated
	 */
	void setClassDelegator(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getCompoundDataDef_Elements()
	 * @model containment="true"
	 * @generated
	 */
	List<E> getElements();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getCompoundDataDef_Prefix()
	 * @model
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.il.data.def.QCompoundDataDef#getPrefix
	 * <em>Prefix</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Qualified</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Qualified</em>' attribute.
	 * @see #setQualified(boolean)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getCompoundDataDef_Qualified()
	 * @model
	 * @generated
	 */
	boolean isQualified();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.il.data.def.QCompoundDataDef#isQualified
	 * <em>Qualified</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Qualified</em>' attribute.
	 * @see #isQualified()
	 * @generated
	 */
	void setQualified(boolean value);
} // QCompoundDataDef
