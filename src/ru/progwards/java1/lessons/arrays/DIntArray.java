package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] a;
DIntArray () {
}
    public void add(int num) {
    int [] b = new int[4];
    Arrays.copyOf(a,b.length+num);
    }

    public void atInsert(int pos, int num){
    int [] c = new int[5];
    Arrays.copyOf(a,c.length+num);
    pos = num;
    }

    public void atDelete(int pos){
    int [] d = new int[3];
    Arrays.copyOf(a,d.length);
    }

    public int at(int pos){
    return pos;
    }

    public static void main(String[] args) {

    }
}
