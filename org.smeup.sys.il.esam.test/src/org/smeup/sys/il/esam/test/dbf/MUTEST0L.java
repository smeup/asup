package org.smeup.sys.il.esam.test.dbf;

import org.smeup.sys.il.esam.annotation.Format;
import org.smeup.sys.il.esam.annotation.Index;
import org.smeup.sys.il.esam.annotation.Query;

@Format(value = "MUTESTR")
@Query(value = "SELECT   MTCATE ,   MTOGGE ,   MTERRO ,   MTMESS ,   MTTIME ,   MTUSES ,   MTDTES ,   MTORES ,   MTJOES   FROM MUTEST0F   ;")
public class MUTEST0L extends MUTEST0F {
	private static final long serialVersionUID = 1L;

	@Index(unique = false)
	public static enum INDEX_COLUMNS {
		mtcate, mtogge
	}
}
