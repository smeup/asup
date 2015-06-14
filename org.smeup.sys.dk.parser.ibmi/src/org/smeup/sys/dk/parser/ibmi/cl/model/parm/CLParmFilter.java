package org.smeup.sys.dk.parser.ibmi.cl.model.parm;

public class CLParmFilter extends CLParmAbstractComponent {
	
	

	@Override
	public CLParmComponentType getComponentType() {
		return CLParmComponentType.FILTER;
	}

	@Override
	public String toString() {
		return getText();
	}
}
