package ru.progwards.java1.lessons.arrays;

        import java.util.Arrays;

public class DIntArray {
    private int[] a;
    DIntArray () {
    }
    public void add(int num) {
        int[] b = Arrays.copyOf(a,a.length+1);
        b[a.length] = num;
    }

    public void atInsert(int pos, int num){
        int [] c = Arrays.copyOf(a,a.length+1);
        c[pos] = num;
    }

    public void atDelete(int pos){
        int [] d = Arrays.copyOf(a,a.length-pos);
    }

    public int at(int pos){
        return a[pos];
    }

    public static void main(String[] args) {
int [] a = {0,1,2,3};
int num = 5, pos = 3;
System.out.println(Arrays.toString(a));
        int[] b = Arrays.copyOf(a,a.length+1);
        b[pos] = num;
        System.out.println(Arrays.toString(b));

    }
}
