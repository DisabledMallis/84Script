grammar TiBasic;

@header {
package com.efscript.antlr;
} 

script
	: token*
	| EOF
	;

token
	: NUMBER
	| PI
	| E
	| I
	| LETTER
	;

//Tokens
disp : 'Disp' token;
input : 'Input' token ',' token;

//Letters (Ti-basic variables)
LETTER : [A-Z];

//Numbers
NUMBER
	: '-'? INT ('.' [0-9] +)?
	;

//Mathematic constants
PI : 'pi';
E : 'e';
I : 'i';

fragment INT
   : '0' | [1-9] [0-9]*
   ;
QUOTED_TEXT : '"' ~ ["\r\n]* '"';

//Stuff we wanna ignore
LINECOMMENT : '//' ~[\r\n]* -> skip;
BLOCKCOMMENT : '/*' .*? '*/' -> skip;
WHITESPACE: [ \t\r\n] -> skip;