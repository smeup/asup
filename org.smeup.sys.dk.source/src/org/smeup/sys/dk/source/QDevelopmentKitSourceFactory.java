/**
 */
package org.smeup.sys.dk.source;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.smeup.sys.dk.source.QDevelopmentKitSourcePackage
 * @generated
 */
public interface QDevelopmentKitSourceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QDevelopmentKitSourceFactory eINSTANCE = org.smeup.sys.dk.source.impl.DevelopmentKitSourceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Project Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Def</em>'.
	 * @generated
	 */
	QProjectDef createProjectDef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QDevelopmentKitSourcePackage getDevelopmentKitSourcePackage();

} // DKSourceFactory
