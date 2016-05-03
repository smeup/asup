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
package org.smeup.sys.os.cmd.ibmi;

import java.io.IOException;

import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.QResourceListener;
import org.smeup.sys.il.memo.ResourceEventType;
import org.smeup.sys.os.cmd.QCommand;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;

public class IBMiCommandListenerImpl implements QResourceListener<QCommand> {

	@Override
	public void handleEvent(QResourceEvent<QCommand> event) {

		if (event.getEventType() != ResourceEventType.PRE_SAVE)
			return;

		QCommand command = event.getSource();

		switch (event.getEventType()) {

		case PRE_SAVE:

			try {
				if(command.getParameters().isEmpty())
					IBMiCommandBuilder.buildCommand(command);
			} catch (IOException e) {
				throw new OperatingSystemRuntimeException(e);
			}
			break;

		default:
			break;
		}
	}
}