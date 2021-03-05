public enum TIToken {
    TO_DMS(0x1),
    TO_DEC(0x2),
    TO_FRAC(0x3),
    STORE(0x4),
    NUM_0(0x30),
    NUM_1(0x31),
    NUM_2(0x32),
    NUM_3(0x33),
    NUM_4(0x34),
    NUM_5(0x35),
    NUM_6(0x36),
    NUM_7(0x37),
    NUM_8(0x38),
    NUM_9(0x39)



    byte hex;
    TIToken(int hex)
    {
        this((byte)hex);
    };
    TIToken(byte hex)
    {
        this.hex = hex;
    };
    byte getByte()
    {
        return this.hex;
    };
}
