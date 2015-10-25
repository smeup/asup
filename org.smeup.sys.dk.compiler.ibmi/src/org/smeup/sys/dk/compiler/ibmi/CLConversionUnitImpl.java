package org.smeup.sys.dk.compiler.ibmi;

import org.smeup.sys.dk.compiler.impl.ConversionUnitImpl;
import org.smeup.sys.il.core.ctx.QContext;

public class CLConversionUnitImpl extends ConversionUnitImpl {

	private QContext context;
	
	public CLConversionUnitImpl(QContext context) {
		this.context = context;
	}
	
	public QContext getContext() {
		return this.context;
	}


	@Override
	public void close() {
		getContext().close();
	}
}
