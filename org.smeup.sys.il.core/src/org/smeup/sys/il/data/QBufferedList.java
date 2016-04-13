/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

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
public interface QBufferedList<D extends QBufferedElement> extends QList<D>, QBufferedData, QMoveable {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void eval(QList<? extends QNumeric> value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QBufferedData eval(DataSpecial value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QBufferedData eval(QDataFiller value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void eval(Number value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	void eval(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void eval(QNumeric value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(QString value);
} // QBufferedList
