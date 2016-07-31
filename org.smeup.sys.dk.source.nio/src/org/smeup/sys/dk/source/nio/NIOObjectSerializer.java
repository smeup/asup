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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.rt.core.QApplication;

public class NIOObjectSerializer {

	private QApplication application;
	private ResourceSet resourceSet;

	public NIOObjectSerializer(QApplication application, ResourceSet resourceSet) {
		this.application = application;
		this.resourceSet = resourceSet;
	}

	public <T extends QObjectNameable> ByteArrayOutputStream serialize(QProject project, Class<T> klass, String name, T object) throws IOException {

		URI uri = buildURI(project, klass, name);

		synchronized (uri.toString().intern()) {
			NIOResourceImpl resource = (NIOResourceImpl) resourceSet.getResource(uri, false);
			if (resource == null)
				resource = (NIOResourceImpl) resourceSet.createResource(uri, "asup");
			else
				clearResource(resource);

			((BasicEObjectImpl) object).eSetResource(null, null);
			resource.getContents().add((EObject) object);

			ByteArrayOutputStream output = new ByteArrayOutputStream();
			resource.doSave(output, Collections.EMPTY_MAP);
			
			return output;
		}
	}

	@SuppressWarnings("unchecked")
	public <T extends QObjectNameable> T deserialize(QProject project, Class<T> klass, String name, InputStream inputStream) throws IOException {

		URI uri = buildURI(project, klass, name);

		synchronized (uri.toString().intern()) {
			NIOResourceImpl resource = (NIOResourceImpl) resourceSet.getResource(uri, false);
			if (resource == null)
				resource = (NIOResourceImpl) resourceSet.createResource(uri, "asup");
			else {
				clearResource(resource);
			}

			resource.doLoad(inputStream, resourceSet.getLoadOptions());
			if (resource.getContents().isEmpty())
				return null;

			EObject eObject = resource.getContents().get(0);
			
			return (T) eObject;
		}
	}

	private void clearResource(NIOResourceImpl resource) {
		BasicEObjectImpl oldObject = null;
		if (resource.isLoaded() && !resource.getContents().isEmpty()) {
			oldObject = (BasicEObjectImpl) resource.getContents().get(0);
			resource.getContents().clear();
			oldObject.eSetResource(resource, null);
		}
	}

	private <T extends QObjectNameable> URI buildURI(QProject project, Class<T> klass, String name) {

		String uri = "asup://" + application.getName() + "/" + project.getName() + "/" + klass.getSimpleName().toLowerCase().substring(1);
		URI eURI = URI.createURI(uri);
		
		// TODO remove me
		eURI = eURI.appendFragment(name);
		
		return eURI;
	}
}