/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 *   Mattia Rocchi - Implementation
 */
package org.smeup.sys.os.cmd.ibmi;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.inject.Inject;

import org.smeup.sys.dk.core.DevelopmentStatusType;
import org.smeup.sys.dk.core.QDevelopmentKitCoreFactory;
import org.smeup.sys.dk.core.QDevelopmentStatus;
import org.smeup.sys.dk.parser.ibmi.cl.ParserFactory;
import org.smeup.sys.dk.parser.ibmi.cl.ParserInterface;
import org.smeup.sys.dk.parser.ibmi.cl.model.parm.CLParmAbstractComponent;
import org.smeup.sys.dk.parser.ibmi.cl.model.parm.CLParmComponentType;
import org.smeup.sys.dk.parser.ibmi.cl.model.parm.CLParmFunction;
import org.smeup.sys.dk.parser.ibmi.cl.model.parm.CLParmList;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLCommand;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLObject;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLParameter;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLPositionalParameter;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLRow;
import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.il.data.QAdapter;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.QStruct;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QMultipleCompoundDataDef;
import org.smeup.sys.il.data.def.QUnaryCompoundDataDef;
import org.smeup.sys.il.data.term.FormatType;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QFormat;
import org.smeup.sys.il.data.term.QSpecial;
import org.smeup.sys.il.data.term.QSpecialElement;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.cmd.CommandParameterOrder;
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommand;
import org.smeup.sys.os.cmd.QCommandParameter;
import org.smeup.sys.os.cmd.QOperatingSystemCommandFactory;
import org.smeup.sys.os.cmd.base.BaseCommandManagerImpl;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.pgm.QProgramManager;

public class IBMiCommandManagerImpl extends BaseCommandManagerImpl {

	protected QJobManager jobManager;
	protected QDataManager dataManager;
	protected ParserInterface<?> clParameterParser;
	protected ParserInterface<?> clParser;
	
	@Inject
	public IBMiCommandManagerImpl(QThreadManager threadManager, QResourceManager resourceManager, QJobManager jobManager, QJobLogManager jobLogManager, QDataManager dataManager, QProgramManager programManager) {
		super(threadManager, resourceManager, jobManager, jobLogManager, programManager, dataManager);
		this.jobManager = jobManager;
		this.dataManager = dataManager;
		this.clParameterParser = ParserFactory.getInstance().getParser(ParserFactory.ScriptType.CL_PARAMETER);
		this.clParser = ParserFactory.getInstance().getParser(ParserFactory.ScriptType.CL);
		
		resourceManager.registerListener(QCommand.class, new IBMiCommandListenerImpl());
	}

