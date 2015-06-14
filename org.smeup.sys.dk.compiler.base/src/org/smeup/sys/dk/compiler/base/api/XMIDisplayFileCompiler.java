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
package org.smeup.sys.dk.compiler.base.api;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

import javax.inject.Inject;

import org.smeup.sys.dk.compiler.CaseSensitiveType;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerManager;
import org.smeup.sys.dk.compiler.QDevelopmentKitCompilerFactory;
import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.OperatingSystemException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
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

	@Entry
	public void main(FileRef fileRef) throws IOException {

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
			if (!(qFile instanceof QDisplayFile))
				continue;

			try {
				createJavaFile((QDisplayFile) qFile, library);
			} catch (Exception e) {
				System.err.println(e);
			}
		}

	}

	private void createJavaFile(QDisplayFile file, QLibrary library) throws IOException, OperatingSystemException {

		if (file.getApplication() == null)
			throw new OperatingSystemException("Invalid file application: " + file);

		// create java source
		QProject project = sourceManager.getProject(job.getContext(), file.getLibrary());

		String javaName = library.getPackageURI().resolve(file.getClassURI()) + ".java";
		QSourceEntry javaEntry = sourceManager.createChildEntry(job.getContext(), project, javaName, true);

		OutputStream output = javaEntry.getOutputStream();

		// compilation unit
		QCompilationUnit compilationUnit = compilerManager.createCompilationUnit(job, file, CaseSensitiveType.LOWER);

		// compilation setup
		QCompilationSetup setup = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilationSetup();
		URI packageURI = library.getPackageURI().resolve(file.getPackageInfoURI());
		setup.setBasePackage(packageURI.toString().replaceAll("/", "."));

		compilerManager.writeDisplayFile(compilationUnit, setup, output);

		output.close();
		compilationUnit.close();
	}
}