package org.smeup.sys.os.core.memory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

@SuppressWarnings("serial")
public class MemorySystemObjectRepository implements SystemObjectRepository {

	private static abstract class RichMap<K,V> extends ConcurrentHashMap<K, V>{
		
		protected abstract V newValue();
		protected abstract V nullValue();
		
		public V getOrCreate(K key) {
			V result = get(key);
			if (result == null) {
				result = newValue();
				put(key, result);
			}
			
			return result;
		}
		
		public V monadicGet(K key) {
			V result = get(key);
			if (result == null) {
				result = newValue();
			}
			
			return result;
		}
	}
		
	private static class ObjectMap extends RichMap<String, byte[]> {

		private static final byte[] NULL = new byte[0];

		@Override
		protected byte[] newValue() {
			return new byte[0];
		}

		@Override
		protected byte[] nullValue() {
			return NULL;
		}
		
	}

	private static class ClassMap extends RichMap<String, ObjectMap> {
		private static final ObjectMap NULL = new ObjectMap();

		public static <T> String classKey(Class<T> klass) {
			String key = null;
			if (klass != null) {
				key = klass.getSimpleName();
			}
			return key;
		}
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public ObjectMap get(Object key) {
			if (key instanceof Class) {
				return super.get(classKey((Class) key));
			}
			return super.get(key);
		}
		
		@Override
		protected ObjectMap newValue() {
			return new ObjectMap();
		}

		@Override
		protected ObjectMap nullValue() {
			return NULL;
		}
	}

	private static class ContainerMap extends RichMap<String, ClassMap> {
		private static final ClassMap NULL = new ClassMap();

		@Override
		protected ClassMap newValue() {
			return new ClassMap();
		}

		@Override
		protected ClassMap nullValue() {
			return NULL;
		} 
	}

	private static final Iterator<byte[]> EMPTY_ITERATOR = new Iterator<byte[]>() {
		@Override
		public void remove() {
		}
		
		@Override
		public byte[] next() {
			return null;
		}
		
		@Override
		public boolean hasNext() {
			return false;
		}
	};

	protected ContainerMap containerMap = new ContainerMap();
	
	@Override
	public <T> boolean exists(String container, Class<T> klass, String name) {
		return containerMap.monadicGet(container).monadicGet(ClassMap.classKey(klass)).containsKey(name);
	}


	
	@Override
	public <T> byte[] lookup(String container, Class<T> klass, String name) {
		return containerMap.monadicGet(container).monadicGet(ClassMap.classKey(klass)).get(name);
	}

	@Override
	public <T> Iterator<byte[]> find(String container, Class<T> klass, String nameFilter) {
		ObjectMap objectMap = containerMap.get(container).get(ClassMap.classKey(klass));
		if (objectMap == null) {
			return EMPTY_ITERATOR;
		}
		if (nameFilter == null) {
			return Collections.unmodifiableCollection(objectMap.values()).iterator();
		}
		return findElementsLike(nameFilter, objectMap);
	}

	private Iterator<byte[]> findElementsLike(String nameFilter, ObjectMap objectMap) {
		Collection<byte[]> result = new ArrayList<byte[]>();
		for (Entry<String, byte[]> entry : objectMap.entrySet()) {
			if (entry.getKey().startsWith(nameFilter)) {
				result.add(entry.getValue());
			}
		}
		return result.iterator();
	}

	@Override
	public <T> void delete(String container, Class<T> klass, String name) {
		containerMap.monadicGet(container).monadicGet(ClassMap.classKey(klass)).remove(name);		
	}

	@Override
	public <T> void createObjectEntry(String container, Class<T> klass,	String name, boolean replace, byte[] objectBytes) {
		if (replace || !exists(container, klass, name)) {
			containerMap.getOrCreate(container).getOrCreate(ClassMap.classKey(klass)).put(name, objectBytes);
		}
	}

	@Override
	public void close(Iterator<byte[]> repositoryiterator) {
		//Nothing
	}

}
