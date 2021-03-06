/**
 *  Copyright (c) 2012, 2016 Sme.UP and others. *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core;

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Object Registry</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#getObjectRegistry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QObjectRegistry<T> {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	T lookup(String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	List<T> list();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" portRequired="true"
	 * @generated
	 */
	T lookupByPort(int port);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" vendorRequired="true" versionRequired="true"
	 * @generated
	 */
	T lookupByVendorVersion(String vendor, String version);

} // ObjectRegistry
