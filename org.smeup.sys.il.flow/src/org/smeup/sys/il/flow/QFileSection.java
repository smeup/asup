/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow;

import java.util.List;

import org.smeup.sys.db.esql.QCursorTerm;
import org.smeup.sys.db.esql.QStatementTerm;
import org.smeup.sys.il.esam.QDataSetTerm;
import org.smeup.sys.il.esam.QDisplayTerm;
import org.smeup.sys.il.esam.QKeyListTerm;
import org.smeup.sys.il.esam.QPrintTerm;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Set Section</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.QFileSection#getDataSets <em>Data Sets</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QFileSection#getKeyLists <em>Key Lists</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QFileSection#getCursors <em>Cursors</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QFileSection#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QFileSection#getDisplays <em>Displays</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QFileSection#getPrinters <em>Printers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getFileSection()
 * @model
 * @generated
 */
public interface QFileSection extends QUnitSection {

	/**
	 * Returns the value of the '<em><b>Data Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.il.esam.QDataSetTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Sets</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Sets</em>' containment reference list.
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getFileSection_DataSets()
	 * @model containment="true"
	 * @generated
	 */
	List<QDataSetTerm> getDataSets();

	/**
	 * Returns the value of the '<em><b>Key Lists</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.il.esam.QKeyListTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Lists</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Lists</em>' containment reference list.
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getFileSection_KeyLists()
	 * @model containment="true"
	 * @generated
	 */
	List<QKeyListTerm> getKeyLists();

	/**
	 * Returns the value of the '<em><b>Cursors</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.db.esql.QCursorTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursors</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursors</em>' containment reference list.
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getFileSection_Cursors()
	 * @model containment="true"
	 * @generated
	 */
	List<QCursorTerm> getCursors();

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.db.esql.QStatementTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getFileSection_Statements()
	 * @model containment="true"
	 * @generated
	 */
	List<QStatementTerm> getStatements();

	/**
	 * Returns the value of the '<em><b>Displays</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.il.esam.QDisplayTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displays</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displays</em>' containment reference list.
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getFileSection_Displays()
	 * @model containment="true"
	 * @generated
	 */
	List<QDisplayTerm> getDisplays();

	/**
	 * Returns the value of the '<em><b>Printers</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.il.esam.QPrintTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printers</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printers</em>' containment reference list.
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getFileSection_Printers()
	 * @model containment="true"
	 * @generated
	 */
	List<QPrintTerm> getPrinters();
} // QDataSetSection
