/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.ddl;

import org.smeup.sys.db.syntax.QDefinitionStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disconnect Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QDisconnectStatement#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getDisconnectStatement()
 * @model
 * @generated
 */
public interface QDisconnectStatement extends QDefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.db.syntax.ddl.TargetItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see org.smeup.sys.db.syntax.ddl.TargetItem
	 * @see #setTarget(TargetItem)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getDisconnectStatement_Target()
	 * @model
	 * @generated
	 */
	TargetItem getTarget();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QDisconnectStatement#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see org.smeup.sys.db.syntax.ddl.TargetItem
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetItem value);

} // QDisconnectStatement
