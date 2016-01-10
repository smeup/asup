/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
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
import org.smeup.sys.db.syntax.dbl.FetchPosition;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.QFetchStatement;
import org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause;
import org.smeup.sys.db.syntax.impl.BindingStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fetch Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.FetchStatementImpl#getCursorName <em>Cursor Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.FetchStatementImpl#getInto <em>Into</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.FetchStatementImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.FetchStatementImpl#getRelativePosition <em>Relative Position</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.FetchStatementImpl#getMultipleRowClause <em>Multiple Row Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FetchStatementImpl extends BindingStatementImpl implements QFetchStatement {
	/**
	 * The default value of the '{@link #getCursorName() <em>Cursor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursorName()
	 * @generated
	 * @ordered
	 */
	protected static final String CURSOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCursorName() <em>Cursor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursorName()
	 * @generated
	 * @ordered
	 */
	protected String cursorName = CURSOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInto() <em>Into</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInto()
	 * @generated
	 * @ordered
	 */
	protected static final String INTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInto() <em>Into</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInto()
	 * @generated
	 * @ordered
	 */
	protected String into = INTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final FetchPosition POSITION_EDEFAULT = FetchPosition.NEXT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected FetchPosition position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativePosition() <em>Relative Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePosition()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIVE_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativePosition() <em>Relative Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePosition()
	 * @generated
	 * @ordered
	 */
	protected String relativePosition = RELATIVE_POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMultipleRowClause() <em>Multiple Row Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleRowClause()
	 * @generated
	 * @ordered
	 */
	protected QMultipleRowFetchClause multipleRowClause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FetchStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDBLPackage.Literals.FETCH_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCursorName() {
		return cursorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursorName(String newCursorName) {
		String oldCursorName = cursorName;
		cursorName = newCursorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__CURSOR_NAME, oldCursorName, cursorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInto() {
		return into;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInto(String newInto) {
		String oldInto = into;
		into = newInto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__INTO, oldInto, into));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetchPosition getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(FetchPosition newPosition) {
		FetchPosition oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelativePosition() {
		return relativePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativePosition(String newRelativePosition) {
		String oldRelativePosition = relativePosition;
		relativePosition = newRelativePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__RELATIVE_POSITION, oldRelativePosition, relativePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMultipleRowFetchClause getMultipleRowClause() {
		return multipleRowClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultipleRowClause(QMultipleRowFetchClause newMultipleRowClause, NotificationChain msgs) {
		QMultipleRowFetchClause oldMultipleRowClause = multipleRowClause;
		multipleRowClause = newMultipleRowClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__MULTIPLE_ROW_CLAUSE, oldMultipleRowClause, newMultipleRowClause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleRowClause(QMultipleRowFetchClause newMultipleRowClause) {
		if (newMultipleRowClause != multipleRowClause) {
			NotificationChain msgs = null;
			if (multipleRowClause != null)
				msgs = ((InternalEObject)multipleRowClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__MULTIPLE_ROW_CLAUSE, null, msgs);
			if (newMultipleRowClause != null)
				msgs = ((InternalEObject)newMultipleRowClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__MULTIPLE_ROW_CLAUSE, null, msgs);
			msgs = basicSetMultipleRowClause(newMultipleRowClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__MULTIPLE_ROW_CLAUSE, newMultipleRowClause, newMultipleRowClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__MULTIPLE_ROW_CLAUSE:
				return basicSetMultipleRowClause(null, msgs);
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
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__CURSOR_NAME:
				return getCursorName();
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__INTO:
				return getInto();
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__POSITION:
				return getPosition();
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__RELATIVE_POSITION:
				return getRelativePosition();
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__MULTIPLE_ROW_CLAUSE:
				return getMultipleRowClause();
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
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__CURSOR_NAME:
				setCursorName((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__INTO:
				setInto((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__POSITION:
				setPosition((FetchPosition)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__RELATIVE_POSITION:
				setRelativePosition((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__MULTIPLE_ROW_CLAUSE:
				setMultipleRowClause((QMultipleRowFetchClause)newValue);
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
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__CURSOR_NAME:
				setCursorName(CURSOR_NAME_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__INTO:
				setInto(INTO_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__RELATIVE_POSITION:
				setRelativePosition(RELATIVE_POSITION_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__MULTIPLE_ROW_CLAUSE:
				setMultipleRowClause((QMultipleRowFetchClause)null);
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
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__CURSOR_NAME:
				return CURSOR_NAME_EDEFAULT == null ? cursorName != null : !CURSOR_NAME_EDEFAULT.equals(cursorName);
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__INTO:
				return INTO_EDEFAULT == null ? into != null : !INTO_EDEFAULT.equals(into);
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__POSITION:
				return position != POSITION_EDEFAULT;
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__RELATIVE_POSITION:
				return RELATIVE_POSITION_EDEFAULT == null ? relativePosition != null : !RELATIVE_POSITION_EDEFAULT.equals(relativePosition);
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT__MULTIPLE_ROW_CLAUSE:
				return multipleRowClause != null;
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
		result.append(" (cursorName: ");
		result.append(cursorName);
		result.append(", into: ");
		result.append(into);
		result.append(", position: ");
		result.append(position);
		result.append(", relativePosition: ");
		result.append(relativePosition);
		result.append(')');
		return result.toString();
	}

} //FetchStatementImpl
