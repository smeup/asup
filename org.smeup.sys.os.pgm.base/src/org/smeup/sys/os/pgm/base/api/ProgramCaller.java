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
package org.smeup.sys.os.pgm.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QAdapter;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.pgm.QProgramManager;

@Program(name = "QCLCALL")
public class ProgramCaller {

	@Inject
	private QJob job;
	@Inject
	private QProgramManager programManager;

	@Entry
	public void main(
			@ToDo @DataDef(qualified = true) Program program,
			@ToDo @DataDef(dimension = 255) QList<QAdapter> parameters) {

		QData[] params = new QData[parameters.count()];
		for(int i=1; i<=params.length; i++) 			
			params[i-1] = parameters.get(i);

		programManager.callProgram(job.getJobID(), program.library.asData().trimR(), program.name.trimR(), params);
	}
	

	public static class Program extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}
}