/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.il.core.meta.e4;

import org.eclipse.emf.ecore.ETypedElement;
import org.smeup.sys.il.core.meta.QCardinality;

public class E4CardinalityAdapter implements QCardinality {

	private static final long serialVersionUID = 1L;

	private ETypedElement element;

	public E4CardinalityAdapter(ETypedElement element) {
		this.element = element;
	}

	@Override
	public int getMin() {
		return this.element.getLowerBound();
	}

	@Override
	public void setMin(int value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isMandatory() {
		return this.element.getLowerBound() > 0;
	}

	@Override
	public boolean isMultiple() {
		return this.element.getUpperBound() > 1;
	}

	@Override
	public int getMax() {
		return this.element.getUpperBound();
	}

	@Override
	public void setMax(int value) {
		throw new UnsupportedOperationException();
	}
}