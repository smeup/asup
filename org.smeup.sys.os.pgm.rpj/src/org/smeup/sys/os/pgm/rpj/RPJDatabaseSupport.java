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
package org.smeup.sys.os.pgm.rpj;

import javax.inject.Inject;

import org.smeup.sys.db.esql.CursorType;
import org.smeup.sys.db.esql.QCursor;
import org.smeup.sys.db.esql.QESqlFactory;
import org.smeup.sys.db.esql.QStatement;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Module;
import org.smeup.sys.il.data.annotation.Module.Scope;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.def.BinaryType;

@Module(name="*SQL", scope = Scope.OWNER)
public class RPJDatabaseSupport extends RPJModule {
	private static final long serialVersionUID = 1L;

	@Inject
	private transient QESqlFactory esqlFactory;

	@DataDef
	@Overlay(name = "*SQLCA")
	public SQLCA sqlca;

	public static class SQLCA extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 8)
		public QCharacter sqlcaid;
		@DataDef(length = 8)
		@Overlay(name = "sqlcaid")
		public QCharacter sqlaid;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary sqlcabc;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(name = "sqlcabc")
		public QBinary sqlabc;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary sqlcode;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(name = "sqlcode")
		public QBinary sqlcod;
		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary sqlerrml;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(name = "sqlerrml")
		public QBinary sqlerl;
		@DataDef(length = 70)
		public QCharacter sqlerrmc;
		@DataDef(length = 70)
		@Overlay(name = "sqlerrmc")
		public QCharacter sqlerm;
		@DataDef(length = 8)
		public QCharacter sqlerrp;
		@DataDef(length = 8)
		@Overlay(name = "sqlerrp")
		public QCharacter sqlerp;
		@DataDef(length = 24)
		public QCharacter sqlerr;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(name = "sqlerr")
		public QBinary sqler1;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(name = "sqlerr")
		public QBinary sqler2;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(name = "sqlerr")
		public QBinary sqler3;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(name = "sqlerr")
		public QBinary sqler4;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(name = "sqlerr")
		public QBinary sqler5;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(name = "sqlerr")
		public QBinary sqler6;
		@DataDef(dimension = 6, binaryType = BinaryType.INTEGER)
		@Overlay(name = "sqlerr")
		public QArray<QBinary> sqlerrd;
		@DataDef(length = 11)
		public QCharacter sqlwrn;
		@DataDef(length = 1)
		@Overlay(name = "sqlwrn")
		public QCharacter sqlwn0;
		@DataDef(length = 1)
		@Overlay(name = "sqlwrn")
		public QCharacter sqlwn1;
		@DataDef(length = 1)
		@Overlay(name = "sqlwrn")
		public QCharacter sqlwn2;
		@DataDef(length = 1)
		@Overlay(name = "sqlwrn")
		public QCharacter sqlwn3;
		@DataDef(length = 1)
		@Overlay(name = "sqlwrn")
		public QCharacter sqlwn4;
		@DataDef(length = 1)
		@Overlay(name = "sqlwrn")
		public QCharacter sqlwn5;
		@DataDef(length = 1)
		@Overlay(name = "sqlwrn")
		public QCharacter sqlwn6;
		@DataDef(length = 1)
		@Overlay(name = "sqlwrn")
		public QCharacter sqlwn7;
		@DataDef(length = 1)
		@Overlay(name = "sqlwrn")
		public QCharacter sqlwn8;
		@DataDef(length = 1)
		@Overlay(name = "sqlwrn")
		public QCharacter sqlwn9;
		@DataDef(length = 1)
		@Overlay(name = "sqlwrn")
		public QCharacter sqlwna;
		@DataDef(dimension = 11, length = 1)
		@Overlay(name = "sqlwrn")
		public QArray<QCharacter> sqlwarn;
		@DataDef(length = 5)
		public QCharacter sqlstate;
		@DataDef(length = 5)
		@Overlay(name = "sqlstate")
		public QCharacter sqlstt;
	}

	public static class SQLDA extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 8)
		public QCharacter sqldaid;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary sqldabc;
		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary sqln;
		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary sqld;
		@DataDef(dimension = 10, length = 80)
		public QArray<QCharacter> sql_var;
	}

	public static class SQLVAR extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary sqltype;
		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary sqllen;
		@DataDef(length = 12)
		public QCharacter sqlres;
		@DataDef(length = 16)
		public QCharacter sqlinfo1;
		@DataDef(length = 16)
		@Overlay(name = "sqlinfo1", position = 1)
		public QCharacter sqldata;
		@DataDef(length = 16)
		public QCharacter sqlinfo2;
		@DataDef(length = 16)
		@Overlay(name = "sqlinfo2", position = 1)
		public QCharacter sqlind;
		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary sqlnamelen;
		@DataDef(length = 30)
		public QCharacter sqlname;
	}

	@SuppressWarnings("resource")
	public QCursor declare(CursorType cursorType, boolean hold, String sql, QBufferedElement[] parameters) {
		
		QStatement statement = esqlFactory.createStatement();
		statement.prepare(sql, parameters);
		
		return esqlFactory.createCursor(cursorType, hold, statement);
	}
}