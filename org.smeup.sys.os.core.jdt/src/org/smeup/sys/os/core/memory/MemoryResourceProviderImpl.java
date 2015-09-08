package org.smeup.sys.os.core.memory;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceProvider;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.core.resources.QResourceSetReader;
import org.smeup.sys.os.core.resources.QResourceWriter;
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
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QJob job, Class<T> klass, String container) {
		return new MemoryResourceReaderImpl<T>(job, container, klass, repository);
	}

	@Override
	public <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QJob job, Class<T> klass, Scope scope) {
		return new MemoryResourceSetReaderImpl<T>(job, containers(job, scope), klass, repository);
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, String container) {
		return new MemoryResourceWriterImpl<T>(job, container, klass, repository);
	}

	private List<String> containers(QJob job, Scope scope) {
		List<String> containers = new ArrayList<>();

		// set scope libraries
		switch (scope) {
		case ALL:
			QResourceReader<QLibrary> libraryReader = getResourceReader(job, QLibrary.class, job.getSystem().getSystemLibrary());

			QObjectIterator<QLibrary> libraryIterator = libraryReader.find(null);
			while (libraryIterator.hasNext()) {
				containers.add(libraryIterator.next().getName());
			}
			break;
			
		case LIBRARY_LIST:
			String curLib = job.getCurrentLibrary();
			containers.add(curLib);
			for (String libraryName : job.getLibraries()) {
				if (!libraryName.equals(curLib)) {
					containers.add(libraryName);
				}
			}
			break;

		case CURRENT_LIBRARY:
			containers.add(job.getCurrentLibrary());
			break;
			
		default:
			throw new OperatingSystemRuntimeException("Unsupported scope " + scope);
		}
		return containers;
	}
	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, Scope scope) {
		if (Scope.CURRENT_LIBRARY.equals(scope)) {
			return getResourceWriter(job, klass, job.getCurrentLibrary());
		}
		throw new OperatingSystemRuntimeException("Unsupported scope " + scope);
	}
}
