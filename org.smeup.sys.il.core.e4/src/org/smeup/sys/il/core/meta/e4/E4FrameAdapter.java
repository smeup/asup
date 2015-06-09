/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.meta.QFrame;
import org.smeup.sys.il.core.meta.QSlot;

public class E4FrameAdapter<O extends QObject> implements QFrame<O> {

	private EClass eClass;
	private List<QSlot> slots;
	
	public E4FrameAdapter(EClass eClass) {
		this.eClass = eClass;
	}

	@Override
	public String getName() {
		return this.eClass.getName();
	}

	@Override
	public List<QSlot> getSlots() {
	
		if(this.slots == null) {
			synchronized (this) {
				if(slots == null) {
					this.slots = new ArrayList<QSlot>();
					
					for(EStructuralFeature structuralFeature: eClass.getEAllStructuralFeatures()) {
						this.slots.add(new E4SlotAdapter(structuralFeature));
					}
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
}