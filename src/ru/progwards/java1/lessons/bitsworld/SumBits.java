package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value){
        int value1=value;
        int summ = 0;
        if(value1<0) value1=value&0b0000_0000_0000_0000_0000_0000_1111_1111;
        while (value1>0)
            {summ+= value1&1;
            value1>>=1;}
        return summ;
    }

    public static void main(String[] args) {
        byte value = (byte)0b10000001;
        System.out.println(sumBits(value));
        System.out.println(Integer.toBinaryString(value));
    }
}
