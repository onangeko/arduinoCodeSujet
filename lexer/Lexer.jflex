package fr.ubordeaux.arduinoCode;
import java.math.BigInteger;

%%

%public
%class Lexer
%implements Parser.Lexer
%function next_token
%type Token
%yylexthrow java.io.IOException
%line
%column

%{
    private Token token;
    private Object lval;
    
    @Override
	public Object getLVal() {
	return lval;
    }
    
    @Override
	public void yyerror(String msg) {
	System.err.printf("*** ERROR: %s (line:%s, column:%s)\n", 
			  msg, 
			  (token!=null) ? token.getLineno()+1 : "n", 
			  (token!=null) ? token.getColumnno()+1 : "n");
    }
    
    @Override
	public int yylex() throws java.io.IOException {
	next_token();
	if (token != null)
	    return token.getCode();
	else
	    return 0;
    }

	
    public Token makeToken(int code){
		token = new Token(code, yyline, yycolumn);
		lval = token;
	
		// Uncomment the following lines to trace
		//
		/*** */
		if (code < 256)
	    	System.err.printf("*** TOKEN: '%c' (line:%d, column:%d)\n", code, yyline+1, yycolumn+1); 
		else
	    	System.err.printf("*** TOKEN: " + code + " (line:%d, column:%d)\n", yyline+1, yycolumn+1); 
		/* ***/
		return token;
    }
    
    public Token makeToken(int code, Object lval){
		token = new Token(code, yyline, yycolumn);
		this.lval = lval;
		// Uncomment to trace
		//
		/*** */
		switch (code){
		case PIN:
	    	System.err.printf("*** TOKEN: PIN=" + lval + " (line:%d, column:%d)\n", yyline+1, yycolumn+1);
	    	break;
		case INTEGER:
	    	System.err.printf("*** TOKEN: INTEGER=" + lval + " (line:%d, column:%d)\n", yyline+1, yycolumn+1); 	
	    	break;
		case FLOAT:
	    	System.err.printf("*** TOKEN: FLOAT=" + lval + " (line:%d, column:%d)\n", yyline+1, yycolumn+1);
	    	break;
		case IDENTIFIER:
	    	System.err.printf("*** TOKEN: IDENTIFIER=" + lval + " (line:%d, column:%d)\n", yyline+1, yycolumn+1); 	
	    	break;
		default:
	    	if (code < 256)
				System.err.printf("*** TOKEN: '%c' (line:%d, column:%d)\n", code, yyline+1, yycolumn+1); 
	    	else
				//System.err.printf("*** TOKEN: " + Parser.yytname(code) + " (line:%d, column:%d)\n", yyline+1, yycolumn+1); 
				System.err.printf("*** TOKEN: " + code + " (line:%d, column:%d)\n", yyline+1, yycolumn+1); 
		}	
		/* ***/
		return token;
    }
    
%}

HexPrefix = "0x"
HexInteger = {HexPrefix} [0-9A-F]+
BinPrefix = "B"
BinInteger = {BinPrefix} [0-1]+
Integer = [[:digit:]]+
Decimal = {Integer} (\. {Integer})?
Float = {Decimal} ([Ee][+-]?{Integer})?
Identifier = [a-zA-Z_][a-zA-Z0-9_]*
String = \" ~\"
CommentLines = "/*"~"*/" 
CommentLine = "//".* 

%%
/* OPERATORS, SEPARATORS */
":"	{ return makeToken(':'); }
","	{ return makeToken(','); }
";"	{ return makeToken(';'); }
"="	{ return makeToken('='); }
"("	{ return makeToken('('); }
")"	{ return makeToken(')'); }
"["	{ return makeToken('['); }
"]"	{ return makeToken(']'); }
"{"	{ return makeToken('{'); }
"}"	{ return makeToken('}'); }
"+"	{ return makeToken('+'); }
"-"	{ return makeToken('-'); }
"*"	{ return makeToken('*'); }
"/"	{ return makeToken('/'); }
"%"	{ return makeToken('%'); }
"<"	{ return makeToken('<'); }
"<="	{ return makeToken(LE_TOKEN); }
">"	{ return makeToken('>'); }
">="	{ return makeToken(GE_TOKEN); }
"=="	{ return makeToken(EQ_TOKEN); }
"!="	{ return makeToken(NE_TOKEN); }
"<<"	{ return makeToken(LL_TOKEN); }
">>"	{ return makeToken(GG_TOKEN); }
"&"	{ return makeToken('&'); }
"|"	{ return makeToken('|'); }
"!"	{ return makeToken('!'); }
"&&"	{ return makeToken(AA_TOKEN); }
"||"	{ return makeToken(OO_TOKEN); }
"+="	{ return makeToken(PE_TOKEN); }
"-="	{ return makeToken(ME_TOKEN); }
"*="	{ return makeToken(TE_TOKEN); }
"/="	{ return makeToken(DE_TOKEN); }
"%="	{ return makeToken(CE_TOKEN); }
"&="	{ return makeToken(AE_TOKEN); }
"|="	{ return makeToken(OE_TOKEN); }
"&&="	{ return makeToken(AAE_TOKEN); }
"||="	{ return makeToken(OOE_TOKEN); }
"++"	{ return makeToken(PP_TOKEN); }
"--"	{ return makeToken(MM_TOKEN); }
".."	{ return makeToken(DOTS_TOKEN); }

