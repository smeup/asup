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
package org.smeup.sys.dk.compiler.rpj.writer;

import java.nio.Buffer;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.Block;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.rpj.RPJCompilerMessage;
import org.smeup.sys.il.core.term.QNamedNode;
import org.smeup.sys.il.core.term.QTerm;
import org.smeup.sys.il.data.DataComparator;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.DatetimeFormat;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.QMultipleAtomicDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.esam.QDataSetTerm;
import org.smeup.sys.il.esam.QDisplayTerm;
import org.smeup.sys.il.esam.QFileTerm;
import org.smeup.sys.il.esam.QKeyListTerm;
import org.smeup.sys.il.esam.QPrintTerm;
import org.smeup.sys.il.expr.ArithmeticOperator;
import org.smeup.sys.il.expr.AssignmentOperator;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.il.expr.LogicalOperator;
import org.smeup.sys.il.expr.QArithmeticExpression;
import org.smeup.sys.il.expr.QArrayExpression;
import org.smeup.sys.il.expr.QAssignmentExpression;
import org.smeup.sys.il.expr.QAtomicTermExpression;
import org.smeup.sys.il.expr.QBlockExpression;
import org.smeup.sys.il.expr.QBooleanExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionWriter;
import org.smeup.sys.il.expr.QFunctionTermExpression;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionFactory;
import org.smeup.sys.il.expr.QLogicalExpression;
import org.smeup.sys.il.expr.QQualifiedTermExpression;
import org.smeup.sys.il.expr.QRelationalExpression;
import org.smeup.sys.il.expr.impl.ExpressionVisitorImpl;
import org.smeup.sys.il.flow.QEntryParameter;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowFactory;
import org.smeup.sys.il.flow.QMethodExec;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.mi.core.util.QStrings;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.rt.core.QLogger;

public class JDTExpressionStringBuilder extends ExpressionVisitorImpl {

	@Inject
	private QCompilationUnit compilationUnit;
	@Inject
	private QStrings strings;
	@Inject
	private QExpressionParser expressionParser;
	@Inject
	private QExpressionWriter expressionWriter;
	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QLogger logger;
	@Inject
	private QJob job;

	private AST ast;
	private StringBuffer buffer = new StringBuffer();

	private Class<?> target;
	private boolean useDouble = false;

	public void setTarget(Class<?> target) {
		this.target = target;
	}

	public void useDouble(boolean useDouble) {
		this.useDouble = useDouble;
	}

