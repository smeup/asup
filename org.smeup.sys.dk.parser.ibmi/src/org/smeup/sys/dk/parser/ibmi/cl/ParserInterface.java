/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.dk.parser.ibmi.cl;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;

import org.smeup.sys.dk.parser.ibmi.cl.exceptions.CLScriptException;


public interface ParserInterface <A> {

    public A parse(InputStream in) throws CLScriptException;

    public A parse(Reader in) throws CLScriptException;

    public A parse(File f) throws CLScriptException;

    public A parse(String script) throws CLScriptException;
}
