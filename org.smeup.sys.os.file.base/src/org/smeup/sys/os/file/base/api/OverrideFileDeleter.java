package org.smeup.sys.os.file.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QFileOverride;

@Program(name = "QDMDELOV")
public @ToDo class OverrideFileDeleter {

	@Inject
	private QFileManager fileManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;

	public static enum QCPFMSG {
		CPF0000, CPF9841
	}

	@Main
	public void main(@ToDo @DataDef(dimension = 50, length = 10) QScroller<QEnum<OVERRIDDENFILEEnum, QCharacter>> overriddenFiles,
			@ToDo @DataDef(length = 1) QEnum<CALLLEVELEnum, QCharacter> callLevel) {

		for (QEnum<OVERRIDDENFILEEnum, QCharacter> overriddenFile : overriddenFiles) {
			if (overriddenFile.asData().isEmpty())
				break;

			switch (overriddenFile.asEnum()) {
			case ALL:
				fileManager.removeAllFileOverride(job.getContext());
				break;
			case OTHER:
				QFileOverride fileOverride = fileManager.removeFileOverride(job.getContext(), overriddenFile.asData().trimR());
				if (fileOverride == null)
					throw exceptionManager.prepareException(job, QCPFMSG.CPF9841, overriddenFile.asData().trimR());

				break;
			case PRTF:
				throw exceptionManager.prepareException(job, QCPFMSG.CPF0000, overriddenFile.asData().asString());
			}
		}
	}

	public static enum OVERRIDDENFILEEnum {
		ALL, PRTF, OTHER
	}

	public static enum CALLLEVELEnum {
		@Special(value = "A")
		ACTGRPDFN, @Special(value = "I")
		TERM_STAR, @Special(value = "J")
		JOB
	}
}