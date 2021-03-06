/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import org.smeup.sys.il.data.QHexadecimal;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Hexadecimal Def</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.QHexadecimalDef#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getHexadecimalDef()
 * @model
 * @generated
 */
public interface QHexadecimalDef extends QUnaryAtomicBufferedDataDef<QHexadecimal> {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getHexadecimalDef_Length()
	 * @model required="true"
	 * @generated
	 */
	@Override
	int getLength();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.il.data.def.QHexadecimalDef#getLength
	 * <em>Length</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // QHexadecimalDef
