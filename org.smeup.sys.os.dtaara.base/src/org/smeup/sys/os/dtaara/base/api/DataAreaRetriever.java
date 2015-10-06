/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.dtaara.base.api;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QAdapter;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.dtaara.QDataArea;
import org.smeup.sys.os.dtaara.QDataAreaManager;
import org.smeup.sys.os.dtaara.base.api.tools.DataAreaSpecification;
import org.smeup.sys.os.dtaara.base.api.tools.DataAreaSpecification.SUBSTRINGSPECIFICATIONS;
import org.smeup.sys.os.dtaara.base.api.tools.ExistingDataAreaSpecification.DataAreaNotFoundException;
import org.smeup.sys.os.dtaara.base.api.tools.ExistingDataAreaSpecification.LibraryNotFoundException;

@Program(name = "QCLRTVDA")
public @ToDo class DataAreaRetriever {
	public static enum QCPFMSG {
		CPF1015,     //Non è stata trovata l'area dati &1 in &2.             
		CPF1021,     //Non è stata trovata la libreria &1 per l'area dati &2.
        CPF9899,    //Si è verificato un errore durante l'elaborazione del comando.  
	}

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QDataAreaManager dataAreaManager;
	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QDataManager dataManager;
	
	private QDataFactory dataFactory;

	@PostConstruct
	private void init() {
		this.dataFactory = dataManager.createFactory(job.getContext());
	}
	
	public @Entry void main(DataAreaSpecification dataAreaParm,
							QAdapter cLVariableForReturnedValue) {
		try {
			QDataArea area = dataAreaParm.dataAreaSpecification.asData().findDataArea(job, resourceManager, dataAreaManager, dataAreaParm.dataAreaSpecification.asEnum());

			QCharacter character = dataFactory.createCharacter(area.getContent().length(), false, false);
			if (dataAreaParm.all()) {
				cLVariableForReturnedValue.assign(character);
			} else {
				SUBSTRINGSPECIFICATIONS substringSpec = dataAreaParm.substringSpecifications.asData();
				cLVariableForReturnedValue.assign(character, substringSpec.substringStartingPosition.asInteger());				
			}
			
		} catch (DataAreaNotFoundException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1015, new String[]{e.dataAreaName, e.libraryName});
		} catch (LibraryNotFoundException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1021, new String[]{e.libraryName, e.dataAreaName});
		} catch (RuntimeException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF9899, new String[0]);
		}	
	}

}