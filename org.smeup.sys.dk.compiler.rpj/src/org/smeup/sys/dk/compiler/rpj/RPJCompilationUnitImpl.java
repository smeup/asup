/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi				- Initial API and implementation
 */
package org.smeup.sys.dk.compiler.rpj;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.smeup.sys.db.esql.QCursorTerm;
import org.smeup.sys.db.esql.QStatementTerm;
import org.smeup.sys.dk.compiler.CaseSensitiveType;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QDevelopmentKitCompilerFactory;
import org.smeup.sys.dk.compiler.impl.CompilationUnitImpl;
import org.smeup.sys.il.core.QNameable;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.meta.QCardinality;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaFactory;
import org.smeup.sys.il.core.term.QNamedNode;
import org.smeup.sys.il.core.term.QNode;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.def.QArrayDef;
import org.smeup.sys.il.data.def.QBufferDef;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QDataAreaDef;
import org.smeup.sys.il.data.def.QDatetimeDef;
import org.smeup.sys.il.data.def.QDecimalDef;
import org.smeup.sys.il.data.def.QIndicatorDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.il.data.def.QPointerDef;
import org.smeup.sys.il.data.term.DataTermType;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QRemap;
import org.smeup.sys.il.esam.QDataSet;
import org.smeup.sys.il.esam.QDataSetTerm;
import org.smeup.sys.il.esam.QDisplayTerm;
import org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage;
import org.smeup.sys.il.esam.QKeyListTerm;
import org.smeup.sys.il.esam.QPrintTerm;
import org.smeup.sys.il.flow.QCallableUnit;
import org.smeup.sys.il.flow.QEntry;
import org.smeup.sys.il.flow.QEntryParameter;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowFactory;
import org.smeup.sys.il.flow.QModule;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QProgram;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.il.flow.QRoutine;
import org.smeup.sys.os.file.QExternalFile;
import org.smeup.sys.os.file.QFileFormat;

public class RPJCompilationUnitImpl extends CompilationUnitImpl {

	private QContext context;
	private QNameable node;

	private QCompilationUnit parentUnit;
	private List<QCompilationUnit> childUnits;
	private CaseSensitiveType caseSensitive;

	private List<QDataSetTerm> dataSets;
	private List<QKeyListTerm> keyLists;
	private List<QCursorTerm> cursors;
	private List<QStatementTerm> statements;
	private List<QDisplayTerm> displays;
	private List<QPrintTerm> printers;
	private List<QRoutine> routines;
	private List<QProcedure> procedures;
	private List<QPrototype> prototypes;

	private Map<String, QDataTerm<?>> cachedTerms = new HashMap<String, QDataTerm<?>>();
	private Map<String, QPrototype> cachedPrototypes = new HashMap<String, QPrototype>();
	private ArrayList<String> reservedKeywords = new ArrayList<String>(Arrays.asList("INT", "FOR", "CHAR", "IF", "BREAK", "TRUE", "FALSE", "DO", "FINAL", "DEFAULT", "ENUM", "CALL", "DOUBLE", "IMPORT", "NEW", "SWITCH", "VOID", "ELSE","QIN"));
	// QIN --> C5005_IN
	public RPJCompilationUnitImpl(QContext context, QNameable node, QCompilationUnit parentUnit, List<QCompilationUnit> childUnits, CaseSensitiveType caseSensitive) {

		this.context = context;
		this.parentUnit = parentUnit;
		this.childUnits = childUnits;
		this.caseSensitive = caseSensitive;
		this.node = node;
		this.setTrashCan(QDevelopmentKitCompilerFactory.eINSTANCE.createCompilationTrashCan());

		if (node instanceof QCallableUnit) {
			QCallableUnit callableUnit = (QCallableUnit) node;

			if (callableUnit.getFileSection() != null) {
				dataSets = callableUnit.getFileSection().getDataSets();
				keyLists = callableUnit.getFileSection().getKeyLists();
				cursors = callableUnit.getFileSection().getCursors();
				statements = callableUnit.getFileSection().getStatements();
				displays = callableUnit.getFileSection().getDisplays();
				printers = callableUnit.getFileSection().getPrinters();
			}

			if (callableUnit.getFlowSection() != null) {
				routines = callableUnit.getFlowSection().getRoutines();
				procedures = callableUnit.getFlowSection().getProcedures();
				prototypes = callableUnit.getFlowSection().getPrototypes();
			}
		}

		if (dataSets == null)
			dataSets = new ArrayList<QDataSetTerm>();
		if (prototypes == null)
			prototypes = new ArrayList<QPrototype>();
		if (keyLists == null)
			keyLists = new ArrayList<QKeyListTerm>();
		if (cursors == null)
			cursors = new ArrayList<QCursorTerm>();
		if (statements == null)
			statements = new ArrayList<QStatementTerm>();
		if (displays == null)
			displays = new ArrayList<QDisplayTerm>();
		if (printers == null)
			printers = new ArrayList<QPrintTerm>();
		if (routines == null)
			routines = new ArrayList<QRoutine>();
		if (procedures == null)
			procedures = new ArrayList<QProcedure>();

		refresh();
	}

