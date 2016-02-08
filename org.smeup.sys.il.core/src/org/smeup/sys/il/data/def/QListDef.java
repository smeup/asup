/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import org.smeup.sys.il.data.QList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>List Def</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.QListDef#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getListDef()
 * @model
 * @generated
 */
public interface QListDef<D extends QList<?>> extends QMultipleAtomicDataDef<D> {

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(QUnaryAtomicDataDef)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getListDef_Argument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	@Override
	QUnaryAtomicDataDef<?> getArgument();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.def.QListDef#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(QUnaryAtomicDataDef<?> value);
} // QListDef
