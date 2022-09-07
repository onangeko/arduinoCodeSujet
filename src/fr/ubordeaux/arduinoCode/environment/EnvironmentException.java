package fr.ubordeaux.arduinoCode.environment;

public class EnvironmentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EnvironmentException(String msg) {
		super("*** ERROR Environment: " + msg);
	}

}
