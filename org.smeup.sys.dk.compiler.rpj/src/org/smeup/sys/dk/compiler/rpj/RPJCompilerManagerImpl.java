/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi				- Initial API and implementation
 */
package org.smeup.sys.dk.compiler.rpj;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.smeup.sys.db.core.QViewDef;
import org.smeup.sys.dk.compiler.CaseSensitiveType;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerManager;
import org.smeup.sys.dk.compiler.rpj.writer.JDTDatabaseFileWriter;
import org.smeup.sys.dk.compiler.rpj.writer.JDTDisplayFileWriter;
import org.smeup.sys.dk.compiler.rpj.writer.JDTModuleWriter;
import org.smeup.sys.dk.compiler.rpj.writer.JDTPrinterFileWriter;
import org.smeup.sys.dk.compiler.rpj.writer.JDTProgramWriter;
import org.smeup.sys.dk.compiler.rpj.writer.JDTStubWriter;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QDisplayWrapper;
import org.smeup.sys.il.data.QPrinterWrapper;
import org.smeup.sys.il.data.QRecordWrapper;
import org.smeup.sys.il.esam.annotation.Format;
import org.smeup.sys.il.esam.annotation.Query;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionParserRegistry;
import org.smeup.sys.il.expr.QExpressionWriter;
import org.smeup.sys.il.expr.QExpressionWriterRegistry;
import org.smeup.sys.il.flow.QCallableUnit;
import org.smeup.sys.il.flow.QModule;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QProgram;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QDatabaseFile;
import org.smeup.sys.os.file.QDisplayFile;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QLogicalFile;
import org.smeup.sys.os.file.QPrinterFile;
import org.smeup.sys.rt.core.QLogger;

public class RPJCompilerManagerImpl implements QCompilerManager {

	@Inject
	private QExpressionParserRegistry expressionParserRegistry;
	@Inject
	private QExpressionWriterRegistry expressionWriterRegistry;
	@Inject
	private QSourceManager sourceManager;
	@Inject
	private QDataManager dataManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QLogger logger;

	private ResourceSet resourceSet = new ResourceSetImpl();

	@SuppressWarnings("resource")
	@Override
	public QCompilationUnit createChildCompilationUnit(QCompilationUnit master, QProcedure procedure) {

		QJob job = master.getContext().get(QJob.class);
		QContext childContext = master.getContext().createChildContext(procedure.getName());
		
		List<QCompilationUnit> moduleContexts = new ArrayList<QCompilationUnit>();
		RPJCompilationUnitImpl compilationUnit = new RPJCompilationUnitImpl(childContext, procedure, master, moduleContexts, master.getCaseSensitive());

		prepareContexts(job, compilationUnit, procedure, moduleContexts);

		compilationUnit.getContext().set(QCompilationUnit.class, compilationUnit);

		RPJCallableUnitLinker callableUnitLinker = compilationUnit.getContext().make(RPJCallableUnitLinker.class);
		compilationUnit.getContext().set(RPJCallableUnitLinker.class, callableUnitLinker);

		return compilationUnit;
	}

	@Override
	public QCompilationUnit createCompilationUnit(QJob job, QFile file, CaseSensitiveType caseSensitive) {

		List<QCompilationUnit> compilationUnits = new ArrayList<QCompilationUnit>();

		RPJCompilationUnitImpl compilationUnit = new RPJCompilationUnitImpl(job.getContext().createChildContext(file.getName()), file, null, compilationUnits, caseSensitive);
		compilationUnit.getContext().set(QCompilationUnit.class, compilationUnit);

		// dataContext
		QDataContext dataContext = dataManager.createDataContext(compilationUnit.getContext(), null);
		compilationUnit.getContext().set(QDataContext.class, dataContext);

		RPJCallableUnitLinker callableUnitLinker = compilationUnit.getContext().make(RPJCallableUnitLinker.class);
		compilationUnit.getContext().set(RPJCallableUnitLinker.class, callableUnitLinker);

		return compilationUnit;
	}

