import melParse.melLexer;
import melParse.melParser;
import melPrettyPrinter.melLispPrinter;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class melMain {

	public static void main( String[] args ) throws Exception {
		String inputFile = null;
		if( args.length > 0 ) {
			inputFile = args[ 0 ];
		}

		InputStream is = System.in;
		PrintStream os = System.out;

		if( inputFile != null ) {
			is = new FileInputStream( inputFile );
		}

		ANTLRInputStream input = new ANTLRInputStream( is );
		melLexer lexer = new melLexer( input );
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		melParser parser = new melParser( tokens );
		parser.setBuildParseTree( true );
		ParseTree tree = parser.compUnit();

    try {
        ParseTreeWalker walker = new ParseTreeWalker();
        melLispPrinter printer = new melLispPrinter();

        walker.walk( printer, tree );

        System.out.println( printer.getSubtree( tree ) );
    }
    catch( Exception x ) {
        throw new Exception( "Exception processing " + ( ( inputFile != null ) ?
                                                         inputFile : "System.in" ),
                             x );
    }
	}
}
