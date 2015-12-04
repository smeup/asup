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
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QMultipleAtomicBufferedDataDef;
import org.smeup.sys.il.data.def.QMultipleDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.expr.ExpressionType;
import org.smeup.sys.il.expr.QAssignmentExpression;
import org.smeup.sys.il.expr.QAtomicTermExpression;
import org.smeup.sys.il.expr.QBlockExpression;
import org.smeup.sys.il.expr.QCompoundTermExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QTermExpression;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.rt.core.QLogger;

public class RPJDataFormulasResolver extends RPJAbstractDataRefactor {

	private QExpressionParser expressionParser;
	private QDataContext dataContext;	

	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QLogger logger;
	@Inject
	private QJob job;

	@Inject
	public RPJDataFormulasResolver(QCompilationUnit compilationUnit, QExpressionParser expressionParser, QDataContext dataContext) {
		super(compilationUnit);
		this.expressionParser = expressionParser;
		this.dataContext = dataContext;
	}

	@Override
	public RPJAbstractDataRefactor copy() {
		RPJDataFormulasResolver dataFormulasResolver = new RPJDataFormulasResolver(getCompilationUnit(), expressionParser, dataContext);
		getCompilationUnit().getContext().inject(dataFormulasResolver);
		return dataFormulasResolver;
	}

	@Override
	public boolean visit(QDataTerm<?> term) {

		resolveFormula(term);

		return super.visit(term);
	}

	@SuppressWarnings("unchecked")
	private void resolveFormula(QDataTerm<?> dataTerm) {

		// property
		for (String formula : new ArrayList<String>(dataTerm.getDefinition().getFormulas())) {

			QAssignmentExpression assignmentExpression = expressionParser.parseAssignment(formula);

			QTermExpression property = assignmentExpression.getLeftOperand();
			QExpression value = assignmentExpression.getRightOperand();

			if (setProperty(dataTerm, property.getValue(), value))
				dataTerm.getDefinition().getFormulas().remove(formula);
		}

		// value

		// TODO
		if (dataTerm.getDataTermType().isMultiple())
			return;

		QDefault default_ = dataTerm.getDefault();
		if (default_ == null)
			return;

		if (default_.isEmpty())
			return;

		QExpression value = null;
		// TODO
		try {
			if (String.class.isAssignableFrom(dataTerm.getDefinition().getJavaClass())) {
				if (default_.getValue().startsWith("'"))
					value = expressionParser.parseExpression(default_.getValue());
				else
					value = expressionParser.parseExpression("'" + default_.getValue().replaceAll("\\'", "\\''") + "'");
			} else
				value = expressionParser.parseExpression(default_.getValue());

		} catch (Exception e) {
			logger.warning(exceptionManager.prepareException(job, RPJCompilerMessage.AS00103, default_.getValue()));
		}

		if (value == null)
			return;

		if (value.getExpressionType() != ExpressionType.FUNCTION)
			return;

		QCompoundTermExpression compoundTermExpression = (QCompoundTermExpression) value;
		if (compoundTermExpression.getValue().toUpperCase().equals("*ALL")) {
			"".toCharArray();
			// TODO calculate on @PostConstruct
		} else {
			QDataTerm<?> dataValue = getDataValue(value);
			String property = compoundTermExpression.getValue();
			switch (compoundTermExpression.getValue().toLowerCase()) {
			case "%elem":

				String stringValue = null;
				try {
					stringValue = Integer.toString(((QDataTerm<QMultipleDataDef<?>>) dataValue).getDefinition().getDimension());
				} catch (Exception e) {
					throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdgesdfsafdsf26sd", e);
				}

				if (dataValue.getDataTermType().isUnary())
					throw exceptionManager.prepareException(job, RPJCompilerMessage.AS00105, new String[] { property, stringValue});

				default_.setValue(stringValue);

				break;
			case "%len":
				stringValue = null;
				if (dataValue.getDataTermType().isUnary()){
					try {
						stringValue = Integer.toString(((QBufferedDataDef<?>)dataValue.getDefinition()).getLength());
					} catch (Exception e) {
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdgesdfsafdsf26sd", e);
					}
					default_.setValue(stringValue);

				} else if(dataValue.getDataTermType().isMultiple()){
					
					try {
						QBufferedDataDef<?> argument = ((QDataTerm<QMultipleAtomicBufferedDataDef<?>>) dataValue).getDefinition().getArgument();
						stringValue = Integer.toString(argument.getLength());
					} catch (Exception e) {
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdgesdfsafdsf26sda", e);
					}
					default_.setValue(stringValue);
				}
				break;
			case "%size":
				if (dataValue.getDataTermType().isAtomic())
					throw exceptionManager.prepareException(job, RPJCompilerMessage.AS00107, dataTerm);

				QCompoundDataDef<?, QDataTerm<QBufferedDataDef<?>>> compoundDataDef = (QCompoundDataDef<?, QDataTerm<QBufferedDataDef<?>>>) dataValue.getDefinition();

				QDataStruct dataStruct = dataContext.getDataFactory().createDataStruct(dataValue.getName(), compoundDataDef.getElements(), 0, false);
				default_.setValue(Integer.toString(dataStruct.getSize()));

				break;
			default:
				logger.warning(exceptionManager.prepareException(job, RPJCompilerMessage.AS00104, new String[] { value.toString() }));
				break;
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
				throw exceptionManager.prepareException(job, RPJCompilerMessage.AS00107, atomicTermExpression);

			switch (propertyName.toLowerCase()) {
			case "dimension":

				if (target.getDataTermType().isUnary())
					throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdget9qbtr123");

				if (dataValue.getDataTermType().isUnary()) {
					if (!dataValue.isConstant())
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdget9qbt23423");

					QDefault default_ = dataValue.getDefault();
					if (default_ != null) {
						String defaultValue = default_.getValue();

						try {
							((QMultipleDataDef<?>) target.getDefinition()).setDimension(Integer.parseInt(defaultValue));
						} catch (Exception e) {
							throw exceptionManager.prepareException(job, RPJCompilerMessage.AS00105, new String[] { propertyName, defaultValue});
						}
					}
				} else {
					if (target.getDefinition() == null)
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cvnbn53n69854n5687");

					if (dataValue.getDefinition() == null)
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cvnbn53n6985sdfghsdfg");

					((QMultipleDataDef<?>) target.getDefinition()).setDimension(((QMultipleDataDef<?>) dataValue.getDefinition()).getDimension());
				}

				resolved = true;

				break;
			default:
				logger.info(exceptionManager.prepareException(job, RPJCompilerMessage.AS00105, new String[] { target.getName(), propertyName }));
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
				logger.info(exceptionManager.prepareException(job, RPJCompilerMessage.AS00105, new String[] { getCompilationUnit().getNode().getName() + "." + target.getName() + "." + propertyName
						+ "=" + compoundTermExpression.getValue() }));
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