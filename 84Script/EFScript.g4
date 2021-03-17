grammar EFScript;

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
	| identifier ASSIGN expression
	| identifier ADDASSIGN value
	| identifier SUBASSIGN value
	| identifier MULASSIGN value
	| identifier DIVASSIGN value
	| identifier INCREMENT
	| identifier DECREMENT
	| IF OPEN_BRACKET boolexpr CLOSE_BRACKET statement
	| WHILE OPEN_BRACKET boolexpr CLOSE_BRACKET statement
	| FOR OPEN_BRACKET boolexpr CLOSE_BRACKET statement
	| FOR OPEN_BRACKET identifier ',' value ',' value CLOSE_BRACKET statement
	| VAR identifier ASSIGN expression END_STMT
	| RETURN expression END_STMT
	| expression END_STMT
	| END_STMT
	;

//Expression
expression 
	| OPEN_BRACKET expression CLOSE_BRACKET
	| identifier
	| NUMBER
	| TEXT
	| methodcall
	| identifier ADD value
	| identifier SUB value
	| identifier MUL value
	| identifier DIV value
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

//Basic keywords & concepts
DEF : 'def';
VAR : 'var';
IF : 'if';
FOR : 'for';
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
TEXT : '"' ~ ["\r\n]* '"';

//Stuff we wanna ignore
LINECOMMENT : '//' ~[\r\n]* -> skip;
BLOCKCOMMENT : '/*' .*? '*/' -> skip;
WHITESPACE: [ \t\r\n] -> skip;