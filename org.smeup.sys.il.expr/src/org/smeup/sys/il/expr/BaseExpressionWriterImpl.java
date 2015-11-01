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

package org.smeup.sys.il.expr;

import org.smeup.sys.il.expr.neutral.NeutralExpressionStringBuilder;


public class BaseExpressionWriterImpl implements QExpressionWriter {

	//TODO
	@Override
	public String writeExpression(QExpression expression) {
		NeutralExpressionStringBuilder builder = new NeutralExpressionStringBuilder();
		expression.accept(builder);
		return builder.getResult();
	}

}
