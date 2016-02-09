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

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectRegistry;
import org.smeup.sys.il.core.QObjectRegistryFactory;
import org.smeup.sys.os.core.QRunManager;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobManager;

public class BaseRunManagerImpl implements QRunManager {

	@Inject
	private QObjectRegistryFactory objectRegistryFactory;
	
	private QObjectRegistry<QJobManager> jobRegistry;
	
	@PostConstruct
	private void init() {
		jobRegistry = objectRegistryFactory.createObjectRegistry(QJobManager.class);
	}
	
	@Override
	public QJobManager locate() {
		
		QJobManager jobManager = null;
		
		for(QJobManager jm: jobRegistry.list()) {
			jobManager = jm;
			break;
		}
		
		return jobManager;
	}

	@Override
	public <S> S locate(QJobCapability capability, Class<S> klass) {

		QObjectRegistry<S> objectRegistry = objectRegistryFactory.createObjectRegistry(klass);

		S object = null;
		for(S o: objectRegistry.list()) {
			object = o;
			break;
		}
		
		return object;
	}

}
