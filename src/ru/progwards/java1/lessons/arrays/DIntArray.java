package ru.progwards.java1.lessons.arrays;

        import java.util.Arrays;

public class DIntArray {
    private int[] a = new int[0];

    DIntArray() {

    }
    public void add(int num) {
        if(a.length==0) System.out.println("a is null");
       int [] b = new int[a.length];
       b = Arrays.copyOf(a,a.length);
       a = new int[a.length+1];
       b = new int[a.length+1];
       b = Arrays.copyOf(a,a.length+1);
            b[a.length-1] = num;
        }

        public void atInsert ( int pos, int num) {
        int [] c = new int[a.length];
            a = new int[a.length + 1];
            for (int i = 0; i <pos; i++)
            c[i] = a[i];
            c[pos] = num;
            for (int i = pos+1; i < a.length; i++)
                c[i] = a[i];

        }

        public void atDelete ( int pos){
            int[] d = new int[a.length];
            d = Arrays.copyOf(a,a.length);
            a = new int[a.length - 1];
            for (int i = 0; i < pos; i++)
                a[i] = d[i];
            for (int i = pos + 1; i < d.length; i++)
                a[i - 1] = d[i];

        }

        public int at (int pos){
         return pos;

        }

        public static void main (String[]args){
            int num = 3, pos = 2;
            int[] a = {0,5,-8,10,12};
            System.out.println(Arrays.toString(a));
            System.out.println();
            int[] d = new int[a.length + 1];
            System.out.println(Arrays.toString(d));
            d[a.length - 1] = num;
            int[] b = new int[a.length + 1];
            System.arraycopy(a, 0, b, 0, a.length);
            b[a.length] = num;
            System.out.println(Arrays.toString(b));
            System.out.println();
            int[] c = new int[a.length + 1];
            for (int i = 0; i < c.length; i++) {
                if (i < pos) c[i] = a[i];
                else if (i == pos) c[i] = num;
                else c[i] = a[i - 1];
            }
            System.out.println(Arrays.toString(c));
        }
    }
