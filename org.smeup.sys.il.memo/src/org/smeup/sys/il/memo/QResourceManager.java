/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.memo;

import org.smeup.sys.il.core.QObjectNameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage#getResourceManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QResourceManager extends QResourceProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true" listenerRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> void registerListener(Class<T> klass, QResourceListener<T> listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true" providerRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> void registerProvider(Class<T> klass, QResourceProvider provider);

} // QResourceManager
