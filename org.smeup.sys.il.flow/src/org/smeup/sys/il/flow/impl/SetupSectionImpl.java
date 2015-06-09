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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.smeup.sys.il.core.QAnnotation;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage;
import org.smeup.sys.il.flow.QSetupSection;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Setup Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.smeup.sys.il.flow.impl.SetupSectionImpl#getAnnotations <em>
 * Annotations</em>}</li>
 * <li>{@link org.smeup.sys.il.flow.impl.SetupSectionImpl#getApplication <em>
 * Application</em>}</li>
 * <li>{@link org.smeup.sys.il.flow.impl.SetupSectionImpl#getEncoding <em>Encoding
 * </em>}</li>
 * <li>{@link org.smeup.sys.il.flow.impl.SetupSectionImpl#getExpressionType <em>
 * Expression Type</em>}</li>
 * <li>{@link org.smeup.sys.il.flow.impl.SetupSectionImpl#getModules <em>Modules
 * </em>}</li>
 * <li>{@link org.smeup.sys.il.flow.impl.SetupSectionImpl#isTermSensitive <em>Term
 * Sensitive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetupSectionImpl extends UnitSectionImpl implements QSetupSection {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<QAnnotation> annotations;

	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected String application = APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpressionType()
	 * <em>Expression Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getExpressionType()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpressionType()
	 * <em>Expression Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getExpressionType()
	 * @generated
	 * @ordered
	 */
	protected String expressionType = EXPRESSION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<String> modules;

	/**
	 * The default value of the '{@link #isTermSensitive()
	 * <em>Term Sensitive</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isTermSensitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TERM_SENSITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTermSensitive()
	 * <em>Term Sensitive</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isTermSensitive()
	 * @generated
	 * @ordered
	 */
	protected boolean termSensitive = TERM_SENSITIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SetupSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageFlowPackage.Literals.SETUP_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<QAnnotation> getAnnotations() {
		if (annotations == null)
			annotations = new EObjectContainmentEList<QAnnotation>(QAnnotation.class, this, QIntegratedLanguageFlowPackage.SETUP_SECTION__ANNOTATIONS);
		return annotations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setApplication(String newApplication) {
		String oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.SETUP_SECTION__APPLICATION, oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.SETUP_SECTION__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getExpressionType() {
		return expressionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setExpressionType(String newExpressionType) {
		String oldExpressionType = expressionType;
		expressionType = newExpressionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.SETUP_SECTION__EXPRESSION_TYPE, oldExpressionType, expressionType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> getModules() {
		if (modules == null)
			modules = new EDataTypeUniqueEList<String>(String.class, this, QIntegratedLanguageFlowPackage.SETUP_SECTION__MODULES);
		return modules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isTermSensitive() {
		return termSensitive;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTermSensitive(boolean newTermSensitive) {
		boolean oldTermSensitive = termSensitive;
		termSensitive = newTermSensitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.SETUP_SECTION__TERM_SENSITIVE, oldTermSensitive, termSensitive));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__ANNOTATIONS:
			return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
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
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__ANNOTATIONS:
			return getAnnotations();
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__APPLICATION:
			return getApplication();
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__ENCODING:
			return getEncoding();
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__EXPRESSION_TYPE:
			return getExpressionType();
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__MODULES:
			return getModules();
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__TERM_SENSITIVE:
			return isTermSensitive();
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
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__ANNOTATIONS:
			getAnnotations().clear();
			getAnnotations().addAll((Collection<? extends QAnnotation>) newValue);
			return;
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__APPLICATION:
			setApplication((String) newValue);
			return;
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__ENCODING:
			setEncoding((String) newValue);
			return;
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__EXPRESSION_TYPE:
			setExpressionType((String) newValue);
			return;
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__MODULES:
			getModules().clear();
			getModules().addAll((Collection<? extends String>) newValue);
			return;
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__TERM_SENSITIVE:
			setTermSensitive((Boolean) newValue);
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
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__ANNOTATIONS:
			getAnnotations().clear();
			return;
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__APPLICATION:
			setApplication(APPLICATION_EDEFAULT);
			return;
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__ENCODING:
			setEncoding(ENCODING_EDEFAULT);
			return;
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__EXPRESSION_TYPE:
			setExpressionType(EXPRESSION_TYPE_EDEFAULT);
			return;
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__MODULES:
			getModules().clear();
			return;
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__TERM_SENSITIVE:
			setTermSensitive(TERM_SENSITIVE_EDEFAULT);
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
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__APPLICATION:
			return APPLICATION_EDEFAULT == null ? application != null : !APPLICATION_EDEFAULT.equals(application);
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__ENCODING:
			return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__EXPRESSION_TYPE:
			return EXPRESSION_TYPE_EDEFAULT == null ? expressionType != null : !EXPRESSION_TYPE_EDEFAULT.equals(expressionType);
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__MODULES:
			return modules != null && !modules.isEmpty();
		case QIntegratedLanguageFlowPackage.SETUP_SECTION__TERM_SENSITIVE:
			return termSensitive != TERM_SENSITIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (application: ");
		result.append(application);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", expressionType: ");
		result.append(expressionType);
		result.append(", modules: ");
		result.append(modules);
		result.append(", termSensitive: ");
		result.append(termSensitive);
		result.append(')');
		return result.toString();
	}

} // SetupSectionImpl
