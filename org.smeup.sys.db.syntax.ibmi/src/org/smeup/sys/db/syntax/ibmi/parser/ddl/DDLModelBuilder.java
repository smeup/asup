package org.smeup.sys.db.syntax.ibmi.parser.ddl;

import java.sql.SQLException;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.smeup.sys.db.core.OrderingType;
import org.smeup.sys.db.core.QDatabaseCoreFactory;
import org.smeup.sys.db.core.QIndexColumnDef;
import org.smeup.sys.db.core.QIndexDef;
import org.smeup.sys.db.core.QQualifiedName;
import org.smeup.sys.db.core.QTableColumnDef;
import org.smeup.sys.db.syntax.QDatabaseSyntaxFactory;
import org.smeup.sys.db.syntax.QDefinitionParseResult;
import org.smeup.sys.db.syntax.QDefinitionStatement;
import org.smeup.sys.db.syntax.ddl.DropRange;
import org.smeup.sys.db.syntax.ddl.QCallStatement;
import org.smeup.sys.db.syntax.ddl.QCommitStatement;
import org.smeup.sys.db.syntax.ddl.QConnectStatement;
import org.smeup.sys.db.syntax.ddl.QCreateAliasStatement;
import org.smeup.sys.db.syntax.ddl.QCreateIndexStatement;
import org.smeup.sys.db.syntax.ddl.QCreateTableStatement;
import org.smeup.sys.db.syntax.ddl.QCreateViewStatement;
import org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLFactory;
import org.smeup.sys.db.syntax.ddl.QDisconnectStatement;
import org.smeup.sys.db.syntax.ddl.QDropStatement;
import org.smeup.sys.db.syntax.ddl.QLockTableStatement;
import org.smeup.sys.db.syntax.ddl.QReleaseStatement;
import org.smeup.sys.db.syntax.ddl.QRenameStatement;
import org.smeup.sys.db.syntax.ddl.QRollbackStatement;
import org.smeup.sys.db.syntax.ddl.QSetConnectionStatement;
import org.smeup.sys.db.syntax.ddl.ShareMode;
import org.smeup.sys.db.syntax.ddl.TargetElement;
import org.smeup.sys.db.syntax.ddl.TargetItem;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.data.def.FloatingType;
import org.smeup.sys.il.data.def.QBinaryDef;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QDatetimeDef;
import org.smeup.sys.il.data.def.QDecimalDef;
import org.smeup.sys.il.data.def.QFloatingDef;
import org.smeup.sys.il.data.def.QIndicatorDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;


public class DDLModelBuilder {

	/**
	 * Parse definition string and convert result in db-syntax model
	 * 
	 * @param definitionString
	 * @return
	 * @throws SQLException
	 */
	public QDefinitionParseResult parseDefinition(String definitionString) throws SQLException {
		QDefinitionParseResult parserResult = QDatabaseSyntaxFactory.eINSTANCE.createDefinitionParseResult();

		String[] queryStrings = null;
		if (isCreateViewStatement(definitionString)) {
			String[] parts = splitCreteViewStatement(definitionString);
			definitionString = parts[0];
			queryStrings = new String[] { parts[1] };
		} else if (isCallStatement(definitionString)) {
			queryStrings = getCallParms(definitionString);
			definitionString = removeCallParms(definitionString);
		}

		DDLLexer lex = new DDLLexer(new ANTLRStringStream(definitionString));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		DDLParser parser = new DDLParser(tokens);

		CommonTree tree = null;
		try {
			tree = parser.sql().getTree();

			parserResult.setDefinitionStatement(convertModel(tree.getChild(0), queryStrings));

		} catch (RecognitionException e) {
			e.printStackTrace();
			throw new SQLException(e);

		} catch (Error e) {
			e.printStackTrace();
			throw new SQLException(e);
		}
		return parserResult;
	}

