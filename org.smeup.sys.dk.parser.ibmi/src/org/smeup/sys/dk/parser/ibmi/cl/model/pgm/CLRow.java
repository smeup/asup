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


public class CLRow extends CLAbstractComponent {
	
	private CLLabel label = null;
	private CLCommand command = null;

	public CLLabel getLabel() {
		return this.label;
	}

	public void setLabel(CLLabel label) {
		this.label = label;
	}

	public CLCommand getCommand() {
		return this.command;
	}

	public void setCommand(CLCommand command) {
		this.command = command;
	}
	
	@Override
	public CLComponentType getComponentType() {		
		return CLComponentType.ROW;
	}



}
