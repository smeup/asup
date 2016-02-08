/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 *   Mattia Rocchi - Implementation
 */
package org.smeup.sys.os.cmd.ibmi;

import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QDataTermVisitor;

public class IBMiCommandStringBuilder implements QDataTermVisitor {

	private StringBuffer buffer = new StringBuffer();

	QDataContainer targetDataContainer = null;

	public void setTarget(QDataContainer dataContainer) {
		targetDataContainer = dataContainer;
		clear();
	}

	public String getResult() {
		return buffer.toString();
	}

	public void clear() {
		buffer = new StringBuffer();
	}

	@Override
	public void endVisit(QDataTerm<?> term) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean visit(QDataTerm<?> term) {
		// TODO Auto-generated method stub
		return false;
	}

}
