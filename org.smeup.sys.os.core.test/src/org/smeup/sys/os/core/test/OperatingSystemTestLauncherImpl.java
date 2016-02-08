package org.smeup.sys.os.core.test;
/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */


import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.base.DirectoryTestLauncherImpl;

/*
 * Extends DirectoryTestLauncherImpl class and setting test category by class annotation
 */

@Test(category = "OS.DTAQ")
public class OperatingSystemTestLauncherImpl extends DirectoryTestLauncherImpl{	
}

