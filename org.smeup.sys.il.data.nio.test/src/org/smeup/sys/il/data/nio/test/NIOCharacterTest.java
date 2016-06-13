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

import org.junit.Assert;
import org.junit.Test;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.nio.NIOCharacterImpl;
import org.smeup.sys.il.data.nio.NIODataContextImpl;


public class NIOCharacterTest {

    @SuppressWarnings({ "nls", "static-method" })
    @Test
    public void testStrings() {
    	
    	NIODataContextImpl dataContextImpl = new NIODataContextImpl(null, null, null);
    	
    	
        final QString string = new NIOCharacterImpl(dataContextImpl, 10, true);
        string.eval("pippo");

        Assert.assertTrue(string.eq("pippo"));
        
        string.move("Z");
        Assert.assertTrue(string.eq("pippo    Z"));
    }
}
