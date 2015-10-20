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
import java.util.List;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.dk.compiler.DevelopmentKitCompilerRuntimeException;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.def.QBinaryDef;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QDataAreaDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QDataStructDef;
import org.smeup.sys.il.data.def.QDecimalDef;
import org.smeup.sys.il.data.def.QIndicatorDef;
import org.smeup.sys.il.data.def.QMultipleAtomicBufferedDataDef;
import org.smeup.sys.il.data.def.QMultipleAtomicDataDef;
import org.smeup.sys.il.data.def.QStrollerDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.impl.DataTermVisitorImpl;

public abstract class RPJAbstractDataRefactor extends DataTermVisitorImpl {

	private QCompilationUnit compilationUnit;
	private QDataTerm<?> dataTerm;

	/*
	private Stack<QDataTerm<?>> termsTodo = new Stack<QDataTerm<?>>();

	public Stack<QDataTerm<?>> getTermsTodo() {
		return this.termsTodo;
	}*/

	@Inject
	public RPJAbstractDataRefactor(QCompilationUnit compilationUnit) {
		this.compilationUnit = compilationUnit;
	}

	protected QCompilationUnit getCompilationUnit() {
		return this.compilationUnit;
	}

	public abstract RPJAbstractDataRefactor copy();

	public void reset() {
		this.dataTerm = null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QDataTerm<?> term) {

		dataTerm = term;

		if (dataTerm.getDataTermType().isCompound()) {
			QCompoundDataDef<?, QDataTerm<?>> compoundDataDef = null;
			
			if (dataTerm.getDefinition() instanceof QDataAreaDef) {
				QDataAreaDef<?> dataAreaDef = (QDataAreaDef<?>) dataTerm.getDefinition();
				compoundDataDef = (QCompoundDataDef<?, QDataTerm<?>>) dataAreaDef.getArgument();
			} else
				compoundDataDef = (QCompoundDataDef<?, QDataTerm<?>>) dataTerm.getDefinition();
			
			List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(compoundDataDef.getElements());

			RPJAbstractDataRefactor visitor = this.copy();
			for (QDataTerm<?> dataTerm : dataTerms) {
				visitor.reset();
				dataTerm.accept(visitor);
			}

/*			while (!visitor.getTermsTodo().isEmpty()) {
				visitor.reset();
				QDataTerm<?> termTodo = visitor.getTermsTodo().pop();
				termTodo.accept(visitor);
			}*/
		}

		return false;
	}

	protected void appendDefinitionToMultiple(QDataDef<?> source, QDataTerm<QMultipleAtomicDataDef<?>> termTarget) {

		QMultipleAtomicBufferedDataDef<?> target = (QMultipleAtomicBufferedDataDef<?>) termTarget.getDefinition();

		if (!source.getClass().equals(target.getArgument().getClass())) {
			if (target.getArgument() instanceof QCharacterDef && source instanceof QDecimalDef) {
				target.setArgument((QDecimalDef) EcoreUtil.copy((EObject) source));
				appendDefinition(source, target.getArgument());
			} else
				throw new DevelopmentKitCompilerRuntimeException("Unexpected condition: sb9r89tnbr9tbnt9s");
		} else
			appendDefinition(source, target.getArgument());
	}

	@SuppressWarnings("unchecked")
	protected void appendDefinition(QDataDef<?> source, QDataTerm<?> termTarget) {

		QDataDef<?> target = termTarget.getDefinition();

		if (!source.getClass().equals(target.getClass())) {
			if (target instanceof QCharacterDef && source instanceof QDecimalDef) {
				((QDataTerm<QDecimalDef>) termTarget).setDefinition((QDecimalDef) EcoreUtil.copy((EObject) source));
				target = termTarget.getDefinition();
			} else if (target instanceof QCharacterDef && source instanceof QBinaryDef) {
				((QDataTerm<QBinaryDef>) termTarget).setDefinition((QBinaryDef) EcoreUtil.copy((EObject) source));
				target = termTarget.getDefinition();
			} else if (target instanceof QCharacterDef && source instanceof QIndicatorDef) {
				((QDataTerm<QIndicatorDef>) termTarget).setDefinition((QIndicatorDef) EcoreUtil.copy((EObject) source));
				target = termTarget.getDefinition();
			} else
				throw new DevelopmentKitCompilerRuntimeException("Unexpected condition: sb9r89tnbr9tbnt9s");
		}

		appendDefinition(source, target);
	}

