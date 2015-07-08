/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.dk.compiler.rpj.writer;

import java.nio.Buffer;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.Block;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.rpj.RPJExpressionStringBuilder;
import org.smeup.sys.il.core.QNamedNode;
import org.smeup.sys.il.core.java.QStrings;
import org.smeup.sys.il.core.term.QTerm;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.def.QMultipleAtomicDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.esam.QDataSetTerm;
import org.smeup.sys.il.esam.QDisplayTerm;
import org.smeup.sys.il.esam.QFileTerm;
import org.smeup.sys.il.esam.QKeyListTerm;
import org.smeup.sys.il.esam.QPrint;
import org.smeup.sys.il.expr.ArithmeticOperator;
import org.smeup.sys.il.expr.AssignmentOperator;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.il.expr.LogicalOperator;
import org.smeup.sys.il.expr.QArithmeticExpression;
import org.smeup.sys.il.expr.QAssignmentExpression;
import org.smeup.sys.il.expr.QAtomicTermExpression;
import org.smeup.sys.il.expr.QBlockExpression;
import org.smeup.sys.il.expr.QBooleanExpression;
import org.smeup.sys.il.expr.QCompoundTermExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QLogicalExpression;
import org.smeup.sys.il.expr.QFunctionTermExpression;
import org.smeup.sys.il.expr.QQualifiedTermExpression;
import org.smeup.sys.il.expr.QRelationalExpression;
import org.smeup.sys.il.expr.QTermExpression;
import org.smeup.sys.il.expr.RelationalOperator;
import org.smeup.sys.il.expr.impl.ExpressionVisitorImpl;
import org.smeup.sys.il.flow.QEntryParameter;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowFactory;
import org.smeup.sys.il.flow.QMethodExec;
import org.smeup.sys.il.flow.QPrototype;

public class JDTExpressionStringBuilder extends ExpressionVisitorImpl {

	@Inject
	private QCompilationUnit compilationUnit;
	@Inject
	private QStrings strings;
	@Inject
	private QExpressionParser expressionParser;

	private StringBuffer buffer = new StringBuffer();
	private Class<?> target;
	private AST ast;

	public void setTarget(Class<?> target) {
		this.target = target;
	}

	public void setAST(AST ast) {
		this.ast = ast;
	}

	public AST getAST() {
		return this.ast;
	}

	public String getResult() {
		return buffer.toString();
	}

	public void clear() {
		buffer = new StringBuffer();
	}

