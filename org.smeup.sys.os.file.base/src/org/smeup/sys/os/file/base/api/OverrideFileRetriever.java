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
package org.smeup.sys.os.file.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;



@Program(name = "QDMRTVFO")
public class OverrideFileRetriever {

	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;
	
	@Main
	public void main() {
		
		jobLogManager.error(job, "***TODO*** Implement API - QDMRTVFO - OverrideFileRetriever");
		System.err.println("***TODO*** Implement API - QDMRTVFO - OverrideFileRetriever");
		
	}
}