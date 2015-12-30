/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.def.QEnumDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Enum Def</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.impl.EnumDefImpl#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.impl.EnumDefImpl#getKlass <em>Klass</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EnumDefImpl<E extends Enum<E>, D extends QBufferedData> extends UnaryAtomicBufferedDataDefImpl<D> implements QEnumDef<E, D> {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected QBufferedDataDef<D> delegate;

	/**
	 * The cached value of the '{@link #getKlass() <em>Klass</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getKlass()
	 * @generated
	 * @ordered
	 */
	protected Class<E> klass;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataDefPackage.Literals.ENUM_DEF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QBufferedDataDef<D> getDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegate(QBufferedDataDef<D> newDelegate, NotificationChain msgs) {
		QBufferedDataDef<D> oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.ENUM_DEF__DELEGATE, oldDelegate, newDelegate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelegate(QBufferedDataDef<D> newDelegate) {
		if (newDelegate != delegate) {
			NotificationChain msgs = null;
			if (delegate != null)
				msgs = ((InternalEObject)delegate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageDataDefPackage.ENUM_DEF__DELEGATE, null, msgs);
			if (newDelegate != null)
				msgs = ((InternalEObject)newDelegate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageDataDefPackage.ENUM_DEF__DELEGATE, null, msgs);
			msgs = basicSetDelegate(newDelegate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.ENUM_DEF__DELEGATE, newDelegate, newDelegate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class<E> getKlass() {
		return klass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKlass(Class<E> newKlass) {
		Class<E> oldKlass = klass;
		klass = newKlass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.ENUM_DEF__KLASS, oldKlass, klass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageDataDefPackage.ENUM_DEF__DELEGATE:
				return basicSetDelegate(null, msgs);
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
			case QIntegratedLanguageDataDefPackage.ENUM_DEF__DELEGATE:
				return getDelegate();
			case QIntegratedLanguageDataDefPackage.ENUM_DEF__KLASS:
				return getKlass();
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
			case QIntegratedLanguageDataDefPackage.ENUM_DEF__DELEGATE:
				setDelegate((QBufferedDataDef<D>)newValue);
				return;
			case QIntegratedLanguageDataDefPackage.ENUM_DEF__KLASS:
				setKlass((Class<E>)newValue);
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
			case QIntegratedLanguageDataDefPackage.ENUM_DEF__DELEGATE:
				setDelegate((QBufferedDataDef<D>)null);
				return;
			case QIntegratedLanguageDataDefPackage.ENUM_DEF__KLASS:
				setKlass((Class<E>)null);
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
			case QIntegratedLanguageDataDefPackage.ENUM_DEF__DELEGATE:
				return delegate != null;
			case QIntegratedLanguageDataDefPackage.ENUM_DEF__KLASS:
				return klass != null;
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
		result.append(" (klass: ");
		result.append(klass);
		result.append(')');
		return result.toString();
	}

} // EnumDefImpl
