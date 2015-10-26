package org.smeup.sys.il.data.nio;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;

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

		if (externalName.equalsIgnoreCase("*LDA")) {
			QDataArea<QCharacter> localDataArea = getDataContext().getOrCreateLocalDataArea();
			get().eval(localDataArea);
		}
		else {
			QResourceManager resourceManager = getDataContext().getContext().get(QResourceManager.class);
			QResourceReader<org.smeup.sys.os.dtaara.QDataArea> dataAreaReader = resourceManager.getResourceReader(getDataContext(), org.smeup.sys.os.dtaara.QDataArea.class, Scope.LIBRARY_LIST);
			org.smeup.sys.os.dtaara.QDataArea qDataArea = dataAreaReader.lookup(externalName);
			
			QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
			dataWriter.set(qDataArea.getContent());	
			get().eval(dataWriter);
		}		
	}

	@Override
	public void out() {

		if (externalName.equalsIgnoreCase("*LDA")) {
			QDataArea<QCharacter> localDataArea = getDataContext().getOrCreateLocalDataArea();
			localDataArea.eval(get());
		}
		else {
			QResourceManager resourceManager = getDataContext().getContext().get(QResourceManager.class);
			QResourceReader<org.smeup.sys.os.dtaara.QDataArea> dataAreaReader = resourceManager.getResourceReader(getDataContext(), org.smeup.sys.os.dtaara.QDataArea.class, Scope.LIBRARY_LIST);
			org.smeup.sys.os.dtaara.QDataArea qDataArea = dataAreaReader.lookup(externalName);
			QResourceWriter<org.smeup.sys.os.dtaara.QDataArea> dataAreaWriter = resourceManager.getResourceWriter(getDataContext(), org.smeup.sys.os.dtaara.QDataArea.class, qDataArea.getLibrary());
			
			qDataArea = dataAreaWriter.lookup(externalName);
			qDataArea.setContent(asString());
			dataAreaWriter.save(qDataArea);

		}
	}	
}