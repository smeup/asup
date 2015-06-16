/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.os.cmd.ibmi;

import java.util.List;
import java.util.ListIterator;

import org.smeup.sys.il.core.QFormat;
import org.smeup.sys.il.core.QSpecial;
import org.smeup.sys.il.core.QSpecialElement;
import org.smeup.sys.il.core.meta.QCardinality;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QStroller;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QMultipleCompoundDataDef;
import org.smeup.sys.il.data.term.QDataTerm;

public class IBMiCommandEncoder {

	private static final String SPACE = " ";

	public static String encodeCommand(String contextID, QDataContainer dataContainer, boolean defaults) {

		String result = "";
		
		for (QDataTerm<?> dataTerm: dataContainer.getTerms()) {


			/*
			 * int position = commandParameter.getPosition() - 1;
			 * 
			 * QDataTerm<?> dataTerm = dataContext.getTerms().get(position);
			 */

			if (defaults || dataContainer.isSet(dataTerm)) {

				result += dataTerm.getName() + "(";

				result = writeDataTermString(result, dataTerm, dataContainer.getData(dataTerm));

				result += ")" + SPACE;
			}

		}

		return result.trim();

	}

	private static String writeDataTermString(String result, QDataTerm<?> dataTerm, QData data) {

		switch (dataTerm.getDataTermType()) {
		case MULTIPLE_ATOMIC:
			QList<?> list = (QList<?>) data;

			int c = 1;
			if (dataTerm.getFacet(QCardinality.class) != null)
				c = dataTerm.getFacet(QCardinality.class).getMax();

			for (int i = 0; i < c; i++) {

				result = writeAtomicDataTermString(result, dataTerm, list.get(i + 1));

				if (i < c - 1)
					result += SPACE;
			}

			result = result.trim();

			break;

		case MULTIPLE_COMPOUND:
			@SuppressWarnings("unchecked")
			QDataTerm<QMultipleCompoundDataDef<?, ?>> multipleCompoundDataTerm = (QDataTerm<QMultipleCompoundDataDef<?, ?>>) dataTerm;
			QStroller<?> stroller = (QStroller<?>) data;

			c = 1;
			QCardinality cardinality = multipleCompoundDataTerm.getFacet(QCardinality.class);
			if (cardinality != null)
				c = cardinality.getMax();

			for (int i = 0; i < c; i++) {
				@SuppressWarnings("unchecked")
				QDataTerm<QCompoundDataDef<?, ?>> compoundDataTerm = (QDataTerm<QCompoundDataDef<?, ?>>) dataTerm;
				result = writeCompoundDataTermString(result, compoundDataTerm, stroller.get(i + 1), true);

				if (i < c - 1)
					result += SPACE;
			}

			result = result.trim();

			break;

		case UNARY_ATOMIC:
			result = writeAtomicDataTermString(result, dataTerm, data);

			break;

		case UNARY_COMPOUND:
			@SuppressWarnings("unchecked")
			QDataTerm<QCompoundDataDef<?, ?>> unaryCompoundDataTerm = (QDataTerm<QCompoundDataDef<?, ?>>) dataTerm;

			result = writeCompoundDataTermString(result, unaryCompoundDataTerm, data, false);

			break;
		}

		return result;
	}

	private static String writeCompoundDataTermString(String result, QDataTerm<QCompoundDataDef<?, ?>> compoundDataTerm, QData data, boolean parenthesis) {

		if (parenthesis)
			result += "(";

		@SuppressWarnings("unchecked")
		List<QDataTerm<?>> elements = (List<QDataTerm<?>>) compoundDataTerm.getDefinition().getElements();

		int counter;
		ListIterator<QDataTerm<?>> listIterator = null;

		if (compoundDataTerm.getDefinition().isQualified()) {

			// If qualified, reverse fields

			counter = elements.size() - 1;
			listIterator = elements.listIterator(elements.size());

			while (listIterator.hasPrevious()) {

				QDataTerm<?> element = listIterator.previous();

				QData elementData = ((QDataStruct) data).getElement(element.getName());

				int length = result.length();

				result = writeDataTermString(result, element, elementData);

				if (counter > 0 && result.length() > length)
					result += "/";

				counter--;
			}

		} else {

			counter = 1;
			listIterator = elements.listIterator();

			while (listIterator.hasNext()) {

				QDataTerm<?> element = listIterator.next();

				QData elementData = ((QDataStruct) data).getElement(element.getName());

				result = writeDataTermString(result, element, elementData);

				if (counter != elements.size())
					result += SPACE;

				counter++;
			}
		}

		result = result.trim();

		if (parenthesis)
			result += ")";

		return result;
	}

	private static String writeAtomicDataTermString(String result, QDataTerm<?> dataTerm, QData data) {

		String value = data.toString().trim();

		if (hasSpecialValue(dataTerm, value))
			value = encodeSpecialValue(dataTerm, value);
		else {

			// Manage String single values: enclosing string in ' chars and
			// duplicate intermediate ' chars.
			Class<?> javaClass = dataTerm.getDefinition().getJavaClass();

			if (javaClass.isAssignableFrom(String.class)) {

				QFormat format = dataTerm.getFacet(QFormat.class);

				if (format == null)
					value = enclosingString(value);
				else
					switch (format.getType()) {
					case PATH_NAME:
						value = enclosingString(value);
					case COMMAND_STRING:
					case COMMUNICATIONS_NAME:
					case GENERIC:
					case NAME:
					case REGULAR_EXPRESSION:
					case SIMPLE_NAME:

					default:
						break;
					}
			}

		}

		if (value != null && value.length() > 0)
			result += value.trim();

		return result;

	}

	/**
	 * Control and manage string formats.
	 *
	 * 1) Insert delimiters (' character) if value contains a space 2) Duplicate
	 * inner '
	 *
	 * @param value
	 * @return
	 */
	private static String enclosingString(String value) {
		String tmpValue = null;
		if (value.startsWith("'") && value.endsWith("'"))
			tmpValue = value.substring(1, value.length() - 1);
		else
			tmpValue = value;

		// Duplicate internal ' characters
		tmpValue = tmpValue.replaceAll("'", "''");

		if (tmpValue.indexOf(" ") > 0)
			value = "'" + tmpValue + "'";
		return value;
	}

	/**
	 * Return true if value is a potential special value in dataterm
	 * 
	 * @param dataTerm
	 * @param value
	 * @return
	 */
	private static boolean hasSpecialValue(QDataTerm<?> dataTerm, String value) {

		QSpecial special = dataTerm.getFacet(QSpecial.class);

		if (special != null)
			for (QSpecialElement specialElem : special.getElements())
				if (specialElem.getValue().equals(value))
					return true;

		return false;
	}

	/*
	 * value to Special
	 */
	private static String encodeSpecialValue(QDataTerm<?> dataTerm, String value) {

		String result = value;

		QSpecial special = dataTerm.getFacet(QSpecial.class);

		if (special != null)
			for (QSpecialElement specialElem : special.getElements())
				if (specialElem.getValue().equals(value)) {
					result = specialElem.getName();
					break;
				}

		return result;
	}

}
