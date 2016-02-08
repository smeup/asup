/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.ctx;

import java.net.URI;
import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage#getCapability()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QCapability<T extends QObject> extends QObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.smeup.sys.mi.core.JavaURI" required="true"
	 * @generated
	 */
	URI getObjectAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getObjectID();

} // QCapability
