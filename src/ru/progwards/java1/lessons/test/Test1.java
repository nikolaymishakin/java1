package ru.progwards.java1.lessons.test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] b = {5, 4, 3, 9, 6, 14, 20, 5, 66, 30, 25, 10, 8, 7, 33, 0, 11, 1, 100, 16, 44};
        System.out.println(indexArray(b,100));
    }
    public static int indexArray(int[]n,int k){
        if(n==null) return -1;
        for (int i =0;i<n.length;++i){
            if (n[i]==k) return i;
            else i++;
        }
        return -1;
    }
}

