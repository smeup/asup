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

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;
import org.smeup.sys.os.type.base.api.ObjectWorker.Object.NameGenericEnum;

@Program(name = "QMNWRKXX")
public class ObjectWorker {

	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QOutputManager outputManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	public @Entry void main(@DataDef(qualified = true) Object object, 
							@DataDef(length = 7) QCharacter objectType,
							@DataDef(length = 50) QCharacter text,
							@DataDef(length = 2) QCharacter application) {

		QObjectWriter objectWriter = outputManager.getDefaultWriter(job.getContext());
		objectWriter.initialize();

		List<QType<?>> types = findTypes(objectType);
		for (QType<?> type : types) {
			QResourceReader<?> resourceReader = findReader(object, type);
			try(QObjectIterator<?> objectIterator = findIterator(object.nameGeneric, resourceReader);) {
				while (objectIterator.hasNext()) {
					QObject qObject = null;
					try {
						qObject = objectIterator.next();
	
						if (qObject instanceof QTypedObject) {
							QTypedObject qTypedObject = (QTypedObject) qObject;
							// text
							if (!text.isNull() && !text.isEmpty())
								if (qTypedObject.getText() == null || qTypedObject.getText().toUpperCase().indexOf(text.trimR().toUpperCase()) < 0)
									continue;
	
							// application
							if (!application.isNull() && !application.isEmpty())
								if (qTypedObject.getApplication() == null || qTypedObject.getApplication().toUpperCase().indexOf(application.trimR().toUpperCase()) < 0)
									continue;
	
						}
						objectWriter.write(qObject);
					} catch (Exception e) {
						jobLogManager.error(job, qObject + " " + e.getMessage());
					}
				}
			}
		}
		
		objectWriter.flush();
	}

	private List<QType<?>> findTypes(QCharacter objectType) {
		List<QType<?>> types = new ArrayList<QType<?>>();
		if (objectType.trimR().equals("*ALL"))
			types.addAll(typeRegistry.list());
		else
			types.add(typeRegistry.lookup(objectType.trimR()));
		return types;
	}

	private QResourceReader<?> findReader(Object object, QType<?> type) {
		QResourceReader<?> resourceReader = null;
		switch (object.library.asEnum()) {
		case ALL:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.ALL);
			break;
		case ALLUSR:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.ALL_USER);
			break;
		case CURLIB:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.LIBRARY_LIST);
			break;
		case USRLIBL:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.USER_LIBRARY_LIST);
			break;
		case OTHER:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), object.library.asData().trimR());
			break;
		}
		return resourceReader;
	}

	@SuppressWarnings("resource")
	private QObjectIterator<?> findIterator(QEnum<NameGenericEnum, QCharacter> nameGeneric,	QResourceReader<?> resourceReader) {
		QObjectIterator<?> result = null;
		switch (nameGeneric.asEnum()) {
		case ALL:
			result = resourceReader.find(null);
			break;
		case OTHER:
			result = resourceReader.find(nameGeneric.asData().trimR());
			break;
		}
		return result;
	}

	public static class Object extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NameGenericEnum, QCharacter> nameGeneric;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum NameGenericEnum {
			ALL, OTHER
		}

		public static enum LibraryEnum {
			LIBL, CURLIB, USRLIBL, ALLUSR, ALL, OTHER
		}
	}
}