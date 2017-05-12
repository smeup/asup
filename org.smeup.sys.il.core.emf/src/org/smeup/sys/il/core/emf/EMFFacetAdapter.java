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
import org.smeup.sys.il.core.meta.QFacet;

public class EMFFacetAdapter implements QFacet {

	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private EAnnotation annotation;
	
	public EMFFacetAdapter(EAnnotation annotation) {
		this.annotation = annotation;
	}
}
