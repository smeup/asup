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
package org.smeup.sys.dk.parser.ibmi.cl.model.parm;

import java.util.LinkedList;

public abstract class CLParmAbstractComponent {
	
	private String text;	
	private CLParmAbstractComponent father;
	private LinkedList<CLParmAbstractComponent> childs = new LinkedList<CLParmAbstractComponent>();
	
	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}	
	    
    
    
	public void setFather(CLParmAbstractComponent father){
    	this.father = father;
    }
    
    
    
	public CLParmAbstractComponent getFather(){
    	return father;
    }
    
    
	public void addChild(CLParmAbstractComponent child) {
    	childs.add(child);
    }
        
	public LinkedList<CLParmAbstractComponent> getChilds(){
    	return childs;
    }

    public abstract CLParmComponentType getComponentType();
    

}
