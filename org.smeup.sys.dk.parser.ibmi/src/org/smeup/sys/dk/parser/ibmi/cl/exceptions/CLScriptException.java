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
package org.smeup.sys.dk.parser.ibmi.cl.exceptions;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauro
 */
public class CLScriptException extends RuntimeException{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CLScriptException(Throwable cause) {
        super(cause);
    }

    public CLScriptException(String message, Throwable cause) {
        super(message, cause);
    }

    public CLScriptException(String message) {
        super(message);
    }

    public CLScriptException() {
    }
    
    public String toString() {
    	return "CLScriptException: " + getMessage();
    }

}
