// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.alguma.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlgumaGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, OP_REL=2, OP_ARIT=3, OP_LOG=4, CARACTERE_ESP=5, NUM_INT=6, 
		NUM_REAL=7, IDENT=8, CADEIA=9, COMENTARIO=10, CADEIA_NAO_FECHADA=11, COMENTARIO_NAO_FECHADO=12, 
		WS=13, ERRO=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "OP_REL", "OP_ARIT", "OP_LOG", "CARACTERE_ESP", "NUM_INT", 
			"NUM_REAL", "IDENT", "CADEIA", "ESC_SEQ", "ESC_SEQ_SQ", "COMENTARIO", 
			"CADEIA_NAO_FECHADA", "COMENTARIO_NAO_FECHADO", "WS", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "OP_REL", "OP_ARIT", "OP_LOG", "CARACTERE_ESP", 
			"NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "COMENTARIO", "CADEIA_NAO_FECHADA", 
			"COMENTARIO_NAO_FECHADO", "WS", "ERRO"
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


	public AlgumaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlgumaGrammar.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 14:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u000e\u0190\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0102\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u010d\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0126\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u012f\b\u0004\u0001\u0005\u0004\u0005\u0132\b"+
		"\u0005\u000b\u0005\f\u0005\u0133\u0001\u0006\u0004\u0006\u0137\b\u0006"+
		"\u000b\u0006\f\u0006\u0138\u0001\u0006\u0001\u0006\u0004\u0006\u013d\b"+
		"\u0006\u000b\u0006\f\u0006\u013e\u0003\u0006\u0141\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u0145\b\u0007\n\u0007\f\u0007\u0148\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u014d\b\b\n\b\f\b\u0150\t\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u0156\b\b\n\b\f\b\u0159\t\b\u0001\b\u0003\b\u015c"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0166\b\u000b\n\u000b\f\u000b\u0169\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0172"+
		"\b\f\n\f\f\f\u0175\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u017b\b"+
		"\f\n\f\f\f\u017e\t\f\u0001\f\u0003\f\u0181\b\f\u0001\r\u0001\r\u0005\r"+
		"\u0185\b\r\n\r\f\r\u0188\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\u0000\u0015\u0000\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f\u000e\u0001"+
		"\u0000\t\u0005\u0000%%*+--//^^\u0003\u0000(),,::\u0004\u0000&&..[[]]\u0002"+
		"\u0000AZaz\u0004\u000009AZ__az\u0003\u0000\n\n\"\"\\\\\u0003\u0000\n\n"+
		"\'\'\\\\\u0002\u0000\n\n}}\u0003\u0000\t\n\r\r  \u01ca\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001\u0101\u0001\u0000\u0000"+
		"\u0000\u0003\u010c\u0001\u0000\u0000\u0000\u0005\u010e\u0001\u0000\u0000"+
		"\u0000\u0007\u0125\u0001\u0000\u0000\u0000\t\u012e\u0001\u0000\u0000\u0000"+
		"\u000b\u0131\u0001\u0000\u0000\u0000\r\u0136\u0001\u0000\u0000\u0000\u000f"+
		"\u0142\u0001\u0000\u0000\u0000\u0011\u015b\u0001\u0000\u0000\u0000\u0013"+
		"\u015d\u0001\u0000\u0000\u0000\u0015\u0160\u0001\u0000\u0000\u0000\u0017"+
		"\u0163\u0001\u0000\u0000\u0000\u0019\u0180\u0001\u0000\u0000\u0000\u001b"+
		"\u0182\u0001\u0000\u0000\u0000\u001d\u018b\u0001\u0000\u0000\u0000\u001f"+
		"\u018e\u0001\u0000\u0000\u0000!\"\u0005a\u0000\u0000\"#\u0005l\u0000\u0000"+
		"#$\u0005g\u0000\u0000$%\u0005o\u0000\u0000%&\u0005r\u0000\u0000&\'\u0005"+
		"i\u0000\u0000\'(\u0005t\u0000\u0000()\u0005m\u0000\u0000)\u0102\u0005"+
		"o\u0000\u0000*+\u0005d\u0000\u0000+,\u0005e\u0000\u0000,-\u0005c\u0000"+
		"\u0000-.\u0005l\u0000\u0000./\u0005a\u0000\u0000/0\u0005r\u0000\u0000"+
		"0\u0102\u0005e\u0000\u000012\u0005i\u0000\u000023\u0005n\u0000\u00003"+
		"4\u0005t\u0000\u000045\u0005e\u0000\u000056\u0005i\u0000\u000067\u0005"+
		"r\u0000\u00007\u0102\u0005o\u0000\u000089\u0005r\u0000\u00009:\u0005e"+
		"\u0000\u0000:;\u0005a\u0000\u0000;\u0102\u0005l\u0000\u0000<=\u0005l\u0000"+
		"\u0000=>\u0005i\u0000\u0000>?\u0005t\u0000\u0000?@\u0005e\u0000\u0000"+
		"@A\u0005r\u0000\u0000AB\u0005a\u0000\u0000B\u0102\u0005l\u0000\u0000C"+
		"D\u0005l\u0000\u0000DE\u0005e\u0000\u0000EF\u0005i\u0000\u0000F\u0102"+
		"\u0005a\u0000\u0000GH\u0005e\u0000\u0000HI\u0005s\u0000\u0000IJ\u0005"+
		"c\u0000\u0000JK\u0005r\u0000\u0000KL\u0005e\u0000\u0000LM\u0005v\u0000"+
		"\u0000M\u0102\u0005a\u0000\u0000NO\u0005f\u0000\u0000OP\u0005i\u0000\u0000"+
		"PQ\u0005m\u0000\u0000QR\u0005_\u0000\u0000RS\u0005a\u0000\u0000ST\u0005"+
		"l\u0000\u0000TU\u0005g\u0000\u0000UV\u0005o\u0000\u0000VW\u0005r\u0000"+
		"\u0000WX\u0005i\u0000\u0000XY\u0005t\u0000\u0000YZ\u0005m\u0000\u0000"+
		"Z\u0102\u0005o\u0000\u0000[\\\u0005l\u0000\u0000\\]\u0005o\u0000\u0000"+
		"]^\u0005g\u0000\u0000^_\u0005i\u0000\u0000_`\u0005c\u0000\u0000`\u0102"+
		"\u0005o\u0000\u0000ab\u0005s\u0000\u0000b\u0102\u0005e\u0000\u0000cd\u0005"+
		"e\u0000\u0000de\u0005n\u0000\u0000ef\u0005t\u0000\u0000fg\u0005a\u0000"+
		"\u0000g\u0102\u0005o\u0000\u0000hi\u0005s\u0000\u0000ij\u0005e\u0000\u0000"+
		"jk\u0005n\u0000\u0000kl\u0005a\u0000\u0000l\u0102\u0005o\u0000\u0000m"+
		"n\u0005f\u0000\u0000no\u0005i\u0000\u0000op\u0005m\u0000\u0000pq\u0005"+
		"_\u0000\u0000qr\u0005s\u0000\u0000r\u0102\u0005e\u0000\u0000st\u0005f"+
		"\u0000\u0000tu\u0005i\u0000\u0000uv\u0005m\u0000\u0000vw\u0005_\u0000"+
		"\u0000wx\u0005c\u0000\u0000xy\u0005a\u0000\u0000yz\u0005s\u0000\u0000"+
		"z\u0102\u0005o\u0000\u0000{|\u0005s\u0000\u0000|}\u0005e\u0000\u0000}"+
		"~\u0005j\u0000\u0000~\u0102\u0005a\u0000\u0000\u007f\u0080\u0005c\u0000"+
		"\u0000\u0080\u0081\u0005a\u0000\u0000\u0081\u0082\u0005s\u0000\u0000\u0082"+
		"\u0102\u0005o\u0000\u0000\u0083\u0084\u0005p\u0000\u0000\u0084\u0085\u0005"+
		"a\u0000\u0000\u0085\u0086\u0005r\u0000\u0000\u0086\u0102\u0005a\u0000"+
		"\u0000\u0087\u0088\u0005a\u0000\u0000\u0088\u0089\u0005t\u0000\u0000\u0089"+
		"\u0102\u0005e\u0000\u0000\u008a\u008b\u0005f\u0000\u0000\u008b\u008c\u0005"+
		"a\u0000\u0000\u008c\u008d\u0005c\u0000\u0000\u008d\u0102\u0005a\u0000"+
		"\u0000\u008e\u008f\u0005f\u0000\u0000\u008f\u0090\u0005i\u0000\u0000\u0090"+
		"\u0091\u0005m\u0000\u0000\u0091\u0092\u0005_\u0000\u0000\u0092\u0093\u0005"+
		"p\u0000\u0000\u0093\u0094\u0005a\u0000\u0000\u0094\u0095\u0005r\u0000"+
		"\u0000\u0095\u0102\u0005a\u0000\u0000\u0096\u0097\u0005e\u0000\u0000\u0097"+
		"\u0098\u0005n\u0000\u0000\u0098\u0099\u0005q\u0000\u0000\u0099\u009a\u0005"+
		"u\u0000\u0000\u009a\u009b\u0005a\u0000\u0000\u009b\u009c\u0005n\u0000"+
		"\u0000\u009c\u009d\u0005t\u0000\u0000\u009d\u0102\u0005o\u0000\u0000\u009e"+
		"\u009f\u0005f\u0000\u0000\u009f\u00a0\u0005i\u0000\u0000\u00a0\u00a1\u0005"+
		"m\u0000\u0000\u00a1\u00a2\u0005_\u0000\u0000\u00a2\u00a3\u0005e\u0000"+
		"\u0000\u00a3\u00a4\u0005n\u0000\u0000\u00a4\u00a5\u0005q\u0000\u0000\u00a5"+
		"\u00a6\u0005u\u0000\u0000\u00a6\u00a7\u0005a\u0000\u0000\u00a7\u00a8\u0005"+
		"n\u0000\u0000\u00a8\u00a9\u0005t\u0000\u0000\u00a9\u0102\u0005o\u0000"+
		"\u0000\u00aa\u00ab\u0005r\u0000\u0000\u00ab\u00ac\u0005e\u0000\u0000\u00ac"+
		"\u00ad\u0005g\u0000\u0000\u00ad\u00ae\u0005i\u0000\u0000\u00ae\u00af\u0005"+
		"s\u0000\u0000\u00af\u00b0\u0005t\u0000\u0000\u00b0\u00b1\u0005r\u0000"+
		"\u0000\u00b1\u0102\u0005o\u0000\u0000\u00b2\u00b3\u0005f\u0000\u0000\u00b3"+
		"\u00b4\u0005i\u0000\u0000\u00b4\u00b5\u0005m\u0000\u0000\u00b5\u00b6\u0005"+
		"_\u0000\u0000\u00b6\u00b7\u0005r\u0000\u0000\u00b7\u00b8\u0005e\u0000"+
		"\u0000\u00b8\u00b9\u0005g\u0000\u0000\u00b9\u00ba\u0005i\u0000\u0000\u00ba"+
		"\u00bb\u0005s\u0000\u0000\u00bb\u00bc\u0005t\u0000\u0000\u00bc\u00bd\u0005"+
		"r\u0000\u0000\u00bd\u0102\u0005o\u0000\u0000\u00be\u00bf\u0005t\u0000"+
		"\u0000\u00bf\u00c0\u0005i\u0000\u0000\u00c0\u00c1\u0005p\u0000\u0000\u00c1"+
		"\u0102\u0005o\u0000\u0000\u00c2\u00c3\u0005p\u0000\u0000\u00c3\u00c4\u0005"+
		"r\u0000\u0000\u00c4\u00c5\u0005o\u0000\u0000\u00c5\u00c6\u0005c\u0000"+
		"\u0000\u00c6\u00c7\u0005e\u0000\u0000\u00c7\u00c8\u0005d\u0000\u0000\u00c8"+
		"\u00c9\u0005i\u0000\u0000\u00c9\u00ca\u0005m\u0000\u0000\u00ca\u00cb\u0005"+
		"e\u0000\u0000\u00cb\u00cc\u0005n\u0000\u0000\u00cc\u00cd\u0005t\u0000"+
		"\u0000\u00cd\u0102\u0005o\u0000\u0000\u00ce\u00cf\u0005f\u0000\u0000\u00cf"+
		"\u00d0\u0005u\u0000\u0000\u00d0\u00d1\u0005n\u0000\u0000\u00d1\u00d2\u0005"+
		"c\u0000\u0000\u00d2\u00d3\u0005a\u0000\u0000\u00d3\u0102\u0005o\u0000"+
		"\u0000\u00d4\u00d5\u0005r\u0000\u0000\u00d5\u00d6\u0005e\u0000\u0000\u00d6"+
		"\u00d7\u0005t\u0000\u0000\u00d7\u00d8\u0005o\u0000\u0000\u00d8\u00d9\u0005"+
		"r\u0000\u0000\u00d9\u00da\u0005n\u0000\u0000\u00da\u0102\u0005e\u0000"+
		"\u0000\u00db\u00dc\u0005c\u0000\u0000\u00dc\u00dd\u0005o\u0000\u0000\u00dd"+
		"\u00de\u0005n\u0000\u0000\u00de\u00df\u0005s\u0000\u0000\u00df\u00e0\u0005"+
		"t\u0000\u0000\u00e0\u00e1\u0005a\u0000\u0000\u00e1\u00e2\u0005n\u0000"+
		"\u0000\u00e2\u00e3\u0005t\u0000\u0000\u00e3\u0102\u0005e\u0000\u0000\u00e4"+
		"\u00e5\u0005v\u0000\u0000\u00e5\u00e6\u0005a\u0000\u0000\u00e6\u0102\u0005"+
		"r\u0000\u0000\u00e7\u00e8\u0005f\u0000\u0000\u00e8\u00e9\u0005i\u0000"+
		"\u0000\u00e9\u00ea\u0005m\u0000\u0000\u00ea\u00eb\u0005_\u0000\u0000\u00eb"+
		"\u00ec\u0005p\u0000\u0000\u00ec\u00ed\u0005r\u0000\u0000\u00ed\u00ee\u0005"+
		"o\u0000\u0000\u00ee\u00ef\u0005c\u0000\u0000\u00ef\u00f0\u0005e\u0000"+
		"\u0000\u00f0\u00f1\u0005d\u0000\u0000\u00f1\u00f2\u0005i\u0000\u0000\u00f2"+
		"\u00f3\u0005m\u0000\u0000\u00f3\u00f4\u0005e\u0000\u0000\u00f4\u00f5\u0005"+
		"n\u0000\u0000\u00f5\u00f6\u0005t\u0000\u0000\u00f6\u0102\u0005o\u0000"+
		"\u0000\u00f7\u00f8\u0005f\u0000\u0000\u00f8\u00f9\u0005i\u0000\u0000\u00f9"+
		"\u00fa\u0005m\u0000\u0000\u00fa\u00fb\u0005_\u0000\u0000\u00fb\u00fc\u0005"+
		"f\u0000\u0000\u00fc\u00fd\u0005u\u0000\u0000\u00fd\u00fe\u0005n\u0000"+
		"\u0000\u00fe\u00ff\u0005c\u0000\u0000\u00ff\u0100\u0005a\u0000\u0000\u0100"+
		"\u0102\u0005o\u0000\u0000\u0101!\u0001\u0000\u0000\u0000\u0101*\u0001"+
		"\u0000\u0000\u0000\u01011\u0001\u0000\u0000\u0000\u01018\u0001\u0000\u0000"+
		"\u0000\u0101<\u0001\u0000\u0000\u0000\u0101C\u0001\u0000\u0000\u0000\u0101"+
		"G\u0001\u0000\u0000\u0000\u0101N\u0001\u0000\u0000\u0000\u0101[\u0001"+
		"\u0000\u0000\u0000\u0101a\u0001\u0000\u0000\u0000\u0101c\u0001\u0000\u0000"+
		"\u0000\u0101h\u0001\u0000\u0000\u0000\u0101m\u0001\u0000\u0000\u0000\u0101"+
		"s\u0001\u0000\u0000\u0000\u0101{\u0001\u0000\u0000\u0000\u0101\u007f\u0001"+
		"\u0000\u0000\u0000\u0101\u0083\u0001\u0000\u0000\u0000\u0101\u0087\u0001"+
		"\u0000\u0000\u0000\u0101\u008a\u0001\u0000\u0000\u0000\u0101\u008e\u0001"+
		"\u0000\u0000\u0000\u0101\u0096\u0001\u0000\u0000\u0000\u0101\u009e\u0001"+
		"\u0000\u0000\u0000\u0101\u00aa\u0001\u0000\u0000\u0000\u0101\u00b2\u0001"+
		"\u0000\u0000\u0000\u0101\u00be\u0001\u0000\u0000\u0000\u0101\u00c2\u0001"+
		"\u0000\u0000\u0000\u0101\u00ce\u0001\u0000\u0000\u0000\u0101\u00d4\u0001"+
		"\u0000\u0000\u0000\u0101\u00db\u0001\u0000\u0000\u0000\u0101\u00e4\u0001"+
		"\u0000\u0000\u0000\u0101\u00e7\u0001\u0000\u0000\u0000\u0101\u00f7\u0001"+
		"\u0000\u0000\u0000\u0102\u0002\u0001\u0000\u0000\u0000\u0103\u010d\u0005"+
		">\u0000\u0000\u0104\u0105\u0005>\u0000\u0000\u0105\u010d\u0005=\u0000"+
		"\u0000\u0106\u010d\u0005<\u0000\u0000\u0107\u0108\u0005<\u0000\u0000\u0108"+
		"\u010d\u0005=\u0000\u0000\u0109\u010a\u0005<\u0000\u0000\u010a\u010d\u0005"+
		">\u0000\u0000\u010b\u010d\u0005=\u0000\u0000\u010c\u0103\u0001\u0000\u0000"+
		"\u0000\u010c\u0104\u0001\u0000\u0000\u0000\u010c\u0106\u0001\u0000\u0000"+
		"\u0000\u010c\u0107\u0001\u0000\u0000\u0000\u010c\u0109\u0001\u0000\u0000"+
		"\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u0004\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0007\u0000\u0000\u0000\u010f\u0006\u0001\u0000\u0000"+
		"\u0000\u0110\u0126\u0005e\u0000\u0000\u0111\u0112\u0005n\u0000\u0000\u0112"+
		"\u0113\u0005a\u0000\u0000\u0113\u0126\u0005o\u0000\u0000\u0114\u0115\u0005"+
		"o\u0000\u0000\u0115\u0126\u0005u\u0000\u0000\u0116\u0117\u0005f\u0000"+
		"\u0000\u0117\u0118\u0005a\u0000\u0000\u0118\u0119\u0005l\u0000\u0000\u0119"+
		"\u011a\u0005s\u0000\u0000\u011a\u0126\u0005o\u0000\u0000\u011b\u011c\u0005"+
		"v\u0000\u0000\u011c\u011d\u0005e\u0000\u0000\u011d\u011e\u0005r\u0000"+
		"\u0000\u011e\u011f\u0005d\u0000\u0000\u011f\u0120\u0005a\u0000\u0000\u0120"+
		"\u0121\u0005d\u0000\u0000\u0121\u0122\u0005e\u0000\u0000\u0122\u0123\u0005"+
		"i\u0000\u0000\u0123\u0124\u0005r\u0000\u0000\u0124\u0126\u0005o\u0000"+
		"\u0000\u0125\u0110\u0001\u0000\u0000\u0000\u0125\u0111\u0001\u0000\u0000"+
		"\u0000\u0125\u0114\u0001\u0000\u0000\u0000\u0125\u0116\u0001\u0000\u0000"+
		"\u0000\u0125\u011b\u0001\u0000\u0000\u0000\u0126\b\u0001\u0000\u0000\u0000"+
		"\u0127\u012f\u0007\u0001\u0000\u0000\u0128\u0129\u0005<\u0000\u0000\u0129"+
		"\u012f\u0005-\u0000\u0000\u012a\u012f\u0005-\u0000\u0000\u012b\u012c\u0005"+
		".\u0000\u0000\u012c\u012f\u0005.\u0000\u0000\u012d\u012f\u0007\u0002\u0000"+
		"\u0000\u012e\u0127\u0001\u0000\u0000\u0000\u012e\u0128\u0001\u0000\u0000"+
		"\u0000\u012e\u012a\u0001\u0000\u0000\u0000\u012e\u012b\u0001\u0000\u0000"+
		"\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\n\u0001\u0000\u0000\u0000"+
		"\u0130\u0132\u000209\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0001\u0000\u0000\u0000\u0134\f\u0001\u0000\u0000\u0000\u0135\u0137\u0002"+
		"09\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000"+
		"\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000"+
		"\u0000\u0139\u0140\u0001\u0000\u0000\u0000\u013a\u013c\u0005.\u0000\u0000"+
		"\u013b\u013d\u000209\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0001\u0000\u0000\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140\u013a"+
		"\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u000e"+
		"\u0001\u0000\u0000\u0000\u0142\u0146\u0007\u0003\u0000\u0000\u0143\u0145"+
		"\u0007\u0004\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0148"+
		"\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0001\u0000\u0000\u0000\u0147\u0010\u0001\u0000\u0000\u0000\u0148\u0146"+
		"\u0001\u0000\u0000\u0000\u0149\u014e\u0005\"\u0000\u0000\u014a\u014d\u0003"+
		"\u0013\t\u0000\u014b\u014d\b\u0005\u0000\u0000\u014c\u014a\u0001\u0000"+
		"\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000"+
		"\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000"+
		"\u0000\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000"+
		"\u0000\u0000\u0151\u015c\u0005\"\u0000\u0000\u0152\u0157\u0005\'\u0000"+
		"\u0000\u0153\u0156\u0003\u0015\n\u0000\u0154\u0156\b\u0006\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000"+
		"\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000"+
		"\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015c\u0005\'\u0000\u0000\u015b"+
		"\u0149\u0001\u0000\u0000\u0000\u015b\u0152\u0001\u0000\u0000\u0000\u015c"+
		"\u0012\u0001\u0000\u0000\u0000\u015d\u015e\u0005\\\u0000\u0000\u015e\u015f"+
		"\u0005\"\u0000\u0000\u015f\u0014\u0001\u0000\u0000\u0000\u0160\u0161\u0005"+
		"\\\u0000\u0000\u0161\u0162\u0005\'\u0000\u0000\u0162\u0016\u0001\u0000"+
		"\u0000\u0000\u0163\u0167\u0005{\u0000\u0000\u0164\u0166\b\u0007\u0000"+
		"\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000"+
		"\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000"+
		"\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0005}\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000"+
		"\u016c\u016d\u0006\u000b\u0000\u0000\u016d\u0018\u0001\u0000\u0000\u0000"+
		"\u016e\u0173\u0005\'\u0000\u0000\u016f\u0172\u0003\u0015\n\u0000\u0170"+
		"\u0172\b\u0006\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0170"+
		"\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000\u0000\u0000\u0173\u0171"+
		"\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0176"+
		"\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0181"+
		"\u0005\n\u0000\u0000\u0177\u017c\u0005\"\u0000\u0000\u0178\u017b\u0003"+
		"\u0013\t\u0000\u0179\u017b\b\u0005\u0000\u0000\u017a\u0178\u0001\u0000"+
		"\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000"+
		"\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000"+
		"\u0000\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000"+
		"\u0000\u0000\u017f\u0181\u0005\n\u0000\u0000\u0180\u016e\u0001\u0000\u0000"+
		"\u0000\u0180\u0177\u0001\u0000\u0000\u0000\u0181\u001a\u0001\u0000\u0000"+
		"\u0000\u0182\u0186\u0005{\u0000\u0000\u0183\u0185\b\u0007\u0000\u0000"+
		"\u0184\u0183\u0001\u0000\u0000\u0000\u0185\u0188\u0001\u0000\u0000\u0000"+
		"\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000"+
		"\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0005\n\u0000\u0000\u018a\u001c\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0007\b\u0000\u0000\u018c\u018d\u0006\u000e\u0001\u0000\u018d\u001e"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\t\u0000\u0000\u0000\u018f \u0001"+
		"\u0000\u0000\u0000\u0016\u0000\u0101\u010c\u0125\u012e\u0133\u0138\u013e"+
		"\u0140\u0146\u014c\u014e\u0155\u0157\u015b\u0167\u0171\u0173\u017a\u017c"+
		"\u0180\u0186\u0002\u0006\u0000\u0000\u0001\u000e\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}