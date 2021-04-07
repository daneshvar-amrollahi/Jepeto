grammar Json;

json
    : jsonObject* EOF
    ;

jsonObject
    : LBRACE (keyValuePair (',' keyValuePair)*)? RBRACE
    ;

keyValuePair
    : identifier ':' (primitive | jsonObject)
    ;

primitive
    : string
    | INT
    ;

string
    : SINGLE_STRING
    | DOUBLE_STRING
    ;

identifier
    : IDENTIFIER
    ;

SINGLE_STRING
    : '\'' ~('\'')+ '\''
    ;

DOUBLE_STRING
    : '"' ~('"')+ '"'
    ;

INT
    :   [0-9]+
    ;

IDENTIFIER
    :   [A-Za-z0-9]+
    ;

LBRACE
    : '{'
    ;

RBRACE
    : '}'
    ;

WS
    :   [ \t\r\n]+ -> skip
    ;