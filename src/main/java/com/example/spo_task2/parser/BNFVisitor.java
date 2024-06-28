// Generated from C:/Users/dange/YandexDisk/�����/3 ����/SystemProgramObespechenie/SPO_task2/src/main/java/com/example/spo_task2/BNF.g4 by ANTLR 4.13.1
package com.example.spo_task2.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BNFParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BNFVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BNFParser#language}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage(BNFParser.LanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFParser#plenty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlenty(BNFParser.PlentyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFParser#slag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlag(BNFParser.SlagContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper(BNFParser.OperContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFParser#rightPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightPart(BNFParser.RightPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFParser#part1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart1(BNFParser.Part1Context ctx);
	/**
	 * Visit a parse tree produced by {@link BNFParser#part2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart2(BNFParser.Part2Context ctx);
	/**
	 * Visit a parse tree produced by {@link BNFParser#part3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart3(BNFParser.Part3Context ctx);
	/**
	 * Visit a parse tree produced by {@link BNFParser#part4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart4(BNFParser.Part4Context ctx);
	/**
	 * Visit a parse tree produced by {@link BNFParser#perem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerem(BNFParser.PeremContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(BNFParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BNFParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFParser#numb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumb(BNFParser.NumbContext ctx);
}