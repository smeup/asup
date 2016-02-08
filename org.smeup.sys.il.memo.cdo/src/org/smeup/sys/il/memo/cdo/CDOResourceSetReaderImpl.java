/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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
import java.util.List;
import java.util.Map;

import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.net4j.util.collection.CloseableIterator;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextDescription;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.impl.ResourceReaderImpl;

public class CDOResourceSetReaderImpl<T extends QObjectNameable> extends ResourceReaderImpl<T> {

	private static final long serialVersionUID = 1L;

	private CDONet4jSession session;
	private CDOView view;
	private Class<T> klass;
	private String klassName;
	private EClass eClass;

	private List<String> resources;

	private static Map<Thread, Map<String, CDOView>> views = new HashMap<Thread, Map<String, CDOView>>();

	public CDOResourceSetReaderImpl(QContextProvider contextProvider, CDONet4jSession session, Class<T> klass, List<String> resources) {
		setContextProvider(contextProvider);
		this.session = session;
		this.klass = klass;
		this.resources = resources;

		this.klassName = CDOResourceHelper.getModelName(klass);
		EPackage ePackage = CDOResourceHelper.getEPackage(session, klass);
		this.eClass = CDOResourceHelper.getEClass(ePackage, klass);
	}

	private List<String> getResources() {
		return this.resources;
	}

	@Override
	public T lookup(String name) {

		T object = null;
		int objectIndex = Integer.MAX_VALUE;

		QContextDescription contextDescription = contextProvider.getContext().getContextDescription();

		List<String> libraries = contextDescription.getLibraryPath();

		// select
		String queryString = buildLookupOCLQuery(klassName);

		CDOQuery query = getView().createQuery("ocl", queryString.toString(), eClass);
		// object name
		query.setParameter("name", name);

		query.setMaxResults(libraries.size());

		// set object by position
		List<T> objects = query.getResult(klass);
		for (T o : objects)
			if (libraries.indexOf(o) < objectIndex)
				object = o;

		return object;
	}

	@Override
	public QObjectIterator<T> find(String nameFilter) {

		StringBuffer queryString = new StringBuffer();
		queryString.append(klassName + ".allInstances()");
		queryString.append("->select(o:" + klassName + "|");
		queryString.append(" (" + buildInLibraries(getResources()) + ")");

		if (nameFilter != null)
			if (nameFilter.endsWith("*"))
				queryString.append(" and o.name.startsWith(nameFilter)");
			else
				queryString.append(" and o.name = nameFilter");

		// queryString.append(" and getLibraryPriority() > 1");

		queryString.append(")");

		queryString.append("->sortedBy(name)");

		// query
		CDOQuery query = getView().createQuery("ocl", queryString.toString(), eClass);

		// name filter
		if (nameFilter != null)
			if (nameFilter.endsWith("*"))
				query.setParameter("nameFilter", nameFilter.substring(0, nameFilter.length() - 1));
			else
				query.setParameter("nameFilter", nameFilter);

		CloseableIterator<T> iterator = query.getResultAsync(klass);
		return new CDOObjectIterator<T>(iterator);

	}

	@Override
	public boolean exists(String library) {
		return lookup(library) != null;
	}

	private String buildInLibraries(List<String> libraries) {
		StringBuffer sb = new StringBuffer();
		for (String library : libraries) {
			if (sb.length() != 0)
				sb.append(" or ");
			sb.append("o.library = '" + library + "'");
		}
		return sb.toString();
	}

	protected CDONet4jSession getSession() {
		return session;
	}

	protected CDOView getView() {
		if (view == null) {

			Map<String, CDOView> typedViews = views.get(Thread.currentThread());
			if (typedViews == null) {
				typedViews = new HashMap<String, CDOView>();
				views.put(Thread.currentThread(), typedViews);
			} else
				view = typedViews.get(klass.getName());

			if (view == null) {
				view = getSession().openView();
				typedViews.put(klass.getName(), view);
			}
		}
		return view;
	}

	private String buildLookupOCLQuery(String className) {
		// select
		StringBuffer queryString = new StringBuffer();
		queryString.append(className + ".allInstances()");
		queryString.append("->select(o:" + className + "| o.name = name");
		queryString.append(" and (" + buildInLibraries(getResources()) + ")");
		queryString.append(")");

		queryString.append("->sortedBy(library)");

		return queryString.toString();
	}

}