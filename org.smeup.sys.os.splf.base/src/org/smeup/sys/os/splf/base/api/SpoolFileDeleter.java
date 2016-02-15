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
package org.smeup.sys.os.splf.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionParserRegistry;
import org.smeup.sys.il.expr.QPredicateExpression;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.splf.QSpoolFile;

public @Program(name = "QSPHNMLT") class SpoolFileDeleter {

	public static enum QCPFMSG {
		CPF3309, CPC3305
	}

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QExpressionParserRegistry expressionParserRegistry;

	@Main
	public void main(@DataDef(length = 255) QCharacter spoolID, @DataDef(length = 10) QCharacter user) {

		QResourceWriter<QSpoolFile> spoolFileWriter = resourceManager.getResourceWriter(job, QSpoolFile.class, Scope.SYSTEM_LIBRARY);

		if (valid(spoolID)) {
			deleteSpoolByID(spoolID, spoolFileWriter);
		} else {
			deleteSpoolByUser(user, spoolFileWriter);
		}

	}

	private void deleteSpoolByUser(QCharacter user, QResourceWriter<QSpoolFile> spoolFileWriter) {
		QExpressionParser expressionParser = expressionParserRegistry.lookup(QExpressionParserRegistry.DEFAULT_PARSER);
		QPredicateExpression filter = expressionParser.parsePredicate("jobUser *EQ '" + user.trimR() + "'");
		try (QObjectIterator<QSpoolFile> spoolIterator = spoolFileWriter.findByExpression(filter);) {
			int deleted = 0;
			while (spoolIterator.hasNext()) {
				spoolFileWriter.delete(spoolIterator.next());
				deleted++;
			}
			throw exceptionManager.prepareException(job, QCPFMSG.CPC3305, new String[] { "" + deleted, "0" });
		}
	}

	private void deleteSpoolByID(QCharacter spoolID, QResourceWriter<QSpoolFile> spoolFileWriter) {
		QSpoolFile spoolFile = spoolFileWriter.lookup(spoolID.trimR());
		if (spoolFile == null) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF3309, new String[] { spoolID.trimR() });
		}
		spoolFileWriter.delete(spoolFile);
	}

	private boolean valid(QCharacter spoolID) {
		try {
			return new Integer(spoolID.trimR()).intValue() > 0;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
