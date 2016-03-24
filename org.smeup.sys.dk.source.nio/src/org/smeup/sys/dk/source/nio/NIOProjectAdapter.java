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

import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.UserDefinedFileAttributeView;

import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;

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
		try {
			UserDefinedFileAttributeView view = Files.getFileAttributeView(project, UserDefinedFileAttributeView.class);
			String name = "text";
			ByteBuffer buf = ByteBuffer.allocate(view.size(name));
			view.read(name, buf);
			buf.flip();
			String value = Charset.defaultCharset().decode(buf).toString();
			return value;
		} catch (IOException e) {
			throw new IntegratedLanguageCoreRuntimeException(e);
		}
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