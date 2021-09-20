/*
  The MEL programming language
  Copyright 2015 Eric J. Deiman

  This file is part of the MEL programming language.
  The MEL programming language is free software: you can redistribute it
  and/ormodify it under the terms of the GNU General Public License as published by the
  Free Software Foundation, either version 3 of the License, or (at your option) any
  later version.

  The MEL programming language is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
  FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
  You should have received a copy of the GNU General Public License along with the
  MEL programming language. If not, see <https://www.gnu.org/licenses/>
*/

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
