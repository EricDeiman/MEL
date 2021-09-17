// Generated from mel.g4 by ANTLR 4.5.1
package melParse;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class melParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, FN=2, END=3, IF=4, THEN=5, ELSE=6, TRUE=7, FALSE=8, STRING=9, 
		INTEGER=10, BOOLEAN=11, PRINT=12, LENGTH=13, RETURN=14, VAR=15, WHILE=16, 
		ARRAY=17, OF=18, BREAK=19, CONTINUE=20, LB=21, RB=22, LP=23, RP=24, LS=25, 
		RS=26, SEMI=27, COLON=28, COMMA=29, EQ=30, ASSIGN=31, NEQ=32, TIMES=33, 
		PLUS=34, MINUS=35, DOT=36, BANG=37, LT=38, LTE=39, GT=40, GTE=41, AND=42, 
		OR=43, INTLIT=44, ID=45, STRINGLIT=46, WS=47, CEOL=48;
	public static final int
		RULE_compUnit = 0, RULE_funcDecl = 1, RULE_mainDecl = 2, RULE_formals = 3, 
		RULE_idType = 4, RULE_type = 5, RULE_simpleType = 6, RULE_statement = 7, 
		RULE_expression = 8, RULE_exps = 9;
	public static final String[] ruleNames = {
		"compUnit", "funcDecl", "mainDecl", "formals", "idType", "type", "simpleType", 
		"statement", "expression", "exps"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'fn'", "'end'", "'if'", "'then'", "'else'", "'true'", 
		"'false'", "'string'", "'integer'", "'boolean'", "'print'", "'length'", 
		"'return'", "'var'", "'while'", "'array'", "'of'", "'break'", "'continue'", 
		"'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "':'", "','", "'='", 
		"'<-'", "'!='", "'*'", "'+'", "'-'", "'.'", "'!'", "'<'", "'<='", "'>'", 
		"'>='", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MAIN", "FN", "END", "IF", "THEN", "ELSE", "TRUE", "FALSE", "STRING", 
		"INTEGER", "BOOLEAN", "PRINT", "LENGTH", "RETURN", "VAR", "WHILE", "ARRAY", 
		"OF", "BREAK", "CONTINUE", "LB", "RB", "LP", "RP", "LS", "RS", "SEMI", 
		"COLON", "COMMA", "EQ", "ASSIGN", "NEQ", "TIMES", "PLUS", "MINUS", "DOT", 
		"BANG", "LT", "LTE", "GT", "GTE", "AND", "OR", "INTLIT", "ID", "STRINGLIT", 
		"WS", "CEOL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "mel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public melParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompUnitContext extends ParserRuleContext {
		public MainDeclContext mainDecl() {
			return getRuleContext(MainDeclContext.class,0);
		}
		public TerminalNode EOF() { return getToken(melParser.EOF, 0); }
		public List<FuncDeclContext> funcDecl() {
			return getRuleContexts(FuncDeclContext.class);
		}
		public FuncDeclContext funcDecl(int i) {
			return getRuleContext(FuncDeclContext.class,i);
		}
		public CompUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterCompUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitCompUnit(this);
		}
	}

	public final CompUnitContext compUnit() throws RecognitionException {
		CompUnitContext _localctx = new CompUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compUnit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(20);
					funcDecl();
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(26);
			mainDecl();
			setState(27);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(melParser.ID, 0); }
		public FormalsContext formals() {
			return getRuleContext(FormalsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitFuncDecl(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(FN);
			setState(30);
			match(ID);
			setState(31);
			match(LP);
			setState(32);
			formals();
			setState(33);
			match(RP);
			setState(34);
			match(COLON);
			setState(35);
			type();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << RETURN) | (1L << VAR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << LP) | (1L << BANG) | (1L << INTLIT) | (1L << ID) | (1L << STRINGLIT))) != 0)) {
				{
				{
				setState(36);
				statement();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(melParser.ID, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterMainDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitMainDecl(this);
		}
	}

	public final MainDeclContext mainDecl() throws RecognitionException {
		MainDeclContext _localctx = new MainDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(FN);
			setState(45);
			match(MAIN);
			setState(46);
			match(LP);
			setState(47);
			match(ID);
			setState(48);
			match(COLON);
			setState(49);
			match(ARRAY);
			setState(50);
			match(LS);
			setState(51);
			match(RS);
			setState(52);
			match(OF);
			setState(53);
			match(STRING);
			setState(54);
			match(RP);
			setState(55);
			match(COLON);
			setState(56);
			match(INTEGER);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << RETURN) | (1L << VAR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << LP) | (1L << BANG) | (1L << INTLIT) | (1L << ID) | (1L << STRINGLIT))) != 0)) {
				{
				{
				setState(57);
				statement();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalsContext extends ParserRuleContext {
		public List<IdTypeContext> idType() {
			return getRuleContexts(IdTypeContext.class);
		}
		public IdTypeContext idType(int i) {
			return getRuleContext(IdTypeContext.class,i);
		}
		public FormalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterFormals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitFormals(this);
		}
	}

	public final FormalsContext formals() throws RecognitionException {
		FormalsContext _localctx = new FormalsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(65);
				idType();
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(66);
					match(COMMA);
					setState(67);
					idType();
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(melParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterIdType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitIdType(this);
		}
	}

	public final IdTypeContext idType() throws RecognitionException {
		IdTypeContext _localctx = new IdTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_idType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ID);
			setState(76);
			match(COLON);
			setState(77);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeContext extends TypeContext {
		public TerminalNode ARRAY() { return getToken(melParser.ARRAY, 0); }
		public TerminalNode OF() { return getToken(melParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitArrayType(this);
		}
	}
	public static class SimpleTypeDeclContext extends TypeContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public SimpleTypeDeclContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterSimpleTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitSimpleTypeDecl(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			setState(88);
			switch (_input.LA(1)) {
			case STRING:
			case INTEGER:
			case BOOLEAN:
				_localctx = new SimpleTypeDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				simpleType();
				}
				break;
			case ARRAY:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(ARRAY);
				setState(81);
				match(LS);
				setState(83);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << LP) | (1L << BANG) | (1L << INTLIT) | (1L << ID) | (1L << STRINGLIT))) != 0)) {
					{
					setState(82);
					expression(0);
					}
				}

				setState(85);
				match(RS);
				setState(86);
				match(OF);
				setState(87);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeContext extends ParserRuleContext {
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	 
		public SimpleTypeContext() { }
		public void copyFrom(SimpleTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerTypeContext extends SimpleTypeContext {
		public TerminalNode INTEGER() { return getToken(melParser.INTEGER, 0); }
		public IntegerTypeContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitIntegerType(this);
		}
	}
	public static class StringTypeContext extends SimpleTypeContext {
		public TerminalNode STRING() { return getToken(melParser.STRING, 0); }
		public StringTypeContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitStringType(this);
		}
	}
	public static class BooleanTypeContext extends SimpleTypeContext {
		public TerminalNode BOOLEAN() { return getToken(melParser.BOOLEAN, 0); }
		public BooleanTypeContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitBooleanType(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simpleType);
		try {
			setState(93);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(STRING);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(INTEGER);
				}
				break;
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarStmntContext extends StatementContext {
		public IdTypeContext idType() {
			return getRuleContext(IdTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarStmntContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterVarStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitVarStmnt(this);
		}
	}
	public static class IfStmntContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStmntContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterIfStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitIfStmnt(this);
		}
	}
	public static class BreakStmntContext extends StatementContext {
		public BreakStmntContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterBreakStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitBreakStmnt(this);
		}
	}
	public static class ExpressionStmntContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmntContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterExpressionStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitExpressionStmnt(this);
		}
	}
	public static class AssignStmntContext extends StatementContext {
		public TerminalNode ID() { return getToken(melParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignStmntContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterAssignStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitAssignStmnt(this);
		}
	}
	public static class PrintStmntContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStmntContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterPrintStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitPrintStmnt(this);
		}
	}
	public static class ArrayAssignContext extends StatementContext {
		public TerminalNode ID() { return getToken(melParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterArrayAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitArrayAssign(this);
		}
	}
	public static class ContinueStmntContext extends StatementContext {
		public ContinueStmntContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterContinueStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitContinueStmnt(this);
		}
	}
	public static class ReturnStmntContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmntContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterReturnStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitReturnStmnt(this);
		}
	}
	public static class WhileStmntContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStmntContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterWhileStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitWhileStmnt(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new VarStmntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(VAR);
				setState(96);
				idType();
				setState(99);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(97);
					match(ASSIGN);
					setState(98);
					expression(0);
					}
				}

				setState(101);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new IfStmntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(IF);
				setState(104);
				expression(0);
				setState(105);
				match(THEN);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << RETURN) | (1L << VAR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << LP) | (1L << BANG) | (1L << INTLIT) | (1L << ID) | (1L << STRINGLIT))) != 0)) {
					{
					{
					setState(106);
					statement();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(112);
					match(ELSE);
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << RETURN) | (1L << VAR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << LP) | (1L << BANG) | (1L << INTLIT) | (1L << ID) | (1L << STRINGLIT))) != 0)) {
						{
						{
						setState(113);
						statement();
						}
						}
						setState(118);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(121);
				match(END);
				}
				break;
			case 3:
				_localctx = new WhileStmntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(WHILE);
				setState(124);
				expression(0);
				setState(125);
				match(THEN);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << RETURN) | (1L << VAR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << LP) | (1L << BANG) | (1L << INTLIT) | (1L << ID) | (1L << STRINGLIT))) != 0)) {
					{
					{
					setState(126);
					statement();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				match(END);
				}
				break;
			case 4:
				_localctx = new PrintStmntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(PRINT);
				setState(135);
				match(LP);
				setState(136);
				expression(0);
				setState(137);
				match(RP);
				setState(138);
				match(SEMI);
				}
				break;
			case 5:
				_localctx = new ArrayAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(ID);
				setState(141);
				match(LS);
				setState(142);
				expression(0);
				setState(143);
				match(RS);
				setState(144);
				match(ASSIGN);
				setState(145);
				expression(0);
				setState(146);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new AssignStmntContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				match(ID);
				setState(149);
				match(ASSIGN);
				setState(150);
				expression(0);
				setState(151);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new ExpressionStmntContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(153);
				expression(0);
				setState(154);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new ReturnStmntContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				match(RETURN);
				setState(158);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << LP) | (1L << BANG) | (1L << INTLIT) | (1L << ID) | (1L << STRINGLIT))) != 0)) {
					{
					setState(157);
					expression(0);
					}
				}

				setState(160);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new BreakStmntContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(161);
				match(BREAK);
				setState(162);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new ContinueStmntContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(163);
				match(CONTINUE);
				setState(164);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterBoolOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitBoolOr(this);
		}
	}
	public static class NestExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NestExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterNestExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitNestExp(this);
		}
	}
	public static class BoolEqContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolEqContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterBoolEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitBoolEq(this);
		}
	}
	public static class MultiplicativeContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplicativeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitMultiplicative(this);
		}
	}
	public static class AdditiveContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AdditiveContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitAdditive(this);
		}
	}
	public static class NotExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterNotExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitNotExp(this);
		}
	}
	public static class IdentContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(melParser.ID, 0); }
		public IdentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitIdent(this);
		}
	}
	public static class FuncCallContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(melParser.ID, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public FuncCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitFuncCall(this);
		}
	}
	public static class BoolAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterBoolAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitBoolAnd(this);
		}
	}
	public static class FalseContext extends ExpressionContext {
		public FalseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitFalse(this);
		}
	}
	public static class StringLitContext extends ExpressionContext {
		public TerminalNode STRINGLIT() { return getToken(melParser.STRINGLIT, 0); }
		public StringLitContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterStringLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitStringLit(this);
		}
	}
	public static class ArrayLookupContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(melParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLookupContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterArrayLookup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitArrayLookup(this);
		}
	}
	public static class BoolRelContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolRelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterBoolRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitBoolRel(this);
		}
	}
	public static class TrueContext extends ExpressionContext {
		public TrueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitTrue(this);
		}
	}
	public static class IntegerContext extends ExpressionContext {
		public TerminalNode INTLIT() { return getToken(melParser.INTLIT, 0); }
		public IntegerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitInteger(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(168);
				match(BANG);
				setState(169);
				expression(15);
				}
				break;
			case 2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(ID);
				setState(171);
				match(LP);
				setState(172);
				exps();
				setState(173);
				match(RP);
				}
				break;
			case 3:
				{
				_localctx = new ArrayLookupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(ID);
				setState(176);
				match(LS);
				setState(177);
				expression(0);
				setState(178);
				match(RS);
				}
				break;
			case 4:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(INTLIT);
				}
				break;
			case 5:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(TRUE);
				}
				break;
			case 6:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(FALSE);
				}
				break;
			case 7:
				{
				_localctx = new IdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new StringLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(STRINGLIT);
				}
				break;
			case 9:
				{
				_localctx = new NestExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(LP);
				setState(186);
				expression(0);
				setState(187);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(192);
						match(TIMES);
						setState(193);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(195);
						((AdditiveContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(196);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new BoolEqContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(198);
						((BoolEqContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((BoolEqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(199);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new BoolRelContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(201);
						((BoolRelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE))) != 0)) ) {
							((BoolRelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(202);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new BoolAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(204);
						match(AND);
						setState(205);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new BoolOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(207);
						match(OR);
						setState(208);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).enterExps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof melListener ) ((melListener)listener).exitExps(this);
		}
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << LP) | (1L << BANG) | (1L << INTLIT) | (1L << ID) | (1L << STRINGLIT))) != 0)) {
				{
				setState(214);
				expression(0);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(215);
					match(COMMA);
					setState(216);
					expression(0);
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u00e3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\3\4\3\5\3\5"+
		"\3\5\7\5G\n\5\f\5\16\5J\13\5\5\5L\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\5\7V\n\7\3\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\5\b`\n\b\3\t\3\t\3\t\3\t\5"+
		"\tf\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3\t\3\t\7\tu\n"+
		"\t\f\t\16\tx\13\t\5\tz\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0082\n\t\f\t\16"+
		"\t\u0085\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a1\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00a8\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c0\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d4"+
		"\n\n\f\n\16\n\u00d7\13\n\3\13\3\13\3\13\7\13\u00dc\n\13\f\13\16\13\u00df"+
		"\13\13\5\13\u00e1\n\13\3\13\2\3\22\f\2\4\6\b\n\f\16\20\22\24\2\5\3\2$"+
		"%\4\2  \"\"\3\2(+\u0100\2\31\3\2\2\2\4\37\3\2\2\2\6.\3\2\2\2\bK\3\2\2"+
		"\2\nM\3\2\2\2\fZ\3\2\2\2\16_\3\2\2\2\20\u00a7\3\2\2\2\22\u00bf\3\2\2\2"+
		"\24\u00e0\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2"+
		"\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\35\5\6\4\2\35\36\7\2"+
		"\2\3\36\3\3\2\2\2\37 \7\4\2\2 !\7/\2\2!\"\7\31\2\2\"#\5\b\5\2#$\7\32\2"+
		"\2$%\7\36\2\2%)\5\f\7\2&(\5\20\t\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3"+
		"\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\5\2\2-\5\3\2\2\2./\7\4\2\2/\60\7\3\2\2"+
		"\60\61\7\31\2\2\61\62\7/\2\2\62\63\7\36\2\2\63\64\7\23\2\2\64\65\7\33"+
		"\2\2\65\66\7\34\2\2\66\67\7\24\2\2\678\7\13\2\289\7\32\2\29:\7\36\2\2"+
		":>\7\f\2\2;=\5\20\t\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2"+
		"\2@>\3\2\2\2AB\7\5\2\2B\7\3\2\2\2CH\5\n\6\2DE\7\37\2\2EG\5\n\6\2FD\3\2"+
		"\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3\2\2\2KC\3\2\2\2KL\3\2"+
		"\2\2L\t\3\2\2\2MN\7/\2\2NO\7\36\2\2OP\5\f\7\2P\13\3\2\2\2Q[\5\16\b\2R"+
		"S\7\23\2\2SU\7\33\2\2TV\5\22\n\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\34"+
		"\2\2XY\7\24\2\2Y[\5\f\7\2ZQ\3\2\2\2ZR\3\2\2\2[\r\3\2\2\2\\`\7\13\2\2]"+
		"`\7\f\2\2^`\7\r\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\17\3\2\2\2ab\7\21"+
		"\2\2be\5\n\6\2cd\7!\2\2df\5\22\n\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\35"+
		"\2\2h\u00a8\3\2\2\2ij\7\6\2\2jk\5\22\n\2ko\7\7\2\2ln\5\20\t\2ml\3\2\2"+
		"\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2py\3\2\2\2qo\3\2\2\2rv\7\b\2\2su\5\20"+
		"\t\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2yr\3\2"+
		"\2\2yz\3\2\2\2z{\3\2\2\2{|\7\5\2\2|\u00a8\3\2\2\2}~\7\22\2\2~\177\5\22"+
		"\n\2\177\u0083\7\7\2\2\u0080\u0082\5\20\t\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\5\2\2\u0087\u00a8\3\2\2\2\u0088"+
		"\u0089\7\16\2\2\u0089\u008a\7\31\2\2\u008a\u008b\5\22\n\2\u008b\u008c"+
		"\7\32\2\2\u008c\u008d\7\35\2\2\u008d\u00a8\3\2\2\2\u008e\u008f\7/\2\2"+
		"\u008f\u0090\7\33\2\2\u0090\u0091\5\22\n\2\u0091\u0092\7\34\2\2\u0092"+
		"\u0093\7!\2\2\u0093\u0094\5\22\n\2\u0094\u0095\7\35\2\2\u0095\u00a8\3"+
		"\2\2\2\u0096\u0097\7/\2\2\u0097\u0098\7!\2\2\u0098\u0099\5\22\n\2\u0099"+
		"\u009a\7\35\2\2\u009a\u00a8\3\2\2\2\u009b\u009c\5\22\n\2\u009c\u009d\7"+
		"\35\2\2\u009d\u00a8\3\2\2\2\u009e\u00a0\7\20\2\2\u009f\u00a1\5\22\n\2"+
		"\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a8"+
		"\7\35\2\2\u00a3\u00a4\7\25\2\2\u00a4\u00a8\7\35\2\2\u00a5\u00a6\7\26\2"+
		"\2\u00a6\u00a8\7\35\2\2\u00a7a\3\2\2\2\u00a7i\3\2\2\2\u00a7}\3\2\2\2\u00a7"+
		"\u0088\3\2\2\2\u00a7\u008e\3\2\2\2\u00a7\u0096\3\2\2\2\u00a7\u009b\3\2"+
		"\2\2\u00a7\u009e\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\21\3\2\2\2\u00a9\u00aa\b\n\1\2\u00aa\u00ab\7\'\2\2\u00ab\u00c0\5\22\n"+
		"\21\u00ac\u00ad\7/\2\2\u00ad\u00ae\7\31\2\2\u00ae\u00af\5\24\13\2\u00af"+
		"\u00b0\7\32\2\2\u00b0\u00c0\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b3\7\33"+
		"\2\2\u00b3\u00b4\5\22\n\2\u00b4\u00b5\7\34\2\2\u00b5\u00c0\3\2\2\2\u00b6"+
		"\u00c0\7.\2\2\u00b7\u00c0\7\t\2\2\u00b8\u00c0\7\n\2\2\u00b9\u00c0\7/\2"+
		"\2\u00ba\u00c0\7\60\2\2\u00bb\u00bc\7\31\2\2\u00bc\u00bd\5\22\n\2\u00bd"+
		"\u00be\7\32\2\2\u00be\u00c0\3\2\2\2\u00bf\u00a9\3\2\2\2\u00bf\u00ac\3"+
		"\2\2\2\u00bf\u00b1\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf"+
		"\u00b8\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2"+
		"\2\2\u00c0\u00d5\3\2\2\2\u00c1\u00c2\f\16\2\2\u00c2\u00c3\7#\2\2\u00c3"+
		"\u00d4\5\22\n\17\u00c4\u00c5\f\r\2\2\u00c5\u00c6\t\2\2\2\u00c6\u00d4\5"+
		"\22\n\16\u00c7\u00c8\f\f\2\2\u00c8\u00c9\t\3\2\2\u00c9\u00d4\5\22\n\r"+
		"\u00ca\u00cb\f\13\2\2\u00cb\u00cc\t\4\2\2\u00cc\u00d4\5\22\n\f\u00cd\u00ce"+
		"\f\n\2\2\u00ce\u00cf\7,\2\2\u00cf\u00d4\5\22\n\13\u00d0\u00d1\f\t\2\2"+
		"\u00d1\u00d2\7-\2\2\u00d2\u00d4\5\22\n\n\u00d3\u00c1\3\2\2\2\u00d3\u00c4"+
		"\3\2\2\2\u00d3\u00c7\3\2\2\2\u00d3\u00ca\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3"+
		"\u00d0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\23\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00dd\5\22\n\2\u00d9\u00da"+
		"\7\37\2\2\u00da\u00dc\5\22\n\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\25\3\2\2\2\26\31"+
		")>HKUZ_eovy\u0083\u00a0\u00a7\u00bf\u00d3\u00d5\u00dd\u00e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}