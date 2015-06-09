/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax;

import org.eclipse.datatools.modelbase.sql.query.QueryStatement;
import org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.db.syntax.QDatabaseSyntaxPackage#getNameHelper()
 * @model interface="true" abstract="true" superTypes="org.smeup.sys.db.syntax.SQLObjectNameHelper"
 * @generated
 */
public interface QNameHelper extends ISQLObjectNameHelper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model queryRequired="true"
	 * @generated
	 */
	void resolveContainers(QueryStatement query);

} // QNameHelper
