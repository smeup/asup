/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi 			 - Initial API and implementation
 *   Giuliano Giancristofaro - Implementation
 */
package org.smeup.sys.dk.compiler.rpj;

import java.util.HashMap;
import java.util.Map;

public class RPJCallableUnitInfo {

	private Map<String, Label> labels;
	private boolean containsSQLStatement = false;
	private boolean containsCMDStatement = false;

	public RPJCallableUnitInfo() {
		reset();
	}

	public void containsSQLStatement(boolean containsSQLStatement) {
		this.containsSQLStatement = containsSQLStatement;
	}

	public void containsCMDStatement(boolean containsCMDStatement) {
		this.containsCMDStatement = containsCMDStatement;
	}

	public boolean containsSQLStatement() {
		return this.containsSQLStatement;
	}

	public boolean containsCMDStatement() {
		return this.containsCMDStatement;
	}

	public Map<String, Label> getLabels() {
		return this.labels;
	}

	public void reset() {
		this.labels = new HashMap<String, RPJCallableUnitInfo.Label>();
		this.containsSQLStatement = false;
	}

	public static class Label {

		public int jumpsCount = 0;

	}
}