	public Class<?> getTarget() {
		return this.target;
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
		case DATE:
		case TIME:
		case TIMESTAMP:
			value = expression.getValue();
			source = Date.class;
			break;
		case INTEGER:
			source = Number.class;

			if (useDouble) {
				try {
					value = Double.toString(Double.parseDouble(expression.getValue()));
				} catch (Exception e) {
					try {
						value = Integer.toString(Integer.parseInt(expression.getValue())) + ".0";
					} catch (NumberFormatException e2) {
						value = Long.toString(Long.parseLong(expression.getValue())) + ".0";
					}
				}
			} else {
				try {
					value = Integer.toString(Integer.parseInt(expression.getValue()));
				} catch (NumberFormatException e) {
					value = Long.toString(Long.parseLong(expression.getValue()));
				}
			}
			break;
		case FLOATING:
			value = expression.getValue();
			value = value.replaceAll("\\,", "\\.");
			break;
		case HEXADECIMAL:
			value = expression.getValue();

			if (value.startsWith("X'") || value.startsWith("x'")) {
				// value = value.substring(2);
				// value = value.substring(0, value.length() - 1);

				throw new IntegratedLanguageExpressionRuntimeException("Invalid hexadecimal: " + expression.getValue());
			} else {
				source = Byte.class;
				value = "(byte) 0x" + value;
			}

			break;
		case SPECIAL:
			source = Enum.class;
			DataSpecial dataSpecial = DataSpecial.get(expression.getValue().toUpperCase());
			if (dataSpecial != null) {
				switch (dataSpecial) {
				case NULL:
				case OMIT:
					value = "null";
					break;
				case ON:
				case OFF:
				case BLANK:
				case BLANKS:
				case HIVAL:
				case LOVAL:
				case ZERO:
				case ZEROS:
					value = "Specials." + strings.removeFirstChar(expression.getValue()).toUpperCase();
					break;
				}
			}

			DatetimeFormat datetimeFormat = DatetimeFormat.get(expression.getValue().toUpperCase());
			if (datetimeFormat != null) {
				switch (datetimeFormat) {
				case DAY:
				case DAYS:
				case HOURS:
				case ISO:
				case MILLISECONDS:
				case MINUTES:
				case MONTH:
				case MONTHS:
				case SECONDS:
				case YEAR:
				case YEARS:
					value = "Specials." + strings.removeFirstChar(expression.getValue()).toUpperCase();
					break;
				}
			}

			DataComparator dataComparator = DataComparator.get(expression.getValue().toUpperCase());
			if (dataComparator != null) {
				switch (dataComparator) {
				case EQUAL:
				case GREATER_THAN:
				case GREATER_THAN_EQUAL:
				case LESS_THAN:
				case LESS_THAN_EQUAL:
				case NOT_EQUAL:
					value = "Specials." + strings.removeFirstChar(expression.getValue()).toUpperCase();
					break;
				}
			}
			break;
		case STRING:

			// escaping
			value = expression.getValue().replaceAll("\\\\", "\\\\\\\\");
			value = value.replaceAll("\\\"", "\\\\\"");

			// TODO
			// value = strings.escape(expression.getValue());
			value = "\"" + value + "\"";

			source = String.class;
			break;
		case INDICATOR:
		case NAME:

			QNamedNode namedNode = null;
			namedNode = compilationUnit.getNamedNode(expression.getValue(), true);
			if (namedNode == null) {
				compilationUnit.getNamedNode(expression.getValue(), true);
				throw new IntegratedLanguageExpressionRuntimeException("Invalid term: " + expression.getValue());
			}

			value = compilationUnit.getQualifiedName(namedNode);

			QDataTerm<?> dataTerm = JDTContextHelper.getDataTerm(namedNode);

			if (dataTerm != null) {

				if (dataTerm instanceof QPrototype)
					value = value + "()";

				if (dataTerm.getDataTermType().isMultiple()) {
					if (this.target != null) {
						if (QList.class.isAssignableFrom(this.target))
							source = dataTerm.getDefinition().getDataClass();
						else if (dataTerm.getDataTermType().isAtomic())
							source = ((QMultipleAtomicDataDef<?>) dataTerm.getDefinition()).getArgument().getDataClass();
					} else
						source = dataTerm.getDefinition().getDataClass();
				} else {
					if (dataTerm.isConstant() && !dataTerm.getDataTermType().isMultiple())
						source = dataTerm.getDefinition().getJavaClass();
					else
						source = dataTerm.getDefinition().getDataClass();
				}

			} else if (namedNode instanceof QKeyListTerm) {
				QKeyListTerm keyListTerm = (QKeyListTerm) namedNode;

				if (JDTContextHelper.containsArray(expressionParser, keyListTerm)) {
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

		StringBuffer value = new StringBuffer();

		JDTExpressionStringBuilder builder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
		builder.setAST(getAST());

		// pointer
		if (JDTContextHelper.isPointer(compilationUnit, expression.getLeftOperand())) {
			// left
			builder.setTarget(null);
			builder.clear();
			expression.getLeftOperand().accept(builder);
			value.append(builder.getResult());

			// operator
			value.append(".q" + strings.firstToUpper(toJavaMethod(expression)));
			value.append("(");

			// right
			builder.clear();
			expression.getRightOperand().accept(builder);
			value.append(builder.getResult());

			value.append(")");

			builder.setTarget(QPointer.class);
		}
		// plus, minus, multiple, divide ..
		else if (expression.getRightOperand() != null) {

			Class<?> target = null;

			if (expression.getOperator() == ArithmeticOperator.POWER)
				target = Integer.class;
			else
				target = JDTContextHelper.getTargetClass(compilationUnit, expression.getLeftOperand(), true);
			if (Boolean.class.isAssignableFrom(target))
				target = String.class;
			builder.setTarget(target);
			builder.clear();
			expression.getLeftOperand().accept(builder);
			value.append(builder.getResult());

			if (QPointer.class.isAssignableFrom(target))
				value.append("." + toJavaMethod(expression));
			else
				value.append(toJavaPrimitive(expression.getOperator()));

			builder.clear();
			if (expression.getOperator() == ArithmeticOperator.DIVIDE && Number.class.isAssignableFrom(target))
				builder.useDouble(true);
			else
				builder.useDouble(false);

			expression.getRightOperand().accept(builder);

			value.append(builder.getResult());
		}
		// negate
		else {

			value.append(toJavaPrimitive(expression.getOperator()));

			if (!JDTContextHelper.isPrimitive(compilationUnit, expression.getLeftOperand()))
				builder.setTarget(Number.class);
			else
				builder.setTarget(null);

			builder.clear();
			expression.getLeftOperand().accept(builder);
			value.append(builder.getResult());

		}

		if (target != null) {
			if (Number.class.isAssignableFrom(target))
				writeValue(Number.class, target, value.toString());

			// TODO remove me
			else if (Buffer.class.isAssignableFrom(target))
				writeValue(Buffer.class, target, value.toString());
			else if (String.class.isAssignableFrom(target))
				writeValue(String.class, target, value.toString());

			else if (QNumeric.class.isAssignableFrom(target))
				writeValue(Number.class, target, value.toString());
			else if (QString.class.isAssignableFrom(target))
				writeValue(String.class, target, value.toString());
			else if (QPointer.class.isAssignableFrom(target))
				writeValue(QPointer.class, target, value.toString());
			else
				writeValue(String.class, target, value.toString());
		} else {
			buffer.append(value);
		}

		return false;
	}

	@Override
	public boolean visit(QBooleanExpression expression) {

		if (expression.getOperand() != null) {

			if (expression.getOperand() instanceof QAtomicTermExpression) {

				QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) expression.getOperand();
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
			if (!JDTContextHelper.isPrimitive(compilationUnit, expression.getLeftOperand()))
				builder.setTarget(Boolean.class);
			// builder.setTarget(JDTContextHelper.getTargetClass(compilationUnit,
			// expression.getLeftOperand(), true));
			else
				builder.setTarget(Boolean.class);
			// builder.setTarget(JDTContextHelper.getTargetClass(compilationUnit,
			// expression.getLeftOperand(), true));
			// builder.setTarget(null);

			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());

			// operator
			buffer.append(toJavaPrimitive(expression.getOperator()));

			// right
			if (!JDTContextHelper.isPrimitive(compilationUnit, expression.getRightOperand()))
				builder.setTarget(Boolean.class);
			else
				builder.setTarget(Boolean.class);

			builder.clear();
			expression.getRightOperand().accept(builder);
			buffer.append(builder.getResult());

		}
		// negate
		else {

			// operator
			buffer.append(toJavaPrimitive(expression.getOperator()));

			// left
			if (!JDTContextHelper.isPrimitive(compilationUnit, expression.getLeftOperand()))
				builder.setTarget(Boolean.class);
			else
				builder.setTarget(JDTContextHelper.getTargetClass(compilationUnit, expression.getLeftOperand(), true));

			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());

		}

		return false;
	}

