/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.ddl.impl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.smeup.sys.db.core.QQualifiedName;
import org.smeup.sys.db.syntax.ddl.QCallStatement;
import org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage;
import org.smeup.sys.db.syntax.impl.DefinitionStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.impl.CallStatementImpl#getProcedureName <em>Procedure Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.impl.CallStatementImpl#getParms <em>Parms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallStatementImpl extends DefinitionStatementImpl implements QCallStatement {
	/**
	 * The cached value of the '{@link #getProcedureName() <em>Procedure Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureName()
	 * @generated
	 * @ordered
	 */
	protected QQualifiedName procedureName;

	/**
	 * The cached value of the '{@link #getParms() <em>Parms</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParms()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDDLPackage.Literals.CALL_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QQualifiedName getProcedureName() {
		return procedureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedureName(QQualifiedName newProcedureName, NotificationChain msgs) {
		QQualifiedName oldProcedureName = procedureName;
		procedureName = newProcedureName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDDLPackage.CALL_STATEMENT__PROCEDURE_NAME, oldProcedureName, newProcedureName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedureName(QQualifiedName newProcedureName) {
		if (newProcedureName != procedureName) {
			NotificationChain msgs = null;
			if (procedureName != null)
				msgs = ((InternalEObject)procedureName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDDLPackage.CALL_STATEMENT__PROCEDURE_NAME, null, msgs);
			if (newProcedureName != null)
				msgs = ((InternalEObject)newProcedureName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDDLPackage.CALL_STATEMENT__PROCEDURE_NAME, null, msgs);
			msgs = basicSetProcedureName(newProcedureName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDDLPackage.CALL_STATEMENT__PROCEDURE_NAME, newProcedureName, newProcedureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getParms() {
		if (parms == null) {
			parms = new EDataTypeUniqueEList<String>(String.class, this, QDatabaseSyntaxDDLPackage.CALL_STATEMENT__PARMS);
		}
		return parms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseSyntaxDDLPackage.CALL_STATEMENT__PROCEDURE_NAME:
				return basicSetProcedureName(null, msgs);
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
			case QDatabaseSyntaxDDLPackage.CALL_STATEMENT__PROCEDURE_NAME:
				return getProcedureName();
			case QDatabaseSyntaxDDLPackage.CALL_STATEMENT__PARMS:
				return getParms();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDatabaseSyntaxDDLPackage.CALL_STATEMENT__PROCEDURE_NAME:
				setProcedureName((QQualifiedName)newValue);
				return;
			case QDatabaseSyntaxDDLPackage.CALL_STATEMENT__PARMS:
				getParms().clear();
				getParms().addAll((Collection<? extends String>)newValue);
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
			case QDatabaseSyntaxDDLPackage.CALL_STATEMENT__PROCEDURE_NAME:
				setProcedureName((QQualifiedName)null);
				return;
			case QDatabaseSyntaxDDLPackage.CALL_STATEMENT__PARMS:
				getParms().clear();
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
			case QDatabaseSyntaxDDLPackage.CALL_STATEMENT__PROCEDURE_NAME:
				return procedureName != null;
			case QDatabaseSyntaxDDLPackage.CALL_STATEMENT__PARMS:
				return parms != null && !parms.isEmpty();
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
		result.append(" (parms: ");
		result.append(parms);
		result.append(')');
		return result.toString();
	}

} //CallStatementImpl
