/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.term.QDataTerm;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Structure Def</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.smeup.sys.il.data.def.QDataStructDef#getLength <em>Length
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getDataStructDef()
 * @model
 * @generated
 */
public interface QDataStructDef extends QUnaryCompoundDataDef<QDataStruct, QDataTerm<QBufferedDataDef<?>>>, QBufferedDataDef<QDataStruct> {

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
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getDataStructDef_Length()
	 * @model
	 * @generated
	 */
	@Override
	int getLength();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.il.data.def.QDataStructDef#getLength
	 * <em>Length</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // QDataStructureDef
