/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl;

import java.util.List;

import org.smeup.sys.db.syntax.QBindingStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Descriptor Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QSetDescriptorStatement#getDescriptorName <em>Descriptor Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QSetDescriptorStatement#getIndex <em>Index</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QSetDescriptorStatement#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getSetDescriptorStatement()
 * @model
 * @generated
 */
public interface QSetDescriptorStatement extends QBindingStatement {
	/**
	 * Returns the value of the '<em><b>Descriptor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor Name</em>' attribute.
	 * @see #setDescriptorName(String)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getSetDescriptorStatement_DescriptorName()
	 * @model required="true"
	 * @generated
	 */
	String getDescriptorName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QSetDescriptorStatement#getDescriptorName <em>Descriptor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor Name</em>' attribute.
	 * @see #getDescriptorName()
	 * @generated
	 */
	void setDescriptorName(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(String)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getSetDescriptorStatement_Index()
	 * @model
	 * @generated
	 */
	String getIndex();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QSetDescriptorStatement#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' reference list.
	 * The list contents are of type {@link org.smeup.sys.db.syntax.dbl.QOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' reference list.
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getSetDescriptorStatement_Options()
	 * @model
	 * @generated
	 */
	List<QOption> getOptions();

} // QSetDescriptorStatement
