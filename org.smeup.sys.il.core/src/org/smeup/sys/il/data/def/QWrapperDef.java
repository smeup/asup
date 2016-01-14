/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wrapper Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.QWrapperDef#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getWrapperDef()
 * @model abstract="true"
 * @generated
 */
public interface QWrapperDef {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(QBufferedDataDef)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getWrapperDef_Argument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QBufferedDataDef<?> getArgument();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.def.QWrapperDef#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(QBufferedDataDef<?> value);

} // QWrapperDef
