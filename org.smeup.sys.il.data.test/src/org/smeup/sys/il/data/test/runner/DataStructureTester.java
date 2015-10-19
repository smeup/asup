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
import org.smeup.sys.il.data.QRecordWrapper;
import org.smeup.sys.il.data.QStroller;
import org.smeup.sys.il.data.annotation.DataDef;

@Test(category = "IL.DATA", object = "DataStructure")
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

		dataFactory.createDataStruct(£MU_B£QQ50P_1.class, 0, true);
		
		dataFactory.createDataStruct(£MU_£G90DA_1.class, 0, true);
		
		dataFactory.createDataStruct(£MU_JAJ11G_2.class, 0, true);

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
				"104 Menu Classe Modulo", "105 Menu Tabella", "106 Menu Tabella senza sottosettore", "107 Menu Oggetto J1", "108 Menu Oggetto File", "109 Menu Oggetto Pathfile", "110 Menu File",
				"111 Menu Membro", "112 Menu Vista", "113 Menu Classe Vista", "114 Menu Classe oggetto", "115 Menu Id File", "116 Menu Script di setup", "117 Menu Oggetto", "118 Menu Lista",
				"119 Menu ID", "120 Menu Tipo oggetto", "199 Scheda LOA12", "200 Cruscotto My Smeup", "201 Cruscotto data bases", "202 Cruscotto modulo",
				"203 Cruscotto oggetto completo Sottoscheda CRU", "204 Cruscotto oggetto completo", "205 Cruscotto Tipo oggetto", "206 Cruscotto appplicazione", "290 Cruscotto base",
				"301 Oggetto completo", "302 Oggetto Tabella", "303 Oggetto SE", "304 Oggetto Figura, Attività, Esercizio", "305 Oggetto Membro documentazione", "306 Oggetto Membro script",
				"307 Oggetto Tipo oggetto", "401 Derivato Oggetto completo", "402 Derivato Oggetto Tabella", "403 Derivato Oggetto SE", "404 Derivato Oggetto Figura",
				"405 Derivato Oggetto Membro documentazione", "406 Derivato Oggetto Membro script", "407 Derivato Oggetto Tipo oggetto", "901 Scheda OGOG" })
		public QArray<QCharacter> liv;

		@DataDef(dimension = 50, length = 3)
		@Overlay(name = "LIV", position = "01")
		public QArray<QCharacter> livky;
	}

	public static class £MU_B£QQ50P_1 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;

		@DataDef(dimension = 200, length = 3000, values = { "*HIVAL" })
		public QArray<QCharacter> amb;

		@DataDef(dimension = 200, length = 15)
		@Overlay(name = "AMB", position = "01")
		public QArray<QCharacter> ambid;

		@DataDef(dimension = 200)
		@Overlay(name = "AMB")
		public QStroller<B£QQF10F> ambtb;

		@DataDef(dimension = 200, length = 4)
		@Overlay(name = "AMB")
		public QArray<QCharacter> amblc;
	}

	public static class B£QQF10F extends QRecordWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 5)
		public QCharacter f1trec;
		@DataDef(length = 15)
		public QCharacter f1codi;
		@DataDef(length = 50)
		public QCharacter f1desc;
		@DataDef(precision = 4)
		public QDecimal f1prog;
		@DataDef(length = 1)
		public QCharacter f1bç1a;
		@DataDef(length = 15)
		public QCharacter f1bç1b;
		@DataDef(length = 10)
		public QCharacter f1bç1c;
		@DataDef(length = 50)
		public QCharacter f1bç1d;
		@DataDef(length = 1)
		public QCharacter f1bç1e;
		@DataDef(length = 10)
		public QCharacter f1bç1f;
		@DataDef(precision = 2)
		public QDecimal f1bç1g;
		@DataDef(length = 2)
		public QCharacter f1bç1h;
		@DataDef(length = 1)
		public QCharacter f1bç1i;
		@DataDef(length = 1)
		public QCharacter f1bç1l;
		@DataDef(length = 1)
		public QCharacter f1bç1n;
		@DataDef(length = 1)
		public QCharacter f1bç1o;
		@DataDef(length = 1)
		public QCharacter f1bç1p;
		@DataDef(length = 10)
		public QCharacter f1jobq;
		@DataDef(length = 10)
		public QCharacter f1grpa;
		@DataDef(length = 3)
		public QCharacter f1cdmg;
		@DataDef(length = 200)
		public QCharacter f1user;
		@DataDef(length = 5)
		public QCharacter f1csid;
		@DataDef(length = 15)
		public QCharacter f1exml;
		@DataDef(length = 2)
		public QCharacter f1csp1;
		@DataDef(length = 2)
		public QCharacter f1csp2;
		@DataDef(length = 2)
		public QCharacter f1csp3;
		@DataDef(length = 15)
		public QCharacter f1cd01;
		@DataDef(length = 15)
		public QCharacter f1cd02;
		@DataDef(length = 15)
		public QCharacter f1cd03;
		@DataDef(length = 15)
		public QCharacter f1cd04;
		@DataDef(length = 15)
		public QCharacter f1cd05;
		@DataDef(length = 15)
		public QCharacter f1cd06;
		@DataDef(length = 15)
		public QCharacter f1cd07;
		@DataDef(length = 15)
		public QCharacter f1cd08;
		@DataDef(length = 15)
		public QCharacter f1cd09;
		@DataDef(length = 15)
		public QCharacter f1cd10;
		@DataDef(precision = 21, scale = 6)
		public QDecimal f1nr01;
		@DataDef(precision = 21, scale = 6)
		public QDecimal f1nr02;
		@DataDef(precision = 21, scale = 6)
		public QDecimal f1nr03;
		@DataDef(precision = 21, scale = 6)
		public QDecimal f1nr04;
		@DataDef(precision = 21, scale = 6)
		public QDecimal f1nr05;
		@DataDef(precision = 21, scale = 6)
		public QDecimal f1nr06;
		@DataDef(precision = 21, scale = 6)
		public QDecimal f1nr07;
		@DataDef(precision = 21, scale = 6)
		public QDecimal f1nr08;
		@DataDef(precision = 21, scale = 6)
		public QDecimal f1nr09;
		@DataDef(precision = 21, scale = 6)
		public QDecimal f1nr10;
		@DataDef(precision = 8)
		public QDecimal f1dt01;
		@DataDef(precision = 8)
		public QDecimal f1dt02;
		@DataDef(precision = 8)
		public QDecimal f1dt03;
		@DataDef(precision = 8)
		public QDecimal f1dt04;
		@DataDef(precision = 8)
		public QDecimal f1dt05;
		@DataDef(precision = 8)
		public QDecimal f1dt06;
		@DataDef(precision = 8)
		public QDecimal f1dt07;
		@DataDef(precision = 8)
		public QDecimal f1dt08;
		@DataDef(precision = 8)
		public QDecimal f1dt09;
		@DataDef(precision = 8)
		public QDecimal f1dt10;
		@DataDef(length = 2000)
		public QCharacter f1dati;
		@DataDef(length = 10)
		public QCharacter f1usin;
		@DataDef(precision = 8)
		public QDecimal f1dtin;
		@DataDef(precision = 6)
		public QDecimal f1orin;
		@DataDef(length = 10)
		public QCharacter f1ogin;
		@DataDef(length = 10)
		public QCharacter f1usag;
		@DataDef(precision = 8)
		public QDecimal f1dtag;
		@DataDef(precision = 6)
		public QDecimal f1orag;
		@DataDef(length = 10)
		public QCharacter f1ogag;
	}
	

	public static class £MU_£G90DA_1 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		
		@DataDef(dimension = 2000, length = 71)
		public QArray<QCharacter> £g90at;
		
		@DataDef(dimension = 2000, length = 30)
		@Overlay(name = "£G90AT", position = "1")
		public QArray<QCharacter> £g90atk;
		
		@DataDef(dimension = 2000, length = 10)
		@Overlay(name = "£G90AT", position = "1")
		public QArray<QCharacter> £g90ats;
		
		@DataDef(dimension = 2000, length = 20)
		@Overlay(name = "£G90AT", position = "11")
		public QArray<QCharacter> £g90att;
		
		@DataDef(dimension = 2000, length = 40)
		@Overlay(name = "£G90AT", position = "31")
		public QArray<QCharacter> £g90ata;
		
		@DataDef(dimension = 2000, length = 1)
		@Overlay(name = "£G90AT", position = "71")
		public QArray<QCharacter> £g90ati;
	}
}