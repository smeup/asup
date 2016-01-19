/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl;

import org.smeup.sys.db.syntax.QBindingStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Diagnostics Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QGetDiagnosticsStatement#getConditionInfo <em>Condition Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getGetDiagnosticsStatement()
 * @model
 * @generated
 */
public interface QGetDiagnosticsStatement extends QBindingStatement {
	/**
	 * Returns the value of the '<em><b>Condition Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Info</em>' reference.
	 * @see #setConditionInfo(QConditionInfoClause)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getGetDiagnosticsStatement_ConditionInfo()
	 * @model
	 * @generated
	 */
	QConditionInfoClause getConditionInfo();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QGetDiagnosticsStatement#getConditionInfo <em>Condition Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Info</em>' reference.
	 * @see #getConditionInfo()
	 * @generated
	 */
	void setConditionInfo(QConditionInfoClause value);

} // QGetDiagnosticsStatement
