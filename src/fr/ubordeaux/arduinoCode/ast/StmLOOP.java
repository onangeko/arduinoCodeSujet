package fr.ubordeaux.arduinoCode.ast;

import fr.ubordeaux.arduinoCode.visitor.Visitor;

// l'instruction loop <stm>
public class StmLOOP extends Stm {

	private Stm stm;

	public StmLOOP(Stm stm) {
		this.stm = stm;
	}

	public void accept(Visitor visitor) throws Exception{
		visitor.visit(this);
	}

	public Stm getStm() {
		return stm;
	}

}
