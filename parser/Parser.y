%language "Java"

// Définit la classe 
// package fr.ubordeaux.arduinoCode
// public class Parser 
// 
%define api.package {fr.ubordeaux.arduinoCode} // pour bison 3.5
%define api.parser.class {Parser}
%define api.parser.public

// Classes importées
%code imports {
	import java.util.List;
	import java.util.ArrayList;
	import java.util.Map;
	import java.util.HashMap;
	import fr.ubordeaux.arduinoCode.ast.*;
	import fr.ubordeaux.arduinoCode.environment.*;
	import fr.ubordeaux.arduinoCode.type.*;
	import fr.ubordeaux.arduinoCode.visitor.*;
}

// Déclaration de variables et de méthodes
// dans la classe Parser
%code {

  // On initialise ici différents environnements:
  // varEnvironment pour les variables
  // typeEnvironment pour les déclarations de types
  // functionEnvironment pour des déclarations de fonctions
  private Environment<ExprVAR> varEnvironment = new MapEnvironment<>("Variables");
  private Environment<Type> typeEnvironment = new MapEnvironment<>("Types");
  private Environment<Type> functionEnvironment = new MapEnvironment<>("Functions");

  // Il y a plusieurs visitors: 
  // checkTypeVisitor va vérifier le type dans les instructions et dans les expressions
  // dataGeneratorVisitor produit la déclaration des variables de AVR Assembler
  // codeGeneratorVisitor produit le code AVR Assembler
  private Visitor checkTypeVisitor = new CheckTypeVisitor("Type checking");
  private CodeGeneratorVisitor codeGeneratorVisitor = new CodeGeneratorVisitor("Code Generator");
  private DataGeneratorVisitor dataGeneratorVisitor = new DataGeneratorVisitor("Data Generator");
    
  // J'ai cherché en vain à afficher les tokens avec ça
  /* public static String yytname(int code){ */
  /* 	  return String. SymbolKind.yytname_[code-256]; */
  /* 	} */

  // Purpose: Affiche le message tant 
  //          qu'on ne commente pas la ligne
  // 		  Utilisé pour afficher des éléments de débogage
  // Argument: Message à afficher
  private void trace(String message) {
	  // uncomment the following line to trace
	  /***
	  System.err.println(message);
	  ***/
	}

}

// Code lancé lors de la construction d'un objet Parser
// Il sert à typer les fonctions prédéfinies
%code init {
// On enregistre le type des fonction prédéfinies

// void pinMode(uint8_t pin, uint8_t mode);
{
		List<TypeFIELD> argumentTypes = new ArrayList<>();
		argumentTypes.add(new TypeFIELD(null, new TypeTree(Type.Tag.UINT8_T)));
		argumentTypes.add(new TypeFIELD(null, new TypeTree(Type.Tag.UINT8_T)));
		functionEnvironment.put("pinMode", new TypeFUNCTION(argumentTypes, null));
}
// void digitalWrite(uint8_t pin, uint8_t val);
{
		List<TypeFIELD> argumentTypes = new ArrayList<>();
		argumentTypes.add(new TypeFIELD(null, new TypeTree(Type.Tag.UINT8_T)));
		argumentTypes.add(new TypeFIELD(null, new TypeTree(Type.Tag.UINT8_T)));
		functionEnvironment.put("digitalWrite", new TypeFUNCTION(argumentTypes, null));
}
// void analogReference(uint8_t mode);
{
		List<TypeFIELD> argumentTypes = new ArrayList<>();
		argumentTypes.add(new TypeFIELD(null, new TypeTree(Type.Tag.UINT8_T)));
		functionEnvironment.put("analogReference", new TypeFUNCTION(argumentTypes, null));
}
// void analogWrite(uint8_t pin, uint8_t val);
{
		List<TypeFIELD> argumentTypes = new ArrayList<>();
		argumentTypes.add(new TypeFIELD(null, new TypeTree(Type.Tag.UINT8_T)));
		argumentTypes.add(new TypeFIELD(null, new TypeTree(Type.Tag.UINT8_T)));
		functionEnvironment.put("analogWrite", new TypeFUNCTION(argumentTypes, null));
}
// uint16_t peek()
{
		Type outputType = new TypeTree(Type.Tag.UINT16_T);
		functionEnvironment.put("analogWrite", new TypeFUNCTION(null, outputType));
}
// void flush()
{
		functionEnvironment.put("analogWrite", new TypeFUNCTION(null, null));
}
// void putc(uint8_t val)
{
		List<TypeFIELD> argumentTypes = new ArrayList<>();
		argumentTypes.add(new TypeFIELD(null, new TypeTree(Type.Tag.UINT8_T)));
		functionEnvironment.put("putc", new TypeFUNCTION(argumentTypes, null));
}
// void puts(uint16_t val)
{
		List<TypeFIELD> argumentTypes = new ArrayList<>();
		argumentTypes.add(new TypeFIELD(null, new TypeTree(Type.Tag.UINT16_T)));
		functionEnvironment.put("puts", new TypeFUNCTION(argumentTypes, null));
}
// void delay_s(uint16_t val)
{
		List<TypeFIELD> argumentTypes = new ArrayList<>();
		argumentTypes.add(new TypeFIELD(null, new TypeTree(Type.Tag.UINT16_T)));
		functionEnvironment.put("delay_s", new TypeFUNCTION(argumentTypes, null));
}
// void delay_ms(uint16_t val)
{
		List<TypeFIELD> argumentTypes = new ArrayList<>();
		argumentTypes.add(new TypeFIELD(null, new TypeTree(Type.Tag.UINT16_T)));
		functionEnvironment.put("delay_ms", new TypeFUNCTION(argumentTypes, null));
}
// uint8_t digitalRead(uint8_t pin)
{
		List<TypeFIELD> argumentTypes = new ArrayList<>();
		argumentTypes.add(new TypeFIELD(null, new TypeTree(Type.Tag.UINT8_T)));
		Type outputType = new TypeTree(Type.Tag.UINT8_T);
		functionEnvironment.put("digitalRead", new TypeFUNCTION(argumentTypes, outputType));
}
// uint16_t analogRead(uint8_t pin)
{
		List<TypeFIELD> argumentTypes = new ArrayList<>();
		argumentTypes.add(new TypeFIELD(null, new TypeTree(Type.Tag.UINT8_T)));
		Type outputType = new TypeTree(Type.Tag.UINT16_T);
		functionEnvironment.put("analogRead", new TypeFUNCTION(argumentTypes, outputType));
}
// uin8_t getc() 
{
		Type outputType = new TypeTree(Type.Tag.UINT8_T);
		functionEnvironment.put("getc", new TypeFUNCTION(null, outputType));
}
// uint16_t available();
{
		Type outputType = new TypeTree(Type.Tag.UINT8_T);
		functionEnvironment.put("available", new TypeFUNCTION(null, outputType));
}

}

