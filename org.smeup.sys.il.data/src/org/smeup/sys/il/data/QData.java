/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import java.io.Serializable;
import java.lang.Enum;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getData()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface QData extends Serializable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model visitorRequired="true"
	 * @generated
	 */
	void accept(QDataVisitor visitor);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clear();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> boolean eq(E value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> void eval(E value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> boolean ge(E value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> boolean gt(E value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isEmpty();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> boolean le(E value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> boolean lt(E value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> boolean ne(E value);

} // QData
