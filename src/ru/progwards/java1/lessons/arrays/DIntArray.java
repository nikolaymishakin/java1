package ru.progwards.java1.lessons.arrays;

        import java.util.Arrays;

public class DIntArray {
    private int[] a;

    DIntArray() {
    }

    public void add(int num) {
        int[] b = new int[a.length + 1];
        for(int i = 0; i< a.length;i++){
            b[i] = a[i];
        }
        b[a.length-1] = num;
    }


    public void atInsert(int pos, int num) {
        int [] c = new int[a.length+1];
        c[pos] = num;
        for (int i = 0; i < pos; i++)
            c[i] = a[i];
        for(int i = pos; i< a.length;i++)
            c[i+1] = a[i];
        a = c;


    }

    public void atDelete(int pos) {
        int[] d = new int[a.length - 1];
        for(int i = 0; i< pos;i++)
            d[i] = a[i];
        for(int i = pos+1;i<a.length;i++)
            d[i-1] = a[i];
        a = d;

    }

    public int at(int pos) {
        return a[pos];
    }

    public static void main(String[] args) {
        int[] a = {2, 58, 36, 9};
            System.out.println(Arrays.toString(a));
        System.out.println();
        int num = 3, pos = 2;
        int[] b = new int[a.length];
        System.arraycopy(a,0,b,0,a.length);
        b[a.length] = num;
            System.out.println(Arrays.toString(b));
        System.out.println();
        int[] c = new int[a.length+1];
        for (int i = 0; i < c.length; i++) {
            if (i < pos) c[i] = a[i];
            else if (i == pos) c[i] = num;
            else c[i] = a[i - 1];
        }
        System.out.println(Arrays.toString(c));
        }

}