/* multi-character operators */
%token<Token>
	'<' LE_TOKEN "<=" '>' GE_TOKEN ">=" EQ_TOKEN "==" NE_TOKEN "!="
	'!' LL_TOKEN "<<" GG_TOKEN ">>" '&' '|'
	AA_TOKEN "&&" OO_TOKEN "||"
	'+' '-' '*' '/' '%' 
	PE_TOKEN "+=" ME_TOKEN "-=" TE_TOKEN "*=" DE_TOKEN "/=" CE_TOKEN "%="
	AE_TOKEN "&=" OE_TOKEN "|=" AAE_TOKEN "&&=" OOE_TOKEN "||="
	PP_TOKEN "++" MM_TOKEN "--"
	'=' ':' DOTS_TOKEN ".."

 /* KEYWORDS */
%token <Token>
	BEGIN_KEYWORD "begin"
	BOOLEAN_KEYWORD "boolean"
	BREAK_KEYWORD "break"
	BYTE_KEYWORD "byte"
	CASE_KEYWORD "case"
	CONTINUE_KEYWORD "continue"
	DO_KEYWORD "do"
	DOUBLE_KEYWORD "double"
	ELSE_KEYWORD "else"
	END_KEYWORD "end"
	ENUM_KEYWORD "enum"
	FALSE_KEYWORD "FALSE"
	FLOAT_KEYWORD "float"
	FOREACH_KEYWORD "foreach"
	FUNCTION_KEYWORD "function"
	IF_KEYWORD "if"
	INTEGER_KEYWORD "integer"
	IN_KEYWORD "in"
	LIST_KEYWORD "list"
	LONG_KEYWORD "long"
	LOOP_KEYWORD "loop"
	OF_KEYWORD "of"
	PROCEDURE_KEYWORD "procedure"
	RANGE_KEYWORD "range"
	RETURN_KEYWORD "return"
	SET_KEYWORD "set"
	SHORT_KEYWORD "short"
	STRUCT_KEYWORD "struct"
	STRING_KEYWORD "string"
	SWITCH_KEYWORD "switch"
	TRUE_KEYWORD "TRUE"
	UNSIGNED_KEYWORD "unsigned"
	WHILE_KEYWORD "while"

 /* ARDUINO KEYWORDS */
%token <Token>
	PINMODE_KEYWORD "pinMode"
	DIGITALWRITE_KEYWORD "digitalWrite"
	ANALOGREFERENCE_KEYWORD "analogReference"
	ANALOGWRITE_KEYWORD "analogWrite"
	DIGITALREAD_KEYWORD "digitalRead"
	ANALOGREAD_KEYWORD "analogRead"
	LOW_KEYWORD "LOW"
	HIGH_KEYWORD "HIGH"
	INPUT_KEYWORD "INPUT"
	INPUTPULLUP_KEYWORD "INPUTPULLUP"
	OUTPUT_KEYWORD "OUTPUT"
	PIN_KEYWORD "pin"
	GETC_KEYWORD "getc"
	AVAILABLE_KEYWORD "available"
	PEEK_KEYWORD "peek"
	FLUSH_KEYWORD "flush"
	PUTC_KEYWORD "putc"
	PUTS_KEYWORD "puts"
	DELAY_MS_KEYWORD "delay_ms"
	DELAY_S_KEYWORD "delay_s"

/* TOKEN WITH CONTENT */
%token <String> IDENTIFIER
%token <Long> INTEGER
%token <Integer> PIN
%token <Float> FLOAT
%token <String> STRING

// Ce qui suit permet d'écrire une grammaire plus simplement
// par précédence d'opérateurs (cf le cours)

%right '='
%left "||"
%left "&&"
%nonassoc '<' "<=" '>' ">=" "==" "!="
%nonassoc HIGHER_THAN_NOT
%left '-' '+'
%left '*' '/' '%'
%right "++" "--"
%nonassoc HIGHER_THAN_MINUS
%right "<<" ">>"
%left '|'
%left '&'
%nonassoc IDENTIFIER
%nonassoc ':'

// Les types des symboles
// La plupart sont des AST
%type <Stm> stm assign_stm non_if_stm open_stm close_stm
%type <StmCASE> case_stm
%type <List<Stm> > open_list_of_stm close_list_of_stm open_block close_block
%type <List<StmCASE> > list_of_case_stms
%type <Expr> expression
%type <Expr> left_part
%type <Expr> ATmega328p_procedure
%type <Expr> ATmega328p_expression
%type <List<Expr> > list_of_expressions
%type <ExprCONSTANT> constant_expression
%type <Type> number type
%type <List<String> > list_of_identifiers
%type <List<TypeFIELD> > list_of_parameters
%type <TypeFIELD> parameter
%type <List<TypeFIELD> > list_of_fields
%type <TypeFIELD> field

%start program

