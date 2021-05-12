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

functionCall returns [FunctionCall funcCallRet]
    :
    id = identifier (LPAR functionArguments RPAR)* (LPAR functionArguments RPAR);

functionArguments returns [ArrayList<Expression> sewcRet, Map<Identifier, Expression> sewcakRet]
    :
    sewc = splitedExpressionsWithComma {$sewcRet = $sewc.sewcRet;}
    | sewcak = splitedExpressionsWithCommaAndKey {$sewcakRet = $sewcak.sewcakRet;}
    ;

splitedExpressionsWithComma returns [ArrayList<Expression> sewcRet]
    :   {$sewcRet = new ArrayList<Expression>();}
    (   exp1 = expression {$sewcRet.add($exp1.expRet);}
        (COMMA exp2 = expression {$sewcRet.add($exp2.expRet);})*
    )?
    ;

splitedExpressionsWithCommaAndKey returns [Map<Identifier, Expression> sewcakRet]
    :
    {$sewcakRet = new Map<Identifier, Expression>();}
    (id1 = identifier ASSIGN e1 = expression {sewcakRet.put(id1, e1);}
    (COMMA  id2 = identifier ASSIGN e2 = expression {sewcakRet.put(id2, e2);})
    *)?
    ;

functionCallStatement returns [FunctionCallStmt funcCallStmtRet]
    : fc = functionCall {$funcCallStmtRet = new FunctionCallStmt($fc.funcCallRet);} SEMICOLLON;

returnStatement returns [ReturnStmt returnRet]
    :   { $returnRet = new ReturnStmt(); }
        RETURN (e = expression {$returnRet.setReturnedExpr($e.expRet);}
        | vv = voidValue {$returnRet.setReturnedExpr($vv.voidRet);}) SEMICOLLON //Check voidValue later
    ;

ifStatement returns [ConditionalStmt ifStmtRet]
    :   IF e = expression
        COLON cb = conditionBody {$ifStmtRet = new ConditionalStmt($e.expRet, $cb.condBodyRet);}
        (ELSE COLON ecb = conditionBody {$ifStmtRet.setElseBody($ecb.condBodyRet);})?;

ifStatementWithReturn returns [ConditionalStmt ifStmtWRetRet]
    :
        IF e = expression
        COLON thenb = body {$ifStmtWRetRet = new ConditionalStmt($e.expRet, $thenb.bodyRet);}
        ELSE COLON elseb = body {$ifStmtWRetRet.setElseBody($elseb.bodyRet);}
    ;

printStatement returns [PrintStmt prstmtRet]
    : PRINT LPAR e = expression {$prstmtRet = new PrintStmt($e.expRet);} RPAR SEMICOLLON;

statement returns [Statement stmtRet]
    :
        ifst = ifStatement {$stmtRet = $ifst.ifStmtRet;}
    |   pst = printStatement {$stmtRet = $pst.prstmtRet;}
    |   functionCallStatement {}
    |   returnStatement
    ;

singleStatement returns [Statement singleStmtRet]
    :   rs = returnStatement { $singleStmtRet = $rs.returnRet; }
    |   iswr = ifStatementWithReturn { $singleStmtRet = $iswr.ifStmtWRetRet; }
    ;

block returns [BlockStmt blockRet]
    :   { $blockRet = new BlockStmt(); }
        LBRACE (
        (st = statement {$blockRet.addStatement($st.stmtRet);})*
        (rs = returnStatement {$blockRet.addStatement($rs.returnRet);} | iswr = ifStatementWithReturn {})
        statement*)
        RBRACE
    ;

conditionBody returns [Statement condBodyRet]
    : LBRACE {$condBodyRet = new BlockStmt();}
    (st1 = statement {$condBodyRet.addStatement($st1.stmtRet);})* RBRACE
    | st2 = statement {$condBodyRet = $st2.stmtRet;};

expression returns [Expression expRet]
    :   fo = andExpression {$expRet = $fo.andExpRet;}
        (OR so = andExpression
            { $expRet = new BinaryExpression($expRet, $so.andExpRet, BinaryOperator.or); }
        )*
        //{System.out.println("Found new Expression");}
    ;

andExpression returns [Expression andExpRet]
    :   fo = equalityExpression {$andExpRet = $fo.eqExpRet;}
        (AND so = equalityExpression
            { $andExpRet = new BinaryExpression($andExpRet, $so.eqExpRet, BinaryOperator.and); }
        )*
    ;

