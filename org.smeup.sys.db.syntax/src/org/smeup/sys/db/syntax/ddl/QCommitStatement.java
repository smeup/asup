/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.ddl;

import org.smeup.sys.db.syntax.QDefinitionStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commit Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QCommitStatement#isHold <em>Hold</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getCommitStatement()
 * @model
 * @generated
 */
public interface QCommitStatement extends QDefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hold</em>' attribute.
	 * @see #setHold(boolean)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getCommitStatement_Hold()
	 * @model
	 * @generated
	 */
	boolean isHold();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QCommitStatement#isHold <em>Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold</em>' attribute.
	 * @see #isHold()
	 * @generated
	 */
	void setHold(boolean value);

} // QCommitStatement
