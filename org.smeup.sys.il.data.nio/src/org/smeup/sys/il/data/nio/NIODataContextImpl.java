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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.nio.charset.Charset;

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataAreaFactory;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.il.data.def.TimeFormat;

public final class NIODataContextImpl implements QDataContext {

	private final QContext context;
	private final NIODataFactoryImpl dataFactory;
	private final QIndicator endOfData;
	private final QIndicator equal;
	private final QIndicator error;
	private final QIndicator found;

	private static final Charset CHARSET = Charset.forName("IBM-280");
	private static final DateFormat DATEFMT = DateFormat.ISO;
	private static final TimeFormat TIMEFMT = TimeFormat.ISO;
	
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
	public final NIODataFactoryImpl getDataFactory() {
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

	@SuppressWarnings("unchecked")
	@Override
	public <O> O deserialize(Class<O> klass) {

		O object = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			String tempArea = getContext().getContextDescription().getTemporaryArea();
			URI fileUri = new URI(tempArea+"/" + klass.getName());
			fis = new FileInputStream(new File(fileUri));
			
			ois = new NIOContextInputStreamImpl(this, klass, fis);
			object = (O) ois.readObject();
		}
		catch (FileNotFoundException e) {
			return null;
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			return null;
		} finally {

			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (ois != null)
					ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return object;		
	}

	@Override
	public void serialize(Object object) {
		
		ByteArrayOutputStream baos = null;
		FileOutputStream fos = null;
		NIODebuggingObjectOutputStream out = null;
		
		try {
			baos = new ByteArrayOutputStream();
			String tempArea = getContext().getContextDescription().getTemporaryArea();
			URI fileUri = new URI(tempArea+"/" + object.getClass().getName());
			fos = new FileOutputStream(new File(fileUri));
			out = new NIODebuggingObjectOutputStream(fos);

			out.writeObject(object);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			throw new IntegratedLanguageDataRuntimeException(e);
		} finally {
			try {
				if(baos != null)
					baos.close();
			}
			catch(IOException e) {				
			}
			try {
				if(fos != null)
					fos.close();
			}
			catch(IOException e) {				
			}
			try {
				if(out != null)
					out.close();
			}
			catch(IOException e) {				
			}
		}
	}
}