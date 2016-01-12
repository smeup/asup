/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.memo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.expr.LogicalOperator;
import org.smeup.sys.il.expr.QLogicalExpression;
import org.smeup.sys.il.expr.QPredicateExpression;
import org.smeup.sys.il.expr.QRelationalExpression;
import org.smeup.sys.il.expr.QTermExpression;
import org.smeup.sys.il.expr.impl.ExpressionVisitorImpl;
import org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage;
import org.smeup.sys.il.memo.QResourceReader;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QResource</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ResourceReaderImpl<T extends QObjectNameable> extends ResourceImpl<T> implements QResourceReader<T> {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceReaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageMemoryPackage.Literals.RESOURCE_READER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean exists(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QObjectIterator<T> find(String nameFilter) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public QObjectIterator<T> findByExpression(QPredicateExpression filter) {
		return new ObjectIterator(find(null), filter);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public T lookup(String name) {	
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	private class ObjectIterator implements QObjectIterator<T> {

		private QObjectIterator<T> iterator;
		private QPredicateExpression filter;

		private T nextObject;

		public ObjectIterator(QObjectIterator<T> delegate, QPredicateExpression filter) {
			this.iterator = delegate;
			this.filter = filter;

			doNext();
		}

		@Override
		public void close() {
			this.iterator.close();
		}

		@Override
		public boolean hasNext() {
			return this.nextObject != null;
		}

		@Override
		public T next() {

			T object = nextObject;
			doNext();

			return object;

		}

		@Override
		public void remove() {
			this.iterator.remove();
		}

		private void doNext() {

			nextObject = null;
			while (iterator.hasNext()) {
				T object = iterator.next();
				ExpressionVisitor expressionVisitor = new ExpressionVisitor((EObject) object);
				filter.accept(expressionVisitor);

				if (!expressionVisitor.isValid())
					continue;

				nextObject = object;
				break;
			}
		}
	}

	private class ExpressionVisitor extends ExpressionVisitorImpl {

		boolean result = true;

		private EObject eObject;

		public ExpressionVisitor(EObject eObject) {
			this.eObject = eObject;
		}

		public boolean isValid() {
			return result;
		}

		@Override
		public boolean visit(QLogicalExpression expression) {

			expression.getLeftOperand().accept(this);
			if (isValid() || expression.getExpressionType().equals(LogicalOperator.OR))
				expression.getRightOperand().accept(this);

			return isValid();
		}

		@Override
		public boolean visit(QRelationalExpression expression) {

			// TODO
			QTermExpression leftOperand = (QTermExpression) expression.getLeftOperand();
			String feature = leftOperand.getValue();
			EStructuralFeature eFeature = eObject.eClass().getEStructuralFeature(feature);
			Object object = eObject.eGet(eFeature);
			String eValue = null;
			if (object == null)
				eValue = eFeature.getDefaultValueLiteral();
			else
				eValue = object.toString();

			// TODO
			QTermExpression rightOperand = (QTermExpression) expression.getRightOperand();
			String value = rightOperand.getValue();

			switch (expression.getOperator()) {
			case EQUAL:
				this.result = value.equalsIgnoreCase(eValue);
				break;
			case GREATER_THAN:
				this.result = value.compareTo(eValue) > 0;
				break;
			case GREATER_THAN_EQUAL:
				this.result = value.compareTo(eValue) >= 0;
				break;
			case LESS_THAN:
				this.result = value.compareTo(eValue) < 0;
				break;
			case LESS_THAN_EQUAL:
				this.result = value.compareTo(eValue) <= 0;
				break;
			case NOT_EQUAL:
				this.result = !value.equalsIgnoreCase(eValue);
				break;
			}

			return result;
		}

	}
} // QResourceImpl