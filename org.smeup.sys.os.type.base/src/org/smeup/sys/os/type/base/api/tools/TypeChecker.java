package org.smeup.sys.os.type.base.api.tools;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;

public class TypeChecker {

	private QTypeRegistry typeRegistry;

	public TypeChecker(QTypeRegistry typeRegistry) {
		this.typeRegistry = typeRegistry;
	}
	
	public QType<?> getType(QCharacter typeAsQCharacter) {
		String objectTypeString = typeAsQCharacter.trimR();
		if (objectTypeString != null && !"".equals(objectTypeString)) {
			QType<?> typeFound = typeRegistry.lookup(translateTypeName(objectTypeString));
			if (typeFound != null) {
				return typeFound;
			}
		}
		return null;
	}
	
	private String translateTypeName(String objectTypeString) {
		if (objectTypeString.startsWith("*")) {
			return objectTypeString;
		}
		return "*" + objectTypeString;
	}	
	
}