%%
// Programme principal arduinoCode
program:
	list_of_definitions "begin" open_list_of_stm "end" {
        trace("*** REDUCE: program -> list_of_definitions \"begin\" list_of_stms \"end\"");
	    // On tente de produire des bouts de code AVR Assembler
	    // de chaque instruction
	    try{
	      for (Stm stm : $3){
			stm.accept(dataGeneratorVisitor);
			stm.accept(codeGeneratorVisitor);
	      }
	    } catch (Exception e) {
	      System.err.println(e.getMessage());
	      return YYABORT;
	    }
	    // On génère le code complet
	    
	    codeGeneratorVisitor.generateHead();
	    dataGeneratorVisitor.generateCode();
	    codeGeneratorVisitor.generateCode();
	    codeGeneratorVisitor.generateFoot();
	    
	    
	    // On arrête l'analyse syntaxique 
	    return YYABORT;
 	}
	;

// Les définitions de types, de variables et de procédures et fonctions
list_of_definitions:
	/* empty */ { trace("*** REDUCE: list_of_definitions -> "); }
	| list_of_definitions definition {
	  trace("*** REDUCE: list_of_definitions -> definition list_of_definitions");
 	}
	;

// La liste des instructions
close_list_of_stm:
	close_stm { trace("*** REDUCE: list_of_stms -> stm"); 
	  // On tente de vérifier les types de chaque instruction	
	  try{
	    $1.accept(checkTypeVisitor);
	  } catch (Exception e) {
	    System.err.println(e.getMessage());
	    return YYABORT;
	  }
	  // On crée la liste des instructions
	  List<Stm> list = new ArrayList<>();
	  list.add($1);
	  $$ = list;
	}
	| close_list_of_stm close_stm {
	  trace("*** REDUCE: list_of_stms -> list_of_stms stm"); 
	  // On tente de vérifier les types de chaque instruction	
	  try{
	    $2.accept(checkTypeVisitor);
	  } catch (Exception e) {
	    System.err.println(e.getMessage());
	    return YYABORT;
	  }
	  // On récupère la liste des instructions
	  // et on y met la suivante
	  List<Stm> list = $1;
	  list.add($2);
	  $$ = list;
	}
	;


open_list_of_stm:
	stm { trace("*** REDUCE: list_of_stms -> stm"); 
	  // On tente de vérifier les types de chaque instruction	
	  try{
	    $1.accept(checkTypeVisitor);
	  } catch (Exception e) {
	    System.err.println(e.getMessage());
	    return YYABORT;
	  }
	  // On crée la liste des instructions
	  List<Stm> list = new ArrayList<>();
	  list.add($1);
	  $$ = list;
	}
	| open_list_of_stm stm {
	  trace("*** REDUCE: list_of_stms -> list_of_stms stm"); 
	  // On tente de vérifier les types de chaque instruction	
	  try{
	    $2.accept(checkTypeVisitor);
	  } catch (Exception e) {
	    System.err.println(e.getMessage());
	    return YYABORT;
	  }
	  // On récupère la liste des instructions
	  // et on y met la suivante
	  List<Stm> list = $1;
	  list.add($2);
	  $$ = list;
	}
	;

// Une définition
definition:
	var_definition { trace("*** REDUCE: definition -> var_definition"); }
	| type_definition { trace("*** REDUCE: definition -> type_definition"); }
	| function_decl { trace("*** REDUCE: definition -> function_decl"); }
	| procedure_decl { trace("*** REDUCE: definition -> procedure_decl"); }
	| function_definition { trace("*** REDUCE: definition -> function_definition"); }
	| procedure_definition { trace("*** REDUCE: definition -> procedure_definition"); }
	;

// déclaration d'une série de variables de même type
var_definition:
	list_of_identifiers ':' type ';' {
	  trace("*** REDUCE: var_definition -> list_of_identifiers \':\' type \';\'");
	  // pour chacune de ces variables, on va créer un AST DeclVAR
	  // et on va produire le bout de code AVR Assembler qui s'y rapporte
	  // (pour réserver la place mémoire au début du programme)
	  for (String id : $1) {
	    varEnvironment.put(id, new ExprVAR(id, $3));
	    DeclVAR decl = new DeclVAR(id, $3);
	    try{
	      decl.accept(dataGeneratorVisitor);
	    } catch (Exception e) {
	      System.err.println(e.getMessage());
	      return YYABORT;
	    }
	    
	  }
	}
	;

// Une liste d'identificateurs
list_of_identifiers:
	IDENTIFIER { trace("*** REDUCE: list_of_identifiers -> IDENTIFIER");
	  List<String> list = new ArrayList<>();
	  list.add($1);
	  $$ = list;
	}
	| list_of_identifiers ',' IDENTIFIER {
	  trace("*** REDUCE: list_of_identifiers -> list_of_identifiers \',\' IDENTIFIER");
	  List<String> list = $1;
	  list.add($3);
	  $$ = list;
	  }
	;

// La définition d'une type nommé
type_definition:
	IDENTIFIER '=' type ';' {
	  trace("*** REDUCE: type_definition -> IDENTIFIER \'=\' type \';\'");
	  typeEnvironment.put($1, $3);
	}
 	;

// La déclaration d'une fonction
function_decl:
	"function" IDENTIFIER '(' list_of_parameters ')' ':' type ';' {
	  trace("*** REDUCE: function_decl -> \"function\" IDENTIFIER \'(\' list_of_parameters \')\' \':\' type \';\'");
	  functionEnvironment.put($2, new TypeFUNCTION($4, $7));
	}
	;

// La déclaration d'une procédure
procedure_decl:
	"procedure" IDENTIFIER '(' list_of_parameters ')' ';' {
	  trace("*** REDUCE: procedure_decl -> \"procedure\" IDENTIFIER \'(\' list_of_parameters \')\' \';\'");
	  functionEnvironment.put($2, new TypePROCEDURE($4));
	}
	;

