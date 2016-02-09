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
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.il.data.def.QPointerDef;
import org.smeup.sys.il.data.term.DataTermType;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QRemap;
import org.smeup.sys.il.esam.QDataSetTerm;
import org.smeup.sys.il.esam.QDisplayTerm;
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
	protected List<QCompilationUnit> childUnits;
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
	private ArrayList<String> reservedKeywords = new ArrayList<String>(Arrays.asList("INT", "FOR", "CHAR", "IF", "BREAK"));

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

		if (dataTerm == null && getNode() instanceof QProcedure) {
			QProcedure qProcedure = (QProcedure) getNode();

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
				if (name.toUpperCase().startsWith(compilationUnit.getNode().getName())) {
					dataTerm = compilationUnit.getDataTerm(name, true);

					if (dataTerm != null)
						break;
				}

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
	public Map<String, QDataTerm<?>> getDataTerms(boolean deep) {

		cachedTerms = new HashMap<String, QDataTerm<?>>();

		QCallableUnit callableUnit = (QCallableUnit) getNode();

		// search on dataTermContainer
		if (callableUnit.getDataSection() != null)
			for (QDataTerm<?> dataTerm : callableUnit.getDataSection().getDatas())
				registerData(cachedTerms, dataTerm);

		if (getNode() instanceof QProcedure) {
			QProcedure qProcedure = (QProcedure) getNode();

			for (QEntryParameter<?> entryParameter : qProcedure.getEntry().getParameters()) {

				QDataTerm<?> dataTerm = (QDataTerm<?>) entryParameter.getDelegate();
				registerData(cachedTerms, dataTerm);
			}
		}

		// Deep search
		if (deep) {

			// Load nested compilation units list
			Map<String, QCompilationUnit> compilationUnits = new HashMap<String, QCompilationUnit>();
			loadNestedCompilationUnit(this, compilationUnits, true);

			// Deep search on nested compilation units
			for (String compilationUnitKey : compilationUnits.keySet()) {

				Map<String, QDataTerm<?>> dataTerms = compilationUnits.get(compilationUnitKey).getDataTerms(false);
				for (String dataTermName : dataTerms.keySet())
					if (!cachedTerms.containsKey(dataTermName))
						registerData(cachedTerms, dataTerms.get(dataTermName));
			}

			// Deep search on parent unit
			if (this.parentUnit != null)
				for (String dataTermName : this.parentUnit.getDataTerms(deep).keySet())
					registerData(cachedTerms, this.parentUnit.getDataTerms(false).get(dataTermName));
		}

		// DataSet

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

			for (QDataTerm<?> dataTerm : dataSetTerm.getFormat().getDefinition().getElements())
				registerData(cachedTerms, dataTerm);
		}

		// Renamed dataSet
		for (QDataSetTerm dataSetTerm : renamedFiles)
			if (dataSetTerm.getFormat() != null) {
				// Format name
				registerData(cachedTerms, dataSetTerm.getFormat());
				// Format definition
				for (QDataTerm<?> definitionTerm : dataSetTerm.getFormat().getDefinition().getElements())
					registerData(cachedTerms, definitionTerm);
			}

		// Display

		for (QDisplayTerm displayTerm : displays)
			if (displayTerm.getFormat() != null)
				for (QDataTerm<?> definitionTerm : displayTerm.getFormat().getDefinition().getElements())
					registerData(cachedTerms, definitionTerm);

		// Printers
		for (QPrintTerm printTerm : printers)
			if (printTerm.getFormat() != null)
				for (QDataTerm<?> definitionTerm : printTerm.getFormat().getDefinition().getElements())
					registerData(cachedTerms, definitionTerm);

		return cachedTerms;
	}

	@SuppressWarnings("unchecked")
	private void registerData(Map<String, QDataTerm<?>> dataTermList, QDataTerm<?> dataTerm) {

		dataTermList.put(normalizeTermName(dataTerm.getName()), dataTerm);

		if (dataTerm.getDataTermType().isCompound()) {
			QDataTerm<QCompoundDataDef<?, ?>> compoundDataTerm = (QDataTerm<QCompoundDataDef<?, ?>>) dataTerm;

			QCompoundDataDef<?, QDataTerm<?>> compoundDataDef = null;
			if (dataTerm.getDefinition() instanceof QDataAreaDef) {
				QDataAreaDef<?> dataAreaDef = (QDataAreaDef<?>) dataTerm.getDefinition();
				compoundDataDef = (QCompoundDataDef<?, QDataTerm<?>>) dataAreaDef.getArgument();
			} else
				compoundDataDef = (QCompoundDataDef<?, QDataTerm<?>>) compoundDataTerm.getDefinition();

			for (QDataTerm<?> child : compoundDataDef.getElements())
				registerData(dataTermList, child);
		}
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
				pos = pfx.length();

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
			// compound
			else if (child.getDataTermType().isCompound()) {
				QDataTerm<QCompoundDataDef<?, ?>> compoundDataTerm = (QDataTerm<QCompoundDataDef<?, ?>>) child;

				QCompoundDataDef<?, QDataTerm<?>> compoundDataDef = null;
				if (child.getDefinition() instanceof QDataAreaDef) {
					QDataAreaDef<?> dataAreaDef = (QDataAreaDef<?>) child.getDefinition();
					compoundDataDef = (QCompoundDataDef<?, QDataTerm<?>>) dataAreaDef.getArgument();
				} else
					compoundDataDef = (QCompoundDataDef<?, QDataTerm<?>>) compoundDataTerm.getDefinition();

				if (compoundDataDef.isQualified()) {
					String[] tokens = name.split("\\.");
					if (tokens.length > 1) {
						name = null;
						for (int i = 1; i < tokens.length; i++)
							if (name != null)
								name = name + "." + tokens[i];
							else
								name = tokens[i];
					}
				}
				if (compoundDataDef.getPrefix() != null) {
					String[] tokens = compoundDataDef.getPrefix().split("\\:");
					String pfx = tokens[0];
					int pos = 0;
					if (tokens.length > 1)
						pos = Integer.parseInt(tokens[1]);
					else
						pos = 0;

					dataTerm = findData(compoundDataDef.getElements(), name, pfx, pos);
				} else
					dataTerm = findData(compoundDataDef.getElements(), name, null, 0);

				if (dataTerm == null && equalsTermName(childName, name))
					dataTerm = child;
			}
			// atomic
			else if (equalsTermName(childName, name))
				dataTerm = child;

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
				namedNode = getMethod(name);
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
		String moduleName = normalizeTermName(name);
		moduleName = Character.toString(moduleName.charAt(0)) + Character.toUpperCase(moduleName.charAt(1)) + moduleName.substring(2);

		return moduleName;
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
	public QPrototype getMethod(String name) {

		QPrototype prototype = null;
		for (EClassifier eClassifier : QIntegratedLanguageDataPackage.eINSTANCE.getEClassifiers()) {
			if (!(eClassifier instanceof EClass))
				continue;

			EClass eClass = (EClass) eClassifier;

			for (EOperation eOperation : eClass.getEAllOperations()) {
				// TODO remove me
				if (eOperation.getName().startsWith("qLookup"))
					continue;

				if (!eOperation.getName().equalsIgnoreCase(normalizeTermName(name)))
					continue;

				if (eOperation.getEType() == null)
					continue;

				prototype = QIntegratedLanguageFlowFactory.eINSTANCE.createPrototype();
				prototype.setName(name);

				if (eOperation.getEType().equals(QIntegratedLanguageDataPackage.eINSTANCE.getCharacter()) || eOperation.getEType().equals(QIntegratedLanguageDataPackage.eINSTANCE.getString())) {
					QCharacterDef characterDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
					prototype.setDefinition(characterDef);
				} else if (eOperation.getEType().equals(QIntegratedLanguageDataPackage.eINSTANCE.getNumeric())) {
					QDecimalDef decimalDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createDecimalDef();
					prototype.setDefinition(decimalDef);
				} else if (eOperation.getEType().equals(QIntegratedLanguageDataPackage.eINSTANCE.getArray())) {
					QArrayDef<?> arrayDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createArrayDef();
					if (eOperation.getName().equals("qSubst")) {
						QCharacterDef characterDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
						arrayDef.setArgument(characterDef);
					} else {
						QBufferDef bufferDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createBufferDef();
						arrayDef.setArgument(bufferDef);
					}
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
				break;
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

			if (node instanceof QProgram)
				continue;

			if (node instanceof QProcedure)
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

	protected void loadNestedCompilationUnit(QCompilationUnit compilationUnit, Map<String, QCompilationUnit> compilationUnitList, boolean excludePassedUnit) {

		if (compilationUnit instanceof RPJCompilationUnitImpl) {
			RPJCompilationUnitImpl rpjCompilationUnit = (RPJCompilationUnitImpl) compilationUnit;
			if (!excludePassedUnit)
				addCompilationUnit(compilationUnitList, rpjCompilationUnit);

			for (QCompilationUnit nestedCompilationUnit : rpjCompilationUnit.childUnits)
				loadNestedCompilationUnit(nestedCompilationUnit, compilationUnitList, false);
		}
	}

	protected void addCompilationUnit(Map<String, QCompilationUnit> compilationUnitList, QCompilationUnit compilationUnit) {
		if (!compilationUnitList.containsKey(compilationUnit.getNode().getName()))
			compilationUnitList.put(compilationUnit.getNode().getName(), compilationUnit);
	}
}
