package compiler.visitor;

import compiler.language.ChislaLanguageBaseVisitor;
import compiler.language.ChislaLanguageParser;
import compiler.types.VariableType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Visitor extends ChislaLanguageBaseVisitor<String> {

    public String className;
    public Controll handle = new Controll();
    public Memory memory = new Memory();
    public Visitor(String fileName) {
        String fileNameForClass = handle.getStringWithFirstCapital(fileName);
        this.className = replaceDot(fileNameForClass);
    }



    @Override
    public String visitMath(ChislaLanguageParser.MathContext ctx) {
        String buffer = "";
        buffer += "public class " + "Main" + " {\n";
        List<ChislaLanguageParser.CreateContext> createContextList = ctx.create();
        for (ChislaLanguageParser.CreateContext aCreateContextList : createContextList) {
            buffer += "static " + this.visit(aCreateContextList);
            buffer += "\n";
        }
        List<ChislaLanguageParser.FunctionContext> functionContextList = ctx.function();
        for (ChislaLanguageParser.FunctionContext aFunctionContextList : functionContextList) {
            buffer += this.visit(aFunctionContextList);
            buffer += "\n";
        }
        buffer += this.visit(ctx.main());
        buffer += "}\n";
        return buffer;
    }

    @Override
    public String visitMain(ChislaLanguageParser.MainContext ctx) {
        memory.clearLocalVariableList();
        return "public static void main(String[]args) throws Exception{\n" +
                this.visit(ctx.start()) +
                "}\n";
    }

    @Override
    public String visitStart(ChislaLanguageParser.StartContext ctx) {
        String buffer = "";
        for (int children = 0; children < ctx.getChildCount(); children++) {
            buffer += "";
            buffer += this.visit(ctx.getChild(children));
            buffer += "\n";
        }
        return buffer;
    }


    @Override
    public String visitCreate_int(ChislaLanguageParser.Create_intContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (memory.notExistLocaleVariable(name)) {
            memory.addVariableToList(ctx, name, VariableType.INTEGER);
            newVariable = VariableType.INTEGER.toString() + " ";
        }
        String nameObject = visit(ctx.expr());
        return newVariable + name + " = " + nameObject + ";";
    }

    @Override
    public String visitCreate_const_int(ChislaLanguageParser.Create_const_intContext ctx) {
        String newInt = visit(ctx.create_int());
        return "final" + " " + newInt;
    }

    @Override
    public String visitCreate_float(ChislaLanguageParser.Create_floatContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (memory.notExistLocaleVariable(name)) {
            memory.addVariableToList(ctx, name, VariableType.FLOAT);
            newVariable = VariableType.FLOAT.toString() + " ";
        }
        String nameObject = visit(ctx.expr());
        return newVariable + name + " = " + nameObject + ";";
    }

    @Override
    public String visitCreate_const_float(ChislaLanguageParser.Create_const_floatContext ctx) {
        String newfloat = visit(ctx.create_float());
        return "final" + " " + newfloat;
    }

    @Override
    public String visitForCond(ChislaLanguageParser.ForCondContext ctx) {
        String id1 = ctx.ID(0).getText();
        //    memory.addToLocalVariableList(left, Type.ELEMENT);
        String id2 = ctx.ID(1).getText();
        String expression = visit(ctx.expr());
        String condition = visit(ctx.condition());
        //     memory.checkVariable(right);
        //    checkCast(right, Type.SET);
        switch (ctx.oper.getType()) {
            case ChislaLanguageParser.INCR:
                return id1 + "=" + expression + "; " + condition + "; " + id2 + "++";

            case ChislaLanguageParser.DECR:
                return id1 + "=" + expression + "; " + condition + "; " + id2 + "--";
            default:
                throw new RuntimeException("Unknown operator: " + ctx.oper.getText());

        }
    }


    @Override
    public String visitPretty_print(ChislaLanguageParser.Pretty_printContext ctx) {
        String variableName = ctx.ID().getText();
        memory.checkVariable(variableName);

        return variableName + ".pretty()";
    }


    @Override
    public String visitNameObjectInt(ChislaLanguageParser.NameObjectIntContext ctx) {

        return ctx.INT().getText();

    }

    public String visitNameObjectFloat(ChislaLanguageParser.NameObjectFloatContext ctx) {

        return ctx.FLOAT().getText();

    }


    @Override
    public String visitPrint(ChislaLanguageParser.PrintContext ctx) {
        return "System.out.println(" + this.visit(ctx.print_expr()) + ");";
    }


    @Override
    public String visitPrintId(ChislaLanguageParser.PrintIdContext ctx) {
        String name = ctx.ID().toString();
        memory.checkVariable(name);
        return name;
    }

    @Override
    public String visitPrintInt(ChislaLanguageParser.PrintIntContext ctx) {
        return ctx.INT().getText();
    }

    @Override
    public String visitPrintFloat(ChislaLanguageParser.PrintFloatContext ctx) {
        return ctx.FLOAT().getText();
    }


    @Override
    public String visitStat_block(ChislaLanguageParser.Stat_blockContext ctx) {
        Map<String, VariableType> beforeStatBlock = new HashMap(memory.localVariable);
        String block = "{\n" + this.visit(ctx.start()) + "}";
        memory.localVariable = beforeStatBlock;
        return block;
    }


    @Override
    public String visitIf_stat(ChislaLanguageParser.If_statContext ctx) {
        String buffer = "";
        List<ChislaLanguageParser.Condition_blockContext> conditions = ctx.condition_block();
        for (int index = 0; index < conditions.size(); index++) {
            String conditionString = this.visit(conditions.get(index).condition());
            String negation = "";
            if (conditions.get(index).NEGATION() != null) {
                negation = "!";
            }
            buffer += "if (" + negation + conditionString + ")";
            buffer += this.visit(conditions.get(index).stat_block());
            if ((index + 1) < conditions.size()) {
                buffer += "else ";
            }
        }
        if (ctx.stat_block() != null) {
            buffer += "else" + this.visit(ctx.stat_block());
        }
        return buffer;
    }

    @Override
    public String visitCondition_block(ChislaLanguageParser.Condition_blockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitEqualityExpr(ChislaLanguageParser.EqualityExprContext ctx) {
        String left = ctx.ID().getText();
        String right = visit(ctx.expr());
        switch (ctx.op.getType()) {
            case ChislaLanguageParser.EQ:
                return left + "==" + right;
            case ChislaLanguageParser.NEQ:
                return left + "!=" + right;
            case ChislaLanguageParser.OANGLEBR:
                return left + "<" + right;
            case ChislaLanguageParser.CANGLEBR:
                return left + ">" + right;
            case ChislaLanguageParser.EQOANGLEBR:
                return left + "<=" + right;
            case ChislaLanguageParser.EQCANGLEBR:
                return left + ">=" + right;
            default:
                throw new RuntimeException("Unknown operator: " + ctx.op.getText());
        }
    }

    @Override
    public String visitCheckType(ChislaLanguageParser.CheckTypeContext ctx) {
        String left = ctx.ID().getText();
        memory.checkVariable(left);
        String right = ctx.type().getText();
        right = handle.getStringWithFirstCapital(right);
        return left + ".getClass().getSimpleName().equals(\"" + right + "\")";
    }

    @Override
    public String visitWhile_stat(ChislaLanguageParser.While_statContext ctx) {
        return "while (" + this.visit(ctx.condition_block().condition()) + ")" +
                this.visit(ctx.condition_block().stat_block());
    }


    @Override
    public String visitFor_stat(ChislaLanguageParser.For_statContext ctx) {
        String cond = visit(ctx.condition_for());
        String forBlock = "for (" + cond + ")" + this.visit(ctx.stat_block());
        return forBlock;
    }


    @Override
    public String visitVoidFunction(ChislaLanguageParser.VoidFunctionContext ctx) {
        memory.clearLocalVariableList();
        String name = ctx.ID().getText();
        memory.addToFunctionList(name, VariableType.VOID);
        return "private static void " + name + this.visit(ctx.param()) + this.visit(ctx.stat_block());
    }

    @Override
    public String visitReturnFunction(ChislaLanguageParser.ReturnFunctionContext ctx) {
        memory.clearLocalVariableList();
        String name = ctx.ID().getText();
        String returnType = ctx.type().getText();

        if (returnType.equals("flt")) {
            returnType = "float";
        }
            memory.addToFunctionList(name, VariableType.getTypeByString(returnType));
            return "private static " + returnType + " " + name +
                    this.visit(ctx.param()) +
                    this.visit(ctx.stat_block_with_return());
        }


    @Override
    public String visitStat_block_with_return(ChislaLanguageParser.Stat_block_with_returnContext ctx) {
        return "{\n" + this.visit(ctx.start()) + this.visit(ctx.return_id()) + "}";
    }

    @Override
    public String visitReturn_id(ChislaLanguageParser.Return_idContext ctx) {
        String id = ctx.ID().getText();
        memory.checkVariable(id);
        ChislaLanguageParser.ReturnFunctionContext context = (ChislaLanguageParser.ReturnFunctionContext) ctx.getParent().getParent();
        memory.checkCast(id, VariableType.getTypeByString(handle.getStringWithFirstCapital(context.type().getText())));
        return "return " + id + ";\n";
    }

    @Override
    public String visitFunction_call(ChislaLanguageParser.Function_callContext ctx) {
        String name = ctx.ID().getText();
        memory.checkFunction(name);
        return name + this.visit(ctx.param_call());
    }

    @Override
    public String visitCall(ChislaLanguageParser.CallContext ctx) {
        String name = ctx.ID().getText();
        String arg = visit(ctx.expr());
        memory.checkFunction(name);
        return name + "(" + arg + ")" ;
    }

    @Override
    public String visitParam_call(ChislaLanguageParser.Param_callContext ctx) {
        String args = "";
        if (ctx.arg_call() != null) {
            args = this.visit(ctx.arg_call());
        }
        return "(" + args + ");";
    }

    @Override
    public String visitParamCallArgs(ChislaLanguageParser.ParamCallArgsContext ctx) {
        String name = ctx.ID().getText();
        memory.checkVariable(name);
        return name + ", " + this.visit(ctx.arg_call());
    }

    @Override
    public String visitParamCallArg(ChislaLanguageParser.ParamCallArgContext ctx) {
        String name = ctx.ID().getText();
        memory.checkVariable(name);
        return name;
    }

    @Override
    public String visitParam(ChislaLanguageParser.ParamContext ctx) {
        String args = "";
        if (ctx.arg() != null) {
            args = this.visit(ctx.arg());
        }
        return "(" + args + ")";
    }

    @Override
    public String visitParamArgs(ChislaLanguageParser.ParamArgsContext ctx) {
        String type = ctx.type().getText();
        type = handle.getStringWithFirstCapital(type);
        String name = ctx.ID().getText();
        memory.addToLocalVariableList(name, VariableType.getTypeByString(type));
        return type + " " + name + ", " + this.visit(ctx.arg());
    }

    @Override
    public String visitParamArg(ChislaLanguageParser.ParamArgContext ctx) {
        String type = ctx.type().getText();
        type = handle.getStringWithFirstCapital(type);
        String name = ctx.ID().getText();
        memory.addToLocalVariableList(name, VariableType.getTypeByString(type));
        if (type.equals("Flt")) {
            type = "float";
        } else if (type.equals("Int")) {
            type = "int";
        }
        return type + " " + name;
    }

    @Override
    public String visitAddSub(ChislaLanguageParser.AddSubContext ctx) {
        String left = visit(ctx.expr(0));  // get value of left subexpression
        String right = visit(ctx.expr(1)); // get value of right subexpression
        if (ctx.op.getType() == ChislaLanguageParser.ADD) return left + "+" + right;
        return left + "-" + right; // must be SUB
    }

    @Override
    public String visitUnary(ChislaLanguageParser.UnaryContext ctx) {
        String buff = visit(ctx.expr());
        if (ctx.op.getType() == ChislaLanguageParser.ADD) return "+" + buff;
        return "-" + buff;
    }

    @Override
    public String visitPowExpr(ChislaLanguageParser.PowExprContext ctx) {
        String left = visit(ctx.expr(0));  // get value of left subexpression
        String right = visit(ctx.expr(1)); // get value of right subexpression
        return left + "^" + right;
    }

    @Override
    public String visitAssignExpr(ChislaLanguageParser.AssignExprContext ctx) {
        String left = ctx.ID().getText();
        ;  // get value of left subexpression
        String right = visit(ctx.expr()); // get value of right subexpression
        return left + "=" + right + ";";
    }

    @Override
    public String visitPrim(ChislaLanguageParser.PrimContext ctx) {
        String buff = visit(ctx.expr());
        return "(" + buff + ")";
    }

    @Override
    public String visitModMulDiv(ChislaLanguageParser.ModMulDivContext ctx) {
        String left = visit(ctx.expr(0));  // get value of left subexpression
        String right = visit(ctx.expr(1)); // get value of right subexpression
        if (ctx.op.getType() == ChislaLanguageParser.MOD) return left + " %" + right;
        if (ctx.op.getType() == ChislaLanguageParser.MUL) return left + "*" + right;
        return left + "/" + right; // must be DIV
    }


    @Override
    public String visitFloatExpr(ChislaLanguageParser.FloatExprContext ctx) {
        String buff = this.visit(ctx.name_object_float());
        return buff + "f";
    }

    @Override
    public String visitIntExrp(ChislaLanguageParser.IntExrpContext ctx) {
        String buff = this.visit(ctx.name_object_int());
        return buff;
    }

    @Override
    public String visitIdExpr(ChislaLanguageParser.IdExprContext ctx) {
        String name = ctx.ID().getText();
        return name;
    }


    @Override
    public String visitTypeConversion(ChislaLanguageParser.TypeConversionContext ctx) {
        String type = "";
        String buffer = visit(ctx.expr());
        if (ctx.tp.getType() == ChislaLanguageParser.FLOAT_TYPE) type = "float";
        else type = "int";
        return "(" + type + ")" + buffer;
    }

    private String replaceDot(String string) {
        return string.replaceAll("[.]", "_");
    }
}
