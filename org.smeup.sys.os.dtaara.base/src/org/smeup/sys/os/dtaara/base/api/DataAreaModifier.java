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

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.core.java.QStrings;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.dtaara.DataAreaType;
import org.smeup.sys.os.dtaara.QDataArea;
import org.smeup.sys.os.dtaara.QDataAreaManager;
import org.smeup.sys.os.dtaara.base.api.tools.DataAreaEditor;
import org.smeup.sys.os.dtaara.base.api.tools.DataAreaEditor.DataTooLongException;
import org.smeup.sys.os.dtaara.base.api.tools.DataAreaEditor.InvalidBooleanValueException;
import org.smeup.sys.os.dtaara.base.api.tools.DataAreaEditor.InvalidSubstringException;
import org.smeup.sys.os.dtaara.base.api.tools.DataAreaEditor.TypeAndValueMismatchException;
import org.smeup.sys.os.dtaara.base.api.tools.DataAreaEditor.WrongStartPositionException;
import org.smeup.sys.os.dtaara.base.api.tools.DataAreaSpecification;
import org.smeup.sys.os.dtaara.base.api.tools.DataAreaSpecification.SUBSTRINGSPECIFICATIONS;
import org.smeup.sys.os.dtaara.base.api.tools.ExistingDataAreaSpecification;
import org.smeup.sys.os.dtaara.base.api.tools.ExistingDataAreaSpecification.DataAreaNotFoundException;
import org.smeup.sys.os.dtaara.base.api.tools.ExistingDataAreaSpecification.LibraryNotFoundException;

@Program(name = "QWCCCHVC")
public @ToDo class DataAreaModifier {
	public static enum QCPFMSG {
		CPF1015,    //Non è stata trovata l'area dati &1 in &2.              
		CPF1019,    //Il parametro VALUE non è corretto.                     
		CPF1020,    //Il parametro VALUE è troppo lungo.                     
		CPF1021,    //Non è stata trovata la libreria &1 per l'area dati &2. 
		CPF1026,    //Il parametro VALUE deve essere '0' o '1'.              
		CPF1062,    //La stringa nulla non è valida come valore di caratteri.
		CPF1087,    //Per l'area dati logica o decimale non è consentita la sottostringa.                                            
		CPF1088,    //La posizione iniziale si trova al di fuori dell'area dati.                                                    
		CPF1089,    //La sottostringa specificata per l'area dati non è valida.                                                  
		CPF1138,    //Il parametro VALUE non è di tipo valido per l'area dati &1.                                                      
		CPF1155,    //Il parametro VALUE è troppo lungo per l'area dati &1.    
		CPF1162,    //L'allineamento dei limiti per l'area dati &1 non è valido.
        CPF1170,    //La posizione iniziale si trova al di fuori dell'area dati &1.                                                 
        CPF1192,    //La sottostringa specificata per l'area dati &1 non è valida.                                                  
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
	private  QStrings stringsUtils;
	
	public @Entry void main(DataAreaSpecification dataAreaParm, 
							@DataDef(length = 2000) QCharacter value) {
		try {
			
			QDataArea area = dataAreaParm.dataAreaSpecification.asData().findDataArea(job, resourceManager, dataAreaManager, dataAreaParm.dataAreaSpecification.asEnum());
			
			
			if (!dataAreaParm.all() && !area.getDataAreaType().equals(DataAreaType.CHARACTER)) {
				throw exceptionManager.prepareException(job, QCPFMSG.CPF1087, new String[0]);
			}
			
			
			DataAreaEditor dataAreaEditor = new DataAreaEditor(area, stringsUtils);
			
			if (dataAreaParm.all()) {
				dataAreaEditor.setValue(value.trimR());
			} else {
				SUBSTRINGSPECIFICATIONS substringspecification = dataAreaParm.substringSpecifications.asData();
				dataAreaEditor.setValue(value.trimR(), 
										substringspecification.substringStartingPosition.asInteger(),
										substringspecification.substringLength.asInteger());
			}
			
			if (dataAreaParm.dataAreaSpecification.asEnum().equals(ExistingDataAreaSpecification.DATAAREAEnum.OTHER)) {
				resourceWriter(area.getLibrary()).save(area, true);
			}
			
		} catch (DataAreaNotFoundException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1015, new String[]{e.dataAreaName, e.libraryName});
		} catch (LibraryNotFoundException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1021, new String[]{e.libraryName, e.dataAreaName});
		} catch (DataTooLongException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1020, new String[0]);
		} catch (TypeAndValueMismatchException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1019, new String[0]);
		} catch (InvalidBooleanValueException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1026, new String[0]);
		} catch (WrongStartPositionException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1088, new String[0]);
		} catch (InvalidSubstringException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1089, new String[0]);
		} catch (RuntimeException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF9899, new String[0]);
		}
	}


	private QResourceWriter<QDataArea> resourceWriter(String libName) {
		return resourceManager.getResourceWriter(job, QDataArea.class, libName);
	}


}
