package ru.progwards.java1.lessons.bigints;

public abstract class AbsInteger {
    public abstract int getValue();
    static AbsInteger add(AbsInteger num1, AbsInteger num2) {
        int res = num1.getValue() + num2.getValue();
        return new ByteInteger((byte) res);
    }

}