equalityExpression returns [Expression eqExpRet]
    : fo = relationalExpression {$eqExpRet = $fo.relExpRet; BinaryOperator eqop;}
        (
            (EQUAL {eqop = BinaryOperator.eq;} | NOT_EQUAL {eqop = BinaryOperator.neq;})
                so = relationalExpression { $eqExpRet = new BinaryExpression($eqExpRet, $so.relExpRet, eqop); }
        )*
    ;

relationalExpression returns [Expression relExpRet]
    :   fo = additiveExpression {$relExpRet = $fo.addExpRet; BinaryOperator addop;}
    (
        (GREATER_THAN {addop = BinaryOperator.gt;} | LESS_THAN {addop = BinaryOperator.lt;})
            so = additiveExpression { $relExpRet = new BinaryExpression($relExpRet, $so.addExpRet, addop); }
    )*
    ;

additiveExpression returns [Expression addExpRet]
    :   fo = multiplicativeExpression {$addExpRet = $fo.mulExpRet; BinaryOperator mulop;}
    (
            (PLUS {mulop = BinaryOperator.add;} | MINUS {mulop = BinaryOperator.sub;})
                so = multiplicativeExpression {$addExpRet = new BinaryExpression($addExpRet, $so.mulExpRet, mulop);}
    )*
    ;

multiplicativeExpression returns [Expression mulExpRet]
    :   fo = preUnaryExpression {$mulExpRet = $fo.puExpRet; BinaryOperator puop;}
    (
            (MULT {puop = BinaryOperator.mult;} |  DIVIDE {puop = BinaryOperator.div;})

                so = preUnaryExpression {$mulExpRet = new BinaryExpression($mulExpRet, $so.puExpRet, puop);}
    )*;

preUnaryExpression returns [Expression puExpRet]
    :   {UnaryOperator uop;}
        (
            (NOT {uop = UnaryOperator.not;} | MINUS {uop = UnaryOperator.minus;})
                ue = preUnaryExpression {$puExpRet = new UnaryExpression($ue.puExpRet, uop);}
        )
        | ape = appendExpression {$puExpRet = $ape.apExpRet;} ;

appendExpression returns [Expression apExpRet]
    :   fo = accessExpression {$apExpRet = $fo.acsExpRet;}
        (APPEND so = accessExpression
            {$apExpRet = new BinaryExpression($apExpRet, $so.acsExpRet, BinaryOperator.append);}
        )*;

accessExpression returns [Expression acsExpRet]
    :
        //{listAcsByIdx = new ListAccessByIndex();}
        oe = otherExpression {$acsExpRet = $oe.otherExpRet;}
        (LPAR functionArguments RPAR {$acsExpRet = new FunctionCall($oe.otherExpRet);})* //Come back later
        (LBRACK idx = expression {$acsExpRet = new ListAccessByIndex($acsExpRet, $idx.expRet);} RBRACK)*
        (se = sizeExpression {$acsExpRet = new ListSize($acsExpRet);})* ;

otherExpression returns [Expression otherExpRet]
    :   v = values {$otherExpRet = $v.valRet;}
    |   id = identifier {$otherExpRet = $id.IdRet;}
    |   anon = anonymousFunction {$otherExpRet = $anon.anonRet;}
    |   LPAR (e = expression {$otherExpRet = $e.expRet;}) RPAR ;

anonymousFunction returns [AnonymousFunction anonRet]
    :
        fa = functionArgumentsDeclaration {$anonRet = new AnonymousFunction($fa.IdArrRet);} ARROW block;

sizeExpression: DOT SIZE;

values returns [Value valRet]
    : bv = boolValue {$valRet = $bv.bvRet;}
    | STRING_VALUE {$valRet = new StringValue($STRING_VALUE.getText());}
    | INT_VALUE {$valRet = new IntValue(Integer.parseInt($INT_VALUE.getText()));}
    | lv = listValue {$valRet = $lv.lvRet;}
    ;

listValue returns [ListValue lvRet]
    : {$lvRet = new ListValue(); }
    LBRACK se = splitedExpressionsWithComma {$lvRet.setElements($se.sewcRet);} RBRACK;

boolValue returns [BoolValue bvRet]
    :
    TRUE {$bvRet = new BoolValue(true);}
    | FALSE {$bvRet = new BoolValue(false);}
    ;

voidValue returns [VoidValue voidRet]
    :
    VOID {$voidRet = new VoidValue();}
    ;

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