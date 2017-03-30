/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial implementation
 */

package org.smeup.sys.dk.compiler.base;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.io.IOUtils;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SourceHelper {
	
	private static CodeFormatter codeFormatter = null;
	public static final String XML_TAG_SETTING = "setting";
	
	public static ByteArrayOutputStream format(InputStream input) {
		
//		if (codeFormatter == null) {
			Bundle bundle = FrameworkUtil.getBundle(SourceHelper.class);
			Map<String, String> options = new TreeMap<String, String>();
//			options.put(org.eclipse.jdt.core.JavaCore.COMPILER_SOURCE, "1.8");
//			options.put(org.eclipse.jdt.core.JavaCore.COMPILER_COMPLIANCE, "1.8");
//			options.put(org.eclipse.jdt.core.JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, "1.8");

			try {
				InputStream is = bundle.getEntry("/formatter/formatter.xml").openStream();
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();
				Document doc = builder.parse(is);
				doc.getDocumentElement().normalize();
				
				NodeList nodes = doc.getElementsByTagName(XML_TAG_SETTING);
				for (int x = 0; x < nodes.getLength(); x++) {
					Node node = nodes.item(x);

					if (node.getNodeName().equals(XML_TAG_SETTING)) {
						NamedNodeMap parameterAtts = node.getAttributes();
						String parameterId = parameterAtts.getNamedItem("id").getNodeValue();
						String parameterValue = parameterAtts.getNamedItem("value").getNodeValue();
						
						options.put(parameterId, parameterValue);
					}
				}
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			codeFormatter = org.eclipse.jdt.core.ToolFactory.createCodeFormatter(options);
//		}

		ByteArrayOutputStream output = new ByteArrayOutputStream();

		String code;
		try {
			code = IOUtils.toString(input, "UTF-8");
			
			TextEdit textEdit = codeFormatter.format(CodeFormatter.K_COMPILATION_UNIT, code, 0, code.length(), 0, null);
			if (textEdit != null) {
				IDocument doc = new org.eclipse.jface.text.Document(code);	    
		        textEdit.apply(doc);
		        code = doc.get();		        
			} else {
				//TODO: manage unformattable code error
			}
			
			output.write(code.getBytes(Charset.forName("UTF-8")));
	        output.flush();
	        output.close();
	        
	    } catch (MalformedTreeException e) {
	        e.printStackTrace();
	    } catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return output;		
	}
}
