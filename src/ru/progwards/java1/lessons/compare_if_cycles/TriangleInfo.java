package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        if (a < b + c || b < a + c || c < a + b) return true;
        else return false;
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) return true;
        else return false;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        if (a == b || a == c || b == c) return true;
        else return false;
    }

    public static void main(String[] args) {
        boolean a=isIsoscelesTriangle(5,5,4);
        System.out.println(a);

    }
}
