/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QFloating;
import org.smeup.sys.il.data.QGraphic;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QIdentity;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Filler</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DataFillerImpl extends DataVisitorImpl implements QDataFiller {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public QBufferedData filler = null;

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
	public QDataFiller set(QBufferedData value) {
		this.filler = value;
		return this;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QBufferedData get() {
		return filler;
	}

	@Override
	public boolean visit(QBinary data) {
		data.fill(filler);
		return false;
	}

	@Override
	public boolean visit(QCharacter data) {
		data.fill(filler);
		return false;
	}

	@Override
	public boolean visit(QDataStruct data) {
		data.fill(filler);
		return false;
	}

	@Override
	public boolean visit(QDatetime data) {
		data.fill(filler);
		return false;
	}

	@Override
	public boolean visit(QDecimal data) {
		data.fill(filler);
		return false;
	}

	@Override
	public boolean visit(QFloating data) {
		data.fill(filler);
		return false;
	}

	@Override
	public boolean visit(QGraphic data) {
		data.fill(filler);
		return false;
	}

	@Override
	public boolean visit(QHexadecimal data) {
		data.fill(filler);
		return false;
	}

	@Override
	public boolean visit(QIdentity data) {
		data.fill(filler);
		return false;
	}

	@Override
	public boolean visit(QIndicator data) {
		data.fill(filler);
		return false;
	}
} //DataFillerImpl