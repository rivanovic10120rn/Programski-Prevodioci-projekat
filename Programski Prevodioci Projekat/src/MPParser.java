
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Tue Jan 18 02:32:51 CET 2022
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;

/** CUP v0.10k generated parser.
  * @version Tue Jan 18 02:32:51 CET 2022
  */
public class MPParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public MPParser() {super();}

  /** Constructor which sets the default scanner. */
  public MPParser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\050\000\002\003\006\000\002\002\004\000\002\004" +
    "\006\000\002\005\004\000\002\005\003\000\002\007\006" +
    "\000\002\010\005\000\002\010\003\000\002\011\003\000" +
    "\002\011\003\000\002\011\003\000\002\011\003\000\002" +
    "\006\004\000\002\006\003\000\002\012\006\000\002\012" +
    "\006\000\002\012\007\000\002\012\007\000\002\012\003" +
    "\000\002\013\005\000\002\013\003\000\002\014\005\000" +
    "\002\014\003\000\002\015\005\000\002\015\003\000\002" +
    "\017\003\000\002\017\003\000\002\017\003\000\002\017" +
    "\003\000\002\017\003\000\002\017\003\000\002\016\005" +
    "\000\002\016\005\000\002\016\003\000\002\020\005\000" +
    "\002\020\005\000\002\020\003\000\002\021\003\000\002" +
    "\021\003\000\002\021\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\114\000\004\014\005\001\002\000\004\002\116\001" +
    "\002\000\004\005\006\001\002\000\004\006\007\001\002" +
    "\000\004\007\011\001\002\000\004\002\001\001\002\000" +
    "\004\015\012\001\002\000\006\011\ufffa\013\ufffa\001\002" +
    "\000\014\007\ufffd\015\ufffd\022\ufffd\024\ufffd\025\ufffd\001" +
    "\002\000\014\007\011\015\034\022\036\024\027\025\035" +
    "\001\002\000\006\011\017\013\016\001\002\000\004\015" +
    "\026\001\002\000\012\016\024\017\023\020\021\021\022" +
    "\001\002\000\004\012\025\001\002\000\004\012\ufff7\001" +
    "\002\000\004\012\ufff6\001\002\000\004\012\ufff8\001\002" +
    "\000\004\012\ufff9\001\002\000\014\007\ufffc\015\ufffc\022" +
    "\ufffc\024\ufffc\025\ufffc\001\002\000\006\011\ufffb\013\ufffb" +
    "\001\002\000\004\005\112\001\002\000\020\007\uffef\010" +
    "\uffef\015\uffef\022\uffef\023\uffef\024\uffef\025\uffef\001\002" +
    "\000\016\007\011\010\110\015\037\022\036\024\027\025" +
    "\035\001\002\000\014\007\ufffe\015\ufffe\022\ufffe\024\ufffe" +
    "\025\ufffe\001\002\000\016\007\ufff4\010\ufff4\015\ufff4\022" +
    "\ufff4\024\ufff4\025\ufff4\001\002\000\010\004\101\011\ufffa" +
    "\013\ufffa\001\002\000\004\005\104\001\002\000\014\007" +
    "\011\015\037\022\036\024\027\025\035\001\002\000\004" +
    "\004\101\001\002\000\004\023\041\001\002\000\010\005" +
    "\045\015\047\026\052\001\002\000\050\006\uffe9\007\uffe9" +
    "\010\uffe9\012\uffe9\015\uffe9\022\uffe9\023\uffe9\024\uffe9\025" +
    "\uffe9\030\uffe9\031\uffe9\033\071\034\065\035\073\036\070" +
    "\037\074\040\066\041\075\042\067\001\002\000\030\006" +
    "\uffed\007\uffed\010\uffed\012\uffed\015\uffed\022\uffed\023\uffed" +
    "\024\uffed\025\uffed\030\063\031\uffed\001\002\000\022\007" +
    "\ufff3\010\ufff3\015\ufff3\022\ufff3\023\ufff3\024\ufff3\025\ufff3" +
    "\031\061\001\002\000\010\005\045\015\047\026\052\001" +
    "\002\000\054\006\uffe0\007\uffe0\010\uffe0\012\uffe0\015\uffe0" +
    "\022\uffe0\023\uffe0\024\uffe0\025\uffe0\027\053\030\uffe0\031" +
    "\uffe0\032\054\033\uffe0\034\uffe0\035\uffe0\036\uffe0\037\uffe0" +
    "\040\uffe0\041\uffe0\042\uffe0\001\002\000\054\006\uffdc\007" +
    "\uffdc\010\uffdc\012\uffdc\015\uffdc\022\uffdc\023\uffdc\024\uffdc" +
    "\025\uffdc\027\uffdc\030\uffdc\031\uffdc\032\uffdc\033\uffdc\034" +
    "\uffdc\035\uffdc\036\uffdc\037\uffdc\040\uffdc\041\uffdc\042\uffdc" +
    "\001\002\000\054\006\uffdd\007\uffdd\010\uffdd\012\uffdd\015" +
    "\uffdd\022\uffdd\023\uffdd\024\uffdd\025\uffdd\027\uffdd\030\uffdd" +
    "\031\uffdd\032\uffdd\033\uffdd\034\uffdd\035\uffdd\036\uffdd\037" +
    "\uffdd\040\uffdd\041\uffdd\042\uffdd\001\002\000\030\006\uffeb" +
    "\007\uffeb\010\uffeb\012\uffeb\015\uffeb\022\uffeb\023\uffeb\024" +
    "\uffeb\025\uffeb\030\uffeb\031\uffeb\001\002\000\054\006\uffdb" +
    "\007\uffdb\010\uffdb\012\uffdb\015\uffdb\022\uffdb\023\uffdb\024" +
    "\uffdb\025\uffdb\027\uffdb\030\uffdb\031\uffdb\032\uffdb\033\uffdb" +
    "\034\uffdb\035\uffdb\036\uffdb\037\uffdb\040\uffdb\041\uffdb\042" +
    "\uffdb\001\002\000\010\005\045\015\047\026\052\001\002" +
    "\000\010\005\045\015\047\026\052\001\002\000\054\006" +
    "\uffde\007\uffde\010\uffde\012\uffde\015\uffde\022\uffde\023\uffde" +
    "\024\uffde\025\uffde\027\uffde\030\uffde\031\uffde\032\uffde\033" +
    "\uffde\034\uffde\035\uffde\036\uffde\037\uffde\040\uffde\041\uffde" +
    "\042\uffde\001\002\000\054\006\uffdf\007\uffdf\010\uffdf\012" +
    "\uffdf\015\uffdf\022\uffdf\023\uffdf\024\uffdf\025\uffdf\027\uffdf" +
    "\030\uffdf\031\uffdf\032\uffdf\033\uffdf\034\uffdf\035\uffdf\036" +
    "\uffdf\037\uffdf\040\uffdf\041\uffdf\042\uffdf\001\002\000\006" +
    "\006\060\031\061\001\002\000\054\006\uffda\007\uffda\010" +
    "\uffda\012\uffda\015\uffda\022\uffda\023\uffda\024\uffda\025\uffda" +
    "\027\uffda\030\uffda\031\uffda\032\uffda\033\uffda\034\uffda\035" +
    "\uffda\036\uffda\037\uffda\040\uffda\041\uffda\042\uffda\001\002" +
    "\000\010\005\045\015\047\026\052\001\002\000\030\006" +
    "\uffee\007\uffee\010\uffee\012\uffee\015\uffee\022\uffee\023\uffee" +
    "\024\uffee\025\uffee\030\063\031\uffee\001\002\000\010\005" +
    "\045\015\047\026\052\001\002\000\030\006\uffec\007\uffec" +
    "\010\uffec\012\uffec\015\uffec\022\uffec\023\uffec\024\uffec\025" +
    "\uffec\030\uffec\031\uffec\001\002\000\010\005\045\015\047" +
    "\026\052\001\002\000\010\005\uffe5\015\uffe5\026\uffe5\001" +
    "\002\000\010\005\uffe3\015\uffe3\026\uffe3\001\002\000\010" +
    "\005\uffe7\015\uffe7\026\uffe7\001\002\000\010\005\045\015" +
    "\047\026\052\001\002\000\010\005\045\015\047\026\052" +
    "\001\002\000\010\005\uffe8\015\uffe8\026\uffe8\001\002\000" +
    "\010\005\uffe6\015\uffe6\026\uffe6\001\002\000\010\005\uffe4" +
    "\015\uffe4\026\uffe4\001\002\000\034\006\uffea\007\uffea\010" +
    "\uffea\012\uffea\015\uffea\022\uffea\023\uffea\024\uffea\025\uffea" +
    "\030\uffea\031\uffea\033\071\034\065\001\002\000\054\006" +
    "\uffe2\007\uffe2\010\uffe2\012\uffe2\015\uffe2\022\uffe2\023\uffe2" +
    "\024\uffe2\025\uffe2\027\053\030\uffe2\031\uffe2\032\054\033" +
    "\uffe2\034\uffe2\035\uffe2\036\uffe2\037\uffe2\040\uffe2\041\uffe2" +
    "\042\uffe2\001\002\000\054\006\uffe1\007\uffe1\010\uffe1\012" +
    "\uffe1\015\uffe1\022\uffe1\023\uffe1\024\uffe1\025\uffe1\027\053" +
    "\030\uffe1\031\uffe1\032\054\033\uffe1\034\uffe1\035\uffe1\036" +
    "\uffe1\037\uffe1\040\uffe1\041\uffe1\042\uffe1\001\002\000\010" +
    "\005\045\015\047\026\052\001\002\000\006\012\103\031" +
    "\061\001\002\000\020\007\ufff2\010\ufff2\015\ufff2\022\ufff2" +
    "\023\ufff2\024\ufff2\025\ufff2\001\002\000\010\005\045\015" +
    "\047\026\052\001\002\000\006\006\106\031\061\001\002" +
    "\000\004\012\107\001\002\000\020\007\ufff0\010\ufff0\015" +
    "\ufff0\022\ufff0\023\ufff0\024\ufff0\025\ufff0\001\002\000\022" +
    "\002\uffff\007\uffff\010\uffff\015\uffff\022\uffff\023\uffff\024" +
    "\uffff\025\uffff\001\002\000\016\007\ufff5\010\ufff5\015\ufff5" +
    "\022\ufff5\024\ufff5\025\ufff5\001\002\000\004\015\113\001" +
    "\002\000\004\006\114\001\002\000\004\012\115\001\002" +
    "\000\020\007\ufff1\010\ufff1\015\ufff1\022\ufff1\023\ufff1\024" +
    "\ufff1\025\ufff1\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\114\000\004\003\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\007\001\001" +
    "\000\002\001\001\000\010\005\013\007\012\010\014\001" +
    "\001\000\002\001\001\000\002\001\001\000\014\004\027" +
    "\006\030\007\031\010\014\012\032\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\011\017\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\004\027\012" +
    "\110\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\004\027\012\037\001" +
    "\001\000\002\001\001\000\002\001\001\000\016\013\043" +
    "\014\042\015\050\016\041\020\045\021\047\001\001\000" +
    "\004\017\071\001\001\000\002\001\001\000\002\001\001" +
    "\000\016\013\056\014\042\015\050\016\041\020\045\021" +
    "\047\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\021" +
    "\055\001\001\000\004\021\054\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\014\014\061\015\050\016\041\020\045\021\047\001\001" +
    "\000\002\001\001\000\012\015\063\016\041\020\045\021" +
    "\047\001\001\000\002\001\001\000\006\020\077\021\047" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\020\076\021\047\001\001\000\010\016\075" +
    "\020\045\021\047\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\016\013\101\014\042\015\050\016" +
    "\041\020\045\021\047\001\001\000\002\001\001\000\002" +
    "\001\001\000\016\013\104\014\042\015\050\016\041\020" +
    "\045\021\047\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MPParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MPParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$MPParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



   public static void main( String[] args )
   {
      try
	  {
		   FileReader file = new FileReader( args[0] );
		   Scanner scanner = new MPLexer( file );
		   MPParser parser = new MPParser( scanner );
		   parser.parse();
	  }
	  catch( Exception e )
	  {
		   System.out.println(e);
	  }
   }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$MPParser$actions {
  private final MPParser parser;

  /** Constructor */
  CUP$MPParser$actions(MPParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$MPParser$do_action(
    int                        CUP$MPParser$act_num,
    java_cup.runtime.lr_parser CUP$MPParser$parser,
    java.util.Stack            CUP$MPParser$stack,
    int                        CUP$MPParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MPParser$result;

      /* select the action based on the action number */
      switch (CUP$MPParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // Factor ::= LEFTPAR Expression RIGHTPAR 
            {
              Object RESULT = null;
		
              System.out.println( "Redukcija po smeni 39." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*Factor*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // Factor ::= CONST 
            {
              Object RESULT = null;
		
              System.out.println( "Redukcija po smeni 38." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*Factor*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // Factor ::= ID 
            {
              Object RESULT = null;
		
              System.out.println( "Redukcija po smeni 37." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*Factor*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // Term ::= Factor 
            {
              Object RESULT = null;
		
             System.out.println( "Redukcija po smeni 36." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // Term ::= Term DIV Factor 
            {
              Object RESULT = null;
		
              System.out.println( "Redukcija po smeni 35." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // Term ::= Term MUL Factor 
            {
              Object RESULT = null;
		
              System.out.println( "Redukcija po smeni 34." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // ArExpression ::= Term 
            {
              Object RESULT = null;
		
             System.out.println( "Redukcija po smeni 33." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*ArExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // ArExpression ::= ArExpression MINUS Term 
            {
              Object RESULT = null;
		
             System.out.println( "Redukcija po smeni 32." );
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*ArExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // ArExpression ::= ArExpression PLUS Term 
            {
              Object RESULT = null;
		
             System.out.println( "Redukcija po smeni 31." );
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*ArExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // RelOp ::= MOREEQUAL 
            {
              Object RESULT = null;
		
                 System.out.println( "Redukcija po smeni 30." );
               
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // RelOp ::= MORETHAN 
            {
              Object RESULT = null;
		
                  System.out.println( "Redukcija po smeni 29." );
               
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // RelOp ::= NOTEQUAL 
            {
              Object RESULT = null;
		
                  System.out.println( "Redukcija po smeni 28." );
               
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // RelOp ::= EQUALS 
            {
              Object RESULT = null;
		
                  System.out.println( "Redukcija po smeni 27." );
               
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // RelOp ::= LESSEQUAL 
            {
              Object RESULT = null;
		
                  System.out.println( "Redukcija po smeni 26." );
               
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // RelOp ::= LESSTHAN 
            {
              Object RESULT = null;
		
              System.out.println( "Redukcija po smeni 25." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // RelExpression ::= ArExpression 
            {
              Object RESULT = null;
		
             System.out.println( "Redukcija po smeni 24." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*RelExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // RelExpression ::= ArExpression RelOp ArExpression 
            {
              Object RESULT = null;
		
             System.out.println( "Redukcija po smeni 23." );
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*RelExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // AndExpression ::= RelExpression 
            {
              Object RESULT = null;
		
            System.out.println( "Redukcija po smeni 22." );
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*AndExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // AndExpression ::= AndExpression AND RelExpression 
            {
              Object RESULT = null;
		
            System.out.println( "Redukcija po smeni 21." );
         
              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*AndExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Expression ::= AndExpression 
            {
              Object RESULT = null;
		
               System.out.println( "Redukcija po smeni 20." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Expression ::= Expression OR AndExpression 
            {
              Object RESULT = null;
		
               System.out.println( "Redukcija po smeni 19." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Statement ::= Block 
            {
              Object RESULT = null;
		
              System.out.println( "Redukcija po smeni 18." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Statement ::= WRITE LEFTPAR Expression RIGHTPAR SEMI 
            {
              Object RESULT = null;
		
              System.out.println( "Redukcija po smeni 17." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-4)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Statement ::= READ LEFTPAR ID RIGHTPAR SEMI 
            {
              Object RESULT = null;
		
              System.out.println( "Redukcija po smeni 16." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-4)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Statement ::= ID ASSIGN Expression SEMI 
            {
              Object RESULT = null;
		
              System.out.println( "Redukcija po smeni 15." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Statement ::= DO Statement WHILE Expression 
            {
              Object RESULT = null;
		
              System.out.println( "Redukcija po smeni 14." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // StatementList ::= Statement 
            {
              Object RESULT = null;
		
                System.out.println( "Redukcija po smeni 13.");
             
              CUP$MPParser$result = new java_cup.runtime.Symbol(4/*StatementList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // StatementList ::= StatementList Statement 
            {
              Object RESULT = null;
		
                System.out.println( "Redukcija po smeni 12." );
             
              CUP$MPParser$result = new java_cup.runtime.Symbol(4/*StatementList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Type ::= BOOL 
            {
              Object RESULT = null;
		
           System.out.println( "Redukcija po smeni 11." );
        
              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Type ::= REAL 
            {
              Object RESULT = null;
		
           System.out.println( "Redukcija po smeni 10." );
        
              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Type ::= CHAR 
            {
              Object RESULT = null;
		
           System.out.println( "Redukcija po smeni 9." );
        
              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Type ::= INT 
            {
              Object RESULT = null;
		
           System.out.println( "Redukcija po smeni 8." );
        
              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NameList ::= ID 
            {
              Object RESULT = null;
		
                System.out.println( "Redukcija po smeni 7." );
             
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NameList ::= NameList COMMA ID 
            {
              Object RESULT = null;
		
                System.out.println( "Redukcija po smeni 6." );
             
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // VarDecl ::= NameList DOTDOT Type SEMI 
            {
              Object RESULT = null;
		
                   System.out.println( "Redukcija po smeni 5." );
                
              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*VarDecl*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // VarList ::= VarDecl 
            {
              Object RESULT = null;
		
               System.out.println( "Redukcija po smeni 4." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*VarList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // VarList ::= VarList VarDecl 
            {
              Object RESULT = null;
		
               System.out.println( "Redukcija po smeni 3." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*VarList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Block ::= LEFTCURLY VarList StatementList RIGHTCURLY 
            {
              Object RESULT = null;
		
                System.out.println( "Redukcija po smeni 2." );
             
              CUP$MPParser$result = new java_cup.runtime.Symbol(2/*Block*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Program EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		RESULT = start_val;
              CUP$MPParser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$MPParser$parser.done_parsing();
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Program ::= MAIN LEFTPAR RIGHTPAR Block 
            {
              Object RESULT = null;
		
               System.out.println( "Redukcija po smeni 1." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(1/*Program*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

