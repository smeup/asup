/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax;

import org.smeup.sys.db.core.QConnectionConfig;
import org.smeup.sys.il.core.QObjectRegistry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Helper Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.db.syntax.QDatabaseSyntaxPackage#getNameHelperRegistry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QNameHelperRegistry extends QObjectRegistry<QNameHelper> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" connectionConfigRequired="true"
	 * @generated
	 */
	QNameHelper lookup(QConnectionConfig connectionConfig);

} // QNameHelperRegistry
