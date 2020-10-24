package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a,int b,int c){
        if(a>=b&&a>=c) return a;
        if(b>=a&&b>=c) return b;
        else return c;
    }
    public static int minSide(int a,int b,int c){
        if(a<=b&&a<=c) return a;
        if(b<=a&&b<=c) return b;
        else return c;
    }
    public static boolean isEquilateralTriangle(int a,int b,int c){
        if(a==b&&a==c&&b==c) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isEquilateralTriangle(2,2,3));
        System.out.println(isEquilateralTriangle(2,3,2));
        System.out.println(isEquilateralTriangle(3,2,2));
        System.out.println(isEquilateralTriangle(2,2,2));
        System.out.println(isEquilateralTriangle(3,3,3));
        System.out.println(maxSide(4,2,3));
        System.out.println(minSide(3,5,7));
    }
}
