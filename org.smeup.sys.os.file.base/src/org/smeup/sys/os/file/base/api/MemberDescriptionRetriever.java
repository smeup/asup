package org.smeup.sys.os.file.base.api;

import org.smeup.sys.il.core.annotation.Overlay;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;

@Program(name = "QUSRMBRD")
public class MemberDescriptionRetriever {

	public QUSM0100 qusm0100;
	public QUSM0200 qusm0200;
	public QUSM0300 qusm0300;

	public @Entry void main(@DataDef(length = 30000) QCharacter $$dati, @DataDef(binaryType = BinaryType.INTEGER) QCharacter $$len, @DataDef(length = 8) QCharacter format, FileRef fileRef,
			@DataDef(length = 10) QCharacter member, @DataDef(length = 1) QCharacter over, QUSEC usec) {

		switch (format.trimR()) {
		case "MBRD0100":
			qusm0100.clear();

			$$dati.eval(qusm0100);
			break;
		case "MBRD0200":
			qusm0200.clear();

			$$dati.eval(qusm0200);
			break;
		case "MBRD0300":
			qusm0300.clear();

			qusm0300.qusdfiln01.eval(fileRef.name);
			qusm0300.qusdfill01.eval("P_MULT");
			qusm0300.qusmn04.eval(member.trimR());
			qusm0300.qusst02.eval("BAT");

			// qusm0300.qusscd00.qSubst(2, 6).eval(value);
			// qusm0300.qusscd00.qSubst(8, 6).eval(value);

			qusm0300.qustd05.eval("Test script MU");

			$$dati.eval(qusm0300);
			break;
		default:
			break;
		}

	}