// La définition d'une fonction, c'est-à-dire avec son code ("block")
function_definition:
	"function" IDENTIFIER '(' list_of_parameters ')' ':' type '{' {
		functionEnvironment.put($2, new TypeFUNCTION($4, $7));
	} 
	open_block '}' {
	  trace("*** REDUCE: function_definition -> \"function\" IDENTIFIER \'(\' list_of_parameters \')\' \':\' type \'{\' block \'}\'");
	  }
	;

// La définition d'une procédure, c'est-à-dire avec son code ("block")
procedure_definition:
	"procedure" IDENTIFIER '(' list_of_parameters ')' '{' {	  
		functionEnvironment.put($2, new TypePROCEDURE($4));
	} 
	"procedure" IDENTIFIER '(' list_of_parameters ')' '{' open_block '}' {
	  trace("*** REDUCE: procedure_definition -> \"procedure\" IDENTIFIER \'(\' list_of_parameters \')\' \' {\' block \'}\'");
	}
	;

// La liste des paramètres d'une fonction ou d'une procédure
list_of_parameters:
	parameter {
	  trace("*** REDUCE: list_of_parameters -> parameter");
	  List<TypeFIELD> list = new ArrayList<>();
	  list.add($1);
	  $$ = list;
	  }
	| list_of_parameters ',' parameter {
	  trace("*** REDUCE: list_of_parameters -> list_of_parameters \',\' parameter");
	  List<TypeFIELD> list = $1;
	  list.add($3);
	  $$ = list;
	}
	;

// Un paramètre d'une fonction ou d'une procédure
parameter:
	IDENTIFIER ':' type { 
		trace("*** REDUCE: parameter -> IDENTIFIER \':\' type ");
		varEnvironment.put($1, new ExprVAR($1,$3));

		$$ = new TypeTree(Type.Tag.FIELD, $1, $3); 
	}
	;

// Le code d'une fonction ou d'une procédure
close_block:
	close_list_of_stm { trace("*** REDUCE: block -> close_list_of_stms"); }
	;

open_block:
	open_list_of_stm { trace("*** REDUCE: block -> list_of_stms"); }
	;

// La définition d'un type
// le résultat sera un objet instance de TypeTree
type:
	"boolean" { trace("*** REDUCE: type -> \"boolean\""); $$ = new TypeTree(Type.Tag.BOOLEAN); }
	| number { trace("*** REDUCE: type -> int"); $$ = $1; }
	| "string" '[' INTEGER ']' { trace("*** REDUCE: type -> \"string\" \'[\' INTEGER \']\'"); $$ = new TypeTree(Type.Tag.STRING, $3); }
	| "range" "of" type { trace("*** REDUCE: type -> \"range\" \"of\" type"); $$ = new TypeTree(Type.Tag.RANGE, $3); }
	| "set" "of" type { trace("*** REDUCE: type -> \"set\" \"of\" type"); $$ = new TypeTree(Type.Tag.SET, $3); }
	| "list" "of" type { trace("*** REDUCE: type -> \"list\" \"of\" type"); $$ = new TypeTree(Type.Tag.LIST, $3); }
	| "enum" '(' list_of_identifiers ')' { trace("*** REDUCE: type -> \"enum\" \'(\' list_of_identifiers \')\'"); $$ = new TypeTree(Type.Tag.ENUM, $3); }
	| "struct" '{' list_of_fields '}' { trace("*** REDUCE: type -> \"struct\" \'{\' list_of_fields \'}\'"); $$ = new TypeTree(Type.Tag.STRUCT, $3); }
	;

// La liste des champs (fields) d'une structure
list_of_fields:
	field {
	  trace("*** REDUCE: list_of_fields -> field");
	  List<TypeFIELD> list = new ArrayList<>();
	  list.add($1);
	  $$ = list;
	}
	| list_of_fields field {
	  trace("*** REDUCE: list_of_fields -> field list_of_fields");
	  List<TypeFIELD> list = $1;
	  list.add($2);
	  $$ = list;
	}
	;

// Un champ (field) d'une structure
field:
	IDENTIFIER ':' type ';' { 
		trace("*** REDUCE: field -> IDENTIFIER \':\' type \';\'"); 
		$$ = new TypeFIELD($1, $3); 
	}
	;

// Un type qui revient à un nombre
number:
	"byte" { trace("*** REDUCE: int -> \"byte\""); $$ = new TypeTree(Type.Tag.INT8_T); }
	| "pin" { trace("*** REDUCE: int -> \"pin\""); $$ = new TypeTree(Type.Tag.PIN); }
	| "unsigned" "byte" { trace("*** REDUCE: int -> \"unsigned\" \"byte\""); $$ = new TypeTree(Type.Tag.UINT8_T); }
	| "short" { trace("*** REDUCE: int -> \"small\" \"integer\""); $$ = new TypeTree(Type.Tag.INT16_T); }
	| "unsigned" "short" { trace("*** REDUCE: int -> \"unsigned\" \"small\" \"integer\""); $$ = new TypeTree(Type.Tag.UINT16_T); }
	| "integer" { trace("*** REDUCE: int -> \"integer\""); $$ = new TypeTree(Type.Tag.INT32_T); }
	| "unsigned" "integer" { trace("*** REDUCE: int -> \"unsigned\" \"integer\""); $$ = new TypeTree(Type.Tag.UINT32_T); }
	| "float" { trace("*** REDUCE: int -> \"float\""); $$ = new TypeTree(Type.Tag.F32_T); }
	;

// Une instruction du langage arduinoCode
// j'ai ajouté x++ et x--
// Il manque while et foreach !!!
stm:
	open_stm
	|close_stm
	;

