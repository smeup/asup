/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Giuliano Giancristofaro - Initial API and implementation
 *   Mattia Rocchi			 - Implementation
 */
package org.smeup.sys.dk.compiler.rpj.writer;

import java.util.Date;
import java.util.List;

import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.il.core.term.QNamedNode;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.QArrayDef;
import org.smeup.sys.il.data.def.QPointerDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.esam.QKeyListTerm;
import org.smeup.sys.il.expr.QArithmeticExpression;
import org.smeup.sys.il.expr.QAtomicTermExpression;
import org.smeup.sys.il.expr.QBlockExpression;
import org.smeup.sys.il.expr.QBooleanExpression;
import org.smeup.sys.il.expr.QCompoundTermExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QFunctionTermExpression;
import org.smeup.sys.il.flow.QEntryParameter;
import org.smeup.sys.il.flow.QPrototype;

public class CompilationContextHelper {

	public static boolean isPrimitive(QCompilationUnit compilationUnit, QExpression expression) {

		switch (expression.getExpressionType()) {
		case ARRAY:
			return true;		
		case ARITHMETIC:
			return true;
		case ASSIGNMENT:
			break;
		case ATOMIC:
			QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) expression;

			switch (atomicTermExpression.getType()) {
			case BOOLEAN:
			case DATE:
			case TIME:
			case TIMESTAMP:	
			case FLOATING:
			case HEXADECIMAL:
			case INTEGER:
			case STRING:
				return true;
			case SPECIAL:
				return false;
			case INDICATOR:
			case NAME:

				QNamedNode namedNode = compilationUnit.getNamedNode(atomicTermExpression.getValue(), true);
				QDataTerm<?> dataTerm = getDataTerm(namedNode);
				if (dataTerm == null || dataTerm.isConstant())
					return true;

				break;
			}
			break;
		case BLOCK:
			QBlockExpression blockExpression = (QBlockExpression) expression;

			return isPrimitive(compilationUnit, blockExpression.getExpression());
		case FUNCTION:
		case QUALIFIED:
			QCompoundTermExpression compoundTermExpression = (QCompoundTermExpression) expression;

			QNamedNode namedNode = compilationUnit.getNamedNode(compoundTermExpression.getValue(), true);
			QDataTerm<?> dataTerm = getDataTerm(namedNode);
			if (dataTerm == null)
				return true;

			break;
		case LOGICAL:
			return true;
		case RELATIONAL:
			return true;
		case BOOLEAN:
			QBooleanExpression booleanExpression = (QBooleanExpression) expression;

			return isPrimitive(compilationUnit, booleanExpression.getOperand());
		}

