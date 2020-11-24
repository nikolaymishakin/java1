package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;
    public static int fiboNumber (int n) {
        int a = 0, b = 1, c;
        if ( lastFibo.n == 0 || lastFibo.n == 1) lastFibo.fibo = 1;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
                if ( b != lastFibo.fibo) lastFibo.fibo = b;
            }
            return b;
        }

    public static class CacheInfo {
        public int n;
        public int fibo;
        CacheInfo(int n, int fibo){
            this.n = n;
            this.fibo = fibo;
        }
        CalculateFibonacci.CacheInfo cacheInfo = new CalculateFibonacci.CacheInfo(1,0);

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



