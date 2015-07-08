/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import org.smeup.sys.il.data.QBufferedList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Multiple Atomic Buffered Data Def</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.smeup.sys.il.data.def.QMultipleAtomicBufferedDataDef#getArgument
 * <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getMultipleAtomicBufferedDataDef()
 * @model abstract="true"
 * @generated
 */
public interface QMultipleAtomicBufferedDataDef<D extends QBufferedList<?>> extends QMultipleAtomicDataDef<D>, QBufferedDataDef<D> {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(QUnaryAtomicBufferedDataDef)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getMultipleAtomicBufferedDataDef_Argument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	@Override
	QUnaryAtomicBufferedDataDef<?> getArgument();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.il.data.def.QMultipleAtomicBufferedDataDef#getArgument
	 * <em>Argument</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Argument</em>' containment
	 *            reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(QUnaryAtomicBufferedDataDef<?> value);

} // QMultipleAtomicBufferedDataDef
