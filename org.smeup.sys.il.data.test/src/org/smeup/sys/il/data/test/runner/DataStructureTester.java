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

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.core.annotation.Overlay;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.annotation.DataDef;

@Test(category = "il.data", object = "DataStructure")
public class DataStructureTester {

	@Inject
	private QDataManager dataManager;
	@Inject
	private QTestAsserter testAsserter;
	@Inject
	private QTestRunner testRunner;

	private static int DIM = 9999;

	@TestStarted
	public void main() throws IOException, ClassNotFoundException {

		QDataFactory dataFactory = dataManager.createFactory(testRunner.getContext());

		testAsserter.resetTime();
		DataStructure dataStruct = dataFactory.createDataStruct(DataStructure.class, 0, true);
		testAsserter.assertNotNull("DataStructure creation", dataStruct);

		dataStruct.alfa.eval("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		testAsserter.assertEquals("Read first 10 chars", "ABCDEFGHIJ", dataStruct.alfa.toString());

		dataStruct.decimal.eval(123);
		testAsserter.assertEquals("Read decimal", 123, dataStruct.decimal.asInteger());

		dataStruct.multiple.get(1).eval("A");
		dataStruct.multiple.get(2).eval("B");
		testAsserter.assertEquals("Read array element[1]", "A", dataStruct.multiple.get(1).toString().trim());
		testAsserter.assertEquals("Read array element[2]", "B", dataStruct.multiple.get(2).toString().trim());

		int c = 0;
		for (@SuppressWarnings("unused")
		QCharacter multElement : dataStruct.multiple)
			c++;
		testAsserter.assertEquals("Count all elements first", DIM, c);

		c = 0;
		for (@SuppressWarnings("unused")
		QCharacter multElement : dataStruct.multiple)
			c++;
		testAsserter.assertEquals("Count all elements second", DIM, c);

		c = 0;
		for (QCharacter multElement : dataStruct.multiple) {
			if (multElement.isEmpty())
				continue;
			c++;
		}
		testAsserter.assertEquals("Count not empty elements", 2, c);

		for (QCharacter multElement : dataStruct.multiple)
			multElement.asBytes();
		testAsserter.assertEquals("Read all elements", true, true);

		c = 1;
		for (QCharacter multElement : dataStruct.multiple) {
			multElement.eval(Integer.toString(c));
			c++;
		}
		testAsserter.assertEquals("Write elements", true, true);

		c = 1;
		for (QCharacter multElement : dataStruct.multiple) {
			if (multElement.isEmpty())
				continue;

			multElement.asBytes();
			c++;
		}
		testAsserter.assertEquals("Read not empty elements", DIM, c - 1);

		QCharacter character = dataFactory.createCharacter(10000, false, true);

		for (QCharacter multElement : dataStruct.multiple)
			character.movel(multElement, true);
		testAsserter.assertEquals("Movel elements", true, true);

		QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
		for (QCharacter multElement : dataStruct.multiple)
			character.accept(dataWriter.set(multElement));
		testAsserter.assertEquals("Evaluation elements", true, true);
		
		£MU_JAJ11G_2 jaj11g_2 = dataFactory.createDataStruct(£MU_JAJ11G_2.class, 0, true);
		
		for(QCharacter c1: jaj11g_2.liv) 
			System.out.println(c1);
		
		for(QCharacter c2: jaj11g_2.livky) 
			System.out.println(c2);
	}

	public static class DataStructure extends QDataStructWrapper {

		private static final long serialVersionUID = 1L;

		@DataDef(length = 10)
		public QCharacter alfa;

		@DataDef(precision = 5)
		public QDecimal decimal;

		@DataDef(length = 1000, dimension = 9999)
		public QArray<QCharacter> multiple;
	}
	
	

	public static class £MU_JAJ11G_2 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		
		@DataDef(dimension = 50, length = 100, values = { "000 Oggetto - My Smeup", "001 Oggetto", "101 Menu Applicazione", "102 Menu Classe Applicazione", "103 Menu Modulo",
				"104 Menu Classe Modulo", "105 Menu Tabella", "106 Menu Tabella senza sottosettore", "107 Menu Oggetto J1", "108 Menu Oggetto File", "109 Menu Oggetto Pathfile",
				"110 Menu File", "111 Menu Membro", "112 Menu Vista", "113 Menu Classe Vista", "114 Menu Classe oggetto", "115 Menu Id File", "116 Menu Script di setup", "117 Menu Oggetto",
				"118 Menu Lista", "119 Menu ID", "120 Menu Tipo oggetto", "199 Scheda LOA12", "200 Cruscotto My Smeup", "201 Cruscotto data bases", "202 Cruscotto modulo",
				"203 Cruscotto oggetto completo Sottoscheda CRU", "204 Cruscotto oggetto completo", "205 Cruscotto Tipo oggetto", "206 Cruscotto appplicazione", "290 Cruscotto base",
				"301 Oggetto completo", "302 Oggetto Tabella", "303 Oggetto SE", "304 Oggetto Figura, Attività, Esercizio", "305 Oggetto Membro documentazione", "306 Oggetto Membro script",
				"307 Oggetto Tipo oggetto", "401 Derivato Oggetto completo", "402 Derivato Oggetto Tabella", "403 Derivato Oggetto SE", "404 Derivato Oggetto Figura",
				"405 Derivato Oggetto Membro documentazione", "406 Derivato Oggetto Membro script", "407 Derivato Oggetto Tipo oggetto", "901 Scheda OGOG" })
		public QArray<QCharacter> liv;
		
		@DataDef(dimension = 50, length = 3)
		@Overlay(name = "LIV", position = "01")
		public QArray<QCharacter> livky;
	}

}