	@Override
	public boolean visit(QAtomicTermExpression expression) {

		Class<?> source = null;

		String value = null;

		switch (expression.getType()) {
		case BOOLEAN:
			value = expression.getValue();
			source = Boolean.class;
			break;
		case DATETIME:
			value = expression.getValue();
			source = Date.class;
			break;
		case INTEGER:
			value = Integer.toString(Integer.parseInt(expression.getValue()));
			source = Integer.class;
			break;
		case FLOATING:
			value = expression.getValue();
			value = value.replaceAll("\\,", "\\.");
			break;
		case HEXADECIMAL:
			value = expression.getValue();

			if (value.startsWith("X'") || value.startsWith("x'")) {
				value = value.substring(2);
				value = value.substring(0, value.length() - 1);
				source = QHexadecimal.class;
				value = "(byte) 0x" + value;
			} else
				throw new IntegratedLanguageExpressionRuntimeException("Invalid hexadecimal: " + expression.getValue());

			break;
		case SPECIAL:
			source = Enum.class;
			if (expression.getValue().equalsIgnoreCase("*OMIT"))
				value = "null";
			else
				value = "qRPJ.qSP." + strings.removeFirstChar(expression.getValue()).toUpperCase();
			break;
		case STRING:

			value = expression.getValue().replaceAll("\\\\", "\\\\\\\\");
			value = value.replaceAll("\\\"", "\\\\\"");
			value = "\"" + value + "\"";

			source = String.class;
			break;
		case INDICATOR:
		case NAME:

			QNamedNode namedNode = null;
			String nodeName = null;
			String indicatorIndex = null;

			String expressionValue = expression.getValue();
			if (expressionValue.toUpperCase().startsWith("*IN")) {
				// if (!(compilationUnit.getDataTerm(expressionValue,
				// true).getParent() instanceof QCompoundDataTerm<?>))
				// nodeName = expressionValue;
				// else {
				int i = expressionValue.indexOf("(");
				if (i > 0)
					throw new IntegratedLanguageExpressionRuntimeException("Unexpected condition: wstt9rewtb043b5t9072349");

				nodeName = expressionValue.substring(0, 3);
				// TODO
				// modifica resa necessaria quando si incontra *IN e non *IN(xx)
				// è giusto fare cosi?
				if (nodeName.length() > 3)
					indicatorIndex = expressionValue.substring(3, 5);
				// }

			} else
				nodeName = expressionValue;

			namedNode = compilationUnit.getNamedNode(nodeName, true);
			if (namedNode == null)
				throw new IntegratedLanguageExpressionRuntimeException("Invalid term: " + expression.getValue());

			value = compilationUnit.getQualifiedName(namedNode);

			if (namedNode instanceof QDataTerm<?>) {

				QDataTerm<?> dataTerm = (QDataTerm<?>) namedNode;

				if (dataTerm.getDataTermType().isMultiple()) {
					if (this.target != null) {
						if (this.target.isAssignableFrom(QArray.class))
							source = dataTerm.getDefinition().getDataClass();
						else if (dataTerm.getDataTermType().isAtomic())
							source = ((QMultipleAtomicDataDef<?>) dataTerm.getDefinition()).getArgument().getDataClass();
					} else
						source = dataTerm.getDefinition().getDataClass();
				} else
					source = dataTerm.getDefinition().getDataClass();

				if (indicatorIndex != null)
					try {
						value = value + ".get(" + Integer.parseInt(indicatorIndex) + ")";
					} catch (NumberFormatException e) {
						value = value + ".get(" + indicatorIndex + ")";
					}

			} else if (indicatorIndex != null) {

				source = QIndicator.class;

				if (indicatorIndex != null)
					try {
						value = value + ".get(" + Integer.parseInt(indicatorIndex) + ")";
					} catch (NumberFormatException e) {
						value = value + ".get(" + indicatorIndex + ")";
					}

			} else if (namedNode instanceof QKeyListTerm) {
				QKeyListTerm keyListTerm = (QKeyListTerm) namedNode;

				if (CompilationContextHelper.containsArray(expressionParser, keyListTerm)) {
					this.buffer.append(buildExpression(keyListTerm));
					return false;
				}
			}

			break;
		}

		writeValue(source, target, value);

		return false;
	}

	@Override
	public boolean visit(QAssignmentExpression expression) {

		expression.getLeftOperand().accept(this);
		buffer.append(toJavaPrimitive(expression.getOperator()));
		expression.getRightOperand().accept(this);

		return false;
	}

	@Override
	public boolean visit(QArithmeticExpression expression) {

		JDTExpressionStringBuilder builder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
		builder.setAST(getAST());
		builder.setAST(getAST());

		// pointer
		if (CompilationContextHelper.isPointer(compilationUnit, expression.getLeftOperand())) {

			// left
			builder.setTarget(null);
			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());

			// operator
			buffer.append("." + toJavaMethod(expression));
			buffer.append("(");

			// right
			builder.clear();
			expression.getRightOperand().accept(builder);
			buffer.append(builder.getResult());

			buffer.append(")");

		}
		// plus, minus, multiple, cat ..
		else if (expression.getRightOperand() != null) {

			Class<?> target = CompilationContextHelper.getJavaClass(compilationUnit, expression.getLeftOperand());
			builder.setTarget(target);
			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());

			buffer.append(toJavaPrimitive(expression.getOperator()));

			target = CompilationContextHelper.getJavaClass(compilationUnit, expression.getRightOperand());
			builder.setTarget(target);
			builder.clear();
			expression.getRightOperand().accept(builder);

