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
package org.smeup.sys.os.type.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;

@Program(name = "QUSROBJD")
public class ObjectDescriptionRetriever {

	@Inject
	Object object;

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QJob job;

	public OBJD0200 objd0200;
	public OBJD0400 objd0400;
	
	@Main
	public void main(@DataDef(length = 180) QCharacter $$dati, @DataDef(binaryType = BinaryType.BYTE) QBinary $dtaln, @DataDef(length = 8) QEnum<FORMATEnum, QCharacter> $fmtob,
			@DataDef(length = 20) QCharacter $nomog, @DataDef(length = 10) QCharacter $tipog, QUSEC qusec) {

		QType<?> type = typeRegistry.lookup($tipog.trimR());
		if (type == null)
			return;

		QResourceReader<? extends QTypedObject> resourceReader = null;

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

		// TODO
		$$dati.clear();
		qusec.qusbprv.clear();
		qusec.qusbavl.clear();
		qusec.qusei.clear();
		qusec.quserved.clear();

		if(resourceReader == null) {
			qusec.qusbavl.eval(1);
			return;
		}
		
		QObjectNameable objectNameable = resourceReader.lookup(object.name.trimR());		
		if (objectNameable == null) {
			qusec.qusbavl.eval(1);
			return;
		}
		
		QTypedObject typedObject = (QTypedObject) objectNameable;

		switch ($fmtob.asEnum()) {
		case OBJD0100:
			break;
		case OBJD0200:
			objd0200.clear();
			if (typedObject != null) {
				if (typedObject.getText() != null)
					objd0200.qustd12.eval(typedObject.getText());
				objd0200.qusrl02.eval(typedObject.getLibrary());
				objd0200.qusobjt01.eval(type.getName());

				$$dati.eval(objd0200);
			}
			break;
		case OBJD0300:
			break;
		case OBJD0400:
			objd0400.clear();
			if (typedObject != null) {
				objd0400.qusobjn03.eval(typedObject.getName());
				objd0400.qusobjln02.eval(typedObject.getLibrary());
				objd0400.qusrl04.eval(typedObject.getLibrary());
				objd0400.qusobjt03.eval(type.getName());
			}
			objd0400.quscdt16.eval("000000000000");
			objd0400.quseoa07.clear();
			objd0400.quscup04.clear();
			objd0400.qusapar04.clear();
			objd0400.quslpgm04.clear();
			objd0400.qusobjo07.clear();
			objd0400.quscdt17.eval("000000000000");
			objd0400.quslud.clear();
			objd0400.qusduc01.clear();
			
			$$dati.eval(objd0400);
			
			break;
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

	public static class OBJD0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbrtn06;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbavl07;
		@DataDef(length = 10)
		public QCharacter qusobjn00;
		@DataDef(length = 10)
		public QCharacter qusobjln;
		@DataDef(length = 10)
		public QCharacter qusobjt00;
		@DataDef(length = 10)
		public QCharacter qusrl01;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusasp04;
		@DataDef(length = 10)
		public QCharacter qusobjo04;
		@DataDef(length = 2)
		public QCharacter qusobjd04;
		@DataDef(length = 13)
		public QCharacter quscdt10;
		@DataDef(length = 13)
		public QCharacter quscdt11;
	}

	public static class OBJD0200 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbrtn07;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbavl08;
		@DataDef(length = 10)
		public QCharacter qusobjn01;
		@DataDef(length = 10)
		public QCharacter qusobjln00;
		@DataDef(length = 10)
		public QCharacter qusobjt01;
		@DataDef(length = 10)
		public QCharacter qusrl02;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusasp05;
		@DataDef(length = 10)
		public QCharacter qusobjo05;
		@DataDef(length = 2)
		public QCharacter qusobjd05;
		@DataDef(length = 13)
		public QCharacter quscdt12;
		@DataDef(length = 13)
		public QCharacter quscdt13;
		@DataDef(length = 10)
		public QCharacter quseoa05;
		@DataDef(length = 50)
		public QCharacter qustd12;
		@DataDef(length = 10)
		public QCharacter qussfiln06;
		@DataDef(length = 10)
		public QCharacter qussfln06;
		@DataDef(length = 10)
		public QCharacter qussfmn03;
	}

