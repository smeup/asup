/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax;

import org.eclipse.datatools.modelbase.sql.query.QueryStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.db.syntax.QDatabaseSyntaxPackage#getQueryWriter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QQueryWriter extends QStatementWriter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model statementRequired="true"
	 * @generated
	 */
	String writeQuery(QueryStatement statement);

} // QueryConverter
