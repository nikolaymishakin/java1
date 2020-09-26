package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value){
        int summ = 0;
        while(value >= 0) summ+= (int)(value&1>>1);
        return summ;
    }

    public static void main(String[] args) {
        byte value = 0b0100101;
        System.out.println(sumBits(value));
    }
}
