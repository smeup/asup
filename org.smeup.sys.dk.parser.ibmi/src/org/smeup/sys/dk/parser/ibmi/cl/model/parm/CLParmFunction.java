package org.smeup.sys.dk.parser.ibmi.cl.model.parm;

public class CLParmFunction extends CLParmAbstractComponent {

	public enum CLParmFunctionType {
		SST,
		SWITCH,
		BINARY,
		BIN	
	}

	private CLParmFunctionType functionType = null;
	private CLParmList parms = null;	

	public CLParmFunctionType getFunctionType() {
		return functionType;
	}

	public void setFunctionType(CLParmFunctionType functionType) {
		this.functionType = functionType;
	}
	
	public CLParmList getParms() {
		return parms;
	}

	public void setParms(CLParmList parms) {
		this.parms = parms;
	}

	@Override
	public CLParmComponentType getComponentType() {
		return CLParmComponentType.FUNCTION;		
	}
	
	@Override
	public String toString() {
		return getText() + parms.toString();
	}
}
