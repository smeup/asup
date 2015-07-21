package org.smeup.sys.os.file.base.api.tools;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

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
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;


public class Dysplayer {

	private QObjectWriter objectWriter;

	public Dysplayer(QObjectWriter objectWriter) {
		this.objectWriter = objectWriter;
	}

	public void display(ResultSet resultSet) throws SQLException {
		try {
			objectWriter.initialize();
			
			EClass eClass = createEClass(resultSet);
			QObject qObject = (QObject) eClass.getEPackage().getEFactoryInstance().create(eClass);

			boolean firstTime = true;
			while(next(resultSet) || firstTime) {
				firstTime = false;
				for (EStructuralFeature eStructuralFeature : eClass.getEStructuralFeatures()) {
					((EObject) qObject).eSet(eStructuralFeature, getString(resultSet, eStructuralFeature.getName()));
				}	
				try {
					objectWriter.write(qObject);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} finally {
			objectWriter.flush();
		}
	}

	private String getString(ResultSet resultSet, String name) {
		try {
			return resultSet.getString(name);
		} catch (Exception e) {
			return "";
		}
	}

	private boolean next(ResultSet resultSet) {
		try {
			return resultSet.next();
		} catch (Exception e) {
			return false;
		}
	}

	private EClass createEClass(ResultSet resultSet) throws SQLException {
		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;

		EPackage ePackage = ecoreFactory.createEPackage();
		ePackage.setName("PIPPO");
		ePackage.setNsPrefix("asup");
		ePackage.setNsURI("http://asup");

		EClass eClass = ecoreFactory.createEClass();
		eClass.setName(this.getClass().getSimpleName());
		eClass.getESuperTypes().add(QIntegratedLanguageCorePackage.eINSTANCE.getObjectNameable());

		ePackage.getEClassifiers().add(eClass);

		ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

		for (int c = 1; c <= resultSetMetaData.getColumnCount(); c++) {

			String columnName = resultSetMetaData.getColumnName(c);
			int columnLength = resultSetMetaData.getPrecision(c);

			EAttribute eAttribute = ecoreFactory.createEAttribute();
			eAttribute.setName(columnName);
			eAttribute.setEType(EcorePackage.eINSTANCE.getEString());

			EAnnotation eAnnotation = ecoreFactory.createEAnnotation();
			eAnnotation.setSource(QIntegratedLanguageDataPackage.eNS_PREFIX);
			eAnnotation.getReferences().add(QIntegratedLanguageDataDefPackage.eINSTANCE.getCharacterDef());
			eAnnotation.getDetails().put("length", Integer.toString(columnLength));
			eAttribute.getEAnnotations().add(eAnnotation);

			eClass.getEStructuralFeatures().add(eAttribute);
		}

		return eClass;
	}

}
