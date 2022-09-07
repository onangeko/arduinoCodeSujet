package fr.ubordeaux.arduinoCode.ast;

import java.util.List;

import fr.ubordeaux.arduinoCode.type.Type;
import fr.ubordeaux.arduinoCode.type.TypeTree;
import fr.ubordeaux.arduinoCode.visitor.Visitor;

// Un ensemble
public class ExprSET extends Expr {

	private List<Expr> list;

	public ExprSET(List<Expr> list) {
		super(new TypeTree(Type.Tag.SET));
		this.list = list;
	}

	public List<Expr> getList() {
		return list;
	}

	@Override
	public void accept(Visitor visitor) throws Exception {
		visitor.visit(this);
	}

}
