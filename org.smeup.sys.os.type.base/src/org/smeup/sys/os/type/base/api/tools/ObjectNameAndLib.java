package org.smeup.sys.os.type.base.api.tools;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypedObject;

public class ObjectNameAndLib extends QDataStructWrapper {

	private static final long serialVersionUID = 1L;

	@DataDef(length = 10)
	public QCharacter name;

	@DataDef(length = 10, value = "*LIBL")
	public QEnum<LIBRARYEnum, QCharacter> library;

	public static enum LIBRARYEnum {
		LIBL, CURLIB, OTHER
	}

	@SuppressWarnings("unchecked")
	public QResourceReader<QTypedObject> resourceReader(QType<?> type, QJob job, QResourceManager resourceManager) {
		QResourceReader<QTypedObject> resourceReader = null;
		switch (library.asEnum()) {
		case CURLIB:
			resourceReader = (QResourceReader<QTypedObject>) resourceManager.getResourceReader(job, type.getTypedClass(), Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			resourceReader = (QResourceReader<QTypedObject>) resourceManager.getResourceReader(job, type.getTypedClass(), Scope.LIBRARY_LIST);
			break;
		case OTHER:
			resourceReader = (QResourceReader<QTypedObject>) resourceManager.getResourceReader(job, type.getTypedClass(), library.asData().trimR());
			break;
		}
		return resourceReader;
	}
}
