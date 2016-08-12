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
package org.smeup.sys.dk.compiler.ibmi;

import java.io.IOException;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.StringTokenizer;

import org.smeup.sys.dk.compiler.QConversionUnit;
import org.smeup.sys.dk.parser.ibmi.cl.ParserFactory;
import org.smeup.sys.dk.parser.ibmi.cl.ParserFactory.ScriptType;
import org.smeup.sys.dk.parser.ibmi.cl.ParserInterface;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLCommand;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLObject;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLParameter;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLRow;
import org.smeup.sys.dk.parser.ibmi.cl.util.CLParserUtil;
import org.smeup.sys.il.core.meta.QDefault;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaFactory;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.DecimalType;
import org.smeup.sys.il.data.def.QBinaryDef;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QDecimalDef;
import org.smeup.sys.il.data.def.QIndicatorDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.il.data.def.QUnaryAtomicDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionException;
import org.smeup.sys.il.flow.QBlock;
import org.smeup.sys.il.flow.QBreak;
import org.smeup.sys.il.flow.QCommandExec;
import org.smeup.sys.il.flow.QContinue;
import org.smeup.sys.il.flow.QDataSection;
import org.smeup.sys.il.flow.QFor;
import org.smeup.sys.il.flow.QIf;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowFactory;
import org.smeup.sys.il.flow.QJump;
import org.smeup.sys.il.flow.QLabel;
import org.smeup.sys.il.flow.QMethodExec;
import org.smeup.sys.il.flow.QMonitor;
import org.smeup.sys.il.flow.QOnError;
import org.smeup.sys.il.flow.QParameterList;
import org.smeup.sys.il.flow.QProgram;
import org.smeup.sys.il.flow.QReturn;
import org.smeup.sys.il.flow.QStatement;
import org.smeup.sys.il.flow.QUntil;
import org.smeup.sys.il.flow.QWhile;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;

public class XMICLProgramWriter {

	public static enum QRPGLEMSG {
		RNF7030;
	}
	
	private ParserInterface<?> clParser;
	private ParserInterface<?> commandParser;

	private QProgram flowProgram;
	private QExceptionManager exceptionManager;
	private QConversionUnit conversionUnit;
	
	private ListIterator<CLRow> rowIterator;

	public XMICLProgramWriter(QConversionUnit conversionUnit, QProgram flowProgram, QExceptionManager exceptionManager) {
		this.conversionUnit = conversionUnit;
		this.flowProgram = flowProgram;
		this.exceptionManager = exceptionManager;
		clParser = ParserFactory.getInstance().getParser(ScriptType.CL);
		commandParser = ParserFactory.getInstance().getParser(ScriptType.CL_COMMAND);
	}

	public QProgram writeProgram(StringBuffer source) throws IOException, OperatingSystemRuntimeException, IntegratedLanguageExpressionException {

		CLObject clObj = (CLObject) clParser.parse(source.toString());

		// Normalize SELECT
		clObj = CLParserUtil.manageSelect(clObj);

		// Create data Section
		QDataSection dataSection = QIntegratedLanguageFlowFactory.eINSTANCE.createDataSection();
		flowProgram.setDataSection(dataSection);

		CLBlock mainBlock = new CLBlock();
		flowProgram.setMain(mainBlock.getBlock());

		// Initialize row iterator
		rowIterator = clObj.getRows().listIterator();
		buildBlock(mainBlock);

		return flowProgram;
	}

	private void analizeRow(CLBlock block, CLRow row) {

		if (row.getLabel() != null) {
			// Manage Labels
			QLabel labelStatement = QIntegratedLanguageFlowFactory.eINSTANCE.createLabel();
			labelStatement.setName(row.getLabel().getText());

			block.getBlock().getStatements().add(labelStatement);
		}

		CLCommand clCmd = row.getCommand();

		if (clCmd != null) {
			QStatement statement = analizeCommand(block, clCmd, true);
			if (statement != null)
				block.getBlock().getStatements().add(statement);
		}
	}

