package ru.progwards.java1.lessons.arrays;

        import java.util.Arrays;

public class DIntArray {
    private int[] a;

    DIntArray() {
    }

    public void add(int num) {
        int[] b = Arrays.copyOf(a, a.length + 1);
        b[b.length - 1] = num;
    }


    public void atInsert(int pos, int num) {
        int[] c = Arrays.copyOf(a, a.length + 1);
        for (int i = 0; i < c.length; i++) {
            if (i < pos - 1) c[i] = a[i];
            else if (i == pos - 1) c[i] = num;
            else c[i] = a[i - 1];
        }

    }

    public void atDelete(int pos) {

        int[] d = new int[a.length - 1];
        System.arraycopy(a, 0, d, 0, pos);
        System.arraycopy(a, pos + 1, d, pos, a.length - pos - 1);
    }

    public int at(int pos) {
        return a[pos];
    }

    public static void main(String[] args) {
        int[] a = {2, 58, 36, 9};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
        int[] b = Arrays.copyOf(a, a.length + 1);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println();
        int num = 1;
        b[b.length - 1] = num;
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println();
        int pos = 3;
        int[] c = Arrays.copyOf(a, a.length + 1);
        for (int i = 0; i < c.length; i++) {
            if (i < pos - 1) c[i] = a[i];
            else if (i == pos - 1) c[i] = num;
            else c[i] = a[i - 1];
            System.out.println(c[i]);
        }
        System.out.println();
        int[] d = new int[c.length - 1];
        System.arraycopy(c,0,d,0,pos);
        System.arraycopy(c,pos+1,d,pos,c.length-1-pos);
        System.out.println(Arrays.toString(d));
    }
}