	@SuppressWarnings("resource")
	@Override
	public QCallableCommand prepareCommand(QJob job, String command, Map<String, Object> variables, boolean controlRequiredParms) {

		if (command == null || command.trim().equals(""))
			throw new OperatingSystemRuntimeException("Empty command line", null);

		CLObject result = null;
		result = (CLObject) clParser.parse(command + "\n");

		CLRow clRow = null;
		try {
			clRow = result.getRows().iterator().next();
		} catch (NoSuchElementException e) {
			result.toString();
		}
		CLCommand clCommand = clRow.getCommand();

		// lookup command
		QResourceReader<QCommand> commandResource = resourceManager.getResourceReader(job, QCommand.class, Scope.LIBRARY_LIST);
		QCommand qCommand = commandResource.lookup(clCommand.getName());
		
		// unknown command
		if (qCommand == null)
			throw new OperatingSystemRuntimeException("Unknown command: " + clCommand.getName(), null);

		// build callable command
		QCallableCommand callableCommand = QOperatingSystemCommandFactory.eINSTANCE.createCallableCommand();
		callableCommand.setCommand(qCommand);
		callableCommand.setCommandString(command);
		callableCommand.setVariables(variables);

		// data container
		QDataContainer dataContainer = dataManager.createDataContainer(job.getContext(), null);

		// prepare data terms
		for (QCommandParameter commandParameter : qCommand.getParameters(CommandParameterOrder.POSITION)) {

			QDevelopmentStatus developmentStatus = QDevelopmentKitCoreFactory.eINSTANCE.createDevelopmentStatus();

			// data term
			QDataTerm<?> dataTerm = commandParameter.getDataTerm();
			switch (commandParameter.getStatus()) {
			case POSSIBLE:
				break;
			case SUPPORTED:
				developmentStatus.setValue(DevelopmentStatusType.SUPPORTED);
				dataTerm.getFacets().add(developmentStatus);
				break;
			case TODO:
				developmentStatus.setValue(DevelopmentStatusType.TO_DO);
				dataTerm.getFacets().add(developmentStatus);
				break;
			case UNSUPPORTED:
				developmentStatus.setValue(DevelopmentStatusType.UNSUPPORTED);
				dataTerm.getFacets().add(developmentStatus);
				break;
			}
			dataTerm.setKey(commandParameter.getName());
			
			// force reset dataStruct
			if(dataTerm.getDataTermType().isCompound()) {
				@SuppressWarnings("unchecked")
				QCompoundDataDef<QStruct<?>, QDataTerm<?>> compoundDataDef = (QCompoundDataDef<QStruct<?>, QDataTerm<?>>) dataTerm.getDefinition();
				compoundDataDef.setInitialized(true);
			}
					
			dataContainer.addDataTerm(dataTerm);
		}
		
		callableCommand.setDataContainer(dataContainer);

		QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();

		// assign values
		for (QCommandParameter commandParameter : qCommand.getParameters(CommandParameterOrder.POSITION)) {

			CLParameter clParameter = clCommand.getParm(commandParameter.getName());
			
			// positional parameters
			if (commandParameter.getPosition() <= clCommand.getPositionalParms().size()) {
				if (clParameter == null) {
					clParameter = new CLParameter();
					clParameter.setName(commandParameter.getName());
				}

				CLPositionalParameter positionalParm = clCommand.getPositionalParm(commandParameter.getPosition() - 1);
				clParameter.setText(positionalParm.getText());
				clParameter.setValue(positionalParm.getValue());
			}

			// Manage value
			String value = null;
			if (clParameter != null)
				value = clParameter.getValue().getText();
			else
				value = "";

			// Assign value
			QDataTerm<?> dataTerm = dataContainer.getDataTerm(commandParameter.getName());

			QData data = null;
			if (value.startsWith("&") || value.isEmpty() == false) {
				data = assignValue(dataTerm, dataContainer, dataWriter, value, variables);
			} else {
				data = dataContainer.getData(dataTerm);
			}
			
			// required
			if (controlRequiredParms) {
				if ((data == null || (!value.startsWith("&") && data.isEmpty())) && commandParameter.isRequired())
					throw new OperatingSystemRuntimeException("Required parameter: " + commandParameter.getName());
			}
				
		}
		
		return callableCommand;
	}
	