	protected void appendDefinition(QDataDef<?> source, QDataDef<?> target) {

		if (!source.getClass().equals(target.getClass()))
			throw new DevelopmentKitCompilerRuntimeException("Unexpected condition: v9ant6tvb9ar9btva");

		EObject eObjectSource = ((EObject) source);
		EObject eObjectTarget = ((EObject) target);

		EClass eClassSource = eObjectSource.eClass();
		EClass eClassTarget = eObjectTarget.eClass();

		for (EStructuralFeature eFeatureSource : eClassSource.getEAllStructuralFeatures()) {

			if (eObjectSource.eIsSet(eFeatureSource)) {
				EStructuralFeature eFeatureTarget = eClassTarget.getEStructuralFeature(eFeatureSource.getName());

				if (eFeatureTarget != null && !eObjectTarget.eIsSet(eFeatureTarget)) {
					eObjectTarget.eSet(eFeatureTarget, eObjectSource.eGet(eFeatureSource));
				}
			}
		}
	}

	protected <E extends QDataTerm<?>> void copyCompoundDataDef(QCompoundDataDef<?, ?> source, QCompoundDataDef<?, E> target) {

		target.setClassDelegator(source.getClassDelegator());
		target.setPrefix(source.getPrefix());
		target.setQualified(source.isQualified());

		RPJAbstractDataRefactor elementVisitor = this.copy();
		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(source.getElements());
		for (QDataTerm<?> element : dataTerms) {
			elementVisitor.reset();
			element.accept(elementVisitor);
			@SuppressWarnings("unchecked")
			E elementTerm = (E) EcoreUtil.copy((EObject) element);
			target.getElements().add(elementTerm);
		}

		copyDataDef(source, target);
	}

	protected void copyDataDef(QDataDef<?> dataDef, QDataDef<?> dataDefTo) {
		dataDefTo.getFormulas().addAll(EcoreUtil.copyAll(dataDef.getFormulas()));
	}

	protected void setLength(QCharacterDef charDefTo, QDataStructDef dataStructDefFrom) {

		if (charDefTo.getLength() == 0) {
			if (dataStructDefFrom.getLength() == 0) {

				QDataFactory dataFactory = getCompilationUnit().getContext().get(QDataFactory.class);
				QDataStruct dataStructure = dataFactory.createDataStruct(dataStructDefFrom.getElements(), 0, false);

				if (dataStructure.getLength() == 0)
					throw new DevelopmentKitCompilerRuntimeException("Unexpected condition: ayetvayey654c7C");

				charDefTo.setLength(dataStructure.getLength());
			} else
				charDefTo.setLength(dataStructDefFrom.getLength());
		}
	}

	protected void setLength(QCharacterDef charDefTo, QStrollerDef<?> strollerDefFrom) {

		if (charDefTo.getLength() == 0) {
			if (strollerDefFrom.getLength() == 0) {

				QDataFactory dataFactory = getCompilationUnit().getContext().get(QDataFactory.class);
				QDataStruct dataStructure = dataFactory.createDataStruct(strollerDefFrom.getElements(), 0, false);

				if (dataStructure.getLength() == 0)
					throw new DevelopmentKitCompilerRuntimeException("Unexpected condition: kjhfvxzgjchvzxjchv");

				charDefTo.setLength(dataStructure.getLength());
			} else
				charDefTo.setLength(strollerDefFrom.getLength());
		}
	}
}
