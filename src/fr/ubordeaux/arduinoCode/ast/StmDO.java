package fr.ubordeaux.arduinoCode.ast;

import fr.ubordeaux.arduinoCode.visitor.Visitor;

// L'instruction do <stm> while (<expr>);
public class StmDO extends Stm {

	private Stm stm;
	private Expr expr;

	public Stm getStm() {
		return stm;
	}

	public Expr getExpr() {
		return expr;
	}

	public StmDO(Stm stm, Expr expr) {
		this.stm = stm;
		this.expr = expr;
	}

	public void accept(Visitor visitor) throws Exception {
		visitor.visit(this);
	}
}