	public static class QUSM0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "1")
		public QBinary qusbrtn02;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "5")
		public QBinary qusbavl03;
		@DataDef(length = 10)
		@Overlay(position = "9")
		public QCharacter qusdfiln;
		@DataDef(length = 10)
		@Overlay(position = "19")
		public QCharacter qusdfill;
		@DataDef(length = 10)
		@Overlay(position = "29")
		public QCharacter qusmn02;
		@DataDef(length = 10)
		@Overlay(position = "39")
		public QCharacter qusfila00;
		@DataDef(length = 10)
		@Overlay(position = "49")
		public QCharacter qusst00;
		@DataDef(length = 13)
		@Overlay(position = "59")
		public QCharacter quscd01;
		@DataDef(length = 13)
		@Overlay(position = "72")
		public QCharacter quscd02;
		@DataDef(length = 50)
		@Overlay(position = "85")
		public QCharacter qustd03;
		@DataDef(length = 1)
		@Overlay(position = "135")
		public QCharacter qussfil00;
	}

	public static class QUSM0200 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "1")
		public QBinary qusbrtn03;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "5")
		public QBinary qusbavl04;
		@DataDef(length = 10)
		@Overlay(position = "9")
		public QCharacter qusdfiln00;
		@DataDef(length = 10)
		@Overlay(position = "19")
		public QCharacter qusdfill00;
		@DataDef(length = 10)
		@Overlay(position = "29")
		public QCharacter qusmn03;
		@DataDef(length = 10)
		@Overlay(position = "39")
		public QCharacter qusfila01;
		@DataDef(length = 10)
		@Overlay(position = "49")
		public QCharacter qusst01;
		@DataDef(length = 13)
		@Overlay(position = "59")
		public QCharacter quscd03;
		@DataDef(length = 13)
		@Overlay(position = "72")
		public QCharacter qusscd;
		@DataDef(length = 50)
		@Overlay(position = "85")
		public QCharacter qustd04;
		@DataDef(length = 1)
		@Overlay(position = "135")
		public QCharacter qussfil01;
		@DataDef(length = 1)
		@Overlay(position = "136")
		public QCharacter qusefil;
		@DataDef(length = 1)
		@Overlay(position = "137")
		public QCharacter quslfil;
		@DataDef(length = 1)
		@Overlay(position = "138")
		public QCharacter qusos;
		@DataDef(length = 2)
		@Overlay(position = "139")
		public QCharacter quserved12;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "141")
		public QBinary qusnbrcr;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "145")
		public QBinary qusnbrdr;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "149")
		public QBinary qusdss;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "153")
		public QBinary qusaps;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "157")
		public QBinary qusnbrdm;
		@DataDef(length = 13)
		@Overlay(position = "161")
		public QCharacter quscd04;
		@DataDef(length = 13)
		@Overlay(position = "174")
		public QCharacter qussd;
		@DataDef(length = 13)
		@Overlay(position = "187")
		public QCharacter qusrd;
		@DataDef(length = 13)
		@Overlay(position = "200")
		public QCharacter qused;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "213")
		public QBinary qusndu;
		@DataDef(length = 7)
		@Overlay(position = "217")
		public QCharacter qusdlu;
		@DataDef(length = 7)
		@Overlay(position = "224")
		public QCharacter qusurd;
		@DataDef(length = 2)
		@Overlay(position = "231")
		public QCharacter qusrsv101;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "233")
		public QBinary qusdssm;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "237")
		public QBinary qusapsm;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "241")
		public QBinary qusmtc;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "245")
		public QBinary qusoai;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "249")
		public QBinary quslai;
		@DataDef(precision = 4)
		@Overlay(position = "253")
		public QDecimal qusncru;
		@DataDef(precision = 4)
		@Overlay(position = "257")
		public QDecimal qusndru;
		@DataDef(length = 6)
		@Overlay(position = "261")
		public QCharacter qusrsv203;
	}

	public static class QUSM0300 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "1")
		public QBinary qusbrtn04;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "5")
		public QBinary qusbavl05;
		@DataDef(length = 10)
		@Overlay(position = "9")
		public QCharacter qusdfiln01;
		@DataDef(length = 10)
		@Overlay(position = "19")
		public QCharacter qusdfill01;
		@DataDef(length = 10)
		@Overlay(position = "29")
		public QCharacter qusmn04;
		@DataDef(length = 10)
		@Overlay(position = "39")
		public QCharacter qusfila02;
		@DataDef(length = 10)
		@Overlay(position = "49")
		public QCharacter qusst02;
		@DataDef(length = 13)
		@Overlay(position = "59")
		public QCharacter quscd05;
		@DataDef(length = 13)
		@Overlay(position = "72")
		public QCharacter qusscd00;
		@DataDef(length = 50)
		@Overlay(position = "85")
		public QCharacter qustd05;
		@DataDef(length = 1)
		@Overlay(position = "135")
		public QCharacter qussfil02;
		@DataDef(length = 1)
		@Overlay(position = "136")
		public QCharacter qusefil00;
		@DataDef(length = 1)
		@Overlay(position = "137")
		public QCharacter quslfil00;
		@DataDef(length = 1)
		@Overlay(position = "138")
		public QCharacter qusos00;
		@DataDef(length = 2)
		@Overlay(position = "139")
		public QCharacter quserved13;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "141")
		public QBinary qusnbrcr00;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "145")
		public QBinary qusnbrdr00;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "149")
		public QBinary qusdss00;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "153")
		public QBinary qusaps00;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "157")
		public QBinary qusnbrdm00;
		@DataDef(length = 13)
		@Overlay(position = "161")
		public QCharacter quscd06;
		@DataDef(length = 13)
		@Overlay(position = "174")
		public QCharacter qussd00;
		@DataDef(length = 13)
		@Overlay(position = "187")
		public QCharacter qusrd00;
		@DataDef(length = 13)
		@Overlay(position = "200")
		public QCharacter qused00;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "213")
		public QBinary qusndu00;
		@DataDef(length = 7)
		@Overlay(position = "217")
		public QCharacter qusdlu00;
		@DataDef(length = 7)
		@Overlay(position = "224")
		public QCharacter qusurd00;
		@DataDef(length = 2)
		@Overlay(position = "231")
		public QCharacter qusrsv102;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "233")
		public QBinary qusdssm00;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "237")
		public QBinary qusapsm00;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "241")
		public QBinary qusmtc00;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "245")
		public QBinary qusoai00;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "249")
		public QBinary quslai00;
		@DataDef(precision = 4)
		@Overlay(position = "253")
		public QDecimal qusncru00;
		@DataDef(precision = 4)
		@Overlay(position = "257")
		public QDecimal qusndru01;
		@DataDef(length = 6)
		@Overlay(position = "261")
		public QCharacter qusrsv204;
		@DataDef(length = 1)
		@Overlay(position = "267")
		public QCharacter qusjm;
		@DataDef(length = 1)
		@Overlay(position = "268")
		public QCharacter qusapm;
		@DataDef(length = 10)
		@Overlay(position = "269")
		public QCharacter qussqlft;
		@DataDef(length = 1)
		@Overlay(position = "279")
		public QCharacter qusrsv3;
		@DataDef(length = 1)
		@Overlay(position = "280")
		public QCharacter qusar;
		@DataDef(length = 1)
		@Overlay(position = "281")
		public QCharacter qusaw;
		@DataDef(length = 1)
		@Overlay(position = "282")
		public QCharacter qusau01;
		@DataDef(length = 1)
		@Overlay(position = "283")
		public QCharacter qusad01;
		@DataDef(length = 1)
		@Overlay(position = "284")
		public QCharacter qusrsv4;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "285")
		public QBinary qusrfw;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "289")
		public QBinary qusmpdr;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "293")
		public QBinary qusinbrr;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "297")
		public QBinary qusinbrr00;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "301")
		public QBinary qusmnbri;
		@DataDef(precision = 4)
		@Overlay(position = "305")
		public QDecimal quscnbri;
		@DataDef(precision = 4)
		@Overlay(position = "309")
		public QDecimal qusrc;
		@DataDef(length = 10)
		@Overlay(position = "313")
		public QCharacter qusrfsn;
		@DataDef(length = 10)
		@Overlay(position = "323")
		public QCharacter qusrfsl;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "333")
		public QBinary qusnbrci;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "335")
		public QBinary qusoci;
		@DataDef(length = 46)
		@Overlay(position = "339")
		public QCharacter qusrsv5;
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
}