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
package org.smeup.sys.ui.epdm.lpg.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.osgi.framework.Bundle;

public class CompileLPG implements IObjectActionDelegate {

	private Shell shell;

	private IFile iLPGSourceFile;

	private MessageConsoleStream console;

	private IProject iProject;
	
	/**
	 * Constructor for Action1.
	 */
	public CompileLPG() {
		super();	
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		
		writeMessage("Compile: " + iLPGSourceFile.getLocationURI().toString());
				
		if (Platform.getOS().equals(Platform.OS_WIN32) == false) {
			writeMessage("Compile action aborted: LPG grammar could be compiled only on Windows system");
			MessageDialog.openInformation(shell,
  					"LPG Parser",
  					"LPG grammar could be compiled only on Windows system");			
			return;
		}
		
		try {
			Bundle bundle = Platform.getBundle("org.asup.ui.pdmg.lpg.e4");

			URL url = FileLocator.find(bundle, new Path("lpg_includes/lpg.exe"), Collections.emptyMap());	
			String executable = FileLocator.toFileURL(url).getPath().substring(1);
			
			String include = "-include-directory='.;..;"					 
			 		 + FileLocator.toFileURL(FileLocator.find(bundle, new Path("lpg_includes/include/lexer"), Collections.emptyMap())).getPath().substring(1) + ";"
					 + FileLocator.toFileURL(FileLocator.find(bundle, new Path("lpg_includes/include/query"), Collections.emptyMap())).getPath().substring(1) + ";"
					 + FileLocator.toFileURL(FileLocator.find(bundle, new Path("lpg_includes/include/sql"), Collections.emptyMap())).getPath().substring(1) + ";"
					 + "'";							 
			
			String src = new File(iLPGSourceFile.getLocationURI()).getAbsolutePath();			
			File dir = new File(iLPGSourceFile.getLocationURI()).getParentFile();
			
			
			String[] command = {executable, include, src};
			
			writeMessage("Run cmd: " + command[0] + " " + command[1] + " " + command[2]);
			
			Process p = Runtime.getRuntime().exec(command, null, dir);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = reader.readLine();
	    	while (line != null) {
	    		writeMessage(line);
	    		line = reader.readLine();
	    	}
	    	reader.close();
	    	
	    	try {
				p.waitFor();
			} catch (InterruptedException e) {			
			}
	    	
	    	
	    	iProject.refreshLocal(IResource.DEPTH_INFINITE, null);
	    	
			MessageDialog.openInformation(shell,
					  					"LPG Parser",
					  					"LPG compilation launched");
		} catch (IOException e) {
			writeMessage("Error launching executable: " + e.getMessage());
		} catch (CoreException e) {
			writeMessage("Cannot refresh project");
		}
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
				iLPGSourceFile = (IFile)object;
				iProject = iLPGSourceFile.getProject();
			}	
		}
		
		
		
		action.setEnabled(true);
		
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
			MessageConsole antLRConsole = findConsole("LPG compiler output");
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
