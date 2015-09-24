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
package org.smeup.sys.il.core.base;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.List;

import org.smeup.sys.il.core.java.QStrings;

public class BaseStringsImpl implements QStrings {

	@Override
	public String firstToUpper(String string) {
		StringBuffer s = new StringBuffer(string.length());
		CharacterIterator it = new StringCharacterIterator(string);
		for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next())
			if (it.getIndex() == 0)
				s.append(String.valueOf(ch).toUpperCase());
			else
				s.append(ch);
		return s.toString();
	}

	@Override
	public String appendChars(String string, String chars, int times,
			boolean before) {

		StringBuffer sb = new StringBuffer();

		if (!before)
			sb.append(string);

		for (int x = 0; x < times; x++)
			sb.append(chars);

		if (before)
			sb.append(string);

		sb.trimToSize();

		return sb.toString();
	}

	@Override
	public String removeFirstChar(String str) {
		if (str.length() == 0)
			return str;
		if (str.length() == 1)
			return "";

		return str.substring(1);
	}

	@Override
	public String removeLastChar(String str) {
		if (str.length() == 0)
			return str;
		if (str.length() == 1)
			return "";

		return str.substring(0, str.length() - 1);
	}

	@Override
	public String trimL(String string) {
		int i = 0;
		while (i < string.length()
				&& (Character.isWhitespace(string.charAt(i)) || string
						.charAt(i) == 0))
			i++;
		return string.substring(i);
	}

	@Override
	public String trimR(String string) {
		int i = string.length() - 1;
		while (i >= 0
				&& (Character.isWhitespace(string.charAt(i)) || string
						.charAt(i) == 0))
			i--;
		return string.substring(0, i + 1);
	}

	@Override
	public Boolean isEmptyTrim(String string) {
		return string == null || string.trim().equals("");
	}

	@Override
	public Boolean isOneOf(String string, List<String> values) {
		if (values == null) {
			return false;
		}

		for (String value : values) {
			if (checkEquals(string, value)) {
				return true;
			}
		}

		return false;
	}
	
	@Override
	public Boolean checkEquals(String s1, String s2) {
		if (s1 == null) {
			return s2 == null;
		}
		return s1.equals(s2);
	}

	@Override
	public String left(String s, int nrOfChars) {
		if (s == null)
			return null;

		if (nrOfChars < 1)
			return "";

		if (nrOfChars >= s.length())
			return s;

		return s.substring(0, nrOfChars);
	}

	@Override
	public String string(int numeroRipetizioni, String stringa) {
		if (stringa == null || numeroRipetizioni <= 0) {
			return "";
		} else {
			StringBuffer aus = new StringBuffer(numeroRipetizioni);
			for (int i = 1; i <= numeroRipetizioni; i++) {
				aus.append(stringa);
			}
			return aus.toString();
		}
	}

	@Override
	public String rSet(String sDaAllineare, int nCaratteri) {
		return rSet(sDaAllineare, nCaratteri, " ");
	}

	/**
	 * Allinea a destra una stringa in una di nCaratteri
	 * 
	 * @param s
	 *            la stringa da allineare
	 * @param nCaratteri
	 *            lunghezza della stringa di output
	 * @return una stringa di nCaratteri riempita a sx da spazi (es. "pippo" ->
	 *         "   pippo")
	 */
	@Override
	public String rSet(String sDaAllineare, int nCaratteri, String riempimento) {
		String filler = string(nCaratteri, riempimento);
		if (sDaAllineare == null || nCaratteri <= 0) {
			return filler;
		} else {
			return right(filler + sDaAllineare, nCaratteri);
		}
	}

	/**
	 * Allinea a sinistra una stringa in una di nCaratteri
	 * 
	 * @param s
	 *            la stringa da allineare
	 * @param nCaratteri
	 *            lunghezza della stringa di output
	 * @return una stringa di nCaratteri riempita a dx da spazi (es. "pippo" ->
	 *         "pippo   ")
	 */
	@Override
	public String lSet(String sDaAllineare, int nCaratteri) {
		return lSet(sDaAllineare, nCaratteri, " ");
	}

	@Override
	public String lSet(String sDaAllineare, int nCaratteri, String riempimento) {
		String filler = string(nCaratteri, riempimento);
		if (sDaAllineare == null || nCaratteri <= 0) {
			return filler;
		} else {
			return left(sDaAllineare + filler, nCaratteri);
		}
	}

	@Override
	public String right(String s, int nCaratteri) {
		if (s == null)
			return null;

		if (nCaratteri < 1)
			return "";

		if (nCaratteri >= s.length())
			return s;

		return s.substring(s.length() - nCaratteri);
	}
}
