/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.core.base.api.tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class JobDateFormatter {

	public DateFormat ddMMyy() {
		return new SimpleDateFormat("ddMMyy");
	}

	public DateFormat yyMMdd() {
		return new SimpleDateFormat("yyMMdd");
	}

	public DateFormat mmDDyy() {
		return new SimpleDateFormat("MMddyy");
	}

	public DateFormat julian() {
		return new SimpleDateFormat("yyD");
	}

	public static DateFormat forType(org.smeup.sys.il.data.def.DateFormat format) {
		switch (format) {
		case DMY:
			return new JobDateFormatter().ddMMyy();
		case MDY:
			return new JobDateFormatter().mmDDyy();
		case YMD:
			return new JobDateFormatter().yyMMdd();
		case JUL:
			return new JobDateFormatter().julian();
		default:
			throw new RuntimeException("Unknokwn date format: " + format);
		}
	}
}
