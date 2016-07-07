/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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
import org.smeup.sys.dk.compiler.QDerived;
import org.smeup.sys.dk.compiler.QDevelopmentKitCompilerFactory;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QStruct;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.impl.CompoundDataDefImpl;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QRemap;
import org.smeup.sys.il.data.term.impl.DataTermImpl;
import org.smeup.sys.il.esam.QDataSetTerm;
import org.smeup.sys.il.esam.QDisplayTerm;
import org.smeup.sys.il.esam.QFileTerm;
import org.smeup.sys.il.esam.QPrintTerm;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.flow.QCallableUnit;
import org.smeup.sys.il.flow.QDataSection;
import org.smeup.sys.il.flow.QEntry;
import org.smeup.sys.il.flow.QEntryParameter;
import org.smeup.sys.il.flow.QFileSection;
import org.smeup.sys.il.flow.QFlowSection;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.il.flow.QSetupSection;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QDatabaseFile;
import org.smeup.sys.os.file.QDatabaseFileFormat;
import org.smeup.sys.os.file.QDisplayFile;
import org.smeup.sys.os.file.QExternalFile;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileFormat;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QFileOverride;
import org.smeup.sys.os.file.QLogicalFile;
import org.smeup.sys.os.file.QOperatingSystemFileFactory;
import org.smeup.sys.os.file.QPrinterFile;
import org.smeup.sys.os.file.QSourceFile;
import org.smeup.sys.os.file.impl.FileFormatImpl;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.module.QModule;
import org.smeup.sys.rt.core.QLogger;

public class RPJCallableUnitLinker {

	@Inject
	private QJob job;
	@Inject
	private QFileManager fileManager;
	@Inject
	private QExpressionParser expressionParser;
	@Inject
	private QDataContext dataContext;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QExceptionManager excpetionManager;
	@Inject
	private QLogger logger;

	private QResourceReader<QFile> fileReader;
	private QResourceReader<QModule> moduleReader;
	private QResourceReader<QLibrary> libraryReader;

	@PostConstruct
	public void init() {
		this.fileReader = resourceManager.getResourceReader(job, QFile.class, Scope.LIBRARY_LIST);
		this.moduleReader = resourceManager.getResourceReader(job, QModule.class, Scope.LIBRARY_LIST);
		this.libraryReader = resourceManager.getResourceReader(job, QLibrary.class, Scope.LIBRARY_LIST);
	}

