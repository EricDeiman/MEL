package melPrettyPrinter;

import melParse.melParser;
import melParse.melBaseListener;

import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.STGroup;

import java.util.List;

public class melLispPrinter extends melBaseListener {
    ParseTreeProperty<String> subtrees = new ParseTreeProperty<String>();

    STGroup templates = new STGroupFile( "./melPrettyPrinter/templates.stg" );

    public void setSubtree( ParseTree node, String value ) {
        subtrees.put( node, value );
    }

    public String getSubtree( ParseTree node ) {
        return subtrees.get( node );
    }

    public String makeBinOpExp( String lhs, String op, String rhs ) {
        ST template = templates.getInstanceOf( "binop" );
        return template.add( "lhs", lhs ).add( "op", op ).add( "rhs", rhs ).render();
    }

    // public String formatVarDecls( List<melParser.VarDeclContext> varDecls ) {
    //     ST template = templates.getInstanceOf( "varDecls" );

    //     if( varDecls.size() > 0 ) {
    //         for( melParser.VarDeclContext v : varDecls ) {
    //             template.add( "decl", getSubtree( v ) );
    //         }
    //     }

    //     return template.render();
    // }

    public String formatStatementList( List<melParser.StatementContext> statements ) {
        ST template = templates.getInstanceOf( "statementList" );
        if( statements.size() > 0 ) {
            for( melParser.StatementContext s : statements ) {
                String stmnt = getSubtree( s );
                template.add( "stmnt", stmnt );
            }
        }
        return template.render();
    }

    // Listener interface -----------------------------------------------------------

    // Declarations -------------------------------------------

    public void exitCompUnit( melParser.CompUnitContext ctx ) {
        ST template = templates.getInstanceOf( "compUnit" );
        String main = getSubtree( ctx.mainDecl() );

        template.add( "main", main );

        for( melParser.FuncDeclContext c : ctx.funcDecl() ) {
            template.add( "functions", getSubtree( c ) );
        }
        setSubtree( ctx, template.render() );
    }

    public void exitMainDecl( melParser.MainDeclContext ctx ) {
        String argId = ctx.ID().getText();

        String stmnts = formatStatementList( ctx.statement() );

        ST template = templates.getInstanceOf( "mainDecl" );
        template.add( "arg", argId ).add( "body", stmnts );
        setSubtree( ctx, template.render() );
    }

    public void exitFuncDecl( melParser.FuncDeclContext ctx ) {
        String type = ctx.type().getText();
        String id = ctx.ID().getText();
        String formals = getSubtree( ctx.formals() );

        String stmnts = formatStatementList( ctx.statement() );

        ST template = templates.getInstanceOf( "funcDecl" );

        template.add( "id", id ).add( "formals", formals ).add( "type", type );
        template.add( "stmnts", stmnts );

        setSubtree( ctx, template.render() );
    }

    public void exitFormals( melParser.FormalsContext ctx ) {
        ST template = templates.getInstanceOf( "formalFormat" );

        for( melParser.IdTypeContext i : ctx.idType() ) {
            String idType = getSubtree( i );
            template.add( "formal",  idType );
        }
        setSubtree( ctx, template.render() );
    }

    public void exitIdType( melParser.IdTypeContext ctx ) {
        ST template = templates.getInstanceOf( "idType" );

        String id = ctx.ID().getText();
        template.add( "id", id );

        String type = getSubtree( ctx.type() );
        template.add( "type", type );

        setSubtree( ctx, template.render() );
    }

    public void exitStringType( melParser.StringTypeContext ctx ) {
        setSubtree( ctx, "string" );
    }

    public void exitIntegerType( melParser.IntegerTypeContext ctx ) {
        setSubtree( ctx, "integer" );
    }

    public void exitBooleanType( melParser.BooleanTypeContext ctx ) {
        setSubtree( ctx, "boolean" );
    }

    public void exitSimpleTypeDecl( melParser.SimpleTypeDeclContext ctx ) {
        setSubtree( ctx, getSubtree( ctx.simpleType() ) );
    }

    public void exitArrayType( melParser.ArrayTypeContext ctx ) {
        String type = getSubtree( ctx.type() );
        String exp = "";
        if( ctx.expression() != null ) {
            exp = getSubtree( ctx.expression() );
        }

        setSubtree( ctx, type + "[" + exp +"]" );
    }

