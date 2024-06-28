// Generated from C:/Users/dange/YandexDisk/�����/3 ����/SystemProgramObespechenie/SPO_task2/src/main/java/com/example/spo_task2/BNF.g4 by ANTLR 4.13.1
package com.example.spo_task2.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BNFParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, NACHALO=2, KONETS=3, PERVOE=4, VTOROE=5, KONETS_SLAG=6, ZAP=7, 
		DIGIT=8, DVOE=9, RAVNO=10, MINUS=11, PLUS=12, UMNOZH=13, DELIT=14, AND=15, 
		OR=16, NOT=17, LETTER=18, SIN=19, COS=20, TG=21, WS=22;
	public static final int
		RULE_language = 0, RULE_plenty = 1, RULE_slag = 2, RULE_oper = 3, RULE_rightPart = 4, 
		RULE_part1 = 5, RULE_part2 = 6, RULE_part3 = 7, RULE_part4 = 8, RULE_perem = 9, 
		RULE_func = 10, RULE_expression = 11, RULE_numb = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"language", "plenty", "slag", "oper", "rightPart", "part1", "part2", 
			"part3", "part4", "perem", "func", "expression", "numb"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\\u041D\\u0430\\u0447\\u0430\\u043B\\u043E'", "'\\u041A\\u043E\\u043D\\u0435\\u0446'", 
			"'\\u041F\\u0435\\u0440\\u0432\\u043E\\u0435'", "'\\u0412\\u0442\\u043E\\u0440\\u043E\\u0435'", 
			"'\\u041A\\u043E\\u043D\\u0435\\u0446 \\u0441\\u043B\\u0430\\u0433\\u0430\\u0435\\u043C\\u043E\\u0433\\u043E'", 
			"','", null, "':'", "'='", "'-'", "'+'", "'*'", "'/'", "'&'", "'||'", 
			"'\\u043D\\u0435'", null, "'sin'", "'cos'", "'tg'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "NACHALO", "KONETS", "PERVOE", "VTOROE", "KONETS_SLAG", 
			"ZAP", "DIGIT", "DVOE", "RAVNO", "MINUS", "PLUS", "UMNOZH", "DELIT", 
			"AND", "OR", "NOT", "LETTER", "SIN", "COS", "TG", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "BNF.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BNFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LanguageContext extends ParserRuleContext {
		public TerminalNode NACHALO() { return getToken(BNFParser.NACHALO, 0); }
		public TerminalNode KONETS() { return getToken(BNFParser.KONETS, 0); }
		public TerminalNode EOF() { return getToken(BNFParser.EOF, 0); }
		public List<PlentyContext> plenty() {
			return getRuleContexts(PlentyContext.class);
		}
		public PlentyContext plenty(int i) {
			return getRuleContext(PlentyContext.class,i);
		}
		public List<SlagContext> slag() {
			return getRuleContexts(SlagContext.class);
		}
		public SlagContext slag(int i) {
			return getRuleContext(SlagContext.class,i);
		}
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public LanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).enterLanguage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).exitLanguage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFVisitor ) return ((BNFVisitor<? extends T>)visitor).visitLanguage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguageContext language() throws RecognitionException {
		LanguageContext _localctx = new LanguageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_language);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(NACHALO);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERVOE || _la==VTOROE) {
				{
				{
				setState(27);
				plenty();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(33);
					slag();
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER || _la==LETTER) {
				{
				{
				setState(39);
				oper();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(KONETS);
			setState(46);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PlentyContext extends ParserRuleContext {
		public TerminalNode PERVOE() { return getToken(BNFParser.PERVOE, 0); }
		public List<PeremContext> perem() {
			return getRuleContexts(PeremContext.class);
		}
		public PeremContext perem(int i) {
			return getRuleContext(PeremContext.class,i);
		}
		public List<TerminalNode> ZAP() { return getTokens(BNFParser.ZAP); }
		public TerminalNode ZAP(int i) {
			return getToken(BNFParser.ZAP, i);
		}
		public TerminalNode VTOROE() { return getToken(BNFParser.VTOROE, 0); }
		public List<NumbContext> numb() {
			return getRuleContexts(NumbContext.class);
		}
		public NumbContext numb(int i) {
			return getRuleContext(NumbContext.class,i);
		}
		public PlentyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plenty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).enterPlenty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).exitPlenty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFVisitor ) return ((BNFVisitor<? extends T>)visitor).visitPlenty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlentyContext plenty() throws RecognitionException {
		PlentyContext _localctx = new PlentyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_plenty);
		int _la;
		try {
			int _alt;
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PERVOE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(48);
				match(PERVOE);
				setState(49);
				perem();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZAP) {
					{
					{
					setState(50);
					match(ZAP);
					setState(51);
					perem();
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case VTOROE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(57);
				match(VTOROE);
				setState(59); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(58);
						numb();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(61); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SlagContext extends ParserRuleContext {
		public List<NumbContext> numb() {
			return getRuleContexts(NumbContext.class);
		}
		public NumbContext numb(int i) {
			return getRuleContext(NumbContext.class,i);
		}
		public TerminalNode KONETS_SLAG() { return getToken(BNFParser.KONETS_SLAG, 0); }
		public List<TerminalNode> ZAP() { return getTokens(BNFParser.ZAP); }
		public TerminalNode ZAP(int i) {
			return getToken(BNFParser.ZAP, i);
		}
		public SlagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).enterSlag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).exitSlag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFVisitor ) return ((BNFVisitor<? extends T>)visitor).visitSlag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlagContext slag() throws RecognitionException {
		SlagContext _localctx = new SlagContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_slag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			numb();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ZAP) {
				{
				{
				setState(66);
				match(ZAP);
				setState(67);
				numb();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(KONETS_SLAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperContext extends ParserRuleContext {
		public PeremContext perem() {
			return getRuleContext(PeremContext.class,0);
		}
		public TerminalNode RAVNO() { return getToken(BNFParser.RAVNO, 0); }
		public RightPartContext rightPart() {
			return getRuleContext(RightPartContext.class,0);
		}
		public NumbContext numb() {
			return getRuleContext(NumbContext.class,0);
		}
		public TerminalNode DVOE() { return getToken(BNFParser.DVOE, 0); }
		public OperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).enterOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).exitOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFVisitor ) return ((BNFVisitor<? extends T>)visitor).visitOper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperContext oper() throws RecognitionException {
		OperContext _localctx = new OperContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_oper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(75);
				numb();
				setState(76);
				match(DVOE);
				}
			}

			setState(80);
			perem();
			setState(81);
			match(RAVNO);
			setState(82);
			rightPart();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RightPartContext extends ParserRuleContext {
		public List<Part1Context> part1() {
			return getRuleContexts(Part1Context.class);
		}
		public Part1Context part1(int i) {
			return getRuleContext(Part1Context.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(BNFParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(BNFParser.MINUS, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(BNFParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(BNFParser.PLUS, i);
		}
		public RightPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).enterRightPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).exitRightPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFVisitor ) return ((BNFVisitor<? extends T>)visitor).visitRightPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightPartContext rightPart() throws RecognitionException {
		RightPartContext _localctx = new RightPartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rightPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==PLUS) {
				{
				setState(84);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(87);
			part1();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				{
				setState(88);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(89);
				part1();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Part1Context extends ParserRuleContext {
		public List<Part2Context> part2() {
			return getRuleContexts(Part2Context.class);
		}
		public Part2Context part2(int i) {
			return getRuleContext(Part2Context.class,i);
		}
		public List<TerminalNode> UMNOZH() { return getTokens(BNFParser.UMNOZH); }
		public TerminalNode UMNOZH(int i) {
			return getToken(BNFParser.UMNOZH, i);
		}
		public List<TerminalNode> DELIT() { return getTokens(BNFParser.DELIT); }
		public TerminalNode DELIT(int i) {
			return getToken(BNFParser.DELIT, i);
		}
		public Part1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).enterPart1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).exitPart1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFVisitor ) return ((BNFVisitor<? extends T>)visitor).visitPart1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Part1Context part1() throws RecognitionException {
		Part1Context _localctx = new Part1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_part1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			part2();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UMNOZH || _la==DELIT) {
				{
				{
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==UMNOZH || _la==DELIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(97);
				part2();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Part2Context extends ParserRuleContext {
		public List<Part3Context> part3() {
			return getRuleContexts(Part3Context.class);
		}
		public Part3Context part3(int i) {
			return getRuleContext(Part3Context.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(BNFParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(BNFParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(BNFParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(BNFParser.OR, i);
		}
		public Part2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).enterPart2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).exitPart2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFVisitor ) return ((BNFVisitor<? extends T>)visitor).visitPart2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Part2Context part2() throws RecognitionException {
		Part2Context _localctx = new Part2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_part2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			part3();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(104);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(105);
				part3();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Part3Context extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(BNFParser.NOT, 0); }
		public List<Part4Context> part4() {
			return getRuleContexts(Part4Context.class);
		}
		public Part4Context part4(int i) {
			return getRuleContext(Part4Context.class,i);
		}
		public Part3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).enterPart3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).exitPart3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFVisitor ) return ((BNFVisitor<? extends T>)visitor).visitPart3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Part3Context part3() throws RecognitionException {
		Part3Context _localctx = new Part3Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_part3);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(111);
				match(NOT);
				}
			}

			setState(115); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(114);
					part4();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(117); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Part4Context extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public NumbContext numb() {
			return getRuleContext(NumbContext.class,0);
		}
		public PeremContext perem() {
			return getRuleContext(PeremContext.class,0);
		}
		public Part4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).enterPart4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).exitPart4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFVisitor ) return ((BNFVisitor<? extends T>)visitor).visitPart4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Part4Context part4() throws RecognitionException {
		Part4Context _localctx = new Part4Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_part4);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIN:
			case COS:
			case TG:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				func();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				numb();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				perem();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PeremContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(BNFParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(BNFParser.LETTER, i);
		}
		public List<NumbContext> numb() {
			return getRuleContexts(NumbContext.class);
		}
		public NumbContext numb(int i) {
			return getRuleContext(NumbContext.class,i);
		}
		public PeremContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).enterPerem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).exitPerem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFVisitor ) return ((BNFVisitor<? extends T>)visitor).visitPerem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeremContext perem() throws RecognitionException {
		PeremContext _localctx = new PeremContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_perem);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(LETTER);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(127); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(127);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LETTER:
							{
							setState(125);
							match(LETTER);
							}
							break;
						case NUMBER:
							{
							setState(126);
							numb();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(129); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SIN() { return getToken(BNFParser.SIN, 0); }
		public TerminalNode COS() { return getToken(BNFParser.COS, 0); }
		public TerminalNode TG() { return getToken(BNFParser.TG, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFVisitor ) return ((BNFVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(134);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public NumbContext numb() {
			return getRuleContext(NumbContext.class,0);
		}
		public PeremContext perem() {
			return getRuleContext(PeremContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFVisitor ) return ((BNFVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				numb();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				perem();
				}
				break;
			case SIN:
			case COS:
			case TG:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				func();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumbContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BNFParser.NUMBER, 0); }
		public NumbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).enterNumb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFListener ) ((BNFListener)listener).exitNumb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFVisitor ) return ((BNFVisitor<? extends T>)visitor).visitNumb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumbContext numb() throws RecognitionException {
		NumbContext _localctx = new NumbContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_numb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(NUMBER);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u0090\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0005\u0000\u001d\b\u0000\n\u0000"+
		"\f\u0000 \t\u0000\u0001\u0000\u0005\u0000#\b\u0000\n\u0000\f\u0000&\t"+
		"\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u00015\b\u0001\n\u0001\f\u00018\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001<\b\u0001\u000b\u0001\f\u0001=\u0003\u0001@\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002E\b\u0002\n\u0002\f\u0002"+
		"H\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003O\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0003\u0004V\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004[\b\u0004\n\u0004\f\u0004^\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005c\b\u0005\n\u0005\f\u0005f\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006k\b\u0006\n\u0006\f\u0006n\t\u0006"+
		"\u0001\u0007\u0003\u0007q\b\u0007\u0001\u0007\u0004\u0007t\b\u0007\u000b"+
		"\u0007\f\u0007u\u0001\b\u0001\b\u0001\b\u0003\b{\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0004\t\u0080\b\t\u000b\t\f\t\u0081\u0003\t\u0084\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008c\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u0000\u0004\u0001\u0000\u000b\f\u0001\u0000"+
		"\r\u000e\u0001\u0000\u000f\u0010\u0001\u0000\u0013\u0015\u0097\u0000\u001a"+
		"\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000\u0004A\u0001\u0000"+
		"\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000"+
		"\n_\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000ep\u0001\u0000"+
		"\u0000\u0000\u0010z\u0001\u0000\u0000\u0000\u0012|\u0001\u0000\u0000\u0000"+
		"\u0014\u0085\u0001\u0000\u0000\u0000\u0016\u008b\u0001\u0000\u0000\u0000"+
		"\u0018\u008d\u0001\u0000\u0000\u0000\u001a\u001e\u0005\u0002\u0000\u0000"+
		"\u001b\u001d\u0003\u0002\u0001\u0000\u001c\u001b\u0001\u0000\u0000\u0000"+
		"\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0001\u0000\u0000\u0000\u001f$\u0001\u0000\u0000\u0000 \u001e\u0001"+
		"\u0000\u0000\u0000!#\u0003\u0004\u0002\u0000\"!\u0001\u0000\u0000\u0000"+
		"#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%*\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\')\u0003\u0006"+
		"\u0003\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000"+
		",*\u0001\u0000\u0000\u0000-.\u0005\u0003\u0000\u0000./\u0005\u0000\u0000"+
		"\u0001/\u0001\u0001\u0000\u0000\u000001\u0005\u0004\u0000\u000016\u0003"+
		"\u0012\t\u000023\u0005\u0007\u0000\u000035\u0003\u0012\t\u000042\u0001"+
		"\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u00007@\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u00009;\u0005\u0005\u0000\u0000:<\u0003\u0018\f\u0000;:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>@\u0001\u0000\u0000\u0000?0\u0001\u0000\u0000\u0000?9\u0001"+
		"\u0000\u0000\u0000@\u0003\u0001\u0000\u0000\u0000AF\u0003\u0018\f\u0000"+
		"BC\u0005\u0007\u0000\u0000CE\u0003\u0018\f\u0000DB\u0001\u0000\u0000\u0000"+
		"EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GI\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\u0006"+
		"\u0000\u0000J\u0005\u0001\u0000\u0000\u0000KL\u0003\u0018\f\u0000LM\u0005"+
		"\t\u0000\u0000MO\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0003\u0012\t\u0000QR\u0005"+
		"\n\u0000\u0000RS\u0003\b\u0004\u0000S\u0007\u0001\u0000\u0000\u0000TV"+
		"\u0007\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000W\\\u0003\n\u0005\u0000XY\u0007\u0000"+
		"\u0000\u0000Y[\u0003\n\u0005\u0000ZX\u0001\u0000\u0000\u0000[^\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\t"+
		"\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_d\u0003\f\u0006\u0000"+
		"`a\u0007\u0001\u0000\u0000ac\u0003\f\u0006\u0000b`\u0001\u0000\u0000\u0000"+
		"cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000e\u000b\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gl\u0003"+
		"\u000e\u0007\u0000hi\u0007\u0002\u0000\u0000ik\u0003\u000e\u0007\u0000"+
		"jh\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000m\r\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000oq\u0005\u0011\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rt\u0003\u0010\b\u0000sr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000v\u000f\u0001\u0000\u0000\u0000w{\u0003\u0014"+
		"\n\u0000x{\u0003\u0018\f\u0000y{\u0003\u0012\t\u0000zw\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{\u0011\u0001"+
		"\u0000\u0000\u0000|\u0083\u0005\u0012\u0000\u0000}\u0080\u0005\u0012\u0000"+
		"\u0000~\u0080\u0003\u0018\f\u0000\u007f}\u0001\u0000\u0000\u0000\u007f"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0001\u0000\u0000\u0000\u0083\u007f\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0013\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0007\u0003\u0000\u0000\u0086\u0087\u0003\u0016\u000b\u0000\u0087\u0015"+
		"\u0001\u0000\u0000\u0000\u0088\u008c\u0003\u0018\f\u0000\u0089\u008c\u0003"+
		"\u0012\t\u0000\u008a\u008c\u0003\u0014\n\u0000\u008b\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u0017\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0001"+
		"\u0000\u0000\u008e\u0019\u0001\u0000\u0000\u0000\u0013\u001e$*6=?FNU\\"+
		"dlpuz\u007f\u0081\u0083\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}