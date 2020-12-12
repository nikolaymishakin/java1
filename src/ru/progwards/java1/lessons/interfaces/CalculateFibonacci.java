package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;

    public static int fiboNumber (int n) {
        CacheInfo cacheInfo = new CacheInfo();
        cacheInfo.n = n;
        cacheInfo.fibo = 0;
        int a = 0, b = 1, c;
            for (int i = 2; i <= cacheInfo.n; i++) {
                c = a + b;
                a = b;
                b = c;
                if (b != cacheInfo.n) cacheInfo.fibo = b;
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
        System.out.println(fiboNumber(10));
    }

}



