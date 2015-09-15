/**
 */
package org.smeup.sys.il.memo.test;

import org.smeup.sys.il.core.QObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.memo.test.QObjectB#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.il.memo.test.QObjectB#getEnum1 <em>Enum1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.memo.test.QIntegratedLanguageMemoryTestPackage#getObjectB()
 * @model
 * @generated
 */
public interface QObjectB extends QObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.smeup.sys.il.memo.test.QIntegratedLanguageMemoryTestPackage#getObjectB_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.memo.test.QObjectB#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Enum1</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.il.memo.test.Enum1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum1</em>' attribute.
	 * @see org.smeup.sys.il.memo.test.Enum1
	 * @see #setEnum1(Enum1)
	 * @see org.smeup.sys.il.memo.test.QIntegratedLanguageMemoryTestPackage#getObjectB_Enum1()
	 * @model required="true"
	 * @generated
	 */
	Enum1 getEnum1();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.memo.test.QObjectB#getEnum1 <em>Enum1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum1</em>' attribute.
	 * @see org.smeup.sys.il.memo.test.Enum1
	 * @see #getEnum1()
	 * @generated
	 */
	void setEnum1(Enum1 value);

} // QObjectB
