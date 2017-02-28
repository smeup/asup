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

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QDisplayWrapper;
import org.smeup.sys.il.data.QIndicator;

public class QDisplayFormatWrapper<E extends Enum<E>> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private QDisplayWrapper displayWrapper;
	private Class<E> fieldsEnum;
	
	public QDisplayFormatWrapper(QDisplayWrapper displayWrapper, Class<E> fieldsEnum) {
		this.displayWrapper = displayWrapper;
		this.fieldsEnum = fieldsEnum;
	}
	
	public void snap() {

		for (Field field : fieldsEnum.getFields()) {
			try {
				Field formatField = displayWrapper.getClass().getField(field.getName().toLowerCase());
				Object value = formatField.get(displayWrapper);
				if(value instanceof QBufferedData) {
					QBufferedData bufferedData = (QBufferedData) value;
					bufferedData.snap();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void reset() {
		for (Field field : fieldsEnum.getFields()) {
			try {
				Field formatField = displayWrapper.getClass().getField(field.getName().toLowerCase());
				Object value = formatField.get(displayWrapper);
				if(value instanceof QBufferedData) {
					QBufferedData bufferedData = (QBufferedData) value;
					bufferedData.reset();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void clear() {
		if(fieldsEnum == null)
			return;

		for (Field field : fieldsEnum.getFields()) {
			try {
				Field formatField = displayWrapper.getClass().getField(field.getName().toLowerCase());
				Object value = formatField.get(displayWrapper);
				if(value instanceof QData) {
					QData data = (QData)value;
					data.clear();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void show() {
	}
	
	public void readc() {		
	}
	
	public void update() {		
	}
	
	public void write() {
	}

	public void write(QIndicator error) {
	}

	public void chain(int recordNumber) {
	}

	public void chain(int recordNumber, QIndicator notFound) {
	}

	public void chain(int recordNumber, QIndicator notFound, QIndicator error) {
	}

	public void chain(QDecimal recordNumber) {
	}
	
	public void chain(QDecimal recordNumber, QIndicator notFound) {		
	}

	public void chain(QDecimal recordNumber, QIndicator notFound, QIndicator error) {		
	}

	public void read(QIndicator found) {
	}
}
