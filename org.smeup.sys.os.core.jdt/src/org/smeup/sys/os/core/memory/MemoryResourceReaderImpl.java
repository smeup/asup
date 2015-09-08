package org.smeup.sys.os.core.memory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jdt.EMFConverter;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QOperatingSystemResourcesFactory;
import org.smeup.sys.os.core.resources.QResourceEvent;
import org.smeup.sys.os.core.resources.ResourceEventType;
import org.smeup.sys.os.core.resources.impl.ResourceReaderImpl;

public class MemoryResourceReaderImpl<T extends QObjectNameable> extends ResourceReaderImpl<T> {

	protected Class<T> klass;
	protected SystemObjectRepository repository;
	protected QResourceEvent<T> resourceEvent;
	protected EMFConverter emfConverter;

	public MemoryResourceReaderImpl(QJob job, String container, Class<T> klass, SystemObjectRepository repository) {
		setJob(job);
		setContainer(container);	
		
		this.klass = klass;
		this.resourceEvent = QOperatingSystemResourcesFactory.eINSTANCE.createResourceEvent();
		this.resourceEvent.setResource(this); 
		
		String uri = "asup://" + job.getSystem().getName() + "/" + container + "/" + klass.getSimpleName().toLowerCase().substring(1);
		this.emfConverter = new EMFConverter(new ResourceSetImpl(), uri);
		this.repository = repository;
	}
	
	@Override
	public boolean exists(String name) {
		return repository.exists(getContainer(), klass, name);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T lookup(String name) {
		T object = null;
			byte[] resourceBytes = repository.lookup(getContainer(), klass, name);
			if (resourceBytes != null && resourceBytes.length > 0) {
				try(InputStream inputStream = new ByteArrayInputStream(resourceBytes);) {
					object = (T) emfConverter.convertToEObject(inputStream);
				} catch (IOException e) {
					throw new OperatingSystemRuntimeException(e);
				}
			}

		if (object != null)
			fireEvent(resourceEvent, ResourceEventType.POST_LOAD, object);

		return object;
	}

	
	@Override
	public QObjectIterator<T> find(String nameFilter) {
		final Iterator<byte[]> repositoryiterator = repository.find(getContainer(), klass, nameFilter);
		return new QObjectIterator<T>() {

			@Override
			public void close() {
				repository.close(repositoryiterator);
			}

			@Override
			public boolean hasNext() {
				return repositoryiterator.hasNext();
			}

			@SuppressWarnings("unchecked")
			@Override
			public T next() {
				T object = null;
				byte[] nextBytes = repositoryiterator.next();
				try(InputStream inputStream = new ByteArrayInputStream(nextBytes)) {
					object = (T) emfConverter.convertToEObject(inputStream);
				} catch (IOException e) {
				}
				return object;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
		};
	}

}