	@Override
	public void refresh() {

		this.cachedTerms = new HashMap<String, QDataTerm<?>>();
		this.cachedPrototypes = new HashMap<String, QPrototype>();
	}

	@Override
	public QDataSetTerm getDataSet(String name, boolean deep) {

		QDataSetTerm dataSetTerm = null;

		for (QDataSetTerm d : dataSets)
			if (equalsTermName(d.getFormatName(), name) || equalsTermName(d.getName(), name)) {
				dataSetTerm = d;
				break;
			}

		// deep search
		if (dataSetTerm == null && deep)
			for (QCompilationUnit compilationUnit : this.childUnits) {
				dataSetTerm = compilationUnit.getDataSet(name, true);

				if (dataSetTerm != null)
					break;
			}

		if (dataSetTerm == null && this.parentUnit != null && deep)
			dataSetTerm = this.parentUnit.getDataSet(name, deep);

		return dataSetTerm;
	}

	@Override
	public QKeyListTerm getKeyList(String name, boolean deep) {

		QKeyListTerm keyListTerm = null;

		for (QKeyListTerm k : keyLists)
			if (equalsTermName(k.getName(), name)) {
				keyListTerm = k;
				break;
			}

		// deep search
		if (keyListTerm == null && deep)
			for (QCompilationUnit compilationUnit : this.childUnits) {
				keyListTerm = compilationUnit.getKeyList(name, true);

				if (keyListTerm != null)
					break;
			}

		if (keyListTerm == null && this.parentUnit != null && deep)
			keyListTerm = this.parentUnit.getKeyList(name, deep);

		return keyListTerm;

	}

	@Override
	public QDataTerm<?> getDataTerm(String name, boolean deep) {

		QDataTerm<?> dataTerm = cachedTerms.get(normalizeTermName(name));
		if (dataTerm != null)
			return dataTerm;

		QCallableUnit callableUnit = (QCallableUnit) getNode();

		// search on dataTermContainer
		if (dataTerm == null && callableUnit.getDataSection() != null)
			dataTerm = findData(callableUnit.getDataSection().getDatas(), name, null, 0);

		if (dataTerm == null && callableUnit instanceof QProcedure) {
			QProcedure qProcedure = (QProcedure) callableUnit;

			if (qProcedure.getEntry() != null)
				for (QEntryParameter<?> entryParameter : qProcedure.getEntry().getParameters())
					if (equalsTermName(entryParameter.getName(), name)) {
						dataTerm = (QDataTerm<?>) entryParameter.getDelegate();
						break;
					}
		}

		// deep search on module
		if (dataTerm == null && deep) {

			for (QCompilationUnit compilationUnit : this.childUnits)

				// module prefix before
				if (name.toUpperCase().startsWith(compilationUnit.getNode().getName())) {
					dataTerm = compilationUnit.getDataTerm(name, true);

					if (dataTerm != null)
						break;
				}

			// other modules
			if (dataTerm == null)
				for (QCompilationUnit compilationUnit : this.childUnits) {
					if (name.toUpperCase().startsWith(compilationUnit.getNode().getName()))
						continue;

					dataTerm = compilationUnit.getDataTerm(name, true);

					if (dataTerm != null)
						break;
				}
		}

		if (dataTerm == null && this.parentUnit != null && deep)
			dataTerm = this.parentUnit.getDataTerm(name, deep);

		// search on dataSet
		if (dataTerm == null) {

			List<QDataSetTerm> renamedFiles = new ArrayList<QDataSetTerm>();

			for (QDataSetTerm dataSetTerm : dataSets) {

				QExternalFile externalFile = dataSetTerm.getFacet(QExternalFile.class);

				if (externalFile == null && dataSetTerm.getFormatName() != null && !dataSetTerm.getFormatName().isEmpty()) {
					renamedFiles.add(dataSetTerm);
					continue;
				}

				if (externalFile != null && !externalFile.getFormat().equals(dataSetTerm.getFormatName())) {
					renamedFiles.add(dataSetTerm);
					continue;
				}

				if (dataSetTerm.getFormat() == null)
					continue;

				// search on primary dataSet
				dataTerm = findDataTerm(dataSetTerm.getFormat().getDefinition(), name);

				if (dataTerm != null)
					break;
			}

			// search on renamed dataSet
			if (dataTerm == null)
				for (QDataSetTerm dataSetTerm : renamedFiles) {
					if (dataSetTerm.getFormat() == null)
						continue;

					if (equalsTermName(dataSetTerm.getFormatName(), name)) {
						dataTerm = dataSetTerm.getFormat();
						break;
					}

					dataTerm = findDataTerm(dataSetTerm.getFormat().getDefinition(), name);
					if (dataTerm != null)
						break;
				}

		}

		// search on display
		if (dataTerm == null)
			for (QDisplayTerm displayTerm : displays) {
				if (displayTerm.getFormat() == null)
					continue;

				dataTerm = findDataTerm(displayTerm.getFormat().getDefinition(), name);
				if (dataTerm != null)
					break;
			}

		// search on printers
		if (dataTerm == null)
			for (QPrintTerm printTerm : printers) {
				if (printTerm.getFormat() == null)
					continue;

				dataTerm = findDataTerm(printTerm.getFormat().getDefinition(), name);
				if (dataTerm != null)
					break;
			}

		if (dataTerm != null)
			cachedTerms.put(normalizeTermName(name), dataTerm);

		return dataTerm;
	}

