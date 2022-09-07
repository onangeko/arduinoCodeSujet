package fr.ubordeaux.arduinoCode.ast;

import fr.ubordeaux.arduinoCode.type.Type;
import fr.ubordeaux.arduinoCode.visitor.Visitor;

// Une expression à deux opérandes
// op donne le type d'opération
public class ExprBinary extends Expr {

	public static enum Op {PLUS, MUL, MINUS, PERC, GT, GE, LT, LE, EQ, NE, 
		BSL, BSR, BAND, BOR, AND, OR, DIV};

	private Expr left;
	private Expr right;
	private Op op;

	public ExprBinary(Op op, Type type, Expr left, Expr right) {
		super(type);
		this.op = op;
		this.left = left;
		this.right = right;
	}

	public void accept(Visitor visitor) throws Exception {
		visitor.visit(this);
	}

	public Expr getLeft() {
		return left;
	}

	public Expr getRight() {
		return right;
	}

	public Op getOp() {
		return op;
	}
}
