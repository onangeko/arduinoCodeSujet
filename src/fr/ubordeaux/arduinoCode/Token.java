package fr.ubordeaux.arduinoCode;

public class Token {
	
	private int lineno;
	private int columnno;
	private int code;

	public Token(int code, int lineno, int columnno) {
		this.code = code;
		this.lineno = lineno;
		this.columnno = columnno;
		
	}

	public int getCode() {
		return code;
	}

	public int getLineno() {
		return lineno;
	}

	public int getColumnno() {
		return columnno;
	}

	@Override
	public String toString() {
		int l = lineno+1;
		int c = columnno+1;
		return "(line=" + l + ", column=" + c + ")";
	}

}
