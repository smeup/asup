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
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.il.core.QOverlay;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.il.data.def.QMultipleAtomicBufferedDataDef;
import org.smeup.sys.il.data.def.QMultipleAtomicDataDef;
import org.smeup.sys.il.data.def.QStrollerDef;
import org.smeup.sys.il.data.def.QUnaryAtomicBufferedDataDef;
import org.smeup.sys.il.data.term.QDataTerm;

public class RPJDataOverlayRefactor extends RPJAbstractDataRefactor {

	@Inject
	public RPJDataOverlayRefactor(QCompilationUnit compilationUnit) {
		super(compilationUnit);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QDataTerm<?> dataTerm) {

		QOverlay overlay = dataTerm.getFacet(QOverlay.class);
		if (overlay == null)
			return super.visit(dataTerm);

		if (overlay.getName() == null)
			return super.visit(dataTerm);

		QDataTerm<?> overlayTerm = getCompilationUnit().getDataTerm(overlay.getName(), true);
		if (overlayTerm == null)
			throw new RuntimeException("Unexpected condition: 57as43534dftgasd8764xm0437");

		switch (dataTerm.getDataTermType()) {
		case MULTIPLE_ATOMIC:
			super.visit(dataTerm);
			break;
		case MULTIPLE_COMPOUND:
			super.visit(dataTerm);
			break;
		case UNARY_COMPOUND:
			super.visit(dataTerm);
			break;
		case UNARY_ATOMIC:

			switch (overlayTerm.getDataTermType()) {
			case UNARY_ATOMIC:
			case UNARY_COMPOUND:
				return super.visit(dataTerm);

			case MULTIPLE_ATOMIC:
				QMultipleAtomicBufferedDataDef<?> multipleAtomicDataDef = (QMultipleAtomicBufferedDataDef<?>) EcoreUtil.copy((EObject)overlayTerm.getDefinition());
				multipleAtomicDataDef.setArgument((QUnaryAtomicBufferedDataDef<?>) dataTerm.getDefinition());
				((QDataTerm<QMultipleAtomicDataDef<?>>)dataTerm).setDefinition(multipleAtomicDataDef);				
				appendDefinition(overlayTerm.getDefinition(), dataTerm);
				
				break;
			case MULTIPLE_COMPOUND:
				QStrollerDef<?> strollerDef = (QStrollerDef<?>) overlayTerm.getDefinition();
				multipleAtomicDataDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createArrayDef();
				multipleAtomicDataDef.setDimension(strollerDef.getDimension());
				setLength((QCharacterDef)dataTerm.getDefinition(), strollerDef);
				multipleAtomicDataDef.setArgument((QUnaryAtomicBufferedDataDef<?>) dataTerm.getDefinition());
				((QDataTerm<QMultipleAtomicDataDef<?>>)dataTerm).setDefinition(multipleAtomicDataDef);
				appendDefinition(overlayTerm.getDefinition(), dataTerm);
				break;
			}
			break;
		}
		return false;
	}

	@Override
	public RPJAbstractDataRefactor copy() {
		return new RPJDataOverlayRefactor(getCompilationUnit());
	}
}