	private QData assignValue(QDataTerm<?> dataTerm, QDataContainer dataContainer, QDataWriter writer, String value, Map<String, Object> variables) {
		
		QData data = dataContainer.getData(dataTerm);
		
		// Resolve variable
		if (value.startsWith("&") && variables != null) {
			String varName = value.substring(1).toLowerCase();
			if (variables.containsKey(varName))
			{	
				value = variables.get(varName).toString();
			} 
		}

		@SuppressWarnings("unused")
		String dbgString = null;
		CLParmAbstractComponent paramComp;

		// Manage default value

		switch (dataTerm.getDataTermType()) {

		case MULTIPLE_ATOMIC:
			/*
			 * if (defaults && useDefault(dataTerm, value)) { value =
			 * buildDefault(dataTerm); defaults = false; }
			 */

			QList<?> listAtomic = (QList<?>) data;

			if (value.isEmpty() == false) {

				// Expected parms as list
				paramComp = (CLParmAbstractComponent) clParameterParser.parse(value);

				if (paramComp.getComponentType() == CLParmComponentType.LIST) {

					// Expected parm format as list

					LinkedList<CLParmAbstractComponent> listElements = paramComp.getChilds();

					int counter = 1;
					Iterator<CLParmAbstractComponent> iterator = listElements.iterator();
					while (iterator.hasNext()) {
						// if(listAtomic instanceof QScroller<?>)
						// ((QScroller<?>)listAtomic).absolute(counter);

						value = buildParameterValue(dataTerm, iterator.next(), variables);

						QData listItem = listAtomic.get(counter);

						assignValue(writer, listItem, value);

						counter++;
					}
				}
			} else {

				int capacity = listAtomic.capacity();

				for (int i = 1; i < capacity; i++) {
					QData listItem = listAtomic.get(i);
					assignValue(writer, listItem, "");
				}

			}

			dbgString = dataTerm.toString();

			break;

		case MULTIPLE_COMPOUND:

			QMultipleCompoundDataDef<?, ?> multipleCompoundDataDef = (QMultipleCompoundDataDef<?, ?>) dataTerm.getDefinition();

			// Manage Struct specials
			value = resolveSpecialValue(dataTerm, value);

			// Parse the compound value ((A B C) (D E F)) --> return (A B C) and
			// (D E F)
			CLParmAbstractComponent multipleParamComp = null;
			multipleParamComp = (CLParmAbstractComponent) clParameterParser.parse(value);

			Iterator<CLParmAbstractComponent> multipleParmIterator = multipleParamComp.getChilds().iterator();

			int i = 1;
			while (multipleParmIterator.hasNext()) {
				String tmpValue = multipleParmIterator.next().toString();

				if (data instanceof QScroller<?>)
					((QScroller<?>) data).absolute(i);

				if (isSpecialValue(dataTerm, tmpValue))
					assignValue(writer, data, resolveSpecialValue(dataTerm, tmpValue));
				else
					buildStructValue(multipleCompoundDataDef, dataContainer, writer, tmpValue, variables);

				i++;
			}

			dbgString = dataTerm.toString();
			break;

		case UNARY_ATOMIC:

			if (value.isEmpty() == false) {

				if (value.startsWith("(") && value.endsWith(")"))
					value = value.substring(1, value.length() - 1);

				/*
				 * Parser response structure:
				 * 
				 * CLParamList | CLParamValue | (CLParmToken OR CLPArmVariable
				 * OR CLParmSpecial OR CLParmString OR CLParmFunction)
				 */

				paramComp = (CLParmAbstractComponent) clParameterParser.parse(value);

				Class<?> javaClass = dataTerm.getDefinition().getJavaClass();

				if (javaClass.isAssignableFrom(String.class)) {

				}

				QFormat format = dataTerm.getFacet(QFormat.class);
				if (format != null && format.getType() == FormatType.COMMAND_STRING)
					// Manage value without ' delimiters in parameters with
					// COMMAND format (not detected by AntLR parser)
					value = paramComp.getText();
				else if (paramComp.getChilds().size() == 1)
					value = buildParameterValue(dataTerm, paramComp.getChilds().getFirst().getChilds().getFirst(), variables);
				else
					// Error: received a list of values in an unary parameter
					throw new OperatingSystemRuntimeException("Invalid value for parameter " + dataTerm.getName().toUpperCase());

			} 

			assignValue(writer, data, value);

			dbgString = dataTerm.toString();

			break;
		case UNARY_COMPOUND:

			/*
			// Manage Struct specials
			value = resolveSpecialValue(dataTerm, value);
			*/

			QUnaryCompoundDataDef<?, ?> unaryCompoundDataDef = (QUnaryCompoundDataDef<?, ?>) dataTerm.getDefinition();
			// QStruct struct = (QStruct) data;

			// String structValue = buildStructValue(unaryCompoundDataDef,
			// dataContext, value, variables, defaults);
			// assignValue(struct, structValue);

			if (isSpecialValue(dataTerm, value))
				assignValue(writer, data, resolveSpecialValue(dataTerm, value));
			else
				buildStructValue(unaryCompoundDataDef, dataContainer, writer, value, variables);

			dbgString = dataTerm.toString();

			break;
		}

		return data;
	}

