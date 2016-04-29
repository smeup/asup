/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi  - Initial API and implementation
 *   Dario  Foresti - Implementation
 */
package org.smeup.sys.dk.test.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.wiring.BundleWiring;
import org.smeup.sys.dk.test.annotation.Test;

public class BaseTestHelper {

	public static EObject load(URL url) {

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI(url.toString()));
		try {
			resource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		EObject eObject = resource.getContents().get(0);

		return eObject;
	}

	public static List<String> readTextResource(Object context, String resource) throws IOException {

		Bundle bundle = FrameworkUtil.getBundle(context.getClass());
		URL entry = bundle.getEntry(resource);
		List<String> sourceSQL = readLinesFromInputStream(entry.openStream());

		return sourceSQL;
	}

	private static List<String> readLinesFromInputStream(InputStream inputStream) throws IOException {
		return readLinesFrom(new BufferedReader(new InputStreamReader(inputStream)));
	}

	private static List<String> readLinesFrom(BufferedReader in) throws IOException {
		ArrayList<String> linee = new ArrayList<String>();
		String str;
		while ((str = in.readLine()) != null) {
			linee.add(str);
		}
		in.close();
		return linee;
	}

	public static Collection<Class<?>> findTestClasses(Object context, String resourcePath, String category) {

		List<Class<?>> testRunnerList = new ArrayList<Class<?>>();

		Bundle bundle = FrameworkUtil.getBundle(context.getClass());

		BundleWiring bundleWiring = bundle.adapt(BundleWiring.class);

		String bundlePath = "/" + bundle.getSymbolicName().replace('.', '/') + resourcePath;

		for (String resource : bundleWiring.listResources(bundlePath, "*.*", BundleWiring.LISTRESOURCES_LOCAL)) {
			Class<?> klass = null;
			try {
				String resourceURI = resource.replace(".class", "").replace('/', '.');
				if (resourceURI.contains("$"))
					continue;
				klass = bundle.loadClass(resourceURI);
			} catch (ClassNotFoundException e) {
				continue;
			}

			Test testUnit = klass.getAnnotation(Test.class);
			if (testUnit == null)
				continue;

			if (category != null) {

				// unit
				if (!testUnit.category().isEmpty() && !category.equals(testUnit.category()))
					continue;

				// suite
				Test testSuite = context.getClass().getAnnotation(Test.class);
				if (testSuite != null && !testSuite.category().isEmpty() && !category.equals(testSuite.category()))
					continue;
			}

			testRunnerList.add(klass);
		}

		Comparator<Class<?>> comparator = new Comparator<Class<?>>() {

			@Override
			public int compare(Class<?> o1, Class<?> o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};

		Collections.sort(testRunnerList, comparator);

		return testRunnerList;
	}
}
