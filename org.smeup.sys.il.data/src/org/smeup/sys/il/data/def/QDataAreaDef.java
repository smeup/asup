/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import org.smeup.sys.il.data.QBufferedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Area Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.QDataAreaDef#getExternalName <em>External Name</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.data.def.QDefPackage#getDataAreaDef()
 * @model
 * @generated
 */
public interface QDataAreaDef<D extends QBufferedElement> extends QUnaryBufferedDataDef<D>, QWrapperDef<D> {

	/**
	 * Returns the value of the '<em><b>External Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Name</em>' attribute.
	 * @see #setExternalName(String)
	 * @see org.smeup.sys.il.data.def.QDefPackage#getDataAreaDef_ExternalName()
	 * @model
	 * @generated
	 */
	String getExternalName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.def.QDataAreaDef#getExternalName <em>External Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Name</em>' attribute.
	 * @see #getExternalName()
	 * @generated
	 */
	void setExternalName(String value);

} // QDataAreaDef
