package fr.ubordeaux.arduinoCode.ast;

import fr.ubordeaux.arduinoCode.visitor.Visitor;

// l'instruction return <expr>
public class StmRETURN extends Stm {

	private Expr expr;

	public StmRETURN(Expr expr) {
		this.expr = expr;
	}

	public Expr getExpr() {
		return expr;
	}
	public void accept(Visitor visitor) throws Exception {
		visitor.visit(this);
	}

}
