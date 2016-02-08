/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Visitor</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getDataVisitor()
 * @model abstract="true"
 * @generated
 */
public interface QDataVisitor {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QData data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void endVisit(QAdapter value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QArray<?> data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QBinary data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QCharacter data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QDataStruct data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QDatetime data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QDecimal data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QEnum<?, ?> data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QFloating data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QGraphic data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QHexadecimal data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QIdentity data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QIndicator data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QList<?> data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QPointer data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QScroller<?> data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	void endVisit(QStroller<?> data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QData data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QAdapter data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QArray<?> data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QBinary data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QCharacter data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QDataStruct data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QDatetime data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QDecimal data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QEnum<?, ?> data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QFloating data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QGraphic data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QHexadecimal data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QIdentity data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QIndicator data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QList<?> data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QPointer data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QScroller<?> data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataRequired="true"
	 * @generated
	 */
	boolean visit(QStroller<?> data);

} // QDataVisitor
