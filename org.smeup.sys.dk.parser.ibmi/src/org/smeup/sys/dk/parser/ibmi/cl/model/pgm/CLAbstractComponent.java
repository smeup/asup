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
package org.smeup.sys.dk.parser.ibmi.cl.model.pgm;

import java.util.LinkedList;

public abstract class CLAbstractComponent {
	
	private String text;
	private int line;
	private CLAbstractComponent father;
	private LinkedList<CLAbstractComponent> childs = new LinkedList<CLAbstractComponent>();
	
	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}
	
	public void setLine(int line){
		this.line = line;
	}

    public int getLine(){
    	return line;
    }
    
  	public void setFather(CLAbstractComponent father){
    	this.father = father;
    }
    
  
	public CLAbstractComponent getFather(){
    	return father;
    }
    
  
	public void addChild(CLAbstractComponent child) {
    	childs.add(child);
    }
    
  
	public LinkedList<CLAbstractComponent> getChilds(){
    	return childs;
    }
    
    

    public abstract CLComponentType getComponentType();
    

}
