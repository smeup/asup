package org.smeup.sys.il.data.nio;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QStruct;

public class NIOStructHelper {
	
	public static List<Field> getFields(Class<? extends QStruct<?>> klass) {
		List<Field> fields = new ArrayList<Field>();
		appendFields(fields, klass);
		return fields;
	}
	
	@SuppressWarnings("unchecked")
	private static void appendFields(List<Field> fields, Class<? extends QStruct<?>> klass) {
		
		if(klass.equals(QDataStructWrapper.class))
			return;
			
		if(QStruct.class.isAssignableFrom(klass.getSuperclass()))
			appendFields(fields, (Class<QStruct<?>>) klass.getSuperclass());
		
		for(Field field: klass.getDeclaredFields()) {
			if(QData.class.isAssignableFrom(field.getType())) {
				fields.add(field);
			}
		}
	}

}
