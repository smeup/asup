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
import java.util.Stack;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.dk.compiler.DevelopmentKitCompilerRuntimeException;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.il.core.meta.QFacet;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QDataStructDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.il.data.def.QListDef;
import org.smeup.sys.il.data.def.QMultipleAtomicBufferedDataDef;
import org.smeup.sys.il.data.def.QMultipleAtomicDataDef;
import org.smeup.sys.il.data.def.QMultipleCompoundDataDef;
import org.smeup.sys.il.data.def.QUnaryAtomicBufferedDataDef;
import org.smeup.sys.il.data.def.QUnaryAtomicDataDef;
import org.smeup.sys.il.data.def.QUnaryCompoundDataDef;
import org.smeup.sys.il.data.def.QUnaryDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.impl.DataTermVisitorImpl;

public abstract class RPJAbstractDataRefactor extends DataTermVisitorImpl {

	private QCompilationUnit compilationUnit;
	private QDataTerm<?> dataTerm;

	private Stack<QDataTerm<?>> termsTodo = new Stack<QDataTerm<?>>(); 
	
	public Stack<QDataTerm<?>> getTermsTodo() {
		return this.termsTodo;
	}
	
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

	public QDataTerm<?> getDataTerm() {
		return dataTerm;
	}

	protected void setDataTerm(QDataTerm<?> dataTerm) {
		this.dataTerm = dataTerm;
	}

	@SuppressWarnings("unchecked")
	protected QDataTerm<?> buildUnaryDataTerm(QDataTerm<?> term, QDataTerm<?> termFrom) {

		EClass eTermClass = ((EObject) term).eClass();

		if (termFrom.getDataTermType().isAtomic()) {

			// compound to atomic
			if (term.getDataTermType().isCompound())
				throw new DevelopmentKitCompilerRuntimeException("Unexpected condition: zfgsbdiyfb9scr34239");

			
			// term
			QDataTerm<QUnaryDataDef<?>> unaryDataTerm = (QDataTerm<QUnaryDataDef<?>>) EcoreUtil.create(eTermClass);
			copyDataTerm(term, unaryDataTerm);

			QUnaryDataDef<?> unaryDataDef = null;

			// unary
			if (termFrom.getDataTermType().isUnary()) {
				unaryDataDef = (QUnaryDataDef<?>) EcoreUtil.copy((EObject) termFrom.getDefinition());
			}
			// multiple
			else {
				QMultipleAtomicBufferedDataDef<?> multipleAtomicBufferedDataDef = (QMultipleAtomicBufferedDataDef<?>) termFrom.getDefinition();
				unaryDataDef = (QUnaryDataDef<?>) EcoreUtil.copy((EObject) multipleAtomicBufferedDataDef.getArgument());
			}

			if (term.getDefinition() != null) 
				overrideDefinition(unaryDataDef, term.getDefinition());

			unaryDataTerm.setDefinition(unaryDataDef);
			
			return unaryDataTerm;
		} else {

			// compound to atomic
			if (term.getDataTermType().isAtomic()) {

				copyDataDef(termFrom.getDefinition(), term.getDefinition());

				if (term.getDefinition() != null)
					overrideDefinition(term.getDefinition(), termFrom.getDefinition());

				if (termFrom.getDefinition() instanceof QDataStructDef && term.getDefinition() instanceof QCharacterDef) {
					
					QDataStructDef dataStructDefFrom = (QDataStructDef) termFrom.getDefinition();
					QCharacterDef charDefTo = (QCharacterDef) term.getDefinition();
					
					if (dataStructDefFrom.getLength() == 0 && charDefTo.getLength() == 0) {
						
						QDataFactory dataFactory = getCompilationUnit().getContext().get(QDataFactory.class);
						QDataStruct dataStructure = dataFactory.createDataStruct(dataStructDefFrom.getElements(), 0, false);
								
						if(dataStructure.getLength() == 0)
							throw new DevelopmentKitCompilerRuntimeException("Unexpected condition: jsdrf6sd6fs777gh");							

						charDefTo.setLength(dataStructure.getLength());
					}
				}

				return term;
			}
			// compound to compound
			else {

				QDataTerm<QUnaryCompoundDataDef<?, ?>> unaryCompoundDataTerm = (QDataTerm<QUnaryCompoundDataDef<?, ?>>) EcoreUtil.create(eTermClass);
				copyDataTerm(term, unaryCompoundDataTerm);

				// definition
				QUnaryCompoundDataDef<?, ?> unaryCompoundDataDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createDataStructDef();
				copyCompoundDataDef((QCompoundDataDef<?, ?>) termFrom.getDefinition(), unaryCompoundDataDef);
				unaryCompoundDataTerm.setDefinition(unaryCompoundDataDef);

				return unaryCompoundDataTerm;
			}
		}
	}

