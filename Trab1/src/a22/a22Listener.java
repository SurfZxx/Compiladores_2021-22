// Generated from C:/Users/rafad/OneDrive/Documentos/3ano_2semestre/Compiladores/a22/src\a22.g4 by ANTLR 4.9.2
package a22;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link a22Parser}.
 */
public interface a22Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link a22Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(a22Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(a22Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(a22Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(a22Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#declaring_data}.
	 * @param ctx the parse tree
	 */
	void enterDeclaring_data(a22Parser.Declaring_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#declaring_data}.
	 * @param ctx the parse tree
	 */
	void exitDeclaring_data(a22Parser.Declaring_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(a22Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(a22Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#int_expression}.
	 * @param ctx the parse tree
	 */
	void enterInt_expression(a22Parser.Int_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#int_expression}.
	 * @param ctx the parse tree
	 */
	void exitInt_expression(a22Parser.Int_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#real_expression}.
	 * @param ctx the parse tree
	 */
	void enterReal_expression(a22Parser.Real_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#real_expression}.
	 * @param ctx the parse tree
	 */
	void exitReal_expression(a22Parser.Real_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterBool_expression(a22Parser.Bool_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitBool_expression(a22Parser.Bool_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#bool_comparators}.
	 * @param ctx the parse tree
	 */
	void enterBool_comparators(a22Parser.Bool_comparatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#bool_comparators}.
	 * @param ctx the parse tree
	 */
	void exitBool_comparators(a22Parser.Bool_comparatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterString_expression(a22Parser.String_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitString_expression(a22Parser.String_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#stored_values}.
	 * @param ctx the parse tree
	 */
	void enterStored_values(a22Parser.Stored_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#stored_values}.
	 * @param ctx the parse tree
	 */
	void exitStored_values(a22Parser.Stored_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#stored_values1}.
	 * @param ctx the parse tree
	 */
	void enterStored_values1(a22Parser.Stored_values1Context ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#stored_values1}.
	 * @param ctx the parse tree
	 */
	void exitStored_values1(a22Parser.Stored_values1Context ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#declare_variables}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_variables(a22Parser.Declare_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#declare_variables}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_variables(a22Parser.Declare_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#declare_types}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_types(a22Parser.Declare_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#declare_types}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_types(a22Parser.Declare_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#attribution_instruction}.
	 * @param ctx the parse tree
	 */
	void enterAttribution_instruction(a22Parser.Attribution_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#attribution_instruction}.
	 * @param ctx the parse tree
	 */
	void exitAttribution_instruction(a22Parser.Attribution_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#attribution_no_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterAttribution_no_semicolon(a22Parser.Attribution_no_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#attribution_no_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitAttribution_no_semicolon(a22Parser.Attribution_no_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#if_instruction}.
	 * @param ctx the parse tree
	 */
	void enterIf_instruction(a22Parser.If_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#if_instruction}.
	 * @param ctx the parse tree
	 */
	void exitIf_instruction(a22Parser.If_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#while_instruction}.
	 * @param ctx the parse tree
	 */
	void enterWhile_instruction(a22Parser.While_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#while_instruction}.
	 * @param ctx the parse tree
	 */
	void exitWhile_instruction(a22Parser.While_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#for_instruction}.
	 * @param ctx the parse tree
	 */
	void enterFor_instruction(a22Parser.For_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#for_instruction}.
	 * @param ctx the parse tree
	 */
	void exitFor_instruction(a22Parser.For_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#return_instruction}.
	 * @param ctx the parse tree
	 */
	void enterReturn_instruction(a22Parser.Return_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#return_instruction}.
	 * @param ctx the parse tree
	 */
	void exitReturn_instruction(a22Parser.Return_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#expression_instruction}.
	 * @param ctx the parse tree
	 */
	void enterExpression_instruction(a22Parser.Expression_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#expression_instruction}.
	 * @param ctx the parse tree
	 */
	void exitExpression_instruction(a22Parser.Expression_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#block_instruction}.
	 * @param ctx the parse tree
	 */
	void enterBlock_instruction(a22Parser.Block_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#block_instruction}.
	 * @param ctx the parse tree
	 */
	void exitBlock_instruction(a22Parser.Block_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#semicolon_instruction}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon_instruction(a22Parser.Semicolon_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#semicolon_instruction}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon_instruction(a22Parser.Semicolon_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link a22Parser#defining_functions}.
	 * @param ctx the parse tree
	 */
	void enterDefining_functions(a22Parser.Defining_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link a22Parser#defining_functions}.
	 * @param ctx the parse tree
	 */
	void exitDefining_functions(a22Parser.Defining_functionsContext ctx);
}