	@Override
	public QDisplayTerm getDisplay(String name, boolean deep) {

		QDisplayTerm displayTerm = null;

		for (QDisplayTerm d : displays)
			if (equalsTermName(d.getName(), name)) {
				displayTerm = d;
				break;
			}

		// deep search
		if (displayTerm == null && deep)
			for (QCompilationUnit compilationUnit : this.childUnits) {
				displayTerm = compilationUnit.getDisplay(name, true);

				if (displayTerm != null)
					break;
			}

		if (displayTerm == null && this.parentUnit != null && deep)
			displayTerm = this.parentUnit.getDisplay(name, deep);

		return displayTerm;
	}

	@Override
	public QPrintTerm getPrinter(String name, boolean deep) {

		QPrintTerm printerTerm = null;

		for (QPrintTerm d : printers)
			if (equalsTermName(d.getName(), name)) {
				printerTerm = d;
				break;
			}

		// deep search
		if (printerTerm == null && deep)
			for (QCompilationUnit compilationUnit : this.childUnits) {
				printerTerm = compilationUnit.getPrinter(name, true);

				if (printerTerm != null)
					break;
			}

		if (printerTerm == null && this.parentUnit != null && deep)
			printerTerm = this.parentUnit.getPrinter(name, deep);

		return printerTerm;
	}

	@SuppressWarnings("unchecked")
	private QDataTerm<?> findDataTerm(QCompoundDataDef<?, ?> compoundDataDef, String name) {

		if (compoundDataDef == null)
			return null;

		QDataTerm<?> dataTerm = null;

		if (compoundDataDef.getPrefix() != null) {
			String[] tokens = compoundDataDef.getPrefix().split("\\:");
			String pfx = tokens[0];
			int pos = 1;
			if (tokens.length > 1)
				pos = Integer.parseInt(tokens[1]);
			else
			//	pos = pfx.length();
				pos = 0;

			dataTerm = findData((List<QDataTerm<?>>) compoundDataDef.getElements(), name, pfx, pos);
		} else
			dataTerm = findData((List<QDataTerm<?>>) compoundDataDef.getElements(), name, null, 0);

		return dataTerm;
	}

