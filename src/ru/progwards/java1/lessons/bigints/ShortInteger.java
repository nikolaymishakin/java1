package ru.progwards.java1.lessons.bigints;

public class ShortInteger extends AbsInteger {
    short s;

    public ShortInteger(short s) {
        this.s = s;
        byt = 2;
    }

    @Override
    public String toString() {
        return Short.toString(s);
    }
    @Override
    protected short toShort() {
        return s;
    }
    @Override
    protected int toInt() {
        return s;
    }
    @Override
    protected AbsInteger addition(AbsInteger num1) {
        return new ShortInteger((short) (s + num1.toShort()));
    }
}
