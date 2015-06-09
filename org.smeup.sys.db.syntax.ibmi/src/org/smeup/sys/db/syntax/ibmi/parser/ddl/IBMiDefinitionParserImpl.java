package org.smeup.sys.db.syntax.ibmi.parser.ddl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;

import org.smeup.sys.db.syntax.QDefinitionParseResult;
import org.smeup.sys.db.syntax.QDefinitionParser;

public class IBMiDefinitionParserImpl implements QDefinitionParser {

	private DDLModelBuilder definitionBuilder;

	public IBMiDefinitionParserImpl() {
		definitionBuilder = new DDLModelBuilder();
	}

	@Override
	public QDefinitionParseResult parseDefinition(InputStream definitionStream) throws SQLException {

		return parseDefinition(toString(definitionStream));
	}

	@Override
	public QDefinitionParseResult parseDefinition(String definitionString) throws SQLException {

		QDefinitionParseResult parseResult = definitionBuilder.parseDefinition(definitionString);
		return parseResult;
	}

	public static String toString(InputStream is) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(is));
			StringBuffer message = new StringBuffer();
			while (true) {
				String input = in.readLine();
				if (input == null)
					break;
				message.append(input);
			}
			return message.toString();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "";
		}
	}

}
