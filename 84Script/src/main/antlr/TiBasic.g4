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
	| colon
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
	| comma
	| store
	| period
	| equals
	| space
	| list
	| open_bracket
	| close_bracket
	| semicolon
	;

//Tokens
disp : 'DISP';
input : 'INPUT';
store : '->';
if_ : 'IF'; //Has an _ because it conflicts with java's 'if' in code generation
then : 'THEN';
end : 'END';
list : 'LIST' number;
space : ' ';

//Letters (Ti-basic variables & text)
quote : '"';
letter : LETTER;
LETTER : [A-Z];

//Symbols
colon : ':';
semicolon : ';';
comma : ',';
period : '.';
open_bracket : '(';
close_bracket : ')';

//Math operations
equals : '=';

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