/* Arduino KEYWORDS */
"pinMode"		{ return makeToken(PINMODE_KEYWORD);}
"digitalWrite"		{ return makeToken(DIGITALWRITE_KEYWORD);}
"analogReference"	{ return makeToken(ANALOGREFERENCE_KEYWORD);}
"analogWrite"		{ return makeToken(ANALOGWRITE_KEYWORD);}
"digitalRead"		{ return makeToken(DIGITALREAD_KEYWORD);}
"analogRead"		{ return makeToken(ANALOGREAD_KEYWORD);}
"delay_ms"		{ return makeToken(DELAY_MS_KEYWORD);}
"delay_s"		{ return makeToken(DELAY_S_KEYWORD);}
"LOW"			{ return makeToken(LOW_KEYWORD);}	
"HIGH"			{ return makeToken(HIGH_KEYWORD);}
"INPUT"			{ return makeToken(INPUT_KEYWORD);}
"INPUTPULLUP"		{ return makeToken(INPUTPULLUP_KEYWORD);}
"OUTPUT"			{ return makeToken(OUTPUT_KEYWORD);}
"getc"			{ return makeToken(GETC_KEYWORD);}
"available"		{ return makeToken(AVAILABLE_KEYWORD);}
"peek"			{ return makeToken(PEEK_KEYWORD);}
"flush"			{ return makeToken(FLUSH_KEYWORD);}
"putc"			{ return makeToken(PUTC_KEYWORD);}
"puts"			{ return makeToken(PUTS_KEYWORD);}

/* KEYWORDS */
"FALSE"			{ return makeToken(FALSE_KEYWORD); }
"HIGH"			{ return makeToken(HIGH_KEYWORD); }
"LOW"			{ return makeToken(LOW_KEYWORD); }
"TRUE"			{ return makeToken(TRUE_KEYWORD); }
"begin"			{ return makeToken(BEGIN_KEYWORD); }
"boolean"		{ return makeToken(BOOLEAN_KEYWORD); }
"break"			{ return makeToken(BREAK_KEYWORD); }
"byte"			{ return makeToken(BYTE_KEYWORD); }
"case"			{ return makeToken(CASE_KEYWORD); }
"continue"		{ return makeToken(CONTINUE_KEYWORD); }
"do"			{ return makeToken(DO_KEYWORD); }
"double"			{ return makeToken(DOUBLE_KEYWORD); }
"else"			{ return makeToken(ELSE_KEYWORD); }
"end"	    		{ return makeToken(END_KEYWORD); }
"enum"			{ return makeToken(ENUM_KEYWORD); }
"float"			{ return makeToken(FLOAT_KEYWORD); }
"foreach"			{ return makeToken(FOREACH_KEYWORD); }
"function"		{ return makeToken(FUNCTION_KEYWORD); }
"if"			{ return makeToken(IF_KEYWORD); }
"in"			{ return makeToken(IN_KEYWORD); }
"integer"		{ return makeToken(INTEGER_KEYWORD); }
"list"			{ return makeToken(LIST_KEYWORD); }
"loop"			{ return makeToken(LOOP_KEYWORD); }
"long"			{ return makeToken(LONG_KEYWORD); }
"of"	    		{ return makeToken(OF_KEYWORD); }
"pin"	    		{ return makeToken(PIN_KEYWORD); }
"procedure"	    	{ return makeToken(PROCEDURE_KEYWORD); }
"range"			{ return makeToken(RANGE_KEYWORD); }
"return" 		{ return makeToken(RETURN_KEYWORD); }
"set"			{ return makeToken(SET_KEYWORD); }
"short"		{ return makeToken(SHORT_KEYWORD); }
"string"		{ return makeToken(STRING_KEYWORD); }
"struct"		{ return makeToken(STRUCT_KEYWORD); }
"switch"		{ return makeToken(SWITCH_KEYWORD); }
"unsigned"		{ return makeToken(UNSIGNED_KEYWORD); }
"while"			{ return makeToken(WHILE_KEYWORD); }
	       
/* PIN_0 .. PIN_13 = 0 .. 13 */
/* PIN_A0 .. PIN_A5 = 14 .. 19 */
"PIN_"([0-9] | 1[0-3])	{ return makeToken(PIN, Integer.parseInt(yytext().substring(4))); }
"PIN_A"[0-5]			{ return makeToken(PIN, Integer.parseInt(yytext().substring(5))+14); }

/* FREE TOKENS */
{Integer}		{ return makeToken(INTEGER, Long.parseLong(yytext())); }
{HexInteger}		{ return makeToken(INTEGER, new BigInteger(yytext(), 16).longValue()); }
{BinInteger}		{ return makeToken(INTEGER, new BigInteger(yytext(), 2).longValue()); }
{Float}			{ return makeToken(FLOAT, Float.parseFloat(yytext())); }
{Identifier}	{ return makeToken(IDENTIFIER, yytext()); }
{String}		{ return makeToken(STRING, yytext().substring(1, yytext().length()-1)); }

/* COMMENTS */
{CommentLines} {}
{CommentLine}  {}

// Other characters
\n			{}
.|[^]			{}
