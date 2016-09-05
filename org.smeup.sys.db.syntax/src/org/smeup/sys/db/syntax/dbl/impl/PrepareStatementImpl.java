/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.QInto;
import org.smeup.sys.db.syntax.dbl.QPrepareStatement;
import org.smeup.sys.db.syntax.impl.BindingStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prepare Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.PrepareStatementImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.PrepareStatementImpl#getInto <em>Into</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.PrepareStatementImpl#getStatementName <em>Statement Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrepareStatementImpl extends BindingStatementImpl implements QPrepareStatement {
	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInto() <em>Into</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInto()
	 * @generated
	 * @ordered
	 */
	protected QInto into;

	/**
	 * The default value of the '{@link #getStatementName() <em>Statement Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementName()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatementName() <em>Statement Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementName()
	 * @generated
	 * @ordered
	 */
	protected String statementName = STATEMENT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrepareStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDBLPackage.Literals.PREPARE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(String newFrom) {
		String oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QInto getInto() {
		return into;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInto(QInto newInto, NotificationChain msgs) {
		QInto oldInto = into;
		into = newInto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__INTO, oldInto, newInto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInto(QInto newInto) {
		if (newInto != into) {
			NotificationChain msgs = null;
			if (into != null)
				msgs = ((InternalEObject)into).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__INTO, null, msgs);
			if (newInto != null)
				msgs = ((InternalEObject)newInto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__INTO, null, msgs);
			msgs = basicSetInto(newInto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__INTO, newInto, newInto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatementName() {
		return statementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatementName(String newStatementName) {
		String oldStatementName = statementName;
		statementName = newStatementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__STATEMENT_NAME, oldStatementName, statementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__INTO:
				return basicSetInto(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__FROM:
				return getFrom();
			case QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__INTO:
				return getInto();
			case QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__STATEMENT_NAME:
				return getStatementName();
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
			case QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__FROM:
				setFrom((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__INTO:
				setInto((QInto)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__STATEMENT_NAME:
				setStatementName((String)newValue);
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
			case QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__INTO:
				setInto((QInto)null);
				return;
			case QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__STATEMENT_NAME:
				setStatementName(STATEMENT_NAME_EDEFAULT);
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
			case QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__INTO:
				return into != null;
			case QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT__STATEMENT_NAME:
				return STATEMENT_NAME_EDEFAULT == null ? statementName != null : !STATEMENT_NAME_EDEFAULT.equals(statementName);
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
		result.append(" (from: ");
		result.append(from);
		result.append(", statementName: ");
		result.append(statementName);
		result.append(')');
		return result.toString();
	}

} //PrepareStatementImpl
