/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam;

import java.lang.reflect.Field;

import org.smeup.sys.il.data.QData;

public abstract class QPrinterFormatWrapper<E extends Enum<E>> {

	private Class<E> fieldsEnum;

	public QPrinterFormatWrapper(Class<E> fieldsEnum) {
		this.fieldsEnum = fieldsEnum;
	}
	
	public void clear() {
		if(fieldsEnum == null)
			return;

		for (Field field : fieldsEnum.getFields()) {
			try {
				Field formatField = this.getClass().getField(field.getName().toLowerCase());
				Object value = formatField.get(this);
				if(value instanceof QData) {
					QData data = (QData)value;
					data.clear();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void write() {
	}
}
