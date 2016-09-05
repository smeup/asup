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
import org.smeup.sys.db.syntax.dbl.QDescribeStatement;
import org.smeup.sys.db.syntax.dbl.QInto;
import org.smeup.sys.db.syntax.dbl.QUsing;
import org.smeup.sys.db.syntax.impl.BindingStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Describe Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.DescribeStatementImpl#getInto <em>Into</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.DescribeStatementImpl#getUsing <em>Using</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.DescribeStatementImpl#getStatementName <em>Statement Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescribeStatementImpl extends BindingStatementImpl implements QDescribeStatement {
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
	 * The cached value of the '{@link #getUsing() <em>Using</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsing()
	 * @generated
	 * @ordered
	 */
	protected QUsing using;

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
	protected DescribeStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDBLPackage.Literals.DESCRIBE_STATEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__INTO, oldInto, newInto);
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
				msgs = ((InternalEObject)into).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__INTO, null, msgs);
			if (newInto != null)
				msgs = ((InternalEObject)newInto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__INTO, null, msgs);
			msgs = basicSetInto(newInto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__INTO, newInto, newInto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QUsing getUsing() {
		return using;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsing(QUsing newUsing, NotificationChain msgs) {
		QUsing oldUsing = using;
		using = newUsing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__USING, oldUsing, newUsing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsing(QUsing newUsing) {
		if (newUsing != using) {
			NotificationChain msgs = null;
			if (using != null)
				msgs = ((InternalEObject)using).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__USING, null, msgs);
			if (newUsing != null)
				msgs = ((InternalEObject)newUsing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__USING, null, msgs);
			msgs = basicSetUsing(newUsing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__USING, newUsing, newUsing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__STATEMENT_NAME, oldStatementName, statementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__INTO:
				return basicSetInto(null, msgs);
			case QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__USING:
				return basicSetUsing(null, msgs);
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
			case QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__INTO:
				return getInto();
			case QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__USING:
				return getUsing();
			case QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__STATEMENT_NAME:
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
			case QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__INTO:
				setInto((QInto)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__USING:
				setUsing((QUsing)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__STATEMENT_NAME:
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
			case QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__INTO:
				setInto((QInto)null);
				return;
			case QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__USING:
				setUsing((QUsing)null);
				return;
			case QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__STATEMENT_NAME:
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
			case QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__INTO:
				return into != null;
			case QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__USING:
				return using != null;
			case QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT__STATEMENT_NAME:
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
		result.append(" (statementName: ");
		result.append(statementName);
		result.append(')');
		return result.toString();
	}

} //DescribeStatementImpl
