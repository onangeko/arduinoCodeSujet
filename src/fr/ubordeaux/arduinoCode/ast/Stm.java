package fr.ubordeaux.arduinoCode.ast;

import fr.ubordeaux.arduinoCode.Token;

// Une instruction arduinoCode
// token sert pour retrouver la source de cette instruction (numéro de ligne dans le code)
// id est un identifiant unique qui permet de nommer de façon unique
// des labels dans le code produit
public abstract class Stm implements Ast {

	private Token token;
	private int id;
	private static int nextId;

	public Stm() {
		id = nextId++;
	}
	
	public Stm(Token token) {
		this();
		this.token = token;
	}

	public Token getToken() {
		return token;
	}

	public String getId() {
		return String.valueOf(id);
	}

}
