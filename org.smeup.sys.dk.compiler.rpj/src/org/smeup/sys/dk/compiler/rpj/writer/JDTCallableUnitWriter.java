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
package org.smeup.sys.dk.compiler.rpj.writer;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ArrayCreation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.smeup.sys.db.esql.CursorType;
import org.smeup.sys.db.esql.QCursor;
import org.smeup.sys.db.esql.QCursorTerm;
import org.smeup.sys.db.esql.QStatement;
import org.smeup.sys.db.esql.QStatementTerm;
import org.smeup.sys.db.esql.annotation.CursorDef;
import org.smeup.sys.dk.compiler.DevelopmentKitCompilerRuntimeException;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerLinker;
import org.smeup.sys.dk.compiler.QCompilerManager;
import org.smeup.sys.dk.compiler.QDevelopmentKitCompilerFactory;
import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.dk.core.annotation.Unsupported;
import org.smeup.sys.il.core.QConversion;
import org.smeup.sys.il.core.QNamedNode;
import org.smeup.sys.il.core.QRemap;
import org.smeup.sys.il.core.term.QTerm;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.esam.QDataSet;
import org.smeup.sys.il.esam.QDataSetTerm;
import org.smeup.sys.il.esam.QDisplay;
import org.smeup.sys.il.esam.QDisplayTerm;
import org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage;
import org.smeup.sys.il.esam.QKSDataSet;
import org.smeup.sys.il.esam.QKeyListTerm;
import org.smeup.sys.il.esam.QPrint;
import org.smeup.sys.il.esam.QPrintTerm;
import org.smeup.sys.il.esam.QRRDataSet;
import org.smeup.sys.il.esam.annotation.FileDef;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.flow.QBlock;
import org.smeup.sys.il.flow.QCallableUnit;
import org.smeup.sys.il.flow.QDataSection;
import org.smeup.sys.il.flow.QEntry;
import org.smeup.sys.il.flow.QEntryParameter;
import org.smeup.sys.il.flow.QParameterList;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.il.flow.QRoutine;
import org.smeup.sys.il.flow.QUnit;

public abstract class JDTCallableUnitWriter extends JDTUnitWriter {

	private QExpressionParser expressionParser;

