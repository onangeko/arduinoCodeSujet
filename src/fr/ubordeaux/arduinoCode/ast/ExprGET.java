package fr.ubordeaux.arduinoCode.ast;

// Un élément d'une liste ou d'un intervalle
public class ExprGET extends ExprUnary {

	private Expr index;

	public ExprGET(Expr expr, ExprVAR index) {
		super(Op.GET, index.getType(), expr);
		this.index = index;
	}

	public Expr getIndex() {
		return index;
	}

}
