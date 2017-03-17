/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.impl;

import java.math.BigDecimal;
import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QAdapter;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QFloating;
import org.smeup.sys.il.data.QGraphic;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QIdentity;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.term.QSpecialElement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Writer</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class DataWriterImpl extends DataVisitorImpl implements QDataWriter {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public Object object = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataWriterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.DATA_WRITER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public QDataWriter set(int value) {
		this.object = new Integer(value);
		return this;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public QDataWriter set(String value) {
		this.object = value;
		return this;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public QDataWriter set(QSpecialElement value) {
		this.object = value.getValue();
		return this;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public QDataWriter set(QBufferedData value) {
		this.object = value;
		return this;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public QDataWriter set(Object value) {
		this.object = value;
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QDataWriter set(DataSpecial value) {
		this.object = value;
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QDataWriter set(Date value) {
		this.object = value;
		return this;
	}

	@Override
	public boolean visit(QAdapter data) {
		data.eval(object);
		return false;
	}

	@Override
	public boolean visit(QBinary data) {
		visitNumericData(data);
		return false;
	}

	@Override
	public boolean visit(QCharacter data) {
		visitStringData(data);
		return false;
	}

	@Override
	public boolean visit(QDataStruct data) {
		visitStringData(data);
		return false;
	}

	@Override
	public boolean visit(QDatetime data) {
		visitDateData(data);
		return false;
	}

	@Override
	public boolean visit(QDecimal data) {
		visitNumericData(data);
		return false;
	}

	@Override
	public boolean visit(QFloating data) {
		visitNumericData(data);
		return false;
	}

	@Override
	public boolean visit(QGraphic data) {
		// TODO Auto-generated method stub
		return super.visit(data);
	}

	@Override
	public boolean visit(QHexadecimal data) {
		// TODO Auto-generated method stub
		return super.visit(data);
	}

	@Override
	public boolean visit(QIdentity data) {
		// TODO Auto-generated method stub
		return super.visit(data);
	}

	@Override
	public boolean visit(QIndicator data) {
		visitIndicatorData(data);
		return false;
	}

	@Override
	public boolean visit(QPointer data) {
		// TODO Auto-generated method stub
		return super.visit(data);
	}

	private void visitIndicatorData(QIndicator indicator) {

		if (object instanceof QString)
			indicator.eval(((QString) object).asString());
		else if (object instanceof DataSpecial)
			indicator.eval((DataSpecial) object);
		else if (object instanceof String) {
			if (object.toString().equalsIgnoreCase("*OFF"))
				indicator.eval(false);
			else if (object.toString().equalsIgnoreCase("*ON"))
				indicator.eval(true);
			else
				indicator.eval(object.toString());
		} else
			indicator.eval(!object.toString().equals("0"));

	}

	private void visitNumericData(QNumeric numeric) {

		if (object instanceof QNumeric)
			numeric.eval((QNumeric) object);
		else if (object instanceof DataSpecial)
			numeric.eval((DataSpecial) object);
		else if (object instanceof Number)
			numeric.eval((Number) object);
		else
			try {
				if (!object.toString().isEmpty())
					numeric.eval(new BigDecimal(object.toString().trim()));
				else
					numeric.clear();
			} catch (Exception e) {
				e.printStackTrace();
			}

	}

	private void visitStringData(QString string) {

		if (object == null)
			string.clear();
		else if (object instanceof QString)
			string.eval((QString) object);
		else if (object instanceof String) {
			String s = (String) object;
			string.eval(s);
		} else if (object instanceof DataSpecial)
			string.eval((DataSpecial) object);
		else
			string.eval(object.toString());

	}

	private void visitDateData(QDatetime data) {
		if (object instanceof Date)
			data.eval((Date)object);
		else 
			data.clear();		
	}

} // DataWriterImpl
