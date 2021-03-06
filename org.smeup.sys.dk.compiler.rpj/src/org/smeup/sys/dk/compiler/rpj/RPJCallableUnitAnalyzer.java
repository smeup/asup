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

import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.il.flow.QCallableUnit;
import org.smeup.sys.il.flow.QCommandExec;
import org.smeup.sys.il.flow.QJump;
import org.smeup.sys.il.flow.QLabel;
import org.smeup.sys.il.flow.QMethodExec;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QRoutine;
import org.smeup.sys.il.flow.QSQLExec;
import org.smeup.sys.il.flow.QSetupSection;
import org.smeup.sys.il.flow.impl.StatementVisitorImpl;

public class RPJCallableUnitAnalyzer extends StatementVisitorImpl {

	private RPJCallableUnitInfo programInfo;	

	private RPJCallableUnitAnalyzer(RPJCallableUnitInfo programInfo) {
		this.programInfo = programInfo;
	}

	public static RPJCallableUnitInfo analyzeCallableUnit(QCompilationUnit compilationUnit, QCallableUnit callableUnit) {

		RPJCallableUnitInfo callableUnitInfo = new RPJCallableUnitInfo();
		
		
		if(callableUnit.getFileSection() != null) {
			if(callableUnit.getFileSection().getPrinters().size() >0 )
				callableUnitInfo.containsPRTStatement(true);
			
			if(callableUnit.getFileSection().getDisplays().size() >0 )
				callableUnitInfo.containsDSPStatement(true);
		}
		
		// C2LE support
		QSetupSection setupSection = callableUnit.getSetupSection();
		if(setupSection != null && setupSection.getModules().contains("*C2LE")) 
			callableUnitInfo.containsC2LEStatement(true);
		
		// analyze statement
		RPJCallableUnitAnalyzer callableUnitAnalyzer = new RPJCallableUnitAnalyzer(callableUnitInfo);

		// main
		if (callableUnit.getMain() != null)
			callableUnit.getMain().accept(callableUnitAnalyzer);

		// routines
		if (callableUnit.getFlowSection() != null)
			for (QRoutine routine : callableUnit.getFlowSection().getRoutines())
				if (routine.getMain() != null)
					routine.getMain().accept(callableUnitAnalyzer);

		// procedures
		if (callableUnit.getFlowSection() != null)
			for (QProcedure procedure : callableUnit.getFlowSection().getProcedures()) {
				RPJCallableUnitInfo procedureUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(compilationUnit, procedure);

				// split procedure information to callableUnit parent
				if (procedureUnitInfo.containsCMDStatement())
					callableUnitInfo.containsCMDStatement(true);
				if (procedureUnitInfo.containsSQLStatement())
					callableUnitInfo.containsSQLStatement(true);
				if (procedureUnitInfo.containsInsignificantZeros())
					callableUnitInfo.containsInsignificantZeros(true);

				callableUnitInfo.getLabels().putAll(procedureUnitInfo.getLabels());
				callableUnitInfo.getResetObjects().addAll(procedureUnitInfo.getResetObjects());
			}

		if (callableUnit.getFileSection() != null && !callableUnit.getFileSection().getStatements().isEmpty())
			callableUnitInfo.containsSQLStatement(true);

		return callableUnitInfo;
	}

	@Override
	public boolean visit(QJump statement) {

		RPJCallableUnitInfo.Label label = programInfo.getLabels().get(statement.getLabel().toUpperCase());
		if (label == null) {
			label = new RPJCallableUnitInfo.Label();
			programInfo.getLabels().put(statement.getLabel().toUpperCase(), label);
		}
		label.jumpsCount++;

		return super.visit(statement);
	}

	@Override
	public boolean visit(QLabel statement) {

		RPJCallableUnitInfo.Label label = programInfo.getLabels().get(statement.getName().toUpperCase());
		if (label == null) {
			label = new RPJCallableUnitInfo.Label();
			programInfo.getLabels().put(statement.getName().toUpperCase(), label);
		}

		return super.visit(statement);
	}

	@Override
	public boolean visit(QCommandExec statement) {

		programInfo.containsCMDStatement(true);

		return super.visit(statement);
	}

	@Override
	public boolean visit(QSQLExec statement) {

		programInfo.containsSQLStatement(true);

		return super.visit(statement);
	}

	@Override
	public boolean visit(QMethodExec statement) {

		if(statement.getObject() != null && statement.getObject().equals("*SQL"))
			programInfo.containsSQLStatement(true);
		
		if (statement.getMethod().toUpperCase().startsWith("MOVE")) {
			for (String parameter : statement.getParameters()) {
				if (isNumeric(parameter)) {
					if (parameter.trim().startsWith("0") && !parameter.trim().startsWith("0."))
						programInfo.containsInsignificantZeros(true);
				}
			}
		}
		else if (statement.getMethod().equalsIgnoreCase("RESET")) {
			programInfo.getResetObjects().add(statement.getObject());
		}
		
		return super.visit(statement);
	}

	private boolean isNumeric(String str) {

		try {
			Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
}
