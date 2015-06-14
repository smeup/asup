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
package org.smeup.sys.os.file.base.api;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QStatement;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;

@Program(name = "QSQSCHEM", text = "Run SQL Statement")
public class SQLStatementRunner {

	@Inject
	private QOutputManager outputManager;

	@Inject
	private QJob job;

	@Entry
	public void main(@DataDef(length = 5000) QCharacter sql, @DataDef(length = 10) QEnum<COMMITMENTCONTROLEnum, QCharacter> commitmentControl,
			@DataDef(length = 10) QEnum<NAMINGEnum, QCharacter> naming, @DataDef(length = 8) QEnum<DATEFORMATEnum, QCharacter> dateFormat, @DataDef(length = 8) QCharacter dateSeparatorCharacter,
			@DataDef(length = 8) QEnum<TIMEFORMATEnum, QCharacter> timeFormat, @DataDef(length = 8) QCharacter timeSeparatorCharacter,
			@DataDef(length = 10) QEnum<DEFAULTCOLLECTIONEnum, QCharacter> defaultCollection, @DataDef(length = 10) QEnum<DECIMALPOINTEnum, QCharacter> decimalPoint,
			@DataDef(qualified = true) QEnum<SORTSEQUENCEEnum, SORTSEQUENCE> sortSequence, @DataDef(length = 10) QEnum<LANGUAGEIDEnum, QCharacter> languageId,
			@DataDef(length = 10) QEnum<ALLOWCOPYOFDATAEnum, QCharacter> allowCopyOfData, @DataDef(length = 10) QEnum<ALLOWBLOCKINGEnum, QCharacter> allowBlocking,
			@DataDef(length = 10) QEnum<SQLRULESEnum, QCharacter> sQLRules, DECIMALRESULTOPTIONS decimalResultOptions, @DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output) {

		QObjectWriter objectWriter = null;

		switch (output.asEnum()) {
		case PRINT:
			objectWriter = outputManager.getObjectWriter(job.getContext(), "P");
			break;
		case TERM_STAR:
			objectWriter = outputManager.getDefaultWriter(job.getContext());
			break;
		}

		objectWriter.initialize();

		QConnection databaseConnection = job.getContext().getAdapter(job, QConnection.class);

		// fileManager.getDatabaseConnection(job);

		QStatement statement = null;
		try {

			statement = databaseConnection.createStatement();

			ResultSet resultSet = statement.executeQuery(sql.trimR());

			EClass eClass = createEClass(resultSet);
			QObject qObject = (QObject) eClass.getEPackage().getEFactoryInstance().create(eClass);

			while (resultSet.next()) {

				for (EStructuralFeature eStructuralFeature : eClass.getEStructuralFeatures()) {
					String value = resultSet.getString(eStructuralFeature.getName());
					((EObject) qObject).eSet(eStructuralFeature, value);
				}

				try {
					objectWriter.write(qObject);
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e);
		} finally {

			objectWriter.flush();

			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					throw new OperatingSystemRuntimeException(e);
				}
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

	public static enum COMMITMENTCONTROLEnum {
		CHG, UR, CS, ALL, RS, NONE, NC, RR
	}

	public static enum NAMINGEnum {
		SYS, SQL
	}

	public static enum DATEFORMATEnum {
		JOB, USA, ISO, EUR, JIS, MDY, DMY, YMD, JUL
	}

	public static enum TIMEFORMATEnum {
		HMS, USA, ISO, EUR, JIS
	}

	public static enum DEFAULTCOLLECTIONEnum {
		NONE, OTHER
	}

	public static enum DECIMALPOINTEnum {
		JOB, SYSVAL, PERIOD, COMMA
	}

	public static class SORTSEQUENCE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum SORTSEQUENCEEnum {
		JOB, LANGIDUNQ, LANGIDSHR, HEX, OTHER
	}

	public static enum LANGUAGEIDEnum {
		JOB, OTHER
	}

	public static enum ALLOWCOPYOFDATAEnum {
		OPTIMIZE, YES, NO
	}

	public static enum ALLOWBLOCKINGEnum {
		ALLREAD, NONE, READ
	}

	public static enum SQLRULESEnum {
		DB2, STD
	}

	public static class DECIMALRESULTOPTIONS extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 2)
		public QCharacter maximumPrecision;
		@DataDef(length = 2)
		public QCharacter maximumScale;
		@DataDef(length = 2)
		public QCharacter minimumDivideScale;
	}

	public static enum OUTPUTEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT
	}
}