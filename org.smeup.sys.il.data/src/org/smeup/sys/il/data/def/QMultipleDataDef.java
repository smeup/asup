/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import org.smeup.sys.il.data.QList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Multiple Data Def</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.QMultipleDataDef#getDimension <em>Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getMultipleDataDef()
 * @model abstract="true"
 * @generated
 */
public interface QMultipleDataDef<D extends QList<?>> extends QDataDef<D> {

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Dimension</em>' attribute.
	 * @see #setDimension(int)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getMultipleDataDef_Dimension()
	 * @model required="true"
	 * @generated
	 */
	int getDimension();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.il.data.def.QMultipleDataDef#getDimension
	 * <em>Dimension</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Dimension</em>' attribute.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(int value);
} // QMultipleDataDef
