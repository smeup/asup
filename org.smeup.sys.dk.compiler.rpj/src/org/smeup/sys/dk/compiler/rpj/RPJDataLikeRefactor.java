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
import org.smeup.sys.il.core.meta.QFacet;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.os.file.QExternalFile;

public class RPJDataLikeRefactor extends RPJAbstractDataRefactor {
	
	@Inject
	public RPJDataLikeRefactor(QCompilationUnit compilationUnit) {
		super(compilationUnit);
	}

	@Override
	public boolean visit(QDataTerm<?> dataTerm) {

		if(dataTerm.getDataTermType()==null)
			throw new DevelopmentKitCompilerRuntimeException("Unexpected condition: sdbfg9br9wer6");
		
		switch (dataTerm.getDataTermType()) {
		case MULTIPLE_ATOMIC:
			// like
			if (dataTerm.getLike() != null) {

				QDataTerm<?> like = getCompilationUnit().getDataTerm(dataTerm.getLike(), true);
				if (like == null)
					throw new RuntimeException("Unexpected condition: 4m8x7t8764xm04370");

				if(like.getLike() != null) {
					getTermsTodo().push(dataTerm);
					break;
				}
				
				QCompilerLinker compilerLinker = like.getFacet(QCompilerLinker.class);
				if (compilerLinker != null && dataTerm.getFacet(QExternalFile.class) == null)
					dataTerm.getFacets().add((QFacet) EcoreUtil.copy((EObject) compilerLinker));

				setDataTerm(buildMultipleDataTerm(dataTerm, like, ((EObject)dataTerm).eClass()));
				
				dataTerm.setLike(null);
			} else
				super.visit(dataTerm);

			break;
		case MULTIPLE_COMPOUND:
			// like
			if (dataTerm.getLike() != null) {

				QDataTerm<?> like = getCompilationUnit().getDataTerm(dataTerm.getLike(), true);
				if (like == null)
					throw new RuntimeException("Unexpected condition: 4m8x7t8764xm04371");

				if(like.getLike() != null) {
					getTermsTodo().push(dataTerm);
					break;
				}

				QCompilerLinker compilerLinker = like.getFacet(QCompilerLinker.class);
				if (compilerLinker != null && dataTerm.getFacet(QExternalFile.class) == null)
					dataTerm.getFacets().add((QFacet) EcoreUtil.copy((EObject) compilerLinker));

				setDataTerm(buildMultipleDataTerm(dataTerm, like, ((EObject)dataTerm).eClass()));
				
				dataTerm.setLike(null);
			} else
				super.visit(dataTerm);

			break;
		case UNARY_ATOMIC:
			// like
			if (dataTerm.getLike() != null) {
				QDataTerm<?> like = getCompilationUnit().getDataTerm(dataTerm.getLike(), true);
				if (like == null)
					throw new IntegratedLanguageExpressionRuntimeException("Invalid data term: " + dataTerm.getLike());

				if(like.getLike() != null) {
					getTermsTodo().push(dataTerm);
					break;
				}

				QCompilerLinker compilerLinker = like.getFacet(QCompilerLinker.class);
				if (compilerLinker != null && dataTerm.getFacet(QExternalFile.class) == null)
					dataTerm.getFacets().add((QFacet) EcoreUtil.copy((EObject) compilerLinker));

				setDataTerm(buildUnaryDataTerm(dataTerm, like));
				
				dataTerm.setLike(null);
			} else
				super.visit(dataTerm);

			break;
		case UNARY_COMPOUND:

			// like
			if (dataTerm.getLike() != null) {
				QDataTerm<?> like = getCompilationUnit().getDataTerm(dataTerm.getLike(), true);
				if (like == null)
					throw new RuntimeException("Unexpected condition: 4m8x7t8764xm04373");

				if(like.getLike() != null) {
					getTermsTodo().push(dataTerm);
					break;
				}

				QCompilerLinker compilerLinker = like.getFacet(QCompilerLinker.class);
				if (compilerLinker != null && dataTerm.getFacet(QExternalFile.class) == null)
					dataTerm.getFacets().add((QFacet) EcoreUtil.copy((EObject) compilerLinker));

				setDataTerm(buildUnaryDataTerm(dataTerm, like));
				
				dataTerm.setLike(null);
			} else
				super.visit(dataTerm);

			break;
		default:
			break;
		}
		
		return false;
	}

	@Override
	public RPJAbstractDataRefactor copy() {
		return new RPJDataLikeRefactor(getCompilationUnit());
	}
}