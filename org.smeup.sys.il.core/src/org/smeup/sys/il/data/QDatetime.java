/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import java.lang.String;
import java.util.Date;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.il.data.def.TimeFormat;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Datetime</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getDatetime()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QDatetime extends QBufferedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model durationUnique="false" durationRequired="true" valueRequired="true"
	 * @generated
	 */
	void adddur(int duration, DatetimeFormat format, QDatetime value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model durationUnique="false" durationRequired="true" valueRequired="true"
	 * @generated
	 */
	void adddur(QNumeric duration, DatetimeFormat format, QDatetime value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model durationUnique="false" durationRequired="true"
	 * @generated
	 */
	void adddur(int duration, DatetimeFormat format);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model durationUnique="false" durationRequired="true"
	 * @generated
	 */
	void adddur(QNumeric duration, DatetimeFormat format);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(QDatetime value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ge(QDatetime value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean gt(QDatetime value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean le(QDatetime value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean lt(QDatetime value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ne(QDatetime value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric qDiff(QDatetime value, DatetimeFormat format);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	long asTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean eq(QDatetime value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	long t();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Date asDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dateFormatRequired="true" dateSeparatorRequired="true" timeFormatRequired="true" timeSeparatorRequired="true"
	 * @generated
	 */
	String qEditd(DateFormat dateFormat, String dateSeparator, TimeFormat timeFormat, String timeSeparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model durationUnique="false" durationRequired="true" valueRequired="true"
	 * @generated
	 */
	void subdur(int duration, DatetimeFormat format, QDatetime value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model durationUnique="false" durationRequired="true" valueRequired="true"
	 * @generated
	 */
	void subdur(QNumeric duration, DatetimeFormat format, QDatetime value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model durationUnique="false" durationRequired="true"
	 * @generated
	 */
	void subdur(int duration, DatetimeFormat format);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model durationUnique="false" durationRequired="true"
	 * @generated
	 */
	void subdur(QNumeric duration, DatetimeFormat format);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void time();

} // QDatetime
