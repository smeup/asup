/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import org.smeup.sys.il.data.SortDirection;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.data.def.TimeFormat;

@Qualifier
@Documented
@DataType
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
public @interface DataDef {

	// common
	String based() default "";	
	boolean constant() default false;
	String value() default "";
	String[] formulas() default {};
	String externalName() default "";
			
	// compound
	boolean qualified() default false;
	boolean initialized() default false;
	String prefix() default "";

	// multiple
	int dimension() default 0;
	SortDirection order() default SortDirection.ASCEND;
	String[] values() default {};

	// character
	int length() default 0;
	boolean varying() default false;

	// decimal
	int precision() default 0;
	int scale() default 0;
	boolean packed() default false;

	// datetime
	DatetimeType datetimeType() default DatetimeType.DATE;
	DateFormat dateFormat() default DateFormat.ISO;
	TimeFormat timeFormat() default TimeFormat.ISO;
	
	// binary
	BinaryType binaryType() default BinaryType.BYTE;
}