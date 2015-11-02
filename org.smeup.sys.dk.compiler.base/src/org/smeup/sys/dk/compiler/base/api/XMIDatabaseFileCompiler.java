/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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
import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.OperatingSystemException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QDatabaseFile;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QLibraryManager;

@Program(name = "QASCRTXB")
public class XMIDatabaseFileCompiler {

	@Inject
	private QCompilerManager compilerManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QSourceManager sourceManager;
	@Inject
	private QJob job;
	@Inject
	private QLibraryManager libraryManager;

	@Entry
	public void main(FileRef fileRef, @DataDef(length=10) QCharacter libraryTo) throws IOException {

		// file
		QResourceReader<QFile> fileReader = null;
		Scope scope = Scope.get(fileRef.library.trimR());
		if (scope != null)
			fileReader = resourceManager.getResourceReader(job, QFile.class, scope);
		else
			fileReader = resourceManager.getResourceReader(job, QFile.class, fileRef.library.trimR());

		QObjectIterator<QFile> files = null;
		if (fileRef.name.trimR().equals("*ALL"))
			files = fileReader.find(null);
		else
			files = fileReader.find(fileRef.name.trimR());

		QResourceReader<QLibrary> libraryReader = libraryManager.getLibraryReader(job);
		QLibrary library = libraryReader.lookup(fileRef.library.trimR());

		while (files.hasNext()) {
			QFile qFile = files.next();
			if (!(qFile instanceof QDatabaseFile))
				continue;

			// exclude dictionary
			// TODO retrieve *DICT
			if (qFile.getName().startsWith("DIZ_"))
				continue;

			QDatabaseFile databaseFile = (QDatabaseFile) qFile;

			try {
				createJavaFile(databaseFile, library, libraryTo.trimR());
			} catch (Exception e) {
				System.err.println(e);
			}
		}

		files.close();
	}

	private void createJavaFile(QDatabaseFile file, QLibrary library, String libraryTo) throws IOException, OperatingSystemException {

		if (file.getApplication() == null)
			throw new OperatingSystemException("Invalid file application: " + file);

		if(libraryTo == null || libraryTo.isEmpty())
			libraryTo = file.getLibrary();
		
		// create java source
		QProject project = sourceManager.getProject(job.getContext(), libraryTo);

		String javaName = library.getPackageURI().resolve(file.getClassURI()) + ".java";
		javaName = javaName.replaceAll("§", "Ç");
		
		// compilation unit
		QCompilationUnit compilationUnit = compilerManager.createCompilationUnit(job, file, CaseSensitiveType.LOWER);

		// compilation setup
		QCompilationSetup setup = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilationSetup();
		URI packageURI = library.getPackageURI().resolve(file.getPackageInfoURI());
		setup.setBasePackage(packageURI.toString().replaceAll("/", "."));

		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		compilerManager.writeDatabaseFile(compilationUnit, setup, output);
		
		sourceManager.createChildEntry(job.getContext(), project, javaName, true, new ByteArrayInputStream(output.toByteArray()));

		output.close();

		compilationUnit.close();
	}
}