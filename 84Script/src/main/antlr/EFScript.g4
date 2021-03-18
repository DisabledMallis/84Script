grammar EFScript;

@header {
package com.EFScript.Antlr;
} 


script
	: function*
	| statement*
	| EOF
	;

function
	: DEF identifier OPEN_BRACKET identifier* (',' identifier)* CLOSE_BRACKET statement
	;

statement
	: OPEN_CURLEY statement CLOSE_CURLEY
	| assign_stmt
	| add_assign_stmt
	| sub_assign_stmt
	| mul_assign_stmt
	| div_assign_stmt
	| inc_stmt
	| dec_stmt
	| if_stmt
	| while_stmt
	| var_stmt
	| return_stmt
	| expression END_STMT
	| END_STMT
	;

assign_stmt
	: identifier ASSIGN expression END_STMT
	;
add_assign_stmt
	: identifier ADDASSIGN value END_STMT
	;
sub_assign_stmt
	: identifier SUBASSIGN value END_STMT
	;
mul_assign_stmt
	: identifier MULASSIGN value END_STMT
	;
div_assign_stmt
	: identifier DIVASSIGN value END_STMT
	;
inc_stmt
	: identifier INCREMENT END_STMT
	;
dec_stmt
	: identifier DECREMENT END_STMT
	;
if_stmt
	: IF OPEN_BRACKET boolexpr CLOSE_BRACKET statement
	;
while_stmt
	: WHILE OPEN_BRACKET boolexpr CLOSE_BRACKET statement
	;
var_stmt
	: VAR identifier ASSIGN expression END_STMT
	;
return_stmt
	: RETURN expression END_STMT
	;
//TI-Basic statement, inspired by the C++ __asm statement
basic_stmt
	: BASIC_STMT_KEYWORD
	| OPEN_CURLEY
	| (TI_TOKEN)*
	| CLOSE_CURLEY
	;

//Expression
expression 
	: OPEN_BRACKET expression CLOSE_BRACKET
	| value ADD value
	| value SUB value
	| value MUL value
	| value DIV value
	| identifier
	| NUMBER
	| QUOTED_TEXT
	| methodcall
	;

//Boolean expression
boolexpr
	: identifier
	| TRUE
	| FALSE
	| identifier GREATER_THAN expression
	| identifier LESS_THAN expression
	| identifier EQUAL_TO expression
	| identifier NOT_EQUAL_TO expression
	;



methodcall
	: identifier OPEN_BRACKET methodparams CLOSE_BRACKET
	;

methodparams
	: expression (',' expression)*
	;

//Syntax operators
OPEN_BRACKET : '(';
CLOSE_BRACKET : ')';
OPEN_CURLEY : '{';
CLOSE_CURLEY : '}';
END_STMT : ';';

//Mathematic operators
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';

//Boolean operators
GREATER_THAN : '>';
LESS_THAN : '<';
EQUAL_TO : '==';
NOT_EQUAL_TO : '!=';

//Assignment operators
ASSIGN : '=';
ADDASSIGN : '+=';
SUBASSIGN : '-=';
MULASSIGN : '*=';
DIVASSIGN : '/=';

//Incremental operators
INCREMENT : '++';
DECREMENT : '--';

//EFScript keywords
ALIAS : 'alias'; //Used to create an alias for a TI-Basic variable token
BASIC_STMT_KEYWORD : '__tibasic';
//TI-Basic tokens
TI_TOKEN
	: '->'
	| 'Disp'
	| 'Output'
	| OPEN_BRACKET
	| CLOSE_BRACKET
	| OPEN_CURLEY
	| CLOSE_CURLEY
	| IDENTIFIER
	| IF
	| WHILE
	| NUMBER
	;


//Basic keywords & concepts
DEF : 'def';
VAR : 'var';
IF : 'if';
WHILE : 'while';
RETURN : 'return';
TRUE : 'true';
FALSE : 'false';


value
	: identifier
	| NUMBER
	;

identifier
	: IDENTIFIER
	;

IDENTIFIER : [a-zA-Z][a-zA-Z0-9_]*;
NUMBER
   : '-'? INT ('.' [0-9] +)?
   | PI
   | E
   ;

//Mathematic constants
PI : 'pi';
E : 'e';

fragment INT
   : '0' | [1-9] [0-9]*
   ;
QUOTED_TEXT : '"' TEXT '"';
TEXT : ~ ["\r\n]*;

//Stuff we wanna ignore
LINECOMMENT : '//' ~[\r\n]* -> skip;
BLOCKCOMMENT : '/*' .*? '*/' -> skip;
WHITESPACE: [ \t\r\n] -> skip;