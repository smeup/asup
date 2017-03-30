/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.il.core.term.QTerm;
import org.smeup.sys.il.flow.*;
import org.smeup.sys.il.flow.ConversionStatus;
import org.smeup.sys.il.flow.EvalOperator;
import org.smeup.sys.il.flow.PassingType;
import org.smeup.sys.il.flow.QAnnotationCommand;
import org.smeup.sys.il.flow.QAnnotationScope;
import org.smeup.sys.il.flow.QAnnotationTest;
import org.smeup.sys.il.flow.QBlock;
import org.smeup.sys.il.flow.QBreak;
import org.smeup.sys.il.flow.QCall;
import org.smeup.sys.il.flow.QCommandExec;
import org.smeup.sys.il.flow.QContinue;
import org.smeup.sys.il.flow.QConversion;
import org.smeup.sys.il.flow.QDataSection;
import org.smeup.sys.il.flow.QEntry;
import org.smeup.sys.il.flow.QEntryParameter;
import org.smeup.sys.il.flow.QEval;
import org.smeup.sys.il.flow.QFileSection;
import org.smeup.sys.il.flow.QFlowData;
import org.smeup.sys.il.flow.QFlowSection;
import org.smeup.sys.il.flow.QFor;
import org.smeup.sys.il.flow.QIf;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowFactory;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage;
import org.smeup.sys.il.flow.QJump;
import org.smeup.sys.il.flow.QLabel;
import org.smeup.sys.il.flow.QMethodExec;
import org.smeup.sys.il.flow.QModule;
import org.smeup.sys.il.flow.QMonitor;
import org.smeup.sys.il.flow.QOnError;
import org.smeup.sys.il.flow.QParameterList;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QProcedureExec;
import org.smeup.sys.il.flow.QProgram;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.il.flow.QReturn;
import org.smeup.sys.il.flow.QRoutine;
import org.smeup.sys.il.flow.QRoutineExec;
import org.smeup.sys.il.flow.QSQLExec;
import org.smeup.sys.il.flow.QSetupSection;
import org.smeup.sys.il.flow.QUntil;
import org.smeup.sys.il.flow.QWhile;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class IntegratedLanguageFlowFactoryImpl extends EFactoryImpl implements QIntegratedLanguageFlowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QIntegratedLanguageFlowFactory init() {
		try {
			QIntegratedLanguageFlowFactory theIntegratedLanguageFlowFactory = (QIntegratedLanguageFlowFactory)EPackage.Registry.INSTANCE.getEFactory(QIntegratedLanguageFlowPackage.eNS_URI);
			if (theIntegratedLanguageFlowFactory != null) {
				return theIntegratedLanguageFlowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageFlowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public IntegratedLanguageFlowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QIntegratedLanguageFlowPackage.ANNOTATION_COMMAND: return (EObject)createAnnotationCommand();
			case QIntegratedLanguageFlowPackage.ANNOTATION_SCOPE: return (EObject)createAnnotationScope();
			case QIntegratedLanguageFlowPackage.ANNOTATION_TEST: return (EObject)createAnnotationTest();
			case QIntegratedLanguageFlowPackage.BLOCK: return (EObject)createBlock();
			case QIntegratedLanguageFlowPackage.BREAK: return (EObject)createBreak();
			case QIntegratedLanguageFlowPackage.CALL: return (EObject)createCall();
			case QIntegratedLanguageFlowPackage.COMMAND_EXEC: return (EObject)createCommandExec();
			case QIntegratedLanguageFlowPackage.CONTINUE: return (EObject)createContinue();
			case QIntegratedLanguageFlowPackage.CONVERSION: return (EObject)createConversion();
			case QIntegratedLanguageFlowPackage.DATA_SECTION: return (EObject)createDataSection();
			case QIntegratedLanguageFlowPackage.ENTRY: return (EObject)createEntry();
			case QIntegratedLanguageFlowPackage.ENTRY_PARAMETER: return (EObject)createEntryParameter();
			case QIntegratedLanguageFlowPackage.EVAL: return (EObject)createEval();
			case QIntegratedLanguageFlowPackage.FILE_SECTION: return (EObject)createFileSection();
			case QIntegratedLanguageFlowPackage.FLOW_DATA: return (EObject)createFlowData();
			case QIntegratedLanguageFlowPackage.FLOW_SECTION: return (EObject)createFlowSection();
			case QIntegratedLanguageFlowPackage.FOR: return (EObject)createFor();
			case QIntegratedLanguageFlowPackage.IF: return (EObject)createIf();
			case QIntegratedLanguageFlowPackage.JUMP: return (EObject)createJump();
			case QIntegratedLanguageFlowPackage.LABEL: return (EObject)createLabel();
			case QIntegratedLanguageFlowPackage.METHOD_EXEC: return (EObject)createMethodExec();
			case QIntegratedLanguageFlowPackage.MODULE: return (EObject)createModule();
			case QIntegratedLanguageFlowPackage.MONITOR: return (EObject)createMonitor();
			case QIntegratedLanguageFlowPackage.ON_ERROR: return (EObject)createOnError();
			case QIntegratedLanguageFlowPackage.PARAMETER_LIST: return (EObject)createParameterList();
			case QIntegratedLanguageFlowPackage.PROCEDURE: return (EObject)createProcedure();
			case QIntegratedLanguageFlowPackage.PROCEDURE_EXEC: return (EObject)createProcedureExec();
			case QIntegratedLanguageFlowPackage.PROGRAM: return (EObject)createProgram();
			case QIntegratedLanguageFlowPackage.PROTOTYPE: return (EObject)createPrototype();
			case QIntegratedLanguageFlowPackage.RETURN: return (EObject)createReturn();
			case QIntegratedLanguageFlowPackage.ROUTINE: return (EObject)createRoutine();
			case QIntegratedLanguageFlowPackage.ROUTINE_EXEC: return (EObject)createRoutineExec();
			case QIntegratedLanguageFlowPackage.SETUP_SECTION: return (EObject)createSetupSection();
			case QIntegratedLanguageFlowPackage.SQL_EXEC: return (EObject)createSQLExec();
			case QIntegratedLanguageFlowPackage.UNTIL: return (EObject)createUntil();
			case QIntegratedLanguageFlowPackage.WHILE: return (EObject)createWhile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QIntegratedLanguageFlowPackage.CONVERSION_STATUS:
				return createConversionStatusFromString(eDataType, initialValue);
			case QIntegratedLanguageFlowPackage.EVAL_OPERATOR:
				return createEvalOperatorFromString(eDataType, initialValue);
			case QIntegratedLanguageFlowPackage.PASSING_TYPE:
				return createPassingTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QIntegratedLanguageFlowPackage.CONVERSION_STATUS:
				return convertConversionStatusToString(eDataType, instanceValue);
			case QIntegratedLanguageFlowPackage.EVAL_OPERATOR:
				return convertEvalOperatorToString(eDataType, instanceValue);
			case QIntegratedLanguageFlowPackage.PASSING_TYPE:
				return convertPassingTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QAnnotationCommand createAnnotationCommand() {
		AnnotationCommandImpl annotationCommand = new AnnotationCommandImpl();
		return annotationCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAnnotationScope createAnnotationScope() {
		AnnotationScopeImpl annotationScope = new AnnotationScopeImpl();
		return annotationScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAnnotationTest createAnnotationTest() {
		AnnotationTestImpl annotationTest = new AnnotationTestImpl();
		return annotationTest;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QBlock createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QBreak createBreak() {
		BreakImpl break_ = new BreakImpl();
		return break_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCall createCall() {
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCommandExec createCommandExec() {
		CommandExecImpl commandExec = new CommandExecImpl();
		return commandExec;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QContinue createContinue() {
		ContinueImpl continue_ = new ContinueImpl();
		return continue_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConversion createConversion() {
		ConversionImpl conversion = new ConversionImpl();
		return conversion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDataSection createDataSection() {
		DataSectionImpl dataSection = new DataSectionImpl();
		return dataSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QEntry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends QTerm> QEntryParameter<T> createEntryParameter() {
		EntryParameterImpl<T> entryParameter = new EntryParameterImpl<T>();
		return entryParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QEval createEval() {
		EvalImpl eval = new EvalImpl();
		return eval;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QFileSection createFileSection() {
		FileSectionImpl fileSection = new FileSectionImpl();
		return fileSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QFlowData createFlowData() {
		FlowDataImpl flowData = new FlowDataImpl();
		return flowData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QFlowSection createFlowSection() {
		FlowSectionImpl flowSection = new FlowSectionImpl();
		return flowSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIf createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QJump createJump() {
		JumpImpl jump = new JumpImpl();
		return jump;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QLabel createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QMethodExec createMethodExec() {
		MethodExecImpl methodExec = new MethodExecImpl();
		return methodExec;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QModule createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QMonitor createMonitor() {
		MonitorImpl monitor = new MonitorImpl();
		return monitor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOnError createOnError() {
		OnErrorImpl onError = new OnErrorImpl();
		return onError;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QParameterList createParameterList() {
		ParameterListImpl parameterList = new ParameterListImpl();
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QProcedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QProcedureExec createProcedureExec() {
		ProcedureExecImpl procedureExec = new ProcedureExecImpl();
		return procedureExec;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QProgram createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QPrototype createPrototype() {
		PrototypeImpl prototype = new PrototypeImpl();
		return prototype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QReturn createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QRoutine createRoutine() {
		RoutineImpl routine = new RoutineImpl();
		return routine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QRoutineExec createRoutineExec() {
		RoutineExecImpl routineExec = new RoutineExecImpl();
		return routineExec;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QSetupSection createSetupSection() {
		SetupSectionImpl setupSection = new SetupSectionImpl();
		return setupSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QSQLExec createSQLExec() {
		SQLExecImpl sqlExec = new SQLExecImpl();
		return sqlExec;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QUntil createUntil() {
		UntilImpl until = new UntilImpl();
		return until;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWhile createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionStatus createConversionStatusFromString(EDataType eDataType, String initialValue) {
		ConversionStatus result = ConversionStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConversionStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EvalOperator createEvalOperatorFromString(EDataType eDataType, String initialValue) {
		EvalOperator result = EvalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PassingType createPassingTypeFromString(EDataType eDataType, String initialValue) {
		PassingType result = PassingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPassingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIntegratedLanguageFlowPackage getIntegratedLanguageFlowPackage() {
		return (QIntegratedLanguageFlowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QFor createFor() {
		ForImpl for_ = new ForImpl();
		return for_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageFlowPackage getPackage() {
		return QIntegratedLanguageFlowPackage.eINSTANCE;
	}

} // QIntegratedLanguageFlowFactoryImpl
