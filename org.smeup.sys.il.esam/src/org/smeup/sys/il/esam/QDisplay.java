/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam;

import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QNumeric;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Display</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getDisplay()
 * @model interface="true" abstract="true" DBounds="org.eclipse.emf.ecore.EJavaObject"
 * @generated
 */
public interface QDisplay<D extends Object> {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model formatRequired="true" relativeRecordNumberRequired="true"
	 * @generated
	 */
	void chain(Class<?> format, int relativeRecordNumber, QIndicator notFound);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model formatRequired="true" relativeRecordNumberRequired="true"
	 * @generated
	 */
	void chain(Class<?> format, QNumeric relativeRecordNumber, QIndicator notFound);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close(QIndicator error);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isOpen();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void open();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void open(QIndicator error);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model formatRequired="true"
	 * @generated
	 */
	void readc(Class<?> format);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model formatRequired="true"
	 * @generated
	 */
	void show(Class<?> format);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model formatRequired="true"
	 * @generated
	 */
	void update(Class<?> format);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model formatRequired="true"
	 * @generated
	 */
	void write(Class<?> format);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	D get();

} // QDisplay
