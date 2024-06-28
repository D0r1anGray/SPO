// Generated from C:/Users/dange/YandexDisk/�����/3 ����/SystemProgramObespechenie/SPO_task2/src/main/java/com/example/spo_task2/BNF.g4 by ANTLR 4.13.1
package com.example.spo_task2.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class BNFLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, NACHALO=2, KONETS=3, PERVOE=4, VTOROE=5, KONETS_SLAG=6, ZAP=7, 
		DIGIT=8, DVOE=9, RAVNO=10, MINUS=11, PLUS=12, UMNOZH=13, DELIT=14, AND=15, 
		OR=16, NOT=17, LETTER=18, SIN=19, COS=20, TG=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "NACHALO", "KONETS", "PERVOE", "VTOROE", "KONETS_SLAG", "ZAP", 
			"DIGIT", "DVOE", "RAVNO", "MINUS", "PLUS", "UMNOZH", "DELIT", "AND", 
			"OR", "NOT", "LETTER", "SIN", "COS", "TG", "WS"
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


	public BNFLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BNF.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u008a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0004\u0000/\b\u0000\u000b\u0000"+
		"\f\u00000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0004\u0015\u0085\b\u0015\u000b\u0015\f\u0015\u0086"+
		"\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0003\u0001\u000007\u0001"+
		"\u0000\u0410\u044f\u0003\u0000\t\n\r\r  \u008b\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0001.\u0001\u0000\u0000\u0000\u00032\u0001\u0000\u0000\u0000\u0005"+
		"9\u0001\u0000\u0000\u0000\u0007?\u0001\u0000\u0000\u0000\tF\u0001\u0000"+
		"\u0000\u0000\u000bM\u0001\u0000\u0000\u0000\r^\u0001\u0000\u0000\u0000"+
		"\u000f`\u0001\u0000\u0000\u0000\u0011b\u0001\u0000\u0000\u0000\u0013d"+
		"\u0001\u0000\u0000\u0000\u0015f\u0001\u0000\u0000\u0000\u0017h\u0001\u0000"+
		"\u0000\u0000\u0019j\u0001\u0000\u0000\u0000\u001bl\u0001\u0000\u0000\u0000"+
		"\u001dn\u0001\u0000\u0000\u0000\u001fp\u0001\u0000\u0000\u0000!s\u0001"+
		"\u0000\u0000\u0000#v\u0001\u0000\u0000\u0000%x\u0001\u0000\u0000\u0000"+
		"\'|\u0001\u0000\u0000\u0000)\u0080\u0001\u0000\u0000\u0000+\u0084\u0001"+
		"\u0000\u0000\u0000-/\u0003\u000f\u0007\u0000.-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u00001\u0002\u0001\u0000\u0000\u000023\u0005\u041d\u0000\u000034\u0005"+
		"\u0430\u0000\u000045\u0005\u0447\u0000\u000056\u0005\u0430\u0000\u0000"+
		"67\u0005\u043b\u0000\u000078\u0005\u043e\u0000\u00008\u0004\u0001\u0000"+
		"\u0000\u00009:\u0005\u041a\u0000\u0000:;\u0005\u043e\u0000\u0000;<\u0005"+
		"\u043d\u0000\u0000<=\u0005\u0435\u0000\u0000=>\u0005\u0446\u0000\u0000"+
		">\u0006\u0001\u0000\u0000\u0000?@\u0005\u041f\u0000\u0000@A\u0005\u0435"+
		"\u0000\u0000AB\u0005\u0440\u0000\u0000BC\u0005\u0432\u0000\u0000CD\u0005"+
		"\u043e\u0000\u0000DE\u0005\u0435\u0000\u0000E\b\u0001\u0000\u0000\u0000"+
		"FG\u0005\u0412\u0000\u0000GH\u0005\u0442\u0000\u0000HI\u0005\u043e\u0000"+
		"\u0000IJ\u0005\u0440\u0000\u0000JK\u0005\u043e\u0000\u0000KL\u0005\u0435"+
		"\u0000\u0000L\n\u0001\u0000\u0000\u0000MN\u0005\u041a\u0000\u0000NO\u0005"+
		"\u043e\u0000\u0000OP\u0005\u043d\u0000\u0000PQ\u0005\u0435\u0000\u0000"+
		"QR\u0005\u0446\u0000\u0000RS\u0005 \u0000\u0000ST\u0005\u0441\u0000\u0000"+
		"TU\u0005\u043b\u0000\u0000UV\u0005\u0430\u0000\u0000VW\u0005\u0433\u0000"+
		"\u0000WX\u0005\u0430\u0000\u0000XY\u0005\u0435\u0000\u0000YZ\u0005\u043c"+
		"\u0000\u0000Z[\u0005\u043e\u0000\u0000[\\\u0005\u0433\u0000\u0000\\]\u0005"+
		"\u043e\u0000\u0000]\f\u0001\u0000\u0000\u0000^_\u0005,\u0000\u0000_\u000e"+
		"\u0001\u0000\u0000\u0000`a\u0007\u0000\u0000\u0000a\u0010\u0001\u0000"+
		"\u0000\u0000bc\u0005:\u0000\u0000c\u0012\u0001\u0000\u0000\u0000de\u0005"+
		"=\u0000\u0000e\u0014\u0001\u0000\u0000\u0000fg\u0005-\u0000\u0000g\u0016"+
		"\u0001\u0000\u0000\u0000hi\u0005+\u0000\u0000i\u0018\u0001\u0000\u0000"+
		"\u0000jk\u0005*\u0000\u0000k\u001a\u0001\u0000\u0000\u0000lm\u0005/\u0000"+
		"\u0000m\u001c\u0001\u0000\u0000\u0000no\u0005&\u0000\u0000o\u001e\u0001"+
		"\u0000\u0000\u0000pq\u0005|\u0000\u0000qr\u0005|\u0000\u0000r \u0001\u0000"+
		"\u0000\u0000st\u0005\u043d\u0000\u0000tu\u0005\u0435\u0000\u0000u\"\u0001"+
		"\u0000\u0000\u0000vw\u0007\u0001\u0000\u0000w$\u0001\u0000\u0000\u0000"+
		"xy\u0005s\u0000\u0000yz\u0005i\u0000\u0000z{\u0005n\u0000\u0000{&\u0001"+
		"\u0000\u0000\u0000|}\u0005c\u0000\u0000}~\u0005o\u0000\u0000~\u007f\u0005"+
		"s\u0000\u0000\u007f(\u0001\u0000\u0000\u0000\u0080\u0081\u0005t\u0000"+
		"\u0000\u0081\u0082\u0005g\u0000\u0000\u0082*\u0001\u0000\u0000\u0000\u0083"+
		"\u0085\u0007\u0002\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0006\u0015\u0000\u0000\u0089,\u0001\u0000\u0000\u0000\u0003\u0000"+
		"0\u0086\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}