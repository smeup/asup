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
package org.smeup.sys.os.core.base;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.smeup.sys.il.memo.QResource;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.QResourceListener;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;
import org.smeup.sys.os.type.QTypedObject;

public class BaseTypedListenerImpl implements QResourceListener<QTypedObject> {


	@Inject
	private QResourceManager resourceManager;
	
	@PostConstruct
	public void init() {
		resourceManager.registerListener(QTypedObject.class, this);
	}
	
	@Override
	public void handleEvent(QResourceEvent<QTypedObject> event) {
		switch (event.getType()) {
		case PRE_SAVE:
			QResource<QTypedObject> resource = event.getResource();
			QTypedObject typedObject = event.getSource();
			
			EObject eObject = (EObject) typedObject;
			
			// library
			eObject.eSet(QOperatingSystemTypePackage.eINSTANCE.getTypedObject_Library(), resource.getName());

			QJob job = resource.getContextProvider().getContext().get(QJob.class);
			
			// creation info
			if (typedObject.getCreationInfo() == null)
				typedObject.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(job));
			
			break;

		default:
			break;
		}
	}

}
