/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import org.smeup.sys.il.data.QFloating;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Floating Def</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.QFloatingDef#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.data.def.QDefPackage#getFloatingDef()
 * @model
 * @generated
 */
public interface QFloatingDef extends QUnaryAtomicBufferedDataDef<QFloating> {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.il.data.def.FloatingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.smeup.sys.il.data.def.FloatingType
	 * @see #setType(FloatingType)
	 * @see org.smeup.sys.il.data.def.QDefPackage#getFloatingDef_Type()
	 * @model required="true"
	 * @generated
	 */
	FloatingType getType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.def.QFloatingDef#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.smeup.sys.il.data.def.FloatingType
	 * @see #getType()
	 * @generated
	 */
	void setType(FloatingType value);

} // QFloatingDef
