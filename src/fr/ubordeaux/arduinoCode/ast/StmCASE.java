package fr.ubordeaux.arduinoCode.ast;

import fr.ubordeaux.arduinoCode.visitor.Visitor;

// L'instruction case <expr>: stm
public class StmCASE extends Stm {
    
    private Expr expr;
    private Stm stm;
    
    public StmCASE(Expr expr, Stm stm) {
    	this.expr = expr;
    	this.stm = stm;
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
