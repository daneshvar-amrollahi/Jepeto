grammar Jepeto;

program
    :   (function)* main (function)* EOF
    //{ System.out.println("program"); }
    ;

MAIN
    :   'main'
    ;


main
    : MAIN':'(functionCall | print)
    {System.out.println("Main");}
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
    :   'func' funcDec ':' (if_ | return_)
    |   'func' funcDec ':' body
    ;

funcDec
    :  Identifier argDec
    ;

argDec
    :   '(' (Identifier',')*Identifier ')'
    ;

if_
    :   'if' expression ':' return_ else_
    |   'if' expression ':' return_
    |   'if' expression ':' body else_
    |   'if' expression ':' body
    ;

else_
    : 'else' ':'  body
    | 'else' ':' return_
    ;

return_
    : 'return' (expression | 'void') //add anonymousFunction later
    ;

body
    : '{'(statement | if_)* return_ (statement | if_)*'}'
    ;

statement
    :   (functionCall | return_ | print)';'
    ;


expression
    :   expression (OPERATOR) expression
    |   '(' expression ')'
    |   '~' expression
    |   '-' expression
    |   functionCall
    |   Int
    |   Bool
    |   String
    |   Identifier
    ;

OPERATOR
    : '*' | '/' | '+' | '-' 'and' 'or' 'is' 'not' '<' '>'
    ;

print
    :   'print' '(' expression ')' ';'
    ;

Identifier
    :   NonDigit (NonDigit | Digit)*
    { System.out.println("Identifier"); }
    ;

Int
    :[1-9][0-9]*
    ;

Bool
    : 'true'
    | 'false'
    ;



String
    : '"' ~["]*
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