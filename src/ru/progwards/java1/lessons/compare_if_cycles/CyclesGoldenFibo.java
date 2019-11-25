package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        int i = 0, num = number, num1 = 0;
        if (number % 10 == digit) return true;
        for (; i < number; i++) {
            num /= 10;
            num1 = num % 10;
            if (num1 == digit) return true;
        }

        return false;
    }

    public static int fiboNumber(int n) {
        int i, c = 0, a = 1, b = 1;
        if (a == 1 && b == 1) {
            System.out.print(a);
            System.out.print(b);
        }
        for (i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c);
        }
        return c;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        double d = (double) a / c, e = (double) a / b, f = (double) b / a;
        if (a == b && d >= 1.61703 && d <= 1.61903) return true;
        else if (a == c && e >= 1.61703 && e <= 1.61903) return true;
        else if (b == c && f >= 1.61703 && f <= 1.61903) return true;
        else return false;
    }

    public static void main(String[] args) {
        int a = fiboNumber(5);

    }
}


