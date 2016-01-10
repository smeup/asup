/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.term.impl;

import java.net.URI;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.core.impl.NamedNodeImpl;
import org.smeup.sys.il.core.meta.QCardinality;
import org.smeup.sys.il.core.meta.QDefault;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QWrapperDef;
import org.smeup.sys.il.data.term.DataTermType;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QDataTermVisitor;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Term</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.term.impl.DataTermImpl#getBased <em>Based</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.impl.DataTermImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.impl.DataTermImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.impl.DataTermImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.impl.DataTermImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.impl.DataTermImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.impl.DataTermImpl#getLike <em>Like</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.impl.DataTermImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.impl.DataTermImpl#isRestricted <em>Restricted</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.impl.DataTermImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataTermImpl<DD extends QDataDef<?>> extends NamedNodeImpl implements QDataTerm<DD> {
	/**
	 * The default value of the '{@link #getBased() <em>Based</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBased()
	 * @generated
	 * @ordered
	 */
	protected static final String BASED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBased() <em>Based</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBased()
	 * @generated
	 * @ordered
	 */
	protected String based = BASED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected QCardinality cardinality;

	/**
	 * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected boolean constant = CONSTANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected QDefault default_;

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected DD definition;

	/**
	 * The default value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected boolean initialized = INITIALIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLike() <em>Like</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLike()
	 * @generated
	 * @ordered
	 */
	protected static final String LIKE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLike() <em>Like</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLike()
	 * @generated
	 * @ordered
	 */
	protected String like = LIKE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isRestricted() <em>Restricted</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isRestricted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESTRICTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRestricted() <em>Restricted</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isRestricted()
	 * @generated
	 * @ordered
	 */
	protected boolean restricted = RESTRICTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataTermPackage.Literals.DATA_TERM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBased() {
		return based;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBased(String newBased) {
		String oldBased = based;
		based = newBased;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataTermPackage.DATA_TERM__BASED, oldBased, based));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(QCardinality newCardinality, NotificationChain msgs) {
		QCardinality oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataTermPackage.DATA_TERM__CARDINALITY, oldCardinality, newCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardinality(QCardinality newCardinality) {
		if (newCardinality != cardinality) {
			NotificationChain msgs = null;
			if (cardinality != null)
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageDataTermPackage.DATA_TERM__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageDataTermPackage.DATA_TERM__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataTermPackage.DATA_TERM__CARDINALITY, newCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstant(boolean newConstant) {
		boolean oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataTermPackage.DATA_TERM__CONSTANT, oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDefault getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault(QDefault newDefault, NotificationChain msgs) {
		QDefault oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataTermPackage.DATA_TERM__DEFAULT, oldDefault, newDefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault(QDefault newDefault) {
		if (newDefault != default_) {
			NotificationChain msgs = null;
			if (default_ != null)
				msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageDataTermPackage.DATA_TERM__DEFAULT, null, msgs);
			if (newDefault != null)
				msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageDataTermPackage.DATA_TERM__DEFAULT, null, msgs);
			msgs = basicSetDefault(newDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataTermPackage.DATA_TERM__DEFAULT, newDefault, newDefault));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DD getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(DD newDefinition, NotificationChain msgs) {
		DD oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataTermPackage.DATA_TERM__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(DD newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageDataTermPackage.DATA_TERM__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageDataTermPackage.DATA_TERM__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataTermPackage.DATA_TERM__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInitialized() {
		return initialized;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialized(boolean newInitialized) {
		boolean oldInitialized = initialized;
		initialized = newInitialized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataTermPackage.DATA_TERM__INITIALIZED, oldInitialized, initialized));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLike() {
		return like;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLike(String newLike) {
		String oldLike = like;
		like = newLike;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataTermPackage.DATA_TERM__LIKE, oldLike, like));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataTermPackage.DATA_TERM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRestricted() {
		return restricted;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestricted(boolean newRestricted) {
		boolean oldRestricted = restricted;
		restricted = newRestricted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataTermPackage.DATA_TERM__RESTRICTED, oldRestricted, restricted));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataTermPackage.DATA_TERM__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public DataTermType getDataTermType() {

		if (getDefinition() == null)
			return null;

		DataTermType dataTermType = null;

		switch (getDefinition().getDataDefType()) {
		case ADAPTER:
		case BINARY:
		case BUFFER:
		case CHARACTER:
		case DATETIME:
		case DECIMAL:
		case FLOATING:
		case HEXADECIMAL:
		case IDENTITY:
		case INDICATOR:
		case POINTER:
		case STRING:
		case STRUCT:
		case DATA_STRUCT:
		case SCROLLER:
		case ARRAY:
		case LIST:
		case STROLLER:
			dataTermType = getDataTermType(getDefinition());
			break;
		case WRAPPER:
			dataTermType = getDataTermType(((QWrapperDef) getDefinition()).getArgument());
			break;
		}

		return dataTermType;
	}

	private DataTermType getDataTermType(QDataDef<?> dataDef) {
		DataTermType dataTermType = null;

		if (dataDef == null)
			return null;

		switch (dataDef.getDataDefType()) {
		case ADAPTER:
		case BINARY:
		case BUFFER:
		case CHARACTER:
		case DATETIME:
		case DECIMAL:
		case FLOATING:
		case HEXADECIMAL:
		case IDENTITY:
		case INDICATOR:
		case POINTER:
		case STRING:
			dataTermType = DataTermType.UNARY_ATOMIC;
			break;
		case STRUCT:
		case DATA_STRUCT:
			dataTermType = DataTermType.UNARY_COMPOUND;
			break;
		case SCROLLER:
		case ARRAY:
		case LIST:
			dataTermType = DataTermType.MULTIPLE_ATOMIC;
			break;
		case STROLLER:
			dataTermType = DataTermType.MULTIPLE_COMPOUND;
			break;
		case WRAPPER:
			break;
		}

		return dataTermType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URI getURI() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageDataTermPackage.DATA_TERM__BASED:
				return getBased();
			case QIntegratedLanguageDataTermPackage.DATA_TERM__CARDINALITY:
				return getCardinality();
			case QIntegratedLanguageDataTermPackage.DATA_TERM__CONSTANT:
				return isConstant();
			case QIntegratedLanguageDataTermPackage.DATA_TERM__DEFAULT:
				return getDefault();
			case QIntegratedLanguageDataTermPackage.DATA_TERM__DEFINITION:
				return getDefinition();
			case QIntegratedLanguageDataTermPackage.DATA_TERM__INITIALIZED:
				return isInitialized();
			case QIntegratedLanguageDataTermPackage.DATA_TERM__LIKE:
				return getLike();
			case QIntegratedLanguageDataTermPackage.DATA_TERM__NAME:
				return getName();
			case QIntegratedLanguageDataTermPackage.DATA_TERM__RESTRICTED:
				return isRestricted();
			case QIntegratedLanguageDataTermPackage.DATA_TERM__TEXT:
				return getText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QIntegratedLanguageDataTermPackage.DATA_TERM__BASED:
				setBased((String)newValue);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__CARDINALITY:
				setCardinality((QCardinality)newValue);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__CONSTANT:
				setConstant((Boolean)newValue);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__DEFAULT:
				setDefault((QDefault)newValue);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__DEFINITION:
				setDefinition((DD)newValue);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__INITIALIZED:
				setInitialized((Boolean)newValue);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__LIKE:
				setLike((String)newValue);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__NAME:
				setName((String)newValue);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__RESTRICTED:
				setRestricted((Boolean)newValue);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__TEXT:
				setText((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QIntegratedLanguageDataTermPackage.DATA_TERM__BASED:
				setBased(BASED_EDEFAULT);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__CARDINALITY:
				setCardinality((QCardinality)null);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__DEFAULT:
				setDefault((QDefault)null);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__DEFINITION:
				setDefinition((DD)null);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__INITIALIZED:
				setInitialized(INITIALIZED_EDEFAULT);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__LIKE:
				setLike(LIKE_EDEFAULT);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__RESTRICTED:
				setRestricted(RESTRICTED_EDEFAULT);
				return;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__TEXT:
				setText(TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QIntegratedLanguageDataTermPackage.DATA_TERM__BASED:
				return BASED_EDEFAULT == null ? based != null : !BASED_EDEFAULT.equals(based);
			case QIntegratedLanguageDataTermPackage.DATA_TERM__CARDINALITY:
				return cardinality != null;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__CONSTANT:
				return constant != CONSTANT_EDEFAULT;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__DEFAULT:
				return default_ != null;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__DEFINITION:
				return definition != null;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__INITIALIZED:
				return initialized != INITIALIZED_EDEFAULT;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__LIKE:
				return LIKE_EDEFAULT == null ? like != null : !LIKE_EDEFAULT.equals(like);
			case QIntegratedLanguageDataTermPackage.DATA_TERM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QIntegratedLanguageDataTermPackage.DATA_TERM__RESTRICTED:
				return restricted != RESTRICTED_EDEFAULT;
			case QIntegratedLanguageDataTermPackage.DATA_TERM__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (based: ");
		result.append(based);
		result.append(", constant: ");
		result.append(constant);
		result.append(", initialized: ");
		result.append(initialized);
		result.append(", like: ");
		result.append(like);
		result.append(", name: ");
		result.append(name);
		result.append(", restricted: ");
		result.append(restricted);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void accept(QDataTermVisitor visitor) {
		if (visitor.visit(this))
			if (getDataTermType().isCompound()) {
				QCompoundDataDef<?, ?> compoundDataDef = null;
				// TODO
				if (getDefinition() instanceof QWrapperDef) {
					QWrapperDef wrapperDef = (QWrapperDef) getDefinition();
					compoundDataDef = (QCompoundDataDef<?, ?>) wrapperDef.getArgument();
				} else
					compoundDataDef = (QCompoundDataDef<?, ?>) getDefinition();

				// elements
				for (QDataTerm<?> child : compoundDataDef.getElements())
					child.accept(visitor);

			}
		visitor.endVisit(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->CompoundDataTerm<?>
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageDataTermPackage.DATA_TERM__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case QIntegratedLanguageDataTermPackage.DATA_TERM__DEFAULT:
				return basicSetDefault(null, msgs);
			case QIntegratedLanguageDataTermPackage.DATA_TERM__DEFINITION:
				return basicSetDefinition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
} // DataTermImpl