package fr.ubordeaux.arduinoCode.ast;

import fr.ubordeaux.arduinoCode.type.Type;
import fr.ubordeaux.arduinoCode.visitor.Visitor;

// Variable déclarée
public class DeclVAR implements Ast {

	private String name;
	private Type type;

	public DeclVAR(String name, Type type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public void accept(Visitor visitor) throws Exception {
		visitor.visit(this);
	}

	public Type getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int size() {
		if (type!=null)
			return type.size();
		else
			return 0;
	}

}
