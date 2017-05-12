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
package org.smeup.sys.il.core.emf;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.meta.QFrame;
import org.smeup.sys.il.core.meta.QFrameManager;

public class EMFFrameManagerImpl implements QFrameManager {

	@Override
	public <O extends QObject> QFrame<O> getFrame(O object) {

		if(object instanceof EObject) {
			EObject eObject = (EObject)object;
			return new EMFFrameAdapter<O>(eObject.eClass());
		}
		else {
			EPackage ePackage = EMFFrameHelper.getEPackage(object.getClass());
			EClass eClass = EMFFrameHelper.getEClass(ePackage, object.getClass());
			
			return new EMFFrameAdapter<O>(eClass);
		}
	}

	@Override
	public QFrame<?> getFrame(EClass eClass) {

		return new EMFFrameAdapter<QObject>(eClass);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <O extends QObject> O createObject(QFrame<O> frame) {

		if (frame instanceof EMFFrameAdapter)
			return (O) EcoreUtil.create(((EMFFrameAdapter<O>) frame).getEClass());
		else
			return null;
	}
}
