/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.esql;

import java.lang.annotation.Annotation;

import java.lang.reflect.Type;

import java.util.List;
import org.smeup.sys.il.data.QBufferedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESql Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.db.esql.QIntegratedLanguageEmbeddedSQLPackage#getESqlFactory()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QESqlFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" cursorTypeRequired="true" holdRequired="true" sqlRequired="true"
	 * @generated
	 */
	QCursor createCursor(CursorType cursorType, boolean hold, String sql);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" cursorTypeRequired="true" holdRequired="true" sqlRequired="true" parametersDataType="org.smeup.sys.db.esql.CursorParameters" parametersRequired="true"
	 * @generated
	 */
	QCursor createCursor(CursorType cursorType, boolean hold, String sql, QBufferedElement[] parameters);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" cursorTypeRequired="true" holdRequired="true" statementRequired="true"
	 * @generated
	 */
	QCursor createCursor(CursorType cursorType, boolean hold, QStatement statement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true" typeDataType="org.smeup.sys.mi.core.JavaType" typeRequired="true" annotationsDataType="org.smeup.sys.mi.core.JavaAnnotation" annotationsRequired="true" annotationsMany="true"
	 * @generated
	 */
	QCursorTerm createCursorTerm(String name, Type type, List<Annotation> annotations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QStatement createStatement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true" typeDataType="org.smeup.sys.mi.core.JavaType" typeRequired="true" annotationsDataType="org.smeup.sys.mi.core.JavaAnnotation" annotationsRequired="true" annotationsMany="true"
	 * @generated
	 */
	QStatementTerm createStatementTerm(String name, Type type, List<Annotation> annotations);

} // QESqlFactory
