/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.data.QGraphic;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.QGraphicDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphic Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.impl.GraphicDefImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicDefImpl extends UnaryAtomicBufferedDataDefImpl<QGraphic> implements QGraphicDef {
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataDefPackage.Literals.GRAPHIC_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.GRAPHIC_DEF__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageDataDefPackage.GRAPHIC_DEF__LENGTH:
				return getLength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QIntegratedLanguageDataDefPackage.GRAPHIC_DEF__LENGTH:
				setLength((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QIntegratedLanguageDataDefPackage.GRAPHIC_DEF__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QIntegratedLanguageDataDefPackage.GRAPHIC_DEF__LENGTH:
				return length != LENGTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

	@Override
	public Class<QGraphic> getDataClass() {
		return QGraphic.class;
	}

	@Override
	public Class<?> getJavaClass() {
		return String.class;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.CHARACTER;
	}

} //GraphicDefImpl
