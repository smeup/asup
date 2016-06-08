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

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.os.pgm.QProgramStatus;

public class RPJProgramStatus extends QDataStructWrapper implements QProgramStatus {

	private static final long serialVersionUID = 1L;

	@DataDef(length = 10)
	public QCharacter programName;
	@DataDef(precision = 5)
	public QDecimal statusCode;
	@DataDef(precision = 5)
	public QDecimal previousStatus;
	@DataDef(length = 8)
	public QCharacter lineNumber;
	@DataDef(length = 8)
	public QCharacter routineName;
	@DataDef(precision = 3)
	public QDecimal parametersNumber;
	@DataDef(length = 3)
	public QCharacter exceptionType;
	@DataDef(length = 3)
	public QCharacter exceptionNumber;
	@DataDef(length = 4)
	public QCharacter filler_0;
	@DataDef(length = 30)
	public QCharacter workAreaMessage;
	@DataDef(length = 10)
	public QCharacter programLibrary;
	@DataDef(length = 80)
	public QCharacter messageText;
	@DataDef(length = 8)
	@Overlay(position = 201)
	public QCharacter fileName;
	@DataDef(length = 35)
	@Overlay(position = 209)
	public QCharacter fileInformation;
	@DataDef(length = 10)
	@Overlay(position = 244)
	public QCharacter jobName;
	@DataDef(length = 10)
	@Overlay(position = 254)
	public QCharacter userName;
	@DataDef(precision = 6)
	@Overlay(position = 264)
	public QDecimal jobNumber;
	@DataDef(length = 10)
	@Overlay(position = 334)
	public QCharacter moduleName;

	@Override
	public QCharacter getProgramName() {
		return this.programName;
	}

	@Override
	public QCharacter getProgramLibrary() {
		return this.programLibrary;
	}

	@Override
	public QCharacter getUserName() {
		return this.userName;
	}

	@Override
	public QDecimal getJobNumber() {
		return this.jobNumber;
	}

	@Override
	public QCharacter getJobName() {
		return this.jobName;
	}

	@Override
	public QDecimal getStatusCode() {
		return this.statusCode;
	}

	@Override
	public QDecimal getParametersNumber() {
		return this.parametersNumber;
	}
}