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

import org.apache.commons.io.IOUtils;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;

public class SourceHelper {
	
	private static CodeFormatter codeFormatter = null;
	
	public static ByteArrayOutputStream format(InputStream input) {
		
		if (codeFormatter == null) {
			Map<String, String> options = new TreeMap<String, String>();
			options.put(org.eclipse.jdt.core.JavaCore.COMPILER_SOURCE, "1.8");
			options.put(org.eclipse.jdt.core.JavaCore.COMPILER_COMPLIANCE, "1.8");
			options.put(org.eclipse.jdt.core.JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, "1.8");
			
			codeFormatter = org.eclipse.jdt.core.ToolFactory.createCodeFormatter(options);
		}

		ByteArrayOutputStream output = new ByteArrayOutputStream();

		String code;
		try {
			code = IOUtils.toString(input, "UTF-8");
			
			TextEdit textEdit = codeFormatter.format(CodeFormatter.K_COMPILATION_UNIT, code, 0, code.length(), 0, null);
			if (textEdit != null) {
				IDocument doc = new Document(code);	    
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