	@Override
	public QCompilationUnit createCompilationUnit(QJob job, QModule module, CaseSensitiveType caseSensitive) {

		List<QCompilationUnit> moduleContexts = new ArrayList<QCompilationUnit>();
		RPJCompilationUnitImpl compilationUnit = new RPJCompilationUnitImpl(job.getContext().createChildContext(module.getName()), module, null, moduleContexts, caseSensitive);

		if (!module.getName().startsWith("*"))
			prepareContexts(job, compilationUnit, module, moduleContexts);

		compilationUnit.getContext().set(QCompilationUnit.class, compilationUnit);

		// dataContext
		QDataContext dataContext = dataManager.createDataContext(compilationUnit.getContext(), null);
		compilationUnit.getContext().set(QDataContext.class, dataContext);

		// module
		compilationUnit.getContext().set(QModule.class, module);

		RPJCallableUnitLinker callableUnitLinker = compilationUnit.getContext().make(RPJCallableUnitLinker.class);
		compilationUnit.getContext().set(RPJCallableUnitLinker.class, callableUnitLinker);

		// expression parser and expression writer
		if (module.getSetupSection() != null) {
			String expressionType = module.getSetupSection().getExpressionType();
			if (expressionType != null) {
				QExpressionParser expressionParser = expressionParserRegistry.lookup(expressionType);
				compilationUnit.getContext().set(QExpressionParser.class, expressionParser);

				QExpressionWriter expressionWriter = expressionWriterRegistry.lookup(QExpressionWriterRegistry.DEFAULT_WRITER);
				compilationUnit.getContext().set(QExpressionWriter.class, expressionWriter);
			}
		}

		return compilationUnit;
	}

	@Override
	public QCompilationUnit createCompilationUnit(QJob job, QProgram program, CaseSensitiveType caseSensitive) {

		List<QCompilationUnit> moduleContexts = new ArrayList<QCompilationUnit>();
		RPJCompilationUnitImpl compilationUnit = new RPJCompilationUnitImpl(job.getContext().createChildContext(program.getName()), program, null, moduleContexts, caseSensitive);
		prepareContexts(job, compilationUnit, program, moduleContexts);

		compilationUnit.getContext().set(QCompilationUnit.class, compilationUnit);

		// dataContext
		QDataContext dataContext = dataManager.createDataContext(compilationUnit.getContext(), null);
		compilationUnit.getContext().set(QDataContext.class, dataContext);

		compilationUnit.getContext().set(QProgram.class, program);

		RPJCallableUnitLinker callableUnitLinker = compilationUnit.getContext().make(RPJCallableUnitLinker.class);
		compilationUnit.getContext().set(RPJCallableUnitLinker.class, callableUnitLinker);

		// expression parser and expression writer
		if (program.getSetupSection() != null) {
			String expressionType = program.getSetupSection().getExpressionType();
			if (expressionType != null) {

				QExpressionParser expressionParser = expressionParserRegistry.lookup(expressionType);
				compilationUnit.getContext().set(QExpressionParser.class, expressionParser);

				QExpressionWriter expressionWriter = expressionWriterRegistry.lookup(QExpressionWriterRegistry.DEFAULT_WRITER);
				compilationUnit.getContext().set(QExpressionWriter.class, expressionWriter);
			}
		}

		return compilationUnit;
	}

	@Override
	public void linkCompilationUnit(QCompilationUnit compilationUnit) {

		// load children
		List<String> compilationUnits = new ArrayList<String>();
		linkCompilationUnit(compilationUnits, compilationUnit);
	}

