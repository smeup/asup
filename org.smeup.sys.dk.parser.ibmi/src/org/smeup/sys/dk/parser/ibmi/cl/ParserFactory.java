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
package org.smeup.sys.dk.parser.ibmi.cl;

import java.util.Hashtable;



public class ParserFactory {

    public enum ScriptType {
        CL,
        CL_COMMAND,
        CL_EXPRESSION,
        CL_PARAMETER
    }
    
    Hashtable<ScriptType, ParserInterface<?>> parserInstances = new Hashtable<ScriptType, ParserInterface<?>>();

    private static ParserFactory instance;

    private ParserFactory() {
    }

    public static ParserFactory getInstance() {
        if (instance == null) {
            instance = new ParserFactory();
        }
        return instance;
    }

    @SuppressWarnings("rawtypes")
	public ParserInterface getParser(ScriptType type) {
    	
    	ParserInterface<?> result = null;
    	
        switch (type) {
            case CL: {
            	
            	if (parserInstances.containsKey(ScriptType.CL)) {
            		result = parserInstances.get(ScriptType.CL);
            	} else {            		
            		result = new CLParserWrapper();
            		parserInstances.put(ScriptType.CL, result);
            	}
            }
            break;
            
            case CL_COMMAND: {
            	if (parserInstances.containsKey(ScriptType.CL_COMMAND)) {
            		result = parserInstances.get(ScriptType.CL_COMMAND);
            	} else {            		
            		result = new CLCommandParserWrapper();
            		parserInstances.put(ScriptType.CL_COMMAND, result);
            	}            	
            }
            break;

            case CL_EXPRESSION: {
            	if (parserInstances.containsKey(ScriptType.CL_EXPRESSION)) {
            		result = parserInstances.get(ScriptType.CL_EXPRESSION);
            	} else {            		
            		result = new CLExpressionParserWrapper();
            		parserInstances.put(ScriptType.CL_EXPRESSION, result);
            	}            	                
            }
            break;
            
            case CL_PARAMETER: {
            	if (parserInstances.containsKey(ScriptType.CL_PARAMETER)) {
            		result = parserInstances.get(ScriptType.CL_PARAMETER);
            	} else {            		
            		result = new CLParameterParserWrapper();
            		parserInstances.put(ScriptType.CL_PARAMETER, result);
            	}            	                            
            }
            break;
        }
        
        return result;
    }
}
