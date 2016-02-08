/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.ddl;

import org.smeup.sys.db.core.QIndexDef;
import org.smeup.sys.db.core.QQualifiedName;
import org.smeup.sys.db.syntax.QDefinitionStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Index Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QCreateIndexStatement#getIndexName <em>Index Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QCreateIndexStatement#getOnTable <em>On Table</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QCreateIndexStatement#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QCreateIndexStatement#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getCreateIndexStatement()
 * @model
 * @generated
 */
public interface QCreateIndexStatement extends QDefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Index Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Name</em>' containment reference.
	 * @see #setIndexName(QQualifiedName)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getCreateIndexStatement_IndexName()
	 * @model containment="true"
	 * @generated
	 */
	QQualifiedName getIndexName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QCreateIndexStatement#getIndexName <em>Index Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Name</em>' containment reference.
	 * @see #getIndexName()
	 * @generated
	 */
	void setIndexName(QQualifiedName value);

	/**
	 * Returns the value of the '<em><b>On Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Table</em>' containment reference.
	 * @see #setOnTable(QQualifiedName)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getCreateIndexStatement_OnTable()
	 * @model containment="true"
	 * @generated
	 */
	QQualifiedName getOnTable();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QCreateIndexStatement#getOnTable <em>On Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Table</em>' containment reference.
	 * @see #getOnTable()
	 * @generated
	 */
	void setOnTable(QQualifiedName value);

	/**
	 * Returns the value of the '<em><b>Sort By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort By</em>' containment reference.
	 * @see #setSortBy(QIndexDef)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getCreateIndexStatement_SortBy()
	 * @model containment="true"
	 * @generated
	 */
	QIndexDef getSortBy();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QCreateIndexStatement#getSortBy <em>Sort By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort By</em>' containment reference.
	 * @see #getSortBy()
	 * @generated
	 */
	void setSortBy(QIndexDef value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getCreateIndexStatement_Unique()
	 * @model
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QCreateIndexStatement#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

} // QCreateIndexStatement
