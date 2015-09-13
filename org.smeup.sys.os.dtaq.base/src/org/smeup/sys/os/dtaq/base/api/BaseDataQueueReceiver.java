/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.os.dtaq.base.api;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.dtaq.QDataQueueManager;

@Program(name = "QRCVDTAQ")
public class BaseDataQueueReceiver {

	@Inject
	public QDataQueueManager dataQueueManager;
	@Inject
	public QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QDataManager dataManager;

	private QDataFactory dataFactory;

	@PostConstruct
	private void init() {
		this.dataFactory = dataManager.createFactory(job.getContext());
	}

	@Entry
	public void main(@DataDef(length = 10) QCharacter name, @DataDef(length = 10) QCharacter library, @DataDef(precision = 5, packed = true) QDecimal length, QPointer data,
			@DataDef(precision = 5, packed = true) QDecimal wait) {

		// content
		String content = dataQueueManager.readDataQueue(job.getJobID(), library.trimR(), name.trimR(), wait.asInteger() * 1000 * 100, null, null);

		System.out.println("dtaq:\t"+content);
		
		QCharacter character = dataFactory.createCharacter(content.length(), false, false);
		data.assign(character);

		character.movel(content, false);

		length.eval(content.length());
	}
}