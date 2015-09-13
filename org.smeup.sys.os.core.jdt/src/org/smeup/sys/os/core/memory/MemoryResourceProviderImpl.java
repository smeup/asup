package org.smeup.sys.os.core.memory;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextDescription;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceSetReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.lib.QLibrary;

public class MemoryResourceProviderImpl implements QResourceProvider {

	@Inject
	private QResourceManager resourceManager;
	
	private SystemObjectRepository repository = new MemorySystemObjectRepository();

	@PostConstruct
	public void init() {
		resourceManager.registerProvider(QObjectNameable.class, this);
	}

	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String resource) {
		return new MemoryResourceReaderImpl<T>(contextProvider, resource, klass, repository);
	}

	@Override
	public <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, Scope scope) {
		
		return new MemoryResourceSetReaderImpl<T>(contextProvider, resources(contextProvider, scope), klass, repository);
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, String resource) {
		return new MemoryResourceWriterImpl<T>(contextProvider, resource, klass, repository);
	}

	private List<String> resources(QContextProvider contextProvider, Scope scope) {
		List<String> resources = new ArrayList<>();

		QContextDescription contextDescription = contextProvider.getContext().getContextDescription();
		
		// set scope libraries
		switch (scope) {
		case ALL:
			QResourceReader<QLibrary> libraryReader = getResourceReader(contextProvider, QLibrary.class, contextDescription.getSystemLibrary());

			QObjectIterator<QLibrary> libraryIterator = libraryReader.find(null);
			while (libraryIterator.hasNext()) {
				resources.add(libraryIterator.next().getName());
			}
			break;
			
		case LIBRARY_LIST:
			String curLib = contextDescription.getCurrentLibrary();
			resources.add(curLib);
			for (String libraryName : contextDescription.getLibraryPath()) {
				if (!libraryName.equals(curLib)) {
					resources.add(libraryName);
				}
			}
			break;

		case CURRENT_LIBRARY:
			resources.add(contextDescription.getCurrentLibrary());
			break;
			
		default:
			throw new OperatingSystemRuntimeException("Unsupported scope " + scope);
		}
		return resources;
	}
	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, Scope scope) {	

		QContextDescription contextDescription = contextProvider.getContext().getContextDescription();

		if (scope.equals(Scope.CURRENT_LIBRARY)) {
			return getResourceWriter(contextProvider, klass, contextDescription.getCurrentLibrary());
		}
		throw new OperatingSystemRuntimeException("Unsupported scope " + scope);
	}
}
