/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
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
 * <em><b>Buffered List</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getBufferedList()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QBufferedList<D extends QBufferedData> extends QList<D>, QBufferedData {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sorta();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movea(QBufferedData value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void movea(QBufferedData value, boolean clear);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movea(QDataWriter value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movea(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> void movea(E value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> void movea(int targetIndex, E value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, QDataWriter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, QArray<?> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, QArray<?> value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, QBufferedData value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, QBufferedData value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, String value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceIndexRequired="true"
	 * @generated
	 */
	void movea(QArray<?> value, int sourceIndex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(QArray<?> value, int sourceIndex, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" sourceIndexRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, QArray<?> value, int sourceIndex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" sourceIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, QArray<?> value, int sourceIndex, boolean clear);
} // QBufferedList