	private void linkCompilationUnit(List<String> compilationUnits, QCompilationUnit compilationUnit) {
		
		if (compilationUnits.contains(compilationUnit.getNode().getName()))
			return;

		compilationUnits.add(compilationUnit.getNode().getName());

		// link children
		for (QCompilationUnit childCompilationUnit : compilationUnit.getChildCompilationUnits())
			linkCompilationUnit(compilationUnits, childCompilationUnit);

		RPJCallableUnitLinker callableUnitLinker = compilationUnit.getContext().get(RPJCallableUnitLinker.class);

		callableUnitLinker.linkModules(compilationUnit);
		callableUnitLinker.linkFiles(compilationUnit);
		callableUnitLinker.linkExternalDatas(compilationUnit);
		callableUnitLinker.linkLikeDatas(compilationUnit);		
		callableUnitLinker.linkOverlayDatas(compilationUnit);
		callableUnitLinker.linkFormulas(compilationUnit);
		callableUnitLinker.completeDataStructures(compilationUnit);

		if (!(compilationUnit.getNode() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getNode();

		if (callableUnit.getFlowSection() != null) {
			for (QProcedure procedure : callableUnit.getFlowSection().getProcedures()) {

				QCompilationUnit childCompilationUnit = createChildCompilationUnit(compilationUnit, procedure);

				callableUnitLinker.linkModules(childCompilationUnit);
				callableUnitLinker.linkFiles(childCompilationUnit);
				callableUnitLinker.linkExternalDatas(childCompilationUnit);
				callableUnitLinker.linkLikeDatas(childCompilationUnit);
				callableUnitLinker.linkOverlayDatas(childCompilationUnit);
				callableUnitLinker.linkFormulas(childCompilationUnit);

				childCompilationUnit.close();
			}
		}
	}

	private void prepareContexts(QJob job, QCompilationUnit compilationUnit, QCallableUnit callableUnit, List<QCompilationUnit> moduleContexts) {

		CaseSensitiveType caseSensitive = compilationUnit.getCaseSensitive();
		if (callableUnit instanceof QProcedure)
			moduleContexts.add(loadInternalModule(job, caseSensitive, "*PRO"));
		else
			moduleContexts.add(loadInternalModule(job, caseSensitive, "*RPJ"));

		RPJCallableUnitInfo callableUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(compilationUnit, callableUnit);

		if (callableUnitInfo.containsSQLStatement()) 
			moduleContexts.add(loadInternalModule(job, caseSensitive, "*SQL"));

		if (callableUnitInfo.containsCMDStatement())
			moduleContexts.add(loadInternalModule(job, caseSensitive, "*CMD"));

		// TODO (*INKx ??)
//		if (callableUnitInfo.containsDSPStatement())
			moduleContexts.add(loadInternalModule(job, caseSensitive, "*DSP"));
		
		if (callableUnitInfo.containsPRTStatement())
			moduleContexts.add(loadInternalModule(job, caseSensitive, "*PRT"));

		if (callableUnit.getSetupSection() != null) {
			for (String moduleName : new ArrayList<String>(callableUnit.getSetupSection().getModules())) {
				
				if(moduleName.startsWith("*"))
					moduleContexts.add(loadInternalModule(job, caseSensitive, moduleName));
				else
					moduleContexts.add(loadModule(job, caseSensitive, moduleName));			
			}
		}
	}

	private QCompilationUnit loadModule(QJob job, CaseSensitiveType caseSensitive, String moduleName) {

		QCompilationUnit compilationUnit = getModuleCacheMap(job).get(moduleName);
		if (compilationUnit != null)
			return compilationUnit;

		QResourceReader<org.smeup.sys.os.module.QModule> moduleReader = resourceManager.getResourceReader(job, org.smeup.sys.os.module.QModule.class, Scope.LIBRARY_LIST);
		org.smeup.sys.os.module.QModule module = moduleReader.lookup(moduleName);

		if (module == null)
			throw new OperatingSystemRuntimeException("Null module for object " + moduleName, null);

		// lookup module source entry
		QSourceEntry moduleEntry = sourceManager.getObjectEntry(job.getContext(), module.getLibrary(), org.smeup.sys.os.module.QModule.class, module.getName());
		if (moduleEntry == null)
			throw new OperatingSystemRuntimeException("Null module for object " + module.getName(), null);

		// XMI conversion
		QSourceEntry xmiModuleSource = sourceManager.getChildEntry(job.getContext(), moduleEntry, module.getName() + ".xmi");
		if (xmiModuleSource == null)
			throw new OperatingSystemRuntimeException("Null module for object " + module.getName(), null);

		// load flow module
		Resource resourceModule = new XMIResourceImpl();
		try {
			resourceModule.load(xmiModuleSource.getInputStream(), Collections.EMPTY_MAP);
			QModule flowModel = (QModule) resourceModule.getContents().get(0);
			compilationUnit = createCompilationUnit(job, flowModel, caseSensitive);
		} catch (IOException e) {
			throw new OperatingSystemRuntimeException(e);
		}

		getModuleCacheMap(job).put(moduleName, compilationUnit);

		return compilationUnit;
	}

	private QCompilationUnit loadInternalModule(QJob job, CaseSensitiveType caseSensitive, String moduleName) {

		QCompilationUnit moduleCompilationUnit = getModuleCacheMap(job).get(moduleName);
		if (moduleCompilationUnit != null)
			return moduleCompilationUnit;

		try {
			Bundle bundle = FrameworkUtil.getBundle(this.getClass());
			URL entry = bundle.getEntry("/modules/" + moduleName.replaceAll("\\*", "q") + ".xmi");
			Resource resource = resourceSet.createResource(URI.createURI(entry.toString()));
			resource.load(Collections.EMPTY_MAP);

			// type check
			EObject eObject = resource.getContents().get(0);

			if (eObject instanceof QModule) {
				QModule module = (QModule) eObject;
				moduleCompilationUnit = createCompilationUnit(job, module, caseSensitive);
			}

		} catch (Exception e) {
			logger.info(exceptionManager.prepareException(job, RPJCompilerMessage.AS00102, new String[] { moduleName }));
		}

		getModuleCacheMap(job).put(moduleName, moduleCompilationUnit);

		return moduleCompilationUnit;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void writeDatabaseFile(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException {

		QDatabaseFile databaseFile = (QDatabaseFile) compilationUnit.getNode();

		JDTDatabaseFileWriter databaseFileWriter = null;

		if (databaseFile instanceof QLogicalFile) {
			QLogicalFile logicalFile = (QLogicalFile) databaseFile;

			if (databaseFile.getDatabaseFormat().isEmpty()) {
				String table = logicalFile.getTables().get(0);
				databaseFileWriter = new JDTDatabaseFileWriter(null, compilationUnit, setup, compilationUnit.getNode().getName(), table);
			} else
				databaseFileWriter = new JDTDatabaseFileWriter(null, compilationUnit, setup, compilationUnit.getNode().getName(), QRecordWrapper.class);

			QViewDef viewDef = compilationUnit.getContext().getAdapter(logicalFile, QViewDef.class);
			if (viewDef != null) {
				databaseFileWriter.writeImport(Query.class);

				// @Query("SELECT * FROM TABLE")
				NormalAnnotation programAnnotation = databaseFileWriter.getAST().newNormalAnnotation();
				programAnnotation.setTypeName(databaseFileWriter.getAST().newSimpleName(Query.class.getSimpleName()));
				MemberValuePair memberValuePair = databaseFileWriter.getAST().newMemberValuePair();
				memberValuePair.setName(databaseFileWriter.getAST().newSimpleName("value"));
				StringLiteral stringLiteral = databaseFileWriter.getAST().newStringLiteral();
				stringLiteral.setLiteralValue(viewDef.getQuerySelect());
				memberValuePair.setValue(stringLiteral);
				programAnnotation.values().add(memberValuePair);

				databaseFileWriter.getTarget().modifiers().add(0, programAnnotation);

			}
		} else
			databaseFileWriter = new JDTDatabaseFileWriter(null, compilationUnit, setup, compilationUnit.getNode().getName(), QRecordWrapper.class);

		// @Format("BRARTIR")
		databaseFileWriter.writeImport(Format.class);
		NormalAnnotation programAnnotation = databaseFileWriter.getAST().newNormalAnnotation();
		programAnnotation.setTypeName(databaseFileWriter.getAST().newSimpleName(Format.class.getSimpleName()));
		MemberValuePair memberValuePair = databaseFileWriter.getAST().newMemberValuePair();
		memberValuePair.setName(databaseFileWriter.getAST().newSimpleName("value"));
		StringLiteral stringLiteral = databaseFileWriter.getAST().newStringLiteral();
		stringLiteral.setLiteralValue(databaseFile.getDatabaseFormat().getName());
		memberValuePair.setValue(stringLiteral);
		programAnnotation.values().add(memberValuePair);

		databaseFileWriter.getTarget().modifiers().add(0, programAnnotation);

		databaseFileWriter.writeDatabaseFile(databaseFile);

		databaseFileWriter.writeOutputStream(output);
	}

	@Override
	public void writeDisplayFile(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException {

		QDisplayFile displayFile = (QDisplayFile) compilationUnit.getNode();

		JDTDisplayFileWriter displayFileWriter = new JDTDisplayFileWriter(null, compilationUnit, setup, compilationUnit.getNode().getName(), QDisplayWrapper.class);
		displayFileWriter.writeDisplayFile(displayFile);

		displayFileWriter.writeOutputStream(output);
	}

	@Override
	public void writeModule(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException {

		QModule module = (QModule) compilationUnit.getNode();

		JDTModuleWriter moduleWriter = new JDTModuleWriter(null, compilationUnit, setup, compilationUnit.getNode().getName());
		moduleWriter.writeModule(module);

		moduleWriter.writeOutputStream(output);
	}

	@Override
	public void writePrinterFile(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException {

		QPrinterFile printerFile = (QPrinterFile) compilationUnit.getNode();

		JDTPrinterFileWriter printerFileWriter = new JDTPrinterFileWriter(null, compilationUnit, setup, compilationUnit.getNode().getName(), QPrinterWrapper.class);
		printerFileWriter.writePrinterFile(printerFile);

		printerFileWriter.writeOutputStream(output);

	}

	@Override
	public void writeProgram(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException {

		QProgram program = (QProgram) compilationUnit.getNode();

		JDTProgramWriter programWriter = new JDTProgramWriter(null, compilationUnit, setup, compilationUnit.getNode().getName());
		programWriter.writeProgram(program);

		programWriter.writeOutputStream(output);
	}

	@Override
	public void writeProgramTest(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException {
		// TODO Remove me
	}

	@Override
	public void writeStub(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException {

		QProgram program = (QProgram) compilationUnit.getNode();

		JDTStubWriter skeletonWriter = new JDTStubWriter(null, compilationUnit, setup, compilationUnit.getNode().getName());
		skeletonWriter.writeSkeleton(program);

		skeletonWriter.writeOutputStream(output);
	}

	private ModuleCacheMap getModuleCacheMap(QJob job) {

		ModuleCacheMap moduleCacheMap = job.getContext().get(ModuleCacheMap.class);
		if (moduleCacheMap == null) {
			synchronized (job) {
				moduleCacheMap = job.getContext().get(ModuleCacheMap.class);
				if (moduleCacheMap == null) {
					moduleCacheMap = new ModuleCacheMap();
					job.getContext().set(ModuleCacheMap.class, moduleCacheMap);
				}
			}
		}

		return moduleCacheMap;
	}

	private class ModuleCacheMap extends HashMap<String, QCompilationUnit> {

		private static final long serialVersionUID = 1L;

	}
}