	@SuppressWarnings("unchecked")
	private QDataTerm<?> findData(List<QDataTerm<?>> dataTerms, String name, String prefix, int position) {

		if (name.contains("("))
			name = name.substring(0, name.indexOf("("));

		QDataTerm<?> dataTerm = null;

		for (QDataTerm<?> child : new ArrayList<QDataTerm<?>>(dataTerms)) {
			String childName = null;

			// remap
			QRemap remap = child.getFacet(QRemap.class);
			if (remap != null) {
				if (remap.getIndex() != null && !remap.getIndex().isEmpty())
					childName = remap.getName();
				else
					childName = remap.getName();
			} else
				childName = child.getName();

			// prefix
			if (prefix != null)
				childName = prefix + childName.substring(position);

			// qualified
			if (equalsTermName(getQualifiedName(child), name))
				dataTerm = child;
			// atomic
			else if (equalsTermName(childName, name))
				dataTerm = child;
			// compound
			else if (child.getDataTermType().isCompound()) {
				QDataTerm<QCompoundDataDef<?, ?>> compoundDataTerm = (QDataTerm<QCompoundDataDef<?, ?>>) child;

				String tempName = name;

				QCompoundDataDef<?, QDataTerm<?>> compoundDataDef = null;
				if (child.getDefinition() instanceof QDataAreaDef) {
					QDataAreaDef<?> dataAreaDef = (QDataAreaDef<?>) child.getDefinition();
					compoundDataDef = (QCompoundDataDef<?, QDataTerm<?>>) dataAreaDef.getArgument();
				} else
					compoundDataDef = (QCompoundDataDef<?, QDataTerm<?>>) compoundDataTerm.getDefinition();

				if (compoundDataDef.isQualified()) {
					if (dataTerm != null)
						break;
					String[] tokens = name.split("\\.");
					if (tokens.length <= 1)
						continue;

					tempName = null;
					for (int i = 1; i < tokens.length; i++)
						if (tempName != null)
							tempName = tempName + "." + tokens[i];
						else
							tempName = tokens[i];
				}

				if (compoundDataDef.getPrefix() != null) {
					String[] tokens = compoundDataDef.getPrefix().split("\\:");
					String pfx = tokens[0];
					int pos = 0;
					if (tokens.length > 1)
						pos = Integer.parseInt(tokens[1]);
					else
						pos = 0;

					dataTerm = findData(compoundDataDef.getElements(), tempName, pfx, pos);
				} else
					dataTerm = findData(compoundDataDef.getElements(), tempName, null, 0);

				if (dataTerm == null && equalsTermName(childName, tempName))
					dataTerm = child;
			}

			if (dataTerm != null)
				break;
		}

		return dataTerm;
	}

	@Override
	public QProcedure getProcedure(String name, boolean deep) {

		QProcedure procedure = null;

		for (QProcedure p : procedures)
			if (equalsTermName(p.getName(), name)) {
				procedure = p;
				break;
			}

		// deep search
		if (procedure == null && deep)
			for (QCompilationUnit compilationUnit : this.childUnits) {

				procedure = compilationUnit.getProcedure(name, true);

				if (procedure != null)
					break;
			}

		if (procedure == null && this.parentUnit != null && deep)
			procedure = this.parentUnit.getProcedure(name, deep);

		return procedure;
	}

	@Override
	public QModule getModule(String name, boolean deep) {

		QModule module = null;

		for (QCompilationUnit compilationUnit : this.childUnits)
			if (compilationUnit.getNode() instanceof QModule)
				if (equalsTermName(compilationUnit.getNode().getName(), name)) {
					module = (QModule) compilationUnit.getNode();
					break;
				}

		// deep search
		if (module == null && deep)
			for (QCompilationUnit compilationUnit : this.childUnits) {

				module = compilationUnit.getModule(name, true);

				if (module != null)
					break;
			}

		if (module == null && this.parentUnit != null && deep)
			module = this.parentUnit.getModule(name, deep);

		return module;
	}

	@Override
	public QPrototype getPrototype(String name, boolean deep) {

		QPrototype prototype = cachedPrototypes.get(name);
		if (prototype != null)
			return prototype;

		for (QPrototype p : prototypes)
			if (equalsTermName(p.getName(), name)) {
				prototype = p;
				break;
			}

		// deep search
		if (prototype == null && deep)
			for (QCompilationUnit compilationUnit : this.childUnits) {
				prototype = compilationUnit.getPrototype(name, true);

				if (prototype != null)
					break;
			}

		if (prototype == null && this.parentUnit != null && deep)
			prototype = this.parentUnit.getPrototype(name, deep);

		if (prototype != null)
			cachedPrototypes.put(name, prototype);

		return prototype;
	}

