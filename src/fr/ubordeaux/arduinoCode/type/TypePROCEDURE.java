package fr.ubordeaux.arduinoCode.type;

import java.util.List;

public class TypePROCEDURE extends TypeTree {

	private List<TypeFIELD> parameters;

	public TypePROCEDURE(List<TypeFIELD> parameters) {
		super(Tag.PROCEDURE);
		this.parameters = parameters;
	}

	public List<TypeFIELD> getParameters() {
		return parameters;
	}

}
