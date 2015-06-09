package org.smeup.sys.il.isam.test.dbf;

import org.smeup.sys.il.isam.annotation.Format;
import org.smeup.sys.il.isam.annotation.Index;
import org.smeup.sys.il.isam.annotation.Query;

@Format(value = "BRARTIR")
@Query(value = "SELECT   A§ARTI ,   A§DEAR ,   A§DEA2 ,   A§TIAR ,   A§TPAR ,   A§UNMS ,   A§PESO ,   A§VOLU ,   A§CALT ,   A§ARRI ,   A§DISE ,   A§BARC ,   A§STAT ,   A§LIVE ,   A§GRDI ,   A§GRCI ,   A§NOMC ,   A§CSVQ ,   A§CSVA ,   A§ENIR ,   A§LOTR ,   A§CONT ,   A§RCDV ,   A§CASI ,   A§NCOM ,   A§CESP ,   A§CLMA ,   A§CLPR ,   A§CLGE ,   A§CLCO ,   A§CDLF ,   A§CLVA ,   A§CLFU ,   A§TC01 ,   A§TC02 ,   A§TC03 ,   A§CL01 ,   A§CL02 ,   A§CL03 ,   A§COD1 ,   A§COD2 ,   A§COD3 ,   A§COD4 ,   A§COD5 ,   A§NUM1 ,   A§NUM2 ,   A§NUM3 ,   A§NUM4 ,   A§NUM5 ,   A§DT01 ,   A§DT02 ,   A§DT03 ,   A§DT04 ,   A§DT05 ,   A§FL01 ,   A§FL02 ,   A§FL03 ,   A§FL04 ,   A§FL05 ,   A§FL06 ,   A§FL07 ,   A§FL08 ,   A§FL09 ,   A§FL10 ,   A§FL11 ,   A§FL12 ,   A§FL13 ,   A§FL14 ,   A§FL15 ,   A§FL16 ,   A§FL17 ,   A§FL18 ,   A§FL19 ,   A§FL20 ,   A§USIN ,   A§DTIN ,   A§ORIN ,   A§USAG ,   A§DTAG ,   A§ORAG   FROM BRARTI0F   ;")
public class BRARTI2L extends BRARTI0F {
	private static final long serialVersionUID = 1L;

	@Index(unique = false)
	public static enum INDEX_COLUMNS {
		açtiar, açarti
	}
}
