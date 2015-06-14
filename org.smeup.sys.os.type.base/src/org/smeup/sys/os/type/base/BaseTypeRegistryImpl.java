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
package org.smeup.sys.os.type.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QPluginRegistry;
import org.smeup.sys.il.core.ctx.QPluginRegistryFactory;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceProvider;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.core.resources.QResourceSetReader;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.core.resources.impl.ResourceReaderImpl;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;

public class BaseTypeRegistryImpl<T extends QTypedObject> implements QTypeRegistry, QResourceProvider {

	@Inject
	private QResourceManager resourceManager;
	
	private QPluginRegistry<QType<?>> pluginRegistry;
	
	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init(QPluginRegistryFactory pluginRegistryFactory) {
		
		this.pluginRegistry = (QPluginRegistry<QType<?>>) pluginRegistryFactory.createPluginRegistry((Class<T>) QType.class);
		
		this.resourceManager.registerProvider(QType.class, this);
	}

	@Override
	public QType<?> lookup(String name) {
		return this.pluginRegistry.lookup(name);
	}

	@Override
	public List<QType<?>> list() {
		return this.pluginRegistry.list();
	}

	@Override
	public QType<?> lookupByVendorVersion(String vendor, String version) {
		return this.pluginRegistry.lookupByVendorVersion(vendor, version);
	}

	private class TypeIterator implements QObjectIterator<QType<?>> {

		private Iterator<QType<?>> iterator;

		protected TypeIterator(Iterator<QType<?>> iterator) {
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
		public QType<?> next() {
			return iterator.next();
		}

		@Override
		public void remove() {
		}

	}
	
	private class TypeResourceReader extends ResourceReaderImpl<QType<?>> {

		@Override
		public boolean exists(String name) {
			return lookup(name) != null;
		}

		@Override
		public QObjectIterator<QType<?>> find(String nameFilter) {

			List<QType<?>> types = new ArrayList<>();
			for (QType<?> type : list())
				types.add(type);
			
			return new TypeIterator(types.iterator());
		}

		@Override
		public QType<?> lookup(String name) {
			return BaseTypeRegistryImpl.this.lookup(name);
		}
	}

	private class TypeResourceSetReader extends TypeResourceReader implements QResourceSetReader<QType<?>> {

		@Override
		public List<String> getContainers() {
			return null;
		}

		@Override
		public QType<?> lookup(String library, String name) {
			return lookup(name);
		}

		@Override
		public boolean exists(String library, String name) {
			return exists(name);
		}

		@Override
		public QObjectIterator<QType<?>> find(String library, String nameFilter) {
			return find(nameFilter);
		}

	}

	@Override
	public QType<?> lookup(Class<?> typedClass) {

		for (QType<?> type : list())
			if (type.getTypedClass().isAssignableFrom(typedClass))
				return type;
		return null;
	}
	
	@SuppressWarnings({ "unchecked", "hiding" })
	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QJob job, Class<T> klass, String container) {
		return (QResourceReader<T>) new TypeResourceReader();
	}

	@SuppressWarnings({ "unchecked", "hiding" })
	@Override
	public <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QJob job, Class<T> klass, Scope scope) {
		return (QResourceSetReader<T>) new TypeResourceSetReader();
	}

	@SuppressWarnings("hiding")
	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, String container) {
		throw new OperatingSystemRuntimeException("Not writable object: " + QType.class);
	}

	@SuppressWarnings("hiding")
	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, Scope scope) {
		throw new OperatingSystemRuntimeException("Not writable object: " + QType.class);
	}
}
