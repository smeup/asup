package org.smeup.sys.il.esam;

import java.lang.reflect.Field;

import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QIndicator;

public abstract class QDisplayFormatWrapper<E extends Enum<E>> {

	private Class<E> fieldsEnum;

	public QDisplayFormatWrapper(Class<E> fieldsEnum) {
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

	public void show() {
	}
	
	public void readc() {		
	}
	
	public void update() {		
	}
	
	public void write() {
	}

	public void chain(int recordNumber, QIndicator notFound) {
	}

	public void chain(int recordNumber, QIndicator notFound, QIndicator error) {
	}

	public void chain(QDecimal recordNumber, QIndicator notFound) {		
	}

	public void chain(QDecimal recordNumber, QIndicator notFound, QIndicator error) {		
	}
}
