package fr.ubordeaux.arduinoCode.ast;

import fr.ubordeaux.arduinoCode.visitor.Visitor;

// L'instruction break
public class StmBREAK extends Stm {

	public StmBREAK() {
	}

	public void accept(Visitor visitor) throws Exception {
		visitor.visit(this);
	}
}
