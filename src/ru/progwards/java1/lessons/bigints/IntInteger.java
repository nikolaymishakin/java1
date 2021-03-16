package ru.progwards.java1.lessons.bigints;

public class IntInteger extends AbsInteger {
    int i;

    public IntInteger(int i) {
        this.i = i;
        byt = 4;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
    @Override
    protected int toInt() {
        return i;
    }
    @Override
    protected AbsInteger addition(AbsInteger num1) {
        return new IntInteger((int) (i + num1.toInt()));
    }
}
