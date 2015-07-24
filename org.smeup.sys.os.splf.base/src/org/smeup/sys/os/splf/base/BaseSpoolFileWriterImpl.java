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
package org.smeup.sys.os.splf.base;

import java.io.IOException;
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
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.os.splf.QSpoolFile;
import org.smeup.sys.os.splf.QSpoolFileRow;
import org.smeup.sys.os.splf.QSpoolFileWriter;

public class BaseSpoolFileWriterImpl implements QSpoolFileWriter {
	@Inject
	private QOutputManager outputManager;


	@Override
	public void writeSpoolFile(QContext context, QSpoolFile spoolFile) {
		QObjectWriter objectWriter = outputManager.getDefaultWriter(context);
		List<QSpoolFileRow> rows = spoolFile.getRows();
		objectWriter.initialize();
		
		EClass eClass = createEClass(spoolFile);
		QObject qObject = (QObject) eClass.getEPackage().getEFactoryInstance().create(eClass);
		
	
		for (QSpoolFileRow qSpoolFileRow : rows) {
			try {
				for (EStructuralFeature eStructuralFeature : eClass.getEStructuralFeatures()) {
					((EObject) qObject).eSet(eStructuralFeature, qSpoolFileRow.getContent());
				}	

				objectWriter.write(qObject);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		objectWriter.flush();
	}


	private EClass createEClass(QSpoolFile spoolFile) {
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
		String columnName = spoolFile.getJobUser() + "_" + spoolFile.getJobName() + "_" + spoolFile.getJobNumber();
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
