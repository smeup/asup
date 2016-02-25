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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.il.core.QObjectNameable;

public class NIOSourceEntryFileAdapter implements QSourceEntry {

	private static final long serialVersionUID = 1L;

	private transient NIOObjectSerializer serializer;
	private QProject project;
	private transient Path file;

	public NIOSourceEntryFileAdapter(NIOObjectSerializer serializer, QProject project, Path file) {
		this.serializer = serializer;
		this.project = project;
		this.file = file;
	}

	@Override
	public URI getLocation() {
		return file.toUri();
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
		return Files.newInputStream(file);
	}

	@Override
	public String getName() {

		String fileName = file.getFileName().toString();
		if (fileName.toUpperCase().endsWith(".xmi")) {
			return fileName.substring(0, fileName.length() - 4);
		}
		return fileName;
	}

	@Override
	public String getText() {
		try {
			BufferedReader reader = Files.newBufferedReader(file);
			String line = reader.readLine();

			if (line != null) {
				line = reader.readLine();
				if (line != null) {
					Pattern pattern = Pattern.compile("text=\"(.*?)\"");
					Matcher m = pattern.matcher(line);
					if (m.find()) {
						String result = m.group();
						result = result.substring(6, result.length() - 1);
						reader.close();
						return result;
					}
				}
			}
			reader.close();
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
	public String qURI() {
		return getLocation().toString();
	}
}
