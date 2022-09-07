package fr.ubordeaux.arduinoCode.ast;

import java.util.ArrayList;
import java.util.List;

import fr.ubordeaux.arduinoCode.visitor.Visitor;

// L'instruction while (<expr>) <stm>
public class StmWHILE extends Stm {

	private Expr expr;
	private ArrayList<Stm> stm = new ArrayList<Stm>();

	public StmWHILE(Expr expr, List<Stm> stm) {
		this.expr = expr;
		this.stm.addAll(stm);
	}

	public Expr getExpr() {
		return expr;
	}

	public List<Stm> getStm() {
		return stm;
	}

	public void accept(Visitor visitor) throws Exception {
		visitor.visit(this);
	}

}
