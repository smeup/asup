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
 * A representation of the model object '<em><b>Get Descriptor Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement#getDescriptorName <em>Descriptor Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement#getDescriptorScope <em>Descriptor Scope</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement#getIndex <em>Index</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getGetDescriptorStatement()
 * @model
 * @generated
 */
public interface QGetDescriptorStatement extends QBindingStatement {
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
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getGetDescriptorStatement_DescriptorName()
	 * @model required="true"
	 * @generated
	 */
	String getDescriptorName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement#getDescriptorName <em>Descriptor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor Name</em>' attribute.
	 * @see #getDescriptorName()
	 * @generated
	 */
	void setDescriptorName(String value);

	/**
	 * Returns the value of the '<em><b>Descriptor Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.db.syntax.dbl.DescriptorScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor Scope</em>' attribute.
	 * @see org.smeup.sys.db.syntax.dbl.DescriptorScope
	 * @see #setDescriptorScope(DescriptorScope)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getGetDescriptorStatement_DescriptorScope()
	 * @model required="true"
	 * @generated
	 */
	DescriptorScope getDescriptorScope();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement#getDescriptorScope <em>Descriptor Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor Scope</em>' attribute.
	 * @see org.smeup.sys.db.syntax.dbl.DescriptorScope
	 * @see #getDescriptorScope()
	 * @generated
	 */
	void setDescriptorScope(DescriptorScope value);

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
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getGetDescriptorStatement_Index()
	 * @model
	 * @generated
	 */
	String getIndex();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement#getIndex <em>Index</em>}' attribute.
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
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getGetDescriptorStatement_Options()
	 * @model
	 * @generated
	 */
	List<QOption> getOptions();

} // QGetDescriptorStatement
