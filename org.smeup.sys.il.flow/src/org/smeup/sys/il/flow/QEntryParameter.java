/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow;

import org.smeup.sys.il.core.QNamedNode;
import org.smeup.sys.il.core.term.QTerm;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Entry Parameter</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.QEntryParameter#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QEntryParameter#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QEntryParameter#getPassingType <em>Passing Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getEntryParameter()
 * @model
 * @generated
 */
public interface QEntryParameter<T extends QTerm> extends QNamedNode {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' containment reference.
	 * @see #setDelegate(QTerm)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getEntryParameter_Delegate()
	 * @model containment="true"
	 * @generated
	 */
	T getDelegate();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QEntryParameter#getDelegate <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' containment reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(T value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getEntryParameter_Nullable()
	 * @model
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QEntryParameter#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Passing Type</b></em>' attribute.
	 * The default value is <code>"REF"</code>.
	 * The literals are from the enumeration {@link org.smeup.sys.il.flow.PassingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passing Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passing Type</em>' attribute.
	 * @see org.smeup.sys.il.flow.PassingType
	 * @see #setPassingType(PassingType)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getEntryParameter_PassingType()
	 * @model default="REF" required="true"
	 * @generated
	 */
	PassingType getPassingType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QEntryParameter#getPassingType <em>Passing Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Passing Type</em>' attribute.
	 * @see org.smeup.sys.il.flow.PassingType
	 * @see #getPassingType()
	 * @generated
	 */
	void setPassingType(PassingType value);

} // QEntryParameter
