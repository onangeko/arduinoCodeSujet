package fr.ubordeaux.arduinoCode.type;

import fr.ubordeaux.arduinoCode.Token;

public class TypeException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TypeException(String msg) {
		super(msg);
	}

	public TypeException(Token token, String msg) {
		super(msg + " " + token);
	}

}
