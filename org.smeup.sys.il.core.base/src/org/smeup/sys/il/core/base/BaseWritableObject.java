package org.smeup.sys.il.core.base;

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
import org.smeup.sys.il.core.out.QWritableObject;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;

public class BaseWritableObject implements QWritableObject {
	private EClass eClass;
	private QObject qObject;

	public BaseWritableObject(String columnName) {
		eClass = createBaseObjectEClass(columnName);
		qObject = (QObject) eClass.getEPackage().getEFactoryInstance().create(eClass);
	}
	
	@Override
	public void setObject(Object object) {
		EStructuralFeature eStructuralFeature = eClass.getEStructuralFeatures().get(0);
		((EObject) qObject).eSet(eStructuralFeature, object);
	}
	
	@Override
	public QObject getObjectToWrite() {
		return qObject;
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
