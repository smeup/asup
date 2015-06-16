/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.dk.parser.ibmi.cl;

import org.antlr.runtime.tree.Tree;
import org.smeup.sys.dk.parser.ibmi.cl.antlr.CLLexer;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLCommand;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLLabel;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLObject;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLParameter;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLPositionalParameter;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLRow;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLValue;

public abstract class CLAbstractParserWrapper {

	public CLAbstractParserWrapper() {
		super();
	}

	protected void build(CLObject cl, Tree antlrNode) {
		
		/**
		 * A CL node contain a list of Rows
		 */
		
		for (int i = 0; i < antlrNode.getChildCount(); i++) {
			Tree antlrChild = antlrNode.getChild(i);
			
			if (antlrChild.getType() == CLLexer.ROW) {
				
				CLRow row = new CLRow();
				row.setFather(null);
				row.setText(antlrChild.getText());
				build(row, antlrChild);
				
				cl.addRow(row);
			}				
		}		
	}

	protected void build(CLRow row, Tree antlrNode) {
		
		/**
		 * A row node contain:
		 * 
		 * 1) A label
		 * 2) A command
		 * 
		 */
		
		for (int i = 0; i < antlrNode.getChildCount(); i++) {
		
			Tree antlrChild = antlrNode.getChild(i);
			
			switch (antlrChild.getType()) {
			
			case CLLexer.LABEL:
				CLLabel label = new CLLabel();
				label.setFather(null);
				label.setText(antlrChild.getText());
				row.setLabel(label);
			break;	
			
			case CLLexer.COMMAND:
				CLCommand cmd = new CLCommand();
				cmd.setFather(null);
				cmd.setText(antlrChild.getText());
				build(cmd, antlrChild);		

				row.setCommand(cmd);
			break;	
	
			}
		}
	}

	protected void build(CLCommand cmd, Tree antlrNode) {
		
		/**
		 * A command node contains:
		 * 
		 * 1) The command name
		 * 2) One or more Positional Parameter
		 * 3) One or more Parameter
		 */
		
		for (int i = 0; i < antlrNode.getChildCount(); i++) {
			
			Tree antlrChild = antlrNode.getChild(i);
			
			switch (antlrChild.getType()) {
			
				case CLLexer.CMD_NAME:					
					cmd.setName(antlrChild.getText());
				break;	
			
			
				case CLLexer.POS_PAR:
					CLPositionalParameter posPar = new CLPositionalParameter();
					posPar.setFather(cmd);
					posPar.setText(antlrChild.getText());	
					build(posPar, antlrChild);
					cmd.addPositionalParm(posPar);
					
				break;	
				
				case CLLexer.PAR:
					CLParameter par = new CLParameter();
					par.setFather(cmd);
					par.setText(antlrChild.getText());
					build(par, antlrChild);
					
					cmd.addParm(par);
				break;	
			}
		}
	}

	protected void build(CLPositionalParameter posPar, Tree antlrNode) {
				
		CLValue value = new CLValue();
		value.setFather(posPar);
		value.setText(posPar.getText());
		
		posPar.setValue(value);
	}

	protected void build(CLParameter par, Tree antlrNode) {

		for (int i = 0; i < antlrNode.getChildCount(); i++) {
			
			Tree antlrChild = antlrNode.getChild(i);
			
			switch (antlrChild.getType()) {
			
				case CLLexer.PAR_NAME:					
					par.setName(antlrChild.getText());
				break;	
				
				case CLLexer.PAR_VALUE:
					
					String text = antlrChild.getText();
					
					if (text.startsWith("(") && text.endsWith(")")) {
						text = text.substring(1, text.length()-1);
					}

					CLValue value = new CLValue();
					value.setFather(par);
					value.setText(text);					
					
					par.setValue(value);
				break;	
			}
		}		
	}

}