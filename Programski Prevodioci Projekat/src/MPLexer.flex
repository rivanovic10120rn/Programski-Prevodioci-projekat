// import section
import java_cup.runtime.*;

%%
// declaration section
%class MPLexer

%cup

%line
%column

%eofval{
	return new Symbol( sym.EOF );
%eofval}


//states
%state COMMENT
//macros
slovo = [a-zA-Z]
cifra = [0-9]
decimal = [1-9]+{cifra}* | 0
hex = [0-9a-fA-F]+
znak = [\!\"\#\$\%\&\'\(\)\*\+\-\,\.\/\:\;\<\=\>\?\@\[\]\\\^\_\`\{\}\|\~]
int = \${hex} | {decimal}
real = {cifra}+\.({cifra})+(E(\+|\-){cifra})+ | \.{cifra}(E(\+|\-){cifra})+
char = \'{znak}\'
bool = true | false

%%
// rules section
\-\-			{ yybegin( COMMENT ); }
<COMMENT>\-\-	{ yybegin( YYINITIAL ); }

[\t\r\n ]		{ ; }

//operators
"+"				{ return new Symbol( sym.PLUS ); }
"*"				{ return new Symbol( sym.MUL );  }
"-"				{ return new Symbol( sym.MINUS ); }
"/"				{ return new Symbol( sym.DIV ); }
"&&"			{ return new Symbol( sym.AND ); }
"||"			{ return new Symbol( sym.OR ); }
"<"			    { return new Symbol( sym.LESSTHAN ); }
"<="			{ return new Symbol( sym.LESSEQUAL ); }
"=="			{ return new Symbol( sym.EQUALS ); }
"!="			{ return new Symbol( sym.NOTEQUAL ); }
">"			    { return new Symbol( sym.MORETHAN ); }
">="			{ return new Symbol( sym.MOREEQUAL ); }

//separators
";"				{ return new Symbol( sym.SEMI );	}
","				{ return new Symbol( sym.COMMA );	}
":"				{ return new Symbol( sym.DOTDOT ); }
"="				{ return new Symbol( sym.ASSIGN ); }
"("				{ return new Symbol( sym.LEFTPAR ); }
")"				{ return new Symbol( sym.RIGHTPAR ); }
"{"				{ return new Symbol( sym.LEFTCURLY ); }
"}"				{ return new Symbol( sym.RIGHTCURLY ); }

//keywords
"main"		    { return new Symbol( sym.MAIN );	}
"int"		    { return new Symbol( sym.INT );	}
"char"			{ return new Symbol( sym.CHAR );	}
"real"			{ return new Symbol( sym.REAL );	}
"write"			{ return new Symbol( sym.WRITE );	}
"bool"			{ return new Symbol( sym.BOOL );	}
"do"			{ return new Symbol( sym.DO );	}
"while"			{ return new Symbol( sym.WHILE );	}
"read"			{ return new Symbol( sym.READ );	}
"write"			{ return new Symbol( sym.WRITE );	}

//id-s
({slovo}|"_")({slovo}|{cifra}|"_")*	{ return new Symbol( sym.ID ); }

//constants
{int}|{real}|{char}		{ return new Symbol( sym.CONST ); }


//error symbol
.		{ System.out.println( "ERROR: " + yytext() ); }

