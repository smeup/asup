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
package org.smeup.sys.il.memo;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.memo.QResource;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.QResourceNotifier;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.ResourceEventType;

public class QResourceHelper {

	
	public static <T extends QObjectNameable> void firePreDeleteEvent(final QResourceWriter<T> resourceWriter, final T source) {
		QResourceEvent<T> event = new QResourceEvent<T>() {

			@Override
			public ResourceEventType getEventType() {
				return ResourceEventType.PRE_DELETE;
			}

			@Override
			public String getResourceName() {
				return resourceWriter.getResourceName();
			}

			@Override
			public T getSource() {
				return source;
			}

			@Override
			public String getNewName() {
				return null;
			}

			@Override
			public String getOldName() {
				return null;
			}

			@Override
			public QResource<T> getResource() {
				return resourceWriter;
			}
		};

		QResourceNotifier<T> resourceNotifier = resourceWriter.getNotifier();
		if(resourceNotifier != null)
			resourceNotifier.fireEvent(event);					
	}

	public static <T extends QObjectNameable> void firePostDeleteEvent(final QResourceWriter<T> resourceWriter, final T source) {
		QResourceEvent<T> event = new QResourceEvent<T>() {

			@Override
			public ResourceEventType getEventType() {
				return ResourceEventType.POST_DELETE;
			}

			@Override
			public String getResourceName() {
				return resourceWriter.getResourceName();
			}

			@Override
			public T getSource() {
				return source;
			}

			@Override
			public String getNewName() {
				return null;
			}

			@Override
			public String getOldName() {
				return null;
			}

			@Override
			public QResource<T> getResource() {
				return resourceWriter;
			}
		};

		QResourceNotifier<T> resourceNotifier = resourceWriter.getNotifier();
		if(resourceNotifier != null)
			resourceNotifier.fireEvent(event);					
	}

	public static <T extends QObjectNameable> void firePreRenameEvent(final QResourceWriter<T> resourceWriter, final T source, final String newName) {
		QResourceEvent<T> event = new QResourceEvent<T>() {

			@Override
			public ResourceEventType getEventType() {
				return ResourceEventType.PRE_RENAME;
			}

			@Override
			public String getResourceName() {
				return resourceWriter.getResourceName();
			}

			@Override
			public T getSource() {
				return source;
			}

			@Override
			public String getNewName() {
				return newName;
			}

			@Override
			public String getOldName() {
				return null;
			}

			@Override
			public QResource<T> getResource() {
				return resourceWriter;
			}
		};
		
		QResourceNotifier<T> resourceNotifier = resourceWriter.getNotifier();
		if(resourceNotifier != null)
			resourceNotifier.fireEvent(event);							
	}

	public static <T extends QObjectNameable> void firePostRenameEvent(final QResourceWriter<T> resourceWriter, final T source, final String oldName) {
		QResourceEvent<T> event = new QResourceEvent<T>() {

			@Override
			public ResourceEventType getEventType() {
				return ResourceEventType.POST_RENAME;
			}

			@Override
			public String getResourceName() {
				return resourceWriter.getResourceName();
			}

			@Override
			public T getSource() {
				return source;
			}

			@Override
			public String getNewName() {
				return null;
			}

			@Override
			public String getOldName() {
				return oldName;
			}

			@Override
			public QResource<T> getResource() {
				return resourceWriter;
			}
		};
		
		QResourceNotifier<T> resourceNotifier = resourceWriter.getNotifier();
		if(resourceNotifier != null)
			resourceNotifier.fireEvent(event);								
	}

	public static <T extends QObjectNameable> void firePreSaveEvent(final QResourceWriter<T> resourceWriter, final T source) {

		QResourceEvent<T> event = new QResourceEvent<T>() {

			@Override
			public ResourceEventType getEventType() {
				return ResourceEventType.PRE_SAVE;
			}

			@Override
			public String getResourceName() {
				return resourceWriter.getResourceName();
			}

			@Override
			public T getSource() {
				return source;
			}

			@Override
			public String getNewName() {
				return null;
			}

			@Override
			public String getOldName() {
				return null;
			}

			@Override
			public QResource<T> getResource() {
				return resourceWriter;
			}
		};
		
		QResourceNotifier<T> resourceNotifier = resourceWriter.getNotifier();
		if(resourceNotifier != null)
			resourceNotifier.fireEvent(event);								
	}

	public static <T extends QObjectNameable> void firePostSaveEvent(final QResourceWriter<T> resourceWriter, final T source) {

		QResourceEvent<T> event = new QResourceEvent<T>() {

			@Override
			public ResourceEventType getEventType() {
				return ResourceEventType.POST_SAVE;
			}

			@Override
			public String getResourceName() {
				return resourceWriter.getResourceName();
			}

			@Override
			public T getSource() {
				return source;
			}

			@Override
			public String getNewName() {
				return null;
			}

			@Override
			public String getOldName() {
				return null;
			}

			@Override
			public QResource<T> getResource() {
				return resourceWriter;
			}
		};
		
		QResourceNotifier<T> resourceNotifier = resourceWriter.getNotifier();
		if(resourceNotifier != null)
			resourceNotifier.fireEvent(event);					
	}
}
