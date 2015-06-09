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

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.QSourceEntry;

public class E4ProjectAdapter implements QProject {

	private static final long serialVersionUID = 1L;
	
	private IProject project;
	
	public E4ProjectAdapter(IProject project) {
		this.project = project;
	}

	@Override
	public String getName() {
		// URIUtil.lastSegment(project.getLocationURI());
		return project.getName();
	}

	@Override
	public String getText() {
		
		if (!project.isOpen())
			try {
				project.open(null);
			} catch (CoreException e) {
				throw new RuntimeException(e);
			}

		IFile file = project.getFile("META-INF/MANIFEST.MF");
		InputStream is = null;
		try {
			 is = file.getContents();
	
			Manifest manifest = new Manifest(is);
			Attributes attributes = manifest.getMainAttributes();
			
			return attributes.getValue("Bundle-Name");
		} catch (CoreException | IOException e) {
			throw new RuntimeException(e);
		}
		finally {
			if(is != null)
				try {
					is.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
		}
	}

	@Override
	public URI getLocation() {
		return project.getRawLocationURI();
	}

	@Override
	public QSourceEntry getParent() {
		return null;
	}

	@Override
	public QSourceEntry getRoot() {
		return null;
	}

	@Override
	public boolean isRoot() {
		return true;
	}

}
