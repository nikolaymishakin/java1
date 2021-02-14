package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;

    public static int fiboNumber(int n) {
     if (getLastFibo() == null) lastFibo = new CacheInfo();
     if (n == lastFibo.fibo) return lastFibo.fibo;
        lastFibo.n = n;
        int i = 1, c = 0, a, b = 1;
        for (; i <= lastFibo.n; i++) {
           a = b;
           lastFibo.fibo = c;
           c = a;
        }
        return c;
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



