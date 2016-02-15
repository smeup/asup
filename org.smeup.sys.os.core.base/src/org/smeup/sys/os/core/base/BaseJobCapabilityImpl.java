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
import java.util.List;

import org.smeup.sys.il.core.ctx.CapabilityRight;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobReference;

public class BaseJobCapabilityImpl extends ObjectImpl implements QJobCapability {

	private static final long serialVersionUID = 1L;
	
	private QJobReference jobReference;
	private URI objectURI;
	private List<CapabilityRight> rights;
	private int port;
	
	protected BaseJobCapabilityImpl(QJobReference jobReference, URI objectURI, List<CapabilityRight> rights, int port) {
		this.jobReference = jobReference;
		this.objectURI = objectURI;
		this.rights = rights;
		this.port = port;
	}

	@Override
	public QJobReference getJobReference() {
		return jobReference;
	}

	@Override
	public URI getObjectURI() {
		return objectURI;
	}

	@Override
	public String getObjectName() {
		return objectURI.getFragment();
	}
	
	@Override
	public List<CapabilityRight> getRights() {
		return rights;
	}

	@Override
	public int getPort() {
		return this.port;
	}
}