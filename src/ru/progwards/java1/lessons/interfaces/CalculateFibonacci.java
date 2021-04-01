package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;

    public static int fiboNumber(int n) {
        if (getLastFibo() == null) lastFibo = new CacheInfo();
        if (n == lastFibo.fibo) return lastFibo.fibo;
        else {
            lastFibo.n = n;
            int i = 1, a, b = 1;
            lastFibo.fibo = 0;
            for (; i <= lastFibo.n; i++) {
                a = b;
                b = lastFibo.fibo;
                lastFibo.fibo = a + b;
            }
            return lastFibo.fibo;
        }
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
        CacheInfo cacheInfo = new CacheInfo();
        cacheInfo.n = 8;
        System.out.println(fiboNumber(cacheInfo.n));
    }

}