	public void linkExternalDatas(QCompilationUnit compilationUnit) {

		if (!(compilationUnit.getNode() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getNode();

		QDataSection dataSection = callableUnit.getDataSection();
		if (dataSection == null)
			return;

		RPJDataTermLinker externalNameLinker = compilationUnit.getContext().make(RPJDataTermLinker.class);
		for (QDataTerm<?> dataTerm : new ArrayList<QDataTerm<?>>(dataSection.getDatas())) {
			if (dataTerm.getDataTermType() == null) {
				compilationUnit.getTrashCan().getDataTerms().add(dataTerm);
				continue;
			}
			dataTerm.accept(externalNameLinker);
		}

	}

	public void linkLikeDatas(QCompilationUnit compilationUnit) {

		if (!(compilationUnit.getNode() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getNode();

		QDataSection dataSection = callableUnit.getDataSection();
		if (dataSection != null) {
			List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(dataSection.getDatas());

			RPJDataLikeRefactor dataLikeVisitor = new RPJDataLikeRefactor(compilationUnit);
			
			// compound before
			for (QDataTerm<?> dataTerm : dataTerms) {
				if(dataTerm.getDataTermType().isCompound())
					dataTerm.accept(dataLikeVisitor);
			}
			
			// atomic after
			for (QDataTerm<?> dataTerm : dataTerms) {
				if(dataTerm.getDataTermType().isCompound())
					continue;
				
				dataTerm.accept(dataLikeVisitor);
			}
		}

		QFlowSection flowSection = callableUnit.getFlowSection();
		if (flowSection != null) {
			
			// prototypes
			RPJDataLikeRefactor dataLikeVisitor = new RPJDataLikeRefactor(compilationUnit);
			for (QPrototype prototype : flowSection.getPrototypes()) {
				
				if(prototype.getDefinition() != null)
					prototype.accept(dataLikeVisitor);
								
				QEntry entry = prototype.getEntry();
				if(entry != null) {
					for(QEntryParameter<?> entryParameter: entry.getParameters()) {
						if(entryParameter.getDelegate() instanceof QDataTerm) 
							((QDataTerm<?>)entryParameter.getDelegate()).accept(dataLikeVisitor);
					}
				}
			}
			
			// procedures
			for (QProcedure procedure : flowSection.getProcedures()) {
												
				QEntry entry = procedure.getEntry();
				if(entry != null) {
					for(QEntryParameter<?> entryParameter: entry.getParameters()) {
						if(entryParameter.getDelegate() instanceof QDataTerm) 
							((QDataTerm<?>)entryParameter.getDelegate()).accept(dataLikeVisitor);
					}
				}
			}

		}
	}

	public void linkFormulas(QCompilationUnit compilationUnit) {

		if (!(compilationUnit.getNode() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getNode();

		QDataSection dataSection = callableUnit.getDataSection();
		if (dataSection == null)
			return;

		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(dataSection.getDatas());

		RPJDataFormulasResolver dataFormulasResolver = new RPJDataFormulasResolver(compilationUnit, expressionParser, dataContext);
		compilationUnit.getContext().inject(dataFormulasResolver);
		for (QDataTerm<?> dataTerm : dataTerms)
			dataTerm.accept(dataFormulasResolver);
	}

	public void linkOverlayDatas(QCompilationUnit compilationUnit) {

		if (!(compilationUnit.getNode() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getNode();

		QDataSection dataSection = callableUnit.getDataSection();
		if (dataSection == null)
			return;

		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(dataSection.getDatas());

		RPJDataOverlayRefactor dataOverlayVisitor = new RPJDataOverlayRefactor(compilationUnit);
		for (QDataTerm<?> dataTerm : dataTerms)
			dataTerm.accept(dataOverlayVisitor);
		
	}

	public void completeDataStructures(QCompilationUnit compilationUnit) {

		if (!(compilationUnit.getNode() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getNode();

		QDataSection dataSection = callableUnit.getDataSection();
		if (dataSection == null)
			return;

		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(dataSection.getDatas());

		RPJDataLengthCompleter dataLengthCompleter = new RPJDataLengthCompleter(compilationUnit, expressionParser, dataContext);
		compilationUnit.getContext().inject(dataLengthCompleter);
		for (QDataTerm<?> dataTerm : dataTerms) 
			dataTerm.accept(dataLengthCompleter);

	}

	public void linkModules(QCompilationUnit compilationUnit) {

		if (!(compilationUnit.getNode() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getNode();

		QSetupSection setupSection = callableUnit.getSetupSection();
		if (setupSection == null)
			return;

		for (String moduleName : setupSection.getModules()) {

			org.smeup.sys.il.flow.QModule flowModule = compilationUnit.getModule(moduleName, false);
			if (flowModule == null)
				throw new OperatingSystemRuntimeException("Module not found: " + moduleName);

			// already linked
			if (flowModule.getFacet(QCompilerLinker.class) != null)
				continue;

			QModule module = getModule(moduleName);
			if (module == null)
				throw new OperatingSystemRuntimeException("Module not found: " + moduleName);

			Class<?> linkedClass = loadClass(module, compilationUnit.getContext());
			if (linkedClass == null)
				throw new DevelopmentKitCompilerRuntimeException("Linked class not found: " + module);

			QCompilerLinker compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
			compilerLinker.setLinkedClass(linkedClass);

			flowModule.getFacets().add(compilerLinker);
		}

	}

	public void linkFiles(QCompilationUnit compilationUnit) {

		if (!(compilationUnit.getNode() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getNode();

		QFileSection fileSection = callableUnit.getFileSection();
		if (fileSection == null)
			return;

		for (QDataSetTerm dataSetTerm : fileSection.getDataSets())
			linkFileTerm(dataSetTerm, compilationUnit);

		for (QDisplayTerm displayTerm : fileSection.getDisplays())
			linkFileTerm(displayTerm, compilationUnit);

		for (QPrintTerm printerTerm : fileSection.getPrinters())
			linkFileTerm(printerTerm, compilationUnit);

		compilationUnit.refresh();
	}

	@SuppressWarnings({ "unchecked" })
	private <E extends QDataTerm<?>> void linkFileTerm(QFileTerm fileTerm, QCompilationUnit compilationUnit) {

		QFile file = getFile(fileTerm.getName());

		// TODO retrieve type (internal=true)
		if (file == null || file instanceof QSourceFile) {

			// redefine record
			QDataTerm<QCompoundDataDef<?, QDataTerm<?>>> dataRecord = (QDataTerm<QCompoundDataDef<?, QDataTerm<?>>>) compilationUnit.getDataTerm(fileTerm.getName(), false);
			if (dataRecord == null)
				return;

			QFileFormat<QCompoundDataDef<?, QDataTerm<?>>> internalFileFormat = new FileFormatImpl<QCompoundDataDef<?, QDataTerm<?>>>() {
				private static final long serialVersionUID = 1L;
			};
			internalFileFormat.setDefinition(dataRecord.getDefinition());

			if (fileTerm.getFormat() == null)
				fileTerm.setFormat(internalFileFormat);
			else
				logger.info(excpetionManager.prepareException(job, RPJCompilerMessage.AS00100, fileTerm.getFormat()));

			// remove redefined record
			compilationUnit.getTrashCan().getDataTerms().add(dataRecord);

			return;
		} else {
			QExternalFile externalFile = QOperatingSystemFileFactory.eINSTANCE.createExternalFile();
			externalFile.setName(file.getName());
			fileTerm.getFacets().add(externalFile);

			if (file instanceof QDatabaseFile) {

				QDatabaseFile databaseFile = (QDatabaseFile) file;
				externalFile.setFormat(databaseFile.getDatabaseFormat().getName());

				QDataSetTerm dataSet = (QDataSetTerm) fileTerm;
				if (dataSet.getFormatName() == null)
					dataSet.setFormatName(databaseFile.getDatabaseFormat().getName());

				QDataTerm<QCompoundDataDef<?, QDataTerm<?>>> format = dataSet.getFormat();
				if (format == null) {
					QDatabaseFileFormat databaseFileFormat = databaseFile.getDatabaseFormat();
					dataSet.setFormat((QDataTerm<QCompoundDataDef<?, QDataTerm<?>>>) EcoreUtil.copy((EObject) databaseFileFormat));
				}
				if (dataSet.getPrefix() != null && !dataSet.getPrefix().isEmpty())
					dataSet.getFormat().getDefinition().setPrefix(dataSet.getPrefix());

				QCompilerLinker compilerLinker = linkExternalFile(compilationUnit.getContext(), dataSet.getFormat(), externalFile);
				if (compilerLinker != null)
					dataSet.getFacets().add(compilerLinker);

				// redefine record
				QDataTerm<QCompoundDataDef<?, ?>> dataRecord = (QDataTerm<QCompoundDataDef<?, ?>>) compilationUnit.getDataTerm(dataSet.getFormatName(), false);
				if (dataRecord == null)
					return;

				for (QDataTerm<?> element : dataRecord.getDefinition().getElements()) {

					QRemap remap = element.getFacet(QRemap.class);
					if (remap == null)
						continue;

					for (QDataTerm<?> recordElement : dataSet.getFormat().getDefinition().getElements())
						if (compilationUnit.equalsTermName(recordElement.getName(), element.getName())) {
							recordElement.getFacets().add(remap);
							break;
						}
				}

				// remove redefined record
				if (!(dataRecord.getParent() instanceof QDataSetTerm))
					compilationUnit.getTrashCan().getDataTerms().add(dataRecord);

			} else if (file instanceof QDisplayFile) {

				QDisplayTerm displayTerm = (QDisplayTerm) fileTerm;
				if (displayTerm.getFormat() == null) {
					InternalFileTermImpl internalFormat = new InternalFileTermImpl();
					internalFormat.setDefinition(new InternalFileDefinitionImpl());
					displayTerm.setFormat(internalFormat);
				}

				QCompilerLinker compilerLinker = linkExternalFile(compilationUnit.getContext(), displayTerm.getFormat(), externalFile);
				if (compilerLinker != null)
					displayTerm.getFacets().add(compilerLinker);

				List<QDataTerm<?>> childDataElements = new ArrayList<QDataTerm<?>>(displayTerm.getFormat().getDefinition().getElements());
				for (QDataTerm<?> childDataTerm : childDataElements) {
					if (!(childDataTerm instanceof QFileFormat))
						continue;

					QFileFormat<?> fileFormat = (QFileFormat<?>) childDataTerm;
					// redefine record
					QDataTerm<QCompoundDataDef<?, ?>> dataRecord = (QDataTerm<QCompoundDataDef<?, ?>>) compilationUnit.getDataTerm(fileFormat.getName(), false);
					if (dataRecord == null)
						continue;

					// remove redefined record
					if (!(dataRecord.getParent() instanceof InternalFileTermImpl))
						compilationUnit.getTrashCan().getDataTerms().add(dataRecord);
				}

			} else if (file instanceof QPrinterFile) {
				QPrintTerm printTerm = (QPrintTerm) fileTerm;
				if (printTerm.getFormat() == null) {
					InternalFileTermImpl internalFormat = new InternalFileTermImpl();
					internalFormat.setDefinition(new InternalFileDefinitionImpl());
					printTerm.setFormat(internalFormat);
				}

				QCompilerLinker compilerLinker = linkExternalFile(compilationUnit.getContext(), printTerm.getFormat(), externalFile);
				if (compilerLinker != null)
					printTerm.getFacets().add(compilerLinker);
			}
		}

		QCompilerLinker compilerLinker = buildCompilerLinker(file, compilationUnit.getContext());
		if (compilerLinker != null)
			fileTerm.getFacets().add(compilerLinker);
	}

	public QCompilerLinker linkExternalFile(QContext context, QDataTerm<QCompoundDataDef<?, QDataTerm<?>>> qDataTerm, QExternalFile externalFile) {

		QFile file = getFile(externalFile.getName());
		if (file == null)
			return null;

		if (externalFile.getName().startsWith("*")) {
			logger.info(excpetionManager.prepareException(job, RPJCompilerMessage.AS00101, externalFile.getName()));
			return null;
		}

		if (file instanceof QDatabaseFile) {
			QDatabaseFile databaseFile = (QDatabaseFile) file;

			if (externalFile.getFormat() == null)
				externalFile.setFormat(databaseFile.getDatabaseFormat().getName());

			if (externalFile.getRule() != null) {
				if (!externalFile.getRule().equalsIgnoreCase("*ALL"))
					throw new OperatingSystemRuntimeException("Invalid format rule: " + externalFile.getRule());
			}

			QDatabaseFileFormat databaseFileFormat = databaseFile.getDatabaseFormat();
			if (databaseFile instanceof QLogicalFile && databaseFileFormat.isEmpty()) {
				QLogicalFile logicalFile = (QLogicalFile) databaseFile;

				for (String table : logicalFile.getTables()) {
					QDatabaseFile superTable = (QDatabaseFile) getFile(table);

					if (superTable == null)
						throw new OperatingSystemRuntimeException("File not found: " + table);

					appendElements(qDataTerm, superTable.getDatabaseFormat(), true);
				}
			} else
				appendElements(qDataTerm, databaseFileFormat, true);

			return buildCompilerLinker(file, context);

		} else if (file instanceof QDisplayFile) {
			QDisplayFile displayFile = (QDisplayFile) file;

			if (externalFile.getFormat() != null) {
				if (externalFile.getRule() != null) {
					if (!externalFile.getRule().equalsIgnoreCase("*ALL"))
						throw new OperatingSystemRuntimeException("Invalid format rule: " + externalFile.getRule());
				}

				for (QFileFormat<?> fileFormat : displayFile.getDisplayFormats()) {
					if (!externalFile.getFormat().equals(fileFormat.getName()))
						continue;

					appendElements(qDataTerm, fileFormat, false);

					break;
				}

				return null;
			} else {

				for (QFileFormat<?> fileFormat : displayFile.getDisplayFormats()) {
					fileFormat = (QFileFormat<?>) EcoreUtil.copy((EObject) fileFormat);

					appendElements(qDataTerm, fileFormat, true);

					QDerived derived = QDevelopmentKitCompilerFactory.eINSTANCE.createDerived();
					fileFormat.getFacets().add(derived);

					qDataTerm.getDefinition().getElements().add(fileFormat);
				}

				return buildCompilerLinker(file, context);
			}

		} else if (file instanceof QPrinterFile) {
			QPrinterFile printerFile = (QPrinterFile) file;

			if (externalFile.getFormat() != null)
				System.err.println("Unexpected condition g57tqw76erqweqw");

			for (QFileFormat<?> fileFormat : printerFile.getPrinterFormats()) {
				fileFormat = (QFileFormat<?>) EcoreUtil.copy((EObject) fileFormat);

				appendElements(qDataTerm, fileFormat, true);

				QDerived derived = QDevelopmentKitCompilerFactory.eINSTANCE.createDerived();
				fileFormat.getFacets().add(derived);

				qDataTerm.getDefinition().getElements().add(fileFormat);
			}

			return buildCompilerLinker(file, context);
		} else
			throw new OperatingSystemRuntimeException("Unknown file type: " + externalFile.getName());

	}

	private QCompilerLinker buildCompilerLinker(QFile file, QContext context) {

		Class<?> linkedClass = loadClass(file, context);
		if (linkedClass == null)
			return null;

		QCompilerLinker compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
		compilerLinker.setLinkedClass(linkedClass);

		return compilerLinker;
	}

	private void appendElements(QDataTerm<QCompoundDataDef<?, QDataTerm<?>>> qDataTerm, QFileFormat<?> fileFormat, boolean setDerived) {

		int pos = 0;
		for (QDataTerm<?> element : fileFormat.getDefinition().getElements()) {

			element = (QDataTerm<?>) EcoreUtil.copy((EObject) element);

			if (setDerived) {
				QDerived derived = QDevelopmentKitCompilerFactory.eINSTANCE.createDerived();
				element.getFacets().add(derived);
			}

			qDataTerm.getDefinition().getElements().add(pos, element);
			pos++;
		}
	}

	private QFile getFile(String name) {

		QFile file = null;
		QFileOverride fileOverride = fileManager.getFileOverride(job.getContext(), name);
		if (fileOverride == null)
			file = fileReader.lookup(name);
		else
			file = fileOverride.getFileTo();

		return file;
	}

	private Class<?> loadClass(QFile file, QContext context) {

		// TODO
		QLibrary library = libraryReader.lookup(file.getLibrary());

		String attribute = file.getAttribute();
		if (attribute != null && (attribute.equals("PF") || attribute.equals("LF")))
			// attribute = "dbf";
			attribute = "dbf";

		String pathURI = library.getPackageURI().toString().replaceAll("/", ".") + "file." + attribute.toLowerCase() + ".gen/";
		URI packageURI = library.getPackageURI().resolve(file.getPackageInfoURI());

		String address = "asup:/omac/" + pathURI + packageURI.toString().replaceAll("/", ".") + "." + file.getName();
		Class<?> linkedClass = context.loadClass(address);

		if (linkedClass == null) {
			address = "asup:/omac/" + file.getLibrary() + "/" + file.getApplication() + ".file." + file.getName();
			linkedClass = context.loadClass(address);
		}

		// search on parent library
		if (linkedClass == null)
			if (library.getParentLibrary() != null) {

				QLibrary masterLibrary = libraryReader.lookup(library.getParentLibrary());
				if (masterLibrary == null)
					throw new OperatingSystemRuntimeException("Master library not found: " + library);

				address = "asup:/omac/" + masterLibrary.getName() + "/" + file.getApplication() + ".file." + file.getName();
				linkedClass = context.loadClass(address);
			}

		return linkedClass;
	}

	private QModule getModule(String name) {

		QModule module = moduleReader.lookup(name);

		return module;
	}

	private Class<?> loadClass(QModule module, QContext context) {

		// TODO
		QLibrary library = libraryReader.lookup(module.getLibrary());

		// String pathURI = library.getPackageURI().toString().replaceAll("/",
		// ".") + "module/";
		String pathURI = library.getPackageURI().toString().replaceAll("/", ".") + "module.gen/";

		URI packageURI = library.getPackageURI().resolve(module.getPackageInfoURI());

		String address = "asup:/omac/" + pathURI + packageURI.toString().replaceAll("/", ".") + "." + module.getName();
		Class<?> linkedClass = context.loadClass(address);

		if (linkedClass == null) {
			address = "asup:/omac/" + module.getLibrary() + "/" + module.getApplication() + ".module." + module.getName();
			linkedClass = context.loadClass(address);
		}

		// search on parent library
		if (linkedClass == null)
			if (library.getParentLibrary() != null) {

				QLibrary masterLibrary = libraryReader.lookup(library.getParentLibrary());
				if (masterLibrary == null)
					throw new OperatingSystemRuntimeException("Master library not found: " + library);

				address = "asup:/omac/" + masterLibrary.getName() + "/" + module.getApplication() + ".module." + module.getName();
				linkedClass = context.loadClass(address);
			}

		return linkedClass;
	}

	private class InternalFileTermImpl extends DataTermImpl<QCompoundDataDef<?, QDataTerm<?>>> {
		private static final long serialVersionUID = 1L;

	}

	private class InternalFileDefinitionImpl extends CompoundDataDefImpl<QStruct<?>, QDataTerm<?>> {

		private static final long serialVersionUID = 1L;

		@Override
		public Class<QStruct<?>> getDataClass() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Class<?> getJavaClass() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public DataDefType getDataDefType() {
			return DataDefType.STRUCT;
		}

	}
}
