package org.smeup.sys.dk.compiler.rpj.writer;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Expression;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.il.expr.QExpression;

public class JDTStatementHelper {
	
	public static Expression buildExpression(AST ast, QCompilationUnit compilationUnit, QExpression expression, Class<?> target) {
		
		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setKind(ASTParser.K_EXPRESSION);

		JDTExpressionStringBuilder builder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
		builder.setTarget(target);
		builder.setAST(ast);
		
		if(target != null && Double.class.isAssignableFrom(target))
			builder.useDouble(true);
		
		expression.accept(builder);
		String value = builder.getResult();

		parser.setSource(value.toCharArray());
		ASTNode node = parser.createAST(null);
		if (node.getLength() == 0)
			throw new IntegratedLanguageExpressionRuntimeException("Invalid java conversion: " + value);

		return (Expression) ASTNode.copySubtree(ast, (Expression) node);
	}
}
