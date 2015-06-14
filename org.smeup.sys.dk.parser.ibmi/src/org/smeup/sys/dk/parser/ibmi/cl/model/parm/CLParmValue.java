package org.smeup.sys.dk.parser.ibmi.cl.model.parm;

public class CLParmValue extends CLParmAbstractComponent {

	@Override
	public CLParmComponentType getComponentType() {
		return CLParmComponentType.VALUE;
	}
	
	@Override
	public String toString() {
		return getText();
	}

}
