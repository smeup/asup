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
 */
package org.smeup.sys.dk.compiler.rpj;

import java.util.ArrayList;

import javax.inject.Inject;

import org.smeup.sys.dk.compiler.DevelopmentKitCompilerRuntimeException;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QDataAreaDef;
import org.smeup.sys.il.data.def.QMultipleAtomicBufferedDataDef;
import org.smeup.sys.il.data.def.QUnaryAtomicBufferedDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QOverlay;
import org.smeup.sys.il.expr.QExpressionParser;

public class RPJDataLengthCompleter extends RPJAbstractDataRefactor {

	private QExpressionParser expressionParser;
	private QDataContext dataContext;

	@Inject
	public RPJDataLengthCompleter(QCompilationUnit compilationUnit, QExpressionParser expressionParser, QDataContext dataContext) {
		super(compilationUnit);
		this.expressionParser = expressionParser;
		this.dataContext = dataContext;
	}

	@Override
	public RPJAbstractDataRefactor copy() {
		RPJDataLengthCompleter dataLengthCompleter = new RPJDataLengthCompleter(getCompilationUnit(), expressionParser, dataContext);
		getCompilationUnit().getContext().inject(dataLengthCompleter);
		return dataLengthCompleter;
	}

	@Override
	public boolean visit(QDataTerm<?> dataTerm) {

		if (dataTerm.getDataTermType().isAtomic())
			return super.visit(dataTerm);

		QCompoundDataDef<?, ?> compoundDataDef = null;
		if(dataTerm.getDefinition() instanceof QDataAreaDef<?>) {
			QDataAreaDef<?> dataAreaDef = (QDataAreaDef<?>) dataTerm.getDefinition();
			compoundDataDef = (QCompoundDataDef<?, ?>) dataAreaDef.getArgument();
		}
		else
			compoundDataDef = (QCompoundDataDef<?, ?>) dataTerm.getDefinition();

		for (QDataTerm<?> element : new ArrayList<QDataTerm<?>>(compoundDataDef.getElements())) {
			QBufferedDataDef<?> bufferedDataDef = (QBufferedDataDef<?>) element.getDefinition();
			if (bufferedDataDef.getLength() != 0)
				continue;
			
			int length = calculateLength(dataTerm, element);

			if(length == 0)
				throw new DevelopmentKitCompilerRuntimeException("Unexpected condition: sd34623vr8wevrw");
			
			if(element.getDefinition() instanceof QMultipleAtomicBufferedDataDef<?>) {
				QMultipleAtomicBufferedDataDef<?> multipleAtomicBufferedDataDef = (QMultipleAtomicBufferedDataDef<?>) element.getDefinition();
				if(multipleAtomicBufferedDataDef.getArgument().getLength() != 0)
					throw new DevelopmentKitCompilerRuntimeException("Unexpected condition: 7w746e7qw6re7ewq");
				
				multipleAtomicBufferedDataDef.getArgument().setLength(length/multipleAtomicBufferedDataDef.getDimension());
			}
			else if(element.getDefinition() instanceof QUnaryAtomicBufferedDataDef<?>) {
				QUnaryAtomicBufferedDataDef<?> unaryAtomicBufferedDataDef = (QUnaryAtomicBufferedDataDef<?>) element.getDefinition();
				if(unaryAtomicBufferedDataDef.getLength() != 0)
					throw new DevelopmentKitCompilerRuntimeException("Unexpected condition: 7w746e8ewtr8wet7ewq");
				
				unaryAtomicBufferedDataDef.setLength(length);
			}
			else
				throw new DevelopmentKitCompilerRuntimeException("Unexpected condition: 7w745234v7cr7ev");
		}
		
		return false;
	}

	private int calculateLength(QDataTerm<?> structTerm, QDataTerm<?> targetTerm) {

		int targetNextPosition = 1;
		QOverlay targetOverlay = targetTerm.getFacet(QOverlay.class);

		QCompoundDataDef<?, ?> compoundDataDef = (QCompoundDataDef<?, ?>) structTerm.getDefinition();
		for (QDataTerm<?> dataElement : new ArrayList<QDataTerm<?>>(compoundDataDef.getElements())) {
			if (dataElement.equals(targetTerm))
				continue;

			QOverlay elementOverlay = dataElement.getFacet(QOverlay.class);
			if (elementOverlay == null)
				continue;

			if (elementOverlay.getName() == null || !elementOverlay.getName().equalsIgnoreCase(targetTerm.getName()))
				continue;

			if (targetOverlay != null)
				targetNextPosition += targetOverlay.getPosition() + 1;

			if (elementOverlay.getPosition() >= 1)
				targetNextPosition = elementOverlay.getPosition();

			QBufferedDataDef<?> bufferedDataDef = (QBufferedDataDef<?>) dataElement.getDefinition();
			targetNextPosition += bufferedDataDef.getSize();
		}
		
		return targetNextPosition-1;
	}
}