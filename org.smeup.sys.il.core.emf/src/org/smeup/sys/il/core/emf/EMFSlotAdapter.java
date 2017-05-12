/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.il.core.emf;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.meta.QCardinality;
import org.smeup.sys.il.core.meta.QSlot;

public class EMFSlotAdapter implements QSlot {

	private ETypedElement element;
	private String name;

	public EMFSlotAdapter(ETypedElement element) {
		this(element, null);
	}
	
	public EMFSlotAdapter(ETypedElement element, String name) {
		this.element = element;
		this.name = name;
	}

	@Override
	public String getName() {
		if(this.name != null)
			return this.name;
		else
			return element.getName();
	}

	@Override
	public QCardinality getCardinality() {
		return new EMFCardinalityAdapter(this.element);
	}

	@Override
	public Object getDefaultValue() {
		if (element instanceof EStructuralFeature) 
			return ((EStructuralFeature)this.element).getDefaultValue();
		return null;
	}

	@Override
	public boolean isTransient() {
		if (element instanceof EStructuralFeature) 
			return ((EStructuralFeature)this.element).isTransient();
		return true;
	}

	@Override
	public boolean isVolatile() {		
		if (element instanceof EStructuralFeature) 
			return ((EStructuralFeature)this.element).isVolatile();
		return true;
	}

	@Override
	public QObject getValue(String nsPrefix) {

		EAnnotation eAnnotation = this.element.getEAnnotation(nsPrefix);

		if (eAnnotation == null)
			return null;

		EObject eObject = EcoreUtil.create((EClass) eAnnotation.getReferences().get(0));

		for (String key : eAnnotation.getDetails().keySet()) {
			EStructuralFeature dataDefFeature = eObject.eClass().getEStructuralFeature(key);

			if (dataDefFeature == null)
				continue;

			if (dataDefFeature.getDefaultValue() instanceof Number)
				eObject.eSet(dataDefFeature, Integer.parseInt(eAnnotation.getDetails().get(key)));
			else
				eObject.eSet(dataDefFeature, eAnnotation.getDetails().get(key));
		}

		return (QObject) eObject;
	}

	@Override
	public String toString() {
		return this.element.toString();
	}
}