	private QStatement analizeCommand(CLBlock block, CLCommand clCmd, boolean clearIfStack) {

		QStatement result = null;

		if ("DCL".equalsIgnoreCase(clCmd.getName())) {
			if (clearIfStack)
				block.clearIfStack();
			manageDCLCommand(clCmd);
		} else if ("PGM".equalsIgnoreCase(clCmd.getName()))
			managePGMCommand(clCmd);
		else if ("ENDPGM".equalsIgnoreCase(clCmd.getName())) {
			// TODO end status (SETON *INLR?)
		} else if ("MONMSG".equalsIgnoreCase(clCmd.getName())) {
			if (clearIfStack)
				block.clearIfStack();
			buildMONMSGStatement(block, clCmd);
		}
		else if ("RETURN".equalsIgnoreCase(clCmd.getName())) {
			if (clearIfStack)
				block.clearIfStack();
			result = QIntegratedLanguageFlowFactory.eINSTANCE.createReturn();
		}
		else if ("DOUNTIL".equalsIgnoreCase(clCmd.getName())) {
			if (clearIfStack)
				block.clearIfStack();
			result = buildUNTILStatement(clCmd);
		} else if ("DOWHILE".equalsIgnoreCase(clCmd.getName())) {
			if (clearIfStack)
				block.clearIfStack();
			result = buildDOWHILEStatement(clCmd);
		} else if ("DOFOR".equalsIgnoreCase(clCmd.getName())) {
			if (clearIfStack)
				block.clearIfStack();
			result = buildStatementFOR(clCmd);
		} else if ("IF".equalsIgnoreCase(clCmd.getName()))
			// block.getIfStack().clear();
			result = buildIFStatement(block, clCmd);
		// block.getIfStack().add((QIf)result);
		else if ("ELSE".equalsIgnoreCase(clCmd.getName()))
			buildELSEStatement(block, clCmd);
		else if ("GOTO".equalsIgnoreCase(clCmd.getName())) {
			if (clearIfStack)
				block.clearIfStack();

			QJump jumpStatement = QIntegratedLanguageFlowFactory.eINSTANCE.createJump();

			// Set condition
			String label = null;
			if (clCmd.getPositionalParms().size() >= 1)
				label = clCmd.getPositionalParm(0).getValue().getText();
			else if (clCmd.getParm("CMDLBL") != null)
				label = clCmd.getParm("CMDLBL").getValue().getText();
			jumpStatement.setLabel(label);

			result = jumpStatement;
		} else if ("ITERATE".equalsIgnoreCase(clCmd.getName())) {
			if (clearIfStack)
				block.clearIfStack();

			// Read label
			String label = null;
			if (clCmd.getPositionalParms().size() >= 1)
				label = clCmd.getPositionalParm(0).getValue().getText();
			else if (clCmd.getParm("CMDLBL") != null)
				label = clCmd.getParm("CMDLBL").getValue().getText();

			if (label != null) {
				// If no label defined, create a Continue statement
				QContinue continueStatement = QIntegratedLanguageFlowFactory.eINSTANCE.createContinue();
				result = continueStatement;
			} else {
				// Else, create a Jump statement
				QJump jumpStatement = QIntegratedLanguageFlowFactory.eINSTANCE.createJump();
				jumpStatement.setLabel(label);
				result = jumpStatement;
			}
		} else if ("LEAVE".equalsIgnoreCase(clCmd.getName())) {

			if (clearIfStack)
				block.clearIfStack();

			// Read label
			String label = null;
			if (clCmd.getPositionalParms().size() >= 1)
				label = clCmd.getPositionalParm(0).getValue().getText();
			else if (clCmd.getParm("CMDLBL") != null)
				label = clCmd.getParm("CMDLBL").getValue().getText();

			if (label != null) {
				// If no label, create a Break statement
				QBreak breakStatement = QIntegratedLanguageFlowFactory.eINSTANCE.createBreak();
				result = breakStatement;
			} else {
				// Else, create a Jump statement
				QJump jumpStatement = QIntegratedLanguageFlowFactory.eINSTANCE.createJump();
				jumpStatement.setLabel(label);
				result = jumpStatement;
			}
		} else if ("CHGVAR".equalsIgnoreCase(clCmd.getName())) {
			if (clearIfStack)
				block.clearIfStack();

//			QEval eval = QIntegratedLanguageFlowFactory.eINSTANCE.createEval();

			// Read parms
			String varParm = null;
			String valueParm = null;

			if (clCmd.getPositionalParms().size() >= 1)
				varParm = clCmd.getPositionalParm(0).getValue().getText();
			else if (clCmd.getParm("VAR") != null)
				varParm = clCmd.getParm("VAR").getValue().getText();

			if (clCmd.getPositionalParms().size() >= 2)
				valueParm = clCmd.getPositionalParm(1).getValue().getText();
			else if (clCmd.getParm("VALUE") != null)
				valueParm = clCmd.getParm("VALUE").getValue().getText();

			String left = varParm;
			if (left.startsWith("&"))
				left = removeFirstChar(left);

			String right = valueParm;
			if (right.startsWith("&"))
				right = removeFirstChar(right);

			DataDefType dataDefType = null;
			
			if(left.toUpperCase().startsWith("%SST") || left.toUpperCase().startsWith("(%SST")) {
				dataDefType = DataDefType.CHARACTER;
			}
			else {
				QDataTerm<?> dataLeft = getData(left);
				if(dataLeft == null)
					throw exceptionManager.prepareException(conversionUnit.getContext().get(QJob.class), QRPGLEMSG.RNF7030, left);

				dataDefType = dataLeft.getDefinition().getDataDefType();
			}

			QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
			methodExec.setObject(left);
			if(dataDefType == DataDefType.CHARACTER || dataDefType == DataDefType.INDICATOR) 
				methodExec.setMethod("movel");
			else 
				methodExec.setMethod("move");
			methodExec.getParameters().add(right);
			methodExec.getParameters().add("true");
			
			result = methodExec;

		} else {
			if (clearIfStack)
				block.clearIfStack();

			QCommandExec cmdExecStatement = QIntegratedLanguageFlowFactory.eINSTANCE.createCommandExec();
			cmdExecStatement.setStatement(clCmd.getText());
			result = cmdExecStatement;
		}

		return result;
	}

