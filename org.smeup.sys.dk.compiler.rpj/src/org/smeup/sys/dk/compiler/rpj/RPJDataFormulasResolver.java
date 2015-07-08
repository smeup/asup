/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi 			 - Initial API and implementation
 *   Giuliano Giancristofaro - Implementation
 */
package org.smeup.sys.dk.compiler.rpj;

import java.util.ArrayList;

import javax.inject.Inject;

import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.il.core.meta.QDefault;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QMultipleDataDef;
import org.smeup.sys.il.data.def.QPointerDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.expr.ExpressionType;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.il.expr.QAssignmentExpression;
import org.smeup.sys.il.expr.QAtomicTermExpression;
import org.smeup.sys.il.expr.QBlockExpression;
import org.smeup.sys.il.expr.QCompoundTermExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QTermExpression;

public class RPJDataFormulasResolver extends RPJAbstractDataRefactor {

	private QExpressionParser expressionParser;
	private QDataFactory dataFactory;

	@Inject
	public RPJDataFormulasResolver(QCompilationUnit compilationUnit, QExpressionParser expressionParser, QDataFactory dataFactory) {
		super(compilationUnit);
		this.expressionParser = expressionParser;
		this.dataFactory = dataFactory;
	}

	@Override
	public RPJAbstractDataRefactor copy() {
		return new RPJDataFormulasResolver(getCompilationUnit(), expressionParser, dataFactory);
	}

	@Override
	public boolean visit(QDataTerm<?> term) {

		resolveFormula(term);

		return super.visit(term);
	}

	@SuppressWarnings("unchecked")
	private void resolveFormula(QDataTerm<?> dataTerm) {

		for (String formula : new ArrayList<String>(dataTerm.getDefinition().getFormulas())) {

			QAssignmentExpression assignmentExpression = expressionParser.parseAssignment(formula);

			QTermExpression property = assignmentExpression.getLeftOperand();
			QExpression value = assignmentExpression.getRightOperand();

			if (setProperty(dataTerm, property.getValue(), value))
				dataTerm.getDefinition().getFormulas().remove(formula);
		}

		if (dataTerm.getDataTermType().isMultiple()) 
			return;

		QDefault default_ = dataTerm.getDefault();
		if(default_ == null)
			return;
		
		if (default_.isEmpty()) 
			return;

		QExpression value = null;
		// TODO
		if (default_.getValue().trim().equals("*Allx'00'"))
			value = expressionParser.parseExpression(default_.getValue().trim().toUpperCase());
		else
			value = expressionParser.parseExpression(default_.getValue());

		if (value.getExpressionType() == ExpressionType.FUNCTION) {

			QCompoundTermExpression compoundTermExpression = (QCompoundTermExpression) value;
			if (compoundTermExpression.getValue().toLowerCase().equals("%addr")) {

				if (!dataTerm.getDefinition().getDataClass().equals(QPointer.class))
					throw new IntegratedLanguageExpressionRuntimeException("Unexpected condition: d9q6r35xcvbcvb40956");

				QPointerDef pointerDef = (QPointerDef) dataTerm.getDefinition();
				if (pointerDef.getTarget() != null)
					throw new IntegratedLanguageExpressionRuntimeException("Unexpected condition: 90mvqsdgdfag79fa");

				QDataTerm<?> dataValue = getDataValue(value);
				if (dataValue == null)
					throw new IntegratedLanguageExpressionRuntimeException("Unexpected condition: 90mvqsdgdfag79fasgfsdfg");

				pointerDef.setTarget(dataValue.getName());

				default_.clear();
			}
			/*
			 * else if
			 * (compoundTermExpression.getValue().toLowerCase().equals
			 * ("%size")) {
			 *
			 *
			 *
			 * // TODO calculate on @PostConstruct }
			 */
			else if (compoundTermExpression.getValue().toUpperCase().equals("*ALL")) {
				// TODO calculate on @PostConstruct
			} else {
				QDataTerm<?> dataValue = getDataValue(value);
				switch (compoundTermExpression.getValue().toLowerCase()) {
				case "%elem":

					if (dataValue.getDataTermType().isUnary())
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdsfwergds09f8s0d9");

					String stringValue = null;
					try {
						stringValue = Integer.toString(((QDataTerm<QMultipleDataDef<?>>) dataValue).getDefinition().getDimension());
					} catch (Exception e) {
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdgesdfsafdsf26sd", e);
					}

					default_.setValue(stringValue);
					break;
				case "%size":
					if (dataValue.getDataTermType().isAtomic())
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdsfwergds09f82343");

					QCompoundDataDef<?, QDataTerm<QBufferedDataDef<?>>> compoundDataDef = (QCompoundDataDef<?, QDataTerm<QBufferedDataDef<?>>>) dataTerm.getDefinition();

					QDataStruct dataStruct = dataFactory.createDataStruct(compoundDataDef.getElements(), 0, false);
					default_.setValue(Integer.toString(dataStruct.getSize()));

					break;
				default:
					System.err.println(value);
					break;
				}
			}
		}
	}

