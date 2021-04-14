grammar Jepeto;

program
//    :   (function)* main (function)* EOF
    :   (function)* main { System.out.println("Main"); } (function)* EOF
    ;

Main
    :   'main'
    ;

main
    : Main ':' (funcCallStmt | printStmt)
    ;

funcCallStmt
    :   functionCall ';'
    ;

printStmt
    :   print ';'
    ;

functionCall
     :   Identifier argList
    //:   anonymousFunction argList
    ;

argList
    :   '('(expression',')*expression')'
    |   '('(Identifier'='expression',')*(Identifier'='expression)')'
    |   '(' ')'
    //| (Identifier'='anonymousFunction',')*(Identifier'='anonymousFunction',')
    ;

function
    :   'func' funcDec ':' (if_ | returnStatement)
    |   'func' funcDec ':' '{' body '}'
    ;

body
//    : (if_ | statement)* return_ (if_ | statement)*
    : (if_ | statement)*
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

If
    :   'if'
    { System.out.println("Conditional : if"); }
    ;

if_
    :   If expression ':' '{' body '}' else_
    |   If expression ':' '{' body '}'
    |   If expression ':' returnStatement else_
    |   If expression ':' returnStatement
    |   If expression ':' if_ else_
    |   If expression ':' if_
    ;

Else
    :   'else'
    { System.out.println("Conditional : else"); }
    ;

else_
    :   Else ':'  '{' body '}'
    |   Else ':' returnStatement
    |   Else ':' if_
    ;

returnStatement
    :   return_ ';'
    ;

Return
    :   'return'
    { System.out.println("Return"); }
    ;

return_
    : Return (expression | 'void')  //add anonymousFunction later
    ;

//semicolons for any nonsense will be added here,
//so mind your damn bizness
statement
    :   (print | functionCall | return_) ';'
    ;


/*expression
    :   '(' expression ')'
    |   expression (OPERATOR) expression
    |   '~' expression
    |   '-' expression
    |   functionCall
    |   Int
    |   Bool
    |   String
    |   Identifier
    ;
*/

expression
    :   expression 'or' orExpression
    |   orExpression
    ;

orExpression
    :   orExpression 'and' andExpression
    |   andExpression
    ;


andExpression
    :   andExpression 'is' isNotExpression
    |   andExpression 'not' isNotExpression
    |   isNotExpression
    ;

isNotExpression
    :   isNotExpression '<' ltgtExpression
    |   isNotExpression '>' ltgtExpression
    |   ltgtExpression
    ;

ltgtExpression
    :   ltgtExpression '+' addSubExpression
    |   ltgtExpression '-' addSubExpression
    |   addSubExpression
    ;

addSubExpression
    :   addSubExpression '*' mulDivExpression
    |   addSubExpression '/' mulDivExpression
    |   mulDivExpression
    ;

mulDivExpression
    :   ('~' | '-') tildaNegOperator
    |   tildaNegOperator
    ;

tildaNegOperator
    :   tildaNegOperator '::' concatExpression
    |   concatExpression
    ;

concatExpression
    :   subscriptExpression '.size'
    |   subscriptExpression
    ;

subscriptExpression
    :   subscriptExpression '[' expression ']'
    |   factor_ '[' expression ']'
    |   factor_
    ;

factor_
    :   '(' expression ')'
    |   functionCall
    |   Int
    |   Bool
    |   String
    |   Identifier
    ;

OPERATOR
    : '*' | '/' | '+' | '-' | 'and' | 'or' | 'is' | 'not' | '<' | '>'
    ;

Print
    :   'print'
    { System.out.println("Built-in : print"); }
    ;

print
    :   'print' '(' expression ')'
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