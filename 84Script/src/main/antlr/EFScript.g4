grammar EFScript;

@header {
package com.efscript.antlr;
} 


script
	: function*
	| statement*
	| EOF
	;

function
	: 'def' identifier OPEN_BRACKET func_params CLOSE_BRACKET statement
	;
func_params
	: identifier* (',' identifier)*
	;

statement
	: OPEN_CURLEY (statement)* CLOSE_CURLEY
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

//Expression
expression
	: OPEN_BRACKET expression CLOSE_BRACKET
	| expression ADD expression
	| expression SUB expression
	| expression MUL expression
	| expression DIV expression
	| value
	| boolexpr
	| QUOTED_TEXT
	| methodcall
	;

//Boolean expression
boolexpr
	: value
	| TRUE
	| FALSE
	| value GREATER_THAN boolexpr
	| value LESS_THAN boolexpr
	| value EQUAL_TO boolexpr
	| value NOT_EQUAL_TO boolexpr
	| value GREATER_THAN_OR_EQUAL boolexpr
	| value LESS_THAN_OR_EQUAL boolexpr
	| value OR boolexpr
	| value AND boolexpr
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
GREATER_THAN_OR_EQUAL : '>=';
LESS_THAN_OR_EQUAL : '<=';
OR : '||';
AND  : '&&';

//Assignment operators
ASSIGN : '=';
ADDASSIGN : '+=';
SUBASSIGN : '-=';
MULASSIGN : '*=';
DIVASSIGN : '/=';

//Incremental operators
INCREMENT : '++';
DECREMENT : '--';

//Basic keywords & concepts
DEF : 'def';
VAR : 'var';
STR : 'str'; //Same as Var but for strings
IF : 'if';
WHILE : 'while';
RETURN : 'return';
TRUE : 'true';
FALSE : 'false';


value
	: identifier
	| number
	;

identifier
	: IDENTIFIER
	;

IDENTIFIER : [a-zA-Z][a-zA-Z0-9_]*;
number
   : NUMBER
   | PI
   | E
   ;


//Numbers
NUMBER
	: '-'? INT ('.' [0-9] +)?
	;

//Mathematic constants
PI : 'pi';
E : 'e';

fragment INT
   : '0' | [1-9] [0-9]*
   ;
QUOTED_TEXT : '"' ~ ["\r\n]* '"';

//Stuff we wanna ignore
LINECOMMENT : '//' ~[\r\n]* -> skip;
BLOCKCOMMENT : '/*' .*? '*/' -> skip;
WHITESPACE: [ \t\r\n] -> skip;