			buffer.append(builder.getResult());
		}
		// negate
		else {

			buffer.append(toJavaPrimitive(expression.getOperator()));

			if (!CompilationContextHelper.isPrimitive(compilationUnit, expression.getLeftOperand()))
				builder.setTarget(Integer.class);
			else
				builder.setTarget(null);

			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());

		}

		return false;
	}

	@Override
	public boolean visit(QBooleanExpression expression) {

		if (expression.getOperand() != null) {

			if (expression.getOperand() instanceof QAtomicTermExpression) {

				QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) expression.getOperand();
				// Mirandola
				// if (atomicTermExpression.isSpecial() &&
				// !atomicTermExpression.isFunction())
				if (atomicTermExpression.getValue().equalsIgnoreCase("*ON")) {
					buffer.append("true");
					return false;
				} else if (atomicTermExpression.getValue().equalsIgnoreCase("*OFF")) {
					buffer.append("false");
					return false;
				}
			}

			JDTExpressionStringBuilder builder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
			builder.setTarget(Boolean.class);
			builder.setAST(getAST());

			/*
			 * if(!CompilationContextHelper.isPrimitive(compilationUnit,
			 * expression.getOperand())) builder.setTarget(Boolean.class); else
			 * builder.setTarget(null);
			 */

			expression.getOperand().accept(builder);
			buffer.append(builder.getResult());
		}

		return false;

	}

	@Override
	public boolean visit(QLogicalExpression expression) {

		JDTExpressionStringBuilder builder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
		builder.setAST(getAST());

		// and/or
		if (expression.getRightOperand() != null) {

			// left
			if (!CompilationContextHelper.isPrimitive(compilationUnit, expression.getLeftOperand()))
				builder.setTarget(CompilationContextHelper.getJavaClass(compilationUnit, expression.getLeftOperand()));
			else
				builder.setTarget(null);

			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());

			// operator
			buffer.append(toJavaPrimitive(expression.getOperator()));

			// right
			if (!CompilationContextHelper.isPrimitive(compilationUnit, expression.getRightOperand()))
				builder.setTarget(CompilationContextHelper.getJavaClass(compilationUnit, expression.getRightOperand()));
			else
				builder.setTarget(null);

			builder.clear();
			expression.getRightOperand().accept(builder);
			buffer.append(builder.getResult());

		}
		// negate
		else {

			// operator
			buffer.append(toJavaPrimitive(expression.getOperator()));

			// left
			if (!CompilationContextHelper.isPrimitive(compilationUnit, expression.getLeftOperand()))
				builder.setTarget(CompilationContextHelper.getJavaClass(compilationUnit, expression.getLeftOperand()));
			else
				builder.setTarget(null);

			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());

		}

		return false;
	}

	@Override
	public boolean visit(QRelationalExpression expression) {
		JDTExpressionStringBuilder builder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
		builder.setAST(getAST());

		if (CompilationContextHelper.isPrimitive(compilationUnit, expression.getLeftOperand())) {

			// left
			builder.setTarget(null);
			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());

			// operator
			buffer.append(toJavaPrimitive(expression.getOperator()));

			// right
			if (CompilationContextHelper.isPrimitive(compilationUnit, expression.getRightOperand()))
				builder.setTarget(null);
			else
				builder.setTarget(CompilationContextHelper.getJavaClass(compilationUnit, expression.getRightOperand()));

			builder.clear();
			expression.getRightOperand().accept(builder);
			buffer.append(builder.getResult());

		} else {

			// left
			builder.setTarget(null);
			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());

			// operator
			buffer.append("." + toJavaMethod(expression));
			buffer.append("(");

			// right
			builder.clear();
			expression.getRightOperand().accept(builder);
			buffer.append(builder.getResult());

			buffer.append(")");
		}

		return false;
	}

	@Override
	public boolean visit(QBlockExpression expression) {

		buffer.append("(");
		expression.getExpression().accept(this);
		buffer.append(")");

		return false;
	}

	private String toJavaPrimitive(AssignmentOperator assignOperator) {

		String result = null;

		switch (assignOperator) {
		case ASSIGN:
			result = "=";
			break;
		case DIVIDE_ASSIGN:
			result = "/";
			break;
		case MINUS_ASSIGN:
			result = "-";
			break;
		case PLUS_ASSIGN:
			result = "+";
			break;
		case POWER_ASSIGN:
			result = "^";
			break;
		case TIMES_ASSIGN:
			result = "*";
			break;
		}

		return result;
	}

	private String toJavaPrimitive(ArithmeticOperator operator) {

		String result = null;

		switch (operator) {
		case DIVIDE:
			result = "/";
			break;
		case MINUS:
			result = "-";
			break;
		case MULT:
			result = "*";
			break;
		case SIGN_MINUS:
			result = "-";
			break;
		case SIGN_PLUS:
			result = "+";
			break;
		case PLUS:
			result = "+";
			break;
		case POWER:
			result = "^";
			break;
		case MODULAR:
			break;
		}

		return result;
	}

	private String toJavaPrimitive(LogicalOperator operator) {

		String result = null;

		switch (operator) {
		case AND:
			result = " && ";
			break;
		case NOT:
			result = " !";
			break;
		case OR:
			result = " || ";
			break;
		}

		return result;
	}

	private String toJavaPrimitive(RelationalOperator operator) {

		String result = null;

		switch (operator) {
		case EQUAL:
			result = "==";
			break;
		case GREATER_THAN:
			result = ">";
			break;
		case GREATER_THAN_EQUAL:
			result = ">=";
			break;
		case LESS_THAN:
			result = "<";
			break;
		case LESS_THAN_EQUAL:
			result = "<=";
			break;
		case NOT_EQUAL:
			result = "!=";
			break;
		default:
			break;
		}

		return result;
	}

	private String toJavaMethod(QExpression expression) {

		String result = null;

		switch (expression.getExpressionType()) {
		case ARITHMETIC:
			result = ((QArithmeticExpression) expression).getOperator().getLiteral().toLowerCase();
			break;
		case ASSIGNMENT:
			result = ((QAssignmentExpression) expression).getOperator().getLiteral().toLowerCase();
			break;
		case QUALIFIED:
		case FUNCTION:
			break;
		case LOGICAL:
			result = ((QLogicalExpression) expression).getOperator().getLiteral().toLowerCase();
			break;
		case RELATIONAL:
			result = ((QRelationalExpression) expression).getOperator().getLiteral().toLowerCase();
			break;
		case ATOMIC:
			break;
		case BLOCK:
			break;
		case BOOLEAN:
			break;
		}

		return result;
	}

	private void writeValue(Class<?> source, Class<?> target, String value) {

		if (value == null)
			return;

		if (source == null || target == null) {
			buffer.append(value);
			return;
		}

		if (target.isAssignableFrom(source)) {
			buffer.append(value);
			return;
		}

		if (target.isAssignableFrom(Buffer.class)) {
			buffer.append(value);
			return;
		}

		// TODO remove?
		// Hexadecimal
		if (source.isAssignableFrom(QHexadecimal.class))
			buffer.append(value);
		else if (source.isAssignableFrom(Enum.class) && !this.target.isAssignableFrom(Boolean.class))
			buffer.append(value);
		else if (target.isAssignableFrom(String.class)) {
			buffer.append(value);
			buffer.append(".s()");
		} else if (target.isAssignableFrom(Integer.class)) {
			buffer.append(value);
			buffer.append(".i()");
		} else if (target.isAssignableFrom(Boolean.class)) {
			buffer.append(value);
			buffer.append(".b()");
		} else if (target.isAssignableFrom(Long.class)) {
			buffer.append(value);
			buffer.append(".l()");
		} else if (target.isAssignableFrom(Double.class)) {
			buffer.append(value);
			buffer.append(".d()");
		} else if (target.isAssignableFrom(Date.class)) {
			buffer.append(value);
			buffer.append(".t()");
		} else if (target.isAssignableFrom(Byte.class)) {
			buffer.append(value);
			buffer.append(".i()");
		} else if (target.isAssignableFrom(Object.class)) {
			buffer.append(value);
			buffer.append(".asObject()");
		} else if (target.isAssignableFrom(List.class)) {
			buffer.append(value);
			buffer.append(".asObject()");
		} else if (QDatetime.class.isAssignableFrom(target)) {
			buffer.append("qRPJ.qBox(" + value + ")");
			buffer.append(value);
			buffer.append(".asDatetime()");
		} else if (QData.class.isAssignableFrom(target))
			buffer.append("qRPJ.qBox(" + value + ")");
		else
			throw new IntegratedLanguageExpressionRuntimeException("Invalid unboxing: " + value);
	}

	public String buildExpression(QKeyListTerm keyList) {

		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append("new QBufferedData[] {");

		JDTExpressionStringBuilder fieldBuilder = this.compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
		fieldBuilder.setAST(getAST());

		int i = 0;
		for (String keyField : keyList.getKeyFields()) {

			QExpression fieldExpression = expressionParser.parseExpression(keyField);

			fieldBuilder.clear();
			fieldBuilder.setTarget(null);
			fieldExpression.accept(fieldBuilder);

			if (i > 0)
				stringBuffer.append(", ");

			stringBuffer.append(fieldBuilder.getResult());

			i++;
		}

		stringBuffer.append("}");

		return stringBuffer.toString();
	}

	@Override
	public boolean visit(QQualifiedTermExpression expression) {

		return visit((QCompoundTermExpression) expression);
	}

	@Override
	public boolean visit(QFunctionTermExpression expression) {

		if (expression.getValue().equalsIgnoreCase("*ALL"))
			expression.setValue("%all");

		if(compilationUnit.getMethod(expression.getValue()) != null  && !expression.getElements().isEmpty()) {
			QExpression expressionChild = expression.getElements().get(0);
			if (expressionChild instanceof QTermExpression) {
				QTermExpression termExpression = (QTermExpression) expressionChild;

				QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();

				RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
				termExpression.accept(expressionStringBuilder);
				methodExec.setObject(expressionStringBuilder.getResult());

				methodExec.setMethod(expression.getValue());

				for (QExpression elementExpression : expression.getElements()) {
					if (elementExpression == expressionChild)
						continue;

					// if(!(elementExpression instanceof QTermExpression))
					// throw new
					// IntegratedLanguageExpressionRuntimeException("Invalid term method: "
					// + expression.getValue());

					// QTermExpression elementTermExpression = (QTermExpression)
					// elementExpression;
					expressionStringBuilder = new RPJExpressionStringBuilder();
					elementExpression.accept(expressionStringBuilder);

					methodExec.getParameters().add(expressionStringBuilder.getResult());
				}

				JDTStatementWriter statementWriter = compilationUnit.getContext().make(JDTStatementWriter.class);
				statementWriter.setAST(getAST());
				Block block = getAST().newBlock();
				statementWriter.getBlocks().push(block);

				methodExec.accept(statementWriter);
				if (!block.statements().isEmpty()) {
					String content = block.statements().get(0).toString().trim();
					this.buffer.append(strings.removeLastChar(content));
				}

				statementWriter.getBlocks().pop();
				return false;
			}			
		}
		
		return visit((QCompoundTermExpression) expression);
	}

	private boolean visit(QCompoundTermExpression expression) {

		QNamedNode namedNode = compilationUnit.getNamedNode(expression.getValue(), true);

		if (namedNode == null)
			throw new IntegratedLanguageExpressionRuntimeException("Invalid term: " + expression.getValue());

		// unary

		// dataSet
		if (namedNode instanceof QDataSetTerm) {
			this.buffer.append(compilationUnit.getQualifiedName(namedNode));
			this.buffer.append(".get");
			this.buffer.append("(");
			this.buffer.append(")");
		}
		// display
		else if (namedNode instanceof QDisplayTerm) {
			this.buffer.append(compilationUnit.getQualifiedName(namedNode));
			this.buffer.append(".get");
			this.buffer.append("(");
			this.buffer.append(")");
		}
		// print
		else if (namedNode instanceof QPrint) {
			this.buffer.append(compilationUnit.getQualifiedName(namedNode));
			this.buffer.append(".get");
			this.buffer.append("(");
			this.buffer.append(")");
		}
		// prototype
		else if (namedNode instanceof QPrototype) {

			QPrototype prototype = (QPrototype) namedNode;

			StringBuffer value = new StringBuffer();

			if (namedNode.getName().startsWith("%"))
				System.out.println("Verificare in qRPJ " + namedNode.getName());
			
			value.append(compilationUnit.getQualifiedName(namedNode));

			value.append("(");
			if (prototype.getEntry() != null) {
				Iterator<QEntryParameter<?>> entryParameters = prototype.getEntry().getParameters().iterator();

				// parameters
				JDTExpressionStringBuilder parameterBuilder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
				boolean first = true;
				for (QExpression element : expression.getElements()) {

					if (!entryParameters.hasNext())
						throw new IntegratedLanguageExpressionRuntimeException("Invalid procedure invocation: " + namedNode.getName());

					QEntryParameter<?> entryParameter = entryParameters.next();
					QTerm parameterDelegate = entryParameter.getDelegate();

					parameterBuilder.clear();
					if (parameterDelegate instanceof QDataTerm) {
						QDataTerm<?> dataTerm = (QDataTerm<?>) parameterDelegate;
						if (dataTerm.isConstant()) {
							parameterBuilder.setTarget(dataTerm.getDefinition().getJavaClass());
							parameterBuilder.setAST(getAST());
						} else {
							parameterBuilder.setTarget(dataTerm.getDefinition().getDataClass());
							parameterBuilder.setAST(getAST());
						}
					} else if (parameterDelegate instanceof QFileTerm) {
						parameterBuilder.setTarget(QFileTerm.class);
						parameterBuilder.setAST(getAST());
					}

					element.accept(parameterBuilder);

					if (!first)
						value.append(", ");

					value.append(parameterBuilder.getResult());

					first = false;
				}

				while (entryParameters.hasNext()) {
					entryParameters.next();
					if (!first)
						value.append(", ");
					value.append("null");
					first = false;
				}
			} else {
				if (!expression.getElements().isEmpty())
					throw new IntegratedLanguageExpressionRuntimeException("Invalid parameters number binding  procedure: " + namedNode.getName());
			}

			value.append(")");

			writeValue(prototype.getDefinition().getDataClass(), this.target, value.toString());

		} else if (namedNode instanceof QDataTerm<?>) {
			QDataTerm<?> dataTerm = (QDataTerm<?>) namedNode;

			if (dataTerm.getDataTermType().isUnary()) {

				// atomic
				if (dataTerm.getDataTermType().isAtomic())
					writeValue(dataTerm.getDefinition().getDataClass(), this.target, compilationUnit.getQualifiedName(namedNode));

				// compound
				else {

					// TODO remove
					if (namedNode.getName().toString().equalsIgnoreCase("*IN")) {

						StringBuffer value = new StringBuffer();
						value.append(compilationUnit.getQualifiedName(namedNode));
						value.append(".get");
						value.append("(");

						JDTExpressionStringBuilder indexBuilder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
						indexBuilder.setTarget(null);
						indexBuilder.setAST(getAST());

						for (QExpression element : expression.getElements())
							element.accept(indexBuilder);
						value.append(indexBuilder.getResult());

						value.append(")");

						if (this.target == null)
							writeValue(dataTerm.getDefinition().getDataClass(), null, value.toString());
						else if (this.target != null && Integer.class.isAssignableFrom(this.target))
							writeValue(dataTerm.getDefinition().getDataClass(), this.target, value.toString());
						else if (this.target != null && String.class.isAssignableFrom(this.target))
							writeValue(dataTerm.getDefinition().getDataClass(), this.target, value.toString());
						else if (this.target != null && Boolean.class.isAssignableFrom(this.target))
							writeValue(dataTerm.getDefinition().getDataClass(), this.target, value.toString());
						else
							writeValue(dataTerm.getDefinition().getDataClass(), null, value.toString());

						return false;
					} else {
						this.buffer.append(compilationUnit.getQualifiedName(namedNode));
						return true;
					}

				}

			}
			// multiple
			else {

				StringBuffer value = new StringBuffer();
				value.append(compilationUnit.getQualifiedName(namedNode));
				value.append(".get");
				value.append("(");

				JDTExpressionStringBuilder indexBuilder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
				indexBuilder.setTarget(null);
				indexBuilder.setAST(getAST());
				for (QExpression element : expression.getElements())
					element.accept(indexBuilder);
				value.append(indexBuilder.getResult());

				value.append(")");

				if (this.target == null)
					writeValue(dataTerm.getDefinition().getDataClass(), null, value.toString());
				else if (this.target != null && Integer.class.isAssignableFrom(this.target))
					writeValue(dataTerm.getDefinition().getDataClass(), this.target, value.toString());
				else if (this.target != null && String.class.isAssignableFrom(this.target))
					writeValue(dataTerm.getDefinition().getDataClass(), this.target, value.toString());
				else if (this.target != null && Boolean.class.isAssignableFrom(this.target))
					writeValue(dataTerm.getDefinition().getDataClass(), this.target, value.toString());
				else
					writeValue(dataTerm.getDefinition().getDataClass(), null, value.toString());
			}
		} else
			System.err.println("Unexpected condition: xm4t609543m487mxz");

		return false;
	}

}
