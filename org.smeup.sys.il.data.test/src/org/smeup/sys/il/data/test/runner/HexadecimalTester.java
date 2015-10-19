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
package org.smeup.sys.il.data.test.runner;

import java.io.UnsupportedEncodingException;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataManager;

@Test(category = "IL.DATA", object = "Hexadecimal")
public class HexadecimalTester {

	@Inject
	private QDataManager dataManager;
	@Inject
	private QTestRunner testRunner;

	private static String ENCODING = "IBM-280";

	@TestStarted
	public void main() throws UnsupportedEncodingException {

		QDataFactory dataFactory = dataManager.createFactory(testRunner.getContext());

		String inputHex = "C1A24BE4D7";

		byte[] bytes = new byte[inputHex.length() / 2];
		for (int i = 0; i < bytes.length; i++) {
			String hex = new String(inputHex.substring(2 * i, 2 * i + 2));
			bytes[i] = (byte) Integer.parseInt(hex, 16);
		}

		QCharacter character = dataFactory.createCharacter(15, false, true);
		character.movel(new String(bytes, ENCODING));

	}
}
