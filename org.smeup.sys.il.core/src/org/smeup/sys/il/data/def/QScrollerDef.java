/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.SortDirection;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Scroller Data Def</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.QScrollerDef#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getScrollerDef()
 * @model
 * @generated
 */
public interface QScrollerDef<D extends QScroller<QBufferedData>> extends QMultipleAtomicBufferedDataDef<D> {

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The default value is <code>"A"</code>.
	 * The literals are from the enumeration {@link org.smeup.sys.il.data.SortDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see org.smeup.sys.il.data.SortDirection
	 * @see #setOrder(SortDirection)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getScrollerDef_Order()
	 * @model default="A"
	 * @generated
	 */
	SortDirection getOrder();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.def.QScrollerDef#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see org.smeup.sys.il.data.SortDirection
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(SortDirection value);
} // QScrollerDataDef
