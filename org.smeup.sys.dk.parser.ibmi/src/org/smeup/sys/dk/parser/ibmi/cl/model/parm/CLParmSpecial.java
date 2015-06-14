package org.smeup.sys.dk.parser.ibmi.cl.model.parm;

public class CLParmSpecial extends CLParmAbstractComponent {
	
	

	@Override
	public CLParmComponentType getComponentType() {
		return CLParmComponentType.SPECIAL;
	}

	@Override
	public String toString() {
		return getText();
	}
}
