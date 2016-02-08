/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax;

import org.smeup.sys.db.core.QConnectionConfig;
import org.smeup.sys.il.core.ctx.QPluginRegistry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Parser Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.db.syntax.QDatabaseSyntaxPackage#getBindingParserRegistry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QBindingParserRegistry extends QPluginRegistry<QBindingParser> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" connectionConfigRequired="true"
	 * @generated
	 */
	QBindingParser lookup(QConnectionConfig connectionConfig);

} // QBindingParserRegistry