	public static class OBJD0300 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbrtn08;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbavl09;
		@DataDef(length = 10)
		public QCharacter qusobjn02;
		@DataDef(length = 10)
		public QCharacter qusobjln01;
		@DataDef(length = 10)
		public QCharacter qusobjt02;
		@DataDef(length = 10)
		public QCharacter qusrl03;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusasp06;
		@DataDef(length = 10)
		public QCharacter qusobjo06;
		@DataDef(length = 2)
		public QCharacter qusobjd06;
		@DataDef(length = 13)
		public QCharacter quscdt14;
		@DataDef(length = 13)
		public QCharacter quscdt15;
		@DataDef(length = 10)
		public QCharacter quseoa06;
		@DataDef(length = 50)
		public QCharacter qustd13;
		@DataDef(length = 10)
		public QCharacter qussfiln07;
		@DataDef(length = 10)
		public QCharacter qussfln07;
		@DataDef(length = 10)
		public QCharacter qussfmn04;
		@DataDef(length = 13)
		public QCharacter qussfudt03;
		@DataDef(length = 13)
		public QCharacter qusosdt02;
		@DataDef(length = 13)
		public QCharacter qusordt02;
		@DataDef(length = 10)
		public QCharacter quscup03;
		@DataDef(length = 8)
		public QCharacter qussobjc03;
		@DataDef(length = 7)
		public QCharacter qusrd01;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusss04;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusssnbr02;
		@DataDef(length = 10)
		public QCharacter qusorage04;
		@DataDef(length = 10)
		public QCharacter qusscmd02;
		@DataDef(length = 71)
		public QCharacter qussvid02;
		@DataDef(length = 10)
		public QCharacter qussd04;
		@DataDef(length = 10)
		public QCharacter qussfiln08;
		@DataDef(length = 10)
		public QCharacter qussfln08;
		@DataDef(length = 17)
		public QCharacter qussl07;
		@DataDef(length = 9)
		public QCharacter qussl08;
		@DataDef(length = 16)
		public QCharacter quspiler03;
		@DataDef(length = 8)
		public QCharacter qusobjl04;
		@DataDef(length = 1)
		public QCharacter qusuc03;
		@DataDef(length = 16)
		public QCharacter quslpgm03;
		@DataDef(length = 10)
		public QCharacter qusptf03;
		@DataDef(length = 10)
		public QCharacter qusapar03;
	}

	public static class OBJD0400 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbrtn09;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbavl10;
		@DataDef(length = 10)
		public QCharacter qusobjn03;
		@DataDef(length = 10)
		public QCharacter qusobjln02;
		@DataDef(length = 10)
		public QCharacter qusobjt03;
		@DataDef(length = 10)
		public QCharacter qusrl04;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusasp07;
		@DataDef(length = 10)
		public QCharacter qusobjo07;
		@DataDef(length = 2)
		public QCharacter qusobjd07;
		@DataDef(length = 13)
		public QCharacter quscdt16;
		@DataDef(length = 13)
		public QCharacter quscdt17;
		@DataDef(length = 10)
		public QCharacter quseoa07;
		@DataDef(length = 50)
		public QCharacter qustd14;
		@DataDef(length = 10)
		public QCharacter qussfiln09;
		@DataDef(length = 10)
		public QCharacter qussfln09;
		@DataDef(length = 10)
		public QCharacter qussfmn05;
		@DataDef(length = 13)
		public QCharacter qussfudt04;
		@DataDef(length = 13)
		public QCharacter qusosdt03;
		@DataDef(length = 13)
		public QCharacter qusordt03;
		@DataDef(length = 10)
		public QCharacter quscup04;
		@DataDef(length = 8)
		public QCharacter qussobjc04;
		@DataDef(length = 7)
		public QCharacter qusrd02;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusss05;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusssnbr03;
		@DataDef(length = 10)
		public QCharacter qusorage05;
		@DataDef(length = 10)
		public QCharacter qusscmd03;
		@DataDef(length = 71)
		public QCharacter qussvid03;
		@DataDef(length = 10)
		public QCharacter qussd05;
		@DataDef(length = 10)
		public QCharacter qussfiln10;
		@DataDef(length = 10)
		public QCharacter qussfln10;
		@DataDef(length = 17)
		public QCharacter qussl09;
		@DataDef(length = 9)
		public QCharacter qussl10;
		@DataDef(length = 16)
		public QCharacter quspiler04;
		@DataDef(length = 8)
		public QCharacter qusobjl05;
		@DataDef(length = 1)
		public QCharacter qusuc04;
		@DataDef(length = 16)
		public QCharacter quslpgm04;
		@DataDef(length = 10)
		public QCharacter qusptf04;
		@DataDef(length = 10)
		public QCharacter qusapar04;
		@DataDef(length = 7)
		public QCharacter quslud;
		@DataDef(length = 1)
		public QCharacter qusuiu01;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusduc01;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusobjs00;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusobjsm00;
		@DataDef(length = 1)
		public QCharacter qusobjcs04;
		@DataDef(length = 1)
		public QCharacter qusac04;
		@DataDef(length = 1)
		public QCharacter quscbpgm04;
		@DataDef(length = 10)
		public QCharacter qusuda05;
		@DataDef(length = 1)
		public QCharacter qusoaspi00;
		@DataDef(length = 13)
		public QCharacter qussadt02;
		@DataDef(length = 10)
		public QCharacter qusobjav04;
		@DataDef(length = 10)
		public QCharacter quspg03;
	}

	public static class QUSEC extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbprv;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbavl;
		@DataDef(length = 7)
		public QCharacter qusei;
		@DataDef(length = 1)
		public QCharacter quserved;
		@DataDef(length = 256)
		public QCharacter qusecsta;
	}
	
	public static enum FORMATEnum {
		@Special(value = "OBJD0100") OBJD0100, 
		@Special(value = "OBJD0200") OBJD0200, 
		@Special(value = "OBJD0300") OBJD0300,
		@Special(value = "OBJD0400") OBJD0400;
	}
	
	
}
