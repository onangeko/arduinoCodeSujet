package fr.ubordeaux.arduinoCode.ast;

import fr.ubordeaux.arduinoCode.type.Type;
import fr.ubordeaux.arduinoCode.visitor.Visitor;

// Une expression variable
// Cela permet de savoir son nom
public class ExprVAR extends Expr {

	private String name;

	public ExprVAR(String name, Type type) {
		super(type);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ExprVAR [toString()=" + super.toString() + "]";
	}

	public void accept(Visitor visitor) throws Exception {
		visitor.visit(this);
	}

}
