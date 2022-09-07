//
// DO NOT EDIT
// NE PAS EDITER CE FICHIER
//

package fr.ubordeaux.arduinoCode.visitor;

import fr.ubordeaux.arduinoCode.ast.*;

//
// Cette classe ne fait rien d'autre que d'afficher un message quand le développeur n'a pas 
// encore implémenté le visitor
//
public abstract class ConcreteVisitor implements Visitor {

	public void warningUnimplementedVisitOverloading(Object object) {
		// uncomment for verbose mode 
		/*** */
		System.err.println("*** unimplemented method public void visit(" + object.getClass().getSimpleName() + " o) in " + this + " visitor");
		System.err.println("*** VOUS DEVEZ COPIER CECI DANS LE FICHIER " + this.getClass().getSimpleName() + ".java:");
		System.err.println("");
		System.err.println("// Purpose: " + this.getPurpose());
		System.err.println("// Argument: " + object.getClass().getSimpleName() + " object");
		System.err.println("// Effect: " + this.getEffect());
		System.err.println("public void visit(" + object.getClass().getSimpleName() + " object) throws Exception {");
		System.err.println("   System.err.println(\"*** visit(" + object.getClass().getSimpleName() + ") with" + this.getClass().getSimpleName() + "\");");
		System.err.println("   // VOTRE CODE ICI");
		System.err.println("}");
		System.err.println("");
		/**** */
	}

	public abstract String getEffect();

	public abstract String getPurpose();

	@Override
	public void visit(Stm stm) throws Exception {
		warningUnimplementedVisitOverloading(stm);
	}

	@Override
	public void visit(Expr expr) throws Exception {
		warningUnimplementedVisitOverloading(expr);
	}

	@Override
	public void visit(StmAFF stm) throws Exception {
		warningUnimplementedVisitOverloading(stm);
	}

	@Override
	public void visit(StmIF stmIF) throws Exception {
		warningUnimplementedVisitOverloading(stmIF);
	}

	@Override
	public void visit(ExprCONSTANT expr) throws Exception {
		warningUnimplementedVisitOverloading(expr);
	}

	@Override
	public void visit(ExprFUNCTION expr) throws Exception {
		if (expr.getArguments() != null) {
			for (Expr arg : expr.getArguments()) {
				arg.accept(this);
			}
		}
	}

	@Override
	public void visit(StmLOOP stmLOOP) throws Exception {
		stmLOOP.getStm().accept(this);
	}

	@Override
	public void visit(ExprBinary expr) throws Exception  {
		warningUnimplementedVisitOverloading(expr);
	}

	@Override
	public void visit(ExprUnary expr) throws Exception {
		warningUnimplementedVisitOverloading(expr);
	}

	@Override
	public void visit(ExprVAR expr) throws Exception  {
		warningUnimplementedVisitOverloading(expr);
	}

	@Override
	public void visit(StmBREAK stm) throws Exception  {
		warningUnimplementedVisitOverloading(stm);
	}

	@Override
	public void visit(StmCASE stm) throws Exception  {
		warningUnimplementedVisitOverloading(stm);
	}

	@Override
	public void visit(StmDO stm) throws Exception  {
		warningUnimplementedVisitOverloading(stm);
	}

	@Override
	public void visit(StmFOREACH stm) throws Exception  {
		warningUnimplementedVisitOverloading(stm);
	}

	@Override
	public void visit(StmRETURN stm) throws Exception  {
		warningUnimplementedVisitOverloading(stm);
	}

	@Override
	public void visit(StmSWITCH stm) throws Exception  {
		warningUnimplementedVisitOverloading(stm);
	}

	@Override
	public void visit(StmWHILE stm) throws Exception  {
		warningUnimplementedVisitOverloading(stm);
	}

	@Override
	public void visit(DeclVAR declVAR) {
		warningUnimplementedVisitOverloading(declVAR);
	}

	@Override
	public void visit(ExprSET exprSET) throws Exception {
		warningUnimplementedVisitOverloading(exprSET);
	}

	@Override
	public void visit(ExprLIST exprLIST) throws Exception {
		warningUnimplementedVisitOverloading(exprLIST);
	}

	@Override
	public void visit(ExprRANGE exprRANGE) throws Exception {
		warningUnimplementedVisitOverloading(exprRANGE);
	}

}
