/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi 			 - Initial API and implementation
 *   Giuliano Giancristofaro - Implementation
 */
package org.smeup.sys.dk.compiler.rpj;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.dk.compiler.DevelopmentKitCompilerRuntimeException;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerLinker;
import org.smeup.sys.dk.compiler.QDevelopmentKitCompilerFactory;
import org.smeup.sys.il.core.QDerived;
import org.smeup.sys.il.core.QIntegratedLanguageCoreFactory;
import org.smeup.sys.il.core.QRemap;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.flow.QCallableUnit;
import org.smeup.sys.il.flow.QDataSection;
import org.smeup.sys.il.flow.QFileSection;
import org.smeup.sys.il.flow.QSetupSection;
import org.smeup.sys.il.isam.QDataSetTerm;
import org.smeup.sys.il.isam.QDisplayTerm;
import org.smeup.sys.il.isam.QFileTerm;
import org.smeup.sys.il.isam.QPrintTerm;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.file.QDatabaseFile;
import org.smeup.sys.os.file.QDatabaseFileFormat;
import org.smeup.sys.os.file.QDisplayFile;
import org.smeup.sys.os.file.QExternalFile;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileFormat;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QLogicalFile;
import org.smeup.sys.os.file.QOperatingSystemFileFactory;
import org.smeup.sys.os.file.QPrinterFile;
import org.smeup.sys.os.file.QSourceFile;
import org.smeup.sys.os.file.impl.FileFormatImpl;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.module.QModule;

public class RPJCallableUnitLinker {

	@Inject
	private QCompilationUnit compilationUnit;
	@Inject
	private QJob job;
	@Inject
	private QFileManager fileManager;
	@Inject
	private QExpressionParser expressionParser;
	@Inject
	private QDataFactory dataFactory;
	@Inject
	private QResourceManager resourceManager;

	private QResourceReader<QFile> fileReader;
	private QResourceReader<QModule> moduleReader;
	private QResourceReader<QLibrary> libraryReader;

	@PostConstruct
	public void init() {
		this.fileReader = resourceManager.getResourceReader(job, QFile.class, Scope.LIBRARY_LIST);
		this.moduleReader = resourceManager.getResourceReader(job, QModule.class, Scope.LIBRARY_LIST);
		this.libraryReader = resourceManager.getResourceReader(job, QLibrary.class, Scope.LIBRARY_LIST);
	}

