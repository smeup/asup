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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	private List<QDataTerm<?>> dataTerms;

	private Map<String, QData> datas;

	private QDataWriter dataWriter;

	protected NIODataContainerImpl(QDataFactory dataFactory, List<QDataTerm<?>> dataTerms) {
		this.dataFactory = dataFactory;
		this.dataTerms = dataTerms;
		this.datas = new HashMap<String, QData>();
		this.dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
	}

	@Override
	public boolean isSet(String name) {

		QDataTerm<?> dataTerm = _getDataTerm(name);

		return isSet(dataTerm);
	}

	@Override
	public boolean isSet(QDataTerm<?> dataTerm) {

		boolean result = false;

		if (dataTerm == null)
			return false;

		QData data = dataFactory.createData(dataTerm, true);
		NIODataResetter resetter = new NIODataResetter(data, dataWriter);
		dataTerm.accept(resetter);
		try {
			result = !getData(dataTerm).toString().equals(data.toString());
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
					QDataTerm<?> dataTerm = _getDataTerm(qualifier);

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
			return getData(dataTerm.getName());
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
		return dataTerms;
	}

	@Override
	public void clearData() {

		for (QDataTerm<?> dataTerm : dataTerms) {

			QData data = datas.get(dataTerm.getName());
			if (data == null) {
				data = dataFactory.createData(dataTerm, true);
				datas.put(dataTerm.getName(), data);
			}
			data.clear();
		}
	}

	@Override
	public void resetData() {

		for (QDataTerm<?> dataTerm : dataTerms)
			resetData(dataTerm.getName());

	}

	@Override
	public void resetData(QDataTerm<?> dataTerm) {

		QData data = datas.get(dataTerm.getName());
		if (data == null) {
			data = dataFactory.createData(dataTerm, true);
			datas.put(dataTerm.getName(), data);
		}

		NIODataResetter resetter = new NIODataResetter(data, dataWriter);
		dataTerm.accept(resetter);

	}

	@Override
	public void resetData(String name) {

		QDataTerm<?> dataTerm = _getDataTerm(name);

		if (dataTerm == null)
			return;

		resetData(dataTerm);
	}

	private QDataTerm<?> _getDataTerm(String name) {
		QDataTerm<?> dataTerm = null;

		for (QDataTerm<?> dt : dataTerms)
			if (dt.getName().equals(name)) {
				dataTerm = dt;
				break;
			}

		return dataTerm;
	}
}