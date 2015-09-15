/**
 */
package org.smeup.sys.il.memo.test.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.core.impl.ObjectNameableImpl;
import org.smeup.sys.il.memo.test.QIntegratedLanguageMemoryTestPackage;
import org.smeup.sys.il.memo.test.QObjectA;
import org.smeup.sys.il.memo.test.QObjectB;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.il.memo.test.impl.ObjectAImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.il.memo.test.impl.ObjectAImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.smeup.sys.il.memo.test.impl.ObjectAImpl#getObjectB <em>Object B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectAImpl extends ObjectNameableImpl implements QObjectA {
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
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjectB() <em>Object B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectB()
	 * @generated
	 * @ordered
	 */
	protected QObjectB objectB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageMemoryTestPackage.Literals.OBJECT_A;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageMemoryTestPackage.OBJECT_A__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageMemoryTestPackage.OBJECT_A__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QObjectB getObjectB() {
		return objectB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectB(QObjectB newObjectB, NotificationChain msgs) {
		QObjectB oldObjectB = objectB;
		objectB = newObjectB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageMemoryTestPackage.OBJECT_A__OBJECT_B, oldObjectB, newObjectB);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectB(QObjectB newObjectB) {
		if (newObjectB != objectB) {
			NotificationChain msgs = null;
			if (objectB != null)
				msgs = ((InternalEObject)objectB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageMemoryTestPackage.OBJECT_A__OBJECT_B, null, msgs);
			if (newObjectB != null)
				msgs = ((InternalEObject)newObjectB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageMemoryTestPackage.OBJECT_A__OBJECT_B, null, msgs);
			msgs = basicSetObjectB(newObjectB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageMemoryTestPackage.OBJECT_A__OBJECT_B, newObjectB, newObjectB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageMemoryTestPackage.OBJECT_A__OBJECT_B:
				return basicSetObjectB(null, msgs);
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
			case QIntegratedLanguageMemoryTestPackage.OBJECT_A__NAME:
				return getName();
			case QIntegratedLanguageMemoryTestPackage.OBJECT_A__TEXT:
				return getText();
			case QIntegratedLanguageMemoryTestPackage.OBJECT_A__OBJECT_B:
				return getObjectB();
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
			case QIntegratedLanguageMemoryTestPackage.OBJECT_A__NAME:
				setName((String)newValue);
				return;
			case QIntegratedLanguageMemoryTestPackage.OBJECT_A__TEXT:
				setText((String)newValue);
				return;
			case QIntegratedLanguageMemoryTestPackage.OBJECT_A__OBJECT_B:
				setObjectB((QObjectB)newValue);
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
			case QIntegratedLanguageMemoryTestPackage.OBJECT_A__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QIntegratedLanguageMemoryTestPackage.OBJECT_A__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case QIntegratedLanguageMemoryTestPackage.OBJECT_A__OBJECT_B:
				setObjectB((QObjectB)null);
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
			case QIntegratedLanguageMemoryTestPackage.OBJECT_A__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QIntegratedLanguageMemoryTestPackage.OBJECT_A__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case QIntegratedLanguageMemoryTestPackage.OBJECT_A__OBJECT_B:
				return objectB != null;
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
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //ObjectAImpl