open_stm:
	  "if" '(' expression ')' stm { trace("*** REDUCE: stm -> \"if\" \'(\' expression \')\' stm"); $$ = new StmIF($1,$3,$5); }
	| "if" '(' expression ')' close_stm "else" open_stm { trace("*** REDUCE: stm -> \"if\" \'(\' expression \')\' stm \"else\" stm"); $$ = new StmIF($1,$3,$5,$7); }
	| "if" '(' expression ')' 
	  '{' open_block '}' { $$ = new StmIF($1,$3,$6);  trace("*** REDUCE: stm -> \"if\" \'(\' expression \')\' \'{\' block \'}\'"); }
	| "if" '(' expression ')' '{' close_block '}' "else" '{' open_block '}' { trace("*** REDUCE: stm -> \"if\" \'(\' expression \')\' \'{\' block \'}\' \"else\" \'{\' block \'}\'"); $$ = new StmIF($1,$3,$6,$10); }
	;

close_stm:
	non_if_stm
	| "if" '(' expression ')' close_stm "else" close_stm { trace("*** REDUCE: stm -> \"if\" \'(\' expression \')\' stm \"else\" stm"); $$ = new StmIF($1,$3,$5,$7); }
	| "if" '(' expression ')' '{' close_block '}' "else" '{' close_block '}' { trace("*** REDUCE: stm -> \"if\" \'(\' expression \')\' stm \"else\" stm"); $$ = new StmIF($1,$3,$6,$10); }
	;


non_if_stm:
	  assign_stm
	| ATmega328p_procedure { trace("*** REDUCE: stm -> ATmega328p_procedure"); $$ = new StmExpr($1); }
	| "switch" '(' expression ')' '{' list_of_case_stms '}' { trace("*** REDUCE: stm -> \"switch\" \'(\' expression \')\' \'{\' list_of_case_stms \'}\'"); $$ = new StmSWITCH($3, $6);}
	| "do" stm "while" '(' expression ')' ';' { trace("*** REDUCE: stm -> \"do\" stm \"while\" \'(\' expression \')\' \';\'"); $$ = new StmDO($2, $5);}
	| "loop" stm { trace("*** REDUCE: stm -> \"loop\" stm"); $$ = new StmLOOP($2);}
 	| "break" ';' { trace("*** REDUCE: stm -> \"break\" \';\'"); $$ = new StmBREAK();}
 	| "continue" ';' { trace("*** REDUCE: stm -> \"continue\" \';\'"); $$ = new StmBREAK();}
 	| "return" expression ';' { trace("*** REDUCE: stm -> \"return\" expression \';\'"); $$ = new StmRETURN($2);}
	| '{' close_list_of_stm '}' { trace("*** REDUCE: stm -> '{' list_of_stms '}'"); $$ = new StmSeq($2); }
	| "while" '(' expression ')' '{' open_block '}' { trace("*** REDUCE: stm -> \"while\" \'(\' expression \')\' \'{\' open_block \'}\'"); $$ = new StmWHILE($3, $6); }
	;

assign_stm:
	left_part "++" ';' { trace("*** REDUCE: stm -> left_part \"++\""); $$ = new StmExpr(new ExprUnary(ExprUnary.Op.PP, $1.getType(), $1)); }
	| left_part "--" ';' { trace("*** REDUCE: stm -> left_part \"--\""); $$ = new StmExpr(new ExprUnary(ExprUnary.Op.MM, $1.getType(), $1)); }
	| left_part '=' expression ';' { trace("*** REDUCE: stm -> left_part \'=\' expression \';\'"); $$ = new StmAFF($1, $3); }
	| left_part "+=" expression ';' { trace("*** REDUCE: stm -> left_part \"+=\" expression \';\'"); $$ = new StmAFF(StmAFF.Op.PLUS, $1, $3); }
	| left_part "-=" expression ';' { trace("*** REDUCE: stm -> left_part \"-=\" expression \';\'"); $$ = new StmAFF(StmAFF.Op.MINUS, $1, $3);}
	| left_part "*=" expression ';' { trace("*** REDUCE: stm -> left_part \"*=\" expression \';\'"); $$ = new StmAFF(StmAFF.Op.MUL, $1, $3);}
	| left_part "/=" expression ';' { trace("*** REDUCE: stm -> left_part \"/=\" expression \';\'"); $$ = new StmAFF(StmAFF.Op.DIV, $1, $3);}
	| left_part "%=" expression ';' { trace("*** REDUCE: stm -> left_part \"%=\" expression \';\'"); $$ = new StmAFF(StmAFF.Op.PER, $1, $3);}
	| left_part "&=" expression ';' { trace("*** REDUCE: stm -> left_part \"&=\" expression \';\'"); $$ = new StmAFF(StmAFF.Op.LAND, $1, $3);}
	| left_part "|=" expression ';' { trace("*** REDUCE: stm -> left_part \"|=\" expression \';\'"); $$ = new StmAFF(StmAFF.Op.LOR, $1, $3);}
	| left_part "&&=" expression ';' { trace("*** REDUCE: stm -> left_part \"&&=\" expression \';\'"); $$ = new StmAFF(StmAFF.Op.AND, $1, $3);}
	| left_part "||=" expression ';' { trace("*** REDUCE: stm -> left_part \"||=\" expression \';\'"); $$ = new StmAFF(StmAFF.Op.OR, $1, $3);}

// contenu d'un switch
list_of_case_stms:
	case_stm {
	  trace("*** REDUCE: list_of_case_stms -> case_stm");
	  List<StmCASE> list = new ArrayList<>();
	  list.add($1);
	  $$ = list;
	}
	| list_of_case_stms case_stm {
	  trace("*** REDUCE: list_of_case_stms -> list_of_case_stms case_stm");
	  List<StmCASE> list = $1;
	  list.add($2);
	  $$ = list;
	}
	;

// un case
case_stm:
	"case" expression ':' stm {
	  trace("*** REDUCE: case_stm -> \"case\" expression \':\' stm");
	  $$ = new StmCASE($2, $4);
	}
	;

