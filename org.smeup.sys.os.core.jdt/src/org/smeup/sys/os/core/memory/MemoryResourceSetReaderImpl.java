package org.smeup.sys.os.core.memory;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QIntegratedLanguageMemoryFactory;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.ResourceEventType;
import org.smeup.sys.il.memo.impl.ResourceSetReaderImpl;
import org.smeup.sys.il.memo.jdt.JDTResourceReaderIteratorImpl;

public class MemoryResourceSetReaderImpl<T extends QObjectNameable> extends ResourceSetReaderImpl<T> {

	private QResourceEvent<T> resourceEvent;
	private List<QResourceReader<T>> resourceSet;
	private Class<T> klass;
	private SystemObjectRepository repository;
	
	public MemoryResourceSetReaderImpl(QContextProvider contextProvider, List<String> containers,	Class<T> klass, SystemObjectRepository repository) {

		setContextProvider(contextProvider);
		this.klass = klass;
		this.repository = repository;

		this.resourceEvent = QIntegratedLanguageMemoryFactory.eINSTANCE.createResourceEvent();
		this.resourceEvent.setResource(this);

		resourceSet = new ArrayList<QResourceReader<T>>();
		for (String container : containers) {
			QResourceReader<T> resourceReader = createReader(container);
			resourceSet.add(resourceReader);
		}
	}

	protected QResourceReader<T> createReader(String name) {
		return new MemoryResourceReaderImpl<T>(getContextProvider(), name, klass, repository);
	}

	@Override
	public T lookup(String library, String name) {

		T object = null;
		for (QResourceReader<T> resourceReader : resourceSet) {
			if (library != null && !library.isEmpty() && !resourceReader.getName().equals(library))
				continue;

			object = resourceReader.lookup(name);
			if (object != null)
				break;
		}

		// notify
		if (object != null)
			fireEvent(resourceEvent, ResourceEventType.POST_LOAD, object);

		return object;
	}

	@Override
	public boolean exists(String library, String name) {

		boolean exists = false;

		for (QResourceReader<T> resourceReader : resourceSet) {
			if (library != null && !resourceReader.getName().equals(library))
				continue;

			exists = resourceReader.exists(name);
			if (exists)
				break;
		}

		return exists;
	}

	@Override
	public QObjectIterator<T> find(String library, String nameFilter) {

		Stack<QResourceReader<T>> readers = new Stack<QResourceReader<T>>();
		for (QResourceReader<T> resourceReader : resourceSet) {
			if (library != null && !resourceReader.getName().equals(library))
				continue;
			readers.add(resourceReader);
		}

		return new JDTResourceReaderIteratorImpl<T>(readers, nameFilter, resourceEvent);
	}

}
