package fr.ubordeaux.arduinoCode.visitor;

import java.util.List;

import fr.ubordeaux.arduinoCode.ast.*;
import fr.ubordeaux.arduinoCode.ast.ExprUnary.Op;
import fr.ubordeaux.arduinoCode.type.Type;
import fr.ubordeaux.arduinoCode.type.TypeException;
import fr.ubordeaux.arduinoCode.type.Type.Tag;

public class CheckTypeVisitor extends ConcreteVisitor {

	private String name;

	public CheckTypeVisitor(String name) {
		super();
		this.name = name;
	}


	@Override
	public void visit(StmIF stm) throws TypeException {
		System.err.println("*** visit(StmIF) with " + this);
		stm.getExpr().getType().attestBoolean();
	}

	@Override
	public void visit(StmWHILE stm) throws TypeException {
		System.err.println("*** visit(StmWHILE) with " + this);
		stm.getExpr().getType().attestBoolean();
	}

	@Override
	public void visit(StmFOREACH stm) throws TypeException {
		System.err.println("*** visit(StmFOREACH) with " + this);
		switch (stm.getExpr().getType().getTag()) {
			case LIST:
				break;
			case RANGE:
				break;
			case SET:
				break;
			default:
				throw new TypeException("Wrong Type for expresion");
		}
	}

	@Override
	public void visit(ExprFUNCTION expr) throws Exception {
		System.err.println("*** visit(ExprFUNCTION) with " + this);
		if (expr.getArguments() != null) {
			for (Expr arg : expr.getArguments()) {
				arg.accept(this);
			}
		}
	}

	@Override
	public void visit(ExprLIST expr) throws Exception {
		System.err.println("*** visit(ExprFUNCTION) with " + this);
		List<Expr> list = expr.getList();
		Type type = list.get(0).getType();
		for (Expr expr2 : list) {
			expr2.getType().attestEquivalentTo(type);
		}
	}

	@Override
	public void visit(ExprCONSTANT expr) throws Exception {
		System.err.println("*** visit(ExprCONSTANT) with " + this);
	}

	@Override
	public void visit(ExprUnary expr) throws Exception {
		System.err.println("*** visit(ExprUnary) with " + this);
		switch(expr.getType().getTag()){
			case BOOLEAN:
				switch(expr.getOp()){
					case NOT:
						break;
					case ARG:
						break;
					default:
						throw new TypeException("wrong operation : " + expr.getOp().toString() + " , for the type " + expr.getType().getTag().toString());
				}
				break;
			case ENUM: case LIST: case RANGE: case SET: case STRING:
			switch(expr.getOp()){
				case GET:
					break;
				case ARG:
					break;
				default:
					throw new TypeException("wrong operation : " + expr.getOp().toString() + " , for the type " + expr.getType().getTag().toString());
			}
			break;
			case FUNCTION: case PROCEDURE:
				if(expr.getOp() != Op.ARG)
					throw new TypeException("wrong operation : " + expr.getOp().toString() + " , for the type " + expr.getType().getTag().toString());
				break;
			case F32_T:
				switch(expr.getOp()){
					case MINUS:
						break;
					case ARG:
						break;
					default:
						throw new TypeException("wrong operation : " + expr.getOp().toString() + " , for the type " + expr.getType().getTag().toString());
				}
				break;
			case INT16_T: case INT32_T: case INT8_T: 
				switch(expr.getOp()){
					case MINUS:
						break;
					case NOT:
						break;
					case PP:
						break;
					case PP2:
						break;
					case MM:
						break;
					case MM2:
						break;
					case ARG:
						break;
					default:
					throw new TypeException("wrong operation : " + expr.getOp().toString() + " , for the type " + expr.getType().getTag().toString());
				} 
				break;
					
					
			case UINT8_T: case UINT16_T: case UINT32_T:
				switch(expr.getOp()){
				case PP:
					break;
				case PP2:
					break;
				case MM:
					break;
				case MM2:
					break;
				case ARG:
					break;
				default:
				throw new TypeException("wrong operation : " + expr.getOp().toString() + " , for the type " + expr.getType().getTag().toString());
				}
				break;
			case PIN:
				if(expr.getOp() != Op.ARG)
					throw new TypeException("wrong operation : " + expr.getOp().toString() + " , for the type " + expr.getType().getTag().toString());
				break;
			default:
			throw new TypeException("wrong type :" + expr.getType().toString());
		}
		expr.getExpr().accept(this);
	}

	public void visit(ExprBinary expr) throws Exception {
        expr.getLeft().getType().attestEquivalentTo(expr.getRight().getType());
        switch (expr.getLeft().getType().getTag()) {
            case STRING:
                throw new TypeException("String operation not supported");
            case BOOLEAN:
                switch (expr.getOp()) {
                    case MUL, PLUS, PERC, BSL, BSR, DIV, GT, GE, LT, LE -> throw new TypeException("Boolean operation not supported");
                    default -> {
                    }
                }
            case F32_T:
                if (expr.getOp() == ExprBinary.Op.PERC) {
                    throw new TypeException("Float operation not supported");
                }
            default:
                break;
        }
    }
@Override //OK
    public void visit(ExprSET expr) throws Exception{
        System.err.println("*** visit(ExprSET) with " + this);
        List<Expr> list = expr.getList();
        Type type = list.get(0).getType();
        for (Expr expr2 : list) {
            expr2.getType().attestEquivalentTo(type);
        }
    }
@Override //OK
    public void visit(StmAFF stm) throws TypeException {
        System.err.println("*** visit(Stm) with " + this);
        stm.getRight().setType(stm.getLeft().getType());
        stm.getLeft().getType().attestEquivalentTo(stm.getRight().getType());
    }

	@Override
	public String toString() {
		return name;
	}

	@Override
	public String getPurpose() {
		return " Teste le type de l'objet et déclanche une exception TypeException en cas d'échec";
	}

	@Override
	public String getEffect() {
		return "Déclanche une exception de type TypeException";
	}

}
