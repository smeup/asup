/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.cmd.base.api.tools;

import java.io.IOException;

import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.cmd.QCommand;
import org.smeup.sys.os.cmd.QCommandParameter;
import org.smeup.sys.os.core.jobs.QJob;

public class CommandDisplayerHandler {
	
	public static enum OutputType {
		@Special(value = "*") TERM_STAR, 
		@Special(value = "L") PRINT
	}
	
	private QObjectWriter qObjectWriter;

	public CommandDisplayerHandler(QJob job, QOutputManager outputManager,	OutputType outputType) {
		if (OutputType.PRINT.equals(outputType)) {
			this.qObjectWriter = outputManager.getObjectWriter(job.getContext(), "P");
		} else {
			this.qObjectWriter = outputManager.getDefaultWriter(job.getContext());
		}
	}

	
	public CommandDisplayerHandler(QJob job, QOutputManager outputManager) {
		this(job, outputManager, OutputType.TERM_STAR);
	}


	public void displayParameters(QCommand qCommand) {
		this.qObjectWriter.initialize();
		for (QCommandParameter qCommandParameter : qCommand.getParameters())
			try {
				qObjectWriter.write(qCommandParameter);
			} catch (IOException e) {
				e.printStackTrace();
			}
		this.qObjectWriter.flush();
	}
	

	public void displayCommand(QCommand qCommand) {
		this.qObjectWriter.initialize();
		try {
			qObjectWriter.write(qCommand);
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.qObjectWriter.flush();
	}

}