	private QUntil buildUNTILStatement(CLCommand clCmd) {
		QUntil untilStatement = QIntegratedLanguageFlowFactory.eINSTANCE.createUntil();

		// Read params
		String condValue = null;
		if (clCmd.getPositionalParms().size() >= 1)
			condValue = clCmd.getPositionalParm(0).getValue().getText();
		else if (clCmd.getParm("COND") != null)
			condValue = clCmd.getParm("COND").getValue().getText();

		// untilStatement.setCondition(expressionParser.parseLogic(condValue));
		untilStatement.setCondition(condValue);

		CLBlock untilBlock = new CLBlock();
		buildBlock(untilBlock);
		untilStatement.setBody(untilBlock.getBlock());

		return untilStatement;
	}

	private QIf buildIFStatement(CLBlock block, CLCommand clCmd) {

		QIf ifStatement = QIntegratedLanguageFlowFactory.eINSTANCE.createIf();

		// Set condition
		String condition = null;
		if (clCmd.getPositionalParms().size() >= 1)
			condition = clCmd.getPositionalParm(0).getValue().getText();
		else if (clCmd.getParm("COND") != null)
			condition = clCmd.getParm("COND").getValue().getText();

		// ifStatement.setCondition(expressionParser.parseLogic(condition));
		ifStatement.setCondition(condition);

		// Get THEN value (positional or not)
		String thenValue = null;
		if (clCmd.getPositionalParms().size() >= 2)
			thenValue = clCmd.getPositionalParm(1).getValue().getText();
		else if (clCmd.getParm("THEN") != null)
			thenValue = clCmd.getParm("THEN").getValue().getText();
		else {
			// There isn't a THEN value. Read the next row and use it as THEN
			// value
			CLRow nextRow = rowIterator.next();
			CLCommand nextCmd = nextRow.getCommand();
			if (nextCmd != null)
				thenValue = nextCmd.getText();
		}

		if (thenValue != null)
			if ("DO".equalsIgnoreCase(thenValue) || "(DO)".equalsIgnoreCase(thenValue)) {
				CLBlock ifBlock = new CLBlock();

				buildBlock(ifBlock);
				ifStatement.setThen(ifBlock.getBlock());

				block.getIfStack().add(ifStatement);

			} else if ("IF".equalsIgnoreCase(thenValue)) {
				/*
				 * Example:
				 * 
				 * IF COND() IF....
				 * 
				 * cut clCmd at second IF
				 */

				int ifIndex = clCmd.getText().indexOf("IF", 2);
				thenValue = clCmd.getText().trim().substring(ifIndex);

				CLCommand thenIf = (CLCommand) commandParser.parse(thenValue);
				block.getIfStack().add(ifStatement);

				QIf result = buildIFStatement(block, thenIf);
				ifStatement.setThen(result);

			} else {

				CLCommand thenCmd = (CLCommand) commandParser.parse(thenValue);
				QStatement thenStatement = analizeCommand(block, thenCmd, false);
				ifStatement.setThen(thenStatement);

				block.getIfStack().add(ifStatement);
			}

		return ifStatement;
	}

