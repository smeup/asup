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
package org.smeup.sys.dk.source.jdt;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.smeup.sys.dk.source.QProjectDef;

public class JDTProjectUtil {
	
	private static final String PDE_MANIFEST_BUILDER = "org.eclipse.pde.ManifestBuilder"; //$NON-NLS-1$
	private static final String PDE_SCHEMA_BUILDER = "org.eclipse.pde.SchemaBuilder"; //$NON-NLS-1$
	
	private static final String JRE_CONTAINER_ID = "org.eclipse.jdt.launching.JRE_CONTAINER";	
	private static final String PDE_CONTAINER_ID = "org.eclipse.pde.core.requiredPlugins";
//	private static final String PDE_NATURE = "org.eclipse.pde.PluginNature";
	
	private static final String JAVA_SRC_DIRECTORY = "src";
    public static final String JAVA_LIB_DIRECTORY = "lib"; 
    public static final String JAVA_CLASSES_DIRECTORY = "bin"; 

	
    public static IJavaProject createAsupProject(IProject project, QProjectDef projectDef) throws CoreException, IOException {

    	project.create(null);
		project.open(null);

        // create folder
		project.getFolder("asup-src").create(true, true, null);
		project.getFolder("asup-obj").create(true, true, null);
		project.getFolder("META-INF").create(true, true, null);
		project.getFolder(JAVA_LIB_DIRECTORY).create(true, true, null);
		project.getFolder(JAVA_SRC_DIRECTORY).create(true, true, null);

		IFile file = project.getFile("META-INF/MANIFEST.MF");
		Manifest manifest = new Manifest(); 
		Attributes attributes = manifest.getMainAttributes();
		attributes.putValue("Manifest-Version", "1.0");
		attributes.putValue("Bundle-ManifestVersion", "2");
		attributes.putValue("Bundle-Name", projectDef.getText());
		attributes.putValue("Bundle-SymbolicName", projectDef.getName());		
		attributes.putValue("Bundle-Version", "0.7.0.qualifier");
//		attributes.putValue("Require-Bundle", "org.asup.os.core, org.asup.db.core, org.smeup.sys.il.data, org.asup.il.isam, org.asup.il.flow, org.asup.os.type.pgm, org.asup.os.type.pgm.rpj, org.asup.os.type.file, com.smeup.erp.gen.file.dbf, com.smeup.erp.gen.file.dspf, com.smeup.erp.gen.file.prtf, com.smeup.erp.gen.sqlpkg, com.smeup.erp.gen.module, com.smeup.erp.gen.pgm");
		attributes.putValue("Bundle-RequiredExecutionEnvironment", "JavaSE-1.7");
		attributes.putValue("Export-Package", ".");
		
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		manifest.write(stream);
		stream.close();
		if(!file.exists())
			file.create(new ByteArrayInputStream(stream.toByteArray()), true, null);
		
		
		file = project.getFile("build.properties"); //$NON-NLS-1$
		
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		pw.println("source.. = "+JAVA_SRC_DIRECTORY);
		pw.println("bin.includes = META-INF/,\\.");
		pw.close();
		
		file.create(new ByteArrayInputStream(sw.toString().getBytes()), true, null);

		project.refreshLocal(IProject.DEPTH_INFINITE, null);
		
		IProjectDescription description = project.getDescription();

		// Add the natures
		String[] natures = description.getNatureIds();
		String[] newNatures = new String[natures.length + 1];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
//		newNatures[natures.length] = AsupNature.NATURE_ID;
		newNatures[natures.length] = JavaCore.NATURE_ID;
//		newNatures[natures.length+1] = PDE_NATURE;
		description.setNatureIds(newNatures);
		project.setDescription(description, IResource.FORCE, null);
		
		IJavaProject javaProject = convertToJavaPluginProject(project);
		
		return javaProject;
    }
    
	public static IJavaProject convertToJavaPluginProject(IProject project) throws CoreException {

		IJavaProject javaProject = JavaCore.create(project);
		
		
		IProjectDescription projectDescription = project.getDescription();
		List<IClasspathEntry> classpathEntries = new ArrayList<IClasspathEntry>();
		classpathEntries.addAll(Arrays.asList(javaProject.getRawClasspath()));

		ICommand[] builders = projectDescription.getBuildSpec();
		if (builders == null) {
			builders = new ICommand[0];
		}
		boolean hasManifestBuilder = false;
		boolean hasSchemaBuilder = false;
		for (int i = 0; i < builders.length; ++i) {
			if (PDE_MANIFEST_BUILDER.equals(builders[i].getBuilderName())) {
				hasManifestBuilder = true;
			}
			if (PDE_SCHEMA_BUILDER.equals(builders[i].getBuilderName())) {
				hasSchemaBuilder = true;
			}
		}
		if (!hasManifestBuilder) {
			ICommand[] oldBuilders = builders;
			builders = new ICommand[oldBuilders.length + 1];
			System.arraycopy(oldBuilders, 0, builders, 0, oldBuilders.length);
			builders[oldBuilders.length] = projectDescription.newCommand();
			builders[oldBuilders.length].setBuilderName(PDE_MANIFEST_BUILDER);
		}
		if (!hasSchemaBuilder) {
			ICommand[] oldBuilders = builders;
			builders = new ICommand[oldBuilders.length + 1];
			System.arraycopy(oldBuilders, 0, builders, 0, oldBuilders.length);
			builders[oldBuilders.length] = projectDescription.newCommand();
			builders[oldBuilders.length].setBuilderName(PDE_SCHEMA_BUILDER);
		}
		projectDescription.setBuildSpec(builders);
		
		project.setDescription(projectDescription, null);

		// classpath
        List<IClasspathEntry> classpath = new ArrayList<IClasspathEntry>();
			// jre
	        IClasspathEntry jreClasspathEntry = JavaCore.newContainerEntry(new Path(JRE_CONTAINER_ID));
	        classpath.add(jreClasspathEntry);
			// pde
	        IClasspathEntry pdeClasspathEntry = JavaCore.newContainerEntry(new Path(PDE_CONTAINER_ID));
	        classpath.add(pdeClasspathEntry);
	        // source folder 
	        IClasspathEntry classpathEntry = JavaCore.newSourceEntry(javaProject.getPath().append(JAVA_SRC_DIRECTORY));	        	        
	        classpath.add(classpathEntry);

        IClasspathEntry[] classpathEntryArray = classpath.toArray(new IClasspathEntry[classpath.size()]);
        javaProject.setRawClasspath(classpathEntryArray, null);
        // compilation output
        javaProject.setOutputLocation(javaProject.getPath().append(JAVA_CLASSES_DIRECTORY), null);	        
		
		return javaProject;
	}
}
