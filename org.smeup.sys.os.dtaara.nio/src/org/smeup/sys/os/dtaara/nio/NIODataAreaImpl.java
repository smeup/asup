package org.smeup.sys.os.dtaara.nio;

import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.nio.NIOBufferedElementDelegatorImpl;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.dtaara.QDataAreaManager;

public class NIODataAreaImpl<D extends QBufferedElement> extends NIOBufferedElementDelegatorImpl implements QDataArea<D> {

	private static final long serialVersionUID = 1L;

	private String externalName;

	protected NIODataAreaImpl(QDataContext dataContext, D delegate, String externalName) {
		super(dataContext, delegate);
		this.externalName = externalName;
	}

	@SuppressWarnings("unchecked")
	@Override
	public D get() {
		return (D) getDelegate();
	}
	
	@Override
	public void in() {

		org.smeup.sys.os.dtaara.QDataArea qDataArea = null;
		if (externalName.equalsIgnoreCase("*LDA")) {
			QDataAreaManager dataAreaManager = getDataContext().getContext().get(QDataAreaManager.class);
			qDataArea = dataAreaManager.getLocalDataArea(getDataContext().getContext());
		}
		else {
			QResourceManager resourceManager = getDataContext().getContext().get(QResourceManager.class);
			QResourceReader<org.smeup.sys.os.dtaara.QDataArea> dataAreaReader = resourceManager.getResourceReader(getDataContext(), org.smeup.sys.os.dtaara.QDataArea.class, Scope.LIBRARY_LIST);
			qDataArea = dataAreaReader.lookup(externalName);
		}		
		
		get().movel(qDataArea.getContent(), true);
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

		if (externalName.equalsIgnoreCase("*LDA")) {
			QDataAreaManager dataAreaManager = getDataContext().getContext().get(QDataAreaManager.class);
			org.smeup.sys.os.dtaara.QDataArea localDataArea = dataAreaManager.getLocalDataArea(getDataContext().getContext());
			// TODO
			if(get() instanceof QString)
				localDataArea.setContent(((QString)get()).asString());
			else
				localDataArea.setContent(new String(asBytes()));
		}
		else {
			QResourceManager resourceManager = getDataContext().getContext().get(QResourceManager.class);
			QResourceReader<org.smeup.sys.os.dtaara.QDataArea> dataAreaReader = resourceManager.getResourceReader(getDataContext(), org.smeup.sys.os.dtaara.QDataArea.class, Scope.LIBRARY_LIST);
			org.smeup.sys.os.dtaara.QDataArea qDataArea = dataAreaReader.lookup(externalName);
			QResourceWriter<org.smeup.sys.os.dtaara.QDataArea> dataAreaWriter = resourceManager.getResourceWriter(getDataContext(), org.smeup.sys.os.dtaara.QDataArea.class, qDataArea.getLibrary());
			
			qDataArea = dataAreaWriter.lookup(externalName);
			if(get() instanceof QString)
				qDataArea.setContent(((QString)get()).asString());
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
	public byte[] asBytes() {
		return getDelegate().asBytes();
	}

	@Override
	public void movea(QArray<? extends QString> value) {
		
		if(!(get() instanceof QString))
			throw new UnsupportedOperationException();
		
		((QString)get()).movea(value);
	}

	@Override
	public boolean eq(QBufferedElement value) {
		return get().eq(value);
	}

	@Override
	public void eval(QString value) {		
		
		if(!(get() instanceof QString))
			throw new UnsupportedOperationException();
		
		((QString)get()).eval(value);		
	}
}