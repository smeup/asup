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
package org.smeup.sys.os.type.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;

@Program(name = "QLIDLOBJ")
public class ObjectDeleter {

	@Inject
	private QJob job;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QJobLogManager jobLogManager;

	@Entry
	public <T extends QTypedObject> void main(Object object, @DataDef(length = 7) QCharacter objectType) {

		String library = object.library.trimR();
		String name = object.name.trimR();

		@SuppressWarnings("unchecked")
		QResourceWriter<T> resource = (QResourceWriter<T>) resourceManager.getResourceWriter(job, typeRegistry.lookup(objectType.trimR()).getTypedClass(), library);
		T qObject = resource.lookup(name);
		if (qObject == null)
			throw new OperatingSystemRuntimeException("Object not found: " + name);

		resource.delete(qObject);
		jobLogManager.info(job, "Object " + object.name.trimR() + " on type " + objectType.trimR() + " deleted");
	}

	public static class Object extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;

		@DataDef(length = 10)
		public QCharacter name;

		@DataDef(length = 10)
		public QCharacter library;
	}
}
