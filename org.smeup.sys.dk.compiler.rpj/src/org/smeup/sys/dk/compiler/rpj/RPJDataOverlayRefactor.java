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
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.il.core.QOverlay;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.term.QDataTerm;

public class RPJDataOverlayRefactor extends RPJAbstractDataRefactor {

	@Inject
	public RPJDataOverlayRefactor(QCompilationUnit compilationUnit) {
		super(compilationUnit);
	}
	
	@Override
	public boolean visit(QDataTerm<?> dataTerm) {
		
		switch (dataTerm.getDataTermType()) {
		case MULTIPLE_ATOMIC:
			break;
		case MULTIPLE_COMPOUND:
			break;
		case UNARY_ATOMIC:
			// overlay
			QOverlay overlay = dataTerm.getFacet(QOverlay.class);
			if (overlay != null && overlay.getName() != null) {
				QDataTerm<?> overlayTerm = getCompilationUnit().getDataTerm(overlay.getName(), true);
				if (overlayTerm == null)
					throw new RuntimeException("Unexpected condition: 57as43534dftgasd8764xm0437");

				if (overlayTerm.getDataTermType().isMultiple())
					setDataTerm(buildMultipleDataTerm(dataTerm, overlayTerm, ((EObject)dataTerm).eClass()));
				else
					super.visit(dataTerm);

			} else
				super.visit(dataTerm);

			break;
		case UNARY_COMPOUND:
			// overlay
			overlay = dataTerm.getFacet(QOverlay.class);
			if (overlay != null) {

				if (overlay.getName() == null)
					throw new IntegratedLanguageDataRuntimeException("Unexpected condition: b8r6w8er6wver87w68");

				QDataTerm<?> overlayTerm = getCompilationUnit().getDataTerm(overlay.getName(), true);
				if (overlayTerm == null)
					throw new IntegratedLanguageDataRuntimeException("Unexpected condition: b8r6w8er6wver87w61");

				if (overlayTerm.getDataTermType().isMultiple())
					setDataTerm(buildMultipleDataTerm(dataTerm, overlayTerm, ((EObject)dataTerm).eClass()));
				else
					super.visit(dataTerm);

			} else
				super.visit(dataTerm);

			break;		
		}
		
		return false;
	}

	@Override
	public RPJAbstractDataRefactor copy() {
		return new RPJDataOverlayRefactor(getCompilationUnit());
	}
}