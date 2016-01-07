/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.mi.core.util;

import java.net.URI;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>UR Is</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.mi.core.util.QMachineInterfaceCoreUtilPackage#getURIs()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QURIs {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" uriDataType="org.smeup.sys.mi.core.JavaURI" uriRequired="true"
	 * @generated
	 */
	String getBaseName(URI uri);

} // QURIs
