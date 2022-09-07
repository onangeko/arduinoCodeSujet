package fr.ubordeaux.arduinoCode.ast;

import java.util.List;

import fr.ubordeaux.arduinoCode.type.Type;
import fr.ubordeaux.arduinoCode.visitor.Visitor;

// L'appel à une fonction
// Son type est connu
// Les arguments sont une liste d'expressions
// Le résultat sera passé dans le registre de l'expression
// La fonction est déclarée et définie par l'utilisateur ou alors prédéfinie (defined)
public class ExprFUNCTION extends Expr {

	public enum Defined {
		pinMode, digitalRead, digitalWrite, analogReference, analogRead, analogWrite, 
		peek, flush, putc, puts, getc, available, delay_s, delay_ms
	};
	
	private String name;
	private List<Expr> arguments;
	private Defined defined;

	public ExprFUNCTION(String name, List<Expr> arguments) {
		super(null);
		this.name = name;
		this.arguments = arguments;
	}

	public ExprFUNCTION(Defined defined, List<Expr> arguments) {
		super(null);
		this.defined = defined;
		this.arguments = arguments;
	}

	public ExprFUNCTION(Defined defined, List<Expr> arguments, Type type) {
		super(type);
		this.defined = defined;
		this.arguments = arguments;
	}

	public ExprFUNCTION(Defined defined, Type type) {
		super(type);
		this.defined = defined;
	}

	public ExprFUNCTION(Defined defined) {
		super(null);
		this.defined = defined;
	}

	public void accept(Visitor visitor) throws Exception {
		visitor.visit(this);
	}

	public Defined getDefined() {
		return defined;
	}

	public List<Expr> getArguments() {
		return arguments;
	}

	public String getName() {
		return name;
	}

}
