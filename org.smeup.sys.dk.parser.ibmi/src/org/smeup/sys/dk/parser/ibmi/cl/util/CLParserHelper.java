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
package org.smeup.sys.dk.parser.ibmi.cl.util;

import org.antlr.runtime.Parser;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLCommand;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLLabel;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLMonitorMessage;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLObject;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLParameter;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLPositionalParameter;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLRow;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLValue;


public class CLParserHelper extends ParserHelper{

	private Parser parser = null;
	
	private CLObject clObject = null;
	private CLRow lastRow = null;
	private CLCommand lastCommand = null;
//	private CLPositionalParameter lastPositionalPar = null;
	
	/*
	 *  If not null, the parser was managing a MONMSG row.
	 *  
	 *  in this case:
	 *  	- Do not register row containing MONMSG
	 *  	- Add an CLMonMsg object as child of last registered command
	 *   
	 */
	private CLMonitorMessage lastMonMsg = null;
	


    public CLParserHelper(Parser parser) {

        this.parser = parser;
        clObject = new CLObject();
    }

    public CLObject getCLObject()
    {
    	return clObject;
    }

    public void registerRow()
    {
    	if (lastMonMsg == null) {
	    	lastRow = new CLRow();
	    	lastRow.setLine(parser.input.LT(1).getLine());
	
	    	clObject.addRow(lastRow);
    	}
    }

    public void clearRow(String text)
    {
    	if (lastMonMsg == null) lastRow.setText(text);
    }

    public void registerLabel(){
    	CLLabel label = new CLLabel();

    	label.setText(parser.input.LT(1).getText());
    	label.setLine(parser.input.LT(1).getLine());

    	lastRow.setLabel(label);
    }

    public void registerCommand(){

    	// Disable MonMsg mode
    	lastMonMsg = null;
    	
    	// Register new active command
    	lastCommand = new CLCommand();

    	lastCommand.setName(parser.input.LT(1).getText().toUpperCase());
    	lastCommand.setLine(parser.input.LT(1).getLine());

    	lastRow.setCommand(lastCommand);
    }

    public void registerPositionalParm(String text){
    	CLPositionalParameter posParm = new CLPositionalParameter();


    	posParm.setLine(parser.input.LT(1).getLine());
    	
    	if (text.startsWith("(") && text.endsWith(")")) {
    		posParm.setText(text.substring(1, text.length()-1));
    	} else {
    		posParm.setText(text);
    		CLValue value = new CLValue();
    		value.setText(text);
    		posParm.setValue(value);
    	}
    	
    	
    	if (lastMonMsg != null) {
    		String errMsg = "Forbidden positional parm in MONMSG command";
    		parser.reportError(new ParserHelperException(parser.input, errMsg));
    	} else if (lastCommand != null) {
    		lastCommand.addPositionalParm(posParm);
    	} else {
    		String errMsg = "Positional parm without father";
    		parser.reportError(new ParserHelperException(parser.input, errMsg));
    	}    	
    }
    
    public void registerListPositionalParm(String value){
    	CLPositionalParameter posParm = new CLPositionalParameter();

    	posParm.setLine(parser.input.LT(1).getLine());
    	
    	if (value.startsWith("(") && value.endsWith(")")) {
    		posParm.setText(value.substring(1, value.length()-1));
    	} else {
    		posParm.setText(value);
    	}
    	
    	
    	
    	if (lastMonMsg != null) {
    		String errMsg = "Forbidden positional parm in MONMSG command";
    		parser.reportError(new ParserHelperException(parser.input, errMsg));
    	} else if (lastCommand != null) {
    		lastCommand.addPositionalParm(posParm);
    	} else {
    		String errMsg = "Positional parm without father";
    		parser.reportError(new ParserHelperException(parser.input, errMsg));
    	} 
    	
    	// Register
    }

    public void registerParm(String name, String value){    	
    	CLParameter parm = new CLParameter();

    	parm.setLine(parser.input.LT(1).getLine());

    	parm.setName(name.toUpperCase());
    	parm.setText(value.substring(1, value.length()-1));

    	if (lastMonMsg != null){
    		lastMonMsg.addParm(parm);
    	} else	if (lastCommand != null) {	
    		lastCommand.addParm(parm);
    	} else {
    		String errMsg = "Parameter without father";
    		parser.reportError(new ParserHelperException(parser.input, errMsg));
    	}    	
    }
    
    public void registerMonitorMessage(){
    	if (lastCommand != null) {
	    	CLMonitorMessage monitorMsg = new CLMonitorMessage();
	    	monitorMsg.setName(parser.input.LT(1).getText().toUpperCase());
	    	monitorMsg.setLine(parser.input.LT(1).getLine());
	    	monitorMsg.setFatherCommand(lastCommand);    	
	    	lastCommand.addMonMsg(monitorMsg);    	    	
	    	lastMonMsg = monitorMsg;    	    	
    	} else {    		
    		String errMsg = "MONMSG without related CMD"; 
    		parser.reportError(new ParserHelperException(parser.input, errMsg));
    	}
    		
    }
}
