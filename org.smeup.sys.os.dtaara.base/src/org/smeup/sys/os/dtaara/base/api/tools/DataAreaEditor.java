/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.dtaara.base.api.tools;

import java.math.BigDecimal;
import java.util.Arrays;

import org.smeup.sys.mi.core.util.QStrings;
import org.smeup.sys.os.dtaara.DataAreaType;
import org.smeup.sys.os.dtaara.QDataArea;

public class DataAreaEditor {

	public class DataTooLongException extends Exception {
		private static final long serialVersionUID = 1L;
	}

	public class TypeAndValueMismatchException extends Exception {
		private static final long serialVersionUID = 1L;
	}

	public class InvalidBooleanValueException extends Exception {
		private static final long serialVersionUID = 1L;
	}

	public class InvalidSubstringException extends Exception {
		private static final long serialVersionUID = 1L;
	}

	public class WrongStartPositionException extends Exception {
		private static final long serialVersionUID = 1L;
	}

	private final QDataArea dataArea;
	private QStrings stringsUtils;

	public DataAreaEditor(QDataArea dataArea, QStrings stringsUtils) {
		this.dataArea = dataArea;
		this.stringsUtils = stringsUtils;
	}

	public void setValue(String valore, int initialPosition, int length) throws DataTooLongException, TypeAndValueMismatchException, InvalidBooleanValueException, WrongStartPositionException,
			InvalidSubstringException {
		if (dataArea.getDataAreaType().equals(DataAreaType.CHARACTER)) {
			if (valore.length() < length) {
				valore = stringsUtils.lSet(valore, length);
			}

			if (initialPosition > dataArea.getContentLength()) {
				throw new WrongStartPositionException();
			}

			if ((initialPosition + valore.length() - 1) > dataArea.getContentLength()) {
				throw new InvalidSubstringException();
			}

			String oldContent = stringsUtils.lSet(dataArea.getContent(), dataArea.getContentLength());
			valore = new StringBuffer(oldContent).replace(initialPosition - 1, initialPosition - 1 + valore.length(), valore).toString();
		}

		setValue(valore);
	}

	public void setValue(String valore) throws DataTooLongException, TypeAndValueMismatchException, InvalidBooleanValueException {
		switch (dataArea.getDataAreaType()) {
		case CHARACTER:
			if (valore.length() > dataArea.getContentLength()) {
				throw new DataTooLongException();
			}
			dataArea.setContent(stringsUtils.lSet(valore, dataArea.getContentLength()));
			break;

		case LOGICAL:
			if (!stringsUtils.isOneOf(valore, Arrays.asList("1", "0"))) {
				throw new InvalidBooleanValueException();
			}
			if (stringsUtils.isEmptyTrim(valore)) {
				valore = "0";
			}
			dataArea.setContentDecimal(Integer.parseInt(valore));
			break;

		case DECIMAL:
			if (stringsUtils.isEmptyTrim(valore)) {
				valore = "0";
			}
			String englishString = valore.replace(",", ".");

			checkIsNumeric(englishString);

			String[] tokens = englishString.split("\\.");

			switch (tokens.length) {
			case 0:
			case 1:
				if (valore.length() > dataArea.getContentLength()) {
					throw new DataTooLongException();
				}
				dataArea.setContent(englishString);
				break;

			case 2:
				if (tokens[0].length() > dataArea.getContentLength()) {
					throw new DataTooLongException();
				}

				if (tokens[0] == "") {
					tokens[0] = "0";
				}
				dataArea.setContent(tokens[0] + "." + stringsUtils.left(tokens[1], dataArea.getContentDecimal()));
				break;

			default:
				throw new TypeAndValueMismatchException();
			}
			break;

		case DISTRIBUTED:
			throw new UnsupportedOperationException("Unsupported data area type: DDM");
		}
	}

	private void checkIsNumeric(String englishString) throws TypeAndValueMismatchException {
		try {
			new BigDecimal(englishString);
		} catch (Exception e) {
			throw new TypeAndValueMismatchException();
		}
	}

}
