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
package org.smeup.sys.os.type.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.annotation.Overlay;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;

@Program(name = "QUSROBJD")
public class ObjectDescriptionRetriever {

	@Inject
	QUSD0200 qusd0200;
	@Inject
	Object object;
	
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QJob job;
	
	public @Entry void main(@DataDef(length = 180) QCharacter $$dati, @DataDef(binaryType = BinaryType.BYTE) QBinary $dtaln, @DataDef(length = 8) QCharacter $fmtob,
			@DataDef(length = 20) QCharacter $nomog, @DataDef(length = 10) QCharacter $tipog, QUSEC qusec) {

		QType<?> type = typeRegistry.lookup($tipog.trimR());
		if(type == null)
			return;
		
		QResourceReader<?> resourceReader = null;
		
		object.eval($nomog);
		switch (object.library.asEnum()) {
		case CURLIB:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.LIBRARY_LIST);
			break;
		case OTHER:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), object.library.asData().trimR());
			break;
		}
		
		QObjectNameable objectNameable = resourceReader.lookup(object.name.trimR());;
		if(objectNameable instanceof QTypedObject) {		
			QTypedObject typedObject = (QTypedObject) objectNameable;
			if(typedObject != null) {
				qusd0200.qustd12.eval(typedObject.getText());
				$$dati.eval(qusd0200);
			}
		}
	}

	public static class Object extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}
	
	public static class QUSEC extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "1")
		public QBinary qusbprv;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "5")
		public QBinary qusbavl;
		@DataDef(length = 7)
		@Overlay(position = "9")
		public QCharacter qusei;
		@DataDef(length = 1)
		@Overlay(position = "16")
		public QCharacter quserved;
	}

	public static class QUSD0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "1")
		public QBinary qusbrtn06;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "5")
		public QBinary qusbavl07;
		@DataDef(length = 10)
		@Overlay(position = "9")
		public QCharacter qusobjn00;
		@DataDef(length = 10)
		@Overlay(position = "19")
		public QCharacter qusobjln;
		@DataDef(length = 10)
		@Overlay(position = "29")
		public QCharacter qusobjt00;
		@DataDef(length = 10)
		@Overlay(position = "39")
		public QCharacter qusrl01;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "49")
		public QBinary qusasp04;
		@DataDef(length = 10)
		@Overlay(position = "53")
		public QCharacter qusobjo04;
		@DataDef(length = 2)
		@Overlay(position = "63")
		public QCharacter qusobjd04;
		@DataDef(length = 13)
		@Overlay(position = "65")
		public QCharacter quscdt10;
		@DataDef(length = 13)
		@Overlay(position = "78")
		public QCharacter quscdt11;
	}

	public static class QUSD0200 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "1")
		public QBinary qusbrtn07;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "5")
		public QBinary qusbavl08;
		@DataDef(length = 10)
		@Overlay(position = "9")
		public QCharacter qusobjn01;
		@DataDef(length = 10)
		@Overlay(position = "19")
		public QCharacter qusobjln00;
		@DataDef(length = 10)
		@Overlay(position = "29")
		public QCharacter qusobjt01;
		@DataDef(length = 10)
		@Overlay(position = "39")
		public QCharacter qusrl02;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "49")
		public QBinary qusasp05;
		@DataDef(length = 10)
		@Overlay(position = "53")
		public QCharacter qusobjo05;
		@DataDef(length = 2)
		@Overlay(position = "63")
		public QCharacter qusobjd05;
		@DataDef(length = 13)
		@Overlay(position = "65")
		public QCharacter quscdt12;
		@DataDef(length = 13)
		@Overlay(position = "78")
		public QCharacter quscdt13;
		@DataDef(length = 10)
		@Overlay(position = "91")
		public QCharacter quseoa05;
		@DataDef(length = 50)
		@Overlay(position = "101")
		public QCharacter qustd12;
		@DataDef(length = 10)
		@Overlay(position = "151")
		public QCharacter qussfiln06;
		@DataDef(length = 10)
		@Overlay(position = "161")
		public QCharacter qussfln06;
		@DataDef(length = 10)
		@Overlay(position = "171")
		public QCharacter qussfmn03;
	}

	public static class QUSD0300 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "1")
		public QBinary qusbrtn08;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "5")
		public QBinary qusbavl09;
		@DataDef(length = 10)
		@Overlay(position = "9")
		public QCharacter qusobjn02;
		@DataDef(length = 10)
		@Overlay(position = "19")
		public QCharacter qusobjln01;
		@DataDef(length = 10)
		@Overlay(position = "29")
		public QCharacter qusobjt02;
		@DataDef(length = 10)
		@Overlay(position = "39")
		public QCharacter qusrl03;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "49")
		public QBinary qusasp06;
		@DataDef(length = 10)
		@Overlay(position = "53")
		public QCharacter qusobjo06;
		@DataDef(length = 2)
		@Overlay(position = "63")
		public QCharacter qusobjd06;
		@DataDef(length = 13)
		@Overlay(position = "65")
		public QCharacter quscdt14;
		@DataDef(length = 13)
		@Overlay(position = "78")
		public QCharacter quscdt15;
		@DataDef(length = 10)
		@Overlay(position = "91")
		public QCharacter quseoa06;
		@DataDef(length = 50)
		@Overlay(position = "101")
		public QCharacter qustd13;
		@DataDef(length = 10)
		@Overlay(position = "151")
		public QCharacter qussfiln07;
		@DataDef(length = 10)
		@Overlay(position = "161")
		public QCharacter qussfln07;
		@DataDef(length = 10)
		@Overlay(position = "171")
		public QCharacter qussfmn04;
		@DataDef(length = 13)
		@Overlay(position = "181")
		public QCharacter qussfudt03;
		@DataDef(length = 13)
		@Overlay(position = "194")
		public QCharacter qusosdt02;
		@DataDef(length = 13)
		@Overlay(position = "207")
		public QCharacter qusordt02;
		@DataDef(length = 10)
		@Overlay(position = "220")
		public QCharacter quscup03;
		@DataDef(length = 8)
		@Overlay(position = "230")
		public QCharacter qussobjc03;
		@DataDef(length = 7)
		@Overlay(position = "238")
		public QCharacter qusrd01;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "245")
		public QBinary qusss04;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "249")
		public QBinary qusssnbr02;
		@DataDef(length = 10)
		@Overlay(position = "253")
		public QCharacter qusorage04;
		@DataDef(length = 10)
		@Overlay(position = "263")
		public QCharacter qusscmd02;
		@DataDef(length = 71)
		@Overlay(position = "273")
		public QCharacter qussvid02;
		@DataDef(length = 10)
		@Overlay(position = "344")
		public QCharacter qussd04;
		@DataDef(length = 10)
		@Overlay(position = "354")
		public QCharacter qussfiln08;
		@DataDef(length = 10)
		@Overlay(position = "364")
		public QCharacter qussfln08;
		@DataDef(length = 17)
		@Overlay(position = "374")
		public QCharacter qussl07;
		@DataDef(length = 9)
		@Overlay(position = "391")
		public QCharacter qussl08;
		@DataDef(length = 16)
		@Overlay(position = "400")
		public QCharacter quspiler03;
		@DataDef(length = 8)
		@Overlay(position = "416")
		public QCharacter qusobjl04;
		@DataDef(length = 1)
		@Overlay(position = "424")
		public QCharacter qusuc03;
		@DataDef(length = 16)
		@Overlay(position = "425")
		public QCharacter quslpgm03;
		@DataDef(length = 10)
		@Overlay(position = "441")
		public QCharacter qusptf03;
		@DataDef(length = 10)
		@Overlay(position = "451")
		public QCharacter qusapar03;
	}

	public static class QUSD0400 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "1")
		public QBinary qusbrtn09;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "5")
		public QBinary qusbavl10;
		@DataDef(length = 10)
		@Overlay(position = "9")
		public QCharacter qusobjn03;
		@DataDef(length = 10)
		@Overlay(position = "19")
		public QCharacter qusobjln02;
		@DataDef(length = 10)
		@Overlay(position = "29")
		public QCharacter qusobjt03;
		@DataDef(length = 10)
		@Overlay(position = "39")
		public QCharacter qusrl04;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "49")
		public QBinary qusasp07;
		@DataDef(length = 10)
		@Overlay(position = "53")
		public QCharacter qusobjo07;
		@DataDef(length = 2)
		@Overlay(position = "63")
		public QCharacter qusobjd07;
		@DataDef(length = 13)
		@Overlay(position = "65")
		public QCharacter quscdt16;
		@DataDef(length = 13)
		@Overlay(position = "78")
		public QCharacter quscdt17;
		@DataDef(length = 10)
		@Overlay(position = "91")
		public QCharacter quseoa07;
		@DataDef(length = 50)
		@Overlay(position = "101")
		public QCharacter qustd14;
		@DataDef(length = 10)
		@Overlay(position = "151")
		public QCharacter qussfiln09;
		@DataDef(length = 10)
		@Overlay(position = "161")
		public QCharacter qussfln09;
		@DataDef(length = 10)
		@Overlay(position = "171")
		public QCharacter qussfmn05;
		@DataDef(length = 13)
		@Overlay(position = "181")
		public QCharacter qussfudt04;
		@DataDef(length = 13)
		@Overlay(position = "194")
		public QCharacter qusosdt03;
		@DataDef(length = 13)
		@Overlay(position = "207")
		public QCharacter qusordt03;
		@DataDef(length = 10)
		@Overlay(position = "220")
		public QCharacter quscup04;
		@DataDef(length = 8)
		@Overlay(position = "230")
		public QCharacter qussobjc04;
		@DataDef(length = 7)
		@Overlay(position = "238")
		public QCharacter qusrd02;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "245")
		public QBinary qusss05;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "249")
		public QBinary qusssnbr03;
		@DataDef(length = 10)
		@Overlay(position = "253")
		public QCharacter qusorage05;
		@DataDef(length = 10)
		@Overlay(position = "263")
		public QCharacter qusscmd03;
		@DataDef(length = 71)
		@Overlay(position = "273")
		public QCharacter qussvid03;
		@DataDef(length = 10)
		@Overlay(position = "344")
		public QCharacter qussd05;
		@DataDef(length = 10)
		@Overlay(position = "354")
		public QCharacter qussfiln10;
		@DataDef(length = 10)
		@Overlay(position = "364")
		public QCharacter qussfln10;
		@DataDef(length = 17)
		@Overlay(position = "374")
		public QCharacter qussl09;
		@DataDef(length = 9)
		@Overlay(position = "391")
		public QCharacter qussl10;
		@DataDef(length = 16)
		@Overlay(position = "400")
		public QCharacter quspiler04;
		@DataDef(length = 8)
		@Overlay(position = "416")
		public QCharacter qusobjl05;
		@DataDef(length = 1)
		@Overlay(position = "424")
		public QCharacter qusuc04;
		@DataDef(length = 16)
		@Overlay(position = "425")
		public QCharacter quslpgm04;
		@DataDef(length = 10)
		@Overlay(position = "441")
		public QCharacter qusptf04;
		@DataDef(length = 10)
		@Overlay(position = "451")
		public QCharacter qusapar04;
		@DataDef(length = 7)
		@Overlay(position = "461")
		public QCharacter quslud;
		@DataDef(length = 1)
		@Overlay(position = "468")
		public QCharacter qusuiu01;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "469")
		public QBinary qusduc01;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "473")
		public QBinary qusobjs00;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "477")
		public QBinary qusobjsm00;
		@DataDef(length = 1)
		@Overlay(position = "481")
		public QCharacter qusobjcs04;
		@DataDef(length = 1)
		@Overlay(position = "482")
		public QCharacter qusac04;
		@DataDef(length = 1)
		@Overlay(position = "483")
		public QCharacter quscbpgm04;
		@DataDef(length = 10)
		@Overlay(position = "484")
		public QCharacter qusuda05;
		@DataDef(length = 1)
		@Overlay(position = "494")
		public QCharacter qusoaspi00;
		@DataDef(length = 13)
		@Overlay(position = "495")
		public QCharacter qussadt02;
		@DataDef(length = 10)
		@Overlay(position = "508")
		public QCharacter qusobjav04;
		@DataDef(length = 10)
		@Overlay(position = "518")
		public QCharacter quspg03;
	}
}
