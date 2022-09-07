package fr.ubordeaux.arduinoCode.ast;

import fr.ubordeaux.arduinoCode.type.Type;
import fr.ubordeaux.arduinoCode.visitor.Visitor;

// Une expression avec une seule opérande
// op donne le type d'opération
// GET désigne une opération qui consiste à trouver une valeur dans un intervalle ou une liste
// ARG désigne une opération qui consiste à passer un argument à une fonction
public class ExprUnary extends Expr {

	public enum Op {NOT, MINUS, PP, MM, PP2, MM2, GET, ARG};
	private Op op;
	private Expr expr;

	public ExprUnary(Op op, Type type, Expr expr) {
		super(type);
		this.expr = expr;
		this.op = op;
	}

	public ExprUnary(Op op, Expr expr) {
		super(expr.getType());
		this.expr = expr;
		this.op = op;
	}

	public void accept(Visitor visitor) throws Exception {
		visitor.visit(this);
	}

	public Expr getExpr() {
		return expr;
	}

	public Op getOp() {
		return op;
	}
}
