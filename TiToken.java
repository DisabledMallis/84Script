public enum TiToken {
    TO_DMS(0x1),
    TO_DEC(0x2),
    TO_FRAC(0x3),
    STORE(0x4),
    BOXPLOT(0x5),
    OPEN_SQUARE_BRACKET(0x6),
    CLOSE_SQUARE_BRACKET(0x7),
    OPEN_CURLEY_BRACKET(0x8),
    CLOSE_CURLEY_BRACKET(0x9),
    OPEN_BRACKET(0x10),
    CLOSE_BRACKET(0x11),
    BLANK(0x29),
    QUOTE(0x2A),
    COMMA(0x2B),
    EXCLAMATION_MARK(0x2D),
    NUM_0(0x30),
    NUM_1(0x31),
    NUM_2(0x32),
    NUM_3(0x33),
    NUM_4(0x34),
    NUM_5(0x35),
    NUM_6(0x36),
    NUM_7(0x37),
    NUM_8(0x38),
    NUM_9(0x39),
    PERIOD(0x3A),
    OR(0x3A),
    XOR(0x3D),
    COLON(0x3E),
    NEWLINE(0x3F),
    LETTER_A(0x41),
    LETTER_B(0x42),
    LETTER_C(0x43),
    LETTER_D(0x44),
    LETTER_E(0x45),
    LETTER_F(0x46),
    LETTER_G(0x47),
    LETTER_H(0x48),
    LETTER_I(0x49),
    LETTER_J(0x4A),
    LETTER_K(0x4B),
    LETTER_L(0x4C),
    LETTER_M(0x4D),
    LETTER_N(0x4E),
    LETTER_O(0x4F),
    LETTER_P(0x50),
    LETTER_Q(0x51),
    LETTER_R(0x52),
    LETTER_S(0x53),
    LETTER_T(0x54),
    LETTER_U(0x55),
    LETTER_V(0x56),
    LETTER_W(0x57),
    LETTER_X(0x58),
    LETTER_Y(0x59),
    LETTER_Z(0x5A);




    byte hex;
    TiToken(int hex)
    {
        this((byte)hex);
    };
    TiToken(byte hex)
    {
        this.hex = hex;
    };
    byte getByte()
    {
        return this.hex;
    };
}
