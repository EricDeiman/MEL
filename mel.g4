/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
 /*
  *  Should there be a way to dynamically create arrays?
  *  Should there be a way to dynamically create variables?
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