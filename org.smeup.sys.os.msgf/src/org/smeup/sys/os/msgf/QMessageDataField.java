/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.msgf;

import org.smeup.sys.il.data.def.QUnaryAtomicBufferedDataDef;

import org.smeup.sys.il.data.term.QDataTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Data Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.msgf.QMessageDataField#getOutputMask <em>Output Mask</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.msgf.QOperatingSystemMessageFilePackage#getMessageDataField()
 * @model
 * @generated
 */
public interface QMessageDataField extends QDataTerm<QUnaryAtomicBufferedDataDef<?>> {
	/**
	 * Returns the value of the '<em><b>Output Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Mask</em>' attribute.
	 * @see #setOutputMask(String)
	 * @see org.smeup.sys.os.msgf.QOperatingSystemMessageFilePackage#getMessageDataField_OutputMask()
	 * @model
	 * @generated
	 */
	String getOutputMask();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.msgf.QMessageDataField#getOutputMask <em>Output Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Mask</em>' attribute.
	 * @see #getOutputMask()
	 * @generated
	 */
	void setOutputMask(String value);

} // QMessageDataField
