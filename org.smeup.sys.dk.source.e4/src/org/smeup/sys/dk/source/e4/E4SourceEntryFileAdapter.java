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
package org.smeup.sys.dk.source.e4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.smeup.sys.dk.source.QSourceEntry;

public class E4SourceEntryFileAdapter implements QSourceEntry {

	private static final long serialVersionUID = 1L;
	
	private transient IFile file;
	
	public E4SourceEntryFileAdapter(IFile file) {
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
	public QSourceEntry getRoot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRoot() {
		return false;
	}

	@Override
	public OutputStream getOutputStream() throws IOException {
		return new FileOutputStream(getLocation().getRawPath());
	}

	@Override
	public InputStream getInputStream() throws IOException {
		return new FileInputStream(getLocation().getRawPath());
	}

}