	private QDefinitionStatement convertModel(Tree tree, String[] queryString) {

		QDefinitionStatement result = null;

		switch (tree.getType()) {

		case DDLLexer.COMMIT_STATEMENT:
			result = manageCommitStatement(tree);
			break;

		case DDLLexer.CONNECT_STATEMENT:
			result = manageConnectStatement(tree);
			break;

		case DDLLexer.CREATE_ALIAS_STATEMENT:
			result = manageCreateAliasStatement(tree);
			break;

		case DDLLexer.CREATE_INDEX_STATEMENT:
			result = manageCreateIndexStatement(tree);
			break;

		case DDLLexer.CREATE_TABLE_STATEMENT:
			result = manageCreateTableStatement(tree);
			break;

		case DDLLexer.CREATE_VIEW_STATEMENT:
			result = manageCreateViewStatement(tree, queryString);
			break;

		case DDLLexer.DROP_ALIAS_STATEMENT:
			result = manageDropAliasStatement(tree);
			break;

		case DDLLexer.DROP_INDEX_STATEMENT:
			result = manageDropIndexStatement(tree);
			break;

		case DDLLexer.DROP_TABLE_STATEMENT:
			result = manageDropTableStatement(tree);
			break;

		case DDLLexer.DROP_VIEW_STATEMENT:
			result = manageDropViewStatement(tree);
			break;

		case DDLLexer.DISCONNECT_STATEMENT:
			result = manageDisconnectStatement(tree);
			break;

		case DDLLexer.LOCK_TABLE_STATEMENT:
			result = manageLockTableStatement(tree);
			break;

		case DDLLexer.PROCEDURE_CALL_STATEMENT:
			result = manageProcedureCallStatement(tree, queryString);
			break;

		case DDLLexer.RENAME_INDEX_STATEMENT:
			result = manageRenameIndexStatement(tree);
			break;

		case DDLLexer.RENAME_TABLE_STATEMENT:
			result = manageRenameTableStatement(tree);
			break;

		case DDLLexer.RELEASE_STATEMENT:
			result = manageReleaseStatement(tree);
			break;

		case DDLLexer.ROLLBACK_STATEMENT:
			result = manageRollbackStatement(tree);
			break;

		case DDLLexer.SET_CONNECTION_STATEMENT:
			result = manageSetConnectionStatement(tree);
			break;
		}

		return result;
	}

	private QDefinitionStatement manageSetConnectionStatement(Tree tree) {
		QSetConnectionStatement setConnectionStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createSetConnectionStatement();

		if (tree.getChildCount() > 0 && tree.getChild(0).getType() == DDLLexer.DB_NAME)
			setConnectionStatement.setDatabaseName(tree.getChild(0).getChild(0).getText());

		return setConnectionStatement;
	}

	private QDefinitionStatement manageRenameTableStatement(Tree tree) {
		QRenameStatement renameTableStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createRenameStatement();
		renameTableStatement.setTarget(TargetElement.TABLE);

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {
			case DDLLexer.TABLE_NAME:

				QQualifiedName viewQualifiedName = resolveQualified(fieldToken.getChild(0));
				renameTableStatement.setOriginalName(viewQualifiedName);

				break;

			case DDLLexer.NEW_NAME:

				renameTableStatement.setNewName(fieldToken.getChild(0).getText());

				break;

			case DDLLexer.SYSTEM:

				renameTableStatement.setSystem(fieldToken.getChild(0).getText());

				break;

			}
		}

