/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.dk.parser.ibmi.cl.util;
/*
 * ools | Templates
 * and open the template in the editor.
 */

import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.UnwantedTokenException;
import org.smeup.sys.dk.parser.ibmi.cl.exceptions.CLScriptException;


public class LexerHelper {

    /**
     * Method called in AntLR grammars for AntLR lexer to CLScript exceptions conversion
	 * 
     * @param e
     * @return
     */
	public RuntimeException createException(RecognitionException e) {
        String message = "";
        
        if (e instanceof NoViableAltException) {
            message = "Syntax error. ";
        } else if (e instanceof MissingTokenException) {
            message = "Missing token ";
        } else if (e instanceof UnwantedTokenException) {
            UnwantedTokenException ex = (UnwantedTokenException) e;
            ex.getUnexpectedToken().getText();
            message = "Unkow token '" + ex.getUnexpectedToken().getText() + "' at line " + e.token.getLine() + ":" + e.token.getCharPositionInLine();        
        } else {
            message = "Syntax error near ";
        }
        
        return new CLScriptException(message,e);
    }
}
