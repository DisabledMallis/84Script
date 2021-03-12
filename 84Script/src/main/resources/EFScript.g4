grammar EFScript;

Expression 
	: IDENTIFIER
	| NUMBER
	| TEXT
	| Expression ADD Expression
	| Expression SUB Expression
	| Expression MUL Expression
	| Expression DIV Expression
	| Expression ASSIGN Expression
	| Expression ADDASSIGN Expression
	| Expression SUBASSIGN Expression
	| Expression MULASSIGN Expression
	| Expression DIVASSIGN Expression
	| OPEN_BRACKET Expression CLOSE_BRACKET;


//Syntax operators
OPEN_BRACKET : '(';
CLOSE_BRACKET : ')';


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

//Basic keywords & concepts
DEF : 'def';
VAR : 'var';
IDENTIFIER : [A-Za-z];
NUMBER : [0-9'.'];
TEXT : '"' ~ ["\r\n]* '"';

//Stuff we wanna ignore
LINECOMMENT : '//' ~[\r\n]* -> skip;
BLOCKCOMMENT : '/*' .*? '*/' -> skip;
WHITESPACE: [ \t\r\n] -> skip;