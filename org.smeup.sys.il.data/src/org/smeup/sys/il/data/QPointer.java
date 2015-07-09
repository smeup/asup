/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Pointer</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getPointer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QPointer extends QBufferedData {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer divide(short value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer divide(long value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer divide(int value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer divide(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	QBufferedData getTarget();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer minus(short value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer minus(long value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer minus(int value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer minus(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer mult(short value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer mult(long value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer mult(int value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer mult(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer plus(short value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer plus(long value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer plus(int value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer plus(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer power(short value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer power(long value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer power(int value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QPointer power(QNumeric value);
} // QPointer
