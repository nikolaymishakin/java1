package ru.progwards.java1.lessons.bigints;

public class ByteInteger extends AbsInteger {
    byte b;

     public ByteInteger(byte b) {
        this.b = b;
        byt = 1;
    }

    @Override
    public String toString() {
        return Byte.toString(b);
    }
    @Override
    protected byte toByte() {
        return b;
    }
    @Override
    protected short toShort() {
        return b;
    }
    @Override
    protected int toInt() {
        return b;
    }
    @Override
    protected AbsInteger addition(AbsInteger num1) {
        return new ByteInteger((byte) (b + num1.toByte()));
    }
}
