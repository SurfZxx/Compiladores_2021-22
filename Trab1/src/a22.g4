grammar a22;
start :
 ((expression | declaring_data | instruction))* EOF
 ;

expression :
 int_expression
 | real_expression
 | string_expression
 | bool_expression
 ;

declaring_data :
 declare_variables
 | declare_types
 ;

instruction :
 declaring_data
 | attribution_instruction
 | if_instruction
 | while_instruction
 | for_instruction
 | return_instruction
 | expression_instruction
 | block_instruction
 | semicolon_instruction
 | defining_functions
 ;

int_expression :
 MINUS? (INT | stored_values)
 | LPARENTH int_expression (DIVIDER | MULTIPLIER | MODULO) int_expression RPARENTH
 | LPARENTH int_expression (PLUS | MINUS) int_expression RPARENTH
 | int_expression (DIVIDER | MULTIPLIER | MODULO) int_expression
 | int_expression (PLUS | MINUS) int_expression
 ;

real_expression :
 MINUS? (REAL | INT | stored_values)
 | LPARENTH real_expression (DIVIDER | MULTIPLIER) real_expression RPARENTH
 | LPARENTH real_expression (PLUS | MINUS) real_expression RPARENTH
 | real_expression (DIVIDER | MULTIPLIER) real_expression
 | real_expression (PLUS | MINUS) real_expression
 ;

bool_expression :
 (BOOL | stored_values)
 | MINUS? (REAL | INT | STRING | stored_values)
 | LPARENTH NOT bool_expression RPARENTH
 | NOT bool_expression
 | LPARENTH bool_expression bool_comparators bool_expression RPARENTH
 | LPARENTH bool_expression (IS_EQUAL_TO | DIFFERENT) bool_expression RPARENTH
 | LPARENTH bool_expression (AND | OR) bool_expression RPARENTH
 | bool_expression bool_comparators bool_expression
 | bool_expression (IS_EQUAL_TO | DIFFERENT) bool_expression
 | bool_expression (AND | OR) bool_expression
 ;

bool_comparators :
 (GREATER | GREATER_THAN | LESS | LESS_THAN)
 ;

string_expression :
 (STRING | stored_values)
 | string_expression (PLUS) string_expression
 ;

stored_values :
 ID (stored_values1)?
 | KEYWORDS LPARENTH expression RPARENTH
 ;

stored_values1 :
 LARRAY int_expression RARRAY (STRUCT_DOT ID)?
 | LPARENTH ((expression) COMMA? )* RPARENTH
 | STRUCT_DOT ID
 ;

declare_variables :
 ID(LARRAY int_expression RARRAY)*
 | TYPES declare_variables (COMMA declare_variables)* SEMICOLON
 ;

declare_types :
 TYPE_STRUCT ID LBRACKET declare_variables+ RBRACKET
 ;

attribution_instruction :
 ID (LARRAY int_expression RARRAY)* (STRUCT_DOT ID)?
 | attribution_instruction EQUAL expression+ SEMICOLON
 ;

attribution_no_semicolon :
 ID (LARRAY int_expression RARRAY)* (STRUCT_DOT ID)?
 | attribution_no_semicolon EQUAL expression
 ;

if_instruction :
 IF bool_expression THEN instruction (ELSE instruction)?
 ;

while_instruction :
 WHILE bool_expression instruction
 ;

for_instruction :
 FOR attribution_no_semicolon (FOR_TO | FOR_DOWNTO) INT (FOR_STEP INT)? instruction
 ;

return_instruction :
 RETURN (expression)? SEMICOLON
 ;

expression_instruction :
 expression SEMICOLON
 ;

block_instruction :
 LBRACKET instruction* RBRACKET
 ;

semicolon_instruction :
 SEMICOLON
 ;

defining_functions :
 TYPES ID LPARENTH (TYPES REFERENCED? ID COMMA?)* RPARENTH LBRACKET instruction+ RBRACKET
 ;

// keywords always first because of compiling rules (if 2 criteria meet, FIFO)
KEYWORDS : 'write' | 'writeln' | 'read';
TYPE_STRUCT : 'type';
IF : 'if';
THEN : 'then';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
FOR_TO: 'to';
FOR_DOWNTO: 'downto';
FOR_STEP : 'step';
RETURN : 'return';
REFERENCED : '^';
TYPES : 'void' | 'bool' | 'int' | 'real' | 'string';

fragment DIGIT : [0-9];
fragment CHARACTER : [a-zA-Z];
fragment ESC : '\\' [tnr"\\] ;   // \t, \n, \r \" \\

STRUCT_DOT : '.';
LBRACKET : '{';
RBRACKET : '}';
LARRAY : '[';
RARRAY : ']';
LPARENTH : '(';
RPARENTH : ')';
PLUS : '+';
MINUS : '-';
DIVIDER : '/';
MULTIPLIER : '*';
MODULO : '%';
GREATER : '>';
LESS : '<';
EQUAL : '=';
IS_EQUAL_TO : EQUAL EQUAL;
DIFFERENT : '!' EQUAL;
GREATER_THAN : GREATER EQUAL;
LESS_THAN : LESS EQUAL;
AND : 'and';
OR : 'or';
NOT : 'not';
COMMA : ',';
SEMICOLON : ';';

BOOL : 'true' | 'false';
REAL : DIGIT+ '.' DIGIT+;
INT : DIGIT+;
STRING : '"' (ESC | .)*? '"' ;

ID : ('_' | CHARACTER) (DIGIT | CHARACTER | '_')*;

SPACE : [ \t\n] -> skip;
SL_COMMENT :   '//' .*? '\n' -> skip ;        // single-line comment
ML_COMMENT :   '/*' .*? '*/' -> skip ;       // multi-line comment
