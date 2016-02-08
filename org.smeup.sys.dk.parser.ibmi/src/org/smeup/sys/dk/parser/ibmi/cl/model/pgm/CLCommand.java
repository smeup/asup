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

import java.util.Hashtable;
import java.util.LinkedList;

public class CLCommand extends CLAbstractComponent {
	
	private String name = null;
	private LinkedList<CLPositionalParameter> positionalParms = null;
	private Hashtable<String, CLParameter> parms = null;
	private LinkedList<CLMonitorMessage> monitorMessages = null;

	public CLCommand() {
		positionalParms = new LinkedList<CLPositionalParameter>();
		parms = new Hashtable<String, CLParameter>();
		monitorMessages = new LinkedList<CLMonitorMessage>();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addPositionalParm(CLPositionalParameter posParm) {
		positionalParms.add(posParm);
	}

	public LinkedList<CLPositionalParameter> getPositionalParms() {
		return this.positionalParms;
	}
	
	public void addMonMsg(CLMonitorMessage monMsg) {
		monitorMessages.add(monMsg);
	}

	public LinkedList<CLMonitorMessage> getMonMessages() {
		return this.monitorMessages;
	}


	public CLPositionalParameter getPositionalParm(int index) {
		return this.positionalParms.get(index);
	}

	public void addParm(CLParameter parm) {
		parms.put(parm.getName().toUpperCase(), parm);
	}

	public CLParameter getParm(String parmName) {
		return parms.get(parmName.toUpperCase());
	}

	public void setParms(Hashtable<String, CLParameter> parms) {
		this.parms = parms;
	}

	public Hashtable<String, CLParameter> getParms() {
		return this.parms;
	}
	
	@Override
	public CLComponentType getComponentType() {		
		return CLComponentType.COMMAND;
	}

}
