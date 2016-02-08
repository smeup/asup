/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.dk.parser.ibmi.cl.util;

import java.util.Iterator;

import org.smeup.sys.dk.parser.ibmi.cl.exceptions.CLScriptException;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLCommand;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLMonitorMessage;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLObject;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLParameter;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLPositionalParameter;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLRow;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLValue;

public class CLParserUtil {

	public static CLObject manageMonMsg(CLObject cl) throws CLScriptException{

		CLObject resultCl = new CLObject();
		resultCl.setText(cl.getText());

		Iterator<CLRow> rowIterator = cl.getRows().iterator();
		CLRow row = null;
		CLCommand lastCmd = null;

		while (rowIterator.hasNext()) {

			row = rowIterator.next();

			if (row.getCommand() != null) {

				CLCommand cmd = row.getCommand();
				if (cmd.getName().equalsIgnoreCase("MONMSG")) {

					if (lastCmd == null) {
						throw new CLScriptException("MONMSG row without relative CMD");
					}else {

						CLMonitorMessage monmsg = new CLMonitorMessage();

						for (CLPositionalParameter pospar : cmd
								.getPositionalParms()) {
							pospar.setFather(monmsg);
							monmsg.addPositionalParm(pospar);
						}

						for (String parkey : cmd.getParms().keySet()) {
							CLParameter par = cmd.getParms().get(parkey);
							par.setFather(monmsg);
							monmsg.addParm(par);
						}

						monmsg.setFather(lastCmd);
						lastCmd.addMonMsg(monmsg);
					}
				} else {
					row.setFather(resultCl);
					resultCl.addRow(row);
					lastCmd = cmd;
				}

			} else {
				row.setFather(resultCl);
				resultCl.addRow(row);
			}
		}

		return resultCl;
	}

	public static CLObject manageSelect(CLObject cl) throws CLScriptException{

		CLObject resultCl = new CLObject();
		resultCl.setText(cl.getText());

		Iterator<CLRow> rowIterator = cl.getRows().iterator();
		CLRow row = null;
		
		int selectLevel = 0;
		boolean firstWhen = false;

		while (rowIterator.hasNext()) {

			row = rowIterator.next();
			
			boolean addRow = true;

			if (row.getCommand() != null) {

				CLCommand cmd = row.getCommand();
				addRow = true;

				if (cmd.getName().equalsIgnoreCase("SELECT")) {

					firstWhen = true;
					selectLevel++;

					// Don't add SELECT in result tree
					addRow = false;

				} else	if (cmd.getName().equalsIgnoreCase("WHEN")) {

					if (selectLevel == 0) {
						throw new CLScriptException("WHEN not contained in SELECT");
					}

					if (firstWhen) {

						// Convert first "WHEN" in "IF"

						firstWhen = false;
						cmd.setName("IF");
						String cmdText = row.getCommand().getText().trim();
						cmdText = cmdText.replaceFirst("WHEN", "IF");
						row.getCommand().setText(cmdText);


					} else {

						// Convert next "WHEN" in "ELSE IF"

						cmd.setName("ELSE");

						CLPositionalParameter ifPar = new CLPositionalParameter();
						ifPar.setFather(cmd);
						ifPar.setText("IF");

						CLValue ifParValue = new CLValue();
						ifParValue.setFather(ifPar);
						ifParValue.setText("IF");

						ifPar.setValue(ifParValue);

						cmd.getPositionalParms().add(0, ifPar);

						String cmdText = row.getCommand().getText().trim();
						cmdText = cmdText.replaceFirst("WHEN", "ELSE IF");
						row.getCommand().setText(cmdText);
					}

					addRow = true;

				} else	if (cmd.getName().equalsIgnoreCase("OTHERWISE")) {

					if (selectLevel == 0) {
						throw new CLScriptException("OTHERWISE not contained in SELECT");
					}

					// Convert "OTHERWISE" in "ELSE"
					cmd.setName("ELSE");
					String cmdText = row.getCommand().getText().trim();
					cmdText = cmdText.replaceFirst("OTHERWISE", "ELSE");
					row.getCommand().setText(cmdText);

					addRow = true;

				} else	if (cmd.getName().equalsIgnoreCase("ENDSELECT")){
					if (selectLevel == 0) {
						throw new CLScriptException("WHEN not contained in SELECT");
					}

					// Don't add ENDSELECT in result tree
					selectLevel--;
					addRow = false;
				}

				if (addRow) {
					row.setFather(resultCl);
					resultCl.addRow(row);
				}

			} else {
				row.setFather(resultCl);
				resultCl.addRow(row);
			}
		}

		return resultCl;
	}


}