	private boolean setProperty(QDataTerm<?> target, String propertyName, QExpression value) {

		boolean resolved = false;

		switch (value.getExpressionType()) {

		case ATOMIC:

			QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) value;

			QDataTerm<?> dataValue = getCompilationUnit().getDataTerm(atomicTermExpression.getValue(), true);
			if (dataValue == null)
				throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdget9qbtr9q");

			switch (propertyName.toLowerCase()) {
			case "dimension":

				if (target.getDataTermType().isUnary())
					throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdget9qbtr123");

				if (dataValue.getDataTermType().isUnary()) {
					if (!dataValue.isConstant())
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdget9qbt23423");

					QDefault default_ = target.getDefault();
					if(default_ != null) {
						String defaultValue = default_.getValue();

						try {
							((QMultipleDataDef<?>)target.getDefinition()).setDimension(Integer.parseInt(defaultValue));
						} catch (Exception e) {
							throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdgetg8rr5wq", e);
						}						
					}
				} else {
					if (target.getDefinition() == null)
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cvnbn53n69854n5687");

					if (dataValue.getDefinition() == null)
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cvnbn53n6985sdfghsdfg");

					((QMultipleDataDef<?>)target.getDefinition()).setDimension(((QMultipleDataDef<?>)dataValue.getDefinition()).getDimension());
				}

				resolved = true;

				break;
			default:
				System.out.println(getCompilationUnit().getRoot().getName() + "." + target.getName() + "." + propertyName + "=" + value);
				break;
			}

			break;

		case FUNCTION:
			QCompoundTermExpression compoundTermExpression = (QCompoundTermExpression) value;
			switch (compoundTermExpression.getValue().toLowerCase()) {
			case "%elem":

				if (compoundTermExpression.getElements().size() != 1)
					throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdget9dsagdsa99");

				QExpression parameterExpression = compoundTermExpression.getElements().get(0);
				resolved = setProperty(target, propertyName, parameterExpression);

				break;

			default:
				System.out.println(getCompilationUnit().getRoot().getName() + "." + target.getName() + "." + propertyName + "=" + compoundTermExpression.getValue());
				break;
			}

			break;

		case BLOCK:
			QBlockExpression blockValue = (QBlockExpression) value;
			setProperty(target, propertyName, blockValue.getExpression());
			break;

		case ASSIGNMENT:
		case BOOLEAN:
		case ARITHMETIC:
		case LOGICAL:
		case RELATIONAL:
		case QUALIFIED:
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564q56pbdn7d6srre8r");
		}

		return resolved;
	}

	private QDataTerm<?> getDataValue(QExpression value) {

		QDataTerm<?> dataValue = null;

		switch (value.getExpressionType()) {

		case ATOMIC:

			QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) value;

			dataValue = getCompilationUnit().getDataTerm(atomicTermExpression.getValue(), true);
			if (dataValue == null)
				throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdget9qbtr9q");

			break;

		case FUNCTION:
			QCompoundTermExpression compoundTermExpression = (QCompoundTermExpression) value;

			if (compoundTermExpression.getElements().size() != 1)
				throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdsf66df6agdsa99");

			QExpression parameterExpression = compoundTermExpression.getElements().get(0);
			if (!(parameterExpression instanceof QAtomicTermExpression))
				throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdsfwergw8r8wsa99");

			dataValue = getCompilationUnit().getDataTerm(((QAtomicTermExpression) parameterExpression).getValue(), true);
			if (dataValue == null)
				throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdgwefw9def9q");

			break;

		case BLOCK:
			QBlockExpression blockValue = (QBlockExpression) value;
			dataValue = getDataValue(blockValue.getExpression());
			break;

		case ASSIGNMENT:
		case BOOLEAN:
		case ARITHMETIC:
		case LOGICAL:
		case RELATIONAL:
		case QUALIFIED:
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564q56pbdn7d6srre33r");
		}

		return dataValue;

	}
}