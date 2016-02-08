/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.ctx;

import java.security.Principal;

import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage#getIdentity()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QIdentity<T extends QObject> extends QCapability<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.smeup.sys.mi.core.JavaPrincipal"
	 * @generated
	 */
	Principal getJavaPrincipal();

} // QIdentity