	public void linkExternalDatas() {

		if (!(compilationUnit.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getRoot();

		QDataSection dataSection = callableUnit.getDataSection();
		if (dataSection == null)
			return;

		RPJDataTermLinker externalNameLinker = new RPJDataTermLinker(compilationUnit);
		for (QDataTerm<?> dataTerm : dataSection.getDatas())
			dataTerm.accept(externalNameLinker);

	}

	public void linkLikeDatas() {

		if (!(compilationUnit.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getRoot();

		QDataSection dataSection = callableUnit.getDataSection();
		if (dataSection == null)
			return;

		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(dataSection.getDatas());

		RPJDataLikeRefactor dataLikeVisitor = new RPJDataLikeRefactor(compilationUnit);
		for (QDataTerm<?> dataTerm : dataTerms) {
			dataLikeVisitor.reset();

			dataTerm.accept(dataLikeVisitor);

			if (dataLikeVisitor.getDataTerm() == null)
				"".toCharArray();

			dataSection.getDatas().remove(dataTerm);
			dataSection.getDatas().add(dataLikeVisitor.getDataTerm());
		}

	}

	public void linkFormulas() {

		if (!(compilationUnit.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getRoot();

		QDataSection dataSection = callableUnit.getDataSection();
		if (dataSection == null)
			return;

		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(dataSection.getDatas());

		RPJDataFormulasResolver dataFormulasResolver = new RPJDataFormulasResolver(compilationUnit, expressionParser, dataFactory);
		for (QDataTerm<?> dataTerm : dataTerms) {
			dataFormulasResolver.reset();

			dataTerm.accept(dataFormulasResolver);
			if (dataFormulasResolver.getDataTerm() == null)
				"".toCharArray();

			dataSection.getDatas().remove(dataTerm);
			dataSection.getDatas().add(dataFormulasResolver.getDataTerm());
		}

	}

	public void linkOverlayDatas() {

		if (!(compilationUnit.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getRoot();

		QDataSection dataSection = callableUnit.getDataSection();
		if (dataSection == null)
			return;

		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(dataSection.getDatas());

		RPJDataOverlayRefactor dataOverlayVisitor = new RPJDataOverlayRefactor(compilationUnit);
		for (QDataTerm<?> dataTerm : dataTerms) {
			dataOverlayVisitor.reset();

			dataTerm.accept(dataOverlayVisitor);

			if (dataOverlayVisitor.getDataTerm() == null)
				"".toCharArray();

			dataSection.getDatas().remove(dataTerm);
			dataSection.getDatas().add(dataOverlayVisitor.getDataTerm());
		}

	}

	public void linkModules() {

		if (!(compilationUnit.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getRoot();

		QSetupSection setupSection = callableUnit.getSetupSection();
		if (setupSection == null)
			return;

		for (String moduleName : setupSection.getModules()) {

			QModule module = getModule(moduleName);
			if (module == null)
				throw new OperatingSystemRuntimeException("Module not found: " + moduleName);

			Class<?> linkedClass = loadClass(module);
			if (linkedClass == null)
				throw new DevelopmentKitCompilerRuntimeException("Linked class not found: " + module);

			QCompilerLinker compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
			compilerLinker.setLinkedClass(linkedClass);

			org.smeup.sys.il.flow.QModule flowModule = compilationUnit.getModule(moduleName, false);
			if (flowModule != null)
				compilationUnit.getModule(moduleName, false).getFacets().add(compilerLinker);
			else
				throw new OperatingSystemRuntimeException("Module not found: " + moduleName);
		}

	}

	public void linkFiles() {

		if (!(compilationUnit.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getRoot();

		QFileSection fileSection = callableUnit.getFileSection();
		if (fileSection == null)
			return;

		for (QDataSetTerm dataSetTerm : fileSection.getDataSets())
			linkFileTerm(dataSetTerm);

		for (QDisplayTerm displayTerm : fileSection.getDisplays())
			linkFileTerm(displayTerm);

		for (QPrintTerm printerTerm : fileSection.getPrinters())
			linkFileTerm(printerTerm);
	}


	private void linkFileTerm(QFileTerm fileTerm) {

		QFile file = getFile(fileTerm.getFileName());

		// TODO retrieve type (internal=true)
		if (file == null || file instanceof QSourceFile) {

			
			// redefine record
			@SuppressWarnings("unchecked")
			QDataTerm<QCompoundDataDef<?, ?>> dataRecord = (QDataTerm<QCompoundDataDef<?, ?>>) this.compilationUnit.getDataTerm(fileTerm.getFileName(), false);
			if (dataRecord == null)
				return;

			QFileFormat<QCompoundDataDef<?,?>> internalFileFormat = new FileFormatImpl<QCompoundDataDef<?,?>>() {
				private static final long serialVersionUID = 1L;
			};			
			internalFileFormat.setDefinition(dataRecord.getDefinition());			

			// remove redefined record
			this.compilationUnit.getTrashCan().getDataTerms().add(dataRecord);
		} else {
			QExternalFile externalFile = QOperatingSystemFileFactory.eINSTANCE.createExternalFile();
			externalFile.setName(file.getName());
			fileTerm.getFacets().add(externalFile);

			if (file instanceof QDatabaseFile) {

				QDatabaseFile databaseFile = (QDatabaseFile) file;
				externalFile.setFormat(databaseFile.getDatabaseFormat().getName());

				QDataSetTerm dataSet = (QDataSetTerm)fileTerm;
				if (dataSet.getFormatName() == null)
					dataSet.setFormatName(databaseFile.getDatabaseFormat().getName());


				// redefine record
				@SuppressWarnings("unchecked")
				QDataTerm<QCompoundDataDef<?, ?>> dataRecord = (QDataTerm<QCompoundDataDef<?, ?>>) this.compilationUnit.getDataTerm(dataSet.getFormatName(), false);
				if (dataRecord == null)
					return;

				for (QDataTerm<?> element : dataRecord.getDefinition().getElements()) {

					QRemap remap = element.getFacet(QRemap.class);
					if (remap == null)
						continue;

					/*
					for (QDataTerm<?> recordElement : recordDef.getElements())
						if (this.compilationUnit.equalsTermName(recordElement.getName(), element.getName())) {
							recordElement.getFacets().add(remap);
							break;
						}
*/
				}

				// remove redefined record
				this.compilationUnit.getTrashCan().getDataTerms().add(dataRecord);
			} else if (file instanceof QDisplayFile) {

			} else if (file instanceof QPrinterFile) {
				
			}
		}

		QCompilerLinker compilerLinker = buildCompilerLinker(file);
		if(compilerLinker != null)
			fileTerm.getFacets().add(compilerLinker);
	}
	
	public QCompilerLinker linkExternalFile(QDataTerm<QCompoundDataDef<?, QDataTerm<?>>> targetTerm, QExternalFile externalFile) {

		QFile file = getFile(externalFile.getName());
		return linkExternalFile(targetTerm, externalFile, file);
	}
	
	public QCompilerLinker linkExternalFile(QDataTerm<QCompoundDataDef<?, QDataTerm<?>>> targetTerm, QExternalFile externalFile, QFile file) {

		if (externalFile.getName().startsWith("*"))
			return null;

		if (file instanceof QDatabaseFile) {
			QDatabaseFile databaseFile = (QDatabaseFile) file;

			if (externalFile.getFormat() == null)
				externalFile.setFormat(databaseFile.getDatabaseFormat().getName());

			QDatabaseFileFormat databaseFileFormat = databaseFile.getDatabaseFormat();
			if (databaseFile instanceof QLogicalFile && databaseFileFormat.isEmpty()) {
				QLogicalFile logicalFile = (QLogicalFile) databaseFile;

				for (String table : logicalFile.getTables()) {
					QDatabaseFile superTable = (QDatabaseFile) getFile(table);

					if (superTable == null)
						throw new OperatingSystemRuntimeException("File not found: " + table);

					appendElements(targetTerm, superTable.getDatabaseFormat());
				}
			} else
				appendElements(targetTerm, databaseFileFormat);

		} else if (file instanceof QDisplayFile) {
			QDisplayFile displayFile = (QDisplayFile) file;

			for (QFileFormat<?> fileFormat : displayFile.getDisplayFormats()) {
				fileFormat = (QFileFormat<?>) EcoreUtil.copy((EObject) fileFormat);

				QDerived derived = QIntegratedLanguageCoreFactory.eINSTANCE.createDerived();
				fileFormat.getFacets().add(derived);

				targetTerm.getDefinition().getElements().add(fileFormat);

			}

		} else if (file instanceof QPrinterFile) {
			QPrinterFile printerFile = (QPrinterFile) file;

			for (QFileFormat<?> fileFormat : printerFile.getPrinterFormats()) {
				fileFormat = (QFileFormat<?>) EcoreUtil.copy((EObject) fileFormat);

				QDerived derived = QIntegratedLanguageCoreFactory.eINSTANCE.createDerived();
				fileFormat.getFacets().add(derived);

				targetTerm.getDefinition().getElements().add(fileFormat);
			}

		} else
			throw new OperatingSystemRuntimeException("Unknown file type: " + externalFile.getName());

		
		return buildCompilerLinker(file);
	}

	private QCompilerLinker buildCompilerLinker(QFile file) {

		Class<?> linkedClass = loadClass(file);
		if (linkedClass == null)
			return null;

		QCompilerLinker compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
		compilerLinker.setLinkedClass(linkedClass);

		return compilerLinker;
	}
	
	private void appendElements(QDataTerm<QCompoundDataDef<?, QDataTerm<?>>> targetTerm, QFileFormat<?> fileFormat) {

		for (QDataTerm<?> element : fileFormat.getDefinition().getElements()) {

			element = (QDataTerm<?>) EcoreUtil.copy((EObject) element);

			QDerived derived = QIntegratedLanguageCoreFactory.eINSTANCE.createDerived();
			element.getFacets().add(derived);

			targetTerm.getDefinition().getElements().add(element);
		}
	}


	private QFile getFile(String name) {

		QFile file = fileManager.getFileOverride(job, name);
		if (file == null)
			file = fileReader.lookup(name);

		return file;
	}

	private Class<?> loadClass(QFile file) {

		// TODO
		QLibrary library = libraryReader.lookup(file.getLibrary());

		String attribute = file.getAttribute();
		if (attribute != null && (attribute.equals("PF") || attribute.equals("LF")))
			attribute = "dbf";

		String pathURI = library.getPackageURI().toString().replaceAll("/", ".") + "file." + attribute.toLowerCase() + "/";
		URI packageURI = library.getPackageURI().resolve(file.getPackageInfoURI());

		String address = "asup:/omac/" + pathURI + packageURI.toString().replaceAll("/", ".") + "." + file.getName();
		Class<?> linkedClass = compilationUnit.getContext().loadClass(address);

		if (linkedClass == null) {
			address = "asup:/omac/" + file.getLibrary() + "/" + file.getApplication() + ".file." + file.getName();
			linkedClass = compilationUnit.getContext().loadClass(address);
		}

		// search on parent library
		if (linkedClass == null)
			if (library.getParentLibrary() != null) {

				QLibrary masterLibrary = libraryReader.lookup(library.getParentLibrary());
				if (masterLibrary == null)
					throw new OperatingSystemRuntimeException("Master library not found: " + library);

				address = "asup:/omac/" + masterLibrary.getName() + "/" + file.getApplication() + ".file." + file.getName();
				linkedClass = compilationUnit.getContext().loadClass(address);
			}

		return linkedClass;
	}

	private QModule getModule(String name) {

		QModule module = moduleReader.lookup(name);

		return module;
	}

	private Class<?> loadClass(QModule module) {

		// TODO
		QLibrary library = libraryReader.lookup(module.getLibrary());

		String pathURI = library.getPackageURI().toString().replaceAll("/", ".") + "module/";
		URI packageURI = library.getPackageURI().resolve(module.getPackageInfoURI());

		String address = "asup:/omac/" + pathURI + packageURI.toString().replaceAll("/", ".") + "." + module.getName();
		Class<?> linkedClass = compilationUnit.getContext().loadClass(address);

		if (linkedClass == null) {
			address = "asup:/omac/" + module.getLibrary() + "/" + module.getApplication() + ".module." + module.getName();
			linkedClass = compilationUnit.getContext().loadClass(address);
		}

		// search on parent library
		if (linkedClass == null)
			if (library.getParentLibrary() != null) {

				QLibrary masterLibrary = libraryReader.lookup(library.getParentLibrary());
				if (masterLibrary == null)
					throw new OperatingSystemRuntimeException("Master library not found: " + library);

				address = "asup:/omac/" + masterLibrary.getName() + "/" + module.getApplication() + ".module." + module.getName();
				linkedClass = compilationUnit.getContext().loadClass(address);
			}

		return linkedClass;
	}
}
