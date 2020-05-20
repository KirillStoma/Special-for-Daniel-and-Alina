
package compiler.language;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ChislaLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ChislaLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath(ChislaLanguageParser.MathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(ChislaLanguageParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ChislaLanguageParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(ChislaLanguageParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code call}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(ChislaLanguageParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModMulDiv}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModMulDiv(ChislaLanguageParser.ModMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatExpr(ChislaLanguageParser.FloatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prim}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrim(ChislaLanguageParser.PrimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(ChislaLanguageParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExrp}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExrp(ChislaLanguageParser.IntExrpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConversion(ChislaLanguageParser.TypeConversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(ChislaLanguageParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(ChislaLanguageParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(ChislaLanguageParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ChislaLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(ChislaLanguageParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(ChislaLanguageParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#create_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_int(ChislaLanguageParser.Create_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#create_const_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_const_int(ChislaLanguageParser.Create_const_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#create_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_float(ChislaLanguageParser.Create_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#create_const_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_const_float(ChislaLanguageParser.Create_const_floatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectInt}
	 * labeled alternative in {@link ChislaLanguageParser#name_object_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectInt(ChislaLanguageParser.NameObjectIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectFloat}
	 * labeled alternative in {@link ChislaLanguageParser#name_object_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectFloat(ChislaLanguageParser.NameObjectFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(ChislaLanguageParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(ChislaLanguageParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(ChislaLanguageParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(ChislaLanguageParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(ChislaLanguageParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forCond}
	 * labeled alternative in {@link ChislaLanguageParser#condition_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCond(ChislaLanguageParser.ForCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link ChislaLanguageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(ChislaLanguageParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link ChislaLanguageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckType(ChislaLanguageParser.CheckTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ChislaLanguageParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link ChislaLanguageParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintId(ChislaLanguageParser.PrintIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link ChislaLanguageParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintInt(ChislaLanguageParser.PrintIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFloat}
	 * labeled alternative in {@link ChislaLanguageParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFloat(ChislaLanguageParser.PrintFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pretty_print}
	 * labeled alternative in {@link ChislaLanguageParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPretty_print(ChislaLanguageParser.Pretty_printContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(ChislaLanguageParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#param_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_call(ChislaLanguageParser.Param_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link ChislaLanguageParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArg(ChislaLanguageParser.ParamCallArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link ChislaLanguageParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArgs(ChislaLanguageParser.ParamCallArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link ChislaLanguageParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(ChislaLanguageParser.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link ChislaLanguageParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunction(ChislaLanguageParser.ReturnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block_with_return(ChislaLanguageParser.Stat_block_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#return_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_id(ChislaLanguageParser.Return_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(ChislaLanguageParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link ChislaLanguageParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArg(ChislaLanguageParser.ParamArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link ChislaLanguageParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArgs(ChislaLanguageParser.ParamArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChislaLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ChislaLanguageParser.TypeContext ctx);
}