	private String buildStructValue(QCompoundDataDef<?, ?> compoundDataDef, QDataContainer dataContext, QDataWriter writer, String parmValue, Map<String, Object> variables) {

		String structValue = "";
		CLParmAbstractComponent paramComp;

		if (parmValue.startsWith("(") && parmValue.endsWith(")"))
			parmValue = parmValue.substring(1, parmValue.length() - 1);

		if (compoundDataDef.isQualified()) {

			String[] values = parmValue.split("/");
			for (int j = values.length; j > 0; j--) {

				// Recursive Call
				QData assignValue = assignValue(compoundDataDef.getElements().get(j - 1), dataContext, writer, values[values.length - j], variables);

				// assignValue(struct.getElement(j), assignValue.toString());
				if (assignValue instanceof QString)
					structValue = ((QString) assignValue).toString() + structValue;
				else
					structValue = assignValue.toString() + structValue;
			}
		} else {

			// Parse the compound value
			paramComp = (CLParmAbstractComponent) clParameterParser.parse(parmValue);

			@SuppressWarnings("unchecked")
			Iterator<QDataTerm<?>> elementIterator = (Iterator<QDataTerm<?>>) compoundDataDef.getElements().iterator();
			Iterator<CLParmAbstractComponent> parmIterator = paramComp.getChilds().iterator();

			while (elementIterator.hasNext()) {

				String tmpValue;
				if (parmIterator.hasNext())
					tmpValue = parmIterator.next().toString();
				else
					tmpValue = "";

				// Recursive Call
				QData assignValue = assignValue(elementIterator.next(), dataContext, writer, tmpValue, variables);
				if (assignValue instanceof QString)
					structValue += ((QString) assignValue).toString();
				else
					structValue += assignValue.toString();
			}
		}
		return structValue;
	}

