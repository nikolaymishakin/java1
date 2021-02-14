package ru.progwards.java1.lessons.interfaces;

import java.util.concurrent.Callable;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;

    public static int fiboNumber(int n) {
       CacheInfo cacheInfo = new CacheInfo(1,0);
        int i = 1, a, b = 1;
        for (; i <= cacheInfo.n; i++) {
            a = b;
            b = cacheInfo.fibo;
            cacheInfo.fibo = a + b;
        }
        return cacheInfo.fibo;
    }

    public static class CacheInfo {
        public int n;
        public int fibo;
       CacheInfo(int n, int fibo){
           this.n = n;
           this.fibo = fibo;
       }

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



