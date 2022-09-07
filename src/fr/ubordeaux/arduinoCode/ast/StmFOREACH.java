package fr.ubordeaux.arduinoCode.ast;

import fr.ubordeaux.arduinoCode.visitor.Visitor;

// L'instruction foreach <var> in <expr> <stm>
public class StmFOREACH extends Stm {

	private String var;
	private Expr expr;
	private Stm stm;

	public StmFOREACH(String var, Expr expr, Stm stm) {
		this.var = var;
		this.expr = expr;
		this.stm = stm;
	}

	public String getVar() {
		return var;
	}

	public Expr getExpr() {
		return expr;
	}

	public Stm getStm() {
		return stm;
	}

	public void accept(Visitor visitor) throws Exception {
		visitor.visit(this);
	}
}
