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

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Module;
import org.smeup.sys.il.data.annotation.Module.Scope;
import org.smeup.sys.il.data.def.BinaryType;

@Module(name="*SQL", scope = Scope.OWNER)
public class RPJDatabaseSupport {

	@DataDef
	public SQLCA sqlca;
	
	public void qExecute(QString statement) {

	}
	
	public void qSelect(QString statement, QBufferedData into) {

	}

	public static class SQLCA extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 8)
		public QCharacter sqlaid;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary sqlcabc;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary sqlcod;
	}
}