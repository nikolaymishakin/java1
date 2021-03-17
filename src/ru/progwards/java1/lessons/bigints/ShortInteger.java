package ru.progwards.java1.lessons.bigints;

public class ShortInteger extends AbsInteger {
    short s;

    public ShortInteger(short s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return Short.toString(s);
    }

    @Override
    public int getValue() {
        return Short.valueOf(s);
    }
}