	@Override
	public QRoutine getRoutine(String name, boolean deep) {

		QRoutine routine = null;

		for (QRoutine r : routines)
			if (equalsTermName(r.getName(), name)) {
				routine = r;
				break;
			}

		// deep search
		if (routine == null && deep)
			for (QCompilationUnit compilationUnit : this.childUnits) {

				routine = compilationUnit.getRoutine(name, true);

				if (routine != null)
					break;
			}

		if (routine == null && this.parentUnit != null && deep)
			routine = this.parentUnit.getRoutine(name, deep);

		return routine;
	}

	@Override
	public QCursorTerm getCursor(String name, boolean deep) {

		QCursorTerm cursorTerm = null;

		for (QCursorTerm c : cursors)
			if (equalsTermName(c.getName(), name)) {
				cursorTerm = c;
				break;
			}

		// deep search
		if (cursorTerm == null && deep)
			for (QCompilationUnit compilationUnit : this.childUnits) {
				cursorTerm = compilationUnit.getCursor(name, true);

				if (cursorTerm != null)
					break;
			}

		if (cursorTerm == null && this.parentUnit != null && deep)
			cursorTerm = this.parentUnit.getCursor(name, deep);

		return cursorTerm;
	}

	@Override
	public QStatementTerm getStatement(String name, boolean deep) {

		QStatementTerm statementTerm = null;

		for (QStatementTerm s : statements)
			if (equalsTermName(s.getName(), name)) {
				statementTerm = s;
				break;
			}

		// deep search
		if (statementTerm == null && deep)
			for (QCompilationUnit compilationUnit : this.childUnits) {
				statementTerm = compilationUnit.getStatement(name, true);

				if (statementTerm != null)
					break;
			}

		if (statementTerm == null && this.parentUnit != null && deep)
			statementTerm = this.parentUnit.getStatement(name, deep);

		return statementTerm;
	}

	@Override
	public QNamedNode getNamedNode(String name, boolean deep) {

		String order = null;

		// search optimization

		// data
		if (name.startsWith("*"))
			order = "DPTMCSFK";
		// prototype
		else if (name.startsWith("%"))
			order = "PTDMCSFK";
		// other
		else
			// order = "MCSFKPDT";
			order = "CSFKDPTM";

		QNamedNode namedNode = getNamedNode(name, deep, order);

		return namedNode;
	}

	private QNamedNode getNamedNode(String name, boolean deep, String order) {

		QNamedNode namedNode = null;

		for (char c : order.toCharArray()) {

			switch (c) {

			// dataTerm
			case 'D':
				namedNode = getDataTerm(name, deep);
				break;
			// prototype
			case 'P':
				namedNode = getPrototype(name, deep);
				break;
			// method
			case 'T':
				// namedNode = getMethod(null, name);
				break;
			// module
			case 'M':
				namedNode = getModule(name, deep);
				break;
			// cursor
			case 'C':
				namedNode = getCursor(name, deep);
				break;
			// statement
			case 'S':
				namedNode = getStatement(name, deep);
				break;
			// file
			case 'F':
				namedNode = getDataSet(name, deep);
				if (namedNode == null)
					namedNode = getDisplay(name, deep);
				if (namedNode == null)
					namedNode = getPrinter(name, deep);
				break;
			// keyList
			case 'K':
				namedNode = getKeyList(name, deep);
				break;

			}

			if (namedNode != null)
				break;

		}

		return namedNode;
	}

	@Override
	public String normalizeLabelName(String name) {
		return normalizeTermName(name).toUpperCase();
	}

	@Override
	public String normalizeTermName(String name) {

		if (name == null)
			return null;

		// reserved keywords
		if (reservedKeywords.contains(name.toUpperCase()))
			name = name.trim() + "_";

		StringBuffer nameBuffer = new StringBuffer();

		boolean firstToUpper = false;
		boolean allToUpper = false;

		for (char c : name.toCharArray())
			if (c == '§')
				nameBuffer.append('ç');
			else if (c == '&') {
				// nameBuffer.append('');
			} else if (c == '%') {
				nameBuffer.append('q');
				firstToUpper = true;
			} else if (c == '*') {
				nameBuffer.append('q');
				allToUpper = true;
			} else {

				if (firstToUpper || allToUpper)
					nameBuffer.append(Character.toUpperCase(c));
				else
					switch (getCaseSensitive()) {
					case IGNORE:
						nameBuffer.append(c);
						break;
					case LOWER:
						nameBuffer.append(Character.toLowerCase(c));
						break;
					case UPPER:
						nameBuffer.append(Character.toUpperCase(c));
						break;
					}

				firstToUpper = false;
			}

		return nameBuffer.toString();
	}

