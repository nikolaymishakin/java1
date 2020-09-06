package ru.progwards.java1.lessons.arrays;

        import java.util.Arrays;

public class DIntArray {
    private int[] a = {};

    DIntArray() {

    }

    public void add(int num) {
        a = new int[a.length + 1];
        a = Arrays.copyOf(a, a.length + 1);
        a[a.length -2] = num;
        System.out.println(Arrays.toString(a));
    }

    public void atInsert(int pos, int num) {
        int[] c = new int[a.length];
        a = new int[a.length + 1];
        for (int i = 0; i < pos; i++)
            c[i] = a[i];
        c[pos] = num;
        for (int i = pos + 1; i < a.length; i++)
            c[i] = a[i];

    }

    public void atDelete(int pos) {
        int[] d = new int[a.length];
        d = Arrays.copyOf(a, a.length);
        a = new int[a.length - 1];
        for (int i = 0; i < pos; i++)
            a[i] = d[i];
        for (int i = pos + 1; i < d.length; i++)
            a[i - 1] = d[i];

    }

    public int at(int pos) {
        return pos;

    }

    public static void main(String[] args) {
        DIntArray a = new DIntArray();
         a.add(2);
    }

}