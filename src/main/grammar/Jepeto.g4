grammar Jepeto;

program
    : (Identifier | LineComment)* EOF
    { System.out.println("program"); }
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