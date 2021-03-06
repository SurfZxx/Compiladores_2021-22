package com.flobo;

/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/

//import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.*;

import SymbolTable.Symbol;
import cymbol.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class CheckSymbols {
    public static Symbol.Type getType(int tokenType) {
        switch ( tokenType ) {
            case CymbolParser.K_VOID :  return Symbol.Type.tVOID;
            case CymbolParser.K_INT :   return Symbol.Type.tINT;
            case CymbolParser.K_FLOAT : return Symbol.Type.tFLOAT;
        }
        return Symbol.Type.tINVALID;
    }

    public static void error(Token t, String msg) {
        System.err.printf("line %d:%d %s\n", t.getLine(),
                          t.getCharPositionInLine(), msg);
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        try {
            if (inputFile != null) is = new FileInputStream(inputFile);
            CharStream input = CharStreams.fromStream(is);
            CymbolLexer lexer = new CymbolLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CymbolParser parser = new CymbolParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree = parser.file();

            ParseTreeWalker walker = new ParseTreeWalker();
            DefPhase def = new DefPhase();
            walker.walk(def, tree);
            // create next phase and feed symbol table info from def to ref phase
            RefPhase ref = new RefPhase(def.global, def.scopes);
            walker.walk(ref, tree);
        }
        catch (java.io.IOException e) {
            System.out.println(e);
        }
    }

}
