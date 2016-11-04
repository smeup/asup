/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.term;

import org.smeup.sys.il.core.meta.QFacet;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Range</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.term.QRange#getMax <em>Max</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.QRange#getMin <em>Min</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.data.term.QTermPackage#getRange()
 * @model
 * @generated
 */
public interface QRange extends QFacet {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(String)
	 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#getRange_Min()
	 * @model required="true"
	 * @generated
	 */
	String getMin();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.term.QRange#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(String value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(String)
	 * @see org.smeup.sys.il.data.term.QTermPackage#getRange_Max()
	 * @model default="1" required="true"
	 * @generated
	 */
	String getMax();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.term.QRange#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(String value);

} // QRange
