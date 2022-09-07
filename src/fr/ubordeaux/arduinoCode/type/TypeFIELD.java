package fr.ubordeaux.arduinoCode.type;

public class TypeFIELD extends TypeTree {

	private String name;

	public TypeFIELD(String name, Type type) {
		super(Tag.FIELD, type);
		this.name = name;
	}

	@Override
	public String toString() {
		return name + ":" + left;
	}

}
