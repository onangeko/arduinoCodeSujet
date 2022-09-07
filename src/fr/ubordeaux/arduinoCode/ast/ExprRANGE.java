package fr.ubordeaux.arduinoCode.ast;

import fr.ubordeaux.arduinoCode.type.Type;
import fr.ubordeaux.arduinoCode.type.TypeTree;
import fr.ubordeaux.arduinoCode.visitor.Visitor;

// Un intervalle
public class ExprRANGE extends Expr {

	private Expr exprMin;
	private Expr exprMax;

	public ExprRANGE(Expr exprMin, Expr exprMax) {
		super(new TypeTree(Type.Tag.FREE));
		this.exprMin = exprMin;
		this.exprMax = exprMax;
	}

	public Expr getExprMin() {
		return exprMin;
	}

	public Expr getExprMax() {
		return exprMax;
	}

	@Override
	public void accept(Visitor visitor) throws Exception {
		visitor.visit(this);
	}


}
