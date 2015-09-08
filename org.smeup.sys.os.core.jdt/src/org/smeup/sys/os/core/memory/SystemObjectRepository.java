package org.smeup.sys.os.core.memory;

import java.util.Iterator;


public interface SystemObjectRepository {
	public <T> boolean exists(String container, Class<T> klass, String name);
	public <T> byte[] lookup(String container, Class<T> klass, String name);
	public <T> Iterator<byte[]> find(String container, Class<T> klass, String nameFilter);

	public <T> void delete(String container, Class<T> klass, String name);
	public <T> void createObjectEntry(String container, Class<T> klass, String name, boolean replace, byte[] objectBytes);
	
	public void close(Iterator<byte[]> repositoryiterator);
}
