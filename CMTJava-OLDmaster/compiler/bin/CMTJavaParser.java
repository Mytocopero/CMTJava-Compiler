// $ANTLR 3.2 Sep 23, 2009 12:02:23 CMTJava.g 2015-11-22 10:21:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class CMTJavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENTIFIER", "INTLITERAL", "LONGLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", "TRUE", "FALSE", "NULL", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "Exponent", "NonIntegerNumber", "FloatSuffix", "DoubleSuffix", "EscapeSequence", "WS", "COMMENT", "LINE_COMMENT", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "GOTO", "IF", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SEMI", "COMMA", "DOT", "ELLIPSIS", "EQ", "BANG", "TILDE", "QUES", "COLON", "EQEQ", "AMPAMP", "BARBAR", "PLUSPLUS", "SUBSUB", "PLUS", "SUB", "STAR", "SLASH", "AMP", "BAR", "CARET", "PERCENT", "PLUSEQ", "SUBEQ", "STAREQ", "SLASHEQ", "AMPEQ", "BAREQ", "CARETEQ", "PERCENTEQ", "MONKEYS_AT", "BANGEQ", "GT", "LT", "IdentifierStart", "IdentifierPart", "SurrogateIdentifer", "'TObject'", "'STMDO'", "'<-'"
    };
    public static final int THROW=69;
    public static final int STATIC=63;
    public static final int LongSuffix=15;
    public static final int LONGLITERAL=6;
    public static final int INTERFACE=53;
    public static final int BREAK=29;
    public static final int BYTE=30;
    public static final int ELSE=40;
    public static final int PLUSEQ=104;
    public static final int IF=48;
    public static final int STAREQ=106;
    public static final int BAREQ=109;
    public static final int ENUM=41;
    public static final int SUB=97;
    public static final int BANG=87;
    public static final int LPAREN=76;
    public static final int DOT=84;
    public static final int HexDigit=17;
    public static final int CASE=31;
    public static final int LINE_COMMENT=25;
    public static final int ELLIPSIS=85;
    public static final int PUBLIC=60;
    public static final int THROWS=70;
    public static final int LBRACE=78;
    public static final int GOTO=47;
    public static final int SEMI=82;
    public static final int CHAR=33;
    public static final int COMMENT=24;
    public static final int PLUSPLUS=94;
    public static final int IdentifierPart=117;
    public static final int IMPORT=50;
    public static final int CATCH=32;
    public static final int DOUBLE=39;
    public static final int PROTECTED=59;
    public static final int SurrogateIdentifer=118;
    public static final int LONG=54;
    public static final int COMMA=83;
    public static final int LBRACKET=80;
    public static final int PRIVATE=58;
    public static final int SUBSUB=95;
    public static final int CONTINUE=36;
    public static final int STAR=98;
    public static final int SUBEQ=105;
    public static final int PERCENT=103;
    public static final int EQEQ=91;
    public static final int BARBAR=93;
    public static final int VOLATILE=74;
    public static final int EXTENDS=42;
    public static final int INSTANCEOF=51;
    public static final int NEW=56;
    public static final int LT=115;
    public static final int PERCENTEQ=111;
    public static final int CLASS=34;
    public static final int DO=38;
    public static final int FINALLY=44;
    public static final int DoubleSuffix=21;
    public static final int HexPrefix=16;
    public static final int CONST=35;
    public static final int PACKAGE=57;
    public static final int TRY=72;
    public static final int CARETEQ=110;
    public static final int SYNCHRONIZED=67;
    public static final int NULL=13;
    public static final int AMP=100;
    public static final int FOR=46;
    public static final int TRUE=11;
    public static final int FINAL=43;
    public static final int NonIntegerNumber=19;
    public static final int RPAREN=77;
    public static final int EQ=86;
    public static final int CARET=102;
    public static final int STRINGLITERAL=10;
    public static final int BOOLEAN=28;
    public static final int RBRACE=79;
    public static final int DOUBLELITERAL=8;
    public static final int FloatSuffix=20;
    public static final int INTLITERAL=5;
    public static final int THIS=68;
    public static final int SWITCH=66;
    public static final int VOID=73;
    public static final int BANGEQ=113;
    public static final int TRANSIENT=71;
    public static final int PLUS=96;
    public static final int T__121=121;
    public static final int FLOAT=45;
    public static final int NATIVE=55;
    public static final int FLOATLITERAL=7;
    public static final int Exponent=18;
    public static final int T__120=120;
    public static final int ABSTRACT=26;
    public static final int STRICTFP=64;
    public static final int AMPAMP=92;
    public static final int INT=52;
    public static final int RETURN=61;
    public static final int CHARLITERAL=9;
    public static final int T__119=119;
    public static final int SLASHEQ=107;
    public static final int IdentifierStart=116;
    public static final int IDENTIFIER=4;
    public static final int WS=23;
    public static final int EOF=-1;
    public static final int SUPER=65;
    public static final int MONKEYS_AT=112;
    public static final int ASSERT=27;
    public static final int EscapeSequence=22;
    public static final int SLASH=99;
    public static final int AMPEQ=108;
    public static final int IMPLEMENTS=49;
    public static final int RBRACKET=81;
    public static final int COLON=90;
    public static final int GT=114;
    public static final int SHORT=62;
    public static final int BAR=101;
    public static final int QUES=89;
    public static final int IntegerNumber=14;
    public static final int FALSE=12;
    public static final int WHILE=75;
    public static final int TILDE=88;
    public static final int DEFAULT=37;

    // delegates
    // delegators


        public CMTJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CMTJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[411+1];
             
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("CMTJavaParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return CMTJavaParser.tokenNames; }
    public String getGrammarFileName() { return "CMTJava.g"; }



    	boolean TObject = false;

    	public String firstUpper(String s){

    		return s.substring(0,1).toUpperCase().concat(s.substring(1));
    	}


    public static class compilationUnit_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "compilationUnit"
    // CMTJava.g:51:1: compilationUnit : ( ( annotations )? packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* ;
    public final CMTJavaParser.compilationUnit_return compilationUnit() throws RecognitionException {
        CMTJavaParser.compilationUnit_return retval = new CMTJavaParser.compilationUnit_return();
        retval.start = input.LT(1);
        int compilationUnit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // CMTJava.g:56:5: ( ( ( annotations )? packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* )
            // CMTJava.g:56:9: ( ( annotations )? packageDeclaration )? ( importDeclaration )* ( typeDeclaration )*
            {
            // CMTJava.g:56:9: ( ( annotations )? packageDeclaration )?
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // CMTJava.g:56:13: ( annotations )? packageDeclaration
                    {
                    // CMTJava.g:56:13: ( annotations )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==MONKEYS_AT) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // CMTJava.g:56:14: annotations
                            {
                            pushFollow(FOLLOW_annotations_in_compilationUnit78);
                            annotations();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_packageDeclaration_in_compilationUnit107);
                    packageDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // CMTJava.g:60:9: ( importDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IMPORT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // CMTJava.g:60:10: importDeclaration
            	    {
            	    pushFollow(FOLLOW_importDeclaration_in_compilationUnit129);
            	    importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // CMTJava.g:62:9: ( typeDeclaration )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==IDENTIFIER||LA4_0==ABSTRACT||LA4_0==BOOLEAN||LA4_0==BYTE||(LA4_0>=CHAR && LA4_0<=CLASS)||LA4_0==DOUBLE||LA4_0==ENUM||LA4_0==FINAL||LA4_0==FLOAT||(LA4_0>=INT && LA4_0<=NATIVE)||(LA4_0>=PRIVATE && LA4_0<=PUBLIC)||(LA4_0>=SHORT && LA4_0<=STRICTFP)||LA4_0==SYNCHRONIZED||LA4_0==TRANSIENT||(LA4_0>=VOID && LA4_0<=VOLATILE)||LA4_0==SEMI||LA4_0==MONKEYS_AT||LA4_0==LT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // CMTJava.g:62:10: typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_compilationUnit151);
            	    typeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, compilationUnit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "compilationUnit"

    public static class packageDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "packageDeclaration"
    // CMTJava.g:66:1: packageDeclaration : 'package' qualifiedName ';' ;
    public final CMTJavaParser.packageDeclaration_return packageDeclaration() throws RecognitionException {
        CMTJavaParser.packageDeclaration_return retval = new CMTJavaParser.packageDeclaration_return();
        retval.start = input.LT(1);
        int packageDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // CMTJava.g:67:5: ( 'package' qualifiedName ';' )
            // CMTJava.g:67:9: 'package' qualifiedName ';'
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration182); if (state.failed) return retval;
            pushFollow(FOLLOW_qualifiedName_in_packageDeclaration184);
            qualifiedName();

            state._fsp--;
            if (state.failed) return retval;
            match(input,SEMI,FOLLOW_SEMI_in_packageDeclaration194); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, packageDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "packageDeclaration"

    public static class importDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "importDeclaration"
    // CMTJava.g:71:1: importDeclaration : ( 'import' ( 'static' )? IDENTIFIER '.' '*' ';' | 'import' ( 'static' )? IDENTIFIER ( '.' IDENTIFIER )+ ( '.' '*' )? ';' );
    public final CMTJavaParser.importDeclaration_return importDeclaration() throws RecognitionException {
        CMTJavaParser.importDeclaration_return retval = new CMTJavaParser.importDeclaration_return();
        retval.start = input.LT(1);
        int importDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // CMTJava.g:72:5: ( 'import' ( 'static' )? IDENTIFIER '.' '*' ';' | 'import' ( 'static' )? IDENTIFIER ( '.' IDENTIFIER )+ ( '.' '*' )? ';' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IMPORT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==STATIC) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==IDENTIFIER) ) {
                        int LA9_3 = input.LA(4);

                        if ( (LA9_3==DOT) ) {
                            int LA9_4 = input.LA(5);

                            if ( (LA9_4==STAR) ) {
                                alt9=1;
                            }
                            else if ( (LA9_4==IDENTIFIER) ) {
                                alt9=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA9_1==IDENTIFIER) ) {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==DOT) ) {
                        int LA9_4 = input.LA(4);

                        if ( (LA9_4==STAR) ) {
                            alt9=1;
                        }
                        else if ( (LA9_4==IDENTIFIER) ) {
                            alt9=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // CMTJava.g:72:9: 'import' ( 'static' )? IDENTIFIER '.' '*' ';'
                    {
                    match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration215); if (state.failed) return retval;
                    // CMTJava.g:73:9: ( 'static' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==STATIC) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // CMTJava.g:73:10: 'static'
                            {
                            match(input,STATIC,FOLLOW_STATIC_in_importDeclaration227); if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_importDeclaration248); if (state.failed) return retval;
                    match(input,DOT,FOLLOW_DOT_in_importDeclaration250); if (state.failed) return retval;
                    match(input,STAR,FOLLOW_STAR_in_importDeclaration252); if (state.failed) return retval;
                    match(input,SEMI,FOLLOW_SEMI_in_importDeclaration262); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:77:9: 'import' ( 'static' )? IDENTIFIER ( '.' IDENTIFIER )+ ( '.' '*' )? ';'
                    {
                    match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration279); if (state.failed) return retval;
                    // CMTJava.g:78:9: ( 'static' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==STATIC) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // CMTJava.g:78:10: 'static'
                            {
                            match(input,STATIC,FOLLOW_STATIC_in_importDeclaration291); if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_importDeclaration312); if (state.failed) return retval;
                    // CMTJava.g:81:9: ( '.' IDENTIFIER )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==DOT) ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1==IDENTIFIER) ) {
                                alt7=1;
                            }


                        }


                        switch (alt7) {
                    	case 1 :
                    	    // CMTJava.g:81:10: '.' IDENTIFIER
                    	    {
                    	    match(input,DOT,FOLLOW_DOT_in_importDeclaration323); if (state.failed) return retval;
                    	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_importDeclaration325); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // CMTJava.g:83:9: ( '.' '*' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==DOT) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // CMTJava.g:83:10: '.' '*'
                            {
                            match(input,DOT,FOLLOW_DOT_in_importDeclaration347); if (state.failed) return retval;
                            match(input,STAR,FOLLOW_STAR_in_importDeclaration349); if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,SEMI,FOLLOW_SEMI_in_importDeclaration370); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, importDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "importDeclaration"

    public static class qualifiedImportName_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "qualifiedImportName"
    // CMTJava.g:88:1: qualifiedImportName : IDENTIFIER ( '.' IDENTIFIER )* ;
    public final CMTJavaParser.qualifiedImportName_return qualifiedImportName() throws RecognitionException {
        CMTJavaParser.qualifiedImportName_return retval = new CMTJavaParser.qualifiedImportName_return();
        retval.start = input.LT(1);
        int qualifiedImportName_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // CMTJava.g:89:5: ( IDENTIFIER ( '.' IDENTIFIER )* )
            // CMTJava.g:89:9: IDENTIFIER ( '.' IDENTIFIER )*
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedImportName390); if (state.failed) return retval;
            // CMTJava.g:90:9: ( '.' IDENTIFIER )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DOT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // CMTJava.g:90:10: '.' IDENTIFIER
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_qualifiedImportName401); if (state.failed) return retval;
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedImportName403); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, qualifiedImportName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "qualifiedImportName"

    public static class typeDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "typeDeclaration"
    // CMTJava.g:94:1: typeDeclaration : ( classOrInterfaceDeclaration | ';' );
    public final CMTJavaParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        CMTJavaParser.typeDeclaration_return retval = new CMTJavaParser.typeDeclaration_return();
        retval.start = input.LT(1);
        int typeDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // CMTJava.g:95:5: ( classOrInterfaceDeclaration | ';' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENTIFIER||LA11_0==ABSTRACT||LA11_0==BOOLEAN||LA11_0==BYTE||(LA11_0>=CHAR && LA11_0<=CLASS)||LA11_0==DOUBLE||LA11_0==ENUM||LA11_0==FINAL||LA11_0==FLOAT||(LA11_0>=INT && LA11_0<=NATIVE)||(LA11_0>=PRIVATE && LA11_0<=PUBLIC)||(LA11_0>=SHORT && LA11_0<=STRICTFP)||LA11_0==SYNCHRONIZED||LA11_0==TRANSIENT||(LA11_0>=VOID && LA11_0<=VOLATILE)||LA11_0==MONKEYS_AT||LA11_0==LT) ) {
                alt11=1;
            }
            else if ( (LA11_0==SEMI) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // CMTJava.g:95:9: classOrInterfaceDeclaration
                    {
                    pushFollow(FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration434);
                    classOrInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:96:9: ';'
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_typeDeclaration444); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, typeDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeDeclaration"

    public static class classOrInterfaceDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classOrInterfaceDeclaration"
    // CMTJava.g:99:1: classOrInterfaceDeclaration : ( classDeclaration | interfaceDeclaration );
    public final CMTJavaParser.classOrInterfaceDeclaration_return classOrInterfaceDeclaration() throws RecognitionException {
        CMTJavaParser.classOrInterfaceDeclaration_return retval = new CMTJavaParser.classOrInterfaceDeclaration_return();
        retval.start = input.LT(1);
        int classOrInterfaceDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // CMTJava.g:100:5: ( classDeclaration | interfaceDeclaration )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // CMTJava.g:100:9: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_classOrInterfaceDeclaration464);
                    classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:101:9: interfaceDeclaration
                    {
                    pushFollow(FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration474);
                    interfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, classOrInterfaceDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classOrInterfaceDeclaration"

    public static class modifiers_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "modifiers"
    // CMTJava.g:105:1: modifiers : ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )* ;
    public final CMTJavaParser.modifiers_return modifiers() throws RecognitionException {
        CMTJavaParser.modifiers_return retval = new CMTJavaParser.modifiers_return();
        retval.start = input.LT(1);
        int modifiers_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // CMTJava.g:106:5: ( ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )* )
            // CMTJava.g:107:5: ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )*
            {
            // CMTJava.g:107:5: ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )*
            loop13:
            do {
                int alt13=13;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // CMTJava.g:107:10: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_modifiers509);
            	    annotation();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // CMTJava.g:108:9: 'public'
            	    {
            	    match(input,PUBLIC,FOLLOW_PUBLIC_in_modifiers519); if (state.failed) return retval;

            	    }
            	    break;
            	case 3 :
            	    // CMTJava.g:109:9: 'protected'
            	    {
            	    match(input,PROTECTED,FOLLOW_PROTECTED_in_modifiers529); if (state.failed) return retval;

            	    }
            	    break;
            	case 4 :
            	    // CMTJava.g:110:9: 'private'
            	    {
            	    match(input,PRIVATE,FOLLOW_PRIVATE_in_modifiers539); if (state.failed) return retval;

            	    }
            	    break;
            	case 5 :
            	    // CMTJava.g:111:9: 'static'
            	    {
            	    match(input,STATIC,FOLLOW_STATIC_in_modifiers549); if (state.failed) return retval;

            	    }
            	    break;
            	case 6 :
            	    // CMTJava.g:112:9: 'abstract'
            	    {
            	    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifiers559); if (state.failed) return retval;

            	    }
            	    break;
            	case 7 :
            	    // CMTJava.g:113:9: 'final'
            	    {
            	    match(input,FINAL,FOLLOW_FINAL_in_modifiers569); if (state.failed) return retval;

            	    }
            	    break;
            	case 8 :
            	    // CMTJava.g:114:9: 'native'
            	    {
            	    match(input,NATIVE,FOLLOW_NATIVE_in_modifiers579); if (state.failed) return retval;

            	    }
            	    break;
            	case 9 :
            	    // CMTJava.g:115:9: 'synchronized'
            	    {
            	    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifiers589); if (state.failed) return retval;

            	    }
            	    break;
            	case 10 :
            	    // CMTJava.g:116:9: 'transient'
            	    {
            	    match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifiers599); if (state.failed) return retval;

            	    }
            	    break;
            	case 11 :
            	    // CMTJava.g:117:9: 'volatile'
            	    {
            	    match(input,VOLATILE,FOLLOW_VOLATILE_in_modifiers609); if (state.failed) return retval;

            	    }
            	    break;
            	case 12 :
            	    // CMTJava.g:118:9: 'strictfp'
            	    {
            	    match(input,STRICTFP,FOLLOW_STRICTFP_in_modifiers619); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, modifiers_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modifiers"

    public static class variableModifiers_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableModifiers"
    // CMTJava.g:123:1: variableModifiers : ( 'final' | annotation )* ;
    public final CMTJavaParser.variableModifiers_return variableModifiers() throws RecognitionException {
        CMTJavaParser.variableModifiers_return retval = new CMTJavaParser.variableModifiers_return();
        retval.start = input.LT(1);
        int variableModifiers_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // CMTJava.g:124:5: ( ( 'final' | annotation )* )
            // CMTJava.g:124:9: ( 'final' | annotation )*
            {
            // CMTJava.g:124:9: ( 'final' | annotation )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==FINAL) ) {
                    alt14=1;
                }
                else if ( (LA14_0==MONKEYS_AT) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // CMTJava.g:124:13: 'final'
            	    {
            	    match(input,FINAL,FOLLOW_FINAL_in_variableModifiers651); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // CMTJava.g:125:13: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_variableModifiers665);
            	    annotation();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, variableModifiers_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableModifiers"

    public static class classDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classDeclaration"
    // CMTJava.g:130:1: classDeclaration : ( tObjectDeclaration | normalClassDeclaration | enumDeclaration );
    public final CMTJavaParser.classDeclaration_return classDeclaration() throws RecognitionException {
        CMTJavaParser.classDeclaration_return retval = new CMTJavaParser.classDeclaration_return();
        retval.start = input.LT(1);
        int classDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // CMTJava.g:131:5: ( tObjectDeclaration | normalClassDeclaration | enumDeclaration )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // CMTJava.g:131:7: tObjectDeclaration
                    {
                    pushFollow(FOLLOW_tObjectDeclaration_in_classDeclaration699);
                    tObjectDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:132:4: normalClassDeclaration
                    {
                    pushFollow(FOLLOW_normalClassDeclaration_in_classDeclaration707);
                    normalClassDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:133:9: enumDeclaration
                    {
                    pushFollow(FOLLOW_enumDeclaration_in_classDeclaration717);
                    enumDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, classDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classDeclaration"

    public static class tObjectDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "tObjectDeclaration"
    // CMTJava.g:136:1: tObjectDeclaration : modifiers 'class' IDENTIFIER ( typeParameters )? ( 'extends' type )? 'implements' 'TObject' ( ',' typeList )? '{' ( tObjectFieldDeclaration | constructorDeclaration )* '}' ;
    public final CMTJavaParser.tObjectDeclaration_return tObjectDeclaration() throws RecognitionException {
        CMTJavaParser.tObjectDeclaration_return retval = new CMTJavaParser.tObjectDeclaration_return();
        retval.start = input.LT(1);
        int tObjectDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // CMTJava.g:137:2: ( modifiers 'class' IDENTIFIER ( typeParameters )? ( 'extends' type )? 'implements' 'TObject' ( ',' typeList )? '{' ( tObjectFieldDeclaration | constructorDeclaration )* '}' )
            // CMTJava.g:137:4: modifiers 'class' IDENTIFIER ( typeParameters )? ( 'extends' type )? 'implements' 'TObject' ( ',' typeList )? '{' ( tObjectFieldDeclaration | constructorDeclaration )* '}'
            {
            pushFollow(FOLLOW_modifiers_in_tObjectDeclaration731);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            match(input,CLASS,FOLLOW_CLASS_in_tObjectDeclaration733); if (state.failed) return retval;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_tObjectDeclaration735); if (state.failed) return retval;
            // CMTJava.g:138:3: ( typeParameters )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // CMTJava.g:138:4: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_tObjectDeclaration740);
                    typeParameters();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // CMTJava.g:140:9: ( 'extends' type )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==EXTENDS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // CMTJava.g:140:10: 'extends' type
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_tObjectDeclaration762); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_tObjectDeclaration764);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_tObjectDeclaration785); if (state.failed) return retval;
            match(input,119,FOLLOW_119_in_tObjectDeclaration787); if (state.failed) return retval;
            // CMTJava.g:142:32: ( ',' typeList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==COMMA) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // CMTJava.g:142:33: ',' typeList
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_tObjectDeclaration790); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_tObjectDeclaration792);
                    typeList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,LBRACE,FOLLOW_LBRACE_in_tObjectDeclaration796); if (state.failed) return retval;
            // CMTJava.g:143:3: ( tObjectFieldDeclaration | constructorDeclaration )*
            loop19:
            do {
                int alt19=3;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // CMTJava.g:143:4: tObjectFieldDeclaration
            	    {
            	    pushFollow(FOLLOW_tObjectFieldDeclaration_in_tObjectDeclaration801);
            	    tObjectFieldDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // CMTJava.g:145:3: constructorDeclaration
            	    {
            	    pushFollow(FOLLOW_constructorDeclaration_in_tObjectDeclaration809);
            	    constructorDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_tObjectDeclaration818); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, tObjectDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "tObjectDeclaration"

    public static class tObjectFieldDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "tObjectFieldDeclaration"
    // CMTJava.g:150:1: tObjectFieldDeclaration : 'private' modifiers type var= variableDeclarator ';' -> fieldDec(id=$var.ididUpper=firstUpper($var.id)field=$tObjectFieldDeclaration.texttype=$type.text);
    public final CMTJavaParser.tObjectFieldDeclaration_return tObjectFieldDeclaration() throws RecognitionException {
        CMTJavaParser.tObjectFieldDeclaration_return retval = new CMTJavaParser.tObjectFieldDeclaration_return();
        retval.start = input.LT(1);
        int tObjectFieldDeclaration_StartIndex = input.index();
        CMTJavaParser.variableDeclarator_return var = null;

        CMTJavaParser.type_return type1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // CMTJava.g:151:2: ( 'private' modifiers type var= variableDeclarator ';' -> fieldDec(id=$var.ididUpper=firstUpper($var.id)field=$tObjectFieldDeclaration.texttype=$type.text))
            // CMTJava.g:151:6: 'private' modifiers type var= variableDeclarator ';'
            {
            match(input,PRIVATE,FOLLOW_PRIVATE_in_tObjectFieldDeclaration833); if (state.failed) return retval;
            pushFollow(FOLLOW_modifiers_in_tObjectFieldDeclaration835);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_tObjectFieldDeclaration837);
            type1=type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclarator_in_tObjectFieldDeclaration843);
            var=variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            match(input,SEMI,FOLLOW_SEMI_in_tObjectFieldDeclaration845); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 152:3: -> fieldDec(id=$var.ididUpper=firstUpper($var.id)field=$tObjectFieldDeclaration.texttype=$type.text)
              {
                  retval.st = templateLib.getInstanceOf("fieldDec",
                new STAttrMap().put("id", (var!=null?var.id:null)).put("idUpper", firstUpper((var!=null?var.id:null))).put("field", input.toString(retval.start,input.LT(-1))).put("type", (type1!=null?input.toString(type1.start,type1.stop):null)));
              }

              ((TokenRewriteStream)input).replace(
                ((Token)retval.start).getTokenIndex(),
                input.LT(-1).getTokenIndex(),
                retval.st);
            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, tObjectFieldDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "tObjectFieldDeclaration"

    public static class constructorDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constructorDeclaration"
    // CMTJava.g:155:1: constructorDeclaration : modifiers IDENTIFIER formalParameters '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' ;
    public final CMTJavaParser.constructorDeclaration_return constructorDeclaration() throws RecognitionException {
        CMTJavaParser.constructorDeclaration_return retval = new CMTJavaParser.constructorDeclaration_return();
        retval.start = input.LT(1);
        int constructorDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // CMTJava.g:156:2: ( modifiers IDENTIFIER formalParameters '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' )
            // CMTJava.g:157:3: modifiers IDENTIFIER formalParameters '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
            {
            pushFollow(FOLLOW_modifiers_in_constructorDeclaration889);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constructorDeclaration891); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameters_in_constructorDeclaration901);
            formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            match(input,LBRACE,FOLLOW_LBRACE_in_constructorDeclaration911); if (state.failed) return retval;
            // CMTJava.g:160:9: ( explicitConstructorInvocation )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // CMTJava.g:160:10: explicitConstructorInvocation
                    {
                    pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorDeclaration923);
                    explicitConstructorInvocation();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // CMTJava.g:162:9: ( blockStatement )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=IDENTIFIER && LA21_0<=NULL)||(LA21_0>=ABSTRACT && LA21_0<=BYTE)||(LA21_0>=CHAR && LA21_0<=CLASS)||LA21_0==CONTINUE||(LA21_0>=DO && LA21_0<=DOUBLE)||LA21_0==ENUM||LA21_0==FINAL||(LA21_0>=FLOAT && LA21_0<=FOR)||LA21_0==IF||(LA21_0>=INT && LA21_0<=NEW)||(LA21_0>=PRIVATE && LA21_0<=THROW)||(LA21_0>=TRANSIENT && LA21_0<=LPAREN)||LA21_0==LBRACE||LA21_0==SEMI||(LA21_0>=BANG && LA21_0<=TILDE)||(LA21_0>=PLUSPLUS && LA21_0<=SUB)||LA21_0==MONKEYS_AT||LA21_0==LT) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // CMTJava.g:162:10: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_constructorDeclaration945);
            	    blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_constructorDeclaration966); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, constructorDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constructorDeclaration"

    public static class normalClassDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "normalClassDeclaration"
    // CMTJava.g:167:1: normalClassDeclaration : modifiers 'class' IDENTIFIER ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody ;
    public final CMTJavaParser.normalClassDeclaration_return normalClassDeclaration() throws RecognitionException {
        CMTJavaParser.normalClassDeclaration_return retval = new CMTJavaParser.normalClassDeclaration_return();
        retval.start = input.LT(1);
        int normalClassDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // CMTJava.g:168:5: ( modifiers 'class' IDENTIFIER ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody )
            // CMTJava.g:168:9: modifiers 'class' IDENTIFIER ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody
            {
            pushFollow(FOLLOW_modifiers_in_normalClassDeclaration983);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            match(input,CLASS,FOLLOW_CLASS_in_normalClassDeclaration985); if (state.failed) return retval;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_normalClassDeclaration987); if (state.failed) return retval;
            // CMTJava.g:169:9: ( typeParameters )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // CMTJava.g:169:10: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_normalClassDeclaration998);
                    typeParameters();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // CMTJava.g:171:9: ( 'extends' type )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==EXTENDS) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // CMTJava.g:171:10: 'extends' type
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_normalClassDeclaration1020); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_normalClassDeclaration1022);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // CMTJava.g:173:9: ( 'implements' typeList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==IMPLEMENTS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // CMTJava.g:173:10: 'implements' typeList
                    {
                    match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_normalClassDeclaration1044); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_normalClassDeclaration1046);
                    typeList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_classBody_in_normalClassDeclaration1068);
            classBody();

            state._fsp--;
            if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, normalClassDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "normalClassDeclaration"

    public static class typeParameters_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "typeParameters"
    // CMTJava.g:179:1: typeParameters : '<' typeParameter ( ',' typeParameter )* '>' ;
    public final CMTJavaParser.typeParameters_return typeParameters() throws RecognitionException {
        CMTJavaParser.typeParameters_return retval = new CMTJavaParser.typeParameters_return();
        retval.start = input.LT(1);
        int typeParameters_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // CMTJava.g:180:5: ( '<' typeParameter ( ',' typeParameter )* '>' )
            // CMTJava.g:180:9: '<' typeParameter ( ',' typeParameter )* '>'
            {
            match(input,LT,FOLLOW_LT_in_typeParameters1089); if (state.failed) return retval;
            pushFollow(FOLLOW_typeParameter_in_typeParameters1103);
            typeParameter();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:182:13: ( ',' typeParameter )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==COMMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // CMTJava.g:182:14: ',' typeParameter
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_typeParameters1118); if (state.failed) return retval;
            	    pushFollow(FOLLOW_typeParameter_in_typeParameters1120);
            	    typeParameter();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match(input,GT,FOLLOW_GT_in_typeParameters1145); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, typeParameters_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeParameters"

    public static class typeParameter_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "typeParameter"
    // CMTJava.g:187:1: typeParameter : IDENTIFIER ( 'extends' typeBound )? ;
    public final CMTJavaParser.typeParameter_return typeParameter() throws RecognitionException {
        CMTJavaParser.typeParameter_return retval = new CMTJavaParser.typeParameter_return();
        retval.start = input.LT(1);
        int typeParameter_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // CMTJava.g:188:5: ( IDENTIFIER ( 'extends' typeBound )? )
            // CMTJava.g:188:9: IDENTIFIER ( 'extends' typeBound )?
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeParameter1165); if (state.failed) return retval;
            // CMTJava.g:189:9: ( 'extends' typeBound )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==EXTENDS) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // CMTJava.g:189:10: 'extends' typeBound
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_typeParameter1176); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeBound_in_typeParameter1178);
                    typeBound();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, typeParameter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeParameter"

    public static class typeBound_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "typeBound"
    // CMTJava.g:194:1: typeBound : type ( '&' type )* ;
    public final CMTJavaParser.typeBound_return typeBound() throws RecognitionException {
        CMTJavaParser.typeBound_return retval = new CMTJavaParser.typeBound_return();
        retval.start = input.LT(1);
        int typeBound_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // CMTJava.g:195:5: ( type ( '&' type )* )
            // CMTJava.g:195:9: type ( '&' type )*
            {
            pushFollow(FOLLOW_type_in_typeBound1210);
            type();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:196:9: ( '&' type )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==AMP) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // CMTJava.g:196:10: '&' type
            	    {
            	    match(input,AMP,FOLLOW_AMP_in_typeBound1221); if (state.failed) return retval;
            	    pushFollow(FOLLOW_type_in_typeBound1223);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, typeBound_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeBound"

    public static class enumDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "enumDeclaration"
    // CMTJava.g:201:1: enumDeclaration : modifiers ( 'enum' ) IDENTIFIER ( 'implements' typeList )? enumBody ;
    public final CMTJavaParser.enumDeclaration_return enumDeclaration() throws RecognitionException {
        CMTJavaParser.enumDeclaration_return retval = new CMTJavaParser.enumDeclaration_return();
        retval.start = input.LT(1);
        int enumDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // CMTJava.g:202:5: ( modifiers ( 'enum' ) IDENTIFIER ( 'implements' typeList )? enumBody )
            // CMTJava.g:202:9: modifiers ( 'enum' ) IDENTIFIER ( 'implements' typeList )? enumBody
            {
            pushFollow(FOLLOW_modifiers_in_enumDeclaration1255);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:203:9: ( 'enum' )
            // CMTJava.g:203:10: 'enum'
            {
            match(input,ENUM,FOLLOW_ENUM_in_enumDeclaration1267); if (state.failed) return retval;

            }

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDeclaration1288); if (state.failed) return retval;
            // CMTJava.g:206:9: ( 'implements' typeList )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==IMPLEMENTS) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // CMTJava.g:206:10: 'implements' typeList
                    {
                    match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_enumDeclaration1299); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_enumDeclaration1301);
                    typeList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_enumBody_in_enumDeclaration1322);
            enumBody();

            state._fsp--;
            if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, enumDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumDeclaration"

    public static class enumBody_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "enumBody"
    // CMTJava.g:212:1: enumBody : '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' ;
    public final CMTJavaParser.enumBody_return enumBody() throws RecognitionException {
        CMTJavaParser.enumBody_return retval = new CMTJavaParser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // CMTJava.g:213:5: ( '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' )
            // CMTJava.g:213:9: '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_enumBody1347); if (state.failed) return retval;
            // CMTJava.g:214:9: ( enumConstants )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==IDENTIFIER||LA29_0==MONKEYS_AT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // CMTJava.g:214:10: enumConstants
                    {
                    pushFollow(FOLLOW_enumConstants_in_enumBody1358);
                    enumConstants();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // CMTJava.g:216:9: ( ',' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==COMMA) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // CMTJava.g:0:0: ','
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_enumBody1380); if (state.failed) return retval;

                    }
                    break;

            }

            // CMTJava.g:217:9: ( enumBodyDeclarations )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SEMI) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // CMTJava.g:217:10: enumBodyDeclarations
                    {
                    pushFollow(FOLLOW_enumBodyDeclarations_in_enumBody1393);
                    enumBodyDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,RBRACE,FOLLOW_RBRACE_in_enumBody1415); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, enumBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumBody"

    public static class enumConstants_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "enumConstants"
    // CMTJava.g:222:1: enumConstants : enumConstant ( ',' enumConstant )* ;
    public final CMTJavaParser.enumConstants_return enumConstants() throws RecognitionException {
        CMTJavaParser.enumConstants_return retval = new CMTJavaParser.enumConstants_return();
        retval.start = input.LT(1);
        int enumConstants_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // CMTJava.g:223:5: ( enumConstant ( ',' enumConstant )* )
            // CMTJava.g:223:9: enumConstant ( ',' enumConstant )*
            {
            pushFollow(FOLLOW_enumConstant_in_enumConstants1435);
            enumConstant();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:224:9: ( ',' enumConstant )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==COMMA) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==IDENTIFIER||LA32_1==MONKEYS_AT) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // CMTJava.g:224:10: ',' enumConstant
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_enumConstants1446); if (state.failed) return retval;
            	    pushFollow(FOLLOW_enumConstant_in_enumConstants1448);
            	    enumConstant();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, enumConstants_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumConstants"

    public static class enumConstant_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "enumConstant"
    // CMTJava.g:228:1: enumConstant : ( annotations )? IDENTIFIER ( arguments )? ( classBody )? ;
    public final CMTJavaParser.enumConstant_return enumConstant() throws RecognitionException {
        CMTJavaParser.enumConstant_return retval = new CMTJavaParser.enumConstant_return();
        retval.start = input.LT(1);
        int enumConstant_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // CMTJava.g:233:5: ( ( annotations )? IDENTIFIER ( arguments )? ( classBody )? )
            // CMTJava.g:233:9: ( annotations )? IDENTIFIER ( arguments )? ( classBody )?
            {
            // CMTJava.g:233:9: ( annotations )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==MONKEYS_AT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // CMTJava.g:233:10: annotations
                    {
                    pushFollow(FOLLOW_annotations_in_enumConstant1482);
                    annotations();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumConstant1503); if (state.failed) return retval;
            // CMTJava.g:236:9: ( arguments )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LPAREN) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // CMTJava.g:236:10: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_enumConstant1514);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // CMTJava.g:238:9: ( classBody )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LBRACE) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // CMTJava.g:238:10: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_enumConstant1536);
                    classBody();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, enumConstant_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumConstant"

    public static class enumBodyDeclarations_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "enumBodyDeclarations"
    // CMTJava.g:244:1: enumBodyDeclarations : ';' ( classBodyDeclaration )* ;
    public final CMTJavaParser.enumBodyDeclarations_return enumBodyDeclarations() throws RecognitionException {
        CMTJavaParser.enumBodyDeclarations_return retval = new CMTJavaParser.enumBodyDeclarations_return();
        retval.start = input.LT(1);
        int enumBodyDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // CMTJava.g:245:5: ( ';' ( classBodyDeclaration )* )
            // CMTJava.g:245:9: ';' ( classBodyDeclaration )*
            {
            match(input,SEMI,FOLLOW_SEMI_in_enumBodyDeclarations1577); if (state.failed) return retval;
            // CMTJava.g:246:9: ( classBodyDeclaration )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==IDENTIFIER||LA36_0==ABSTRACT||LA36_0==BOOLEAN||LA36_0==BYTE||(LA36_0>=CHAR && LA36_0<=CLASS)||LA36_0==DOUBLE||LA36_0==ENUM||LA36_0==FINAL||LA36_0==FLOAT||(LA36_0>=INT && LA36_0<=NATIVE)||(LA36_0>=PRIVATE && LA36_0<=PUBLIC)||(LA36_0>=SHORT && LA36_0<=STRICTFP)||LA36_0==SYNCHRONIZED||LA36_0==TRANSIENT||(LA36_0>=VOID && LA36_0<=VOLATILE)||LA36_0==LBRACE||LA36_0==SEMI||LA36_0==MONKEYS_AT||LA36_0==LT) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // CMTJava.g:246:10: classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_enumBodyDeclarations1589);
            	    classBodyDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, enumBodyDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumBodyDeclarations"

    public static class interfaceDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interfaceDeclaration"
    // CMTJava.g:250:1: interfaceDeclaration : ( normalInterfaceDeclaration | annotationTypeDeclaration );
    public final CMTJavaParser.interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
        CMTJavaParser.interfaceDeclaration_return retval = new CMTJavaParser.interfaceDeclaration_return();
        retval.start = input.LT(1);
        int interfaceDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // CMTJava.g:251:5: ( normalInterfaceDeclaration | annotationTypeDeclaration )
            int alt37=2;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // CMTJava.g:251:9: normalInterfaceDeclaration
                    {
                    pushFollow(FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration1620);
                    normalInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:252:9: annotationTypeDeclaration
                    {
                    pushFollow(FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration1630);
                    annotationTypeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, interfaceDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceDeclaration"

    public static class normalInterfaceDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "normalInterfaceDeclaration"
    // CMTJava.g:255:1: normalInterfaceDeclaration : modifiers 'interface' IDENTIFIER ( typeParameters )? ( 'extends' typeList )? interfaceBody ;
    public final CMTJavaParser.normalInterfaceDeclaration_return normalInterfaceDeclaration() throws RecognitionException {
        CMTJavaParser.normalInterfaceDeclaration_return retval = new CMTJavaParser.normalInterfaceDeclaration_return();
        retval.start = input.LT(1);
        int normalInterfaceDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // CMTJava.g:256:5: ( modifiers 'interface' IDENTIFIER ( typeParameters )? ( 'extends' typeList )? interfaceBody )
            // CMTJava.g:256:9: modifiers 'interface' IDENTIFIER ( typeParameters )? ( 'extends' typeList )? interfaceBody
            {
            pushFollow(FOLLOW_modifiers_in_normalInterfaceDeclaration1654);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            match(input,INTERFACE,FOLLOW_INTERFACE_in_normalInterfaceDeclaration1656); if (state.failed) return retval;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_normalInterfaceDeclaration1658); if (state.failed) return retval;
            // CMTJava.g:257:9: ( typeParameters )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==LT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // CMTJava.g:257:10: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_normalInterfaceDeclaration1669);
                    typeParameters();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // CMTJava.g:259:9: ( 'extends' typeList )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==EXTENDS) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // CMTJava.g:259:10: 'extends' typeList
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_normalInterfaceDeclaration1691); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_normalInterfaceDeclaration1693);
                    typeList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_interfaceBody_in_normalInterfaceDeclaration1714);
            interfaceBody();

            state._fsp--;
            if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, normalInterfaceDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "normalInterfaceDeclaration"

    public static class typeList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "typeList"
    // CMTJava.g:264:1: typeList : type ( ',' type )* ;
    public final CMTJavaParser.typeList_return typeList() throws RecognitionException {
        CMTJavaParser.typeList_return retval = new CMTJavaParser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // CMTJava.g:265:5: ( type ( ',' type )* )
            // CMTJava.g:265:9: type ( ',' type )*
            {
            pushFollow(FOLLOW_type_in_typeList1733);
            type();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:266:9: ( ',' type )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // CMTJava.g:266:10: ',' type
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_typeList1745); if (state.failed) return retval;
            	    pushFollow(FOLLOW_type_in_typeList1747);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, typeList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeList"

    public static class classBody_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classBody"
    // CMTJava.g:269:1: classBody : '{' ( classBodyDeclaration )* '}' ;
    public final CMTJavaParser.classBody_return classBody() throws RecognitionException {
        CMTJavaParser.classBody_return retval = new CMTJavaParser.classBody_return();
        retval.start = input.LT(1);
        int classBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // CMTJava.g:270:5: ( '{' ( classBodyDeclaration )* '}' )
            // CMTJava.g:270:9: '{' ( classBodyDeclaration )* '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_classBody1769); if (state.failed) return retval;
            // CMTJava.g:271:9: ( classBodyDeclaration )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==IDENTIFIER||LA41_0==ABSTRACT||LA41_0==BOOLEAN||LA41_0==BYTE||(LA41_0>=CHAR && LA41_0<=CLASS)||LA41_0==DOUBLE||LA41_0==ENUM||LA41_0==FINAL||LA41_0==FLOAT||(LA41_0>=INT && LA41_0<=NATIVE)||(LA41_0>=PRIVATE && LA41_0<=PUBLIC)||(LA41_0>=SHORT && LA41_0<=STRICTFP)||LA41_0==SYNCHRONIZED||LA41_0==TRANSIENT||(LA41_0>=VOID && LA41_0<=VOLATILE)||LA41_0==LBRACE||LA41_0==SEMI||LA41_0==MONKEYS_AT||LA41_0==LT) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // CMTJava.g:271:10: classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody1781);
            	    classBodyDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_classBody1803); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, classBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBody"

    public static class interfaceBody_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interfaceBody"
    // CMTJava.g:276:1: interfaceBody : '{' ( interfaceBodyDeclaration )* '}' ;
    public final CMTJavaParser.interfaceBody_return interfaceBody() throws RecognitionException {
        CMTJavaParser.interfaceBody_return retval = new CMTJavaParser.interfaceBody_return();
        retval.start = input.LT(1);
        int interfaceBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // CMTJava.g:277:5: ( '{' ( interfaceBodyDeclaration )* '}' )
            // CMTJava.g:277:9: '{' ( interfaceBodyDeclaration )* '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_interfaceBody1823); if (state.failed) return retval;
            // CMTJava.g:278:9: ( interfaceBodyDeclaration )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==IDENTIFIER||LA42_0==ABSTRACT||LA42_0==BOOLEAN||LA42_0==BYTE||(LA42_0>=CHAR && LA42_0<=CLASS)||LA42_0==DOUBLE||LA42_0==ENUM||LA42_0==FINAL||LA42_0==FLOAT||(LA42_0>=INT && LA42_0<=NATIVE)||(LA42_0>=PRIVATE && LA42_0<=PUBLIC)||(LA42_0>=SHORT && LA42_0<=STRICTFP)||LA42_0==SYNCHRONIZED||LA42_0==TRANSIENT||(LA42_0>=VOID && LA42_0<=VOLATILE)||LA42_0==SEMI||LA42_0==MONKEYS_AT||LA42_0==LT) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // CMTJava.g:278:10: interfaceBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_interfaceBodyDeclaration_in_interfaceBody1835);
            	    interfaceBodyDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_interfaceBody1857); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, interfaceBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceBody"

    public static class classBodyDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classBodyDeclaration"
    // CMTJava.g:283:1: classBodyDeclaration : ( ';' | ( 'static' )? block | memberDecl );
    public final CMTJavaParser.classBodyDeclaration_return classBodyDeclaration() throws RecognitionException {
        CMTJavaParser.classBodyDeclaration_return retval = new CMTJavaParser.classBodyDeclaration_return();
        retval.start = input.LT(1);
        int classBodyDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // CMTJava.g:284:5: ( ';' | ( 'static' )? block | memberDecl )
            int alt44=3;
            switch ( input.LA(1) ) {
            case SEMI:
                {
                alt44=1;
                }
                break;
            case STATIC:
                {
                int LA44_2 = input.LA(2);

                if ( (LA44_2==IDENTIFIER||LA44_2==ABSTRACT||LA44_2==BOOLEAN||LA44_2==BYTE||(LA44_2>=CHAR && LA44_2<=CLASS)||LA44_2==DOUBLE||LA44_2==ENUM||LA44_2==FINAL||LA44_2==FLOAT||(LA44_2>=INT && LA44_2<=NATIVE)||(LA44_2>=PRIVATE && LA44_2<=PUBLIC)||(LA44_2>=SHORT && LA44_2<=STRICTFP)||LA44_2==SYNCHRONIZED||LA44_2==TRANSIENT||(LA44_2>=VOID && LA44_2<=VOLATILE)||LA44_2==MONKEYS_AT||LA44_2==LT) ) {
                    alt44=3;
                }
                else if ( (LA44_2==LBRACE) ) {
                    alt44=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;
                }
                }
                break;
            case LBRACE:
                {
                alt44=2;
                }
                break;
            case IDENTIFIER:
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
            case DOUBLE:
            case ENUM:
            case FINAL:
            case FLOAT:
            case INT:
            case INTERFACE:
            case LONG:
            case NATIVE:
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
            case SHORT:
            case STRICTFP:
            case SYNCHRONIZED:
            case TRANSIENT:
            case VOID:
            case VOLATILE:
            case MONKEYS_AT:
            case LT:
                {
                alt44=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // CMTJava.g:284:9: ';'
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_classBodyDeclaration1877); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:285:9: ( 'static' )? block
                    {
                    // CMTJava.g:285:9: ( 'static' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==STATIC) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // CMTJava.g:285:10: 'static'
                            {
                            match(input,STATIC,FOLLOW_STATIC_in_classBodyDeclaration1888); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_block_in_classBodyDeclaration1910);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:288:9: memberDecl
                    {
                    pushFollow(FOLLOW_memberDecl_in_classBodyDeclaration1920);
                    memberDecl();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, classBodyDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBodyDeclaration"

    public static class memberDecl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "memberDecl"
    // CMTJava.g:291:1: memberDecl : ( fieldDeclaration | methodDeclaration | classDeclaration | interfaceDeclaration );
    public final CMTJavaParser.memberDecl_return memberDecl() throws RecognitionException {
        CMTJavaParser.memberDecl_return retval = new CMTJavaParser.memberDecl_return();
        retval.start = input.LT(1);
        int memberDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // CMTJava.g:292:5: ( fieldDeclaration | methodDeclaration | classDeclaration | interfaceDeclaration )
            int alt45=4;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // CMTJava.g:292:10: fieldDeclaration
                    {
                    pushFollow(FOLLOW_fieldDeclaration_in_memberDecl1941);
                    fieldDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:293:10: methodDeclaration
                    {
                    pushFollow(FOLLOW_methodDeclaration_in_memberDecl1952);
                    methodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:294:10: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_memberDecl1963);
                    classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // CMTJava.g:295:10: interfaceDeclaration
                    {
                    pushFollow(FOLLOW_interfaceDeclaration_in_memberDecl1974);
                    interfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, memberDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "memberDecl"

    public static class methodDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "methodDeclaration"
    // CMTJava.g:299:1: methodDeclaration : ( modifiers ( typeParameters )? IDENTIFIER formalParameters ( 'throws' qualifiedNameList )? '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' | modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( block | ';' ) );
    public final CMTJavaParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        CMTJavaParser.methodDeclaration_return retval = new CMTJavaParser.methodDeclaration_return();
        retval.start = input.LT(1);
        int methodDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // CMTJava.g:300:5: ( modifiers ( typeParameters )? IDENTIFIER formalParameters ( 'throws' qualifiedNameList )? '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' | modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( block | ';' ) )
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // CMTJava.g:302:10: modifiers ( typeParameters )? IDENTIFIER formalParameters ( 'throws' qualifiedNameList )? '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
                    {
                    pushFollow(FOLLOW_modifiers_in_methodDeclaration2012);
                    modifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    // CMTJava.g:303:9: ( typeParameters )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==LT) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // CMTJava.g:303:10: typeParameters
                            {
                            pushFollow(FOLLOW_typeParameters_in_methodDeclaration2023);
                            typeParameters();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration2044); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration2054);
                    formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    // CMTJava.g:307:9: ( 'throws' qualifiedNameList )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==THROWS) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // CMTJava.g:307:10: 'throws' qualifiedNameList
                            {
                            match(input,THROWS,FOLLOW_THROWS_in_methodDeclaration2065); if (state.failed) return retval;
                            pushFollow(FOLLOW_qualifiedNameList_in_methodDeclaration2067);
                            qualifiedNameList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,LBRACE,FOLLOW_LBRACE_in_methodDeclaration2088); if (state.failed) return retval;
                    // CMTJava.g:310:9: ( explicitConstructorInvocation )?
                    int alt48=2;
                    alt48 = dfa48.predict(input);
                    switch (alt48) {
                        case 1 :
                            // CMTJava.g:310:10: explicitConstructorInvocation
                            {
                            pushFollow(FOLLOW_explicitConstructorInvocation_in_methodDeclaration2100);
                            explicitConstructorInvocation();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // CMTJava.g:312:9: ( blockStatement )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( ((LA49_0>=IDENTIFIER && LA49_0<=NULL)||(LA49_0>=ABSTRACT && LA49_0<=BYTE)||(LA49_0>=CHAR && LA49_0<=CLASS)||LA49_0==CONTINUE||(LA49_0>=DO && LA49_0<=DOUBLE)||LA49_0==ENUM||LA49_0==FINAL||(LA49_0>=FLOAT && LA49_0<=FOR)||LA49_0==IF||(LA49_0>=INT && LA49_0<=NEW)||(LA49_0>=PRIVATE && LA49_0<=THROW)||(LA49_0>=TRANSIENT && LA49_0<=LPAREN)||LA49_0==LBRACE||LA49_0==SEMI||(LA49_0>=BANG && LA49_0<=TILDE)||(LA49_0>=PLUSPLUS && LA49_0<=SUB)||LA49_0==MONKEYS_AT||LA49_0==LT) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // CMTJava.g:312:10: blockStatement
                    	    {
                    	    pushFollow(FOLLOW_blockStatement_in_methodDeclaration2122);
                    	    blockStatement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    match(input,RBRACE,FOLLOW_RBRACE_in_methodDeclaration2143); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:315:9: modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( block | ';' )
                    {
                    pushFollow(FOLLOW_modifiers_in_methodDeclaration2153);
                    modifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    // CMTJava.g:316:9: ( typeParameters )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==LT) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // CMTJava.g:316:10: typeParameters
                            {
                            pushFollow(FOLLOW_typeParameters_in_methodDeclaration2164);
                            typeParameters();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // CMTJava.g:318:9: ( type | 'void' )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==IDENTIFIER||LA51_0==BOOLEAN||LA51_0==BYTE||LA51_0==CHAR||LA51_0==DOUBLE||LA51_0==FLOAT||LA51_0==INT||LA51_0==LONG||LA51_0==SHORT) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==VOID) ) {
                        alt51=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // CMTJava.g:318:10: type
                            {
                            pushFollow(FOLLOW_type_in_methodDeclaration2186);
                            type();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // CMTJava.g:319:13: 'void'
                            {
                            match(input,VOID,FOLLOW_VOID_in_methodDeclaration2200); if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration2220); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration2230);
                    formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    // CMTJava.g:323:9: ( '[' ']' )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==LBRACKET) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // CMTJava.g:323:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_methodDeclaration2241); if (state.failed) return retval;
                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_methodDeclaration2243); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    // CMTJava.g:325:9: ( 'throws' qualifiedNameList )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==THROWS) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // CMTJava.g:325:10: 'throws' qualifiedNameList
                            {
                            match(input,THROWS,FOLLOW_THROWS_in_methodDeclaration2265); if (state.failed) return retval;
                            pushFollow(FOLLOW_qualifiedNameList_in_methodDeclaration2267);
                            qualifiedNameList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // CMTJava.g:327:9: ( block | ';' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==LBRACE) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==SEMI) ) {
                        alt54=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // CMTJava.g:328:13: block
                            {
                            pushFollow(FOLLOW_block_in_methodDeclaration2322);
                            block();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // CMTJava.g:329:13: ';'
                            {
                            match(input,SEMI,FOLLOW_SEMI_in_methodDeclaration2336); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, methodDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodDeclaration"

    public static class fieldDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "fieldDeclaration"
    // CMTJava.g:333:1: fieldDeclaration : modifiers type var= variableDeclarator ( ',' variableDeclarator )* ';' ;
    public final CMTJavaParser.fieldDeclaration_return fieldDeclaration() throws RecognitionException {
        CMTJavaParser.fieldDeclaration_return retval = new CMTJavaParser.fieldDeclaration_return();
        retval.start = input.LT(1);
        int fieldDeclaration_StartIndex = input.index();
        CMTJavaParser.variableDeclarator_return var = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // CMTJava.g:334:5: ( modifiers type var= variableDeclarator ( ',' variableDeclarator )* ';' )
            // CMTJava.g:334:9: modifiers type var= variableDeclarator ( ',' variableDeclarator )* ';'
            {
            pushFollow(FOLLOW_modifiers_in_fieldDeclaration2367);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_fieldDeclaration2377);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration2391);
            var=variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:337:9: ( ',' variableDeclarator )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==COMMA) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // CMTJava.g:337:10: ',' variableDeclarator
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_fieldDeclaration2402); if (state.failed) return retval;
            	    pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration2404);
            	    variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            match(input,SEMI,FOLLOW_SEMI_in_fieldDeclaration2425); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, fieldDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldDeclaration"

    public static class variableDeclarator_return extends ParserRuleReturnScope {
        public String id;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclarator"
    // CMTJava.g:345:1: variableDeclarator returns [String id] : IDENTIFIER ( '[' ']' )* ( '=' variableInitializer )? ;
    public final CMTJavaParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        CMTJavaParser.variableDeclarator_return retval = new CMTJavaParser.variableDeclarator_return();
        retval.start = input.LT(1);
        int variableDeclarator_StartIndex = input.index();
        Token IDENTIFIER2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // CMTJava.g:346:5: ( IDENTIFIER ( '[' ']' )* ( '=' variableInitializer )? )
            // CMTJava.g:346:9: IDENTIFIER ( '[' ']' )* ( '=' variableInitializer )?
            {
            IDENTIFIER2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclarator2452); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              retval.id = (IDENTIFIER2!=null?IDENTIFIER2.getText():null);
            }
            // CMTJava.g:347:9: ( '[' ']' )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==LBRACKET) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // CMTJava.g:347:10: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_variableDeclarator2465); if (state.failed) return retval;
            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_variableDeclarator2467); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // CMTJava.g:349:9: ( '=' variableInitializer )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==EQ) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // CMTJava.g:349:10: '=' variableInitializer
                    {
                    match(input,EQ,FOLLOW_EQ_in_variableDeclarator2489); if (state.failed) return retval;
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator2491);
                    variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, variableDeclarator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"

    public static class interfaceBodyDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interfaceBodyDeclaration"
    // CMTJava.g:353:1: interfaceBodyDeclaration : ( interfaceFieldDeclaration | interfaceMethodDeclaration | interfaceDeclaration | classDeclaration | ';' );
    public final CMTJavaParser.interfaceBodyDeclaration_return interfaceBodyDeclaration() throws RecognitionException {
        CMTJavaParser.interfaceBodyDeclaration_return retval = new CMTJavaParser.interfaceBodyDeclaration_return();
        retval.start = input.LT(1);
        int interfaceBodyDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // CMTJava.g:357:5: ( interfaceFieldDeclaration | interfaceMethodDeclaration | interfaceDeclaration | classDeclaration | ';' )
            int alt59=5;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // CMTJava.g:358:9: interfaceFieldDeclaration
                    {
                    pushFollow(FOLLOW_interfaceFieldDeclaration_in_interfaceBodyDeclaration2530);
                    interfaceFieldDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:359:9: interfaceMethodDeclaration
                    {
                    pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBodyDeclaration2540);
                    interfaceMethodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:360:9: interfaceDeclaration
                    {
                    pushFollow(FOLLOW_interfaceDeclaration_in_interfaceBodyDeclaration2550);
                    interfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // CMTJava.g:361:9: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_interfaceBodyDeclaration2560);
                    classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // CMTJava.g:362:9: ';'
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_interfaceBodyDeclaration2570); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, interfaceBodyDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceBodyDeclaration"

    public static class interfaceMethodDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interfaceMethodDeclaration"
    // CMTJava.g:365:1: interfaceMethodDeclaration : modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' ;
    public final CMTJavaParser.interfaceMethodDeclaration_return interfaceMethodDeclaration() throws RecognitionException {
        CMTJavaParser.interfaceMethodDeclaration_return retval = new CMTJavaParser.interfaceMethodDeclaration_return();
        retval.start = input.LT(1);
        int interfaceMethodDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // CMTJava.g:366:5: ( modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' )
            // CMTJava.g:366:9: modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';'
            {
            pushFollow(FOLLOW_modifiers_in_interfaceMethodDeclaration2590);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:367:9: ( typeParameters )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==LT) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // CMTJava.g:367:10: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_interfaceMethodDeclaration2601);
                    typeParameters();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // CMTJava.g:369:9: ( type | 'void' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==IDENTIFIER||LA61_0==BOOLEAN||LA61_0==BYTE||LA61_0==CHAR||LA61_0==DOUBLE||LA61_0==FLOAT||LA61_0==INT||LA61_0==LONG||LA61_0==SHORT) ) {
                alt61=1;
            }
            else if ( (LA61_0==VOID) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // CMTJava.g:369:10: type
                    {
                    pushFollow(FOLLOW_type_in_interfaceMethodDeclaration2623);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:370:10: 'void'
                    {
                    match(input,VOID,FOLLOW_VOID_in_interfaceMethodDeclaration2634); if (state.failed) return retval;

                    }
                    break;

            }

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_interfaceMethodDeclaration2654); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameters_in_interfaceMethodDeclaration2664);
            formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:374:9: ( '[' ']' )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==LBRACKET) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // CMTJava.g:374:10: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_interfaceMethodDeclaration2675); if (state.failed) return retval;
            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_interfaceMethodDeclaration2677); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // CMTJava.g:376:9: ( 'throws' qualifiedNameList )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==THROWS) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // CMTJava.g:376:10: 'throws' qualifiedNameList
                    {
                    match(input,THROWS,FOLLOW_THROWS_in_interfaceMethodDeclaration2699); if (state.failed) return retval;
                    pushFollow(FOLLOW_qualifiedNameList_in_interfaceMethodDeclaration2701);
                    qualifiedNameList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,SEMI,FOLLOW_SEMI_in_interfaceMethodDeclaration2714); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, interfaceMethodDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceMethodDeclaration"

    public static class interfaceFieldDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interfaceFieldDeclaration"
    // CMTJava.g:380:1: interfaceFieldDeclaration : modifiers type variableDeclarator ( ',' variableDeclarator )* ';' ;
    public final CMTJavaParser.interfaceFieldDeclaration_return interfaceFieldDeclaration() throws RecognitionException {
        CMTJavaParser.interfaceFieldDeclaration_return retval = new CMTJavaParser.interfaceFieldDeclaration_return();
        retval.start = input.LT(1);
        int interfaceFieldDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // CMTJava.g:386:5: ( modifiers type variableDeclarator ( ',' variableDeclarator )* ';' )
            // CMTJava.g:386:9: modifiers type variableDeclarator ( ',' variableDeclarator )* ';'
            {
            pushFollow(FOLLOW_modifiers_in_interfaceFieldDeclaration2736);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_interfaceFieldDeclaration2738);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclarator_in_interfaceFieldDeclaration2740);
            variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:387:9: ( ',' variableDeclarator )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==COMMA) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // CMTJava.g:387:10: ',' variableDeclarator
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_interfaceFieldDeclaration2751); if (state.failed) return retval;
            	    pushFollow(FOLLOW_variableDeclarator_in_interfaceFieldDeclaration2753);
            	    variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            match(input,SEMI,FOLLOW_SEMI_in_interfaceFieldDeclaration2774); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, interfaceFieldDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceFieldDeclaration"

    public static class type_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type"
    // CMTJava.g:393:1: type : ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* );
    public final CMTJavaParser.type_return type() throws RecognitionException {
        CMTJavaParser.type_return retval = new CMTJavaParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // CMTJava.g:394:5: ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==IDENTIFIER) ) {
                alt67=1;
            }
            else if ( (LA67_0==BOOLEAN||LA67_0==BYTE||LA67_0==CHAR||LA67_0==DOUBLE||LA67_0==FLOAT||LA67_0==INT||LA67_0==LONG||LA67_0==SHORT) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // CMTJava.g:394:9: classOrInterfaceType ( '[' ']' )*
                    {
                    pushFollow(FOLLOW_classOrInterfaceType_in_type2795);
                    classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    // CMTJava.g:395:9: ( '[' ']' )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==LBRACKET) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // CMTJava.g:395:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_type2806); if (state.failed) return retval;
                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_type2808); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // CMTJava.g:397:9: primitiveType ( '[' ']' )*
                    {
                    pushFollow(FOLLOW_primitiveType_in_type2829);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    // CMTJava.g:398:9: ( '[' ']' )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==LBRACKET) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // CMTJava.g:398:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_type2840); if (state.failed) return retval;
                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_type2842); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class classOrInterfaceType_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classOrInterfaceType"
    // CMTJava.g:403:1: classOrInterfaceType : IDENTIFIER ( typeArguments )? ( '.' IDENTIFIER ( typeArguments )? )* ;
    public final CMTJavaParser.classOrInterfaceType_return classOrInterfaceType() throws RecognitionException {
        CMTJavaParser.classOrInterfaceType_return retval = new CMTJavaParser.classOrInterfaceType_return();
        retval.start = input.LT(1);
        int classOrInterfaceType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // CMTJava.g:404:5: ( IDENTIFIER ( typeArguments )? ( '.' IDENTIFIER ( typeArguments )? )* )
            // CMTJava.g:404:9: IDENTIFIER ( typeArguments )? ( '.' IDENTIFIER ( typeArguments )? )*
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classOrInterfaceType2874); if (state.failed) return retval;
            // CMTJava.g:405:9: ( typeArguments )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==LT) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==IDENTIFIER||LA68_1==BOOLEAN||LA68_1==BYTE||LA68_1==CHAR||LA68_1==DOUBLE||LA68_1==FLOAT||LA68_1==INT||LA68_1==LONG||LA68_1==SHORT||LA68_1==QUES) ) {
                    alt68=1;
                }
            }
            switch (alt68) {
                case 1 :
                    // CMTJava.g:405:10: typeArguments
                    {
                    pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType2885);
                    typeArguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // CMTJava.g:407:9: ( '.' IDENTIFIER ( typeArguments )? )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==DOT) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // CMTJava.g:407:10: '.' IDENTIFIER ( typeArguments )?
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_classOrInterfaceType2907); if (state.failed) return retval;
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classOrInterfaceType2909); if (state.failed) return retval;
            	    // CMTJava.g:408:13: ( typeArguments )?
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==LT) ) {
            	        int LA69_1 = input.LA(2);

            	        if ( (LA69_1==IDENTIFIER||LA69_1==BOOLEAN||LA69_1==BYTE||LA69_1==CHAR||LA69_1==DOUBLE||LA69_1==FLOAT||LA69_1==INT||LA69_1==LONG||LA69_1==SHORT||LA69_1==QUES) ) {
            	            alt69=1;
            	        }
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // CMTJava.g:408:14: typeArguments
            	            {
            	            pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType2924);
            	            typeArguments();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, classOrInterfaceType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classOrInterfaceType"

    public static class primitiveType_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "primitiveType"
    // CMTJava.g:413:1: primitiveType : ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' );
    public final CMTJavaParser.primitiveType_return primitiveType() throws RecognitionException {
        CMTJavaParser.primitiveType_return retval = new CMTJavaParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // CMTJava.g:414:5: ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' )
            // CMTJava.g:
            {
            if ( input.LA(1)==BOOLEAN||input.LA(1)==BYTE||input.LA(1)==CHAR||input.LA(1)==DOUBLE||input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==LONG||input.LA(1)==SHORT ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, primitiveType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class typeArguments_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "typeArguments"
    // CMTJava.g:424:1: typeArguments : '<' typeArgument ( ',' typeArgument )* '>' ;
    public final CMTJavaParser.typeArguments_return typeArguments() throws RecognitionException {
        CMTJavaParser.typeArguments_return retval = new CMTJavaParser.typeArguments_return();
        retval.start = input.LT(1);
        int typeArguments_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // CMTJava.g:425:5: ( '<' typeArgument ( ',' typeArgument )* '>' )
            // CMTJava.g:425:9: '<' typeArgument ( ',' typeArgument )* '>'
            {
            match(input,LT,FOLLOW_LT_in_typeArguments3062); if (state.failed) return retval;
            pushFollow(FOLLOW_typeArgument_in_typeArguments3064);
            typeArgument();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:426:9: ( ',' typeArgument )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==COMMA) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // CMTJava.g:426:10: ',' typeArgument
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_typeArguments3075); if (state.failed) return retval;
            	    pushFollow(FOLLOW_typeArgument_in_typeArguments3077);
            	    typeArgument();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            match(input,GT,FOLLOW_GT_in_typeArguments3099); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, typeArguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeArguments"

    public static class typeArgument_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "typeArgument"
    // CMTJava.g:431:1: typeArgument : ( type | '?' ( ( 'extends' | 'super' ) type )? );
    public final CMTJavaParser.typeArgument_return typeArgument() throws RecognitionException {
        CMTJavaParser.typeArgument_return retval = new CMTJavaParser.typeArgument_return();
        retval.start = input.LT(1);
        int typeArgument_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // CMTJava.g:432:5: ( type | '?' ( ( 'extends' | 'super' ) type )? )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==IDENTIFIER||LA73_0==BOOLEAN||LA73_0==BYTE||LA73_0==CHAR||LA73_0==DOUBLE||LA73_0==FLOAT||LA73_0==INT||LA73_0==LONG||LA73_0==SHORT) ) {
                alt73=1;
            }
            else if ( (LA73_0==QUES) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // CMTJava.g:432:9: type
                    {
                    pushFollow(FOLLOW_type_in_typeArgument3119);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:433:9: '?' ( ( 'extends' | 'super' ) type )?
                    {
                    match(input,QUES,FOLLOW_QUES_in_typeArgument3129); if (state.failed) return retval;
                    // CMTJava.g:434:9: ( ( 'extends' | 'super' ) type )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==EXTENDS||LA72_0==SUPER) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // CMTJava.g:435:13: ( 'extends' | 'super' ) type
                            {
                            if ( input.LA(1)==EXTENDS||input.LA(1)==SUPER ) {
                                input.consume();
                                state.errorRecovery=false;state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            pushFollow(FOLLOW_type_in_typeArgument3197);
                            type();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, typeArgument_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeArgument"

    public static class qualifiedNameList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "qualifiedNameList"
    // CMTJava.g:442:1: qualifiedNameList : qualifiedName ( ',' qualifiedName )* ;
    public final CMTJavaParser.qualifiedNameList_return qualifiedNameList() throws RecognitionException {
        CMTJavaParser.qualifiedNameList_return retval = new CMTJavaParser.qualifiedNameList_return();
        retval.start = input.LT(1);
        int qualifiedNameList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // CMTJava.g:443:5: ( qualifiedName ( ',' qualifiedName )* )
            // CMTJava.g:443:9: qualifiedName ( ',' qualifiedName )*
            {
            pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList3228);
            qualifiedName();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:444:9: ( ',' qualifiedName )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==COMMA) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // CMTJava.g:444:10: ',' qualifiedName
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_qualifiedNameList3239); if (state.failed) return retval;
            	    pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList3241);
            	    qualifiedName();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, qualifiedNameList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "qualifiedNameList"

    public static class formalParameters_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formalParameters"
    // CMTJava.g:448:1: formalParameters : '(' ( formalParameterDecls )? ')' ;
    public final CMTJavaParser.formalParameters_return formalParameters() throws RecognitionException {
        CMTJavaParser.formalParameters_return retval = new CMTJavaParser.formalParameters_return();
        retval.start = input.LT(1);
        int formalParameters_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // CMTJava.g:449:5: ( '(' ( formalParameterDecls )? ')' )
            // CMTJava.g:449:9: '(' ( formalParameterDecls )? ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_formalParameters3272); if (state.failed) return retval;
            // CMTJava.g:450:9: ( formalParameterDecls )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==IDENTIFIER||LA75_0==BOOLEAN||LA75_0==BYTE||LA75_0==CHAR||LA75_0==DOUBLE||LA75_0==FINAL||LA75_0==FLOAT||LA75_0==INT||LA75_0==LONG||LA75_0==SHORT||LA75_0==MONKEYS_AT) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // CMTJava.g:450:10: formalParameterDecls
                    {
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameters3283);
                    formalParameterDecls();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_formalParameters3305); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, formalParameters_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class formalParameterDecls_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formalParameterDecls"
    // CMTJava.g:455:1: formalParameterDecls : ( ellipsisParameterDecl | normalParameterDecl ( ',' normalParameterDecl )* | ( normalParameterDecl ',' )+ ellipsisParameterDecl );
    public final CMTJavaParser.formalParameterDecls_return formalParameterDecls() throws RecognitionException {
        CMTJavaParser.formalParameterDecls_return retval = new CMTJavaParser.formalParameterDecls_return();
        retval.start = input.LT(1);
        int formalParameterDecls_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // CMTJava.g:456:5: ( ellipsisParameterDecl | normalParameterDecl ( ',' normalParameterDecl )* | ( normalParameterDecl ',' )+ ellipsisParameterDecl )
            int alt78=3;
            switch ( input.LA(1) ) {
            case FINAL:
                {
                int LA78_1 = input.LA(2);

                if ( (synpred104_CMTJava()) ) {
                    alt78=1;
                }
                else if ( (synpred106_CMTJava()) ) {
                    alt78=2;
                }
                else if ( (true) ) {
                    alt78=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 1, input);

                    throw nvae;
                }
                }
                break;
            case MONKEYS_AT:
                {
                int LA78_2 = input.LA(2);

                if ( (synpred104_CMTJava()) ) {
                    alt78=1;
                }
                else if ( (synpred106_CMTJava()) ) {
                    alt78=2;
                }
                else if ( (true) ) {
                    alt78=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 2, input);

                    throw nvae;
                }
                }
                break;
            case IDENTIFIER:
                {
                int LA78_3 = input.LA(2);

                if ( (synpred104_CMTJava()) ) {
                    alt78=1;
                }
                else if ( (synpred106_CMTJava()) ) {
                    alt78=2;
                }
                else if ( (true) ) {
                    alt78=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 3, input);

                    throw nvae;
                }
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
                {
                int LA78_4 = input.LA(2);

                if ( (synpred104_CMTJava()) ) {
                    alt78=1;
                }
                else if ( (synpred106_CMTJava()) ) {
                    alt78=2;
                }
                else if ( (true) ) {
                    alt78=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // CMTJava.g:456:9: ellipsisParameterDecl
                    {
                    pushFollow(FOLLOW_ellipsisParameterDecl_in_formalParameterDecls3325);
                    ellipsisParameterDecl();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:457:9: normalParameterDecl ( ',' normalParameterDecl )*
                    {
                    pushFollow(FOLLOW_normalParameterDecl_in_formalParameterDecls3335);
                    normalParameterDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    // CMTJava.g:458:9: ( ',' normalParameterDecl )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==COMMA) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // CMTJava.g:458:10: ',' normalParameterDecl
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterDecls3346); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_normalParameterDecl_in_formalParameterDecls3348);
                    	    normalParameterDecl();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // CMTJava.g:460:9: ( normalParameterDecl ',' )+ ellipsisParameterDecl
                    {
                    // CMTJava.g:460:9: ( normalParameterDecl ',' )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        switch ( input.LA(1) ) {
                        case FINAL:
                            {
                            int LA77_1 = input.LA(2);

                            if ( (synpred107_CMTJava()) ) {
                                alt77=1;
                            }


                            }
                            break;
                        case MONKEYS_AT:
                            {
                            int LA77_2 = input.LA(2);

                            if ( (synpred107_CMTJava()) ) {
                                alt77=1;
                            }


                            }
                            break;
                        case IDENTIFIER:
                            {
                            int LA77_3 = input.LA(2);

                            if ( (synpred107_CMTJava()) ) {
                                alt77=1;
                            }


                            }
                            break;
                        case BOOLEAN:
                        case BYTE:
                        case CHAR:
                        case DOUBLE:
                        case FLOAT:
                        case INT:
                        case LONG:
                        case SHORT:
                            {
                            int LA77_4 = input.LA(2);

                            if ( (synpred107_CMTJava()) ) {
                                alt77=1;
                            }


                            }
                            break;

                        }

                        switch (alt77) {
                    	case 1 :
                    	    // CMTJava.g:460:10: normalParameterDecl ','
                    	    {
                    	    pushFollow(FOLLOW_normalParameterDecl_in_formalParameterDecls3370);
                    	    normalParameterDecl();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterDecls3380); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt77 >= 1 ) break loop77;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);

                    pushFollow(FOLLOW_ellipsisParameterDecl_in_formalParameterDecls3402);
                    ellipsisParameterDecl();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, formalParameterDecls_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalParameterDecls"

    public static class normalParameterDecl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "normalParameterDecl"
    // CMTJava.g:466:1: normalParameterDecl : variableModifiers type IDENTIFIER ( '[' ']' )* ;
    public final CMTJavaParser.normalParameterDecl_return normalParameterDecl() throws RecognitionException {
        CMTJavaParser.normalParameterDecl_return retval = new CMTJavaParser.normalParameterDecl_return();
        retval.start = input.LT(1);
        int normalParameterDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // CMTJava.g:467:5: ( variableModifiers type IDENTIFIER ( '[' ']' )* )
            // CMTJava.g:467:9: variableModifiers type IDENTIFIER ( '[' ']' )*
            {
            pushFollow(FOLLOW_variableModifiers_in_normalParameterDecl3422);
            variableModifiers();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_normalParameterDecl3424);
            type();

            state._fsp--;
            if (state.failed) return retval;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_normalParameterDecl3426); if (state.failed) return retval;
            // CMTJava.g:468:9: ( '[' ']' )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==LBRACKET) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // CMTJava.g:468:10: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_normalParameterDecl3437); if (state.failed) return retval;
            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_normalParameterDecl3439); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, normalParameterDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "normalParameterDecl"

    public static class ellipsisParameterDecl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ellipsisParameterDecl"
    // CMTJava.g:472:1: ellipsisParameterDecl : variableModifiers type '...' IDENTIFIER ;
    public final CMTJavaParser.ellipsisParameterDecl_return ellipsisParameterDecl() throws RecognitionException {
        CMTJavaParser.ellipsisParameterDecl_return retval = new CMTJavaParser.ellipsisParameterDecl_return();
        retval.start = input.LT(1);
        int ellipsisParameterDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // CMTJava.g:473:5: ( variableModifiers type '...' IDENTIFIER )
            // CMTJava.g:473:9: variableModifiers type '...' IDENTIFIER
            {
            pushFollow(FOLLOW_variableModifiers_in_ellipsisParameterDecl3470);
            variableModifiers();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_ellipsisParameterDecl3480);
            type();

            state._fsp--;
            if (state.failed) return retval;
            match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_ellipsisParameterDecl3483); if (state.failed) return retval;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ellipsisParameterDecl3493); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, ellipsisParameterDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ellipsisParameterDecl"

    public static class explicitConstructorInvocation_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "explicitConstructorInvocation"
    // CMTJava.g:479:1: explicitConstructorInvocation : ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' );
    public final CMTJavaParser.explicitConstructorInvocation_return explicitConstructorInvocation() throws RecognitionException {
        CMTJavaParser.explicitConstructorInvocation_return retval = new CMTJavaParser.explicitConstructorInvocation_return();
        retval.start = input.LT(1);
        int explicitConstructorInvocation_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // CMTJava.g:480:5: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' )
            int alt82=2;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // CMTJava.g:480:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
                    {
                    // CMTJava.g:480:9: ( nonWildcardTypeArguments )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==LT) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // CMTJava.g:480:10: nonWildcardTypeArguments
                            {
                            pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation3515);
                            nonWildcardTypeArguments();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( input.LA(1)==SUPER||input.LA(1)==THIS ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation3573);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,SEMI,FOLLOW_SEMI_in_explicitConstructorInvocation3575); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:487:9: primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';'
                    {
                    pushFollow(FOLLOW_primary_in_explicitConstructorInvocation3586);
                    primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,DOT,FOLLOW_DOT_in_explicitConstructorInvocation3596); if (state.failed) return retval;
                    // CMTJava.g:489:9: ( nonWildcardTypeArguments )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==LT) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // CMTJava.g:489:10: nonWildcardTypeArguments
                            {
                            pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation3607);
                            nonWildcardTypeArguments();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation3628); if (state.failed) return retval;
                    pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation3638);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,SEMI,FOLLOW_SEMI_in_explicitConstructorInvocation3640); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, explicitConstructorInvocation_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "explicitConstructorInvocation"

    public static class qualifiedName_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "qualifiedName"
    // CMTJava.g:495:1: qualifiedName : IDENTIFIER ( '.' IDENTIFIER )* ;
    public final CMTJavaParser.qualifiedName_return qualifiedName() throws RecognitionException {
        CMTJavaParser.qualifiedName_return retval = new CMTJavaParser.qualifiedName_return();
        retval.start = input.LT(1);
        int qualifiedName_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // CMTJava.g:496:5: ( IDENTIFIER ( '.' IDENTIFIER )* )
            // CMTJava.g:496:9: IDENTIFIER ( '.' IDENTIFIER )*
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedName3660); if (state.failed) return retval;
            // CMTJava.g:497:9: ( '.' IDENTIFIER )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==DOT) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // CMTJava.g:497:10: '.' IDENTIFIER
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_qualifiedName3671); if (state.failed) return retval;
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedName3673); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, qualifiedName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "qualifiedName"

    public static class annotations_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotations"
    // CMTJava.g:501:1: annotations : ( annotation )+ ;
    public final CMTJavaParser.annotations_return annotations() throws RecognitionException {
        CMTJavaParser.annotations_return retval = new CMTJavaParser.annotations_return();
        retval.start = input.LT(1);
        int annotations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // CMTJava.g:502:5: ( ( annotation )+ )
            // CMTJava.g:502:9: ( annotation )+
            {
            // CMTJava.g:502:9: ( annotation )+
            int cnt84=0;
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==MONKEYS_AT) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // CMTJava.g:502:10: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotations3705);
            	    annotation();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt84 >= 1 ) break loop84;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(84, input);
                        throw eee;
                }
                cnt84++;
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, annotations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotations"

    public static class annotation_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotation"
    // CMTJava.g:506:1: annotation : '@' qualifiedName ( '(' ( elementValuePairs | elementValue )? ')' )? ;
    public final CMTJavaParser.annotation_return annotation() throws RecognitionException {
        CMTJavaParser.annotation_return retval = new CMTJavaParser.annotation_return();
        retval.start = input.LT(1);
        int annotation_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // CMTJava.g:511:5: ( '@' qualifiedName ( '(' ( elementValuePairs | elementValue )? ')' )? )
            // CMTJava.g:511:9: '@' qualifiedName ( '(' ( elementValuePairs | elementValue )? ')' )?
            {
            match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_annotation3738); if (state.failed) return retval;
            pushFollow(FOLLOW_qualifiedName_in_annotation3740);
            qualifiedName();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:512:9: ( '(' ( elementValuePairs | elementValue )? ')' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==LPAREN) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // CMTJava.g:512:13: '(' ( elementValuePairs | elementValue )? ')'
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_annotation3754); if (state.failed) return retval;
                    // CMTJava.g:513:19: ( elementValuePairs | elementValue )?
                    int alt85=3;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==IDENTIFIER) ) {
                        int LA85_1 = input.LA(2);

                        if ( (LA85_1==EQ) ) {
                            alt85=1;
                        }
                        else if ( (LA85_1==INSTANCEOF||(LA85_1>=LPAREN && LA85_1<=RPAREN)||LA85_1==LBRACKET||LA85_1==DOT||LA85_1==QUES||(LA85_1>=EQEQ && LA85_1<=PERCENT)||(LA85_1>=BANGEQ && LA85_1<=LT)) ) {
                            alt85=2;
                        }
                    }
                    else if ( ((LA85_0>=INTLITERAL && LA85_0<=NULL)||LA85_0==BOOLEAN||LA85_0==BYTE||LA85_0==CHAR||LA85_0==DOUBLE||LA85_0==FLOAT||LA85_0==INT||LA85_0==LONG||LA85_0==NEW||LA85_0==SHORT||LA85_0==SUPER||LA85_0==THIS||LA85_0==VOID||LA85_0==LPAREN||LA85_0==LBRACE||(LA85_0>=BANG && LA85_0<=TILDE)||(LA85_0>=PLUSPLUS && LA85_0<=SUB)||LA85_0==MONKEYS_AT) ) {
                        alt85=2;
                    }
                    switch (alt85) {
                        case 1 :
                            // CMTJava.g:513:23: elementValuePairs
                            {
                            pushFollow(FOLLOW_elementValuePairs_in_annotation3781);
                            elementValuePairs();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // CMTJava.g:514:23: elementValue
                            {
                            pushFollow(FOLLOW_elementValue_in_annotation3805);
                            elementValue();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_annotation3841); if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, annotation_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotation"

    public static class elementValuePairs_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "elementValuePairs"
    // CMTJava.g:520:1: elementValuePairs : elementValuePair ( ',' elementValuePair )* ;
    public final CMTJavaParser.elementValuePairs_return elementValuePairs() throws RecognitionException {
        CMTJavaParser.elementValuePairs_return retval = new CMTJavaParser.elementValuePairs_return();
        retval.start = input.LT(1);
        int elementValuePairs_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // CMTJava.g:521:5: ( elementValuePair ( ',' elementValuePair )* )
            // CMTJava.g:521:9: elementValuePair ( ',' elementValuePair )*
            {
            pushFollow(FOLLOW_elementValuePair_in_elementValuePairs3873);
            elementValuePair();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:522:9: ( ',' elementValuePair )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==COMMA) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // CMTJava.g:522:10: ',' elementValuePair
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elementValuePairs3884); if (state.failed) return retval;
            	    pushFollow(FOLLOW_elementValuePair_in_elementValuePairs3886);
            	    elementValuePair();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, elementValuePairs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elementValuePairs"

    public static class elementValuePair_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "elementValuePair"
    // CMTJava.g:526:1: elementValuePair : IDENTIFIER '=' elementValue ;
    public final CMTJavaParser.elementValuePair_return elementValuePair() throws RecognitionException {
        CMTJavaParser.elementValuePair_return retval = new CMTJavaParser.elementValuePair_return();
        retval.start = input.LT(1);
        int elementValuePair_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // CMTJava.g:527:5: ( IDENTIFIER '=' elementValue )
            // CMTJava.g:527:9: IDENTIFIER '=' elementValue
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_elementValuePair3917); if (state.failed) return retval;
            match(input,EQ,FOLLOW_EQ_in_elementValuePair3919); if (state.failed) return retval;
            pushFollow(FOLLOW_elementValue_in_elementValuePair3921);
            elementValue();

            state._fsp--;
            if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, elementValuePair_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elementValuePair"

    public static class elementValue_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "elementValue"
    // CMTJava.g:530:1: elementValue : ( conditionalExpression | annotation | elementValueArrayInitializer );
    public final CMTJavaParser.elementValue_return elementValue() throws RecognitionException {
        CMTJavaParser.elementValue_return retval = new CMTJavaParser.elementValue_return();
        retval.start = input.LT(1);
        int elementValue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // CMTJava.g:531:5: ( conditionalExpression | annotation | elementValueArrayInitializer )
            int alt88=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
            case INTLITERAL:
            case LONGLITERAL:
            case FLOATLITERAL:
            case DOUBLELITERAL:
            case CHARLITERAL:
            case STRINGLITERAL:
            case TRUE:
            case FALSE:
            case NULL:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case NEW:
            case SHORT:
            case SUPER:
            case THIS:
            case VOID:
            case LPAREN:
            case BANG:
            case TILDE:
            case PLUSPLUS:
            case SUBSUB:
            case PLUS:
            case SUB:
                {
                alt88=1;
                }
                break;
            case MONKEYS_AT:
                {
                alt88=2;
                }
                break;
            case LBRACE:
                {
                alt88=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // CMTJava.g:531:9: conditionalExpression
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_elementValue3941);
                    conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:532:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_elementValue3951);
                    annotation();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:533:9: elementValueArrayInitializer
                    {
                    pushFollow(FOLLOW_elementValueArrayInitializer_in_elementValue3961);
                    elementValueArrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, elementValue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elementValue"

    public static class elementValueArrayInitializer_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "elementValueArrayInitializer"
    // CMTJava.g:536:1: elementValueArrayInitializer : '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' ;
    public final CMTJavaParser.elementValueArrayInitializer_return elementValueArrayInitializer() throws RecognitionException {
        CMTJavaParser.elementValueArrayInitializer_return retval = new CMTJavaParser.elementValueArrayInitializer_return();
        retval.start = input.LT(1);
        int elementValueArrayInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // CMTJava.g:537:5: ( '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' )
            // CMTJava.g:537:9: '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_elementValueArrayInitializer3981); if (state.failed) return retval;
            // CMTJava.g:538:9: ( elementValue ( ',' elementValue )* )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=IDENTIFIER && LA90_0<=NULL)||LA90_0==BOOLEAN||LA90_0==BYTE||LA90_0==CHAR||LA90_0==DOUBLE||LA90_0==FLOAT||LA90_0==INT||LA90_0==LONG||LA90_0==NEW||LA90_0==SHORT||LA90_0==SUPER||LA90_0==THIS||LA90_0==VOID||LA90_0==LPAREN||LA90_0==LBRACE||(LA90_0>=BANG && LA90_0<=TILDE)||(LA90_0>=PLUSPLUS && LA90_0<=SUB)||LA90_0==MONKEYS_AT) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // CMTJava.g:538:10: elementValue ( ',' elementValue )*
                    {
                    pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer3992);
                    elementValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    // CMTJava.g:539:13: ( ',' elementValue )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==COMMA) ) {
                            int LA89_1 = input.LA(2);

                            if ( ((LA89_1>=IDENTIFIER && LA89_1<=NULL)||LA89_1==BOOLEAN||LA89_1==BYTE||LA89_1==CHAR||LA89_1==DOUBLE||LA89_1==FLOAT||LA89_1==INT||LA89_1==LONG||LA89_1==NEW||LA89_1==SHORT||LA89_1==SUPER||LA89_1==THIS||LA89_1==VOID||LA89_1==LPAREN||LA89_1==LBRACE||(LA89_1>=BANG && LA89_1<=TILDE)||(LA89_1>=PLUSPLUS && LA89_1<=SUB)||LA89_1==MONKEYS_AT) ) {
                                alt89=1;
                            }


                        }


                        switch (alt89) {
                    	case 1 :
                    	    // CMTJava.g:539:14: ',' elementValue
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_elementValueArrayInitializer4007); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer4009);
                    	    elementValue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);


                    }
                    break;

            }

            // CMTJava.g:541:12: ( ',' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==COMMA) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // CMTJava.g:541:13: ','
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_elementValueArrayInitializer4038); if (state.failed) return retval;

                    }
                    break;

            }

            match(input,RBRACE,FOLLOW_RBRACE_in_elementValueArrayInitializer4042); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, elementValueArrayInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elementValueArrayInitializer"

    public static class annotationTypeDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationTypeDeclaration"
    // CMTJava.g:545:1: annotationTypeDeclaration : modifiers '@' 'interface' IDENTIFIER annotationTypeBody ;
    public final CMTJavaParser.annotationTypeDeclaration_return annotationTypeDeclaration() throws RecognitionException {
        CMTJavaParser.annotationTypeDeclaration_return retval = new CMTJavaParser.annotationTypeDeclaration_return();
        retval.start = input.LT(1);
        int annotationTypeDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // CMTJava.g:549:5: ( modifiers '@' 'interface' IDENTIFIER annotationTypeBody )
            // CMTJava.g:549:9: modifiers '@' 'interface' IDENTIFIER annotationTypeBody
            {
            pushFollow(FOLLOW_modifiers_in_annotationTypeDeclaration4065);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_annotationTypeDeclaration4067); if (state.failed) return retval;
            match(input,INTERFACE,FOLLOW_INTERFACE_in_annotationTypeDeclaration4077); if (state.failed) return retval;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_annotationTypeDeclaration4087); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationTypeBody_in_annotationTypeDeclaration4097);
            annotationTypeBody();

            state._fsp--;
            if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, annotationTypeDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationTypeDeclaration"

    public static class annotationTypeBody_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationTypeBody"
    // CMTJava.g:556:1: annotationTypeBody : '{' ( annotationTypeElementDeclaration )* '}' ;
    public final CMTJavaParser.annotationTypeBody_return annotationTypeBody() throws RecognitionException {
        CMTJavaParser.annotationTypeBody_return retval = new CMTJavaParser.annotationTypeBody_return();
        retval.start = input.LT(1);
        int annotationTypeBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // CMTJava.g:557:5: ( '{' ( annotationTypeElementDeclaration )* '}' )
            // CMTJava.g:557:9: '{' ( annotationTypeElementDeclaration )* '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_annotationTypeBody4118); if (state.failed) return retval;
            // CMTJava.g:558:9: ( annotationTypeElementDeclaration )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==IDENTIFIER||LA92_0==ABSTRACT||LA92_0==BOOLEAN||LA92_0==BYTE||(LA92_0>=CHAR && LA92_0<=CLASS)||LA92_0==DOUBLE||LA92_0==ENUM||LA92_0==FINAL||LA92_0==FLOAT||(LA92_0>=INT && LA92_0<=NATIVE)||(LA92_0>=PRIVATE && LA92_0<=PUBLIC)||(LA92_0>=SHORT && LA92_0<=STRICTFP)||LA92_0==SYNCHRONIZED||LA92_0==TRANSIENT||(LA92_0>=VOID && LA92_0<=VOLATILE)||LA92_0==SEMI||LA92_0==MONKEYS_AT||LA92_0==LT) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // CMTJava.g:558:10: annotationTypeElementDeclaration
            	    {
            	    pushFollow(FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody4130);
            	    annotationTypeElementDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_annotationTypeBody4152); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, annotationTypeBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationTypeBody"

    public static class annotationTypeElementDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationTypeElementDeclaration"
    // CMTJava.g:563:1: annotationTypeElementDeclaration : ( annotationMethodDeclaration | interfaceFieldDeclaration | normalClassDeclaration | normalInterfaceDeclaration | enumDeclaration | annotationTypeDeclaration | ';' );
    public final CMTJavaParser.annotationTypeElementDeclaration_return annotationTypeElementDeclaration() throws RecognitionException {
        CMTJavaParser.annotationTypeElementDeclaration_return retval = new CMTJavaParser.annotationTypeElementDeclaration_return();
        retval.start = input.LT(1);
        int annotationTypeElementDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // CMTJava.g:567:5: ( annotationMethodDeclaration | interfaceFieldDeclaration | normalClassDeclaration | normalInterfaceDeclaration | enumDeclaration | annotationTypeDeclaration | ';' )
            int alt93=7;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // CMTJava.g:567:9: annotationMethodDeclaration
                    {
                    pushFollow(FOLLOW_annotationMethodDeclaration_in_annotationTypeElementDeclaration4174);
                    annotationMethodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:568:9: interfaceFieldDeclaration
                    {
                    pushFollow(FOLLOW_interfaceFieldDeclaration_in_annotationTypeElementDeclaration4184);
                    interfaceFieldDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:569:9: normalClassDeclaration
                    {
                    pushFollow(FOLLOW_normalClassDeclaration_in_annotationTypeElementDeclaration4194);
                    normalClassDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // CMTJava.g:570:9: normalInterfaceDeclaration
                    {
                    pushFollow(FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementDeclaration4204);
                    normalInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // CMTJava.g:571:9: enumDeclaration
                    {
                    pushFollow(FOLLOW_enumDeclaration_in_annotationTypeElementDeclaration4214);
                    enumDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // CMTJava.g:572:9: annotationTypeDeclaration
                    {
                    pushFollow(FOLLOW_annotationTypeDeclaration_in_annotationTypeElementDeclaration4224);
                    annotationTypeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // CMTJava.g:573:9: ';'
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_annotationTypeElementDeclaration4234); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, annotationTypeElementDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationTypeElementDeclaration"

    public static class annotationMethodDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationMethodDeclaration"
    // CMTJava.g:576:1: annotationMethodDeclaration : modifiers type IDENTIFIER '(' ')' ( 'default' elementValue )? ';' ;
    public final CMTJavaParser.annotationMethodDeclaration_return annotationMethodDeclaration() throws RecognitionException {
        CMTJavaParser.annotationMethodDeclaration_return retval = new CMTJavaParser.annotationMethodDeclaration_return();
        retval.start = input.LT(1);
        int annotationMethodDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // CMTJava.g:577:5: ( modifiers type IDENTIFIER '(' ')' ( 'default' elementValue )? ';' )
            // CMTJava.g:577:9: modifiers type IDENTIFIER '(' ')' ( 'default' elementValue )? ';'
            {
            pushFollow(FOLLOW_modifiers_in_annotationMethodDeclaration4254);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_annotationMethodDeclaration4256);
            type();

            state._fsp--;
            if (state.failed) return retval;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_annotationMethodDeclaration4258); if (state.failed) return retval;
            match(input,LPAREN,FOLLOW_LPAREN_in_annotationMethodDeclaration4268); if (state.failed) return retval;
            match(input,RPAREN,FOLLOW_RPAREN_in_annotationMethodDeclaration4270); if (state.failed) return retval;
            // CMTJava.g:578:17: ( 'default' elementValue )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==DEFAULT) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // CMTJava.g:578:18: 'default' elementValue
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_annotationMethodDeclaration4273); if (state.failed) return retval;
                    pushFollow(FOLLOW_elementValue_in_annotationMethodDeclaration4275);
                    elementValue();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,SEMI,FOLLOW_SEMI_in_annotationMethodDeclaration4304); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, annotationMethodDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationMethodDeclaration"

    public static class block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // CMTJava.g:583:1: block : '{' ( blockStatement )* '}' ;
    public final CMTJavaParser.block_return block() throws RecognitionException {
        CMTJavaParser.block_return retval = new CMTJavaParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // CMTJava.g:584:5: ( '{' ( blockStatement )* '}' )
            // CMTJava.g:584:9: '{' ( blockStatement )* '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_block4328); if (state.failed) return retval;
            // CMTJava.g:585:9: ( blockStatement )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( ((LA95_0>=IDENTIFIER && LA95_0<=NULL)||(LA95_0>=ABSTRACT && LA95_0<=BYTE)||(LA95_0>=CHAR && LA95_0<=CLASS)||LA95_0==CONTINUE||(LA95_0>=DO && LA95_0<=DOUBLE)||LA95_0==ENUM||LA95_0==FINAL||(LA95_0>=FLOAT && LA95_0<=FOR)||LA95_0==IF||(LA95_0>=INT && LA95_0<=NEW)||(LA95_0>=PRIVATE && LA95_0<=THROW)||(LA95_0>=TRANSIENT && LA95_0<=LPAREN)||LA95_0==LBRACE||LA95_0==SEMI||(LA95_0>=BANG && LA95_0<=TILDE)||(LA95_0>=PLUSPLUS && LA95_0<=SUB)||LA95_0==MONKEYS_AT||LA95_0==LT) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // CMTJava.g:585:10: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block4339);
            	    blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_block4360); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class blockStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "blockStatement"
    // CMTJava.g:590:1: blockStatement : ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement );
    public final CMTJavaParser.blockStatement_return blockStatement() throws RecognitionException {
        CMTJavaParser.blockStatement_return retval = new CMTJavaParser.blockStatement_return();
        retval.start = input.LT(1);
        int blockStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // CMTJava.g:591:5: ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement )
            int alt96=3;
            alt96 = dfa96.predict(input);
            switch (alt96) {
                case 1 :
                    // CMTJava.g:591:9: localVariableDeclarationStatement
                    {
                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement4380);
                    localVariableDeclarationStatement();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:592:9: classOrInterfaceDeclaration
                    {
                    pushFollow(FOLLOW_classOrInterfaceDeclaration_in_blockStatement4390);
                    classOrInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:593:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement4400);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, blockStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockStatement"

    public static class localVariableDeclarationStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "localVariableDeclarationStatement"
    // CMTJava.g:597:1: localVariableDeclarationStatement : localVariableDeclaration ';' ;
    public final CMTJavaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement() throws RecognitionException {
        CMTJavaParser.localVariableDeclarationStatement_return retval = new CMTJavaParser.localVariableDeclarationStatement_return();
        retval.start = input.LT(1);
        int localVariableDeclarationStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // CMTJava.g:598:5: ( localVariableDeclaration ';' )
            // CMTJava.g:598:9: localVariableDeclaration ';'
            {
            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement4421);
            localVariableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            match(input,SEMI,FOLLOW_SEMI_in_localVariableDeclarationStatement4431); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, localVariableDeclarationStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localVariableDeclarationStatement"

    public static class localVariableDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "localVariableDeclaration"
    // CMTJava.g:602:1: localVariableDeclaration : variableModifiers type variableDeclarator ( ',' variableDeclarator )* ;
    public final CMTJavaParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        CMTJavaParser.localVariableDeclaration_return retval = new CMTJavaParser.localVariableDeclaration_return();
        retval.start = input.LT(1);
        int localVariableDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // CMTJava.g:603:5: ( variableModifiers type variableDeclarator ( ',' variableDeclarator )* )
            // CMTJava.g:603:9: variableModifiers type variableDeclarator ( ',' variableDeclarator )*
            {
            pushFollow(FOLLOW_variableModifiers_in_localVariableDeclaration4451);
            variableModifiers();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_localVariableDeclaration4453);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration4463);
            variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:605:9: ( ',' variableDeclarator )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==COMMA) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // CMTJava.g:605:10: ',' variableDeclarator
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_localVariableDeclaration4474); if (state.failed) return retval;
            	    pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration4476);
            	    variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, localVariableDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localVariableDeclaration"

    public static class statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statement"
    // CMTJava.g:609:1: statement : ( block | ( 'assert' ) expression ( ':' expression )? ';' | 'assert' expression ( ':' expression )? ';' | 'if' parExpression statement ( 'else' statement )? | forstatement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | trystatement | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( IDENTIFIER )? ';' | 'continue' ( IDENTIFIER )? ';' | expression ';' | IDENTIFIER ':' statement | ';' );
    public final CMTJavaParser.statement_return statement() throws RecognitionException {
        CMTJavaParser.statement_return retval = new CMTJavaParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // CMTJava.g:610:5: ( block | ( 'assert' ) expression ( ':' expression )? ';' | 'assert' expression ( ':' expression )? ';' | 'if' parExpression statement ( 'else' statement )? | forstatement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | trystatement | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( IDENTIFIER )? ';' | 'continue' ( IDENTIFIER )? ';' | expression ';' | IDENTIFIER ':' statement | ';' )
            int alt104=17;
            alt104 = dfa104.predict(input);
            switch (alt104) {
                case 1 :
                    // CMTJava.g:610:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement4507);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:612:9: ( 'assert' ) expression ( ':' expression )? ';'
                    {
                    // CMTJava.g:612:9: ( 'assert' )
                    // CMTJava.g:612:10: 'assert'
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement4531); if (state.failed) return retval;

                    }

                    pushFollow(FOLLOW_expression_in_statement4551);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // CMTJava.g:614:20: ( ':' expression )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==COLON) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // CMTJava.g:614:21: ':' expression
                            {
                            match(input,COLON,FOLLOW_COLON_in_statement4554); if (state.failed) return retval;
                            pushFollow(FOLLOW_expression_in_statement4556);
                            expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,SEMI,FOLLOW_SEMI_in_statement4560); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:615:9: 'assert' expression ( ':' expression )? ';'
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement4570); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement4573);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // CMTJava.g:615:30: ( ':' expression )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==COLON) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // CMTJava.g:615:31: ':' expression
                            {
                            match(input,COLON,FOLLOW_COLON_in_statement4576); if (state.failed) return retval;
                            pushFollow(FOLLOW_expression_in_statement4578);
                            expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,SEMI,FOLLOW_SEMI_in_statement4582); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // CMTJava.g:616:9: 'if' parExpression statement ( 'else' statement )?
                    {
                    match(input,IF,FOLLOW_IF_in_statement4604); if (state.failed) return retval;
                    pushFollow(FOLLOW_parExpression_in_statement4606);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement4608);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    // CMTJava.g:616:38: ( 'else' statement )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==ELSE) ) {
                        int LA100_1 = input.LA(2);

                        if ( (synpred141_CMTJava()) ) {
                            alt100=1;
                        }
                    }
                    switch (alt100) {
                        case 1 :
                            // CMTJava.g:616:39: 'else' statement
                            {
                            match(input,ELSE,FOLLOW_ELSE_in_statement4611); if (state.failed) return retval;
                            pushFollow(FOLLOW_statement_in_statement4613);
                            statement();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // CMTJava.g:617:9: forstatement
                    {
                    pushFollow(FOLLOW_forstatement_in_statement4635);
                    forstatement();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // CMTJava.g:618:9: 'while' parExpression statement
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement4645); if (state.failed) return retval;
                    pushFollow(FOLLOW_parExpression_in_statement4647);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement4649);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // CMTJava.g:619:9: 'do' statement 'while' parExpression ';'
                    {
                    match(input,DO,FOLLOW_DO_in_statement4659); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement4661);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,WHILE,FOLLOW_WHILE_in_statement4663); if (state.failed) return retval;
                    pushFollow(FOLLOW_parExpression_in_statement4665);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,SEMI,FOLLOW_SEMI_in_statement4667); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // CMTJava.g:620:9: trystatement
                    {
                    pushFollow(FOLLOW_trystatement_in_statement4677);
                    trystatement();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // CMTJava.g:621:9: 'switch' parExpression '{' switchBlockStatementGroups '}'
                    {
                    match(input,SWITCH,FOLLOW_SWITCH_in_statement4687); if (state.failed) return retval;
                    pushFollow(FOLLOW_parExpression_in_statement4689);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,LBRACE,FOLLOW_LBRACE_in_statement4691); if (state.failed) return retval;
                    pushFollow(FOLLOW_switchBlockStatementGroups_in_statement4693);
                    switchBlockStatementGroups();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RBRACE,FOLLOW_RBRACE_in_statement4695); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // CMTJava.g:622:9: 'synchronized' parExpression block
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement4705); if (state.failed) return retval;
                    pushFollow(FOLLOW_parExpression_in_statement4707);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement4709);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // CMTJava.g:623:9: 'return' ( expression )? ';'
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement4719); if (state.failed) return retval;
                    // CMTJava.g:623:18: ( expression )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( ((LA101_0>=IDENTIFIER && LA101_0<=NULL)||LA101_0==BOOLEAN||LA101_0==BYTE||LA101_0==CHAR||LA101_0==DOUBLE||LA101_0==FLOAT||LA101_0==INT||LA101_0==LONG||LA101_0==NEW||LA101_0==SHORT||LA101_0==SUPER||LA101_0==THIS||LA101_0==VOID||LA101_0==LPAREN||(LA101_0>=BANG && LA101_0<=TILDE)||(LA101_0>=PLUSPLUS && LA101_0<=SUB)) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // CMTJava.g:623:19: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement4722);
                            expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,SEMI,FOLLOW_SEMI_in_statement4727); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // CMTJava.g:624:9: 'throw' expression ';'
                    {
                    match(input,THROW,FOLLOW_THROW_in_statement4737); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement4739);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,SEMI,FOLLOW_SEMI_in_statement4741); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // CMTJava.g:625:9: 'break' ( IDENTIFIER )? ';'
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement4751); if (state.failed) return retval;
                    // CMTJava.g:626:13: ( IDENTIFIER )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==IDENTIFIER) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // CMTJava.g:626:14: IDENTIFIER
                            {
                            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement4766); if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,SEMI,FOLLOW_SEMI_in_statement4783); if (state.failed) return retval;

                    }
                    break;
                case 14 :
                    // CMTJava.g:628:9: 'continue' ( IDENTIFIER )? ';'
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement4793); if (state.failed) return retval;
                    // CMTJava.g:629:13: ( IDENTIFIER )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==IDENTIFIER) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // CMTJava.g:629:14: IDENTIFIER
                            {
                            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement4808); if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,SEMI,FOLLOW_SEMI_in_statement4825); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // CMTJava.g:631:9: expression ';'
                    {
                    pushFollow(FOLLOW_expression_in_statement4835);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,SEMI,FOLLOW_SEMI_in_statement4838); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // CMTJava.g:632:9: IDENTIFIER ':' statement
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement4853); if (state.failed) return retval;
                    match(input,COLON,FOLLOW_COLON_in_statement4855); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement4857);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // CMTJava.g:633:9: ';'
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_statement4867); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class switchBlockStatementGroups_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "switchBlockStatementGroups"
    // CMTJava.g:637:1: switchBlockStatementGroups : ( switchBlockStatementGroup )* ;
    public final CMTJavaParser.switchBlockStatementGroups_return switchBlockStatementGroups() throws RecognitionException {
        CMTJavaParser.switchBlockStatementGroups_return retval = new CMTJavaParser.switchBlockStatementGroups_return();
        retval.start = input.LT(1);
        int switchBlockStatementGroups_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // CMTJava.g:638:5: ( ( switchBlockStatementGroup )* )
            // CMTJava.g:638:9: ( switchBlockStatementGroup )*
            {
            // CMTJava.g:638:9: ( switchBlockStatementGroup )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==CASE||LA105_0==DEFAULT) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // CMTJava.g:638:10: switchBlockStatementGroup
            	    {
            	    pushFollow(FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups4889);
            	    switchBlockStatementGroup();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, switchBlockStatementGroups_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchBlockStatementGroups"

    public static class switchBlockStatementGroup_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "switchBlockStatementGroup"
    // CMTJava.g:641:1: switchBlockStatementGroup : switchLabel ( blockStatement )* ;
    public final CMTJavaParser.switchBlockStatementGroup_return switchBlockStatementGroup() throws RecognitionException {
        CMTJavaParser.switchBlockStatementGroup_return retval = new CMTJavaParser.switchBlockStatementGroup_return();
        retval.start = input.LT(1);
        int switchBlockStatementGroup_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // CMTJava.g:642:5: ( switchLabel ( blockStatement )* )
            // CMTJava.g:643:9: switchLabel ( blockStatement )*
            {
            pushFollow(FOLLOW_switchLabel_in_switchBlockStatementGroup4918);
            switchLabel();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:644:9: ( blockStatement )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( ((LA106_0>=IDENTIFIER && LA106_0<=NULL)||(LA106_0>=ABSTRACT && LA106_0<=BYTE)||(LA106_0>=CHAR && LA106_0<=CLASS)||LA106_0==CONTINUE||(LA106_0>=DO && LA106_0<=DOUBLE)||LA106_0==ENUM||LA106_0==FINAL||(LA106_0>=FLOAT && LA106_0<=FOR)||LA106_0==IF||(LA106_0>=INT && LA106_0<=NEW)||(LA106_0>=PRIVATE && LA106_0<=THROW)||(LA106_0>=TRANSIENT && LA106_0<=LPAREN)||LA106_0==LBRACE||LA106_0==SEMI||(LA106_0>=BANG && LA106_0<=TILDE)||(LA106_0>=PLUSPLUS && LA106_0<=SUB)||LA106_0==MONKEYS_AT||LA106_0==LT) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // CMTJava.g:644:10: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_switchBlockStatementGroup4929);
            	    blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, switchBlockStatementGroup_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchBlockStatementGroup"

    public static class switchLabel_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "switchLabel"
    // CMTJava.g:648:1: switchLabel : ( 'case' expression ':' | 'default' ':' );
    public final CMTJavaParser.switchLabel_return switchLabel() throws RecognitionException {
        CMTJavaParser.switchLabel_return retval = new CMTJavaParser.switchLabel_return();
        retval.start = input.LT(1);
        int switchLabel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // CMTJava.g:649:5: ( 'case' expression ':' | 'default' ':' )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==CASE) ) {
                alt107=1;
            }
            else if ( (LA107_0==DEFAULT) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // CMTJava.g:649:9: 'case' expression ':'
                    {
                    match(input,CASE,FOLLOW_CASE_in_switchLabel4960); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_switchLabel4962);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,COLON,FOLLOW_COLON_in_switchLabel4964); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:650:9: 'default' ':'
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_switchLabel4974); if (state.failed) return retval;
                    match(input,COLON,FOLLOW_COLON_in_switchLabel4976); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, switchLabel_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchLabel"

    public static class trystatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "trystatement"
    // CMTJava.g:654:1: trystatement : 'try' block ( catches 'finally' block | catches | 'finally' block ) ;
    public final CMTJavaParser.trystatement_return trystatement() throws RecognitionException {
        CMTJavaParser.trystatement_return retval = new CMTJavaParser.trystatement_return();
        retval.start = input.LT(1);
        int trystatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // CMTJava.g:655:5: ( 'try' block ( catches 'finally' block | catches | 'finally' block ) )
            // CMTJava.g:655:9: 'try' block ( catches 'finally' block | catches | 'finally' block )
            {
            match(input,TRY,FOLLOW_TRY_in_trystatement4997); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_trystatement4999);
            block();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:656:9: ( catches 'finally' block | catches | 'finally' block )
            int alt108=3;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==CATCH) ) {
                int LA108_1 = input.LA(2);

                if ( (synpred161_CMTJava()) ) {
                    alt108=1;
                }
                else if ( (synpred162_CMTJava()) ) {
                    alt108=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 108, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA108_0==FINALLY) ) {
                alt108=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // CMTJava.g:656:13: catches 'finally' block
                    {
                    pushFollow(FOLLOW_catches_in_trystatement5013);
                    catches();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,FINALLY,FOLLOW_FINALLY_in_trystatement5015); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_trystatement5017);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:657:13: catches
                    {
                    pushFollow(FOLLOW_catches_in_trystatement5031);
                    catches();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:658:13: 'finally' block
                    {
                    match(input,FINALLY,FOLLOW_FINALLY_in_trystatement5045); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_trystatement5047);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, trystatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "trystatement"

    public static class catches_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "catches"
    // CMTJava.g:662:1: catches : catchClause ( catchClause )* ;
    public final CMTJavaParser.catches_return catches() throws RecognitionException {
        CMTJavaParser.catches_return retval = new CMTJavaParser.catches_return();
        retval.start = input.LT(1);
        int catches_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // CMTJava.g:663:5: ( catchClause ( catchClause )* )
            // CMTJava.g:663:9: catchClause ( catchClause )*
            {
            pushFollow(FOLLOW_catchClause_in_catches5078);
            catchClause();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:664:9: ( catchClause )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==CATCH) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // CMTJava.g:664:10: catchClause
            	    {
            	    pushFollow(FOLLOW_catchClause_in_catches5089);
            	    catchClause();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, catches_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catches"

    public static class catchClause_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "catchClause"
    // CMTJava.g:668:1: catchClause : 'catch' '(' formalParameter ')' block ;
    public final CMTJavaParser.catchClause_return catchClause() throws RecognitionException {
        CMTJavaParser.catchClause_return retval = new CMTJavaParser.catchClause_return();
        retval.start = input.LT(1);
        int catchClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // CMTJava.g:669:5: ( 'catch' '(' formalParameter ')' block )
            // CMTJava.g:669:9: 'catch' '(' formalParameter ')' block
            {
            match(input,CATCH,FOLLOW_CATCH_in_catchClause5120); if (state.failed) return retval;
            match(input,LPAREN,FOLLOW_LPAREN_in_catchClause5122); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameter_in_catchClause5124);
            formalParameter();

            state._fsp--;
            if (state.failed) return retval;
            match(input,RPAREN,FOLLOW_RPAREN_in_catchClause5134); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_catchClause5136);
            block();

            state._fsp--;
            if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, catchClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchClause"

    public static class formalParameter_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formalParameter"
    // CMTJava.g:673:1: formalParameter : variableModifiers type IDENTIFIER ( '[' ']' )* ;
    public final CMTJavaParser.formalParameter_return formalParameter() throws RecognitionException {
        CMTJavaParser.formalParameter_return retval = new CMTJavaParser.formalParameter_return();
        retval.start = input.LT(1);
        int formalParameter_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // CMTJava.g:674:5: ( variableModifiers type IDENTIFIER ( '[' ']' )* )
            // CMTJava.g:674:9: variableModifiers type IDENTIFIER ( '[' ']' )*
            {
            pushFollow(FOLLOW_variableModifiers_in_formalParameter5157);
            variableModifiers();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameter5159);
            type();

            state._fsp--;
            if (state.failed) return retval;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formalParameter5161); if (state.failed) return retval;
            // CMTJava.g:675:9: ( '[' ']' )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==LBRACKET) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // CMTJava.g:675:10: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_formalParameter5172); if (state.failed) return retval;
            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_formalParameter5174); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, formalParameter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalParameter"

    public static class forstatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forstatement"
    // CMTJava.g:679:1: forstatement : ( 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' statement | 'for' '(' ( forInit )? ';' ( expression )? ';' ( expressionList )? ')' statement );
    public final CMTJavaParser.forstatement_return forstatement() throws RecognitionException {
        CMTJavaParser.forstatement_return retval = new CMTJavaParser.forstatement_return();
        retval.start = input.LT(1);
        int forstatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // CMTJava.g:680:5: ( 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' statement | 'for' '(' ( forInit )? ';' ( expression )? ';' ( expressionList )? ')' statement )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==FOR) ) {
                int LA114_1 = input.LA(2);

                if ( (synpred165_CMTJava()) ) {
                    alt114=1;
                }
                else if ( (true) ) {
                    alt114=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 114, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // CMTJava.g:682:9: 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' statement
                    {
                    match(input,FOR,FOLLOW_FOR_in_forstatement5223); if (state.failed) return retval;
                    match(input,LPAREN,FOLLOW_LPAREN_in_forstatement5225); if (state.failed) return retval;
                    pushFollow(FOLLOW_variableModifiers_in_forstatement5227);
                    variableModifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_forstatement5229);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_forstatement5231); if (state.failed) return retval;
                    match(input,COLON,FOLLOW_COLON_in_forstatement5233); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_forstatement5244);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RPAREN,FOLLOW_RPAREN_in_forstatement5246); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_forstatement5248);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:686:9: 'for' '(' ( forInit )? ';' ( expression )? ';' ( expressionList )? ')' statement
                    {
                    match(input,FOR,FOLLOW_FOR_in_forstatement5280); if (state.failed) return retval;
                    match(input,LPAREN,FOLLOW_LPAREN_in_forstatement5282); if (state.failed) return retval;
                    // CMTJava.g:687:17: ( forInit )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( ((LA111_0>=IDENTIFIER && LA111_0<=NULL)||LA111_0==BOOLEAN||LA111_0==BYTE||LA111_0==CHAR||LA111_0==DOUBLE||LA111_0==FINAL||LA111_0==FLOAT||LA111_0==INT||LA111_0==LONG||LA111_0==NEW||LA111_0==SHORT||LA111_0==SUPER||LA111_0==THIS||LA111_0==VOID||LA111_0==LPAREN||(LA111_0>=BANG && LA111_0<=TILDE)||(LA111_0>=PLUSPLUS && LA111_0<=SUB)||LA111_0==MONKEYS_AT) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // CMTJava.g:687:18: forInit
                            {
                            pushFollow(FOLLOW_forInit_in_forstatement5302);
                            forInit();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,SEMI,FOLLOW_SEMI_in_forstatement5323); if (state.failed) return retval;
                    // CMTJava.g:689:17: ( expression )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( ((LA112_0>=IDENTIFIER && LA112_0<=NULL)||LA112_0==BOOLEAN||LA112_0==BYTE||LA112_0==CHAR||LA112_0==DOUBLE||LA112_0==FLOAT||LA112_0==INT||LA112_0==LONG||LA112_0==NEW||LA112_0==SHORT||LA112_0==SUPER||LA112_0==THIS||LA112_0==VOID||LA112_0==LPAREN||(LA112_0>=BANG && LA112_0<=TILDE)||(LA112_0>=PLUSPLUS && LA112_0<=SUB)) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // CMTJava.g:689:18: expression
                            {
                            pushFollow(FOLLOW_expression_in_forstatement5343);
                            expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,SEMI,FOLLOW_SEMI_in_forstatement5364); if (state.failed) return retval;
                    // CMTJava.g:691:17: ( expressionList )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( ((LA113_0>=IDENTIFIER && LA113_0<=NULL)||LA113_0==BOOLEAN||LA113_0==BYTE||LA113_0==CHAR||LA113_0==DOUBLE||LA113_0==FLOAT||LA113_0==INT||LA113_0==LONG||LA113_0==NEW||LA113_0==SHORT||LA113_0==SUPER||LA113_0==THIS||LA113_0==VOID||LA113_0==LPAREN||(LA113_0>=BANG && LA113_0<=TILDE)||(LA113_0>=PLUSPLUS && LA113_0<=SUB)) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // CMTJava.g:691:18: expressionList
                            {
                            pushFollow(FOLLOW_expressionList_in_forstatement5384);
                            expressionList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_forstatement5405); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_forstatement5407);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, forstatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forstatement"

    public static class forInit_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forInit"
    // CMTJava.g:695:1: forInit : ( localVariableDeclaration | expressionList );
    public final CMTJavaParser.forInit_return forInit() throws RecognitionException {
        CMTJavaParser.forInit_return retval = new CMTJavaParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // CMTJava.g:696:5: ( localVariableDeclaration | expressionList )
            int alt115=2;
            alt115 = dfa115.predict(input);
            switch (alt115) {
                case 1 :
                    // CMTJava.g:696:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit5427);
                    localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:697:9: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_forInit5437);
                    expressionList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, forInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forInit"

    public static class parExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "parExpression"
    // CMTJava.g:700:1: parExpression : '(' expression ')' ;
    public final CMTJavaParser.parExpression_return parExpression() throws RecognitionException {
        CMTJavaParser.parExpression_return retval = new CMTJavaParser.parExpression_return();
        retval.start = input.LT(1);
        int parExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // CMTJava.g:701:5: ( '(' expression ')' )
            // CMTJava.g:701:9: '(' expression ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_parExpression5457); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parExpression5459);
            expression();

            state._fsp--;
            if (state.failed) return retval;
            match(input,RPAREN,FOLLOW_RPAREN_in_parExpression5461); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, parExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parExpression"

    public static class expressionList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expressionList"
    // CMTJava.g:704:1: expressionList : expression ( ',' expression )* ;
    public final CMTJavaParser.expressionList_return expressionList() throws RecognitionException {
        CMTJavaParser.expressionList_return retval = new CMTJavaParser.expressionList_return();
        retval.start = input.LT(1);
        int expressionList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // CMTJava.g:705:5: ( expression ( ',' expression )* )
            // CMTJava.g:705:9: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList5481);
            expression();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:706:9: ( ',' expression )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==COMMA) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // CMTJava.g:706:10: ',' expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionList5492); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_expressionList5494);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, expressionList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class expression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expression"
    // CMTJava.g:711:1: expression : conditionalExpression ( assignmentOperator expression )? ;
    public final CMTJavaParser.expression_return expression() throws RecognitionException {
        CMTJavaParser.expression_return retval = new CMTJavaParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // CMTJava.g:712:5: ( conditionalExpression ( assignmentOperator expression )? )
            // CMTJava.g:712:9: conditionalExpression ( assignmentOperator expression )?
            {
            pushFollow(FOLLOW_conditionalExpression_in_expression5526);
            conditionalExpression();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:713:9: ( assignmentOperator expression )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==EQ||(LA117_0>=PLUSEQ && LA117_0<=PERCENTEQ)||(LA117_0>=GT && LA117_0<=LT)) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // CMTJava.g:713:10: assignmentOperator expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression5537);
                    assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression5539);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class assignmentOperator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignmentOperator"
    // CMTJava.g:718:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<' '<' '=' | '>' '>' '>' '=' | '>' '>' '=' );
    public final CMTJavaParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        CMTJavaParser.assignmentOperator_return retval = new CMTJavaParser.assignmentOperator_return();
        retval.start = input.LT(1);
        int assignmentOperator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // CMTJava.g:719:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<' '<' '=' | '>' '>' '>' '=' | '>' '>' '=' )
            int alt118=12;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // CMTJava.g:719:9: '='
                    {
                    match(input,EQ,FOLLOW_EQ_in_assignmentOperator5571); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:720:9: '+='
                    {
                    match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignmentOperator5581); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:721:9: '-='
                    {
                    match(input,SUBEQ,FOLLOW_SUBEQ_in_assignmentOperator5591); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // CMTJava.g:722:9: '*='
                    {
                    match(input,STAREQ,FOLLOW_STAREQ_in_assignmentOperator5601); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // CMTJava.g:723:9: '/='
                    {
                    match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignmentOperator5611); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // CMTJava.g:724:9: '&='
                    {
                    match(input,AMPEQ,FOLLOW_AMPEQ_in_assignmentOperator5621); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // CMTJava.g:725:9: '|='
                    {
                    match(input,BAREQ,FOLLOW_BAREQ_in_assignmentOperator5631); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // CMTJava.g:726:9: '^='
                    {
                    match(input,CARETEQ,FOLLOW_CARETEQ_in_assignmentOperator5641); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // CMTJava.g:727:9: '%='
                    {
                    match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignmentOperator5651); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // CMTJava.g:728:10: '<' '<' '='
                    {
                    match(input,LT,FOLLOW_LT_in_assignmentOperator5662); if (state.failed) return retval;
                    match(input,LT,FOLLOW_LT_in_assignmentOperator5664); if (state.failed) return retval;
                    match(input,EQ,FOLLOW_EQ_in_assignmentOperator5666); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // CMTJava.g:729:10: '>' '>' '>' '='
                    {
                    match(input,GT,FOLLOW_GT_in_assignmentOperator5677); if (state.failed) return retval;
                    match(input,GT,FOLLOW_GT_in_assignmentOperator5679); if (state.failed) return retval;
                    match(input,GT,FOLLOW_GT_in_assignmentOperator5681); if (state.failed) return retval;
                    match(input,EQ,FOLLOW_EQ_in_assignmentOperator5683); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // CMTJava.g:730:10: '>' '>' '='
                    {
                    match(input,GT,FOLLOW_GT_in_assignmentOperator5694); if (state.failed) return retval;
                    match(input,GT,FOLLOW_GT_in_assignmentOperator5696); if (state.failed) return retval;
                    match(input,EQ,FOLLOW_EQ_in_assignmentOperator5698); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, assignmentOperator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignmentOperator"

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "conditionalExpression"
    // CMTJava.g:734:1: conditionalExpression : conditionalOrExpression ( '?' expression ':' conditionalExpression )? ;
    public final CMTJavaParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        CMTJavaParser.conditionalExpression_return retval = new CMTJavaParser.conditionalExpression_return();
        retval.start = input.LT(1);
        int conditionalExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // CMTJava.g:735:5: ( conditionalOrExpression ( '?' expression ':' conditionalExpression )? )
            // CMTJava.g:735:9: conditionalOrExpression ( '?' expression ':' conditionalExpression )?
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression5719);
            conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:736:9: ( '?' expression ':' conditionalExpression )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==QUES) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // CMTJava.g:736:10: '?' expression ':' conditionalExpression
                    {
                    match(input,QUES,FOLLOW_QUES_in_conditionalExpression5730); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_conditionalExpression5732);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression5734); if (state.failed) return retval;
                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression5736);
                    conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, conditionalExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"

    public static class conditionalOrExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "conditionalOrExpression"
    // CMTJava.g:740:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
    public final CMTJavaParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        CMTJavaParser.conditionalOrExpression_return retval = new CMTJavaParser.conditionalOrExpression_return();
        retval.start = input.LT(1);
        int conditionalOrExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // CMTJava.g:741:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
            // CMTJava.g:741:9: conditionalAndExpression ( '||' conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression5767);
            conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:742:9: ( '||' conditionalAndExpression )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==BARBAR) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // CMTJava.g:742:10: '||' conditionalAndExpression
            	    {
            	    match(input,BARBAR,FOLLOW_BARBAR_in_conditionalOrExpression5778); if (state.failed) return retval;
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression5780);
            	    conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, conditionalOrExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditionalOrExpression"

    public static class conditionalAndExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "conditionalAndExpression"
    // CMTJava.g:746:1: conditionalAndExpression : inclusiveOrExpression ( '&&' inclusiveOrExpression )* ;
    public final CMTJavaParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        CMTJavaParser.conditionalAndExpression_return retval = new CMTJavaParser.conditionalAndExpression_return();
        retval.start = input.LT(1);
        int conditionalAndExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // CMTJava.g:747:5: ( inclusiveOrExpression ( '&&' inclusiveOrExpression )* )
            // CMTJava.g:747:9: inclusiveOrExpression ( '&&' inclusiveOrExpression )*
            {
            pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression5811);
            inclusiveOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:748:9: ( '&&' inclusiveOrExpression )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==AMPAMP) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // CMTJava.g:748:10: '&&' inclusiveOrExpression
            	    {
            	    match(input,AMPAMP,FOLLOW_AMPAMP_in_conditionalAndExpression5822); if (state.failed) return retval;
            	    pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression5824);
            	    inclusiveOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, conditionalAndExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditionalAndExpression"

    public static class inclusiveOrExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "inclusiveOrExpression"
    // CMTJava.g:752:1: inclusiveOrExpression : exclusiveOrExpression ( '|' exclusiveOrExpression )* ;
    public final CMTJavaParser.inclusiveOrExpression_return inclusiveOrExpression() throws RecognitionException {
        CMTJavaParser.inclusiveOrExpression_return retval = new CMTJavaParser.inclusiveOrExpression_return();
        retval.start = input.LT(1);
        int inclusiveOrExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // CMTJava.g:753:5: ( exclusiveOrExpression ( '|' exclusiveOrExpression )* )
            // CMTJava.g:753:9: exclusiveOrExpression ( '|' exclusiveOrExpression )*
            {
            pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression5855);
            exclusiveOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:754:9: ( '|' exclusiveOrExpression )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==BAR) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // CMTJava.g:754:10: '|' exclusiveOrExpression
            	    {
            	    match(input,BAR,FOLLOW_BAR_in_inclusiveOrExpression5866); if (state.failed) return retval;
            	    pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression5868);
            	    exclusiveOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop122;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, inclusiveOrExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inclusiveOrExpression"

    public static class exclusiveOrExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "exclusiveOrExpression"
    // CMTJava.g:758:1: exclusiveOrExpression : andExpression ( '^' andExpression )* ;
    public final CMTJavaParser.exclusiveOrExpression_return exclusiveOrExpression() throws RecognitionException {
        CMTJavaParser.exclusiveOrExpression_return retval = new CMTJavaParser.exclusiveOrExpression_return();
        retval.start = input.LT(1);
        int exclusiveOrExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // CMTJava.g:759:5: ( andExpression ( '^' andExpression )* )
            // CMTJava.g:759:9: andExpression ( '^' andExpression )*
            {
            pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression5899);
            andExpression();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:760:9: ( '^' andExpression )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==CARET) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // CMTJava.g:760:10: '^' andExpression
            	    {
            	    match(input,CARET,FOLLOW_CARET_in_exclusiveOrExpression5910); if (state.failed) return retval;
            	    pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression5912);
            	    andExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, exclusiveOrExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exclusiveOrExpression"

    public static class andExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "andExpression"
    // CMTJava.g:764:1: andExpression : equalityExpression ( '&' equalityExpression )* ;
    public final CMTJavaParser.andExpression_return andExpression() throws RecognitionException {
        CMTJavaParser.andExpression_return retval = new CMTJavaParser.andExpression_return();
        retval.start = input.LT(1);
        int andExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // CMTJava.g:765:5: ( equalityExpression ( '&' equalityExpression )* )
            // CMTJava.g:765:9: equalityExpression ( '&' equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_andExpression5943);
            equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:766:9: ( '&' equalityExpression )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==AMP) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // CMTJava.g:766:10: '&' equalityExpression
            	    {
            	    match(input,AMP,FOLLOW_AMP_in_andExpression5954); if (state.failed) return retval;
            	    pushFollow(FOLLOW_equalityExpression_in_andExpression5956);
            	    equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, andExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "andExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "equalityExpression"
    // CMTJava.g:770:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
    public final CMTJavaParser.equalityExpression_return equalityExpression() throws RecognitionException {
        CMTJavaParser.equalityExpression_return retval = new CMTJavaParser.equalityExpression_return();
        retval.start = input.LT(1);
        int equalityExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // CMTJava.g:771:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
            // CMTJava.g:771:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
            {
            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression5987);
            instanceOfExpression();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:772:9: ( ( '==' | '!=' ) instanceOfExpression )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==EQEQ||LA125_0==BANGEQ) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // CMTJava.g:773:13: ( '==' | '!=' ) instanceOfExpression
            	    {
            	    if ( input.LA(1)==EQEQ||input.LA(1)==BANGEQ ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression6064);
            	    instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, equalityExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class instanceOfExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "instanceOfExpression"
    // CMTJava.g:780:1: instanceOfExpression : relationalExpression ( 'instanceof' type )? ;
    public final CMTJavaParser.instanceOfExpression_return instanceOfExpression() throws RecognitionException {
        CMTJavaParser.instanceOfExpression_return retval = new CMTJavaParser.instanceOfExpression_return();
        retval.start = input.LT(1);
        int instanceOfExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // CMTJava.g:781:5: ( relationalExpression ( 'instanceof' type )? )
            // CMTJava.g:781:9: relationalExpression ( 'instanceof' type )?
            {
            pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression6095);
            relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:782:9: ( 'instanceof' type )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==INSTANCEOF) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // CMTJava.g:782:10: 'instanceof' type
                    {
                    match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceOfExpression6106); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_instanceOfExpression6108);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, instanceOfExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "instanceOfExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "relationalExpression"
    // CMTJava.g:786:1: relationalExpression : shiftExpression ( relationalOp shiftExpression )* ;
    public final CMTJavaParser.relationalExpression_return relationalExpression() throws RecognitionException {
        CMTJavaParser.relationalExpression_return retval = new CMTJavaParser.relationalExpression_return();
        retval.start = input.LT(1);
        int relationalExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // CMTJava.g:787:5: ( shiftExpression ( relationalOp shiftExpression )* )
            // CMTJava.g:787:9: shiftExpression ( relationalOp shiftExpression )*
            {
            pushFollow(FOLLOW_shiftExpression_in_relationalExpression6139);
            shiftExpression();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:788:9: ( relationalOp shiftExpression )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==LT) ) {
                    int LA127_2 = input.LA(2);

                    if ( ((LA127_2>=IDENTIFIER && LA127_2<=NULL)||LA127_2==BOOLEAN||LA127_2==BYTE||LA127_2==CHAR||LA127_2==DOUBLE||LA127_2==FLOAT||LA127_2==INT||LA127_2==LONG||LA127_2==NEW||LA127_2==SHORT||LA127_2==SUPER||LA127_2==THIS||LA127_2==VOID||LA127_2==LPAREN||(LA127_2>=EQ && LA127_2<=TILDE)||(LA127_2>=PLUSPLUS && LA127_2<=SUB)) ) {
                        alt127=1;
                    }


                }
                else if ( (LA127_0==GT) ) {
                    int LA127_3 = input.LA(2);

                    if ( ((LA127_3>=IDENTIFIER && LA127_3<=NULL)||LA127_3==BOOLEAN||LA127_3==BYTE||LA127_3==CHAR||LA127_3==DOUBLE||LA127_3==FLOAT||LA127_3==INT||LA127_3==LONG||LA127_3==NEW||LA127_3==SHORT||LA127_3==SUPER||LA127_3==THIS||LA127_3==VOID||LA127_3==LPAREN||(LA127_3>=EQ && LA127_3<=TILDE)||(LA127_3>=PLUSPLUS && LA127_3<=SUB)) ) {
                        alt127=1;
                    }


                }


                switch (alt127) {
            	case 1 :
            	    // CMTJava.g:788:10: relationalOp shiftExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression6150);
            	    relationalOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression6152);
            	    shiftExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop127;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, relationalExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class relationalOp_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "relationalOp"
    // CMTJava.g:792:1: relationalOp : ( '<' '=' | '>' '=' | '<' | '>' );
    public final CMTJavaParser.relationalOp_return relationalOp() throws RecognitionException {
        CMTJavaParser.relationalOp_return retval = new CMTJavaParser.relationalOp_return();
        retval.start = input.LT(1);
        int relationalOp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // CMTJava.g:793:5: ( '<' '=' | '>' '=' | '<' | '>' )
            int alt128=4;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==LT) ) {
                int LA128_1 = input.LA(2);

                if ( (LA128_1==EQ) ) {
                    alt128=1;
                }
                else if ( ((LA128_1>=IDENTIFIER && LA128_1<=NULL)||LA128_1==BOOLEAN||LA128_1==BYTE||LA128_1==CHAR||LA128_1==DOUBLE||LA128_1==FLOAT||LA128_1==INT||LA128_1==LONG||LA128_1==NEW||LA128_1==SHORT||LA128_1==SUPER||LA128_1==THIS||LA128_1==VOID||LA128_1==LPAREN||(LA128_1>=BANG && LA128_1<=TILDE)||(LA128_1>=PLUSPLUS && LA128_1<=SUB)) ) {
                    alt128=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 128, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA128_0==GT) ) {
                int LA128_2 = input.LA(2);

                if ( (LA128_2==EQ) ) {
                    alt128=2;
                }
                else if ( ((LA128_2>=IDENTIFIER && LA128_2<=NULL)||LA128_2==BOOLEAN||LA128_2==BYTE||LA128_2==CHAR||LA128_2==DOUBLE||LA128_2==FLOAT||LA128_2==INT||LA128_2==LONG||LA128_2==NEW||LA128_2==SHORT||LA128_2==SUPER||LA128_2==THIS||LA128_2==VOID||LA128_2==LPAREN||(LA128_2>=BANG && LA128_2<=TILDE)||(LA128_2>=PLUSPLUS && LA128_2<=SUB)) ) {
                    alt128=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 128, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // CMTJava.g:793:10: '<' '='
                    {
                    match(input,LT,FOLLOW_LT_in_relationalOp6184); if (state.failed) return retval;
                    match(input,EQ,FOLLOW_EQ_in_relationalOp6186); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:794:10: '>' '='
                    {
                    match(input,GT,FOLLOW_GT_in_relationalOp6197); if (state.failed) return retval;
                    match(input,EQ,FOLLOW_EQ_in_relationalOp6199); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:795:9: '<'
                    {
                    match(input,LT,FOLLOW_LT_in_relationalOp6209); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // CMTJava.g:796:9: '>'
                    {
                    match(input,GT,FOLLOW_GT_in_relationalOp6219); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, relationalOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalOp"

    public static class shiftExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "shiftExpression"
    // CMTJava.g:799:1: shiftExpression : additiveExpression ( shiftOp additiveExpression )* ;
    public final CMTJavaParser.shiftExpression_return shiftExpression() throws RecognitionException {
        CMTJavaParser.shiftExpression_return retval = new CMTJavaParser.shiftExpression_return();
        retval.start = input.LT(1);
        int shiftExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // CMTJava.g:800:5: ( additiveExpression ( shiftOp additiveExpression )* )
            // CMTJava.g:800:9: additiveExpression ( shiftOp additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_shiftExpression6239);
            additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:801:9: ( shiftOp additiveExpression )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==LT) ) {
                    int LA129_1 = input.LA(2);

                    if ( (LA129_1==LT) ) {
                        int LA129_4 = input.LA(3);

                        if ( ((LA129_4>=IDENTIFIER && LA129_4<=NULL)||LA129_4==BOOLEAN||LA129_4==BYTE||LA129_4==CHAR||LA129_4==DOUBLE||LA129_4==FLOAT||LA129_4==INT||LA129_4==LONG||LA129_4==NEW||LA129_4==SHORT||LA129_4==SUPER||LA129_4==THIS||LA129_4==VOID||LA129_4==LPAREN||(LA129_4>=BANG && LA129_4<=TILDE)||(LA129_4>=PLUSPLUS && LA129_4<=SUB)) ) {
                            alt129=1;
                        }


                    }


                }
                else if ( (LA129_0==GT) ) {
                    int LA129_2 = input.LA(2);

                    if ( (LA129_2==GT) ) {
                        int LA129_5 = input.LA(3);

                        if ( (LA129_5==GT) ) {
                            int LA129_7 = input.LA(4);

                            if ( ((LA129_7>=IDENTIFIER && LA129_7<=NULL)||LA129_7==BOOLEAN||LA129_7==BYTE||LA129_7==CHAR||LA129_7==DOUBLE||LA129_7==FLOAT||LA129_7==INT||LA129_7==LONG||LA129_7==NEW||LA129_7==SHORT||LA129_7==SUPER||LA129_7==THIS||LA129_7==VOID||LA129_7==LPAREN||(LA129_7>=BANG && LA129_7<=TILDE)||(LA129_7>=PLUSPLUS && LA129_7<=SUB)) ) {
                                alt129=1;
                            }


                        }
                        else if ( ((LA129_5>=IDENTIFIER && LA129_5<=NULL)||LA129_5==BOOLEAN||LA129_5==BYTE||LA129_5==CHAR||LA129_5==DOUBLE||LA129_5==FLOAT||LA129_5==INT||LA129_5==LONG||LA129_5==NEW||LA129_5==SHORT||LA129_5==SUPER||LA129_5==THIS||LA129_5==VOID||LA129_5==LPAREN||(LA129_5>=BANG && LA129_5<=TILDE)||(LA129_5>=PLUSPLUS && LA129_5<=SUB)) ) {
                            alt129=1;
                        }


                    }


                }


                switch (alt129) {
            	case 1 :
            	    // CMTJava.g:801:10: shiftOp additiveExpression
            	    {
            	    pushFollow(FOLLOW_shiftOp_in_shiftExpression6250);
            	    shiftOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression6252);
            	    additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, shiftExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shiftExpression"

    public static class shiftOp_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "shiftOp"
    // CMTJava.g:806:1: shiftOp : ( '<' '<' | '>' '>' '>' | '>' '>' );
    public final CMTJavaParser.shiftOp_return shiftOp() throws RecognitionException {
        CMTJavaParser.shiftOp_return retval = new CMTJavaParser.shiftOp_return();
        retval.start = input.LT(1);
        int shiftOp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // CMTJava.g:807:5: ( '<' '<' | '>' '>' '>' | '>' '>' )
            int alt130=3;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==LT) ) {
                alt130=1;
            }
            else if ( (LA130_0==GT) ) {
                int LA130_2 = input.LA(2);

                if ( (LA130_2==GT) ) {
                    int LA130_3 = input.LA(3);

                    if ( (LA130_3==GT) ) {
                        alt130=2;
                    }
                    else if ( ((LA130_3>=IDENTIFIER && LA130_3<=NULL)||LA130_3==BOOLEAN||LA130_3==BYTE||LA130_3==CHAR||LA130_3==DOUBLE||LA130_3==FLOAT||LA130_3==INT||LA130_3==LONG||LA130_3==NEW||LA130_3==SHORT||LA130_3==SUPER||LA130_3==THIS||LA130_3==VOID||LA130_3==LPAREN||(LA130_3>=BANG && LA130_3<=TILDE)||(LA130_3>=PLUSPLUS && LA130_3<=SUB)) ) {
                        alt130=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 130, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 130, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }
            switch (alt130) {
                case 1 :
                    // CMTJava.g:807:10: '<' '<'
                    {
                    match(input,LT,FOLLOW_LT_in_shiftOp6285); if (state.failed) return retval;
                    match(input,LT,FOLLOW_LT_in_shiftOp6287); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:808:10: '>' '>' '>'
                    {
                    match(input,GT,FOLLOW_GT_in_shiftOp6298); if (state.failed) return retval;
                    match(input,GT,FOLLOW_GT_in_shiftOp6300); if (state.failed) return retval;
                    match(input,GT,FOLLOW_GT_in_shiftOp6302); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:809:10: '>' '>'
                    {
                    match(input,GT,FOLLOW_GT_in_shiftOp6313); if (state.failed) return retval;
                    match(input,GT,FOLLOW_GT_in_shiftOp6315); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, shiftOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shiftOp"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "additiveExpression"
    // CMTJava.g:813:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final CMTJavaParser.additiveExpression_return additiveExpression() throws RecognitionException {
        CMTJavaParser.additiveExpression_return retval = new CMTJavaParser.additiveExpression_return();
        retval.start = input.LT(1);
        int additiveExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // CMTJava.g:814:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // CMTJava.g:814:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression6336);
            multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:815:9: ( ( '+' | '-' ) multiplicativeExpression )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( ((LA131_0>=PLUS && LA131_0<=SUB)) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // CMTJava.g:816:13: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression6413);
            	    multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, additiveExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "multiplicativeExpression"
    // CMTJava.g:823:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final CMTJavaParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        CMTJavaParser.multiplicativeExpression_return retval = new CMTJavaParser.multiplicativeExpression_return();
        retval.start = input.LT(1);
        int multiplicativeExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // CMTJava.g:824:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // CMTJava.g:825:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression6451);
            unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:826:9: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( ((LA132_0>=STAR && LA132_0<=SLASH)||LA132_0==PERCENT) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // CMTJava.g:827:13: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=SLASH)||input.LA(1)==PERCENT ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression6546);
            	    unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop132;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, multiplicativeExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "unaryExpression"
    // CMTJava.g:835:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
    public final CMTJavaParser.unaryExpression_return unaryExpression() throws RecognitionException {
        CMTJavaParser.unaryExpression_return retval = new CMTJavaParser.unaryExpression_return();
        retval.start = input.LT(1);
        int unaryExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // CMTJava.g:840:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
            int alt133=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt133=1;
                }
                break;
            case SUB:
                {
                alt133=2;
                }
                break;
            case PLUSPLUS:
                {
                alt133=3;
                }
                break;
            case SUBSUB:
                {
                alt133=4;
                }
                break;
            case IDENTIFIER:
            case INTLITERAL:
            case LONGLITERAL:
            case FLOATLITERAL:
            case DOUBLELITERAL:
            case CHARLITERAL:
            case STRINGLITERAL:
            case TRUE:
            case FALSE:
            case NULL:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case NEW:
            case SHORT:
            case SUPER:
            case THIS:
            case VOID:
            case LPAREN:
            case BANG:
            case TILDE:
                {
                alt133=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }

            switch (alt133) {
                case 1 :
                    // CMTJava.g:840:9: '+' unaryExpression
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unaryExpression6579); if (state.failed) return retval;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression6582);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:841:9: '-' unaryExpression
                    {
                    match(input,SUB,FOLLOW_SUB_in_unaryExpression6592); if (state.failed) return retval;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression6594);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:842:9: '++' unaryExpression
                    {
                    match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unaryExpression6604); if (state.failed) return retval;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression6606);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // CMTJava.g:843:9: '--' unaryExpression
                    {
                    match(input,SUBSUB,FOLLOW_SUBSUB_in_unaryExpression6616); if (state.failed) return retval;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression6618);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // CMTJava.g:844:9: unaryExpressionNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression6628);
                    unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, unaryExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "unaryExpressionNotPlusMinus"
    // CMTJava.g:847:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );
    public final CMTJavaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        CMTJavaParser.unaryExpressionNotPlusMinus_return retval = new CMTJavaParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);
        int unaryExpressionNotPlusMinus_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // CMTJava.g:848:5: ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? )
            int alt136=4;
            alt136 = dfa136.predict(input);
            switch (alt136) {
                case 1 :
                    // CMTJava.g:848:9: '~' unaryExpression
                    {
                    match(input,TILDE,FOLLOW_TILDE_in_unaryExpressionNotPlusMinus6648); if (state.failed) return retval;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus6650);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:849:9: '!' unaryExpression
                    {
                    match(input,BANG,FOLLOW_BANG_in_unaryExpressionNotPlusMinus6660); if (state.failed) return retval;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus6662);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:850:9: castExpression
                    {
                    pushFollow(FOLLOW_castExpression_in_unaryExpressionNotPlusMinus6672);
                    castExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // CMTJava.g:851:9: primary ( selector )* ( '++' | '--' )?
                    {
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus6682);
                    primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    // CMTJava.g:852:9: ( selector )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==LBRACKET||LA134_0==DOT) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // CMTJava.g:852:10: selector
                    	    {
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus6693);
                    	    selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop134;
                        }
                    } while (true);

                    // CMTJava.g:854:9: ( '++' | '--' )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( ((LA135_0>=PLUSPLUS && LA135_0<=SUBSUB)) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // CMTJava.g:
                            {
                            if ( (input.LA(1)>=PLUSPLUS && input.LA(1)<=SUBSUB) ) {
                                input.consume();
                                state.errorRecovery=false;state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, unaryExpressionNotPlusMinus_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"

    public static class castExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "castExpression"
    // CMTJava.g:859:1: castExpression : ( '(' primitiveType ')' unaryExpression | '(' type ')' unaryExpressionNotPlusMinus );
    public final CMTJavaParser.castExpression_return castExpression() throws RecognitionException {
        CMTJavaParser.castExpression_return retval = new CMTJavaParser.castExpression_return();
        retval.start = input.LT(1);
        int castExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // CMTJava.g:860:5: ( '(' primitiveType ')' unaryExpression | '(' type ')' unaryExpressionNotPlusMinus )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==LPAREN) ) {
                int LA137_1 = input.LA(2);

                if ( (synpred214_CMTJava()) ) {
                    alt137=1;
                }
                else if ( (true) ) {
                    alt137=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 137, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // CMTJava.g:860:9: '(' primitiveType ')' unaryExpression
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_castExpression6763); if (state.failed) return retval;
                    pushFollow(FOLLOW_primitiveType_in_castExpression6765);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RPAREN,FOLLOW_RPAREN_in_castExpression6767); if (state.failed) return retval;
                    pushFollow(FOLLOW_unaryExpression_in_castExpression6769);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:861:9: '(' type ')' unaryExpressionNotPlusMinus
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_castExpression6779); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_castExpression6781);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RPAREN,FOLLOW_RPAREN_in_castExpression6783); if (state.failed) return retval;
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_castExpression6785);
                    unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, castExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "castExpression"

    public static class primary_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "primary"
    // CMTJava.g:864:1: primary : ( parExpression | 'this' ( '.' IDENTIFIER )* ( identifierSuffix )? | IDENTIFIER ( '.' IDENTIFIER )* ( identifierSuffix )? | 'super' superSuffix | literal | creator | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' );
    public final CMTJavaParser.primary_return primary() throws RecognitionException {
        CMTJavaParser.primary_return retval = new CMTJavaParser.primary_return();
        retval.start = input.LT(1);
        int primary_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }
            // CMTJava.g:868:5: ( parExpression | 'this' ( '.' IDENTIFIER )* ( identifierSuffix )? | IDENTIFIER ( '.' IDENTIFIER )* ( identifierSuffix )? | 'super' superSuffix | literal | creator | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' )
            int alt143=8;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt143=1;
                }
                break;
            case THIS:
                {
                alt143=2;
                }
                break;
            case IDENTIFIER:
                {
                alt143=3;
                }
                break;
            case SUPER:
                {
                alt143=4;
                }
                break;
            case INTLITERAL:
            case LONGLITERAL:
            case FLOATLITERAL:
            case DOUBLELITERAL:
            case CHARLITERAL:
            case STRINGLITERAL:
            case TRUE:
            case FALSE:
            case NULL:
                {
                alt143=5;
                }
                break;
            case NEW:
                {
                alt143=6;
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
                {
                alt143=7;
                }
                break;
            case VOID:
                {
                alt143=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }

            switch (alt143) {
                case 1 :
                    // CMTJava.g:868:9: parExpression
                    {
                    pushFollow(FOLLOW_parExpression_in_primary6807);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:869:9: 'this' ( '.' IDENTIFIER )* ( identifierSuffix )?
                    {
                    match(input,THIS,FOLLOW_THIS_in_primary6829); if (state.failed) return retval;
                    // CMTJava.g:870:9: ( '.' IDENTIFIER )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==DOT) ) {
                            int LA138_2 = input.LA(2);

                            if ( (LA138_2==IDENTIFIER) ) {
                                int LA138_3 = input.LA(3);

                                if ( (synpred216_CMTJava()) ) {
                                    alt138=1;
                                }


                            }


                        }


                        switch (alt138) {
                    	case 1 :
                    	    // CMTJava.g:870:10: '.' IDENTIFIER
                    	    {
                    	    match(input,DOT,FOLLOW_DOT_in_primary6840); if (state.failed) return retval;
                    	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary6842); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);

                    // CMTJava.g:872:9: ( identifierSuffix )?
                    int alt139=2;
                    alt139 = dfa139.predict(input);
                    switch (alt139) {
                        case 1 :
                            // CMTJava.g:872:10: identifierSuffix
                            {
                            pushFollow(FOLLOW_identifierSuffix_in_primary6864);
                            identifierSuffix();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // CMTJava.g:874:9: IDENTIFIER ( '.' IDENTIFIER )* ( identifierSuffix )?
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary6885); if (state.failed) return retval;
                    // CMTJava.g:875:9: ( '.' IDENTIFIER )*
                    loop140:
                    do {
                        int alt140=2;
                        int LA140_0 = input.LA(1);

                        if ( (LA140_0==DOT) ) {
                            int LA140_2 = input.LA(2);

                            if ( (LA140_2==IDENTIFIER) ) {
                                int LA140_3 = input.LA(3);

                                if ( (synpred219_CMTJava()) ) {
                                    alt140=1;
                                }


                            }


                        }


                        switch (alt140) {
                    	case 1 :
                    	    // CMTJava.g:875:10: '.' IDENTIFIER
                    	    {
                    	    match(input,DOT,FOLLOW_DOT_in_primary6896); if (state.failed) return retval;
                    	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary6898); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop140;
                        }
                    } while (true);

                    // CMTJava.g:877:9: ( identifierSuffix )?
                    int alt141=2;
                    alt141 = dfa141.predict(input);
                    switch (alt141) {
                        case 1 :
                            // CMTJava.g:877:10: identifierSuffix
                            {
                            pushFollow(FOLLOW_identifierSuffix_in_primary6920);
                            identifierSuffix();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // CMTJava.g:879:9: 'super' superSuffix
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_primary6941); if (state.failed) return retval;
                    pushFollow(FOLLOW_superSuffix_in_primary6951);
                    superSuffix();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // CMTJava.g:881:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primary6961);
                    literal();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // CMTJava.g:882:9: creator
                    {
                    pushFollow(FOLLOW_creator_in_primary6971);
                    creator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // CMTJava.g:883:9: primitiveType ( '[' ']' )* '.' 'class'
                    {
                    pushFollow(FOLLOW_primitiveType_in_primary6981);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    // CMTJava.g:884:9: ( '[' ']' )*
                    loop142:
                    do {
                        int alt142=2;
                        int LA142_0 = input.LA(1);

                        if ( (LA142_0==LBRACKET) ) {
                            alt142=1;
                        }


                        switch (alt142) {
                    	case 1 :
                    	    // CMTJava.g:884:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_primary6992); if (state.failed) return retval;
                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_primary6994); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop142;
                        }
                    } while (true);

                    match(input,DOT,FOLLOW_DOT_in_primary7015); if (state.failed) return retval;
                    match(input,CLASS,FOLLOW_CLASS_in_primary7017); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // CMTJava.g:887:9: 'void' '.' 'class'
                    {
                    match(input,VOID,FOLLOW_VOID_in_primary7027); if (state.failed) return retval;
                    match(input,DOT,FOLLOW_DOT_in_primary7029); if (state.failed) return retval;
                    match(input,CLASS,FOLLOW_CLASS_in_primary7031); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 92, primary_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primary"

    public static class superSuffix_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "superSuffix"
    // CMTJava.g:891:1: superSuffix : ( arguments | '.' ( typeArguments )? IDENTIFIER ( arguments )? );
    public final CMTJavaParser.superSuffix_return superSuffix() throws RecognitionException {
        CMTJavaParser.superSuffix_return retval = new CMTJavaParser.superSuffix_return();
        retval.start = input.LT(1);
        int superSuffix_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }
            // CMTJava.g:892:5: ( arguments | '.' ( typeArguments )? IDENTIFIER ( arguments )? )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==LPAREN) ) {
                alt146=1;
            }
            else if ( (LA146_0==DOT) ) {
                alt146=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // CMTJava.g:892:9: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_superSuffix7057);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:893:9: '.' ( typeArguments )? IDENTIFIER ( arguments )?
                    {
                    match(input,DOT,FOLLOW_DOT_in_superSuffix7067); if (state.failed) return retval;
                    // CMTJava.g:893:13: ( typeArguments )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==LT) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // CMTJava.g:893:14: typeArguments
                            {
                            pushFollow(FOLLOW_typeArguments_in_superSuffix7070);
                            typeArguments();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superSuffix7091); if (state.failed) return retval;
                    // CMTJava.g:896:9: ( arguments )?
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==LPAREN) ) {
                        alt145=1;
                    }
                    switch (alt145) {
                        case 1 :
                            // CMTJava.g:896:10: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_superSuffix7102);
                            arguments();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, superSuffix_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "superSuffix"

    public static class identifierSuffix_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "identifierSuffix"
    // CMTJava.g:901:1: identifierSuffix : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' nonWildcardTypeArguments IDENTIFIER arguments | '.' 'this' | '.' 'super' arguments | innerCreator );
    public final CMTJavaParser.identifierSuffix_return identifierSuffix() throws RecognitionException {
        CMTJavaParser.identifierSuffix_return retval = new CMTJavaParser.identifierSuffix_return();
        retval.start = input.LT(1);
        int identifierSuffix_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }
            // CMTJava.g:902:5: ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' nonWildcardTypeArguments IDENTIFIER arguments | '.' 'this' | '.' 'super' arguments | innerCreator )
            int alt149=8;
            alt149 = dfa149.predict(input);
            switch (alt149) {
                case 1 :
                    // CMTJava.g:902:9: ( '[' ']' )+ '.' 'class'
                    {
                    // CMTJava.g:902:9: ( '[' ']' )+
                    int cnt147=0;
                    loop147:
                    do {
                        int alt147=2;
                        int LA147_0 = input.LA(1);

                        if ( (LA147_0==LBRACKET) ) {
                            alt147=1;
                        }


                        switch (alt147) {
                    	case 1 :
                    	    // CMTJava.g:902:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_identifierSuffix7135); if (state.failed) return retval;
                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_identifierSuffix7137); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt147 >= 1 ) break loop147;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(147, input);
                                throw eee;
                        }
                        cnt147++;
                    } while (true);

                    match(input,DOT,FOLLOW_DOT_in_identifierSuffix7158); if (state.failed) return retval;
                    match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix7160); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:905:9: ( '[' expression ']' )+
                    {
                    // CMTJava.g:905:9: ( '[' expression ']' )+
                    int cnt148=0;
                    loop148:
                    do {
                        int alt148=2;
                        alt148 = dfa148.predict(input);
                        switch (alt148) {
                    	case 1 :
                    	    // CMTJava.g:905:10: '[' expression ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_identifierSuffix7171); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_expression_in_identifierSuffix7173);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_identifierSuffix7175); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt148 >= 1 ) break loop148;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(148, input);
                                throw eee;
                        }
                        cnt148++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // CMTJava.g:907:9: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_identifierSuffix7196);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // CMTJava.g:908:9: '.' 'class'
                    {
                    match(input,DOT,FOLLOW_DOT_in_identifierSuffix7206); if (state.failed) return retval;
                    match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix7208); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // CMTJava.g:909:9: '.' nonWildcardTypeArguments IDENTIFIER arguments
                    {
                    match(input,DOT,FOLLOW_DOT_in_identifierSuffix7218); if (state.failed) return retval;
                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_identifierSuffix7220);
                    nonWildcardTypeArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierSuffix7222); if (state.failed) return retval;
                    pushFollow(FOLLOW_arguments_in_identifierSuffix7224);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // CMTJava.g:910:9: '.' 'this'
                    {
                    match(input,DOT,FOLLOW_DOT_in_identifierSuffix7234); if (state.failed) return retval;
                    match(input,THIS,FOLLOW_THIS_in_identifierSuffix7236); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // CMTJava.g:911:9: '.' 'super' arguments
                    {
                    match(input,DOT,FOLLOW_DOT_in_identifierSuffix7246); if (state.failed) return retval;
                    match(input,SUPER,FOLLOW_SUPER_in_identifierSuffix7248); if (state.failed) return retval;
                    pushFollow(FOLLOW_arguments_in_identifierSuffix7250);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // CMTJava.g:912:9: innerCreator
                    {
                    pushFollow(FOLLOW_innerCreator_in_identifierSuffix7260);
                    innerCreator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 94, identifierSuffix_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "identifierSuffix"

    public static class selector_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "selector"
    // CMTJava.g:916:1: selector : ( '.' IDENTIFIER ( arguments )? | '.' 'this' | '.' 'super' superSuffix | innerCreator | '[' expression ']' );
    public final CMTJavaParser.selector_return selector() throws RecognitionException {
        CMTJavaParser.selector_return retval = new CMTJavaParser.selector_return();
        retval.start = input.LT(1);
        int selector_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }
            // CMTJava.g:917:5: ( '.' IDENTIFIER ( arguments )? | '.' 'this' | '.' 'super' superSuffix | innerCreator | '[' expression ']' )
            int alt151=5;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==DOT) ) {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    alt151=1;
                    }
                    break;
                case THIS:
                    {
                    alt151=2;
                    }
                    break;
                case SUPER:
                    {
                    alt151=3;
                    }
                    break;
                case NEW:
                    {
                    alt151=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 151, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA151_0==LBRACKET) ) {
                alt151=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;
            }
            switch (alt151) {
                case 1 :
                    // CMTJava.g:917:9: '.' IDENTIFIER ( arguments )?
                    {
                    match(input,DOT,FOLLOW_DOT_in_selector7282); if (state.failed) return retval;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector7284); if (state.failed) return retval;
                    // CMTJava.g:918:9: ( arguments )?
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==LPAREN) ) {
                        alt150=1;
                    }
                    switch (alt150) {
                        case 1 :
                            // CMTJava.g:918:10: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_selector7295);
                            arguments();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // CMTJava.g:920:9: '.' 'this'
                    {
                    match(input,DOT,FOLLOW_DOT_in_selector7316); if (state.failed) return retval;
                    match(input,THIS,FOLLOW_THIS_in_selector7318); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:921:9: '.' 'super' superSuffix
                    {
                    match(input,DOT,FOLLOW_DOT_in_selector7328); if (state.failed) return retval;
                    match(input,SUPER,FOLLOW_SUPER_in_selector7330); if (state.failed) return retval;
                    pushFollow(FOLLOW_superSuffix_in_selector7340);
                    superSuffix();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // CMTJava.g:923:9: innerCreator
                    {
                    pushFollow(FOLLOW_innerCreator_in_selector7350);
                    innerCreator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // CMTJava.g:924:9: '[' expression ']'
                    {
                    match(input,LBRACKET,FOLLOW_LBRACKET_in_selector7360); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_selector7362);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RBRACKET,FOLLOW_RBRACKET_in_selector7364); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, selector_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "selector"

    public static class creator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "creator"
    // CMTJava.g:927:1: creator : ( 'new' stmdoBlock -> template(id=$stmdoBlock.sttp) \"<id>\" | 'new' nonWildcardTypeArguments classOrInterfaceType classCreatorRest | 'new' classOrInterfaceType classCreatorRest | arrayCreator );
    public final CMTJavaParser.creator_return creator() throws RecognitionException {
        CMTJavaParser.creator_return retval = new CMTJavaParser.creator_return();
        retval.start = input.LT(1);
        int creator_StartIndex = input.index();
        CMTJavaParser.stmdoBlock_return stmdoBlock3 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }
            // CMTJava.g:928:5: ( 'new' stmdoBlock -> template(id=$stmdoBlock.sttp) \"<id>\" | 'new' nonWildcardTypeArguments classOrInterfaceType classCreatorRest | 'new' classOrInterfaceType classCreatorRest | arrayCreator )
            int alt152=4;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==NEW) ) {
                int LA152_1 = input.LA(2);

                if ( (synpred244_CMTJava()) ) {
                    alt152=1;
                }
                else if ( (synpred245_CMTJava()) ) {
                    alt152=2;
                }
                else if ( (synpred246_CMTJava()) ) {
                    alt152=3;
                }
                else if ( (true) ) {
                    alt152=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 152, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;
            }
            switch (alt152) {
                case 1 :
                    // CMTJava.g:929:3: 'new' stmdoBlock
                    {
                    match(input,NEW,FOLLOW_NEW_in_creator7384); if (state.failed) return retval;
                    pushFollow(FOLLOW_stmdoBlock_in_creator7386);
                    stmdoBlock3=stmdoBlock();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 929:20: -> template(id=$stmdoBlock.sttp) \"<id>\"
                      {
                          retval.st = new StringTemplate(templateLib, "<id>",
                        new STAttrMap().put("id", (stmdoBlock3!=null?stmdoBlock3.sttp:null)));
                      }

                      ((TokenRewriteStream)input).replace(
                        ((Token)retval.start).getTokenIndex(),
                        input.LT(-1).getTokenIndex(),
                        retval.st);
                    }
                    }
                    break;
                case 2 :
                    // CMTJava.g:931:7: 'new' nonWildcardTypeArguments classOrInterfaceType classCreatorRest
                    {
                    match(input,NEW,FOLLOW_NEW_in_creator7406); if (state.failed) return retval;
                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_creator7408);
                    nonWildcardTypeArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_classOrInterfaceType_in_creator7410);
                    classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_classCreatorRest_in_creator7412);
                    classCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:932:9: 'new' classOrInterfaceType classCreatorRest
                    {
                    match(input,NEW,FOLLOW_NEW_in_creator7422); if (state.failed) return retval;
                    pushFollow(FOLLOW_classOrInterfaceType_in_creator7424);
                    classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_classCreatorRest_in_creator7426);
                    classCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // CMTJava.g:933:9: arrayCreator
                    {
                    pushFollow(FOLLOW_arrayCreator_in_creator7436);
                    arrayCreator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 96, creator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "creator"

    public static class stmdoBlock_return extends ParserRuleReturnScope {
        public StringTemplate sttp=null;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "stmdoBlock"
    // CMTJava.g:936:1: stmdoBlock returns [StringTemplate sttp=null] : 'STMDO' '{' stmBlockStatement '}' ;
    public final CMTJavaParser.stmdoBlock_return stmdoBlock() throws RecognitionException {
        CMTJavaParser.stmdoBlock_return retval = new CMTJavaParser.stmdoBlock_return();
        retval.start = input.LT(1);
        int stmdoBlock_StartIndex = input.index();
        CMTJavaParser.stmBlockStatement_return stmBlockStatement4 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }
            // CMTJava.g:937:2: ( 'STMDO' '{' stmBlockStatement '}' )
            // CMTJava.g:937:4: 'STMDO' '{' stmBlockStatement '}'
            {
            match(input,120,FOLLOW_120_in_stmdoBlock7454); if (state.failed) return retval;
            match(input,LBRACE,FOLLOW_LBRACE_in_stmdoBlock7459); if (state.failed) return retval;
            pushFollow(FOLLOW_stmBlockStatement_in_stmdoBlock7465);
            stmBlockStatement4=stmBlockStatement();

            state._fsp--;
            if (state.failed) return retval;
            match(input,RBRACE,FOLLOW_RBRACE_in_stmdoBlock7469); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              retval.sttp = new StringTemplate(templateLib,(stmBlockStatement4!=null?stmBlockStatement4.stmp:null).toString());
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, stmdoBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmdoBlock"

    protected static class stmBlockStatement_scope {
        boolean isfinalstmt;
    }
    protected Stack stmBlockStatement_stack = new Stack();

    public static class stmBlockStatement_return extends ParserRuleReturnScope {
        public StringTemplate stmp;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "stmBlockStatement"
    // CMTJava.g:944:1: stmBlockStatement returns [StringTemplate stmp] : ({...}? stmStat )+ ;
    public final CMTJavaParser.stmBlockStatement_return stmBlockStatement() throws RecognitionException {
        stmBlockStatement_stack.push(new stmBlockStatement_scope());
        CMTJavaParser.stmBlockStatement_return retval = new CMTJavaParser.stmBlockStatement_return();
        retval.start = input.LT(1);
        int stmBlockStatement_StartIndex = input.index();
        CMTJavaParser.stmStat_return stmStat5 = null;



        		((stmBlockStatement_scope)stmBlockStatement_stack.peek()).isfinalstmt = false;
        		StringTemplate head=null, tail=null;
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }
            // CMTJava.g:950:2: ( ({...}? stmStat )+ )
            // CMTJava.g:951:3: ({...}? stmStat )+
            {
            // CMTJava.g:951:3: ({...}? stmStat )+
            int cnt153=0;
            loop153:
            do {
                int alt153=2;
                int LA153_0 = input.LA(1);

                if ( (LA153_0==IDENTIFIER||LA153_0==BOOLEAN||LA153_0==BYTE||LA153_0==CHAR||LA153_0==DOUBLE||LA153_0==FLOAT||LA153_0==IF||LA153_0==INT||LA153_0==LONG||LA153_0==SHORT||LA153_0==THIS) ) {
                    alt153=1;
                }


                switch (alt153) {
            	case 1 :
            	    // CMTJava.g:952:4: {...}? stmStat
            	    {
            	    if ( !((!((stmBlockStatement_scope)stmBlockStatement_stack.peek()).isfinalstmt)) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "stmBlockStatement", "!$stmBlockStatement::isfinalstmt");
            	    }
            	    pushFollow(FOLLOW_stmStat_in_stmBlockStatement7506);
            	    stmStat5=stmStat();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {

            	      				head = templateLib.getInstanceOf("block",
            	        new STAttrMap().put("begin", head).put("end", (stmStat5!=null?stmStat5.tpl:null)));
            	      				tail = templateLib.getInstanceOf("block",
            	        new STAttrMap().put("begin", (stmStat5!=null?stmStat5.t:null)).put("end", tail));	
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt153 >= 1 ) break loop153;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(153, input);
                        throw eee;
                }
                cnt153++;
            } while (true);

            if ( state.backtracking==0 ) {
              retval.stmp =templateLib.getInstanceOf("block",
                new STAttrMap().put("begin", head).put("end", tail));
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 98, stmBlockStatement_StartIndex); }
            stmBlockStatement_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "stmBlockStatement"

    public static class stmStat_return extends ParserRuleReturnScope {
        public StringTemplate tpl=null;
        public StringTemplate t=null;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "stmStat"
    // CMTJava.g:961:1: stmStat returns [StringTemplate tpl=null, StringTemplate t=null] : ( ( stmAssignment ) | ( stmExpression ';' )=> (e1= stmExpression ) ';' | e2= stmExpression | ( stmIf '}' )=>s1= stmIf | s2= stmIf );
    public final CMTJavaParser.stmStat_return stmStat() throws RecognitionException {
        CMTJavaParser.stmStat_return retval = new CMTJavaParser.stmStat_return();
        retval.start = input.LT(1);
        int stmStat_StartIndex = input.index();
        CMTJavaParser.stmExpression_return e1 = null;

        CMTJavaParser.stmExpression_return e2 = null;

        CMTJavaParser.stmIf_return s1 = null;

        CMTJavaParser.stmIf_return s2 = null;

        CMTJavaParser.stmAssignment_return stmAssignment6 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }
            // CMTJava.g:962:2: ( ( stmAssignment ) | ( stmExpression ';' )=> (e1= stmExpression ) ';' | e2= stmExpression | ( stmIf '}' )=>s1= stmIf | s2= stmIf )
            int alt154=5;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA154_1 = input.LA(2);

                if ( (synpred248_CMTJava()) ) {
                    alt154=1;
                }
                else if ( (synpred249_CMTJava()) ) {
                    alt154=2;
                }
                else if ( (synpred250_CMTJava()) ) {
                    alt154=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 154, 1, input);

                    throw nvae;
                }
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
                {
                alt154=1;
                }
                break;
            case THIS:
                {
                int LA154_3 = input.LA(2);

                if ( (synpred249_CMTJava()) ) {
                    alt154=2;
                }
                else if ( (synpred250_CMTJava()) ) {
                    alt154=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 154, 3, input);

                    throw nvae;
                }
                }
                break;
            case IF:
                {
                int LA154_4 = input.LA(2);

                if ( (synpred251_CMTJava()) ) {
                    alt154=4;
                }
                else if ( (true) ) {
                    alt154=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 154, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;
            }

            switch (alt154) {
                case 1 :
                    // CMTJava.g:963:3: ( stmAssignment )
                    {
                    // CMTJava.g:963:3: ( stmAssignment )
                    // CMTJava.g:964:3: stmAssignment
                    {
                    pushFollow(FOLLOW_stmAssignment_in_stmStat7542);
                    stmAssignment6=stmAssignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.tpl = (stmAssignment6!=null?stmAssignment6.stpl:null);retval.t = (stmAssignment6!=null?stmAssignment6.t:null);
                    }

                    }


                    }
                    break;
                case 2 :
                    // CMTJava.g:968:4: ( stmExpression ';' )=> (e1= stmExpression ) ';'
                    {
                    // CMTJava.g:968:26: (e1= stmExpression )
                    // CMTJava.g:968:27: e1= stmExpression
                    {
                    pushFollow(FOLLOW_stmExpression_in_stmStat7570);
                    e1=stmExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }

                    match(input,SEMI,FOLLOW_SEMI_in_stmStat7573); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.tpl = templateLib.getInstanceOf("then",
                        new STAttrMap().put("expression", (e1!=null?input.toString(e1.start,e1.stop):null)));
                      		retval.t = (e1!=null?e1.t:null);
                      		//System.out.println("expressao meio: " + retval.tpl.toString());
                      		
                    }

                    }
                    break;
                case 3 :
                    // CMTJava.g:973:5: e2= stmExpression
                    {
                    pushFollow(FOLLOW_stmExpression_in_stmStat7587);
                    e2=stmExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.tpl =new StringTemplate(templateLib,(e2!=null?input.toString(e2.start,e2.stop):null));	
                      		//System.out.println("expressao final: " + retval.tpl.toString());
                      		((stmBlockStatement_scope)stmBlockStatement_stack.peek()).isfinalstmt =true;
                    }

                    }
                    break;
                case 4 :
                    // CMTJava.g:977:3: ( stmIf '}' )=>s1= stmIf
                    {
                    pushFollow(FOLLOW_stmIf_in_stmStat7609);
                    s1=stmIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.tpl =new StringTemplate(templateLib,(s1!=null?s1.stpl:null).toString());
                      		//System.out.println("if final: " + retval.tpl.toString());
                      		((stmBlockStatement_scope)stmBlockStatement_stack.peek()).isfinalstmt =true;
                    }

                    }
                    break;
                case 5 :
                    // CMTJava.g:980:4: s2= stmIf
                    {
                    pushFollow(FOLLOW_stmIf_in_stmStat7620);
                    s2=stmIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.tpl = templateLib.getInstanceOf("then",
                        new STAttrMap().put("expression", (s2!=null?s2.stpl:null)));
                      		//System.out.println("if meio: " + retval.tpl.toString());
                      		retval.t = new StringTemplate(templateLib,")");
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, stmStat_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmStat"

    public static class stmAssignment_return extends ParserRuleReturnScope {
        public StringTemplate stpl;
        public StringTemplate t;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "stmAssignment"
    // CMTJava.g:986:1: stmAssignment returns [StringTemplate stpl, StringTemplate t] : type IDENTIFIER '<-' stmExpression ( ';' ) ;
    public final CMTJavaParser.stmAssignment_return stmAssignment() throws RecognitionException {
        CMTJavaParser.stmAssignment_return retval = new CMTJavaParser.stmAssignment_return();
        retval.start = input.LT(1);
        int stmAssignment_StartIndex = input.index();
        Token IDENTIFIER8=null;
        CMTJavaParser.stmExpression_return stmExpression7 = null;

        CMTJavaParser.type_return type9 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }
            // CMTJava.g:987:2: ( type IDENTIFIER '<-' stmExpression ( ';' ) )
            // CMTJava.g:988:3: type IDENTIFIER '<-' stmExpression ( ';' )
            {
            pushFollow(FOLLOW_type_in_stmAssignment7642);
            type9=type();

            state._fsp--;
            if (state.failed) return retval;
            IDENTIFIER8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stmAssignment7644); if (state.failed) return retval;
            match(input,121,FOLLOW_121_in_stmAssignment7646); if (state.failed) return retval;
            pushFollow(FOLLOW_stmExpression_in_stmAssignment7648);
            stmExpression7=stmExpression();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:988:38: ( ';' )
            // CMTJava.g:988:39: ';'
            {
            match(input,SEMI,FOLLOW_SEMI_in_stmAssignment7651); if (state.failed) return retval;

            }

            if ( state.backtracking==0 ) {
              retval.stpl = templateLib.getInstanceOf("bind",
                new STAttrMap().put("expression", (stmExpression7!=null?input.toString(stmExpression7.start,stmExpression7.stop):null)).put("id", (IDENTIFIER8!=null?IDENTIFIER8.getText():null)).put("type", (type9!=null?input.toString(type9.start,type9.stop):null)));
            }
            if ( state.backtracking==0 ) {
              retval.t = new StringTemplate("})");
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 100, stmAssignment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmAssignment"

    public static class stmExpression_return extends ParserRuleReturnScope {
        public StringTemplate stpl;
        public StringTemplate t;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "stmExpression"
    // CMTJava.g:993:1: stmExpression returns [StringTemplate stpl, StringTemplate t] : ( IDENTIFIER ( '.' IDENTIFIER )* ( identifierSuffix )? | 'this' ( '.' IDENTIFIER )* ( identifierSuffix )? );
    public final CMTJavaParser.stmExpression_return stmExpression() throws RecognitionException {
        CMTJavaParser.stmExpression_return retval = new CMTJavaParser.stmExpression_return();
        retval.start = input.LT(1);
        int stmExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }
            // CMTJava.g:994:2: ( IDENTIFIER ( '.' IDENTIFIER )* ( identifierSuffix )? | 'this' ( '.' IDENTIFIER )* ( identifierSuffix )? )
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==IDENTIFIER) ) {
                alt159=1;
            }
            else if ( (LA159_0==THIS) ) {
                alt159=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;
            }
            switch (alt159) {
                case 1 :
                    // CMTJava.g:995:3: IDENTIFIER ( '.' IDENTIFIER )* ( identifierSuffix )?
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stmExpression7677); if (state.failed) return retval;
                    // CMTJava.g:996:9: ( '.' IDENTIFIER )*
                    loop155:
                    do {
                        int alt155=2;
                        int LA155_0 = input.LA(1);

                        if ( (LA155_0==DOT) ) {
                            int LA155_2 = input.LA(2);

                            if ( (LA155_2==IDENTIFIER) ) {
                                alt155=1;
                            }


                        }


                        switch (alt155) {
                    	case 1 :
                    	    // CMTJava.g:996:10: '.' IDENTIFIER
                    	    {
                    	    match(input,DOT,FOLLOW_DOT_in_stmExpression7688); if (state.failed) return retval;
                    	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stmExpression7690); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop155;
                        }
                    } while (true);

                    // CMTJava.g:998:9: ( identifierSuffix )?
                    int alt156=2;
                    int LA156_0 = input.LA(1);

                    if ( (LA156_0==LPAREN||LA156_0==LBRACKET||LA156_0==DOT) ) {
                        alt156=1;
                    }
                    switch (alt156) {
                        case 1 :
                            // CMTJava.g:998:10: identifierSuffix
                            {
                            pushFollow(FOLLOW_identifierSuffix_in_stmExpression7712);
                            identifierSuffix();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      retval.stpl = new StringTemplate(templateLib,input.toString(retval.start,input.LT(-1)));
                    }
                    retval.t = new StringTemplate(")");

                    }
                    break;
                case 2 :
                    // CMTJava.g:1003:3: 'this' ( '.' IDENTIFIER )* ( identifierSuffix )?
                    {
                    match(input,THIS,FOLLOW_THIS_in_stmExpression7738); if (state.failed) return retval;
                    // CMTJava.g:1004:9: ( '.' IDENTIFIER )*
                    loop157:
                    do {
                        int alt157=2;
                        int LA157_0 = input.LA(1);

                        if ( (LA157_0==DOT) ) {
                            int LA157_2 = input.LA(2);

                            if ( (LA157_2==IDENTIFIER) ) {
                                alt157=1;
                            }


                        }


                        switch (alt157) {
                    	case 1 :
                    	    // CMTJava.g:1004:10: '.' IDENTIFIER
                    	    {
                    	    match(input,DOT,FOLLOW_DOT_in_stmExpression7749); if (state.failed) return retval;
                    	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stmExpression7751); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop157;
                        }
                    } while (true);

                    // CMTJava.g:1006:9: ( identifierSuffix )?
                    int alt158=2;
                    int LA158_0 = input.LA(1);

                    if ( (LA158_0==LPAREN||LA158_0==LBRACKET||LA158_0==DOT) ) {
                        alt158=1;
                    }
                    switch (alt158) {
                        case 1 :
                            // CMTJava.g:1006:10: identifierSuffix
                            {
                            pushFollow(FOLLOW_identifierSuffix_in_stmExpression7773);
                            identifierSuffix();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      retval.stpl = new StringTemplate(templateLib,input.toString(retval.start,input.LT(-1)));
                    }
                    retval.t = new StringTemplate(")");

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, stmExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmExpression"

    public static class stmIf_return extends ParserRuleReturnScope {
        public StringTemplate stpl;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "stmIf"
    // CMTJava.g:1016:1: stmIf returns [StringTemplate stpl] : 'if' '(' expression ')' (e1= stmExpression | '{' s1= stmBlockStatement '}' ) 'else' (e1= stmExpression | '{' s2= stmBlockStatement '}' ) ;
    public final CMTJavaParser.stmIf_return stmIf() throws RecognitionException {
        CMTJavaParser.stmIf_return retval = new CMTJavaParser.stmIf_return();
        retval.start = input.LT(1);
        int stmIf_StartIndex = input.index();
        CMTJavaParser.stmExpression_return e1 = null;

        CMTJavaParser.stmBlockStatement_return s1 = null;

        CMTJavaParser.stmBlockStatement_return s2 = null;

        CMTJavaParser.expression_return expression10 = null;


        StringTemplate head=null, tail=null, block1=null, block2=null;
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }
            // CMTJava.g:1018:2: ( 'if' '(' expression ')' (e1= stmExpression | '{' s1= stmBlockStatement '}' ) 'else' (e1= stmExpression | '{' s2= stmBlockStatement '}' ) )
            // CMTJava.g:1018:4: 'if' '(' expression ')' (e1= stmExpression | '{' s1= stmBlockStatement '}' ) 'else' (e1= stmExpression | '{' s2= stmBlockStatement '}' )
            {
            match(input,IF,FOLLOW_IF_in_stmIf7816); if (state.failed) return retval;
            match(input,LPAREN,FOLLOW_LPAREN_in_stmIf7818); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_stmIf7820);
            expression10=expression();

            state._fsp--;
            if (state.failed) return retval;
            match(input,RPAREN,FOLLOW_RPAREN_in_stmIf7822); if (state.failed) return retval;
            // CMTJava.g:1019:3: (e1= stmExpression | '{' s1= stmBlockStatement '}' )
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==IDENTIFIER||LA160_0==THIS) ) {
                alt160=1;
            }
            else if ( (LA160_0==LBRACE) ) {
                alt160=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 160, 0, input);

                throw nvae;
            }
            switch (alt160) {
                case 1 :
                    // CMTJava.g:1020:4: e1= stmExpression
                    {
                    pushFollow(FOLLOW_stmExpression_in_stmIf7838);
                    e1=stmExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      block1=new StringTemplate(templateLib,(e1!=null?e1.stpl:null).toString());
                    }

                    }
                    break;
                case 2 :
                    // CMTJava.g:1022:4: '{' s1= stmBlockStatement '}'
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_stmIf7852); if (state.failed) return retval;
                    pushFollow(FOLLOW_stmBlockStatement_in_stmIf7863);
                    s1=stmBlockStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RBRACE,FOLLOW_RBRACE_in_stmIf7868); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      block1 = new StringTemplate(templateLib,(s1!=null?s1.stmp:null).toString());
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              head=tail=null;
            }
            match(input,ELSE,FOLLOW_ELSE_in_stmIf7888); if (state.failed) return retval;
            // CMTJava.g:1030:3: (e1= stmExpression | '{' s2= stmBlockStatement '}' )
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==IDENTIFIER||LA161_0==THIS) ) {
                alt161=1;
            }
            else if ( (LA161_0==LBRACE) ) {
                alt161=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 161, 0, input);

                throw nvae;
            }
            switch (alt161) {
                case 1 :
                    // CMTJava.g:1031:4: e1= stmExpression
                    {
                    pushFollow(FOLLOW_stmExpression_in_stmIf7901);
                    e1=stmExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      block2=new StringTemplate(templateLib,(e1!=null?e1.stpl:null).toString());
                    }

                    }
                    break;
                case 2 :
                    // CMTJava.g:1033:4: '{' s2= stmBlockStatement '}'
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_stmIf7915); if (state.failed) return retval;
                    pushFollow(FOLLOW_stmBlockStatement_in_stmIf7926);
                    s2=stmBlockStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RBRACE,FOLLOW_RBRACE_in_stmIf7931); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      block2 = new StringTemplate(templateLib,(s2!=null?s2.stmp:null).toString());
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              retval.stpl = templateLib.getInstanceOf("if",
                new STAttrMap().put("cond", (expression10!=null?input.toString(expression10.start,expression10.stop):null)).put("block1", block1).put("block2", block2));((stmBlockStatement_scope)stmBlockStatement_stack.peek()).isfinalstmt = false;
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 102, stmIf_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmIf"

    public static class arrayCreator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayCreator"
    // CMTJava.g:1042:1: arrayCreator : ( 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer | 'new' createdName '[' expression ']' ( '[' expression ']' )* ( '[' ']' )* );
    public final CMTJavaParser.arrayCreator_return arrayCreator() throws RecognitionException {
        CMTJavaParser.arrayCreator_return retval = new CMTJavaParser.arrayCreator_return();
        retval.start = input.LT(1);
        int arrayCreator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }
            // CMTJava.g:1043:5: ( 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer | 'new' createdName '[' expression ']' ( '[' expression ']' )* ( '[' ']' )* )
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==NEW) ) {
                int LA165_1 = input.LA(2);

                if ( (synpred260_CMTJava()) ) {
                    alt165=1;
                }
                else if ( (true) ) {
                    alt165=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 165, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 165, 0, input);

                throw nvae;
            }
            switch (alt165) {
                case 1 :
                    // CMTJava.g:1043:9: 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer
                    {
                    match(input,NEW,FOLLOW_NEW_in_arrayCreator7964); if (state.failed) return retval;
                    pushFollow(FOLLOW_createdName_in_arrayCreator7966);
                    createdName();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator7976); if (state.failed) return retval;
                    match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator7978); if (state.failed) return retval;
                    // CMTJava.g:1045:9: ( '[' ']' )*
                    loop162:
                    do {
                        int alt162=2;
                        int LA162_0 = input.LA(1);

                        if ( (LA162_0==LBRACKET) ) {
                            alt162=1;
                        }


                        switch (alt162) {
                    	case 1 :
                    	    // CMTJava.g:1045:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator7989); if (state.failed) return retval;
                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator7991); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop162;
                        }
                    } while (true);

                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreator8012);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:1049:9: 'new' createdName '[' expression ']' ( '[' expression ']' )* ( '[' ']' )*
                    {
                    match(input,NEW,FOLLOW_NEW_in_arrayCreator8023); if (state.failed) return retval;
                    pushFollow(FOLLOW_createdName_in_arrayCreator8025);
                    createdName();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator8035); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_arrayCreator8037);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator8047); if (state.failed) return retval;
                    // CMTJava.g:1052:9: ( '[' expression ']' )*
                    loop163:
                    do {
                        int alt163=2;
                        alt163 = dfa163.predict(input);
                        switch (alt163) {
                    	case 1 :
                    	    // CMTJava.g:1052:13: '[' expression ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator8061); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_expression_in_arrayCreator8063);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator8077); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop163;
                        }
                    } while (true);

                    // CMTJava.g:1055:9: ( '[' ']' )*
                    loop164:
                    do {
                        int alt164=2;
                        int LA164_0 = input.LA(1);

                        if ( (LA164_0==LBRACKET) ) {
                            int LA164_2 = input.LA(2);

                            if ( (LA164_2==RBRACKET) ) {
                                alt164=1;
                            }


                        }


                        switch (alt164) {
                    	case 1 :
                    	    // CMTJava.g:1055:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator8099); if (state.failed) return retval;
                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator8101); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop164;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 103, arrayCreator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayCreator"

    public static class variableInitializer_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableInitializer"
    // CMTJava.g:1059:1: variableInitializer : ( arrayInitializer | expression );
    public final CMTJavaParser.variableInitializer_return variableInitializer() throws RecognitionException {
        CMTJavaParser.variableInitializer_return retval = new CMTJavaParser.variableInitializer_return();
        retval.start = input.LT(1);
        int variableInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }
            // CMTJava.g:1060:5: ( arrayInitializer | expression )
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==LBRACE) ) {
                alt166=1;
            }
            else if ( ((LA166_0>=IDENTIFIER && LA166_0<=NULL)||LA166_0==BOOLEAN||LA166_0==BYTE||LA166_0==CHAR||LA166_0==DOUBLE||LA166_0==FLOAT||LA166_0==INT||LA166_0==LONG||LA166_0==NEW||LA166_0==SHORT||LA166_0==SUPER||LA166_0==THIS||LA166_0==VOID||LA166_0==LPAREN||(LA166_0>=BANG && LA166_0<=TILDE)||(LA166_0>=PLUSPLUS && LA166_0<=SUB)) ) {
                alt166=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;
            }
            switch (alt166) {
                case 1 :
                    // CMTJava.g:1060:9: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer8132);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:1061:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer8142);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 104, variableInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableInitializer"

    public static class arrayInitializer_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayInitializer"
    // CMTJava.g:1064:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* )? ( ',' )? '}' ;
    public final CMTJavaParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
        CMTJavaParser.arrayInitializer_return retval = new CMTJavaParser.arrayInitializer_return();
        retval.start = input.LT(1);
        int arrayInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }
            // CMTJava.g:1065:5: ( '{' ( variableInitializer ( ',' variableInitializer )* )? ( ',' )? '}' )
            // CMTJava.g:1065:9: '{' ( variableInitializer ( ',' variableInitializer )* )? ( ',' )? '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_arrayInitializer8162); if (state.failed) return retval;
            // CMTJava.g:1066:13: ( variableInitializer ( ',' variableInitializer )* )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( ((LA168_0>=IDENTIFIER && LA168_0<=NULL)||LA168_0==BOOLEAN||LA168_0==BYTE||LA168_0==CHAR||LA168_0==DOUBLE||LA168_0==FLOAT||LA168_0==INT||LA168_0==LONG||LA168_0==NEW||LA168_0==SHORT||LA168_0==SUPER||LA168_0==THIS||LA168_0==VOID||LA168_0==LPAREN||LA168_0==LBRACE||(LA168_0>=BANG && LA168_0<=TILDE)||(LA168_0>=PLUSPLUS && LA168_0<=SUB)) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // CMTJava.g:1066:14: variableInitializer ( ',' variableInitializer )*
                    {
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer8178);
                    variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    // CMTJava.g:1067:17: ( ',' variableInitializer )*
                    loop167:
                    do {
                        int alt167=2;
                        int LA167_0 = input.LA(1);

                        if ( (LA167_0==COMMA) ) {
                            int LA167_1 = input.LA(2);

                            if ( ((LA167_1>=IDENTIFIER && LA167_1<=NULL)||LA167_1==BOOLEAN||LA167_1==BYTE||LA167_1==CHAR||LA167_1==DOUBLE||LA167_1==FLOAT||LA167_1==INT||LA167_1==LONG||LA167_1==NEW||LA167_1==SHORT||LA167_1==SUPER||LA167_1==THIS||LA167_1==VOID||LA167_1==LPAREN||LA167_1==LBRACE||(LA167_1>=BANG && LA167_1<=TILDE)||(LA167_1>=PLUSPLUS && LA167_1<=SUB)) ) {
                                alt167=1;
                            }


                        }


                        switch (alt167) {
                    	case 1 :
                    	    // CMTJava.g:1067:18: ',' variableInitializer
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrayInitializer8197); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer8199);
                    	    variableInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop167;
                        }
                    } while (true);


                    }
                    break;

            }

            // CMTJava.g:1070:13: ( ',' )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==COMMA) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // CMTJava.g:1070:14: ','
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_arrayInitializer8249); if (state.failed) return retval;

                    }
                    break;

            }

            match(input,RBRACE,FOLLOW_RBRACE_in_arrayInitializer8262); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 105, arrayInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayInitializer"

    public static class createdName_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "createdName"
    // CMTJava.g:1075:1: createdName : ( classOrInterfaceType | primitiveType );
    public final CMTJavaParser.createdName_return createdName() throws RecognitionException {
        CMTJavaParser.createdName_return retval = new CMTJavaParser.createdName_return();
        retval.start = input.LT(1);
        int createdName_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }
            // CMTJava.g:1076:5: ( classOrInterfaceType | primitiveType )
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==IDENTIFIER) ) {
                alt170=1;
            }
            else if ( (LA170_0==BOOLEAN||LA170_0==BYTE||LA170_0==CHAR||LA170_0==DOUBLE||LA170_0==FLOAT||LA170_0==INT||LA170_0==LONG||LA170_0==SHORT) ) {
                alt170=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 170, 0, input);

                throw nvae;
            }
            switch (alt170) {
                case 1 :
                    // CMTJava.g:1076:9: classOrInterfaceType
                    {
                    pushFollow(FOLLOW_classOrInterfaceType_in_createdName8296);
                    classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:1077:9: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_createdName8306);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 106, createdName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "createdName"

    public static class innerCreator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "innerCreator"
    // CMTJava.g:1080:1: innerCreator : '.' 'new' ( nonWildcardTypeArguments )? IDENTIFIER ( typeArguments )? classCreatorRest ;
    public final CMTJavaParser.innerCreator_return innerCreator() throws RecognitionException {
        CMTJavaParser.innerCreator_return retval = new CMTJavaParser.innerCreator_return();
        retval.start = input.LT(1);
        int innerCreator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }
            // CMTJava.g:1081:5: ( '.' 'new' ( nonWildcardTypeArguments )? IDENTIFIER ( typeArguments )? classCreatorRest )
            // CMTJava.g:1081:9: '.' 'new' ( nonWildcardTypeArguments )? IDENTIFIER ( typeArguments )? classCreatorRest
            {
            match(input,DOT,FOLLOW_DOT_in_innerCreator8327); if (state.failed) return retval;
            match(input,NEW,FOLLOW_NEW_in_innerCreator8329); if (state.failed) return retval;
            // CMTJava.g:1082:9: ( nonWildcardTypeArguments )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==LT) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // CMTJava.g:1082:10: nonWildcardTypeArguments
                    {
                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_innerCreator8340);
                    nonWildcardTypeArguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_innerCreator8361); if (state.failed) return retval;
            // CMTJava.g:1085:9: ( typeArguments )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==LT) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // CMTJava.g:1085:10: typeArguments
                    {
                    pushFollow(FOLLOW_typeArguments_in_innerCreator8372);
                    typeArguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_classCreatorRest_in_innerCreator8393);
            classCreatorRest();

            state._fsp--;
            if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 107, innerCreator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "innerCreator"

    public static class classCreatorRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classCreatorRest"
    // CMTJava.g:1091:1: classCreatorRest : arguments ( classBody )? ;
    public final CMTJavaParser.classCreatorRest_return classCreatorRest() throws RecognitionException {
        CMTJavaParser.classCreatorRest_return retval = new CMTJavaParser.classCreatorRest_return();
        retval.start = input.LT(1);
        int classCreatorRest_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }
            // CMTJava.g:1092:5: ( arguments ( classBody )? )
            // CMTJava.g:1092:9: arguments ( classBody )?
            {
            pushFollow(FOLLOW_arguments_in_classCreatorRest8414);
            arguments();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:1093:9: ( classBody )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==LBRACE) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // CMTJava.g:1093:10: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_classCreatorRest8425);
                    classBody();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 108, classCreatorRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classCreatorRest"

    public static class nonWildcardTypeArguments_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "nonWildcardTypeArguments"
    // CMTJava.g:1098:1: nonWildcardTypeArguments : '<' typeList '>' ;
    public final CMTJavaParser.nonWildcardTypeArguments_return nonWildcardTypeArguments() throws RecognitionException {
        CMTJavaParser.nonWildcardTypeArguments_return retval = new CMTJavaParser.nonWildcardTypeArguments_return();
        retval.start = input.LT(1);
        int nonWildcardTypeArguments_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }
            // CMTJava.g:1099:5: ( '<' typeList '>' )
            // CMTJava.g:1099:9: '<' typeList '>'
            {
            match(input,LT,FOLLOW_LT_in_nonWildcardTypeArguments8457); if (state.failed) return retval;
            pushFollow(FOLLOW_typeList_in_nonWildcardTypeArguments8459);
            typeList();

            state._fsp--;
            if (state.failed) return retval;
            match(input,GT,FOLLOW_GT_in_nonWildcardTypeArguments8469); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 109, nonWildcardTypeArguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nonWildcardTypeArguments"

    public static class arguments_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arguments"
    // CMTJava.g:1103:1: arguments : '(' ( expressionList )? ')' ;
    public final CMTJavaParser.arguments_return arguments() throws RecognitionException {
        CMTJavaParser.arguments_return retval = new CMTJavaParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }
            // CMTJava.g:1104:5: ( '(' ( expressionList )? ')' )
            // CMTJava.g:1104:9: '(' ( expressionList )? ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_arguments8489); if (state.failed) return retval;
            // CMTJava.g:1104:13: ( expressionList )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( ((LA174_0>=IDENTIFIER && LA174_0<=NULL)||LA174_0==BOOLEAN||LA174_0==BYTE||LA174_0==CHAR||LA174_0==DOUBLE||LA174_0==FLOAT||LA174_0==INT||LA174_0==LONG||LA174_0==NEW||LA174_0==SHORT||LA174_0==SUPER||LA174_0==THIS||LA174_0==VOID||LA174_0==LPAREN||(LA174_0>=BANG && LA174_0<=TILDE)||(LA174_0>=PLUSPLUS && LA174_0<=SUB)) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // CMTJava.g:1104:14: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments8492);
                    expressionList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_arguments8505); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 110, arguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class literal_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "literal"
    // CMTJava.g:1108:1: literal : ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | TRUE | FALSE | NULL );
    public final CMTJavaParser.literal_return literal() throws RecognitionException {
        CMTJavaParser.literal_return retval = new CMTJavaParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }
            // CMTJava.g:1109:5: ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | TRUE | FALSE | NULL )
            // CMTJava.g:
            {
            if ( (input.LA(1)>=INTLITERAL && input.LA(1)<=NULL) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 111, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class classHeader_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classHeader"
    // CMTJava.g:1120:1: classHeader : modifiers 'class' IDENTIFIER ;
    public final CMTJavaParser.classHeader_return classHeader() throws RecognitionException {
        CMTJavaParser.classHeader_return retval = new CMTJavaParser.classHeader_return();
        retval.start = input.LT(1);
        int classHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }
            // CMTJava.g:1125:5: ( modifiers 'class' IDENTIFIER )
            // CMTJava.g:1125:9: modifiers 'class' IDENTIFIER
            {
            pushFollow(FOLLOW_modifiers_in_classHeader8629);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            match(input,CLASS,FOLLOW_CLASS_in_classHeader8631); if (state.failed) return retval;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classHeader8633); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 112, classHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classHeader"

    public static class enumHeader_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "enumHeader"
    // CMTJava.g:1128:1: enumHeader : modifiers ( 'enum' | IDENTIFIER ) IDENTIFIER ;
    public final CMTJavaParser.enumHeader_return enumHeader() throws RecognitionException {
        CMTJavaParser.enumHeader_return retval = new CMTJavaParser.enumHeader_return();
        retval.start = input.LT(1);
        int enumHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }
            // CMTJava.g:1129:5: ( modifiers ( 'enum' | IDENTIFIER ) IDENTIFIER )
            // CMTJava.g:1129:9: modifiers ( 'enum' | IDENTIFIER ) IDENTIFIER
            {
            pushFollow(FOLLOW_modifiers_in_enumHeader8653);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( input.LA(1)==IDENTIFIER||input.LA(1)==ENUM ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumHeader8661); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 113, enumHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumHeader"

    public static class interfaceHeader_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interfaceHeader"
    // CMTJava.g:1132:1: interfaceHeader : modifiers 'interface' IDENTIFIER ;
    public final CMTJavaParser.interfaceHeader_return interfaceHeader() throws RecognitionException {
        CMTJavaParser.interfaceHeader_return retval = new CMTJavaParser.interfaceHeader_return();
        retval.start = input.LT(1);
        int interfaceHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }
            // CMTJava.g:1133:5: ( modifiers 'interface' IDENTIFIER )
            // CMTJava.g:1133:9: modifiers 'interface' IDENTIFIER
            {
            pushFollow(FOLLOW_modifiers_in_interfaceHeader8681);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceHeader8683); if (state.failed) return retval;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_interfaceHeader8685); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 114, interfaceHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceHeader"

    public static class annotationHeader_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationHeader"
    // CMTJava.g:1136:1: annotationHeader : modifiers '@' 'interface' IDENTIFIER ;
    public final CMTJavaParser.annotationHeader_return annotationHeader() throws RecognitionException {
        CMTJavaParser.annotationHeader_return retval = new CMTJavaParser.annotationHeader_return();
        retval.start = input.LT(1);
        int annotationHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }
            // CMTJava.g:1137:5: ( modifiers '@' 'interface' IDENTIFIER )
            // CMTJava.g:1137:9: modifiers '@' 'interface' IDENTIFIER
            {
            pushFollow(FOLLOW_modifiers_in_annotationHeader8705);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_annotationHeader8707); if (state.failed) return retval;
            match(input,INTERFACE,FOLLOW_INTERFACE_in_annotationHeader8709); if (state.failed) return retval;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_annotationHeader8711); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 115, annotationHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationHeader"

    public static class typeHeader_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "typeHeader"
    // CMTJava.g:1140:1: typeHeader : modifiers ( 'class' | 'enum' | ( ( '@' )? 'interface' ) ) IDENTIFIER ;
    public final CMTJavaParser.typeHeader_return typeHeader() throws RecognitionException {
        CMTJavaParser.typeHeader_return retval = new CMTJavaParser.typeHeader_return();
        retval.start = input.LT(1);
        int typeHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }
            // CMTJava.g:1141:5: ( modifiers ( 'class' | 'enum' | ( ( '@' )? 'interface' ) ) IDENTIFIER )
            // CMTJava.g:1141:9: modifiers ( 'class' | 'enum' | ( ( '@' )? 'interface' ) ) IDENTIFIER
            {
            pushFollow(FOLLOW_modifiers_in_typeHeader8731);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:1141:19: ( 'class' | 'enum' | ( ( '@' )? 'interface' ) )
            int alt176=3;
            switch ( input.LA(1) ) {
            case CLASS:
                {
                alt176=1;
                }
                break;
            case ENUM:
                {
                alt176=2;
                }
                break;
            case INTERFACE:
            case MONKEYS_AT:
                {
                alt176=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 176, 0, input);

                throw nvae;
            }

            switch (alt176) {
                case 1 :
                    // CMTJava.g:1141:20: 'class'
                    {
                    match(input,CLASS,FOLLOW_CLASS_in_typeHeader8734); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:1141:28: 'enum'
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_typeHeader8736); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // CMTJava.g:1141:35: ( ( '@' )? 'interface' )
                    {
                    // CMTJava.g:1141:35: ( ( '@' )? 'interface' )
                    // CMTJava.g:1141:36: ( '@' )? 'interface'
                    {
                    // CMTJava.g:1141:36: ( '@' )?
                    int alt175=2;
                    int LA175_0 = input.LA(1);

                    if ( (LA175_0==MONKEYS_AT) ) {
                        alt175=1;
                    }
                    switch (alt175) {
                        case 1 :
                            // CMTJava.g:0:0: '@'
                            {
                            match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_typeHeader8739); if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,INTERFACE,FOLLOW_INTERFACE_in_typeHeader8743); if (state.failed) return retval;

                    }


                    }
                    break;

            }

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeHeader8747); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 116, typeHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeHeader"

    public static class methodHeader_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "methodHeader"
    // CMTJava.g:1144:1: methodHeader : modifiers ( typeParameters )? ( type | 'void' )? IDENTIFIER '(' ;
    public final CMTJavaParser.methodHeader_return methodHeader() throws RecognitionException {
        CMTJavaParser.methodHeader_return retval = new CMTJavaParser.methodHeader_return();
        retval.start = input.LT(1);
        int methodHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }
            // CMTJava.g:1145:5: ( modifiers ( typeParameters )? ( type | 'void' )? IDENTIFIER '(' )
            // CMTJava.g:1145:9: modifiers ( typeParameters )? ( type | 'void' )? IDENTIFIER '('
            {
            pushFollow(FOLLOW_modifiers_in_methodHeader8767);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            // CMTJava.g:1145:19: ( typeParameters )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==LT) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // CMTJava.g:0:0: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_methodHeader8769);
                    typeParameters();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // CMTJava.g:1145:35: ( type | 'void' )?
            int alt178=3;
            switch ( input.LA(1) ) {
                case IDENTIFIER:
                    {
                    int LA178_1 = input.LA(2);

                    if ( (LA178_1==IDENTIFIER||LA178_1==LBRACKET||LA178_1==DOT||LA178_1==LT) ) {
                        alt178=1;
                    }
                    }
                    break;
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case SHORT:
                    {
                    alt178=1;
                    }
                    break;
                case VOID:
                    {
                    alt178=2;
                    }
                    break;
            }

            switch (alt178) {
                case 1 :
                    // CMTJava.g:1145:36: type
                    {
                    pushFollow(FOLLOW_type_in_methodHeader8773);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // CMTJava.g:1145:41: 'void'
                    {
                    match(input,VOID,FOLLOW_VOID_in_methodHeader8775); if (state.failed) return retval;

                    }
                    break;

            }

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodHeader8779); if (state.failed) return retval;
            match(input,LPAREN,FOLLOW_LPAREN_in_methodHeader8781); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 117, methodHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodHeader"

    public static class fieldHeader_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "fieldHeader"
    // CMTJava.g:1148:1: fieldHeader : modifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' ) ;
    public final CMTJavaParser.fieldHeader_return fieldHeader() throws RecognitionException {
        CMTJavaParser.fieldHeader_return retval = new CMTJavaParser.fieldHeader_return();
        retval.start = input.LT(1);
        int fieldHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }
            // CMTJava.g:1149:5: ( modifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' ) )
            // CMTJava.g:1149:9: modifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' )
            {
            pushFollow(FOLLOW_modifiers_in_fieldHeader8801);
            modifiers();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_fieldHeader8803);
            type();

            state._fsp--;
            if (state.failed) return retval;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fieldHeader8805); if (state.failed) return retval;
            // CMTJava.g:1149:35: ( '[' ']' )*
            loop179:
            do {
                int alt179=2;
                int LA179_0 = input.LA(1);

                if ( (LA179_0==LBRACKET) ) {
                    alt179=1;
                }


                switch (alt179) {
            	case 1 :
            	    // CMTJava.g:1149:36: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_fieldHeader8808); if (state.failed) return retval;
            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_fieldHeader8809); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop179;
                }
            } while (true);

            if ( (input.LA(1)>=SEMI && input.LA(1)<=COMMA)||input.LA(1)==EQ ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 118, fieldHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldHeader"

    public static class localVariableHeader_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "localVariableHeader"
    // CMTJava.g:1152:1: localVariableHeader : variableModifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' ) ;
    public final CMTJavaParser.localVariableHeader_return localVariableHeader() throws RecognitionException {
        CMTJavaParser.localVariableHeader_return retval = new CMTJavaParser.localVariableHeader_return();
        retval.start = input.LT(1);
        int localVariableHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }
            // CMTJava.g:1153:5: ( variableModifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' ) )
            // CMTJava.g:1153:9: variableModifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' )
            {
            pushFollow(FOLLOW_variableModifiers_in_localVariableHeader8839);
            variableModifiers();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_localVariableHeader8841);
            type();

            state._fsp--;
            if (state.failed) return retval;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableHeader8843); if (state.failed) return retval;
            // CMTJava.g:1153:43: ( '[' ']' )*
            loop180:
            do {
                int alt180=2;
                int LA180_0 = input.LA(1);

                if ( (LA180_0==LBRACKET) ) {
                    alt180=1;
                }


                switch (alt180) {
            	case 1 :
            	    // CMTJava.g:1153:44: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_localVariableHeader8846); if (state.failed) return retval;
            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_localVariableHeader8847); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop180;
                }
            } while (true);

            if ( (input.LA(1)>=SEMI && input.LA(1)<=COMMA)||input.LA(1)==EQ ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 119, localVariableHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localVariableHeader"

    // $ANTLR start synpred2_CMTJava
    public final void synpred2_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:56:13: ( ( annotations )? packageDeclaration )
        // CMTJava.g:56:13: ( annotations )? packageDeclaration
        {
        // CMTJava.g:56:13: ( annotations )?
        int alt181=2;
        int LA181_0 = input.LA(1);

        if ( (LA181_0==MONKEYS_AT) ) {
            alt181=1;
        }
        switch (alt181) {
            case 1 :
                // CMTJava.g:56:14: annotations
                {
                pushFollow(FOLLOW_annotations_in_synpred2_CMTJava78);
                annotations();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_packageDeclaration_in_synpred2_CMTJava107);
        packageDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_CMTJava

    // $ANTLR start synpred12_CMTJava
    public final void synpred12_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:100:9: ( classDeclaration )
        // CMTJava.g:100:9: classDeclaration
        {
        pushFollow(FOLLOW_classDeclaration_in_synpred12_CMTJava464);
        classDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_CMTJava

    // $ANTLR start synpred27_CMTJava
    public final void synpred27_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:131:7: ( tObjectDeclaration )
        // CMTJava.g:131:7: tObjectDeclaration
        {
        pushFollow(FOLLOW_tObjectDeclaration_in_synpred27_CMTJava699);
        tObjectDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_CMTJava

    // $ANTLR start synpred28_CMTJava
    public final void synpred28_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:132:4: ( normalClassDeclaration )
        // CMTJava.g:132:4: normalClassDeclaration
        {
        pushFollow(FOLLOW_normalClassDeclaration_in_synpred28_CMTJava707);
        normalClassDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_CMTJava

    // $ANTLR start synpred32_CMTJava
    public final void synpred32_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:143:4: ( tObjectFieldDeclaration )
        // CMTJava.g:143:4: tObjectFieldDeclaration
        {
        pushFollow(FOLLOW_tObjectFieldDeclaration_in_synpred32_CMTJava801);
        tObjectFieldDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_CMTJava

    // $ANTLR start synpred33_CMTJava
    public final void synpred33_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:145:3: ( constructorDeclaration )
        // CMTJava.g:145:3: constructorDeclaration
        {
        pushFollow(FOLLOW_constructorDeclaration_in_synpred33_CMTJava809);
        constructorDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_CMTJava

    // $ANTLR start synpred34_CMTJava
    public final void synpred34_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:160:10: ( explicitConstructorInvocation )
        // CMTJava.g:160:10: explicitConstructorInvocation
        {
        pushFollow(FOLLOW_explicitConstructorInvocation_in_synpred34_CMTJava923);
        explicitConstructorInvocation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_CMTJava

    // $ANTLR start synpred51_CMTJava
    public final void synpred51_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:251:9: ( normalInterfaceDeclaration )
        // CMTJava.g:251:9: normalInterfaceDeclaration
        {
        pushFollow(FOLLOW_normalInterfaceDeclaration_in_synpred51_CMTJava1620);
        normalInterfaceDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_CMTJava

    // $ANTLR start synpred60_CMTJava
    public final void synpred60_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:292:10: ( fieldDeclaration )
        // CMTJava.g:292:10: fieldDeclaration
        {
        pushFollow(FOLLOW_fieldDeclaration_in_synpred60_CMTJava1941);
        fieldDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_CMTJava

    // $ANTLR start synpred61_CMTJava
    public final void synpred61_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:293:10: ( methodDeclaration )
        // CMTJava.g:293:10: methodDeclaration
        {
        pushFollow(FOLLOW_methodDeclaration_in_synpred61_CMTJava1952);
        methodDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_CMTJava

    // $ANTLR start synpred62_CMTJava
    public final void synpred62_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:294:10: ( classDeclaration )
        // CMTJava.g:294:10: classDeclaration
        {
        pushFollow(FOLLOW_classDeclaration_in_synpred62_CMTJava1963);
        classDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_CMTJava

    // $ANTLR start synpred65_CMTJava
    public final void synpred65_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:310:10: ( explicitConstructorInvocation )
        // CMTJava.g:310:10: explicitConstructorInvocation
        {
        pushFollow(FOLLOW_explicitConstructorInvocation_in_synpred65_CMTJava2100);
        explicitConstructorInvocation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_CMTJava

    // $ANTLR start synpred67_CMTJava
    public final void synpred67_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:302:10: ( modifiers ( typeParameters )? IDENTIFIER formalParameters ( 'throws' qualifiedNameList )? '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' )
        // CMTJava.g:302:10: modifiers ( typeParameters )? IDENTIFIER formalParameters ( 'throws' qualifiedNameList )? '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
        {
        pushFollow(FOLLOW_modifiers_in_synpred67_CMTJava2012);
        modifiers();

        state._fsp--;
        if (state.failed) return ;
        // CMTJava.g:303:9: ( typeParameters )?
        int alt184=2;
        int LA184_0 = input.LA(1);

        if ( (LA184_0==LT) ) {
            alt184=1;
        }
        switch (alt184) {
            case 1 :
                // CMTJava.g:303:10: typeParameters
                {
                pushFollow(FOLLOW_typeParameters_in_synpred67_CMTJava2023);
                typeParameters();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred67_CMTJava2044); if (state.failed) return ;
        pushFollow(FOLLOW_formalParameters_in_synpred67_CMTJava2054);
        formalParameters();

        state._fsp--;
        if (state.failed) return ;
        // CMTJava.g:307:9: ( 'throws' qualifiedNameList )?
        int alt185=2;
        int LA185_0 = input.LA(1);

        if ( (LA185_0==THROWS) ) {
            alt185=1;
        }
        switch (alt185) {
            case 1 :
                // CMTJava.g:307:10: 'throws' qualifiedNameList
                {
                match(input,THROWS,FOLLOW_THROWS_in_synpred67_CMTJava2065); if (state.failed) return ;
                pushFollow(FOLLOW_qualifiedNameList_in_synpred67_CMTJava2067);
                qualifiedNameList();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,LBRACE,FOLLOW_LBRACE_in_synpred67_CMTJava2088); if (state.failed) return ;
        // CMTJava.g:310:9: ( explicitConstructorInvocation )?
        int alt186=2;
        alt186 = dfa186.predict(input);
        switch (alt186) {
            case 1 :
                // CMTJava.g:310:10: explicitConstructorInvocation
                {
                pushFollow(FOLLOW_explicitConstructorInvocation_in_synpred67_CMTJava2100);
                explicitConstructorInvocation();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // CMTJava.g:312:9: ( blockStatement )*
        loop187:
        do {
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( ((LA187_0>=IDENTIFIER && LA187_0<=NULL)||(LA187_0>=ABSTRACT && LA187_0<=BYTE)||(LA187_0>=CHAR && LA187_0<=CLASS)||LA187_0==CONTINUE||(LA187_0>=DO && LA187_0<=DOUBLE)||LA187_0==ENUM||LA187_0==FINAL||(LA187_0>=FLOAT && LA187_0<=FOR)||LA187_0==IF||(LA187_0>=INT && LA187_0<=NEW)||(LA187_0>=PRIVATE && LA187_0<=THROW)||(LA187_0>=TRANSIENT && LA187_0<=LPAREN)||LA187_0==LBRACE||LA187_0==SEMI||(LA187_0>=BANG && LA187_0<=TILDE)||(LA187_0>=PLUSPLUS && LA187_0<=SUB)||LA187_0==MONKEYS_AT||LA187_0==LT) ) {
                alt187=1;
            }


            switch (alt187) {
        	case 1 :
        	    // CMTJava.g:312:10: blockStatement
        	    {
        	    pushFollow(FOLLOW_blockStatement_in_synpred67_CMTJava2122);
        	    blockStatement();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop187;
            }
        } while (true);

        match(input,RBRACE,FOLLOW_RBRACE_in_synpred67_CMTJava2143); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_CMTJava

    // $ANTLR start synpred76_CMTJava
    public final void synpred76_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:358:9: ( interfaceFieldDeclaration )
        // CMTJava.g:358:9: interfaceFieldDeclaration
        {
        pushFollow(FOLLOW_interfaceFieldDeclaration_in_synpred76_CMTJava2530);
        interfaceFieldDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_CMTJava

    // $ANTLR start synpred77_CMTJava
    public final void synpred77_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:359:9: ( interfaceMethodDeclaration )
        // CMTJava.g:359:9: interfaceMethodDeclaration
        {
        pushFollow(FOLLOW_interfaceMethodDeclaration_in_synpred77_CMTJava2540);
        interfaceMethodDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_CMTJava

    // $ANTLR start synpred78_CMTJava
    public final void synpred78_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:360:9: ( interfaceDeclaration )
        // CMTJava.g:360:9: interfaceDeclaration
        {
        pushFollow(FOLLOW_interfaceDeclaration_in_synpred78_CMTJava2550);
        interfaceDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred78_CMTJava

    // $ANTLR start synpred79_CMTJava
    public final void synpred79_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:361:9: ( classDeclaration )
        // CMTJava.g:361:9: classDeclaration
        {
        pushFollow(FOLLOW_classDeclaration_in_synpred79_CMTJava2560);
        classDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred79_CMTJava

    // $ANTLR start synpred104_CMTJava
    public final void synpred104_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:456:9: ( ellipsisParameterDecl )
        // CMTJava.g:456:9: ellipsisParameterDecl
        {
        pushFollow(FOLLOW_ellipsisParameterDecl_in_synpred104_CMTJava3325);
        ellipsisParameterDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_CMTJava

    // $ANTLR start synpred106_CMTJava
    public final void synpred106_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:457:9: ( normalParameterDecl ( ',' normalParameterDecl )* )
        // CMTJava.g:457:9: normalParameterDecl ( ',' normalParameterDecl )*
        {
        pushFollow(FOLLOW_normalParameterDecl_in_synpred106_CMTJava3335);
        normalParameterDecl();

        state._fsp--;
        if (state.failed) return ;
        // CMTJava.g:458:9: ( ',' normalParameterDecl )*
        loop190:
        do {
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( (LA190_0==COMMA) ) {
                alt190=1;
            }


            switch (alt190) {
        	case 1 :
        	    // CMTJava.g:458:10: ',' normalParameterDecl
        	    {
        	    match(input,COMMA,FOLLOW_COMMA_in_synpred106_CMTJava3346); if (state.failed) return ;
        	    pushFollow(FOLLOW_normalParameterDecl_in_synpred106_CMTJava3348);
        	    normalParameterDecl();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop190;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred106_CMTJava

    // $ANTLR start synpred107_CMTJava
    public final void synpred107_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:460:10: ( normalParameterDecl ',' )
        // CMTJava.g:460:10: normalParameterDecl ','
        {
        pushFollow(FOLLOW_normalParameterDecl_in_synpred107_CMTJava3370);
        normalParameterDecl();

        state._fsp--;
        if (state.failed) return ;
        match(input,COMMA,FOLLOW_COMMA_in_synpred107_CMTJava3380); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred107_CMTJava

    // $ANTLR start synpred111_CMTJava
    public final void synpred111_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:480:9: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' )
        // CMTJava.g:480:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
        {
        // CMTJava.g:480:9: ( nonWildcardTypeArguments )?
        int alt191=2;
        int LA191_0 = input.LA(1);

        if ( (LA191_0==LT) ) {
            alt191=1;
        }
        switch (alt191) {
            case 1 :
                // CMTJava.g:480:10: nonWildcardTypeArguments
                {
                pushFollow(FOLLOW_nonWildcardTypeArguments_in_synpred111_CMTJava3515);
                nonWildcardTypeArguments();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        if ( input.LA(1)==SUPER||input.LA(1)==THIS ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_arguments_in_synpred111_CMTJava3573);
        arguments();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred111_CMTJava3575); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred111_CMTJava

    // $ANTLR start synpred125_CMTJava
    public final void synpred125_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:567:9: ( annotationMethodDeclaration )
        // CMTJava.g:567:9: annotationMethodDeclaration
        {
        pushFollow(FOLLOW_annotationMethodDeclaration_in_synpred125_CMTJava4174);
        annotationMethodDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_CMTJava

    // $ANTLR start synpred126_CMTJava
    public final void synpred126_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:568:9: ( interfaceFieldDeclaration )
        // CMTJava.g:568:9: interfaceFieldDeclaration
        {
        pushFollow(FOLLOW_interfaceFieldDeclaration_in_synpred126_CMTJava4184);
        interfaceFieldDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred126_CMTJava

    // $ANTLR start synpred127_CMTJava
    public final void synpred127_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:569:9: ( normalClassDeclaration )
        // CMTJava.g:569:9: normalClassDeclaration
        {
        pushFollow(FOLLOW_normalClassDeclaration_in_synpred127_CMTJava4194);
        normalClassDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred127_CMTJava

    // $ANTLR start synpred128_CMTJava
    public final void synpred128_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:570:9: ( normalInterfaceDeclaration )
        // CMTJava.g:570:9: normalInterfaceDeclaration
        {
        pushFollow(FOLLOW_normalInterfaceDeclaration_in_synpred128_CMTJava4204);
        normalInterfaceDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred128_CMTJava

    // $ANTLR start synpred129_CMTJava
    public final void synpred129_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:571:9: ( enumDeclaration )
        // CMTJava.g:571:9: enumDeclaration
        {
        pushFollow(FOLLOW_enumDeclaration_in_synpred129_CMTJava4214);
        enumDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred129_CMTJava

    // $ANTLR start synpred130_CMTJava
    public final void synpred130_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:572:9: ( annotationTypeDeclaration )
        // CMTJava.g:572:9: annotationTypeDeclaration
        {
        pushFollow(FOLLOW_annotationTypeDeclaration_in_synpred130_CMTJava4224);
        annotationTypeDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred130_CMTJava

    // $ANTLR start synpred133_CMTJava
    public final void synpred133_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:591:9: ( localVariableDeclarationStatement )
        // CMTJava.g:591:9: localVariableDeclarationStatement
        {
        pushFollow(FOLLOW_localVariableDeclarationStatement_in_synpred133_CMTJava4380);
        localVariableDeclarationStatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred133_CMTJava

    // $ANTLR start synpred134_CMTJava
    public final void synpred134_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:592:9: ( classOrInterfaceDeclaration )
        // CMTJava.g:592:9: classOrInterfaceDeclaration
        {
        pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred134_CMTJava4390);
        classOrInterfaceDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred134_CMTJava

    // $ANTLR start synpred138_CMTJava
    public final void synpred138_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:612:9: ( ( 'assert' ) expression ( ':' expression )? ';' )
        // CMTJava.g:612:9: ( 'assert' ) expression ( ':' expression )? ';'
        {
        // CMTJava.g:612:9: ( 'assert' )
        // CMTJava.g:612:10: 'assert'
        {
        match(input,ASSERT,FOLLOW_ASSERT_in_synpred138_CMTJava4531); if (state.failed) return ;

        }

        pushFollow(FOLLOW_expression_in_synpred138_CMTJava4551);
        expression();

        state._fsp--;
        if (state.failed) return ;
        // CMTJava.g:614:20: ( ':' expression )?
        int alt194=2;
        int LA194_0 = input.LA(1);

        if ( (LA194_0==COLON) ) {
            alt194=1;
        }
        switch (alt194) {
            case 1 :
                // CMTJava.g:614:21: ':' expression
                {
                match(input,COLON,FOLLOW_COLON_in_synpred138_CMTJava4554); if (state.failed) return ;
                pushFollow(FOLLOW_expression_in_synpred138_CMTJava4556);
                expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,SEMI,FOLLOW_SEMI_in_synpred138_CMTJava4560); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred138_CMTJava

    // $ANTLR start synpred140_CMTJava
    public final void synpred140_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:615:9: ( 'assert' expression ( ':' expression )? ';' )
        // CMTJava.g:615:9: 'assert' expression ( ':' expression )? ';'
        {
        match(input,ASSERT,FOLLOW_ASSERT_in_synpred140_CMTJava4570); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred140_CMTJava4573);
        expression();

        state._fsp--;
        if (state.failed) return ;
        // CMTJava.g:615:30: ( ':' expression )?
        int alt195=2;
        int LA195_0 = input.LA(1);

        if ( (LA195_0==COLON) ) {
            alt195=1;
        }
        switch (alt195) {
            case 1 :
                // CMTJava.g:615:31: ':' expression
                {
                match(input,COLON,FOLLOW_COLON_in_synpred140_CMTJava4576); if (state.failed) return ;
                pushFollow(FOLLOW_expression_in_synpred140_CMTJava4578);
                expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,SEMI,FOLLOW_SEMI_in_synpred140_CMTJava4582); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred140_CMTJava

    // $ANTLR start synpred141_CMTJava
    public final void synpred141_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:616:39: ( 'else' statement )
        // CMTJava.g:616:39: 'else' statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred141_CMTJava4611); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred141_CMTJava4613);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred141_CMTJava

    // $ANTLR start synpred156_CMTJava
    public final void synpred156_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:631:9: ( expression ';' )
        // CMTJava.g:631:9: expression ';'
        {
        pushFollow(FOLLOW_expression_in_synpred156_CMTJava4835);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred156_CMTJava4838); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred156_CMTJava

    // $ANTLR start synpred157_CMTJava
    public final void synpred157_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:632:9: ( IDENTIFIER ':' statement )
        // CMTJava.g:632:9: IDENTIFIER ':' statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred157_CMTJava4853); if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred157_CMTJava4855); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred157_CMTJava4857);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred157_CMTJava

    // $ANTLR start synpred161_CMTJava
    public final void synpred161_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:656:13: ( catches 'finally' block )
        // CMTJava.g:656:13: catches 'finally' block
        {
        pushFollow(FOLLOW_catches_in_synpred161_CMTJava5013);
        catches();

        state._fsp--;
        if (state.failed) return ;
        match(input,FINALLY,FOLLOW_FINALLY_in_synpred161_CMTJava5015); if (state.failed) return ;
        pushFollow(FOLLOW_block_in_synpred161_CMTJava5017);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred161_CMTJava

    // $ANTLR start synpred162_CMTJava
    public final void synpred162_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:657:13: ( catches )
        // CMTJava.g:657:13: catches
        {
        pushFollow(FOLLOW_catches_in_synpred162_CMTJava5031);
        catches();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred162_CMTJava

    // $ANTLR start synpred165_CMTJava
    public final void synpred165_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:682:9: ( 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' statement )
        // CMTJava.g:682:9: 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' statement
        {
        match(input,FOR,FOLLOW_FOR_in_synpred165_CMTJava5223); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred165_CMTJava5225); if (state.failed) return ;
        pushFollow(FOLLOW_variableModifiers_in_synpred165_CMTJava5227);
        variableModifiers();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred165_CMTJava5229);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred165_CMTJava5231); if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred165_CMTJava5233); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred165_CMTJava5244);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred165_CMTJava5246); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred165_CMTJava5248);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred165_CMTJava

    // $ANTLR start synpred169_CMTJava
    public final void synpred169_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:696:9: ( localVariableDeclaration )
        // CMTJava.g:696:9: localVariableDeclaration
        {
        pushFollow(FOLLOW_localVariableDeclaration_in_synpred169_CMTJava5427);
        localVariableDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred169_CMTJava

    // $ANTLR start synpred210_CMTJava
    public final void synpred210_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:850:9: ( castExpression )
        // CMTJava.g:850:9: castExpression
        {
        pushFollow(FOLLOW_castExpression_in_synpred210_CMTJava6672);
        castExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred210_CMTJava

    // $ANTLR start synpred214_CMTJava
    public final void synpred214_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:860:9: ( '(' primitiveType ')' unaryExpression )
        // CMTJava.g:860:9: '(' primitiveType ')' unaryExpression
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred214_CMTJava6763); if (state.failed) return ;
        pushFollow(FOLLOW_primitiveType_in_synpred214_CMTJava6765);
        primitiveType();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred214_CMTJava6767); if (state.failed) return ;
        pushFollow(FOLLOW_unaryExpression_in_synpred214_CMTJava6769);
        unaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred214_CMTJava

    // $ANTLR start synpred216_CMTJava
    public final void synpred216_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:870:10: ( '.' IDENTIFIER )
        // CMTJava.g:870:10: '.' IDENTIFIER
        {
        match(input,DOT,FOLLOW_DOT_in_synpred216_CMTJava6840); if (state.failed) return ;
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred216_CMTJava6842); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred216_CMTJava

    // $ANTLR start synpred217_CMTJava
    public final void synpred217_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:872:10: ( identifierSuffix )
        // CMTJava.g:872:10: identifierSuffix
        {
        pushFollow(FOLLOW_identifierSuffix_in_synpred217_CMTJava6864);
        identifierSuffix();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred217_CMTJava

    // $ANTLR start synpred219_CMTJava
    public final void synpred219_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:875:10: ( '.' IDENTIFIER )
        // CMTJava.g:875:10: '.' IDENTIFIER
        {
        match(input,DOT,FOLLOW_DOT_in_synpred219_CMTJava6896); if (state.failed) return ;
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred219_CMTJava6898); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred219_CMTJava

    // $ANTLR start synpred220_CMTJava
    public final void synpred220_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:877:10: ( identifierSuffix )
        // CMTJava.g:877:10: identifierSuffix
        {
        pushFollow(FOLLOW_identifierSuffix_in_synpred220_CMTJava6920);
        identifierSuffix();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred220_CMTJava

    // $ANTLR start synpred232_CMTJava
    public final void synpred232_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:905:10: ( '[' expression ']' )
        // CMTJava.g:905:10: '[' expression ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred232_CMTJava7171); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred232_CMTJava7173);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred232_CMTJava7175); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred232_CMTJava

    // $ANTLR start synpred244_CMTJava
    public final void synpred244_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:929:3: ( 'new' stmdoBlock )
        // CMTJava.g:929:3: 'new' stmdoBlock
        {
        match(input,NEW,FOLLOW_NEW_in_synpred244_CMTJava7384); if (state.failed) return ;
        pushFollow(FOLLOW_stmdoBlock_in_synpred244_CMTJava7386);
        stmdoBlock();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred244_CMTJava

    // $ANTLR start synpred245_CMTJava
    public final void synpred245_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:931:7: ( 'new' nonWildcardTypeArguments classOrInterfaceType classCreatorRest )
        // CMTJava.g:931:7: 'new' nonWildcardTypeArguments classOrInterfaceType classCreatorRest
        {
        match(input,NEW,FOLLOW_NEW_in_synpred245_CMTJava7406); if (state.failed) return ;
        pushFollow(FOLLOW_nonWildcardTypeArguments_in_synpred245_CMTJava7408);
        nonWildcardTypeArguments();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_classOrInterfaceType_in_synpred245_CMTJava7410);
        classOrInterfaceType();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_classCreatorRest_in_synpred245_CMTJava7412);
        classCreatorRest();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred245_CMTJava

    // $ANTLR start synpred246_CMTJava
    public final void synpred246_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:932:9: ( 'new' classOrInterfaceType classCreatorRest )
        // CMTJava.g:932:9: 'new' classOrInterfaceType classCreatorRest
        {
        match(input,NEW,FOLLOW_NEW_in_synpred246_CMTJava7422); if (state.failed) return ;
        pushFollow(FOLLOW_classOrInterfaceType_in_synpred246_CMTJava7424);
        classOrInterfaceType();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_classCreatorRest_in_synpred246_CMTJava7426);
        classCreatorRest();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred246_CMTJava

    // $ANTLR start synpred248_CMTJava
    public final void synpred248_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:963:3: ( ( stmAssignment ) )
        // CMTJava.g:963:3: ( stmAssignment )
        {
        // CMTJava.g:963:3: ( stmAssignment )
        // CMTJava.g:964:3: stmAssignment
        {
        pushFollow(FOLLOW_stmAssignment_in_synpred248_CMTJava7542);
        stmAssignment();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred248_CMTJava

    // $ANTLR start synpred249_CMTJava
    public final void synpred249_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:968:4: ( stmExpression ';' )
        // CMTJava.g:968:5: stmExpression ';'
        {
        pushFollow(FOLLOW_stmExpression_in_synpred249_CMTJava7559);
        stmExpression();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred249_CMTJava7561); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred249_CMTJava

    // $ANTLR start synpred250_CMTJava
    public final void synpred250_CMTJava_fragment() throws RecognitionException {   
        CMTJavaParser.stmExpression_return e2 = null;


        // CMTJava.g:973:5: (e2= stmExpression )
        // CMTJava.g:973:5: e2= stmExpression
        {
        pushFollow(FOLLOW_stmExpression_in_synpred250_CMTJava7587);
        e2=stmExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred250_CMTJava

    // $ANTLR start synpred251_CMTJava
    public final void synpred251_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:977:3: ( stmIf '}' )
        // CMTJava.g:977:4: stmIf '}'
        {
        pushFollow(FOLLOW_stmIf_in_synpred251_CMTJava7600);
        stmIf();

        state._fsp--;
        if (state.failed) return ;
        match(input,RBRACE,FOLLOW_RBRACE_in_synpred251_CMTJava7602); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred251_CMTJava

    // $ANTLR start synpred260_CMTJava
    public final void synpred260_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:1043:9: ( 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer )
        // CMTJava.g:1043:9: 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer
        {
        match(input,NEW,FOLLOW_NEW_in_synpred260_CMTJava7964); if (state.failed) return ;
        pushFollow(FOLLOW_createdName_in_synpred260_CMTJava7966);
        createdName();

        state._fsp--;
        if (state.failed) return ;
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred260_CMTJava7976); if (state.failed) return ;
        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred260_CMTJava7978); if (state.failed) return ;
        // CMTJava.g:1045:9: ( '[' ']' )*
        loop210:
        do {
            int alt210=2;
            int LA210_0 = input.LA(1);

            if ( (LA210_0==LBRACKET) ) {
                alt210=1;
            }


            switch (alt210) {
        	case 1 :
        	    // CMTJava.g:1045:10: '[' ']'
        	    {
        	    match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred260_CMTJava7989); if (state.failed) return ;
        	    match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred260_CMTJava7991); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop210;
            }
        } while (true);

        pushFollow(FOLLOW_arrayInitializer_in_synpred260_CMTJava8012);
        arrayInitializer();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred260_CMTJava

    // $ANTLR start synpred261_CMTJava
    public final void synpred261_CMTJava_fragment() throws RecognitionException {   
        // CMTJava.g:1052:13: ( '[' expression ']' )
        // CMTJava.g:1052:13: '[' expression ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred261_CMTJava8061); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred261_CMTJava8063);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred261_CMTJava8077); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred261_CMTJava

    // Delegated rules

    public final boolean synpred216_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred216_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred261_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred261_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred248_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred248_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred126_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred126_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred214_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred214_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred141_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred141_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred111_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred111_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred169_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred169_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred107_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred107_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred156_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred156_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred246_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred246_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred165_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred165_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred244_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred244_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred162_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred162_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred210_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred210_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred133_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred128_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred128_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred251_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred251_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred219_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred219_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred220_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred220_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred217_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred217_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred245_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred245_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred140_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred140_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred157_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred157_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred232_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred232_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred104_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred260_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred260_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred134_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred134_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred129_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred129_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred250_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred250_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred127_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred127_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred161_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred161_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred130_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred130_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred249_CMTJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred249_CMTJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA93 dfa93 = new DFA93(this);
    protected DFA96 dfa96 = new DFA96(this);
    protected DFA104 dfa104 = new DFA104(this);
    protected DFA115 dfa115 = new DFA115(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA136 dfa136 = new DFA136(this);
    protected DFA139 dfa139 = new DFA139(this);
    protected DFA141 dfa141 = new DFA141(this);
    protected DFA149 dfa149 = new DFA149(this);
    protected DFA148 dfa148 = new DFA148(this);
    protected DFA163 dfa163 = new DFA163(this);
    protected DFA186 dfa186 = new DFA186(this);
    static final String DFA2_eotS =
        "\24\uffff";
    static final String DFA2_eofS =
        "\1\3\23\uffff";
    static final String DFA2_minS =
        "\1\32\1\0\22\uffff";
    static final String DFA2_maxS =
        "\1\160\1\0\22\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\1\2\20\uffff";
    static final String DFA2_specialS =
        "\1\uffff\1\0\22\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\3\7\uffff\1\3\6\uffff\1\3\1\uffff\1\3\6\uffff\1\3\2\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\2\3\3\2\uffff\2\3\2\uffff\1\3\3\uffff"+
            "\1\3\2\uffff\1\3\7\uffff\1\3\35\uffff\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "56:9: ( ( annotations )? packageDeclaration )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_CMTJava()) ) {s = 2;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA12_eotS =
        "\20\uffff";
    static final String DFA12_eofS =
        "\20\uffff";
    static final String DFA12_minS =
        "\1\32\14\0\3\uffff";
    static final String DFA12_maxS =
        "\1\160\14\0\3\uffff";
    static final String DFA12_acceptS =
        "\15\uffff\1\1\1\uffff\1\2";
    static final String DFA12_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\3\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\6\7\uffff\1\15\6\uffff\1\15\1\uffff\1\7\11\uffff\1\17\1\uffff"+
            "\1\10\2\uffff\1\4\1\3\1\2\2\uffff\1\5\1\14\2\uffff\1\11\3\uffff"+
            "\1\12\2\uffff\1\13\45\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "99:1: classOrInterfaceDeclaration : ( classDeclaration | interfaceDeclaration );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_10 = input.LA(1);

                         
                        int index12_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index12_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_11 = input.LA(1);

                         
                        int index12_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index12_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_12 = input.LA(1);

                         
                        int index12_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index12_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA13_eotS =
        "\17\uffff";
    static final String DFA13_eofS =
        "\17\uffff";
    static final String DFA13_minS =
        "\1\4\1\uffff\1\4\14\uffff";
    static final String DFA13_maxS =
        "\1\163\1\uffff\1\65\14\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\15\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\1\14\1\1";
    static final String DFA13_specialS =
        "\17\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\25\uffff\1\7\1\uffff\1\1\1\uffff\1\1\2\uffff\2\1\4\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\1\10\1\uffff\1\1\6\uffff\3\1\1\11\2"+
            "\uffff\1\5\1\4\1\3\1\uffff\1\1\1\6\1\15\2\uffff\1\12\3\uffff"+
            "\1\13\1\uffff\1\1\1\14\45\uffff\1\2\2\uffff\1\1",
            "",
            "\1\16\60\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()* loopback of 107:5: ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )*";
        }
    }
    static final String DFA15_eotS =
        "\21\uffff";
    static final String DFA15_eofS =
        "\21\uffff";
    static final String DFA15_minS =
        "\1\32\15\0\3\uffff";
    static final String DFA15_maxS =
        "\1\160\15\0\3\uffff";
    static final String DFA15_acceptS =
        "\16\uffff\1\3\1\1\1\2";
    static final String DFA15_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\3\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\6\7\uffff\1\15\6\uffff\1\16\1\uffff\1\7\13\uffff\1\10\2\uffff"+
            "\1\4\1\3\1\2\2\uffff\1\5\1\14\2\uffff\1\11\3\uffff\1\12\2\uffff"+
            "\1\13\45\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "130:1: classDeclaration : ( tObjectDeclaration | normalClassDeclaration | enumDeclaration );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_CMTJava()) ) {s = 15;}

                        else if ( (synpred28_CMTJava()) ) {s = 16;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_CMTJava()) ) {s = 15;}

                        else if ( (synpred28_CMTJava()) ) {s = 16;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_CMTJava()) ) {s = 15;}

                        else if ( (synpred28_CMTJava()) ) {s = 16;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_CMTJava()) ) {s = 15;}

                        else if ( (synpred28_CMTJava()) ) {s = 16;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_CMTJava()) ) {s = 15;}

                        else if ( (synpred28_CMTJava()) ) {s = 16;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_CMTJava()) ) {s = 15;}

                        else if ( (synpred28_CMTJava()) ) {s = 16;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_CMTJava()) ) {s = 15;}

                        else if ( (synpred28_CMTJava()) ) {s = 16;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_8 = input.LA(1);

                         
                        int index15_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_CMTJava()) ) {s = 15;}

                        else if ( (synpred28_CMTJava()) ) {s = 16;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_9 = input.LA(1);

                         
                        int index15_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_CMTJava()) ) {s = 15;}

                        else if ( (synpred28_CMTJava()) ) {s = 16;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA15_10 = input.LA(1);

                         
                        int index15_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_CMTJava()) ) {s = 15;}

                        else if ( (synpred28_CMTJava()) ) {s = 16;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA15_11 = input.LA(1);

                         
                        int index15_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_CMTJava()) ) {s = 15;}

                        else if ( (synpred28_CMTJava()) ) {s = 16;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA15_12 = input.LA(1);

                         
                        int index15_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_CMTJava()) ) {s = 15;}

                        else if ( (synpred28_CMTJava()) ) {s = 16;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA15_13 = input.LA(1);

                         
                        int index15_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_CMTJava()) ) {s = 15;}

                        else if ( (synpred28_CMTJava()) ) {s = 16;}

                         
                        input.seek(index15_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\20\uffff";
    static final String DFA19_eofS =
        "\20\uffff";
    static final String DFA19_minS =
        "\1\4\1\uffff\1\0\15\uffff";
    static final String DFA19_maxS =
        "\1\160\1\uffff\1\0\15\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\3\1\uffff\1\2\13\uffff\1\1";
    static final String DFA19_specialS =
        "\2\uffff\1\0\15\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\3\25\uffff\1\3\20\uffff\1\3\13\uffff\1\3\2\uffff\1\2\2\3"+
            "\2\uffff\2\3\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\4\uffff\1\1"+
            "\40\uffff\1\3",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()* loopback of 143:3: ( tObjectFieldDeclaration | constructorDeclaration )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_2 = input.LA(1);

                         
                        int index19_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_CMTJava()) ) {s = 15;}

                        else if ( (synpred33_CMTJava()) ) {s = 3;}

                         
                        input.seek(index19_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA20_eotS =
        "\55\uffff";
    static final String DFA20_eofS =
        "\55\uffff";
    static final String DFA20_minS =
        "\1\4\1\uffff\10\0\43\uffff";
    static final String DFA20_maxS =
        "\1\163\1\uffff\10\0\43\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\10\uffff\1\2\42\uffff";
    static final String DFA20_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\43\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\5\11\6\14\uffff\2\12\1\10\1\12\1\10\2\uffff\1\10\1\12\1\uffff"+
            "\1\12\1\uffff\1\12\1\10\1\uffff\1\12\1\uffff\1\12\1\uffff\1"+
            "\10\1\12\1\uffff\1\12\3\uffff\1\10\1\12\1\10\1\12\1\7\1\uffff"+
            "\4\12\1\10\2\12\1\4\2\12\1\2\1\12\1\uffff\2\12\1\11\2\12\1\3"+
            "\1\uffff\2\12\2\uffff\1\12\4\uffff\2\12\5\uffff\4\12\16\uffff"+
            "\1\12\2\uffff\1\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "160:9: ( explicitConstructorInvocation )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_2 = input.LA(1);

                         
                        int index20_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_3 = input.LA(1);

                         
                        int index20_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_4 = input.LA(1);

                         
                        int index20_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_5 = input.LA(1);

                         
                        int index20_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_6 = input.LA(1);

                         
                        int index20_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_7 = input.LA(1);

                         
                        int index20_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_8 = input.LA(1);

                         
                        int index20_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_9 = input.LA(1);

                         
                        int index20_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index20_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\17\uffff";
    static final String DFA37_eofS =
        "\17\uffff";
    static final String DFA37_minS =
        "\1\32\14\0\2\uffff";
    static final String DFA37_maxS =
        "\1\160\14\0\2\uffff";
    static final String DFA37_acceptS =
        "\15\uffff\1\1\1\2";
    static final String DFA37_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\6\20\uffff\1\7\11\uffff\1\15\1\uffff\1\10\2\uffff\1\4\1\3"+
            "\1\2\2\uffff\1\5\1\14\2\uffff\1\11\3\uffff\1\12\2\uffff\1\13"+
            "\45\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "250:1: interfaceDeclaration : ( normalInterfaceDeclaration | annotationTypeDeclaration );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_2 = input.LA(1);

                         
                        int index37_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index37_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_3 = input.LA(1);

                         
                        int index37_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index37_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_4 = input.LA(1);

                         
                        int index37_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index37_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA37_5 = input.LA(1);

                         
                        int index37_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index37_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA37_6 = input.LA(1);

                         
                        int index37_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index37_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA37_7 = input.LA(1);

                         
                        int index37_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index37_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA37_8 = input.LA(1);

                         
                        int index37_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index37_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA37_9 = input.LA(1);

                         
                        int index37_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index37_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA37_10 = input.LA(1);

                         
                        int index37_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index37_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA37_11 = input.LA(1);

                         
                        int index37_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index37_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA37_12 = input.LA(1);

                         
                        int index37_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_CMTJava()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index37_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA45_eotS =
        "\25\uffff";
    static final String DFA45_eofS =
        "\25\uffff";
    static final String DFA45_minS =
        "\1\4\16\0\6\uffff";
    static final String DFA45_maxS =
        "\1\163\16\0\6\uffff";
    static final String DFA45_acceptS =
        "\17\uffff\1\2\1\uffff\1\3\1\uffff\1\4\1\1";
    static final String DFA45_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\6\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\15\25\uffff\1\6\1\uffff\1\16\1\uffff\1\16\2\uffff\1\16\1"+
            "\21\4\uffff\1\16\1\uffff\1\21\1\uffff\1\7\1\uffff\1\16\6\uffff"+
            "\1\16\1\23\1\16\1\10\2\uffff\1\4\1\3\1\2\1\uffff\1\16\1\5\1"+
            "\14\2\uffff\1\11\3\uffff\1\12\1\uffff\1\17\1\13\45\uffff\1\1"+
            "\2\uffff\1\17",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "291:1: memberDecl : ( fieldDeclaration | methodDeclaration | classDeclaration | interfaceDeclaration );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_1 = input.LA(1);

                         
                        int index45_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_CMTJava()) ) {s = 20;}

                        else if ( (synpred61_CMTJava()) ) {s = 15;}

                        else if ( (synpred62_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index45_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_2 = input.LA(1);

                         
                        int index45_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_CMTJava()) ) {s = 20;}

                        else if ( (synpred61_CMTJava()) ) {s = 15;}

                        else if ( (synpred62_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index45_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA45_3 = input.LA(1);

                         
                        int index45_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_CMTJava()) ) {s = 20;}

                        else if ( (synpred61_CMTJava()) ) {s = 15;}

                        else if ( (synpred62_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index45_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA45_4 = input.LA(1);

                         
                        int index45_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_CMTJava()) ) {s = 20;}

                        else if ( (synpred61_CMTJava()) ) {s = 15;}

                        else if ( (synpred62_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index45_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA45_5 = input.LA(1);

                         
                        int index45_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_CMTJava()) ) {s = 20;}

                        else if ( (synpred61_CMTJava()) ) {s = 15;}

                        else if ( (synpred62_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index45_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA45_6 = input.LA(1);

                         
                        int index45_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_CMTJava()) ) {s = 20;}

                        else if ( (synpred61_CMTJava()) ) {s = 15;}

                        else if ( (synpred62_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index45_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA45_7 = input.LA(1);

                         
                        int index45_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_CMTJava()) ) {s = 20;}

                        else if ( (synpred61_CMTJava()) ) {s = 15;}

                        else if ( (synpred62_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index45_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA45_8 = input.LA(1);

                         
                        int index45_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_CMTJava()) ) {s = 20;}

                        else if ( (synpred61_CMTJava()) ) {s = 15;}

                        else if ( (synpred62_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index45_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA45_9 = input.LA(1);

                         
                        int index45_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_CMTJava()) ) {s = 20;}

                        else if ( (synpred61_CMTJava()) ) {s = 15;}

                        else if ( (synpred62_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index45_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA45_10 = input.LA(1);

                         
                        int index45_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_CMTJava()) ) {s = 20;}

                        else if ( (synpred61_CMTJava()) ) {s = 15;}

                        else if ( (synpred62_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index45_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA45_11 = input.LA(1);

                         
                        int index45_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_CMTJava()) ) {s = 20;}

                        else if ( (synpred61_CMTJava()) ) {s = 15;}

                        else if ( (synpred62_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index45_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA45_12 = input.LA(1);

                         
                        int index45_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_CMTJava()) ) {s = 20;}

                        else if ( (synpred61_CMTJava()) ) {s = 15;}

                        else if ( (synpred62_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index45_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA45_13 = input.LA(1);

                         
                        int index45_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_CMTJava()) ) {s = 20;}

                        else if ( (synpred61_CMTJava()) ) {s = 15;}

                         
                        input.seek(index45_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA45_14 = input.LA(1);

                         
                        int index45_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_CMTJava()) ) {s = 20;}

                        else if ( (synpred61_CMTJava()) ) {s = 15;}

                         
                        input.seek(index45_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\22\uffff";
    static final String DFA55_eofS =
        "\22\uffff";
    static final String DFA55_minS =
        "\1\4\16\0\3\uffff";
    static final String DFA55_maxS =
        "\1\163\16\0\3\uffff";
    static final String DFA55_acceptS =
        "\17\uffff\1\2\1\uffff\1\1";
    static final String DFA55_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\3\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\16\25\uffff\1\6\1\uffff\1\17\1\uffff\1\17\2\uffff\1\17\5"+
            "\uffff\1\17\3\uffff\1\7\1\uffff\1\17\6\uffff\1\17\1\uffff\1"+
            "\17\1\10\2\uffff\1\4\1\3\1\2\1\uffff\1\17\1\5\1\14\2\uffff\1"+
            "\11\3\uffff\1\12\1\uffff\1\17\1\13\45\uffff\1\1\2\uffff\1\15",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "299:1: methodDeclaration : ( modifiers ( typeParameters )? IDENTIFIER formalParameters ( 'throws' qualifiedNameList )? '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' | modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( block | ';' ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_2 = input.LA(1);

                         
                        int index55_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index55_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_3 = input.LA(1);

                         
                        int index55_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index55_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA55_4 = input.LA(1);

                         
                        int index55_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index55_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA55_5 = input.LA(1);

                         
                        int index55_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index55_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA55_6 = input.LA(1);

                         
                        int index55_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index55_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA55_7 = input.LA(1);

                         
                        int index55_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index55_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA55_8 = input.LA(1);

                         
                        int index55_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index55_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA55_9 = input.LA(1);

                         
                        int index55_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index55_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA55_10 = input.LA(1);

                         
                        int index55_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index55_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA55_11 = input.LA(1);

                         
                        int index55_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index55_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA55_12 = input.LA(1);

                         
                        int index55_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index55_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA55_13 = input.LA(1);

                         
                        int index55_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index55_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA55_14 = input.LA(1);

                         
                        int index55_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_CMTJava()) ) {s = 17;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index55_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA48_eotS =
        "\55\uffff";
    static final String DFA48_eofS =
        "\55\uffff";
    static final String DFA48_minS =
        "\1\4\1\uffff\10\0\43\uffff";
    static final String DFA48_maxS =
        "\1\163\1\uffff\10\0\43\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\1\1\10\uffff\1\2\42\uffff";
    static final String DFA48_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\43\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\5\11\6\14\uffff\2\12\1\10\1\12\1\10\2\uffff\1\10\1\12\1\uffff"+
            "\1\12\1\uffff\1\12\1\10\1\uffff\1\12\1\uffff\1\12\1\uffff\1"+
            "\10\1\12\1\uffff\1\12\3\uffff\1\10\1\12\1\10\1\12\1\7\1\uffff"+
            "\4\12\1\10\2\12\1\4\2\12\1\2\1\12\1\uffff\2\12\1\11\2\12\1\3"+
            "\1\uffff\2\12\2\uffff\1\12\4\uffff\2\12\5\uffff\4\12\16\uffff"+
            "\1\12\2\uffff\1\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "310:9: ( explicitConstructorInvocation )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_2 = input.LA(1);

                         
                        int index48_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index48_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_3 = input.LA(1);

                         
                        int index48_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index48_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA48_4 = input.LA(1);

                         
                        int index48_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index48_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA48_5 = input.LA(1);

                         
                        int index48_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index48_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA48_6 = input.LA(1);

                         
                        int index48_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index48_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA48_7 = input.LA(1);

                         
                        int index48_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index48_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA48_8 = input.LA(1);

                         
                        int index48_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index48_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA48_9 = input.LA(1);

                         
                        int index48_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index48_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\26\uffff";
    static final String DFA59_eofS =
        "\26\uffff";
    static final String DFA59_minS =
        "\1\4\16\0\7\uffff";
    static final String DFA59_maxS =
        "\1\163\16\0\7\uffff";
    static final String DFA59_acceptS =
        "\17\uffff\1\2\1\uffff\1\3\1\4\1\uffff\1\5\1\1";
    static final String DFA59_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\7\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\15\25\uffff\1\6\1\uffff\1\16\1\uffff\1\16\2\uffff\1\16\1"+
            "\22\4\uffff\1\16\1\uffff\1\22\1\uffff\1\7\1\uffff\1\16\6\uffff"+
            "\1\16\1\21\1\16\1\10\2\uffff\1\4\1\3\1\2\1\uffff\1\16\1\5\1"+
            "\14\2\uffff\1\11\3\uffff\1\12\1\uffff\1\17\1\13\7\uffff\1\24"+
            "\35\uffff\1\1\2\uffff\1\17",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "353:1: interfaceBodyDeclaration : ( interfaceFieldDeclaration | interfaceMethodDeclaration | interfaceDeclaration | classDeclaration | ';' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_CMTJava()) ) {s = 21;}

                        else if ( (synpred77_CMTJava()) ) {s = 15;}

                        else if ( (synpred78_CMTJava()) ) {s = 17;}

                        else if ( (synpred79_CMTJava()) ) {s = 18;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_2 = input.LA(1);

                         
                        int index59_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_CMTJava()) ) {s = 21;}

                        else if ( (synpred77_CMTJava()) ) {s = 15;}

                        else if ( (synpred78_CMTJava()) ) {s = 17;}

                        else if ( (synpred79_CMTJava()) ) {s = 18;}

                         
                        input.seek(index59_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_3 = input.LA(1);

                         
                        int index59_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_CMTJava()) ) {s = 21;}

                        else if ( (synpred77_CMTJava()) ) {s = 15;}

                        else if ( (synpred78_CMTJava()) ) {s = 17;}

                        else if ( (synpred79_CMTJava()) ) {s = 18;}

                         
                        input.seek(index59_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA59_4 = input.LA(1);

                         
                        int index59_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_CMTJava()) ) {s = 21;}

                        else if ( (synpred77_CMTJava()) ) {s = 15;}

                        else if ( (synpred78_CMTJava()) ) {s = 17;}

                        else if ( (synpred79_CMTJava()) ) {s = 18;}

                         
                        input.seek(index59_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA59_5 = input.LA(1);

                         
                        int index59_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_CMTJava()) ) {s = 21;}

                        else if ( (synpred77_CMTJava()) ) {s = 15;}

                        else if ( (synpred78_CMTJava()) ) {s = 17;}

                        else if ( (synpred79_CMTJava()) ) {s = 18;}

                         
                        input.seek(index59_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA59_6 = input.LA(1);

                         
                        int index59_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_CMTJava()) ) {s = 21;}

                        else if ( (synpred77_CMTJava()) ) {s = 15;}

                        else if ( (synpred78_CMTJava()) ) {s = 17;}

                        else if ( (synpred79_CMTJava()) ) {s = 18;}

                         
                        input.seek(index59_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA59_7 = input.LA(1);

                         
                        int index59_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_CMTJava()) ) {s = 21;}

                        else if ( (synpred77_CMTJava()) ) {s = 15;}

                        else if ( (synpred78_CMTJava()) ) {s = 17;}

                        else if ( (synpred79_CMTJava()) ) {s = 18;}

                         
                        input.seek(index59_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA59_8 = input.LA(1);

                         
                        int index59_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_CMTJava()) ) {s = 21;}

                        else if ( (synpred77_CMTJava()) ) {s = 15;}

                        else if ( (synpred78_CMTJava()) ) {s = 17;}

                        else if ( (synpred79_CMTJava()) ) {s = 18;}

                         
                        input.seek(index59_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA59_9 = input.LA(1);

                         
                        int index59_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_CMTJava()) ) {s = 21;}

                        else if ( (synpred77_CMTJava()) ) {s = 15;}

                        else if ( (synpred78_CMTJava()) ) {s = 17;}

                        else if ( (synpred79_CMTJava()) ) {s = 18;}

                         
                        input.seek(index59_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA59_10 = input.LA(1);

                         
                        int index59_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_CMTJava()) ) {s = 21;}

                        else if ( (synpred77_CMTJava()) ) {s = 15;}

                        else if ( (synpred78_CMTJava()) ) {s = 17;}

                        else if ( (synpred79_CMTJava()) ) {s = 18;}

                         
                        input.seek(index59_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA59_11 = input.LA(1);

                         
                        int index59_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_CMTJava()) ) {s = 21;}

                        else if ( (synpred77_CMTJava()) ) {s = 15;}

                        else if ( (synpred78_CMTJava()) ) {s = 17;}

                        else if ( (synpred79_CMTJava()) ) {s = 18;}

                         
                        input.seek(index59_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA59_12 = input.LA(1);

                         
                        int index59_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_CMTJava()) ) {s = 21;}

                        else if ( (synpred77_CMTJava()) ) {s = 15;}

                        else if ( (synpred78_CMTJava()) ) {s = 17;}

                        else if ( (synpred79_CMTJava()) ) {s = 18;}

                         
                        input.seek(index59_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA59_13 = input.LA(1);

                         
                        int index59_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_CMTJava()) ) {s = 21;}

                        else if ( (synpred77_CMTJava()) ) {s = 15;}

                         
                        input.seek(index59_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA59_14 = input.LA(1);

                         
                        int index59_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_CMTJava()) ) {s = 21;}

                        else if ( (synpred77_CMTJava()) ) {s = 15;}

                         
                        input.seek(index59_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA82_eotS =
        "\12\uffff";
    static final String DFA82_eofS =
        "\12\uffff";
    static final String DFA82_minS =
        "\1\4\1\uffff\1\0\1\uffff\1\0\5\uffff";
    static final String DFA82_maxS =
        "\1\163\1\uffff\1\0\1\uffff\1\0\5\uffff";
    static final String DFA82_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\6\uffff";
    static final String DFA82_specialS =
        "\2\uffff\1\0\1\uffff\1\1\5\uffff}>";
    static final String[] DFA82_transitionS = {
            "\12\3\16\uffff\1\3\1\uffff\1\3\2\uffff\1\3\5\uffff\1\3\5\uffff"+
            "\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\1\3\5\uffff\1\3\2\uffff"+
            "\1\4\2\uffff\1\2\4\uffff\1\3\2\uffff\1\3\46\uffff\1\1",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "479:1: explicitConstructorInvocation : ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_2 = input.LA(1);

                         
                        int index82_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred111_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index82_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA82_4 = input.LA(1);

                         
                        int index82_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred111_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index82_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 82, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA93_eotS =
        "\26\uffff";
    static final String DFA93_eofS =
        "\26\uffff";
    static final String DFA93_minS =
        "\1\4\16\0\7\uffff";
    static final String DFA93_maxS =
        "\1\160\16\0\7\uffff";
    static final String DFA93_acceptS =
        "\17\uffff\1\3\1\4\1\5\1\7\1\1\1\2\1\6";
    static final String DFA93_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\7\uffff}>";
    static final String[] DFA93_transitionS = {
            "\1\15\25\uffff\1\6\1\uffff\1\16\1\uffff\1\16\2\uffff\1\16\1"+
            "\17\4\uffff\1\16\1\uffff\1\21\1\uffff\1\7\1\uffff\1\16\6\uffff"+
            "\1\16\1\20\1\16\1\10\2\uffff\1\4\1\3\1\2\1\uffff\1\16\1\5\1"+
            "\14\2\uffff\1\11\3\uffff\1\12\2\uffff\1\13\7\uffff\1\22\35\uffff"+
            "\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
    static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
    static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
    static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
    static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
    static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
    static final short[][] DFA93_transition;

    static {
        int numStates = DFA93_transitionS.length;
        DFA93_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = DFA93_eot;
            this.eof = DFA93_eof;
            this.min = DFA93_min;
            this.max = DFA93_max;
            this.accept = DFA93_accept;
            this.special = DFA93_special;
            this.transition = DFA93_transition;
        }
        public String getDescription() {
            return "563:1: annotationTypeElementDeclaration : ( annotationMethodDeclaration | interfaceFieldDeclaration | normalClassDeclaration | normalInterfaceDeclaration | enumDeclaration | annotationTypeDeclaration | ';' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA93_1 = input.LA(1);

                         
                        int index93_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_CMTJava()) ) {s = 19;}

                        else if ( (synpred126_CMTJava()) ) {s = 20;}

                        else if ( (synpred127_CMTJava()) ) {s = 15;}

                        else if ( (synpred128_CMTJava()) ) {s = 16;}

                        else if ( (synpred129_CMTJava()) ) {s = 17;}

                        else if ( (synpred130_CMTJava()) ) {s = 21;}

                         
                        input.seek(index93_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA93_2 = input.LA(1);

                         
                        int index93_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_CMTJava()) ) {s = 19;}

                        else if ( (synpred126_CMTJava()) ) {s = 20;}

                        else if ( (synpred127_CMTJava()) ) {s = 15;}

                        else if ( (synpred128_CMTJava()) ) {s = 16;}

                        else if ( (synpred129_CMTJava()) ) {s = 17;}

                        else if ( (synpred130_CMTJava()) ) {s = 21;}

                         
                        input.seek(index93_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA93_3 = input.LA(1);

                         
                        int index93_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_CMTJava()) ) {s = 19;}

                        else if ( (synpred126_CMTJava()) ) {s = 20;}

                        else if ( (synpred127_CMTJava()) ) {s = 15;}

                        else if ( (synpred128_CMTJava()) ) {s = 16;}

                        else if ( (synpred129_CMTJava()) ) {s = 17;}

                        else if ( (synpred130_CMTJava()) ) {s = 21;}

                         
                        input.seek(index93_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA93_4 = input.LA(1);

                         
                        int index93_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_CMTJava()) ) {s = 19;}

                        else if ( (synpred126_CMTJava()) ) {s = 20;}

                        else if ( (synpred127_CMTJava()) ) {s = 15;}

                        else if ( (synpred128_CMTJava()) ) {s = 16;}

                        else if ( (synpred129_CMTJava()) ) {s = 17;}

                        else if ( (synpred130_CMTJava()) ) {s = 21;}

                         
                        input.seek(index93_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA93_5 = input.LA(1);

                         
                        int index93_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_CMTJava()) ) {s = 19;}

                        else if ( (synpred126_CMTJava()) ) {s = 20;}

                        else if ( (synpred127_CMTJava()) ) {s = 15;}

                        else if ( (synpred128_CMTJava()) ) {s = 16;}

                        else if ( (synpred129_CMTJava()) ) {s = 17;}

                        else if ( (synpred130_CMTJava()) ) {s = 21;}

                         
                        input.seek(index93_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA93_6 = input.LA(1);

                         
                        int index93_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_CMTJava()) ) {s = 19;}

                        else if ( (synpred126_CMTJava()) ) {s = 20;}

                        else if ( (synpred127_CMTJava()) ) {s = 15;}

                        else if ( (synpred128_CMTJava()) ) {s = 16;}

                        else if ( (synpred129_CMTJava()) ) {s = 17;}

                        else if ( (synpred130_CMTJava()) ) {s = 21;}

                         
                        input.seek(index93_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA93_7 = input.LA(1);

                         
                        int index93_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_CMTJava()) ) {s = 19;}

                        else if ( (synpred126_CMTJava()) ) {s = 20;}

                        else if ( (synpred127_CMTJava()) ) {s = 15;}

                        else if ( (synpred128_CMTJava()) ) {s = 16;}

                        else if ( (synpred129_CMTJava()) ) {s = 17;}

                        else if ( (synpred130_CMTJava()) ) {s = 21;}

                         
                        input.seek(index93_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA93_8 = input.LA(1);

                         
                        int index93_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_CMTJava()) ) {s = 19;}

                        else if ( (synpred126_CMTJava()) ) {s = 20;}

                        else if ( (synpred127_CMTJava()) ) {s = 15;}

                        else if ( (synpred128_CMTJava()) ) {s = 16;}

                        else if ( (synpred129_CMTJava()) ) {s = 17;}

                        else if ( (synpred130_CMTJava()) ) {s = 21;}

                         
                        input.seek(index93_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA93_9 = input.LA(1);

                         
                        int index93_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_CMTJava()) ) {s = 19;}

                        else if ( (synpred126_CMTJava()) ) {s = 20;}

                        else if ( (synpred127_CMTJava()) ) {s = 15;}

                        else if ( (synpred128_CMTJava()) ) {s = 16;}

                        else if ( (synpred129_CMTJava()) ) {s = 17;}

                        else if ( (synpred130_CMTJava()) ) {s = 21;}

                         
                        input.seek(index93_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA93_10 = input.LA(1);

                         
                        int index93_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_CMTJava()) ) {s = 19;}

                        else if ( (synpred126_CMTJava()) ) {s = 20;}

                        else if ( (synpred127_CMTJava()) ) {s = 15;}

                        else if ( (synpred128_CMTJava()) ) {s = 16;}

                        else if ( (synpred129_CMTJava()) ) {s = 17;}

                        else if ( (synpred130_CMTJava()) ) {s = 21;}

                         
                        input.seek(index93_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA93_11 = input.LA(1);

                         
                        int index93_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_CMTJava()) ) {s = 19;}

                        else if ( (synpred126_CMTJava()) ) {s = 20;}

                        else if ( (synpred127_CMTJava()) ) {s = 15;}

                        else if ( (synpred128_CMTJava()) ) {s = 16;}

                        else if ( (synpred129_CMTJava()) ) {s = 17;}

                        else if ( (synpred130_CMTJava()) ) {s = 21;}

                         
                        input.seek(index93_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA93_12 = input.LA(1);

                         
                        int index93_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_CMTJava()) ) {s = 19;}

                        else if ( (synpred126_CMTJava()) ) {s = 20;}

                        else if ( (synpred127_CMTJava()) ) {s = 15;}

                        else if ( (synpred128_CMTJava()) ) {s = 16;}

                        else if ( (synpred129_CMTJava()) ) {s = 17;}

                        else if ( (synpred130_CMTJava()) ) {s = 21;}

                         
                        input.seek(index93_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA93_13 = input.LA(1);

                         
                        int index93_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_CMTJava()) ) {s = 19;}

                        else if ( (synpred126_CMTJava()) ) {s = 20;}

                         
                        input.seek(index93_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA93_14 = input.LA(1);

                         
                        int index93_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_CMTJava()) ) {s = 19;}

                        else if ( (synpred126_CMTJava()) ) {s = 20;}

                         
                        input.seek(index93_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 93, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA96_eotS =
        "\54\uffff";
    static final String DFA96_eofS =
        "\54\uffff";
    static final String DFA96_minS =
        "\1\4\4\0\6\uffff\1\0\40\uffff";
    static final String DFA96_maxS =
        "\1\160\4\0\6\uffff\1\0\40\uffff";
    static final String DFA96_acceptS =
        "\5\uffff\1\2\14\uffff\1\3\30\uffff\1\1";
    static final String DFA96_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\6\uffff\1\4\40\uffff}>";
    static final String[] DFA96_transitionS = {
            "\1\3\11\22\14\uffff\1\5\1\22\1\4\1\22\1\4\2\uffff\1\4\1\5\1"+
            "\uffff\1\22\1\uffff\1\22\1\4\1\uffff\1\5\1\uffff\1\1\1\uffff"+
            "\1\4\1\22\1\uffff\1\22\3\uffff\1\4\1\5\1\4\1\5\1\22\1\uffff"+
            "\3\5\1\22\1\4\2\5\2\22\1\13\2\22\1\uffff\1\5\2\22\1\5\2\22\1"+
            "\uffff\1\22\3\uffff\1\22\4\uffff\2\22\5\uffff\4\22\16\uffff"+
            "\1\2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA96_eot = DFA.unpackEncodedString(DFA96_eotS);
    static final short[] DFA96_eof = DFA.unpackEncodedString(DFA96_eofS);
    static final char[] DFA96_min = DFA.unpackEncodedStringToUnsignedChars(DFA96_minS);
    static final char[] DFA96_max = DFA.unpackEncodedStringToUnsignedChars(DFA96_maxS);
    static final short[] DFA96_accept = DFA.unpackEncodedString(DFA96_acceptS);
    static final short[] DFA96_special = DFA.unpackEncodedString(DFA96_specialS);
    static final short[][] DFA96_transition;

    static {
        int numStates = DFA96_transitionS.length;
        DFA96_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA96_transition[i] = DFA.unpackEncodedString(DFA96_transitionS[i]);
        }
    }

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = DFA96_eot;
            this.eof = DFA96_eof;
            this.min = DFA96_min;
            this.max = DFA96_max;
            this.accept = DFA96_accept;
            this.special = DFA96_special;
            this.transition = DFA96_transition;
        }
        public String getDescription() {
            return "590:1: blockStatement : ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA96_1 = input.LA(1);

                         
                        int index96_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_CMTJava()) ) {s = 43;}

                        else if ( (synpred134_CMTJava()) ) {s = 5;}

                         
                        input.seek(index96_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA96_2 = input.LA(1);

                         
                        int index96_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_CMTJava()) ) {s = 43;}

                        else if ( (synpred134_CMTJava()) ) {s = 5;}

                         
                        input.seek(index96_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA96_3 = input.LA(1);

                         
                        int index96_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_CMTJava()) ) {s = 43;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index96_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA96_4 = input.LA(1);

                         
                        int index96_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_CMTJava()) ) {s = 43;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index96_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA96_11 = input.LA(1);

                         
                        int index96_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_CMTJava()) ) {s = 5;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index96_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 96, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA104_eotS =
        "\40\uffff";
    static final String DFA104_eofS =
        "\40\uffff";
    static final String DFA104_minS =
        "\1\4\1\uffff\1\0\23\uffff\1\0\11\uffff";
    static final String DFA104_maxS =
        "\1\141\1\uffff\1\0\23\uffff\1\0\11\uffff";
    static final String DFA104_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\15\uffff\1\21\1\2\1\3\1\20";
    static final String DFA104_specialS =
        "\2\uffff\1\0\23\uffff\1\1\11\uffff}>";
    static final String[] DFA104_transitionS = {
            "\1\26\11\16\15\uffff\1\2\1\16\1\14\1\16\2\uffff\1\16\2\uffff"+
            "\1\15\1\uffff\1\6\1\16\5\uffff\1\16\1\4\1\uffff\1\3\3\uffff"+
            "\1\16\1\uffff\1\16\1\uffff\1\16\4\uffff\1\12\1\16\2\uffff\1"+
            "\16\1\10\1\11\1\16\1\13\2\uffff\1\7\1\16\1\uffff\1\5\1\16\1"+
            "\uffff\1\1\3\uffff\1\34\4\uffff\2\16\5\uffff\4\16",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA104_eot = DFA.unpackEncodedString(DFA104_eotS);
    static final short[] DFA104_eof = DFA.unpackEncodedString(DFA104_eofS);
    static final char[] DFA104_min = DFA.unpackEncodedStringToUnsignedChars(DFA104_minS);
    static final char[] DFA104_max = DFA.unpackEncodedStringToUnsignedChars(DFA104_maxS);
    static final short[] DFA104_accept = DFA.unpackEncodedString(DFA104_acceptS);
    static final short[] DFA104_special = DFA.unpackEncodedString(DFA104_specialS);
    static final short[][] DFA104_transition;

    static {
        int numStates = DFA104_transitionS.length;
        DFA104_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA104_transition[i] = DFA.unpackEncodedString(DFA104_transitionS[i]);
        }
    }

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = DFA104_eot;
            this.eof = DFA104_eof;
            this.min = DFA104_min;
            this.max = DFA104_max;
            this.accept = DFA104_accept;
            this.special = DFA104_special;
            this.transition = DFA104_transition;
        }
        public String getDescription() {
            return "609:1: statement : ( block | ( 'assert' ) expression ( ':' expression )? ';' | 'assert' expression ( ':' expression )? ';' | 'if' parExpression statement ( 'else' statement )? | forstatement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | trystatement | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( IDENTIFIER )? ';' | 'continue' ( IDENTIFIER )? ';' | expression ';' | IDENTIFIER ':' statement | ';' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA104_2 = input.LA(1);

                         
                        int index104_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_CMTJava()) ) {s = 29;}

                        else if ( (synpred140_CMTJava()) ) {s = 30;}

                         
                        input.seek(index104_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA104_22 = input.LA(1);

                         
                        int index104_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred156_CMTJava()) ) {s = 14;}

                        else if ( (synpred157_CMTJava()) ) {s = 31;}

                         
                        input.seek(index104_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 104, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA115_eotS =
        "\21\uffff";
    static final String DFA115_eofS =
        "\21\uffff";
    static final String DFA115_minS =
        "\1\4\2\uffff\2\0\14\uffff";
    static final String DFA115_maxS =
        "\1\160\2\uffff\2\0\14\uffff";
    static final String DFA115_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\13\uffff";
    static final String DFA115_specialS =
        "\3\uffff\1\0\1\1\14\uffff}>";
    static final String[] DFA115_transitionS = {
            "\1\3\11\5\16\uffff\1\4\1\uffff\1\4\2\uffff\1\4\5\uffff\1\4\3"+
            "\uffff\1\1\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\1\5\5"+
            "\uffff\1\4\2\uffff\1\5\2\uffff\1\5\4\uffff\1\5\2\uffff\1\5\12"+
            "\uffff\2\5\5\uffff\4\5\16\uffff\1\1",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA115_eot = DFA.unpackEncodedString(DFA115_eotS);
    static final short[] DFA115_eof = DFA.unpackEncodedString(DFA115_eofS);
    static final char[] DFA115_min = DFA.unpackEncodedStringToUnsignedChars(DFA115_minS);
    static final char[] DFA115_max = DFA.unpackEncodedStringToUnsignedChars(DFA115_maxS);
    static final short[] DFA115_accept = DFA.unpackEncodedString(DFA115_acceptS);
    static final short[] DFA115_special = DFA.unpackEncodedString(DFA115_specialS);
    static final short[][] DFA115_transition;

    static {
        int numStates = DFA115_transitionS.length;
        DFA115_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA115_transition[i] = DFA.unpackEncodedString(DFA115_transitionS[i]);
        }
    }

    class DFA115 extends DFA {

        public DFA115(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 115;
            this.eot = DFA115_eot;
            this.eof = DFA115_eof;
            this.min = DFA115_min;
            this.max = DFA115_max;
            this.accept = DFA115_accept;
            this.special = DFA115_special;
            this.transition = DFA115_transition;
        }
        public String getDescription() {
            return "695:1: forInit : ( localVariableDeclaration | expressionList );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA115_3 = input.LA(1);

                         
                        int index115_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred169_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index115_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA115_4 = input.LA(1);

                         
                        int index115_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred169_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index115_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 115, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA118_eotS =
        "\17\uffff";
    static final String DFA118_eofS =
        "\17\uffff";
    static final String DFA118_minS =
        "\1\126\12\uffff\1\162\1\126\2\uffff";
    static final String DFA118_maxS =
        "\1\163\12\uffff\2\162\2\uffff";
    static final String DFA118_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\13"+
        "\1\14";
    static final String DFA118_specialS =
        "\17\uffff}>";
    static final String[] DFA118_transitionS = {
            "\1\1\21\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff\1\13"+
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14",
            "\1\16\33\uffff\1\15",
            "",
            ""
    };

    static final short[] DFA118_eot = DFA.unpackEncodedString(DFA118_eotS);
    static final short[] DFA118_eof = DFA.unpackEncodedString(DFA118_eofS);
    static final char[] DFA118_min = DFA.unpackEncodedStringToUnsignedChars(DFA118_minS);
    static final char[] DFA118_max = DFA.unpackEncodedStringToUnsignedChars(DFA118_maxS);
    static final short[] DFA118_accept = DFA.unpackEncodedString(DFA118_acceptS);
    static final short[] DFA118_special = DFA.unpackEncodedString(DFA118_specialS);
    static final short[][] DFA118_transition;

    static {
        int numStates = DFA118_transitionS.length;
        DFA118_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA118_transition[i] = DFA.unpackEncodedString(DFA118_transitionS[i]);
        }
    }

    class DFA118 extends DFA {

        public DFA118(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 118;
            this.eot = DFA118_eot;
            this.eof = DFA118_eof;
            this.min = DFA118_min;
            this.max = DFA118_max;
            this.accept = DFA118_accept;
            this.special = DFA118_special;
            this.transition = DFA118_transition;
        }
        public String getDescription() {
            return "718:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<' '<' '=' | '>' '>' '>' '=' | '>' '>' '=' );";
        }
    }
    static final String DFA136_eotS =
        "\14\uffff";
    static final String DFA136_eofS =
        "\14\uffff";
    static final String DFA136_minS =
        "\1\4\2\uffff\1\0\10\uffff";
    static final String DFA136_maxS =
        "\1\130\2\uffff\1\0\10\uffff";
    static final String DFA136_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\6\uffff\1\3";
    static final String DFA136_specialS =
        "\3\uffff\1\0\10\uffff}>";
    static final String[] DFA136_transitionS = {
            "\12\4\16\uffff\1\4\1\uffff\1\4\2\uffff\1\4\5\uffff\1\4\5\uffff"+
            "\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\1\4\5\uffff\1\4\2\uffff"+
            "\1\4\2\uffff\1\4\4\uffff\1\4\2\uffff\1\3\12\uffff\1\2\1\1",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA136_eot = DFA.unpackEncodedString(DFA136_eotS);
    static final short[] DFA136_eof = DFA.unpackEncodedString(DFA136_eofS);
    static final char[] DFA136_min = DFA.unpackEncodedStringToUnsignedChars(DFA136_minS);
    static final char[] DFA136_max = DFA.unpackEncodedStringToUnsignedChars(DFA136_maxS);
    static final short[] DFA136_accept = DFA.unpackEncodedString(DFA136_acceptS);
    static final short[] DFA136_special = DFA.unpackEncodedString(DFA136_specialS);
    static final short[][] DFA136_transition;

    static {
        int numStates = DFA136_transitionS.length;
        DFA136_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA136_transition[i] = DFA.unpackEncodedString(DFA136_transitionS[i]);
        }
    }

    class DFA136 extends DFA {

        public DFA136(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 136;
            this.eot = DFA136_eot;
            this.eof = DFA136_eof;
            this.min = DFA136_min;
            this.max = DFA136_max;
            this.accept = DFA136_accept;
            this.special = DFA136_special;
            this.transition = DFA136_transition;
        }
        public String getDescription() {
            return "847:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA136_3 = input.LA(1);

                         
                        int index136_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred210_CMTJava()) ) {s = 11;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index136_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 136, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA139_eotS =
        "\41\uffff";
    static final String DFA139_eofS =
        "\1\4\40\uffff";
    static final String DFA139_minS =
        "\1\63\1\0\1\uffff\1\0\35\uffff";
    static final String DFA139_maxS =
        "\1\163\1\0\1\uffff\1\0\35\uffff";
    static final String DFA139_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\34\uffff";
    static final String DFA139_specialS =
        "\1\uffff\1\0\1\uffff\1\1\35\uffff}>";
    static final String[] DFA139_transitionS = {
            "\1\4\30\uffff\1\2\1\4\1\uffff\1\4\1\1\3\4\1\3\1\uffff\1\4\2"+
            "\uffff\27\4\1\uffff\3\4",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA139_eot = DFA.unpackEncodedString(DFA139_eotS);
    static final short[] DFA139_eof = DFA.unpackEncodedString(DFA139_eofS);
    static final char[] DFA139_min = DFA.unpackEncodedStringToUnsignedChars(DFA139_minS);
    static final char[] DFA139_max = DFA.unpackEncodedStringToUnsignedChars(DFA139_maxS);
    static final short[] DFA139_accept = DFA.unpackEncodedString(DFA139_acceptS);
    static final short[] DFA139_special = DFA.unpackEncodedString(DFA139_specialS);
    static final short[][] DFA139_transition;

    static {
        int numStates = DFA139_transitionS.length;
        DFA139_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA139_transition[i] = DFA.unpackEncodedString(DFA139_transitionS[i]);
        }
    }

    class DFA139 extends DFA {

        public DFA139(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 139;
            this.eot = DFA139_eot;
            this.eof = DFA139_eof;
            this.min = DFA139_min;
            this.max = DFA139_max;
            this.accept = DFA139_accept;
            this.special = DFA139_special;
            this.transition = DFA139_transition;
        }
        public String getDescription() {
            return "872:9: ( identifierSuffix )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA139_1 = input.LA(1);

                         
                        int index139_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred217_CMTJava()) ) {s = 2;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index139_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA139_3 = input.LA(1);

                         
                        int index139_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred217_CMTJava()) ) {s = 2;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index139_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 139, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA141_eotS =
        "\41\uffff";
    static final String DFA141_eofS =
        "\1\4\40\uffff";
    static final String DFA141_minS =
        "\1\63\1\0\1\uffff\1\0\35\uffff";
    static final String DFA141_maxS =
        "\1\163\1\0\1\uffff\1\0\35\uffff";
    static final String DFA141_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\34\uffff";
    static final String DFA141_specialS =
        "\1\uffff\1\0\1\uffff\1\1\35\uffff}>";
    static final String[] DFA141_transitionS = {
            "\1\4\30\uffff\1\2\1\4\1\uffff\1\4\1\1\3\4\1\3\1\uffff\1\4\2"+
            "\uffff\27\4\1\uffff\3\4",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA141_eot = DFA.unpackEncodedString(DFA141_eotS);
    static final short[] DFA141_eof = DFA.unpackEncodedString(DFA141_eofS);
    static final char[] DFA141_min = DFA.unpackEncodedStringToUnsignedChars(DFA141_minS);
    static final char[] DFA141_max = DFA.unpackEncodedStringToUnsignedChars(DFA141_maxS);
    static final short[] DFA141_accept = DFA.unpackEncodedString(DFA141_acceptS);
    static final short[] DFA141_special = DFA.unpackEncodedString(DFA141_specialS);
    static final short[][] DFA141_transition;

    static {
        int numStates = DFA141_transitionS.length;
        DFA141_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA141_transition[i] = DFA.unpackEncodedString(DFA141_transitionS[i]);
        }
    }

    class DFA141 extends DFA {

        public DFA141(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 141;
            this.eot = DFA141_eot;
            this.eof = DFA141_eof;
            this.min = DFA141_min;
            this.max = DFA141_max;
            this.accept = DFA141_accept;
            this.special = DFA141_special;
            this.transition = DFA141_transition;
        }
        public String getDescription() {
            return "877:9: ( identifierSuffix )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA141_1 = input.LA(1);

                         
                        int index141_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred220_CMTJava()) ) {s = 2;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index141_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA141_3 = input.LA(1);

                         
                        int index141_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred220_CMTJava()) ) {s = 2;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index141_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 141, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA149_eotS =
        "\13\uffff";
    static final String DFA149_eofS =
        "\13\uffff";
    static final String DFA149_minS =
        "\1\114\1\4\1\uffff\1\42\7\uffff";
    static final String DFA149_maxS =
        "\1\124\1\141\1\uffff\1\163\7\uffff";
    static final String DFA149_acceptS =
        "\2\uffff\1\3\1\uffff\1\1\1\2\1\4\1\6\1\7\1\10\1\5";
    static final String DFA149_specialS =
        "\13\uffff}>";
    static final String[] DFA149_transitionS = {
            "\1\2\3\uffff\1\1\3\uffff\1\3",
            "\12\5\16\uffff\1\5\1\uffff\1\5\2\uffff\1\5\5\uffff\1\5\5\uffff"+
            "\1\5\6\uffff\1\5\1\uffff\1\5\1\uffff\1\5\5\uffff\1\5\2\uffff"+
            "\1\5\2\uffff\1\5\4\uffff\1\5\2\uffff\1\5\4\uffff\1\4\5\uffff"+
            "\2\5\5\uffff\4\5",
            "",
            "\1\6\25\uffff\1\11\10\uffff\1\10\2\uffff\1\7\56\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA149_eot = DFA.unpackEncodedString(DFA149_eotS);
    static final short[] DFA149_eof = DFA.unpackEncodedString(DFA149_eofS);
    static final char[] DFA149_min = DFA.unpackEncodedStringToUnsignedChars(DFA149_minS);
    static final char[] DFA149_max = DFA.unpackEncodedStringToUnsignedChars(DFA149_maxS);
    static final short[] DFA149_accept = DFA.unpackEncodedString(DFA149_acceptS);
    static final short[] DFA149_special = DFA.unpackEncodedString(DFA149_specialS);
    static final short[][] DFA149_transition;

    static {
        int numStates = DFA149_transitionS.length;
        DFA149_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA149_transition[i] = DFA.unpackEncodedString(DFA149_transitionS[i]);
        }
    }

    class DFA149 extends DFA {

        public DFA149(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 149;
            this.eot = DFA149_eot;
            this.eof = DFA149_eof;
            this.min = DFA149_min;
            this.max = DFA149_max;
            this.accept = DFA149_accept;
            this.special = DFA149_special;
            this.transition = DFA149_transition;
        }
        public String getDescription() {
            return "901:1: identifierSuffix : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' nonWildcardTypeArguments IDENTIFIER arguments | '.' 'this' | '.' 'super' arguments | innerCreator );";
        }
    }
    static final String DFA148_eotS =
        "\46\uffff";
    static final String DFA148_eofS =
        "\1\1\45\uffff";
    static final String DFA148_minS =
        "\1\4\1\uffff\1\0\43\uffff";
    static final String DFA148_maxS =
        "\1\163\1\uffff\1\0\43\uffff";
    static final String DFA148_acceptS =
        "\1\uffff\1\2\43\uffff\1\1";
    static final String DFA148_specialS =
        "\2\uffff\1\0\43\uffff}>";
    static final String[] DFA148_transitionS = {
            "\1\1\27\uffff\1\1\1\uffff\1\1\2\uffff\1\1\5\uffff\2\1\4\uffff"+
            "\1\1\2\uffff\1\1\2\uffff\2\1\1\uffff\1\1\7\uffff\1\1\5\uffff"+
            "\1\1\10\uffff\1\1\1\uffff\1\1\1\2\4\1\1\uffff\1\1\2\uffff\27"+
            "\1\1\uffff\3\1",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA148_eot = DFA.unpackEncodedString(DFA148_eotS);
    static final short[] DFA148_eof = DFA.unpackEncodedString(DFA148_eofS);
    static final char[] DFA148_min = DFA.unpackEncodedStringToUnsignedChars(DFA148_minS);
    static final char[] DFA148_max = DFA.unpackEncodedStringToUnsignedChars(DFA148_maxS);
    static final short[] DFA148_accept = DFA.unpackEncodedString(DFA148_acceptS);
    static final short[] DFA148_special = DFA.unpackEncodedString(DFA148_specialS);
    static final short[][] DFA148_transition;

    static {
        int numStates = DFA148_transitionS.length;
        DFA148_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA148_transition[i] = DFA.unpackEncodedString(DFA148_transitionS[i]);
        }
    }

    class DFA148 extends DFA {

        public DFA148(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 148;
            this.eot = DFA148_eot;
            this.eof = DFA148_eof;
            this.min = DFA148_min;
            this.max = DFA148_max;
            this.accept = DFA148_accept;
            this.special = DFA148_special;
            this.transition = DFA148_transition;
        }
        public String getDescription() {
            return "()+ loopback of 905:9: ( '[' expression ']' )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA148_2 = input.LA(1);

                         
                        int index148_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred232_CMTJava()) ) {s = 37;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index148_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 148, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA163_eotS =
        "\41\uffff";
    static final String DFA163_eofS =
        "\1\2\40\uffff";
    static final String DFA163_minS =
        "\1\63\1\0\37\uffff";
    static final String DFA163_maxS =
        "\1\163\1\0\37\uffff";
    static final String DFA163_acceptS =
        "\2\uffff\1\2\35\uffff\1\1";
    static final String DFA163_specialS =
        "\1\uffff\1\0\37\uffff}>";
    static final String[] DFA163_transitionS = {
            "\1\2\31\uffff\1\2\1\uffff\1\2\1\1\4\2\1\uffff\1\2\2\uffff\27"+
            "\2\1\uffff\3\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA163_eot = DFA.unpackEncodedString(DFA163_eotS);
    static final short[] DFA163_eof = DFA.unpackEncodedString(DFA163_eofS);
    static final char[] DFA163_min = DFA.unpackEncodedStringToUnsignedChars(DFA163_minS);
    static final char[] DFA163_max = DFA.unpackEncodedStringToUnsignedChars(DFA163_maxS);
    static final short[] DFA163_accept = DFA.unpackEncodedString(DFA163_acceptS);
    static final short[] DFA163_special = DFA.unpackEncodedString(DFA163_specialS);
    static final short[][] DFA163_transition;

    static {
        int numStates = DFA163_transitionS.length;
        DFA163_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA163_transition[i] = DFA.unpackEncodedString(DFA163_transitionS[i]);
        }
    }

    class DFA163 extends DFA {

        public DFA163(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 163;
            this.eot = DFA163_eot;
            this.eof = DFA163_eof;
            this.min = DFA163_min;
            this.max = DFA163_max;
            this.accept = DFA163_accept;
            this.special = DFA163_special;
            this.transition = DFA163_transition;
        }
        public String getDescription() {
            return "()* loopback of 1052:9: ( '[' expression ']' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA163_1 = input.LA(1);

                         
                        int index163_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred261_CMTJava()) ) {s = 32;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index163_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 163, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA186_eotS =
        "\55\uffff";
    static final String DFA186_eofS =
        "\55\uffff";
    static final String DFA186_minS =
        "\1\4\1\uffff\10\0\43\uffff";
    static final String DFA186_maxS =
        "\1\163\1\uffff\10\0\43\uffff";
    static final String DFA186_acceptS =
        "\1\uffff\1\1\10\uffff\1\2\42\uffff";
    static final String DFA186_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\43\uffff}>";
    static final String[] DFA186_transitionS = {
            "\1\5\11\6\14\uffff\2\12\1\10\1\12\1\10\2\uffff\1\10\1\12\1\uffff"+
            "\1\12\1\uffff\1\12\1\10\1\uffff\1\12\1\uffff\1\12\1\uffff\1"+
            "\10\1\12\1\uffff\1\12\3\uffff\1\10\1\12\1\10\1\12\1\7\1\uffff"+
            "\4\12\1\10\2\12\1\4\2\12\1\2\1\12\1\uffff\2\12\1\11\2\12\1\3"+
            "\1\uffff\2\12\2\uffff\1\12\4\uffff\2\12\5\uffff\4\12\16\uffff"+
            "\1\12\2\uffff\1\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA186_eot = DFA.unpackEncodedString(DFA186_eotS);
    static final short[] DFA186_eof = DFA.unpackEncodedString(DFA186_eofS);
    static final char[] DFA186_min = DFA.unpackEncodedStringToUnsignedChars(DFA186_minS);
    static final char[] DFA186_max = DFA.unpackEncodedStringToUnsignedChars(DFA186_maxS);
    static final short[] DFA186_accept = DFA.unpackEncodedString(DFA186_acceptS);
    static final short[] DFA186_special = DFA.unpackEncodedString(DFA186_specialS);
    static final short[][] DFA186_transition;

    static {
        int numStates = DFA186_transitionS.length;
        DFA186_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA186_transition[i] = DFA.unpackEncodedString(DFA186_transitionS[i]);
        }
    }

    class DFA186 extends DFA {

        public DFA186(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 186;
            this.eot = DFA186_eot;
            this.eof = DFA186_eof;
            this.min = DFA186_min;
            this.max = DFA186_max;
            this.accept = DFA186_accept;
            this.special = DFA186_special;
            this.transition = DFA186_transition;
        }
        public String getDescription() {
            return "310:9: ( explicitConstructorInvocation )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA186_2 = input.LA(1);

                         
                        int index186_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index186_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA186_3 = input.LA(1);

                         
                        int index186_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index186_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA186_4 = input.LA(1);

                         
                        int index186_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index186_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA186_5 = input.LA(1);

                         
                        int index186_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index186_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA186_6 = input.LA(1);

                         
                        int index186_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index186_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA186_7 = input.LA(1);

                         
                        int index186_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index186_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA186_8 = input.LA(1);

                         
                        int index186_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index186_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA186_9 = input.LA(1);

                         
                        int index186_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_CMTJava()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index186_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 186, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_annotations_in_compilationUnit78 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit107 = new BitSet(new long[]{0x9CA40A0404000002L,0x0001000000040489L});
    public static final BitSet FOLLOW_importDeclaration_in_compilationUnit129 = new BitSet(new long[]{0x9CA40A0404000002L,0x0001000000040489L});
    public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit151 = new BitSet(new long[]{0x9CA00A0404000002L,0x0001000000040489L});
    public static final BitSet FOLLOW_PACKAGE_in_packageDeclaration182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_qualifiedName_in_packageDeclaration184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_packageDeclaration194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_importDeclaration215 = new BitSet(new long[]{0x8000000000000010L});
    public static final BitSet FOLLOW_STATIC_in_importDeclaration227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_importDeclaration248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_importDeclaration250 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_STAR_in_importDeclaration252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_importDeclaration262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_importDeclaration279 = new BitSet(new long[]{0x8000000000000010L});
    public static final BitSet FOLLOW_STATIC_in_importDeclaration291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_importDeclaration312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_importDeclaration323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_importDeclaration325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000140000L});
    public static final BitSet FOLLOW_DOT_in_importDeclaration347 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_STAR_in_importDeclaration349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_importDeclaration370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedImportName390 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_qualifiedImportName401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedImportName403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_typeDeclaration444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_classOrInterfaceDeclaration464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_modifiers509 = new BitSet(new long[]{0x9C80080004000002L,0x0001000000000489L});
    public static final BitSet FOLLOW_PUBLIC_in_modifiers519 = new BitSet(new long[]{0x9C80080004000002L,0x0001000000000489L});
    public static final BitSet FOLLOW_PROTECTED_in_modifiers529 = new BitSet(new long[]{0x9C80080004000002L,0x0001000000000489L});
    public static final BitSet FOLLOW_PRIVATE_in_modifiers539 = new BitSet(new long[]{0x9C80080004000002L,0x0001000000000489L});
    public static final BitSet FOLLOW_STATIC_in_modifiers549 = new BitSet(new long[]{0x9C80080004000002L,0x0001000000000489L});
    public static final BitSet FOLLOW_ABSTRACT_in_modifiers559 = new BitSet(new long[]{0x9C80080004000002L,0x0001000000000489L});
    public static final BitSet FOLLOW_FINAL_in_modifiers569 = new BitSet(new long[]{0x9C80080004000002L,0x0001000000000489L});
    public static final BitSet FOLLOW_NATIVE_in_modifiers579 = new BitSet(new long[]{0x9C80080004000002L,0x0001000000000489L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_modifiers589 = new BitSet(new long[]{0x9C80080004000002L,0x0001000000000489L});
    public static final BitSet FOLLOW_TRANSIENT_in_modifiers599 = new BitSet(new long[]{0x9C80080004000002L,0x0001000000000489L});
    public static final BitSet FOLLOW_VOLATILE_in_modifiers609 = new BitSet(new long[]{0x9C80080004000002L,0x0001000000000489L});
    public static final BitSet FOLLOW_STRICTFP_in_modifiers619 = new BitSet(new long[]{0x9C80080004000002L,0x0001000000000489L});
    public static final BitSet FOLLOW_FINAL_in_variableModifiers651 = new BitSet(new long[]{0x0000080000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_annotation_in_variableModifiers665 = new BitSet(new long[]{0x0000080000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_tObjectDeclaration_in_classDeclaration699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalClassDeclaration_in_classDeclaration707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDeclaration_in_classDeclaration717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_tObjectDeclaration731 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_CLASS_in_tObjectDeclaration733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_tObjectDeclaration735 = new BitSet(new long[]{0x0002040000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_typeParameters_in_tObjectDeclaration740 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_EXTENDS_in_tObjectDeclaration762 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_tObjectDeclaration764 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_tObjectDeclaration785 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_tObjectDeclaration787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_COMMA_in_tObjectDeclaration790 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_typeList_in_tObjectDeclaration792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_tObjectDeclaration796 = new BitSet(new long[]{0x9C80080004000010L,0x0001000000008489L});
    public static final BitSet FOLLOW_tObjectFieldDeclaration_in_tObjectDeclaration801 = new BitSet(new long[]{0x9C80080004000010L,0x0001000000008489L});
    public static final BitSet FOLLOW_constructorDeclaration_in_tObjectDeclaration809 = new BitSet(new long[]{0x9C80080004000010L,0x0001000000008489L});
    public static final BitSet FOLLOW_RBRACE_in_tObjectDeclaration818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_tObjectFieldDeclaration833 = new BitSet(new long[]{0xDCD0288254000010L,0x0001000000000489L});
    public static final BitSet FOLLOW_modifiers_in_tObjectFieldDeclaration835 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_tObjectFieldDeclaration837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclarator_in_tObjectFieldDeclaration843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_tObjectFieldDeclaration845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_constructorDeclaration889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constructorDeclaration891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_formalParameters_in_constructorDeclaration901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_constructorDeclaration911 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C184DFBFL});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorDeclaration923 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C184DFBFL});
    public static final BitSet FOLLOW_blockStatement_in_constructorDeclaration945 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C184DFBFL});
    public static final BitSet FOLLOW_RBRACE_in_constructorDeclaration966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_normalClassDeclaration983 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_CLASS_in_normalClassDeclaration985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_normalClassDeclaration987 = new BitSet(new long[]{0x0002040000000000L,0x0008000000004000L});
    public static final BitSet FOLLOW_typeParameters_in_normalClassDeclaration998 = new BitSet(new long[]{0x0002040000000000L,0x0008000000004000L});
    public static final BitSet FOLLOW_EXTENDS_in_normalClassDeclaration1020 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_normalClassDeclaration1022 = new BitSet(new long[]{0x0002040000000000L,0x0008000000004000L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_normalClassDeclaration1044 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_typeList_in_normalClassDeclaration1046 = new BitSet(new long[]{0x0002040000000000L,0x0008000000004000L});
    public static final BitSet FOLLOW_classBody_in_normalClassDeclaration1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParameters1089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters1103 = new BitSet(new long[]{0x0000000000000000L,0x0004000000080000L});
    public static final BitSet FOLLOW_COMMA_in_typeParameters1118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters1120 = new BitSet(new long[]{0x0000000000000000L,0x0004000000080000L});
    public static final BitSet FOLLOW_GT_in_typeParameters1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeParameter1165 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_typeParameter1176 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_typeBound_in_typeParameter1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeBound1210 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_AMP_in_typeBound1221 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_typeBound1223 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_modifiers_in_enumDeclaration1255 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDeclaration1267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDeclaration1288 = new BitSet(new long[]{0x0002000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_enumDeclaration1299 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_typeList_in_enumDeclaration1301 = new BitSet(new long[]{0x0002000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_enumBody_in_enumDeclaration1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody1347 = new BitSet(new long[]{0x0000000000000010L,0x00010000000C8000L});
    public static final BitSet FOLLOW_enumConstants_in_enumBody1358 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C8000L});
    public static final BitSet FOLLOW_COMMA_in_enumBody1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000048000L});
    public static final BitSet FOLLOW_enumBodyDeclarations_in_enumBody1393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumConstant_in_enumConstants1435 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_COMMA_in_enumConstants1446 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_enumConstant_in_enumConstants1448 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_annotations_in_enumConstant1482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumConstant1503 = new BitSet(new long[]{0x0002040000000002L,0x0008000000005000L});
    public static final BitSet FOLLOW_arguments_in_enumConstant1514 = new BitSet(new long[]{0x0002040000000002L,0x0008000000004000L});
    public static final BitSet FOLLOW_classBody_in_enumConstant1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_enumBodyDeclarations1577 = new BitSet(new long[]{0xDCF02A8654000012L,0x0009000000044689L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_enumBodyDeclarations1589 = new BitSet(new long[]{0xDCF02A8654000012L,0x0009000000044689L});
    public static final BitSet FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_normalInterfaceDeclaration1654 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_normalInterfaceDeclaration1656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_normalInterfaceDeclaration1658 = new BitSet(new long[]{0x0000040000000000L,0x0008000000004000L});
    public static final BitSet FOLLOW_typeParameters_in_normalInterfaceDeclaration1669 = new BitSet(new long[]{0x0000040000000000L,0x0008000000004000L});
    public static final BitSet FOLLOW_EXTENDS_in_normalInterfaceDeclaration1691 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_typeList_in_normalInterfaceDeclaration1693 = new BitSet(new long[]{0x0000040000000000L,0x0008000000004000L});
    public static final BitSet FOLLOW_interfaceBody_in_normalInterfaceDeclaration1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList1733 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_COMMA_in_typeList1745 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_typeList1747 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_classBody1769 = new BitSet(new long[]{0xDCF02A8654000010L,0x000900000004C689L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody1781 = new BitSet(new long[]{0xDCF02A8654000010L,0x000900000004C689L});
    public static final BitSet FOLLOW_RBRACE_in_classBody1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceBody1823 = new BitSet(new long[]{0xDCF02A8654000010L,0x0009000000048689L});
    public static final BitSet FOLLOW_interfaceBodyDeclaration_in_interfaceBody1835 = new BitSet(new long[]{0xDCF02A8654000010L,0x0009000000048689L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceBody1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_classBodyDeclaration1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_classBodyDeclaration1888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_classBodyDeclaration1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberDecl_in_classBodyDeclaration1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDecl1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_memberDecl1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_memberDecl1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_memberDecl1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_methodDeclaration2012 = new BitSet(new long[]{0x0000000000000010L,0x0008000000000000L});
    public static final BitSet FOLLOW_typeParameters_in_methodDeclaration2023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration2044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration2054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004040L});
    public static final BitSet FOLLOW_THROWS_in_methodDeclaration2065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_qualifiedNameList_in_methodDeclaration2067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_methodDeclaration2088 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C184DFBFL});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_methodDeclaration2100 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C184DFBFL});
    public static final BitSet FOLLOW_blockStatement_in_methodDeclaration2122 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C184DFBFL});
    public static final BitSet FOLLOW_RBRACE_in_methodDeclaration2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_methodDeclaration2153 = new BitSet(new long[]{0x4050208250000010L,0x0008000000000200L});
    public static final BitSet FOLLOW_typeParameters_in_methodDeclaration2164 = new BitSet(new long[]{0x4050208250000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_type_in_methodDeclaration2186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VOID_in_methodDeclaration2200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration2220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration2230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000054040L});
    public static final BitSet FOLLOW_LBRACKET_in_methodDeclaration2241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_methodDeclaration2243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000054040L});
    public static final BitSet FOLLOW_THROWS_in_methodDeclaration2265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_qualifiedNameList_in_methodDeclaration2267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000044000L});
    public static final BitSet FOLLOW_block_in_methodDeclaration2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_methodDeclaration2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_fieldDeclaration2367 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_fieldDeclaration2377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration2391 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_COMMA_in_fieldDeclaration2402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration2404 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_SEMI_in_fieldDeclaration2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclarator2452 = new BitSet(new long[]{0x0000000000000002L,0x0000000000410000L});
    public static final BitSet FOLLOW_LBRACKET_in_variableDeclarator2465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_variableDeclarator2467 = new BitSet(new long[]{0x0000000000000002L,0x0000000000410000L});
    public static final BitSet FOLLOW_EQ_in_variableDeclarator2489 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1805212L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceFieldDeclaration_in_interfaceBodyDeclaration2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBodyDeclaration2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_interfaceBodyDeclaration2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_interfaceBodyDeclaration2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_interfaceBodyDeclaration2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_interfaceMethodDeclaration2590 = new BitSet(new long[]{0x4050208250000010L,0x0008000000000200L});
    public static final BitSet FOLLOW_typeParameters_in_interfaceMethodDeclaration2601 = new BitSet(new long[]{0x4050208250000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_type_in_interfaceMethodDeclaration2623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VOID_in_interfaceMethodDeclaration2634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_interfaceMethodDeclaration2654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_formalParameters_in_interfaceMethodDeclaration2664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050040L});
    public static final BitSet FOLLOW_LBRACKET_in_interfaceMethodDeclaration2675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_interfaceMethodDeclaration2677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050040L});
    public static final BitSet FOLLOW_THROWS_in_interfaceMethodDeclaration2699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_qualifiedNameList_in_interfaceMethodDeclaration2701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_interfaceMethodDeclaration2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_interfaceFieldDeclaration2736 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_interfaceFieldDeclaration2738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclarator_in_interfaceFieldDeclaration2740 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_COMMA_in_interfaceFieldDeclaration2751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclarator_in_interfaceFieldDeclaration2753 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_SEMI_in_interfaceFieldDeclaration2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_type2795 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_LBRACKET_in_type2806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_type2808 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_primitiveType_in_type2829 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_LBRACKET_in_type2840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_type2842 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classOrInterfaceType2874 = new BitSet(new long[]{0x0000000000000002L,0x0008000000100000L});
    public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType2885 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_classOrInterfaceType2907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classOrInterfaceType2909 = new BitSet(new long[]{0x0000000000000002L,0x0008000000100000L});
    public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType2924 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeArguments3062 = new BitSet(new long[]{0x4050208250000010L,0x0000000002000000L});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments3064 = new BitSet(new long[]{0x0000000000000000L,0x0004000000080000L});
    public static final BitSet FOLLOW_COMMA_in_typeArguments3075 = new BitSet(new long[]{0x4050208250000010L,0x0000000002000000L});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments3077 = new BitSet(new long[]{0x0000000000000000L,0x0004000000080000L});
    public static final BitSet FOLLOW_GT_in_typeArguments3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeArgument3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUES_in_typeArgument3129 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeArgument3153 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_typeArgument3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList3228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_COMMA_in_qualifiedNameList3239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList3241 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameters3272 = new BitSet(new long[]{0x4050288250000010L,0x0001000000002000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters3283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameters3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ellipsisParameterDecl_in_formalParameterDecls3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalParameterDecl_in_formalParameterDecls3335 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterDecls3346 = new BitSet(new long[]{0x4050288250000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_normalParameterDecl_in_formalParameterDecls3348 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_normalParameterDecl_in_formalParameterDecls3370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterDecls3380 = new BitSet(new long[]{0x4050288250000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_ellipsisParameterDecl_in_formalParameterDecls3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_normalParameterDecl3422 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_normalParameterDecl3424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_normalParameterDecl3426 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_LBRACKET_in_normalParameterDecl3437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_normalParameterDecl3439 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_variableModifiers_in_ellipsisParameterDecl3470 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_ellipsisParameterDecl3480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ELLIPSIS_in_ellipsisParameterDecl3483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ellipsisParameterDecl3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation3515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000012L});
    public static final BitSet FOLLOW_set_in_explicitConstructorInvocation3541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation3573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_explicitConstructorInvocation3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_explicitConstructorInvocation3586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_explicitConstructorInvocation3596 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation3607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation3628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation3638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_explicitConstructorInvocation3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedName3660 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_qualifiedName3671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedName3673 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_annotation_in_annotations3705 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_annotation3738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_qualifiedName_in_annotation3740 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation3754 = new BitSet(new long[]{0x4150208250003FF0L,0x00090003C1807212L});
    public static final BitSet FOLLOW_elementValuePairs_in_annotation3781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_elementValue_in_annotation3805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs3873 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_COMMA_in_elementValuePairs3884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs3886 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_elementValuePair3917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_EQ_in_elementValuePair3919 = new BitSet(new long[]{0x4150208250003FF0L,0x00090003C1805212L});
    public static final BitSet FOLLOW_elementValue_in_elementValuePair3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_elementValue3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_elementValue3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementValueArrayInitializer_in_elementValue3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_elementValueArrayInitializer3981 = new BitSet(new long[]{0x4150208250003FF0L,0x00090003C188D212L});
    public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer3992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000088000L});
    public static final BitSet FOLLOW_COMMA_in_elementValueArrayInitializer4007 = new BitSet(new long[]{0x4150208250003FF0L,0x00090003C1805212L});
    public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer4009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000088000L});
    public static final BitSet FOLLOW_COMMA_in_elementValueArrayInitializer4038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_elementValueArrayInitializer4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_annotationTypeDeclaration4065 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_annotationTypeDeclaration4067 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_annotationTypeDeclaration4077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_annotationTypeDeclaration4087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_annotationTypeBody_in_annotationTypeDeclaration4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_annotationTypeBody4118 = new BitSet(new long[]{0xDCF02A8654000010L,0x0001000000048489L});
    public static final BitSet FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody4130 = new BitSet(new long[]{0xDCF02A8654000010L,0x0001000000048489L});
    public static final BitSet FOLLOW_RBRACE_in_annotationTypeBody4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationMethodDeclaration_in_annotationTypeElementDeclaration4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceFieldDeclaration_in_annotationTypeElementDeclaration4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalClassDeclaration_in_annotationTypeElementDeclaration4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementDeclaration4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDeclaration_in_annotationTypeElementDeclaration4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationTypeDeclaration_in_annotationTypeElementDeclaration4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_annotationTypeElementDeclaration4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_annotationMethodDeclaration4254 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_annotationMethodDeclaration4256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_annotationMethodDeclaration4258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_annotationMethodDeclaration4268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_annotationMethodDeclaration4270 = new BitSet(new long[]{0x0000002000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_DEFAULT_in_annotationMethodDeclaration4273 = new BitSet(new long[]{0x4150208250003FF0L,0x00090003C1805212L});
    public static final BitSet FOLLOW_elementValue_in_annotationMethodDeclaration4275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_annotationMethodDeclaration4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block4328 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C184DFBFL});
    public static final BitSet FOLLOW_blockStatement_in_block4339 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C184DFBFL});
    public static final BitSet FOLLOW_RBRACE_in_block4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_blockStatement4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement4421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_localVariableDeclarationStatement4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_localVariableDeclaration4451 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration4453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration4463 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_COMMA_in_localVariableDeclaration4474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration4476 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_block_in_statement4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement4531 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_statement4551 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_COLON_in_statement4554 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_statement4556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement4570 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_statement4573 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_COLON_in_statement4576 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_statement4578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement4604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_parExpression_in_statement4606 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C1845FBFL});
    public static final BitSet FOLLOW_statement_in_statement4608 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement4611 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C1845FBFL});
    public static final BitSet FOLLOW_statement_in_statement4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatement_in_statement4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement4645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_parExpression_in_statement4647 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C1845FBFL});
    public static final BitSet FOLLOW_statement_in_statement4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement4659 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C1845FBFL});
    public static final BitSet FOLLOW_statement_in_statement4661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_WHILE_in_statement4663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_parExpression_in_statement4665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trystatement_in_statement4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement4687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_parExpression_in_statement4689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_statement4691 = new BitSet(new long[]{0x0000002080000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_switchBlockStatementGroups_in_statement4693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_statement4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_statement4705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_parExpression_in_statement4707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_statement4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement4719 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1841212L});
    public static final BitSet FOLLOW_expression_in_statement4722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement4737 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_statement4739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement4751 = new BitSet(new long[]{0x0000000000000010L,0x0000000000040000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement4766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement4793 = new BitSet(new long[]{0x0000000000000010L,0x0000000000040000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement4808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement4835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement4853 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_statement4855 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C1845FBFL});
    public static final BitSet FOLLOW_statement_in_statement4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups4889 = new BitSet(new long[]{0x0000002080000002L});
    public static final BitSet FOLLOW_switchLabel_in_switchBlockStatementGroup4918 = new BitSet(new long[]{0xFDF16AD67C003FF2L,0x00090003C1845FBFL});
    public static final BitSet FOLLOW_blockStatement_in_switchBlockStatementGroup4929 = new BitSet(new long[]{0xFDF16AD67C003FF2L,0x00090003C1845FBFL});
    public static final BitSet FOLLOW_CASE_in_switchLabel4960 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_switchLabel4962 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_switchLabel4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_switchLabel4974 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_switchLabel4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_trystatement4997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_trystatement4999 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_catches_in_trystatement5013 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_FINALLY_in_trystatement5015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_trystatement5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catches_in_trystatement5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_trystatement5045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_trystatement5047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchClause_in_catches5078 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_catchClause_in_catches5089 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause5120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause5122 = new BitSet(new long[]{0x4050288250000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_formalParameter_in_catchClause5124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause5134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_catchClause5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_formalParameter5157 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_formalParameter5159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_formalParameter5161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_LBRACKET_in_formalParameter5172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_formalParameter5174 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_FOR_in_forstatement5223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement5225 = new BitSet(new long[]{0x4050288250000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_variableModifiers_in_forstatement5227 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_forstatement5229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_forstatement5231 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_forstatement5233 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_forstatement5244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement5246 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C1845FBFL});
    public static final BitSet FOLLOW_statement_in_forstatement5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forstatement5280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement5282 = new BitSet(new long[]{0x4150288250003FF0L,0x00090003C1841212L});
    public static final BitSet FOLLOW_forInit_in_forstatement5302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_forstatement5323 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1841212L});
    public static final BitSet FOLLOW_expression_in_forstatement5343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_forstatement5364 = new BitSet(new long[]{0x4150288250003FF0L,0x00090003C1803212L});
    public static final BitSet FOLLOW_expressionList_in_forstatement5384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement5405 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C1845FBFL});
    public static final BitSet FOLLOW_statement_in_forstatement5407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression5457 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_parExpression5459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList5481 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_COMMA_in_expressionList5492 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_expressionList5494 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_conditionalExpression_in_expression5526 = new BitSet(new long[]{0x0000000000000002L,0x000CFF0000400000L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression5537 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_expression5539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignmentOperator5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignmentOperator5591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAREQ_in_assignmentOperator5601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignmentOperator5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignmentOperator5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAREQ_in_assignmentOperator5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARETEQ_in_assignmentOperator5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignmentOperator5651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_assignmentOperator5662 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_LT_in_assignmentOperator5664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator5677 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator5679 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator5681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator5683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator5694 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator5696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression5719 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_QUES_in_conditionalExpression5730 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression5732 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression5734 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression5767 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_BARBAR_in_conditionalOrExpression5778 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression5780 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression5811 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_AMPAMP_in_conditionalAndExpression5822 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression5824 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression5855 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_BAR_in_inclusiveOrExpression5866 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression5868 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression5899 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_CARET_in_exclusiveOrExpression5910 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression5912 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression5943 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_AMP_in_andExpression5954 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression5956 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression5987 = new BitSet(new long[]{0x0000000000000002L,0x0002000008000000L});
    public static final BitSet FOLLOW_set_in_equalityExpression6014 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression6064 = new BitSet(new long[]{0x0000000000000002L,0x0002000008000000L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression6095 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceOfExpression6106 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression6139 = new BitSet(new long[]{0x0000000000000002L,0x000C000000000000L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression6150 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression6152 = new BitSet(new long[]{0x0000000000000002L,0x000C000000000000L});
    public static final BitSet FOLLOW_LT_in_relationalOp6184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_EQ_in_relationalOp6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_relationalOp6197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_EQ_in_relationalOp6199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_relationalOp6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_relationalOp6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression6239 = new BitSet(new long[]{0x0000000000000002L,0x000C000000000000L});
    public static final BitSet FOLLOW_shiftOp_in_shiftExpression6250 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression6252 = new BitSet(new long[]{0x0000000000000002L,0x000C000000000000L});
    public static final BitSet FOLLOW_LT_in_shiftOp6285 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_LT_in_shiftOp6287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_shiftOp6298 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_GT_in_shiftOp6300 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_GT_in_shiftOp6302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_shiftOp6313 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_GT_in_shiftOp6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression6336 = new BitSet(new long[]{0x0000000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_set_in_additiveExpression6363 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression6413 = new BitSet(new long[]{0x0000000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression6451 = new BitSet(new long[]{0x0000000000000002L,0x0000008C00000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression6478 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression6546 = new BitSet(new long[]{0x0000000000000002L,0x0000008C00000000L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression6579 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression6582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryExpression6592 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unaryExpression6604 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression6606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_unaryExpression6616 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_unaryExpressionNotPlusMinus6648 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus6650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_unaryExpressionNotPlusMinus6660 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_unaryExpressionNotPlusMinus6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus6682 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0110000L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus6693 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0110000L});
    public static final BitSet FOLLOW_set_in_unaryExpressionNotPlusMinus6714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_castExpression6763 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_primitiveType_in_castExpression6765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_castExpression6767 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_unaryExpression_in_castExpression6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_castExpression6779 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_castExpression6781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_castExpression6783 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_castExpression6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary6807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary6829 = new BitSet(new long[]{0x0000000000000002L,0x0000000000111000L});
    public static final BitSet FOLLOW_DOT_in_primary6840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary6842 = new BitSet(new long[]{0x0000000000000002L,0x0000000000111000L});
    public static final BitSet FOLLOW_identifierSuffix_in_primary6864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary6885 = new BitSet(new long[]{0x0000000000000002L,0x0000000000111000L});
    public static final BitSet FOLLOW_DOT_in_primary6896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary6898 = new BitSet(new long[]{0x0000000000000002L,0x0000000000111000L});
    public static final BitSet FOLLOW_identifierSuffix_in_primary6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primary6941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000101000L});
    public static final BitSet FOLLOW_superSuffix_in_primary6951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_creator_in_primary6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_primary6981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000110000L});
    public static final BitSet FOLLOW_LBRACKET_in_primary6992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_primary6994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000110000L});
    public static final BitSet FOLLOW_DOT_in_primary7015 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_CLASS_in_primary7017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primary7027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_primary7029 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_CLASS_in_primary7031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_superSuffix7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_superSuffix7067 = new BitSet(new long[]{0x0000000000000010L,0x0008000000000000L});
    public static final BitSet FOLLOW_typeArguments_in_superSuffix7070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superSuffix7091 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_arguments_in_superSuffix7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_identifierSuffix7135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_identifierSuffix7137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000110000L});
    public static final BitSet FOLLOW_DOT_in_identifierSuffix7158 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_CLASS_in_identifierSuffix7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_identifierSuffix7171 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_identifierSuffix7173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_identifierSuffix7175 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifierSuffix7206 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_CLASS_in_identifierSuffix7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifierSuffix7218 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_identifierSuffix7220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifierSuffix7222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix7224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifierSuffix7234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_THIS_in_identifierSuffix7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifierSuffix7246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_identifierSuffix7248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix7250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_innerCreator_in_identifierSuffix7260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector7282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector7284 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_arguments_in_selector7295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector7316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_THIS_in_selector7318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector7328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_selector7330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000101000L});
    public static final BitSet FOLLOW_superSuffix_in_selector7340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_innerCreator_in_selector7350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_selector7360 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_selector7362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_selector7364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_creator7384 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_stmdoBlock_in_creator7386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_creator7406 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_creator7408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_creator7410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator7412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_creator7422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_creator7424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayCreator_in_creator7436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_stmdoBlock7454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_stmdoBlock7459 = new BitSet(new long[]{0x4051208250000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_stmBlockStatement_in_stmdoBlock7465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_stmdoBlock7469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmStat_in_stmBlockStatement7506 = new BitSet(new long[]{0x4051208250000012L,0x0000000000000010L});
    public static final BitSet FOLLOW_stmAssignment_in_stmStat7542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmExpression_in_stmStat7570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_stmStat7573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmExpression_in_stmStat7587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmIf_in_stmStat7609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmIf_in_stmStat7620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_stmAssignment7642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stmAssignment7644 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_stmAssignment7646 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_stmExpression_in_stmAssignment7648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_stmAssignment7651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stmExpression7677 = new BitSet(new long[]{0x0000000000000002L,0x0000000000111000L});
    public static final BitSet FOLLOW_DOT_in_stmExpression7688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stmExpression7690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000111000L});
    public static final BitSet FOLLOW_identifierSuffix_in_stmExpression7712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_stmExpression7738 = new BitSet(new long[]{0x0000000000000002L,0x0000000000111000L});
    public static final BitSet FOLLOW_DOT_in_stmExpression7749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stmExpression7751 = new BitSet(new long[]{0x0000000000000002L,0x0000000000111000L});
    public static final BitSet FOLLOW_identifierSuffix_in_stmExpression7773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_stmIf7816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_stmIf7818 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_stmIf7820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_stmIf7822 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004010L});
    public static final BitSet FOLLOW_stmExpression_in_stmIf7838 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_stmIf7852 = new BitSet(new long[]{0x4051208250000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_stmBlockStatement_in_stmIf7863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_stmIf7868 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ELSE_in_stmIf7888 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004010L});
    public static final BitSet FOLLOW_stmExpression_in_stmIf7901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_stmIf7915 = new BitSet(new long[]{0x4051208250000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_stmBlockStatement_in_stmIf7926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_stmIf7931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_arrayCreator7964 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_createdName_in_arrayCreator7966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayCreator7976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayCreator7978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000014000L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayCreator7989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayCreator7991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000014000L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreator8012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_arrayCreator8023 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_createdName_in_arrayCreator8025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayCreator8035 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_arrayCreator8037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayCreator8047 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayCreator8061 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_arrayCreator8063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayCreator8077 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayCreator8099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayCreator8101 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer8132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer8142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_arrayInitializer8162 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C188D212L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer8178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000088000L});
    public static final BitSet FOLLOW_COMMA_in_arrayInitializer8197 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1805212L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer8199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000088000L});
    public static final BitSet FOLLOW_COMMA_in_arrayInitializer8249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_arrayInitializer8262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_createdName8296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName8306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_innerCreator8327 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_NEW_in_innerCreator8329 = new BitSet(new long[]{0x0000000000000010L,0x0008000000000000L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_innerCreator8340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_innerCreator8361 = new BitSet(new long[]{0x0000000000000000L,0x0008000000001000L});
    public static final BitSet FOLLOW_typeArguments_in_innerCreator8372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_classCreatorRest_in_innerCreator8393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest8414 = new BitSet(new long[]{0x0002040000000002L,0x0008000000004000L});
    public static final BitSet FOLLOW_classBody_in_classCreatorRest8425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_nonWildcardTypeArguments8457 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_typeList_in_nonWildcardTypeArguments8459 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_GT_in_nonWildcardTypeArguments8469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments8489 = new BitSet(new long[]{0x4150288250003FF0L,0x00090003C1803212L});
    public static final BitSet FOLLOW_expressionList_in_arguments8492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_arguments8505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_classHeader8629 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_CLASS_in_classHeader8631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classHeader8633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_enumHeader8653 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_set_in_enumHeader8655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumHeader8661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_interfaceHeader8681 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceHeader8683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_interfaceHeader8685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_annotationHeader8705 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_annotationHeader8707 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_annotationHeader8709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_annotationHeader8711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_typeHeader8731 = new BitSet(new long[]{0x0020020400000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_CLASS_in_typeHeader8734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ENUM_in_typeHeader8736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_typeHeader8739 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_typeHeader8743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeHeader8747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_methodHeader8767 = new BitSet(new long[]{0x4050208250000010L,0x0008000000000200L});
    public static final BitSet FOLLOW_typeParameters_in_methodHeader8769 = new BitSet(new long[]{0x4050208250000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_type_in_methodHeader8773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VOID_in_methodHeader8775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodHeader8779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_methodHeader8781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_fieldHeader8801 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_fieldHeader8803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fieldHeader8805 = new BitSet(new long[]{0x0000000000000000L,0x00000000004D0000L});
    public static final BitSet FOLLOW_LBRACKET_in_fieldHeader8808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_fieldHeader8809 = new BitSet(new long[]{0x0000000000000000L,0x00000000004D0000L});
    public static final BitSet FOLLOW_set_in_fieldHeader8813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_localVariableHeader8839 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_localVariableHeader8841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableHeader8843 = new BitSet(new long[]{0x0000000000000000L,0x00000000004D0000L});
    public static final BitSet FOLLOW_LBRACKET_in_localVariableHeader8846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_localVariableHeader8847 = new BitSet(new long[]{0x0000000000000000L,0x00000000004D0000L});
    public static final BitSet FOLLOW_set_in_localVariableHeader8851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotations_in_synpred2_CMTJava78 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_packageDeclaration_in_synpred2_CMTJava107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_synpred12_CMTJava464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tObjectDeclaration_in_synpred27_CMTJava699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalClassDeclaration_in_synpred28_CMTJava707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tObjectFieldDeclaration_in_synpred32_CMTJava801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructorDeclaration_in_synpred33_CMTJava809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_synpred34_CMTJava923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalInterfaceDeclaration_in_synpred51_CMTJava1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_synpred60_CMTJava1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_synpred61_CMTJava1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_synpred62_CMTJava1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_synpred65_CMTJava2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_synpred67_CMTJava2012 = new BitSet(new long[]{0x0000000000000010L,0x0008000000000000L});
    public static final BitSet FOLLOW_typeParameters_in_synpred67_CMTJava2023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred67_CMTJava2044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_formalParameters_in_synpred67_CMTJava2054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004040L});
    public static final BitSet FOLLOW_THROWS_in_synpred67_CMTJava2065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_qualifiedNameList_in_synpred67_CMTJava2067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred67_CMTJava2088 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C184DFBFL});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_synpred67_CMTJava2100 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C184DFBFL});
    public static final BitSet FOLLOW_blockStatement_in_synpred67_CMTJava2122 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C184DFBFL});
    public static final BitSet FOLLOW_RBRACE_in_synpred67_CMTJava2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceFieldDeclaration_in_synpred76_CMTJava2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceMethodDeclaration_in_synpred77_CMTJava2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_synpred78_CMTJava2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_synpred79_CMTJava2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ellipsisParameterDecl_in_synpred104_CMTJava3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalParameterDecl_in_synpred106_CMTJava3335 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_COMMA_in_synpred106_CMTJava3346 = new BitSet(new long[]{0x4050288250000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_normalParameterDecl_in_synpred106_CMTJava3348 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_normalParameterDecl_in_synpred107_CMTJava3370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_COMMA_in_synpred107_CMTJava3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_synpred111_CMTJava3515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000012L});
    public static final BitSet FOLLOW_set_in_synpred111_CMTJava3541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_arguments_in_synpred111_CMTJava3573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_synpred111_CMTJava3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationMethodDeclaration_in_synpred125_CMTJava4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceFieldDeclaration_in_synpred126_CMTJava4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalClassDeclaration_in_synpred127_CMTJava4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalInterfaceDeclaration_in_synpred128_CMTJava4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDeclaration_in_synpred129_CMTJava4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationTypeDeclaration_in_synpred130_CMTJava4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_synpred133_CMTJava4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred134_CMTJava4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_synpred138_CMTJava4531 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_synpred138_CMTJava4551 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_COLON_in_synpred138_CMTJava4554 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_synpred138_CMTJava4556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_synpred138_CMTJava4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_synpred140_CMTJava4570 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_synpred140_CMTJava4573 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_COLON_in_synpred140_CMTJava4576 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_synpred140_CMTJava4578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_synpred140_CMTJava4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred141_CMTJava4611 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C1845FBFL});
    public static final BitSet FOLLOW_statement_in_synpred141_CMTJava4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred156_CMTJava4835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_synpred156_CMTJava4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred157_CMTJava4853 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_synpred157_CMTJava4855 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C1845FBFL});
    public static final BitSet FOLLOW_statement_in_synpred157_CMTJava4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catches_in_synpred161_CMTJava5013 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_FINALLY_in_synpred161_CMTJava5015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_synpred161_CMTJava5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catches_in_synpred162_CMTJava5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_synpred165_CMTJava5223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred165_CMTJava5225 = new BitSet(new long[]{0x4050288250000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_variableModifiers_in_synpred165_CMTJava5227 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_type_in_synpred165_CMTJava5229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred165_CMTJava5231 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_synpred165_CMTJava5233 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_synpred165_CMTJava5244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred165_CMTJava5246 = new BitSet(new long[]{0xFDF16AD67C003FF0L,0x00090003C1845FBFL});
    public static final BitSet FOLLOW_statement_in_synpred165_CMTJava5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_synpred169_CMTJava5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_synpred210_CMTJava6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred214_CMTJava6763 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_primitiveType_in_synpred214_CMTJava6765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred214_CMTJava6767 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_unaryExpression_in_synpred214_CMTJava6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred216_CMTJava6840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred216_CMTJava6842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_synpred217_CMTJava6864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred219_CMTJava6896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred219_CMTJava6898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_synpred220_CMTJava6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred232_CMTJava7171 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_synpred232_CMTJava7173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred232_CMTJava7175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_synpred244_CMTJava7384 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_stmdoBlock_in_synpred244_CMTJava7386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_synpred245_CMTJava7406 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_synpred245_CMTJava7408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_synpred245_CMTJava7410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_classCreatorRest_in_synpred245_CMTJava7412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_synpred246_CMTJava7422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_synpred246_CMTJava7424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_classCreatorRest_in_synpred246_CMTJava7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmAssignment_in_synpred248_CMTJava7542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmExpression_in_synpred249_CMTJava7559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_synpred249_CMTJava7561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmExpression_in_synpred250_CMTJava7587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmIf_in_synpred251_CMTJava7600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred251_CMTJava7602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_synpred260_CMTJava7964 = new BitSet(new long[]{0x4050208250000010L});
    public static final BitSet FOLLOW_createdName_in_synpred260_CMTJava7966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred260_CMTJava7976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred260_CMTJava7978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000014000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred260_CMTJava7989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred260_CMTJava7991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000014000L});
    public static final BitSet FOLLOW_arrayInitializer_in_synpred260_CMTJava8012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred261_CMTJava8061 = new BitSet(new long[]{0x4150208250003FF0L,0x00080003C1801212L});
    public static final BitSet FOLLOW_expression_in_synpred261_CMTJava8063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred261_CMTJava8077 = new BitSet(new long[]{0x0000000000000002L});

}