	private void overrideDefinition(QDataDef<?> target, QDataDef<?> source) {

		EObject eObjectTarget = ((EObject) target);
		EObject eObjectSource = ((EObject) source);

		EClass eClassTarget = eObjectTarget.eClass();
		EClass eClassSource = eObjectSource.eClass();

		for (EStructuralFeature eFeatureSource : eClassSource.getEAllStructuralFeatures()) {

			if (eObjectSource.eIsSet(eFeatureSource)) {
				EStructuralFeature eFeatureTarget = eClassTarget.getEStructuralFeature(eFeatureSource.getName());

				if (eFeatureTarget != null && !eObjectTarget.eIsSet(eFeatureTarget)) {
					eObjectTarget.eSet(eFeatureTarget, eObjectSource.eGet(eFeatureSource));
				}
			}
		}

	}

	@SuppressWarnings("unchecked")
	protected QDataTerm<?> buildMultipleDataTerm(QDataTerm<?> termTo, QDataTerm<?> termFrom, EClass eTermClass) {

		if (termFrom.getDataTermType().isAtomic()) {

			// term
			QDataTerm<QMultipleAtomicDataDef<?>> multipleAtomicDataTerm = (QDataTerm<QMultipleAtomicDataDef<?>>) EcoreUtil.create(eTermClass);
			copyDataTerm(termTo, multipleAtomicDataTerm);

			// buffered definition
			if (termFrom.getDefinition() instanceof QBufferedDataDef) {

				// unary
				if (termFrom.getDataTermType().isUnary()) {
					QMultipleAtomicBufferedDataDef<?> multipleAtomicDataDef = (QMultipleAtomicBufferedDataDef<?>) termTo.getDefinition();
					multipleAtomicDataDef.setArgument((QUnaryAtomicBufferedDataDef<?>) EcoreUtil.copy((EObject) termFrom.getDefinition()));
					multipleAtomicDataTerm.setDefinition(multipleAtomicDataDef);

					dataTerm = multipleAtomicDataTerm;
				} else if (termTo.getDefinition() != null)
					switch (termTo.getDataTermType()) {
					case MULTIPLE_ATOMIC:
						QMultipleAtomicBufferedDataDef<?> multipleAtomicBufferedDataDef = (QMultipleAtomicBufferedDataDef<?>) EcoreUtil.copy((EObject) termFrom.getDefinition());
						QMultipleAtomicBufferedDataDef<?> multipleDataDef = (QMultipleAtomicBufferedDataDef<?>) termTo.getDefinition();
						multipleAtomicBufferedDataDef.setArgument(multipleDataDef.getArgument());
						multipleAtomicDataTerm.setDefinition(multipleAtomicBufferedDataDef);

						dataTerm = multipleAtomicDataTerm;
						break;
					case UNARY_ATOMIC:
						multipleAtomicBufferedDataDef = (QMultipleAtomicBufferedDataDef<?>) EcoreUtil.copy((EObject) termFrom.getDefinition());
						multipleAtomicBufferedDataDef.setArgument((QUnaryAtomicBufferedDataDef<?>) termTo.getDefinition());
						multipleAtomicDataTerm.setDefinition(multipleAtomicBufferedDataDef);

						dataTerm = multipleAtomicDataTerm;
						break;
					case UNARY_COMPOUND:
						QDataTerm<QMultipleCompoundDataDef<?, ?>> multipleCompoundDataTerm = (QDataTerm<QMultipleCompoundDataDef<?, ?>>) EcoreUtil.create(eTermClass);
						copyDataTerm(termTo, multipleCompoundDataTerm);

						// definition
						QMultipleCompoundDataDef<?, ?> multipleCompoundDataDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createStrollerDef();
						copyCompoundDataDef((QCompoundDataDef<?, ?>) termTo.getDefinition(), multipleCompoundDataDef);
						multipleCompoundDataTerm.setDefinition(multipleCompoundDataDef);

						dataTerm = multipleCompoundDataTerm;
						break;
					case MULTIPLE_COMPOUND:
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: bt7v8q45q4v5bq4375v");
					}
				else
					dataTerm = multipleAtomicDataTerm;
			} else {
				QListDef<?> listDef = (QListDef<?>) EcoreUtil.copy((EObject) termTo.getDefinition());
				listDef.setArgument((QUnaryAtomicDataDef<?>) EcoreUtil.copy((EObject) termFrom.getDefinition()));
				multipleAtomicDataTerm.setDefinition(listDef);

				dataTerm = multipleAtomicDataTerm;
			}

		} else {

			// term
			QDataTerm<QMultipleCompoundDataDef<?, ?>> multipleCompoundDataTerm = (QDataTerm<QMultipleCompoundDataDef<?, ?>>) EcoreUtil.create(eTermClass);
			copyDataTerm(termTo, multipleCompoundDataTerm);

			// definition
			QMultipleCompoundDataDef<?, ?> multipleCompoundDataDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createStrollerDef();
			copyCompoundDataDef((QCompoundDataDef<?, ?>) termFrom.getDefinition(), multipleCompoundDataDef);
			multipleCompoundDataTerm.setDefinition(multipleCompoundDataDef);

			dataTerm = multipleCompoundDataTerm;
		}

		return dataTerm;
	}

