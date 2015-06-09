package org.smeup.sys.il.isam.test.dbf;

import org.smeup.sys.il.isam.annotation.Format;
import org.smeup.sys.il.isam.annotation.Index;
import org.smeup.sys.il.isam.annotation.Query;

@Format(value = "BRENTIR")
@Query(value = "SELECT   E§TRAG ,   E§CRAG ,   E§SCEN ,   E§AZIE ,   E§IDOJ ,   E§DINV ,   E§DFNV ,   E§GRUP ,   E§NMNE ,   E§NCOD ,   E§LIVE ,   E§STAT ,   E§RAGS ,   E§RAGA ,   E§INDI ,   E§INDA ,   E§TELE ,   E§TFAX ,   E§TELX ,   E§IEMA ,   E§PECO ,   E§CNAZ ,   E§CREG ,   E§CCOM ,   E§LOCA ,   E§PROV ,   E§NAZI ,   E§CAPA ,   E§ZONA ,   E§LING ,   E§VALU ,   E§TSOG ,   E§CPAI ,   E§COFI ,   E§CPAE ,   E§CTA1 ,   E§CTA2 ,   E§CTA3 ,   E§DVES ,   E§CDIN ,   E§DDIN ,   E§TNOM ,   E§CNOM ,   E§TSPE ,   E§CSPE ,   E§TCON ,   E§CCON ,   E§TINC ,   E§CINC ,   E§TPRZ ,   E§CPRZ ,   E§TCRR ,   E§CCRR ,   E§TVET ,   E§CVET ,   E§CACO ,   E§CACR ,   E§CLAB ,   E§CLAV ,   E§CSME ,   E§CONS ,   E§SPED ,   E§IMBA ,   E§CAUS ,   E§GCHI ,   E§GCON ,   E§GCOL ,   E§AGEN ,   E§PERP ,   E§AGE1 ,   E§PER1 ,   E§CRCP ,   E§COPA ,   E§CSP1 ,   E§CSP2 ,   E§CSP3 ,   E§CSP4 ,   E§CSP5 ,   E§LIST ,   E§SCON ,   E§PRIO ,   E§FIDO ,   E§BANC ,   E§CCOR ,   E§CBA2 ,   E§IBAN ,   E§SWIF ,   E§CBA3 ,   E§DTIE ,   E§DT01 ,   E§DT02 ,   E§DT03 ,   E§DT04 ,   E§DT05 ,   E§DT06 ,   E§DT07 ,   E§DT08 ,   E§DT09 ,   E§DT10 ,   E§COD1 ,   E§COD2 ,   E§COD3 ,   E§COD4 ,   E§COD5 ,   E§COD6 ,   E§COD7 ,   E§COD8 ,   E§COD9 ,   E§COD0 ,   E§NUM1 ,   E§NUM2 ,   E§NUM3 ,   E§NUM4 ,   E§NUM5 ,   E§NUM6 ,   E§NUM7 ,   E§NUM8 ,   E§NUM9 ,   E§NUM0 ,   E§FL01 ,   E§FL02 ,   E§FL03 ,   E§FL04 ,   E§FL05 ,   E§FL06 ,   E§FL07 ,   E§FL08 ,   E§FL09 ,   E§FL10 ,   E§FL11 ,   E§FL12 ,   E§FL13 ,   E§FL14 ,   E§FL15 ,   E§FL16 ,   E§FL17 ,   E§FL18 ,   E§FL19 ,   E§FL20 ,   E§FL21 ,   E§FL22 ,   E§FL23 ,   E§FL24 ,   E§FL25 ,   E§FL26 ,   E§FL27 ,   E§FL28 ,   E§FL29 ,   E§FL30 ,   E§FL31 ,   E§FL32 ,   E§FL33 ,   E§FL34 ,   E§FL35 ,   E§FL36 ,   E§FL37 ,   E§FL38 ,   E§FL39 ,   E§FL40 ,   E§ORIN ,   E§DTIN ,   E§USIN ,   E§ORAG ,   E§DTAG ,   E§USAG   FROM BRENTI0F   ;")
public class BRENTI2L extends BRENTI0F {
	private static final long serialVersionUID = 1L;

	@Index(unique = false)
	public static enum INDEX_COLUMNS {
		eçcrag, eçtrag, eçazie, eçscen, eçdinv, eçdfnv, eçidoj
	}
}
