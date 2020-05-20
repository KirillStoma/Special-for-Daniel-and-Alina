
package compiler.language;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ChislaLanguageParser}.
 */
public interface ChislaLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(ChislaLanguageParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(ChislaLanguageParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ChislaLanguageParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ChislaLanguageParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ChislaLanguageParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ChislaLanguageParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(ChislaLanguageParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(ChislaLanguageParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(ChislaLanguageParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(ChislaLanguageParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModMulDiv}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModMulDiv(ChislaLanguageParser.ModMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModMulDiv}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModMulDiv(ChislaLanguageParser.ModMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloatExpr(ChislaLanguageParser.FloatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloatExpr(ChislaLanguageParser.FloatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prim}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrim(ChislaLanguageParser.PrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prim}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrim(ChislaLanguageParser.PrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ChislaLanguageParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ChislaLanguageParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExrp}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntExrp(ChislaLanguageParser.IntExrpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExrp}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntExrp(ChislaLanguageParser.IntExrpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversion(ChislaLanguageParser.TypeConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversion(ChislaLanguageParser.TypeConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(ChislaLanguageParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(ChislaLanguageParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(ChislaLanguageParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(ChislaLanguageParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(ChislaLanguageParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(ChislaLanguageParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(ChislaLanguageParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(ChislaLanguageParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(ChislaLanguageParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(ChislaLanguageParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#create_int}.
	 * @param ctx the parse tree
	 */
	void enterCreate_int(ChislaLanguageParser.Create_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#create_int}.
	 * @param ctx the parse tree
	 */
	void exitCreate_int(ChislaLanguageParser.Create_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#create_const_int}.
	 * @param ctx the parse tree
	 */
	void enterCreate_const_int(ChislaLanguageParser.Create_const_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#create_const_int}.
	 * @param ctx the parse tree
	 */
	void exitCreate_const_int(ChislaLanguageParser.Create_const_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#create_float}.
	 * @param ctx the parse tree
	 */
	void enterCreate_float(ChislaLanguageParser.Create_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#create_float}.
	 * @param ctx the parse tree
	 */
	void exitCreate_float(ChislaLanguageParser.Create_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#create_const_float}.
	 * @param ctx the parse tree
	 */
	void enterCreate_const_float(ChislaLanguageParser.Create_const_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#create_const_float}.
	 * @param ctx the parse tree
	 */
	void exitCreate_const_float(ChislaLanguageParser.Create_const_floatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameObjectInt}
	 * labeled alternative in {@link ChislaLanguageParser#name_object_int}.
	 * @param ctx the parse tree
	 */
	void enterNameObjectInt(ChislaLanguageParser.NameObjectIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameObjectInt}
	 * labeled alternative in {@link ChislaLanguageParser#name_object_int}.
	 * @param ctx the parse tree
	 */
	void exitNameObjectInt(ChislaLanguageParser.NameObjectIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameObjectFloat}
	 * labeled alternative in {@link ChislaLanguageParser#name_object_float}.
	 * @param ctx the parse tree
	 */
	void enterNameObjectFloat(ChislaLanguageParser.NameObjectFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameObjectFloat}
	 * labeled alternative in {@link ChislaLanguageParser#name_object_float}.
	 * @param ctx the parse tree
	 */
	void exitNameObjectFloat(ChislaLanguageParser.NameObjectFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(ChislaLanguageParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(ChislaLanguageParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(ChislaLanguageParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(ChislaLanguageParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(ChislaLanguageParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(ChislaLanguageParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(ChislaLanguageParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(ChislaLanguageParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(ChislaLanguageParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(ChislaLanguageParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forCond}
	 * labeled alternative in {@link ChislaLanguageParser#condition_for}.
	 * @param ctx the parse tree
	 */
	void enterForCond(ChislaLanguageParser.ForCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forCond}
	 * labeled alternative in {@link ChislaLanguageParser#condition_for}.
	 * @param ctx the parse tree
	 */
	void exitForCond(ChislaLanguageParser.ForCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link ChislaLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(ChislaLanguageParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link ChislaLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(ChislaLanguageParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link ChislaLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCheckType(ChislaLanguageParser.CheckTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link ChislaLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCheckType(ChislaLanguageParser.CheckTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ChislaLanguageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ChislaLanguageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printId}
	 * labeled alternative in {@link ChislaLanguageParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintId(ChislaLanguageParser.PrintIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link ChislaLanguageParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintId(ChislaLanguageParser.PrintIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link ChislaLanguageParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintInt(ChislaLanguageParser.PrintIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link ChislaLanguageParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintInt(ChislaLanguageParser.PrintIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFloat}
	 * labeled alternative in {@link ChislaLanguageParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintFloat(ChislaLanguageParser.PrintFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFloat}
	 * labeled alternative in {@link ChislaLanguageParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintFloat(ChislaLanguageParser.PrintFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pretty_print}
	 * labeled alternative in {@link ChislaLanguageParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPretty_print(ChislaLanguageParser.Pretty_printContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pretty_print}
	 * labeled alternative in {@link ChislaLanguageParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPretty_print(ChislaLanguageParser.Pretty_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(ChislaLanguageParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(ChislaLanguageParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#param_call}.
	 * @param ctx the parse tree
	 */
	void enterParam_call(ChislaLanguageParser.Param_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#param_call}.
	 * @param ctx the parse tree
	 */
	void exitParam_call(ChislaLanguageParser.Param_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link ChislaLanguageParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void enterParamCallArg(ChislaLanguageParser.ParamCallArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link ChislaLanguageParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void exitParamCallArg(ChislaLanguageParser.ParamCallArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link ChislaLanguageParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void enterParamCallArgs(ChislaLanguageParser.ParamCallArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link ChislaLanguageParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void exitParamCallArgs(ChislaLanguageParser.ParamCallArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link ChislaLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunction(ChislaLanguageParser.VoidFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link ChislaLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunction(ChislaLanguageParser.VoidFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link ChislaLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunction(ChislaLanguageParser.ReturnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link ChislaLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunction(ChislaLanguageParser.ReturnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 */
	void enterStat_block_with_return(ChislaLanguageParser.Stat_block_with_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 */
	void exitStat_block_with_return(ChislaLanguageParser.Stat_block_with_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#return_id}.
	 * @param ctx the parse tree
	 */
	void enterReturn_id(ChislaLanguageParser.Return_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#return_id}.
	 * @param ctx the parse tree
	 */
	void exitReturn_id(ChislaLanguageParser.Return_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ChislaLanguageParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ChislaLanguageParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link ChislaLanguageParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterParamArg(ChislaLanguageParser.ParamArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link ChislaLanguageParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitParamArg(ChislaLanguageParser.ParamArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link ChislaLanguageParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterParamArgs(ChislaLanguageParser.ParamArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link ChislaLanguageParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitParamArgs(ChislaLanguageParser.ParamArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChislaLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ChislaLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChislaLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ChislaLanguageParser.TypeContext ctx);
}