	@Override
	public boolean visit(QRelationalExpression expression) {

		// normalize arithmetic left
		if (expression.getLeftOperand() instanceof QArithmeticExpression) {
			QBlockExpression blockExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createBlockExpression();
			blockExpression.setExpression(expression.getLeftOperand());
			expression.setLeftOperand(blockExpression);
		}

		// normalize arithmetic right
		if (expression.getRightOperand() instanceof QArithmeticExpression) {
			QBlockExpression blockExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createBlockExpression();
			blockExpression.setExpression(expression.getRightOperand());
			expression.setRightOperand(blockExpression);
		}

		JDTExpressionStringBuilder leftBuilder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
		leftBuilder.setAST(getAST());

		JDTExpressionStringBuilder rightBuilder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
		rightBuilder.setAST(getAST());

		if (JDTContextHelper.isPrimitive(compilationUnit, expression.getLeftOperand())) {

			leftBuilder.clear();
			if (JDTContextHelper.isSpecial(compilationUnit, expression.getRightOperand()))
				leftBuilder.setTarget(QData.class);
			else
				leftBuilder.setTarget(QData.class);

			expression.getLeftOperand().accept(leftBuilder);
			buffer.append(leftBuilder.getResult());

			// operator
			if (leftBuilder.getTarget() != null)
				buffer.append("." + toJavaMethod(expression));
			else
				buffer.append(".compareTo");
			buffer.append("(");

			// right
			rightBuilder.clear();
			if (JDTContextHelper.isPrimitive(compilationUnit, expression.getRightOperand()))
				rightBuilder.setTarget(null);
			else
				rightBuilder.setTarget(JDTContextHelper.getTargetClass(compilationUnit, expression.getRightOperand(), true));

			expression.getRightOperand().accept(rightBuilder);
			buffer.append(rightBuilder.getResult());

			buffer.append(")");

			if (leftBuilder.getTarget() == null) {
				switch (expression.getOperator()) {
				case EQUAL:
					buffer.append(" == 0");
					break;
				case GREATER_THAN:
					buffer.append(" > 0");
					break;
				case GREATER_THAN_EQUAL:
					buffer.append(" >= 0");
					break;
				case LESS_THAN:
					buffer.append(" < 0");
					break;
				case LESS_THAN_EQUAL:
					buffer.append(" <= 0");
					break;
				case NOT_EQUAL:
					buffer.append(" != 0");
					break;
				}
			}

		} else {

			// left
			leftBuilder.clear();
			leftBuilder.setTarget(null);

			expression.getLeftOperand().accept(leftBuilder);
			buffer.append(leftBuilder.getResult());

			// operator
			buffer.append("." + toJavaMethod(expression));
			buffer.append("(");

			// right
			rightBuilder.clear();
			expression.getRightOperand().accept(rightBuilder);
			buffer.append(rightBuilder.getResult());

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
			result = "%";
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
		case ARRAY:
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

		// if (target.equals(Byte.class) &&
		// Number.class.isAssignableFrom(source)) {
		// buffer.append(value);
		// return;
		// }

		if (target.isAssignableFrom(source)) {
			buffer.append(value);
			return;
		}

		if (Number.class.isAssignableFrom(source) && source.isAssignableFrom(target)) {
			buffer.append(value);
			return;
		}

		if (Buffer.class.isAssignableFrom(target)) {
			buffer.append(value);
			return;
		}

		// TODO remove?
		// Hexadecimal
		if (QHexadecimal.class.isAssignableFrom(source))
			buffer.append(value);
		// TODO
		else if (Enum.class.isAssignableFrom(source)) {

			if (QIndicator.class.isAssignableFrom(this.target)) {
				if (value.equalsIgnoreCase("Specials.ON"))
					buffer.append("qRPJ.qBox(true)");
				else
					buffer.append("qRPJ.qBox(false)");
			} else if (String.class.isAssignableFrom(this.target)) {
				if (value.equalsIgnoreCase("Specials.ON"))
					buffer.append("\"1\"");
				else if (value.equalsIgnoreCase("Specials.OFF"))
					buffer.append("\"0\"");
				else if (value.equalsIgnoreCase("Specials.BLANK"))
					buffer.append("\"\"");
				else if (value.equalsIgnoreCase("Specials.BLANKS"))
					buffer.append("\"\"");
				else if (value.equalsIgnoreCase("Specials.ZERO"))
					buffer.append("0");
				else if (value.equalsIgnoreCase("Specials.ZEROS"))
					buffer.append("0");
				else
					buffer.append(value);
			} else
				buffer.append(value);

		}
		// cast
		else if (QIndicator.class.isAssignableFrom(target) && QCharacter.class.isAssignableFrom(source))
			buffer.append("qRPJ.qCast(" + value + ")");

		// boxing
		else if (QData.class.isAssignableFrom(target)) {

			// pointer
			if (QPointer.class.isAssignableFrom(target))
				buffer.append("qRPJ.qPointer(" + value + ")");

			// string
			else if (QString.class.isAssignableFrom(target))
				buffer.append("qRPJ.qBox(" + value + ")");
			else if (target.equals(QData.class) && source.equals(String.class))
				buffer.append("qRPJ.qBox(" + value + ")");

			// buffered
			else if (target.equals(QBufferedElement.class) && source.equals(String.class))
				buffer.append("qRPJ.qBox(" + value + ")");
			else if (target.equals(QData.class) && Number.class.isAssignableFrom(source))
				buffer.append("qRPJ.qBox(" + value + ")");

			// binary
			else if (QBinary.class.isAssignableFrom(target) && Number.class.isAssignableFrom(source))
				buffer.append("qRPJ.qBoxBinary(" + value + ")");

			// numeric
			else if (QNumeric.class.isAssignableFrom(target) && Number.class.isAssignableFrom(source))
				buffer.append("qRPJ.qBox(" + value + ")");

			// indicator
			else if (QIndicator.class.isAssignableFrom(target))
				buffer.append("qRPJ.qBox(" + value + ")");

			// hexadecimal
			else if (target.equals(QHexadecimal.class) && source.equals(Byte.class))
				buffer.append("qRPJ.qBox(" + value + ")");
			else if (target.equals(QHexadecimal.class) && source.equals(String.class))
				buffer.append("qRPJ.qBox(" + value + ")");
			// array
			else if (QArray.class.isAssignableFrom(target))
				buffer.append("qRPJ.qBoxArray(" + value + ")");

			// datetime
			else if (QDatetime.class.isAssignableFrom(target)) {
				buffer.append("qRPJ.qBox(" + value + ")");
				buffer.append(value);
				buffer.append(".asDatetime()");
			}
			
		}
		// unboxing
		else {

			if (source != null && !QData.class.isAssignableFrom(source)) {
				// JVM casting
				if (Number.class.isAssignableFrom(source) && Number.class.isAssignableFrom(target)) {
					buffer.append(value);
					return;
				} else {
					buffer.append("qRPJ.qBox" + getTarget().getSimpleName() + "(");
					buffer.append(value);
					buffer.append(")");
				}
			} else
				buffer.append(value);

			// string
			if (String.class.isAssignableFrom(target)) {
				buffer.append(".s()");
				// number
			} else if (Number.class.isAssignableFrom(target)) {
				if (target.equals(Byte.class)) {
					buffer.append(".i()");
				} else if (target.equals(Short.class)) {
					buffer.append(".i()");
				} else if (target.equals(Integer.class)) {
					buffer.append(".i()");
				} else if (target.equals(Long.class)) {
					buffer.append(".l()");
				} else if (target.equals(Double.class)) {
					buffer.append(".d()");
				} else {
					buffer.append(".i()");
				}
			}
			// boolean
			else if (Boolean.class.isAssignableFrom(target)) {
				buffer.append(".b()");
			}
			// date
			else if (Date.class.isAssignableFrom(target)) {
				buffer.append(".t()");
			}
			// list
			else if (List.class.isAssignableFrom(target)) {
				buffer.append(".asList()");
			} else
				throw new IntegratedLanguageExpressionRuntimeException("Invalid unboxing type: " + target.getSimpleName());
		}
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

		QDataTerm<?> dataTerm = compilationUnit.getDataTerm(expression.getValue(), true);
		if (dataTerm == null)
			throw new IntegratedLanguageExpressionRuntimeException("Invalid term: " + expression.getValue());

		// atomic
		if (dataTerm.getDataTermType().isAtomic()) {

			StringBuffer value = new StringBuffer();
			value.append(compilationUnit.getQualifiedName(dataTerm));

			if (expression.getElements().get(1) instanceof QFunctionTermExpression) {

				QFunctionTermExpression functionTermExpression = (QFunctionTermExpression) expression.getElements().get(1);
				if (functionTermExpression.getElements().size() > 1)
					throw new IntegratedLanguageExpressionRuntimeException("Unexpected condition ptc98av38etaeyt");

				value.append(".get");
				value.append("(");

				JDTExpressionStringBuilder indexBuilder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
				indexBuilder.setAST(getAST());
				functionTermExpression.getElements().get(0).accept(indexBuilder);
				value.append(indexBuilder.getResult());

				value.append(")");

				Class<?> source = null;
				if (dataTerm.getDataTermType().isMultiple()) {
					if (this.target != null) {
						if (QList.class.isAssignableFrom(this.target))
							source = dataTerm.getDefinition().getDataClass();
						else if (dataTerm.getDataTermType().isAtomic())
							source = ((QMultipleAtomicDataDef<?>) dataTerm.getDefinition()).getArgument().getDataClass();
					} else
						source = dataTerm.getDefinition().getDataClass();
				} else {
					if (dataTerm.isConstant() && !dataTerm.getDataTermType().isMultiple())
						source = dataTerm.getDefinition().getJavaClass();
					else
						source = dataTerm.getDefinition().getDataClass();
				}
				writeValue(source, this.target, value.toString());
			} else
				writeValue(dataTerm.getDefinition().getDataClass(), this.target, value.toString());
		}
		// compound
		else {
			this.buffer.append(compilationUnit.getQualifiedName(dataTerm));
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QFunctionTermExpression expression) {

		// prototype
		QPrototype prototype = compilationUnit.getPrototype(expression.getValue(), true);
		if (prototype != null) {
			writePrototype(prototype, expression.getElements());
			return false;
		}

		// search object method
		if (!expression.getElements().isEmpty()) {
			QExpression expressionChild = expression.getElements().get(0);

			Class<? extends QData> objectTarget = null;
			if (!JDTContextHelper.isPrimitive(compilationUnit, expressionChild))
				objectTarget = (Class<? extends QData>) JDTContextHelper.getTargetClass(compilationUnit, expressionChild, false);
			else
				objectTarget = JDTContextHelper.getDataClass((Class<? extends QData>) JDTContextHelper.getTargetClass(compilationUnit, expressionChild, true));

			prototype = compilationUnit.getMethod(objectTarget, expression.getValue());
			if (prototype != null)
				return writeMethod(prototype, expression.getElements());
		}

		// search dataTerm
		QDataTerm<?> dataTerm = compilationUnit.getDataTerm(expression.getValue(), true);
		if (dataTerm != null) {
			writeDataTerm(dataTerm, expression.getElements());
			return false;
		}
		QNamedNode namedNode = compilationUnit.getNamedNode(expression.getValue(), true);
		if (namedNode != null) {
			writeNamedNode(namedNode);
			return false;
		}

		throw new IntegratedLanguageDataRuntimeException("Invalid expression "+expression);
	}

	private void writeDataTerm(QDataTerm<?> dataTerm, List<QExpression> elements) {
		// atomic
		if (dataTerm.getDataTermType().isAtomic()) {
			StringBuffer value = new StringBuffer();
			value.append(compilationUnit.getQualifiedName(dataTerm));
			if (dataTerm.getDataTermType().isMultiple()) {

				value.append(".get");
				value.append("(");

				JDTExpressionStringBuilder indexBuilder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
				indexBuilder.setAST(getAST());
				for (QExpression element : elements)
					element.accept(indexBuilder);
				value.append(indexBuilder.getResult());
				value.append(")");
			}

			Class<?> source = null;
			if (dataTerm.getDataTermType().isMultiple()) {
				if (this.target != null) {
					if (QList.class.isAssignableFrom(this.target))
						source = dataTerm.getDefinition().getDataClass();
					else if (dataTerm.getDataTermType().isAtomic())
						source = ((QMultipleAtomicDataDef<?>) dataTerm.getDefinition()).getArgument().getDataClass();
				} else
					source = dataTerm.getDefinition().getDataClass();
			} else {
				if (dataTerm.isConstant() && !dataTerm.getDataTermType().isMultiple())
					source = dataTerm.getDefinition().getJavaClass();
				else
					source = dataTerm.getDefinition().getDataClass();
			}
			writeValue(source, this.target, value.toString());
		}
		// compound
		else {
			this.buffer.append(compilationUnit.getQualifiedName(dataTerm));
		}
	}

	private boolean writeMethod(QPrototype prototype, List<QExpression> elements) {

		QExpression expressionObject = elements.get(0);
		switch (expressionObject.getExpressionType()) {
		case ARRAY:
		case ATOMIC:
		case FUNCTION:
		case QUALIFIED:
		case ARITHMETIC:
		case BLOCK:
		case BOOLEAN:

			QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
			methodExec.setObject(expressionWriter.writeExpression(expressionObject));
			methodExec.setMethod(prototype.getName());
			for (QExpression elementExpression : elements) {
				if (elementExpression == expressionObject)
					continue;
				methodExec.getParameters().add(expressionWriter.writeExpression(elementExpression));
			}

			JDTStatementWriter statementWriter = compilationUnit.getContext().make(JDTStatementWriter.class);
			statementWriter.setAST(getAST());
			Block block = getAST().newBlock();
			statementWriter.getBlocks().push(block);

			methodExec.accept(statementWriter);
			if (!block.statements().isEmpty()) {
				String content = block.statements().get(0).toString().trim();
				writeValue(prototype.getDefinition().getDataClass(), this.target, strings.removeLastChar(content));
			}

			statementWriter.getBlocks().pop();
			return false;
		case ASSIGNMENT:
		case LOGICAL:
		case RELATIONAL:
			break;
		}

		return true;
	}

	private void writePrototype(QPrototype prototype, List<QExpression> parameters) {
		StringBuffer value = new StringBuffer();

		value.append(compilationUnit.getQualifiedName(prototype));

		value.append("(");
		if (prototype.getEntry() != null) {
			Iterator<QEntryParameter<?>> entryParameters = prototype.getEntry().getParameters().iterator();

			// parameters
			JDTExpressionStringBuilder parameterBuilder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
			parameterBuilder.setAST(getAST());
			boolean first = true;
			for (QExpression element : parameters) {

				if (!entryParameters.hasNext())
					throw new IntegratedLanguageExpressionRuntimeException("Invalid procedure invocation: " + prototype.getName());

				QEntryParameter<?> entryParameter = entryParameters.next();
				QTerm parameterDelegate = entryParameter.getDelegate();

				parameterBuilder.clear();
				if (parameterDelegate instanceof QDataTerm) {
					QDataTerm<?> dataTerm = (QDataTerm<?>) parameterDelegate;
					if (dataTerm.isConstant() && !dataTerm.getDataTermType().isMultiple()) {
						parameterBuilder.setTarget(dataTerm.getDefinition().getJavaClass());
					} else {
						parameterBuilder.setTarget(dataTerm.getDefinition().getDataClass());
					}
				} else if (parameterDelegate instanceof QFileTerm) {
					parameterBuilder.setTarget(QFileTerm.class);
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
					value.append(", null");

				first = false;
			}
		} else {
			if (!parameters.isEmpty())
				throw new IntegratedLanguageExpressionRuntimeException("Invalid parameters number binding  procedure: " + prototype.getName());
		}

		value.append(")");

		// TODO filler
		if (prototype.getName().equalsIgnoreCase("%ALL")) {
			writeValue(null, this.target, value.toString());
		} else {
			if (prototype.isConstant())
				writeValue(prototype.getDefinition().getJavaClass(), this.target, value.toString());
			else
				writeValue(prototype.getDefinition().getDataClass(), this.target, value.toString());
		}
	}

	@Override
	public boolean visit(QArrayExpression expression) {

		if (expression.getExpression().isEmpty()) {
			buffer.append("new QBufferedData[] {}");
		} else if (expression.getExpression().size() == 1) {
			expression.getExpression().get(0).accept(this);
		} else {
			buffer.append("new QBufferedData[] { ");

			boolean first = true;
			for (QExpression expressionChild : expression.getExpression()) {
				if (!first)
					buffer.append(", ");
				expressionChild.accept(this);
				first = false;
			}
			buffer.append(" }");
		}

		return false;
	}

	private void writeNamedNode(QNamedNode namedNode) {

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
		else if (namedNode instanceof QPrintTerm) {
			this.buffer.append(compilationUnit.getQualifiedName(namedNode));
			this.buffer.append(".get");
			this.buffer.append("(");
			this.buffer.append(")");
		}
		// dataTerm
		else if (namedNode instanceof QDataTerm<?>) {
			QDataTerm<?> dataTerm = (QDataTerm<?>) namedNode;
			// atomic
			if (dataTerm.getDataTermType().isAtomic())
				writeValue(dataTerm.getDefinition().getDataClass(), this.target, compilationUnit.getQualifiedName(namedNode));
			// compound
			else {
				this.buffer.append(compilationUnit.getQualifiedName(namedNode));
			}
		} else
			logger.warning(exceptionManager.prepareException(job, RPJCompilerMessage.AS00106, namedNode));
	}
}
