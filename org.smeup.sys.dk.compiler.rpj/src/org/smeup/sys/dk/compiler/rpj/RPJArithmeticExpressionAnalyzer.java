package org.smeup.sys.dk.compiler.rpj;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;

import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.QMultipleAtomicDataDef;
import org.smeup.sys.il.data.def.QMultipleCompoundDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.expr.QArithmeticExpression;
import org.smeup.sys.il.expr.QAtomicTermExpression;
import org.smeup.sys.il.expr.QFunctionTermExpression;
import org.smeup.sys.il.expr.QQualifiedTermExpression;
import org.smeup.sys.il.expr.impl.ExpressionVisitorImpl;

public class RPJArithmeticExpressionAnalyzer extends ExpressionVisitorImpl {

	@Inject
	private QCompilationUnit compilationUnit;

	private int divideCount = 0;
	private int minusCount = 0;
	private int modularCount = 0;
	private int multCount = 0;
	private int signMinusCount = 0;
	private int signPlusCount = 0;
	private int plusCount = 0;
	private int powerCount = 0;

	private Set<Class<?>> classes = new HashSet<Class<?>>();

	@Override
	public boolean visit(QArithmeticExpression expression) {

		switch (expression.getOperator()) {
		case DIVIDE:
			this.divideCount++;
			break;
		case MINUS:
			this.minusCount++;
			break;
		case MODULAR:
			this.modularCount++;
			break;
		case MULT:
			this.minusCount++;
			break;
		case SIGN_MINUS:
			this.signMinusCount++;
			break;
		case SIGN_PLUS:
			this.signPlusCount++;
			break;
		case PLUS:
			this.plusCount++;
			break;
		case POWER:
			this.powerCount++;
			break;
		}

		return super.visit(expression);
	}

	@Override
	public boolean visit(QAtomicTermExpression expression) {

		switch (expression.getType()) {
		case BOOLEAN:
			getClasses().add(Boolean.class);
			break;
		case DATE:
		case TIME:
		case TIMESTAMP:	
			getClasses().add(Date.class);
			break;
		case FLOATING:
			getClasses().add(Float.class);
			break;
		case HEXADECIMAL:
			getClasses().add(Byte.class);
			break;
		case INDICATOR:
			getClasses().add(QIndicator.class);
			break;
		case INTEGER:
			getClasses().add(Integer.class);
			break;
		case NAME:

			QDataTerm<?> dataTerm = compilationUnit.getDataTerm(expression.getValue(), true);
			if (dataTerm != null) {

				if (dataTerm.getDefinition().getDataClass().isAssignableFrom(QArray.class)) {

					if (dataTerm.getDataTermType().isMultiple()) {
						QMultipleAtomicDataDef<?> multipleAtomicDataDef = (QMultipleAtomicDataDef<?>) dataTerm.getDefinition();
						getClasses().add(multipleAtomicDataDef.getArgument().getDataClass());
					} else
						getClasses().add(dataTerm.getDefinition().getDataClass());
				} else
					getClasses().add(dataTerm.getDefinition().getDataClass());
			}

			break;
		case SPECIAL:
			getClasses().add(Enum.class);
			break;
		case STRING:
			getClasses().add(String.class);
			break;
		}

		return super.visit(expression);
	}

	@Override
	public boolean visit(QQualifiedTermExpression expression) {

		QDataTerm<?> dataTerm = compilationUnit.getDataTerm(expression.getValue(), true);

		if (dataTerm == null)
			throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: bwr9wxe7r9wefisgde");


		if (dataTerm.getDefinition().getDataClass().isAssignableFrom(QArray.class)) {

			if (dataTerm.getDataTermType().isMultiple()) {
				QMultipleCompoundDataDef<?, ?> multipleCompoundDataDef = (QMultipleCompoundDataDef<?, ?>) dataTerm.getDefinition();
				getClasses().add(multipleCompoundDataDef.getDataClass());
			} else
				getClasses().add(dataTerm.getDefinition().getDataClass());
		} else
			getClasses().add(dataTerm.getDefinition().getDataClass());

		return super.visit(expression);
	}


	@Override
	public boolean visit(QFunctionTermExpression expression) {

		QDataTerm<?> dataTerm = null;
		
		dataTerm = compilationUnit.getPrototype(expression.getValue(), true);
		
		if(dataTerm == null)
			dataTerm = compilationUnit.getMethod(null, expression.getValue());
		
		if (dataTerm == null)
			throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: bwr9wxe7r9we9brw9e");

		if (dataTerm.getDefinition().getDataClass().isAssignableFrom(QArray.class)) {

			if (dataTerm.getDataTermType().isMultiple()) {
				QMultipleCompoundDataDef<?, ?> multipleCompoundDataDef = (QMultipleCompoundDataDef<?, ?>) dataTerm.getDefinition();
				getClasses().add(multipleCompoundDataDef.getDataClass());
			} else
				getClasses().add(dataTerm.getDefinition().getDataClass());
			
		} else
			getClasses().add(dataTerm.getDefinition().getDataClass());

		return super.visit(expression);
	}
	
	public QCompilationUnit getCompilationUnit() {
		return compilationUnit;
	}

	public int getDivideCount() {
		return divideCount;
	}

	public int getMinusCount() {
		return minusCount;
	}

	public int getModularCount() {
		return modularCount;
	}

	public int getMultCount() {
		return multCount;
	}

	public int getNegateCount() {
		return signMinusCount;
	}

	public int getPositiveCount() {
		return signPlusCount;
	}

	public int getPlusCount() {
		return plusCount;
	}

	public int getPowerCount() {
		return powerCount;
	}

	public Set<Class<?>> getClasses() {
		return classes;
	}

	public boolean isStringConcatExpression() {

		if (divideCount == 0 && minusCount == 0 && modularCount == 0 && multCount == 0 && signMinusCount == 0 && signPlusCount == 0 && plusCount > 0 && powerCount == 0) {

			for (Class<?> klass : getClasses())
				if (!String.class.isAssignableFrom(klass) && !QString.class.isAssignableFrom(klass))
					return false;

			return true;
		}

		return false;
	}
}