	public JDTCallableUnitWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name);

		expressionParser = getCompilationUnit().getContext().get(QExpressionParser.class);
	}

	@SuppressWarnings("unchecked")
	public void writeLabels(Collection<String> labels, boolean private_, boolean static_) {

		if (labels.isEmpty())
			return;

		EnumDeclaration enumType = getAST().newEnumDeclaration();
		enumType.setName(getAST().newSimpleName("TAG"));

		if (private_)
			enumType.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.PRIVATE_KEYWORD));
		else
			enumType.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));

		if (static_)
			enumType.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

		// elements
		int num = 0;

		for (String label : labels) {

			EnumConstantDeclaration constantDeclaration = getAST().newEnumConstantDeclaration();
			constantDeclaration.setName(getAST().newSimpleName(normalizeEnumName(label)));

			enumType.enumConstants().add(num, constantDeclaration);
			num++;
		}

		getTarget().bodyDeclarations().add(enumType);
	}

	@SuppressWarnings("unchecked")
	public void writeMessages(Collection<String> messages) {

		EnumDeclaration enumType = getAST().newEnumDeclaration();
		enumType.setName(getAST().newSimpleName("QCPFMSG"));
		enumType.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		enumType.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

		// elements
		int num = 0;

		for (String message : messages) {
			if (message.equalsIgnoreCase("CPF0000"))
				continue;
			EnumConstantDeclaration constantDeclaration = getAST().newEnumConstantDeclaration();
			constantDeclaration.setName(getAST().newSimpleName(normalizeEnumName(message)));

			enumType.enumConstants().add(num, constantDeclaration);
			num++;
		}

		getTarget().bodyDeclarations().add(enumType);
	}

	@SuppressWarnings("unchecked")
	public void writeModuleFields(List<String> modules, boolean public_) {

		for (String module : modules) {

			String moduleName = getCompilationUnit().normalizeTermName(module).toUpperCase();

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);

			// writeAnnotation(field, ModuleDef.class, "name", moduleName);
			writeAnnotation(field, Inject.class);
			// writeAnnotation(field, Named.class, "value", moduleName);

			if (public_)
				field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
			else
				field.modifiers().add(getAST().newModifier(ModifierKeyword.PRIVATE_KEYWORD));

			field.setType(getAST().newSimpleType(getAST().newName(moduleName)));

			variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(module)));

			getTarget().bodyDeclarations().add(field);
		}

	}

	public void writeDataFields(QDataSection dataSection) {

		// fields
		for (QDataTerm<?> dataTerm : dataSection.getDatas()) {

			if (dataTerm.getDefinition() == null)
				continue;

			dataTerm = getCompilationUnit().getDataTerm(dataTerm.getName(), true);

			writePublicField(dataTerm, false);
		}

	}

	@SuppressWarnings("unchecked")
	public void writeDataSets(List<QDataSetTerm> dataSets) throws IOException {

		writeImport(QDataSet.class);

		for (QDataSetTerm dataSetTerm : dataSets) {

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);
			writeAnnotation(field, FileDef.class, "name", dataSetTerm.getFileName());

			EObject eDataSet = (EObject) dataSetTerm;

			if (eDataSet.eIsSet(QIntegratedLanguageEsamPackage.eINSTANCE.getDataSetTerm_Prefix()))
				writeAnnotation(field, FileDef.class, "prefix", dataSetTerm.getPrefix());

			if (eDataSet.eIsSet(QIntegratedLanguageEsamPackage.eINSTANCE.getFileTerm_UserOpen()))
				writeAnnotation(field, FileDef.class, "userOpen", dataSetTerm.isUserOpen());

			if (eDataSet.eIsSet(QIntegratedLanguageEsamPackage.eINSTANCE.getFileTerm_InfoStruct()))
				writeAnnotation(field, FileDef.class, "info", getCompilationUnit().normalizeTermName(dataSetTerm.getInfoStruct()));

			field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

			String className = null;
			QCompilerLinker compilerLinker = dataSetTerm.getFacet(QCompilerLinker.class);

			if (dataSetTerm.isKeyedAccess()) {
				writeImport(QKSDataSet.class);
				className = QKSDataSet.class.getSimpleName();
			} else
				try {
					/*
					 * if (dataSet.getRecord().getElements().size() > 1 &&
					 * dataSet
					 * .getRecord().getElements().get(0).getName().equalsIgnoreCase
					 * ("SRCSEQ")) {
					 * 
					 * writeImport(QSMDataSet.class); className =
					 * QSMDataSet.class.getSimpleName();
					 * 
					 * } else {
					 */
					writeImport(QRRDataSet.class);
					className = QRRDataSet.class.getSimpleName();
					// }
				} catch (NullPointerException e) {
					writeImport(QRRDataSet.class);
					className = QRRDataSet.class.getSimpleName();
				}

			Type dataSetType = getAST().newSimpleType(getAST().newSimpleName(className));
			ParameterizedType parType = getAST().newParameterizedType(dataSetType);

			if (compilerLinker != null) {
				writeImport(compilerLinker.getLinkedClass());
				parType.typeArguments().add(getAST().newSimpleType(getAST().newName(compilerLinker.getLinkedClass().getSimpleName())));
			} else {
				String argument = dataSetTerm.getFileName();
				parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));
			}

			field.setType(parType);
			variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(dataSetTerm.getName())));

			getTarget().bodyDeclarations().add(field);

			// internal file definition
			// if (compilerLinker == null && dataSet.getRecord() != null)
			// writeInnerRecord(dataSet.getFileName(), dataSet.getRecord());
		}

	}

	public void writeKeyLists(List<QKeyListTerm> keyLists) {

		writeImport(QBufferedData.class);

		for (QKeyListTerm keyList : keyLists)
			if (!CompilationContextHelper.containsArray(expressionParser, keyList))
				writeKeyList(keyList);
	}

	@SuppressWarnings("unchecked")
	public void writeKeyList(QKeyListTerm keyList) {

		VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
		variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(keyList.getName())));
		FieldDeclaration field = getAST().newFieldDeclaration(variable);
		field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		Type bufferedType = getAST().newSimpleType(getAST().newSimpleName(QBufferedData.class.getSimpleName()));
		field.setType(getAST().newArrayType(bufferedType));

		// array of bufferedData
		ArrayCreation arrayCreation = getAST().newArrayCreation();
		arrayCreation.setType(getAST().newArrayType(getAST().newSimpleType(getAST().newSimpleName(QBufferedData.class.getSimpleName()))));

		ArrayInitializer arrayInitializer = getAST().newArrayInitializer();
		for (String keyField : keyList.getKeyFields()) {

			QExpression expression = expressionParser.parseExpression(keyField);
			Expression jdtExpression = buildExpression(getAST(), expression, null);
			arrayInitializer.expressions().add(jdtExpression);
		}
		arrayCreation.setInitializer(arrayInitializer);

		variable.setInitializer(arrayCreation);

		getTarget().bodyDeclarations().add(field);
	}

	@SuppressWarnings("unchecked")
	public void writeCursors(List<QCursorTerm> cursors) {

		writeImport(QCursor.class);
		writeImport(CursorType.class);

		for (QCursorTerm cursorTerm : cursors) {

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);
			if (cursorTerm.isHold())
				writeAnnotation(field, CursorDef.class, "hold", cursorTerm.isHold());
			writeAnnotation(field, CursorDef.class, "type", cursorTerm.getCursorType());
			field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

			Type dataSetType = getAST().newSimpleType(getAST().newSimpleName(QCursor.class.getSimpleName()));
			field.setType(dataSetType);
			variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(cursorTerm.getName())));
			getTarget().bodyDeclarations().add(field);
		}

	}

	@SuppressWarnings("unchecked")
	public void writeStatements(List<QStatementTerm> statements) {

		writeImport(QStatement.class);

		for (QStatementTerm statementTerm : statements) {

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);
			field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

			Type dataSetType = getAST().newSimpleType(getAST().newSimpleName(QStatement.class.getSimpleName()));
			field.setType(dataSetType);
			variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(statementTerm.getName())));
			getTarget().bodyDeclarations().add(field);
		}

	}

	@SuppressWarnings("unchecked")
	public void writeDisplays(List<QDisplayTerm> displays) throws IOException {

		writeImport(QDisplay.class);

		for (QDisplayTerm display : displays) {

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);
			writeAnnotation(field, FileDef.class, "name", display.getFileName());

			EObject eDataSet = (EObject) display;
			if (eDataSet.eIsSet(QIntegratedLanguageEsamPackage.eINSTANCE.getFileTerm_UserOpen()))
				writeAnnotation(field, FileDef.class, "userOpen", display.isUserOpen());

			if (eDataSet.eIsSet(QIntegratedLanguageEsamPackage.eINSTANCE.getFileTerm_InfoStruct()))
				writeAnnotation(field, FileDef.class, "info", display.getInfoStruct());

			field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

			String className = null;
			QCompilerLinker compilerLinker = display.getFacet(QCompilerLinker.class);

			writeImport(QDisplay.class);
			className = QDisplay.class.getSimpleName();

			Type displayType = getAST().newSimpleType(getAST().newSimpleName(className));
			ParameterizedType parType = getAST().newParameterizedType(displayType);

			if (compilerLinker != null) {
				writeImport(compilerLinker.getLinkedClass());
				parType.typeArguments().add(getAST().newSimpleType(getAST().newName(compilerLinker.getLinkedClass().getSimpleName())));
			} else {
				String argument = display.getFileName();
				parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));
			}

			field.setType(parType);
			variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(display.getName())));

			getTarget().bodyDeclarations().add(field);

		}

	}

	@SuppressWarnings("unchecked")
	public void writePrinters(List<QPrintTerm> printers) throws IOException {

		writeImport(QPrint.class);

		for (QPrintTerm printer : printers) {

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);
			writeAnnotation(field, FileDef.class, "name", printer.getFileName());

			EObject eDataSet = (EObject) printer;
			if (eDataSet.eIsSet(QIntegratedLanguageEsamPackage.eINSTANCE.getFileTerm_UserOpen()))
				writeAnnotation(field, FileDef.class, "userOpen", printer.isUserOpen());

			if (eDataSet.eIsSet(QIntegratedLanguageEsamPackage.eINSTANCE.getFileTerm_InfoStruct()))
				writeAnnotation(field, FileDef.class, "info", printer.getInfoStruct());

			field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

			String className = null;
			QCompilerLinker compilerLinker = printer.getFacet(QCompilerLinker.class);

			writeImport(QPrint.class);
			className = QPrint.class.getSimpleName();

			Type printerType = getAST().newSimpleType(getAST().newSimpleName(className));
			ParameterizedType parType = getAST().newParameterizedType(printerType);

			if (compilerLinker != null) {
				writeImport(compilerLinker.getLinkedClass());
				parType.typeArguments().add(getAST().newSimpleType(getAST().newName(compilerLinker.getLinkedClass().getSimpleName())));
			} else {
				String argument = printer.getFileName();
				parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));
			}

			field.setType(parType);
			variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(printer.getName())));

			getTarget().bodyDeclarations().add(field);

		}

	}

	@SuppressWarnings("unchecked")
	public MethodDeclaration writeRoutine(QRoutine routine) {

		if (routine.getName().startsWith("*ENTRY") || routine.getName().startsWith("*EXIT"))
			return null;

		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(routine.getName())));
		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		// writeSuppressWarning(methodDeclaration);

		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);

		if (routine.getMain() == null)
			return methodDeclaration;

		// write java AST
		JDTStatementWriter statementWriter = getCompilationUnit().getContext().make(JDTStatementWriter.class);
		statementWriter.setAST(getAST());

		statementWriter.getBlocks().push(block);

		if (routine.getMain() instanceof QBlock) {
			QBlock qBlock = (QBlock) routine.getMain();
			for (org.smeup.sys.il.flow.QStatement qStatement : qBlock.getStatements())
				qStatement.accept(statementWriter);
		} else
			routine.getMain().accept(statementWriter);

		statementWriter.getBlocks().pop();

		return methodDeclaration;
	}

	@SuppressWarnings("unchecked")
	public void writePrototype(QPrototype prototype) {

		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(prototype.getName())));
		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);

		if (prototype.getDefinition() != null) {
			Type type = getJavaType(prototype);
			methodDeclaration.setReturnType2(type);
		}

		QProcedure procedure = getCompilationUnit().getProcedure(prototype.getName(), true);
		if (procedure != null) {
			writeEntry(methodDeclaration, procedure.getEntry());

			String namePrototype = getCompilationUnit().normalizeTermName(prototype.getName());
			MethodInvocation methodInvocation = getAST().newMethodInvocation();
			methodInvocation.setExpression(getAST().newName(namePrototype));
			methodInvocation.setName(getAST().newSimpleName("qExec"));

			/*
			 * switch (namePrototype) { case "p_rxatt": case "p_rxsos": case
			 * "p_rxlate": writeImport(RPJServiceSupport.class);
			 * methodInvocation.setExpression(getAST().newName("qJAX"));
			 * methodInvocation.setName(getAST().newSimpleName(namePrototype));
			 * break; default:
			 * methodInvocation.setExpression(getAST().newName(namePrototype));
			 * methodInvocation.setName(getAST().newSimpleName("qExec")); break;
			 * }
			 */

			for (Object entryParameter : methodDeclaration.parameters()) {
				SingleVariableDeclaration singleVariableDeclaration = (SingleVariableDeclaration) entryParameter;
				methodInvocation.arguments().add(getAST().newSimpleName(singleVariableDeclaration.getName().toString()));
			}

			if (prototype.getDefinition() != null) {
				ReturnStatement returnStatement = getAST().newReturnStatement();
				returnStatement.setExpression(methodInvocation);
				block.statements().add(returnStatement);
			} else {
				ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
				block.statements().add(expressionStatement);
			}

		} else {
			writeEntry(methodDeclaration, prototype.getEntry());

			// TODO manage CALL
		}
	}

	public void writeInnerProcedure(QProcedure procedure) {

		QCompilerManager compilerManager = getCompilationUnit().getContext().get(QCompilerManager.class);
		QCompilationUnit procedureCompilationUnit = compilerManager.createChildCompilationUnit(getCompilationUnit(), procedure);

		QCompilationSetup compilationSetup = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilationSetup();

		boolean static_ = false;
		boolean private_ = true;

		switch (getCompilationSetup().getProcedureType()) {
		case INNER:
			break;
		case NESTED:
			static_ = true;
			private_ = false;
			break;
		}

		JDTProcedureWriter procedureWriter = new JDTProcedureWriter(this, procedureCompilationUnit, compilationSetup, getCompilationUnit().normalizeTermName(procedure.getName()), private_, static_);
		try {
			procedureWriter.writeProcedure(procedure);
		} catch (IOException e) {
			throw new DevelopmentKitCompilerRuntimeException("Invalid procedure: " + procedure, e);
		}
	}

	@SuppressWarnings("unchecked")
	public void writeMain(QParameterList parameterList, String name) {

		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(name));
		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		// writeSuppressWarning(methodDeclaration);

		MarkerAnnotation entryAnnotation = getAST().newMarkerAnnotation();
		entryAnnotation.setTypeName(getAST().newSimpleName(Entry.class.getSimpleName()));
		writeImport(Entry.class);
		methodDeclaration.modifiers().add(entryAnnotation);

		for (String parameterName : parameterList.getParameters()) {
			QDataTerm<?> dataTerm = getCompilationUnit().getDataTerm(parameterName, true);

			SingleVariableDeclaration parameterVariable = getAST().newSingleVariableDeclaration();
			parameterVariable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(dataTerm.getName())));
			Type type = getJavaType(dataTerm);
			parameterVariable.setType(type);

			QConversion conversion = dataTerm.getFacet(QConversion.class);
			if (conversion != null) {
				MarkerAnnotation conversionAnnotation = getAST().newMarkerAnnotation();

				switch (conversion.getStatus()) {
				case POSSIBLE:
					break;
				case SUPPORTED:
					writeImport(Supported.class);
					conversionAnnotation.setTypeName(getAST().newSimpleName(Supported.class.getSimpleName()));
					parameterVariable.modifiers().add(conversionAnnotation);
					break;
				case TODO:
					writeImport(ToDo.class);
					conversionAnnotation.setTypeName(getAST().newSimpleName(ToDo.class.getSimpleName()));
					parameterVariable.modifiers().add(conversionAnnotation);
					break;
				case UNSUPPORTED:
					writeImport(Unsupported.class);
					conversionAnnotation.setTypeName(getAST().newSimpleName(Unsupported.class.getSimpleName()));
					parameterVariable.modifiers().add(conversionAnnotation);
					break;
				}
			}

			writeDataDefAnnotation(parameterVariable, dataTerm.getDefinition());

			methodDeclaration.parameters().add(parameterVariable);
		}

		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);
	}

	@SuppressWarnings("unchecked")
	public void writeInit() {

		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName("qInit"));

		MarkerAnnotation entryAnnotation = getAST().newMarkerAnnotation();
		entryAnnotation.setTypeName(getAST().newSimpleName(PostConstruct.class.getSimpleName()));
		writeImport(PostConstruct.class);
		methodDeclaration.modifiers().add(entryAnnotation);

		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);

		// redefined record dataSet
		if (getCompilationUnit().getRoot() instanceof QCallableUnit) {

			// getCompilationUnit().refresh();

			QCallableUnit callableUnit = (QCallableUnit) getCompilationUnit().getRoot();
			if (callableUnit.getFileSection() != null)
				for (QDataSetTerm dataSetTerm : callableUnit.getFileSection().getDataSets()) {

					// remap
					if (dataSetTerm.getFormat() != null) {
						for (QDataTerm<?> element : dataSetTerm.getFormat().getDefinition().getElements()) {
							QRemap remap = element.getFacet(QRemap.class);
							if (remap == null)
								continue;

							MethodInvocation methodInvocation = getAST().newMethodInvocation();
							methodInvocation.setName(getAST().newSimpleName("assign"));

							QDataTerm<?> remapDataTerm = getCompilationUnit().getDataTerm(remap.getName(), true);
							if (remapDataTerm == null)
								throw new IntegratedLanguageExpressionRuntimeException("Invalid term: " + remap);

							if (getCompilationUnit().equalsTermName(element.getName(), remapDataTerm.getName()))
								continue;

							if (remap.getIndex() == null || remap.getIndex().isEmpty())
								methodInvocation.setExpression(buildExpression(getCompilationUnit().getQualifiedName(remapDataTerm)));
							else
								methodInvocation.setExpression(buildExpression(getCompilationUnit().getQualifiedName(remapDataTerm) + ".get(" + Integer.parseInt(remap.getIndex()) + ")"));

							methodInvocation.arguments().add(buildExpression(getCompilationUnit().getQualifiedName(element)));
							ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
							block.statements().add(expressionStatement);

						}
					}
				}
		}

		QRoutine qInzsr = getCompilationUnit().getRoutine("*INZSR", true);
		if (qInzsr != null) {

			if (qInzsr.getParent() == getCompilationUnit().getRoot()) {
				MethodInvocation methodInvocation = getAST().newMethodInvocation();
				methodInvocation.setExpression(getAST().newThisExpression());
				methodInvocation.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(qInzsr.getName())));
				ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
				block.statements().add(expressionStatement);
			} else {
				MethodInvocation methodInvocation = getAST().newMethodInvocation();
				methodInvocation.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(qInzsr.getName())));
				methodInvocation.setExpression(buildExpression(getCompilationUnit().getQualifiedName((QNamedNode) qInzsr.getParent())));
				ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
				block.statements().add(expressionStatement);
			}
		} else {

			qInzsr = getCompilationUnit().getRoutine("£MU_INZSR", true);
			if (qInzsr != null) {

				MethodInvocation methodInvocation = getAST().newMethodInvocation();
				methodInvocation.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(qInzsr.getName())));
				methodInvocation.setExpression(buildExpression(getCompilationUnit().getQualifiedName((QNamedNode) qInzsr.getParent())));
				ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
				block.statements().add(expressionStatement);
			}
		}

		// £INIZI
		QRoutine £inizi = getCompilationUnit().getRoutine("£INIZI", false);
		if (£inizi != null) {
			MethodInvocation methodInvocation = getAST().newMethodInvocation();
			methodInvocation = getAST().newMethodInvocation();
			methodInvocation.setExpression(getAST().newThisExpression());
			methodInvocation.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(£inizi.getName())));
			ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
			block.statements().add(expressionStatement);
		}

	}

	@SuppressWarnings("unchecked")
	public void writeEntry(QParameterList parameterList, String name) {

		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(name));

		MarkerAnnotation entryAnnotation = getAST().newMarkerAnnotation();
		entryAnnotation.setTypeName(getAST().newSimpleName(Entry.class.getSimpleName()));
		writeImport(Entry.class);
		methodDeclaration.modifiers().add(entryAnnotation);

		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		if (parameterList != null)
			for (String parameterName : parameterList.getParameters()) {
				QDataTerm<?> dataTerm = getCompilationUnit().getDataTerm(parameterName, true);

				SingleVariableDeclaration parameterVariable = getAST().newSingleVariableDeclaration();
				parameterVariable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(dataTerm.getName())));
				Type type = getJavaType(dataTerm);
				parameterVariable.setType(type);

				writeDataDefAnnotation(parameterVariable, dataTerm.getDefinition());

				methodDeclaration.parameters().add(parameterVariable);
			}

		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);

		if (parameterList != null)
			for (String parameterName : parameterList.getParameters()) {

				MethodInvocation methodInvocation = getAST().newMethodInvocation();
				methodInvocation.setName(getAST().newSimpleName("assign"));

				methodInvocation.setExpression(getAST().newSimpleName(getCompilationUnit().normalizeTermName(parameterName)));

				QDataTerm<?> dataTerm = getCompilationUnit().getDataTerm(parameterName, true);

				String qualifiedName = getCompilationUnit().getQualifiedName(dataTerm);
				String[] fieldNames = qualifiedName.split("\\.");
				if (fieldNames.length > 1)
					methodInvocation.arguments().add(buildExpression(qualifiedName));
				else {
					FieldAccess targetAccess = getAST().newFieldAccess();
					targetAccess.setExpression(getAST().newThisExpression());

					for (int i = 0; i < fieldNames.length; i++) {

						targetAccess.setName(getAST().newSimpleName(fieldNames[i]));

						if (i < fieldNames.length - 1) {
							FieldAccess childAccess = getAST().newFieldAccess();
							childAccess.setExpression(targetAccess);
							targetAccess = childAccess;

						}
					}
					methodInvocation.arguments().add(targetAccess);
				}

				ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
				block.statements().add(expressionStatement);
			}

		QRoutine routine = getCompilationUnit().getRoutine("*ENTRY", false);
		if (routine != null) {
			JDTStatementWriter statementWriter = getCompilationUnit().getContext().make(JDTStatementWriter.class);
			statementWriter.setAST(getAST());

			statementWriter.getBlocks().push(block);

			if (routine.getMain() instanceof QBlock) {
				QBlock qBlock = (QBlock) routine.getMain();
				for (org.smeup.sys.il.flow.QStatement qStatement : qBlock.getStatements())
					qStatement.accept(statementWriter);
			} else
				routine.getMain().accept(statementWriter);

			statementWriter.getBlocks().pop();
		}

		// this.main
		MethodInvocation mainInvocation = getAST().newMethodInvocation();
		mainInvocation.setExpression(getAST().newThisExpression());
		mainInvocation.setName(getAST().newSimpleName("main"));

		ExpressionStatement mainStatement = getAST().newExpressionStatement(mainInvocation);
		block.statements().add(mainStatement);

		routine = getCompilationUnit().getRoutine("*EXIT", false);
		if (routine != null) {
			JDTStatementWriter statementWriter = getCompilationUnit().getContext().make(JDTStatementWriter.class);
			statementWriter.setAST(getAST());

			statementWriter.getBlocks().push(block);

			if (routine.getMain() instanceof QBlock) {
				QBlock qBlock = (QBlock) routine.getMain();
				for (org.smeup.sys.il.flow.QStatement qStatement : qBlock.getStatements())
					qStatement.accept(statementWriter);
			} else
				routine.getMain().accept(statementWriter);

			statementWriter.getBlocks().pop();
		}

	}

	public void refactCallableUnit(QCallableUnit callableUnit) {

		refactUnit(callableUnit);

		// main
		if (callableUnit.getFlowSection() != null)
			for (QUnit unit : callableUnit.getFlowSection().getRoutines())
				refactUnit(unit);
	}

	protected Expression buildExpression(String expression) {

		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setKind(ASTParser.K_EXPRESSION);

		parser.setSource(expression.toCharArray());
		ASTNode node = parser.createAST(null);
		if (node.getLength() == 0)
			throw new IntegratedLanguageExpressionRuntimeException("Invalid java conversion: " + expression);

		Expression jdtExpression = (Expression) node;

		return (Expression) ASTNode.copySubtree(getAST(), jdtExpression);
	}

	private Expression buildExpression(AST ast, QExpression expression, Class<?> target) {
		return JDTStatementHelper.buildExpression(ast, getCompilationUnit(), expression, target);
	}

	@SuppressWarnings("unchecked")
	public void writeEntry(MethodDeclaration methodDeclaration, QEntry entry) {

		int p = 0;
		for (QEntryParameter<?> entryParameter : entry.getParameters()) {

			QTerm parameterDelegate = entryParameter.getDelegate();

			SingleVariableDeclaration singleVar = getAST().newSingleVariableDeclaration();
			String parameterName = parameterDelegate.getName();
			if (parameterName == null)
				parameterName = "arg" + p;
			singleVar.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(parameterName)));

			if (parameterDelegate instanceof QDataTerm) {
				QDataTerm<?> dataTerm = (QDataTerm<?>) parameterDelegate;

				// primitive
				if (dataTerm.isConstant())
					singleVar.setType(getJavaPrimitive(dataTerm));
				else {
					Type type = getJavaType(dataTerm);
					singleVar.setType(type);
				}
			} else if (parameterDelegate instanceof QDataSetTerm) {

				Type dataSet = getAST().newSimpleType(getAST().newSimpleName(QDataSet.class.getSimpleName()));
				ParameterizedType parType = getAST().newParameterizedType(dataSet);
				parType.typeArguments().add(getAST().newWildcardType());

				singleVar.setType(parType);
			}

			methodDeclaration.parameters().add(singleVar);

			p++;
		}
	}
}