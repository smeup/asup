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
package org.smeup.sys.dk.compiler.rpj;

import java.util.Date;
import java.util.List;

import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.il.core.term.QNamedNode;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.QArrayDef;
import org.smeup.sys.il.data.def.QMultipleDataDef;
import org.smeup.sys.il.data.def.QPointerDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.esam.QDataSet;
import org.smeup.sys.il.esam.QDataSetTerm;
import org.smeup.sys.il.esam.QDisplay;
import org.smeup.sys.il.esam.QDisplayTerm;
import org.smeup.sys.il.esam.QKeyListTerm;
import org.smeup.sys.il.esam.QPrint;
import org.smeup.sys.il.esam.QPrintTerm;
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

public class RPJContextHelper {

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
				if (dataTerm == null || (dataTerm.isConstant() && !dataTerm.getDataTermType().isMultiple()))
					return true;

				break;
			}
			break;
		case BLOCK:
			QBlockExpression blockExpression = (QBlockExpression) expression;

			return isPrimitive(compilationUnit, blockExpression.getExpression());
		case FUNCTION:
			QFunctionTermExpression functionExpression = (QFunctionTermExpression) expression;
			return getTargetClass(compilationUnit, functionExpression, false) == null;

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

	public static DataSpecial getSpecial(QCompilationUnit compilationUnit, QExpression expression) {

		switch (expression.getExpressionType()) {
		case ARRAY:
		case ARITHMETIC:
		case ASSIGNMENT:
		case FUNCTION:
		case QUALIFIED:
		case LOGICAL:
		case RELATIONAL:
		case BOOLEAN:
			return null;
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
				return null;
			case SPECIAL:
				DataSpecial dataSpecial = DataSpecial.get(atomicTermExpression.getValue().toUpperCase());
				return dataSpecial;
			}
			break;
		case BLOCK:
			QBlockExpression blockExpression = (QBlockExpression) expression;
			return getSpecial(compilationUnit, blockExpression.getExpression());
		}

		return null;
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
			QFunctionTermExpression functionExpression = (QFunctionTermExpression) expression;
			return QPointer.class.isAssignableFrom(getTargetClass(compilationUnit, functionExpression, false));

		case QUALIFIED:
			QCompoundTermExpression compoundTermExpression = (QCompoundTermExpression) expression;

			QNamedNode namedNode = compilationUnit.getNamedNode(compoundTermExpression.getValue(), true);
			QDataTerm<?> dataTerm = getDataTerm(namedNode);
			if (dataTerm == null)
				return false;

			return QPointer.class.isAssignableFrom(dataTerm.getDefinition().getDataClass());
		case ARITHMETIC:
		case ARRAY:
		case ASSIGNMENT:
		case BLOCK:
		case BOOLEAN:
		case LOGICAL:
		case RELATIONAL:
			return false;
		}

		return false;
	}

	public static Class<?> getTargetClass(QCompilationUnit compilationUnit, QExpression expression, boolean primitive) {

		switch (expression.getExpressionType()) {
		case ARRAY:
			return List.class;
		case ARITHMETIC:
			return getTargetClass(compilationUnit, ((QArithmeticExpression) expression).getLeftOperand(), primitive);
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
				return Number.class;
			case SPECIAL:
				return Enum.class;
			case STRING:
				return String.class;
			case INDICATOR:
				return QIndicator.class;
			case NAME:

				QNamedNode namedNode = compilationUnit.getNamedNode(atomicTermExpression.getValue(), true);
				if (namedNode instanceof QDataSetTerm) {
					return QDataSet.class;
				} else if (namedNode instanceof QPrintTerm) {
					return QPrint.class;
				} else if (namedNode instanceof QDisplayTerm) {
					return QDisplay.class;
				}

				QDataTerm<?> dataTerm = getDataTerm(namedNode);
				if (dataTerm != null) {
					if (primitive)
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
			QFunctionTermExpression functionExpression = (QFunctionTermExpression) expression;
			return getTargetClass(compilationUnit, functionExpression, primitive);
		case QUALIFIED:
			QCompoundTermExpression compoundTermExpression = (QCompoundTermExpression) expression;
			QNamedNode namedNode = compilationUnit.getNamedNode(compoundTermExpression.getValue(), true);
			QDataTerm<?> dataTerm = getDataTerm(namedNode);
			if (dataTerm != null)
				if (primitive)
					return dataTerm.getDefinition().getJavaClass();
				else
					return dataTerm.getDefinition().getDataClass();

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

	@SuppressWarnings("unchecked")
	private static Class<?> getTargetClass(QCompilationUnit compilationUnit, QFunctionTermExpression functionExpression, boolean primitive) {

		if (!functionExpression.getElements().isEmpty()) {

			// check array index
			QDataTerm<?> dataTerm = compilationUnit.getDataTerm(functionExpression.getValue(), true);
			if (dataTerm != null) {
				if (dataTerm.getDefinition() instanceof QArrayDef<?>) {
					QArrayDef<?> arrayDef = (QArrayDef<?>) dataTerm.getDefinition();
					if (primitive)
						return arrayDef.getArgument().getJavaClass();
					else
						return arrayDef.getArgument().getDataClass();
				} else {
					if (primitive)
						return dataTerm.getDefinition().getJavaClass();
					else
						return dataTerm.getDefinition().getDataClass();
				}
			}
			// prototype
			QPrototype prototype = compilationUnit.getPrototype(functionExpression.getValue(), true);
			if (prototype != null) {
				if (primitive)
					return getDataTerm(prototype).getDefinition().getJavaClass();
				else
					return getDataTerm(prototype).getDefinition().getDataClass();
			}

			// check method
			QExpression expressionChild = functionExpression.getElements().get(0);
			Class<?> target = null;
			if (!RPJContextHelper.isPrimitive(compilationUnit, expressionChild))
				target = (Class<? extends QData>) getTargetClass(compilationUnit, expressionChild, false);
			else
				target = getModelClass(getTargetClass(compilationUnit, expressionChild, true));

			QPrototype method = null;
			
			if(target.isAssignableFrom(QDataArea.class)) {
				method = compilationUnit.getMethod(QCharacter.class, functionExpression.getValue());
				if(method == null)
					method = compilationUnit.getMethod(QDecimal.class, functionExpression.getValue());
				if(method == null)
					method = compilationUnit.getMethod(QIndicator.class, functionExpression.getValue());
			}
			else
				method = compilationUnit.getMethod(target, functionExpression.getValue());

			if (method != null) {
				if (primitive)
					return getDataTerm(method).getDefinition().getJavaClass();
				else
					return getDataTerm(method).getDefinition().getDataClass();
			}
		} else {
			QNamedNode namedNode = compilationUnit.getNamedNode(functionExpression.getValue(), true);
			QDataTerm<?> dataTerm = getDataTerm(namedNode);
			if (dataTerm != null)
				if (primitive)
					return dataTerm.getDefinition().getJavaClass();
				else
					return dataTerm.getDefinition().getDataClass();
		}

		return null;
	}

	public static QDataTerm<?> getDataTerm(QNamedNode namedNode) {

		QDataTerm<?> dataTerm = null;

		if (namedNode instanceof QPrototype) {
			QPrototype prototype = (QPrototype) namedNode;
			dataTerm = prototype;
		} else if (namedNode instanceof QEntryParameter<?>) {
			QEntryParameter<?> entryParameter = (QEntryParameter<?>) namedNode;
			dataTerm = (QDataTerm<?>) entryParameter.getDelegate();
		} else if (namedNode instanceof QDataTerm<?>)
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

		if (QString.class.isAssignableFrom(target))
			return String.class;
		else if (QNumeric.class.isAssignableFrom(target))
			return Number.class;
		else if (QDatetime.class.isAssignableFrom(target))
			return Date.class;
		else
			System.err.println("Unexpected condition 98xxwervwetr");

		return null;
	}

	public static Class<?> getModelClass(Class<?> target) {

		if (target == null) {
			System.err.println("Unexpected condition 98xxw34wejruwe35wetr");
			return null;
		}

		if (Byte.class.isAssignableFrom(target))
			return QCharacter.class;
		else if (String.class.isAssignableFrom(target))
			return QCharacter.class;
		else if (Number.class.isAssignableFrom(target))
			return QNumeric.class;
		else if (Date.class.isAssignableFrom(target))
			return QDatetime.class;
		else if (QDataSet.class.isAssignableFrom(target))
			return QDataSet.class;
		else if (QPrint.class.isAssignableFrom(target))
			return QPrint.class;
		else if (QDisplay.class.isAssignableFrom(target))
			return QDisplay.class;
		else if (QPointer.class.isAssignableFrom(target))
			return QPointer.class;
		else
			System.err.println("Unexpected condition 98xxw345435wetr");

		return null;
	}

	public static boolean isList(QCompilationUnit compilationUnit, QExpression expression) {

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

				return dataTerm.getDefinition() instanceof QMultipleDataDef<?>;
			}
		case FUNCTION:
			QFunctionTermExpression functionExpression = (QFunctionTermExpression) expression;
			return QList.class.isAssignableFrom(getTargetClass(compilationUnit, functionExpression, false));

		case QUALIFIED:
			QCompoundTermExpression compoundTermExpression = (QCompoundTermExpression) expression;

			QNamedNode namedNode = compilationUnit.getNamedNode(compoundTermExpression.getValue(), true);
			QDataTerm<?> dataTerm = getDataTerm(namedNode);
			if (dataTerm == null)
				return false;

			return QList.class.isAssignableFrom(dataTerm.getDefinition().getDataClass());
		case ARITHMETIC:
		case ARRAY:
		case ASSIGNMENT:
		case BLOCK:
		case BOOLEAN:
		case LOGICAL:
		case RELATIONAL:
			return false;
		}

		return false;
	}
}
