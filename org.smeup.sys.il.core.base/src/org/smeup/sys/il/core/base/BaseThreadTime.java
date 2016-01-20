/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.il.core.base;

public class BaseThreadTime {

	double cpuUsage = 0;

	public BaseThreadTime(double cpuUsage) {
		this.cpuUsage = cpuUsage;
	}

	protected double getCPUUsage() {
		return cpuUsage;
	}

	protected void setCPUUsage(double cpuUsage) {
		this.cpuUsage = cpuUsage;
	}
}