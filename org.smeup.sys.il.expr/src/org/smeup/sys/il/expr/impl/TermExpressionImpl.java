/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.expr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage;
import org.smeup.sys.il.expr.QTermExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.il.expr.impl.TermExpressionImpl#isFunction <em>Function</em>}</li>
 *   <li>{@link org.smeup.sys.il.expr.impl.TermExpressionImpl#isSpecial <em>Special</em>}</li>
 *   <li>{@link org.smeup.sys.il.expr.impl.TermExpressionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TermExpressionImpl extends ExpressionImpl implements QTermExpression {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #isFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFunction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FUNCTION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFunction()
	 * @generated
	 * @ordered
	 */
	protected boolean function = FUNCTION_EDEFAULT;
	/**
	 * The default value of the '{@link #isSpecial() <em>Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpecial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPECIAL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isSpecial() <em>Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpecial()
	 * @generated
	 * @ordered
	 */
	protected boolean special = SPECIAL_EDEFAULT;
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageExpressionPackage.Literals.TERM_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(boolean newFunction) {
		boolean oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageExpressionPackage.TERM_EXPRESSION__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSpecial() {
		return special;
	}

	/**
	 * <!-- begin-user-doc -		// TODO Auto-generated method stub
->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecial(boolean newSpecial) {
		boolean oldSpecial = special;
		special = newSpecial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageExpressionPackage.TERM_EXPRESSION__SPECIAL, oldSpecial, special));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageExpressionPackage.TERM_EXPRESSION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageExpressionPackage.TERM_EXPRESSION__FUNCTION:
				return isFunction();
			case QIntegratedLanguageExpressionPackage.TERM_EXPRESSION__SPECIAL:
				return isSpecial();
			case QIntegratedLanguageExpressionPackage.TERM_EXPRESSION__VALUE:
				return getValue();
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
			case QIntegratedLanguageExpressionPackage.TERM_EXPRESSION__FUNCTION:
				setFunction((Boolean)newValue);
				return;
			case QIntegratedLanguageExpressionPackage.TERM_EXPRESSION__SPECIAL:
				setSpecial((Boolean)newValue);
				return;
			case QIntegratedLanguageExpressionPackage.TERM_EXPRESSION__VALUE:
				setValue((String)newValue);
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
			case QIntegratedLanguageExpressionPackage.TERM_EXPRESSION__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case QIntegratedLanguageExpressionPackage.TERM_EXPRESSION__SPECIAL:
				setSpecial(SPECIAL_EDEFAULT);
				return;
			case QIntegratedLanguageExpressionPackage.TERM_EXPRESSION__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case QIntegratedLanguageExpressionPackage.TERM_EXPRESSION__FUNCTION:
				return function != FUNCTION_EDEFAULT;
			case QIntegratedLanguageExpressionPackage.TERM_EXPRESSION__SPECIAL:
				return special != SPECIAL_EDEFAULT;
			case QIntegratedLanguageExpressionPackage.TERM_EXPRESSION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (function: ");
		result.append(function);
		result.append(", special: ");
		result.append(special);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}
	
} //TermExpressionImpl
