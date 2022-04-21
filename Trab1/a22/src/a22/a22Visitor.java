// Generated from C:/Users/rafad/OneDrive/Documentos/3ano_2semestre/Compiladores/a22/src\a22.g4 by ANTLR 4.9.2
package a22;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link a22Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface a22Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link a22Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(a22Parser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(a22Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#declaring_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaring_data(a22Parser.Declaring_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(a22Parser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#int_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_expression(a22Parser.Int_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#real_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_expression(a22Parser.Real_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#bool_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expression(a22Parser.Bool_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#bool_comparators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_comparators(a22Parser.Bool_comparatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#string_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_expression(a22Parser.String_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#stored_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStored_values(a22Parser.Stored_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#stored_values1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStored_values1(a22Parser.Stored_values1Context ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#declare_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_variables(a22Parser.Declare_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#declare_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_types(a22Parser.Declare_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#attribution_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribution_instruction(a22Parser.Attribution_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#attribution_no_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribution_no_semicolon(a22Parser.Attribution_no_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#if_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_instruction(a22Parser.If_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#while_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_instruction(a22Parser.While_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#for_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_instruction(a22Parser.For_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#return_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_instruction(a22Parser.Return_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#expression_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_instruction(a22Parser.Expression_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#block_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_instruction(a22Parser.Block_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#semicolon_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon_instruction(a22Parser.Semicolon_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link a22Parser#defining_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefining_functions(a22Parser.Defining_functionsContext ctx);
}