    // public void exitTypeIntArray( melParser.TypeIntArrayContext ctx ) {
    //     setSubtree( ctx, "int[]" );
    // }

    // public void exitTypeLongArray( melParser.TypeLongArrayContext ctx ) {
    //     setSubtree( ctx, "long[]" );
    // }

    // // Statements ----------------------------------------------

    // public void exitBlock( melParser.BlockContext ctx ) {
    //     ST template = templates.getInstanceOf( "block" );

    //     if( ctx.varDecl().size() > 0 ) {
    //         template.add( "varDecl", formatVarDecls( ctx.varDecl() ) );
    //     }

    //     if( ctx.statement().size() > 0 ) {
    //         template.add( "stmnt", formatStatementList( ctx.statement() ) );
    //     }

    //     setSubtree( ctx, template.render() );
    // }

    public void exitIfStmnt( melParser.IfStmntContext ctx ) {
        String cond = getSubtree( ctx.expression() );
        String cons = getSubtree( ctx.statement( 0 ) );
        String altn = null;
        if( ctx.statement().size() > 1 ) {
            altn = getSubtree( ctx.statement( 1 ) );
        }

        ST template = templates.getInstanceOf( "ifStmnt" );
        template.add( "cond", cond ).add( "cons", cons );
        template.add( "alt", altn );

        setSubtree( ctx, template.render() );
    }

    public void exitVarStmnt( melParser.VarStmntContext ctx ) {
        String idType = getSubtree( ctx.idType() );
        String expression = "";
        if( ctx.expression() != null ) {
            expression = getSubtree( ctx.expression() );
        }

        ST template = templates.getInstanceOf( "varStmnt" );
        template.add( "idType", idType ).add( "expr", expression );
        setSubtree( ctx, template.render() );
    }

    public void exitReturnStmnt( melParser.ReturnStmntContext ctx ) {
        String expr = null;
        if( ctx.expression() != null ) {
            expr = getSubtree( ctx.expression() );
        }

        ST template = templates.getInstanceOf( "returnStmnt" );
        template.add( "exp", expr );

        setSubtree( ctx, template.render() );
    }

    public void exitBreakStmnt( melParser.BreakStmntContext ctx ) {
        setSubtree( ctx, "break" );
    }

    public void exitContinueStmnt( melParser.ContinueStmntContext ctx ) {
        setSubtree( ctx, "continue" );
    }

    public void exitWhileStmnt( melParser.WhileStmntContext ctx ) {
        String cond = getSubtree( ctx.expression() );
        String statements = formatStatementList( ctx.statement() );

        ST template = templates.getInstanceOf( "whileStmnt" );
        template.add( "cond", cond ).add( "stmnts", statements );
        setSubtree( ctx, template.render() );
    }

    public void exitPrintStmnt( melParser.PrintStmntContext ctx ) {
        String exp = getSubtree( ctx.expression() );
        ST template = templates.getInstanceOf( "printStmnt" );
        template.add( "e", exp );
        setSubtree( ctx, template.render() );
    }

    public void exitAssignStmnt( melParser.AssignStmntContext ctx ) {
        String id = ctx.ID().getText();
        String exp = getSubtree( ctx.expression() );
        ST template = templates.getInstanceOf( "assignStmnt" );
        template.add( "id", id ).add( "value", exp );
        setSubtree( ctx, template.render() );
    }

    public void exitArrayAssign( melParser.ArrayAssignContext ctx ) {
        String id = ctx.ID().getText();
        String index = getSubtree( ctx.expression( 0 ) );
        String value = getSubtree( ctx.expression( 1 ) );

        ST template = templates.getInstanceOf( "arrayAssignStmnt" );
        template.add( "id", id ).add( "index", index ).add( "value", value );
        setSubtree( ctx, template.render() );
    }

    public void exitExpressionStmnt( melParser.ExpressionStmntContext ctx ) {
        String exp = getSubtree( ctx.expression() );
        setSubtree( ctx, exp );
    }

    // Expressions ----------------------------------------------

    // public void exitLength( melParser.LengthContext ctx ) {
    //     String obj = getSubtree( ctx.exp() );
    //     ST template = templates.getInstanceOf( "lengthExp" );
    //     template.add( "obj", obj );
    //     setSubtree( ctx, template.render() );
    // }

    public void exitFuncCall( melParser.FuncCallContext ctx ) {
        String id = ctx.ID().getText();
        String params = getSubtree( ctx.exps() );

        ST template = templates.getInstanceOf( "funcCall" );
        template.add( "function", id ).add( "params", params );
        setSubtree( ctx, template.render() );
    }

