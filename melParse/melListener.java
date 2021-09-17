// Generated from mel.g4 by ANTLR 4.5.1
package melParse;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link melParser}.
 */
public interface melListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link melParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(melParser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link melParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(melParser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link melParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(melParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link melParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(melParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link melParser#mainDecl}.
	 * @param ctx the parse tree
	 */
	void enterMainDecl(melParser.MainDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link melParser#mainDecl}.
	 * @param ctx the parse tree
	 */
	void exitMainDecl(melParser.MainDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link melParser#formals}.
	 * @param ctx the parse tree
	 */
	void enterFormals(melParser.FormalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link melParser#formals}.
	 * @param ctx the parse tree
	 */
	void exitFormals(melParser.FormalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link melParser#idType}.
	 * @param ctx the parse tree
	 */
	void enterIdType(melParser.IdTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link melParser#idType}.
	 * @param ctx the parse tree
	 */
	void exitIdType(melParser.IdTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleTypeDecl}
	 * labeled alternative in {@link melParser#type}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeDecl(melParser.SimpleTypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleTypeDecl}
	 * labeled alternative in {@link melParser#type}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeDecl(melParser.SimpleTypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link melParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(melParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link melParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(melParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link melParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterStringType(melParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link melParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitStringType(melParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link melParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(melParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link melParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(melParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link melParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(melParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link melParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(melParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarStmnt(melParser.VarStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarStmnt(melParser.VarStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmnt(melParser.IfStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmnt(melParser.IfStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmnt(melParser.WhileStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmnt(melParser.WhileStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmnt(melParser.PrintStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmnt(melParser.PrintStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAssign}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssign(melParser.ArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAssign}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssign(melParser.ArrayAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmnt(melParser.AssignStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmnt(melParser.AssignStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmnt(melParser.ExpressionStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmnt(melParser.ExpressionStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmnt(melParser.ReturnStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmnt(melParser.ReturnStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmnt(melParser.BreakStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmnt(melParser.BreakStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmnt(melParser.ContinueStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStmnt}
	 * labeled alternative in {@link melParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmnt(melParser.ContinueStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolOr}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolOr(melParser.BoolOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolOr}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolOr(melParser.BoolOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestExp}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNestExp(melParser.NestExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestExp}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNestExp(melParser.NestExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolEq}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolEq(melParser.BoolEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolEq}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolEq(melParser.BoolEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplicative}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(melParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplicative}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(melParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Additive}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive(melParser.AdditiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Additive}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive(melParser.AdditiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExp}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExp(melParser.NotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExp}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExp(melParser.NotExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ident}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdent(melParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ident}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdent(melParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(melParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(melParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolAnd}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolAnd(melParser.BoolAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolAnd}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolAnd(melParser.BoolAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code False}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFalse(melParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code False}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFalse(melParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLit}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringLit(melParser.StringLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLit}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringLit(melParser.StringLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolRel}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolRel(melParser.BoolRelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolRel}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolRel(melParser.BoolRelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLookup}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLookup(melParser.ArrayLookupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLookup}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLookup(melParser.ArrayLookupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code True}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrue(melParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code True}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrue(melParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInteger(melParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link melParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInteger(melParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link melParser#exps}.
	 * @param ctx the parse tree
	 */
	void enterExps(melParser.ExpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link melParser#exps}.
	 * @param ctx the parse tree
	 */
	void exitExps(melParser.ExpsContext ctx);
}