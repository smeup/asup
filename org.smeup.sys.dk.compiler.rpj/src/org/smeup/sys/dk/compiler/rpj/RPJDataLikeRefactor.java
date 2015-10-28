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

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.dk.compiler.DevelopmentKitCompilerRuntimeException;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerLinker;
import org.smeup.sys.dk.compiler.QDevelopmentKitCompilerFactory;
import org.smeup.sys.il.core.meta.QFacet;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QDataStructDef;
import org.smeup.sys.il.data.def.QMultipleAtomicDataDef;
import org.smeup.sys.il.data.def.QMultipleCompoundDataDef;
import org.smeup.sys.il.data.def.QStrollerDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.os.file.QExternalFile;

public class RPJDataLikeRefactor extends RPJAbstractDataRefactor {
	
	@Inject
	public RPJDataLikeRefactor(QCompilationUnit compilationUnit) {
		super(compilationUnit);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QDataTerm<?> target) {

		if (target.getDataTermType() == null)
			throw new DevelopmentKitCompilerRuntimeException("Unexpected condition: sdbfg9br9wer6");

		if (target.getLike() == null)
			return super.visit(target);

		QDataTerm<?> source = getCompilationUnit().getDataTerm(target.getLike(), true);
		if (source == null)
			throw new IntegratedLanguageExpressionRuntimeException("Invalid liked data term: " + target.getLike());

		if (source.getLike() != null)
			visit(source);

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
				if(containsLike(dataStructDefFrom)) 
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
				if(containsLike(strollerDef))
					visit(source);
				setLength(charDefTo, strollerDef);
				appendDefinition(strollerDef, target);
				break;
			}

			target.setLike(null);
			break;
		case UNARY_COMPOUND:

			switch (source.getDataTermType()) {
			case UNARY_ATOMIC:
			case MULTIPLE_ATOMIC:
				throw new DevelopmentKitCompilerRuntimeException("Invalid like atomic to compound: " + source.getName() + "->" + target.getName());
			case UNARY_COMPOUND:
				QCompoundDataDef<?, ?> compoundDataDefTarget = (QCompoundDataDef<?, ?>)target.getDefinition(); 
				if(!compoundDataDefTarget.getElements().isEmpty())
					throw new DevelopmentKitCompilerRuntimeException("Invalid compound to compound: " + source.getName() + "->" + target.getName());		

				copyCompoundDataDef((QCompoundDataDef<?, ?>) source.getDefinition(), compoundDataDefTarget);
				appendDefinition(source.getDefinition(), target);
				compoundDataDefTarget.setQualified(true);
				if(compilerLinker == null) {
					compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
					compilerLinker.setLinkedTermName(source.getName());
					target.getFacets().add(compilerLinker);
				}
				break;
			case MULTIPLE_COMPOUND:
				((QCompoundDataDef<?, ?>)target.getDefinition()).setQualified(true);
				QStrollerDef<?> strollerDef = (QStrollerDef<?>) source.getDefinition();
				copyCompoundDataDef((QCompoundDataDef<?, ?>) source.getDefinition(), (QCompoundDataDef<?, QDataTerm<?>>) target.getDefinition());
				appendDefinition(strollerDef, target);
				compilerLinker = target.getFacet(QCompilerLinker.class);				
				strollerDef.setQualified(true);
				if(compilerLinker == null) {
					compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
					compilerLinker.setLinkedTermName(source.getName());
					target.getFacets().add(compilerLinker);
				}
				break;
			}

			target.setLike(null);
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
				if(containsLike(dataStructDefFrom))
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
				if(containsLike(strollerDef))
					visit(source);
				setLength(charDefTo, strollerDef);
				appendDefinition(strollerDef, target.getDefinition());
				break;
			}
			
			target.setLike(null);
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
				if(compilerLinker == null) {
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
				if(compilerLinker == null) {
					compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
					compilerLinker.setLinkedTermName(source.getName());
					target.getFacets().add(compilerLinker);
				}
				break;
			}
			
			target.setLike(null);
			break;
		}

		return false;
	}
	
	private boolean containsLike(QDataStructDef structDef) {
		
		boolean result = false;
		
		for(QDataTerm<QBufferedDataDef<?>> element: structDef.getElements()) {
			if(element.getLike() != null) {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	private boolean containsLike(QStrollerDef<?> strollerDef) {
		
		boolean result = false;
		
		for(QDataTerm<QBufferedDataDef<?>> element: strollerDef.getElements()) {
			if(element.getLike() != null) {
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