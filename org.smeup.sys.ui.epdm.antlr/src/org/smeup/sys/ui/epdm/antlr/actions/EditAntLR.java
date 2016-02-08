/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.ui.epdm.antlr.actions;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.osgi.framework.Bundle;

public class EditAntLR implements IObjectActionDelegate {

	private IFile iAntLRSourceFile;
	private MessageConsoleStream console;
	
	/**
	 * Constructor for Action1.
	 */
	public EditAntLR() {
		super();	
	}
	
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {			
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
				
		Bundle bundle = Platform.getBundle("org.smeup.sys.ui.epdm.antlr");

		try {
			URL url = FileLocator.find(bundle, new Path("antlr_includes/antlrworks-1.5.2-complete.jar"), Collections.EMPTY_MAP);	
			String jarPath = FileLocator.toFileURL(url).getPath();
			
			// In Windows, jarPath starts with /
			if (Platform.getOS().equals(Platform.OS_LINUX) == false) {
				jarPath = jarPath.substring(1);
			}
			
			boolean jarFound = false;
			
			File jarFile = new File(jarPath);
			if (jarFile.exists()) {
				jarFound = true;
			} 
			
			if (jarFound) { 
			
				File dir = new File(iAntLRSourceFile.getLocationURI()).getParentFile();
				
				String arg0 = "java";			
				String arg1 = "-jar";
		        String arg2 = jarPath;
		        String arg3 = "-f";
		        String arg4 = new File(iAntLRSourceFile.getLocationURI()).getAbsolutePath();
		        String arg5 = "-o";
		        String arg6 = createTempDir().getAbsolutePath();
						
				String[] command = {arg0, arg1, arg2, arg3, arg4, arg5, arg6};	
				
				String cmdString = "";
				for (int i = 0; i < command.length; i++) {
					cmdString += command[i] + " ";
				}
				
				writeMessage("Run cmd: " + cmdString);
				
				Runtime.getRuntime().exec(command, null, dir);
			} else {
				writeMessage("Fatal error: cannot found AntLRWorks executable: " + jarPath);
			}
			
		} catch(IOException e) {
			//TODO: manage error
		}
		
		
		/*
		XJSystem.setSystemProperties();
        XJApplication.setPropertiesPath("properties/");
        XJAlert.setDefaultAlertIcon(IconManager.shared().getIconApplication64x64());
        
        // Prepare parms        
        String arg0 = "-f";
        String arg1 = new File(iAntLRSourceFile.getLocationURI()).getAbsolutePath();
        String arg2 = "-o";
        String arg3 = createTempDir().getAbsolutePath();
        
        String[] args = new String[]{arg0, arg1, arg2, arg3};
        
        // Run AntLRWorks IDE
        XJApplication.run(new IDE(), args);
        */        	
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		
		action.setEnabled(false);		
				
		if(selection instanceof TreeSelection) {
			TreeSelection treeSelection = (TreeSelection) selection;
			
			Object object = treeSelection.getFirstElement();
			if(object instanceof IFile) {
				iAntLRSourceFile = (IFile)object;					
			}	
		}
		
		action.setEnabled(true);
		
	}

	private File createTempDir() {
		String tmpDirPath = System.getProperty("java.io.tmpdir") + "AntLRWorks" + File.separator;
		
		File tmpDir = new File(tmpDirPath);
		
		if (!tmpDir.exists()) {
			tmpDir.mkdirs();
		}
		
		return tmpDir;
	}
	
	private MessageConsole findConsole(String name) {
	      ConsolePlugin plugin = ConsolePlugin.getDefault();
	      IConsoleManager conMan = plugin.getConsoleManager();
	      IConsole[] existing = conMan.getConsoles();
	      for (int i = 0; i < existing.length; i++)
	         if (name.equals(existing[i].getName()))
	            return (MessageConsole) existing[i];
	      //no console found, so create a new one
	      MessageConsole myConsole = new MessageConsole(name, null);
	      conMan.addConsoles(new IConsole[]{myConsole});
	      return myConsole;
	   }
	
	private void writeMessage(String message) {
		
		if (console == null) {
			MessageConsole antLRConsole = findConsole("AntLR compiler output");
			console = antLRConsole.newMessageStream();
		}
		
		try {
			console.println(message);
			console.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
