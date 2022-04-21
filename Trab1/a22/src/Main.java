import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import a22.a22Parser;
import a22.a22Lexer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of("src\\prog-1.a22"); //prog-1.a22 needs to be inside "src" folder
        String str = Files.readString(fileName);

        a22Lexer lexer = new a22Lexer(CharStreams.fromString(str));
        a22Parser parser = new a22Parser(new CommonTokenStream(lexer));
        parser.start();
        System.out.println("Parser executed successfully");
    }
}