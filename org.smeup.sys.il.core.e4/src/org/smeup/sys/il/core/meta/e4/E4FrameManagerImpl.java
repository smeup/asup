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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.meta.QFrame;
import org.smeup.sys.il.core.meta.QFrameManager;

public class E4FrameManagerImpl implements QFrameManager {

	@Override
	public <O extends QObject> QFrame<O> getFrame(O object) {

		EPackage ePackage = E4FrameHelper.getEPackage(object.getClass());
		EClass eClass = E4FrameHelper.getEClass(ePackage, object.getClass());
		
		return new E4FrameAdapter<O>(eClass);
	}

	@Override
	public QFrame<?> getFrame(EClass eClass) {

		return new E4FrameAdapter<QObject>(eClass);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <O extends QObject> O createObject(QFrame<O> frame) {

		if (frame instanceof E4FrameAdapter)
			return (O) EcoreUtil.create(((E4FrameAdapter<O>) frame).getEClass());
		else
			return null;
	}
}
