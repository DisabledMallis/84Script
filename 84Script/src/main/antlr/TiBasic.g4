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
	| if_
	| then
	| end
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
	| store
	| period
	| equals
	| space
	;

//Tokens
disp : 'Disp ';
input : 'Input ';
store : '->';
if_ : 'If '; //Has an _ because it conflicts with java's 'if' in code generation
equals : '=';
then : 'Then';
end : 'End';
space : ' ';

//Letters (Ti-basic variables & text)
quote : '"';
letter : LETTER;
LETTER : [A-Z];

//Symbols
colon : ':';
comma : ',';
period : '.';

//Numbers
number : NUMBER;
NUMBER
	: [0-9]
	;

//Mathematic constants
pi : 'pi';

e : 'e';

i : 'i';

fragment INT
   : '0' | [1-9] [0-9]*
   ;

newline : '\n';

//Stuff we wanna ignore
LINECOMMENT : '//' ~[\r\n]* -> skip;
BLOCKCOMMENT : '/*' .*? '*/' -> skip;
WHITESPACE: [\t\r] -> skip;