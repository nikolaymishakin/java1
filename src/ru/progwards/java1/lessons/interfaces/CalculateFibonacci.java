package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;

    public static int fiboNumber(int n) {
        int i = 1, c = 0, a, b = 1;
        for (; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
            if (n != c) {

            }
        }
        return c;
    }
        public static CacheInfo getLastFibo () {
            return lastFibo;
        }
        public static void clearLastFibo () {
            lastFibo = null;
        }
        public static class CacheInfo {
            public int n;
            public int fibo;
        }
    }


