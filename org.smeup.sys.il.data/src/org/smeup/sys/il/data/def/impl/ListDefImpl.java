/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.il.data.def.QListDef;
import org.smeup.sys.il.data.def.QUnaryAtomicDataDef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>List Def</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.smeup.sys.il.data.def.impl.ListDefImpl#getArgument <em>
 * Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListDefImpl<D extends QList<?>> extends MultipleAtomicDataDefImpl<D> implements QListDef<D> {
	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected QUnaryAtomicDataDef<?> argument;
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ListDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataDefPackage.Literals.LIST_DEF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public QUnaryAtomicDataDef<?> getArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetArgument(QUnaryAtomicDataDef<?> newArgument, NotificationChain msgs) {
		QUnaryAtomicDataDef<?> oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.LIST_DEF__ARGUMENT, oldArgument, newArgument);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setArgument(QUnaryAtomicDataDef<?> newArgument) {
		if (newArgument != argument) {
			NotificationChain msgs = null;
			if (argument != null)
				msgs = ((InternalEObject) argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageDataDefPackage.LIST_DEF__ARGUMENT, null, msgs);
			if (newArgument != null)
				msgs = ((InternalEObject) newArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageDataDefPackage.LIST_DEF__ARGUMENT, null, msgs);
			msgs = basicSetArgument(newArgument, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.LIST_DEF__ARGUMENT, newArgument, newArgument));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QIntegratedLanguageDataDefPackage.LIST_DEF__ARGUMENT:
			return basicSetArgument(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QIntegratedLanguageDataDefPackage.LIST_DEF__ARGUMENT:
			return getArgument();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QIntegratedLanguageDataDefPackage.LIST_DEF__ARGUMENT:
			setArgument((QUnaryAtomicDataDef<?>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case QIntegratedLanguageDataDefPackage.LIST_DEF__ARGUMENT:
			setArgument((QUnaryAtomicDataDef<?>) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case QIntegratedLanguageDataDefPackage.LIST_DEF__ARGUMENT:
			return argument != null;
		}
		return super.eIsSet(featureID);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Class<D> getDataClass() {
		return (Class<D>) QList.class;
	}

	@Override
	public Class<?> getJavaClass() {
		return List.class;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.LIST;
	}
} // ListDefImpl
