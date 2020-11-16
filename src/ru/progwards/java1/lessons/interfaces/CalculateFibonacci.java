package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;

    public static int fiboNumber (int n) {
        int a = 0, b = 1, c = 0;
        if (n == 0) return a;
        for (int i = 2; i <= n; i++) {
            if ( i != c) {
                c = a + b;
                lastFibo.fibo = c;}
                a = b;
                b = lastFibo.fibo;
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



