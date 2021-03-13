grammar EFScript;

script
	: (Function)*
	| (Statement)*
	;

Function
	: DEF IDENTIFIER OPEN_BRACKET (',' IDENTIFIER)* Statement
	;

Statement
	: OPEN_CURLEY Statement CLOSE_CURLEY
	| IF OPEN_BRACKET Expression CLOSE_BRACKET Statement
	| WHILE OPEN_BRACKET Expression CLOSE_BRACKET Statement
	| FOR OPEN_BRACKET Expression CLOSE_BRACKET Statement
	| VAR IDENTIFIER ASSIGN Expression END_STMT
	| Expression END_STMT
	| END_STMT
	;

Expression 
	: IDENTIFIER
	| NUMBER
	| TEXT
	| MethodCall
	| PI
	| E
	| IDENTIFIER INCREMENT
	| IDENTIFIER DECREMENT
	| IDENTIFIER ADD VALUE
	| IDENTIFIER SUB VALUE
	| IDENTIFIER MUL VALUE
	| IDENTIFIER DIV VALUE
	| IDENTIFIER ASSIGN Expression
	| IDENTIFIER ADDASSIGN VALUE
	| IDENTIFIER SUBASSIGN VALUE
	| IDENTIFIER MULASSIGN VALUE
	| IDENTIFIER DIVASSIGN VALUE
	| OPEN_BRACKET Expression CLOSE_BRACKET
	;

MethodCall
	: IDENTIFIER OPEN_BRACKET MethodParams CLOSE_BRACKET
	;

MethodParams
	: Expression (',' Expression)*
	;

//Syntax operators
OPEN_BRACKET : '(';
CLOSE_BRACKET : ')';
OPEN_CURLEY : '{';
CLOSE_CURLEY : '}';
END_STMT : ';';


//Mathematic constants
PI : 'pi';
E : 'e';

//Mathematic operators
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';

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
IF : 'if';
FOR : 'for';
WHILE : 'while';
RETURN : 'return';

VALUE
	: IDENTIFIER
	| NUMBER
	;

IDENTIFIER : [A-Za-z];
NUMBER : [0-9.];
TEXT : '"' ~ ["\r\n]* '"';

//Stuff we wanna ignore
LINECOMMENT : '//' ~[\r\n]* -> skip;
BLOCKCOMMENT : '/*' .*? '*/' -> skip;
WHITESPACE: [ \t\r\n] -> skip;