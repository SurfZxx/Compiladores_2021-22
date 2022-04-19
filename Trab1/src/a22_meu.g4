grammar a22_meu;

start :
	((expression | declaring_data | instruction))* EOF
	;

expression :
	int_expression // int number, ex, 123
	| real_expression // ex, 3.14
	| string_expression //string, ex "universidade"
	//| bool_expression //boolean, ex, true or false
	;

declaring_data :
	declare_variables
	//| declare_types
	;

instruction :
	declaring_data
	//| atribution_instructions
	;

int_expression :
	MINUS? (INT | stored_values)
	| LEFT_PARANT int_expression (MULTIPLIER | DIVIDER | LEFTOVER) int_expression RIGHT_PARANT
	| LEFT_PARANT int_expression (PLUS | MINUS) int_expression RIGHT_PARANT
	| int_expression (MULTIPLIER | DIVIDER | LEFTOVER) int_expression
	| int_expression (PLUS | MINUS) int_expression
	;

real_expression :
    MINUS? (INT | stored_values)
    | LEFT_PARANT real_expression (MULTIPLIER | DIVIDER) real_expression RIGHT_PARANT
    | LEFT_PARANT real_expression (PLUS | MINUS) real_expression RIGHT_PARANT
    | real_expression (MULTIPLIER | DIVIDER) real_expression
    | real_expression (PLUS | MINUS) real_expression
    ;



string_expression :
    (STRING | stored_values)
    | string_expression (PLUS) string_expression
    ;



stored_values :
	ID (stored_values1)?
	| KEYWORDS LEFT_PARANT expression RIGHT_PARANT
	;

stored_values1 :
	LEFT_ARRAY INT RIGHT_ARRAY (STRUCT_DOT ID)?
	| LEFT_PARANT ((expression) COMMA?)* RIGHT_PARANT
	;

//declare_types :
//	TYPE_STRUCT ID LEFT_BRACKET declare_variables+ RIGHT_PARANT
//	;

declare_variables :

    ;



//keywords 
KEYWORDS : 'write' | 'writeln' | 'read';
TYPE_STRUCT	: 'type';
TYPES : 'void' | 'bool' | 'int' | 'real' | 'string';

fragment DIGIT : [0-9];
fragment CHARACTER : [a-zA-Z];
fragment ESC : '\\' [tnr"\\] ;   // \t, \n, \r \" \\


PLUS : '+';
MINUS : '-';
MULTIPLIER : '*';
DIVIDER : '/';
LEFTOVER : '%';
LESSER : '<';
EQUAL : '=';
LESSER_EQUAL : LESSER EQUAL;
GREATER : '>';
GREATER_EQUAL : GREATER EQUAL;
EQUAL_TO : EQUAL EQUAL;
DIFFERENT : '!' EQUAL;
AND : 'and';
OR : 'or';

LEFT_PARANT : '(';
RIGHT_PARANT : ')';
LEFT_BRACKET : '{';
RIGHT_BRACKET: '}';
LEFT_ARRAY : '[';
RIGHT_ARRAY : ']';
COMMA : ',';
SEMICOLON : ';';
STRUCT_DOT : '.';

BOOL : 'true' | 'false';
REAL : DIGIT+ '.' DIGIT+;
INT : DIGIT+;
STRING : ' "' (ESC | .)*? '"';


ID : ('_' | CHARACTER) (DIGIT | CHARACTER | '_')*;

SPACE : [ \t\n] -> skip;
SL_COMMENT :   '//' .*? '\n' -> skip ;        // single-line comment
ML_COMMENT :   '/*' .*? '*/' -> skip ;       // multi-line comment