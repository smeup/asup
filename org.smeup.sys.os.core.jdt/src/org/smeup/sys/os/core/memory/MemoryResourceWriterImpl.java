package org.smeup.sys.os.core.memory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.ResourceEventType;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;

public class MemoryResourceWriterImpl <T extends QObjectNameable> extends MemoryResourceReaderImpl<T> implements QResourceWriter<T> {
	
	public MemoryResourceWriterImpl(QContextProvider contextProvider, String name, Class<T> klass,	SystemObjectRepository repository) {
		super(contextProvider, name, klass, repository);
	}

	@Override
	public synchronized void delete(T object) {
		if (!repository.exists(getName(), klass, object.getName()))
			throw new OperatingSystemRuntimeException("Object " + object.getName() + " not found");

		fireEvent(resourceEvent, ResourceEventType.PRE_DELETE, object);
		repository.delete(getName(), klass, object.getName());
		fireEvent(resourceEvent, ResourceEventType.POST_DELETE, object);
	}

	@Override
	public synchronized void save(T object) {
		save(object, false);
	}

	@Override
	public synchronized void save(T object, boolean replace) {

		try {

			fireEvent(resourceEvent, ResourceEventType.PRE_SAVE, object);
			
			ByteArrayOutputStream outpuStream = new ByteArrayOutputStream();
			emfConverter.writeToStream((EObject) object, outpuStream);

			repository.createObjectEntry(getName(), klass, object.getName(), replace, outpuStream.toByteArray());
			
			fireEvent(resourceEvent, ResourceEventType.POST_SAVE, object);
		} catch (IOException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	@Override
	public void rename(T oldObject, T newObject) {
		// TODO Auto-generated method stub
	}

}
