package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;

    public static int fiboNumber (int n) {
        if ( n != lastFibo.n) {
            int i = 1;
            int c = 0;
            int a;
            int b = 1;
            for (; i <= lastFibo.n; i++) {
                a = b;
                b = c;
                c = a + b;
                lastFibo.fibo = c;
            }
        }
        return lastFibo.n;
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

    }

}



