/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.dtaara.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.os.dtaara.DataAreaType;
import org.smeup.sys.os.dtaara.QDataArea;
import org.smeup.sys.os.dtaara.QOperatingSystemDataAreaPackage;
import org.smeup.sys.os.type.impl.TypedObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QData Area</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.dtaara.impl.DataAreaImpl#getDataAreaType <em>Data Area Type</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaara.impl.DataAreaImpl#getContentLength <em>Content Length</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaara.impl.DataAreaImpl#getContentDecimal <em>Content Decimal</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaara.impl.DataAreaImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataAreaImpl extends TypedObjectImpl implements QDataArea {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getDataAreaType() <em>Data Area Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDataAreaType()
	 * @generated
	 * @ordered
	 */
	protected static final DataAreaType DATA_AREA_TYPE_EDEFAULT = DataAreaType.CHARACTER;

	/**
	 * The cached value of the '{@link #getDataAreaType() <em>Data Area Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDataAreaType()
	 * @generated
	 * @ordered
	 */
	protected DataAreaType dataAreaType = DATA_AREA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentLength() <em>Content Length</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getContentLength()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTENT_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContentLength() <em>Content Length</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getContentLength()
	 * @generated
	 * @ordered
	 */
	protected int contentLength = CONTENT_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentDecimal() <em>Content Decimal</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getContentDecimal()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTENT_DECIMAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContentDecimal() <em>Content Decimal</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getContentDecimal()
	 * @generated
	 * @ordered
	 */
	protected int contentDecimal = CONTENT_DECIMAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemDataAreaPackage.Literals.DATA_AREA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAreaType getDataAreaType() {
		return dataAreaType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataAreaType(DataAreaType newDataAreaType) {
		DataAreaType oldDataAreaType = dataAreaType;
		dataAreaType = newDataAreaType == null ? DATA_AREA_TYPE_EDEFAULT : newDataAreaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataAreaPackage.DATA_AREA__DATA_AREA_TYPE, oldDataAreaType, dataAreaType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getContentLength() {
		return contentLength;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentLength(int newContentLength) {
		int oldContentLength = contentLength;
		contentLength = newContentLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataAreaPackage.DATA_AREA__CONTENT_LENGTH, oldContentLength, contentLength));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getContentDecimal() {
		return contentDecimal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentDecimal(int newContentDecimal) {
		int oldContentDecimal = contentDecimal;
		contentDecimal = newContentDecimal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataAreaPackage.DATA_AREA__CONTENT_DECIMAL, oldContentDecimal, contentDecimal));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataAreaPackage.DATA_AREA__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemDataAreaPackage.DATA_AREA__DATA_AREA_TYPE:
				return getDataAreaType();
			case QOperatingSystemDataAreaPackage.DATA_AREA__CONTENT_LENGTH:
				return getContentLength();
			case QOperatingSystemDataAreaPackage.DATA_AREA__CONTENT_DECIMAL:
				return getContentDecimal();
			case QOperatingSystemDataAreaPackage.DATA_AREA__CONTENT:
				return getContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QOperatingSystemDataAreaPackage.DATA_AREA__DATA_AREA_TYPE:
				setDataAreaType((DataAreaType)newValue);
				return;
			case QOperatingSystemDataAreaPackage.DATA_AREA__CONTENT_LENGTH:
				setContentLength((Integer)newValue);
				return;
			case QOperatingSystemDataAreaPackage.DATA_AREA__CONTENT_DECIMAL:
				setContentDecimal((Integer)newValue);
				return;
			case QOperatingSystemDataAreaPackage.DATA_AREA__CONTENT:
				setContent((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QOperatingSystemDataAreaPackage.DATA_AREA__DATA_AREA_TYPE:
				setDataAreaType(DATA_AREA_TYPE_EDEFAULT);
				return;
			case QOperatingSystemDataAreaPackage.DATA_AREA__CONTENT_LENGTH:
				setContentLength(CONTENT_LENGTH_EDEFAULT);
				return;
			case QOperatingSystemDataAreaPackage.DATA_AREA__CONTENT_DECIMAL:
				setContentDecimal(CONTENT_DECIMAL_EDEFAULT);
				return;
			case QOperatingSystemDataAreaPackage.DATA_AREA__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QOperatingSystemDataAreaPackage.DATA_AREA__DATA_AREA_TYPE:
				return dataAreaType != DATA_AREA_TYPE_EDEFAULT;
			case QOperatingSystemDataAreaPackage.DATA_AREA__CONTENT_LENGTH:
				return contentLength != CONTENT_LENGTH_EDEFAULT;
			case QOperatingSystemDataAreaPackage.DATA_AREA__CONTENT_DECIMAL:
				return contentDecimal != CONTENT_DECIMAL_EDEFAULT;
			case QOperatingSystemDataAreaPackage.DATA_AREA__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dataAreaType: ");
		result.append(dataAreaType);
		result.append(", contentLength: ");
		result.append(contentLength);
		result.append(", contentDecimal: ");
		result.append(contentDecimal);
		result.append(", content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getAttribute() {
		return null;
	}
} // DataAreaImpl
