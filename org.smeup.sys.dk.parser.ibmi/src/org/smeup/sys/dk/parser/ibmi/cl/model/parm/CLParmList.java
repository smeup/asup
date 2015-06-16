package org.smeup.sys.dk.parser.ibmi.cl.model.parm;


public class CLParmList extends CLParmAbstractComponent {
		
	@Override
	public CLParmComponentType getComponentType() {
		return CLParmComponentType.LIST;
	}
	
	@Override
	public String toString() {
		return getText();
	}

}
