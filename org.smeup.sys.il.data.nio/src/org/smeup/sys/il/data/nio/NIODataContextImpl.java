/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataAreaFactory;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.il.data.def.TimeFormat;

public final class NIODataContextImpl implements QDataContext {

	private final QContext context;
	private final QDataFactory dataFactory;
	private final QIndicator endOfData;
	private final QIndicator equal;
	private final QIndicator error;
	private final QIndicator found;

	private static final Charset CHARSET = Charset.forName("IBM-280");
	private static final DateFormat DATEFMT = DateFormat.ISO;
	private static final TimeFormat TIMEFMT = TimeFormat.ISO;

	private Map<QBufferedData, QBufferedData> snapshots = null;
	
	public NIODataContextImpl(final QContext context, final QDataAreaFactory dataAreaFactory, final Object owner) {
		this.context = context;
		dataFactory = new NIODataFactoryImpl(this, owner, dataAreaFactory);

		endOfData = dataFactory.createIndicator(true);
		equal = dataFactory.createIndicator(true);
		error = dataFactory.createIndicator(true);
		found = dataFactory.createIndicator(true);
	}

	@Override
	public final Charset getCharset() {
		return CHARSET;
	}

	@Override
	public final QIndicator endOfData() {
		return this.endOfData;
	}

	@Override
	public final QIndicator equal() {
		return equal;
	}

	@Override
	public final QIndicator error() {
		return error;
	}

	@Override
	public final QIndicator found() {
		return this.found;
	}

	@Override
	public final QDataFactory getDataFactory() {
		return dataFactory;
	}

	@Override
	public final QContext getContext() {
		return context;
	}

	@Override
	public final DateFormat getDateFormat() {
		return DATEFMT;
	}

	@Override
	public final TimeFormat getTimeFormat() {
		return TIMEFMT;
	}

	@Override
	public final void snap(final QBufferedData data) {

		final QCharacter snapData = new NIOCharacterFixedImpl(this, data.getSize(), true);
		NIOBufferHelper.write(snapData, data);

		if (snapshots == null)
			snapshots = new HashMap<QBufferedData, QBufferedData>();

		snapshots.put(data, snapData);
	}

	@Override
	public final QBufferedData getSnap(final QBufferedData data) {

		if (snapshots == null)
			return null;

		return snapshots.get(data);
	}

	@Override
	public final void removeSnap(final QBufferedData data) {

		if (snapshots == null)
			return;

		snapshots.remove(data);
	}

	@Override
	public final QBufferedData copy(final QBufferedData data) {

		try {
			NIOBufferedDataImpl copy = null;

			final ByteArrayOutputStream baos = new ByteArrayOutputStream();
			final ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(data);
			oos.close();

			final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			final ObjectInputStream ois = new ObjectInputStream(bais);
			copy = (NIOBufferedDataImpl) ois.readObject();
			ois.close();

			NIOBufferHelper.setDataContext(copy, this);

			return copy;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}