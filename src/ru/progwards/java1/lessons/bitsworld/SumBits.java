package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value){
        int summ = 0;
        while(value>0)
        {summ+= value&1;
        value>>=1;}
        return summ;
    }

    public static void main(String[] args) {
        byte value = (byte)0b0100101;
        System.out.println(sumBits(value));
    }
}
