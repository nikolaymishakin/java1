package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value){
        int summ = 0;
        if(value<0) return summ = 1;
            while(value>0)
        summ+= ((value>>>=1)&1);
        return summ;
    }

    public static void main(String[] args) {
        byte value = (byte)0b10000000;
        System.out.println(sumBits(value));
        System.out.println(Integer.toBinaryString(value));
    }
}
