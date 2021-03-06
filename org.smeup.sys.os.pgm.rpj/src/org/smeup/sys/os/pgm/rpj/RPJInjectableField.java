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
package org.smeup.sys.os.pgm.rpj;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

import org.smeup.sys.il.data.annotation.DataDef;

public class RPJInjectableField {

	private Object owner;
	private Field field;
	private Class<?> fieldClass;
	private Type type;
	private Type[] arguments;

	protected RPJInjectableField(Object owner, Field field, Class<?> fieldClass, Type fieldType, Type[] fieldArgs) {
		this.owner = owner;
		this.field = field;
		this.fieldClass = fieldClass;
		this.type = fieldType;
		this.arguments = fieldArgs;
	}

	public <T extends Annotation> T getAnnotation(Class<T> annotation) {
		return getField().getAnnotation(annotation);
	}

	public Object getOwner() {
		return this.owner;
	}
	
	public String getName() {
		return this.field.getName();
	}

	public boolean isTransient() {
		return Modifier.isTransient(getField().getModifiers());
	}
	
	public boolean isBased() {
		DataDef dataDef = getAnnotation(DataDef.class);
		if(dataDef == null)
			return false;
	
		if(!dataDef.based().isEmpty())
			return true;
		else
			return false;
	}
	
	public boolean hasDefault() {
		DataDef dataDef = getAnnotation(DataDef.class);
		if(dataDef == null)
			return false;
	
		if(!dataDef.value().isEmpty() || dataDef.values().length != 0)
			return true;
		else
			return false;
	}
	
	protected Field getField() {
		return field;
	}

	protected Class<?> getFieldClass() {
		return fieldClass;
	}

	protected Type getType() {
		return type;
	}

	protected Type[] getArguments() {
		return arguments;
	}

	protected void setValue(Object value) {
		field.setAccessible(true);
		try {
			field.set(owner, value);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		field.setAccessible(false);
	}

	protected Object getValue() {
		field.setAccessible(true);
		try {
			return field.get(owner);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		} finally {
			field.setAccessible(false);
		}
	}

	@Override
	public String toString() {
		return "InjectableField [field=" + field + ", class_=" + fieldClass + ", type=" + type + ", arguments=" + Arrays.toString(arguments) + "]";
	}
}
