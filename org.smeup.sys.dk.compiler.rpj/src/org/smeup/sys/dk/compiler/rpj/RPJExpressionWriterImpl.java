/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial implementation
 */

package org.smeup.sys.dk.compiler.rpj;

import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionWriter;

public class RPJExpressionWriterImpl implements QExpressionWriter {

	@Override
	public String writeExpression(QExpression expression) {
		
		RPJExpressionStringBuilder expressionStrBuilder = new RPJExpressionStringBuilder();
		expression.accept(expressionStrBuilder);
		return expressionStrBuilder.getResult();		
	}

}
