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
package org.smeup.sys.os.pgm.rpj;

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QIndicator;

public class RPJServiceSupport {

	@Inject
	private QDataContext dataContext;

	public QCharacter p_rxsos(String arg1, String arg2) {

		StringBuffer nameBuffer = new StringBuffer();
		String a = "";

		for (char c : arg1.toCharArray()) {
			if (c == '|') {
				// a = "_$_PIPE_$_";
				// nameBuffer.append(a);
				nameBuffer.append(c);
			} else if (c == '&') {
				a = "&amp;";
				nameBuffer.append(a);
			} else if (c == '>') {
				a = "&gt;";
				nameBuffer.append(a);
			} else if (c == '<') {
				a = "&lt;";
				nameBuffer.append(a);
			} else if (c == '\'') {
				a = "&apos;";
				nameBuffer.append(a);
			} else if (c == '"') {
				a = "&quot;";
				nameBuffer.append(a);
			} else {
				nameBuffer.append(c);
			}
		}
		String string = nameBuffer.toString();
		QCharacter value = dataContext.getDataFactory().createCharacter(string.length(), true, true);
		value.eval(string);

		return value;
	}

	public QCharacter p_rxatt(String arg0, String arg1, String arg2, QIndicator arg3, QCharacter arg4) {

		QCharacter value = dataContext.getDataFactory().createCharacter(30000, true, true);

		// data una stringa cerca il valore fra "()" di un attributo
		// cerco "(" nell'attributo
		if (arg1.indexOf("(") == -1) {
			arg1 = arg1 + "(";
		}
		// lunghezza stringa
		int $L = arg1.length();
		// indice iniziale
		int $I = arg0.indexOf(arg1);
		if ($I == -1) {
			value.eval("");
			return value;
		}
		// indice iniziale
		int $F = 0;
		if (arg0.lastIndexOf("))") > 0)
			$F = arg0.lastIndexOf(")");
		else
			$F = arg0.indexOf(")", $I);
		if ($F == -1) {
			value.eval("");
			return value;
		}

		// dati i due indici estraggo il testo
		// return arg0.substring($I+$L,$F);
		value.eval(arg0.substring($I + $L, $F));

//		System.err.println(value);

		return value;

	}

	public QCharacter p_rxlate(String arg0, String arg1, String arg2, String arg3) {

		QCharacter value = dataContext.getDataFactory().createCharacter(32766, true, true);

		if (arg0 == null)
			arg0 = "";
		if (arg1 == null)
			arg1 = "";
		if (arg2 == null)
			arg2 = "";
		if (arg3 == null)
			arg3 = "";
		StringBuffer nameBuffer = new StringBuffer();
		int $A = arg0.length();
		int $B = arg1.length();
		if ($B <= $A) {
			int $I = 0;
			$I = arg0.substring($I).indexOf(arg1);
			if ($I <= 0) {
				value.eval(arg0);
				return value;
			}
			nameBuffer.append(arg0.substring(0, $I));
			if (arg3.equals("1")) {
				nameBuffer.append(arg0.substring($I).replaceFirst(arg1, arg2));
			} else {
				nameBuffer.append(arg0.substring($I).replace(arg1, arg2));
			}
			value.eval(nameBuffer.toString());
			return value;
		}
		value.eval("");
		return value;
	}

	public QCharacter p_rxval(String arg0, String arg1) {
		QCharacter value = dataContext.getDataFactory().createCharacter(32766, true, true);

		String variable = arg1.trim() + "=\"";
		int len = variable.length();
		int posIni = arg0.indexOf(variable);
		int posFin = arg0.indexOf("\"", posIni + len);
		if (posIni <= 0 || posFin <= 0) {
			value.eval("");
			return value;
		}
		String result = arg0.substring(posIni + len, posFin);
		value.eval(result);

		return value;
	}

	public QCharacter p_rxele(String arg0, String arg1, Integer arg2, QCharacter arg3, QDecimal arg4, QDecimal arg5, QCharacter arg6) {
		QCharacter value = dataContext.getDataFactory().createCharacter(32766, true, true);
		value.eval("");

		String start = "<" + arg0.trim();
		String stop = "</" + arg0.trim() + ">";
		int stopLen = stop.length();

		int posIni = arg3.trimR().indexOf(start);
		int posFin = arg3.trimR().indexOf(stop);
		if (posFin <= 0) {
			stop = "/>";
			posFin = arg3.trimR().indexOf(stop, posIni);
			stopLen = stop.length();
		}

		String result = arg3.trimR().substring(posIni, posFin + stopLen);

		value.eval(result);

		return value;
	}
}