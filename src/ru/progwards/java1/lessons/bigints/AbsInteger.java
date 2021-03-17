package ru.progwards.java1.lessons.bigints;

public class AbsInteger {
    public int getValue() {
        return 0;
    }

    static AbsInteger add(AbsInteger num1, AbsInteger num2) {
        AbsInteger absNum = null;

        if (num1 instanceof ByteInteger & num2 instanceof ByteInteger) {

            ByteInteger num = new ByteInteger((byte) (num1.getValue() + num2.getValue()));

            absNum = num;
        }

        if (num1 instanceof IntInteger || num2 instanceof IntInteger) {

            IntInteger num = new IntInteger(num1.getValue() + num2.getValue());

            absNum = num;
        }

        if ((num1 instanceof ByteInteger & num2 instanceof ShortInteger) || (num1 instanceof ShortInteger & num2 instanceof ByteInteger) || (num1 instanceof ShortInteger & num2 instanceof ShortInteger)) {

            ShortInteger num = new ShortInteger((short) (num1.getValue() + num2.getValue()));

            absNum = num;
        }

        return absNum;
    }
}

