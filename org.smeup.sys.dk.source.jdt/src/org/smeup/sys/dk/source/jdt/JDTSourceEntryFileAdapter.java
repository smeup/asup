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

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.QSourceEntry;

public class JDTSourceEntryFileAdapter implements QSourceEntry {

	private static final long serialVersionUID = 1L;
	
	private QProject project;
	private transient IFile file;
	
	public JDTSourceEntryFileAdapter(QProject project, IFile file) {
		this.project = project;
		this.file = file;
	}
	
	@Override
	public URI getLocation() {
		return file.getRawLocationURI();
	}

	@Override
	public QSourceEntry getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QProject getProject() {
		return project;
	}

	@Override
	public boolean isRoot() {
		return false;
	}

	@Override
	public InputStream getInputStream() throws IOException {
		try {
			return this.file.getContents();
		} catch (CoreException e) {
			throw new IOException(e);
		}
//		return new FileInputStream(getLocation().getRawPath());
	}

}
