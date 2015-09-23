/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi 			 - Initial API and implementation
 *   Giuliano Giancristofaro - Implementation
 */
package org.smeup.sys.dk.compiler.rpj.writer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerLinker;
import org.smeup.sys.dk.compiler.QDevelopmentKitCompilerFactory;
import org.smeup.sys.il.core.QDerived;
import org.smeup.sys.il.core.QOverlay;
import org.smeup.sys.il.core.QSpecial;
import org.smeup.sys.il.core.QSpecialElement;
import org.smeup.sys.il.core.annotation.Overlay;
import org.smeup.sys.il.core.meta.QDefault;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QRecordWrapper;
import org.smeup.sys.il.data.SortDirection;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.data.def.QArrayDef;
import org.smeup.sys.il.data.def.QBinaryDef;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QDataStructDef;
import org.smeup.sys.il.data.def.QDatetimeDef;
import org.smeup.sys.il.data.def.QDecimalDef;
import org.smeup.sys.il.data.def.QFloatingDef;
import org.smeup.sys.il.data.def.QHexadecimalDef;
import org.smeup.sys.il.data.def.QIndicatorDef;
import org.smeup.sys.il.data.def.QMultipleAtomicDataDef;
import org.smeup.sys.il.data.def.QPointerDef;
import org.smeup.sys.il.data.def.QScrollerDef;
import org.smeup.sys.il.data.def.QStrollerDef;
import org.smeup.sys.il.data.def.QUnaryAtomicDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;

public class JDTNamedNodeWriter extends JDTNodeWriter {

	private TypeDeclaration target;
	private QExpressionParser expressionParser;

