/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.db.core.QDatabaseCorePackage;
import org.smeup.sys.db.core.QTableColumnDef;
import org.smeup.sys.il.data.def.QDataDef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Table Field</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.core.impl.TableColumnDefImpl#isDefault <em>Default</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.TableColumnDefImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.TableColumnDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.TableColumnDefImpl#isNullable <em>Nullable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableColumnDefImpl extends DatabaseObjectDefImpl implements QTableColumnDef {
	/**
	 * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean default_ = DEFAULT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected QDataDef<?> definition;
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
	 * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULLABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean nullable = NULLABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TableColumnDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseCorePackage.Literals.TABLE_COLUMN_DEF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault(boolean newDefault) {
		boolean oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.TABLE_COLUMN_DEF__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDataDef<?> getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(QDataDef<?> newDefinition, NotificationChain msgs) {
		QDataDef<?> oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.TABLE_COLUMN_DEF__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(QDataDef<?> newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.TABLE_COLUMN_DEF__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.TABLE_COLUMN_DEF__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.TABLE_COLUMN_DEF__DEFINITION, newDefinition, newDefinition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.TABLE_COLUMN_DEF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullable(boolean newNullable) {
		boolean oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.TABLE_COLUMN_DEF__NULLABLE, oldNullable, nullable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__DEFINITION:
				return basicSetDefinition(null, msgs);
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
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__DEFAULT:
				return isDefault();
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__DEFINITION:
				return getDefinition();
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__NAME:
				return getName();
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__NULLABLE:
				return isNullable();
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
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__DEFAULT:
				setDefault((Boolean)newValue);
				return;
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__DEFINITION:
				setDefinition((QDataDef<?>)newValue);
				return;
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__NAME:
				setName((String)newValue);
				return;
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__NULLABLE:
				setNullable((Boolean)newValue);
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
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__DEFINITION:
				setDefinition((QDataDef<?>)null);
				return;
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
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
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__DEFAULT:
				return default_ != DEFAULT_EDEFAULT;
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__DEFINITION:
				return definition != null;
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QDatabaseCorePackage.TABLE_COLUMN_DEF__NULLABLE:
				return nullable != NULLABLE_EDEFAULT;
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
		result.append(" (default: ");
		result.append(default_);
		result.append(", name: ");
		result.append(name);
		result.append(", nullable: ");
		result.append(nullable);
		result.append(')');
		return result.toString();
	}

} // TableFieldImpl
