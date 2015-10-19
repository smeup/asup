package org.smeup.sys.os.core.base.api;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;

@Program(name = "QWCDLYJB")
public @Supported class JobDelayer {
	public static enum QCPFMSG {
	}

	public @Entry void main(
			@Supported @DataDef(binaryType = BinaryType.INTEGER) QBinary seconds,
			@ToDo @DataDef(length = 8) QCharacter resumeTime) {
		int nrOfSeconds = seconds.asInteger();
		if (nrOfSeconds > 0) {
			System.out.println("Introducing a delay of " + nrOfSeconds + " seconds...");
			try {
				Thread.sleep(nrOfSeconds * 1000);
			} catch (InterruptedException e) {
			}
			System.out.println("...done!");
		}
	}
}
