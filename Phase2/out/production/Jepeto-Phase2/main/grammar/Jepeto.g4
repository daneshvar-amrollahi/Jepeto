grammar Jepeto;

@header{
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.values.*;
    import main.ast.nodes.expression.values.primitive.*;
    import main.ast.nodes.statement.*;
    import java.util.ArrayList;
}

jepeto returns [Program jepetoProgram]
    :   p = program { $jepetoProgram = $p.programRet; }EOF
    ;

program returns [Program programRet]
    :   {
            $programRet = new Program();
            System.out.println("New Program");
        }
        (
            fd = functionDeclaration {
                $programRet.addFunction($fd.funcDecRet);
            }
        )*
        m = main {
            $programRet.setMain($m.mainRet);
            System.out.println("programRet.setMain() called");
        }
        (
            fd2 = functionDeclaration {
                $programRet.addFunction($fd2.funcDecRet);
                System.out.println("programRet.addFunction() called");
            }
        )*
    ;

functionDeclaration returns [FunctionDeclaration funcDecRet]
    :   { $funcDecRet = new FunctionDeclaration(); }
        FUNC id = identifier { $funcDecRet.setFunctionName($id.IdRet); }
        fad = functionArgumentsDeclaration { $funcDecRet.setArgs($fad.IdArrRet); }
        COLON b = body { $funcDecRet.setBody($b.bodyRet); }
    ;

functionArgumentsDeclaration returns [ArrayList<Identifier> IdArrRet]
    :   { $IdArrRet = new ArrayList<Identifier>(); }
        LPAR
        (
            id = identifier { $IdArrRet.add($id.IdRet); }
            (
                COMMA
                id2 = identifier { $IdArrRet.add($id2.IdRet); }
            )*
        )?
        RPAR
    ;

body returns [Statement bodyRet]
    :   ss = singleStatement { $bodyRet = $ss.singleStmtRet; }
    |   b = block { $bodyRet = $b.blockRet; }
    ;

main returns [MainDeclaration mainRet]
    :   { $mainRet = new MainDeclaration(); }
        MAIN COLON
        (
            fcs = functionCallStatement {  }
            |   ps = printStatement {  }
        )
    ;

functionCall: identifier (LPAR functionArguments RPAR)* (LPAR functionArguments RPAR);

functionArguments: splitedExpressionsWithComma | splitedExpressionsWithCommaAndKey;

splitedExpressionsWithComma: (expression (COMMA expression)*)?;

splitedExpressionsWithCommaAndKey: (identifier ASSIGN expression (COMMA  identifier ASSIGN expression)*)?;

functionCallStatement: functionCall SEMICOLLON;

returnStatement returns [ReturnStmt returnRet]
    :   { $returnRet = new ReturnStmt(); }
        RETURN (e = expression {$returnRet.setReturnedExpr($e.expRet);} | voidValue) SEMICOLLON //Check voidValue later
    ;

ifStatement: IF expression COLON conditionBody   (ELSE COLON conditionBody)?;

ifStatementWithReturn returns [ConditionalStmt ifStmtWRetRet]
    :   // { $ifStmtWRetRet = new ConditionalStmt(); }
        IF expression COLON body ELSE COLON body
    ;

printStatement: PRINT LPAR expression RPAR SEMICOLLON;

statement: ifStatement | printStatement | functionCallStatement | returnStatement;

singleStatement returns [Statement singleStmtRet]
    :   rs = returnStatement { $singleStmtRet = $rs.returnRet; }
    |   iswr = ifStatementWithReturn { $singleStmtRet = $iswr.ifStmtWRetRet; }
    ;

block returns [BlockStmt blockRet]
    :   { $blockRet = new BlockStmt(); }
        LBRACE (statement* (returnStatement | ifStatementWithReturn) statement*) RBRACE
    ;

conditionBody: LBRACE (statement)* RBRACE | statement;

expression returns [Expression expRet]
    :   fo = andExpression {$expRet = $fo.andExpRet;}
        (OR so = andExpression
            { $expRet = new BinaryExpression($fo.andExpRet, $so.andExpRet, BinaryOperator.or); }
        )*
        {System.out.println("Found new Expression");}
    ;

andExpression returns [Expression andExpRet]
    :   fo = equalityExpression {$andExpRet = $fo.eqExpRet;}
        (AND so = equalityExpression
            { $andExpRet = new BinaryExpression($fo.eqExpRet, $so.eqExpRet, BinaryOperator.and); }
        )*
    ;

equalityExpression returns [Expression eqExpRet]
    : relationalExpression ((EQUAL | NOT_EQUAL) relationalExpression)*
    ;

relationalExpression: additiveExpression ((GREATER_THAN | LESS_THAN) additiveExpression)*;

additiveExpression: multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*;

multiplicativeExpression: preUnaryExpression ((MULT |  DIVIDE ) preUnaryExpression)*;

preUnaryExpression: ((NOT | MINUS) preUnaryExpression) | appendExpression ;

appendExpression: accessExpression (APPEND accessExpression)*;

accessExpression: otherExpression  (LPAR functionArguments RPAR)*  (LBRACK expression RBRACK)* (sizeExpression)*;

otherExpression:  values | identifier | anonymousFunction | LPAR (expression) RPAR ;

anonymousFunction: functionArgumentsDeclaration ARROW block;

sizeExpression: DOT SIZE;

values: boolValue | STRING_VALUE | INT_VALUE | listValue;

listValue: LBRACK splitedExpressionsWithComma RBRACK;

boolValue : TRUE | FALSE ;

voidValue : VOID;

identifier returns [Identifier IdRet]
    :   IDENTIFIER { $IdRet = new Identifier($IDENTIFIER.getText()); }
    ;


FUNC: 'func';
MAIN: 'main';
SIZE: 'size';

PRINT: 'print';
RETURN: 'return';
VOID: 'void';

IF: 'if';
ELSE: 'else';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIVIDE: '/';

EQUAL: 'is';
NOT_EQUAL: 'not';
GREATER_THAN: '>';
LESS_THAN: '<';

AND: 'and';
OR: 'or';
NOT: '~';

APPEND: '::';

TRUE: 'true';
FALSE: 'false';

ARROW: '->';

ASSIGN: '=';

LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';

COMMA: ',';
DOT: '.';
COLON: ':';
SEMICOLLON: ';';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;
STRING_VALUE: '"'~["]*'"';
COMMENT: ('#' ~( '\r' | '\n')*) -> skip;
WS: ([ \t\n\r]) -> skip;