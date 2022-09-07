package fr.ubordeaux.arduinoCode.ast;

import fr.ubordeaux.arduinoCode.visitor.Visitor;

// Arbre de Syntaxe Abstrait (Abstract Syntax Tree)
public interface Ast {

	void accept(Visitor visitor) throws Exception;

}
