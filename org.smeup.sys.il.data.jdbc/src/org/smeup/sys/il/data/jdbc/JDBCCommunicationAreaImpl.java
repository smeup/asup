package org.smeup.sys.il.data.jdbc;

import org.smeup.sys.db.esql.QCommunicationArea;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.def.BinaryType;

public class JDBCCommunicationAreaImpl extends QDataStructWrapper implements QCommunicationArea {
	
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
