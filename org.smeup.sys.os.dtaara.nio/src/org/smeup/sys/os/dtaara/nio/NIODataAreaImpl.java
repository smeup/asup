/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial API and implementation
 * 	Mattia Rocchi
 */
package org.smeup.sys.os.dtaara.nio;

import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.nio.NIOBufferedElementDelegatorImpl;
import org.smeup.sys.il.data.nio.NIODataImpl;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.dtaara.QDataAreaManager;

public class NIODataAreaImpl<D extends QBufferedElement> extends NIOBufferedElementDelegatorImpl implements QDataArea<D> {

	private static final long serialVersionUID = 1L;

	private QString externalName;
	private transient String currentDataAreaName;
	private transient org.smeup.sys.os.dtaara.QDataArea currentDataArea;

	protected NIODataAreaImpl(QDataContext dataContext, D delegate, QString externalName) {
		super(dataContext, delegate);
		this.externalName = externalName;
	}
	@Override
	public QString getDataAreaPath() {
		return externalName;
	}

	@SuppressWarnings("unchecked")
	@Override
	public D get() {
		return (D) getDelegate();
	}

	@Override
	public void in() {

		if(currentDataArea != null && externalName.trimR().equalsIgnoreCase(currentDataAreaName))
			return;
		
		if (externalName.trimR().equalsIgnoreCase("*LDA")) {
			QDataAreaManager dataAreaManager = getDataContext().getContext().get(QDataAreaManager.class);
			currentDataArea = dataAreaManager.getLocalDataArea(getDataContext());
		} else {
			QResourceManager resourceManager = getDataContext().getContext().get(QResourceManager.class);
			
			String[] splits = externalName.trimR().split("/");
			if(splits.length == 2) {
				String library = splits[0];
				Scope scope = null;
				if (library != null && !library.isEmpty())
					scope = Scope.get(library);
				else
					scope = Scope.LIBRARY_LIST;

				if (scope == null)
					scope = Scope.OTHER;

				QResourceReader<org.smeup.sys.os.dtaara.QDataArea> dataAreaReader = resourceManager.getResourceReader(getDataContext(), org.smeup.sys.os.dtaara.QDataArea.class, scope, library);
				currentDataArea = dataAreaReader.lookup(splits[1]);
			}
			else {
				QResourceReader<org.smeup.sys.os.dtaara.QDataArea> dataAreaReader = resourceManager.getResourceReader(getDataContext(), org.smeup.sys.os.dtaara.QDataArea.class, Scope.LIBRARY_LIST);
				currentDataArea = dataAreaReader.lookup(externalName.trimR());
			}
		}

		currentDataAreaName = externalName.trimR();
		
		// let throw null pointer
		get().movel(currentDataArea.getContent(), true);
	}

	@Override
	public void in(QIndicator error) {
		try {
			in();
			error.eval(false);
		} catch (RuntimeException e) {
			error.eval(true);
		}
	}

	@Override
	public void out() {

		if (externalName.trimR().equalsIgnoreCase("*LDA")) {
			// TODO
			if (get() instanceof QString)
				currentDataArea.setContent(((QString) get()).asString());
			else
				currentDataArea.setContent(new String(asBytes()));
		} else {
			QResourceManager resourceManager = getDataContext().getContext().get(QResourceManager.class);
			QResourceWriter<org.smeup.sys.os.dtaara.QDataArea> dataAreaWriter = resourceManager.getResourceWriter(getDataContext(), org.smeup.sys.os.dtaara.QDataArea.class, currentDataArea.getLibrary());

			org.smeup.sys.os.dtaara.QDataArea qDataArea = dataAreaWriter.lookup(externalName.trimR());
			if (get() instanceof QString)
				qDataArea.setContent(((QString) get()).asString());
			else
				qDataArea.setContent(new String(asBytes()));
			dataAreaWriter.save(qDataArea, true);
		}
	}

	@Override
	public void out(QIndicator error) {
		try {
			out();
			error.eval(false);
		} catch (RuntimeException e) {
			error.eval(true);
		}
	}

	@Override
	public QBufferedData eval(DataSpecial value) {
		getDelegate().eval(value);
		return this;
	}
	
	@Override
	protected final NIODataImpl _copyDef(final QDataContext dataContext) {
		return super._copyDef(dataContext);
	}
}