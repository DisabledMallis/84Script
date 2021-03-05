public enum TiToken {
    TO_DMS(0x1, "TO_DMS"),
    TO_DEC(0x2, ">DEC"),
    TO_FRAC(0x3, ">FRAC"),
    STORE(0x4, "->"),
    BOXPLOT(0x5, "BOXPLOT"),
    OPEN_SQUARE_BRACKET(0x6, "["),
    CLOSE_SQUARE_BRACKET(0x7, "]"),
    OPEN_CURLEY_BRACKET(0x8, "{"),
    CLOSE_CURLEY_BRACKET(0x9, "}"),
    OPEN_BRACKET(0x10, "("),
    CLOSE_BRACKET(0x11, ")"),
    BLANK(0x29, " "),
    QUOTE(0x2A, "\""),
    COMMA(0x2B, ","),
    EXCLAMATION_MARK(0x2D, "!"),
    NUM_0(0x30, "0"),
    NUM_1(0x31, "1"),
    NUM_2(0x32, "2"),
    NUM_3(0x33, "3"),
    NUM_4(0x34, "4"),
    NUM_5(0x35, "5"),
    NUM_6(0x36, "6"),
    NUM_7(0x37, "7"),
    NUM_8(0x38, "8"),
    NUM_9(0x39, "9"),
    PERIOD(0x3A, "."),
    OR(0x3A, "OR"),
    XOR(0x3D, "XOR"),
    COLON(0x3E, ":"),
    NEWLINE(0x3F, "\n"),
    LETTER_A(0x41, "A"),
    LETTER_B(0x42, "B"),
    LETTER_C(0x43, "C"),
    LETTER_D(0x44, "D"),
    LETTER_E(0x45, "E"),
    LETTER_F(0x46, "F"),
    LETTER_G(0x47, "G"),
    LETTER_H(0x48, "H"),
    LETTER_I(0x49, "I"),
    LETTER_J(0x4A, "J"),
    LETTER_K(0x4B, "K"),
    LETTER_L(0x4C, "L"),
    LETTER_M(0x4D, "M"),
    LETTER_N(0x4E, "N"),
    LETTER_O(0x4F, "O"),
    LETTER_P(0x50, "P"),
    LETTER_Q(0x51, "Q"),
    LETTER_R(0x52, "R"),
    LETTER_S(0x53, "S"),
    LETTER_T(0x54, "T"),
    LETTER_U(0x55, "U"),
    LETTER_V(0x56, "V"),
    LETTER_W(0x57, "W"),
    LETTER_X(0x58, "X"),
    LETTER_Y(0x59, "Y"),
    LETTER_Z(0x5A, "Z"),
    DISP(0xDE, "DISP ");


    byte hex;
    String str;
    TiToken(int hex, String strRep)
    {
        this((byte)hex, strRep);
    };
    TiToken(byte hex, String strRep)
    {
        this.hex = hex;
        this.str = strRep;
    };
    byte getByte()
    {
        return this.hex;
    };
    public static TiToken getToken(byte token)
    {
      for(TiToken t : TiToken.values())
      {
        if(t.hex == token)
        {
          return t;
        }
      }
      return null;
    };
}
