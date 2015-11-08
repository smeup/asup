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
package org.smeup.sys.il.mind.gnu;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.meta.QFrame;
import org.smeup.sys.il.mind.QMindManager;
import org.smeup.sys.il.mind.QReasoner;
import org.smeup.sys.il.mind.QTheory;

public class GNUMindManagerImpl implements QMindManager {

	@Override
	public <O extends QObject> QTheory buildTheory(QContext context, QFrame<O> frame) {
		return GNUTheoryBuilder.buildTheory(frame);
	}

	@Override
	public QReasoner createReasoner(QContext context) {
		QReasoner reasoner = new GNUReasonerImpl(context);
		reasoner.reload();
		
		return reasoner;
	}
}
