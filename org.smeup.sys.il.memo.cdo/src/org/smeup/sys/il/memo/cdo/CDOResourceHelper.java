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

import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.smeup.sys.il.core.QObjectNameable;

public class CDOResourceHelper {

	public static <T extends QObjectNameable> String getTableName(Class<? extends QObjectNameable> klass) {
		Package _package = klass.getPackage();
		if (_package.getName().startsWith("org.smeup.sys")) {
			String tableName = "asup_" + _package.getName().substring(9).replaceAll("\\.", "_") + "_" + klass.getSimpleName().substring(1);
			return tableName.toLowerCase();
		} else
			return klass.getName();
	}

	public static <T extends QObjectNameable> String getPackageURI(Class<? extends QObjectNameable> klass) {
		Package _package = klass.getPackage();
		if (_package.getName().startsWith("org.smeup.sys")) {
			String tableName = "http://www.smeup.org/asup/" + _package.getName().substring(13).replaceAll("\\.", "/");
			return tableName.toLowerCase();
		} else
			return _package.getName();
	}

	public static EPackage getEPackage(CDOSession session, Class<? extends QObjectNameable> klass) {

		Object object = session.getPackageRegistry().get(getPackageURI(klass));

		EPackage ePackage;
		if (object instanceof EPackage)
			ePackage = (EPackage) object;
		else if (object instanceof EPackage.Descriptor) {
			EPackage.Descriptor ePackageDescriptor = (EPackage.Descriptor) object;
			ePackage = ePackageDescriptor.getEPackage();
		} else
			return null;
		return ePackage;
	}

	public static EClass getEClass(EPackage ePackage, Class<? extends QObjectNameable> klass) {
		EClass eClass = (EClass) ePackage.getEClassifier(klass.getSimpleName().substring(1));
		return eClass;
	}

	public static String getModelName(Class<? extends QObjectNameable> klass) {
		return klass.getSimpleName().substring(1);
	}
}