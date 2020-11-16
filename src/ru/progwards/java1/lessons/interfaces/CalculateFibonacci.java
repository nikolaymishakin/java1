package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;

    public static int fiboNumber (int n) {
        int a = 0, b = 1, c;
        if (n == 0) return a;
        for (int i = 2; i <= n; i++) {
            if ( i != lastFibo.n) lastFibo.fibo = b;
                c = a + b;
                a = b;
                b = c;
            }

            return b;
    }

    public static class CacheInfo {
        public int n;
        public int fibo;
    }

    public static CacheInfo getLastFibo() {
           return lastFibo;
    }
    public static void clearLastFibo() {
        lastFibo = null;
    }

    public static void main(String[] args) {
        System.out.println(fiboNumber(1));

    }

}



