/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberRow;
import org.smeup.sys.os.file.QOperatingSystemFilePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Member Row</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.file.impl.FileMemberRowImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.smeup.sys.os.file.impl.FileMemberRowImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.smeup.sys.os.file.impl.FileMemberRowImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.smeup.sys.os.file.impl.FileMemberRowImpl#getFileMember <em>File Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileMemberRowImpl extends ObjectImpl implements QFileMemberRow {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected int sequence = SEQUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final int DATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected int date = DATE_EDEFAULT;

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
	protected FileMemberRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.FILE_MEMBER_ROW;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequence(int newSequence) {
		int oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.FILE_MEMBER_ROW__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(int newDate) {
		int oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.FILE_MEMBER_ROW__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.FILE_MEMBER_ROW__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QFileMember getFileMember() {
		if (eContainerFeatureID() != QOperatingSystemFilePackage.FILE_MEMBER_ROW__FILE_MEMBER) return null;
		return (QFileMember)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileMember(QFileMember newFileMember, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFileMember, QOperatingSystemFilePackage.FILE_MEMBER_ROW__FILE_MEMBER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileMember(QFileMember newFileMember) {
		if (newFileMember != eInternalContainer() || (eContainerFeatureID() != QOperatingSystemFilePackage.FILE_MEMBER_ROW__FILE_MEMBER && newFileMember != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newFileMember))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFileMember != null)
				msgs = ((InternalEObject)newFileMember).eInverseAdd(this, QOperatingSystemFilePackage.FILE_MEMBER__ROWS, QFileMember.class, msgs);
			msgs = basicSetFileMember(newFileMember, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.FILE_MEMBER_ROW__FILE_MEMBER, newFileMember, newFileMember));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__FILE_MEMBER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFileMember((QFileMember)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__FILE_MEMBER:
				return basicSetFileMember(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__FILE_MEMBER:
				return eInternalContainer().eInverseRemove(this, QOperatingSystemFilePackage.FILE_MEMBER__ROWS, QFileMember.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__SEQUENCE:
				return getSequence();
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__DATE:
				return getDate();
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__CONTENT:
				return getContent();
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__FILE_MEMBER:
				return getFileMember();
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
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__SEQUENCE:
				setSequence((Integer)newValue);
				return;
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__DATE:
				setDate((Integer)newValue);
				return;
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__CONTENT:
				setContent((String)newValue);
				return;
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__FILE_MEMBER:
				setFileMember((QFileMember)newValue);
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
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__SEQUENCE:
				setSequence(SEQUENCE_EDEFAULT);
				return;
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__FILE_MEMBER:
				setFileMember((QFileMember)null);
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
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__SEQUENCE:
				return sequence != SEQUENCE_EDEFAULT;
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__DATE:
				return date != DATE_EDEFAULT;
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW__FILE_MEMBER:
				return getFileMember() != null;
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
		result.append(" (sequence: ");
		result.append(sequence);
		result.append(", date: ");
		result.append(date);
		result.append(", content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} // QFileMemberRowImpl
