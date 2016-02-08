/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.il.expr.base;

import org.antlr.runtime.tree.Tree;
import org.smeup.sys.il.expr.ArithmeticOperator;
import org.smeup.sys.il.expr.AtomicType;
import org.smeup.sys.il.expr.ExpressionType;
import org.smeup.sys.il.expr.LogicalOperator;
import org.smeup.sys.il.expr.RelationalOperator;

public interface BaseExpressionHelper {

	public ExpressionType getExpressionType(Tree tree);

	public AtomicType getTermType(Tree node);

	public ArithmeticOperator getArithmeticOperator(Tree node);

	public LogicalOperator getLogicalOperator(Tree node);

	public RelationalOperator getRelationalOperator(Tree node);

	public Tree parse(String expression);

	public String normalizeText(String text);

	public String getFunctionName(Tree node);
	
}
