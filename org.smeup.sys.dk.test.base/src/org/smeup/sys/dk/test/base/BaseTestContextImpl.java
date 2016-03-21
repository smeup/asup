/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi	- Initial API and implementation
 */
package org.smeup.sys.dk.test.base;

import java.lang.annotation.Annotation;
import java.util.List;

import org.smeup.sys.dk.test.QTestRunnerMaker;
import org.smeup.sys.il.core.ctx.QAdapterFactory;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextDescription;

public class BaseTestContextImpl implements QContext {

	private QContext delegate;
	private QTestRunnerMaker testMaker;

	protected BaseTestContextImpl(QContext delegate, QTestRunnerMaker testMaker) {
		this.delegate = delegate;
		if (testMaker == null)
			testMaker = delegate.get(QTestRunnerMaker.class);
		else
			delegate.set(QTestRunnerMaker.class, testMaker);
		this.testMaker = testMaker;
	}

	@Override
	public void close() {
		this.delegate.close();
	}

	@SuppressWarnings("resource")
	@Override
	public QContext createChildContext(String name) {

		QContext childContext = delegate.createChildContext(name);
		return new BaseTestContextImpl(childContext, testMaker);
	}

	@SuppressWarnings("resource")
	@Override
	public QContext createChildContext(QContextDescription contextDescription) {
		QContext childContext = delegate.createChildContext(contextDescription);
		return new BaseTestContextImpl(childContext, testMaker);
	}

	@Override
	public <T> T get(Class<T> clazz) {
		return delegate.get(clazz);
	}

	@Override
	public <T> T getAdapter(Object adaptable, Class<T> adapter) {
		return delegate.getAdapter(adaptable, adapter);
	}

	@Override
	public QContextDescription getContextDescription() {
		return delegate.getContextDescription();
	}

	@Override
	public String getID() {
		return delegate.getID();
	}

	@Override
	public void inject(Object object) {
		delegate.inject(object);
	}

	@Override
	public boolean isClosed() {
		return delegate.isClosed();
	}

	@Override
	public Class<?> loadClass(String address) {
		return delegate.loadClass(address);
	}

	@Override
	public Class<?> loadClassByName(String className) {
		return delegate.loadClassByName(className);
	}

	@Override
	public <A extends Annotation> void invoke(Object object, Class<A> qualifier) {
		delegate.invoke(object, qualifier);
	}

	@Override
	public <T> T make(Class<T> klass) {
		return testMaker.make(this, klass);
	}

	@Override
	public <T> void registerAdapterFactory(QAdapterFactory factory, Class<T> adapterType) {
		delegate.registerAdapterFactory(factory, adapterType);
	}

	@Override
	public String resolveAlias(String value) {
		return delegate.resolveAlias(value);
	}

	@Override
	public List<String> resolveAliases(List<String> values) {
		return delegate.resolveAliases(values);
	}

	@Override
	public <T> void set(Class<T> klass, T object) {
		delegate.set(klass, object);
	}

	@Override
	public <T> void set(String name, T object) {
		delegate.set(name, object);
	}
}
