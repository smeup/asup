/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RPJCallableUnitInfo {

	private Map<String, Label> labels;
	private Set<String> resetObjects;

	private boolean containsDSPStatement = false;
	private boolean containsPRTStatement = false;
	private boolean containsSQLStatement = false;
	private boolean containsCMDStatement = false;
	
	private boolean containsInsignificantZeros = false;

	public RPJCallableUnitInfo() {
		reset();
	}

	public void containsSQLStatement(boolean containsSQLStatement) {
		this.containsSQLStatement = containsSQLStatement;
	}

	public void containsCMDStatement(boolean containsCMDStatement) {
		this.containsCMDStatement = containsCMDStatement;
	}

	public void containsInsignificantZeros(boolean containsInsignificantZeros) {
		this.containsInsignificantZeros = containsInsignificantZeros;
	}

	public boolean containsSQLStatement() {
		return this.containsSQLStatement;
	}

	public boolean containsCMDStatement() {
		return this.containsCMDStatement;
	}

	public boolean containsInsignificantZeros() {
		return containsInsignificantZeros;
	}

	public void containsDSPStatement(boolean containsDSPStatement) {
		this.containsDSPStatement = containsDSPStatement;
	}
	
	public void containsPRTStatement(boolean containsPRTStatement) {
		this.containsPRTStatement = containsPRTStatement;
	}

	public boolean containsDSPStatement() {
		return this.containsDSPStatement;
	}
	
	public boolean containsPRTStatement() {
		return this.containsPRTStatement;
	}

	public Map<String, Label> getLabels() {
		return this.labels;
	}

	public Set<String> getResetObjects() {
		return this.resetObjects;
	}
	
	public void reset() {
		this.labels = new HashMap<String, RPJCallableUnitInfo.Label>();
		this.resetObjects = new HashSet<String>();
		this.containsSQLStatement = false;
		this.containsInsignificantZeros = false;
		this.containsPRTStatement = false;
		this.containsDSPStatement = false;
	}

	public static class Label {

		public int jumpsCount = 0;

	}
}