	@SuppressWarnings("unchecked")
	public JDTNamedNodeWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {

		super(root, compilationUnit, compilationSetup);

		// Type declaration
		target = getAST().newTypeDeclaration();
		target.setName(getAST().newSimpleName(getCompilationUnit().normalizeTypeName(name)));
		target.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));

		if (root == null)
			getJDTCompilationUnit().types().add(target);
		else
			root.getTarget().bodyDeclarations().add(target);

		expressionParser = getCompilationUnit().getContext().get(QExpressionParser.class);
	}

	@SuppressWarnings("unchecked")
	public void writeFieldSerializer() {

		VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
		variable.setName(getAST().newSimpleName("serialVersionUID"));
		variable.setInitializer(getAST().newNumberLiteral("1L"));

		FieldDeclaration field = getAST().newFieldDeclaration(variable);
		field.setType(getAST().newPrimitiveType(PrimitiveType.LONG));
		field.modifiers().add(getAST().newModifier(ModifierKeyword.PRIVATE_KEYWORD));
		field.modifiers().add(getAST().newModifier(ModifierKeyword.STATIC_KEYWORD));
		field.modifiers().add(getAST().newModifier(ModifierKeyword.FINAL_KEYWORD));

		target.bodyDeclarations().add(field);
	}

	@SuppressWarnings("unchecked")
	public void writePublicField(QDataTerm<?> dataTerm, boolean nullInitialization) {

		VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
		variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(dataTerm.getName())));
		FieldDeclaration field = getAST().newFieldDeclaration(variable);

		// @DataDef
		if(dataTerm.getDefinition()!=null)
			writeDataDefAnnotation(field, dataTerm.getDefinition());

		// default
		QDefault default_ = dataTerm.getDefault();
		if (default_ != null && !default_.isEmpty()) {
			if (dataTerm.getDataTermType().isUnary())
				writeAnnotation(field, DataDef.class, "value", default_.getValue());
			else
				writeAnnotation(field, DataDef.class, "values", default_.getValues());
		}

		// @Overlay
		if (dataTerm.getFacet(QOverlay.class) != null) {
			QOverlay overlay = dataTerm.getFacet(QOverlay.class);

			// structured member
			if (dataTerm.getParent() instanceof QDataTerm<?>) {
				QDataTerm<?> parentTerm = (QDataTerm<?>) dataTerm.getParent();

				if (overlay.getName() != null && !getCompilationUnit().equalsTermName(parentTerm.getName(), overlay.getName()))
					writeAnnotation(field, Overlay.class, "name", overlay.getName());

				if (overlay.getPosition() != null)
					writeAnnotation(field, Overlay.class, "position", overlay.getPosition());

			} else {
				if (overlay.getName() != null)
					writeAnnotation(field, Overlay.class, "name", overlay.getName());

				if (overlay.getPosition() != null)
					if (overlay.getPosition().equals(Overlay.POS_NEXT))
						throw new RuntimeException("Unexpected runtime exception: nc707256c76045");
					else
						writeAnnotation(field, Overlay.class, "position", overlay.getPosition());
			}

		}

		field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
		

		if(dataTerm.getName().equalsIgnoreCase("DSKEYO"))
			System.out.println(dataTerm);
		Type type = getJavaType(dataTerm);
		field.setType(type);

		if (nullInitialization)
			variable.setInitializer(getAST().newNullLiteral());

		getTarget().bodyDeclarations().add(field);
	}

	public void writeInnerRecord(String name, QCompoundDataDef<?, QDataTerm<?>> compoundDataDef) throws IOException {
		QCompilationSetup compilationSetup = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilationSetup();

		JDTDataStructureWriter dataStructureWriter = new JDTDataStructureWriter(this, getCompilationUnit(), compilationSetup, getCompilationUnit().normalizeTypeName(name), QRecordWrapper.class, true);
		dataStructureWriter.writeDataStructure(compoundDataDef);

	}

	@SuppressWarnings("unchecked")
	public void writeInnerTerm(QDataTerm<?> dataTerm) throws IOException {

		if (dataTerm.getDataTermType().isCompound()) {

			QCompoundDataDef<?, QDataTerm<?>> compoundDataDef = (QCompoundDataDef<?, QDataTerm<?>>) dataTerm.getDefinition();
			QCompilerLinker compilerLinker = dataTerm.getFacet(QCompilerLinker.class);
			if (compilerLinker == null) {

				QCompilationSetup compilationSetup = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilationSetup();

				JDTDataStructureWriter dataStructureWriter = new JDTDataStructureWriter(this, getCompilationUnit(), compilationSetup, getCompilationUnit().normalizeTypeName(dataTerm), QDataStructWrapper.class, true);
				dataStructureWriter.writeDataStructure(compoundDataDef);
			} else if (checkFileOverride(compoundDataDef)) {
				Class<QDataStruct> linkedClass = (Class<QDataStruct>) compilerLinker.getLinkedClass();
				QCompilationSetup compilationSetup = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilationSetup();

				JDTDataStructureWriter dataStructureWriter = new JDTDataStructureWriter(this, getCompilationUnit(), compilationSetup, getCompilationUnit().normalizeTypeName(dataTerm), linkedClass,
						true);
				List<QDataTerm<?>> elements = new ArrayList<QDataTerm<?>>();
				for (QDataTerm<?> element : compoundDataDef.getElements()) {
					if (element.getFacet(QDerived.class) != null)
						continue;

					elements.add(element);
				}
				dataStructureWriter.writeElements(elements);
			}
		}

		QSpecial special = dataTerm.getFacet(QSpecial.class);
		if (special != null) {
			EnumDeclaration enumType = getAST().newEnumDeclaration();
			enumType.setName(getAST().newSimpleName(getCompilationUnit().normalizeTypeName(dataTerm) + "Enum"));
			writeEnum(enumType, dataTerm);

			writeImport(Special.class);

			target.bodyDeclarations().add(enumType);
		}

	}

	@SuppressWarnings("unchecked")
	public void writeEnum(EnumDeclaration target, QDataTerm<?> dataTerm) {
		AST ast = target.getAST();

		QSpecial special = dataTerm.getFacet(QSpecial.class);

		target.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		target.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

		// elements
		int num = 0;

		if (special != null)
			for (QSpecialElement element : special.getElements()) {

				EnumConstantDeclaration constantDeclaration = ast.newEnumConstantDeclaration();
				constantDeclaration.setName(ast.newSimpleName(normalizeEnumName(element.getName())));
				writeEnumField(constantDeclaration, element);
				target.enumConstants().add(num, constantDeclaration);
				num++;
			}

		// restricted
		if (!dataTerm.isRestricted()) {
			EnumConstantDeclaration constantDeclaration = ast.newEnumConstantDeclaration();
			constantDeclaration.setName(ast.newSimpleName("OTHER"));
			// QSpecialElement elemDef =
			// QIntegratedLanguageCoreFactory.eINSTANCE.createSpecialElement();
			// writeEnumField(constantDeclaration, elemDef);
			target.enumConstants().add(num, constantDeclaration);
		}

	}

	@SuppressWarnings("unchecked")
	public void writeEnumField(EnumConstantDeclaration enumField, QSpecialElement elem) {
		AST ast = enumField.getAST();
		NormalAnnotation normalAnnotation = ast.newNormalAnnotation();

		String name = new String("*" + enumField.getName());
		if (elem.getValue() != null && !name.equals(elem.getValue())) {
			normalAnnotation.setTypeName(ast.newSimpleName(Special.class.getSimpleName()));
			MemberValuePair memberValuePair = ast.newMemberValuePair();
			memberValuePair.setName(ast.newSimpleName("value"));
			StringLiteral stringLiteral = ast.newStringLiteral();
			stringLiteral.setLiteralValue(elem.getValue());
			memberValuePair.setValue(stringLiteral);
			normalAnnotation.values().add(memberValuePair);

			enumField.modifiers().add(normalAnnotation);
		}
	}

	public Type getJavaPrimitive(QDataTerm<?> dataTerm) {

		QDataDef<?> dataDef = dataTerm.getDefinition();

		Class<?> klass = dataDef.getJavaClass();
		Type type = getAST().newSimpleType(getAST().newSimpleName(klass.getSimpleName()));

		return type;

	}

	public TypeDeclaration getTarget() {
		return this.target;
	}

	public void writeDataDefAnnotation(ASTNode node, QDataDef<?> dataDef) {

		@SuppressWarnings("unchecked")
		Class<? extends QDataDef<?>> klassDef = (Class<? extends QDataDef<?>>) dataDef.getClass();

		if (QArrayDef.class.isAssignableFrom(klassDef)) {
			QArrayDef<?> arrayDef = (QArrayDef<?>) dataDef;

			if (arrayDef.getDimension() != 0)
				writeAnnotation(node, DataDef.class, "dimension", arrayDef.getDimension());

			if(arrayDef.getOrder() != null && arrayDef.getOrder() != SortDirection.ASCEND)
				writeAnnotation(node, DataDef.class, "order", arrayDef.getOrder());
			
			writeDataDefAnnotation(node, arrayDef.getArgument());
		} else if (QScrollerDef.class.isAssignableFrom(klassDef)) {
			QScrollerDef<?> scrollerDef = (QScrollerDef<?>) dataDef;

			if (scrollerDef.getDimension() != 0)
				writeAnnotation(node, DataDef.class, "dimension", scrollerDef.getDimension());

			if(scrollerDef.getOrder() != null && scrollerDef.getOrder() != SortDirection.ASCEND)
				writeAnnotation(node, DataDef.class, "order", scrollerDef.getOrder());
			
			writeDataDefAnnotation(node, scrollerDef.getArgument());
		} else if (QStrollerDef.class.isAssignableFrom(klassDef)) {
			QStrollerDef<?> strollerDef = (QStrollerDef<?>) dataDef;
			
			if (strollerDef.getDimension() != 0)
				writeAnnotation(node, DataDef.class, "dimension", strollerDef.getDimension());

			if(strollerDef.getOrder() != null && strollerDef.getOrder() != SortDirection.ASCEND)
				writeAnnotation(node, DataDef.class, "order", strollerDef.getOrder());
			
		} else if (QBinaryDef.class.isAssignableFrom(klassDef)) {
			QBinaryDef binaryDef = (QBinaryDef) dataDef;
			writeImport(BinaryType.class);
			writeAnnotation(node, DataDef.class, "binaryType", binaryDef.getType());
		}
		/*
		 * else if(QEnumeratedDataDef.class.isAssignableFrom(klassDef)) {
		 * QEnumeratedDataDef<?> dataDefinition = (QEnumeratedDataDef<?>)
		 * dataDef;
		 * 
		 * QBufferedDataDef<?> innerDataDefinition =
		 * dataDefinition.getArgument(); writeImport(unit,
		 * innerDataDefinition.getClass().getName().split("\\."));
		 * setElementAnnotation(unit, target, innerDataDefinition);
		 * 
		 * }
		 */
		else if (QDataStructDef.class.isAssignableFrom(klassDef)) {
			QDataStructDef dataStructureDef = (QDataStructDef) dataDef;

			if (dataStructureDef.isQualified())
				writeAnnotation(node, DataDef.class, "qualified", dataStructureDef.isQualified());

			if (dataStructureDef.getLength() > 0)
				writeAnnotation(node, DataDef.class, "length", dataStructureDef.getLength());
		} 
		else if (QCompoundDataDef.class.isAssignableFrom(klassDef)) {
			QCompoundDataDef<?, ?> compoundDataDef =  (QCompoundDataDef<?, ?>) dataDef;

			if (compoundDataDef.isQualified())
				writeAnnotation(node, DataDef.class, "qualified", compoundDataDef.isQualified());

		} 
		else if (QCharacterDef.class.isAssignableFrom(klassDef)) {
			QCharacterDef charDef = (QCharacterDef) dataDef;

			if (charDef.getLength() > 0)
				writeAnnotation(node, DataDef.class, "length", charDef.getLength());

			if (charDef.isVarying())
				writeAnnotation(node, DataDef.class, "varying", charDef.isVarying());

		} else if (QIndicatorDef.class.isAssignableFrom(klassDef)) {
			QIndicatorDef indicatorDef = (QIndicatorDef) dataDef;
			indicatorDef.toString();
		} else if (QPointerDef.class.isAssignableFrom(klassDef)) {
			QPointerDef pointerDef = (QPointerDef) dataDef;
			writeImport(QPointer.class);
			if (pointerDef.getTarget() != null)
				writeAnnotation(node, DataDef.class, "target", pointerDef.getTarget());
		} else if (QDatetimeDef.class.isAssignableFrom(klassDef)) {
			QDatetimeDef datetimeDef = (QDatetimeDef) dataDef;
			writeImport(DatetimeType.class);
			writeAnnotation(node, DataDef.class, "datetimeType", datetimeDef.getType());
			if (datetimeDef.getFormat() != null)
				writeAnnotation(node, DataDef.class, "datetimeFormat", datetimeDef.getFormat());
		} else if (QDecimalDef.class.isAssignableFrom(klassDef)) {
			QDecimalDef decimalDef = (QDecimalDef) dataDef;

			if (decimalDef.getPrecision() > 0)
				writeAnnotation(node, DataDef.class, "precision", decimalDef.getPrecision());

			if (decimalDef.getScale() > 0)
				writeAnnotation(node, DataDef.class, "scale", decimalDef.getScale());

		} else if (QHexadecimalDef.class.isAssignableFrom(klassDef)) {
			QHexadecimalDef hexadecimalDef = (QHexadecimalDef) dataDef;
			if (hexadecimalDef.getLength() > 0)
				writeAnnotation(node, DataDef.class, "length", hexadecimalDef.getLength());
		} else if (QFloatingDef.class.isAssignableFrom(klassDef)) {
			// QFloatingDef floatDef = (QFloatingDef) dataDef;
			// if (floatDef.getLength() > 0)
			// writeAnnotation(target, annotationName, "length",
			// floatDef.getLength());

		} else
			System.err.println("Unknown field type " + dataDef);

		if (!dataDef.getFormulas().isEmpty())
			writeAnnotation(node, DataDef.class, "formulas", dataDef.getFormulas());
	}

	public void writeAnnotation(ASTNode node, Class<?> annotationKlass) {
		writeAnnotation(node, annotationKlass, null, null);
	}

	@SuppressWarnings("unchecked")
	public void writeAnnotation(ASTNode node, Class<?> annotationKlass, String key, Object value) {

		writeImport(annotationKlass);

		NormalAnnotation annotation = null;

		if (node instanceof EnumDeclaration) {
			EnumDeclaration enumDeclaration = (EnumDeclaration) node;
			annotation = findAnnotation(enumDeclaration.modifiers(), annotationKlass);

			if (annotation == null) {
				annotation = getAST().newNormalAnnotation();
				annotation.setTypeName(getAST().newName(annotationKlass.getSimpleName()));
				enumDeclaration.modifiers().add(annotation);
			}
		} else if (node instanceof FieldDeclaration) {
			FieldDeclaration field = (FieldDeclaration) node;
			annotation = findAnnotation(field.modifiers(), annotationKlass);

			if (annotation == null) {
				annotation = getAST().newNormalAnnotation();
				annotation.setTypeName(getAST().newName(annotationKlass.getSimpleName()));
				field.modifiers().add(annotation);
			}
		} else if (node instanceof EnumConstantDeclaration) {
			EnumConstantDeclaration field = (EnumConstantDeclaration) node;
			annotation = findAnnotation(field.modifiers(), annotationKlass);

			if (annotation == null) {
				annotation = getAST().newNormalAnnotation();
				annotation.setTypeName(getAST().newName(annotationKlass.getSimpleName()));
				field.modifiers().add(annotation);
			}
		} else if (node instanceof SingleVariableDeclaration) {
			SingleVariableDeclaration field = (SingleVariableDeclaration) node;
			annotation = findAnnotation(field.modifiers(), annotationKlass);

			if (annotation == null) {
				annotation = getAST().newNormalAnnotation();
				annotation.setTypeName(getAST().newName(annotationKlass.getSimpleName()));
				field.modifiers().add(annotation);
			}
		} else
			throw new RuntimeException("Unexpected runtime exception 5k43jwh45j8srkf");

		if (key != null) {
			MemberValuePair memberValuePair = getAST().newMemberValuePair();
			memberValuePair.setName(getAST().newSimpleName(key));
			if (value instanceof Number) {
				memberValuePair.setValue(getAST().newNumberLiteral(value.toString()));
				annotation.values().add(memberValuePair);
			} else if (value instanceof Boolean) {
				memberValuePair.setValue(getAST().newBooleanLiteral((boolean) value));
				annotation.values().add(memberValuePair);
			} else if (value instanceof String) {
				StringLiteral stringLiteral = getAST().newStringLiteral();
				// TODO verificare assolutamente
				QExpression expression = expressionParser.parseExpression(value.toString());
				Expression jdtExpression = JDTStatementHelper.buildExpression(getAST(), getCompilationUnit(), expression, null);
				if (jdtExpression instanceof NumberLiteral) {
					NumberLiteral numberExpression = (NumberLiteral) jdtExpression;
					stringLiteral.setLiteralValue(numberExpression.getToken());
				} else	if (jdtExpression instanceof PrefixExpression) {
					PrefixExpression prefixExpression = (PrefixExpression) jdtExpression;
					stringLiteral.setLiteralValue(prefixExpression.getOperator() + prefixExpression.getOperand().toString());
				} else{
					stringLiteral.setLiteralValue((String) value);
				}
				memberValuePair.setValue(stringLiteral);
				annotation.values().add(memberValuePair);
			} else if (value instanceof Enum) {
				Enum<?> enumValue = (Enum<?>) value;
				String enumName = enumValue.getClass().getSimpleName() + "." + ((Enum<?>) value).name();
				memberValuePair.setValue(getAST().newName(enumName.split("\\.")));
				annotation.values().add(memberValuePair);
			} else if (value instanceof List) {
				List<String> listValues = (List<String>) value;

				ArrayInitializer arrayInitializer = getAST().newArrayInitializer();
				for (String listValue : listValues) {
					StringLiteral stringLiteral = getAST().newStringLiteral();
					stringLiteral.setLiteralValue(listValue);
					arrayInitializer.expressions().add(stringLiteral);
				}

				memberValuePair.setValue(arrayInitializer);
				annotation.values().add(memberValuePair);
			} else
				throw new RuntimeException("Unexpected runtime exception k7548j4s67vo4kk");
		}
	}

	private NormalAnnotation findAnnotation(List<?> modifiers, Class<?> annotationKlass) {
		for (Object modifier : modifiers)
			if (modifier instanceof NormalAnnotation) {
				NormalAnnotation annotation = (NormalAnnotation) modifier;
				if (annotation.getTypeName().getFullyQualifiedName().equals(annotationKlass.getSimpleName()))
					return annotation;
			}

		return null;
	}

	@SuppressWarnings({ "unchecked" })
	public Type getJavaType(QDataTerm<?> dataTerm) {

		QDataDef<?> dataDef = dataTerm.getDefinition();
		writeImport(dataDef.getDataClass());

		Type type = null;

		switch (dataTerm.getDataTermType()) {
		case MULTIPLE_ATOMIC:
			QMultipleAtomicDataDef<?> multipleAtomicDataDef = (QMultipleAtomicDataDef<?>) dataDef;

			QUnaryAtomicDataDef<?> innerDataDefinition = multipleAtomicDataDef.getArgument();
			writeImport(innerDataDefinition.getDataClass());

			Type array = getAST().newSimpleType(getAST().newSimpleName(multipleAtomicDataDef.getDataClass().getSimpleName()));
			ParameterizedType parType = getAST().newParameterizedType(array);

			String argument = innerDataDefinition.getDataClass().getSimpleName();
			parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));
			type = parType;

			break;

		case UNARY_ATOMIC:

			type = getAST().newSimpleType(getAST().newSimpleName(dataDef.getDataClass().getSimpleName()));

			break;

		case MULTIPLE_COMPOUND:

			QCompoundDataDef<?, ?> compoundDataDef = (QCompoundDataDef<?, ?>) dataTerm.getDefinition();
			writeImport(compoundDataDef.getDataClass());

			QCompilerLinker compilerLinker = dataTerm.getFacet(QCompilerLinker.class);

			if (compilerLinker != null) {

				Class<QDataStruct> linkedClass = (Class<QDataStruct>) compilerLinker.getLinkedClass();

				if (checkFileOverride(compoundDataDef)) {
					String qualifiedName = getCompilationUnit().getQualifiedName(dataTerm);
					// TODO setup
					type = getAST().newSimpleType(getAST().newName(getCompilationUnit().normalizeTypeName(qualifiedName).split("\\.")));
				} else
					type = getAST().newSimpleType(getAST().newName(linkedClass.getName().split("\\.")));

			} else {
				String qualifiedName = getCompilationUnit().getQualifiedName(dataTerm);
				// TODO setup
				type = getAST().newSimpleType(getAST().newName(getCompilationUnit().normalizeTypeName(qualifiedName).split("\\.")));
			}

			array = getAST().newSimpleType(getAST().newSimpleName(compoundDataDef.getDataClass().getSimpleName()));
			parType = getAST().newParameterizedType(array);

			argument = compoundDataDef.getDataClass().getSimpleName();
			parType.typeArguments().add(type);
			type = parType;

			break;
		case UNARY_COMPOUND:

			compoundDataDef = (QCompoundDataDef<?, ?>) dataTerm.getDefinition();

			compilerLinker = dataTerm.getFacet(QCompilerLinker.class);
			if (compilerLinker != null) {

				Class<?> linkedClass = compilerLinker.getLinkedClass();

				if (checkFileOverride(compoundDataDef)) {
					String qualifiedName = getCompilationUnit().getQualifiedName(dataTerm);
					// TODO setup
					type = getAST().newSimpleType(getAST().newName(getCompilationUnit().normalizeTypeName(qualifiedName).split("\\.")));
				} else
					type = getAST().newSimpleType(getAST().newName(linkedClass.getName().split("\\.")));

			} else {
				String qualifiedName = getCompilationUnit().getQualifiedName(dataTerm);
				// TODO setup
				type = getAST().newSimpleType(getAST().newName(getCompilationUnit().normalizeTypeName(qualifiedName).split("\\.")));
			}

			break;
		}

		QSpecial special = dataTerm.getFacet(QSpecial.class);
		if (special != null) {
			writeImport(QEnum.class);
			Type enumerator = getAST().newSimpleType(getAST().newSimpleName(QEnum.class.getSimpleName()));
			ParameterizedType parEnumType = getAST().newParameterizedType(enumerator);
			// E
			parEnumType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(getCompilationUnit().normalizeTypeName(dataTerm) + "Enum")));
			// D
			parEnumType.typeArguments().add(type);

			type = parEnumType;
		}

		return type;
	}

	public boolean checkFileOverride(QCompoundDataDef<?, ?> compoundDataDef) {

		for (QDataTerm<?> element : compoundDataDef.getElements())
			if (element.getFacet(QDerived.class) == null)
				return true;

		return false;
	}

	public String normalizeEnumName(String s) {

		switch (s) {
		case "*":
			s = "TERM_STAR";
			break;
		case "/":
			s = "TERM_SLASH";
			break;
		case "-":
			s = "TERM_MINUS";
			break;
		case "+":
			s = "TERM_PLUS";
			break;
		case ".":
			s = "TERM_POINT";
			break;
		case ",":
			s = "TERM_COMMA";
			break;
		}

		if (s.startsWith("*"))
			s = s.substring(1);

		if (isNumeric(s))
			s = "NUM_" + s.replace(".", "_");

		return s;
	}

	private boolean isNumeric(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
