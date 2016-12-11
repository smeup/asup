/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core.impl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.impl.ObjectNameableImpl;
import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.core.QApplicationComponent;
import org.smeup.sys.rt.core.QConfig;
import org.smeup.sys.rt.core.QRuntimeCorePackage;
import org.smeup.sys.rt.core.QServiceCommandProvider;
import org.smeup.sys.rt.core.QServiceHook;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.rt.core.impl.ApplicationImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.impl.ApplicationImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.impl.ApplicationImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.impl.ApplicationImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.impl.ApplicationImpl#getHooks <em>Hooks</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.impl.ApplicationImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.impl.ApplicationImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends ObjectNameableImpl implements QApplication {
	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<QServiceCommandProvider> commands;
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<QApplicationComponent> components;
	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected QConfig config;
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected QContext context;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getHooks() <em>Hooks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHooks()
	 * @generated
	 * @ordered
	 */
	protected EList<QServiceHook> hooks;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QRuntimeCorePackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QServiceCommandProvider> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<QServiceCommandProvider>(QServiceCommandProvider.class, this, QRuntimeCorePackage.APPLICATION__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<QApplicationComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<QApplicationComponent>(QApplicationComponent.class, this, QRuntimeCorePackage.APPLICATION__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConfig getConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfig(QConfig newConfig, NotificationChain msgs) {
		QConfig oldConfig = config;
		config = newConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QRuntimeCorePackage.APPLICATION__CONFIG, oldConfig, newConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig(QConfig newConfig) {
		if (newConfig != config) {
			NotificationChain msgs = null;
			if (config != null)
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QRuntimeCorePackage.APPLICATION__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QRuntimeCorePackage.APPLICATION__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QRuntimeCorePackage.APPLICATION__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<QServiceHook> getHooks() {
		if (hooks == null) {
			hooks = new EObjectContainmentEList<QServiceHook>(QServiceHook.class, this, QRuntimeCorePackage.APPLICATION__HOOKS);
		}
		return hooks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QRuntimeCorePackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QRuntimeCorePackage.APPLICATION__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QRuntimeCorePackage.APPLICATION__TEXT, oldText, text));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QContext getContext() {
		if (context != null && ((EObject)context).eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (QContext)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QRuntimeCorePackage.APPLICATION__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QContext basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(QContext newContext) {
		QContext oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QRuntimeCorePackage.APPLICATION__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QRuntimeCorePackage.APPLICATION__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
			case QRuntimeCorePackage.APPLICATION__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case QRuntimeCorePackage.APPLICATION__CONFIG:
				return basicSetConfig(null, msgs);
			case QRuntimeCorePackage.APPLICATION__HOOKS:
				return ((InternalEList<?>)getHooks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QRuntimeCorePackage.APPLICATION__COMMANDS:
				return getCommands();
			case QRuntimeCorePackage.APPLICATION__COMPONENTS:
				return getComponents();
			case QRuntimeCorePackage.APPLICATION__CONFIG:
				return getConfig();
			case QRuntimeCorePackage.APPLICATION__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case QRuntimeCorePackage.APPLICATION__HOOKS:
				return getHooks();
			case QRuntimeCorePackage.APPLICATION__NAME:
				return getName();
			case QRuntimeCorePackage.APPLICATION__PORT:
				return getPort();
			case QRuntimeCorePackage.APPLICATION__TEXT:
				return getText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QRuntimeCorePackage.APPLICATION__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends QServiceCommandProvider>)newValue);
				return;
			case QRuntimeCorePackage.APPLICATION__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends QApplicationComponent>)newValue);
				return;
			case QRuntimeCorePackage.APPLICATION__CONFIG:
				setConfig((QConfig)newValue);
				return;
			case QRuntimeCorePackage.APPLICATION__CONTEXT:
				setContext((QContext)newValue);
				return;
			case QRuntimeCorePackage.APPLICATION__HOOKS:
				getHooks().clear();
				getHooks().addAll((Collection<? extends QServiceHook>)newValue);
				return;
			case QRuntimeCorePackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case QRuntimeCorePackage.APPLICATION__PORT:
				setPort((Integer)newValue);
				return;
			case QRuntimeCorePackage.APPLICATION__TEXT:
				setText((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QRuntimeCorePackage.APPLICATION__COMMANDS:
				getCommands().clear();
				return;
			case QRuntimeCorePackage.APPLICATION__COMPONENTS:
				getComponents().clear();
				return;
			case QRuntimeCorePackage.APPLICATION__CONFIG:
				setConfig((QConfig)null);
				return;
			case QRuntimeCorePackage.APPLICATION__CONTEXT:
				setContext((QContext)null);
				return;
			case QRuntimeCorePackage.APPLICATION__HOOKS:
				getHooks().clear();
				return;
			case QRuntimeCorePackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QRuntimeCorePackage.APPLICATION__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case QRuntimeCorePackage.APPLICATION__TEXT:
				setText(TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QRuntimeCorePackage.APPLICATION__COMMANDS:
				return commands != null && !commands.isEmpty();
			case QRuntimeCorePackage.APPLICATION__COMPONENTS:
				return components != null && !components.isEmpty();
			case QRuntimeCorePackage.APPLICATION__CONFIG:
				return config != null;
			case QRuntimeCorePackage.APPLICATION__CONTEXT:
				return context != null;
			case QRuntimeCorePackage.APPLICATION__HOOKS:
				return hooks != null && !hooks.isEmpty();
			case QRuntimeCorePackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QRuntimeCorePackage.APPLICATION__PORT:
				return port != PORT_EDEFAULT;
			case QRuntimeCorePackage.APPLICATION__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", port: ");
		result.append(port);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
