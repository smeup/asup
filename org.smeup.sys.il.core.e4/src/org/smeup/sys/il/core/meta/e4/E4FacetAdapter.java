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
package org.smeup.sys.il.core.meta.e4;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.il.core.meta.QFacet;

public class E4FacetAdapter implements QFacet {

	private static final long serialVersionUID = 1L;
	private EAnnotation annotation;
	
	public E4FacetAdapter(EAnnotation annotation) {
		this.annotation = annotation;
	}

	@Override
	public String qURI() {
		return EcoreUtil.getURI(annotation).toString();
	}
}
