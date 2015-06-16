package org.smeup.sys.dk.parser.ibmi.cl.model.parm;

public class CLParmToken extends CLParmAbstractComponent {

	@Override
	public CLParmComponentType getComponentType() {
		return CLParmComponentType.TOKEN;
	}
	
	@Override
	public String toString() {
		return getText();
	}

}
