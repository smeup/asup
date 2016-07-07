/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.dk.compiler.DevelopmentKitCompilerRuntimeException;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerLinker;
import org.smeup.sys.dk.compiler.QDevelopmentKitCompilerFactory;
import org.smeup.sys.il.core.meta.QFacet;
import org.smeup.sys.il.data.def.QBufferDef;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QDataStructDef;
import org.smeup.sys.il.data.def.QMultipleAtomicDataDef;
import org.smeup.sys.il.data.def.QMultipleCompoundDataDef;
import org.smeup.sys.il.data.def.QNumericDef;
import org.smeup.sys.il.data.def.QStrollerDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.esam.QDataSetTerm;
import org.smeup.sys.il.esam.QDisplayTerm;
import org.smeup.sys.il.esam.QPrintTerm;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.il.flow.QCallableUnit;
import org.smeup.sys.il.flow.QFileSection;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.os.file.QExternalFile;

public class RPJDataLikeRefactor extends RPJAbstractDataRefactor {

	@Inject
	public RPJDataLikeRefactor(QCompilationUnit compilationUnit) {
		super(compilationUnit);
	}

	@Override
	public boolean visit(QDataTerm<?> target) {

		// TODO
		if(target.getDataTermType() == null)
			return super.visit(target);
		
		if (target.getLike() == null) {
			
			switch (target.getDataTermType()) {
			case MULTIPLE_ATOMIC:
			case MULTIPLE_COMPOUND:
			case UNARY_COMPOUND:
				return super.visit(target);
			case UNARY_ATOMIC:

				if(target instanceof QPrototype)
					break;
				
				// search file definition
				if(target.getDefinition() instanceof QBufferedDataDef<?>) {
					QBufferedDataDef<?> bufferedDataDef = (QBufferedDataDef<?>) target.getDefinition();
					if(bufferedDataDef.getLength() == 0) {
						if(bufferedDataDef instanceof QBufferDef)
							break;
						if(bufferedDataDef instanceof QNumericDef)
							break;
						
						// from files
						QDataTerm<?> displayTerm = getFromFiles(target);
						if(displayTerm == null)
							displayTerm = getFromModules(target);
						
						if(displayTerm != null) {
							completeDefinition(displayTerm, target);
							return false;
						}
					}
				}
			}	
			
			return super.visit(target);
		}

		String like = target.getLike();
		if (like.toUpperCase().startsWith("*IN") && !like.equalsIgnoreCase("*IN"))
			like = "*INKA";

		QDataTerm<?> source = getCompilationUnit().getDataTerm(like, true);
		if (source == null)
			throw new IntegratedLanguageExpressionRuntimeException("Invalid liked data term: " + target.getLike());

		if (source.getLike() != null)
			visit(source);

		completeDefinition(source, target);
		
		target.setLike(null);

		return false;
	}

	// TODO move this method in QCompilationUnit
	private QDataTerm<?> getFromModules(QDataTerm<?> target) {

		for(QCompilationUnit childUnit: getCompilationUnit().getChildCompilationUnits()) {
			QDataTerm<?> childDataTerm = childUnit.getDataTerm(target.getName(), true);
			if(childDataTerm != null)
				return childDataTerm;
		}
		
		return null;
	}

	// TODO move this method in QCompilationUnit
	private QDataTerm<?> getFromFiles(QDataTerm<?> target) {
		
		QCallableUnit callableUnit = (QCallableUnit) getCompilationUnit().getNode();
		
		QFileSection fileSection = callableUnit.getFileSection();
		if(fileSection == null)
			return null;
		
		for(QDisplayTerm displayTerm: fileSection.getDisplays()) {
			for(QDataTerm<?> displayElement: displayTerm.getFormat().getDefinition().getElements()) {
				if(getCompilationUnit().equalsTermName(target.getName(), displayElement.getName()))
					return displayElement;
			}
		}
		
		for(QDataSetTerm dataSet: fileSection.getDataSets()) {
			for(QDataTerm<?> dataSetElement: dataSet.getFormat().getDefinition().getElements()) {
				if(getCompilationUnit().equalsTermName(target.getName(), dataSetElement.getName()))
					return dataSetElement;
			}
		}
		
		for(QPrintTerm printTerm: fileSection.getPrinters()) {
			for(QDataTerm<?> printElement: printTerm.getFormat().getDefinition().getElements()) {
				if(getCompilationUnit().equalsTermName(target.getName(), printElement.getName()))
					return printElement;
			}
		}
		
		return null;
	}

