/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.meta.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;
import org.smeup.sys.il.core.meta.QRange;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Range</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.smeup.sys.il.core.meta.impl.RangeImpl#getMax <em>Max</em>}</li>
 * <li>{@link org.smeup.sys.il.core.meta.impl.RangeImpl#getMin <em>Min</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RangeImpl extends FacetImpl implements QRange {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected String max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected String min = MIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected RangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageCoreMetaPackage.Literals.RANGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setMin(String newMin) {
		String oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCoreMetaPackage.RANGE__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setMax(String newMax) {
		String oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCoreMetaPackage.RANGE__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QIntegratedLanguageCoreMetaPackage.RANGE__MAX:
			return getMax();
		case QIntegratedLanguageCoreMetaPackage.RANGE__MIN:
			return getMin();
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
		case QIntegratedLanguageCoreMetaPackage.RANGE__MAX:
			setMax((String) newValue);
			return;
		case QIntegratedLanguageCoreMetaPackage.RANGE__MIN:
			setMin((String) newValue);
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
		case QIntegratedLanguageCoreMetaPackage.RANGE__MAX:
			setMax(MAX_EDEFAULT);
			return;
		case QIntegratedLanguageCoreMetaPackage.RANGE__MIN:
			setMin(MIN_EDEFAULT);
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
		case QIntegratedLanguageCoreMetaPackage.RANGE__MAX:
			return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
		case QIntegratedLanguageCoreMetaPackage.RANGE__MIN:
			return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (max: ");
		result.append(max);
		result.append(", min: ");
		result.append(min);
		result.append(')');
		return result.toString();
	}

} // RangeImpl
