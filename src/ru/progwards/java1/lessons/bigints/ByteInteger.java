package ru.progwards.java1.lessons.bigints;

public class ByteInteger extends AbsInteger {
    byte b;

     public ByteInteger(byte b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return Byte.toString(b);
    }

    @Override
    public int getValue() {
        return Byte.valueOf(b);
    }
}
