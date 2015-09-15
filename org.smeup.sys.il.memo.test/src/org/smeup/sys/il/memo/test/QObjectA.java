/**
 */
package org.smeup.sys.il.memo.test;

import org.smeup.sys.il.core.QObjectNameable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.memo.test.QObjectA#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.il.memo.test.QObjectA#getText <em>Text</em>}</li>
 *   <li>{@link org.smeup.sys.il.memo.test.QObjectA#getObjectB <em>Object B</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.memo.test.QIntegratedLanguageMemoryTestPackage#getObjectA()
 * @model
 * @generated
 */
public interface QObjectA extends QObjectNameable {
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
	 * @see org.smeup.sys.il.memo.test.QIntegratedLanguageMemoryTestPackage#getObjectA_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.memo.test.QObjectA#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.smeup.sys.il.memo.test.QIntegratedLanguageMemoryTestPackage#getObjectA_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.memo.test.QObjectA#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Object B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object B</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object B</em>' containment reference.
	 * @see #setObjectB(QObjectB)
	 * @see org.smeup.sys.il.memo.test.QIntegratedLanguageMemoryTestPackage#getObjectA_ObjectB()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QObjectB getObjectB();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.memo.test.QObjectA#getObjectB <em>Object B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object B</em>' containment reference.
	 * @see #getObjectB()
	 * @generated
	 */
	void setObjectB(QObjectB value);

} // QObjectA
