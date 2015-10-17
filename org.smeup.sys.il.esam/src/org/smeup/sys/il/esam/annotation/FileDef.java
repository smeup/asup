/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.smeup.sys.il.data.annotation.DataType;

@DataType
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FileDef {

	String name() default "";
	
	boolean userOpen() default false;
	
	String info() default "";
	
	String prefix() default "";
	
	String externalFile() default "";
	String externalMember() default "";
	
}
