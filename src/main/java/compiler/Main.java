package compiler;

import compiler.language.ChislaLanguageLexer;
import compiler.language.ChislaLanguageParser;
import compiler.language.ChislaLanguageVisitor;
import compiler.visitor.Visitor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        ChislaLanguageLexer lexer = null;
        try {
            lexer = new ChislaLanguageLexer(new ANTLRFileStream("test1.ch"));
            ChislaLanguageParser parser = new ChislaLanguageParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.math();
            ChislaLanguageVisitor chislaGrammarVisitor = new Visitor("test1.ch");
            String output = (String) chislaGrammarVisitor.visit(tree);
            PrintWriter printer = null;
            printer = new PrintWriter("MainMath.java");
            printer.print(output);
            int a = 5;
            printer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}