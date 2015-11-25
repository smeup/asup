/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.impl;

import java.lang.String;
import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Filler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DataFillerImpl extends DataVisitorImpl implements QDataFiller {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public Object object = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFillerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.DATA_FILLER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public QDataFiller set(int value) {
		this.object = new Integer(value);
		return this;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public QDataFiller set(String value) {
		this.object = value;
		return this;
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public QDataFiller set(QBufferedData value) {
		this.object = value;
		return this;
	}
} //DataFillerImpl