// la partie gauche d'une affectation
// C'est-à-dire une varible ou un élément de tableau
left_part:
	IDENTIFIER {
	  trace("*** REDUCE: left_part -> IDENTIFIER");
	  ExprVAR var = null;
	  try {
	    var = varEnvironment.get($1);
	  } catch (EnvironmentException e) {
	    yyerror(e.getMessage());
	    return YYABORT;
	  }
	  $$ = var;
	}
 	| IDENTIFIER '[' expression ']' {
	  trace("*** REDUCE: left_part -> IDENTIFIER \'[\' expression \']\'");
	  ExprVAR var = null;
	  try {
	    var = varEnvironment.get($1);
	  } catch (EnvironmentException e) {
	    yyerror(e.getMessage());
	    return YYABORT;
	  }
	  $$ = new ExprGET($3, var);
	}
	;

// Une expression simple ou complexe
// Le résultat sera un AST qui correspond au calcul
// C'est sur cet AST que l'on lancera la visite de CodeGeneratorVisitor
// pour obtenir du code effectuant ce calcul
expression:
	constant_expression { 
		trace("*** REDUCE: expression -> constant_expression"); 
		$$ = $1; 
	}
	| left_part { 
		trace("*** REDUCE: expression -> left_part"); 
		$$ = $1; 
	}
	| IDENTIFIER '(' list_of_expressions ')' { 
		trace("*** REDUCE: expression -> IDENTIFIER \'(\' list_of_expressions \')\'"); 
		$$ = new StmExpr(new ExprFUNCTION($1, $3)); 
	}
	| '[' list_of_expressions ']' { trace("*** REDUCE: expression -> \'(\' list_of_expressions \')\'"); $$ = new ExprLIST($2); }
	| '{' list_of_expressions '}' { trace("*** REDUCE: expression -> \'{\' list_of_expressions \'}\'"); $$ = new ExprSET($2); }
	| '[' expression ".." expression ']' { trace("*** REDUCE: expression -> \'[\' expression \"..\" \']\'"); $$ = new ExprRANGE($2, $4); }
	| expression '+' expression { trace("*** REDUCE: expression -> expression \'+\' expression"); $$ = new ExprBinary(ExprBinary.Op.PLUS, $1.getType(), $1, $3); }
	| expression '*' expression { trace("*** REDUCE: expression -> expression \'*\' expression"); $$ = new ExprBinary(ExprBinary.Op.MUL, $1.getType(), $1, $3); }
	| expression '-' expression { trace("*** REDUCE: expression -> expression \'-\' expression"); $$ = new ExprBinary(ExprBinary.Op.MINUS, $1.getType(), $1, $3); }
	| expression '/' expression { trace("*** REDUCE: expression -> expression \'/\' expression"); $$ = new ExprBinary(ExprBinary.Op.DIV, $1.getType(), $1, $3); }
	| expression '%' expression { trace("*** REDUCE: expression -> expression \'%\' expression"); $$ = new ExprBinary(ExprBinary.Op.PERC, $1.getType(), $1, $3); }
	| '-' expression %prec HIGHER_THAN_MINUS { trace("*** REDUCE: expression -> \'-\' expression"); $$ = new ExprUnary(ExprUnary.Op.MINUS, $2.getType(), $2); }
	| expression "++" { trace("*** REDUCE: expression -> expression \"++\""); $$ = new ExprUnary(ExprUnary.Op.PP, $1.getType(), $1); }
	| expression "--" { trace("*** REDUCE: expression -> expression \"--\""); $$ = new ExprUnary(ExprUnary.Op.MM, $1.getType(), $1); }
	| "++" expression { trace("*** REDUCE: expression -> \"++\" expression"); $$ = new ExprUnary(ExprUnary.Op.PP2, $2.getType(), $2); }
	| "--" expression { trace("*** REDUCE: expression -> \"--\" expression"); $$ = new ExprUnary(ExprUnary.Op.MM2, $2.getType(), $2); }
	| expression '<' expression { trace("*** REDUCE: expression -> expression \'<\' expression"); $$ = new ExprBinary(ExprBinary.Op.GT, new TypeTree(Type.Tag.BOOLEAN), $1, $3); }
	| expression "<=" expression { trace("*** REDUCE: expression -> expression \"<=\" expression"); $$ = new ExprBinary(ExprBinary.Op.GE, new TypeTree(Type.Tag.BOOLEAN), $1, $3); }
	| expression '>' expression { trace("*** REDUCE: expression -> expression \'>\' expression"); $$ = new ExprBinary(ExprBinary.Op.LT, new TypeTree(Type.Tag.BOOLEAN), $1, $3); }
	| expression ">=" expression { trace("*** REDUCE: expression -> expression \">=\" expression"); $$ = new ExprBinary(ExprBinary.Op.LE, new TypeTree(Type.Tag.BOOLEAN), $1, $3); }
	| expression "==" expression { trace("*** REDUCE: expression -> expression \"==\" expression"); $$ = new ExprBinary(ExprBinary.Op.EQ, new TypeTree(Type.Tag.BOOLEAN), $1, $3); }
	| expression "!=" expression { trace("*** REDUCE: expression -> expression \"!=\" expression"); $$ = new ExprBinary(ExprBinary.Op.NE, new TypeTree(Type.Tag.BOOLEAN), $1, $3); }
	| expression "<<" expression { trace("*** REDUCE: expression -> expression \"<<\" expression"); $$ = new ExprBinary(ExprBinary.Op.BSL, $1.getType(), $1, $3); }
	| expression ">>" expression { trace("*** REDUCE: expression -> expression \">>\" expression"); $$ = new ExprBinary(ExprBinary.Op.BSR, $1.getType(), $1, $3); }
	| expression '&' expression { trace("*** REDUCE: expression -> expression \'&\' expression"); $$ = new ExprBinary(ExprBinary.Op.BAND, $1.getType(), $1, $3); }
	| expression '|' expression { trace("*** REDUCE: expression -> expression \'|\' expression"); $$ = new ExprBinary(ExprBinary.Op.BOR, $1.getType(), $1, $3); }
	| expression "&&" expression { trace("*** REDUCE: expression -> expression \"&&\" expression"); $$ = new ExprBinary(ExprBinary.Op.AND, $1.getType(), $1, $3); }
	| expression "||" expression { trace("*** REDUCE: expression -> expression \"||\" expression"); $$ = new ExprBinary(ExprBinary.Op.OR, $1.getType(), $1, $3); }
    | '!' expression %prec HIGHER_THAN_NOT { trace("*** REDUCE: expression -> \'!\' expression"); $$ = new ExprUnary(ExprUnary.Op.NOT, $2.getType(), $2); }
	| '(' expression ')' { trace("*** REDUCE: expression -> \'(\' expression \')\'"); $$ = $2; }
 	| ATmega328p_expression { trace("*** REDUCE: expression -> ATmega328p_expression"); $$ = $1; }
	;

