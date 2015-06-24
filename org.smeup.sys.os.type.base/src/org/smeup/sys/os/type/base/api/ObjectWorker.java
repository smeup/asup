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

import org.smeup.sys.dk.core.ToDo;
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

	public @Entry void main(@ToDo @DataDef(qualified = true) Object object, @ToDo @DataDef(length = 7) QCharacter objectType, @ToDo @DataDef(length = 50) QCharacter text,
			@ToDo @DataDef(length = 2) QCharacter application) {

		List<QType<?>> types = new ArrayList<QType<?>>();
		if (objectType.trimR().equals("*ALL"))
			types.addAll(typeRegistry.list());
		else
			types.add(typeRegistry.lookup(objectType.trimR()));

		QObjectWriter objectWriter = outputManager.getDefaultWriter(job.getContext());
		objectWriter.initialize();
		for (QType<?> type : types) {

			// System.out.println(qType);

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

			QObjectIterator<?> objectIterator = null;

			switch (object.nameGeneric.asEnum()) {
			case ALL:
				objectIterator = resourceReader.find(null);
				break;

			case OTHER:
				objectIterator = resourceReader.find(object.nameGeneric.asData().trimR());
				break;

			}

			QObject qObject = null;
			while (objectIterator.hasNext())
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
			objectIterator.close();
		}
		objectWriter.flush();
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