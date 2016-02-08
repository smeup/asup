/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow;

import org.smeup.sys.il.core.meta.QFacet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.QConversion#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getConversion()
 * @model
 * @generated
 */
public interface QConversion extends QFacet {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.il.flow.ConversionStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.smeup.sys.il.flow.ConversionStatus
	 * @see #setStatus(ConversionStatus)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getConversion_Status()
	 * @model required="true"
	 * @generated
	 */
	ConversionStatus getStatus();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QConversion#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.smeup.sys.il.flow.ConversionStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ConversionStatus value);

} // QConversion
