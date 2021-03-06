// Generated from Sanka.g4 by ANTLR 4.5.1

    package sanka.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SankaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CLASS=7, CONST=8, 
		CONTINUE=9, DEFAULT=10, DOUBLE=11, ELSE=12, EXPORT=13, FLOAT=14, FOR=15, 
		IF=16, IMPORT=17, INLINE=18, INT=19, INTERFACE=20, LONG=21, NEW=22, PACKAGE=23, 
		PRIVATE=24, RETURN=25, SHORT=26, STATIC=27, SWITCH=28, THIS=29, VAR=30, 
		VOID=31, WHILE=32, C__INCLUDE=33, C__FIELD=34, C__STMT=35, IntegerLiteral=36, 
		FloatingPointLiteral=37, BooleanLiteral=38, CharacterLiteral=39, StringLiteral=40, 
		NullLiteral=41, LPAREN=42, RPAREN=43, LBRACE=44, RBRACE=45, LBRACK=46, 
		RBRACK=47, SEMI=48, COMMA=49, DOT=50, ASSIGN=51, GT=52, LT=53, BANG=54, 
		TILDE=55, QUESTION=56, COLON=57, EQUAL=58, LE=59, GE=60, NOTEQUAL=61, 
		AND=62, OR=63, INC=64, DEC=65, ADD=66, SUB=67, MUL=68, DIV=69, BITAND=70, 
		BITOR=71, CARET=72, MOD=73, Identifier=74, ELLIPSIS=75, WS=76, COMMENT=77, 
		LINE_COMMENT=78;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classDeclaration = 4, RULE_typeParameters = 5, 
		RULE_interfaceDeclaration = 6, RULE_classBody = 7, RULE_interfaceBody = 8, 
		RULE_classBodyDeclaration = 9, RULE_constDeclaration = 10, RULE_fieldDeclaration = 11, 
		RULE_fieldModifier = 12, RULE_constructorDeclaration = 13, RULE_methodDeclaration = 14, 
		RULE_interfaceBodyDeclaration = 15, RULE_interfaceMethodDeclaration = 16, 
		RULE_typeType = 17, RULE_classOrInterfaceType = 18, RULE_typeArguments = 19, 
		RULE_primitiveType = 20, RULE_formalParameters = 21, RULE_formalParameterList = 22, 
		RULE_formalParameter = 23, RULE_qualifiedName = 24, RULE_block = 25, RULE_statement = 26, 
		RULE_variableDeclaration = 27, RULE_variableAssignment = 28, RULE_assignable = 29, 
		RULE_ifStatement = 30, RULE_elseStatement = 31, RULE_forControl = 32, 
		RULE_forInit = 33, RULE_forIncrement = 34, RULE_enhancedForControl = 35, 
		RULE_switchLabel = 36, RULE_parExpression = 37, RULE_expressionList = 38, 
		RULE_expression = 39, RULE_primary = 40, RULE_creator = 41, RULE_arrayCreatorRest = 42, 
		RULE_classCreatorRest = 43, RULE_literal = 44;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"classDeclaration", "typeParameters", "interfaceDeclaration", "classBody", 
		"interfaceBody", "classBodyDeclaration", "constDeclaration", "fieldDeclaration", 
		"fieldModifier", "constructorDeclaration", "methodDeclaration", "interfaceBodyDeclaration", 
		"interfaceMethodDeclaration", "typeType", "classOrInterfaceType", "typeArguments", 
		"primitiveType", "formalParameters", "formalParameterList", "formalParameter", 
		"qualifiedName", "block", "statement", "variableDeclaration", "variableAssignment", 
		"assignable", "ifStatement", "elseStatement", "forControl", "forInit", 
		"forIncrement", "enhancedForControl", "switchLabel", "parExpression", 
		"expressionList", "expression", "primary", "creator", "arrayCreatorRest", 
		"classCreatorRest", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<<'", "'>>'", "'boolean'", "'break'", "'byte'", "'case'", "'class'", 
		"'const'", "'continue'", "'default'", "'double'", "'else'", "'export'", 
		"'float'", "'for'", "'if'", "'import'", "'inline'", "'int'", "'interface'", 
		"'long'", "'new'", "'package'", "'private'", "'return'", "'short'", "'static'", 
		"'switch'", "'this'", "'var'", "'void'", "'while'", "'c__include'", "'c__field'", 
		"'c__stmt'", null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", null, 
		"'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "BOOLEAN", "BREAK", "BYTE", "CASE", "CLASS", "CONST", 
		"CONTINUE", "DEFAULT", "DOUBLE", "ELSE", "EXPORT", "FLOAT", "FOR", "IF", 
		"IMPORT", "INLINE", "INT", "INTERFACE", "LONG", "NEW", "PACKAGE", "PRIVATE", 
		"RETURN", "SHORT", "STATIC", "SWITCH", "THIS", "VAR", "VOID", "WHILE", 
		"C__INCLUDE", "C__FIELD", "C__STMT", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "Identifier", "ELLIPSIS", "WS", 
		"COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Sanka.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SankaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SankaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(90);
				packageDeclaration();
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(93);
				importDeclaration();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==INTERFACE) {
				{
				{
				setState(99);
				typeDeclaration();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(PACKAGE);
			setState(108);
			qualifiedName();
			setState(109);
			match(SEMI);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(IMPORT);
			setState(112);
			qualifiedName();
			setState(115);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(113);
				match(DOT);
				setState(114);
				match(MUL);
				}
			}

			setState(117);
			match(SEMI);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				classDeclaration();
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				interfaceDeclaration();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SankaParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(CLASS);
			setState(124);
			match(Identifier);
			setState(126);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(125);
				typeParameters();
				}
			}

			setState(128);
			classBody();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SankaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SankaParser.Identifier, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(LT);
			setState(131);
			match(Identifier);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(132);
				match(COMMA);
				setState(133);
				match(Identifier);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(GT);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SankaParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(INTERFACE);
			setState(142);
			match(Identifier);
			setState(144);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(143);
				typeParameters();
				}
			}

			setState(146);
			interfaceBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(LBRACE);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CONST) | (1L << DOUBLE) | (1L << EXPORT) | (1L << FLOAT) | (1L << INLINE) | (1L << INT) | (1L << LONG) | (1L << PRIVATE) | (1L << SHORT) | (1L << STATIC) | (1L << VOID) | (1L << C__INCLUDE) | (1L << C__FIELD))) != 0) || _la==Identifier) {
				{
				{
				setState(149);
				classBodyDeclaration();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(RBRACE);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(LBRACE);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CONST) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INLINE) | (1L << INT) | (1L << LONG) | (1L << PRIVATE) | (1L << SHORT) | (1L << STATIC) | (1L << VOID))) != 0) || _la==Identifier) {
				{
				{
				setState(158);
				interfaceBodyDeclaration();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SankaParser.Identifier, 0); }
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SankaParser.StringLiteral, 0); }
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classBodyDeclaration);
		try {
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(EXPORT);
				setState(169);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				methodDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				match(C__INCLUDE);
				setState(173);
				match(StringLiteral);
				setState(174);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				match(C__FIELD);
				setState(176);
				match(StringLiteral);
				setState(177);
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SankaParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(CONST);
			setState(181);
			match(Identifier);
			setState(182);
			match(ASSIGN);
			setState(183);
			expression(0);
			setState(184);
			match(SEMI);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(SankaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SankaParser.Identifier, i);
		}
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fieldDeclaration);
		int _la;
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INLINE) | (1L << PRIVATE) | (1L << STATIC))) != 0)) {
					{
					{
					setState(186);
					fieldModifier();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				typeType(0);
				setState(193);
				match(Identifier);
				setState(196);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(194);
					match(ASSIGN);
					setState(195);
					expression(0);
					}
				}

				setState(198);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INLINE) | (1L << PRIVATE) | (1L << STATIC))) != 0)) {
					{
					{
					setState(200);
					fieldModifier();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				typeType(0);
				setState(207);
				match(Identifier);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(208);
					match(COMMA);
					setState(209);
					match(Identifier);
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
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

	public static class FieldModifierContext extends ParserRuleContext {
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitFieldModifier(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INLINE) | (1L << PRIVATE) | (1L << STATIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SankaParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(Identifier);
			setState(222);
			formalParameters();
			setState(223);
			block();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SankaParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INLINE) | (1L << PRIVATE) | (1L << STATIC))) != 0)) {
				{
				{
				setState(225);
				fieldModifier();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(231);
				typeType(0);
				}
				break;
			case VOID:
				{
				setState(232);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(235);
			match(Identifier);
			setState(236);
			formalParameters();
			setState(237);
			block();
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

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceBodyDeclaration);
		try {
			setState(241);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				constDeclaration();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case DOUBLE:
			case FLOAT:
			case INLINE:
			case INT:
			case LONG:
			case PRIVATE:
			case SHORT:
			case STATIC:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				interfaceMethodDeclaration();
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SankaParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INLINE) | (1L << PRIVATE) | (1L << STATIC))) != 0)) {
				{
				{
				setState(243);
				fieldModifier();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(249);
				typeType(0);
				}
				break;
			case VOID:
				{
				setState(250);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(253);
			match(Identifier);
			setState(254);
			formalParameters();
			setState(255);
			match(SEMI);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		return typeType(0);
	}

	private TypeTypeContext typeType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, _parentState);
		TypeTypeContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_typeType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(258);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(259);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(270);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new TypeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_typeType);
						setState(262);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(263);
						match(LBRACK);
						setState(264);
						match(RBRACK);
						}
						break;
					case 2:
						{
						_localctx = new TypeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_typeType);
						setState(265);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(266);
						match(LBRACK);
						setState(267);
						typeType(0);
						setState(268);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SankaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SankaParser.Identifier, i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(275);
					match(Identifier);
					setState(276);
					match(DOT);
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(282);
			match(Identifier);
			setState(284);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(283);
				typeArguments();
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(LT);
			setState(287);
			typeType(0);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(288);
				match(COMMA);
				setState(289);
				typeType(0);
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			match(GT);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(LPAREN);
			setState(301);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier) {
				{
				setState(300);
				formalParameterList();
				}
			}

			setState(303);
			match(RPAREN);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			formalParameter();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(306);
				match(COMMA);
				setState(307);
				formalParameter();
				}
				}
				setState(312);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SankaParser.Identifier, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			typeType(0);
			setState(314);
			match(Identifier);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SankaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SankaParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(Identifier);
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(317);
					match(DOT);
					setState(318);
					match(Identifier);
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(LBRACE);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << FOR) | (1L << IF) | (1L << INLINE) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << THIS) | (1L << VAR) | (1L << WHILE) | (1L << C__STMT) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(325);
				statement();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331);
			match(RBRACE);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public SwitchLabelContext switchLabel() {
			return getRuleContext(SwitchLabelContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SankaParser.StringLiteral, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statement);
		int _la;
		try {
			setState(372);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				variableDeclaration();
				setState(335);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				variableAssignment();
				setState(338);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				match(FOR);
				setState(342);
				match(LPAREN);
				setState(343);
				forControl();
				setState(344);
				match(RPAREN);
				setState(345);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(347);
				match(WHILE);
				setState(348);
				parExpression();
				setState(349);
				block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(351);
				match(SWITCH);
				setState(352);
				parExpression();
				setState(353);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(355);
				switchLabel();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(356);
				match(RETURN);
				setState(358);
				_la = _input.LA(1);
				if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (NEW - 22)) | (1L << (THIS - 22)) | (1L << (IntegerLiteral - 22)) | (1L << (FloatingPointLiteral - 22)) | (1L << (BooleanLiteral - 22)) | (1L << (CharacterLiteral - 22)) | (1L << (StringLiteral - 22)) | (1L << (NullLiteral - 22)) | (1L << (LPAREN - 22)) | (1L << (BANG - 22)) | (1L << (TILDE - 22)) | (1L << (ADD - 22)) | (1L << (SUB - 22)) | (1L << (Identifier - 22)))) != 0)) {
					{
					setState(357);
					expression(0);
					}
				}

				setState(360);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(361);
				match(BREAK);
				setState(362);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(363);
				match(CONTINUE);
				setState(364);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(365);
				expression(0);
				setState(366);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(368);
				match(C__STMT);
				setState(369);
				match(StringLiteral);
				setState(370);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(371);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SankaParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if (_la==INLINE) {
				{
				setState(374);
				match(INLINE);
				}
			}

			setState(377);
			match(VAR);
			setState(378);
			match(Identifier);
			setState(381);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(379);
				match(ASSIGN);
				setState(380);
				expression(0);
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitVariableAssignment(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableAssignment);
		int _la;
		try {
			setState(390);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				assignable();
				setState(384);
				match(ASSIGN);
				setState(385);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				assignable();
				setState(388);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class AssignableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SankaParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterAssignable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitAssignable(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignable);
		try {
			setState(403);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(392);
					expression(0);
					setState(393);
					match(DOT);
					}
					break;
				}
				setState(397);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				expression(0);
				setState(399);
				match(LBRACK);
				setState(400);
				expression(0);
				setState(401);
				match(RBRACK);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(IF);
			setState(406);
			parExpression();
			setState(407);
			block();
			setState(410);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(408);
				match(ELSE);
				setState(409);
				elseStatement();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitElseStatement(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_elseStatement);
		try {
			setState(414);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				ifStatement();
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

	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ForIncrementContext forIncrement() {
			return getRuleContext(ForIncrementContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forControl);
		int _la;
		try {
			setState(426);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (INLINE - 18)) | (1L << (NEW - 18)) | (1L << (THIS - 18)) | (1L << (VAR - 18)) | (1L << (IntegerLiteral - 18)) | (1L << (FloatingPointLiteral - 18)) | (1L << (BooleanLiteral - 18)) | (1L << (CharacterLiteral - 18)) | (1L << (StringLiteral - 18)) | (1L << (NullLiteral - 18)) | (1L << (LPAREN - 18)) | (1L << (BANG - 18)) | (1L << (TILDE - 18)) | (1L << (ADD - 18)) | (1L << (SUB - 18)) | (1L << (Identifier - 18)))) != 0)) {
					{
					setState(417);
					forInit();
					}
				}

				setState(420);
				match(SEMI);
				setState(421);
				expression(0);
				setState(422);
				match(SEMI);
				setState(424);
				_la = _input.LA(1);
				if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (NEW - 22)) | (1L << (THIS - 22)) | (1L << (IntegerLiteral - 22)) | (1L << (FloatingPointLiteral - 22)) | (1L << (BooleanLiteral - 22)) | (1L << (CharacterLiteral - 22)) | (1L << (StringLiteral - 22)) | (1L << (NullLiteral - 22)) | (1L << (LPAREN - 22)) | (1L << (BANG - 22)) | (1L << (TILDE - 22)) | (1L << (ADD - 22)) | (1L << (SUB - 22)) | (1L << (Identifier - 22)))) != 0)) {
					{
					setState(423);
					forIncrement();
					}
				}

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

	public static class ForInitContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forInit);
		try {
			setState(431);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				variableAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				expression(0);
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

	public static class ForIncrementContext extends ParserRuleContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterForIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitForIncrement(this);
		}
	}

	public final ForIncrementContext forIncrement() throws RecognitionException {
		ForIncrementContext _localctx = new ForIncrementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forIncrement);
		try {
			setState(435);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				variableAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				expression(0);
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SankaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SankaParser.Identifier, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(VAR);
			setState(438);
			match(Identifier);
			setState(441);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(439);
				match(COMMA);
				setState(440);
				match(Identifier);
				}
			}

			setState(443);
			match(COLON);
			setState(444);
			expression(0);
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_switchLabel);
		try {
			setState(452);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(CASE);
				setState(447);
				expression(0);
				setState(448);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(DEFAULT);
				setState(451);
				match(COLON);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(LPAREN);
			setState(455);
			expression(0);
			setState(456);
			match(RPAREN);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			expression(0);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(459);
				match(COMMA);
				setState(460);
				expression(0);
				}
				}
				setState(465);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SankaParser.Identifier, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitExpression(this);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
				{
				setState(467);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(468);
				expression(13);
				}
				break;
			case BANG:
			case TILDE:
				{
				setState(469);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(470);
				expression(12);
				}
				break;
			case THIS:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case Identifier:
				{
				setState(471);
				primary();
				}
				break;
			case NEW:
				{
				setState(472);
				match(NEW);
				setState(473);
				creator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(526);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(476);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(477);
						_la = _input.LA(1);
						if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (MUL - 68)) | (1L << (DIV - 68)) | (1L << (MOD - 68)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(478);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(479);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(480);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(481);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(482);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(483);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(484);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(485);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(486);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(487);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(488);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(489);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(490);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(491);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(492);
						match(BITAND);
						setState(493);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(494);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(495);
						match(CARET);
						setState(496);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(497);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(498);
						match(BITOR);
						setState(499);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(500);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(501);
						match(AND);
						setState(502);
						expression(4);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(503);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(504);
						match(OR);
						setState(505);
						expression(3);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(506);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(507);
						match(QUESTION);
						setState(508);
						expression(0);
						setState(509);
						match(COLON);
						setState(510);
						expression(2);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(512);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(513);
						match(DOT);
						setState(514);
						match(Identifier);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(515);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(516);
						match(LBRACK);
						setState(517);
						expression(0);
						setState(518);
						match(RBRACK);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(520);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(521);
						match(LPAREN);
						setState(523);
						_la = _input.LA(1);
						if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (NEW - 22)) | (1L << (THIS - 22)) | (1L << (IntegerLiteral - 22)) | (1L << (FloatingPointLiteral - 22)) | (1L << (BooleanLiteral - 22)) | (1L << (CharacterLiteral - 22)) | (1L << (StringLiteral - 22)) | (1L << (NullLiteral - 22)) | (1L << (LPAREN - 22)) | (1L << (BANG - 22)) | (1L << (TILDE - 22)) | (1L << (ADD - 22)) | (1L << (SUB - 22)) | (1L << (Identifier - 22)))) != 0)) {
							{
							setState(522);
							expressionList();
							}
						}

						setState(525);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SankaParser.Identifier, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primary);
		try {
			setState(535);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				parExpression();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				match(THIS);
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(534);
				match(Identifier);
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

	public static class CreatorContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_creator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			typeType(0);
			setState(540);
			switch (_input.LA(1)) {
			case LBRACK:
				{
				setState(538);
				arrayCreatorRest();
				}
				break;
			case LPAREN:
				{
				setState(539);
				classCreatorRest();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_arrayCreatorRest);
		int _la;
		try {
			setState(558);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				match(LBRACK);
				setState(543);
				match(RBRACK);
				setState(544);
				match(LBRACE);
				setState(546);
				_la = _input.LA(1);
				if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (NEW - 22)) | (1L << (THIS - 22)) | (1L << (IntegerLiteral - 22)) | (1L << (FloatingPointLiteral - 22)) | (1L << (BooleanLiteral - 22)) | (1L << (CharacterLiteral - 22)) | (1L << (StringLiteral - 22)) | (1L << (NullLiteral - 22)) | (1L << (LPAREN - 22)) | (1L << (BANG - 22)) | (1L << (TILDE - 22)) | (1L << (ADD - 22)) | (1L << (SUB - 22)) | (1L << (Identifier - 22)))) != 0)) {
					{
					setState(545);
					expressionList();
					}
				}

				setState(548);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				match(LBRACK);
				setState(550);
				expression(0);
				setState(551);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(553);
				match(LBRACK);
				setState(554);
				match(CLASS);
				setState(555);
				typeType(0);
				setState(556);
				match(RBRACK);
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(LPAREN);
			setState(562);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (NEW - 22)) | (1L << (THIS - 22)) | (1L << (IntegerLiteral - 22)) | (1L << (FloatingPointLiteral - 22)) | (1L << (BooleanLiteral - 22)) | (1L << (CharacterLiteral - 22)) | (1L << (StringLiteral - 22)) | (1L << (NullLiteral - 22)) | (1L << (LPAREN - 22)) | (1L << (BANG - 22)) | (1L << (TILDE - 22)) | (1L << (ADD - 22)) | (1L << (SUB - 22)) | (1L << (Identifier - 22)))) != 0)) {
				{
				setState(561);
				expressionList();
				}
			}

			setState(564);
			match(RPAREN);
			setState(566);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(565);
				classBody();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(SankaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(SankaParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(SankaParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SankaParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(SankaParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SankaListener ) ((SankaListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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
		case 17:
			return typeType_sempred((TypeTypeContext)_localctx, predIndex);
		case 39:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeType_sempred(TypeTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		case 13:
			return precpred(_ctx, 17);
		case 14:
			return precpred(_ctx, 16);
		case 15:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\u023d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\5\2^\n\2\3\2\7\2a\n\2\f\2\16\2d\13\2\3\2\7\2g\n\2"+
		"\f\2\16\2j\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4v\n\4\3\4\3"+
		"\4\3\5\3\5\5\5|\n\5\3\6\3\6\3\6\5\6\u0081\n\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\7\7\u0089\n\7\f\7\16\7\u008c\13\7\3\7\3\7\3\b\3\b\3\b\5\b\u0093\n\b\3"+
		"\b\3\b\3\t\3\t\7\t\u0099\n\t\f\t\16\t\u009c\13\t\3\t\3\t\3\n\3\n\7\n\u00a2"+
		"\n\n\f\n\16\n\u00a5\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00b5\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\7"+
		"\r\u00be\n\r\f\r\16\r\u00c1\13\r\3\r\3\r\3\r\3\r\5\r\u00c7\n\r\3\r\3\r"+
		"\3\r\7\r\u00cc\n\r\f\r\16\r\u00cf\13\r\3\r\3\r\3\r\3\r\7\r\u00d5\n\r\f"+
		"\r\16\r\u00d8\13\r\3\r\3\r\5\r\u00dc\n\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\7\20\u00e5\n\20\f\20\16\20\u00e8\13\20\3\20\3\20\5\20\u00ec\n\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00f4\n\21\3\22\7\22\u00f7\n\22\f"+
		"\22\16\22\u00fa\13\22\3\22\3\22\5\22\u00fe\n\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\5\23\u0107\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u0111\n\23\f\23\16\23\u0114\13\23\3\24\3\24\7\24\u0118\n\24\f\24"+
		"\16\24\u011b\13\24\3\24\3\24\5\24\u011f\n\24\3\25\3\25\3\25\3\25\7\25"+
		"\u0125\n\25\f\25\16\25\u0128\13\25\3\25\3\25\3\26\3\26\3\27\3\27\5\27"+
		"\u0130\n\27\3\27\3\27\3\30\3\30\3\30\7\30\u0137\n\30\f\30\16\30\u013a"+
		"\13\30\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u0142\n\32\f\32\16\32\u0145"+
		"\13\32\3\33\3\33\7\33\u0149\n\33\f\33\16\33\u014c\13\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0169\n\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0177\n\34"+
		"\3\35\5\35\u017a\n\35\3\35\3\35\3\35\3\35\5\35\u0180\n\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u0189\n\36\3\37\3\37\3\37\5\37\u018e\n\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0196\n\37\3 \3 \3 \3 \3 \5 \u019d"+
		"\n \3!\3!\5!\u01a1\n!\3\"\3\"\5\"\u01a5\n\"\3\"\3\"\3\"\3\"\5\"\u01ab"+
		"\n\"\5\"\u01ad\n\"\3#\3#\3#\5#\u01b2\n#\3$\3$\5$\u01b6\n$\3%\3%\3%\3%"+
		"\5%\u01bc\n%\3%\3%\3%\3&\3&\3&\3&\3&\3&\5&\u01c7\n&\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\7(\u01d0\n(\f(\16(\u01d3\13(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01dd"+
		"\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\5)\u020e\n)\3)\7)\u0211\n)\f)\16)\u0214\13)\3*\3*\3*\3*\5*\u021a"+
		"\n*\3+\3+\3+\5+\u021f\n+\3,\3,\3,\3,\5,\u0225\n,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\5,\u0231\n,\3-\3-\5-\u0235\n-\3-\3-\5-\u0239\n-\3.\3.\3.\2\4"+
		"$P/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\2\f\5\2\24\24\32\32\35\35\t\2\5\5\7\7\r\r\20\20\25\25\27"+
		"\27\34\34\3\2BC\3\2DE\3\289\4\2FGKK\3\2\3\4\4\2\66\67=>\4\2<<??\3\2&+"+
		"\u026c\2]\3\2\2\2\4m\3\2\2\2\6q\3\2\2\2\b{\3\2\2\2\n}\3\2\2\2\f\u0084"+
		"\3\2\2\2\16\u008f\3\2\2\2\20\u0096\3\2\2\2\22\u009f\3\2\2\2\24\u00b4\3"+
		"\2\2\2\26\u00b6\3\2\2\2\30\u00db\3\2\2\2\32\u00dd\3\2\2\2\34\u00df\3\2"+
		"\2\2\36\u00e6\3\2\2\2 \u00f3\3\2\2\2\"\u00f8\3\2\2\2$\u0106\3\2\2\2&\u0119"+
		"\3\2\2\2(\u0120\3\2\2\2*\u012b\3\2\2\2,\u012d\3\2\2\2.\u0133\3\2\2\2\60"+
		"\u013b\3\2\2\2\62\u013e\3\2\2\2\64\u0146\3\2\2\2\66\u0176\3\2\2\28\u0179"+
		"\3\2\2\2:\u0188\3\2\2\2<\u0195\3\2\2\2>\u0197\3\2\2\2@\u01a0\3\2\2\2B"+
		"\u01ac\3\2\2\2D\u01b1\3\2\2\2F\u01b5\3\2\2\2H\u01b7\3\2\2\2J\u01c6\3\2"+
		"\2\2L\u01c8\3\2\2\2N\u01cc\3\2\2\2P\u01dc\3\2\2\2R\u0219\3\2\2\2T\u021b"+
		"\3\2\2\2V\u0230\3\2\2\2X\u0232\3\2\2\2Z\u023a\3\2\2\2\\^\5\4\3\2]\\\3"+
		"\2\2\2]^\3\2\2\2^b\3\2\2\2_a\5\6\4\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3"+
		"\2\2\2ch\3\2\2\2db\3\2\2\2eg\5\b\5\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\2\2\3l\3\3\2\2\2mn\7\31\2\2no\5\62\32\2"+
		"op\7\62\2\2p\5\3\2\2\2qr\7\23\2\2ru\5\62\32\2st\7\64\2\2tv\7F\2\2us\3"+
		"\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\62\2\2x\7\3\2\2\2y|\5\n\6\2z|\5\16\b\2"+
		"{y\3\2\2\2{z\3\2\2\2|\t\3\2\2\2}~\7\t\2\2~\u0080\7L\2\2\177\u0081\5\f"+
		"\7\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083"+
		"\5\20\t\2\u0083\13\3\2\2\2\u0084\u0085\7\67\2\2\u0085\u008a\7L\2\2\u0086"+
		"\u0087\7\63\2\2\u0087\u0089\7L\2\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\7\66\2\2\u008e\r\3\2\2\2\u008f\u0090\7\26\2"+
		"\2\u0090\u0092\7L\2\2\u0091\u0093\5\f\7\2\u0092\u0091\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\5\22\n\2\u0095\17\3\2\2\2\u0096"+
		"\u009a\7.\2\2\u0097\u0099\5\24\13\2\u0098\u0097\3\2\2\2\u0099\u009c\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\7/\2\2\u009e\21\3\2\2\2\u009f\u00a3\7.\2\2"+
		"\u00a0\u00a2\5 \21\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\7/\2\2\u00a7\23\3\2\2\2\u00a8\u00b5\5\26\f\2\u00a9\u00b5\5\30\r"+
		"\2\u00aa\u00ab\7\17\2\2\u00ab\u00b5\7L\2\2\u00ac\u00b5\5\34\17\2\u00ad"+
		"\u00b5\5\36\20\2\u00ae\u00af\7#\2\2\u00af\u00b0\7*\2\2\u00b0\u00b5\7\62"+
		"\2\2\u00b1\u00b2\7$\2\2\u00b2\u00b3\7*\2\2\u00b3\u00b5\7\62\2\2\u00b4"+
		"\u00a8\3\2\2\2\u00b4\u00a9\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00ac\3\2"+
		"\2\2\u00b4\u00ad\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5"+
		"\25\3\2\2\2\u00b6\u00b7\7\n\2\2\u00b7\u00b8\7L\2\2\u00b8\u00b9\7\65\2"+
		"\2\u00b9\u00ba\5P)\2\u00ba\u00bb\7\62\2\2\u00bb\27\3\2\2\2\u00bc\u00be"+
		"\5\32\16\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3"+
		"\5$\23\2\u00c3\u00c6\7L\2\2\u00c4\u00c5\7\65\2\2\u00c5\u00c7\5P)\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\62"+
		"\2\2\u00c9\u00dc\3\2\2\2\u00ca\u00cc\5\32\16\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\5$\23\2\u00d1\u00d6\7L\2\2\u00d2"+
		"\u00d3\7\63\2\2\u00d3\u00d5\7L\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00da\7\62\2\2\u00da\u00dc\3\2\2\2\u00db\u00bf\3"+
		"\2\2\2\u00db\u00cd\3\2\2\2\u00dc\31\3\2\2\2\u00dd\u00de\t\2\2\2\u00de"+
		"\33\3\2\2\2\u00df\u00e0\7L\2\2\u00e0\u00e1\5,\27\2\u00e1\u00e2\5\64\33"+
		"\2\u00e2\35\3\2\2\2\u00e3\u00e5\5\32\16\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8"+
		"\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00eb\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00ec\5$\23\2\u00ea\u00ec\7!\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7L\2\2\u00ee"+
		"\u00ef\5,\27\2\u00ef\u00f0\5\64\33\2\u00f0\37\3\2\2\2\u00f1\u00f4\5\26"+
		"\f\2\u00f2\u00f4\5\"\22\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"!\3\2\2\2\u00f5\u00f7\5\32\16\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2"+
		"\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fd\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fb\u00fe\5$\23\2\u00fc\u00fe\7!\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7L\2\2\u0100\u0101\5,\27"+
		"\2\u0101\u0102\7\62\2\2\u0102#\3\2\2\2\u0103\u0104\b\23\1\2\u0104\u0107"+
		"\5&\24\2\u0105\u0107\5*\26\2\u0106\u0103\3\2\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\u0112\3\2\2\2\u0108\u0109\f\4\2\2\u0109\u010a\7\60\2\2\u010a\u0111\7"+
		"\61\2\2\u010b\u010c\f\3\2\2\u010c\u010d\7\60\2\2\u010d\u010e\5$\23\2\u010e"+
		"\u010f\7\61\2\2\u010f\u0111\3\2\2\2\u0110\u0108\3\2\2\2\u0110\u010b\3"+
		"\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"%\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7L\2\2\u0116\u0118\7\64\2\2"+
		"\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011e\7L\2\2\u011d"+
		"\u011f\5(\25\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\'\3\2\2\2"+
		"\u0120\u0121\7\67\2\2\u0121\u0126\5$\23\2\u0122\u0123\7\63\2\2\u0123\u0125"+
		"\5$\23\2\u0124\u0122\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7\66"+
		"\2\2\u012a)\3\2\2\2\u012b\u012c\t\3\2\2\u012c+\3\2\2\2\u012d\u012f\7,"+
		"\2\2\u012e\u0130\5.\30\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\7-\2\2\u0132-\3\2\2\2\u0133\u0138\5\60\31\2"+
		"\u0134\u0135\7\63\2\2\u0135\u0137\5\60\31\2\u0136\u0134\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139/\3\2\2\2"+
		"\u013a\u0138\3\2\2\2\u013b\u013c\5$\23\2\u013c\u013d\7L\2\2\u013d\61\3"+
		"\2\2\2\u013e\u0143\7L\2\2\u013f\u0140\7\64\2\2\u0140\u0142\7L\2\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\63\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u014a\7.\2\2\u0147\u0149"+
		"\5\66\34\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2"+
		"\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e"+
		"\7/\2\2\u014e\65\3\2\2\2\u014f\u0177\5\64\33\2\u0150\u0151\58\35\2\u0151"+
		"\u0152\7\62\2\2\u0152\u0177\3\2\2\2\u0153\u0154\5:\36\2\u0154\u0155\7"+
		"\62\2\2\u0155\u0177\3\2\2\2\u0156\u0177\5> \2\u0157\u0158\7\21\2\2\u0158"+
		"\u0159\7,\2\2\u0159\u015a\5B\"\2\u015a\u015b\7-\2\2\u015b\u015c\5\64\33"+
		"\2\u015c\u0177\3\2\2\2\u015d\u015e\7\"\2\2\u015e\u015f\5L\'\2\u015f\u0160"+
		"\5\64\33\2\u0160\u0177\3\2\2\2\u0161\u0162\7\36\2\2\u0162\u0163\5L\'\2"+
		"\u0163\u0164\5\64\33\2\u0164\u0177\3\2\2\2\u0165\u0177\5J&\2\u0166\u0168"+
		"\7\33\2\2\u0167\u0169\5P)\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u0177\7\62\2\2\u016b\u016c\7\6\2\2\u016c\u0177\7"+
		"\62\2\2\u016d\u016e\7\13\2\2\u016e\u0177\7\62\2\2\u016f\u0170\5P)\2\u0170"+
		"\u0171\7\62\2\2\u0171\u0177\3\2\2\2\u0172\u0173\7%\2\2\u0173\u0174\7*"+
		"\2\2\u0174\u0177\7\62\2\2\u0175\u0177\7\62\2\2\u0176\u014f\3\2\2\2\u0176"+
		"\u0150\3\2\2\2\u0176\u0153\3\2\2\2\u0176\u0156\3\2\2\2\u0176\u0157\3\2"+
		"\2\2\u0176\u015d\3\2\2\2\u0176\u0161\3\2\2\2\u0176\u0165\3\2\2\2\u0176"+
		"\u0166\3\2\2\2\u0176\u016b\3\2\2\2\u0176\u016d\3\2\2\2\u0176\u016f\3\2"+
		"\2\2\u0176\u0172\3\2\2\2\u0176\u0175\3\2\2\2\u0177\67\3\2\2\2\u0178\u017a"+
		"\7\24\2\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2"+
		"\u017b\u017c\7 \2\2\u017c\u017f\7L\2\2\u017d\u017e\7\65\2\2\u017e\u0180"+
		"\5P)\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u01809\3\2\2\2\u0181\u0182"+
		"\5<\37\2\u0182\u0183\7\65\2\2\u0183\u0184\5P)\2\u0184\u0189\3\2\2\2\u0185"+
		"\u0186\5<\37\2\u0186\u0187\t\4\2\2\u0187\u0189\3\2\2\2\u0188\u0181\3\2"+
		"\2\2\u0188\u0185\3\2\2\2\u0189;\3\2\2\2\u018a\u018b\5P)\2\u018b\u018c"+
		"\7\64\2\2\u018c\u018e\3\2\2\2\u018d\u018a\3\2\2\2\u018d\u018e\3\2\2\2"+
		"\u018e\u018f\3\2\2\2\u018f\u0196\7L\2\2\u0190\u0191\5P)\2\u0191\u0192"+
		"\7\60\2\2\u0192\u0193\5P)\2\u0193\u0194\7\61\2\2\u0194\u0196\3\2\2\2\u0195"+
		"\u018d\3\2\2\2\u0195\u0190\3\2\2\2\u0196=\3\2\2\2\u0197\u0198\7\22\2\2"+
		"\u0198\u0199\5L\'\2\u0199\u019c\5\64\33\2\u019a\u019b\7\16\2\2\u019b\u019d"+
		"\5@!\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d?\3\2\2\2\u019e\u01a1"+
		"\5\64\33\2\u019f\u01a1\5> \2\u01a0\u019e\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1"+
		"A\3\2\2\2\u01a2\u01ad\5H%\2\u01a3\u01a5\5D#\2\u01a4\u01a3\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7\62\2\2\u01a7\u01a8\5"+
		"P)\2\u01a8\u01aa\7\62\2\2\u01a9\u01ab\5F$\2\u01aa\u01a9\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01a2\3\2\2\2\u01ac\u01a4\3\2"+
		"\2\2\u01adC\3\2\2\2\u01ae\u01b2\58\35\2\u01af\u01b2\5:\36\2\u01b0\u01b2"+
		"\5P)\2\u01b1\u01ae\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2"+
		"E\3\2\2\2\u01b3\u01b6\5:\36\2\u01b4\u01b6\5P)\2\u01b5\u01b3\3\2\2\2\u01b5"+
		"\u01b4\3\2\2\2\u01b6G\3\2\2\2\u01b7\u01b8\7 \2\2\u01b8\u01bb\7L\2\2\u01b9"+
		"\u01ba\7\63\2\2\u01ba\u01bc\7L\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\7;\2\2\u01be\u01bf\5P)\2\u01bfI\3"+
		"\2\2\2\u01c0\u01c1\7\b\2\2\u01c1\u01c2\5P)\2\u01c2\u01c3\7;\2\2\u01c3"+
		"\u01c7\3\2\2\2\u01c4\u01c5\7\f\2\2\u01c5\u01c7\7;\2\2\u01c6\u01c0\3\2"+
		"\2\2\u01c6\u01c4\3\2\2\2\u01c7K\3\2\2\2\u01c8\u01c9\7,\2\2\u01c9\u01ca"+
		"\5P)\2\u01ca\u01cb\7-\2\2\u01cbM\3\2\2\2\u01cc\u01d1\5P)\2\u01cd\u01ce"+
		"\7\63\2\2\u01ce\u01d0\5P)\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2O\3\2\2\2\u01d3\u01d1\3\2\2\2"+
		"\u01d4\u01d5\b)\1\2\u01d5\u01d6\t\5\2\2\u01d6\u01dd\5P)\17\u01d7\u01d8"+
		"\t\6\2\2\u01d8\u01dd\5P)\16\u01d9\u01dd\5R*\2\u01da\u01db\7\30\2\2\u01db"+
		"\u01dd\5T+\2\u01dc\u01d4\3\2\2\2\u01dc\u01d7\3\2\2\2\u01dc\u01d9\3\2\2"+
		"\2\u01dc\u01da\3\2\2\2\u01dd\u0212\3\2\2\2\u01de\u01df\f\r\2\2\u01df\u01e0"+
		"\t\7\2\2\u01e0\u0211\5P)\16\u01e1\u01e2\f\f\2\2\u01e2\u01e3\t\5\2\2\u01e3"+
		"\u0211\5P)\r\u01e4\u01e5\f\13\2\2\u01e5\u01e6\t\b\2\2\u01e6\u0211\5P)"+
		"\f\u01e7\u01e8\f\n\2\2\u01e8\u01e9\t\t\2\2\u01e9\u0211\5P)\13\u01ea\u01eb"+
		"\f\t\2\2\u01eb\u01ec\t\n\2\2\u01ec\u0211\5P)\n\u01ed\u01ee\f\b\2\2\u01ee"+
		"\u01ef\7H\2\2\u01ef\u0211\5P)\t\u01f0\u01f1\f\7\2\2\u01f1\u01f2\7J\2\2"+
		"\u01f2\u0211\5P)\b\u01f3\u01f4\f\6\2\2\u01f4\u01f5\7I\2\2\u01f5\u0211"+
		"\5P)\7\u01f6\u01f7\f\5\2\2\u01f7\u01f8\7@\2\2\u01f8\u0211\5P)\6\u01f9"+
		"\u01fa\f\4\2\2\u01fa\u01fb\7A\2\2\u01fb\u0211\5P)\5\u01fc\u01fd\f\3\2"+
		"\2\u01fd\u01fe\7:\2\2\u01fe\u01ff\5P)\2\u01ff\u0200\7;\2\2\u0200\u0201"+
		"\5P)\4\u0201\u0211\3\2\2\2\u0202\u0203\f\23\2\2\u0203\u0204\7\64\2\2\u0204"+
		"\u0211\7L\2\2\u0205\u0206\f\22\2\2\u0206\u0207\7\60\2\2\u0207\u0208\5"+
		"P)\2\u0208\u0209\7\61\2\2\u0209\u0211\3\2\2\2\u020a\u020b\f\21\2\2\u020b"+
		"\u020d\7,\2\2\u020c\u020e\5N(\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2"+
		"\2\u020e\u020f\3\2\2\2\u020f\u0211\7-\2\2\u0210\u01de\3\2\2\2\u0210\u01e1"+
		"\3\2\2\2\u0210\u01e4\3\2\2\2\u0210\u01e7\3\2\2\2\u0210\u01ea\3\2\2\2\u0210"+
		"\u01ed\3\2\2\2\u0210\u01f0\3\2\2\2\u0210\u01f3\3\2\2\2\u0210\u01f6\3\2"+
		"\2\2\u0210\u01f9\3\2\2\2\u0210\u01fc\3\2\2\2\u0210\u0202\3\2\2\2\u0210"+
		"\u0205\3\2\2\2\u0210\u020a\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2"+
		"\2\2\u0212\u0213\3\2\2\2\u0213Q\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u021a"+
		"\5L\'\2\u0216\u021a\7\37\2\2\u0217\u021a\5Z.\2\u0218\u021a\7L\2\2\u0219"+
		"\u0215\3\2\2\2\u0219\u0216\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u0218\3\2"+
		"\2\2\u021aS\3\2\2\2\u021b\u021e\5$\23\2\u021c\u021f\5V,\2\u021d\u021f"+
		"\5X-\2\u021e\u021c\3\2\2\2\u021e\u021d\3\2\2\2\u021fU\3\2\2\2\u0220\u0221"+
		"\7\60\2\2\u0221\u0222\7\61\2\2\u0222\u0224\7.\2\2\u0223\u0225\5N(\2\u0224"+
		"\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0231\7/"+
		"\2\2\u0227\u0228\7\60\2\2\u0228\u0229\5P)\2\u0229\u022a\7\61\2\2\u022a"+
		"\u0231\3\2\2\2\u022b\u022c\7\60\2\2\u022c\u022d\7\t\2\2\u022d\u022e\5"+
		"$\23\2\u022e\u022f\7\61\2\2\u022f\u0231\3\2\2\2\u0230\u0220\3\2\2\2\u0230"+
		"\u0227\3\2\2\2\u0230\u022b\3\2\2\2\u0231W\3\2\2\2\u0232\u0234\7,\2\2\u0233"+
		"\u0235\5N(\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\3\2\2"+
		"\2\u0236\u0238\7-\2\2\u0237\u0239\5\20\t\2\u0238\u0237\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239Y\3\2\2\2\u023a\u023b\t\13\2\2\u023b[\3\2\2\2<]bhu{\u0080"+
		"\u008a\u0092\u009a\u00a3\u00b4\u00bf\u00c6\u00cd\u00d6\u00db\u00e6\u00eb"+
		"\u00f3\u00f8\u00fd\u0106\u0110\u0112\u0119\u011e\u0126\u012f\u0138\u0143"+
		"\u014a\u0168\u0176\u0179\u017f\u0188\u018d\u0195\u019c\u01a0\u01a4\u01aa"+
		"\u01ac\u01b1\u01b5\u01bb\u01c6\u01d1\u01dc\u020d\u0210\u0212\u0219\u021e"+
		"\u0224\u0230\u0234\u0238";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}