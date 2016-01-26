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

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.memo.impl.ResourceReaderImpl;

public class QResourceHelper {

	public static <T extends QObjectNameable> QObjectIterator<T> wrapIterator(List<T> list) {
		return QResourceHelper.wrapIterator(list.iterator());
	}

	public static <T extends QObjectNameable> QObjectIterator<T> wrapIterator(Iterator<T> iterator) {
		return new ObjectIterator<T>(iterator);
	}

	public static <T extends QObjectNameable> QObjectIterator<T> wrapIterator(List<QResourceReader<T>>resources, String namePrefix) {
		return new QueueReaderIteratorImpl<T>(resources, namePrefix);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T extends QObjectNameable> QResourceReader<T> wrapReader(List<QResourceReader<T>>resources) {
		return new ListReaderImpl(resources);
	}
	
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
		if (resourceNotifier != null)
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
		if (resourceNotifier != null)
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
		if (resourceNotifier != null)
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
		if (resourceNotifier != null)
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
		if (resourceNotifier != null)
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
		if (resourceNotifier != null)
			resourceNotifier.fireEvent(event);
	}

	private static class ObjectIterator<T extends QObjectNameable> implements QObjectIterator<T> {

		private Iterator<T> iterator;

		public ObjectIterator(Iterator<T> iterator) {
			this.iterator = iterator;
		}

		@Override
		public void close() {

		}

		@Override
		public boolean hasNext() {

			return iterator.hasNext();
		}

		@Override
		public T next() {

			return iterator.next();
		}

		@Override
		public void remove() {
			iterator.remove();
		}
	}

	private static class ListReaderImpl<T extends QObjectNameable> extends ResourceReaderImpl<T> {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		private List<QResourceReader<T>> readers = null;
		
		public ListReaderImpl(List<QResourceReader<T>> readers) {
			this.readers = readers;
		}
		
		@Override
		public boolean exists(String name) {

			for (QResourceReader<T> resourceReader : readers) {
				if(resourceReader.exists(name))
					return true;
			}

			return false;
		}

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public QObjectIterator<T> find(String nameFilter) {
			return new QueueReaderIteratorImpl(readers, nameFilter);
		}

		@Override
		public T lookup(String name) {

			T object = null;
			for (QResourceReader<T> resourceReader : readers) {
				object = resourceReader.lookup(name);
				if (object != null)
					break;
			}

			return object;
		}
		
	}
	
	private static class QueueReaderIteratorImpl<T extends QObjectNameable> implements QObjectIterator<T> {

		private Queue<QResourceReader<T>> readers;
		private QObjectIterator<T> currentIterator;
		private String namePrefix;
		private T nextObject = null;

		public QueueReaderIteratorImpl(List<QResourceReader<T>> resourceSet, String namePrefix) {

			readers = new LinkedList<QResourceReader<T>>();
			for (QResourceReader<T> resourceReader : resourceSet)
				readers.add(resourceReader);

			this.namePrefix = namePrefix;
			this.currentIterator = readers.poll().find(namePrefix);
			doNext();
		}

		@Override
		public void close() {
			this.currentIterator = null;
			this.readers = null;
		}

		@Override
		public boolean hasNext() {
			return nextObject != null;
		}

		@Override
		public T next() {
			T object = nextObject;
			doNext();

			return object;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

		private void doNext() {
			nextObject = null;
			if (currentIterator == null)
				return;

			if (currentIterator.hasNext()) {
				nextObject = currentIterator.next();
				return;
			}

			while (readers.peek() != null) {
				currentIterator = readers.poll().find(namePrefix);
				while (currentIterator.hasNext()) {
					nextObject = currentIterator.next();
					return;
				}
			}
		}
	}
}