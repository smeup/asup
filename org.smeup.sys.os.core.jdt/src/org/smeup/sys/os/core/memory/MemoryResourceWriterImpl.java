package org.smeup.sys.os.core.memory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.core.resources.ResourceEventType;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;
import org.smeup.sys.os.type.impl.TypedObjectImpl;

public class MemoryResourceWriterImpl <T extends QObjectNameable> extends MemoryResourceReaderImpl<T> implements QResourceWriter<T> {
	
	public MemoryResourceWriterImpl(QJob job, String container, Class<T> klass,	SystemObjectRepository repository) {
		super(job, container, klass, repository);
	}

	@Override
	public synchronized void delete(T object) {
		if (!repository.exists(getContainer(), klass, object.getName()))
			throw new OperatingSystemRuntimeException("Object " + object.getName() + " not found");

		fireEvent(resourceEvent, ResourceEventType.PRE_DELETE, object);
		repository.delete(getContainer(), klass, object.getName());
		fireEvent(resourceEvent, ResourceEventType.POST_DELETE, object);
	}

	@Override
	public synchronized void save(T object) {
		save(object, false);
	}

	@Override
	public synchronized void save(T object, boolean replace) {

		try {
			if (object instanceof TypedObjectImpl) {
				TypedObjectImpl typedObject = (TypedObjectImpl) object;
				
				// library
				typedObject.eSet(QOperatingSystemTypePackage.eINSTANCE.getTypedObject_Library(), getContainer());
				
				// creation info
				if (typedObject.getCreationInfo() == null)
					typedObject.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(job));

			}

			fireEvent(resourceEvent, ResourceEventType.PRE_SAVE, object);
			
			ByteArrayOutputStream outpuStream = new ByteArrayOutputStream();
			emfConverter.writeToStream((EObject) object, outpuStream);

			repository.createObjectEntry(getContainer(), klass, object.getName(), replace, outpuStream.toByteArray());
			
			fireEvent(resourceEvent, ResourceEventType.POST_SAVE, object);
		} catch (IOException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

}
