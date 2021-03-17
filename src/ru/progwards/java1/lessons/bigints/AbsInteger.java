package ru.progwards.java1.lessons.bigints;

public abstract class AbsInteger {
    public abstract int getValue();
    static AbsInteger add(AbsInteger num1, AbsInteger num2) {
        int res = num1.getValue() + num2.getValue();
        if (num1 instanceof ByteInteger || num2 instanceof ByteInteger )
            return new ByteInteger((byte) res);
        else if (num1 instanceof ShortInteger || num2 instanceof ShortInteger)
            return new ShortInteger((short) res);
        else return new IntInteger(res);
    }

}
