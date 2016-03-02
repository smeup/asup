/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import java.lang.Enum;
import java.lang.String;


/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Moveable</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getMoveable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QMoveable {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void move(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void move(String value, boolean clear);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void move(int value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void move(int value, boolean clear);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void move(QBufferedData value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void move(QBufferedData value, boolean clear);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model EBounds="org.smeup.sys.mi.core.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> void move(E value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model clearRequired="true" EBounds="org.smeup.sys.mi.core.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> void move(E value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void move(QDataFiller value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void move(QDataFiller value, boolean clear);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber"
	 * @generated
	 */
	void move(Number value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" clearRequired="true"
	 * @generated
	 */
	void move(Number value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void move(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void move(boolean value, boolean clear);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movea(QArray<?> value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void movea(QArray<?> value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model startIndexRequired="true"
	 * @generated
	 */
	void movea(QArray<?> value, int startIndex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model startIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(QArray<?> value, int startIndex, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model startIndexRequired="true"
	 * @generated
	 */
	void movea(QArray<?> value, QNumeric startIndex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model startIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(QArray<?> value, QNumeric startIndex, boolean clear);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movel(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void movel(String value, boolean clear);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movel(int value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void movel(int value, boolean clear);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movel(QBufferedData value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void movel(QBufferedData value, boolean clear);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model EBounds="org.smeup.sys.mi.core.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> void movel(E value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model clearRequired="true" EBounds="org.smeup.sys.mi.core.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> void movel(E value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movel(QDataFiller value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void movel(QDataFiller value, boolean clear);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber"
	 * @generated
	 */
	void movel(Number value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" clearRequired="true"
	 * @generated
	 */
	void movel(Number value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movel(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void movel(boolean value, boolean clear);

} // QMoveable
