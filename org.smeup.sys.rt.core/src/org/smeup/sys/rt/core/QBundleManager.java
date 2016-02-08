/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core;

import org.smeup.sys.il.core.ctx.QContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getBundleManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QBundleManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextRequired="true" bundleNameRequired="true"
	 * @generated
	 */
	boolean isRegisterable(QContext context, String bundleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" bundleNameRequired="true" visitorRequired="true"
	 * @generated
	 */
	void visit(QContext context, String bundleName, QBundleVisitor visitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" bundleNameRequired="true"
	 * @generated
	 */
	void register(QContext context, String bundleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" symbolicNameRequired="true"
	 * @generated
	 */
	void unregister(QContext context, String symbolicName);

} // QBundleManager
