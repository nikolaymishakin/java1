package ru.progwards.java1.lessons.arrays;

        import java.util.Arrays;

public class DIntArray {
    private int[] a = {};

    DIntArray() {

}

    public void add(int num) {
       int[] b = new int[a.length];
        b = Arrays.copyOf(a,a.length);
        a = new int[a.length+1];
        a = Arrays.copyOf(b,b.length+1);
        a[a.length -1] = num;
        System.out.println(Arrays.toString(a));
    }

    public void atInsert(int pos, int num) {
        int[] c = new int[a.length];
        c = Arrays.copyOf(a,a.length);
        a = new int[a.length + 1];
        for (int i = 0; i < pos; i++)
            a[i] = c[i];
        a[pos] = num;
        for (int i = pos+1; i < c.length; i++)
            a[i+1] = c[i];

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
        if(a.length==0) return a[0];
        else return a[pos];
    }
    public static void main(String[] args) {
        DIntArray a = new DIntArray();
         a.add(2);
    }

}