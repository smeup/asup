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
package org.smeup.sys.os.lib.base.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.os.core.jobs.QJob;

@Program(name = "QLIDSPLL")
public class LibraryListEntryDisplayer {
	
	@Inject
	private QOutputManager outputManager;
	@Inject
	private QJob job;

	public @Entry void main(@DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output) {

		QObjectWriter objectWriter = null;

		if (output.asEnum().equals(OUTPUTEnum.PRINT)) {
			objectWriter = outputManager.getObjectWriter(job.getContext(), "P");
		} else {
			objectWriter = outputManager.getDefaultWriter(job.getContext());
		}

		objectWriter.initialize();
		
		EClass eClass = createBaseObjectEClass("Library");
		QObject qObject = (QObject) eClass.getEPackage().getEFactoryInstance().create(eClass);

		List<String> libs = new ArrayList<String>();
				
		libs.add(job.getCurrentLibrary() + " - CUR") ;
		libs.addAll(job.getLibraries());				
		for (String lib : libs) {
			try {
				for (EStructuralFeature eStructuralFeature : eClass.getEStructuralFeatures()) {
					((EObject) qObject).eSet(eStructuralFeature, lib);
				}	

				objectWriter.write(qObject);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
		objectWriter.flush();
	}

	public static enum OUTPUTEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")PRINT
	}
	
	private EClass createBaseObjectEClass(String columnName) {
		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;

		EPackage ePackage = ecoreFactory.createEPackage();
		ePackage.setName("PIPPO");
		ePackage.setNsPrefix("asup");
		ePackage.setNsURI("http://asup");

		EClass eClass = ecoreFactory.createEClass();
		eClass.setName(this.getClass().getSimpleName());
		eClass.getESuperTypes().add(QIntegratedLanguageCorePackage.eINSTANCE.getObjectNameable());

		ePackage.getEClassifiers().add(eClass);
		//
		int columnLength = 198; 

		EAttribute eAttribute = ecoreFactory.createEAttribute();
		eAttribute.setName(columnName);
		eAttribute.setEType(EcorePackage.eINSTANCE.getEString());

		EAnnotation eAnnotation = ecoreFactory.createEAnnotation();
		eAnnotation.setSource(QIntegratedLanguageDataPackage.eNS_PREFIX);
		eAnnotation.getReferences().add(QIntegratedLanguageDataDefPackage.eINSTANCE.getCharacterDef());
		eAnnotation.getDetails().put("length", Integer.toString(columnLength));
		eAttribute.getEAnnotations().add(eAnnotation);

		eClass.getEStructuralFeatures().add(eAttribute);
		
		return eClass;
	}
}
