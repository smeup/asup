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
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;
import org.smeup.sys.os.type.QTypedObject;
import org.smeup.sys.os.type.QTypedRef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QTyped Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.type.impl.TypedRefImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.smeup.sys.os.type.impl.TypedRefImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypedRefImpl<T extends QTypedObject> extends ObjectImpl implements QTypedRef<T> {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected String library = LIBRARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemTypePackage.Literals.TYPED_REF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibrary(String newLibrary) {
		String oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPED_REF__LIBRARY, oldLibrary, library));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPED_REF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemTypePackage.TYPED_REF__LIBRARY:
				return getLibrary();
			case QOperatingSystemTypePackage.TYPED_REF__NAME:
				return getName();
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
			case QOperatingSystemTypePackage.TYPED_REF__LIBRARY:
				setLibrary((String)newValue);
				return;
			case QOperatingSystemTypePackage.TYPED_REF__NAME:
				setName((String)newValue);
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
			case QOperatingSystemTypePackage.TYPED_REF__LIBRARY:
				setLibrary(LIBRARY_EDEFAULT);
				return;
			case QOperatingSystemTypePackage.TYPED_REF__NAME:
				setName(NAME_EDEFAULT);
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
			case QOperatingSystemTypePackage.TYPED_REF__LIBRARY:
				return LIBRARY_EDEFAULT == null ? library != null : !LIBRARY_EDEFAULT.equals(library);
			case QOperatingSystemTypePackage.TYPED_REF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (library: ");
		result.append(library);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // QTypedReferenceImpl
