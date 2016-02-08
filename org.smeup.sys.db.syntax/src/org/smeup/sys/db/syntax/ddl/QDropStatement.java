/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.ddl;

import org.smeup.sys.db.core.QQualifiedName;
import org.smeup.sys.db.syntax.QDefinitionStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QDropStatement#getRange <em>Range</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QDropStatement#getTargetName <em>Target Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QDropStatement#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getDropStatement()
 * @model
 * @generated
 */
public interface QDropStatement extends QDefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.db.syntax.ddl.DropRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see org.smeup.sys.db.syntax.ddl.DropRange
	 * @see #setRange(DropRange)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getDropStatement_Range()
	 * @model
	 * @generated
	 */
	DropRange getRange();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QDropStatement#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see org.smeup.sys.db.syntax.ddl.DropRange
	 * @see #getRange()
	 * @generated
	 */
	void setRange(DropRange value);

	/**
	 * Returns the value of the '<em><b>Target Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Name</em>' containment reference.
	 * @see #setTargetName(QQualifiedName)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getDropStatement_TargetName()
	 * @model containment="true"
	 * @generated
	 */
	QQualifiedName getTargetName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QDropStatement#getTargetName <em>Target Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Name</em>' containment reference.
	 * @see #getTargetName()
	 * @generated
	 */
	void setTargetName(QQualifiedName value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.db.syntax.ddl.TargetElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see org.smeup.sys.db.syntax.ddl.TargetElement
	 * @see #setTarget(TargetElement)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getDropStatement_Target()
	 * @model
	 * @generated
	 */
	TargetElement getTarget();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QDropStatement#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see org.smeup.sys.db.syntax.ddl.TargetElement
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetElement value);

} // QDropStatement
