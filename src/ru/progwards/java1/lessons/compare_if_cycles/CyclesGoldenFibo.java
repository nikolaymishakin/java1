package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        int i = 0, num = number, num1 = 0;
        if (number % 10 == digit) return true;
        for (; i < num; i++) {
            num /= 10;
            num1 = num % 10;
            if (num1 == digit) return true;
        }

        return false;
    }

    public static int fiboNumber(int n) {
        int i = 1, c = 0, a = 0, b = 1;
        for (; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
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
        int i, j, k;
//        for (i = 1; i <= 15; i++) {
//            int b = fiboNumber(i);
//            System.out.println(b);
//        }
        for (i = 1; i <= 100; i++) {
            for (j = 1; j <= 100; j++) {
                for (k = 1; k <= 100; k++) {
                    if (isGoldenTriangle(i, j, k) == true) {
                        System.out.println(i);
                        System.out.println(j);
                        System.out.println(k);
                    }
                }
            }
        }

    }
}