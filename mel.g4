/*
  The MEL programming language
  Copyright 2015 Eric J. Deiman

  This file is part of the MEL programming language.
  The MEL programming language is free software: you can redistribute it
  and/ormodify it under the terms of the GNU General Public License as published by the
  Free Software Foundation, either version 3 of the License, or (at your option) any
  later version.

  The MEL programming language is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
  FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
  You should have received a copy of the GNU General Public License along with the
  MEL programming language. If not, see <https://www.gnu.org/licenses/>
*/


grammar mel;

compUnit : funcDecl* mainDecl EOF ;

funcDecl : 'fn' ID '(' formals ')' ':' type 
                statement*
           'end' ;

mainDecl : 'fn' 'main' '(' ID ':' 'array' '[' ']' 'of' 'string' ')' ':' 'integer' 
                statement*
           'end' ;

formals : (idType (',' idType)* )? ;
            
idType : ID ':' type ;

type : simpleType   #SimpleTypeDecl
     | ARRAY '[' expression? ']' OF type #ArrayType
     ;

simpleType : STRING     #StringType
           | INTEGER    #IntegerType
           | BOOLEAN    #BooleanType
           ;

statement : 'var' idType ( '<-' expression )? ';' #VarStmnt
          | 'if' expression 'then' statement* 
            ('else' statement*)? 
            'end' #IfStmnt
          | 'while' expression 'then' statement* 'end' #WhileStmnt
          | 'print' '(' expression ')' ';' #PrintStmnt
          | ID '[' expression ']' '<-' expression ';' #ArrayAssign
          | ID '<-' expression ';' #AssignStmnt
          | expression ';' #ExpressionStmnt
          | 'return' (expression)? ';' #ReturnStmnt
          | 'break' ';' #BreakStmnt
          | 'continue' ';' #ContinueStmnt
          ;

expression : '!' expression #NotExp
           | ID '(' exps ')' #FuncCall
           | ID '[' expression ']' #ArrayLookup
           | expression '*' expression  #Multiplicative
           | expression op=('+' | '-') expression  #Additive
           | expression op=('=' | '!=') expression #BoolEq
           | expression op=('<' | '<=' | '>' | '>=') expression  #BoolRel
           | expression '&&' expression  #BoolAnd
           | expression '||' expression  #BoolOr
           | INTLIT  #Integer
           | 'true'  #True
           | 'false'  #False
//           | ID '.' 'length' #Length 
           | ID  #Ident
           | STRINGLIT #StringLit
           | '(' expression ')'  #NestExp
           ;

exps : ( expression ( ',' expression )* )? ;

MAIN : 'main' ;
FN : 'fn' ;
END : 'end' ;
IF : 'if' ;
THEN : 'then' ;
ELSE : 'else' ;
TRUE : 'true' ;
FALSE : 'false' ;
STRING : 'string' ;
INTEGER : 'integer' ;
BOOLEAN : 'boolean' ;
PRINT : 'print' ;
LENGTH : 'length' ;
RETURN : 'return' ;
VAR : 'var' ;
WHILE : 'while' ;
ARRAY : 'array' ;
OF : 'of' ;
BREAK : 'break' ;
CONTINUE : 'continue' ;

LB : '{' ; RB : '}' ;
LP : '(' ; RP : ')' ;
LS : '[' ; RS : ']' ;
SEMI : ';' ;
COLON : ':' ;
COMMA : ',' ;
EQ : '=' ;
ASSIGN : '<-' ;
NEQ : '!=' ;
TIMES : '*' ;
PLUS : '+' ;
MINUS : '-' ;
DOT : '.' ;
BANG : '!' ;
LT : '<' ; LTE : '<=' ; GT : '>' ; GTE : '>=' ;
AND : '&&' ;
OR : '||' ;

INTLIT : '0' | [1-9][0-9]* ;
ID : [a-zA-Z_] [a-zA-Z0-9_]* ;
STRINGLIT : '"' (ESC | . )*? '"' ;
fragment
    ESC : '\\"' | '\\\\' ; // 2-char sequence \" and \\

WS : [ \n\r\t\u000C] -> skip ;
CEOL : '#' .*? '\r'? '\n' -> skip ;  // Comment to end of line