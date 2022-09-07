package fr.ubordeaux.arduinoCode.type;

import java.util.List;

public class TypeFUNCTION extends TypeTree {

	private List<TypeFIELD> parameters;

	public TypeFUNCTION(List<TypeFIELD> parameters, Type result) {
		super(Tag.FUNCTION, result);
		this.parameters = parameters;
	}

	public List<TypeFIELD> getParameters() {
		return parameters;
	}

}
