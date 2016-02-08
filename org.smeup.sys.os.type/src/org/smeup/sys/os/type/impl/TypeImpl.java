/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.type.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypedObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.type.impl.TypeImpl#getTypedClassName <em>Typed Class Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.type.impl.TypeImpl#isPersistent <em>Persistent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl<T extends QTypedObject> extends TypedObjectImpl implements QType<T> {
	/**
	 * The default value of the '{@link #getTypedClassName() <em>Typed Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPED_CLASS_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTypedClassName() <em>Typed Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedClassName()
	 * @generated
	 * @ordered
	 */
	protected String typedClassName = TYPED_CLASS_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSISTENT_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean persistent = PERSISTENT_EDEFAULT;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemTypePackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypedClassName() {
		return typedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedClassName(String newTypedClassName) {
		String oldTypedClassName = typedClassName;
		typedClassName = newTypedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPE__TYPED_CLASS_NAME, oldTypedClassName, typedClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPersistent() {
		return persistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistent(boolean newPersistent) {
		boolean oldPersistent = persistent;
		persistent = newPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPE__PERSISTENT, oldPersistent, persistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<T> getTypedClass() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemTypePackage.TYPE__TYPED_CLASS_NAME:
				return getTypedClassName();
			case QOperatingSystemTypePackage.TYPE__PERSISTENT:
				return isPersistent();
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
			case QOperatingSystemTypePackage.TYPE__TYPED_CLASS_NAME:
				setTypedClassName((String)newValue);
				return;
			case QOperatingSystemTypePackage.TYPE__PERSISTENT:
				setPersistent((Boolean)newValue);
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
			case QOperatingSystemTypePackage.TYPE__TYPED_CLASS_NAME:
				setTypedClassName(TYPED_CLASS_NAME_EDEFAULT);
				return;
			case QOperatingSystemTypePackage.TYPE__PERSISTENT:
				setPersistent(PERSISTENT_EDEFAULT);
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
			case QOperatingSystemTypePackage.TYPE__TYPED_CLASS_NAME:
				return TYPED_CLASS_NAME_EDEFAULT == null ? typedClassName != null : !TYPED_CLASS_NAME_EDEFAULT.equals(typedClassName);
			case QOperatingSystemTypePackage.TYPE__PERSISTENT:
				return persistent != PERSISTENT_EDEFAULT;
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
		result.append(" (typedClassName: ");
		result.append(typedClassName);
		result.append(", persistent: ");
		result.append(persistent);
		result.append(')');
		return result.toString();
	}

} //TypeImpl
