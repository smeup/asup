/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax;

import java.sql.SQLException;

import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

import org.smeup.sys.db.core.QConnection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias Resolver</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.db.syntax.QDatabaseSyntaxPackage#getAliasResolver()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QAliasResolver {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" connectionRequired="true" queryDataType="org.smeup.sys.db.syntax.SQLQueryParseResult" queryRequired="true"
	 * @generated
	 */
	void resolveQuery(QConnection connection, SQLQueryParseResult query) throws SQLException;

} // QAliasResolver
