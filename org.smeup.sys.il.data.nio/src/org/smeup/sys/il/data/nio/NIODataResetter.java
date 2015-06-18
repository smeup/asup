/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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

import org.smeup.sys.il.core.QSpecial;
import org.smeup.sys.il.core.QSpecialElement;
import org.smeup.sys.il.core.meta.QDefault;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QStruct;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.impl.DataTermVisitorImpl;

public class NIODataResetter extends DataTermVisitorImpl {

	private QData data;
	private QDataWriter dataWriter;

	public NIODataResetter(QData data, QDataWriter dataWriter) {
		this.data = data;
		this.dataWriter = dataWriter;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QDataTerm<?> term) {

		boolean result = false;

		switch (term.getDataTermType()) {
		case MULTIPLE_ATOMIC:
			result = true;

			QDefault default_ = term.getDefault();
			if (default_ == null || default_.isEmpty()) {
				data.clear();
				break;
			}

			QList<?> list = (QList<?>) data;

			int i = 1;
			for (String value : default_.getValues()) {

				QSpecialElement specialElement = getSpecialElement(term, value);
				if (specialElement != null) {

					// set default at current index
					if (specialElement.isUnary())
						list.get(i).accept(dataWriter.set(specialElement));
					else
						// set default from current index to remaining
						for (int e = i; e <= list.capacity(); e++)
							list.get(e).accept(dataWriter.set(specialElement));
				} else
					data.accept(dataWriter.set(value));

				i++;
			}

			break;
		case MULTIPLE_COMPOUND:
			result = true;

			list = (QList<?>) data;
			default_ = term.getDefault();
			if (default_ != null) {
				i = 1;
				for (String value : default_.getValues()) {

					QSpecialElement specialElement = getSpecialElement(term, value);
					if (specialElement != null) {
						if (specialElement.isUnary())
							list.get(i).accept(dataWriter.set(specialElement));
						else
							for (int e = i; e <= list.capacity(); e++)
								list.get(e).accept(dataWriter.set(specialElement));
						result = false;
					} else
						data.accept(dataWriter.set(value));

					i++;
				}
			}

			if (result)
				for (QStruct<?> struct : (QList<QStruct<?>>) list)
					// elements
					for (QDataTerm<?> child : ((QCompoundDataDef<?, ?>) term.getDefinition()).getElements()) {
						NIODataResetter childResetter = new NIODataResetter(struct.getElement(child.getName()), dataWriter);
						child.accept(childResetter);
					}

			result = false;

			break;
		case UNARY_ATOMIC:
			result = true;

			default_ = term.getDefault();
			if (default_ == null) {
				data.clear();
				break;
			}

			QSpecialElement specialElement = getSpecialElement(term, default_.getValue());
			if (specialElement != null)
				data.accept(dataWriter.set(specialElement));
			else
				data.accept(dataWriter.set(default_.getValue()));

			break;
		case UNARY_COMPOUND:
			break;
		default:
			result = true;

			default_ = term.getDefault();
			QStruct<?> struct = (QStruct<?>) data;

			if (default_ != null) {
				specialElement = getSpecialElement(term, default_.getValue());
				if (specialElement != null) {
					struct.accept(dataWriter.set(specialElement));
					result = false;
				} else
					data.accept(dataWriter.set(default_.getValues()));
			}

			if (result)
				// elements
				for (QDataTerm<?> child : ((QCompoundDataDef<?, ?>) term.getDefinition()).getElements()) {
					NIODataResetter childResetter = new NIODataResetter(struct.getElement(child.getName()), dataWriter);
					child.accept(childResetter);
				}

			result = false;

			break;
		}

		return result;
	}

	private QSpecialElement getSpecialElement(QDataTerm<?> dataTerm, String value) {

		QSpecial special = dataTerm.getFacet(QSpecial.class);

		if (special != null)
			for (QSpecialElement specialElem : special.getElements())
				if (specialElem.getName().equals(value))
					return specialElem;

		return null;
	}
}
