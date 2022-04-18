grammar Interpreter;
start :
 expression EOF
 ;
expression
 :
 | (INT | ID)
 | expression (PLUS | MINUS | DIVIDE | MULTIPLY) expression
 ;
PLUS : '+';
MINUS : '-';
INT : '0'..'9'+;
//AULA 02-03-22
//EXERCICIO 1

//EXERCICIO 2
DIVIDE : '/';
MULTIPLY : '*';
//EXERCICIO 3
ID : '_'*'a'..'z'+;

//EXERCICIO 4
//TAB : '\t';
SPACE : [ \t] -> skip;