/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam;

import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QRecord;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Relative Record Data Set</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getRRDataSet()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QRRDataSet<R extends QRecord> extends QDataSet<R> {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" relativeRecordNumberRequired="true"
	 * @generated
	 */
	boolean chain(int relativeRecordNumber);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" relativeRecordNumberRequired="true"
	 * @generated
	 */
	boolean chain(QNumeric relativeRecordNumber);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" relativeRecordNumberRequired="true"
	 * @generated
	 */
	boolean chain(QNumeric relativeRecordNumber, QIndicator notFound);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" relativeRecordNumberRequired="true"
	 * @generated
	 */
	boolean chain(QNumeric relativeRecordNumber, Boolean lock);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" relativeRecordNumberRequired="true"
	 * @generated
	 */
	boolean chain(int relativeRecordNumber, QIndicator notFound);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" relativeRecordNumberRequired="true"
	 * @generated
	 */
	boolean chain(int relativeRecordNumber, QIndicator notFound, Boolean lock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" relativeRecordNumberRequired="true"
	 * @generated
	 */
	boolean chain(int relativeRecordNumber, QIndicator notFound, QIndicator error, Boolean lock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" relativeRecordNumberRequired="true"
	 * @generated
	 */
	boolean chain(QNumeric relativeRecordNumber, QIndicator notFound, QIndicator error, Boolean lock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" relativeRecordNumberRequired="true"
	 * @generated
	 */
	boolean chain(QNumeric relativeRecordNumber, QIndicator notFound, Boolean lock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" relativeRecordNumberRequired="true"
	 * @generated
	 */
	boolean chain(QNumeric relativeRecordNumber, QIndicator notFound, QIndicator error);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model relativeRecordNumberRequired="true"
	 * @generated
	 */
	void delete(QNumeric relativeRecordNumber, QIndicator notFound);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model relativeRecordNumberRequired="true"
	 * @generated
	 */
	void delete(QNumeric relativeRecordNumber, QIndicator notFound, QIndicator error);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model relativeRecordNumberRequired="true"
	 * @generated
	 */
	void setgt(int relativeRecordNumber);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model relativeRecordNumberRequired="true"
	 * @generated
	 */
	void setgt(int relativeRecordNumber, QIndicator notFound);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model relativeRecordNumberRequired="true"
	 * @generated
	 */
	void setgt(int relativeRecordNumber, QIndicator notFound, QIndicator error);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model relativeRecordNumberRequired="true"
	 * @generated
	 */
	void setll(int relativeRecordNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setll(DataSpecial keyField);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setll(QNumeric keyField);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model relativeRecordNumberRequired="true"
	 * @generated
	 */
	void setll(int relativeRecordNumber, QIndicator notFound);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model relativeRecordNumberRequired="true"
	 * @generated
	 */
	void setll(int relativeRecordNumber, QIndicator notFound, QIndicator equal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model relativeRecordNumberRequired="true"
	 * @generated
	 */
	void setll(QNumeric relativeRecordNumber, QIndicator notFound, QIndicator equal);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model relativeRecordNumberRequired="true"
	 * @generated
	 */
	void setll(int relativeRecordNumber, QIndicator notFound, QIndicator equal, QIndicator error);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model relativeRecordNumberRequired="true"
	 * @generated
	 */
	void setgt(QNumeric relativeRecordNumber);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model relativeRecordNumberRequired="true"
	 * @generated
	 */
	void setgt(QNumeric relativeRecordNumber, QIndicator notFound);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model relativeRecordNumberRequired="true"
	 * @generated
	 */
	void setgt(QNumeric relativeRecordNumber, QIndicator notFound, QIndicator error);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setgt(DataSpecial keyField);

} // QRelativeRecordDataSet
