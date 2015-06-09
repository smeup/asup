/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.isam;

import org.smeup.sys.il.core.ctx.QContextProvider;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Isam Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.isam.QIntegratedLanguageIsamPackage#getIsamManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QIsamManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextProviderRequired="true"
	 * @generated
	 */
	QIsamFactory createFactory(QContextProvider contextProvider);

} // QIsamManager
