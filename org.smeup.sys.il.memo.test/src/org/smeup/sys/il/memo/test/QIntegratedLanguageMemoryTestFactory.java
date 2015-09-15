/**
 */
package org.smeup.sys.il.memo.test;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.il.memo.test.QIntegratedLanguageMemoryTestPackage
 * @generated
 */
public interface QIntegratedLanguageMemoryTestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageMemoryTestFactory eINSTANCE = org.smeup.sys.il.memo.test.impl.IntegratedLanguageMemoryTestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Object A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object A</em>'.
	 * @generated
	 */
	QObjectA createObjectA();

	/**
	 * Returns a new object of class '<em>Object B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object B</em>'.
	 * @generated
	 */
	QObjectB createObjectB();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QIntegratedLanguageMemoryTestPackage getIntegratedLanguageMemoryTestPackage();

} //QIntegratedLanguageMemoryTestFactory
