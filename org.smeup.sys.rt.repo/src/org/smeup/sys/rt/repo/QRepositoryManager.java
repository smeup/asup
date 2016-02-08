/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.repo;

import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.core.QApplicationComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.rt.repo.QRuntimeRepositoryPackage#getRepositoryManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QRepositoryManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model applicationRequired="true"
	 * @generated
	 */
	boolean checkUpdates(QApplication application);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model applicationRequired="true"
	 * @generated
	 */
	void updateApplication(QApplication application);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model componentRequired="true"
	 * @generated
	 */
	boolean checkUpdates(QApplicationComponent component);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model componentRequired="true"
	 * @generated
	 */
	void updateComponent(QApplicationComponent component);

} // QRepositoryManager
