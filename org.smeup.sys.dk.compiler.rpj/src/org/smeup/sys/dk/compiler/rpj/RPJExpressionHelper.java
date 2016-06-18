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
package org.smeup.sys.dk.compiler.rpj;

import java.util.Arrays;

import org.smeup.sys.il.expr.QFunctionTermExpression;

public class RPJExpressionHelper {

	private static String[] lastContextGetters = { "%CLOSE", "%EQUAL", "%EOF", "%ERROR", "%FOUND", "%OPEN" };

	public static boolean isContextIndicatorGetter(QFunctionTermExpression expression) {
		
		if (Arrays.binarySearch(lastContextGetters, expression.getValue().toUpperCase()) > 0) {
			if (expression.getElements().isEmpty())
				return true;
			else
				return false;
		} else
			return false;
	}

}
