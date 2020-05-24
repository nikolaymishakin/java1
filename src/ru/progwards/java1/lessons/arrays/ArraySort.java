package ru.progwards.java1.lessons.arrays;

public class ArraySort {
    public static void sort(int[] a){
        int tmp;
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5,6,12,10,16,58,28,36,69};
        sort(a);
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
