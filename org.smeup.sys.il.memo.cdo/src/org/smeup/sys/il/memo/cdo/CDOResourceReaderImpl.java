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
package org.smeup.sys.il.memo.cdo;

import java.util.HashMap;

import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.net4j.util.collection.CloseableIterator;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.impl.ResourceReaderImpl;

public class CDOResourceReaderImpl<T extends QObjectNameable> extends ResourceReaderImpl<T> {

	private static final long serialVersionUID = 1L;

	private CDONet4jSession session;
	private CDOView view;
	private Class<T> klass;
	private String klassName;
	private EClass eClass;
	private String resource;

	public CDOResourceReaderImpl(QContextProvider contextProvider, CDONet4jSession session, Class<T> klass, String resource) {
		setContextProvider(contextProvider);
		this.session = session;

		this.resource = resource;
		this.klass = klass;

		this.klassName = CDOResourceHelper.getModelName(klass);
		EPackage ePackage = CDOResourceHelper.getEPackage(session, klass);
		this.eClass = CDOResourceHelper.getEClass(ePackage, klass);
	}

	public String getResourceName() {
		return this.resource;
	}

	protected Class<T> getResourceClass() {
		return this.klass;
	}

	protected CDONet4jSession getSession() {
		return session;
	}

	@Override
	public boolean exists(String name) {
		return lookup(name) != null;
	}

	@Override
	public T lookup(String name) {

		// select
		StringBuffer queryString = new StringBuffer();
		queryString.append(klassName + ".allInstances()");
		queryString.append("->select(o:" + klassName + "| o.library = library and o.name = name)");
		CDOQuery query = getView(getContextProvider().getContext()).createQuery("ocl", queryString.toString(), eClass);
		query.setMaxResults(1);
		// library
		query.setParameter("library", getResourceName());
		// name
		query.setParameter("name", name);

		try {
			T object = query.getResultValue(klass);

			return object;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public QObjectIterator<T> find(String nameFilter) {

		if (nameFilter != null && !nameFilter.contains("*"))
			return new CDOSingleObjectIterator(lookup(nameFilter));

		StringBuffer queryString = new StringBuffer();
		queryString.append(klassName + ".allInstances()");
		queryString.append("->select(o:" + klassName + "| o.library = library");

		if (nameFilter != null)
			if (nameFilter.endsWith("*"))
				queryString.append(" and o.name.startsWith(nameFilter)");
			else
				queryString.append(" and o.name = nameFilter");

		queryString.append(")");
		queryString.append("->sortedBy(name)");

		// query
		CDOQuery query = getView(getContextProvider().getContext()).createQuery("ocl", queryString.toString(), eClass);

		// parameters
		query.setParameter("library", getResourceName());
		if (nameFilter != null)
			if (nameFilter.endsWith("*"))
				query.setParameter("nameFilter", nameFilter.substring(0, nameFilter.length() - 1));
			else
				query.setParameter("nameFilter", nameFilter);

		CloseableIterator<T> iterator = query.getResultAsync(klass);

		return new CDOObjectIterator<T>(iterator);
	}

	protected CDOView getView(QContext context) {

		if (view == null) {

			@SuppressWarnings("unchecked")
			JobToViewMap typedViews = context.get(JobToViewMap.class);
			if (typedViews == null) {
				typedViews = new JobToViewMap();
				context.set(JobToViewMap.class, typedViews);
			} else
				view = typedViews.get(klass.getName());

			if (view == null) {
				view = getSession().openView();
				typedViews.put(klass.getName(), view);
			}
		}
		return view;
	}

	private class JobToViewMap extends HashMap<String, CDOView> {

		private static final long serialVersionUID = 1L;

	}

	private class CDOSingleObjectIterator implements QObjectIterator<T> {

		private T object;

		protected CDOSingleObjectIterator(T object) {
			this.object = object;
		}

		@Override
		public void close() {
			object = null;
		}

		@Override
		public boolean hasNext() {
			return object != null;
		}

		@Override
		public T next() {
			T old = object;
			object = null;

			return old;
		}

		@Override
		public void remove() {

		}
	}
}