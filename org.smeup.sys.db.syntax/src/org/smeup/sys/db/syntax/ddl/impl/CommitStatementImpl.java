/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.ddl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.db.syntax.ddl.QCommitStatement;
import org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage;
import org.smeup.sys.db.syntax.impl.DefinitionStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commit Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.impl.CommitStatementImpl#isHold <em>Hold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommitStatementImpl extends DefinitionStatementImpl implements QCommitStatement {
	/**
	 * The default value of the '{@link #isHold() <em>Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHold() <em>Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHold()
	 * @generated
	 * @ordered
	 */
	protected boolean hold = HOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDDLPackage.Literals.COMMIT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHold() {
		return hold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHold(boolean newHold) {
		boolean oldHold = hold;
		hold = newHold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDDLPackage.COMMIT_STATEMENT__HOLD, oldHold, hold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDDLPackage.COMMIT_STATEMENT__HOLD:
				return isHold();
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
			case QDatabaseSyntaxDDLPackage.COMMIT_STATEMENT__HOLD:
				setHold((Boolean)newValue);
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
			case QDatabaseSyntaxDDLPackage.COMMIT_STATEMENT__HOLD:
				setHold(HOLD_EDEFAULT);
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
			case QDatabaseSyntaxDDLPackage.COMMIT_STATEMENT__HOLD:
				return hold != HOLD_EDEFAULT;
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
		result.append(" (hold: ");
		result.append(hold);
		result.append(')');
		return result.toString();
	}

} //CommitStatementImpl
