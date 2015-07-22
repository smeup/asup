package org.smeup.sys.os.pgm.asm;

import java.util.HashMap;
import java.util.Map;

import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.commons.EmptyVisitor;
 

public class LabelAnalyzer extends EmptyVisitor {
	
	private static final String LABEL = "qLabel";

	private String lastTag = null;
	private Label lastLabel = null;
	
	private Map<String, Label> tag2Label = new HashMap<String, Label>();
	
	public Map<String, Label> getTag2Label() {
		return tag2Label;
	}
	
	@Override
    public void visitMethodInsn(int opcode, String owner, String name, String desc) {
	
//		if(owner.startsWith("org/asup/os/type/pgm/rpj/RPJProgramSupport"))
//			return;
		
		if(opcode == Opcodes.INVOKEVIRTUAL && name.equals(LABEL))
			tag2Label.put(lastTag, lastLabel);
		else if(name.equals(LABEL))
			"".toCharArray();
			
	}
	
	@Override
	public void visitFieldInsn(int opcode, String owner, String name, String desc) {
		
		if(opcode == Opcodes.GETSTATIC && owner.endsWith("$TAG")) 
			lastTag = name;
	}

	@Override
	public void visitLineNumber(int line, Label label) {

		lastLabel = label;
		label.info = line;
	}
}