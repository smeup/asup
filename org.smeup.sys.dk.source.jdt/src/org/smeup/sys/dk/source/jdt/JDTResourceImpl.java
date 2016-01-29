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
package org.smeup.sys.dk.source.jdt;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.smeup.sys.il.core.QNameable;


public class JDTResourceImpl extends XMIResourceImpl implements QNameable {

	public JDTResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	public String getName() {
		URI uri = getURI();
		if (uri.segmentCount() == 0)
			return null;

		return uri.segment(0);
	}
}
