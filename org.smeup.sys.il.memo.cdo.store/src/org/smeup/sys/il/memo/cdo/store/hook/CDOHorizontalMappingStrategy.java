package org.smeup.sys.il.memo.cdo.store.hook;

import org.eclipse.emf.cdo.server.internal.db.mapping.horizontal.HorizontalNonAuditMappingStrategy;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

@SuppressWarnings("restriction")
public class CDOHorizontalMappingStrategy extends HorizontalNonAuditMappingStrategy  {
	@Override
	public String getTableName(ENamedElement element) {
		EClass eClass = null;
		if(element instanceof EClass) 
			eClass = (EClass)element;
		else
			eClass = element.eClass();
		
		EPackage ePackage = eClass.getEPackage();
		if(ePackage.getNsURI().contains("www.smeup.org"))
			return ("asup_"+ePackage.getNsPrefix().replaceAll("-",  "_")+"_"+element.getName()).toLowerCase();
		else
			return super.getTableName(element);
	}

	@Override
	public String getTableName(EClass eClass, EStructuralFeature feature) {
		EPackage ePackage = eClass.getEPackage();
		if(ePackage.getNsURI().contains("www.smeup.org"))
			return ("asup_"+ePackage.getNsPrefix().replaceAll("-",  "_")+"_"+eClass.getName()+"_"+feature.getName()).toLowerCase();
		else
			return super.getTableName(eClass, feature);
	}

}
