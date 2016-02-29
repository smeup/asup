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
package org.smeup.sys.dk.source.jdt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.il.core.QObjectNameable;

public class JDTSourceEntryFileAdapter implements QSourceEntry {

	private static final long serialVersionUID = 1L;
	
	private transient JDTObjectSerializer serializer;
	private QProject project;
	private transient IFile file;
	
	public JDTSourceEntryFileAdapter(JDTObjectSerializer serializer, QProject project, IFile file) {
		this.serializer = serializer;
		this.project = project;
		this.file = file;
	}
	
	@Override
	public URI getLocation() {
		return file.getRawLocationURI();
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
	}

	@Override
	public String getName() {
		String fileName = file.getName();
		if (fileName.toUpperCase().endsWith(".XMI")) {
			return fileName.substring(0, fileName.length() - 4);
		}
		return fileName;
	}

	@Override
	//TODO: migliorare implementazione
	public String getText() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(file.getContents()));
			String line;
				line = reader.readLine();
	        if (line != null){
	            line = reader.readLine();
	            if (line != null) {
	            	Pattern pattern = Pattern.compile("text=\"(.*?)\"");
	            	Matcher m = pattern.matcher(line);
	            	if (m.find()) {
	            		String result = m.group();
	            		return result.substring(6, result.length()-1);
	            	}
	            }
	        }
	        return null;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public <T extends QObjectNameable> T load(Class<T> type) throws IOException {
		return serializer.deserialize(getProject(), type, getName(), getInputStream());
	}

	@Override
	public URI qURI() {
		return getLocation();
	}
}
