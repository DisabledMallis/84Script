grammar EFScript;

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
IDENTIFIER : [A-Za-z];
NUMBER : [0-9'.'];
TEXT : '"' ~ ["\r\n]* '"';

//Stuff we wanna ignore
LINECOMMENT : '//' ~[\r\n]* -> skip;
BLOCKCOMMENT : '/*' .*? '*/' -> skip;
WHITESPACE: [ \t\r\n] -> skip;