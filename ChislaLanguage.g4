grammar ChislaLanguage;

@header {
package compiler.grammar;
}

MAIN : 'main';
FUNCTION : 'fun';
RETURN : 'return';
PRINT : 'print';
PRITTY_PRINT : '<<';

BEGIN : 'begin';
END : 'end';
SEMICOLON : ';';
OPAR : '(';
CPAR : ')';
OANGLEBR : '<';
EQOANGLEBR : '<=';
CANGLEBR : '>';
EQCANGLEBR : '>=';
OBRACKET : '{';
CBRACKET : '}';
COLON : ':';


CONST : 'const';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
CASE : 'case';
DEFAULT : 'default';

NEGATION : '!';
INCR : '++';
DECR : '--';
EQ : '==';
NEQ : '!=';
IS : 'is';
MOD : '%' ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
IN : 'in';
POW: '^';
ASSIGN : '=';


INT_TYPE : 'int';
FLOAT_TYPE : 'flt';

INT: [0-9]+;
FLOAT:[0-9]+ '.' [0-9]*| '.' [0-9]+;
ID: [a-zA-Z_] [a-zA-Z_0-9]*;
COMMENT: '//' ~[\r\n]* -> skip;
SPACES: [ \t\r\n] -> skip;

math: create* function* main  EOF;
main: MAIN BEGIN start END;
start: instruction*;
instruction: create | expr | print | if_stat | while_stat | for_stat | function_call;


create: create_int | create_const_int | create_float | create_const_float;
create_int: INT_TYPE ID ASSIGN expr SEMICOLON;
create_const_int: CONST create_int;
create_float: FLOAT_TYPE ID ASSIGN expr SEMICOLON;
create_const_float: CONST create_float;
name_object_int: INT              #nameObjectInt;
name_object_float: FLOAT          #nameObjectFloat;
if_stat: IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?;
condition_block: OPAR (NEGATION)? condition CPAR stat_block;
stat_block: BEGIN start END;
while_stat: WHILE condition_block;
for_stat: FOR OPAR condition_for CPAR stat_block;
condition_for: ID ASSIGN expr SEMICOLON condition SEMICOLON ID oper=(INCR|DECR)             #forCond;
condition
 : ID op=(EQ | NEQ | OANGLEBR| CANGLEBR | EQOANGLEBR | EQCANGLEBR) expr                     #equalityExpr
 | ID IS type                                                                               #checkType
 ;
print: PRINT print_expr SEMICOLON;
print_expr
 : ID                                   #printId
 | INT                                  #printInt
 | FLOAT                                 #printFloat
 | PRITTY_PRINT ID                      #pretty_print
 ;
function_call: ID param_call SEMICOLON;
param_call: OPAR (arg_call)? CPAR;
arg_call
 : ID                      #paramCallArg
 | ID ',' arg_call         #paramCallArgs
 ;
function
 : FUNCTION ID param stat_block                      #voidFunction
 | FUNCTION type ID param stat_block_with_return    #returnFunction
 ;
expr
    : expr op=(MOD|MUL|DIV) expr                            #ModMulDiv
    | OPAR tp=(INT_TYPE|FLOAT_TYPE) CPAR expr               #typeConversion
    | expr op=(ADD|SUB) expr                                #AddSub
    | ID '(' expr ')'                                       #call
    | op=(ADD|SUB) expr                                     #unary
    | OPAR expr CPAR                                        #prim
    | ID                                                    #idExpr
    | name_object_int                                       #intExrp
    | name_object_float                                     #floatExpr
    | expr POW expr                                         #powExpr
    | ID ASSIGN expr SEMICOLON                              #assignExpr
    ;


stat_block_with_return: BEGIN start  return_id END;
return_id: RETURN ID SEMICOLON;
param: OPAR (arg)? CPAR;
arg
 : type ID                      #paramArg
 | type ID ',' arg              #paramArgs
 ;
type:INT_TYPE|FLOAT_TYPE;

