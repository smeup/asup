/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.db.esql.jdbc;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;

import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.esql.CursorType;
import org.smeup.sys.db.esql.QCommunicationArea;
import org.smeup.sys.db.esql.QCursor;
import org.smeup.sys.db.esql.QCursorTerm;
import org.smeup.sys.db.esql.QESqlFactory;
import org.smeup.sys.db.esql.QIntegratedLanguageEmbeddedSQLFactory;
import org.smeup.sys.db.esql.QStatement;
import org.smeup.sys.db.esql.QStatementTerm;
import org.smeup.sys.db.esql.annotation.CursorDef;
import org.smeup.sys.il.data.QDataContext;

public class JDBCESqlFactoryImpl implements QESqlFactory {

	private QConnection connection;
	
	@SuppressWarnings("unused")
	private QDataContext dataContext;
	private QCommunicationArea communicationArea;
	
	public JDBCESqlFactoryImpl(QConnection connection, QDataContext dataContext, QCommunicationArea communicationArea) {
		this.connection = connection;
		this.dataContext = dataContext;
		this.communicationArea = communicationArea;
	}
	
	@Override
	public QCursor createCursor(CursorType cursorType, boolean hold, String sql) {
		
		QCursor cursor = new JDBCSqlCursorImpl(connection, communicationArea, cursorType, sql);
		
		return cursor;
	}

	@Override
	public QCursor createCursor(CursorType cursorType, boolean hold, QStatement statement) {

		QCursor cursor = new JDBCStatementCursorImpl(connection, communicationArea, cursorType, statement);
		
		return cursor;
	}

	@Override
	public QCursorTerm createCursorTerm(String name, Type type, List<Annotation> annotations) {

		QCursorTerm cursorTerm = QIntegratedLanguageEmbeddedSQLFactory.eINSTANCE.createCursorTerm();
		cursorTerm.setName(name);
		
		for (Annotation annotation : annotations) {
			
			if(annotation instanceof CursorDef) {
				CursorDef cursorDef = (CursorDef) annotation;
				if(!cursorDef.statement().isEmpty())
					cursorTerm.setStatementName(cursorDef.statement());
				cursorTerm.setCursorType(cursorDef.type());
				cursorTerm.setHold(cursorDef.hold());
				if(!cursorDef.sql().isEmpty())
					cursorTerm.setSql(cursorDef.sql());				
			}
		}
		 		
		return cursorTerm;
	}

	@Override
	public QStatement createStatement() {
	
		QStatement statement = new JDBCStatementImpl(connection, communicationArea);
		
		return statement;
	}

	@Override
	public QStatementTerm createStatementTerm(String name, Type type, List<Annotation> annotations) {
		
		QStatementTerm statementTerm = QIntegratedLanguageEmbeddedSQLFactory.eINSTANCE.createStatementTerm();
		statementTerm.setName(name);

		return statementTerm;
	}
}
