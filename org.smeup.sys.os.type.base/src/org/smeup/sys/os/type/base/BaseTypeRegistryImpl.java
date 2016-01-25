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
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.impl.ResourceReaderImpl;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QCreationInfo;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeContainer;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;
import org.smeup.sys.os.type.impl.TypeImpl;
import org.smeup.sys.rt.core.QApplication;

public class BaseTypeRegistryImpl<TP extends QTypedObject> implements QTypeRegistry, QResourceProvider {

	@Inject
	private QResourceManager resourceManager;

	private List<QType<?>> types;

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init(QTypeContainer typeContainer) {

		this.types = new ArrayList<QType<?>>();

		BundleContext bundleContext = FrameworkUtil.getBundle(QApplication.class).getBundleContext();

		for (QType<?> type : typeContainer.getContents()) {

			for (Bundle bundle : bundleContext.getBundles()) {

				try {
					Class<TP> typedClass = (Class<TP>) bundle.loadClass(type.getTypedClassName());
					this.types.add(new InternalType<TP>((QType<TP>) type, typedClass));
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

		for (QType<?> t : list()) {

			if (t.getName().equals(name)) {
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

		@Override
		public boolean isPersistent() {
			return delegate.isPersistent();
		}
	}

	private class TypeResourceReader extends ResourceReaderImpl<QType<?>> {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public TypeResourceReader(QContextProvider contextProvider) {
			setContextProvider(contextProvider);
		}
		
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

	@SuppressWarnings({ "unchecked"})
	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String resource) {
		return (QResourceReader<T>) new TypeResourceReader(contextProvider);
	}

	@SuppressWarnings({ "unchecked"})
	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, List<String> resources) {
		return (QResourceReader<T>) new TypeResourceReader(contextProvider);
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, String resource) {
		throw new OperatingSystemRuntimeException("Not writable object: " + QType.class);
	}
}
