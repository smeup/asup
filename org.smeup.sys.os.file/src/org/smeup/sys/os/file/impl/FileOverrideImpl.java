/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileOverride;
import org.smeup.sys.os.file.QOperatingSystemFilePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>File Override</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.file.impl.FileOverrideImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.file.impl.FileOverrideImpl#getFileTo <em>File To</em>}</li>
 *   <li>{@link org.smeup.sys.os.file.impl.FileOverrideImpl#getMemberTo <em>Member To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileOverrideImpl extends ObjectImpl implements QFileOverride {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

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
	 * The cached value of the '{@link #getFileTo() <em>File To</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFileTo()
	 * @generated
	 * @ordered
	 */
	protected QFile fileTo;

	/**
	 * The default value of the '{@link #getMemberTo() <em>Member To</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMemberTo()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMBER_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemberTo() <em>Member To</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMemberTo()
	 * @generated
	 * @ordered
	 */
	protected String memberTo = MEMBER_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FileOverrideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.FILE_OVERRIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibrary() {
		return fileTo.getLibrary();
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
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.FILE_OVERRIDE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QFile getFileTo() {
		if (fileTo != null && ((EObject)fileTo).eIsProxy()) {
			InternalEObject oldFileTo = (InternalEObject)fileTo;
			fileTo = (QFile)eResolveProxy(oldFileTo);
			if (fileTo != oldFileTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QOperatingSystemFilePackage.FILE_OVERRIDE__FILE_TO, oldFileTo, fileTo));
			}
		}
		return fileTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QFile basicGetFileTo() {
		return fileTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileTo(QFile newFileTo) {
		QFile oldFileTo = fileTo;
		fileTo = newFileTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.FILE_OVERRIDE__FILE_TO, oldFileTo, fileTo));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMemberTo() {
		return memberTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberTo(String newMemberTo) {
		String oldMemberTo = memberTo;
		memberTo = newMemberTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.FILE_OVERRIDE__MEMBER_TO, oldMemberTo, memberTo));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemFilePackage.FILE_OVERRIDE__NAME:
				return getName();
			case QOperatingSystemFilePackage.FILE_OVERRIDE__FILE_TO:
				if (resolve) return getFileTo();
				return basicGetFileTo();
			case QOperatingSystemFilePackage.FILE_OVERRIDE__MEMBER_TO:
				return getMemberTo();
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
			case QOperatingSystemFilePackage.FILE_OVERRIDE__NAME:
				setName((String)newValue);
				return;
			case QOperatingSystemFilePackage.FILE_OVERRIDE__FILE_TO:
				setFileTo((QFile)newValue);
				return;
			case QOperatingSystemFilePackage.FILE_OVERRIDE__MEMBER_TO:
				setMemberTo((String)newValue);
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
			case QOperatingSystemFilePackage.FILE_OVERRIDE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QOperatingSystemFilePackage.FILE_OVERRIDE__FILE_TO:
				setFileTo((QFile)null);
				return;
			case QOperatingSystemFilePackage.FILE_OVERRIDE__MEMBER_TO:
				setMemberTo(MEMBER_TO_EDEFAULT);
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
			case QOperatingSystemFilePackage.FILE_OVERRIDE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QOperatingSystemFilePackage.FILE_OVERRIDE__FILE_TO:
				return fileTo != null;
			case QOperatingSystemFilePackage.FILE_OVERRIDE__MEMBER_TO:
				return MEMBER_TO_EDEFAULT == null ? memberTo != null : !MEMBER_TO_EDEFAULT.equals(memberTo);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", memberTo: ");
		result.append(memberTo);
		result.append(')');
		return result.toString();
	}

} // FileOverrideImpl