	private String buildParameterValue(QDataTerm<?> dataTerm, CLParmAbstractComponent parmValue, Map<String, Object> variables) {

		String value = null;

		switch (parmValue.getComponentType()) {

		case LIST:

			LinkedList<CLParmAbstractComponent> listChilds = parmValue.getChilds();
			Iterator<CLParmAbstractComponent> listIterator = listChilds.iterator();

			while (listIterator.hasNext()) {

				String tmp = buildParameterValue(dataTerm, listIterator.next(), variables);

				// All list elements have to match the DataTerm format
				if (matchFormat(dataTerm, tmp))
					value += tmp + " ";
				else
					throw new OperatingSystemRuntimeException("Invalid format for parm value: " + value);

				value += tmp + " ";
			}

			if (value.endsWith(" "))
				value = value.substring(0, value.length() - 2);

			break;

		case VALUE:

			value = "";

			LinkedList<CLParmAbstractComponent> childs = parmValue.getChilds();
			Iterator<CLParmAbstractComponent> iterator = childs.iterator();

			while (iterator.hasNext())
				value = buildParameterValue(dataTerm, iterator.next(), variables) + " ";

			if (value.endsWith(" "))
				value = value.substring(0, value.length() - 1);
			
			if (value.equals("''"))
				value = "";

			// The result value have to match the dataTerm format
			if (!isSpecialValue(dataTerm, value))
				if (matchFormat(dataTerm, value) == false)
					throw new OperatingSystemRuntimeException("Invalid format for parm value: " + value);

			break;

		case FUNCTION:

			value = "%" + parmValue.getText() + "(";

			CLParmList functionParms = ((CLParmFunction) parmValue).getParms();

			Iterator<CLParmAbstractComponent> funParmIterator = functionParms.getChilds().iterator();

			while (funParmIterator.hasNext())
				value += buildParameterValue(dataTerm, funParmIterator.next(), variables) + "";

			if (value.endsWith(" ")) {
				value = value.substring(0, value.length() - 2);
				value += ")";
			}

			break;

		case SPECIAL:

			if (isSpecialValue(dataTerm, parmValue.toString()))
				value = resolveSpecialValue(dataTerm, parmValue.toString());
			else {
				value = parmValue.toString();
				if (matchFormat(dataTerm, value) == false)
					throw new OperatingSystemRuntimeException("Invalid format for parm value: " + value);
			}

			break;

		case FILTER:
		case STR_OPERATOR:
		case HEX:

			value = parmValue.toString();

			break;

		case STRING:

			value = parmValue.toString();
			if (matchFormat(dataTerm, value) == false)
				throw new OperatingSystemRuntimeException("Invalid format for parm value: " + value);

			break;

		case TOKEN:

			if (isSpecialValue(dataTerm, parmValue.toString()))
				value = resolveSpecialValue(dataTerm, parmValue.toString());
			else {
				value = parmValue.toString();
				if (matchFormat(dataTerm, value) == false)
					throw new OperatingSystemRuntimeException("Invalid format for parm value: " + value);
			}
			break;

		case VARIABLE:
			/*
			 * Qui non dovrebbe mai passare, perchè le variabili son risolte in testa al
			 * metodo assignValue
			 */
			
			String varName = parmValue.toString().substring(1).toLowerCase();
			
			if (variables != null && variables.containsKey(varName))
			{	
				value = variables.get(varName).toString();
			} else {
				value = parmValue.toString();
			}
			
			break;

		default:
			value = null;
			break;
		}

		// Manage HEX default values
		if (value != null && value.startsWith("X'") && value.endsWith("'")) {
			value = value.substring(2, value.length() - 1);
			System.out.println("Hexadecimal founded: " + value + " " + dataTerm.getName());
		}

		return value;

	}

	/**
	 * Return true if value is a special value defined in dataTerm
	 *
	 * @param dataTerm
	 * @param value
	 * @return
	 */
	private boolean isSpecialValue(QDataTerm<?> dataTerm, String value) {

		QSpecial special = dataTerm.getFacet(QSpecial.class);

		if (special != null)
			for (QSpecialElement specialElem : special.getElements())
				if (specialElem.getName().equals(value))
					return true;

		return false;
	}

	/*
	 * Special to value
	 */
	private String resolveSpecialValue(QDataTerm<?> dataTerm, String value) {

		String result = value;

		QSpecial special = dataTerm.getFacet(QSpecial.class);

		if (special != null)
			for (QSpecialElement specialElem : special.getElements())
				if (specialElem.getName().equals(value)) {
					result = specialElem.getValue();
					// TODO: what is the correct assign if special has null
					// value?
					if (result == null)
						result = value;
					break;
				}

		return result;
	}

	private boolean matchFormat(QDataTerm<?> dataTerm, Object value) {

		boolean match = false;

		QFormat format = dataTerm.getFacet(QFormat.class);

		if (format != null && value.toString().length() > 0)
			match = IBMiFormatHelper.match(value.toString(), format);
		else
			match = true;

		return match;

	}

	private void assignValue(QDataWriter writer, QData data, Object value) {

		if (data instanceof QEnum) {
			@SuppressWarnings("unchecked")
			QEnum<?, QBufferedElement> enumerator = (QEnum<?, QBufferedElement>) data;

			QBufferedElement element = enumerator.asData();
			switch (element.getBufferedElementType()) {
			case DATETIME:
				element.movel(value.toString(), true);
				break;
			case NUMERIC:
				((QNumeric)element).eval(new BigDecimal(value.toString()));
				break;
			case STRING:
				((QString)element).eval(value.toString());
				break;
			}

		} else if (data instanceof QAdapter) {
			QAdapter adapter = (QAdapter) data;
			adapter.eval(value);
		} else
			data.accept(writer.set(value.toString()));
	}
}
