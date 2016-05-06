package org.smeup.sys.os.cmd.ibmi;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.smeup.sys.il.core.meta.QCardinality;
import org.smeup.sys.il.core.meta.QDefault;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaFactory;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.data.def.QAdapterDef;
import org.smeup.sys.il.data.def.QAtomicDataDef;
import org.smeup.sys.il.data.def.QBinaryDef;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QDatetimeDef;
import org.smeup.sys.il.data.def.QDecimalDef;
import org.smeup.sys.il.data.def.QHexadecimalDef;
import org.smeup.sys.il.data.def.QIndicatorDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.il.data.def.QMultipleAtomicDataDef;
import org.smeup.sys.il.data.def.QMultipleCompoundDataDef;
import org.smeup.sys.il.data.def.QScrollerDef;
import org.smeup.sys.il.data.def.QStrollerDef;
import org.smeup.sys.il.data.def.QUnaryAtomicBufferedDataDef;
import org.smeup.sys.il.data.def.QUnaryAtomicDataDef;
import org.smeup.sys.il.data.term.FormatType;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QFormat;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermFactory;
import org.smeup.sys.il.data.term.QRange;
import org.smeup.sys.il.data.term.QSpecial;
import org.smeup.sys.il.data.term.QSpecialElement;
import org.smeup.sys.os.cmd.QCommand;
import org.smeup.sys.os.cmd.QCommandData;
import org.smeup.sys.os.cmd.QCommandParameter;
import org.smeup.sys.os.cmd.QCommandSource;
import org.smeup.sys.os.cmd.QOperatingSystemCommandFactory;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class IBMiCommandBuilder {

	public static final String XML_TAG_COMMAND = "Cmd";
	public static final String XML_TAG_PARAMETER = "Parm";
	public static final String XML_TAG_ELEMENT = "Elem";
	public static final String XML_TAG_QUALIFIER = "Qual";
	public static final String XML_TAG_SPECIAL_VALUES = "SpcVal";
	public static final String XML_TAG_SINGLE_VALUES = "SngVal";
	public static final String XML_TAG_VALUE = "Value";
	public static final String XML_TAG_VALUES = "Values";
	public static final String XML_TAG_CHOICE_PGM_TEXT = "ChoicePgmText";
	public static final String XML_TAG_CHOICE_PGM_VALUES = "ChoicePgmValues";
	public static final String XML_TAG_PARAMETER_CTL = "PmtCtl";
	public static final String XML_TAG_DEP = "Dep";
	private static String testCommandName;
	private static String testParameterName;

	public static void buildCommand(QCommand qCommand) throws IOException {

		// extract command source
		QCommandSource commandSource = qCommand.getSource();

		Document commandDocument;
		try {
			byte[] commandSourceContent = commandSource.getContent().replaceAll("\n", "").getBytes("ISO-8859-1");
			commandDocument = loadDocument(new ByteArrayInputStream(commandSourceContent));
		} catch (Exception e) {
			System.err.println(qCommand.getName() + " " + e.getMessage());
			return;
		}

		testCommandName = qCommand.getName();

		Node commandNode = commandDocument.getElementsByTagName(XML_TAG_COMMAND).item(0);
		completeCommand(qCommand, commandNode);
	}

	public static void completeCommand(QCommand qCommand, Node commandNode) {
		// System.out.println("Building command: " + qCommand.getName());

		NamedNodeMap parameterAtts = commandNode.getAttributes();

		// name
		String execBatch = parameterAtts.getNamedItem("ExecBatch").getNodeValue();
		qCommand.setAllowBatch(execBatch.equalsIgnoreCase("YES"));

		NodeList parameterNodes = commandNode.getChildNodes();
		for (int x = 0; x < parameterNodes.getLength(); x++) {
			Node parameterNode = parameterNodes.item(x);

			if (parameterNode.getNodeName().equals(XML_TAG_PARAMETER)) {

				QCommandParameter qCommandParameter = buildCommandParameter(parameterNode);
				qCommand.getParameters().add(qCommandParameter);

				continue;
			}

			if (parameterNode.getNodeName().equals(XML_TAG_DEP))
				continue;

			System.err.println("Unknown command node: " + parameterNode.getNodeName());
		}
	}

	public static QCommandParameter buildCommandParameter(Node parameterNode) {

		QCommandParameter qCommandParameter = QOperatingSystemCommandFactory.eINSTANCE.createCommandParameter();

		NamedNodeMap parameterAtts = parameterNode.getAttributes();

		// name
		String parameterName = parameterAtts.getNamedItem("Kwd").getNodeValue();
		qCommandParameter.setName(parameterName);
		testParameterName = parameterName;

		// position
		String position = parameterAtts.getNamedItem("PosNbr").getNodeValue();
		qCommandParameter.setPosition(Integer.parseInt(position));

		// System.out.println("\t parameter:" + parameterName+"("+position+")");

		// variable
		String allowVariable = parameterAtts.getNamedItem("AlwVar").getNodeValue();
		qCommandParameter.setAllowVariable(allowVariable.equalsIgnoreCase("YES"));

		// data
		QCommandData dataTerm = (QCommandData) buildDataTerm(parameterNode);
		qCommandParameter.setDataTerm(dataTerm);

		return qCommandParameter;
	}

	@SuppressWarnings("unchecked")
	public static <DT extends QDataTerm<?>> DT buildDataTerm(Node dataNode) {

		QFormat format = null;

		QBinaryDef binaryDefinition = null;
		QCharacterDef characterDefinition = null;
		QDatetimeDef datetimeDefinition = null;
		QDecimalDef decimalDefinition = null;
		QHexadecimalDef hexadecimalDefinition = null;
		QIndicatorDef indicatorDefinition = null;

		NamedNodeMap dataAtts = dataNode.getAttributes();

		// Type
		String type = dataAtts.getNamedItem("Type").getNodeValue();
		ParameterType parameterType = ParameterType.get(type);

		// dataDef
		QDataDef<?> dataDef = null;
		QCompoundDataDef<?, DT> compoundDataDef = null;
		
		switch (parameterType) {

		case ELEMENT:
			compoundDataDef = (QCompoundDataDef<?, DT>) QIntegratedLanguageDataDefFactory.eINSTANCE.createDataStructDef();
			dataDef = compoundDataDef;
			break;
		case QUALIFIED:
			compoundDataDef = (QCompoundDataDef<?, DT>) QIntegratedLanguageDataDefFactory.eINSTANCE.createDataStructDef();
			compoundDataDef.setQualified(true);
			dataDef = compoundDataDef;
			break;
		case CHARACTER:
			characterDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
			dataDef = characterDefinition;
			break;
		case VARYING_NAME:
			characterDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
			characterDefinition.setVarying(true);
			dataDef = characterDefinition;
			break;
		case NAME:
			dataDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
			format = QIntegratedLanguageDataTermFactory.eINSTANCE.createFormat();
			format.setType(FormatType.NAME);
			break;
		case SIMPLE_NAME:
			dataDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
			format = QIntegratedLanguageDataTermFactory.eINSTANCE.createFormat();
			format.setType(FormatType.SIMPLE_NAME);
			break;
		case COMMUNICATIONS_NAME:
			dataDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
			format = QIntegratedLanguageDataTermFactory.eINSTANCE.createFormat();
			format.setType(FormatType.COMMUNICATIONS_NAME);
			break;
		case PATH_NAME:
			dataDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
			format = QIntegratedLanguageDataTermFactory.eINSTANCE.createFormat();
			format.setType(FormatType.PATH_NAME);
			break;
		case GENERIC:
			dataDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
			format = QIntegratedLanguageDataTermFactory.eINSTANCE.createFormat();
			format.setType(FormatType.GENERIC);
			break;
		case COMMAND_STRING:
			dataDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
			format = QIntegratedLanguageDataTermFactory.eINSTANCE.createFormat();
			format.setType(FormatType.COMMAND_STRING);
			break;
		case TIME:
			datetimeDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createDatetimeDef();
			datetimeDefinition.setType(DatetimeType.TIME);
			dataDef = datetimeDefinition;
			break;
		case DATE:
			datetimeDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createDatetimeDef();
			datetimeDefinition.setType(DatetimeType.DATE);
			dataDef = datetimeDefinition;
			break;
		case INTEGER2:
			binaryDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createBinaryDef();
			binaryDefinition.setType(BinaryType.SHORT);
			dataDef = binaryDefinition;
			break;
		case UNSIGNED_INTEGER2:
			binaryDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createBinaryDef();
			binaryDefinition.setType(BinaryType.SHORT);
			binaryDefinition.setUnsigned(true);
			dataDef = binaryDefinition;
			break;
		case INTEGER4:
			binaryDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createBinaryDef();
			binaryDefinition.setType(BinaryType.INTEGER);
			dataDef = binaryDefinition;
			break;
		case UNSIGNED_INTEGER4:
			binaryDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createBinaryDef();
			binaryDefinition.setType(BinaryType.INTEGER);
			binaryDefinition.setUnsigned(true);
			dataDef = binaryDefinition;
			break;
		case DECIMAL:
			decimalDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createDecimalDef();
			dataDef = decimalDefinition;
			break;

		case ADAPTER:
			QAdapterDef adapterDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createAdapterDef();
			dataDef = adapterDefinition;
			break;

		case LOGICAL:
			indicatorDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createIndicatorDef();
			dataDef = indicatorDefinition;
			break;
		/*
		 * case COMMAND: characterDefinition =
		 * QIntegratedLanguageDataFactory.eINSTANCE.createCharacterDef();
		 * characterDefinition.setLength(20000); dataDefinition = (DD)
		 * characterDefinition; break;
		 */
		case HEXADECIMAL:
			hexadecimalDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createHexadecimalDef();
			dataDef = hexadecimalDefinition;
			break;
		default:
			throw new OperatingSystemRuntimeException("Unknown parameter type: " + parameterType.getName());
		}

		// cardinality
		QCardinality cardinality = null;
		Object minValue = (int) QIntegratedLanguageCoreMetaPackage.eINSTANCE.getCardinality_Min().getDefaultValue();
		Object maxValue = (int) QIntegratedLanguageCoreMetaPackage.eINSTANCE.getCardinality_Max().getDefaultValue();

		if (dataAtts.getNamedItem("Min") != null)
			minValue = Integer.parseInt(dataAtts.getNamedItem("Min").getNodeValue());
		if (dataAtts.getNamedItem("Max") != null)
			maxValue = Integer.parseInt(dataAtts.getNamedItem("Max").getNodeValue());

		if (minValue != QIntegratedLanguageCoreMetaPackage.eINSTANCE.getCardinality_Min().getDefaultValue()
				|| maxValue != QIntegratedLanguageCoreMetaPackage.eINSTANCE.getCardinality_Max().getDefaultValue()) {

			cardinality = QIntegratedLanguageCoreMetaFactory.eINSTANCE.createCardinality();
			cardinality.setMin((int) minValue);
			cardinality.setMax((int) maxValue);
		}

		// dataTerm
		QCommandData dataTerm = QOperatingSystemCommandFactory.eINSTANCE.createCommandData();

		// multiple
		if (cardinality != null) {

			if (dataDef instanceof QUnaryAtomicBufferedDataDef) {
				/*
				 * QArrayDef<?> arrayDef =
				 * QIntegratedLanguageDataFactory.eINSTANCE.createArrayDef();
				 * arrayDef.setDimension(cardinality.getMax());
				 * arrayDef.setArgument((QUnaryAtomicDataDef<?>) dataDef);
				 * dataDef = (DD) arrayDef;
				 */

				QScrollerDef<?> scrollerDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createScrollerDef();
				scrollerDef.setDimension(cardinality.getMax());
				scrollerDef.setArgument((QUnaryAtomicBufferedDataDef<?>) dataDef);
				dataDef = scrollerDef;

				dataTerm.setCardinality(cardinality);

			} else if (dataDef instanceof QCompoundDataDef) {
				QStrollerDef<?> strollerDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createStrollerDef();
				strollerDef.setDimension(cardinality.getMax());
				compoundDataDef = (QCompoundDataDef<?, DT>) strollerDef;
				dataDef = strollerDef;

				dataTerm.setCardinality(cardinality);
			} else
				throw new RuntimeException("Unexpected condition: dlkdg87dsfsd0 " + dataDef);
		} else {

			if (dataDef instanceof QAtomicDataDef) {}
			else if (dataDef instanceof QCompoundDataDef) {} 
			else
				throw new RuntimeException("Unexpected condition: eaqqe4klhjj89ert " + dataDef);
		}

		// definition
		dataTerm.setDefinition(dataDef);
		
		// name
		if (dataAtts.getNamedItem("Prompt") != null)
			dataTerm.setName(camelString(dataAtts.getNamedItem("Prompt").getNodeValue()));
		else if (dataAtts.getNamedItem("Choice") != null)
			dataTerm.setName(camelString(dataAtts.getNamedItem("Choice").getNodeValue()));

		// default
		if (dataAtts.getNamedItem("Dft") != null) {
			QDefault _default = QIntegratedLanguageCoreMetaFactory.eINSTANCE.createDefault();

			if (dataTerm.getDataTermType().isUnary())
				_default.setValue(dataAtts.getNamedItem("Dft").getNodeValue());
			else 
				_default.getValues().add(dataAtts.getNamedItem("Dft").getNodeValue());			

			dataTerm.setDefault(_default);
		}

		// restricted
		if (dataAtts.getNamedItem("Rstd") != null)
			dataTerm.setRestricted(dataAtts.getNamedItem("Rstd").getNodeValue().equalsIgnoreCase("YES"));


		// format
		if (format != null)
			dataTerm.getFacets().add(format);

		// range
		if (dataAtts.getNamedItem("RangeMinVal") != null || dataAtts.getNamedItem("RangeMaxVal") != null) {
			QRange range = QIntegratedLanguageDataTermFactory.eINSTANCE.createRange();
			range.setMin(dataAtts.getNamedItem("RangeMinVal").getNodeValue());
			range.setMax(dataAtts.getNamedItem("RangeMaxVal").getNodeValue());
			dataTerm.getFacets().add(range);
		}

		// data properties

		// length
		if (dataAtts.getNamedItem("Len") != null) {

			String length = dataAtts.getNamedItem("Len").getNodeValue();
			if (dataDef instanceof QMultipleAtomicDataDef) {
				QMultipleAtomicDataDef<?> multipleAtomicDataDef = (QMultipleAtomicDataDef<?>) dataDef;
				EObject eObject = (EObject) multipleAtomicDataDef.getArgument();
				setLength(eObject, length);
			} else {
				EObject eObject = (EObject) (dataDef instanceof QScrollerDef ? ((QScrollerDef<?>) dataDef).getArgument() : dataDef);
				setLength(eObject, length);
			}
			// eObject.eSet(eClass.getEStructuralFeature("length"),
			// buildLength(tokens[0]));
		}

		// QSpecial specialCached = null;

		// children
		NodeList attributeNodes = dataNode.getChildNodes();
		for (int x = 0; x < attributeNodes.getLength(); x++) {
			Node attributeNode = attributeNodes.item(x);

			// Special Values
			if (attributeNode.getNodeName().equals(XML_TAG_SPECIAL_VALUES) || attributeNode.getNodeName().equals(XML_TAG_SINGLE_VALUES) || attributeNode.getNodeName().equals(XML_TAG_VALUES)) {

				QSpecial special = dataTerm.getFacet(QSpecial.class);

				boolean singleValue = false;
				if (attributeNode.getNodeName().equals(XML_TAG_SINGLE_VALUES))
					singleValue = true;

				// TODO

				if (dataDef instanceof QUnaryAtomicDataDef && singleValue) {
					System.out.println("Command " + testCommandName + " parameter " + testParameterName + " - atomico unario con speciale single         - " + dataTerm.getName());
				}
				if (dataDef instanceof QMultipleAtomicDataDef && singleValue) {
					System.out.println("Command " + testCommandName + " parameter " + testParameterName + " - atomico multiplo con speciale single       - " + dataTerm.getName());
				}
				if (dataDef instanceof QCompoundDataDef && !singleValue) {
					System.out.println("Command " + testCommandName + " parameter " + testParameterName + " - composito singolo con speciale non-single  - " + dataTerm.getName());
				}
				if (dataDef instanceof QMultipleCompoundDataDef && !singleValue) {
					System.out.println("Command " + testCommandName + " parameter " + testParameterName + " - composito multiplo con speciale non-single - " + dataTerm.getName());
				}

				// append
				if (special != null) {
					appendSpecialValue(special, attributeNode, singleValue);
				}
				// cache for compound
				// else if (dataTerm.getDataType().isCompound()) {
				// specialCached =
				// QIntegratedLanguageCoreFactory.eINSTANCE.createSpecial();
				// appendSpecialValue(specialCached, attributeNode,
				// singleValue);
				// }
				// other
				else {
					special = QIntegratedLanguageDataTermFactory.eINSTANCE.createSpecial();
					appendSpecialValue(special, attributeNode, singleValue);
					dataTerm.getFacets().add(special);
				}
			}
			// Choice Program Text
			else if (attributeNode.getNodeName().equals(XML_TAG_CHOICE_PGM_TEXT)) {

			}
			// Choice Program Values
			else if (attributeNode.getNodeName().equals(XML_TAG_CHOICE_PGM_VALUES)) {

			}
			// Parameter controlled
			else if (attributeNode.getNodeName().equals(XML_TAG_PARAMETER_CTL)) {

			}
			// compound
			else if (attributeNode.getNodeName().equals(XML_TAG_ELEMENT) || attributeNode.getNodeName().equals(XML_TAG_QUALIFIER)) {

				// dataTerm
				DT d = buildDataTerm(attributeNode);
				compoundDataDef.getElements().add(d);
			} else {
				System.err.println("Unknown attribute parameter: " + attributeNode.getNodeName());
				continue;
			}

			// flush special to first
			/*
			 * if (specialCached != null&&
			 * !compoundDataDef.getElements().isEmpty()) { QDataTerm<DD>
			 * elementTerm = (QDataTerm<DD>)
			 * compoundDataDef.getElements().get(0);
			 * 
			 * QSpecial special = elementTerm.getFacet(QSpecial.class); if
			 * (special != null) special.getElements().addAll(0,
			 * specialCached.getElements()); else
			 * elementTerm.getFacets().add(specialCached);
			 * 
			 * specialCached = null; }
			 */
		}

		return (DT) dataTerm;
	}

	public static <D extends QBufferedData> void appendSpecialValue(QSpecial special, Node specialNode, boolean singleValue) {

		NodeList valueNodes = specialNode.getChildNodes();
		for (int y = 0; y < valueNodes.getLength(); y++) {
			Node valueNode = valueNodes.item(y);

			// value
			if (valueNode.getNodeName().equals(XML_TAG_VALUE)) {
				NamedNodeMap valueMap = valueNode.getAttributes();

				QSpecialElement specialElement = QIntegratedLanguageDataTermFactory.eINSTANCE.createSpecialElement();
				specialElement.setName(valueMap.getNamedItem("Val").getNodeValue().trim());
				if (valueMap.getNamedItem("MapTo") != null)
					// specialElement.setValue(valueMap.getNamedItem("MapTo").getNodeValue().trim());
					specialElement.setValue(conversionHexadecimal(valueMap.getNamedItem("MapTo").getNodeValue().trim()));
				if (singleValue) {
					// System.out.println("Single Value");
					specialElement.setUnary(singleValue);
				}

				special.getElements().add(specialElement);
			} else {
				System.err.println("Unknown value attribute: " + valueNode.getNodeName());
				continue;

			}
		}
	}

	/*
	 * private static <T extends QBufferedData> void
	 * updateElementDefinition(QDataStructureDefinition dataStructureDefinition,
	 * QBufferedDataDefinition<?> elementDefinition) {
	 * 
	 * if(elementDefinition instanceof QEnumDefinition) { QEnumDefinition<?>
	 * enumDefinition = (QEnumDefinition<?>)elementDefinition; int i=0;
	 * for(QSpecialTerm specialTerm: term.getGroupSpecial().getSpecials()) {
	 * QEnumElement enumElement = buildEnumElement(specialTerm);
	 * enumDefinition.getElements().add(i, enumElement); i++; } } else {
	 * QEnumDefinition<T> enumDefinition = (QEnumDefinition<T>)
	 * buildEnumDefinition(elementDefinition);
	 * dataStructureDefinition.setElement(1, enumDefinition); } }
	 */

	public static Number buildLength(String length) {

		if (length.endsWith(".0"))
			length = length.substring(0, length.lastIndexOf(".0"));

		Number l = 0;

		int count = countOccurrences(length, '.');
		switch (count) {
		case 0:
			l = Integer.parseInt(length);
			break;
		case 1:
			l = Float.parseFloat(length);
			break;
		default:
			l = Integer.parseInt(length.replaceAll("\\.", ""));
			break;
		}

		return l;
	}

	public static class XMLNameFilter implements FilenameFilter {
		@Override
		public boolean accept(File directory, String fileName) {
			return fileName.toUpperCase().endsWith(".XMI");
		}
	}

	public static String camelString(String text) {

		if (text == null)
			return "";

		text = text.replaceAll("'", "");
		text = text.replaceAll(",", " ");
		text = text.replaceAll("-", " ");
		text = text.replaceAll("%", " ");
		text = text.replaceAll("/", " ");
		StringTokenizer token = new StringTokenizer(text, " ");

		int aa = 0;
		text = "";
		String s = "";
		while (token.hasMoreTokens()) {
			s = token.nextToken(" ");
			if (aa == 0) {
				text = s.substring(0, 1).toLowerCase() + s.substring(1);
			} else {
				s = s.substring(0, 1).toUpperCase() + s.substring(1);
				text = text + s;
			}
			text = text.replaceAll("\\(", "");
			text = text.replaceAll("\\)", "");
			text = text.replaceAll("\\*", "");
			aa++;
		}
		return text;
	}

	private static void setLength(EObject eObject, String length) {

		EClass eClass = eObject.eClass();

		String[] tokens = length.split("\\.");

		if (eObject instanceof QHexadecimalDef) {
			eObject.eSet(eClass.getEStructuralFeature("length"), buildLength(tokens[0]));
		} else if (eObject instanceof QDecimalDef) {
			eObject.eSet(eClass.getEStructuralFeature("precision"), buildLength(tokens[0]));
			eObject.eSet(eClass.getEStructuralFeature("scale"), buildLength(tokens[1]));
		} else if (eObject instanceof QCharacterDef) {
			eObject.eSet(eClass.getEStructuralFeature("length"), buildLength(tokens[0]));
		} else
			System.err.println("Unknown definition with length: " + eObject);
	}

	public enum ParameterType implements Enumerator {
		/**
		 * The '<em><b>Decimal</b></em>' literal object. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see #DECIMAL_VALUE
		 * @generated
		 * @ordered
		 */
		DECIMAL(10, "Decimal", "DEC"),

		/**
		 * The '<em><b>Logical</b></em>' literal object. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see #LOGICAL_VALUE
		 * @generated
		 * @ordered
		 */
		LOGICAL(20, "Logical", "LGL"),

		/**
		 * The '<em><b>Character</b></em>' literal object. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see #CHARACTER_VALUE
		 * @generated
		 * @ordered
		 */
		CHARACTER(30, "Character", "CHAR"),

		/**
		 * The '<em><b>Name</b></em>' literal object. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see #NAME_VALUE
		 * @generated
		 * @ordered
		 */
		NAME(40, "Name", "NAME"),

		/**
		 * The '<em><b>Simple Name</b></em>' literal object. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see #SIMPLE_NAME_VALUE
		 * @generated
		 * @ordered
		 */
		SIMPLE_NAME(50, "SimpleName", "SNAME"),

		/**
		 * The '<em><b>Communications Name</b></em>' literal object. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see #COMMUNICATIONS_NAME_VALUE
		 * @generated
		 * @ordered
		 */
		COMMUNICATIONS_NAME(60, "CommunicationsName", "CNAME"),

		/**
		 * The '<em><b>Path Name</b></em>' literal object. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see #PATH_NAME_VALUE
		 * @generated
		 * @ordered
		 */
		PATH_NAME(70, "PathName", "PNAME"),

		/**
		 * The '<em><b>Generic</b></em>' literal object. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see #GENERIC_VALUE
		 * @generated
		 * @ordered
		 */
		GENERIC(80, "Generic", "GENERIC"),

		/**
		 * The '<em><b>Command String</b></em>' literal object. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see #COMMAND_STRING_VALUE
		 * @generated
		 * @ordered
		 */
		COMMAND_STRING(90, "CommandString", "CMDSTR"),

		/**
		 * The '<em><b>Date</b></em>' literal object. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see #DATE_VALUE
		 * @generated
		 * @ordered
		 */
		DATE(100, "Date", "DATE"),

		/**
		 * The '<em><b>Time</b></em>' literal object. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see #TIME_VALUE
		 * @generated
		 * @ordered
		 */
		TIME(110, "Time", "TIME"),

		/**
		 * The '<em><b>Hexadecimal</b></em>' literal object. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see #HEXADECIMAL_VALUE
		 * @generated
		 * @ordered
		 */
		HEXADECIMAL(120, "Hexadecimal", "HEX"),

		/**
		 * The '<em><b>Zero Element</b></em>' literal object. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see #ZERO_ELEMENT_VALUE
		 * @generated
		 * @ordered
		 */
		ZERO_ELEMENT(130, "ZeroElement", "ZEROELEM"),

		/**
		 * The '<em><b>Adapter</b></em>' literal object. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see #ADAPTER_VALUE
		 * @generated
		 * @ordered
		 */
		ADAPTER(140, "Adapter", "X"),

		/**
		 * The '<em><b>Integer2</b></em>' literal object. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see #INTEGER2_VALUE
		 * @generated
		 * @ordered
		 */
		INTEGER2(150, "Integer2", "INT2"),

		/**
		 * The '<em><b>Integer4</b></em>' literal object. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see #INTEGER4_VALUE
		 * @generated
		 * @ordered
		 */
		INTEGER4(160, "Integer4", "INT4"),

		/**
		 * The '<em><b>Unsigned Integer2</b></em>' literal object. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see #UNSIGNED_INTEGER2_VALUE
		 * @generated
		 * @ordered
		 */
		UNSIGNED_INTEGER2(170, "UnsignedInteger2", "UINT2"),

		/**
		 * The '<em><b>Unsigned Integer4</b></em>' literal object. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see #UNSIGNED_INTEGER4_VALUE
		 * @generated
		 * @ordered
		 */
		UNSIGNED_INTEGER4(180, "UnsignedInteger4", "UINT4"),

		/**
		 * The '<em><b>Varying Name</b></em>' literal object. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see #VARYING_NAME_VALUE
		 * @generated
		 * @ordered
		 */
		VARYING_NAME(190, "VaryingName", "VARNAME"),

		/**
		 * The '<em><b>Command</b></em>' literal object. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see #COMMAND_VALUE
		 * @generated
		 * @ordered
		 */
		COMMAND(200, "Command", "CMD"),

		/**
		 * The '<em><b>Null</b></em>' literal object. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see #NULL_VALUE
		 * @generated
		 * @ordered
		 */
		NULL(210, "Null", "NULL"),

		/**
		 * The '<em><b>Qualified</b></em>' literal object. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see #QUALIFIED_VALUE
		 * @generated
		 * @ordered
		 */
		QUALIFIED(220, "Qualified", "QUAL"),

		/**
		 * The '<em><b>Element</b></em>' literal object. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see #ELEMENT_VALUE
		 * @generated
		 * @ordered
		 */
		ELEMENT(230, "Element", "ELEM");

		/**
		 * The '<em><b>Decimal</b></em>' literal value. <!-- begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Decimal</b></em>' literal object isn't
		 * clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #DECIMAL
		 * @model name="Decimal" literal="DEC"
		 * @generated
		 * @ordered
		 */
		public static final int DECIMAL_VALUE = 10;

		/**
		 * The '<em><b>Logical</b></em>' literal value. <!-- begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Logical</b></em>' literal object isn't
		 * clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #LOGICAL
		 * @model name="Logical" literal="LGL"
		 * @generated
		 * @ordered
		 */
		public static final int LOGICAL_VALUE = 20;

		/**
		 * The '<em><b>Character</b></em>' literal value. <!-- begin-user-doc
		 * -->
		 * <p>
		 * If the meaning of '<em><b>Character</b></em>' literal object isn't
		 * clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #CHARACTER
		 * @model name="Character" literal="CHAR"
		 * @generated
		 * @ordered
		 */
		public static final int CHARACTER_VALUE = 30;

		/**
		 * The '<em><b>Name</b></em>' literal value. <!-- begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Name</b></em>' literal object isn't clear,
		 * there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #NAME
		 * @model name="Name" literal="NAME"
		 * @generated
		 * @ordered
		 */
		public static final int NAME_VALUE = 40;

		/**
		 * The '<em><b>Simple Name</b></em>' literal value. <!-- begin-user-doc
		 * -->
		 * <p>
		 * If the meaning of '<em><b>Simple Name</b></em>' literal object isn't
		 * clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #SIMPLE_NAME
		 * @model name="SimpleName" literal="SNAME"
		 * @generated
		 * @ordered
		 */
		public static final int SIMPLE_NAME_VALUE = 50;

		/**
		 * The '<em><b>Communications Name</b></em>' literal value. <!--
		 * begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Communications Name</b></em>' literal
		 * object isn't clear, there really should be more of a description
		 * here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #COMMUNICATIONS_NAME
		 * @model name="CommunicationsName" literal="CNAME"
		 * @generated
		 * @ordered
		 */
		public static final int COMMUNICATIONS_NAME_VALUE = 60;

		/**
		 * The '<em><b>Path Name</b></em>' literal value. <!-- begin-user-doc
		 * -->
		 * <p>
		 * If the meaning of '<em><b>Path Name</b></em>' literal object isn't
		 * clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #PATH_NAME
		 * @model name="PathName" literal="PNAME"
		 * @generated
		 * @ordered
		 */
		public static final int PATH_NAME_VALUE = 70;

		/**
		 * The '<em><b>Generic</b></em>' literal value. <!-- begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Generic</b></em>' literal object isn't
		 * clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #GENERIC
		 * @model name="Generic" literal="GENERIC"
		 * @generated
		 * @ordered
		 */
		public static final int GENERIC_VALUE = 80;

		/**
		 * The '<em><b>Command String</b></em>' literal value. <!--
		 * begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Command String</b></em>' literal object
		 * isn't clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #COMMAND_STRING
		 * @model name="CommandString" literal="CMDSTR"
		 * @generated
		 * @ordered
		 */
		public static final int COMMAND_STRING_VALUE = 90;

		/**
		 * The '<em><b>Date</b></em>' literal value. <!-- begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
		 * there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #DATE
		 * @model name="Date" literal="DATE"
		 * @generated
		 * @ordered
		 */
		public static final int DATE_VALUE = 100;

		/**
		 * The '<em><b>Time</b></em>' literal value. <!-- begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
		 * there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #TIME
		 * @model name="Time" literal="TIME"
		 * @generated
		 * @ordered
		 */
		public static final int TIME_VALUE = 110;

		/**
		 * The '<em><b>Hexadecimal</b></em>' literal value. <!-- begin-user-doc
		 * -->
		 * <p>
		 * If the meaning of '<em><b>Hexadecimal</b></em>' literal object isn't
		 * clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #HEXADECIMAL
		 * @model name="Hexadecimal" literal="HEX"
		 * @generated
		 * @ordered
		 */
		public static final int HEXADECIMAL_VALUE = 120;

		/**
		 * The '<em><b>Zero Element</b></em>' literal value. <!-- begin-user-doc
		 * -->
		 * <p>
		 * If the meaning of '<em><b>Zero Element</b></em>' literal object isn't
		 * clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #ZERO_ELEMENT
		 * @model name="ZeroElement" literal="ZEROELEM"
		 * @generated
		 * @ordered
		 */
		public static final int ZERO_ELEMENT_VALUE = 130;

		/**
		 * The '<em><b>Adapter</b></em>' literal value. <!-- begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Adapter</b></em>' literal object isn't
		 * clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #ADAPTER
		 * @model name="Adapter" literal="X"
		 * @generated
		 * @ordered
		 */
		public static final int ADAPTER_VALUE = 140;

		/**
		 * The '<em><b>Integer2</b></em>' literal value. <!-- begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Integer2</b></em>' literal object isn't
		 * clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #INTEGER2
		 * @model name="Integer2" literal="INT2"
		 * @generated
		 * @ordered
		 */
		public static final int INTEGER2_VALUE = 150;

		/**
		 * The '<em><b>Integer4</b></em>' literal value. <!-- begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Integer4</b></em>' literal object isn't
		 * clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #INTEGER4
		 * @model name="Integer4" literal="INT4"
		 * @generated
		 * @ordered
		 */
		public static final int INTEGER4_VALUE = 160;

		/**
		 * The '<em><b>Unsigned Integer2</b></em>' literal value. <!--
		 * begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Unsigned Integer2</b></em>' literal object
		 * isn't clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #UNSIGNED_INTEGER2
		 * @model name="UnsignedInteger2" literal="UINT2"
		 * @generated
		 * @ordered
		 */
		public static final int UNSIGNED_INTEGER2_VALUE = 170;

		/**
		 * The '<em><b>Unsigned Integer4</b></em>' literal value. <!--
		 * begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Unsigned Integer4</b></em>' literal object
		 * isn't clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #UNSIGNED_INTEGER4
		 * @model name="UnsignedInteger4" literal="UINT4"
		 * @generated
		 * @ordered
		 */
		public static final int UNSIGNED_INTEGER4_VALUE = 180;

		/**
		 * The '<em><b>Varying Name</b></em>' literal value. <!-- begin-user-doc
		 * -->
		 * <p>
		 * If the meaning of '<em><b>Varying Name</b></em>' literal object isn't
		 * clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #VARYING_NAME
		 * @model name="VaryingName" literal="VARNAME"
		 * @generated
		 * @ordered
		 */
		public static final int VARYING_NAME_VALUE = 190;

		/**
		 * The '<em><b>Command</b></em>' literal value. <!-- begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Command</b></em>' literal object isn't
		 * clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #COMMAND
		 * @model name="Command" literal="CMD"
		 * @generated
		 * @ordered
		 */
		public static final int COMMAND_VALUE = 200;

		/**
		 * The '<em><b>Null</b></em>' literal value. <!-- begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Null</b></em>' literal object isn't clear,
		 * there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #NULL
		 * @model name="Null" literal="NULL"
		 * @generated
		 * @ordered
		 */
		public static final int NULL_VALUE = 210;

		/**
		 * The '<em><b>Qualified</b></em>' literal value. <!-- begin-user-doc
		 * -->
		 * <p>
		 * If the meaning of '<em><b>Qualified</b></em>' literal object isn't
		 * clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #QUALIFIED
		 * @model name="Qualified" literal="QUAL"
		 * @generated
		 * @ordered
		 */
		public static final int QUALIFIED_VALUE = 220;

		/**
		 * The '<em><b>Element</b></em>' literal value. <!-- begin-user-doc -->
		 * <p>
		 * If the meaning of '<em><b>Element</b></em>' literal object isn't
		 * clear, there really should be more of a description here...
		 * </p>
		 * <!-- end-user-doc -->
		 * 
		 * @see #ELEMENT
		 * @model name="Element" literal="ELEM"
		 * @generated
		 * @ordered
		 */
		public static final int ELEMENT_VALUE = 230;

		/**
		 * An array of all the '<em><b>Parameter Type</b></em>' enumerators.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		private static final ParameterType[] VALUES_ARRAY = new ParameterType[] { DECIMAL, LOGICAL, CHARACTER, NAME, SIMPLE_NAME, COMMUNICATIONS_NAME, PATH_NAME, GENERIC, COMMAND_STRING, DATE,
				TIME, HEXADECIMAL, ZERO_ELEMENT, ADAPTER, INTEGER2, INTEGER4, UNSIGNED_INTEGER2, UNSIGNED_INTEGER4, VARYING_NAME, COMMAND, NULL, QUALIFIED, ELEMENT, };

		/**
		 * A public read-only list of all the '<em><b>Parameter Type</b></em>'
		 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final List<ParameterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

		/**
		 * Returns the '<em><b>Parameter Type</b></em>' literal with the
		 * specified literal value. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		public static ParameterType get(String literal) {
			for (int i = 0; i < VALUES_ARRAY.length; ++i) {
				ParameterType result = VALUES_ARRAY[i];
				if (result.toString().equals(literal)) {
					return result;
				}
			}
			return null;
		}

		/**
		 * Returns the '<em><b>Parameter Type</b></em>' literal with the
		 * specified name. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static ParameterType getByName(String name) {
			for (int i = 0; i < VALUES_ARRAY.length; ++i) {
				ParameterType result = VALUES_ARRAY[i];
				if (result.getName().equals(name)) {
					return result;
				}
			}
			return null;
		}

		/**
		 * Returns the '<em><b>Parameter Type</b></em>' literal with the
		 * specified integer value. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		public static ParameterType get(int value) {
			switch (value) {
			case DECIMAL_VALUE:
				return DECIMAL;
			case LOGICAL_VALUE:
				return LOGICAL;
			case CHARACTER_VALUE:
				return CHARACTER;
			case NAME_VALUE:
				return NAME;
			case SIMPLE_NAME_VALUE:
				return SIMPLE_NAME;
			case COMMUNICATIONS_NAME_VALUE:
				return COMMUNICATIONS_NAME;
			case PATH_NAME_VALUE:
				return PATH_NAME;
			case GENERIC_VALUE:
				return GENERIC;
			case COMMAND_STRING_VALUE:
				return COMMAND_STRING;
			case DATE_VALUE:
				return DATE;
			case TIME_VALUE:
				return TIME;
			case HEXADECIMAL_VALUE:
				return HEXADECIMAL;
			case ZERO_ELEMENT_VALUE:
				return ZERO_ELEMENT;
			case ADAPTER_VALUE:
				return ADAPTER;
			case INTEGER2_VALUE:
				return INTEGER2;
			case INTEGER4_VALUE:
				return INTEGER4;
			case UNSIGNED_INTEGER2_VALUE:
				return UNSIGNED_INTEGER2;
			case UNSIGNED_INTEGER4_VALUE:
				return UNSIGNED_INTEGER4;
			case VARYING_NAME_VALUE:
				return VARYING_NAME;
			case COMMAND_VALUE:
				return COMMAND;
			case NULL_VALUE:
				return NULL;
			case QUALIFIED_VALUE:
				return QUALIFIED;
			case ELEMENT_VALUE:
				return ELEMENT;
			}
			return null;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		private final int value;

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		private final String name;

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		private final String literal;

		/**
		 * Only this class can construct instances. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		private ParameterType(int value, String name, String literal) {
			this.value = value;
			this.name = name;
			this.literal = literal;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public int getValue() {
			return value;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public String getName() {
			return name;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public String getLiteral() {
			return literal;
		}

		/**
		 * Returns the literal value of the enumerator, which is its string
		 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		public String toString() {
			return literal;
		}
	}

	public static Document loadDocument(java.io.InputStream input) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		return builder.parse(input);
	}

	public static int countOccurrences(String haystack, char needle) {
		int count = 0;
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle)
				count++;
		}
		return count;
	}

	public static String conversionHexadecimal(String inputHex) {		
		return inputHex;
	}

}