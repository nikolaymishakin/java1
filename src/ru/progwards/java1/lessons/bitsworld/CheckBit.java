package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static int checkBit(byte value, int bitNumber){
        int value1 = value;
        if(value1<0) value1=value&0b0000_0000_0000_0000_0000_0000_1111_1111;
       return (value1>>bitNumber)&1;
    }

    public static void main(String[] args) {
        byte value = (byte)51;
        int bitNumber = 3;
        System.out.println(Integer.toBinaryString(value));
        System.out.println(checkBit(value,bitNumber));
    }
}
