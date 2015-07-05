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
 * <em><b>Indicator</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getIndicator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QIndicator extends QBufferedData {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true"
	 * @generated
	 */
	boolean asBoolean();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true"
	 * @generated
	 */
	boolean b();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean eq(boolean value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ne(boolean value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean eq(QIndicator value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true" EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	@Override
	<E extends Enum<E>> boolean eq(E value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean eq(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(boolean value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ne(QIndicator value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true" EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	@Override
	<E extends Enum<E>> boolean ne(E value);

} // QIndicator