	private void buildELSEStatement(CLBlock block, CLCommand clCmd) {

		// Get CMD value (positional or not)
		String cmdValue = null;
		if (clCmd.getPositionalParms().size() >= 1) {
			cmdValue = clCmd.getPositionalParm(0).getValue().getText();

			if (cmdValue.startsWith("(") && cmdValue.endsWith(""))
				cmdValue = cmdValue.substring(1, cmdValue.length() - 1);
			else
				cmdValue = clCmd.getText().trim().substring("ELSE".length()).trim();

		} else if (clCmd.getParm("CMD") != null)
			cmdValue = clCmd.getParm("CMD").getValue().getText();

		if ("DO".equalsIgnoreCase(cmdValue) || "(DO)".equalsIgnoreCase(cmdValue)) {
			CLBlock elseBlock = new CLBlock();
			buildBlock(elseBlock);

			block.getIfStack().peek().setElse(elseBlock.getBlock());
			block.clearIfStack();

		} else if (cmdValue.trim().startsWith("IF")) {
			CLCommand elseIf = (CLCommand) commandParser.parse(cmdValue + "\n");

			QIf lastIf = block.getIfStack().peek();
			QIf result = buildIFStatement(block, elseIf);
			lastIf.setElse(result);

		} else {
			CLCommand thenCmd = (CLCommand) commandParser.parse(cmdValue + "\n");
			QStatement result = analizeCommand(block, thenCmd, false);

			block.getIfStack().peek().setElse(result);
			block.clearIfStack();
		}
	}

