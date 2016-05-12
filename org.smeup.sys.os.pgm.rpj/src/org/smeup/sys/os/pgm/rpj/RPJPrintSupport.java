/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.smeup.sys.os.pgm.rpj;

import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Module;
import org.smeup.sys.il.data.annotation.Module.Scope;

@Module(name = "*PRT", scope = Scope.OWNER)
public class RPJPrintSupport {

	@DataDef(precision = 5)
	public QDecimal page;	

	@DataDef
	public QIndicator qINL1;
	@DataDef
	public QIndicator qINL2;
	@DataDef
	public QIndicator qINL3;
	@DataDef
	public QIndicator qINL4;
	@DataDef
	public QIndicator qINL5;
	@DataDef
	public QIndicator qINL6;
	@DataDef
	public QIndicator qINL7;
	@DataDef
	public QIndicator qINL8;
	@DataDef
	public QIndicator qINL9;
	
	@DataDef
	public QIndicator qINOA;
	@DataDef
	public QIndicator qINOB;
	@DataDef
	public QIndicator qINOC;
	@DataDef
	public QIndicator qINOD;
	@DataDef
	public QIndicator qINOE;
	
	@DataDef
	public QIndicator qINOG;
	@DataDef
	public QIndicator qINOV;
}