/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.dtaara.base.api.tools;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;

public class DataAreaSpecification extends QDataStructWrapper {
	private static final long serialVersionUID = 1L;

	@DataDef(qualified = true)
	public QEnum<ExistingDataAreaSpecification.DATAAREAEnum, ExistingDataAreaSpecification> dataAreaSpecification;

	@DataDef(value = "*ALL")
	public QEnum<SUBSTRINGSPECIFICATIONSEnum, SUBSTRINGSPECIFICATIONS> substringSpecifications;

	public static class SUBSTRINGSPECIFICATIONS extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;

		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary substringStartingPosition;

		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary substringLength;
	}

	public boolean all() {
		switch (substringSpecifications.asEnum()) {
		case ALL:
			return true;
		default:
			SUBSTRINGSPECIFICATIONS specData = substringSpecifications.asData();
			return (specData.substringStartingPosition.asInteger() == 0 && specData.substringLength.asInteger() == 0);
		}
	}

	public static enum SUBSTRINGSPECIFICATIONSEnum {
		@Special(value = "*ALL")
		ALL, OTHER
	}
}
