package fr.ubordeaux.arduinoCode.ast;

import java.util.List;

import fr.ubordeaux.arduinoCode.visitor.Visitor;

// Une séquence d'instructions
public class StmSeq extends Stm {

	private List<Stm> stms;

	public StmSeq(List<Stm> stms) {
		this.stms = stms;
	}

	@Override
	public void accept(Visitor visitor) throws Exception {
		for (Stm stm : stms) {
			stm.accept(visitor);
		}
	}

}