// Une liste d'expressions séparées par des virgules
list_of_expressions:
	expression {
	  trace("*** REDUCE: list_of_expressions -> expression");
	  List<Expr> list = new ArrayList<>();
	  list.add($1);
	  $$ = list;
	}
	| list_of_expressions ',' expression {
	  trace("*** REDUCE: list_of_expressions -> expression \',\' list_of_expressions");
	  List<Expr> list = $1;
	  list.add($3);
	  }
	;

// Une expression constante
constant_expression:
	"TRUE" { 
		trace("*** REDUCE: constant_expression -> \"true\""); 
		$$ = new ExprCONSTANT(new TypeTree(Type.Tag.BOOLEAN), true); 
	}
	| "FALSE" { 
		trace("*** REDUCE: constant_expression -> \"false\""); 
		$$ = new ExprCONSTANT(new TypeTree(Type.Tag.BOOLEAN), false); 
	}
	| PIN { 
		trace("*** REDUCE: constant_expression -> PIN");
	  	$$ = new ExprCONSTANT(new TypeTree(Type.Tag.PIN), $1);
	}
	| INTEGER { 
		trace("*** REDUCE: constant_expression -> INTEGER");
	  	$$ = new ExprCONSTANT(new TypeTree(Type.Tag.UINT32_T), $1);
	}
	| FLOAT {
	  trace("*** REDUCE: constant_expression -> FLOAT");
	  $$ = new ExprCONSTANT(new TypeTree(Type.Tag.F32_T), $1);
	}
	| STRING {
	  trace("*** REDUCE: constant_expression -> STRING");
	  $$ = new ExprCONSTANT(new TypeTree(Type.Tag.STRING), $1);
	}
	;

