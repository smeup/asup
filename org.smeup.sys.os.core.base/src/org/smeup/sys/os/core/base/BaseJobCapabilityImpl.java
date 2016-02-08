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
package org.smeup.sys.os.core.base;

import java.net.URI;
import java.security.Principal;

import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobReference;

public class BaseJobCapabilityImpl implements QJobCapability {

	private static final long serialVersionUID = 1L;
	
	private QJobReference jobReference;
	private Principal principal;
	private URI address;
	
	protected BaseJobCapabilityImpl(QJobReference jobReference, Principal principal, URI address) {
		this.jobReference = jobReference;
		this.principal = principal;
		this.address = address;
	}
	
	@Override
	public Principal getJavaPrincipal() {
		return principal;
	}

	@Override
	public URI getObjectAddress() {
		return address;
	}

	@Override
	public QJobReference getJobReference() {
		return jobReference;
	}

	@Override
	public String getObjectID() {
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(getObjectAddress().toString());
		return uri.fragment();
	}
}
