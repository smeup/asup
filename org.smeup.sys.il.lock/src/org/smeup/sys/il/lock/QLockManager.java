/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.lock;

import org.smeup.sys.il.core.ctx.QContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lock Manager</b></em>'.
 * <!-- end-user-doc -->
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
	 * @model contextRequired="true"
	 * @generated
	 */
	<T extends QObjectLockable> QObjectLocker<T> getLocker(QContext context, T object);

} // QLockManager