// Les procédures propres à l'Arduino Uno
// void pinMode(uint8_t pin, uint8_t mode);
// void digitalWrite(uint8_t pin, uint8_t val);
// void analogReference(uint8_t mode);
// void analogWrite(uint8_t pin, int val);
// uint16_t peek()
// void flush()
// void putc(uint8_t val)
// void puts(uint16_t val)
// delay_s(uint16_t val)
// delay_ms(uint16_t val)
ATmega328p_procedure:
	"pinMode" '(' expression ',' expression ')' ';' { 
		trace("*** REDUCE: ATmega328p_procedure -> \"pinMode\" \'(\' expression \',\' expression \')\' \';\' ");  
		List<Expr> list = new ArrayList<>();
		$3.cast(Type.Tag.PIN);
		list.add(new ExprUnary(ExprUnary.Op.ARG, $3));
		$5.cast(Type.Tag.UINT8_T);
		list.add(new ExprUnary(ExprUnary.Op.ARG, $5));
		try {
			$$ = new ExprFUNCTION(ExprFUNCTION.Defined.pinMode, list, functionEnvironment.get("pinMode"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	}
	
	| "digitalWrite" '(' expression ',' expression ')' ';' { 
		trace("*** REDUCE: ATmega328p_procedure -> \"digitalWrite\" \'(\' PIN \',\' expression \')\' \';\'"); 
		List<Expr> list = new ArrayList<>();
		$3.cast(Type.Tag.PIN);
		list.add(new ExprUnary(ExprUnary.Op.ARG, $3));
		$5.cast(Type.Tag.UINT8_T);
		list.add(new ExprUnary(ExprUnary.Op.ARG, $5));
		try {
			$$ = new ExprFUNCTION(ExprFUNCTION.Defined.digitalWrite, list, functionEnvironment.get("digitalWrite"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	}
	
	| "analogReference" '(' expression ')' ';' { 
		trace("*** REDUCE: ATmega328p_procedure -> \"analogReference\" \'(\' expression \')\' \';\'"); 
		List<Expr> list = new ArrayList<>();
		$3.cast(Type.Tag.UINT8_T);
		list.add(new ExprUnary(ExprUnary.Op.ARG, $3));
		try {
			$$ = new ExprFUNCTION(ExprFUNCTION.Defined.analogReference, list, functionEnvironment.get("analogReference"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	}
	
	| "analogWrite" '(' expression ',' expression ')' ';' { 
		trace("*** REDUCE: ATmega328p_procedure -> \"analogWrite\" \'(\' PIN \',\' expression \')\' \';\'"); 
		List<Expr> list = new ArrayList<>();
		$3.cast(Type.Tag.PIN);
		list.add(new ExprUnary(ExprUnary.Op.ARG, $3));
		$5.cast(Type.Tag.UINT16_T);
		list.add(new ExprUnary(ExprUnary.Op.ARG, $5));
		try {
			$$ = new ExprFUNCTION(ExprFUNCTION.Defined.analogWrite, list, functionEnvironment.get("analogWrite"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	}

	| "peek" '(' ')' ';' { 
		trace("*** REDUCE: ATmega328p_procedure -> \"peek\" \'(\' \')\' \';\'"); 
		try {
			$$ = new ExprFUNCTION(ExprFUNCTION.Defined.peek, functionEnvironment.get("peek"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	}

	| "flush" '(' ')' ';' { 
		trace("*** REDUCE: ATmega328p_procedure -> \"flush\" \'(\' \')\' \';\'"); 
		try {
			$$ = new ExprFUNCTION(ExprFUNCTION.Defined.flush, functionEnvironment.get("flush"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	}

	| "putc" '(' expression ')' ';' { 
		trace("*** REDUCE: ATmega328p_procedure -> \"putc\" \'(\' expression \')\' \';\'"); 

		// La liste des arguments comprend un seul argument de type UINT8_T
		List<Expr> list = new ArrayList<>();

		// On force l'expression à être de type UINT8_T
		$3.cast(Type.Tag.UINT8_T);
		list.add(new ExprUnary(ExprUnary.Op.ARG, $3));

		// On construit l'AST de cet appel de fonction
		try{
			$$ = new ExprFUNCTION(ExprFUNCTION.Defined.putc, list, functionEnvironment.get("putc"));
		}
		catch (EnvironmentException e){
			System.err.println("*** " + e.getMessage());
		}
	}

	| "puts" '(' expression ')' ';' { 
		trace("*** REDUCE: ATmega328p_procedure -> \"puts\" \'(\' expression \')\' \';\'"); 
		List<Expr> list = new ArrayList<>();
		list.add(new ExprUnary(ExprUnary.Op.ARG, $3));
		try {
			$$ = new ExprFUNCTION(ExprFUNCTION.Defined.puts, list, functionEnvironment.get("puts"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	}

	| "delay_s" '(' expression ')' ';' { 
		trace("*** REDUCE: ATmega328p_procedure -> \"puts\" \'(\' expression \')\' \';\'"); 
		List<Expr> list = new ArrayList<>();
		$3.cast(Type.Tag.UINT16_T);
		list.add(new ExprUnary(ExprUnary.Op.ARG, $3));
		try {
			$$ = new ExprFUNCTION(ExprFUNCTION.Defined.delay_s, list, functionEnvironment.get("delay_s"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	}

	| "delay_ms" '(' expression ')' ';' { 
		trace("*** REDUCE: ATmega328p_procedure -> \"puts\" \'(\' expression \')\' \';\'"); 
		List<Expr> list = new ArrayList<>();
		$3.cast(Type.Tag.UINT16_T);
		list.add(new ExprUnary(ExprUnary.Op.ARG, $3));
		try {
			$$ = new ExprFUNCTION(ExprFUNCTION.Defined.delay_ms, list, functionEnvironment.get("delay_ms"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	}
	;

// Les expressions propres à l'Arduino Uno
// digitalRead(uint8_t pin)
// analogRead(uint8_t pin)
// uin8_t getc() 
// uint16_t available();
ATmega328p_expression:
	"LOW" { 
		trace("*** REDUCE: ATmega328p_expression -> \"LOW\"");  
		$$ = new ExprCONSTANT(new TypeTree(Type.Tag.UINT8_T), (Integer)0); 
	}

	| "HIGH" { 
		trace("*** REDUCE: ATmega328p_expression -> \"HIGH\""); 
		$$ = new ExprCONSTANT(new TypeTree(Type.Tag.UINT8_T), (Integer)255); 
	}

	| "INPUT" { 
		trace("*** REDUCE: ATmega328p_expression -> \"INPUT\""); 
		$$ = new ExprCONSTANT(new TypeTree(Type.Tag.UINT8_T), (Integer)0x0); 
	}

	| "INPUTPULLUP" { 
		trace("*** REDUCE: ATmega328p_expression -> \"INPUTPULLUP\""); 
		$$ = new ExprCONSTANT(new TypeTree(Type.Tag.UINT8_T), (Integer)0x2); 
	}

	| "OUTPUT" { 
		trace("*** REDUCE: ATmega328p_expression -> \"OUTPUT\""); 
		$$ = new ExprCONSTANT(new TypeTree(Type.Tag.UINT8_T), (Integer)0x1); 
	}

   	| "digitalRead" '(' expression ')' { 
   		trace("*** REDUCE: ATmega328p_expression -> \"digitalRead\" \'(\' PIN \')\'"); 
		List<Expr> list = new ArrayList<>();
		list.add(new ExprUnary(ExprUnary.Op.ARG, new ExprCONSTANT(new TypeTree(Type.Tag.UINT8_T), $3)));
		try {
			$$ = new ExprFUNCTION(ExprFUNCTION.Defined.digitalRead, list, functionEnvironment.get("digitalRead"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
   	}

   	| "analogRead" '(' expression ')' { 
   		trace("*** REDUCE: ATmega328p_expression -> \"analogRead\" \'(\' PIN \')\'"); 
		List<Expr> list = new ArrayList<>();
		$3.cast(Type.Tag.PIN);
		list.add(new ExprUnary(ExprUnary.Op.ARG, $3));
		try {
			$$ = new ExprFUNCTION(ExprFUNCTION.Defined.analogRead, list, functionEnvironment.get("analogRead"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
   	}

	| "getc" '(' ')' { 
		trace("*** REDUCE: ATmega328p_expression -> \"getc\" \'(\' \')\'"); 
		try {
			$$ = new ExprFUNCTION(ExprFUNCTION.Defined.getc, functionEnvironment.get("getc"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	}

   	| "available" '(' ')' { 
   		trace("*** REDUCE: ATmega328p_expression -> \"available\" \'(\' \')\'"); 
		try {
			$$ = new ExprFUNCTION(ExprFUNCTION.Defined.available, functionEnvironment.get("available"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
   	}
	;

%%
