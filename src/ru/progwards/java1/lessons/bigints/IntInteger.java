package ru.progwards.java1.lessons.bigints;

public class IntInteger extends AbsInteger {
    int i;

    public IntInteger(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }

    @Override
    public int getValue() {
        return Integer.valueOf(i);
    }
}
