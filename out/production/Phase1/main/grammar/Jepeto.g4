grammar Jepeto;

program
    :   (Identifier | LineComment)*main EOF
    { System.out.println("program"); }
    ;

MAIN
    :   'main'
    ;

main
    : MAIN':'functionCall
    {System.out.println("Main");}
    ;


functionCall
    :   Identifier'('argList')'
    ;

argList
    :   ((Identifier',')*Identifier)
    |   (Identifier'='Identifier',')*(Identifier'='Identifier)
    |
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
    ;