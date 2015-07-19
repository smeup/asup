/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import org.smeup.sys.il.data.QPointer;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Pointer Def</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.QPointerDef#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getPointerDef()
 * @model
 * @generated
 */
public interface QPointerDef extends QUnaryAtomicBufferedDataDef<QPointer> {

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getPointerDef_Target()
	 * @model
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.def.QPointerDef#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);
} // QPointerDef
