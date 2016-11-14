/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.lock;

import java.net.URI;
import java.util.concurrent.BlockingQueue;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Lock Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.lock.QIntegratedLanguageLockPackage#getLockManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QLockManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" addressDataType="org.smeup.sys.mi.core.JavaURI"
	 * @generated
	 */
	<N extends QObjectNameable> QObjectLocker<N> getLocker(QContextProvider contextProvider, URI address);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true"
	 * @generated
	 */
	<N extends QObjectNameable> QObjectLocker<N> getLocker(QContextProvider contextProvider, N object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.smeup.sys.mi.core.JavaBlockingQueue" contextProviderRequired="true"
	 * @generated
	 */
	<E> BlockingQueue<E> getQueue(QContextProvider contextProvider, String name);

} // QLockManager
