package org.smeup.sys.os.pgm.asm;

import java.util.Map;

import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodAdapter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class JumpTransformer extends ClassAdapter {

	private static final String JUMP = "qJump";

	private String filterClass = null;
	private Map<String, Label> tag2Label = null;

	private String lastTag = null;

	public JumpTransformer(ClassVisitor cv, String filterClass, Map<String, Label> tag2Label) {
		super(cv);
		this.filterClass = filterClass;
		this.tag2Label = tag2Label;
	}

	@Override
	public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {

		return new MethodAdapter(super.visitMethod(access, name, desc, signature, exceptions)) {

			@Override
			public void visitMethodInsn(int opcode, String owner, String name, String desc) {

				// filtered class
				if (!owner.startsWith(filterClass) && !owner.equals("org/asup/os/type/pgm/rpj/RPJProgramSupport")) {
					super.visitMethodInsn(opcode, owner, name, desc);
					return;
				}
				
				if (opcode == Opcodes.INVOKEVIRTUAL && name.equals(JUMP)) {

					Label label = tag2Label.get(lastTag);
					if (label == null)
						System.err.println("Unexpected condition: nasd78qweablreq68u");

					super.visitInsn(Opcodes.POP);
					super.visitInsn(Opcodes.POP);

					super.visitJumpInsn(Opcodes.GOTO, label);
				} else
					super.visitMethodInsn(opcode, owner, name, desc);
			}

			@Override
			public void visitFieldInsn(int opcode, String owner, String name, String desc) {

				if (opcode == Opcodes.GETSTATIC && owner.endsWith("$TAG"))
					lastTag = name;

				super.visitFieldInsn(opcode, owner, name, desc);
			}

			@Override
			public void visitLabel(Label paramLabel) {
				// TODO Auto-generated method stub
				super.visitLabel(paramLabel);
			}

			@Override
			public void visitLineNumber(int paramInt, Label paramLabel) {

				Label label = null;
				for (Label tempLabel : tag2Label.values()) {
					if (tempLabel.info != null && tempLabel.info.equals(paramInt)) {
						label = tempLabel;
						break;
					}
				}

				if (label != null) {
					super.visitLabel(label);
					super.visitLineNumber(paramInt, label);
				} else {
					super.visitLabel(paramLabel);
					super.visitLineNumber(paramInt, paramLabel);
				}
			}
		};
	}
}