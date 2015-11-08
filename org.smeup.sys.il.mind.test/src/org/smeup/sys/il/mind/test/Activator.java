package org.smeup.sys.il.mind.test;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.e4.E4ContextRootImpl;
import org.smeup.sys.il.core.meta.QFrame;
import org.smeup.sys.il.core.meta.QFrameManager;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;
import org.smeup.sys.il.core.meta.e4.E4FrameManagerImpl;
import org.smeup.sys.il.mind.QMindManager;
import org.smeup.sys.il.mind.QMindTerm;
import org.smeup.sys.il.mind.QTheory;
import org.smeup.sys.il.mind.gnu.GNUMindManagerImpl;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext bundleContext) throws Exception {

		QContext context = new E4ContextRootImpl(bundleContext, "il.mind.test", null);
		
		QFrameManager frameManager = new E4FrameManagerImpl();
		QFrame<?> frame = frameManager.getFrame(QIntegratedLanguageCoreMetaPackage.eINSTANCE.getFrame()); 
				
		QMindManager mindManager = new GNUMindManagerImpl();
		QTheory theory = mindManager.buildTheory(context, frame);
		
		for(QMindTerm mindTerm: theory.getFacts())
			System.out.println(mindTerm);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
