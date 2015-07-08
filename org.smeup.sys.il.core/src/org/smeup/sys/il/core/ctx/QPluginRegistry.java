/**
 *  Copyright (c) 2012, 2015 Sme.UP and others. *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.ctx;

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Plugin Registry</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage#getPluginRegistry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QPluginRegistry<T> {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	T lookup(String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true"
	 * @generated
	 */
	List<T> list();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true" vendorRequired="true" versionRequired="true"
	 * @generated
	 */
	T lookupByVendorVersion(String vendor, String version);

} // PluginRegistry
