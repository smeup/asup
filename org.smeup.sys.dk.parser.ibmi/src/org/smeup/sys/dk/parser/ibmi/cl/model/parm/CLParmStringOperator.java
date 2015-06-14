package org.smeup.sys.dk.parser.ibmi.cl.model.parm;

public class CLParmStringOperator extends CLParmAbstractComponent {
	
	public enum CLParmStringOperatorType {
		CAT,
		BCAT,
		TCAT
	}
	
	private CLParmStringOperatorType operatorType = null;	

	@Override
	public CLParmComponentType getComponentType() {
		return CLParmComponentType.STR_OPERATOR;
	}

	public CLParmStringOperatorType getOperatorType() {
		return operatorType;
	}

	public void setOperatorType(CLParmStringOperatorType cat) {
		this.operatorType = cat;
	}
	
	@Override
	public String toString() {
		
		return getText();
	}

}