	private void copyDataTerm(QDataTerm<?> dataTerm, QDataTerm<?> dataTermTo) {

		dataTermTo.setName(dataTerm.getName());
		dataTermTo.setConstant(dataTerm.isConstant());
		dataTermTo.setInitialized(dataTerm.isInitialized());
		dataTermTo.setRestricted(dataTerm.isRestricted());
		dataTermTo.setText(dataTerm.getText());

		for (QFacet facet : dataTerm.getFacets())
			if (dataTermTo.getFacet(facet.getClass()) == null)
				dataTermTo.getFacets().add((QFacet) EcoreUtil.copy((EObject) facet));

	}

	private <E extends QDataTerm<?>> void copyCompoundDataDef(QCompoundDataDef<?, ?> compoundDataDef, QCompoundDataDef<?, E> compoundDataDefTo) {

		compoundDataDefTo.setClassDelegator(compoundDataDef.getClassDelegator());
		compoundDataDefTo.setPrefix(compoundDataDef.getPrefix());
		compoundDataDefTo.setQualified(compoundDataDef.isQualified());

		RPJAbstractDataRefactor elementVisitor = this.copy();
		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(compoundDataDef.getElements());
		for (QDataTerm<?> element : dataTerms) {
			elementVisitor.reset();
			element.accept(elementVisitor);
			@SuppressWarnings("unchecked")
			E elementTerm = (E) EcoreUtil.copy((EObject) elementVisitor.getDataTerm());
			compoundDataDefTo.getElements().add(elementTerm);
		}

		copyDataDef(compoundDataDef, compoundDataDefTo);
	}

	private void copyDataDef(QDataDef<?> dataDef, QDataDef<?> dataDefTo) {
		dataDefTo.getFormulas().addAll(EcoreUtil.copyAll(dataDef.getFormulas()));
	}

	@Override
	public boolean visit(QDataTerm<?> term) {

		dataTerm = term;

		if (dataTerm.getDataTermType().isCompound()) {
			@SuppressWarnings("unchecked")
			QCompoundDataDef<?, QDataTerm<?>> compoundDataDef = (QCompoundDataDef<?, QDataTerm<?>>) term.getDefinition();
			List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(compoundDataDef.getElements());

			RPJAbstractDataRefactor visitor = this.copy();
			for (QDataTerm<?> dataTerm : dataTerms) {
				visitor.reset();

				dataTerm.accept(visitor);

				if (visitor.getDataTerm() != null) {
					compoundDataDef.getElements().remove(dataTerm);
					QDataTerm<?> dt = visitor.getDataTerm();
					compoundDataDef.getElements().add(dt);
				}
				else 
					throw new IntegratedLanguageDataRuntimeException("Unexpected condition: wer98wer9wew79e");
			}
			

			while (!visitor.getTermsTodo().isEmpty()) {
				visitor.reset();

				QDataTerm<?> termTodo = visitor.getTermsTodo().pop();
				termTodo.accept(visitor);

				if (visitor.getDataTerm() != null) {
					QDataTerm<?> dt = visitor.getDataTerm();
					compoundDataDef.getElements().add(dt);
				} else
					throw new IntegratedLanguageDataRuntimeException("Unexpected condition: er0t9erterter");
			}
			
			compilationUnit.refresh();
		}

		return false;
	}
}
