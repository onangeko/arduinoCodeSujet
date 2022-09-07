package fr.ubordeaux.arduinoCode.ast;

import fr.ubordeaux.arduinoCode.type.Type;
import fr.ubordeaux.arduinoCode.type.Type.Tag;

// Une expression en général
// Le résultat du calcul d'une expression sera
// enregistré dans un registre: int register
// Le type est connu
public abstract class Expr implements Ast {
    
	private Type type;
	private int register;
    
    public Expr(Type type) {
    	this.type = type;
    }
    
	public Type getType() {
    	return type;
    }

	public int size() {
		if (type != null)
			return type.size();
		else
			return 0;
	}

	public void cast(Tag tag) {
		type.cast(tag);
	}

	public Object getValue() {
		return null;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getRegister() {
		return register;
	}

	public void setRegister(int register) {
		this.register = register;
	}

    @Override
	public String toString() {
		return "Expr [type=" + type + ", register=" + register + "]";
	}

}

