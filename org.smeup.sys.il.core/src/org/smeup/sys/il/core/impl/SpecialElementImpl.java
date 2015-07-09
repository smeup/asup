/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.QSpecialElement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Special Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.smeup.sys.il.core.impl.SpecialElementImpl#getName <em>Name
 * </em>}</li>
 * <li>{@link org.smeup.sys.il.core.impl.SpecialElementImpl#getText <em>Text
 * </em>}</li>
 * <li>{@link org.smeup.sys.il.core.impl.SpecialElementImpl#isUnary <em>Unary
 * </em>}</li>
 * <li>{@link org.smeup.sys.il.core.impl.SpecialElementImpl#getValue <em>Value
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecialElementImpl extends NamedNodeImpl implements QSpecialElement {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnary() <em>Unary</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isUnary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnary() <em>Unary</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isUnary()
	 * @generated
	 * @ordered
	 */
	protected boolean unary = UNARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected SpecialElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageCorePackage.Literals.SPECIAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isUnary() {
		return unary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setUnary(boolean newUnary) {
		boolean oldUnary = unary;
		unary = newUnary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__UNARY, oldUnary, unary));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__NAME:
			return getName();
		case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__TEXT:
			return getText();
		case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__UNARY:
			return isUnary();
		case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__VALUE:
			return getValue();
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
		case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__NAME:
			setName((String) newValue);
			return;
		case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__TEXT:
			setText((String) newValue);
			return;
		case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__UNARY:
			setUnary((Boolean) newValue);
			return;
		case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__VALUE:
			setValue((String) newValue);
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
		case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__UNARY:
			setUnary(UNARY_EDEFAULT);
			return;
		case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__VALUE:
			setValue(VALUE_EDEFAULT);
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
		case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__UNARY:
			return unary != UNARY_EDEFAULT;
		case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", text: ");
		result.append(text);
		result.append(", unary: ");
		result.append(unary);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} // SpecialElementImpl
