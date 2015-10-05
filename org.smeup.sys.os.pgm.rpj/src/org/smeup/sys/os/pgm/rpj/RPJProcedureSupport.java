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
package org.smeup.sys.os.pgm.rpj;

import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.annotation.DataDef;

public class RPJProcedureSupport {
	
	@DataDef(length = 3)
	private QDecimal qParms;

	public QDecimal qParms() {
		return this.qParms;
	}
}
