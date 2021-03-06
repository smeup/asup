/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.usrspc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.smeup.sys.os.type.impl.TypedObjectImpl;

import org.smeup.sys.os.usrspc.QOperatingSystemUserSpacePackage;
import org.smeup.sys.os.usrspc.QUserSpace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.usrspc.impl.UserSpaceImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.smeup.sys.os.usrspc.impl.UserSpaceImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.smeup.sys.os.usrspc.impl.UserSpaceImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.smeup.sys.os.usrspc.impl.UserSpaceImpl#getContentArray <em>Content Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserSpaceImpl extends TypedObjectImpl implements QUserSpace {
	/**
	 * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected String attribute = ATTRIBUTE_EDEFAULT;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected String header = HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentArray() <em>Content Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentArray()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CONTENT_ARRAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentArray() <em>Content Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentArray()
	 * @generated
	 * @ordered
	 */
	protected byte[] contentArray = CONTENT_ARRAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemUserSpacePackage.Literals.USER_SPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(String newAttribute) {
		String oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemUserSpacePackage.USER_SPACE__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(String newHeader) {
		String oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemUserSpacePackage.USER_SPACE__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemUserSpacePackage.USER_SPACE__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getContentArray() {
		return contentArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentArray(byte[] newContentArray) {
		byte[] oldContentArray = contentArray;
		contentArray = newContentArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemUserSpacePackage.USER_SPACE__CONTENT_ARRAY, oldContentArray, contentArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemUserSpacePackage.USER_SPACE__ATTRIBUTE:
				return getAttribute();
			case QOperatingSystemUserSpacePackage.USER_SPACE__HEADER:
				return getHeader();
			case QOperatingSystemUserSpacePackage.USER_SPACE__CONTENT:
				return getContent();
			case QOperatingSystemUserSpacePackage.USER_SPACE__CONTENT_ARRAY:
				return getContentArray();
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
			case QOperatingSystemUserSpacePackage.USER_SPACE__ATTRIBUTE:
				setAttribute((String)newValue);
				return;
			case QOperatingSystemUserSpacePackage.USER_SPACE__HEADER:
				setHeader((String)newValue);
				return;
			case QOperatingSystemUserSpacePackage.USER_SPACE__CONTENT:
				setContent((String)newValue);
				return;
			case QOperatingSystemUserSpacePackage.USER_SPACE__CONTENT_ARRAY:
				setContentArray((byte[])newValue);
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
			case QOperatingSystemUserSpacePackage.USER_SPACE__ATTRIBUTE:
				setAttribute(ATTRIBUTE_EDEFAULT);
				return;
			case QOperatingSystemUserSpacePackage.USER_SPACE__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case QOperatingSystemUserSpacePackage.USER_SPACE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case QOperatingSystemUserSpacePackage.USER_SPACE__CONTENT_ARRAY:
				setContentArray(CONTENT_ARRAY_EDEFAULT);
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
			case QOperatingSystemUserSpacePackage.USER_SPACE__ATTRIBUTE:
				return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
			case QOperatingSystemUserSpacePackage.USER_SPACE__HEADER:
				return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
			case QOperatingSystemUserSpacePackage.USER_SPACE__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case QOperatingSystemUserSpacePackage.USER_SPACE__CONTENT_ARRAY:
				return CONTENT_ARRAY_EDEFAULT == null ? contentArray != null : !CONTENT_ARRAY_EDEFAULT.equals(contentArray);
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
		result.append(" (attribute: ");
		result.append(attribute);
		result.append(", header: ");
		result.append(header);
		result.append(", content: ");
		result.append(content);
		result.append(", contentArray: ");
		result.append(contentArray);
		result.append(')');
		return result.toString();
	}

} //UserSpaceImpl
