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

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QCreationInfo;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceProvider;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.core.resources.QResourceSetReader;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.core.resources.impl.ResourceReaderImpl;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeContainer;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;
import org.smeup.sys.os.type.impl.TypeImpl;
import org.smeup.sys.rt.core.QApplication;

public class BaseTypeRegistryImpl<T extends QTypedObject> implements QTypeRegistry, QResourceProvider {

	@Inject
	private QResourceManager resourceManager;
	
	private List<QType<?>> types;
	
	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init(QTypeContainer typeContainer) {
		
		this.types = new ArrayList<QType<?>>();

		BundleContext bundleContext = FrameworkUtil.getBundle(QApplication.class).getBundleContext();
		
		for(QType<?> type: typeContainer.getContents()) {

			for (Bundle bundle : bundleContext.getBundles()) {

				try {
					Class<T> typedClass = (Class<T>) bundle.loadClass(type.getTypedClassName());
					//TODO: Verificare!!!
					if (!typedClass.equals(QType.class)) {
						this.types.add(new InternalType<T>((QType<T>) type, typedClass));
					}
					break;
				} catch (ClassNotFoundException e) {
				} 
			}
		}

		this.resourceManager.registerProvider(QType.class, this);
	}
	
	

	@Override
	public QType<?> lookup(String name) {
		QType<?> type = null;
		
		for(QType<?> t: list()) {
			if(t.getName().equals(name))  {
				type = t;
				break;
			}
		}
		
		return type;
	}

	@Override
	public List<QType<?>> list() {
		return this.types;
	}

	@Override
	public QType<?> lookup(Class<?> typedClass) {

		for (QType<?> type : list())
			if (type.getTypedClass().isAssignableFrom(typedClass))
				return type;
		return null;
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
	
	@SuppressWarnings("hiding")
	private class InternalType<T extends QTypedObject> extends TypeImpl<T> {
		
		private static final long serialVersionUID = 1L;
		
		private QType<T> delegate;
		private Class<T> typedClass;
		
		private InternalType(QType<T> type, Class<T> typedClass) {
			this.delegate = type;
			this.typedClass = typedClass;
		}

		public String getTypedClassName() {
			return delegate.getTypedClassName();
		}

		public String getApplication() {
			return delegate.getApplication();
		}

		public void setTypedClassName(String value) {
			delegate.setTypedClassName(value);
		}

		public Class<T> getTypedClass() {
			return this.typedClass;
		}

		public void setApplication(String value) {
			delegate.setApplication(value);
		}

		public String getLibrary() {
			return delegate.getLibrary();
		}

		public String getAttribute() {
			return delegate.getAttribute();
		}

		public String getName() {
			return delegate.getName();
		}

		public void setName(String value) {
			delegate.setName(value);
		}

		public String getText() {
			return delegate.getText();
		}

		public void setText(String value) {
			delegate.setText(value);
		}

		public QCreationInfo getCreationInfo() {
			return delegate.getCreationInfo();
		}

		public void setCreationInfo(QCreationInfo value) {
			delegate.setCreationInfo(value);
		}
		
		@Override
		public String toString() {
			return delegate.getName();
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