    public void exitArrayLookup( melParser.ArrayLookupContext ctx ) {
        String array = ctx.ID().getText();
        String index = getSubtree( ctx.expression() );

        ST template = templates.getInstanceOf( "arrayLookup" );
        template.add( "obj", array ).add( "index", index );

        setSubtree( ctx, template.render() );
    }

    public void exitNot( melParser.NotExpContext ctx ) {
        String exp = getSubtree( ctx.expression() );
        ST template = templates.getInstanceOf( "notExp" );
        template.add( "e", exp );
        setSubtree( ctx, template.render() );
    }

    // public void exitNewIntArray( melParser.NewIntArrayContext ctx ) {
    //     String size = getSubtree( ctx.exp() );
    //     ST template = templates.getInstanceOf( "newArray" );
    //     template.add( "type", "int" ).add( "size", size );
    //     setSubtree( ctx, template.render() );
    // }

    // public void exitNewLongArray( melParser.NewLongArrayContext ctx ) {
    //     String size = getSubtree( ctx.exp() );
    //     ST template = templates.getInstanceOf( "newArray" );
    //     template.add( "type", "long" ).add( "size", size );
    //     setSubtree( ctx, template.render() );
    // }

    public void exitMultiplicative( melParser.MultiplicativeContext ctx ) {
        String lhs = getSubtree( ctx.expression( 0 ) );
        String rhs = getSubtree( ctx.expression( 1 ) );
        setSubtree( ctx, makeBinOpExp( lhs, "*", rhs ) );
    }

    public void exitAdditive( melParser.AdditiveContext ctx ) {
        String lhs = getSubtree( ctx.expression( 0 ) );
        String rhs = getSubtree( ctx.expression( 1 ) );
        String op = ctx.op.getText();
        setSubtree( ctx, makeBinOpExp( lhs, op, rhs ) );
    }

    public void exitBoolEq( melParser.BoolEqContext ctx ) {
        String lhs = getSubtree( ctx.expression( 0 ) );
        String rhs = getSubtree( ctx.expression( 1 ) );
        String op = ctx.op.getText();
        setSubtree( ctx, makeBinOpExp( lhs, op, rhs ) );
    }

    public void exitBoolRel( melParser.BoolRelContext ctx ) {
        String lhs = getSubtree( ctx.expression( 0 ) );
        String rhs = getSubtree( ctx.expression( 1 ) );
        String op = ctx.op.getText();
        setSubtree( ctx, makeBinOpExp( lhs, op, rhs ) );
    }

    public void exitBoolAnd( melParser.BoolAndContext ctx ) {
        String lhs = getSubtree( ctx.expression( 0 ) );
        String rhs = getSubtree( ctx.expression( 1 ) );
        setSubtree( ctx, makeBinOpExp( lhs, "and", rhs ) );
    }

    public void exitBoolOr( melParser.BoolOrContext ctx ) {
        String lhs = getSubtree( ctx.expression( 0 ) );
        String rhs = getSubtree( ctx.expression( 1 ) );
        setSubtree( ctx, makeBinOpExp( lhs, "or", rhs ) );
    }

    public void exitInteger( melParser.IntegerContext ctx ) {
        setSubtree( ctx, ctx.INTLIT().getText() );
    }

    public void exitTrue( melParser.TrueContext ctx ) {
        setSubtree( ctx, "true" );
    }

    public void exitFalse( melParser.FalseContext ctx ) {
        setSubtree( ctx, "false" );
    }

    public void exitIdent( melParser.IdentContext ctx ) {
        setSubtree( ctx, ctx.ID().getText() );
    }

    public void exitStringLit( melParser.StringLitContext ctx ) {
        setSubtree( ctx, ctx.STRINGLIT().getText() );
    }

    public void exitNestExp( melParser.NestExpContext ctx ) {
        setSubtree( ctx, getSubtree( ctx.expression() ) );
    }

    public void exitExps( melParser.ExpsContext ctx ) {
        StringBuffer sb = new StringBuffer();
        for(melParser.ExpressionContext c : ctx.expression() ) {
            if( sb.length() > 0 ) {
                sb.append( " " );
            }
            sb.append( getSubtree( c ) );
        }
        setSubtree( ctx, sb.toString() );
    }
}
