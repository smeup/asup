/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.smeup.sys.il.flow.QFlowSection;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage;
import org.smeup.sys.il.flow.QParameterList;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.il.flow.QRoutine;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Flow Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.smeup.sys.il.flow.impl.FlowSectionImpl#getParameterLists <em>
 * Parameter Lists</em>}</li>
 * <li>{@link org.smeup.sys.il.flow.impl.FlowSectionImpl#getProcedures <em>Procedures
 * </em>}</li>
 * <li>{@link org.smeup.sys.il.flow.impl.FlowSectionImpl#getPrototypes <em>Prototypes
 * </em>}</li>
 * <li>{@link org.smeup.sys.il.flow.impl.FlowSectionImpl#getRoutines <em>Routines
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowSectionImpl extends UnitSectionImpl implements QFlowSection {
	/**
	 * The cached value of the '{@link #getParameterLists()
	 * <em>Parameter Lists</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getParameterLists()
	 * @generated
	 * @ordered
	 */
	protected EList<QParameterList> parameterLists;

	/**
	 * The cached value of the '{@link #getProcedures() <em>Procedures</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProcedures()
	 * @generated
	 * @ordered
	 */
	protected EList<QProcedure> procedures;

	/**
	 * The cached value of the '{@link #getPrototypes() <em>Prototypes</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPrototypes()
	 * @generated
	 * @ordered
	 */
	protected EList<QPrototype<?>> prototypes;

	/**
	 * The cached value of the '{@link #getRoutines() <em>Routines</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRoutines()
	 * @generated
	 * @ordered
	 */
	protected EList<QRoutine> routines;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FlowSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageFlowPackage.Literals.FLOW_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<QParameterList> getParameterLists() {
		if (parameterLists == null)
			parameterLists = new EObjectContainmentEList<QParameterList>(QParameterList.class, this, QIntegratedLanguageFlowPackage.FLOW_SECTION__PARAMETER_LISTS);
		return parameterLists;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<QProcedure> getProcedures() {
		if (procedures == null)
			procedures = new EObjectContainmentEList<QProcedure>(QProcedure.class, this, QIntegratedLanguageFlowPackage.FLOW_SECTION__PROCEDURES);
		return procedures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<QPrototype<?>> getPrototypes() {
		if (prototypes == null)
			prototypes = new EObjectContainmentEList<QPrototype<?>>(QPrototype.class, this, QIntegratedLanguageFlowPackage.FLOW_SECTION__PROTOTYPES);
		return prototypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<QRoutine> getRoutines() {
		if (routines == null)
			routines = new EObjectContainmentEList<QRoutine>(QRoutine.class, this, QIntegratedLanguageFlowPackage.FLOW_SECTION__ROUTINES);
		return routines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__PARAMETER_LISTS:
			return ((InternalEList<?>) getParameterLists()).basicRemove(otherEnd, msgs);
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__PROCEDURES:
			return ((InternalEList<?>) getProcedures()).basicRemove(otherEnd, msgs);
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__PROTOTYPES:
			return ((InternalEList<?>) getPrototypes()).basicRemove(otherEnd, msgs);
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__ROUTINES:
			return ((InternalEList<?>) getRoutines()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__PARAMETER_LISTS:
			return getParameterLists();
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__PROCEDURES:
			return getProcedures();
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__PROTOTYPES:
			return getPrototypes();
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__ROUTINES:
			return getRoutines();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__PARAMETER_LISTS:
			getParameterLists().clear();
			getParameterLists().addAll((Collection<? extends QParameterList>) newValue);
			return;
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__PROCEDURES:
			getProcedures().clear();
			getProcedures().addAll((Collection<? extends QProcedure>) newValue);
			return;
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__PROTOTYPES:
			getPrototypes().clear();
			getPrototypes().addAll((Collection<? extends QPrototype<?>>) newValue);
			return;
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__ROUTINES:
			getRoutines().clear();
			getRoutines().addAll((Collection<? extends QRoutine>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__PARAMETER_LISTS:
			getParameterLists().clear();
			return;
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__PROCEDURES:
			getProcedures().clear();
			return;
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__PROTOTYPES:
			getPrototypes().clear();
			return;
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__ROUTINES:
			getRoutines().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__PARAMETER_LISTS:
			return parameterLists != null && !parameterLists.isEmpty();
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__PROCEDURES:
			return procedures != null && !procedures.isEmpty();
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__PROTOTYPES:
			return prototypes != null && !prototypes.isEmpty();
		case QIntegratedLanguageFlowPackage.FLOW_SECTION__ROUTINES:
			return routines != null && !routines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // FlowSectionImpl
