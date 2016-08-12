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
package org.smeup.sys.dk.compiler.rpj.writer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.query.ValueExpressionVariable;
import org.eclipse.datatools.modelbase.sql.query.helper.StatementHelper;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ArrayCreation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Assignment.Operator;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.smeup.sys.db.esql.CursorType;
import org.smeup.sys.db.esql.QCursor;
import org.smeup.sys.db.esql.QCursorTerm;
import org.smeup.sys.db.esql.QStatement;
import org.smeup.sys.db.esql.QStatementTerm;
import org.smeup.sys.db.esql.annotation.CursorDef;
import org.smeup.sys.db.syntax.QQueryParser;
import org.smeup.sys.dk.compiler.DevelopmentKitCompilerRuntimeException;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerLinker;
import org.smeup.sys.dk.compiler.QCompilerManager;
import org.smeup.sys.dk.compiler.QDevelopmentKitCompilerFactory;
import org.smeup.sys.dk.compiler.UnitScope;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitInfo;
import org.smeup.sys.dk.compiler.rpj.RPJContextHelper;
import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.dk.core.annotation.Unsupported;
import org.smeup.sys.il.core.term.QTerm;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Open;
import org.smeup.sys.il.data.annotation.Optional;
import org.smeup.sys.il.data.annotation.PostMain;
import org.smeup.sys.il.data.annotation.PreMain;
import org.smeup.sys.il.data.annotation.Snap;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QRemap;
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
import org.smeup.sys.il.esam.QSMDataSet;
import org.smeup.sys.il.esam.annotation.FileDef;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QTermExpression;
import org.smeup.sys.il.flow.QBlock;
import org.smeup.sys.il.flow.QCallableUnit;
import org.smeup.sys.il.flow.QConversion;
import org.smeup.sys.il.flow.QDataSection;
import org.smeup.sys.il.flow.QEntry;
import org.smeup.sys.il.flow.QEntryParameter;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowFactory;
import org.smeup.sys.il.flow.QMethodExec;
import org.smeup.sys.il.flow.QModule;
import org.smeup.sys.il.flow.QParameterList;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.il.flow.QRoutine;
import org.smeup.sys.il.flow.QUnit;
import org.smeup.sys.os.file.QExternalFile;

public abstract class JDTCallableUnitWriter extends JDTUnitWriter {

	private QExpressionParser expressionParser;
	private QQueryParser queryParser;
	
