/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.splf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.os.splf.QOperatingSystemSpoolFilePackage;
import org.smeup.sys.os.splf.QSpoolFile;
import org.smeup.sys.os.splf.QSpoolFileRow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spool File Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.splf.impl.SpoolFileRowImpl#getSpoolFile <em>Spool File</em>}</li>
 *   <li>{@link org.smeup.sys.os.splf.impl.SpoolFileRowImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpoolFileRowImpl extends ObjectImpl implements QSpoolFileRow {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpoolFileRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemSpoolFilePackage.Literals.SPOOL_FILE_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSpoolFile getSpoolFile() {
		if (eContainerFeatureID() != QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__SPOOL_FILE) return null;
		return (QSpoolFile)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpoolFile(QSpoolFile newSpoolFile, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpoolFile, QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__SPOOL_FILE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpoolFile(QSpoolFile newSpoolFile) {
		if (newSpoolFile != eInternalContainer() || (eContainerFeatureID() != QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__SPOOL_FILE && newSpoolFile != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newSpoolFile))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpoolFile != null)
				msgs = ((InternalEObject)newSpoolFile).eInverseAdd(this, QOperatingSystemSpoolFilePackage.SPOOL_FILE__ROWS, QSpoolFile.class, msgs);
			msgs = basicSetSpoolFile(newSpoolFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__SPOOL_FILE, newSpoolFile, newSpoolFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__SPOOL_FILE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpoolFile((QSpoolFile)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__SPOOL_FILE:
				return basicSetSpoolFile(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__SPOOL_FILE:
				return eInternalContainer().eInverseRemove(this, QOperatingSystemSpoolFilePackage.SPOOL_FILE__ROWS, QSpoolFile.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__SPOOL_FILE:
				return getSpoolFile();
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__CONTENT:
				return getContent();
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
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__SPOOL_FILE:
				setSpoolFile((QSpoolFile)newValue);
				return;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__CONTENT:
				setContent((String)newValue);
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
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__SPOOL_FILE:
				setSpoolFile((QSpoolFile)null);
				return;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__CONTENT:
				setContent(CONTENT_EDEFAULT);
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
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__SPOOL_FILE:
				return getSpoolFile() != null;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
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
		result.append(" (content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //SpoolFileRowImpl
