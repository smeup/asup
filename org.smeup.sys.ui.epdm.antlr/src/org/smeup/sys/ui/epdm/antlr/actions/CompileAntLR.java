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

import org.antlr.Tool;
import org.antlr.tool.ANTLRErrorListener;
import org.antlr.tool.ErrorManager;
import org.antlr.tool.Message;
import org.antlr.tool.ToolMessage;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
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

public class CompileAntLR implements IObjectActionDelegate, ANTLRErrorListener {

	private Shell shell;

	private IFile iAntLRSourceFile;

	private MessageConsoleStream console;

	private IProject iProject;
	
	/**
	 * Constructor for Action1.
	 */
	public CompileAntLR() {
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
		
		ErrorManager.resetErrorState();
		ErrorManager.setErrorListener(this);
				
		writeMessage("Compile: " + iAntLRSourceFile.getLocationURI().toString());
				
		Tool antLRCompiler;		
		antLRCompiler = new Tool(new String[] {new File(iAntLRSourceFile.getLocationURI()).getAbsolutePath()});
		
		antLRCompiler.process();
		
		if (ErrorManager.getNumErrors() == 0) {
			writeMessage("Compile AntLR grammar was executed.");
			MessageDialog.openInformation(shell,
										  "ParserTools",
										   "Compile AntLR grammar was executed.");
		} else {
			writeMessage("Cannot compile AntLT grammar");
		}
		
		
		try {
			iProject.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {

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
				iAntLRSourceFile = (IFile)object;	
				iProject = iAntLRSourceFile.getProject();
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
			MessageConsole antLRConsole = findConsole("AntLR compiler output");
			console = antLRConsole.newMessageStream();
		}
		
		try {
			console.println(message);
			console.flush();
		} catch (IOException e) {
			//TODO
		}
	}

	@Override
	public void error(Message message) {
		writeMessage("ERROR: " + message.toString());
		
	}

	@Override
	public void error(ToolMessage message) {
		writeMessage("TOOL ERROR: " + message.toString());
		
	}

	@Override
	public void info(String message) {		
		
	}

	@Override
	public void warning(Message message) {		
		
	}

}
