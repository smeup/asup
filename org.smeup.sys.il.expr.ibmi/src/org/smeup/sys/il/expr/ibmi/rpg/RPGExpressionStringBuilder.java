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
package org.smeup.sys.il.expr.ibmi.rpg;

import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QFunctionTermExpression;
import org.smeup.sys.il.expr.impl.BaseExpressionStringBuilder;

public class RPGExpressionStringBuilder extends BaseExpressionStringBuilder {
	//TODO: implement RPG expression specifity
	
	@Override
	public boolean visit(QFunctionTermExpression expression) {
		
		String functionName = expression.getValue();
				
		if (functionName.startsWith("*ALL")) {
			
			result.append("*ALL");
			for (QExpression child : expression.getElements()) {
				child.accept(this);
			}		
			
		} else {
		
			result.append(expression.getValue());
	
			result.append("(");
			boolean first = true;
			for (QExpression child : expression.getElements()) {
				if (!first)
					result.append(": ");
				child.accept(this);
				first = false;
			}
			result.append(")");
		}

		return false;
	}

}