		return false;
	}

	public static boolean isSpecial(QCompilationUnit compilationUnit, QExpression expression) {

		switch (expression.getExpressionType()) {
		case ARRAY:		
		case ARITHMETIC:
		case ASSIGNMENT:
		case FUNCTION:
		case QUALIFIED:
		case LOGICAL:
		case RELATIONAL:
		case BOOLEAN:
			return false;
		case ATOMIC:
			QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) expression;

			switch (atomicTermExpression.getType()) {
			case BOOLEAN:
			case DATE:
			case TIME:
			case TIMESTAMP:	
			case FLOATING:
			case HEXADECIMAL:
			case INTEGER:
			case STRING:
			case INDICATOR:
			case NAME:
				return false;
			case SPECIAL:
				return true;
			}
			break;
		case BLOCK:
			QBlockExpression blockExpression = (QBlockExpression) expression;
			return isSpecial(compilationUnit, blockExpression.getExpression());
		}

		return false;
	}

	public static boolean isPointer(QCompilationUnit compilationUnit, QExpression expression) {

		switch (expression.getExpressionType()) {
		case ATOMIC:
			QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) expression;

			switch (atomicTermExpression.getType()) {
			case BOOLEAN:
			case DATE:
			case TIME:
			case TIMESTAMP:	
			case FLOATING:
			case HEXADECIMAL:
			case INTEGER:
			case SPECIAL:
			case STRING:
				return false;
			case INDICATOR:
			case NAME:

				QNamedNode namedNode = compilationUnit.getNamedNode(atomicTermExpression.getValue(), true);
				QDataTerm<?> dataTerm = getDataTerm(namedNode);
				if (dataTerm == null)
					return false;

				return dataTerm.getDefinition() instanceof QPointerDef;
			}
		case FUNCTION:
		case QUALIFIED:
			QCompoundTermExpression compoundTermExpression = (QCompoundTermExpression) expression;

			QNamedNode namedNode = compilationUnit.getNamedNode(compoundTermExpression.getValue(), true);
			QDataTerm<?> dataTerm = getDataTerm(namedNode);
			if (dataTerm == null)
				return false;

			return dataTerm.getDefinition() instanceof QPointerDef;
		default:
			return false;
		}
	}

	public static Class<?> getTargetClass(QCompilationUnit compilationUnit, QExpression expression, boolean primitive) {

		switch (expression.getExpressionType()) {
		case ARRAY:
			return List.class;		
		case ARITHMETIC:
			return getTargetClass(compilationUnit, ((QArithmeticExpression)expression).getLeftOperand(), primitive);
		case ASSIGNMENT:
			break;
		case ATOMIC:
			QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) expression;

			switch (atomicTermExpression.getType()) {
			case BOOLEAN:
				return Boolean.class;
			case DATE:
			case TIME:
			case TIMESTAMP:	
				return Date.class;			
			case FLOATING:
				return Float.class;
			case HEXADECIMAL:
				return Byte.class;
			case INTEGER:
				return Integer.class;
			case SPECIAL:
				return Enum.class;
			case STRING:
				return String.class;
			case INDICATOR:
				return QIndicator.class;
			case NAME:

				QNamedNode namedNode = compilationUnit.getNamedNode(atomicTermExpression.getValue(), true);
				QDataTerm<?> dataTerm = getDataTerm(namedNode);
				if (dataTerm != null)
					
					switch (dataTerm.getDataTermType()) {
					case MULTIPLE_ATOMIC:
/*						QMultipleAtomicDataDef<?> multipleAtomicDataDef = (QMultipleAtomicDataDef<?>) dataTerm.getDefinition();
						if(primitive)
							return multipleAtomicDataDef.getArgument().getJavaClass();
						else
							return multipleAtomicDataDef.getArgument().getDataClass();*/
					case MULTIPLE_COMPOUND:
/*						if(primitive)
							return String.class;
						else
							return QDataStruct.class;*/
					case UNARY_ATOMIC:
					case UNARY_COMPOUND:
						if(primitive)
							return dataTerm.getDefinition().getJavaClass();
						else 
							return dataTerm.getDefinition().getDataClass();
					}
				break;
			}
			break;
		case BLOCK:
			QBlockExpression blockExpression = (QBlockExpression) expression;

			return getTargetClass(compilationUnit, blockExpression.getExpression(), primitive);
		case FUNCTION:
			QFunctionTermExpression functionExpression = (QFunctionTermExpression)expression;
			
			if (!functionExpression.getElements().isEmpty()) {
				
				// check array
				QDataTerm<?> dataTerm = compilationUnit.getDataTerm(functionExpression.getValue(), true);
				if(dataTerm != null && dataTerm.getDefinition() instanceof QArrayDef<?>) {
					QArrayDef<?> arrayDef = (QArrayDef<?>) dataTerm.getDefinition();
					return arrayDef.getArgument().getDataClass();
				}
				else {
					QExpression expressionChild = functionExpression.getElements().get(0);
					Class<?> target = CompilationContextHelper.getTargetClass(compilationUnit, expressionChild, false);
					
					QPrototype method = compilationUnit.getMethod(target, functionExpression.getValue());
					if(method != null) {
							if(primitive)
								return getDataTerm(method).getDefinition().getJavaClass();
							else 
								return getDataTerm(method).getDefinition().getDataClass();
						
					}
				}
			}
		case QUALIFIED:
			QCompoundTermExpression compoundTermExpression = (QCompoundTermExpression) expression;

			QNamedNode namedNode = compilationUnit.getNamedNode(compoundTermExpression.getValue(), true);
			QDataTerm<?> dataTerm = getDataTerm(namedNode);
			if (dataTerm != null)
				if(primitive)
					return dataTerm.getDefinition().getJavaClass();
				else 
					return dataTerm.getDefinition().getDataClass();
/*				if (dataTerm.getDataTermType().isMultiple() && dataTerm.getDataTermType().isAtomic()) {
					QMultipleAtomicDataDef<?> multipleAtomicDataDef = (QMultipleAtomicDataDef<?>) dataTerm.getDefinition();
					if(primitive)
						return multipleAtomicDataDef.getArgument().getJavaClass();
					else
						return multipleAtomicDataDef.getArgument().getDataClass();
				} else {
					// TODO define *IN as array not dataStruct
					if (compoundTermExpression.getValue().startsWith("*IN")) {
						return QIndicator.class;
					} else {
						if(primitive)
							return dataTerm.getDefinition().getJavaClass();
						else
							return dataTerm.getDefinition().getDataClass();
					}
				}*/

			break;
		case LOGICAL:
			return Boolean.class;
		case RELATIONAL:
			return Boolean.class;
		case BOOLEAN:
			QBooleanExpression booleanExpression = (QBooleanExpression) expression;

			return getTargetClass(compilationUnit, booleanExpression.getOperand(), primitive);
		}

		return null;
	}

	public static QDataTerm<?> getDataTerm(QNamedNode namedNode) {

		QDataTerm<?> dataTerm = null;

		if (namedNode instanceof QPrototype) {
			QPrototype prototype = (QPrototype) namedNode;
			dataTerm = prototype;
		}
		else if (namedNode instanceof QEntryParameter<?>) {
			QEntryParameter<?> entryParameter = (QEntryParameter<?>) namedNode;
			dataTerm = (QDataTerm<?>) entryParameter.getDelegate();
		}
		else if (namedNode instanceof QDataTerm<?>)
			dataTerm = (QDataTerm<?>) namedNode;
		else
			return null;

		return dataTerm;
	}

	public static boolean containsArray(QExpressionParser expressionParser, QKeyListTerm keyList) {

		// boolean result = false;
		boolean result = true;

		for (String keyField : keyList.getKeyFields()) {

			QExpression expression = expressionParser.parseExpression(keyField);
			if (expression instanceof QCompoundTermExpression) {
				result = true;
				break;
			}
		}

		return result;
	}

	public static Class<?> getJavaClass(Class<? extends QData> target) {

		if(QString.class.isAssignableFrom(target))
			return String.class;
		else if(QNumeric.class.isAssignableFrom(target))
			return Integer.class;
		else if(QDatetime.class.isAssignableFrom(target))
			return Date.class;
		else
			System.err.println("Unexpected condition 98xxwervwetr");
		
		return null;
	}
}
