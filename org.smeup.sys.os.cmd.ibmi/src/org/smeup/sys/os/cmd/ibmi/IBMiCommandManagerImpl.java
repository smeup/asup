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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.inject.Inject;

import org.smeup.sys.dk.core.DevelopmentStatusType;
import org.smeup.sys.dk.core.QDevelopmentKitCoreFactory;
import org.smeup.sys.dk.core.QDevelopmentStatus;
import org.smeup.sys.dk.parser.ibmi.cl.ParserFactory;
import org.smeup.sys.dk.parser.ibmi.cl.ParserInterface;
import org.smeup.sys.dk.parser.ibmi.cl.exceptions.CLScriptException;
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
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.QStruct;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QDatetimeDef;
import org.smeup.sys.il.data.def.QMultipleCompoundDataDef;
import org.smeup.sys.il.data.def.QUnaryCompoundDataDef;
import org.smeup.sys.il.data.def.TimeFormat;
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
	
	@Override
	public QCallableCommand prepareCommand(QJob job, String command, Map<String, Object> variables, boolean controlRequiredParms) {
		
		//System.out.println("cmd: " + command);		

		if (command == null || command.trim().equals(""))
			throw new OperatingSystemRuntimeException("Empty command line", null);

		CLObject result = null;
		try {
			result = (CLObject) clParser.parse(command + "\n");
		} catch (CLScriptException exc) {
			throw new OperatingSystemRuntimeException("Cannot parse command: " + command, null);
		}

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
			if (value.isEmpty() == false) {
				data = assignValue(job, dataTerm, dataContainer.getData(dataTerm), dataWriter, value, variables);
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
	
	private QData assignValue(QJob job, QDataTerm<?> dataTerm, QData data, QDataWriter writer, String value, Map<String, Object> variables) {
						
		if (hasOnlyVariables(dataTerm, value)) {
			
			// If value contains only variables, don't parse the string but assign value using directly the variables

			int e = 1;
			String[] tokens = null;
			
			Iterator<QBufferedData> elements = null;
			boolean qualified = false;
			if(dataTerm.getDataTermType().isCompound()) {
				QCompoundDataDef<?, ?> compoundDef = (QCompoundDataDef<?, ?>)dataTerm.getDefinition();
				qualified = compoundDef.isQualified();
				QDataStruct dataStruct = (QDataStruct) data;
				if(qualified) { 
					tokens = value.split("/");
					List<QBufferedData> tempList = new ArrayList<QBufferedData>(dataStruct.getElements());
					if(tokens.length> 1)
						Collections.reverse(tempList);
					elements = tempList.iterator();
				}
				else { 
					tokens = value.split(" ");
					elements = dataStruct.getElements().iterator();
				}
			}
			else {
				tokens = value.split(" ");
			}
			
			for(String token: tokens) {

				Object variable = variables.get(token.substring(1).toLowerCase());

				if (variable == null)
					continue;

				if (!(variable instanceof QBufferedData))
					continue;

				if (data instanceof QList<?>) {
					QList<?> list = (QList<?>) data;
					((QBufferedData) variable).assign((QBufferedData) list.get(e));
				}
				else if(data instanceof QDataStruct && elements != null) {
					writer.set(variable);
					elements.next().accept(writer);
				}
				else if (data instanceof QBufferedData) {
					((QBufferedData) variable).assign((QBufferedData) data);
				} 

				e++;
			}

			return data;
		}

		/*
		if (value.startsWith("&") || value.contains("/")) {
			System.out.println(value);
		}
		*/		

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

			if (isEmptyString(value) == false) {

				// Expected parms as list
				try {
					paramComp = (CLParmAbstractComponent) clParameterParser.parse(value);
				} catch (CLScriptException exc) {
					throw new OperatingSystemRuntimeException("Cannot parse command parameter: " + value, null);
				}

				QFormat format = dataTerm.getFacet(QFormat.class);
				if (format != null && format.getType() == FormatType.COMMAND_STRING){
					value = paramComp.getText();
					setValue(job, dataTerm, writer, data, value, variables);
				}else{
					if (paramComp.getComponentType() == CLParmComponentType.LIST) {

						// Expected parm format as list

						LinkedList<CLParmAbstractComponent> listElements = paramComp.getChilds();

						int counter = 1;
						Iterator<CLParmAbstractComponent> iterator = listElements.iterator();
						while (iterator.hasNext()) {
							// if(listAtomic instanceof QScroller<?>)
							// ((QScroller<?>)listAtomic).absolute(counter);

							value = buildParameterValue(dataTerm, iterator.next());

							QData listItem = listAtomic.get(counter);

							setValue(job, dataTerm, writer, listItem, value, variables);

							counter++;
						}
					} else {
						throw new OperatingSystemRuntimeException("Wrong command parameter format (wait for List): " + value, null);
					}
				}
			} else {

				int capacity = listAtomic.capacity();

				for (int i = 1; i < capacity; i++) {
					QData listItem = listAtomic.get(i);
					setValue(job, dataTerm, writer, listItem, "", variables);
				}

			}

			dbgString = dataTerm.toString();

			break;

		case MULTIPLE_COMPOUND:

			//Stroller
			
			QMultipleCompoundDataDef<?, ?> multipleCompoundDataDef = (QMultipleCompoundDataDef<?, ?>) dataTerm.getDefinition();

			// Manage Struct specials
			value = resolveSpecialValue(dataTerm, value);

			// Parse the compound value ((A B C) (D E F)) --> return (A B C) and
			// (D E F)
			CLParmAbstractComponent multipleParamComp = null;
			try {
				multipleParamComp = (CLParmAbstractComponent) clParameterParser.parse(value);
			} catch (CLScriptException exc) {
				throw new OperatingSystemRuntimeException("Cannot parse command parameter: " + value, null);
			}		
			
			LinkedList<CLParmAbstractComponent> childs = multipleParamComp.getChilds();
			
			int i = 1;
			for (Iterator<CLParmAbstractComponent> iterator = childs.iterator(); iterator.hasNext();) {
				
				
				CLParmAbstractComponent listElem = (CLParmAbstractComponent) iterator.next();

				QData  tmpData = ((QScroller<?>) data).absolute(i);				

				String tmpValue = listElem.toString();

				if (isSpecialValue(dataTerm, tmpValue))
					setValue(job, dataTerm, writer, tmpData, resolveSpecialValue(dataTerm, tmpValue), variables);
				else {
					
					if (listElem instanceof CLParmList) {										
						assignStructValue(job, multipleCompoundDataDef, tmpData, writer, tmpValue, variables);
					} else {
						throw new OperatingSystemRuntimeException("Cannot parse command parameter : " + value + " as stroller data element", null);
					}
				}
				
				i++;
			}
			
			dbgString = dataTerm.toString();
			break;

		case UNARY_ATOMIC:
			
			if (isEmptyString(value) == false) {

				if (value.startsWith("(") && value.endsWith(")"))
					value = value.substring(1, value.length() - 1);
				try {
					paramComp = (CLParmAbstractComponent) clParameterParser.parse(value);
				} catch (CLScriptException exc) {
					throw new OperatingSystemRuntimeException("Cannot parse command parameter: " + value, null);
				}	

				Class<?> javaClass = dataTerm.getDefinition().getJavaClass();

				if (javaClass.isAssignableFrom(String.class)) {

				}

				QFormat format = dataTerm.getFacet(QFormat.class);
				if (format != null && format.getType() == FormatType.COMMAND_STRING)
					// Manage value without ' delimiters in parameters with
					// COMMAND format (not detected by AntLR parser)
					value = paramComp.getText();
				else if (paramComp instanceof CLParmList) {
					value = buildParameterValue(dataTerm, paramComp.getChilds().getFirst());					
				}	
				else
					// Error: received a list of values in an unary parameter
					throw new OperatingSystemRuntimeException("Invalid value for parameter " + dataTerm.getName().toUpperCase());

			} 

			setValue(job, dataTerm, writer, data, value, variables);
			
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
				setValue(job, dataTerm,  writer, data, resolveSpecialValue(dataTerm, value), variables);
			else
				assignStructValue(job, unaryCompoundDataDef, data, writer, value, variables);

			dbgString = dataTerm.toString();

			break;
		}

		return data;
	}

	private void assignStructValue(QJob job, QCompoundDataDef<?, ?> compoundDataDef, QData data, QDataWriter writer, String parmValue, Map<String, Object> variables) {

		CLParmAbstractComponent paramComp;

		if (parmValue.startsWith("(") && parmValue.endsWith(")"))
			parmValue = parmValue.substring(1, parmValue.length() - 1);

		if (compoundDataDef.isQualified()) {

			String[] values = parmValue.split("/");
			for (int j = values.length; j > 0; j--) {

				// Recursive Call
				
				QDataTerm<?> elemDataTerm = compoundDataDef.getElements().get(j - 1);
				QData elementData = ((QDataStruct)data).getElement(elemDataTerm.getName());
				assignValue(job, elemDataTerm, elementData, writer, values[values.length - j], variables);
			}
		} else {

			// Parse the compound value
			try {
				paramComp = (CLParmAbstractComponent) clParameterParser.parse(parmValue);
			} catch (CLScriptException exc) {
				throw new OperatingSystemRuntimeException("Cannot parse command parameter: " + parmValue, null);
			}

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
				QDataTerm<?> dataTerm = elementIterator.next();	
				QData elementData = ((QDataStruct)data).getElement(dataTerm.getName());
				
				assignValue(job, dataTerm, elementData, writer, tmpValue, variables);
			}
		}		
	}

	private String buildParameterValue(QDataTerm<?> dataTerm, CLParmAbstractComponent parmValue) {

		String value = null;

		switch (parmValue.getComponentType()) {

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

			value = parmValue.toString();

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
		
		case STRING:

			value = parmValue.toString();
			if (matchFormat(dataTerm, value) == false)
				throw new OperatingSystemRuntimeException("Invalid format for parm value: " + value);

			break;
			
		case FILTER:			

			value = parmValue.toString();

			break;
		
		case HEX:
			
			value = parmValue.toString();
			
			if (value != null && value.startsWith("X'") && value.endsWith("'")) {
				value = value.substring(2, value.length() - 1);
			}	
			break;
		
		case STR_OPERATOR:
			
			//TODO: implementare
			value = parmValue.toString();
			
			break;
			
		case FUNCTION:

			value = "%" + parmValue.getText() + "(";

			CLParmList functionParms = ((CLParmFunction) parmValue).getParms();

			Iterator<CLParmAbstractComponent> funParmIterator = functionParms.getChilds().iterator();

			while (funParmIterator.hasNext())
				value += buildParameterValue(dataTerm, funParmIterator.next()) + "";

			if (value.endsWith(" ")) {
				value = value.substring(0, value.length() - 2);
				value += ")";
			}

			break;


		default:
			value = null;
			break;
		}

		// Manage HEX default values
		

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
					// TODO: Which is the correct assign when the special has a null value?
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

	private void setValue(QJob job, QDataTerm dataTerm, QDataWriter writer, QData data, Object value, Map<String, Object> variables) {
		
		if (isSingleVariable(value.toString())) {
			
			// Il valore è una variabile
			if (variables != null) {
				Object variable = variables.get(value.toString().toLowerCase().substring(1));
				
				if (variable != null && variable instanceof QBufferedData) {
					((QBufferedData)variable).assign((QBufferedData)data);
				}
			} else
				setValueNoVariable(job, dataTerm, writer, data, value, variables);
		} else {	
			setValueNoVariable(job, dataTerm, writer, data, value, variables);
		}
	}
	
	private void setValueNoVariable(QJob job, QDataTerm dataTerm, QDataWriter writer, QData data, Object value, Map<String, Object> variables) {
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
		} else if (data instanceof QDatetime) {
							
			QDataDef<?> definition = dataTerm.getDefinition();
			
			String format = null;
			
			if (definition instanceof QDatetimeDef) {
				
				QDatetimeDef datetimeDef = (QDatetimeDef)definition;					
				
				String separator = null;
				
				switch(datetimeDef.getType()){
				
				case DATE:						
											
					format = toJavaFormat(job.getDateFormat(), job.getDateSeparator());						
											
				case TIME:

					format = toJavaFormat(job.getDateFormat(), job.getTimeSeparator());
					
					break;						
				case TIME_STAMP:
					
					format = toJavaFormat(job.getDateFormat(), job.getDateSeparator()) 
								+ 
								"-" 
								+ 
								toJavaFormat(job.getDateFormat(), job.getTimeSeparator()) 
								+ 
								".SSSSSS";
					
					break;
				default:
					break;
				
				}
			}
			
			Date date;
			try {
				date = new SimpleDateFormat(format).parse(value.toString());
				data.accept(writer.set(date));
			} catch (ParseException e) {
				data.clear();
			} 
							
			
		} else
			data.accept(writer.set(value.toString()));
	}
	
	private boolean isEmptyString(String value) {
		return value.trim().isEmpty();
	}
	
	private boolean isSingleVariable(String value) {		
		return value.trim().startsWith("&") && !value.trim().contains(" ");
	}
	
	private boolean hasOnlyVariables(QDataTerm<?> dataTerm, String value) {
		
		boolean result = true;
		String[] tokens = null;
		if(dataTerm.getDataTermType().isCompound()) {
			QCompoundDataDef<?, ?> compoundDef = (QCompoundDataDef<?, ?>)dataTerm.getDefinition();
			boolean qualified = compoundDef.isQualified();			
			if(qualified) { 
				tokens = value.split("/");							
			}
			else { 
				tokens = value.split(" ");				
			}
		}
		else {
			tokens = value.split(" ");
		}
		
		for (int i = 0; i < tokens.length; i++) {
			if (!tokens[i].startsWith("&")){
				result = false;
				break;
			}
				
		}
		
		return result;
	}
	
	private final String toJavaFormat(final DateFormat dateFormat, final String separator) {

		String format = null;

		switch (dateFormat) {
		case DMY:
			format = "dd/MM/yy";
			break;
		case EUR:
			format = "dd.MM.yyyy";
			break;
		case ISO:
			format = "yyyy-MM-dd";
			break;
		case JIS:
			format = "yyyy-MM-dd";
			break;
		case JOBRUN:
			format = "yy-MM-dd";
			break;
		case JUL:
			format = "yy-D";
			break;
		case MDY:
			format = "MM/dd/yy";
			break;
		case USA:
			format = "MM/dd/yyyy";
			break;
		case YMD:
			format = "yy/MM/dd";
			break;
		case YYMD:
			format = "yyyy/MM/dd";
			break;
		}

		if (separator != null)
			format = format.replaceAll("-", separator);

		return format;
	}
	
	private final String toJavaFormat(final TimeFormat timeFormat, final String separator) {

		String format = null;

		switch (timeFormat) {
		case EUR:
			format = "HH.mm.ss";
			break;
		case HMS:
			format = "HH:mm:ss";
			break;
		case ISO:
			format = "HH.mm.ss";
			break;
		case JIS:
			format = "HH:mm:ss";
			break;
		case JOBRUN:
			format = "HH.mm.ss";
			break;
		case USA:
			format = "HH:mm a";
			break;
		}

		if (separator != null)
			format = format.replaceAll(".", separator);

		return format;
	}

	
	
}
