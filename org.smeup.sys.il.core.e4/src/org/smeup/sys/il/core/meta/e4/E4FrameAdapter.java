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
package org.smeup.sys.il.core.meta.e4;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.meta.QFrame;
import org.smeup.sys.il.core.meta.QSlot;
import org.smeup.sys.mi.core.util.QStrings;

public class E4FrameAdapter<O extends QObject> implements QFrame<O> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EClass eClass;
	private List<QSlot> slots;

	private static final String nsPrefix = "il-data";

	public E4FrameAdapter(EClass eClass) {
		super();
		this.eClass = eClass;
	}

	@Override
	public String getName() {
		return this.eClass.getName();
	}

	@Override
	public List<QSlot> getSlots() {

		if (this.slots == null)
			synchronized (this) {
				if (slots == null) {
					this.slots = new ArrayList<QSlot>();

					for (EStructuralFeature structuralFeature : eClass.getEAllStructuralFeatures())
						this.slots.add(new E4SlotAdapter(structuralFeature));

					for (EOperation operation : eClass.getEAllOperations()) {
						
						EAnnotation eAnnotation = operation.getEAnnotation(nsPrefix);
						if (eAnnotation == null) 
							continue;

						if (operation.getName().length() > 3 && operation.getName().startsWith("get") && operation.getEParameters().isEmpty()) {
							String name = operation.getName().substring(3);				
							name = QStrings.qINSTANCE.firstToLower(name);
							this.slots.add(new E4SlotAdapter(operation, name));
							
							continue;
						}

						this.slots.add(new E4SlotAdapter(operation));
					}
				}
			}

		return this.slots;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public QFrame<?> ako() {

		EClass eAko = this.eClass.getESuperTypes().get(0);
		return new E4FrameAdapter(eAko);
	}

	protected EClass getEClass() {
		return this.eClass;
	}

	@Override
	public String toString() {
		return eClass.toString();
	}

	@Override
	public QSlot getSlot(String name) {
		
		for(QSlot slot: getSlots())
			if(slot.getName().equals(name))
				return slot;
		
		return null;
	}

	@Override
	public Object getValue(QObject object, QSlot slot) {
		
		if(object instanceof EObject)
			return getValue((EObject)object, slot);
		else
			return getValue((Object) object, slot);
	}
	
	private Object getValue(EObject eObject, QSlot slot) {
		Object value = null;
		
		EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(slot.getName());
		if (eStructuralFeature != null)
			value = eObject.eGet(eStructuralFeature);
		else {
			value = getValue((Object)eObject, slot);
		}				
		
		return value;
	}
	
	private Object getValue(Object object, QSlot slot) {
		Object value = null;

		try {
			String methodName = null;
			if (slot.getName().startsWith("is"))
				methodName = slot.getName();
			else
				methodName = "get" + QStrings.qINSTANCE.firstToUpper(slot.getName());
			Method method = object.getClass().getMethod(methodName, new Class[] {});
			if (method != null) {
				value = method.invoke(object, new Object[] {});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	@Override
	public String qURI() {
		return EcoreUtil.getURI(eClass).toString();
	}
}