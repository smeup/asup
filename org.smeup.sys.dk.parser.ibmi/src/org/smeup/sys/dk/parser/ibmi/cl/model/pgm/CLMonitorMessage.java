/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.dk.parser.ibmi.cl.model.pgm;

public class CLMonitorMessage extends CLCommand{
	
	private CLCommand fatherCommand = null;

	public String getMsgID() {
		String result = null;
		if (getParm("MSGID") != null) {
			return getParm("MSGID").getValue().getText();
		}
		return result;
	}
	
	public String getExec() {
		String result = null;
		if (getParm("EXEC") != null) {			
			result =  getParm("EXEC").getValue().getText();
		}
		return result;
	}

	public CLCommand getFatherCommand() {
		return fatherCommand;
	}

	public void setFatherCommand(CLCommand fatherCommand) {
		this.fatherCommand = fatherCommand;
	}
	
	@Override
	public CLComponentType getComponentType() {		
		return CLComponentType.MONMSG;
	}
	
	
}