	private void buildMONMSGStatement(CLBlock block, CLCommand clCmd)  {

		// Get MSGID value (positional or not)
		String msgIDValue = null;
		if (clCmd.getPositionalParms().size() >= 1)
			msgIDValue = clCmd.getPositionalParm(0).getValue().getText();
		else if (clCmd.getParm("MSGID") != null)
			msgIDValue = clCmd.getParm("MSGID").getValue().getText();

		// Get CMPDTA value (positional or not)
		String cmpdtaValue = null;
		if (clCmd.getPositionalParms().size() >= 2) {
			cmpdtaValue = clCmd.getPositionalParm(1).getValue().getText();

			if (cmpdtaValue.startsWith("(") && cmpdtaValue.endsWith(""))
				cmpdtaValue = cmpdtaValue.substring(1, cmpdtaValue.length() - 1);
		} else if (clCmd.getParm("CMPDTA") != null)
			cmpdtaValue = clCmd.getParm("CMPDTA").getValue().getText();

		// Get EXEC value (positional or not)
		String execValue = null;
		if (clCmd.getPositionalParms().size() >= 2) {
			execValue = clCmd.getPositionalParm(1).getValue().getText();

			if (execValue.startsWith("(") && execValue.endsWith(""))
				execValue = execValue.substring(1, execValue.length() - 1);
		} else if (clCmd.getParm("EXEC") != null)
			execValue = clCmd.getParm("EXEC").getValue().getText();

		// Link MONMSG to relative command
		List<QStatement> statementsList = block.getBlock().getStatements();

		if (statementsList.size() > 0) {

			// Case 1: MONMSG in CL source body (command MONMSG)

			QBlock execBlock = null;
			
			if ("DO".equalsIgnoreCase(execValue) || "(DO)".equalsIgnoreCase(msgIDValue)) {

				CLBlock execCLBlock = new CLBlock();
				buildBlock(execCLBlock);
				execBlock = execCLBlock.getBlock();

			} else {
				execBlock = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();
				if (execValue != null) {
					CLCommand thenCmd = (CLCommand) commandParser.parse(execValue + "\n");
					QStatement execCommand = analizeCommand(block, thenCmd, false);
					execBlock.getStatements().add(execCommand);
				}
			}

			// Control is the MONMSG command is related to an allowed command
			QStatement lastCommand = statementsList.get(statementsList.size() - 1);

			if (lastCommand instanceof QWhile || lastCommand instanceof QUntil || lastCommand instanceof QFor || lastCommand instanceof QJump || lastCommand instanceof QBreak
					|| lastCommand instanceof QContinue || lastCommand instanceof QReturn)
				System.err.println("MONMSG after a forbidden command");
			
			if (lastCommand instanceof QMonitor) {

				// Add a new onError node at existing monitor

				QMonitor lastMonitor = (QMonitor) lastCommand;

				QOnError onError = QIntegratedLanguageFlowFactory.eINSTANCE.createOnError();
				if (execBlock != null)
					onError.setBody(execBlock);

				if (msgIDValue != null && !msgIDValue.isEmpty()) {
					String[] errors = msgIDValue.split(" ");
					for(String error: errors)
						onError.getErrors().add(error);
				}


				lastMonitor.getOnErrors().add(onError);

			} else {

				// Create a new monitor statement with last command as boby

				QMonitor monitorStatement = QIntegratedLanguageFlowFactory.eINSTANCE.createMonitor();

				// Create monitor body
				QBlock monitorBody = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();
				monitorBody.getStatements().add(lastCommand);
				monitorStatement.setBody(monitorBody);

				// Create monitor onError
				QOnError onError = QIntegratedLanguageFlowFactory.eINSTANCE.createOnError();
				if (execBlock != null)
					onError.setBody(execBlock);

				if (msgIDValue != null && !msgIDValue.isEmpty()) {
					String[] errors = msgIDValue.split(" ");
					for(String error: errors)
						onError.getErrors().add(error);
				}

				monitorStatement.getOnErrors().add(onError);

				// Erase last command il block command list and add new
				// monitorStatement as last command
				// statementsList.remove(statementsList.size()-1);
				statementsList.add(monitorStatement);
			}
		} else {
			/*
			 * Case 2: MONMSG after first PGM statement (program MONMSG).
			 * 
			 * Manage MONMSG only if:
			 * 
			 * - An EXEC action is defined - and action is a GOTO statement.
			 */

			QBlock execBlock = null;

			if (execValue != null) {

				execBlock = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();
				CLCommand thenCmd = (CLCommand) commandParser.parse(execValue + "\n");
				QStatement execCommand = analizeCommand(block, thenCmd, false);

				if (execCommand instanceof QJump)
					execBlock.getStatements().add(execCommand);
				else
					System.err.println("Program level MONMSG can execute only GOTO statements");

				QMonitor monitorStatement = QIntegratedLanguageFlowFactory.eINSTANCE.createMonitor();

				// Create monitor body
				CLBlock monitorCLBlock = new CLBlock();
				buildBlock(monitorCLBlock);
				monitorStatement.setBody(monitorCLBlock.getBlock());

				// Create monitor onError
				QOnError onError = QIntegratedLanguageFlowFactory.eINSTANCE.createOnError();
				if (execBlock != null)
					onError.setBody(execBlock);
				
				if (msgIDValue != null && !msgIDValue.isEmpty()) {
					String[] errors = msgIDValue.split(" ");
					for(String error: errors)
						onError.getErrors().add(error);
				}

				monitorStatement.getOnErrors().add(onError);
				statementsList.add(monitorStatement);
			}
		}
	}

