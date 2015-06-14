package org.smeup.sys.dk.parser.ibmi.cl.model.parm;

public class CLParmHexadecimal extends CLParmAbstractComponent {
	
	

	@Override
	public CLParmComponentType getComponentType() {
		return CLParmComponentType.HEX;
	}

	@Override
	public String toString() {
		return getText();
	}
}
