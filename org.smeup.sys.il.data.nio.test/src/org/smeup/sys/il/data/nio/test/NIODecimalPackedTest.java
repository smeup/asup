/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Gianluca Fioletti - Initial API and implementation
 */
package org.smeup.sys.il.data.nio.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.nio.NIODataContextImpl;
import org.smeup.sys.il.data.nio.NIODecimalZonedImpl;


public class NIODecimalPackedTest {

    @SuppressWarnings({ "nls", "static-method" })
    @Test
    public void testEquals() {

    	NIODataContextImpl dataContextImpl = new NIODataContextImpl();
    	
        final QDecimal v1 = new NIODecimalZonedImpl(dataContextImpl, 10, 2, true);
        v1.eval(2.5);
        Assert.assertTrue(v1.eq(BigDecimal.valueOf(2.5)));

    }
}
