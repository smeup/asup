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
package org.smeup.sys.il.core.java.asf;

import java.net.URI;

import org.smeup.sys.il.core.QURIs;

public class ASFURIUtilImpl implements QURIs {

	@Override
	public String getBaseName(URI uri) {
		return org.apache.commons.io.FilenameUtils.getBaseName(uri.getRawPath());
	}

}
