grammar Jepeto;

@header{
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.values.*;
    import main.ast.nodes.expression.values.primitive.*;
    import main.ast.nodes.statement.*;
    import java.util.*;
}

jepeto returns [Program jepetoProgram]
    :   p = program {
            $jepetoProgram = $p.programRet;
            $jepetoProgram.setLine(1);
        }
        EOF
    ;

program returns [Program programRet]
    :   {
            $programRet = new Program();
            $programRet.setLine(1);
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
        FUNC {$funcDecRet.setLine($FUNC.getLine());}
        id = identifier { $funcDecRet.setFunctionName($id.IdRet); }
        fad = functionArgumentsDeclaration { $funcDecRet.setArgs($fad.IdArrRet); }
        COLON b = body { $funcDecRet.setBody($b.bodyRet); }
    ;

functionArgumentsDeclaration returns [ArrayList<Identifier> IdArrRet, int line]
    :   { $IdArrRet = new ArrayList<Identifier>(); }
        LPAR {$line = $LPAR.getLine();}
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
        MAIN COLON {$mainRet.setLine($MAIN.getLine());}
        (
            fcs = functionCallStatement {
                $mainRet.setBody($fcs.funcCallStmtRet);
                System.out.println("MAIN: body set to " + $fcs.funcCallStmtRet.toString());
            }
            |   ps = printStatement {
                    $mainRet.setBody($ps.prstmtRet);
                    System.out.println("MAIN: body set to " + $ps.prstmtRet.toString());
                }
        )
    ;

functionCall returns [FunctionCall funcCallRet] locals [Expression inst]
    :
        id = identifier {$inst = $id.IdRet;}
        (LPAR fa = functionArguments RPAR {
                $funcCallRet = new FunctionCall($inst, $fa.sewcRet, $fa.sewcakRet);
                $funcCallRet.setLine($LPAR.getline());
                $inst = $funcCallRet;
            }
        )*
        (LPAR fa2 = functionArguments RPAR {
                $funcCallRet = new FunctionCall($inst, $fa2.sewcRet, $fa2.sewcakRet);
                $funcCallRet.setLine($LPAR.getline());
            }
        )
    ;

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
    {$sewcakRet = new HashMap<Identifier, Expression>();}
    (id1 = identifier ASSIGN e1 = expression {$sewcakRet.put($id1.IdRet, $e1.expRet);}
    (COMMA  id2 = identifier ASSIGN e2 = expression {$sewcakRet.put($id2.IdRet, $e2.expRet);})
    *)?
    ;

functionCallStatement returns [FunctionCallStmt funcCallStmtRet]
    : fc = functionCall {$funcCallStmtRet = new FunctionCallStmt($fc.funcCallRet);} SEMICOLLON
    ;

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
    |   fcs = functionCallStatement {$stmtRet = $fcs.funcCallStmtRet;}
    |   rs = returnStatement {$stmtRet = $rs.returnRet;}
    ;

singleStatement returns [Statement singleStmtRet]
    :   rs = returnStatement { $singleStmtRet = $rs.returnRet; }
    |   iswr = ifStatementWithReturn { $singleStmtRet = $iswr.ifStmtWRetRet; }
    ;

block returns [BlockStmt blockRet]
    :   { $blockRet = new BlockStmt(); }
        LBRACE (
            (st = statement {$blockRet.addStatement($st.stmtRet);})*
            ( rs = returnStatement {$blockRet.addStatement($rs.returnRet);}
            | iswr = ifStatementWithReturn {$blockRet.addStatement($iswr.ifStmtWRetRet);}
            )
            (st2 = statement {$blockRet.addStatement($st2.stmtRet);})*
        )
        RBRACE
    ;

conditionBody returns [Statement condBodyRet] locals [BlockStmt tempBlock]
    : LBRACE {$tempBlock = new BlockStmt();}
    (st1 = statement {$tempBlock.addStatement($st1.stmtRet);})* RBRACE
    {$condBodyRet = $tempBlock;}
    | st2 = statement {$condBodyRet = $st2.stmtRet;};

expression returns [Expression expRet]
    :   fo = andExpression {$expRet = $fo.andExpRet; $expRet.setLine($fo.andExpRet.getLine());}
        (OR so = andExpression
            {
                $expRet = new BinaryExpression($expRet, $so.andExpRet, BinaryOperator.or);
                $expRet.setLine($OR.getLine());
            }
        )*
        //{System.out.println("Found new Expression");}
    ;

andExpression returns [Expression andExpRet]
    :   fo = equalityExpression {$andExpRet = $fo.eqExpRet; $andExpRet.setLine($fo.eqExpRet.getLine());}
        (AND so = equalityExpression
            {
                $andExpRet = new BinaryExpression($andExpRet, $so.eqExpRet, BinaryOperator.and);
                $andExpRet.setLine($AND.getLine());
            }
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
                ue = preUnaryExpression {$puExpRet = new UnaryExpression($ue.puExpRet, uop); }
        )
        | ape = appendExpression {$puExpRet = $ape.apExpRet;} ;

appendExpression returns [Expression apExpRet]
    :   fo = accessExpression {$apExpRet = $fo.acsExpRet;}
        (APPEND so = accessExpression
            {$apExpRet = new BinaryExpression($apExpRet, $so.acsExpRet, BinaryOperator.append);}
        )*;

accessExpression returns [Expression acsExpRet]
    :
        oe = otherExpression {$acsExpRet = $oe.otherExpRet;}
        (LPAR functionArguments RPAR {$acsExpRet = new FunctionCall($oe.otherExpRet); $acsExpRet.setLine($LPAR.getLine()); } )* //Come back later
        (LBRACK idx = expression {$acsExpRet = new ListAccessByIndex($acsExpRet, $idx.expRet); $acsExpRet.setLine($LBRACK.getLine());} RBRACK)*
        (se = sizeExpression {$acsExpRet = new ListSize($acsExpRet); $acsExpRet.setLine($se.line)})* ;

otherExpression returns [Expression otherExpRet]
    :   v = values {$otherExpRet = $v.valRet;}
    |   id = identifier {$otherExpRet = $id.IdRet;}
    |   anon = anonymousFunction {$otherExpRet = $anon.anonRet;}
    |   LPAR (e = expression {$otherExpRet = $e.expRet;}) RPAR ;

anonymousFunction returns [AnonymousFunction anonRet]
    :
        fa = functionArgumentsDeclaration {$anonRet = new AnonymousFunction($fa.IdArrRet); $anonRet.setLine($fa.line);}
        ARROW b = block {$anonRet.setBody($b.blockRet);};

sizeExpression returns [int line]
    : DOT {$line = $DOT.getLine();} SIZE;

values returns [Value valRet]
    : bv = boolValue {$valRet = $bv.bvRet;}
    | STRING_VALUE {$valRet = new StringValue($STRING_VALUE.getText()); $valRet.setLine($STRING_VALUE.getLine());}
    | INT_VALUE {$valRet = new IntValue(Integer.parseInt($INT_VALUE.getText())); $valRet.setLine($INT_VALUE.getLine());}
    | lv = listValue {$valRet = $lv.lvRet;}
    ;

listValue returns [ListValue lvRet]
    : {$lvRet = new ListValue(); $lvRet.setLine($LBRACK.getLine());}
    LBRACK se = splitedExpressionsWithComma {$lvRet.setElements($se.sewcRet);} RBRACK;

boolValue returns [BoolValue bvRet]
    :
    TRUE {$bvRet = new BoolValue(true); $bvRet.setLine($TRUE.getLine());}
    | FALSE {$bvRet = new BoolValue(false); $bvRet.setLine($FALSE.getLine());}
    ;

voidValue returns [VoidValue voidRet]
    :
    VOID {$voidRet = new VoidValue(); $voidRet.setLine($VOID.getLine());}
    ;

identifier returns [Identifier IdRet]
    :   IDENTIFIER { $IdRet = new Identifier($IDENTIFIER.getText()); $IdRet.setLine($IDENTIFIER.getLine());}
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