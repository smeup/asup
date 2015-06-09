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

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.smeup.sys.il.core.meta.QCardinality;
import org.smeup.sys.il.core.meta.QDomain;
import org.smeup.sys.il.core.meta.QFacet;
import org.smeup.sys.il.core.meta.QSlot;

public class E4SlotAdapter implements QSlot {

	private EStructuralFeature structuralFeature;
	
	public E4SlotAdapter(EStructuralFeature structuralFeature) {
		this.structuralFeature = structuralFeature;
	}
	
	@Override
	public String getName() {
		return structuralFeature.getName();
	}

	@Override
	public QCardinality getCardinality() {	
		return new E4CardinalityAdapter(this.structuralFeature);
	}

	@Override
	public Object getDefaultValue() {
		return this.structuralFeature.getDefaultValue();
	}

	@Override
	public QDomain getDomain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isTransient() {
		return this.structuralFeature.isTransient();
	}

	@Override
	public boolean isVolatile() {
		return this.structuralFeature.isVolatile();
	}

	@Override
	public QFacet getFacet(String nsPrefix) {
		
		EAnnotation annotation = this.structuralFeature.getEAnnotation(nsPrefix);

		if(annotation != null) 
			return new E4FacetAdapter(annotation);

		return null;
	}
}