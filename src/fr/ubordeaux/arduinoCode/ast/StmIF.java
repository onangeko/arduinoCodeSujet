package fr.ubordeaux.arduinoCode.ast;

import java.util.ArrayList;
import java.util.List;

import fr.ubordeaux.arduinoCode.Token;
import fr.ubordeaux.arduinoCode.visitor.Visitor;

// L'instruction if (<expr>) <stm> [else <stm>]
public class StmIF extends Stm {

	private Expr expr;
	private ArrayList<Stm> stmTrue = new ArrayList<Stm>();
	private int trueIndex = -1;
	private int falseIndex = -1;
	private ArrayList<Stm> stmFalse = new ArrayList<Stm>();

	public StmIF(Token token, Expr expr, List<Stm> stm1, List<Stm> stm2) {
		super(token);
		this.expr = expr;
		for (Stm stm : stm1) {
			stmTrue.add(trueIndex++, stm);
		}
		for (Stm stm : stm2) {
			stmTrue.add(trueIndex++, stm);
		}
	}

	public StmIF(Token token, Expr expr, List<Stm> stm1) {
		super(token);
		this.expr = expr;
		for (Stm stm : stm1) {
			stmTrue.add(trueIndex++, stm);
		}
	}

	public StmIF(Token token, Expr expr, Stm stm1, Stm stm2) {
		super(token);
		this.expr = expr;
		stmTrue.add(trueIndex++, stm1);
		stmFalse.add(falseIndex, stm2);
	}

	public StmIF(Token token, Expr expr, Stm stm1) {
		super(token);
		this.expr = expr;
		stmTrue.add(trueIndex++, stm1);
	}

	public Expr getExpr() {
		return expr;
	}

	public List<Stm> getStm1() {
		return stmTrue;
	}

	public List<Stm> getStm2() {
		return stmFalse;
	}

	public void accept(Visitor visitor) throws Exception {
		visitor.visit(this);
	}

}
