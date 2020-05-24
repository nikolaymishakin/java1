package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] a;
DIntArray () {
}
    public void add(int num) {
    int [] b = {2,6,1,8,7};
    Arrays.sort(b);
    int [] c = Arrays.copyOf(a,b.length+num);
    }

    public void atInsert(int pos, int num){
    int [] d = {3,8,14,1,9,6};
    int [] e = Arrays.copyOf(a,d.length+pos);
    pos = num;
    }

    public void atDelete(int pos){
    int [] e = new int[5];
    int [] d = Arrays.copyOf(a,e.length-pos);
    }

    public int at(int pos){
    return pos;
    }

    public static void main(String[] args) {

    }
}
