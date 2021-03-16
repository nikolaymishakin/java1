package ru.progwards.java1.lessons.bigints;

public class AbsInteger {
   protected int byt;

    static AbsInteger add(AbsInteger num1, AbsInteger num2){
        if (num1.byt >= num2.byt) return num1.addition(num2);
        else return num2.addition(num1);
    }
    protected AbsInteger addition (AbsInteger num1){
        return null;
    }
    protected byte toByte() {
        return 0;
    }
    protected short toShort() {
        return 0;
    }
    protected int toInt() {
        return 0;
    }
}
