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
package org.smeup.sys.dk.compiler.base.api;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;

import javax.inject.Inject;

import org.smeup.sys.dk.compiler.CaseSensitiveType;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerManager;
import org.smeup.sys.dk.compiler.QDevelopmentKitCompilerFactory;
import org.smeup.sys.dk.compiler.base.SourceHelper;
import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.OperatingSystemException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QDisplayFile;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QLibraryManager;

@Program(name = "QASCRTXD")
public class XMIDisplayFileCompiler {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QSourceManager sourceManager;
	@Inject
	private QCompilerManager compilerManager;
	@Inject
	private QJob job;
	@Inject
	private QLibraryManager libraryManager;

	@Main
	public void main(FileRef fileRef, @DataDef(length = 1) QEnum<YesNo, QCharacter> replace, @DataDef(length = 10) QCharacter libraryTo, @DataDef(length = 1) QEnum<YesNo, QCharacter> format) {

		try (QObjectIterator<QFile> files = buildIterator(fileRef);) {

			QResourceReader<QLibrary> libraryReader = libraryManager.getLibraryReader(job);
			QLibrary library = libraryReader.lookup(fileRef.library.trimR());

			while (files.hasNext()) {
				QFile qFile = files.next();
				if (!(qFile instanceof QDisplayFile))
					continue;

				QDisplayFile displayFile = (QDisplayFile) qFile;

				if (!replaceSource(displayFile, libraryTo, replace.asEnum()))
					continue;

				try {
					createJavaFile(displayFile, library, libraryTo.trimR(), format);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private QObjectIterator<QFile> buildIterator(FileRef fileRef) {

		// file
		QResourceReader<QFile> fileReader = null;
		Scope scope = Scope.get(fileRef.library.trimR());
		if (scope != null)
			fileReader = resourceManager.getResourceReader(job, QFile.class, scope);
		else
			fileReader = resourceManager.getResourceReader(job, QFile.class, fileRef.library.trimR());

		QObjectIterator<QFile> fileIterator = null;
		if (fileRef.name.trimR().equals("*ALL"))
			fileIterator = fileReader.find(null);
		else
			fileIterator = fileReader.find(fileRef.name.trimR());

		return fileIterator;
	}

	private void createJavaFile(QDisplayFile file, QLibrary library, String libraryTo, QEnum<YesNo, QCharacter> format) throws IOException, OperatingSystemException {

		if (file.getApplication() == null)
			throw new OperatingSystemException("Invalid file application: " + file);

		if (libraryTo == null || libraryTo.isEmpty())
			libraryTo = file.getLibrary();

		// create java source
		QProject project = sourceManager.getProject(job.getContext(), libraryTo);

		ByteArrayOutputStream output = new ByteArrayOutputStream();

		// compilation unit
		QCompilationUnit compilationUnit = compilerManager.createCompilationUnit(job, file, CaseSensitiveType.LOWER);

		// compilation setup
		QCompilationSetup setup = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilationSetup();
		URI packageURI = library.getPackageURI().resolve(file.getPackageInfoURI());
		setup.setBasePackage(packageURI.toString().replaceAll("/", "."));

		compilerManager.writeDisplayFile(compilationUnit, setup, output);

		String javaName = "java-src/" + library.getPackageURI().resolve(file.getClassURI()) + ".java";
		javaName = javaName.replaceAll("§", "Ç");
		
		// format code
		if (format.equals(YesNo.YES)) {
			ByteArrayOutputStream formattedOutput = SourceHelper.format(new ByteArrayInputStream(output.toByteArray()));
			sourceManager.createChildEntry(job.getContext(), project, javaName, true, new ByteArrayInputStream(formattedOutput.toByteArray()));
		} else {
			sourceManager.createChildEntry(job.getContext(), project, javaName, true, new ByteArrayInputStream(output.toByteArray()));
		}
		
		compilationUnit.close();
	}

	private boolean replaceSource(QDisplayFile qDisplayFile, QCharacter libraryTo, YesNo replace) {
		QLibrary library = this.libraryManager.getLibraryReader(job).lookup(qDisplayFile.getLibrary());
		String librarySrc = libraryTo.trimR();
		if (libraryTo == null || libraryTo.isEmpty())
			librarySrc = qDisplayFile.getLibrary();
		QProject libraryEntry = sourceManager.getProject(job.getContext(), librarySrc);

		String javaName = "java-src/" + library.getPackageURI().resolve(qDisplayFile.getClassURI()) + ".java";
		javaName = javaName.replaceAll("§", "Ç");
		QSourceEntry javaEntry = sourceManager.getChildEntry(job.getContext(), libraryEntry, javaName);

		if (javaEntry != null && replace.equals(YesNo.NO))
			return false;

		return true;
	}

	private enum YesNo {
		@Special(value = "Y") YES, @Special(value = "N") NO
	}
}