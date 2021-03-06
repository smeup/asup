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
package org.smeup.sys.os.dtaara.base;

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.os.dtaara.DataAreaType;
import org.smeup.sys.os.dtaara.QDataArea;
import org.smeup.sys.os.dtaara.QDataAreaManager;
import org.smeup.sys.os.dtaara.QOperatingSystemDataAreaFactory;

public class BaseDataAreaManagerImpl implements QDataAreaManager {

	@SuppressWarnings("resource")
	@Override
	public QDataArea getLocalDataArea(QContextProvider contextProvider) {

		QContext context = contextProvider.getContext();
		
		QDataArea localDataArea = context.get(QDataArea.class);
		if (localDataArea == null) {
			synchronized (context) {
				localDataArea = context.get(QDataArea.class);
				if (localDataArea == null) {
					localDataArea = QOperatingSystemDataAreaFactory.eINSTANCE.createDataArea();
					localDataArea.setName("*LDA");
					localDataArea.setDataAreaType(DataAreaType.CHARACTER);
					localDataArea.setContentLength(1024);
					localDataArea.setContent("");
					context.set(QDataArea.class, localDataArea);
				}
			}
		}

		return localDataArea;
	}

}
