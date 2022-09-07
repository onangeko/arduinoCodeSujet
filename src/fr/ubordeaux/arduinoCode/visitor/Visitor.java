package fr.ubordeaux.arduinoCode.visitor;

import fr.ubordeaux.arduinoCode.ast.*;

public interface Visitor {

	void visit(Stm stm) throws Exception;

	void visit(Expr expr) throws Exception;

	void visit(StmAFF stm) throws Exception;

	void visit(StmIF stmIF) throws Exception;

	void visit(ExprCONSTANT expr) throws Exception;

	void visit(ExprFUNCTION expr) throws Exception;

	void visit(StmLOOP stmLOOP) throws Exception;

	void visit(ExprBinary exprBinary) throws Exception;

	void visit(ExprUnary exprUnary) throws Exception;

	void visit(ExprVAR exprVAR) throws Exception;

	void visit(StmBREAK stmBREAK) throws Exception;

	void visit(StmCASE stmCASE) throws Exception;

	void visit(StmDO stmDO) throws Exception;

	void visit(StmFOREACH stmFOREACH) throws Exception;

	void visit(StmRETURN stmRETURN) throws Exception;

	void visit(StmSWITCH stmSWITCH) throws Exception;

	void visit(StmWHILE stmWHILE) throws Exception;

	void visit(DeclVAR declVAR) throws Exception;

	void visit(ExprSET exprSET) throws Exception;

	void visit(ExprLIST exprLIST) throws Exception;

	void visit(ExprRANGE exprRANGE) throws Exception;;

}