	@Override
	public String normalizeModuleName(String name) {

		String moduleName = null;
		if (!name.startsWith("*"))
			moduleName = Character.toString(name.charAt(0)) + Character.toUpperCase(name.charAt(1)) + normalizeTermName(name.substring(2));
		else
			moduleName = normalizeTermName(name);

		return moduleName;
	}

	@Override
	public String normalizeRoutineName(String name) {
		return normalizeTermName(name);
	}

	@Override
	public boolean equalsTermName(String source, String target) {

		if (source == null)
			if (target == null)
				return true;
			else
				return false;
		else if (target == null)
			return false;

		if (normalizeTermName(source).toLowerCase().equals(normalizeTermName(target).toLowerCase()))
			return true;
		else
			return false;

	}

	@Override
	public String normalizeTypeName(String name) {

		// special
		if (name.startsWith("*"))
			name = name.substring(1).toUpperCase();

		StringBuffer s = new StringBuffer(name.length());
		CharacterIterator it = new StringCharacterIterator(name);
		for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next())
			if (ch == '§')
				s.append('ç');
			else
				s.append(ch);
		name = s.toString();

		return name.toUpperCase();
	}

	@Override
	public String normalizeTypeName(QDataTerm<?> dataTerm) {

		String name = normalizeTypeName(dataTerm.getName());

		// multiple
		if (dataTerm.getDataTermType().isMultiple() && name.endsWith("s"))
			name = removeLastChar(name);

		return name;
	}

	@Override
	public QNameable getNode() {
		return this.node;
	}

	@Override
	public CaseSensitiveType getCaseSensitive() {
		return this.caseSensitive;
	}

	private String removeLastChar(String str) {
		if (str.length() == 0)
			return str;
		if (str.length() == 1)
			return "";

		return str.substring(0, str.length() - 1);
	}

	@Override
	public QContext getContext() {
		return this.context;
	}

	@Override
	public List<QCompilationUnit> getChildCompilationUnits() {
		return new ArrayList<QCompilationUnit>(this.childUnits);
	}

	@Override
	public void close() {
		getContext().close();
	}

	@Override
	public QPrototype getMethod(Class<?> target, String name) {

		if (target == null)
			System.err.println("method:" + name);

		QPrototype prototype = null;

		EPackage ePackage = null;
		if (QDataSet.class.isAssignableFrom(target))
			ePackage = QIntegratedLanguageEsamPackage.eINSTANCE;
		else
			ePackage = QIntegratedLanguageDataPackage.eINSTANCE;

		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			if (!(eClassifier instanceof EClass))
				continue;

			EClass eClass = (EClass) eClassifier;
			if (target != null && !target.getSimpleName().equals("Q" + eClass.getName()))
				continue;

			for (EOperation eOperation : eClass.getEAllOperations()) {

				if (!eOperation.getName().startsWith("q"))
					continue;

				if (!eOperation.getName().equalsIgnoreCase(normalizeTermName(name)))
					continue;

				if (eOperation.getEType() == null)
					continue;

				if (prototype != null && prototype.getEntry() != null && prototype.getEntry().getParameters().size() >= eOperation.getEParameters().size())
					continue;

				prototype = QIntegratedLanguageFlowFactory.eINSTANCE.createPrototype();
				prototype.setName(name);

				if (eOperation.getEType().equals(QIntegratedLanguageDataPackage.eINSTANCE.getIndicator())) {
					QIndicatorDef indicatorDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createIndicatorDef();
					prototype.setDefinition(indicatorDef);
				} else if (eOperation.getEType().equals(QIntegratedLanguageDataPackage.eINSTANCE.getCharacter())
						|| eOperation.getEType().equals(QIntegratedLanguageDataPackage.eINSTANCE.getString())) {
					QCharacterDef characterDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
					prototype.setDefinition(characterDef);
				} else if (eOperation.getEType().equals(QIntegratedLanguageDataPackage.eINSTANCE.getNumeric())) {
					QDecimalDef decimalDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createDecimalDef();
					prototype.setDefinition(decimalDef);
				} else if (eOperation.getEType().equals(QIntegratedLanguageDataPackage.eINSTANCE.getDecimal())) {
					QDecimalDef decimalDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createDecimalDef();
					prototype.setDefinition(decimalDef);
				} else if (eOperation.getEType().equals(QIntegratedLanguageDataPackage.eINSTANCE.getArray())) {
					QArrayDef<?> arrayDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createArrayDef();
					QBufferDef bufferDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createBufferDef();
					arrayDef.setArgument(bufferDef);
					prototype.setDefinition(arrayDef);
				} else if (eOperation.getEType().equals(QIntegratedLanguageDataPackage.eINSTANCE.getPointer())) {
					QPointerDef pointerDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createPointerDef();
					prototype.setDefinition(pointerDef);
				} else if (eOperation.getEType().equals(QIntegratedLanguageDataPackage.eINSTANCE.getDatetime())) {
					QDatetimeDef datetimeDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createDatetimeDef();
					prototype.setDefinition(datetimeDef);
				} else {
					prototype = null;
					continue;
				}

				QCardinality cardinality = QIntegratedLanguageCoreMetaFactory.eINSTANCE.createCardinality();
				cardinality.setMin(eOperation.getLowerBound());
				cardinality.setMax(eOperation.getUpperBound());
				prototype.setCardinality(cardinality);

				prototype.setText(eOperation.getName() + " text");

				if (!eOperation.getEParameters().isEmpty()) {
					QEntry entry = QIntegratedLanguageFlowFactory.eINSTANCE.createEntry();
					prototype.setEntry(entry);

					for (@SuppressWarnings("unused")
					EParameter eParameter : eOperation.getEParameters()) {
						QEntryParameter<?> entryParameter = QIntegratedLanguageFlowFactory.eINSTANCE.createEntryParameter();
						// TODO
						entry.getParameters().add(entryParameter);
					}
				}
				// break;
			}

			if (prototype != null)
				break;
		}
		return prototype;
	}

	@Override
	public String getQualifiedName(QNamedNode namedNode) {

		String name = null;

		if (namedNode instanceof QModule)
			name = normalizeModuleName(namedNode.getName());
		else if (namedNode instanceof QDataSetTerm) {
			QDataSetTerm dataSetTerm = (QDataSetTerm) namedNode;
			if (dataSetTerm.getFormatName() != null)
				name = normalizeTermName(dataSetTerm.getFormatName());
			else
				name = normalizeTermName(dataSetTerm.getName());
		} else
			name = normalizeTermName(namedNode.getName());

		QNode node = namedNode;

		while (node.isChild()) {
			node = node.getParent();

			if (node.equals(getNode()))
				break;

			if (this.parentUnit != null && node.equals(this.parentUnit.getNode()))
				break;

			if (node instanceof QDataTerm<?>) {
				QDataTerm<?> dataTerm = (QDataTerm<?>) node;
				if (dataTerm.getDataTermType() == DataTermType.MULTIPLE_COMPOUND)
					name = "current()." + name;
				else if (dataTerm.getDefinition() instanceof QDataAreaDef)
					name = "get()." + name;
				else if (dataTerm instanceof QFileFormat)
					name = "get()." + name;
				else if (dataTerm.getName() == null || dataTerm.getName().isEmpty())
					continue;
			}

			if (node instanceof QDisplayTerm)
				name = "get()." + name;

			if (node instanceof QPrintTerm)
				name = "get()." + name;

			if (node instanceof QProgram)
				continue;

			if (node instanceof QProcedure)
				continue;

			if (node instanceof QPrototype)
				continue;

			if (node instanceof QEntry)
				continue;

			if (node instanceof QFileFormat)
				continue;

			if (node instanceof QEntryParameter<?>)
				continue;

			if (!(node instanceof QNamedNode))
				continue;

			QNamedNode namedParentNode = (QNamedNode) node;

			if (namedParentNode instanceof QModule)
				name = normalizeModuleName(namedParentNode.getName()) + "." + name;
			else if (namedParentNode instanceof QDataSetTerm) {
				QDataSetTerm dataSetTerm = (QDataSetTerm) namedParentNode;
				if (dataSetTerm.getFormatName() != null)
					name = normalizeTermName(dataSetTerm.getFormatName()) + "." + name;
				else
					name = normalizeTermName(dataSetTerm.getName()) + "." + name;
			} else
				name = normalizeTermName(namedParentNode.getName()) + "." + name;
		}

		return name;
	}

	@Override
	public QCompilationUnit getParentUnit() {
		return this.parentUnit;
	}
}
