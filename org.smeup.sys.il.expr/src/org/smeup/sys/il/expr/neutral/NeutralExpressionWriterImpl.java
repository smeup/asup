/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial implementation
 */

package org.smeup.sys.il.expr.neutral;

import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionWriter;


public class NeutralExpressionWriterImpl implements QExpressionWriter {

	//TODO
	@Override
	public String writeExpression(QExpression expression) {
		NeutralExpressionStringBuilder expressionStrBuilder = new NeutralExpressionStringBuilder();
		expression.accept(expressionStrBuilder);		
		return expressionStrBuilder.getResult();
	}

}
