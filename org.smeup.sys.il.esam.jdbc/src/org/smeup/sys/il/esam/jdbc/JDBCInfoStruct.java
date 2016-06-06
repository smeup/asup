/**
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.il.esam.jdbc;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.def.BinaryType;

public class JDBCInfoStruct extends QDataStructWrapper {
	private static final long serialVersionUID = 1L;
	
	@DataDef(binaryType = BinaryType.INTEGER)
	@Overlay(position = 397)
	public QBinary rrn;
}