	public JDTCallableUnitWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name, UnitScope scope) {
		super(root, compilationUnit, compilationSetup, name, scope);

		expressionParser = getCompilationUnit().getContext().get(QExpressionParser.class);
		queryParser = getCompilationUnit().getContext().get(QQueryParser.class);
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
			constantDeclaration.setName(getAST().newSimpleName(getCompilationUnit().normalizeLabelName(label)));

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
	public void writeModuleFields(List<String> modules, UnitScope scope) {

		for (String module : modules) {

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);

			// writeAnnotation(field, ModuleDef.class, "name", moduleName);
			writeAnnotation(field, Inject.class);
			// writeAnnotation(field, Named.class, "value", moduleName);

			// TODO remove me
			if ((module.equalsIgnoreCase("£MUB") || module.equalsIgnoreCase("£MDV")) && !(getCompilationUnit().getNode() instanceof QProcedure))
				field.modifiers().add(getAST().newModifier(ModifierKeyword.PROTECTED_KEYWORD));
			else {
				switch (scope) {
				case FRIENDLY:
					break;
				case PRIVATE:
					field.modifiers().add(getAST().newModifier(ModifierKeyword.PRIVATE_KEYWORD));
					break;
				case PROTECTED:
					field.modifiers().add(getAST().newModifier(ModifierKeyword.PROTECTED_KEYWORD));
					break;
				case PUBLIC:
					field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
					break;
				}
			}
			String moduleName = getCompilationUnit().normalizeTypeName(module);
			field.setType(getAST().newSimpleType(getAST().newName(moduleName)));

			variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeModuleName(module)));

			getTarget().bodyDeclarations().add(field);
		}

	}

	public void writeDataFields(QDataSection dataSection, UnitScope scope) {

		List<String> fields = new ArrayList<String>();
		// fields
		for (QDataTerm<?> dataTerm : dataSection.getDatas()) {

			if (dataTerm.getDefinition() == null)
				continue;

			dataTerm = getCompilationUnit().getDataTerm(dataTerm.getName(), false);

			if (fields.contains(getCompilationUnit().normalizeTermName(dataTerm.getName())))
				continue;

			writeField(dataTerm, false, scope);

			fields.add(getCompilationUnit().normalizeTermName(dataTerm.getName()));
		}

	}

	@SuppressWarnings("unchecked")
	public void writeDataSets(List<QDataSetTerm> dataSets) throws IOException {

		writeImport(QDataSet.class);

		for (QDataSetTerm dataSetTerm : dataSets) {

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);

			String className = null;

			if (dataSetTerm.isKeyedAccess()) {
				writeImport(QKSDataSet.class);
				className = QKSDataSet.class.getSimpleName();
			} else {
				if (dataSetTerm.getFacet(QExternalFile.class) != null) {
					writeImport(QRRDataSet.class);
					className = QRRDataSet.class.getSimpleName();
				} else {
					writeImport(QSMDataSet.class);
					className = QSMDataSet.class.getSimpleName();
				}
			}

			Type dataSetType = getAST().newSimpleType(getAST().newSimpleName(className));
			ParameterizedType parType = getAST().newParameterizedType(dataSetType);

			QCompilerLinker compilerLinker = dataSetTerm.getFacet(QCompilerLinker.class);
			if (compilerLinker != null) {
				writeImport(compilerLinker.getLinkedClass());
				parType.typeArguments().add(getAST().newSimpleType(getAST().newName(compilerLinker.getLinkedClass().getSimpleName())));
			} else {
				String argument = dataSetTerm.getFormatName();
				if (argument == null)
					argument = dataSetTerm.getName();

				parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));
			}

			if (!((SimpleType) parType.typeArguments().get(0)).getName().toString().equals(dataSetTerm.getName()))
				writeAnnotation(field, FileDef.class, "name", dataSetTerm.getName());

			EObject eDataSet = (EObject) dataSetTerm;

			if (eDataSet.eIsSet(QIntegratedLanguageEsamPackage.eINSTANCE.getFileTerm_UserOpen()))
				writeAnnotation(field, FileDef.class, "userOpen", dataSetTerm.isUserOpen());

			if (eDataSet.eIsSet(QIntegratedLanguageEsamPackage.eINSTANCE.getFileTerm_InfoStruct()))
				writeAnnotation(field, FileDef.class, "info", getCompilationUnit().normalizeTermName(dataSetTerm.getInfoStruct()));

			if (eDataSet.eIsSet(QIntegratedLanguageEsamPackage.eINSTANCE.getDataSetTerm_Prefix()))
				writeAnnotation(field, FileDef.class, "prefix", dataSetTerm.getPrefix());

			if (eDataSet.eIsSet(QIntegratedLanguageEsamPackage.eINSTANCE.getDataSetTerm_ExternalFile())) {
				QDataTerm<?> externalFileTerm = getCompilationUnit().getDataTerm(dataSetTerm.getExternalFile(), true);
				writeAnnotation(field, FileDef.class, "externalFile", getCompilationUnit().getQualifiedName(externalFileTerm));
			}

			if (eDataSet.eIsSet(QIntegratedLanguageEsamPackage.eINSTANCE.getDataSetTerm_ExternalMember())) {
				QDataTerm<?> externalFileMember = getCompilationUnit().getDataTerm(dataSetTerm.getExternalMember(), true);
				writeAnnotation(field, FileDef.class, "externalMember", getCompilationUnit().getQualifiedName(externalFileMember));
			}

			if (getCompilationUnit().getNode() instanceof QModule)
				field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
			else
				field.modifiers().add(getAST().newModifier(ModifierKeyword.PROTECTED_KEYWORD));

			field.modifiers().add(getAST().newModifier(ModifierKeyword.TRANSIENT_KEYWORD));

			field.setType(parType);
			if (dataSetTerm.getFormatName() != null)
				variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(dataSetTerm.getFormatName())));
			else
				variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(dataSetTerm.getName())));

			getTarget().bodyDeclarations().add(field);

			// internal file definition
			if (compilerLinker == null && dataSetTerm.getFormat() != null) {
				if (dataSetTerm.getFormatName() != null)
					writeInnerRecord(dataSetTerm.getFormatName(), dataSetTerm.getFormat().getDefinition());
				else
					writeInnerRecord(dataSetTerm.getName(), dataSetTerm.getFormat().getDefinition());
			}
		}

	}

	public void writeKeyLists(List<QKeyListTerm> keyLists) {

		writeImport(QBufferedData.class);

		for (QKeyListTerm keyList : keyLists)
			if (!RPJContextHelper.containsArray(expressionParser, keyList))
				writeKeyList(keyList);
	}

	@SuppressWarnings("unchecked")
	public void writeKeyList(QKeyListTerm keyList) {

		VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
		variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(keyList.getName())));
		FieldDeclaration field = getAST().newFieldDeclaration(variable);
		field.modifiers().add(getAST().newModifier(ModifierKeyword.PRIVATE_KEYWORD));

		Type bufferedType = getAST().newSimpleType(getAST().newSimpleName(QBufferedData.class.getSimpleName()));
		field.setType(getAST().newArrayType(bufferedType));

		// array of bufferedData
		ArrayCreation arrayCreation = getAST().newArrayCreation();
		arrayCreation.setType(getAST().newArrayType(getAST().newSimpleType(getAST().newSimpleName(QBufferedData.class.getSimpleName()))));

		ArrayInitializer arrayInitializer = getAST().newArrayInitializer();
		for (String keyField : keyList.getKeyFields()) {

			QExpression expression = expressionParser.parseExpression(keyField);
			Expression jdtExpression = JDTStatementHelper.buildExpression(getAST(), getCompilationUnit(), expression, null);
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

			writeAnnotation(field, CursorDef.class, "type", cursorTerm.getCursorType());
			if (cursorTerm.isHold())
				writeAnnotation(field, CursorDef.class, "hold", cursorTerm.isHold());
			if (cursorTerm.getStatementName() != null)
				writeAnnotation(field, CursorDef.class, "statement", getCompilationUnit().normalizeTermName(cursorTerm.getStatementName()));
			if (cursorTerm.getSql() != null)
				writeAnnotation(field, CursorDef.class, "query", cursorTerm.getSql());

			field.modifiers().add(getAST().newModifier(ModifierKeyword.PROTECTED_KEYWORD));

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
			field.modifiers().add(getAST().newModifier(ModifierKeyword.PROTECTED_KEYWORD));

			Type dataSetType = getAST().newSimpleType(getAST().newSimpleName(QStatement.class.getSimpleName()));
			field.setType(dataSetType);
			variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(statementTerm.getName())));
			getTarget().bodyDeclarations().add(field);
		}

	}

	@SuppressWarnings("unchecked")
	public void writeDisplays(List<QDisplayTerm> displays) throws IOException {

		writeImport(QDisplay.class);

		for (QDisplayTerm displayTerm : displays) {

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);

			String className = null;
			QCompilerLinker compilerLinker = displayTerm.getFacet(QCompilerLinker.class);

			writeImport(QDisplay.class);
			className = QDisplay.class.getSimpleName();

			Type displayType = getAST().newSimpleType(getAST().newSimpleName(className));
			ParameterizedType parType = getAST().newParameterizedType(displayType);

			if (compilerLinker != null) {
				writeImport(compilerLinker.getLinkedClass());
				parType.typeArguments().add(getAST().newSimpleType(getAST().newName(compilerLinker.getLinkedClass().getSimpleName())));
			} else {
				String argument = displayTerm.getName();
				parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));
			}

			if (!((SimpleType) parType.typeArguments().get(0)).getName().toString().equals(displayTerm.getName()))
				writeAnnotation(field, FileDef.class, "name", displayTerm.getName());

			EObject eDataSet = (EObject) displayTerm;
			if (eDataSet.eIsSet(QIntegratedLanguageEsamPackage.eINSTANCE.getFileTerm_UserOpen()))
				writeAnnotation(field, FileDef.class, "userOpen", displayTerm.isUserOpen());

			if (eDataSet.eIsSet(QIntegratedLanguageEsamPackage.eINSTANCE.getFileTerm_InfoStruct()))
				writeAnnotation(field, FileDef.class, "info", getCompilationUnit().normalizeTermName(displayTerm.getInfoStruct()));

			if (getCompilationUnit().getNode() instanceof QModule)
				field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
			else
				field.modifiers().add(getAST().newModifier(ModifierKeyword.PROTECTED_KEYWORD));

			field.modifiers().add(getAST().newModifier(ModifierKeyword.TRANSIENT_KEYWORD));

			field.setType(parType);
			variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(displayTerm.getName())));

			getTarget().bodyDeclarations().add(field);

		}

	}

	@SuppressWarnings("unchecked")
	public void writePrinters(List<QPrintTerm> printers) throws IOException {

		writeImport(QPrint.class);

		for (QPrintTerm printTerm : printers) {

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);

			String className = null;
			QCompilerLinker compilerLinker = printTerm.getFacet(QCompilerLinker.class);

			writeImport(QPrint.class);
			className = QPrint.class.getSimpleName();

			Type printerType = getAST().newSimpleType(getAST().newSimpleName(className));
			ParameterizedType parType = getAST().newParameterizedType(printerType);

			if (compilerLinker != null) {
				writeImport(compilerLinker.getLinkedClass());
				parType.typeArguments().add(getAST().newSimpleType(getAST().newName(compilerLinker.getLinkedClass().getSimpleName())));
			} else {
//				String argument = printTerm.getName();
				String argument = "PRT198";
				parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));
			}

			if (!((SimpleType) parType.typeArguments().get(0)).getName().toString().equals(printTerm.getName()))
				writeAnnotation(field, FileDef.class, "name", printTerm.getName());

			EObject eDataSet = (EObject) printTerm;
			if (eDataSet.eIsSet(QIntegratedLanguageEsamPackage.eINSTANCE.getFileTerm_UserOpen()))
				writeAnnotation(field, FileDef.class, "userOpen", printTerm.isUserOpen());

			if (eDataSet.eIsSet(QIntegratedLanguageEsamPackage.eINSTANCE.getFileTerm_InfoStruct()))
				writeAnnotation(field, FileDef.class, "info", getCompilationUnit().normalizeTermName(printTerm.getInfoStruct()));

			if (getCompilationUnit().getNode() instanceof QModule)
				field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
			else
				field.modifiers().add(getAST().newModifier(ModifierKeyword.PROTECTED_KEYWORD));

			field.modifiers().add(getAST().newModifier(ModifierKeyword.TRANSIENT_KEYWORD));
			
			field.setType(parType);
			variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(printTerm.getName())));

			getTarget().bodyDeclarations().add(field);

		}
	}

	public void writeRoutines(QCallableUnit callableUnit, RPJCallableUnitInfo callableUnitInfo) {

		// special routines
		if (callableUnit.getFlowSection() != null)
			for (QRoutine routine : callableUnit.getFlowSection().getRoutines()) {
				if (!routine.getName().startsWith("*"))
					continue;
				writeRoutine(routine);
			}

		// main
		if (callableUnit.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("*MAIN");
			routine.setMain(callableUnit.getMain());
			writeRoutine(routine);
		}

		// snap
		if (!callableUnitInfo.getResetObjects().isEmpty())
			writeSnapRoutine(callableUnit, callableUnitInfo);

		// routines
		if (callableUnit.getFlowSection() != null)
			for (QRoutine routine : callableUnit.getFlowSection().getRoutines()) {
				if (routine.getName().startsWith("*"))
					continue;
				writeRoutine(routine);
			}
	}

	public void writeSnapRoutine(QCallableUnit callableUnit, RPJCallableUnitInfo callableUnitInfo) {

		QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
		routine.setName("*SNAP");
		routine.setMain(callableUnit.getMain());

		QBlock block = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();
		routine.setMain(block);
		for (String object : callableUnitInfo.getResetObjects()) {
			QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
			methodExec.setObject(object);
			methodExec.setMethod("snap");
			block.getStatements().add(methodExec);
		}

		writeRoutine(routine);
	}

	@SuppressWarnings("unchecked")
	public MethodDeclaration writeRoutine(QRoutine routine) {

		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();

		String routineName = getCompilationUnit().normalizeRoutineName(routine.getName());
		if (routine.getName().equals("*INZSR")) {
			routineName = "_open";
			MarkerAnnotation openAnnotation = getAST().newMarkerAnnotation();
			openAnnotation.setTypeName(getAST().newSimpleName(Open.class.getSimpleName()));
			writeImport(Open.class);
			methodDeclaration.modifiers().add(openAnnotation);
		} else if (routine.getName().equals("*ENTRY")) {
			routineName = "_entry";
			MarkerAnnotation preMainAnnotation = getAST().newMarkerAnnotation();
			preMainAnnotation.setTypeName(getAST().newSimpleName(PreMain.class.getSimpleName()));
			writeImport(PreMain.class);
			methodDeclaration.modifiers().add(preMainAnnotation);
		} else if (routine.getName().equals("*MAIN")) {
			routineName = "_main";
			MarkerAnnotation mainAnnotation = getAST().newMarkerAnnotation();
			mainAnnotation.setTypeName(getAST().newSimpleName(Main.class.getSimpleName()));
			writeImport(Main.class);
			methodDeclaration.modifiers().add(mainAnnotation);
		} else if (routine.getName().equals("*SNAP")) {
			routineName = "_snap";
			MarkerAnnotation mainAnnotation = getAST().newMarkerAnnotation();
			mainAnnotation.setTypeName(getAST().newSimpleName(Snap.class.getSimpleName()));
			writeImport(Snap.class);
			methodDeclaration.modifiers().add(mainAnnotation);
		} else if (routine.getName().equals("*EXIT")) {
			routineName = "_exit";
			MarkerAnnotation postMainAnnotation = getAST().newMarkerAnnotation();
			postMainAnnotation.setTypeName(getAST().newSimpleName(PostMain.class.getSimpleName()));
			writeImport(PostMain.class);
			methodDeclaration.modifiers().add(postMainAnnotation);
		}

		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(routineName));
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

		// TODO QExternalProgram
		QExternalFile externalFile = prototype.getFacet(QExternalFile.class);
		if (externalFile != null) {
			writePrototypeCall(prototype, externalFile.getName(), methodDeclaration, block);

			if (prototype.getDefinition() != null) {
				ReturnStatement returnStatement = getAST().newReturnStatement();
				returnStatement.setExpression(getAST().newNullLiteral());
				block.statements().add(returnStatement);
			}

		} else {
			QProcedure procedure = getCompilationUnit().getProcedure(prototype.getName(), false);
			if (procedure == null)
				throw new DevelopmentKitCompilerRuntimeException("Invalid procedure bind: " + prototype);

			if (procedure.getEntry() != null)
				writeEntry(methodDeclaration, procedure.getEntry());

			writeLazyLoading(procedure, block);

			writeSetEntryParams(procedure, block);

			String namePrototype = getCompilationUnit().normalizeTermName(prototype.getName());
			MethodInvocation methodInvocation = getAST().newMethodInvocation();
			methodInvocation.setExpression(getAST().newName(namePrototype));
			methodInvocation.setName(getAST().newSimpleName("qExec"));

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
		}
	}

	@SuppressWarnings("unchecked")
	private void writePrototypeCall(QPrototype prototype, String programName, MethodDeclaration methodDeclaration, Block block) {

		MethodInvocation methodInvocation = getAST().newMethodInvocation();
		methodInvocation.setExpression(getAST().newSimpleName("qRPJ"));
		methodInvocation.setName(getAST().newSimpleName("qCall"));

		// program name
		QTermExpression expression = expressionParser.parseTerm(programName);
		Expression jdtExpression = JDTStatementHelper.buildExpression(getAST(), getCompilationUnit(), expression, String.class);
		methodInvocation.arguments().add(jdtExpression);

		// array of parameter
		ArrayInitializer arrayInitializer = getAST().newArrayInitializer();
		if (prototype.getEntry() != null) {
			writeEntry(methodDeclaration, prototype.getEntry());

			for (QEntryParameter<?> entryParameter : prototype.getEntry().getParameters()) {

				if (!(entryParameter.getDelegate() instanceof QDataTerm<?>))
					throw new DevelopmentKitCompilerRuntimeException("Invalid parameter: " + entryParameter);

				QDataTerm<?> parameterDelegate = (QDataTerm<?>) entryParameter.getDelegate();
				String parameterName = parameterDelegate.getName();
				parameterName = getCompilationUnit().normalizeTermName(parameterName);

				// call parameter
				if (parameterDelegate.isConstant() && !parameterDelegate.getDataTermType().isMultiple()) {
					ASTParser parser = ASTParser.newParser(AST.JLS8);
					parser.setKind(ASTParser.K_EXPRESSION);
					parser.setSource(("qRPJ.qBox(" + parameterName + ")").toCharArray());
					ASTNode node = parser.createAST(null);
					arrayInitializer.expressions().add((Expression) ASTNode.copySubtree(getAST(), (Expression) node));
				} else
					arrayInitializer.expressions().add(getAST().newName(parameterName));
			}
		}

		ArrayCreation arrayCreation = getAST().newArrayCreation();
		arrayCreation.setType(getAST().newArrayType(getAST().newSimpleType(getAST().newSimpleName(QData.class.getSimpleName()))));
		arrayCreation.setInitializer(arrayInitializer);
		methodInvocation.arguments().add(arrayCreation);

		ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);
	}

	@SuppressWarnings("unchecked")
	private void writeLazyLoading(QProcedure procedure, Block block) {

		IfStatement ifStatement = getAST().newIfStatement();
		String expression = getCompilationUnit().normalizeTermName(procedure.getName()) + " == null";
		ifStatement.setExpression(buildExpression(expression));

		Assignment assignment = getAST().newAssignment();
		assignment.setLeftHandSide(buildExpression(getCompilationUnit().normalizeTermName(procedure.getName())));
		assignment.setRightHandSide(buildExpression("qRPJ.bindProcedure(this, " + getCompilationUnit().normalizeTypeName(procedure.getName()) + ".class)"));
		assignment.setOperator(Operator.ASSIGN);
		ifStatement.setThenStatement(getAST().newExpressionStatement(assignment));

		block.statements().add(ifStatement);
	}

	@SuppressWarnings("unchecked")
	private void writeSetEntryParams(QProcedure procedure, Block block) {
		List<QEntryParameter<?>> entryParameters = new ArrayList<QEntryParameter<?>>();
		if (procedure.getEntry() != null) {
			entryParameters.addAll(procedure.getEntry().getParameters());
			Collections.reverse(entryParameters);
		}

		int p = entryParameters.size();

		IfStatement baseIf = null;
		IfStatement lastIf = null;
		for (QEntryParameter<?> entryParameter : entryParameters) {

			if (!entryParameter.isNullable())
				break;

			// first
			if (entryParameters.size() == p) {

				IfStatement ifStatement = getAST().newIfStatement();
				ifStatement.setExpression(buildExpression(getCompilationUnit().normalizeTermName(entryParameter.getName()) + " != null"));
				Expression expression = buildExpression(getCompilationUnit().normalizeTermName(procedure.getName()) + ".qPRO.qParms().eval(" + p + ")");
				ExpressionStatement expressionStatement = getAST().newExpressionStatement(expression);
				ifStatement.setThenStatement(expressionStatement);

				Expression expressionElse = buildExpression(getCompilationUnit().normalizeTermName(procedure.getName()) + ".qPRO.qParms().eval(" + (p - 1) + ")");
				ExpressionStatement expressionElseStatement = getAST().newExpressionStatement(expressionElse);
				ifStatement.setElseStatement(expressionElseStatement);

				baseIf = ifStatement;
				lastIf = ifStatement;
			} else {
				IfStatement ifStatement = getAST().newIfStatement();
				ifStatement.setExpression(buildExpression(getCompilationUnit().normalizeTermName(entryParameter.getName()) + " != null"));

				Expression expression = buildExpression(getCompilationUnit().normalizeTermName(procedure.getName()) + ".qPRO.qParms().eval(" + p + ")");
				ExpressionStatement expressionStatement = getAST().newExpressionStatement(expression);
				ifStatement.setThenStatement(expressionStatement);

				Expression expressionElse = buildExpression(getCompilationUnit().normalizeTermName(procedure.getName()) + ".qPRO.qParms().eval(" + (p - 1) + ")");
				ExpressionStatement expressionElseStatement = getAST().newExpressionStatement(expressionElse);
				ifStatement.setElseStatement(expressionElseStatement);

				lastIf.setElseStatement(ifStatement);
				lastIf = ifStatement;
			}
			p--;
		}

		if (baseIf != null)
			block.statements().add(baseIf);
	}

	public void writeInnerProcedure(QProcedure procedure) {

		QCompilerManager compilerManager = getCompilationUnit().getContext().get(QCompilerManager.class);
		QCompilationUnit procedureCompilationUnit = compilerManager.createChildCompilationUnit(getCompilationUnit(), procedure);
		QCompilationSetup compilationSetup = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilationSetup();

		try {

			boolean static_ = false;
			UnitScope scope = UnitScope.PROTECTED;

			switch (getCompilationSetup().getProcedureType()) {
			case INNER:
				break;
			case NESTED:
				static_ = true;
				scope = UnitScope.PUBLIC;
				break;
			}

			JDTProcedureWriter procedureWriter = new JDTProcedureWriter(this, procedureCompilationUnit, compilationSetup, getCompilationUnit().normalizeTermName(procedure.getName()), scope,
					static_);

			procedureWriter.writeProcedure(procedure);
		} catch (IOException e) {
			throw new DevelopmentKitCompilerRuntimeException("Invalid procedure: " + procedure, e);
		} finally {
			procedureCompilationUnit.close();
		}
	}

	@SuppressWarnings("unchecked")
	public void writeMain(QParameterList parameterList, String name) {

		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		MarkerAnnotation entryAnnotation = getAST().newMarkerAnnotation();
		entryAnnotation.setTypeName(getAST().newSimpleName(Main.class.getSimpleName()));
		writeImport(Main.class);
		methodDeclaration.modifiers().add(entryAnnotation);

		methodDeclaration.setName(getAST().newSimpleName(name));
		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

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

		methodDeclaration.setName(getAST().newSimpleName("_init"));

		MarkerAnnotation entryAnnotation = getAST().newMarkerAnnotation();
		entryAnnotation.setTypeName(getAST().newSimpleName(PostConstruct.class.getSimpleName()));
		writeImport(PostConstruct.class);
		methodDeclaration.modifiers().add(entryAnnotation);

		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		if (!(getCompilationUnit().getNode() instanceof QCallableUnit)) 
			return;

		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);

		QCallableUnit callableUnit = (QCallableUnit) getCompilationUnit().getNode();
		if (callableUnit.getFileSection() != null) {
			
			// redefined record dataSet
			for (QDataSetTerm dataSetTerm : callableUnit.getFileSection().getDataSets()) {

				// remap
				if (dataSetTerm.getFormat() != null) {
					for (QDataTerm<?> element : dataSetTerm.getFormat().getDefinition().getElements()) {
						QRemap remap = element.getFacet(QRemap.class);
						if (remap == null)
							continue;

						QDataTerm<?> remapDataTerm = getCompilationUnit().getDataTerm(remap.getName(), true);
						if (remapDataTerm == null)
							throw new IntegratedLanguageExpressionRuntimeException("Invalid term: " + remap);

						if (getCompilationUnit().equalsTermName(element.getName(), remapDataTerm.getName()))
							continue;

						MethodInvocation methodInvocation = getAST().newMethodInvocation();
						methodInvocation.setName(getAST().newSimpleName("assign"));

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
			
			// assign statement parameters
			for(QCursorTerm cursorTerm: callableUnit.getFileSection().getCursors()) {
				if(cursorTerm.getSql() == null)
					continue;
				
				try {
					List<ValueExpressionVariable> parameters = StatementHelper.getAllVariablesInQueryStatement(queryParser.parseQuery(cursorTerm.getSql()).getQueryStatement());
					
					// array of bufferedData
					ArrayCreation arrayCreation = getAST().newArrayCreation();
					arrayCreation.setType(getAST().newArrayType(getAST().newSimpleType(getAST().newSimpleName(QBufferedData.class.getSimpleName()))));

					ArrayInitializer arrayInitializer = getAST().newArrayInitializer();
					
					for(ValueExpressionVariable parameter: parameters) {
						QExpression expression = expressionParser.parseExpression(getCompilationUnit().normalizeTermName(parameter.getName()));
						Expression jdtExpression = JDTStatementHelper.buildExpression(getAST(), getCompilationUnit(), expression, null);
						arrayInitializer.expressions().add(jdtExpression);

					}

					arrayCreation.setInitializer(arrayInitializer);
					
				} catch (SQLException e) {
					throw new DevelopmentKitCompilerRuntimeException("Invalid statement: " + cursorTerm);
				}
			}
		}
		
		if (!methodDeclaration.getBody().statements().isEmpty())
			getTarget().bodyDeclarations().add(methodDeclaration);
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
		Type returnType = getAST().newArrayType(getAST().newSimpleType(getAST().newSimpleName(QData.class.getSimpleName())));
		methodDeclaration.setReturnType2(returnType);

		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);

		ArrayCreation arrayCreation = getAST().newArrayCreation();
		arrayCreation.setType(getAST().newArrayType(getAST().newSimpleType(getAST().newSimpleName(QData.class.getSimpleName()))));

		ArrayInitializer arrayInitializer = getAST().newArrayInitializer();
		arrayCreation.setInitializer(arrayInitializer);
		for (String parameterName : parameterList.getParameters()) {
			QExpression expression = expressionParser.parseExpression(parameterName);
			Expression jdtExpression = JDTStatementHelper.buildExpression(getAST(), getCompilationUnit(), expression, null);
			arrayInitializer.expressions().add(jdtExpression);
		}

		ReturnStatement returnStatement = getAST().newReturnStatement();
		returnStatement.setExpression(arrayCreation);
		block.statements().add(returnStatement);
	}

	public void refactCallableUnit(QCallableUnit callableUnit) {

		refactUnit(callableUnit);

		// main
		if (callableUnit.getFlowSection() != null) {
			for (QUnit routine : callableUnit.getFlowSection().getRoutines())
				refactUnit(routine);
		}
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

	@SuppressWarnings("unchecked")
	public void writeEntry(MethodDeclaration methodDeclaration, QEntry entry) {

		int p = 0;
		for (QEntryParameter<?> entryParameter : entry.getParameters()) {

			QTerm parameterDelegate = entryParameter.getDelegate();

			SingleVariableDeclaration singleVar = getAST().newSingleVariableDeclaration();

			if (entryParameter.isNullable())
				writeAnnotation(singleVar, Optional.class);

			String parameterName = parameterDelegate.getName();
			if (parameterName == null)
				parameterName = "arg" + p;
			singleVar.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(parameterName)));

			if (parameterDelegate instanceof QDataTerm) {
				QDataTerm<?> dataTerm = (QDataTerm<?>) parameterDelegate;

				// primitive
				if (dataTerm.isConstant() && !dataTerm.getDataTermType().isMultiple())
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

	protected void loadModules(Collection<String> modules, String module, boolean recursive) {

		addModule(modules, module);

		QModule qModule = getCompilationUnit().getModule(module, true);
		for (String moduleName : qModule.getSetupSection().getModules()) {
			if (recursive)
				loadModules(modules, moduleName, recursive);
			else
				addModule(modules, module);
		}
	}

	private void addModule(Collection<String> modules, String module) {

		if (!modules.contains(module))
			modules.add(module);
	}
}