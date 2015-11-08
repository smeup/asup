package org.smeup.sys.os.dtaara.nio;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.nio.NIOBufferedDelegatorImpl;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.dtaara.QDataAreaManager;

public class NIODataAreaImpl<D extends QBufferedData> extends NIOBufferedDelegatorImpl implements QDataArea<D> {

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
		
		QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
		dataWriter.set(qDataArea.getContent());	
		get().eval(dataWriter);
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
			localDataArea.setContent(get().toString());
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
}