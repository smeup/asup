/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.il.data.nio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.smeup.sys.il.core.QNode;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QStruct;
import org.smeup.sys.il.data.term.QDataTerm;

public class NIODataContainerImpl extends ObjectImpl implements QDataContainer, Serializable {

	private static final long serialVersionUID = 1L;

	private transient QDataFactory dataFactory;

	private Map<String, QDataTerm<?>> dataTerms;

	private Map<String, QData> datas;

	private QDataWriter dataWriter;
	
	private boolean useDefault;
	
	protected NIODataContainerImpl(QDataFactory dataFactory, Map<String, QDataTerm<?>> dataTerms, boolean useDefault) {
		this.dataFactory = dataFactory;
		this.dataTerms = dataTerms;
		this.datas = new HashMap<String, QData>();
		this.dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
		this.useDefault = useDefault;
	}

	@Override
	public boolean isDefault(String key) {

		QDataTerm<?> dataTerm = dataTerms.get(key);

		return isDefault(dataTerm);
	}

	@Override
	public boolean isDefault(QDataTerm<?> dataTerm) {
		boolean result = false;

		if (dataTerm == null)
			return false;

		QData data = dataFactory.createData(dataTerm, true);
		data.clear();
		
		NIODataResetter resetter = new NIODataResetter(data, dataWriter);
		dataTerm.accept(resetter);
		
		try {
			
			String s1 = getData(dataTerm).toString();
			String s2 = data.toString();
			
			result = s1.equals(s2);
			if(result)
				"".toString();
		} catch (Exception exc) {
			exc.printStackTrace();
			result = false;
		}
		return result;
	}
	

	@Override
	public boolean isSet(String key) {

		QDataTerm<?> dataTerm = dataTerms.get(key);

		return isSet(dataTerm);
	}

	@Override
	public boolean isSet(QDataTerm<?> dataTerm) {

		boolean result = false;

		if (dataTerm == null)
			return false;

		QData data = dataFactory.createData(dataTerm, true);
		data.clear();
		
		if(useDefault) {
			NIODataResetter resetter = new NIODataResetter(data, dataWriter);
			dataTerm.accept(resetter);
		}
		
		try {
			
			String s1 = getData(dataTerm).toString();
			String s2 = data.toString();
			
			result = !s1.equals(s2);
			if(result)
				"".toString();
		} catch (Exception exc) {
			exc.printStackTrace();
			result = false;
		}
		return result;
	}

	@Override
	public QData getData(String name) {

		String[] qualifiers = name.split("\\.");

		QData data = null;
		for (String qualifier : qualifiers) {

			int index = 0;
			int i = qualifier.indexOf("(");
			if (i > 0) {
				index = Integer.parseInt(qualifier.substring(i + 1, qualifier.indexOf(")")));
				qualifier = qualifier.substring(0, i);
			}

			// root data
			if (data == null) {
				data = datas.get(qualifier);
				if (data == null) {
					QDataTerm<?> dataTerm = dataTerms.get(qualifier);

					if (dataTerm == null)
						return null;

					data = dataFactory.createData(dataTerm, true);
					datas.put(qualifier, data);
				}
			} else {

				if (!(data instanceof QStruct))
					return null;

				QStruct<?> struct = (QStruct<?>) data;
				data = struct.getElement(qualifier);
			}

			// list
			if (index > 0) {

				if (!(data instanceof QList))
					return null;

				QList<?> list = (QList<?>) data;
				data = list.get(index);
			}
		}

		return data;
	}

	@Override
	public QData getData(QDataTerm<?> dataTerm) {

		QNode parent = dataTerm.getParent();
		if (parent == null)
			return getData(getKey(dataTerm));
		else if (parent instanceof QDataTerm) {
			QDataTerm<?> dataTermParent = (QDataTerm<?>) parent;
			if (dataTermParent.getDataTermType().isCompound()) {
				QStruct<?> dataParent = (QStruct<?>) getData(dataTermParent);
				return dataParent.getElement(dataTerm.getName());
			} else
				return null;
		} else
			return null;
	}

	@Override
	public List<QDataTerm<?>> getTerms() {
		return new ArrayList<QDataTerm<?>>(dataTerms.values());
	}

	@Override
	public void clearData() {

		for(Entry<String, QDataTerm<?>> entry: dataTerms.entrySet()) {

			QData data = datas.get(entry.getKey());
			if (data == null) {
				data = dataFactory.createData(entry.getValue(), true);
				datas.put(entry.getKey(), data);
			}
			data.clear();
		}
	}

	@Override
	public void resetData() {

		for(Entry<String, QDataTerm<?>> entry: dataTerms.entrySet()) 
			resetData(entry.getKey(), entry.getValue());
	}

	@Override
	public void resetData(QDataTerm<?> dataTerm) {
		resetData(getKey(dataTerm), dataTerm);
	}
	
	@Override
	public void resetData(String key) {

		QDataTerm<?> dataTerm = dataTerms.get(key);

		if (dataTerm == null)
			return;

		resetData(key, dataTerm);
	}

	@Override
	public QDataTerm<?> getDataTerm(String key) {
		QDataTerm<?> dataTerm = dataTerms.get(key);
		
		return dataTerm;
	}

	@Override
	public List<String> getKeys() {
		return new ArrayList<String>(dataTerms.keySet());
	}
	
	private String getKey(QDataTerm<?> dataTerm) {
		
		for(Entry<String, QDataTerm<?>> entry: dataTerms.entrySet()) {
			
			if(entry.getValue().equals(dataTerm))
				return entry.getKey();
		}
		
		return null;
	}
	

	private void resetData(String key, QDataTerm<?> dataTerm) {

		QData data = datas.get(key);
		if (data == null) {
			data = dataFactory.createData(dataTerm, true);
			datas.put(key, data);
		}

		NIODataResetter resetter = new NIODataResetter(data, dataWriter);
		dataTerm.accept(resetter);		
	}
}