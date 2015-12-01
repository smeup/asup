/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import java.lang.String;



/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>String</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getString()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QString extends QBufferedData, QScanner, QCattable<QString>, QLookuppable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String asString();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean eq(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean eq(QString value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean eq(QHexadecimal value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void evalr(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void evalr(QString value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ge(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ge(QString value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ge(QHexadecimal value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean gt(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean gt(QString value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean le(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean le(QString value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean le(QHexadecimal value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean lt(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean lt(QString value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void move(boolean value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movel(boolean value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ne(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ne(QString value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ne(QHexadecimal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QNumeric qInt();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QNumeric qInth();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startRequired="true" lengthRequired="true"
	 * @generated
	 */
	QCharacter qSubst(QNumeric start, QNumeric length);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startRequired="true"
	 * @generated
	 */
	QCharacter qSubst(QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" lengthType="org.smeup.sys.il.core.java.JavaNumber" lengthRequired="true"
	 * @generated
	 */
	QCharacter qSubst(Number start, Number length);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true"
	 * @generated
	 */
	QCharacter qSubst(Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startRequired="true" lengthType="org.smeup.sys.il.core.java.JavaNumber" lengthRequired="true"
	 * @generated
	 */
	QCharacter qSubst(QNumeric start, Number length);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" lengthRequired="true"
	 * @generated
	 */
	QCharacter qSubst(Number start, QNumeric length);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String trim();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String trimL();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String trimR();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true"
	 * @generated
	 */
	void xlate(QString from, QString to, String source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(QString from, QString to, String source, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true"
	 * @generated
	 */
	void xlate(QString from, QString to, String source, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(QString from, QString to, String source, Number start, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startRequired="true"
	 * @generated
	 */
	void xlate(QString from, QString to, String source, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(QString from, QString to, String source, QNumeric start, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true"
	 * @generated
	 */
	void xlate(QString from, QString to, QString source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(QString from, QString to, QString source, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true"
	 * @generated
	 */
	void xlate(QString from, QString to, QString source, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(QString from, QString to, QString source, Number start, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startRequired="true"
	 * @generated
	 */
	void xlate(QString from, QString to, QString source, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(QString from, QString to, QString source, QNumeric start, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true"
	 * @generated
	 */
	void xlate(String from, String to, String source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(String from, String to, String source, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true"
	 * @generated
	 */
	void xlate(String from, String to, String source, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(String from, String to, String source, Number start, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startRequired="true"
	 * @generated
	 */
	void xlate(String from, String to, String source, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(String from, String to, String source, QNumeric start, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true"
	 * @generated
	 */
	void xlate(String from, String to, QString source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(String from, String to, QString source, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true"
	 * @generated
	 */
	void xlate(String from, String to, QString source, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(String from, String to, QString source, Number start, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startRequired="true"
	 * @generated
	 */
	void xlate(String from, String to, QString source, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(String from, String to, QString source, QNumeric start, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true"
	 * @generated
	 */
	void xlate(String from, QString to, QString source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(String from, QString to, QString source, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true"
	 * @generated
	 */
	void xlate(String from, QString to, QString source, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(String from, QString to, QString source, Number start, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startRequired="true"
	 * @generated
	 */
	void xlate(String from, QString to, QString source, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(String from, QString to, QString source, QNumeric start, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true"
	 * @generated
	 */
	void xlate(QString from, String to, QString source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(QString from, String to, QString source, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true"
	 * @generated
	 */
	void xlate(QString from, String to, QString source, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(QString from, String to, QString source, Number start, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startRequired="true"
	 * @generated
	 */
	void xlate(QString from, String to, QString source, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true" startRequired="true" clearRequired="true"
	 * @generated
	 */
	void xlate(QString from, String to, QString source, QNumeric start, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" toRequired="true" sourceRequired="true"
	 * @generated
	 */
	void xlate(byte from, String to, QString source);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model numericRequired="true"
	 * @generated
	 */
	void testn(QIndicator numeric);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QCharacter qTrim();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QCharacter qTriml();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QCharacter qTrimr();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String s();
} // QString
