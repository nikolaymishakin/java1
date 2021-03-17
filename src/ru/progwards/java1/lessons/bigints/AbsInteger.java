package ru.progwards.java1.lessons.bigints;

public abstract class AbsInteger {
    public abstract int getValue();

    static AbsInteger add(AbsInteger num1, AbsInteger num2) {
        int res = num1.getValue() + num2.getValue();
        if (res <= Byte.MAX_VALUE && res >= Byte.MIN_VALUE)
            return new ByteInteger((byte)res);
        else if (res <= Short.MAX_VALUE && res >=Short.MIN_VALUE)
            return new ShortInteger((short) res);
        else return new IntInteger(res);
    }

    public static void main(String[] args) {

    }
}
