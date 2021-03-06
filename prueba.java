/* The following code was generated by JFlex 1.4.3 on 4/15/12 7:12 PM */

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/15/12 7:12 PM from the specification file
 * <tt>prueba.flex</tt>
 */
class prueba implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\44\1\1\2\0\1\2\22\0\1\3\1\0\1\43\3\0"+
    "\1\45\1\52\1\16\1\17\1\47\1\51\1\4\1\42\1\53\1\50"+
    "\12\6\2\0\1\36\1\34\1\35\2\0\1\13\1\21\1\32\1\10"+
    "\1\26\1\27\1\46\1\33\1\11\2\5\1\24\1\12\1\31\1\15"+
    "\1\41\1\5\1\25\1\14\1\20\1\30\1\23\1\40\1\37\1\22"+
    "\1\5\4\0\1\7\1\0\1\13\1\21\1\32\1\10\1\26\1\27"+
    "\1\46\1\33\1\11\2\5\1\24\1\12\1\31\1\15\1\41\1\5"+
    "\1\25\1\14\1\20\1\30\1\23\1\40\1\37\1\22\1\5\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\1\5\1\6"+
    "\5\5\1\7\1\10\7\5\1\11\2\12\2\5\1\13"+
    "\1\1\1\3\1\1\1\14\1\15\1\16\1\1\1\17"+
    "\2\0\1\5\1\20\1\21\1\5\1\22\3\5\1\12"+
    "\1\23\17\5\1\12\2\5\1\0\1\24\1\25\1\26"+
    "\3\5\1\27\10\5\1\30\2\5\1\31\1\5\1\32"+
    "\7\5\1\33\1\34\1\35\3\5\1\36\1\37\1\40"+
    "\2\5\1\41\1\42\3\5\1\43\2\5\1\44\1\5"+
    "\1\45\1\5\1\46\1\47\1\5\1\50\3\5\1\51"+
    "\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[127];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\204\0\260\0\54\0\334\0\u0108"+
    "\0\u0134\0\u0160\0\u018c\0\u01b8\0\u01e4\0\54\0\54\0\u0210"+
    "\0\u023c\0\u0268\0\u0294\0\u02c0\0\u02ec\0\u0318\0\54\0\u0344"+
    "\0\u0370\0\u039c\0\u03c8\0\u0108\0\u03f4\0\u0420\0\u044c\0\54"+
    "\0\54\0\54\0\u0478\0\54\0\204\0\u0478\0\u04a4\0\334"+
    "\0\334\0\u04d0\0\334\0\u04fc\0\u0528\0\u0554\0\334\0\334"+
    "\0\u0580\0\u05ac\0\u05d8\0\u0604\0\u0630\0\u065c\0\u0688\0\u06b4"+
    "\0\u06e0\0\u070c\0\u0738\0\u0764\0\u0790\0\u07bc\0\u07e8\0\54"+
    "\0\u0814\0\u0840\0\u03f4\0\u086c\0\54\0\334\0\u0898\0\u08c4"+
    "\0\u08f0\0\334\0\u091c\0\u0948\0\u0974\0\u09a0\0\u09cc\0\u09f8"+
    "\0\u0a24\0\u0a50\0\334\0\u0a7c\0\u0aa8\0\334\0\u0ad4\0\334"+
    "\0\u0b00\0\u0b2c\0\u0b58\0\u0b84\0\u0bb0\0\u0bdc\0\u0c08\0\334"+
    "\0\334\0\334\0\u0c34\0\u0c60\0\u0c8c\0\334\0\u0cb8\0\334"+
    "\0\u0ce4\0\u0d10\0\334\0\334\0\u0d3c\0\u0d68\0\u0d94\0\334"+
    "\0\u0dc0\0\u0dec\0\334\0\u0e18\0\334\0\u0e44\0\u0e70\0\334"+
    "\0\u0e9c\0\334\0\u0ec8\0\u0ef4\0\u0f20\0\334\0\334";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[127];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\2"+
    "\1\11\1\12\1\7\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\2\7\1\22\1\7\1\23\1\24\1\7"+
    "\1\25\1\26\1\7\1\27\1\30\1\31\1\32\1\33"+
    "\1\7\1\34\1\35\1\36\1\37\1\7\1\40\1\41"+
    "\1\42\1\43\1\44\55\0\1\3\1\45\1\3\46\0"+
    "\1\46\2\0\1\3\55\0\1\5\55\0\11\7\2\0"+
    "\14\7\3\0\3\7\4\0\1\7\13\0\1\10\52\0"+
    "\4\7\1\47\3\7\1\50\2\0\14\7\3\0\3\7"+
    "\4\0\1\7\12\0\11\7\2\0\7\7\1\51\1\7"+
    "\1\52\2\7\3\0\3\7\4\0\1\7\12\0\7\7"+
    "\1\53\1\7\2\0\11\7\1\54\2\7\3\0\3\7"+
    "\4\0\1\7\12\0\11\7\2\0\1\55\7\7\1\56"+
    "\3\7\3\0\3\7\4\0\1\7\12\0\11\7\2\0"+
    "\5\7\1\57\6\7\3\0\3\7\4\0\1\7\12\0"+
    "\10\7\1\60\2\0\2\7\1\61\2\7\1\62\5\7"+
    "\1\63\3\0\3\7\4\0\1\7\12\0\10\7\1\64"+
    "\2\0\2\7\1\65\11\7\3\0\3\7\4\0\1\7"+
    "\12\0\10\7\1\66\2\0\14\7\3\0\3\7\4\0"+
    "\1\7\12\0\11\7\2\0\4\7\1\67\4\7\1\70"+
    "\2\7\3\0\1\71\2\7\4\0\1\7\12\0\6\7"+
    "\1\72\1\7\1\73\2\0\10\7\1\74\3\7\3\0"+
    "\3\7\4\0\1\7\12\0\10\7\1\75\2\0\6\7"+
    "\1\76\5\7\3\0\3\7\4\0\1\7\12\0\11\7"+
    "\2\0\13\7\1\77\3\0\3\7\4\0\1\7\41\0"+
    "\1\100\53\0\2\100\23\0\10\7\1\15\2\0\14\7"+
    "\3\0\3\7\4\0\1\7\12\0\11\7\2\0\5\7"+
    "\1\101\5\7\1\102\3\0\3\7\4\0\1\7\5\0"+
    "\1\103\1\0\41\103\1\104\10\103\44\0\1\36\16\0"+
    "\1\105\44\0\1\46\1\3\52\46\5\0\5\7\1\106"+
    "\3\7\2\0\14\7\3\0\3\7\4\0\1\7\12\0"+
    "\11\7\2\0\1\107\13\7\3\0\2\7\1\110\4\0"+
    "\1\7\12\0\3\7\1\57\5\7\2\0\14\7\3\0"+
    "\3\7\4\0\1\7\12\0\11\7\2\0\5\7\1\111"+
    "\6\7\3\0\3\7\4\0\1\7\12\0\11\7\2\0"+
    "\1\7\1\112\12\7\3\0\3\7\4\0\1\7\12\0"+
    "\11\7\2\0\14\7\3\0\2\7\1\113\4\0\1\7"+
    "\12\0\11\7\2\0\10\7\1\114\3\7\3\0\3\7"+
    "\4\0\1\7\12\0\11\7\2\0\6\7\1\115\5\7"+
    "\3\0\3\7\4\0\1\7\12\0\10\7\1\116\2\0"+
    "\14\7\3\0\3\7\4\0\1\7\12\0\11\7\2\0"+
    "\3\7\1\117\1\7\1\120\6\7\3\0\3\7\4\0"+
    "\1\7\12\0\10\7\1\121\2\0\14\7\3\0\3\7"+
    "\4\0\1\7\12\0\7\7\1\122\1\7\2\0\14\7"+
    "\3\0\3\7\4\0\1\7\12\0\3\7\1\123\5\7"+
    "\2\0\14\7\3\0\3\7\4\0\1\7\12\0\4\7"+
    "\1\124\4\7\2\0\14\7\3\0\3\7\4\0\1\7"+
    "\12\0\11\7\2\0\4\7\1\125\7\7\3\0\3\7"+
    "\4\0\1\7\12\0\11\7\2\0\5\7\1\126\6\7"+
    "\3\0\3\7\4\0\1\7\12\0\11\7\2\0\11\7"+
    "\1\127\2\7\3\0\3\7\4\0\1\7\12\0\11\7"+
    "\2\0\1\130\13\7\3\0\3\7\4\0\1\7\12\0"+
    "\11\7\2\0\14\7\3\0\1\131\2\7\4\0\1\7"+
    "\12\0\6\7\1\132\2\7\2\0\14\7\3\0\3\7"+
    "\4\0\1\7\12\0\4\7\1\133\4\7\2\0\14\7"+
    "\3\0\3\7\4\0\1\7\12\0\4\7\1\134\4\7"+
    "\2\0\14\7\3\0\3\7\4\0\1\7\5\0\1\103"+
    "\1\0\1\103\1\104\37\103\2\104\7\103\5\0\11\7"+
    "\2\0\6\7\1\135\5\7\3\0\3\7\4\0\1\7"+
    "\12\0\11\7\2\0\10\7\1\136\3\7\3\0\3\7"+
    "\4\0\1\7\12\0\4\7\1\137\4\7\2\0\14\7"+
    "\3\0\3\7\4\0\1\7\12\0\11\7\2\0\6\7"+
    "\1\140\5\7\3\0\3\7\4\0\1\7\12\0\11\7"+
    "\2\0\6\7\1\141\5\7\3\0\3\7\4\0\1\7"+
    "\12\0\11\7\2\0\11\7\1\142\2\7\3\0\3\7"+
    "\4\0\1\7\12\0\11\7\2\0\4\7\1\143\7\7"+
    "\3\0\3\7\4\0\1\7\12\0\6\7\1\144\2\7"+
    "\2\0\14\7\3\0\3\7\4\0\1\7\12\0\11\7"+
    "\2\0\6\7\1\145\5\7\3\0\3\7\4\0\1\7"+
    "\12\0\11\7\2\0\14\7\3\0\2\7\1\146\4\0"+
    "\1\7\12\0\11\7\2\0\6\7\1\147\5\7\3\0"+
    "\3\7\4\0\1\7\12\0\11\7\2\0\1\150\13\7"+
    "\3\0\3\7\4\0\1\7\12\0\7\7\1\151\1\7"+
    "\2\0\14\7\3\0\3\7\4\0\1\7\12\0\11\7"+
    "\2\0\12\7\1\152\1\7\3\0\3\7\4\0\1\7"+
    "\12\0\11\7\2\0\1\153\13\7\3\0\3\7\4\0"+
    "\1\7\12\0\11\7\2\0\5\7\1\154\6\7\3\0"+
    "\3\7\4\0\1\7\12\0\11\7\2\0\1\155\13\7"+
    "\3\0\3\7\4\0\1\7\12\0\11\7\2\0\4\7"+
    "\1\156\7\7\3\0\3\7\4\0\1\7\12\0\11\7"+
    "\2\0\14\7\3\0\3\7\4\0\1\157\12\0\11\7"+
    "\2\0\1\160\13\7\3\0\3\7\4\0\1\7\12\0"+
    "\11\7\2\0\11\7\1\161\2\7\3\0\3\7\4\0"+
    "\1\7\12\0\11\7\2\0\6\7\1\162\5\7\3\0"+
    "\3\7\4\0\1\7\12\0\11\7\2\0\4\7\1\163"+
    "\7\7\3\0\3\7\4\0\1\7\12\0\11\7\2\0"+
    "\7\7\1\163\4\7\3\0\3\7\4\0\1\7\12\0"+
    "\4\7\1\164\4\7\2\0\14\7\3\0\3\7\4\0"+
    "\1\7\12\0\11\7\2\0\6\7\1\165\5\7\3\0"+
    "\3\7\4\0\1\7\12\0\11\7\2\0\1\166\13\7"+
    "\3\0\3\7\4\0\1\7\12\0\11\7\2\0\6\7"+
    "\1\167\5\7\3\0\3\7\4\0\1\7\12\0\11\7"+
    "\2\0\6\7\1\170\5\7\3\0\3\7\4\0\1\7"+
    "\12\0\11\7\2\0\6\7\1\132\5\7\3\0\3\7"+
    "\4\0\1\7\12\0\11\7\2\0\14\7\3\0\3\7"+
    "\4\0\1\154\12\0\6\7\1\171\2\7\2\0\14\7"+
    "\3\0\3\7\4\0\1\7\12\0\11\7\2\0\7\7"+
    "\1\172\4\7\3\0\3\7\4\0\1\7\12\0\4\7"+
    "\1\173\4\7\2\0\14\7\3\0\3\7\4\0\1\7"+
    "\12\0\11\7\2\0\4\7\1\174\7\7\3\0\3\7"+
    "\4\0\1\7\12\0\11\7\2\0\11\7\1\154\2\7"+
    "\3\0\3\7\4\0\1\7\12\0\10\7\1\175\2\0"+
    "\14\7\3\0\3\7\4\0\1\7\12\0\11\7\2\0"+
    "\11\7\1\176\2\7\3\0\3\7\4\0\1\7\12\0"+
    "\11\7\2\0\11\7\1\177\2\7\3\0\3\7\4\0"+
    "\1\7\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3916];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\1\11\7\1\2\11\7\1\1\11"+
    "\10\1\3\11\1\1\1\11\2\0\31\1\1\11\2\1"+
    "\1\0\1\1\1\11\72\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[127];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

  String errores_flex = "";
	
  private Symbol symbol(int type){
		return new Symbol(type,yyline,yycolumn);
	}
	
	private Symbol symbol(int type,Object value){
		return new Symbol(type,yyline,yycolumn,value);
	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  prueba(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  prueba(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 160) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 38: 
          { return symbol(sym.WRITE);
          }
        case 43: break;
        case 15: 
          { return symbol(sym.PUNTO);
          }
        case 44: break;
        case 19: 
          { return symbol(sym.TO);
          }
        case 45: break;
        case 13: 
          { return symbol(sym.ENTRE);
          }
        case 46: break;
        case 10: 
          { return symbol(sym.OPREL,yytext());
          }
        case 47: break;
        case 24: 
          { return symbol(sym.END);
          }
        case 48: break;
        case 21: 
          { return symbol(sym.SALTOCADENA);
          }
        case 49: break;
        case 9: 
          { return symbol(sym.IGUAL,yytext());
          }
        case 50: break;
        case 11: 
          { return symbol(sym.MENOS);
          }
        case 51: break;
        case 26: 
          { return symbol(sym.NOT);
          }
        case 52: break;
        case 22: 
          { return symbol(sym.DIM);
          }
        case 53: break;
        case 30: 
          { return symbol(sym.LOOP);
          }
        case 54: break;
        case 32: 
          { return symbol(sym.EXIT);
          }
        case 55: break;
        case 33: 
          { return symbol(sym.NEXT);
          }
        case 56: break;
        case 8: 
          { return symbol(sym.PARIZQ);
          }
        case 57: break;
        case 36: 
          { return symbol(sym.REF, yytext());
          }
        case 58: break;
        case 28: 
          { return symbol(sym.TRUE);
          }
        case 59: break;
        case 23: 
          { return symbol(sym.SUB);
          }
        case 60: break;
        case 27: 
          { return symbol(sym.TYPE);
          }
        case 61: break;
        case 40: 
          { return symbol(sym.ELSEIF);
          }
        case 62: break;
        case 16: 
          { return symbol(sym.DO);
          }
        case 63: break;
        case 31: 
          { return symbol(sym.ELSE);
          }
        case 64: break;
        case 29: 
          { return symbol(sym.THEN);
          }
        case 65: break;
        case 39: 
          { return symbol(sym.WHILE);
          }
        case 66: break;
        case 17: 
          { return symbol(sym.IF);
          }
        case 67: break;
        case 41: 
          { return symbol(sym.WRITELN);
          }
        case 68: break;
        case 1: 
          { errores_flex += "Error: Caracter ilegal -> "+ yytext() + " linea " + (yyline+1) + " columna" + (yycolumn+1);
          }
        case 69: break;
        case 34: 
          { return symbol(sym.TIPO,yytext());
          }
        case 70: break;
        case 5: 
          { return symbol(sym.NAME,yytext());
          }
        case 71: break;
        case 2: 
          { return symbol(sym.FIN);
          }
        case 72: break;
        case 25: 
          { return symbol(sym.FOR);
          }
        case 73: break;
        case 6: 
          { return symbol(sym.NUM,yytext());
          }
        case 74: break;
        case 35: 
          { return symbol(sym.INPUT);
          }
        case 75: break;
        case 18: 
          { return symbol(sym.AS);
          }
        case 76: break;
        case 4: 
          { return symbol(sym.SEPARADOR);
          }
        case 77: break;
        case 42: 
          { return symbol(sym.FUNCTION);
          }
        case 78: break;
        case 14: 
          { return symbol(sym.MAS);
          }
        case 79: break;
        case 12: 
          { return symbol(sym.POR);
          }
        case 80: break;
        case 37: 
          { return symbol(sym.FALSE);
          }
        case 81: break;
        case 20: 
          { return symbol(sym.CADENA,yytext());
          }
        case 82: break;
        case 3: 
          { 
          }
        case 83: break;
        case 7: 
          { return symbol(sym.PARDER);
          }
        case 84: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java prueba <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        prueba scanner = null;
        try {
          scanner = new prueba( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ) scanner.next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
