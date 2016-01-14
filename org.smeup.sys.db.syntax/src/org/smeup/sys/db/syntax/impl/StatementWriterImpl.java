/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.smeup.sys.db.syntax.QDatabaseSyntaxPackage;
import org.smeup.sys.db.syntax.QNameHelper;
import org.smeup.sys.db.syntax.QStatementWriter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Writer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.impl.StatementWriterImpl#getNameHelper <em>Name Helper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StatementWriterImpl extends EObjectImpl implements QStatementWriter {
	/**
	 * The cached value of the '{@link #getNameHelper() <em>Name Helper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameHelper()
	 * @generated
	 * @ordered
	 */
	protected QNameHelper nameHelper;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementWriterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxPackage.Literals.STATEMENT_WRITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameHelper getNameHelper() {
		if (nameHelper != null && ((EObject)nameHelper).eIsProxy()) {
			InternalEObject oldNameHelper = (InternalEObject)nameHelper;
			nameHelper = (QNameHelper)eResolveProxy(oldNameHelper);
			if (nameHelper != oldNameHelper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDatabaseSyntaxPackage.STATEMENT_WRITER__NAME_HELPER, oldNameHelper, nameHelper));
			}
		}
		return nameHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameHelper basicGetNameHelper() {
		return nameHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameHelper(QNameHelper newNameHelper) {
		QNameHelper oldNameHelper = nameHelper;
		nameHelper = newNameHelper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxPackage.STATEMENT_WRITER__NAME_HELPER, oldNameHelper, nameHelper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxPackage.STATEMENT_WRITER__NAME_HELPER:
				if (resolve) return getNameHelper();
				return basicGetNameHelper();
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
			case QDatabaseSyntaxPackage.STATEMENT_WRITER__NAME_HELPER:
				setNameHelper((QNameHelper)newValue);
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
			case QDatabaseSyntaxPackage.STATEMENT_WRITER__NAME_HELPER:
				setNameHelper((QNameHelper)null);
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
			case QDatabaseSyntaxPackage.STATEMENT_WRITER__NAME_HELPER:
				return nameHelper != null;
		}
		return super.eIsSet(featureID);
	}

} //StatementWriterImpl
