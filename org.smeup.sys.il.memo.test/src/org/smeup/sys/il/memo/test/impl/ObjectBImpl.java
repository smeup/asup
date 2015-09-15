/**
 */
package org.smeup.sys.il.memo.test.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.il.memo.test.Enum1;
import org.smeup.sys.il.memo.test.QIntegratedLanguageMemoryTestPackage;
import org.smeup.sys.il.memo.test.QObjectB;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.il.memo.test.impl.ObjectBImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.il.memo.test.impl.ObjectBImpl#getEnum1 <em>Enum1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectBImpl extends ObjectImpl implements QObjectB {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnum1() <em>Enum1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum1()
	 * @generated
	 * @ordered
	 */
	protected static final Enum1 ENUM1_EDEFAULT = Enum1.VALUE1;

	/**
	 * The cached value of the '{@link #getEnum1() <em>Enum1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum1()
	 * @generated
	 * @ordered
	 */
	protected Enum1 enum1 = ENUM1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageMemoryTestPackage.Literals.OBJECT_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageMemoryTestPackage.OBJECT_B__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enum1 getEnum1() {
		return enum1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnum1(Enum1 newEnum1) {
		Enum1 oldEnum1 = enum1;
		enum1 = newEnum1 == null ? ENUM1_EDEFAULT : newEnum1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageMemoryTestPackage.OBJECT_B__ENUM1, oldEnum1, enum1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageMemoryTestPackage.OBJECT_B__NAME:
				return getName();
			case QIntegratedLanguageMemoryTestPackage.OBJECT_B__ENUM1:
				return getEnum1();
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
			case QIntegratedLanguageMemoryTestPackage.OBJECT_B__NAME:
				setName((String)newValue);
				return;
			case QIntegratedLanguageMemoryTestPackage.OBJECT_B__ENUM1:
				setEnum1((Enum1)newValue);
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
			case QIntegratedLanguageMemoryTestPackage.OBJECT_B__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QIntegratedLanguageMemoryTestPackage.OBJECT_B__ENUM1:
				setEnum1(ENUM1_EDEFAULT);
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
			case QIntegratedLanguageMemoryTestPackage.OBJECT_B__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QIntegratedLanguageMemoryTestPackage.OBJECT_B__ENUM1:
				return enum1 != ENUM1_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", enum1: ");
		result.append(enum1);
		result.append(')');
		return result.toString();
	}

} //ObjectBImpl
