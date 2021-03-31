grammar TiBasic;

@header {
package com.efscript.antlr;
} 

script
	: token*
	| EOF
	;

token
	: number
	| pi
	| e
	| i
	| letter
	| quote
	| disp
	| input
	| newline
	| colon
	| comma
	;

//Tokens
disp : 'Disp';
input : 'Input';

//Letters (Ti-basic variables & text)
quote : QUOTE;
QUOTE : '"';

letter : LETTER;
LETTER : [A-Z];

//Symbols
colon : COLON;
COLON : ':';
comma : COMMA;
COMMA : ',';

//Numbers
number : NUMBER;
NUMBER
	: '-'? INT ('.' [0-9] +)?
	;

//Mathematic constants
pi : PI;
PI : 'pi';

e : E;
E : 'e';

i : I;
I : 'i';

fragment INT
   : '0' | [1-9] [0-9]*
   ;

newline : NEWLINE;
NEWLINE : '\n';

//Stuff we wanna ignore
LINECOMMENT : '//' ~[\r\n]* -> skip;
BLOCKCOMMENT : '/*' .*? '*/' -> skip;
WHITESPACE: [ \t\r] -> skip;