	private QFor buildStatementFOR(CLCommand clCmd) {
		QFor forStatement = QIntegratedLanguageFlowFactory.eINSTANCE.createFor();

		// Read params
		String varValue = null;
		if (clCmd.getPositionalParms().size() >= 1)
			varValue = clCmd.getPositionalParm(0).getValue().getText();
		else if (clCmd.getParm("VAR") != null)
			varValue = clCmd.getParm("VAR").getValue().getText();

		String fromValue = null;
		if (clCmd.getPositionalParms().size() >= 2)
			fromValue = clCmd.getPositionalParm(1).getValue().getText();
		else if (clCmd.getParm("FROM") != null)
			fromValue = clCmd.getParm("FROM").getValue().getText();

		String toValue = null;
		if (clCmd.getPositionalParms().size() >= 3)
			toValue = clCmd.getPositionalParm(2).getValue().getText();
		else if (clCmd.getParm("TO") != null)
			toValue = clCmd.getParm("TO").getValue().getText();

		String byValue = null;
		if (clCmd.getParm("BY") != null)
			byValue = clCmd.getParm("BY").getValue().getText();

		// TODO: manage DOWNTO

		// QExpression fromValueExpr = expressionParser.parseTerm(fromValue);
		forStatement.setInitialization(fromValue);

		if (byValue != null)
			// QExpression byValueExpr = expressionParser.parseTerm(byValue);
			forStatement.setIncrement(byValue);
		else
			// QExpression byValueExpr = expressionParser.parseTerm("1");
			forStatement.setIncrement("1");

		// QExpression conditionExpr = expressionParser.parseLogic(varValue +
		// " < " + toValue);
		forStatement.setCondition(varValue + " < " + toValue);

		CLBlock forBlock = new CLBlock();
		buildBlock(forBlock);
		forStatement.setBody(forBlock.getBlock());

		return forStatement;
	}

	private QWhile buildDOWHILEStatement(CLCommand clCmd) {

		QWhile whileStatement = QIntegratedLanguageFlowFactory.eINSTANCE.createWhile();

		// Read params
		String condValue = null;
		if (clCmd.getPositionalParms().size() >= 1)
			condValue = clCmd.getPositionalParm(0).getValue().getText();
		else if (clCmd.getParm("COND") != null)
			condValue = clCmd.getParm("COND").getValue().getText();

		// whileStatement.setCondition(expressionParser.parseLogic(condValue));
		whileStatement.setCondition(condValue);

		CLBlock whileBlock = new CLBlock();
		buildBlock(whileBlock);
		whileStatement.setBody(whileBlock.getBlock());

		return whileStatement;

	}

	private void buildBlock(CLBlock block) {

		while (rowIterator.hasNext()) {

			CLRow row = rowIterator.next();
			if (row.getCommand() != null && row.getCommand().getName().equalsIgnoreCase("ENDDO"))
				break;
			else
				// System.out.println(i++ + ":" + row.getText());
				analizeRow(block, row);

		}

		block.clearIfStack();
	}

	// DECLARATIVE STATEMENTS

	private void managePGMCommand(CLCommand clCmd) {
		String parms = null;

		if (clCmd.getPositionalParms().size() > 0)
			parms = clCmd.getPositionalParm(0).getValue().getText();

		if (parms == null) {
			CLParameter parm = clCmd.getParm("PARM");
			if (parm != null)
				parms = parm.getValue().getText().trim();
		}

		if (parms != null) {
			if (parms.startsWith("(") && parms.endsWith(")")) {
				parms = parms.substring(1, parms.length()-1);
			}

			QParameterList entry = QIntegratedLanguageFlowFactory.eINSTANCE.createParameterList();

			StringTokenizer tokenizer = new StringTokenizer(parms, " ");

			while (tokenizer.hasMoreTokens()) {
				String parm = tokenizer.nextToken();
				entry.getParameters().add(parm);
			}

			flowProgram.setEntry(entry);
		}
	}