		return renameTableStatement;

	}

	private QDefinitionStatement manageRenameIndexStatement(Tree tree) {
		QRenameStatement renameIndexStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createRenameStatement();
		renameIndexStatement.setTarget(TargetElement.INDEX);

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {
			case DDLLexer.INDEX_NAME:

				QQualifiedName viewQualifiedName = resolveQualified(fieldToken.getChild(0));
				renameIndexStatement.setOriginalName(viewQualifiedName);

				break;

			case DDLLexer.NEW_NAME:

				renameIndexStatement.setNewName(fieldToken.getChild(0).getText());

				break;

			case DDLLexer.SYSTEM:

				renameIndexStatement.setSystem(fieldToken.getChild(0).getText());

				break;

			}
		}

		return renameIndexStatement;

	}

	private QDefinitionStatement manageReleaseStatement(Tree tree) {
		QReleaseStatement releaseStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createReleaseStatement();

		Tree serverName = tree.getChild(0).getChild(0);

		if (serverName.getType() == DDLLexer.ALL)
			releaseStatement.setServerName(TargetItem.ALL.getLiteral());
		else if (serverName.getType() == DDLLexer.ALL_SQL)
			releaseStatement.setServerName(TargetItem.ALLSQL.getLiteral());
		if (serverName.getType() == DDLLexer.CURRENT)
				releaseStatement.setServerName(TargetItem.CURRENT.getLiteral());
			else
				releaseStatement.setServerName(serverName.getText());

		return releaseStatement;
	}

	private QDefinitionStatement manageRollbackStatement(Tree tree) {
		QRollbackStatement releaseStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createRollbackStatement();
		releaseStatement.setHold(false);

		if (tree.getChildCount() > 0 && tree.getChild(0).getType() == DDLLexer.HOLD)
			releaseStatement.setHold(true);

		return releaseStatement;
	}

	private QDefinitionStatement manageProcedureCallStatement(Tree tree, String[] queryStrings) {

		QCallStatement callStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createCallStatement();

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {
			case DDLLexer.PROCEDURE_NAME:

				QQualifiedName procedureQualifiedName = resolveQualified(fieldToken.getChild(0));
				callStatement.setProcedureName(procedureQualifiedName);

				break;
			}
		}

		for (String queryString : queryStrings)
			callStatement.getParms().add(queryString);

		return callStatement;
	}

	private QDefinitionStatement manageLockTableStatement(Tree tree) {
		QLockTableStatement lockTableStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createLockTableStatement();
		lockTableStatement.setShareMode(ShareMode.EXCLUSIVE);
		lockTableStatement.setAllowRead(false);

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {
			case DDLLexer.TABLE_NAME:

				QQualifiedName tableQualifiedName = resolveQualified(fieldToken.getChild(0));
				lockTableStatement.setTableName(tableQualifiedName);

				break;

			case DDLLexer.SHARE:

				lockTableStatement.setShareMode(ShareMode.SHARE);

				break;

			case DDLLexer.ALLOW_READ:

				lockTableStatement.setAllowRead(true);

				break;

			}
		}

		return lockTableStatement;

	}

	private QDefinitionStatement manageDisconnectStatement(Tree tree) {
		QDisconnectStatement disconnectStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createDisconnectStatement();

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {

			case DDLLexer.ALL:
				disconnectStatement.setTarget(TargetItem.ALL);
				break;

			case DDLLexer.CURRENT:
				disconnectStatement.setTarget(TargetItem.CURRENT);
				break;
			}
		}

		return disconnectStatement;
	}

	private QDefinitionStatement manageDropViewStatement(Tree tree) {
		QDropStatement dropViewStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createDropStatement();
		dropViewStatement.setTarget(TargetElement.VIEW);
		dropViewStatement.setRange(DropRange.CASCADE);

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {
			case DDLLexer.VIEW_NAME:

				QQualifiedName viewQualifiedName = resolveQualified(fieldToken.getChild(0));
				dropViewStatement.setTargetName(viewQualifiedName);

				break;

			case DDLLexer.RESTRICT:

				dropViewStatement.setRange(DropRange.RESTRICT);

				break;

			case DDLLexer.CASCADE:

				dropViewStatement.setRange(DropRange.CASCADE);

				break;

			}
		}

		return dropViewStatement;

	}

	private QDefinitionStatement manageDropTableStatement(Tree tree) {
		QDropStatement dropTableStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createDropStatement();
		dropTableStatement.setTarget(TargetElement.TABLE);
		dropTableStatement.setRange(DropRange.CASCADE);

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {
			case DDLLexer.TABLE_NAME:

				QQualifiedName tableQualifiedName = resolveQualified(fieldToken.getChild(0));
				dropTableStatement.setTargetName(tableQualifiedName);

				break;

			case DDLLexer.RESTRICT:

				dropTableStatement.setRange(DropRange.RESTRICT);

				break;

			case DDLLexer.CASCADE:

				dropTableStatement.setRange(DropRange.CASCADE);

				break;

			}
		}

		return dropTableStatement;
	}

	private QDefinitionStatement manageDropIndexStatement(Tree tree) {
		QDropStatement dropIndexStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createDropStatement();
		dropIndexStatement.setTarget(TargetElement.INDEX);

		Tree indexNameToken = tree.getChild(0);

		if (indexNameToken != null && indexNameToken.getType() == DDLLexer.INDEX_NAME) {
			QQualifiedName indexQualifiedName = resolveQualified(indexNameToken.getChild(0));
			dropIndexStatement.setTargetName(indexQualifiedName);
		}

		return dropIndexStatement;
	}

	private QDefinitionStatement manageDropAliasStatement(Tree tree) {
		QDropStatement dropAliasStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createDropStatement();
		dropAliasStatement.setTarget(TargetElement.ALIAS);

		Tree aliasNameToken = tree.getChild(0);

		if (aliasNameToken != null && aliasNameToken.getType() == DDLLexer.ALIAS_NAME) {
			QQualifiedName aliasQualifiedName = resolveQualified(aliasNameToken.getChild(0));
			dropAliasStatement.setTargetName(aliasQualifiedName);
		}

		return dropAliasStatement;
	}

	private QDefinitionStatement manageCreateViewStatement(Tree tree, String[] queryStrings) {

		QCreateViewStatement createViewStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createCreateViewStatement();

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {

			case DDLLexer.VIEW_NAME:

				// Manage name
				QQualifiedName tableName = null;

				Tree nameField = fieldToken.getChild(0);
				if (nameField.getType() == DDLLexer.QUALIFIED)
					tableName = resolveQualified(nameField);
				else {
					tableName = QDatabaseCoreFactory.eINSTANCE.createQualifiedName();
					tableName.getQualifiers().add(nameField.getText());
				}
				createViewStatement.setViewName(tableName);

				break;

			case DDLLexer.COLUMNS_LIST:

				// Manage columns definition
				Tree fieldDefToken = null;

				for (int k = 0; k < fieldToken.getChildCount(); k++) {

					fieldDefToken = fieldToken.getChild(k);

					Tree fieldDefParm = null;
					for (int j = 0; j < fieldDefToken.getChildCount(); j++) {

						fieldDefParm = fieldDefToken.getChild(j);
						switch (fieldDefParm.getType()) {
						// TODO ???
						case DDLLexer.COLUMN_NAME:

							String name = fieldDefParm.getChild(0).getText();
							createViewStatement.getFields().add(name);

							break;

						case DDLLexer.Identifier:

							createViewStatement.getFields().add(fieldDefParm.getText());

							break;

						}
					}

				}
				break;
			}
		}

		createViewStatement.setQuery(queryStrings[0]);

		return createViewStatement;
	}

	private QDefinitionStatement manageCreateTableStatement(Tree tree) {

		QCreateTableStatement createTableStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createCreateTableStatement();

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {

			case DDLLexer.TABLE_NAME:

				// Manage name
				QQualifiedName tableName = null;

				Tree nameField = fieldToken.getChild(0);
				if (nameField.getType() == DDLLexer.QUALIFIED)
					tableName = resolveQualified(nameField);
				else {
					tableName = QDatabaseCoreFactory.eINSTANCE.createQualifiedName();
					tableName.getQualifiers().add(nameField.getText());
				}
				createTableStatement.setTableName(tableName);

				break;

			case DDLLexer.TABLE_DEF:

				// Manage columns def
				Tree fieldDefToken = null;
				QTableColumnDef tableColumnDef = null;

				for (int k = 0; k < fieldToken.getChildCount(); k++) {

					fieldDefToken = fieldToken.getChild(k);
					tableColumnDef = QDatabaseCoreFactory.eINSTANCE.createTableColumnDef();
					tableColumnDef.setNullable(true);
					tableColumnDef.setDefault(false);

					Tree fieldDefParm = null;
					for (int j = 0; j < fieldDefToken.getChildCount(); j++) {

						fieldDefParm = fieldDefToken.getChild(j);
						switch (fieldDefParm.getType()) {
						case DDLLexer.FIELD_NAME:
							/*
							 * String name = fieldDefParm.getChild(0).getText();
							 * tableColumnDef.setFieldName(name);
							 */
							break;

						case DDLLexer.FOR_COLUMN:
							String columnName = fieldDefParm.getChild(0).getText();
							tableColumnDef.setName(columnName);
							break;

						case DDLLexer.FIELD_TYPE:
							Tree typeToken = fieldDefParm.getChild(0);

							switch (typeToken.getType()) {

							case DDLLexer.CHAR:
								QCharacterDef characterDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
								tableColumnDef.setDefinition(characterDef);
								break;
							case DDLLexer.VARCHAR:
								characterDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
								characterDef.setVarying(true);
								tableColumnDef.setDefinition(characterDef);
								break;
							case DDLLexer.DECIMAL:
								QDecimalDef decimalDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createDecimalDef();
								switch (typeToken.getChildCount()) {
								case 1:
									decimalDef.setPrecision(Integer.parseInt(typeToken.getChild(0).getText()));
									break;
								case 2:									
									decimalDef.setPrecision(Integer.parseInt(typeToken.getChild(0).getText()));
									decimalDef.setScale(Integer.parseInt(typeToken.getChild(1).getText()));
									break;
								}
								tableColumnDef.setDefinition(decimalDef);
								break;
							case DDLLexer.BOOLEAN:
								QIndicatorDef indicatorDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createIndicatorDef();
								tableColumnDef.setDefinition(indicatorDef);
								break;
							case DDLLexer.DATE:
								QDatetimeDef datetimeDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createDatetimeDef();
								datetimeDef.setType(DatetimeType.DATE);
								tableColumnDef.setDefinition(datetimeDef);
								break;
							case DDLLexer.TIME:
								datetimeDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createDatetimeDef();
								datetimeDef.setType(DatetimeType.TIME);
								tableColumnDef.setDefinition(datetimeDef);
								break;
							case DDLLexer.TIMESTAMP:
								datetimeDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createDatetimeDef();
								datetimeDef.setType(DatetimeType.TIME_STAMP);
								tableColumnDef.setDefinition(datetimeDef);
								break;
							case DDLLexer.INTEGER:
								QBinaryDef binaryDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createBinaryDef();
								binaryDef.setType(BinaryType.INTEGER);
								tableColumnDef.setDefinition(binaryDef);
								break;
							case DDLLexer.FLOAT:
								QFloatingDef floatingDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createFloatingDef();
								floatingDef.setType(FloatingType.SINGLE);
								tableColumnDef.setDefinition(floatingDef);
								break;
							}

							break;

						case DDLLexer.NOT_NULL:
							tableColumnDef.setNullable(false);
							break;

						case DDLLexer.WITH_DEFAULT:
							tableColumnDef.setDefault(true);
							break;
						}

					}
					createTableStatement.getFields().add(tableColumnDef);
				}
				break;
			}
		}

		return createTableStatement;
	}

	private QDefinitionStatement manageCreateIndexStatement(Tree tree) {

		QCreateIndexStatement createIndexStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createCreateIndexStatement();
		createIndexStatement.setUnique(false);

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {
			case DDLLexer.UNIQUE:

				createIndexStatement.setUnique(true);

				break;

			case DDLLexer.INDEX_NAME:

				QQualifiedName qualifiedIndexName = resolveQualified(fieldToken.getChild(0));
				createIndexStatement.setIndexName(qualifiedIndexName);

				break;

			case DDLLexer.ON:

				QQualifiedName qualifiedTableName = resolveQualified(fieldToken.getChild(0));
				createIndexStatement.setOnTable(qualifiedTableName);

				break;

			case DDLLexer.SORT_SPECIFIERS:

				QIndexDef indexDef = QDatabaseCoreFactory.eINSTANCE.createIndexDef();

				// Iterate on SORT_KEY elements
				Tree keyToken = null;
				int counter = 0;
				for (int j = 0; j < fieldToken.getChildCount(); j++) {

					keyToken = fieldToken.getChild(j);
					if (keyToken.getType() == DDLLexer.SORT_KEY) {

						QIndexColumnDef indexColumnDef = QDatabaseCoreFactory.eINSTANCE.createIndexColumnDef();
						indexColumnDef.setSequence(counter++);
						indexColumnDef.setOrdering(OrderingType.ASCEND);

						Tree keyTokenField = null;
						for (int j2 = 0; j2 < keyToken.getChildCount(); j2++) {
							keyTokenField = keyToken.getChild(j2);

							switch (keyTokenField.getType()) {
							case DDLLexer.FIELD_NAME:

								indexColumnDef.setName(keyTokenField.getChild(0).getText());

								break;

							case DDLLexer.ORDER:

								if (keyTokenField.getChild(0).getType() == DDLLexer.DESC)
									indexColumnDef.setOrdering(OrderingType.DESCEND);

								break;
							}
						}

						indexDef.getColumns().add(indexColumnDef);
					}
				}

				createIndexStatement.setSortBy(indexDef);

				break;
			}
		}

		return createIndexStatement;
	}

	private QDefinitionStatement manageCreateAliasStatement(Tree tree) {
		QCreateAliasStatement createAliasStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createCreateAliasStatement();

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {
			case DDLLexer.ALIAS_NAME:

				QQualifiedName aliasName = null;

				Tree nameField = fieldToken.getChild(0);
				if (nameField.getType() == DDLLexer.QUALIFIED)
					aliasName = resolveQualified(nameField);
				else {
					aliasName = QDatabaseCoreFactory.eINSTANCE.createQualifiedName();
					aliasName.getQualifiers().add(nameField.getText());
				}

				createAliasStatement.setAliasName(aliasName);

				break;

			case DDLLexer.TABLE_NAME:

				QQualifiedName tableName = null;

				Tree tableField = fieldToken.getChild(0);
				if (tableField.getType() == DDLLexer.QUALIFIED)
					tableName = resolveQualified(tableField);
				else {
					tableName = QDatabaseCoreFactory.eINSTANCE.createQualifiedName();
					tableName.getQualifiers().add(tableField.getText());
				}

				createAliasStatement.setTableName(tableName);

				break;
			}
		}
		return createAliasStatement;
	}

	private QDefinitionStatement manageConnectStatement(Tree tree) {
		QConnectStatement connectStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createConnectStatement();

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {
			case DDLLexer.TO:
				connectStatement.setTo(fieldToken.getChild(0).getText());
				break;

			case DDLLexer.USER:
				connectStatement.setUser(fieldToken.getChild(0).getText());
				break;

			case DDLLexer.USING:
				connectStatement.setPwd(fieldToken.getChild(0).getText());
				break;

			case DDLLexer.RESET:
				connectStatement.setReset(true);
				break;

			default:
				break;
			}
		}

		return connectStatement;
	}

	private QDefinitionStatement manageCommitStatement(Tree tree) {

		QCommitStatement commitStatement = QDatabaseSyntaxDDLFactory.eINSTANCE.createCommitStatement();

		if (tree.getChildCount() > 0)
			commitStatement.setHold(true);

		return commitStatement;
	}

	private QQualifiedName resolveQualified(Tree tree) {

		QQualifiedName qualifiedName = QDatabaseCoreFactory.eINSTANCE.createQualifiedName();

		if (tree.getType() == DDLLexer.QUALIFIED)
			for (int i = 0; i < tree.getChildCount(); i++)
				qualifiedName.getQualifiers().add(tree.getChild(i).getText());

		return qualifiedName;
	}

	// Utility methods

	private boolean isCreateViewStatement(String statement) {
		return statement.matches("^[\\s]*[cC][rR][eE][aA][tT][eE][\\s]*[vV][iI][eE][wW].*");
	}

	private String[] splitCreteViewStatement(String viewText) {

		String[] tokens = viewText.split("[)\\s][aA][sS][\\s(]", Pattern.CASE_INSENSITIVE);

		String body = viewText.substring(tokens[0].length()).trim();
		body = body.replaceAll("^[)]?[aA][sS]", "");

		/*
		 * Pattern pattern = Pattern.compile(
		 * "(.*SELECT.*)[\\s]+?WITH[\\s]+?.*CHECK[\\s]+?OPTION.*",
		 * Pattern.CASE_INSENSITIVE | Pattern.DOTALL); //$NON-NLS-1$ Matcher
		 * matcher = pattern.matcher(body); if (matcher.matches()) { body =
		 * matcher.group(1).trim(); }
		 */

		body = body.trim();
		if (body.startsWith("(")) {
			int pos = this.findMatchParenths(body);
			if (pos == body.length() - 1)
				body = body.substring(1, body.length() - 1);
		}

		tokens[1] = body;
		return tokens;
	}

	private int findMatchParenths(String body) {
		int pos = -1;
		int matches = 1;
		for (int i = 1; i < body.length(); i++)
			if (body.charAt(i) == '(')
				matches++;
			else if (body.charAt(i) == ')') {
				matches--;
				if (matches == 0) {
					pos = i;
					break;
				}
			}

		return pos;
	}

	private boolean isCallStatement(String statement) {
		return statement.matches("^[\\s]*[cC][aA][lL][lL][\\s]*.*");
	}

	/*
	 * Return parms from CALL statement as array of string
	 */
	private String[] getCallParms(String definitionString) {

		String[] parms = null;
		definitionString = definitionString.trim();

		if (definitionString.indexOf("(") != -1 && definitionString.endsWith(")")) {

			int openBracePos = definitionString.indexOf("(") + 1;
			String parmsString = definitionString.substring(openBracePos, definitionString.length() - 1);
			StringTokenizer parmTokenizer = new StringTokenizer(parmsString, ",");
			parms = new String[parmTokenizer.countTokens()];
			int counter = 0;

			while (parmTokenizer.hasMoreTokens()) {
				parms[counter] = parmTokenizer.nextToken();
				counter++;
			}
		}

		return parms;

	}

	/**
	 * Remove parms from CALL statement
	 *
	 * Example:
	 *
	 * CALL LIB/PROCEDURE (A, B C) -> CALL LIB/PROCEDURE ()
	 * 
	 * @param definitionString
	 * @return
	 */
	private String removeCallParms(String definitionString) {

		String result = definitionString;

		definitionString = definitionString.trim();

		if (definitionString.indexOf("(") != -1 && definitionString.endsWith(")")) {

			int openBracePos = definitionString.indexOf("(");
			result = definitionString.substring(0, openBracePos + 1) + ")";
		}

		return result;

	}

	public static void main(String[] args) {

		DDLModelBuilder modelBuilder = new DDLModelBuilder();

		String testCreateView = "CREATE VIEW LIBRERIA1/MIAVISTA AS SELECT * FROM MUCONV0F WHERE MUCONT<>' '";

		System.out.println(testCreateView);

		String[] parts = modelBuilder.splitCreteViewStatement(testCreateView);

		for (String part : parts)
			System.out.println(part);

		String testCall = "CALL P_MULT/PROC01 ('A', 1)";
		System.out.println(testCall);

		String[] callParms = modelBuilder.getCallParms(testCall);
		for (String callParm : callParms)
			System.out.println(callParm);

		System.out.println(modelBuilder.removeCallParms(testCall));

	}

}
