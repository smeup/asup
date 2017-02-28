/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam;

import java.io.Serializable;
import java.lang.reflect.Field;

import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QPrinterWrapper;

public abstract class QPrinterFormatWrapper<E extends Enum<E>> implements Serializable {

	private static final long serialVersionUID = 1L;

	private QPrinterWrapper printerWrapper;
	private Class<E> fieldsEnum;

	public QPrinterFormatWrapper(QPrinterWrapper printerWrapper, Class<E> fieldsEnum) {
		this.printerWrapper = printerWrapper;
		this.fieldsEnum = fieldsEnum;
	}
	
	public void clear() {
		if(fieldsEnum == null)
			return;

		for (Field field : fieldsEnum.getFields()) {
			try {
				Field formatField = printerWrapper.getClass().getField(field.getName().toLowerCase());
				Object value = formatField.get(printerWrapper);
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
