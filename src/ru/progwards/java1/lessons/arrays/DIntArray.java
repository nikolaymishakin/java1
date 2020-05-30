package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] a = new int[2];
DIntArray () {
}
    public void add(int num) {
    int[] b = new int[3];
    b = Arrays.copyOf(b,a.length+num);
 }

    public void atInsert(int pos, int num){
    int [] c = new int[3];
    Arrays.copyOf(c,a.length+num);
    pos = num;
    }

    public void atDelete(int pos){
    int [] d = new int[1];
    Arrays.copyOf(d,a.length-pos);
    }

    public int at(int pos){
    return pos;
    }

    public static void main(String[] args) {

    }
}
