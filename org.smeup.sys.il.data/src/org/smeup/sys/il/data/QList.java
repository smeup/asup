/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>List</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getList()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface QList<D extends QData> extends QData, Iterable<D> {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @model dataType="org.smeup.sys.il.data.DataArray" required="true"
	 * @generated
	 */
	D[] asArray();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @model indexRequired="true"
	 * @generated
	 */
	D get(Number index);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @model indexRequired="true"
	 * @generated
	 */
	D get(QNumeric index);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @model required="true"
	 * @generated
	 */
	int capacity();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @model required="true"
	 * @generated
	 */
	int count();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(QList<D> value);

} // QList
