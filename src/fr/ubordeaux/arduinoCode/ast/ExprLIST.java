package fr.ubordeaux.arduinoCode.ast;

import java.util.List;

import fr.ubordeaux.arduinoCode.type.Type;
import fr.ubordeaux.arduinoCode.type.TypeTree;
import fr.ubordeaux.arduinoCode.visitor.Visitor;

// Une liste d'expressions (pour être passée comme arguments d'une fonction par exemple)
public class ExprLIST extends Expr {

	private List<Expr> list;

	public ExprLIST(List<Expr> list) {
		super(new TypeTree(Type.Tag.FREE));
		this.list = list;
	}

	@Override
	public void accept(Visitor visitor) throws Exception {
		visitor.visit(this);
	}

	public List<Expr> getList() {
		return list;
	}

}
