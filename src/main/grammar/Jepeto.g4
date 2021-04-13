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
    :   'func' funcDec ':' (if | return)
    |   'func' funcDec ':' body
    ;

funcDec
    :  Identifier argDec
    ;

argDec
    :   '(' (Identifier',')*Identifier ')'
    ;

if
    :   'if' expression ':' return else
    |   'if' expression ':' return
    |   'if' expression ':' body else
    |   'if' expression ':' body
    ;

else
    : 'else' ':'  body
    | 'else' ':' return
    ;

return
    : 'return' (expression | 'void') //add anonymousFunction later
    ;

body
    : '{'(statement | if)* return (statement | if)*'}'
    ;

statement
    :   (functionCall | return | print)';'
    ;




Identifier
    :   NonDigit (NonDigit | Digit)*
    { System.out.println("Identifier"); }
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