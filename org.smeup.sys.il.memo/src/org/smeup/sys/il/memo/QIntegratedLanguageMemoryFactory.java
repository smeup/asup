/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.memo;

import org.eclipse.emf.ecore.EFactory;
import org.smeup.sys.il.core.QObjectNameable;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage
 * @generated
 */
public interface QIntegratedLanguageMemoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageMemoryFactory eINSTANCE = org.smeup.sys.il.memo.impl.IntegratedLanguageMemoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource Notifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Notifier</em>'.
	 * @generated
	 */
	<T extends QObjectNameable> QResourceNotifier<T> createResourceNotifier();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QIntegratedLanguageMemoryPackage getIntegratedLanguageMemoryPackage();

} //QIntegratedLanguageMemoryFactory