	@SuppressWarnings("unchecked")
	private void completeDefinition(QDataTerm<?> source, QDataTerm<?> target) {
		
		QCompilerLinker compilerLinker = source.getFacet(QCompilerLinker.class);
		if (compilerLinker != null && target.getFacet(QExternalFile.class) == null)
			target.getFacets().add((QFacet) EcoreUtil.copy((EObject) compilerLinker));
		else if (compilerLinker != null)
			throw new RuntimeException("Unexpected condition: 4m8x7t8764xm04w70");

		switch (target.getDataTermType()) {
		case UNARY_ATOMIC:

			switch (source.getDataTermType()) {
			case UNARY_ATOMIC:
				appendDefinition(source.getDefinition(), target);
				break;
			case UNARY_COMPOUND:
				QCharacterDef charDefTo = (QCharacterDef) target.getDefinition();
				QDataStructDef dataStructDefFrom = (QDataStructDef) source.getDefinition();
				if (containsLike(dataStructDefFrom))
					visit(source);
				setLength(charDefTo, dataStructDefFrom);
				break;
			case MULTIPLE_ATOMIC:
				QMultipleAtomicDataDef<?> multipleAtomicDataDef = (QMultipleAtomicDataDef<?>) source.getDefinition();
				appendDefinition(multipleAtomicDataDef.getArgument(), target);
				break;
			case MULTIPLE_COMPOUND:
				charDefTo = (QCharacterDef) target.getDefinition();
				QStrollerDef<?> strollerDef = (QStrollerDef<?>) source.getDefinition();
				if (containsLike(strollerDef))
					visit(source);
				setLength(charDefTo, strollerDef);
				appendDefinition(strollerDef, target);
				break;
			}

			break;
		case UNARY_COMPOUND:

			switch (source.getDataTermType()) {
			case UNARY_ATOMIC:
			case MULTIPLE_ATOMIC:
				throw new DevelopmentKitCompilerRuntimeException("Invalid like atomic to compound: " + source.getName() + "->" + target.getName());
			case UNARY_COMPOUND:
				QCompoundDataDef<?, ?> compoundDataDefTarget = (QCompoundDataDef<?, ?>) target.getDefinition();
				if (!compoundDataDefTarget.getElements().isEmpty())
					throw new DevelopmentKitCompilerRuntimeException("Invalid compound to compound: " + source.getName() + "->" + target.getName());

				copyCompoundDataDef((QCompoundDataDef<?, ?>) source.getDefinition(), compoundDataDefTarget);
				appendDefinition(source.getDefinition(), target);
				compoundDataDefTarget.setQualified(true);
				if (compilerLinker == null) {
					compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
					compilerLinker.setLinkedTermName(source.getName());
					target.getFacets().add(compilerLinker);
				}
				break;
			case MULTIPLE_COMPOUND:
				((QCompoundDataDef<?, ?>) target.getDefinition()).setQualified(true);
				QStrollerDef<?> strollerDef = (QStrollerDef<?>) source.getDefinition();
				copyCompoundDataDef((QCompoundDataDef<?, ?>) source.getDefinition(), (QCompoundDataDef<?, QDataTerm<?>>) target.getDefinition());
				appendDefinition(strollerDef, target);
				compilerLinker = target.getFacet(QCompilerLinker.class);
				strollerDef.setQualified(true);
				if (compilerLinker == null) {
					compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
					compilerLinker.setLinkedTermName(source.getName());
					target.getFacets().add(compilerLinker);
				}
				break;
			}
			break;
		case MULTIPLE_ATOMIC:

			QMultipleAtomicDataDef<?> multipleAtomicTarget = (QMultipleAtomicDataDef<?>) target.getDefinition();

			switch (source.getDataTermType()) {
			case UNARY_ATOMIC:
				appendDefinitionToMultiple(source.getDefinition(), (QDataTerm<QMultipleAtomicDataDef<?>>) target);
				break;
			case UNARY_COMPOUND:
				QCharacterDef charDefTo = (QCharacterDef) multipleAtomicTarget.getArgument();
				QDataStructDef dataStructDefFrom = (QDataStructDef) source.getDefinition();
				if (containsLike(dataStructDefFrom))
					visit(source);
				setLength(charDefTo, dataStructDefFrom);
				break;
			case MULTIPLE_ATOMIC:
				QMultipleAtomicDataDef<?> multipleAtomicSource = (QMultipleAtomicDataDef<?>) source.getDefinition();
				appendDefinitionToMultiple(multipleAtomicSource.getArgument(), (QDataTerm<QMultipleAtomicDataDef<?>>) target);
				break;
			case MULTIPLE_COMPOUND:
				charDefTo = (QCharacterDef) multipleAtomicTarget.getArgument();
				QStrollerDef<?> strollerDef = (QStrollerDef<?>) source.getDefinition();
				if (containsLike(strollerDef))
					visit(source);
				setLength(charDefTo, strollerDef);
				appendDefinition(strollerDef, target.getDefinition());
				break;
			}
			break;
		case MULTIPLE_COMPOUND:
			QMultipleCompoundDataDef<?, ?> multipleCompoundTarget = (QMultipleCompoundDataDef<?, ?>) target.getDefinition();

			switch (source.getDataTermType()) {
			case UNARY_ATOMIC:
			case MULTIPLE_ATOMIC:
				throw new DevelopmentKitCompilerRuntimeException("Invalid like atomic to compound: " + source.getName() + "->" + target.getName());
			case UNARY_COMPOUND:
				copyCompoundDataDef((QCompoundDataDef<?, ?>) source.getDefinition(), multipleCompoundTarget);
				appendDefinition(source.getDefinition(), target.getDefinition());
				multipleCompoundTarget.setQualified(true);
				if (compilerLinker == null) {
					compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
					compilerLinker.setLinkedTermName(source.getName());
					target.getFacets().add(compilerLinker);
				}
				break;
			case MULTIPLE_COMPOUND:

				QMultipleCompoundDataDef<?, ?> multipleCompoundSource = (QMultipleCompoundDataDef<?, ?>) source.getDefinition();
				copyCompoundDataDef(multipleCompoundSource, multipleCompoundTarget);
				appendDefinition(source.getDefinition(), target.getDefinition());
				multipleCompoundTarget.setQualified(true);
				if (compilerLinker == null) {
					compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
					compilerLinker.setLinkedTermName(source.getName());
					target.getFacets().add(compilerLinker);
				}
				break;
			}
			break;
		}
		
	}

	private boolean containsLike(QDataStructDef structDef) {

		boolean result = false;

		for (QDataTerm<QBufferedDataDef<?>> element : structDef.getElements()) {
			if (element.getLike() != null) {
				result = true;
				break;
			}
		}

		return result;
	}

	private boolean containsLike(QStrollerDef<?> strollerDef) {

		boolean result = false;

		for (QDataTerm<QBufferedDataDef<?>> element : strollerDef.getElements()) {
			if (element.getLike() != null) {
				result = true;
				break;
			}
		}

		return result;
	}

	@Override
	public RPJAbstractDataRefactor copy() {
		return new RPJDataLikeRefactor(getCompilationUnit());
	}
}