/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.mi.core.util;

import java.lang.management.ThreadInfo;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threads</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.mi.core.util.QMachineInterfaceCoreUtilPackage#getThreads()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QThreads {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.smeup.sys.mi.core.JavaThread"
	 * @generated
	 */
	List<Thread> listThreads();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.smeup.sys.mi.core.JavaThreadInfo"
	 * @generated
	 */
	List<ThreadInfo> listThreadInfos();

} // QThreads
