/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam;

import org.smeup.sys.il.data.QDataContext;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Access Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getAccessManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QAccessManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" connectionRequired="true" dataContextRequired="true"
	 * @generated
	 */
	QAccessContext createAccessContext(Object connection, QDataContext dataContext);

} // QAccessManager
