/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam.impl;

import java.net.URI;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.core.impl.NamedNodeImpl;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.esam.QFileTerm;
import org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>File Term</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.il.esam.impl.FileTermImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.smeup.sys.il.esam.impl.FileTermImpl#isUserOpen <em>User Open</em>}</li>
 *   <li>{@link org.smeup.sys.il.esam.impl.FileTermImpl#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FileTermImpl extends NamedNodeImpl implements QFileTerm {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isUserOpen() <em>User Open</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isUserOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USER_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUserOpen() <em>User Open</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isUserOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean userOpen = USER_OPEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected QDataTerm<QCompoundDataDef<?, QDataTerm<?>>> format;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FileTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageEsamPackage.Literals.FILE_TERM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageEsamPackage.FILE_TERM__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUserOpen() {
		return userOpen;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserOpen(boolean newUserOpen) {
		boolean oldUserOpen = userOpen;
		userOpen = newUserOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageEsamPackage.FILE_TERM__USER_OPEN, oldUserOpen, userOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDataTerm<QCompoundDataDef<?, QDataTerm<?>>> getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormat(QDataTerm<QCompoundDataDef<?, QDataTerm<?>>> newFormat, NotificationChain msgs) {
		QDataTerm<QCompoundDataDef<?, QDataTerm<?>>> oldFormat = format;
		format = newFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageEsamPackage.FILE_TERM__FORMAT, oldFormat, newFormat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(QDataTerm<QCompoundDataDef<?, QDataTerm<?>>> newFormat) {
		if (newFormat != format) {
			NotificationChain msgs = null;
			if (format != null)
				msgs = ((InternalEObject)format).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageEsamPackage.FILE_TERM__FORMAT, null, msgs);
			if (newFormat != null)
				msgs = ((InternalEObject)newFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageEsamPackage.FILE_TERM__FORMAT, null, msgs);
			msgs = basicSetFormat(newFormat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageEsamPackage.FILE_TERM__FORMAT, newFormat, newFormat));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URI getURI() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageEsamPackage.FILE_TERM__FORMAT:
				return basicSetFormat(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageEsamPackage.FILE_TERM__FILE_NAME:
				return getFileName();
			case QIntegratedLanguageEsamPackage.FILE_TERM__USER_OPEN:
				return isUserOpen();
			case QIntegratedLanguageEsamPackage.FILE_TERM__FORMAT:
				return getFormat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QIntegratedLanguageEsamPackage.FILE_TERM__FILE_NAME:
				setFileName((String)newValue);
				return;
			case QIntegratedLanguageEsamPackage.FILE_TERM__USER_OPEN:
				setUserOpen((Boolean)newValue);
				return;
			case QIntegratedLanguageEsamPackage.FILE_TERM__FORMAT:
				setFormat((QDataTerm<QCompoundDataDef<?, QDataTerm<?>>>)newValue);
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
			case QIntegratedLanguageEsamPackage.FILE_TERM__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case QIntegratedLanguageEsamPackage.FILE_TERM__USER_OPEN:
				setUserOpen(USER_OPEN_EDEFAULT);
				return;
			case QIntegratedLanguageEsamPackage.FILE_TERM__FORMAT:
				setFormat((QDataTerm<QCompoundDataDef<?, QDataTerm<?>>>)null);
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
			case QIntegratedLanguageEsamPackage.FILE_TERM__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case QIntegratedLanguageEsamPackage.FILE_TERM__USER_OPEN:
				return userOpen != USER_OPEN_EDEFAULT;
			case QIntegratedLanguageEsamPackage.FILE_TERM__FORMAT:
				return format != null;
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
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(", userOpen: ");
		result.append(userOpen);
		result.append(')');
		return result.toString();
	}

} // FileTermImpl
