/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mattia Rocchi				- Initial API and implementation
 *
 */
package org.smeup.sys.il.memo.jdt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.dk.source.QDevelopmentKitSourceFactory;
import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.QProjectDef;
import org.smeup.sys.dk.source.jdt.JDTSourceManagerImpl;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.IntegratedLanguageMemoryRuntimeException;
import org.smeup.sys.il.memo.QResource;
import org.smeup.sys.il.memo.QResourceDef;
import org.smeup.sys.il.memo.QResourceHelper;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.rt.core.QApplication;

public class JDTResourceProviderImpl implements QResourceProvider {

	private JDTSourceManagerImpl sourceManager;
	
	@Inject
	public JDTResourceProviderImpl(QApplication application, QResourceManager resourceManager) {

		this.sourceManager = new JDTSourceManagerImpl(application, "asup-obj");
		
		resourceManager.registerProvider(QObjectNameable.class, this);
	}

	@Override
	public void createResource(QContextProvider contextProvider, QResourceDef resourceDef, boolean replace) {
		
		QProjectDef projectDef = QDevelopmentKitSourceFactory.eINSTANCE.createProjectDef();
		projectDef.setName(resourceDef.getName());
		projectDef.setText(resourceDef.getText());
		
		try {
			sourceManager.createProject(contextProvider.getContext(), projectDef, replace);
		} catch (IOException e) {
			throw new IntegratedLanguageMemoryRuntimeException(e);
		}
	}
	
	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String resource) {

		QProject project = sourceManager.getProject(contextProvider.getContext(), resource);
		if(project == null)
			return null;
		
		QResourceReader<T> resourceReader = new JDTResourceReaderImpl<T>(contextProvider, sourceManager, klass, project);

		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, List<String> resources) {

		List<QResourceReader<T>> readers = new ArrayList<QResourceReader<T>>();
		for (String resource: resources) {
			QProject project = sourceManager.getProject(contextProvider.getContext(), resource);
			if(project == null)
				continue;
			
			JDTResourceReaderImpl<T> resourceReader = new JDTResourceReaderImpl<T>(contextProvider, sourceManager, klass, project);
			readers.add(resourceReader);
		}

		return QResourceHelper.wrapReader(readers);
	}
	
	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, final String resource) {

		QProject project = sourceManager.getProject(contextProvider.getContext(), resource);
		if(project == null)
			return null;

		QResource qResource = new QResource() {
		
			@Override
			public String getName() {
				return resource;
			}
		};
		
		QResourceWriter<T> resourceWriter = new JDTResourceWriterImpl<T>(contextProvider, sourceManager, qResource, klass, project);

		return resourceWriter;
	}
}