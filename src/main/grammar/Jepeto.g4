grammar Jepeto;

program
    :   (function)* main (function)* EOF
    ;

Main
    :   'main'
    ;


main
    : Main ':' (functionCall | print)
    ;

functionCall
     :   Identifier argList
    //:   anonymousFunction argList
    ;

argList
    :   '('(expression',')*expression')'
    |   '('(Identifier'='expression',')*(Identifier'='expression)')'
    //| (Identifier'='anonymousFunction',')*(Identifier'='anonymousFunction',')
    ;

function
    :   'func' funcDec ':' (if_ | returnStatement)
    |   'func' funcDec ':' '{' body '}'
    ;

body
    //: '{'(if_ | statement)* return_ (if_ | statement)*'}'
    :(if_ | statement)*
    ;


funcDec
    :  Identifier { System.out.println("FunctionDec : " + $Identifier.getText()); } argDec
    ;

argDec
    :   '(' (arg ',')* arg ')'
    |   '(' ')'
    ;

arg
    :   Identifier
    { System.out.println("ArgDec : " + $Identifier.getText()); }
    ;

if_
    :   'if' expression ':' '{' body '}' else_
    |   'if' expression ':' '{' body '}'
    |   'if' expression ':' returnStatement else_
    |   'if' expression ':' returnStatement
    |   'if' expression ':' if_ else_
    |   'if' expression ':' if_
    ;

else_
    :   'else' ':'  '{' body '}'
    |   'else' ':' returnStatement
    |   'else' ':' if_
    ;

returnStatement
    :   return_ ';'
    ;

return_
    : 'return' (expression | 'void')  //add anonymousFunction later
    ;

statement
    :   (functionCall | return_ | print)';'
    ;


expression
    :   '~' expression
    |   '-' expression
    |   expression (OPERATOR) expression
    |   '(' expression ')'



    |   functionCall
    |   Int
    |   Bool
    |   String
    |   Identifier
    ;

OPERATOR
    : '*' | '/' | '+' | '-' | 'and' | 'or' | 'is' | 'not' | '<' | '>'
    ;

print
    :   'print' '(' expression ')' ';'
    ;

Identifier
    :   NonDigit (NonDigit | Digit)*
    ;

Int
    :[1-9][0-9]*
    ;

Bool
    : 'true'
    | 'false'
    ;



String
    : '"' ~["]* '"'
    ;

fragment
NonDigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :   [0-9]
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

LineComment
    :   '#' ~[\r\n]*
        -> skip
    ;