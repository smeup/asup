package org.smeup.sys.dk.parser.ibmi.cl.model.parm;

public class CLParmVariable extends CLParmAbstractComponent {

	@Override
	public CLParmComponentType getComponentType() {
		return CLParmComponentType.VARIABLE;
	}
	
	@Override
	public String toString() {
		return getText();
	}

}
