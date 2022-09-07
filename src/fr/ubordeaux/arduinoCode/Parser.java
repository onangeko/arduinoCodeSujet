/* A Bison parser, made by GNU Bison 3.7.5.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java

   Copyright (C) 2007-2015, 2018-2021 Free Software Foundation, Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* DO NOT RELY ON FEATURES THAT ARE NOT DOCUMENTED in the manual,
   especially those whose name start with YY_ or yy_.  They are
   private implementation details that can be changed or removed.  */

package fr.ubordeaux.arduinoCode;



import java.text.MessageFormat;
/* "%code imports" blocks.  */
/* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":12  */

	import java.util.List;
	import java.util.ArrayList;
	import java.util.Map;
	import java.util.HashMap;
	import fr.ubordeaux.arduinoCode.ast.*;
	import fr.ubordeaux.arduinoCode.environment.*;
	import fr.ubordeaux.arduinoCode.type.*;
	import fr.ubordeaux.arduinoCode.visitor.*;

/* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/src/fr/ubordeaux/arduinoCode/Parser.java":55  */

/**
 * A Bison parser, automatically generated from <tt>/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
public class Parser
{
  /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "3.7.5";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";






  public enum SymbolKind
  {
    S_YYEOF(0),                    /* "end of file"  */
    S_YYerror(1),                  /* error  */
    S_YYUNDEF(2),                  /* "invalid token"  */
    S_3_(3),                       /* '<'  */
    S_LE_TOKEN(4),                 /* "<="  */
    S_5_(5),                       /* '>'  */
    S_GE_TOKEN(6),                 /* ">="  */
    S_EQ_TOKEN(7),                 /* "=="  */
    S_NE_TOKEN(8),                 /* "!="  */
    S_9_(9),                       /* '!'  */
    S_LL_TOKEN(10),                /* "<<"  */
    S_GG_TOKEN(11),                /* ">>"  */
    S_12_(12),                     /* '&'  */
    S_13_(13),                     /* '|'  */
    S_AA_TOKEN(14),                /* "&&"  */
    S_OO_TOKEN(15),                /* "||"  */
    S_16_(16),                     /* '+'  */
    S_17_(17),                     /* '-'  */
    S_18_(18),                     /* '*'  */
    S_19_(19),                     /* '/'  */
    S_20_(20),                     /* '%'  */
    S_PE_TOKEN(21),                /* "+="  */
    S_ME_TOKEN(22),                /* "-="  */
    S_TE_TOKEN(23),                /* "*="  */
    S_DE_TOKEN(24),                /* "/="  */
    S_CE_TOKEN(25),                /* "%="  */
    S_AE_TOKEN(26),                /* "&="  */
    S_OE_TOKEN(27),                /* "|="  */
    S_AAE_TOKEN(28),               /* "&&="  */
    S_OOE_TOKEN(29),               /* "||="  */
    S_PP_TOKEN(30),                /* "++"  */
    S_MM_TOKEN(31),                /* "--"  */
    S_32_(32),                     /* '='  */
    S_33_(33),                     /* ':'  */
    S_DOTS_TOKEN(34),              /* ".."  */
    S_BEGIN_KEYWORD(35),           /* "begin"  */
    S_BOOLEAN_KEYWORD(36),         /* "boolean"  */
    S_BREAK_KEYWORD(37),           /* "break"  */
    S_BYTE_KEYWORD(38),            /* "byte"  */
    S_CASE_KEYWORD(39),            /* "case"  */
    S_CONTINUE_KEYWORD(40),        /* "continue"  */
    S_DO_KEYWORD(41),              /* "do"  */
    S_DOUBLE_KEYWORD(42),          /* "double"  */
    S_ELSE_KEYWORD(43),            /* "else"  */
    S_END_KEYWORD(44),             /* "end"  */
    S_ENUM_KEYWORD(45),            /* "enum"  */
    S_FALSE_KEYWORD(46),           /* "FALSE"  */
    S_FLOAT_KEYWORD(47),           /* "float"  */
    S_FOREACH_KEYWORD(48),         /* "foreach"  */
    S_FUNCTION_KEYWORD(49),        /* "function"  */
    S_IF_KEYWORD(50),              /* "if"  */
    S_INTEGER_KEYWORD(51),         /* "integer"  */
    S_IN_KEYWORD(52),              /* "in"  */
    S_LIST_KEYWORD(53),            /* "list"  */
    S_LONG_KEYWORD(54),            /* "long"  */
    S_LOOP_KEYWORD(55),            /* "loop"  */
    S_OF_KEYWORD(56),              /* "of"  */
    S_PROCEDURE_KEYWORD(57),       /* "procedure"  */
    S_RANGE_KEYWORD(58),           /* "range"  */
    S_RETURN_KEYWORD(59),          /* "return"  */
    S_SET_KEYWORD(60),             /* "set"  */
    S_SHORT_KEYWORD(61),           /* "short"  */
    S_STRUCT_KEYWORD(62),          /* "struct"  */
    S_STRING_KEYWORD(63),          /* "string"  */
    S_SWITCH_KEYWORD(64),          /* "switch"  */
    S_TRUE_KEYWORD(65),            /* "TRUE"  */
    S_UNSIGNED_KEYWORD(66),        /* "unsigned"  */
    S_WHILE_KEYWORD(67),           /* "while"  */
    S_PINMODE_KEYWORD(68),         /* "pinMode"  */
    S_DIGITALWRITE_KEYWORD(69),    /* "digitalWrite"  */
    S_ANALOGREFERENCE_KEYWORD(70), /* "analogReference"  */
    S_ANALOGWRITE_KEYWORD(71),     /* "analogWrite"  */
    S_DIGITALREAD_KEYWORD(72),     /* "digitalRead"  */
    S_ANALOGREAD_KEYWORD(73),      /* "analogRead"  */
    S_LOW_KEYWORD(74),             /* "LOW"  */
    S_HIGH_KEYWORD(75),            /* "HIGH"  */
    S_INPUT_KEYWORD(76),           /* "INPUT"  */
    S_INPUTPULLUP_KEYWORD(77),     /* "INPUTPULLUP"  */
    S_OUTPUT_KEYWORD(78),          /* "OUTPUT"  */
    S_PIN_KEYWORD(79),             /* "pin"  */
    S_GETC_KEYWORD(80),            /* "getc"  */
    S_AVAILABLE_KEYWORD(81),       /* "available"  */
    S_PEEK_KEYWORD(82),            /* "peek"  */
    S_FLUSH_KEYWORD(83),           /* "flush"  */
    S_PUTC_KEYWORD(84),            /* "putc"  */
    S_PUTS_KEYWORD(85),            /* "puts"  */
    S_DELAY_MS_KEYWORD(86),        /* "delay_ms"  */
    S_DELAY_S_KEYWORD(87),         /* "delay_s"  */
    S_IDENTIFIER(88),              /* IDENTIFIER  */
    S_INTEGER(89),                 /* INTEGER  */
    S_PIN(90),                     /* PIN  */
    S_FLOAT(91),                   /* FLOAT  */
    S_STRING(92),                  /* STRING  */
    S_HIGHER_THAN_NOT(93),         /* HIGHER_THAN_NOT  */
    S_HIGHER_THAN_MINUS(94),       /* HIGHER_THAN_MINUS  */
    S_95_(95),                     /* ';'  */
    S_96_(96),                     /* ','  */
    S_97_(97),                     /* '('  */
    S_98_(98),                     /* ')'  */
    S_99_(99),                     /* '{'  */
    S_100_(100),                   /* '}'  */
    S_101_(101),                   /* '['  */
    S_102_(102),                   /* ']'  */
    S_YYACCEPT(103),               /* $accept  */
    S_program(104),                /* program  */
    S_list_of_definitions(105),    /* list_of_definitions  */
    S_list_of_stms(106),           /* list_of_stms  */
    S_definition(107),             /* definition  */
    S_var_definition(108),         /* var_definition  */
    S_list_of_identifiers(109),    /* list_of_identifiers  */
    S_type_definition(110),        /* type_definition  */
    S_function_decl(111),          /* function_decl  */
    S_procedure_decl(112),         /* procedure_decl  */
    S_function_definition(113),    /* function_definition  */
    S_114_1(114),                  /* $@1  */
    S_procedure_definition(115),   /* procedure_definition  */
    S_116_2(116),                  /* $@2  */
    S_list_of_parameters(117),     /* list_of_parameters  */
    S_parameter(118),              /* parameter  */
    S_block(119),                  /* block  */
    S_type(120),                   /* type  */
    S_list_of_fields(121),         /* list_of_fields  */
    S_field(122),                  /* field  */
    S_number(123),                 /* number  */
    S_stm(124),                    /* stm  */
    S_list_of_case_stms(125),      /* list_of_case_stms  */
    S_case_stm(126),               /* case_stm  */
    S_left_part(127),              /* left_part  */
    S_expression(128),             /* expression  */
    S_list_of_expressions(129),    /* list_of_expressions  */
    S_constant_expression(130),    /* constant_expression  */
    S_ATmega328p_procedure(131),   /* ATmega328p_procedure  */
    S_ATmega328p_expression(132);  /* ATmega328p_expression  */


    private final int yycode_;

    SymbolKind (int n) {
      this.yycode_ = n;
    }

    private static final SymbolKind[] values_ = {
      SymbolKind.S_YYEOF,
      SymbolKind.S_YYerror,
      SymbolKind.S_YYUNDEF,
      SymbolKind.S_3_,
      SymbolKind.S_LE_TOKEN,
      SymbolKind.S_5_,
      SymbolKind.S_GE_TOKEN,
      SymbolKind.S_EQ_TOKEN,
      SymbolKind.S_NE_TOKEN,
      SymbolKind.S_9_,
      SymbolKind.S_LL_TOKEN,
      SymbolKind.S_GG_TOKEN,
      SymbolKind.S_12_,
      SymbolKind.S_13_,
      SymbolKind.S_AA_TOKEN,
      SymbolKind.S_OO_TOKEN,
      SymbolKind.S_16_,
      SymbolKind.S_17_,
      SymbolKind.S_18_,
      SymbolKind.S_19_,
      SymbolKind.S_20_,
      SymbolKind.S_PE_TOKEN,
      SymbolKind.S_ME_TOKEN,
      SymbolKind.S_TE_TOKEN,
      SymbolKind.S_DE_TOKEN,
      SymbolKind.S_CE_TOKEN,
      SymbolKind.S_AE_TOKEN,
      SymbolKind.S_OE_TOKEN,
      SymbolKind.S_AAE_TOKEN,
      SymbolKind.S_OOE_TOKEN,
      SymbolKind.S_PP_TOKEN,
      SymbolKind.S_MM_TOKEN,
      SymbolKind.S_32_,
      SymbolKind.S_33_,
      SymbolKind.S_DOTS_TOKEN,
      SymbolKind.S_BEGIN_KEYWORD,
      SymbolKind.S_BOOLEAN_KEYWORD,
      SymbolKind.S_BREAK_KEYWORD,
      SymbolKind.S_BYTE_KEYWORD,
      SymbolKind.S_CASE_KEYWORD,
      SymbolKind.S_CONTINUE_KEYWORD,
      SymbolKind.S_DO_KEYWORD,
      SymbolKind.S_DOUBLE_KEYWORD,
      SymbolKind.S_ELSE_KEYWORD,
      SymbolKind.S_END_KEYWORD,
      SymbolKind.S_ENUM_KEYWORD,
      SymbolKind.S_FALSE_KEYWORD,
      SymbolKind.S_FLOAT_KEYWORD,
      SymbolKind.S_FOREACH_KEYWORD,
      SymbolKind.S_FUNCTION_KEYWORD,
      SymbolKind.S_IF_KEYWORD,
      SymbolKind.S_INTEGER_KEYWORD,
      SymbolKind.S_IN_KEYWORD,
      SymbolKind.S_LIST_KEYWORD,
      SymbolKind.S_LONG_KEYWORD,
      SymbolKind.S_LOOP_KEYWORD,
      SymbolKind.S_OF_KEYWORD,
      SymbolKind.S_PROCEDURE_KEYWORD,
      SymbolKind.S_RANGE_KEYWORD,
      SymbolKind.S_RETURN_KEYWORD,
      SymbolKind.S_SET_KEYWORD,
      SymbolKind.S_SHORT_KEYWORD,
      SymbolKind.S_STRUCT_KEYWORD,
      SymbolKind.S_STRING_KEYWORD,
      SymbolKind.S_SWITCH_KEYWORD,
      SymbolKind.S_TRUE_KEYWORD,
      SymbolKind.S_UNSIGNED_KEYWORD,
      SymbolKind.S_WHILE_KEYWORD,
      SymbolKind.S_PINMODE_KEYWORD,
      SymbolKind.S_DIGITALWRITE_KEYWORD,
      SymbolKind.S_ANALOGREFERENCE_KEYWORD,
      SymbolKind.S_ANALOGWRITE_KEYWORD,
      SymbolKind.S_DIGITALREAD_KEYWORD,
      SymbolKind.S_ANALOGREAD_KEYWORD,
      SymbolKind.S_LOW_KEYWORD,
      SymbolKind.S_HIGH_KEYWORD,
      SymbolKind.S_INPUT_KEYWORD,
      SymbolKind.S_INPUTPULLUP_KEYWORD,
      SymbolKind.S_OUTPUT_KEYWORD,
      SymbolKind.S_PIN_KEYWORD,
      SymbolKind.S_GETC_KEYWORD,
      SymbolKind.S_AVAILABLE_KEYWORD,
      SymbolKind.S_PEEK_KEYWORD,
      SymbolKind.S_FLUSH_KEYWORD,
      SymbolKind.S_PUTC_KEYWORD,
      SymbolKind.S_PUTS_KEYWORD,
      SymbolKind.S_DELAY_MS_KEYWORD,
      SymbolKind.S_DELAY_S_KEYWORD,
      SymbolKind.S_IDENTIFIER,
      SymbolKind.S_INTEGER,
      SymbolKind.S_PIN,
      SymbolKind.S_FLOAT,
      SymbolKind.S_STRING,
      SymbolKind.S_HIGHER_THAN_NOT,
      SymbolKind.S_HIGHER_THAN_MINUS,
      SymbolKind.S_95_,
      SymbolKind.S_96_,
      SymbolKind.S_97_,
      SymbolKind.S_98_,
      SymbolKind.S_99_,
      SymbolKind.S_100_,
      SymbolKind.S_101_,
      SymbolKind.S_102_,
      SymbolKind.S_YYACCEPT,
      SymbolKind.S_program,
      SymbolKind.S_list_of_definitions,
      SymbolKind.S_list_of_stms,
      SymbolKind.S_definition,
      SymbolKind.S_var_definition,
      SymbolKind.S_list_of_identifiers,
      SymbolKind.S_type_definition,
      SymbolKind.S_function_decl,
      SymbolKind.S_procedure_decl,
      SymbolKind.S_function_definition,
      SymbolKind.S_114_1,
      SymbolKind.S_procedure_definition,
      SymbolKind.S_116_2,
      SymbolKind.S_list_of_parameters,
      SymbolKind.S_parameter,
      SymbolKind.S_block,
      SymbolKind.S_type,
      SymbolKind.S_list_of_fields,
      SymbolKind.S_field,
      SymbolKind.S_number,
      SymbolKind.S_stm,
      SymbolKind.S_list_of_case_stms,
      SymbolKind.S_case_stm,
      SymbolKind.S_left_part,
      SymbolKind.S_expression,
      SymbolKind.S_list_of_expressions,
      SymbolKind.S_constant_expression,
      SymbolKind.S_ATmega328p_procedure,
      SymbolKind.S_ATmega328p_expression
    };

    static final SymbolKind get(int code) {
      return values_[code];
    }

    public final int getCode() {
      return this.yycode_;
    }

    /* Return YYSTR after stripping away unnecessary quotes and
       backslashes, so that it's suitable for yyerror.  The heuristic is
       that double-quoting is unnecessary unless the string contains an
       apostrophe, a comma, or backslash (other than backslash-backslash).
       YYSTR is taken from yytname.  */
    private static String yytnamerr_(String yystr)
    {
      if (yystr.charAt (0) == '"')
        {
          StringBuffer yyr = new StringBuffer();
          strip_quotes: for (int i = 1; i < yystr.length(); i++)
            switch (yystr.charAt(i))
              {
              case '\'':
              case ',':
                break strip_quotes;

              case '\\':
                if (yystr.charAt(++i) != '\\')
                  break strip_quotes;
                /* Fall through.  */
              default:
                yyr.append(yystr.charAt(i));
                break;

              case '"':
                return yyr.toString();
              }
        }
      return yystr;
    }

    /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
       First, the terminals, then, starting at \a YYNTOKENS_, nonterminals.  */
    private static final String[] yytname_ = yytname_init();
  private static final String[] yytname_init()
  {
    return new String[]
    {
  "\"end of file\"", "error", "\"invalid token\"", "'<'", "\"<=\"", "'>'",
  "\">=\"", "\"==\"", "\"!=\"", "'!'", "\"<<\"", "\">>\"", "'&'", "'|'",
  "\"&&\"", "\"||\"", "'+'", "'-'", "'*'", "'/'", "'%'", "\"+=\"",
  "\"-=\"", "\"*=\"", "\"/=\"", "\"%=\"", "\"&=\"", "\"|=\"", "\"&&=\"",
  "\"||=\"", "\"++\"", "\"--\"", "'='", "':'", "\"..\"", "\"begin\"",
  "\"boolean\"", "\"break\"", "\"byte\"", "\"case\"", "\"continue\"",
  "\"do\"", "\"double\"", "\"else\"", "\"end\"", "\"enum\"", "\"FALSE\"",
  "\"float\"", "\"foreach\"", "\"function\"", "\"if\"", "\"integer\"",
  "\"in\"", "\"list\"", "\"long\"", "\"loop\"", "\"of\"", "\"procedure\"",
  "\"range\"", "\"return\"", "\"set\"", "\"short\"", "\"struct\"",
  "\"string\"", "\"switch\"", "\"TRUE\"", "\"unsigned\"", "\"while\"",
  "\"pinMode\"", "\"digitalWrite\"", "\"analogReference\"",
  "\"analogWrite\"", "\"digitalRead\"", "\"analogRead\"", "\"LOW\"",
  "\"HIGH\"", "\"INPUT\"", "\"INPUTPULLUP\"", "\"OUTPUT\"", "\"pin\"",
  "\"getc\"", "\"available\"", "\"peek\"", "\"flush\"", "\"putc\"",
  "\"puts\"", "\"delay_ms\"", "\"delay_s\"", "IDENTIFIER", "INTEGER",
  "PIN", "FLOAT", "STRING", "HIGHER_THAN_NOT", "HIGHER_THAN_MINUS", "';'",
  "','", "'('", "')'", "'{'", "'}'", "'['", "']'", "$accept", "program",
  "list_of_definitions", "list_of_stms", "definition", "var_definition",
  "list_of_identifiers", "type_definition", "function_decl",
  "procedure_decl", "function_definition", "$@1", "procedure_definition",
  "$@2", "list_of_parameters", "parameter", "block", "type",
  "list_of_fields", "field", "number", "stm", "list_of_case_stms",
  "case_stm", "left_part", "expression", "list_of_expressions",
  "constant_expression", "ATmega328p_procedure", "ATmega328p_expression", null
    };
  }

    /* The user-facing name of this symbol.  */
    public final String getName() {
      return yytnamerr_(yytname_[yycode_]);
    }

  };


  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>Parser</tt>.
   */
  public interface Lexer {
    /* Token kinds.  */
    /** Token "end of file", to be returned by the scanner.  */
    static final int YYEOF = 0;
    /** Token error, to be returned by the scanner.  */
    static final int YYerror = 256;
    /** Token "invalid token", to be returned by the scanner.  */
    static final int YYUNDEF = 257;
    /** Token "<=", to be returned by the scanner.  */
    static final int LE_TOKEN = 258;
    /** Token ">=", to be returned by the scanner.  */
    static final int GE_TOKEN = 259;
    /** Token "==", to be returned by the scanner.  */
    static final int EQ_TOKEN = 260;
    /** Token "!=", to be returned by the scanner.  */
    static final int NE_TOKEN = 261;
    /** Token "<<", to be returned by the scanner.  */
    static final int LL_TOKEN = 262;
    /** Token ">>", to be returned by the scanner.  */
    static final int GG_TOKEN = 263;
    /** Token "&&", to be returned by the scanner.  */
    static final int AA_TOKEN = 264;
    /** Token "||", to be returned by the scanner.  */
    static final int OO_TOKEN = 265;
    /** Token "+=", to be returned by the scanner.  */
    static final int PE_TOKEN = 266;
    /** Token "-=", to be returned by the scanner.  */
    static final int ME_TOKEN = 267;
    /** Token "*=", to be returned by the scanner.  */
    static final int TE_TOKEN = 268;
    /** Token "/=", to be returned by the scanner.  */
    static final int DE_TOKEN = 269;
    /** Token "%=", to be returned by the scanner.  */
    static final int CE_TOKEN = 270;
    /** Token "&=", to be returned by the scanner.  */
    static final int AE_TOKEN = 271;
    /** Token "|=", to be returned by the scanner.  */
    static final int OE_TOKEN = 272;
    /** Token "&&=", to be returned by the scanner.  */
    static final int AAE_TOKEN = 273;
    /** Token "||=", to be returned by the scanner.  */
    static final int OOE_TOKEN = 274;
    /** Token "++", to be returned by the scanner.  */
    static final int PP_TOKEN = 275;
    /** Token "--", to be returned by the scanner.  */
    static final int MM_TOKEN = 276;
    /** Token "..", to be returned by the scanner.  */
    static final int DOTS_TOKEN = 277;
    /** Token "begin", to be returned by the scanner.  */
    static final int BEGIN_KEYWORD = 278;
    /** Token "boolean", to be returned by the scanner.  */
    static final int BOOLEAN_KEYWORD = 279;
    /** Token "break", to be returned by the scanner.  */
    static final int BREAK_KEYWORD = 280;
    /** Token "byte", to be returned by the scanner.  */
    static final int BYTE_KEYWORD = 281;
    /** Token "case", to be returned by the scanner.  */
    static final int CASE_KEYWORD = 282;
    /** Token "continue", to be returned by the scanner.  */
    static final int CONTINUE_KEYWORD = 283;
    /** Token "do", to be returned by the scanner.  */
    static final int DO_KEYWORD = 284;
    /** Token "double", to be returned by the scanner.  */
    static final int DOUBLE_KEYWORD = 285;
    /** Token "else", to be returned by the scanner.  */
    static final int ELSE_KEYWORD = 286;
    /** Token "end", to be returned by the scanner.  */
    static final int END_KEYWORD = 287;
    /** Token "enum", to be returned by the scanner.  */
    static final int ENUM_KEYWORD = 288;
    /** Token "FALSE", to be returned by the scanner.  */
    static final int FALSE_KEYWORD = 289;
    /** Token "float", to be returned by the scanner.  */
    static final int FLOAT_KEYWORD = 290;
    /** Token "foreach", to be returned by the scanner.  */
    static final int FOREACH_KEYWORD = 291;
    /** Token "function", to be returned by the scanner.  */
    static final int FUNCTION_KEYWORD = 292;
    /** Token "if", to be returned by the scanner.  */
    static final int IF_KEYWORD = 293;
    /** Token "integer", to be returned by the scanner.  */
    static final int INTEGER_KEYWORD = 294;
    /** Token "in", to be returned by the scanner.  */
    static final int IN_KEYWORD = 295;
    /** Token "list", to be returned by the scanner.  */
    static final int LIST_KEYWORD = 296;
    /** Token "long", to be returned by the scanner.  */
    static final int LONG_KEYWORD = 297;
    /** Token "loop", to be returned by the scanner.  */
    static final int LOOP_KEYWORD = 298;
    /** Token "of", to be returned by the scanner.  */
    static final int OF_KEYWORD = 299;
    /** Token "procedure", to be returned by the scanner.  */
    static final int PROCEDURE_KEYWORD = 300;
    /** Token "range", to be returned by the scanner.  */
    static final int RANGE_KEYWORD = 301;
    /** Token "return", to be returned by the scanner.  */
    static final int RETURN_KEYWORD = 302;
    /** Token "set", to be returned by the scanner.  */
    static final int SET_KEYWORD = 303;
    /** Token "short", to be returned by the scanner.  */
    static final int SHORT_KEYWORD = 304;
    /** Token "struct", to be returned by the scanner.  */
    static final int STRUCT_KEYWORD = 305;
    /** Token "string", to be returned by the scanner.  */
    static final int STRING_KEYWORD = 306;
    /** Token "switch", to be returned by the scanner.  */
    static final int SWITCH_KEYWORD = 307;
    /** Token "TRUE", to be returned by the scanner.  */
    static final int TRUE_KEYWORD = 308;
    /** Token "unsigned", to be returned by the scanner.  */
    static final int UNSIGNED_KEYWORD = 309;
    /** Token "while", to be returned by the scanner.  */
    static final int WHILE_KEYWORD = 310;
    /** Token "pinMode", to be returned by the scanner.  */
    static final int PINMODE_KEYWORD = 311;
    /** Token "digitalWrite", to be returned by the scanner.  */
    static final int DIGITALWRITE_KEYWORD = 312;
    /** Token "analogReference", to be returned by the scanner.  */
    static final int ANALOGREFERENCE_KEYWORD = 313;
    /** Token "analogWrite", to be returned by the scanner.  */
    static final int ANALOGWRITE_KEYWORD = 314;
    /** Token "digitalRead", to be returned by the scanner.  */
    static final int DIGITALREAD_KEYWORD = 315;
    /** Token "analogRead", to be returned by the scanner.  */
    static final int ANALOGREAD_KEYWORD = 316;
    /** Token "LOW", to be returned by the scanner.  */
    static final int LOW_KEYWORD = 317;
    /** Token "HIGH", to be returned by the scanner.  */
    static final int HIGH_KEYWORD = 318;
    /** Token "INPUT", to be returned by the scanner.  */
    static final int INPUT_KEYWORD = 319;
    /** Token "INPUTPULLUP", to be returned by the scanner.  */
    static final int INPUTPULLUP_KEYWORD = 320;
    /** Token "OUTPUT", to be returned by the scanner.  */
    static final int OUTPUT_KEYWORD = 321;
    /** Token "pin", to be returned by the scanner.  */
    static final int PIN_KEYWORD = 322;
    /** Token "getc", to be returned by the scanner.  */
    static final int GETC_KEYWORD = 323;
    /** Token "available", to be returned by the scanner.  */
    static final int AVAILABLE_KEYWORD = 324;
    /** Token "peek", to be returned by the scanner.  */
    static final int PEEK_KEYWORD = 325;
    /** Token "flush", to be returned by the scanner.  */
    static final int FLUSH_KEYWORD = 326;
    /** Token "putc", to be returned by the scanner.  */
    static final int PUTC_KEYWORD = 327;
    /** Token "puts", to be returned by the scanner.  */
    static final int PUTS_KEYWORD = 328;
    /** Token "delay_ms", to be returned by the scanner.  */
    static final int DELAY_MS_KEYWORD = 329;
    /** Token "delay_s", to be returned by the scanner.  */
    static final int DELAY_S_KEYWORD = 330;
    /** Token IDENTIFIER, to be returned by the scanner.  */
    static final int IDENTIFIER = 331;
    /** Token INTEGER, to be returned by the scanner.  */
    static final int INTEGER = 332;
    /** Token PIN, to be returned by the scanner.  */
    static final int PIN = 333;
    /** Token FLOAT, to be returned by the scanner.  */
    static final int FLOAT = 334;
    /** Token STRING, to be returned by the scanner.  */
    static final int STRING = 335;
    /** Token HIGHER_THAN_NOT, to be returned by the scanner.  */
    static final int HIGHER_THAN_NOT = 336;
    /** Token HIGHER_THAN_MINUS, to be returned by the scanner.  */
    static final int HIGHER_THAN_MINUS = 337;

    /** Deprecated, use YYEOF instead.  */
    public static final int EOF = YYEOF;


    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.
     */
    Object getLVal();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token.
     */
    int yylex() throws java.io.IOException;

    /**
     * Emit an errorin a user-defined way.
     *
     *
     * @param msg The string for the error message.
     */
     void yyerror(String msg);


  }


  /**
   * The object doing lexical analysis for us.
   */
  private Lexer yylexer;





  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public Parser (Lexer yylexer)
  {
/* "%code init" blocks.  */
/* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":63  */

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


/* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/src/fr/ubordeaux/arduinoCode/Parser.java":746  */

    this.yylexer = yylexer;

  }



  private int yynerrs = 0;

  /**
   * The number of syntax errors so far.
   */
  public final int getNumberOfErrors () { return yynerrs; }

  /**
   * Print an error message via the lexer.
   *
   * @param msg The error message.
   */
  public final void yyerror(String msg) {
      yylexer.yyerror(msg);
  }



  private final class YYStack {
    private int[] stateStack = new int[16];
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value) {
      height++;
      if (size == height)
        {
          int[] newStateStack = new int[size * 2];
          System.arraycopy (stateStack, 0, newStateStack, 0, height);
          stateStack = newStateStack;

          Object[] newValueStack = new Object[size * 2];
          System.arraycopy (valueStack, 0, newValueStack, 0, height);
          valueStack = newValueStack;

          size *= 2;
        }

      stateStack[height] = state;
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (0 < num) {
        java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out) {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
          out.print (' ');
          out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).
   */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).
   */
  public static final int YYABORT = 1;



  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.
   */
  public static final int YYERROR = 2;

  /**
   * Internal return codes that are not supported for user semantic
   * actions.
   */
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;


  private int yyerrstatus_ = 0;


  /**
   * Whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.
   */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  /** Compute post-reduction state.
   * @param yystate   the current state
   * @param yysym     the nonterminal to push on the stack
   */
  private int yyLRGotoState (int yystate, int yysym)
  {
    int yyr = yypgoto_[yysym - YYNTOKENS_] + yystate;
    if (0 <= yyr && yyr <= YYLAST_ && yycheck_[yyr] == yystate)
      return yytable_[yyr];
    else
      return yydefgoto_[yysym - YYNTOKENS_];
  }

  private int yyaction(int yyn, YYStack yystack, int yylen)
  {
    /* If YYLEN is nonzero, implement the default value of the action:
       '$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    Object yyval = (0 < yylen) ? yystack.valueAt(yylen - 1) : yystack.valueAt(0);

    switch (yyn)
      {
          case 2: /* program: list_of_definitions "begin" list_of_stms "end"  */
  if (yyn == 2)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":273  */
                                                       {
        trace("*** REDUCE: program -> list_of_definitions \"begin\" list_of_stms \"end\"");
	    // On tente de produire des bouts de code AVR Assembler
	    // de chaque instruction
	    try{
	      for (Stm stm : ((List<Stm> )(yystack.valueAt (1)))){
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
 	};
  break;


  case 3: /* list_of_definitions: %empty  */
  if (yyn == 3)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":301  */
                    { trace("*** REDUCE: list_of_definitions -> "); };
  break;


  case 4: /* list_of_definitions: list_of_definitions definition  */
  if (yyn == 4)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":302  */
                                         {
	  trace("*** REDUCE: list_of_definitions -> definition list_of_definitions");
 	};
  break;


  case 5: /* list_of_stms: stm  */
  if (yyn == 5)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":309  */
            { trace("*** REDUCE: list_of_stms -> stm"); 
	  // On tente de vérifier les types de chaque instruction	
	  try{
	    ((Stm)(yystack.valueAt (0))).accept(checkTypeVisitor);
	  } catch (Exception e) {
	    System.err.println(e.getMessage());
	    return YYABORT;
	  }
	  // On crée la liste des instructions
	  List<Stm> list = new ArrayList<>();
	  list.add(((Stm)(yystack.valueAt (0))));
	  yyval = list;
	};
  break;


  case 6: /* list_of_stms: list_of_stms stm  */
  if (yyn == 6)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":322  */
                           {
	  trace("*** REDUCE: list_of_stms -> list_of_stms stm"); 
	  // On tente de vérifier les types de chaque instruction	
	  try{
	    ((Stm)(yystack.valueAt (0))).accept(checkTypeVisitor);
	  } catch (Exception e) {
	    System.err.println(e.getMessage());
	    return YYABORT;
	  }
	  // On récupère la liste des instructions
	  // et on y met la suivante
	  List<Stm> list = ((List<Stm> )(yystack.valueAt (1)));
	  list.add(((Stm)(yystack.valueAt (0))));
	  yyval = list;
	};
  break;


  case 7: /* definition: var_definition  */
  if (yyn == 7)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":341  */
                       { trace("*** REDUCE: definition -> var_definition"); };
  break;


  case 8: /* definition: type_definition  */
  if (yyn == 8)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":342  */
                          { trace("*** REDUCE: definition -> type_definition"); };
  break;


  case 9: /* definition: function_decl  */
  if (yyn == 9)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":343  */
                        { trace("*** REDUCE: definition -> function_decl"); };
  break;


  case 10: /* definition: procedure_decl  */
  if (yyn == 10)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":344  */
                         { trace("*** REDUCE: definition -> procedure_decl"); };
  break;


  case 11: /* definition: function_definition  */
  if (yyn == 11)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":345  */
                              { trace("*** REDUCE: definition -> function_definition"); };
  break;


  case 12: /* definition: procedure_definition  */
  if (yyn == 12)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":346  */
                               { trace("*** REDUCE: definition -> procedure_definition"); };
  break;


  case 13: /* var_definition: list_of_identifiers ':' type ';'  */
  if (yyn == 13)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":351  */
                                         {
	  trace("*** REDUCE: var_definition -> list_of_identifiers \':\' type \';\'");
	  // pour chacune de ces variables, on va créer un AST DeclVAR
	  // et on va produire le bout de code AVR Assembler qui s'y rapporte
	  // (pour réserver la place mémoire au début du programme)
	  for (String id : ((List<String> )(yystack.valueAt (3)))) {
	    varEnvironment.put(id, new ExprVAR(id, ((Type)(yystack.valueAt (1)))));
	    DeclVAR decl = new DeclVAR(id, ((Type)(yystack.valueAt (1))));
	    try{
	      decl.accept(dataGeneratorVisitor);
	    } catch (Exception e) {
	      System.err.println(e.getMessage());
	      return YYABORT;
	    }
	    
	  }
	};
  break;


  case 14: /* list_of_identifiers: IDENTIFIER  */
  if (yyn == 14)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":372  */
                   { trace("*** REDUCE: list_of_identifiers -> IDENTIFIER");
	  List<String> list = new ArrayList<>();
	  list.add(((String)(yystack.valueAt (0))));
	  yyval = list;
	};
  break;


  case 15: /* list_of_identifiers: list_of_identifiers ',' IDENTIFIER  */
  if (yyn == 15)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":377  */
                                             {
	  trace("*** REDUCE: list_of_identifiers -> list_of_identifiers \',\' IDENTIFIER");
	  List<String> list = ((List<String> )(yystack.valueAt (2)));
	  list.add(((String)(yystack.valueAt (0))));
	  yyval = list;
	  };
  break;


  case 16: /* type_definition: IDENTIFIER '=' type ';'  */
  if (yyn == 16)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":387  */
                                {
	  trace("*** REDUCE: type_definition -> IDENTIFIER \'=\' type \';\'");
	  typeEnvironment.put(((String)(yystack.valueAt (3))), ((Type)(yystack.valueAt (1))));
	};
  break;


  case 17: /* function_decl: "function" IDENTIFIER '(' list_of_parameters ')' ':' type ';'  */
  if (yyn == 17)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":395  */
                                                                      {
	  trace("*** REDUCE: function_decl -> \"function\" IDENTIFIER \'(\' list_of_parameters \')\' \':\' type \';\'");
	  functionEnvironment.put(((String)(yystack.valueAt (6))), new TypeFUNCTION(((List<TypeFIELD> )(yystack.valueAt (4))), ((Type)(yystack.valueAt (1)))));
	};
  break;


  case 18: /* procedure_decl: "procedure" IDENTIFIER '(' list_of_parameters ')' ';'  */
  if (yyn == 18)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":403  */
                                                              {
	  trace("*** REDUCE: procedure_decl -> \"procedure\" IDENTIFIER \'(\' list_of_parameters \')\' \';\'");
	  functionEnvironment.put(((String)(yystack.valueAt (4))), new TypePROCEDURE(((List<TypeFIELD> )(yystack.valueAt (2)))));
	};
  break;


  case 19: /* $@1: %empty  */
  if (yyn == 19)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":411  */
                                                                      {
		functionEnvironment.put(((String)(yystack.valueAt (6))), new TypeFUNCTION(((List<TypeFIELD> )(yystack.valueAt (4))), ((Type)(yystack.valueAt (1)))));
	};
  break;


  case 20: /* function_definition: "function" IDENTIFIER '(' list_of_parameters ')' ':' type '{' $@1 block '}'  */
  if (yyn == 20)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":414  */
                  {
	  trace("*** REDUCE: function_definition -> \"function\" IDENTIFIER \'(\' list_of_parameters \')\' \':\' type \'{\' block \'}\'");
	  };
  break;


  case 21: /* $@2: %empty  */
  if (yyn == 21)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":421  */
                                                              {	  
		functionEnvironment.put(((String)(yystack.valueAt (4))), new TypePROCEDURE(((List<TypeFIELD> )(yystack.valueAt (2)))));
	};
  break;


  case 22: /* procedure_definition: "procedure" IDENTIFIER '(' list_of_parameters ')' '{' $@2 block '}'  */
  if (yyn == 22)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":424  */
                  {
	  trace("*** REDUCE: procedure_definition -> \"procedure\" IDENTIFIER \'(\' list_of_parameters \')\' \' {\' block \'}\'");
	};
  break;


  case 23: /* list_of_parameters: parameter  */
  if (yyn == 23)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":431  */
                  {
	  trace("*** REDUCE: list_of_parameters -> parameter");
	  List<TypeFIELD> list = new ArrayList<>();
	  list.add(((TypeFIELD)(yystack.valueAt (0))));
	  yyval = list;
	  };
  break;


  case 24: /* list_of_parameters: list_of_parameters ',' parameter  */
  if (yyn == 24)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":437  */
                                           {
	  trace("*** REDUCE: list_of_parameters -> list_of_parameters \',\' parameter");
	  List<TypeFIELD> list = ((List<TypeFIELD> )(yystack.valueAt (2)));
	  list.add(((TypeFIELD)(yystack.valueAt (0))));
	  yyval = list;
	};
  break;


  case 25: /* parameter: IDENTIFIER ':' type  */
  if (yyn == 25)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":447  */
                            { 
		trace("*** REDUCE: parameter -> IDENTIFIER \':\' type "); 
		yyval = new TypeTree(Type.Tag.FIELD, ((String)(yystack.valueAt (2))), ((Type)(yystack.valueAt (0)))); 
	};
  break;


  case 26: /* block: list_of_stms  */
  if (yyn == 26)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":455  */
                     { trace("*** REDUCE: block -> list_of_stms"); };
  break;


  case 27: /* type: "boolean"  */
  if (yyn == 27)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":461  */
                  { trace("*** REDUCE: type -> \"boolean\""); yyval = new TypeTree(Type.Tag.BOOLEAN); };
  break;


  case 28: /* type: number  */
  if (yyn == 28)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":462  */
                 { trace("*** REDUCE: type -> int"); yyval = ((Type)(yystack.valueAt (0))); };
  break;


  case 29: /* type: "string" '[' INTEGER ']'  */
  if (yyn == 29)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":463  */
                                   { trace("*** REDUCE: type -> \"string\" \'[\' INTEGER \']\'"); yyval = new TypeTree(Type.Tag.STRING, ((Long)(yystack.valueAt (1)))); };
  break;


  case 30: /* type: "range" "of" type  */
  if (yyn == 30)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":464  */
                            { trace("*** REDUCE: type -> \"range\" \"of\" type"); yyval = new TypeTree(Type.Tag.RANGE, ((Type)(yystack.valueAt (0)))); };
  break;


  case 31: /* type: "set" "of" type  */
  if (yyn == 31)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":465  */
                          { trace("*** REDUCE: type -> \"set\" \"of\" type"); yyval = new TypeTree(Type.Tag.SET, ((Type)(yystack.valueAt (0)))); };
  break;


  case 32: /* type: "list" "of" type  */
  if (yyn == 32)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":466  */
                           { trace("*** REDUCE: type -> \"list\" \"of\" type"); yyval = new TypeTree(Type.Tag.LIST, ((Type)(yystack.valueAt (0)))); };
  break;


  case 33: /* type: "enum" '(' list_of_identifiers ')'  */
  if (yyn == 33)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":467  */
                                             { trace("*** REDUCE: type -> \"enum\" \'(\' list_of_identifiers \')\'"); yyval = new TypeTree(Type.Tag.ENUM, ((List<String> )(yystack.valueAt (1)))); };
  break;


  case 34: /* type: "struct" '{' list_of_fields '}'  */
  if (yyn == 34)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":468  */
                                          { trace("*** REDUCE: type -> \"struct\" \'{\' list_of_fields \'}\'"); yyval = new TypeTree(Type.Tag.STRUCT, ((List<TypeFIELD> )(yystack.valueAt (1)))); };
  break;


  case 35: /* list_of_fields: field  */
  if (yyn == 35)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":473  */
              {
	  trace("*** REDUCE: list_of_fields -> field");
	  List<TypeFIELD> list = new ArrayList<>();
	  list.add(((TypeFIELD)(yystack.valueAt (0))));
	  yyval = list;
	};
  break;


  case 36: /* list_of_fields: list_of_fields field  */
  if (yyn == 36)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":479  */
                               {
	  trace("*** REDUCE: list_of_fields -> field list_of_fields");
	  List<TypeFIELD> list = ((List<TypeFIELD> )(yystack.valueAt (1)));
	  list.add(((TypeFIELD)(yystack.valueAt (0))));
	  yyval = list;
	};
  break;


  case 37: /* field: IDENTIFIER ':' type ';'  */
  if (yyn == 37)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":489  */
                                { 
		trace("*** REDUCE: field -> IDENTIFIER \':\' type \';\'"); 
		yyval = new TypeFIELD(((String)(yystack.valueAt (3))), ((Type)(yystack.valueAt (1)))); 
	};
  break;


  case 38: /* number: "byte"  */
  if (yyn == 38)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":497  */
               { trace("*** REDUCE: int -> \"byte\""); yyval = new TypeTree(Type.Tag.INT8_T); };
  break;


  case 39: /* number: "pin"  */
  if (yyn == 39)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":498  */
                { trace("*** REDUCE: int -> \"pin\""); yyval = new TypeTree(Type.Tag.PIN); };
  break;


  case 40: /* number: "unsigned" "byte"  */
  if (yyn == 40)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":499  */
                            { trace("*** REDUCE: int -> \"unsigned\" \"byte\""); yyval = new TypeTree(Type.Tag.UINT8_T); };
  break;


  case 41: /* number: "short"  */
  if (yyn == 41)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":500  */
                  { trace("*** REDUCE: int -> \"small\" \"integer\""); yyval = new TypeTree(Type.Tag.INT16_T); };
  break;


  case 42: /* number: "unsigned" "short"  */
  if (yyn == 42)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":501  */
                             { trace("*** REDUCE: int -> \"unsigned\" \"small\" \"integer\""); yyval = new TypeTree(Type.Tag.UINT16_T); };
  break;


  case 43: /* number: "integer"  */
  if (yyn == 43)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":502  */
                    { trace("*** REDUCE: int -> \"integer\""); yyval = new TypeTree(Type.Tag.INT32_T); };
  break;


  case 44: /* number: "unsigned" "integer"  */
  if (yyn == 44)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":503  */
                               { trace("*** REDUCE: int -> \"unsigned\" \"integer\""); yyval = new TypeTree(Type.Tag.UINT32_T); };
  break;


  case 45: /* number: "float"  */
  if (yyn == 45)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":504  */
                  { trace("*** REDUCE: int -> \"float\""); yyval = new TypeTree(Type.Tag.F32_T); };
  break;


  case 46: /* stm: left_part "++" ';'  */
  if (yyn == 46)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":511  */
                           { trace("*** REDUCE: stm -> left_part \"++\""); yyval = new StmExpr(new ExprUnary(ExprUnary.Op.PP, ((Expr)(yystack.valueAt (2))).getType(), ((Expr)(yystack.valueAt (2))))); };
  break;


  case 47: /* stm: left_part "--" ';'  */
  if (yyn == 47)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":512  */
                             { trace("*** REDUCE: stm -> left_part \"--\""); yyval = new StmExpr(new ExprUnary(ExprUnary.Op.MM, ((Expr)(yystack.valueAt (2))).getType(), ((Expr)(yystack.valueAt (2))))); };
  break;


  case 48: /* stm: left_part '=' expression ';'  */
  if (yyn == 48)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":513  */
                                       { trace("*** REDUCE: stm -> left_part \'=\' expression \';\'"); yyval = new StmAFF(((Expr)(yystack.valueAt (3))), ((Expr)(yystack.valueAt (1)))); };
  break;


  case 49: /* stm: left_part "+=" expression ';'  */
  if (yyn == 49)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":514  */
                                        { trace("*** REDUCE: stm -> left_part \"+=\" expression \';\'"); yyval = new StmAFF(StmAFF.Op.PLUS, ((Expr)(yystack.valueAt (3))), ((Expr)(yystack.valueAt (1)))); };
  break;


  case 50: /* stm: left_part "-=" expression ';'  */
  if (yyn == 50)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":515  */
                                        { trace("*** REDUCE: stm -> left_part \"-=\" expression \';\'"); yyval = new StmAFF(StmAFF.Op.MINUS, ((Expr)(yystack.valueAt (3))), ((Expr)(yystack.valueAt (1))));};
  break;


  case 51: /* stm: left_part "*=" expression ';'  */
  if (yyn == 51)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":516  */
                                        { trace("*** REDUCE: stm -> left_part \"*=\" expression \';\'"); yyval = new StmAFF(StmAFF.Op.MUL, ((Expr)(yystack.valueAt (3))), ((Expr)(yystack.valueAt (1))));};
  break;


  case 52: /* stm: left_part "/=" expression ';'  */
  if (yyn == 52)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":517  */
                                        { trace("*** REDUCE: stm -> left_part \"/=\" expression \';\'"); yyval = new StmAFF(StmAFF.Op.DIV, ((Expr)(yystack.valueAt (3))), ((Expr)(yystack.valueAt (1))));};
  break;


  case 53: /* stm: left_part "%=" expression ';'  */
  if (yyn == 53)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":518  */
                                        { trace("*** REDUCE: stm -> left_part \"%=\" expression \';\'"); yyval = new StmAFF(StmAFF.Op.PER, ((Expr)(yystack.valueAt (3))), ((Expr)(yystack.valueAt (1))));};
  break;


  case 54: /* stm: left_part "&=" expression ';'  */
  if (yyn == 54)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":519  */
                                        { trace("*** REDUCE: stm -> left_part \"&=\" expression \';\'"); yyval = new StmAFF(StmAFF.Op.LAND, ((Expr)(yystack.valueAt (3))), ((Expr)(yystack.valueAt (1))));};
  break;


  case 55: /* stm: left_part "|=" expression ';'  */
  if (yyn == 55)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":520  */
                                        { trace("*** REDUCE: stm -> left_part \"|=\" expression \';\'"); yyval = new StmAFF(StmAFF.Op.LOR, ((Expr)(yystack.valueAt (3))), ((Expr)(yystack.valueAt (1))));};
  break;


  case 56: /* stm: left_part "&&=" expression ';'  */
  if (yyn == 56)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":521  */
                                         { trace("*** REDUCE: stm -> left_part \"&&=\" expression \';\'"); yyval = new StmAFF(StmAFF.Op.AND, ((Expr)(yystack.valueAt (3))), ((Expr)(yystack.valueAt (1))));};
  break;


  case 57: /* stm: left_part "||=" expression ';'  */
  if (yyn == 57)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":522  */
                                         { trace("*** REDUCE: stm -> left_part \"||=\" expression \';\'"); yyval = new StmAFF(StmAFF.Op.OR, ((Expr)(yystack.valueAt (3))), ((Expr)(yystack.valueAt (1))));};
  break;


  case 58: /* stm: ATmega328p_procedure  */
  if (yyn == 58)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":523  */
                               { trace("*** REDUCE: stm -> ATmega328p_procedure"); yyval = new StmExpr(((Expr)(yystack.valueAt (0)))); };
  break;


  case 59: /* stm: "switch" '(' expression ')' '{' list_of_case_stms '}'  */
  if (yyn == 59)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":524  */
                                                                { trace("*** REDUCE: stm -> \"switch\" \'(\' expression \')\' \'{\' list_of_case_stms \'}\'"); yyval = new StmSWITCH(((Expr)(yystack.valueAt (4))), ((List<StmCASE> )(yystack.valueAt (1))));};
  break;


  case 60: /* stm: "do" stm "while" '(' expression ')' ';'  */
  if (yyn == 60)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":525  */
                                                  { trace("*** REDUCE: stm -> \"do\" stm \"while\" \'(\' expression \')\' \';\'"); yyval = new StmDO(((Stm)(yystack.valueAt (5))), ((Expr)(yystack.valueAt (2))));};
  break;


  case 61: /* stm: "loop" stm  */
  if (yyn == 61)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":526  */
                     { trace("*** REDUCE: stm -> \"loop\" stm"); yyval = new StmLOOP(((Stm)(yystack.valueAt (0))));};
  break;


  case 62: /* stm: "break" ';'  */
  if (yyn == 62)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":527  */
                      { trace("*** REDUCE: stm -> \"break\" \';\'"); yyval = new StmBREAK();};
  break;


  case 63: /* stm: "continue" ';'  */
  if (yyn == 63)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":528  */
                         { trace("*** REDUCE: stm -> \"continue\" \';\'"); yyval = new StmBREAK();};
  break;


  case 64: /* stm: "return" expression ';'  */
  if (yyn == 64)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":529  */
                                  { trace("*** REDUCE: stm -> \"return\" expression \';\'"); yyval = new StmRETURN(((Expr)(yystack.valueAt (1))));};
  break;


  case 65: /* stm: '{' list_of_stms '}'  */
  if (yyn == 65)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":530  */
                               { trace("*** REDUCE: stm -> '{' list_of_stms '}'"); yyval = new StmSeq(((List<Stm> )(yystack.valueAt (1)))); };
  break;


  case 66: /* list_of_case_stms: case_stm  */
  if (yyn == 66)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":535  */
                 {
	  trace("*** REDUCE: list_of_case_stms -> case_stm");
	  List<StmCASE> list = new ArrayList<>();
	  list.add(((StmCASE)(yystack.valueAt (0))));
	  yyval = list;
	};
  break;


  case 67: /* list_of_case_stms: list_of_case_stms case_stm  */
  if (yyn == 67)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":541  */
                                     {
	  trace("*** REDUCE: list_of_case_stms -> list_of_case_stms case_stm");
	  List<StmCASE> list = ((List<StmCASE> )(yystack.valueAt (1)));
	  list.add(((StmCASE)(yystack.valueAt (0))));
	  yyval = list;
	};
  break;


  case 68: /* case_stm: "case" expression ':' stm  */
  if (yyn == 68)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":551  */
                                  {
	  trace("*** REDUCE: case_stm -> \"case\" expression \':\' stm");
	  yyval = new StmCASE(((Expr)(yystack.valueAt (2))), ((Stm)(yystack.valueAt (0))));
	};
  break;


  case 69: /* left_part: IDENTIFIER  */
  if (yyn == 69)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":560  */
                   {
	  trace("*** REDUCE: left_part -> IDENTIFIER");
	  ExprVAR var = null;
	  try {
	    var = varEnvironment.get(((String)(yystack.valueAt (0))));
	  } catch (EnvironmentException e) {
	    yyerror(e.getMessage());
	    return YYABORT;
	  }
	  yyval = var;
	};
  break;


  case 70: /* left_part: IDENTIFIER '[' expression ']'  */
  if (yyn == 70)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":571  */
                                        {
	  trace("*** REDUCE: left_part -> IDENTIFIER \'[\' expression \']\'");
	  ExprVAR var = null;
	  try {
	    var = varEnvironment.get(((String)(yystack.valueAt (3))));
	  } catch (EnvironmentException e) {
	    yyerror(e.getMessage());
	    return YYABORT;
	  }
	  yyval = new ExprGET(((Expr)(yystack.valueAt (1))), var);
	};
  break;


  case 71: /* expression: constant_expression  */
  if (yyn == 71)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":589  */
                            { 
		trace("*** REDUCE: expression -> constant_expression"); 
		yyval = ((ExprCONSTANT)(yystack.valueAt (0))); 
	};
  break;


  case 72: /* expression: left_part  */
  if (yyn == 72)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":593  */
                    { 
		trace("*** REDUCE: expression -> left_part"); 
		yyval = ((Expr)(yystack.valueAt (0))); 
	};
  break;


  case 73: /* expression: IDENTIFIER '(' list_of_expressions ')'  */
  if (yyn == 73)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":597  */
                                                 { 
		trace("*** REDUCE: expression -> IDENTIFIER \'(\' list_of_expressions \')\'"); 
		yyval = new ExprFUNCTION(((String)(yystack.valueAt (3))), ((List<Expr> )(yystack.valueAt (1)))); 
	};
  break;


  case 74: /* expression: '[' list_of_expressions ']'  */
  if (yyn == 74)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":601  */
                                      { trace("*** REDUCE: expression -> \'(\' list_of_expressions \')\'"); yyval = new ExprLIST(((List<Expr> )(yystack.valueAt (1)))); };
  break;


  case 75: /* expression: '{' list_of_expressions '}'  */
  if (yyn == 75)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":602  */
                                      { trace("*** REDUCE: expression -> \'{\' list_of_expressions \'}\'"); yyval = new ExprSET(((List<Expr> )(yystack.valueAt (1)))); };
  break;


  case 76: /* expression: '[' expression ".." expression ']'  */
  if (yyn == 76)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":603  */
                                             { trace("*** REDUCE: expression -> \'[\' expression \"..\" \']\'"); yyval = new ExprRANGE(((Expr)(yystack.valueAt (3))), ((Expr)(yystack.valueAt (1)))); };
  break;


  case 77: /* expression: expression '+' expression  */
  if (yyn == 77)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":604  */
                                    { trace("*** REDUCE: expression -> expression \'+\' expression"); yyval = new ExprBinary(ExprBinary.Op.PLUS, ((Expr)(yystack.valueAt (2))).getType(), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 78: /* expression: expression '*' expression  */
  if (yyn == 78)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":605  */
                                    { trace("*** REDUCE: expression -> expression \'*\' expression"); yyval = new ExprBinary(ExprBinary.Op.MUL, ((Expr)(yystack.valueAt (2))).getType(), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 79: /* expression: expression '-' expression  */
  if (yyn == 79)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":606  */
                                    { trace("*** REDUCE: expression -> expression \'-\' expression"); yyval = new ExprBinary(ExprBinary.Op.MINUS, ((Expr)(yystack.valueAt (2))).getType(), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 80: /* expression: expression '/' expression  */
  if (yyn == 80)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":607  */
                                    { trace("*** REDUCE: expression -> expression \'/\' expression"); yyval = new ExprBinary(ExprBinary.Op.DIV, ((Expr)(yystack.valueAt (2))).getType(), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 81: /* expression: expression '%' expression  */
  if (yyn == 81)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":608  */
                                    { trace("*** REDUCE: expression -> expression \'%\' expression"); yyval = new ExprBinary(ExprBinary.Op.PERC, ((Expr)(yystack.valueAt (2))).getType(), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 82: /* expression: '-' expression  */
  if (yyn == 82)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":609  */
                                                 { trace("*** REDUCE: expression -> \'-\' expression"); yyval = new ExprUnary(ExprUnary.Op.MINUS, ((Expr)(yystack.valueAt (0))).getType(), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 83: /* expression: expression "++"  */
  if (yyn == 83)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":610  */
                          { trace("*** REDUCE: expression -> expression \"++\""); yyval = new ExprUnary(ExprUnary.Op.PP, ((Expr)(yystack.valueAt (1))).getType(), ((Expr)(yystack.valueAt (1)))); };
  break;


  case 84: /* expression: expression "--"  */
  if (yyn == 84)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":611  */
                          { trace("*** REDUCE: expression -> expression \"--\""); yyval = new ExprUnary(ExprUnary.Op.MM, ((Expr)(yystack.valueAt (1))).getType(), ((Expr)(yystack.valueAt (1)))); };
  break;


  case 85: /* expression: "++" expression  */
  if (yyn == 85)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":612  */
                          { trace("*** REDUCE: expression -> \"++\" expression"); yyval = new ExprUnary(ExprUnary.Op.PP2, ((Expr)(yystack.valueAt (0))).getType(), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 86: /* expression: "--" expression  */
  if (yyn == 86)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":613  */
                          { trace("*** REDUCE: expression -> \"--\" expression"); yyval = new ExprUnary(ExprUnary.Op.MM2, ((Expr)(yystack.valueAt (0))).getType(), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 87: /* expression: expression '<' expression  */
  if (yyn == 87)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":614  */
                                    { trace("*** REDUCE: expression -> expression \'<\' expression"); yyval = new ExprBinary(ExprBinary.Op.GT, new TypeTree(Type.Tag.BOOLEAN), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 88: /* expression: expression "<=" expression  */
  if (yyn == 88)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":615  */
                                     { trace("*** REDUCE: expression -> expression \"<=\" expression"); yyval = new ExprBinary(ExprBinary.Op.GE, new TypeTree(Type.Tag.BOOLEAN), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 89: /* expression: expression '>' expression  */
  if (yyn == 89)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":616  */
                                    { trace("*** REDUCE: expression -> expression \'>\' expression"); yyval = new ExprBinary(ExprBinary.Op.LT, new TypeTree(Type.Tag.BOOLEAN), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 90: /* expression: expression ">=" expression  */
  if (yyn == 90)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":617  */
                                     { trace("*** REDUCE: expression -> expression \">=\" expression"); yyval = new ExprBinary(ExprBinary.Op.LE, new TypeTree(Type.Tag.BOOLEAN), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 91: /* expression: expression "==" expression  */
  if (yyn == 91)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":618  */
                                     { trace("*** REDUCE: expression -> expression \"==\" expression"); yyval = new ExprBinary(ExprBinary.Op.EQ, new TypeTree(Type.Tag.BOOLEAN), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 92: /* expression: expression "!=" expression  */
  if (yyn == 92)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":619  */
                                     { trace("*** REDUCE: expression -> expression \"!=\" expression"); yyval = new ExprBinary(ExprBinary.Op.NE, new TypeTree(Type.Tag.BOOLEAN), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 93: /* expression: expression "<<" expression  */
  if (yyn == 93)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":620  */
                                     { trace("*** REDUCE: expression -> expression \"<<\" expression"); yyval = new ExprBinary(ExprBinary.Op.BSL, ((Expr)(yystack.valueAt (2))).getType(), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 94: /* expression: expression ">>" expression  */
  if (yyn == 94)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":621  */
                                     { trace("*** REDUCE: expression -> expression \">>\" expression"); yyval = new ExprBinary(ExprBinary.Op.BSR, ((Expr)(yystack.valueAt (2))).getType(), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 95: /* expression: expression '&' expression  */
  if (yyn == 95)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":622  */
                                    { trace("*** REDUCE: expression -> expression \'&\' expression"); yyval = new ExprBinary(ExprBinary.Op.BAND, ((Expr)(yystack.valueAt (2))).getType(), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 96: /* expression: expression '|' expression  */
  if (yyn == 96)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":623  */
                                    { trace("*** REDUCE: expression -> expression \'|\' expression"); yyval = new ExprBinary(ExprBinary.Op.BOR, ((Expr)(yystack.valueAt (2))).getType(), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 97: /* expression: expression "&&" expression  */
  if (yyn == 97)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":624  */
                                     { trace("*** REDUCE: expression -> expression \"&&\" expression"); yyval = new ExprBinary(ExprBinary.Op.AND, ((Expr)(yystack.valueAt (2))).getType(), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 98: /* expression: expression "||" expression  */
  if (yyn == 98)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":625  */
                                     { trace("*** REDUCE: expression -> expression \"||\" expression"); yyval = new ExprBinary(ExprBinary.Op.OR, ((Expr)(yystack.valueAt (2))).getType(), ((Expr)(yystack.valueAt (2))), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 99: /* expression: '!' expression  */
  if (yyn == 99)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":626  */
                                           { trace("*** REDUCE: expression -> \'!\' expression"); yyval = new ExprUnary(ExprUnary.Op.NOT, ((Expr)(yystack.valueAt (0))).getType(), ((Expr)(yystack.valueAt (0)))); };
  break;


  case 100: /* expression: '(' expression ')'  */
  if (yyn == 100)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":627  */
                             { trace("*** REDUCE: expression -> \'(\' expression \')\'"); yyval = ((Expr)(yystack.valueAt (1))); };
  break;


  case 101: /* expression: ATmega328p_expression  */
  if (yyn == 101)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":628  */
                                { trace("*** REDUCE: expression -> ATmega328p_expression"); yyval = ((Expr)(yystack.valueAt (0))); };
  break;


  case 102: /* list_of_expressions: expression  */
  if (yyn == 102)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":633  */
                   {
	  trace("*** REDUCE: list_of_expressions -> expression");
	  List<Expr> list = new ArrayList<>();
	  list.add(((Expr)(yystack.valueAt (0))));
	  yyval = list;
	};
  break;


  case 103: /* list_of_expressions: list_of_expressions ',' expression  */
  if (yyn == 103)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":639  */
                                             {
	  trace("*** REDUCE: list_of_expressions -> expression \',\' list_of_expressions");
	  List<Expr> list = ((List<Expr> )(yystack.valueAt (2)));
	  list.add(((Expr)(yystack.valueAt (0))));
	  };
  break;


  case 104: /* constant_expression: "TRUE"  */
  if (yyn == 104)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":648  */
               { 
		trace("*** REDUCE: constant_expression -> \"true\""); 
		yyval = new ExprCONSTANT(new TypeTree(Type.Tag.BOOLEAN), true); 
	};
  break;


  case 105: /* constant_expression: "FALSE"  */
  if (yyn == 105)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":652  */
                  { 
		trace("*** REDUCE: constant_expression -> \"false\""); 
		yyval = new ExprCONSTANT(new TypeTree(Type.Tag.BOOLEAN), false); 
	};
  break;


  case 106: /* constant_expression: PIN  */
  if (yyn == 106)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":656  */
              { 
		trace("*** REDUCE: constant_expression -> PIN");
	  	yyval = new ExprCONSTANT(new TypeTree(Type.Tag.PIN), ((Integer)(yystack.valueAt (0))));
	};
  break;


  case 107: /* constant_expression: INTEGER  */
  if (yyn == 107)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":660  */
                  { 
		trace("*** REDUCE: constant_expression -> INTEGER");
	  	yyval = new ExprCONSTANT(new TypeTree(Type.Tag.UINT32_T), ((Long)(yystack.valueAt (0))));
	};
  break;


  case 108: /* constant_expression: FLOAT  */
  if (yyn == 108)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":664  */
                {
	  trace("*** REDUCE: constant_expression -> FLOAT");
	  yyval = new ExprCONSTANT(new TypeTree(Type.Tag.F32_T), ((Float)(yystack.valueAt (0))));
	};
  break;


  case 109: /* constant_expression: STRING  */
  if (yyn == 109)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":668  */
                 {
	  trace("*** REDUCE: constant_expression -> STRING");
	  yyval = new ExprCONSTANT(new TypeTree(Type.Tag.STRING), ((String)(yystack.valueAt (0))));
	};
  break;


  case 110: /* ATmega328p_procedure: "pinMode" '(' expression ',' expression ')' ';'  */
  if (yyn == 110)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":686  */
                                                        { 
		trace("*** REDUCE: ATmega328p_procedure -> \"pinMode\" \'(\' expression \',\' expression \')\' \';\' ");  
		List<Expr> list = new ArrayList<>();
		((Expr)(yystack.valueAt (4))).cast(Type.Tag.PIN);
		list.add(new ExprUnary(ExprUnary.Op.ARG, ((Expr)(yystack.valueAt (4)))));
		((Expr)(yystack.valueAt (2))).cast(Type.Tag.UINT8_T);
		list.add(new ExprUnary(ExprUnary.Op.ARG, ((Expr)(yystack.valueAt (2)))));
		try {
			yyval = new ExprFUNCTION(ExprFUNCTION.Defined.pinMode, list, functionEnvironment.get("pinMode"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	};
  break;


  case 111: /* ATmega328p_procedure: "digitalWrite" '(' expression ',' expression ')' ';'  */
  if (yyn == 111)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":700  */
                                                               { 
		trace("*** REDUCE: ATmega328p_procedure -> \"digitalWrite\" \'(\' PIN \',\' expression \')\' \';\'"); 
		List<Expr> list = new ArrayList<>();
		((Expr)(yystack.valueAt (4))).cast(Type.Tag.PIN);
		list.add(new ExprUnary(ExprUnary.Op.ARG, ((Expr)(yystack.valueAt (4)))));
		((Expr)(yystack.valueAt (2))).cast(Type.Tag.UINT8_T);
		list.add(new ExprUnary(ExprUnary.Op.ARG, ((Expr)(yystack.valueAt (2)))));
		try {
			yyval = new ExprFUNCTION(ExprFUNCTION.Defined.digitalWrite, list, functionEnvironment.get("digitalWrite"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	};
  break;


  case 112: /* ATmega328p_procedure: "analogReference" '(' expression ')' ';'  */
  if (yyn == 112)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":714  */
                                                   { 
		trace("*** REDUCE: ATmega328p_procedure -> \"analogReference\" \'(\' expression \')\' \';\'"); 
		List<Expr> list = new ArrayList<>();
		((Expr)(yystack.valueAt (2))).cast(Type.Tag.UINT8_T);
		list.add(new ExprUnary(ExprUnary.Op.ARG, ((Expr)(yystack.valueAt (2)))));
		try {
			yyval = new ExprFUNCTION(ExprFUNCTION.Defined.analogReference, list, functionEnvironment.get("analogReference"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	};
  break;


  case 113: /* ATmega328p_procedure: "analogWrite" '(' expression ',' expression ')' ';'  */
  if (yyn == 113)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":726  */
                                                              { 
		trace("*** REDUCE: ATmega328p_procedure -> \"analogWrite\" \'(\' PIN \',\' expression \')\' \';\'"); 
		List<Expr> list = new ArrayList<>();
		((Expr)(yystack.valueAt (4))).cast(Type.Tag.PIN);
		list.add(new ExprUnary(ExprUnary.Op.ARG, ((Expr)(yystack.valueAt (4)))));
		((Expr)(yystack.valueAt (2))).cast(Type.Tag.UINT16_T);
		list.add(new ExprUnary(ExprUnary.Op.ARG, ((Expr)(yystack.valueAt (2)))));
		try {
			yyval = new ExprFUNCTION(ExprFUNCTION.Defined.analogWrite, list, functionEnvironment.get("analogWrite"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	};
  break;


  case 114: /* ATmega328p_procedure: "peek" '(' ')' ';'  */
  if (yyn == 114)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":740  */
                             { 
		trace("*** REDUCE: ATmega328p_procedure -> \"peek\" \'(\' \')\' \';\'"); 
		try {
			yyval = new ExprFUNCTION(ExprFUNCTION.Defined.peek, functionEnvironment.get("peek"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	};
  break;


  case 115: /* ATmega328p_procedure: "flush" '(' ')' ';'  */
  if (yyn == 115)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":749  */
                              { 
		trace("*** REDUCE: ATmega328p_procedure -> \"flush\" \'(\' \')\' \';\'"); 
		try {
			yyval = new ExprFUNCTION(ExprFUNCTION.Defined.flush, functionEnvironment.get("flush"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	};
  break;


  case 116: /* ATmega328p_procedure: "putc" '(' expression ')' ';'  */
  if (yyn == 116)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":758  */
                                        { 
		trace("*** REDUCE: ATmega328p_procedure -> \"putc\" \'(\' expression \')\' \';\'"); 

		// La liste des arguments comprend un seul argument de type UINT8_T
		List<Expr> list = new ArrayList<>();

		// On force l'expression à être de type UINT8_T
		((Expr)(yystack.valueAt (2))).cast(Type.Tag.UINT8_T);
		list.add(new ExprUnary(ExprUnary.Op.ARG, ((Expr)(yystack.valueAt (2)))));

		// On construit l'AST de cet appel de fonction
		try{
			yyval = new ExprFUNCTION(ExprFUNCTION.Defined.putc, list, functionEnvironment.get("putc"));
		}
		catch (EnvironmentException e){
			System.err.println("*** " + e.getMessage());
		}
	};
  break;


  case 117: /* ATmega328p_procedure: "puts" '(' expression ')' ';'  */
  if (yyn == 117)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":777  */
                                        { 
		trace("*** REDUCE: ATmega328p_procedure -> \"puts\" \'(\' expression \')\' \';\'"); 
		List<Expr> list = new ArrayList<>();
		list.add(new ExprUnary(ExprUnary.Op.ARG, ((Expr)(yystack.valueAt (2)))));
		try {
			yyval = new ExprFUNCTION(ExprFUNCTION.Defined.puts, list, functionEnvironment.get("puts"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	};
  break;


  case 118: /* ATmega328p_procedure: "delay_s" '(' expression ')' ';'  */
  if (yyn == 118)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":788  */
                                           { 
		trace("*** REDUCE: ATmega328p_procedure -> \"puts\" \'(\' expression \')\' \';\'"); 
		List<Expr> list = new ArrayList<>();
		((Expr)(yystack.valueAt (2))).cast(Type.Tag.UINT16_T);
		list.add(new ExprUnary(ExprUnary.Op.ARG, ((Expr)(yystack.valueAt (2)))));
		try {
			yyval = new ExprFUNCTION(ExprFUNCTION.Defined.delay_s, list, functionEnvironment.get("delay_s"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	};
  break;


  case 119: /* ATmega328p_procedure: "delay_ms" '(' expression ')' ';'  */
  if (yyn == 119)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":800  */
                                            { 
		trace("*** REDUCE: ATmega328p_procedure -> \"puts\" \'(\' expression \')\' \';\'"); 
		List<Expr> list = new ArrayList<>();
		((Expr)(yystack.valueAt (2))).cast(Type.Tag.UINT16_T);
		list.add(new ExprUnary(ExprUnary.Op.ARG, ((Expr)(yystack.valueAt (2)))));
		try {
			yyval = new ExprFUNCTION(ExprFUNCTION.Defined.delay_ms, list, functionEnvironment.get("delay_ms"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	};
  break;


  case 120: /* ATmega328p_expression: "LOW"  */
  if (yyn == 120)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":819  */
              { 
		trace("*** REDUCE: ATmega328p_expression -> \"LOW\"");  
		yyval = new ExprCONSTANT(new TypeTree(Type.Tag.UINT8_T), (Integer)0); 
	};
  break;


  case 121: /* ATmega328p_expression: "HIGH"  */
  if (yyn == 121)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":824  */
                 { 
		trace("*** REDUCE: ATmega328p_expression -> \"HIGH\""); 
		yyval = new ExprCONSTANT(new TypeTree(Type.Tag.UINT8_T), (Integer)255); 
	};
  break;


  case 122: /* ATmega328p_expression: "INPUT"  */
  if (yyn == 122)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":829  */
                  { 
		trace("*** REDUCE: ATmega328p_expression -> \"INPUT\""); 
		yyval = new ExprCONSTANT(new TypeTree(Type.Tag.UINT8_T), (Integer)0x0); 
	};
  break;


  case 123: /* ATmega328p_expression: "INPUTPULLUP"  */
  if (yyn == 123)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":834  */
                        { 
		trace("*** REDUCE: ATmega328p_expression -> \"INPUTPULLUP\""); 
		yyval = new ExprCONSTANT(new TypeTree(Type.Tag.UINT8_T), (Integer)0x2); 
	};
  break;


  case 124: /* ATmega328p_expression: "OUTPUT"  */
  if (yyn == 124)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":839  */
                   { 
		trace("*** REDUCE: ATmega328p_expression -> \"OUTPUT\""); 
		yyval = new ExprCONSTANT(new TypeTree(Type.Tag.UINT8_T), (Integer)0x1); 
	};
  break;


  case 125: /* ATmega328p_expression: "digitalRead" '(' expression ')'  */
  if (yyn == 125)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":844  */
                                           { 
   		trace("*** REDUCE: ATmega328p_expression -> \"digitalRead\" \'(\' PIN \')\'"); 
		List<Expr> list = new ArrayList<>();
		list.add(new ExprUnary(ExprUnary.Op.ARG, new ExprCONSTANT(new TypeTree(Type.Tag.UINT8_T), ((Expr)(yystack.valueAt (1))))));
		try {
			yyval = new ExprFUNCTION(ExprFUNCTION.Defined.digitalRead, list, functionEnvironment.get("digitalRead"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
   	};
  break;


  case 126: /* ATmega328p_expression: "analogRead" '(' expression ')'  */
  if (yyn == 126)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":855  */
                                          { 
   		trace("*** REDUCE: ATmega328p_expression -> \"analogRead\" \'(\' PIN \')\'"); 
		List<Expr> list = new ArrayList<>();
		((Expr)(yystack.valueAt (1))).cast(Type.Tag.PIN);
		list.add(new ExprUnary(ExprUnary.Op.ARG, ((Expr)(yystack.valueAt (1)))));
		try {
			yyval = new ExprFUNCTION(ExprFUNCTION.Defined.analogRead, list, functionEnvironment.get("analogRead"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
   	};
  break;


  case 127: /* ATmega328p_expression: "getc" '(' ')'  */
  if (yyn == 127)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":867  */
                         { 
		trace("*** REDUCE: ATmega328p_expression -> \"getc\" \'(\' \')\'"); 
		try {
			yyval = new ExprFUNCTION(ExprFUNCTION.Defined.getc, functionEnvironment.get("getc"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
	};
  break;


  case 128: /* ATmega328p_expression: "available" '(' ')'  */
  if (yyn == 128)
    /* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":876  */
                              { 
   		trace("*** REDUCE: ATmega328p_expression -> \"available\" \'(\' \')\'"); 
		try {
			yyval = new ExprFUNCTION(ExprFUNCTION.Defined.available, functionEnvironment.get("available"));
		} catch (EnvironmentException e) {
			System.err.println("*** " + e.getMessage());
		}
   	};
  break;



/* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/src/fr/ubordeaux/arduinoCode/Parser.java":2133  */

        default: break;
      }

    yystack.pop(yylen);
    yylen = 0;
    /* Shift the result of the reduction.  */
    int yystate = yyLRGotoState(yystack.stateAt(0), yyr1_[yyn]);
    yystack.push(yystate, yyval);
    return YYNEWSTATE;
  }




  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse() throws java.io.IOException

  {


    /* Lookahead token kind.  */
    int yychar = YYEMPTY_;
    /* Lookahead symbol kind.  */
    SymbolKind yytoken = null;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;
    YYStack yystack = new YYStack ();
    int label = YYNEWSTATE;



    /* Semantic value of the lookahead.  */
    Object yylval = null;

    yyerrstatus_ = 0;
    yynerrs = 0;

    /* Initialize the stack.  */
    yystack.push (yystate, yylval);



    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
           pushed when we come here.  */
      case YYNEWSTATE:

        /* Accept?  */
        if (yystate == YYFINAL_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yyPactValueIsDefault (yyn))
          {
            label = YYDEFAULT;
            break;
          }

        /* Read a lookahead token.  */
        if (yychar == YYEMPTY_)
          {

            yychar = yylexer.yylex ();
            yylval = yylexer.getLVal();

          }

        /* Convert token to internal form.  */
        yytoken = yytranslate_ (yychar);

        if (yytoken == SymbolKind.S_YYerror)
          {
            // The scanner already issued an error message, process directly
            // to error recovery.  But do not keep the error token as
            // lookahead, it is too special and may lead us to an endless
            // loop in error recovery. */
            yychar = Lexer.YYUNDEF;
            yytoken = SymbolKind.S_YYUNDEF;
            label = YYERRLAB1;
          }
        else
          {
            /* If the proper action on seeing token YYTOKEN is to reduce or to
               detect an error, take that action.  */
            yyn += yytoken.getCode();
            if (yyn < 0 || YYLAST_ < yyn || yycheck_[yyn] != yytoken.getCode())
              label = YYDEFAULT;

            /* <= 0 means reduce or error.  */
            else if ((yyn = yytable_[yyn]) <= 0)
              {
                if (yyTableValueIsError (yyn))
                  label = YYERRLAB;
                else
                  {
                    yyn = -yyn;
                    label = YYREDUCE;
                  }
              }

            else
              {
                /* Shift the lookahead token.  */
                /* Discard the token being shifted.  */
                yychar = YYEMPTY_;

                /* Count tokens shifted since error; after three, turn off error
                   status.  */
                if (yyerrstatus_ > 0)
                  --yyerrstatus_;

                yystate = yyn;
                yystack.push (yystate, yylval);
                label = YYNEWSTATE;
              }
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction(yyn, yystack, yylen);
        yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs;
            if (yychar == YYEMPTY_)
              yytoken = null;
            yyreportSyntaxError (new Context (yystack, yytoken));
          }

        if (yyerrstatus_ == 3)
          {
            /* If just tried and failed to reuse lookahead token after an
               error, discard it.  */

            if (yychar <= Lexer.YYEOF)
              {
                /* Return failure if at end of input.  */
                if (yychar == Lexer.YYEOF)
                  return false;
              }
            else
              yychar = YYEMPTY_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `-------------------------------------------------*/
      case YYERROR:
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;       /* Each real token shifted decrements this.  */

        // Pop stack until we find a state that shifts the error token.
        for (;;)
          {
            yyn = yypact_[yystate];
            if (!yyPactValueIsDefault (yyn))
              {
                yyn += SymbolKind.S_YYerror.getCode();
                if (0 <= yyn && yyn <= YYLAST_
                    && yycheck_[yyn] == SymbolKind.S_YYerror.getCode())
                  {
                    yyn = yytable_[yyn];
                    if (0 < yyn)
                      break;
                  }
              }

            /* Pop the current state because it cannot handle the
             * error token.  */
            if (yystack.height == 0)
              return false;


            yystack.pop ();
            yystate = yystack.stateAt (0);
          }

        if (label == YYABORT)
          /* Leave the switch.  */
          break;



        /* Shift the error token.  */

        yystate = yyn;
        yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
}




  /**
   * Information needed to get the list of expected tokens and to forge
   * a syntax error diagnostic.
   */
  public static final class Context
  {
    Context (YYStack stack, SymbolKind token)
    {
      yystack = stack;
      yytoken = token;
    }

    private YYStack yystack;


    /**
     * The symbol kind of the lookahead token.
     */
    public final SymbolKind getToken ()
    {
      return yytoken;
    }

    private SymbolKind yytoken;
    static final int NTOKENS = Parser.YYNTOKENS_;

    /**
     * Put in YYARG at most YYARGN of the expected tokens given the
     * current YYCTX, and return the number of tokens stored in YYARG.  If
     * YYARG is null, return the number of expected tokens (guaranteed to
     * be less than YYNTOKENS).
     */
    int getExpectedTokens (SymbolKind yyarg[], int yyargn)
    {
      return getExpectedTokens (yyarg, 0, yyargn);
    }

    int getExpectedTokens (SymbolKind yyarg[], int yyoffset, int yyargn)
    {
      int yycount = yyoffset;
      int yyn = yypact_[this.yystack.stateAt (0)];
      if (!yyPactValueIsDefault (yyn))
        {
          /* Start YYX at -YYN if negative to avoid negative
             indexes in YYCHECK.  In other words, skip the first
             -YYN actions for this state because they are default
             actions.  */
          int yyxbegin = yyn < 0 ? -yyn : 0;
          /* Stay within bounds of both yycheck and yytname.  */
          int yychecklim = YYLAST_ - yyn + 1;
          int yyxend = yychecklim < NTOKENS ? yychecklim : NTOKENS;
          for (int yyx = yyxbegin; yyx < yyxend; ++yyx)
            if (yycheck_[yyx + yyn] == yyx && yyx != SymbolKind.S_YYerror.getCode()
                && !yyTableValueIsError(yytable_[yyx + yyn]))
              {
                if (yyarg == null)
                  yycount += 1;
                else if (yycount == yyargn)
                  return 0; // FIXME: this is incorrect.
                else
                  yyarg[yycount++] = SymbolKind.get(yyx);
              }
        }
      if (yyarg != null && yycount == yyoffset && yyoffset < yyargn)
        yyarg[yycount] = null;
      return yycount - yyoffset;
    }
  }



  /**
   * Build and emit a "syntax error" message in a user-defined way.
   *
   * @param ctx  The context of the error.
   */
  private void yyreportSyntaxError(Context yyctx) {
      yyerror("syntax error");
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yyPactValueIsDefault (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code>
   * value indicates a syntax error.
   * @param yyvalue the value to check
   */
  private static boolean yyTableValueIsError (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  private static final short yypact_ninf_ = -90;
  private static final short yytable_ninf_ = -1;

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final short[] yypact_ = yypact_init();
  private static final short[] yypact_init()
  {
    return new short[]
    {
     -90,    13,   -24,   -90,  1157,   -67,   -47,    25,   -90,   -90,
     -30,   -90,   -90,   -90,   -90,   -90,   -25,   -19,  1157,  1157,
     671,   -26,   -18,   -13,    -7,    -6,     0,     2,    12,    21,
      38,    41,    -3,  1157,  1121,   -90,  1408,   -90,    47,    48,
     646,   646,    22,   -90,   -90,    75,   -90,   671,   671,   671,
     671,   -90,   -90,    87,    88,   -90,   -90,   -90,   -90,   -90,
      89,    90,   -89,   -90,   -90,   -90,   -90,   671,   671,   671,
     -90,   770,   -90,   -90,   671,   671,   671,   671,   671,    74,
     102,   671,   671,   671,   671,   671,  1069,   -90,   -90,   671,
     671,   671,   671,   671,   671,   671,   671,   671,    93,   106,
     671,   114,   114,   -90,   -90,   107,   -90,   -90,   147,   149,
     151,   -90,   113,   115,   -29,   -90,   119,   -90,   142,   -90,
     111,   179,   120,    43,    43,   671,   671,   145,   148,   671,
     163,  1310,   -76,  1247,   -86,   671,   671,   671,   671,   671,
     671,   671,   671,   671,   671,   671,   671,   671,   671,   671,
     671,   671,   -90,   -90,   -90,   214,   599,   628,   260,   659,
     155,   156,   303,   332,   361,   392,    32,   -90,   799,   828,
     865,   894,   923,   960,   989,  1018,  1055,   -90,   -90,  1084,
     219,   -70,   -90,   -21,   166,   646,   646,   646,   167,   169,
     -90,   -90,   -90,   -90,   -90,   671,   421,   450,   -90,   -90,
     -15,   -90,   671,   -90,   671,   -90,  1368,  1368,  1368,  1368,
    1368,  1368,   120,   120,   -90,   244,  1397,  1339,   229,   229,
      43,    43,    43,   170,   671,   671,   186,   671,   -90,   -90,
     187,   188,   189,   190,   -90,   -90,   -90,   -90,   -90,   -90,
     -90,   -90,   -90,   -90,   -90,   646,   114,   254,   -72,   -90,
      45,   -90,   -90,   -90,   259,   -82,   -90,   160,   481,   -90,
     -90,   -90,  1310,   109,   255,   510,   539,   -90,   570,   -90,
     -90,   -90,   -90,   -90,   -90,   646,   -90,   -90,   -90,   646,
     -90,   -90,   -90,   198,   -90,   671,   -35,   -90,   200,   202,
     203,   -27,  1157,   205,   -90,  1279,   -90,   -90,   -90,   -90,
     -90,   -90,   -90,  1157,   201,   -90,  1157,  1157,   -90,   -90,
     204,   -90
    };
  }

/* YYDEFACT[STATE-NUM] -- Default reduction number in state STATE-NUM.
   Performed when YYTABLE does not specify something else to do.  Zero
   means the default is an error.  */
  private static final short[] yydefact_ = yydefact_init();
  private static final short[] yydefact_init()
  {
    return new short[]
    {
       3,     0,     0,     1,     0,     0,     0,    14,     4,     7,
       0,     8,     9,    10,    11,    12,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,    69,     0,     0,     5,     0,    58,     0,     0,
       0,     0,     0,    62,    63,     0,    61,     0,     0,     0,
       0,   105,   104,     0,     0,   120,   121,   122,   123,   124,
       0,     0,    69,   107,   106,   108,   109,     0,     0,     0,
      72,     0,    71,   101,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     2,     6,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,    27,    38,     0,    45,    43,     0,     0,
       0,    41,     0,     0,     0,    39,     0,    28,     0,    15,
       0,    99,    82,    85,    86,     0,     0,     0,     0,     0,
       0,   102,     0,   102,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,    83,    84,    64,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,    65,     0,     0,
       0,     0,     0,     0,     0,     0,     0,    46,    47,     0,
       0,     0,    23,     0,     0,     0,     0,     0,     0,     0,
      40,    44,    42,    16,    13,     0,     0,     0,   127,   128,
       0,   100,     0,    75,     0,    74,    87,    88,    89,    90,
      91,    92,    93,    94,    95,    96,    97,    98,    77,    79,
      78,    80,    81,     0,     0,     0,     0,     0,   114,   115,
       0,     0,     0,     0,    70,    49,    50,    51,    52,    53,
      54,    55,    56,    57,    48,     0,     0,     0,     0,    14,
       0,    32,    30,    31,     0,     0,    35,     0,     0,   125,
     126,    73,   103,     0,     0,     0,     0,   112,     0,   116,
     117,   119,   118,    25,    24,     0,    18,    21,    33,     0,
      34,    36,    29,     0,    76,     0,     0,    66,     0,     0,
       0,     0,     0,     0,    60,     0,    59,    67,   110,   111,
     113,    17,    19,    26,     0,    37,     0,     0,    22,    68,
       0,    20
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final short[] yypgoto_ = yypgoto_init();
  private static final short[] yypgoto_init()
  {
    return new short[]
    {
     -90,   -90,   -90,     1,   -90,   -90,   121,   -90,   -90,   -90,
     -90,   -90,   -90,   -90,   222,    79,    19,   -22,   -90,    72,
     -90,   -17,   -90,    42,    -4,    11,   -62,   -90,   -90,   -90
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final short[] yydefgoto_ = yydefgoto_init();
  private static final short[] yydefgoto_init()
  {
    return new short[]
    {
       0,     1,     2,   303,     8,     9,    10,    11,    12,    13,
      14,   307,    15,   292,   181,   182,   304,   116,   255,   256,
     117,    35,   286,   287,    70,   131,   132,    72,    37,    73
    };
  }

/* YYTABLE[YYPACT[STATE-NUM]] -- What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule whose
   number is the opposite.  If YYTABLE_NINF, syntax error.  */
  private static final short[] yytable_ = yytable_init();
  private static final short[] yytable_init()
  {
    return new short[]
    {
      36,    45,    46,    41,   285,    34,   254,   134,   129,   190,
     202,     4,    85,     3,    36,    36,   205,    88,   280,   118,
     202,    38,   191,   276,   203,     5,   246,   277,   247,    36,
      36,    71,   192,     6,    86,   135,   136,   137,   138,   139,
     140,    39,   141,   142,   143,   144,   145,   146,   147,   148,
     149,   150,   151,   141,   142,   143,   144,    40,   121,   122,
     123,   124,   152,   153,     7,   296,    42,   200,   301,    88,
      43,    74,   302,   152,   153,   246,    44,   248,   130,    75,
     133,   202,    36,   261,    76,   155,   156,   157,   158,   159,
      77,    78,   162,   163,   164,   165,   166,    79,    85,    80,
     168,   169,   170,   171,   172,   173,   174,   175,   176,    81,
     119,   179,   135,   136,   137,   138,   139,   140,    82,   141,
     142,   143,   144,   145,   146,   147,   148,   149,   150,   151,
     141,   142,   143,   144,   234,    83,   196,   197,    84,   152,
     153,    42,   120,   278,   101,   102,   206,   207,   208,   209,
     210,   211,   212,   213,   214,   215,   216,   217,   218,   219,
     220,   221,   222,   251,   252,   253,   135,   136,   137,   138,
     139,   140,   160,   141,   142,   143,   144,   145,   146,   147,
     148,   149,   150,   151,   125,   126,   127,   128,   177,   141,
     142,   143,   144,   152,   153,   147,   148,   149,   150,   151,
     161,   178,   180,   185,   184,   186,   258,   187,   195,   152,
     153,   284,   188,   262,   193,   263,   189,   135,   136,   137,
     138,   139,   140,   273,   141,   142,   143,   144,   145,   146,
     147,   148,   149,   150,   151,   265,   266,   194,   268,   141,
     142,   143,   144,   198,   152,   153,   199,   149,   150,   151,
     228,   229,   245,   291,   249,   254,   143,   293,   257,   152,
     153,   201,   282,   135,   136,   137,   138,   139,   140,   264,
     141,   142,   143,   144,   145,   146,   147,   148,   149,   150,
     151,   267,   269,   270,   271,   272,    88,   275,    36,   309,
     152,   153,   279,   294,   285,   298,   295,   299,   300,    36,
     305,   308,    36,    36,   311,   250,   135,   136,   137,   138,
     139,   140,   223,   141,   142,   143,   144,   145,   146,   147,
     148,   149,   150,   151,   183,   274,   310,   281,   297,     0,
       0,     0,     0,   152,   153,   135,   136,   137,   138,   139,
     140,     0,   141,   142,   143,   144,   145,   146,   147,   148,
     149,   150,   151,     0,     0,     0,     0,     0,   226,     0,
       0,     0,   152,   153,   135,   136,   137,   138,   139,   140,
       0,   141,   142,   143,   144,   145,   146,   147,   148,   149,
     150,   151,     0,     0,     0,     0,     0,     0,     0,     0,
       0,   152,   153,     0,     0,   135,   136,   137,   138,   139,
     140,   230,   141,   142,   143,   144,   145,   146,   147,   148,
     149,   150,   151,     0,     0,     0,     0,     0,     0,     0,
       0,     0,   152,   153,   135,   136,   137,   138,   139,   140,
     231,   141,   142,   143,   144,   145,   146,   147,   148,   149,
     150,   151,     0,     0,     0,     0,     0,     0,     0,     0,
       0,   152,   153,   135,   136,   137,   138,   139,   140,   232,
     141,   142,   143,   144,   145,   146,   147,   148,   149,   150,
     151,     0,     0,     0,     0,     0,     0,     0,     0,     0,
     152,   153,     0,     0,   135,   136,   137,   138,   139,   140,
     233,   141,   142,   143,   144,   145,   146,   147,   148,   149,
     150,   151,     0,     0,     0,     0,     0,     0,     0,     0,
       0,   152,   153,   135,   136,   137,   138,   139,   140,   259,
     141,   142,   143,   144,   145,   146,   147,   148,   149,   150,
     151,     0,     0,     0,     0,     0,     0,     0,     0,     0,
     152,   153,   135,   136,   137,   138,   139,   140,   260,   141,
     142,   143,   144,   145,   146,   147,   148,   149,   150,   151,
       0,     0,     0,     0,     0,     0,     0,     0,     0,   152,
     153,     0,     0,   135,   136,   137,   138,   139,   140,   283,
     141,   142,   143,   144,   145,   146,   147,   148,   149,   150,
     151,     0,     0,     0,     0,     0,     0,     0,     0,     0,
     152,   153,   135,   136,   137,   138,   139,   140,   288,   141,
     142,   143,   144,   145,   146,   147,   148,   149,   150,   151,
       0,     0,     0,     0,     0,     0,     0,     0,     0,   152,
     153,   135,   136,   137,   138,   139,   140,   289,   141,   142,
     143,   144,   145,   146,   147,   148,   149,   150,   151,     0,
       0,     0,     0,     0,     0,     0,     0,     0,   152,   153,
       0,     0,   135,   136,   137,   138,   139,   140,   290,   141,
     142,   143,   144,   145,   146,   147,   148,   149,   150,   151,
      47,     0,   103,     0,   104,     0,     0,     0,    48,   152,
     153,   105,     0,   106,     0,   224,     0,   107,     0,   108,
       0,    49,    50,     0,   109,     0,   110,   111,   112,   113,
       0,     0,   114,     0,     0,     0,     0,    51,     0,     0,
       0,     0,     0,     0,   225,   115,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,    52,     0,     0,     0,
       0,     0,     0,    53,    54,    55,    56,    57,    58,    59,
       0,    60,    61,     0,     0,   227,     0,     0,     0,    62,
      63,    64,    65,    66,     0,     0,     0,     0,    67,     0,
      68,     0,    69,   135,   136,   137,   138,   139,   140,     0,
     141,   142,   143,   144,   145,   146,   147,   148,   149,   150,
     151,     0,     0,     0,     0,     0,     0,     0,     0,     0,
     152,   153,   135,   136,   137,   138,   139,   140,     0,   141,
     142,   143,   144,   145,   146,   147,   148,   149,   150,   151,
       0,     0,     0,     0,     0,     0,     0,     0,     0,   152,
     153,   135,   136,   137,   138,   139,   140,     0,   141,   142,
     143,   144,   145,   146,   147,   148,   149,   150,   151,     0,
       0,     0,     0,     0,     0,     0,     0,     0,   152,   153,
       0,     0,     0,     0,     0,   154,     0,     0,   135,   136,
     137,   138,   139,   140,     0,   141,   142,   143,   144,   145,
     146,   147,   148,   149,   150,   151,     0,     0,     0,     0,
       0,     0,     0,     0,   235,   152,   153,   135,   136,   137,
     138,   139,   140,     0,   141,   142,   143,   144,   145,   146,
     147,   148,   149,   150,   151,     0,     0,     0,     0,     0,
       0,     0,     0,   236,   152,   153,   135,   136,   137,   138,
     139,   140,     0,   141,   142,   143,   144,   145,   146,   147,
     148,   149,   150,   151,     0,     0,     0,     0,     0,     0,
       0,     0,     0,   152,   153,     0,     0,     0,     0,     0,
     237,     0,     0,   135,   136,   137,   138,   139,   140,     0,
     141,   142,   143,   144,   145,   146,   147,   148,   149,   150,
     151,     0,     0,     0,     0,     0,     0,     0,     0,   238,
     152,   153,   135,   136,   137,   138,   139,   140,     0,   141,
     142,   143,   144,   145,   146,   147,   148,   149,   150,   151,
       0,     0,     0,     0,     0,     0,     0,     0,   239,   152,
     153,   135,   136,   137,   138,   139,   140,     0,   141,   142,
     143,   144,   145,   146,   147,   148,   149,   150,   151,     0,
       0,     0,     0,     0,     0,     0,     0,     0,   152,   153,
       0,     0,     0,     0,     0,   240,     0,     0,   135,   136,
     137,   138,   139,   140,     0,   141,   142,   143,   144,   145,
     146,   147,   148,   149,   150,   151,     0,     0,     0,     0,
       0,     0,     0,     0,   241,   152,   153,   135,   136,   137,
     138,   139,   140,     0,   141,   142,   143,   144,   145,   146,
     147,   148,   149,   150,   151,     0,    16,     0,     0,    17,
      18,     0,     0,   242,   152,   153,     0,     0,     0,     0,
       0,     0,     0,     0,    19,     0,     0,     0,    20,     0,
       0,     0,     0,    21,     0,     0,     0,    22,    23,    24,
      25,     0,     0,     0,     0,     0,     0,     0,     0,     0,
     243,    26,    27,    28,    29,    30,    31,    32,    16,     0,
       0,    17,    18,     0,     0,    87,     0,     0,    33,   167,
       0,     0,     0,     0,     0,     0,    19,     0,     0,   244,
      20,     0,     0,     0,     0,    21,     0,     0,     0,    22,
      23,    24,    25,     0,    16,     0,     0,    17,    18,     0,
       0,     0,     0,    26,    27,    28,    29,    30,    31,    32,
       0,     0,    19,     0,     0,     0,    20,     0,     0,     0,
      33,    21,     0,     0,     0,    22,    23,    24,    25,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,    26,
      27,    28,    29,    30,    31,    32,     0,     0,     0,     0,
     135,   136,   137,   138,   139,   140,    33,   141,   142,   143,
     144,   145,   146,   147,   148,   149,   150,   151,     0,     0,
       0,     0,     0,     0,     0,     0,     0,   152,   153,     0,
       0,   204,   135,   136,   137,   138,   139,   140,     0,   141,
     142,   143,   144,   145,   146,   147,   148,   149,   150,   151,
       0,     0,     0,     0,     0,     0,     0,     0,     0,   152,
     153,     0,   306,   135,   136,   137,   138,   139,   140,     0,
     141,   142,   143,   144,   145,   146,   147,   148,   149,   150,
     151,     0,     0,     0,     0,     0,     0,     0,     0,     0,
     152,   153,   135,   136,   137,   138,   139,   140,     0,   141,
     142,   143,   144,   145,     0,   147,   148,   149,   150,   151,
       0,     0,     0,     0,     0,     0,     0,     0,     0,   152,
     153,    -1,    -1,    -1,    -1,    -1,    -1,     0,   141,   142,
     143,   144,     0,     0,   147,   148,   149,   150,   151,     0,
       0,     0,     0,     0,     0,     0,     0,     0,   152,   153,
     135,   136,   137,   138,   139,   140,     0,   141,   142,   143,
     144,     0,     0,   147,   148,   149,   150,   151,     0,     0,
       0,     0,     0,     0,     0,     0,     0,   152,   153,    89,
      90,    91,    92,    93,    94,    95,    96,    97,    98,    99,
     100
    };
  }

private static final short[] yycheck_ = yycheck_init();
  private static final short[] yycheck_init()
  {
    return new short[]
    {
       4,    18,    19,    33,    39,     4,    88,    69,    97,    38,
      96,    35,   101,     0,    18,    19,   102,    34,   100,    41,
      96,    88,    51,    95,   100,    49,    96,    99,    98,    33,
      34,    20,    61,    57,    33,     3,     4,     5,     6,     7,
       8,    88,    10,    11,    12,    13,    14,    15,    16,    17,
      18,    19,    20,    10,    11,    12,    13,    32,    47,    48,
      49,    50,    30,    31,    88,   100,    96,   129,    95,    86,
      95,    97,    99,    30,    31,    96,    95,    98,    67,    97,
      69,    96,    86,    98,    97,    74,    75,    76,    77,    78,
      97,    97,    81,    82,    83,    84,    85,    97,   101,    97,
      89,    90,    91,    92,    93,    94,    95,    96,    97,    97,
      88,   100,     3,     4,     5,     6,     7,     8,    97,    10,
      11,    12,    13,    14,    15,    16,    17,    18,    19,    20,
      10,    11,    12,    13,   102,    97,   125,   126,    97,    30,
      31,    96,    67,    98,    97,    97,   135,   136,   137,   138,
     139,   140,   141,   142,   143,   144,   145,   146,   147,   148,
     149,   150,   151,   185,   186,   187,     3,     4,     5,     6,
       7,     8,    98,    10,    11,    12,    13,    14,    15,    16,
      17,    18,    19,    20,    97,    97,    97,    97,    95,    10,
      11,    12,    13,    30,    31,    16,    17,    18,    19,    20,
      98,    95,    88,    56,    97,    56,   195,    56,    97,    30,
      31,   102,    99,   202,    95,   204,   101,     3,     4,     5,
       6,     7,     8,   245,    10,    11,    12,    13,    14,    15,
      16,    17,    18,    19,    20,   224,   225,    95,   227,    10,
      11,    12,    13,    98,    30,    31,    98,    18,    19,    20,
      95,    95,    33,   275,    88,    88,    12,   279,    89,    30,
      31,    98,   102,     3,     4,     5,     6,     7,     8,    99,
      10,    11,    12,    13,    14,    15,    16,    17,    18,    19,
      20,    95,    95,    95,    95,    95,   303,    33,   292,   306,
      30,    31,    33,    95,    39,    95,   285,    95,    95,   303,
      95,   100,   306,   307,   100,   184,     3,     4,     5,     6,
       7,     8,    98,    10,    11,    12,    13,    14,    15,    16,
      17,    18,    19,    20,   102,   246,   307,   255,   286,    -1,
      -1,    -1,    -1,    30,    31,     3,     4,     5,     6,     7,
       8,    -1,    10,    11,    12,    13,    14,    15,    16,    17,
      18,    19,    20,    -1,    -1,    -1,    -1,    -1,    98,    -1,
      -1,    -1,    30,    31,     3,     4,     5,     6,     7,     8,
      -1,    10,    11,    12,    13,    14,    15,    16,    17,    18,
      19,    20,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    30,    31,    -1,    -1,     3,     4,     5,     6,     7,
       8,    98,    10,    11,    12,    13,    14,    15,    16,    17,
      18,    19,    20,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    30,    31,     3,     4,     5,     6,     7,     8,
      98,    10,    11,    12,    13,    14,    15,    16,    17,    18,
      19,    20,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    30,    31,     3,     4,     5,     6,     7,     8,    98,
      10,    11,    12,    13,    14,    15,    16,    17,    18,    19,
      20,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      30,    31,    -1,    -1,     3,     4,     5,     6,     7,     8,
      98,    10,    11,    12,    13,    14,    15,    16,    17,    18,
      19,    20,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    30,    31,     3,     4,     5,     6,     7,     8,    98,
      10,    11,    12,    13,    14,    15,    16,    17,    18,    19,
      20,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      30,    31,     3,     4,     5,     6,     7,     8,    98,    10,
      11,    12,    13,    14,    15,    16,    17,    18,    19,    20,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    30,
      31,    -1,    -1,     3,     4,     5,     6,     7,     8,    98,
      10,    11,    12,    13,    14,    15,    16,    17,    18,    19,
      20,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      30,    31,     3,     4,     5,     6,     7,     8,    98,    10,
      11,    12,    13,    14,    15,    16,    17,    18,    19,    20,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    30,
      31,     3,     4,     5,     6,     7,     8,    98,    10,    11,
      12,    13,    14,    15,    16,    17,    18,    19,    20,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    30,    31,
      -1,    -1,     3,     4,     5,     6,     7,     8,    98,    10,
      11,    12,    13,    14,    15,    16,    17,    18,    19,    20,
       9,    -1,    36,    -1,    38,    -1,    -1,    -1,    17,    30,
      31,    45,    -1,    47,    -1,    96,    -1,    51,    -1,    53,
      -1,    30,    31,    -1,    58,    -1,    60,    61,    62,    63,
      -1,    -1,    66,    -1,    -1,    -1,    -1,    46,    -1,    -1,
      -1,    -1,    -1,    -1,    96,    79,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    65,    -1,    -1,    -1,
      -1,    -1,    -1,    72,    73,    74,    75,    76,    77,    78,
      -1,    80,    81,    -1,    -1,    96,    -1,    -1,    -1,    88,
      89,    90,    91,    92,    -1,    -1,    -1,    -1,    97,    -1,
      99,    -1,   101,     3,     4,     5,     6,     7,     8,    -1,
      10,    11,    12,    13,    14,    15,    16,    17,    18,    19,
      20,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      30,    31,     3,     4,     5,     6,     7,     8,    -1,    10,
      11,    12,    13,    14,    15,    16,    17,    18,    19,    20,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    30,
      31,     3,     4,     5,     6,     7,     8,    -1,    10,    11,
      12,    13,    14,    15,    16,    17,    18,    19,    20,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    30,    31,
      -1,    -1,    -1,    -1,    -1,    95,    -1,    -1,     3,     4,
       5,     6,     7,     8,    -1,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    95,    30,    31,     3,     4,     5,
       6,     7,     8,    -1,    10,    11,    12,    13,    14,    15,
      16,    17,    18,    19,    20,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    95,    30,    31,     3,     4,     5,     6,
       7,     8,    -1,    10,    11,    12,    13,    14,    15,    16,
      17,    18,    19,    20,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    30,    31,    -1,    -1,    -1,    -1,    -1,
      95,    -1,    -1,     3,     4,     5,     6,     7,     8,    -1,
      10,    11,    12,    13,    14,    15,    16,    17,    18,    19,
      20,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    95,
      30,    31,     3,     4,     5,     6,     7,     8,    -1,    10,
      11,    12,    13,    14,    15,    16,    17,    18,    19,    20,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    95,    30,
      31,     3,     4,     5,     6,     7,     8,    -1,    10,    11,
      12,    13,    14,    15,    16,    17,    18,    19,    20,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    30,    31,
      -1,    -1,    -1,    -1,    -1,    95,    -1,    -1,     3,     4,
       5,     6,     7,     8,    -1,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    95,    30,    31,     3,     4,     5,
       6,     7,     8,    -1,    10,    11,    12,    13,    14,    15,
      16,    17,    18,    19,    20,    -1,    37,    -1,    -1,    40,
      41,    -1,    -1,    95,    30,    31,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    55,    -1,    -1,    -1,    59,    -1,
      -1,    -1,    -1,    64,    -1,    -1,    -1,    68,    69,    70,
      71,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      95,    82,    83,    84,    85,    86,    87,    88,    37,    -1,
      -1,    40,    41,    -1,    -1,    44,    -1,    -1,    99,   100,
      -1,    -1,    -1,    -1,    -1,    -1,    55,    -1,    -1,    95,
      59,    -1,    -1,    -1,    -1,    64,    -1,    -1,    -1,    68,
      69,    70,    71,    -1,    37,    -1,    -1,    40,    41,    -1,
      -1,    -1,    -1,    82,    83,    84,    85,    86,    87,    88,
      -1,    -1,    55,    -1,    -1,    -1,    59,    -1,    -1,    -1,
      99,    64,    -1,    -1,    -1,    68,    69,    70,    71,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    82,
      83,    84,    85,    86,    87,    88,    -1,    -1,    -1,    -1,
       3,     4,     5,     6,     7,     8,    99,    10,    11,    12,
      13,    14,    15,    16,    17,    18,    19,    20,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    30,    31,    -1,
      -1,    34,     3,     4,     5,     6,     7,     8,    -1,    10,
      11,    12,    13,    14,    15,    16,    17,    18,    19,    20,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    30,
      31,    -1,    33,     3,     4,     5,     6,     7,     8,    -1,
      10,    11,    12,    13,    14,    15,    16,    17,    18,    19,
      20,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      30,    31,     3,     4,     5,     6,     7,     8,    -1,    10,
      11,    12,    13,    14,    -1,    16,    17,    18,    19,    20,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    30,
      31,     3,     4,     5,     6,     7,     8,    -1,    10,    11,
      12,    13,    -1,    -1,    16,    17,    18,    19,    20,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    30,    31,
       3,     4,     5,     6,     7,     8,    -1,    10,    11,    12,
      13,    -1,    -1,    16,    17,    18,    19,    20,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    30,    31,    21,
      22,    23,    24,    25,    26,    27,    28,    29,    30,    31,
      32
    };
  }

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
  private static final short[] yystos_ = yystos_init();
  private static final short[] yystos_init()
  {
    return new short[]
    {
       0,   104,   105,     0,    35,    49,    57,    88,   107,   108,
     109,   110,   111,   112,   113,   115,    37,    40,    41,    55,
      59,    64,    68,    69,    70,    71,    82,    83,    84,    85,
      86,    87,    88,    99,   106,   124,   127,   131,    88,    88,
      32,    33,    96,    95,    95,   124,   124,     9,    17,    30,
      31,    46,    65,    72,    73,    74,    75,    76,    77,    78,
      80,    81,    88,    89,    90,    91,    92,    97,    99,   101,
     127,   128,   130,   132,    97,    97,    97,    97,    97,    97,
      97,    97,    97,    97,    97,   101,   106,    44,   124,    21,
      22,    23,    24,    25,    26,    27,    28,    29,    30,    31,
      32,    97,    97,    36,    38,    45,    47,    51,    53,    58,
      60,    61,    62,    63,    66,    79,   120,   123,   120,    88,
      67,   128,   128,   128,   128,    97,    97,    97,    97,    97,
     128,   128,   129,   128,   129,     3,     4,     5,     6,     7,
       8,    10,    11,    12,    13,    14,    15,    16,    17,    18,
      19,    20,    30,    31,    95,   128,   128,   128,   128,   128,
      98,    98,   128,   128,   128,   128,   128,   100,   128,   128,
     128,   128,   128,   128,   128,   128,   128,    95,    95,   128,
      88,   117,   118,   117,    97,    56,    56,    56,    99,   101,
      38,    51,    61,    95,    95,    97,   128,   128,    98,    98,
     129,    98,    96,   100,    34,   102,   128,   128,   128,   128,
     128,   128,   128,   128,   128,   128,   128,   128,   128,   128,
     128,   128,   128,    98,    96,    96,    98,    96,    95,    95,
      98,    98,    98,    98,   102,    95,    95,    95,    95,    95,
      95,    95,    95,    95,    95,    33,    96,    98,    98,    88,
     109,   120,   120,   120,    88,   121,   122,    89,   128,    98,
      98,    98,   128,   128,    99,   128,   128,    95,   128,    95,
      95,    95,    95,   120,   118,    33,    95,    99,    98,    33,
     100,   122,   102,    98,   102,    39,   125,   126,    98,    98,
      98,   120,   116,   120,    95,   128,   100,   126,    95,    95,
      95,    95,    99,   106,   119,    95,    33,   114,   100,   124,
     119,   100
    };
  }

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final short[] yyr1_ = yyr1_init();
  private static final short[] yyr1_init()
  {
    return new short[]
    {
       0,   103,   104,   105,   105,   106,   106,   107,   107,   107,
     107,   107,   107,   108,   109,   109,   110,   111,   112,   114,
     113,   116,   115,   117,   117,   118,   119,   120,   120,   120,
     120,   120,   120,   120,   120,   121,   121,   122,   123,   123,
     123,   123,   123,   123,   123,   123,   124,   124,   124,   124,
     124,   124,   124,   124,   124,   124,   124,   124,   124,   124,
     124,   124,   124,   124,   124,   124,   125,   125,   126,   127,
     127,   128,   128,   128,   128,   128,   128,   128,   128,   128,
     128,   128,   128,   128,   128,   128,   128,   128,   128,   128,
     128,   128,   128,   128,   128,   128,   128,   128,   128,   128,
     128,   128,   129,   129,   130,   130,   130,   130,   130,   130,
     131,   131,   131,   131,   131,   131,   131,   131,   131,   131,
     132,   132,   132,   132,   132,   132,   132,   132,   132
    };
  }

/* YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.  */
  private static final byte[] yyr2_ = yyr2_init();
  private static final byte[] yyr2_init()
  {
    return new byte[]
    {
       0,     2,     4,     0,     2,     1,     2,     1,     1,     1,
       1,     1,     1,     4,     1,     3,     4,     8,     6,     0,
      11,     0,     9,     1,     3,     3,     1,     1,     1,     4,
       3,     3,     3,     4,     4,     1,     2,     4,     1,     1,
       2,     1,     2,     1,     2,     1,     3,     3,     4,     4,
       4,     4,     4,     4,     4,     4,     4,     4,     1,     7,
       7,     2,     2,     2,     3,     3,     1,     2,     4,     1,
       4,     1,     1,     4,     3,     3,     5,     3,     3,     3,
       3,     3,     2,     2,     2,     2,     2,     3,     3,     3,
       3,     3,     3,     3,     3,     3,     3,     3,     3,     2,
       3,     1,     1,     3,     1,     1,     1,     1,     1,     1,
       7,     7,     5,     7,     4,     4,     5,     5,     5,     5,
       1,     1,     1,     1,     1,     4,     4,     3,     3
    };
  }




  /* YYTRANSLATE_(TOKEN-NUM) -- Symbol number corresponding to TOKEN-NUM
     as returned by yylex, with out-of-bounds checking.  */
  private static final SymbolKind yytranslate_(int t)
  {
    // Last valid token kind.
    int code_max = 337;
    if (t <= 0)
      return SymbolKind.S_YYEOF;
    else if (t <= code_max)
      return SymbolKind.get(yytranslate_table_[t]);
    else
      return SymbolKind.S_YYUNDEF;
  }
  private static final byte[] yytranslate_table_ = yytranslate_table_init();
  private static final byte[] yytranslate_table_init()
  {
    return new byte[]
    {
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     9,     2,     2,     2,    20,    12,     2,
      97,    98,    18,    16,    96,    17,     2,    19,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,    33,    95,
       3,    32,     5,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,   101,     2,   102,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,    99,    13,   100,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     4,     6,
       7,     8,    10,    11,    14,    15,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    34,    35,    36,
      37,    38,    39,    40,    41,    42,    43,    44,    45,    46,
      47,    48,    49,    50,    51,    52,    53,    54,    55,    56,
      57,    58,    59,    60,    61,    62,    63,    64,    65,    66,
      67,    68,    69,    70,    71,    72,    73,    74,    75,    76,
      77,    78,    79,    80,    81,    82,    83,    84,    85,    86,
      87,    88,    89,    90,    91,    92,    93,    94
    };
  }


  private static final int YYLAST_ = 1440;
  private static final int YYEMPTY_ = -2;
  private static final int YYFINAL_ = 3;
  private static final int YYNTOKENS_ = 103;

/* Unqualified %code blocks.  */
/* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":25  */


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


/* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/src/fr/ubordeaux/arduinoCode/Parser.java":3095  */

}
/* "/mnt/c/Users/Girau/Desktop/aStudies/compil-group-7/parser/Parser.y":886  */

