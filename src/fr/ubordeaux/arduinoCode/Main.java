package fr.ubordeaux.arduinoCode;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
	FileReader inputFile = null;
	System.err.println("*** begin compilation");
	try {
	    inputFile = new FileReader(args[0]);
	    Parser.Lexer Lexer = new Lexer(inputFile);
	    Parser parser = new Parser(Lexer);
	    parser.parse();
	} 
	catch (IOException e) {
	    System.err.println(e.getMessage());
	}
	catch (Exception e){
	    System.err.println(e.getMessage());
	}
	finally {
	    System.err.println("*** end compilation");
	}
    }

}

