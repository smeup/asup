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
package org.smeup.sys.il.data.nio;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QStruct;

public final class NIODataStructHelper {

	public final static List<Field> getFields(final Class<? extends QStruct<?>> klass) {
		final List<Field> fields = new ArrayList<Field>();
		appendFields(fields, klass);
		return fields;
	}

	@SuppressWarnings("unchecked")
	private final static void appendFields(final List<Field> fields, final Class<? extends QStruct<?>> klass) {

		if (klass.equals(QDataStructWrapper.class))
			return;

		if (QStruct.class.isAssignableFrom(klass.getSuperclass()))
			appendFields(fields, (Class<QStruct<?>>) klass.getSuperclass());

		for (final Field field : klass.getDeclaredFields())
			if (QData.class.isAssignableFrom(field.getType()))
				fields.add(field);
	}

}
