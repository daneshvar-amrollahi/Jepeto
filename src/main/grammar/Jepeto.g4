grammar Jepeto;

jepeto
    :   (function)* main (function)* EOF
    ;

Main
    :   'main'
    ;

main
    :   Main { System.out.println("Main"); } ':' (funcCallStmt | printStmt)
    ;

funcCallStmt
    :   functionCall ';'
    ;

printStmt
    :   print ';'
    ;

anonymousFunctionCall
    :   anonymousFunction (argList)+
    ;

functionCall
    :  Identifier (argList)+
    ;

argList
    :   /*{ System.out.println("FunctionCall"); }*/ '(' (expression ',')* expression ')'
    |   /*{ System.out.println("FunctionCall"); }*/ '(' (Identifier'='expression ',')* (Identifier'='expression) ')'
    |   /*{ System.out.println("FunctionCall"); }*/ '(' ')'
    ;

Func
    :   'func'
    ;

function
    :   funcDec ':' (if_ | returnStatement)
    |   funcDec ':' '{' body '}'
    ;

anonymousFunction
    :   { System.out.println("Anonymous Function"); }
        argDec '->' '{' body '}'
    ;

body
//    : (if_ | statement)* returnStatement (if_ | statement)*
    : (if_ | statement)*
    ;

funcDec
    :  Func Identifier { System.out.println("FunctionDec : " + $Identifier.getText()); } argDec
    ;

argDec
    :   '(' (arg ',')* arg ')'
    |   '(' ')'
    ;

arg
    :   Identifier
    { System.out.println("ArgumentDec : " + $Identifier.getText()); }
    ;

If
    :   'if'
    ;

if_
    :   If { System.out.println("Conditional : if"); } expression ':' '{' body '}' else_
    |   If { System.out.println("Conditional : if"); } expression ':' '{' body '}'
    |   If { System.out.println("Conditional : if"); } expression ':' returnStatement else_
    |   If { System.out.println("Conditional : if"); } expression ':' returnStatement
    |   If { System.out.println("Conditional : if"); } expression ':' if_ else_
    |   If { System.out.println("Conditional : if"); } expression ':' if_
    ;

Else
    :    'else'
    ;

else_
    :   Else { System.out.println("Conditional : else"); } ':'  '{' body '}'
    |   Else { System.out.println("Conditional : else"); } ':' returnStatement
    |   Else { System.out.println("Conditional : else"); } ':' if_
    ;

returnStatement
    :   return_ ';'
    ;

Return
    :   'return'
    ;

return_
    : Return { System.out.println("Return"); } (expression | 'void')  //add anonymousFunction later
    ;

//semicolons for any nonsense will be added here,
//so mind your damn bizness
statement
    : print ';'
    | {System.out.println("FunctionCall");} functionCall ';'
    | return_ ';'
    ;

expression
    :   expression 'or' orExpression { System.out.println("Operator : or"); }
    |   orExpression
    ;

orExpression
    :   orExpression 'and' andExpression { System.out.println("Operator : and"); }
    |   andExpression
    ;


andExpression
    :   andExpression 'is' isNotExpression { System.out.println("Operator : is"); }
    |   andExpression 'not' isNotExpression { System.out.println("Operator : not"); }
    |   isNotExpression
    ;

isNotExpression
    :   isNotExpression '<' ltgtExpression { System.out.println("Operator : <"); }
    |   isNotExpression '>' ltgtExpression { System.out.println("Operator : >"); }
    |   ltgtExpression
    ;

ltgtExpression
    :   ltgtExpression '+' addSubExpression { System.out.println("Operator : +"); }
    |   ltgtExpression '-' addSubExpression { System.out.println("Operator : -"); }
    |   addSubExpression
    ;

addSubExpression
    :   addSubExpression '*' mulDivExpression { System.out.println("Operator : *"); }
    |   addSubExpression '/' mulDivExpression { System.out.println("Operator : /"); }
    |   mulDivExpression
    ;

mulDivExpression
    :   '~' tildaNegOperator { System.out.println("Operator : ~"); }
    |   '-' tildaNegOperator { System.out.println("Operator : -"); }
    |   tildaNegOperator
    ;

tildaNegOperator
    :   tildaNegOperator '::' concatExpression { System.out.println("Operator : ::"); }
    |   concatExpression
    ;

concatExpression
    :   subscriptExpression { System.out.println("Size"); } '.size'
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
    |   anonymousFunctionCall
    |   anonymousFunction
    |   Int
    |   Bool
    |   String
    |   Identifier
    |   listType
    ;

OPERATOR
    : '*' | '/' | '+' | '-' | 'and' | 'or' | 'is' | 'not' | '<' | '>'
    ;

Print
    :   'print'
    ;

print
    :   { System.out.println("Built-in : print"); }
        Print '(' expression ')'
    ;

listType
    :   '[' ((expression) ',')* (expression) ']'
    |   '[' ']'
    ;

Identifier
    :   NonDigit (NonDigit | Digit)*
    ;

Int
    :[1-9][0-9]*
    | '0'
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