/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.os.cmd.ibmi;

import org.smeup.sys.il.core.FormatType;
import org.smeup.sys.il.core.QFormat;

public class IBMiFormatHelper {

	private static String COMMAND_STRING_REGEX = "[A-Z][A-Z0-9\\$£@()&./\\s_*]{0,255}";
	private static String COMMUNICATION_STRING_REGEX = "[A-Z\\$£@][A-Z0-9\\$£@]*";
	private static String GENERIC_STRING_REGEX = "[^*]{1,255}$|([^*]{1,254}[*$])";
	private static String NAME_STRING_REGEX = "[A-Z\\$£@*][A-Z0-9\\$£@_.]{0,32768}";
	private static String PATH_NAME_REGEX = "[A-Z0-9]{5000}";
	private static String SIMPLE_NAME_REGEX = "[A-Z\\$£@][A-Z0-9\\$£@_]{0,255}";

	public static boolean match(String value, QFormat format) {

		boolean result = false;

		switch (format.getType().getValue()) {

		case FormatType.COMMAND_STRING_VALUE:

			result = value.matches(COMMAND_STRING_REGEX);

			break;

		case FormatType.COMMUNICATIONS_NAME_VALUE:

			result = value.matches(COMMUNICATION_STRING_REGEX);

			break;

		case FormatType.GENERIC_VALUE:

			result = value.matches(GENERIC_STRING_REGEX);

			break;

		case FormatType.NAME_VALUE:

			result = value.matches(NAME_STRING_REGEX);

			break;

		case FormatType.PATH_NAME_VALUE:

			result = value.matches(PATH_NAME_REGEX);

			break;

		case FormatType.REGULAR_EXPRESSION_VALUE:

			String regex = format.getExpression();

			result = value.matches(regex);

			break;

		case FormatType.SIMPLE_NAME_VALUE:

			result = value.matches(SIMPLE_NAME_REGEX);

			break;

		default:

			result = false;

			break;
		}

		return result;

	}

}
