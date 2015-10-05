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

import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerLinker;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.impl.DataTermVisitorImpl;
import org.smeup.sys.os.file.QExternalFile;

public class RPJDataTermLinker extends DataTermVisitorImpl {

	@Inject
	private RPJCallableUnitLinker callableUnitLinker;
	@Inject
	private QCompilationUnit compilationUnit;	

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QDataTerm<?> dataTerm) {
		
		switch (dataTerm.getDataTermType()) {
		case MULTIPLE_ATOMIC:
			break;
		case UNARY_ATOMIC:
			break;

		case MULTIPLE_COMPOUND:
			QExternalFile externalFile = dataTerm.getFacet(QExternalFile.class);
			if (externalFile != null) {
				QCompilerLinker compilerLinker = dataTerm.getFacet(QCompilerLinker.class);
				if(compilerLinker == null) {
					compilerLinker = callableUnitLinker.linkExternalFile(compilationUnit.getContext(), (QDataTerm<QCompoundDataDef<?, QDataTerm<?>>>) dataTerm, externalFile);
					if(compilerLinker != null)
						dataTerm.getFacets().add(compilerLinker);
				}
			}

			break;
		case UNARY_COMPOUND:
			externalFile = dataTerm.getFacet(QExternalFile.class);
			if (externalFile != null) {
				QCompilerLinker compilerLinker = dataTerm.getFacet(QCompilerLinker.class);
				if(compilerLinker == null) {
					compilerLinker = callableUnitLinker.linkExternalFile(compilationUnit.getContext(), (QDataTerm<QCompoundDataDef<?, QDataTerm<?>>>) dataTerm, externalFile);
					if(compilerLinker != null)
						dataTerm.getFacets().add(compilerLinker);
				}
			}

			break;
		
		}
		
		return false;
	}
}
