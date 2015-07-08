/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.ctx;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Plugin Registry Factory</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage#getPluginRegistryFactory()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QPluginRegistryFactory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true" klassRequired="true"
	 * @generated
	 */
	<T> QPluginRegistry<T> createPluginRegistry(Class<T> klass);

} // QPluginRegistryFactory
