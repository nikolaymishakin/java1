package ru.progwards.java1.lessons.arrays;

        import java.util.Arrays;

public class DIntArray {
    private int[] a = new int[] {0,1,2};
    DIntArray () {
    }
    public void add(int num) {
        int[] b = Arrays.copyOf(a,a.length+num);
    }

    public void atInsert(int pos, int num){
        int [] c = Arrays.copyOf(a,a.length+1);
        c[pos] = num;
    }

    public void atDelete(int pos){
        int [] d = Arrays.copyOf(a,a.length-pos);
    }

    public int at(int pos){
        return pos;
    }

    public static void main(String[] args) {

    }
}
