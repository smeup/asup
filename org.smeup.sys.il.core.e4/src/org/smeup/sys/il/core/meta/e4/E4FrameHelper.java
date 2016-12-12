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
package org.smeup.sys.il.core.meta.e4;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.smeup.sys.il.core.QObject;

public class E4FrameHelper {

	public static String getPackageURI(Class<? extends QObject> klass) {
		
		Package _package = null;
		for(Class<?> _interface: klass.getInterfaces()) {
			if(QObject.class.isAssignableFrom(_interface)) {
				_package = _interface.getPackage();
				break;
			}
		}
		
		if(_package == null)
			_package = klass.getPackage();
		
		if (_package.getName().startsWith("org.smeup.sys")) {
			String packgeName = "http://www.smeup.org/asup" + _package.getName().substring(13).replaceAll("\\.", "/");
			return packgeName.toLowerCase();
		}
		else if (_package.getName().startsWith("com.smeup.erp")) {
			String packgeName = "http://www.smeup.com/erp" + _package.getName().substring(13).replaceAll("\\.", "/");
			return packgeName.toLowerCase();
		} else
			return _package.getName();
	}

	public static EPackage getEPackage(Class<? extends QObject> klass) {
		
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(getPackageURI(klass));
		return ePackage;
	}

	public static EClass getEClass(EPackage ePackage, Class<? extends QObject> klass) {
		EClass eClass = (EClass) ePackage.getEClassifier(getModelName(klass));
		return eClass;
	}

	public static String getModelName(Class<? extends QObject> klass) {
		
		Class<?> _class = null;
		for(Class<?> _interface: klass.getInterfaces()) {
			if(QObject.class.isAssignableFrom(_interface)) {
				_class = _interface;
				break;
			}
		}
		
		if(_class == null)
			_class = klass;
		
		if(_class.getSimpleName().startsWith("MU"))
			return _class.getSimpleName().substring(2);
		else
			return _class.getSimpleName().substring(1);
	}

}