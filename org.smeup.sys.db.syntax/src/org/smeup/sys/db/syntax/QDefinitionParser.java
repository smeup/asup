/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax;

import java.io.InputStream;
import java.sql.SQLException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.db.syntax.QDatabaseSyntaxPackage#getDefinitionParser()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QDefinitionParser extends QStatementParser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" streamDataType="org.smeup.sys.mi.core.JavaInputStream" streamRequired="true"
	 * @generated
	 */
	QDefinitionParseResult parseDefinition(InputStream stream) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	QDefinitionParseResult parseDefinition(String sql) throws SQLException;

} // QDefinitionParser
