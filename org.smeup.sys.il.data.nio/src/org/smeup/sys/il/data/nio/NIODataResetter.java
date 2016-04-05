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

import org.smeup.sys.il.core.meta.QDefault;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QBufferedList;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QStruct;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QDataAreaDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QSpecial;
import org.smeup.sys.il.data.term.QSpecialElement;
import org.smeup.sys.il.data.term.impl.DataTermVisitorImpl;

public class NIODataResetter extends DataTermVisitorImpl {

	private QData data;
	private QDataWriter dataWriter;

	public NIODataResetter(QData data) {
		this.data = data;
		this.dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
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

			QBufferedList<?> list = (QBufferedList<?>) data;

			if (default_.getValue() != null) {

				// Default defined as single value
				QSpecialElement specialElement = getSpecialElement(term, default_.getValue());
				if (specialElement != null) {
					list.accept(dataWriter.set(specialElement));
				} else {
					DataSpecial dataSpecial = DataSpecial.get(default_.getValue().toUpperCase());
					if (dataSpecial != null)
						list.eval(dataSpecial);
					else
						list.accept(dataWriter.set(default_.getValue()));
				}
			}
			// Default defined as multiple values
			else if (!default_.getValues().isEmpty()) {
				int i = 1;
				for (String value : default_.getValues()) {

					QSpecialElement specialElement = getSpecialElement(term, value);
					if (specialElement != null) {
						list.get(i).accept(dataWriter.set(specialElement));
					} else {
						DataSpecial dataSpecial = DataSpecial.get(value.toUpperCase());
						if (dataSpecial != null)
							list.get(i).eval(dataSpecial);
						else
							list.get(i).accept(dataWriter.set(value));
					}
					i++;
				}
			}

			break;
		case MULTIPLE_COMPOUND:
			result = true;

			list = (QBufferedList<?>) data;
			default_ = term.getDefault();
			if (default_ != null) {
				int i = 1;
				for (String value : default_.getValues()) {

					QSpecialElement specialElement = getSpecialElement(term, value);
					if (specialElement != null) {
						if (specialElement.isUnary())
							list.get(i).accept(dataWriter.set(specialElement));
						else
							for (int e = i; e <= list.capacity(); e++)
								list.get(e).accept(dataWriter.set(specialElement));
						result = false;
					} else {
						DataSpecial dataSpecial = DataSpecial.get(value.toUpperCase());
						if (dataSpecial != null)
							list.get(i).eval(dataSpecial);
						else
							list.get(i).accept(dataWriter.set(value));
					}

					i++;
				}
			}

			if (result)
				for (QStruct<?> struct : (QList<QStruct<?>>) list)
					// elements
					for (QDataTerm<?> child : ((QCompoundDataDef<?, ?>) term.getDefinition()).getElements()) {
						NIODataResetter childResetter = new NIODataResetter(struct.getElement(child.getName()));
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
			else {
				DataSpecial dataSpecial = DataSpecial.get(default_.getValue().toUpperCase());
				if (dataSpecial != null) {
					QBufferedElement bufferedElement = (QBufferedElement) data;
					bufferedElement.eval(dataSpecial);
				} else
					data.accept(dataWriter.set(default_.getValue()));
			}

			break;
		case UNARY_COMPOUND:
			result = true;

			default_ = term.getDefault();
			QStruct<?> struct = null;

			// elements
			QCompoundDataDef<?, ?> compoundDef = null;

			// TODO
			if (data instanceof QDataArea<?>) {
				QDataArea<?> dataArea = (QDataArea<?>) data;
				struct = (QStruct<?>) dataArea.get();
				compoundDef = (QCompoundDataDef<?, ?>) ((QDataAreaDef<?>) term.getDefinition()).getArgument();
			} else {
				struct = (QStruct<?>) data;
				compoundDef = (QCompoundDataDef<?, ?>) term.getDefinition();
			}

			if (default_ != null) {
				specialElement = getSpecialElement(term, default_.getValue());
				if (specialElement != null) {
					struct.accept(dataWriter.set(specialElement));
					result = false;
				} else {
					DataSpecial dataSpecial = DataSpecial.get(default_.getValue().toUpperCase());
					if (dataSpecial != null) {
						QBufferedElement bufferedElement = (QBufferedElement) data;
						bufferedElement.eval(dataSpecial);
					} else
						data.accept(dataWriter.set(default_.getValue()));
				}
			}

			if (result) {

				for (QDataTerm<?> child : compoundDef.getElements()) {
					NIODataResetter childResetter = new NIODataResetter(struct.getElement(child.getName()));
					child.accept(childResetter);
				}
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
