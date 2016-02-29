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
package org.smeup.sys.dk.source.nio;

import java.net.URI;
import java.nio.file.Path;

import org.smeup.sys.dk.source.QProject;

public class NIOProjectAdapter implements QProject {

	private static final long serialVersionUID = 1L;
	
	private Path project;
	
	public NIOProjectAdapter(Path project) {
		this.project = project;
	}

	@Override
	public String getName() {
		return project.getFileName().toString();
	}

	@Override
	public String getText() {
		return "Text "+getName();
	}

	@Override
	public URI getLocation() {
		return project.toUri();
	}

	@Override
	public QProject getProject() {
		return this;
	}

	@Override
	public boolean isRoot() {
		return true;
	}

	@Override
	public URI qURI() {
		return getLocation();
	}
}