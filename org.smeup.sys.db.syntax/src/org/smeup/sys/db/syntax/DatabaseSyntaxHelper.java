package org.smeup.sys.db.syntax;


public class DatabaseSyntaxHelper {
	
	private static String[] ddlRegex = {
			"^[\\s]*[cC][aA][lL][lL][\\s]*.*", /*CALL*/			
			"^[\\s]*[cC][oO][mM][mM][iI][tT][\\s]*.*", /*COMMIT*/
			"^[\\s]*[cC][oO][nN][nN][eE][cC][tT][\\s]*.*", /*CONNECT*/
			"^[\\s]*[cC][oO][nN][nN][eE][cC][tT][\\s]*.*", /*CONNECT*/
			"^[\\s]*[cC][rR][eE][aA][tT][eE][\\s]*[aA][lL][iI][aA][sS].*", /*CREATE ALIAS*/
			"^[\\s]*[cC][rR][eE][aA][tT][eE][\\s]*[iI][nN][dD][eE][xX].*", /*CREATE INDEX*/
			"^[\\s]*[cC][rR][eE][aA][tT][eE][\\s]*[tT][aA][bB][lL][eE].*", /*CREATE TABLE*/
			"^[\\s]*[cC][rR][eE][aA][tT][eE][\\s]*[vV][iI][eE][wW].*", /*CREATE VIEW*/
			"^[\\s]*[dD][iI][sS][cC][oO][nN][nN][eE][cC][tT][\\s]*.*", /*DICONNECT*/
			"^[\\s]*[dD][rR][oO][pP][\\s]*[aA][lL][iI][aA][sS].*", /*DROP ALIAS*/
			"^[\\s]*[dD][rR][oO][pP][\\s]*[iI][nN][dD][eE][xX].*", /*DROP INDEX*/
			"^[\\s]*[dD][rR][oO][pP][\\s]*[tT][aA][bB][lL][eE].*", /*DROP TABLE*/
			"^[\\s]*[dD][rR][oO][pP][\\s]*[vV][iI][eE][wW].*", /*DROP VIEW*/
			"^[\\s]*[lL][oO][cC][kK][\\s]*[tT][aA][bB][lL][eE].*", /*LOCK TABLE*/
			"^[\\s]*[rR][eE][nN][aA][mM][eE][\\s]*[tT][aA][bB][lL][eE].*", /*RENAME TABLE*/
			"^[\\s]*[rR][eE][nN][aA][mM][eE][\\s]*[iI][nN][dD][eE][xX].*", /*RENAME INDEX*/
			"^[\\s]*[rR][eE][lL][eE][aA][sS][eE].*", /*RELEASE*/
			"^[\\s]*[rR][oO][lL][lL][bB][aA][cC][kK].*", /*ROLLBACK*/
			"^[\\s]*[sS][eE][tT][\\s]*[cC][oO][nN][nN][eE][cC][tT][iI][oO][nN].*" /*SET CONNECTION*/			
	};
	
	private static String[] dblRegex = {
		"^[\\s]*[sS][eE][tT][\\s]*[tT][rR][aA][nN][sS][aA][cC][tT][iI][oO][nN].*", /*SET TRANSACTION*/
		"^[\\s]*[sS][eE][lL][eE][cC][tT].*[iI][nN][tT][oO][\\s]*.*", /*SELECT INTO*/
		"^[\\s]*[oO][pP][eE][nN][\\s]*.*", /*OPEN*/
		"^[\\s]*[pP][rR][eE][pP][aA][rR][eE][\\s]*.*", /*PREPARE*/
		"^[\\s]*[dD][eE][cC][lL][aA][rR][eE][\\s]*.*", /*DECLARE*/
		"^[\\s]*[dD][eE][sS][cC][rR][iI][bB][eE][\\s]*.*", /*DESCRIBE*/
//		"^[\\s]*[fF][eE][tT][cC][hH].*[fF][rR][oO][mM][\\s][\\s]*.*", /*FETCH FROM*/
		"^[\\s]*[fF][eE][tT][cC][hH][\\s]*.*", /*FETCH*/
		"^[\\s]*[cC][lL][oO][sS][eE][\\s]*.*", /*CLOSE*/
		"^[\\s]*[sS][eE][tT][\\s]*[oO][pP][tT][iI][oO][nN][\\s]*.*", /*SET OPTION*/
		"^[\\s]*[eE][xX][eE][cC][uU][tT][eE][\\s]*.*", /*EXECUTE*/
		
	};
	

	public static StatementType getSQLStatementType(String statement) {
		
		StatementType result = StatementType.DML;
		
		if (isDDLStatement(statement)) {
			result = StatementType.DDL;
		} else if (isDBLStatement(statement)) {
			result = StatementType.DBL;
		}
				
		return result;
	}
	
	public static boolean isDDLStatement(String statement) {
		
		boolean result = false;
		
		for (int i = 0; i < ddlRegex.length; i++) {
			if (statement.matches(ddlRegex[i])) {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	public static boolean isDBLStatement(String statement) {
		
		boolean result = false;
		
		for (int i = 0; i < dblRegex.length; i++) {
			if (statement.matches(dblRegex[i])) {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	public static boolean isDMLStatement(String statement) {
		
		return !(isDBLStatement(statement)  || isDDLStatement(statement)); 

	}
	
	public static void main(String[] args) {
		// Test
		System.out.println(isDBLStatement("DECLARE c1 CURSOR FOR (SELECT A, B, C FROM FILE)"));
	}
	
}