	private void manageDCLCommand(CLCommand clCmd) throws OperatingSystemRuntimeException {

		QDataTerm<QDataDef<?>> dataTerm = QIntegratedLanguageFlowFactory.eINSTANCE.createFlowData();

		String varName = null;
		String varType = null;
		String varLength = null;
		String varValue = null;

		if (clCmd.getPositionalParms().size() > 0) {
			varName = clCmd.getPositionalParm(0).getValue().getText();

			if (clCmd.getPositionalParms().size() > 1) {
				varType = clCmd.getPositionalParm(1).getValue().getText();

				if (clCmd.getPositionalParms().size() > 2)
					varLength = clCmd.getPositionalParm(2).getValue().getText().trim();
			}
		}

		if (varName == null)
			varName = clCmd.getParm("VAR").getValue().getText().trim();

		if (varType == null)
			varType = clCmd.getParm("TYPE").getValue().getText().trim();

		if (varLength == null) {
			if (clCmd.getParm("LEN") == null)
				varLength = "1";
			else
				varLength = clCmd.getParm("LEN").getValue().getText().trim();
		}

		if (clCmd.getParm("VALUE") != null)
			varValue = clCmd.getParm("VALUE").getValue().getText().trim();

		// Delete initial &
		if (varName.startsWith("&"))
			varName = removeFirstChar(varName);

		dataTerm.setName(varName);

		if (varValue != null) {
			
			// Remove ' delimiters, if exists
			if (varValue.length()>1 && varValue.startsWith("'") && varValue.endsWith("'")) {
				varValue = varValue.substring(1, varValue.length()-1);
			}
			
			QDefault default_ = QIntegratedLanguageCoreMetaFactory.eINSTANCE.createDefault();
			default_.setValue(varValue);
			dataTerm.setDefault(default_);
		}

		// Create DataDef

		QBinaryDef binaryDefinition = null;
		QCharacterDef characterDefinition = null;
		QDecimalDef decimalDefinition = null;
		QIndicatorDef indicatorDefinition = null;

		QUnaryAtomicDataDef<? extends QBufferedData> dataDef;

		if (varType.equalsIgnoreCase("*DEC")) {
			decimalDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createDecimalDef();
			decimalDefinition.setType(DecimalType.PACKED);
			if (varLength != null) {
				String[] tokens = varLength.split(" ");
				decimalDefinition.setPrecision(Integer.parseInt(tokens[0]));
				if (tokens.length > 1)
					decimalDefinition.setScale(Integer.parseInt(tokens[1]));
			}

			dataDef = decimalDefinition;
		} else if (varType.equalsIgnoreCase("*CHAR")) {
			characterDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();

			if (varLength != null)
				characterDefinition.setLength(Integer.parseInt(varLength));

			dataDef = characterDefinition;
		} else if (varType.equalsIgnoreCase("*LGL")) {
			indicatorDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createIndicatorDef();
			dataDef = indicatorDefinition;
		} else if (varType.equalsIgnoreCase("*INT")) {
			binaryDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createBinaryDef();
			binaryDefinition.setType(BinaryType.SHORT);
			dataDef = binaryDefinition;
		} else if (varType.equalsIgnoreCase("*UINT")) {
			binaryDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createBinaryDef();
			binaryDefinition.setType(BinaryType.SHORT);
			binaryDefinition.setUnsigned(true);
			dataDef = binaryDefinition;
		} else
			throw new OperatingSystemRuntimeException("Unknown DCL variable type: " + varType);

		dataTerm.setDefinition(dataDef);

		flowProgram.getDataSection().getDatas().add(dataTerm);
	}

	public static String removeFirstChar(String str) {
		if (str.length() == 0)
			return str;
		if (str.length() == 1)
			return "";

		return str.substring(1);
	}
	
	private QDataTerm<?> getData(String name) {
		for(QDataTerm<?> data: flowProgram.getDataSection().getDatas()) {
			if(data.getName().equalsIgnoreCase(name))
				return data;
		}
		return null;
	}
	
	private class CLBlock {

		private QBlock block;

		private Stack<QIf> ifStack;

		CLBlock() {
			block = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();
			ifStack = new Stack<QIf>();
		}

		public Stack<QIf> getIfStack() {
			return ifStack;
		}

		public QBlock getBlock() {
			return block;
		}

		public void clearIfStack() {
			ifStack.clear();
		}
	}
}
