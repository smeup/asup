package org.smeup.sys.dk.parser.ibmi.cl.model.parm;

public class CLParmString extends CLParmAbstractComponent {

	@Override
	public CLParmComponentType getComponentType() {
		return CLParmComponentType.STRING;
	}
	
	@Override
	public String toString() {
		return getText();
	}

}
