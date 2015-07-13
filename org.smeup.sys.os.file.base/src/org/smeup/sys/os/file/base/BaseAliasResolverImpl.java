package org.smeup.sys.os.file.base;

import java.util.List;

import org.eclipse.datatools.modelbase.sql.query.QueryStatement;
import org.eclipse.datatools.modelbase.sql.query.TableInDatabase;
import org.eclipse.datatools.modelbase.sql.query.helper.StatementHelper;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.syntax.QAliasResolver;

public class BaseAliasResolverImpl implements QAliasResolver {

	@Override
	public void resolveQuery(QConnection connection, SQLQueryParseResult query) {
		resolveAlias(connection, query.getQueryStatement());
	}

	private void resolveAlias(QConnection connection, QueryStatement query) {

		// nodeIterator(query);

		@SuppressWarnings("unchecked")
		List<TableInDatabase> tableList = StatementHelper.getTablesForStatement(query);
		for (TableInDatabase tableRef : tableList) {

			if (tableRef.getDatabaseTable().getSchema().getName() == null) {
				Table table = connection.getCatalogMetaData().getTable(connection.getConnectionDescription(), tableRef.getName());
				if (table != null)
					tableRef.setDatabaseTable(table);
			}

			/*
			 * for (Object column : tableRef.getValueExprColumns()) {
			 * System.out.println("  Columns :  " + ((ValueExpressionColumn)
			 * column).getName()); }
			 */
		}

	}

	/*
	 * private void nodeIterator(EObject obj){ analizeObject(obj); for
	 * (Iterator<EObject> iter = obj.eContents().iterator(); iter.hasNext();){
	 * nodeIterator(iter.next()); } }
	 * 
	 * private void analizeObject(EObject obj){ if (obj instanceof
	 * TableInDatabase){
	 * 
	 * TableInDatabase tableInDatabase = (TableInDatabase)obj;
	 * 
	 * @SuppressWarnings("unused") String alias = "";
	 * 
	 * Table resolvedTable =
	 * getAliasForTable(tableInDatabase.getDatabaseTable());
	 * 
	 * tableInDatabase.setDatabaseTable(resolvedTable);
	 * tableInDatabase.setName(resolvedTable.getSchema().getName() +
	 * getSchemaSeparator() + resolvedTable.getName()); } else if (obj
	 * instanceof TableCorrelation){ TableCorrelation tableCorrelation =
	 * (TableCorrelation)obj; tableCorrelation.toString();
	 * tableCorrelation.setName("PPP"); } else if (obj instanceof
	 * ValueExpressionColumn){
	 * 
	 * ValueExpressionColumn column = (ValueExpressionColumn)obj;
	 * 
	 * TableInDatabase tableInDB = column.getTableInDatabase();
	 * 
	 * Table table = null;
	 * 
	 * if (tableInDB != null) { table = tableInDB.getDatabaseTable(); }
	 * 
	 * String name = column.getName();
	 * 
	 * if (name != null && name.length() > 0){ String alias =
	 * getAliasForColumn(table, name); column.setName(alias); } } }
	 */

}
