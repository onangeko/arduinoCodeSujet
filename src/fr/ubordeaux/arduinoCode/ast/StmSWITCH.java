package fr.ubordeaux.arduinoCode.ast;

import java.util.List;

import fr.ubordeaux.arduinoCode.visitor.Visitor;

// L'instruction switch <(expr)> <stm>
public class StmSWITCH extends Stm {

    private Expr expr;
	private List<StmCASE> list;
    
	public StmSWITCH(Expr expr, List<StmCASE> list) {
		this.expr = expr;
		this.list = list;
	}
    
	public Expr getExpr() {
		return expr;
	}

	public List<StmCASE> getList() {
		return list;
	}

	public void accept(Visitor visitor) throws Exception {
		visitor.visit(this);
	}

}
