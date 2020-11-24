package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;
    public static int fiboNumber (int n) {
        int a = 0, b = 1, c;
        if ( getLastFibo().n == 0 || getLastFibo().n == 1) return b;

            for (int i = 2; i <= getLastFibo().n; i++) {
                c = a + b;
                a = b;
                b = c;
                if ( b != getLastFibo().fibo) getLastFibo().fibo = b;
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
        CacheInfo cacheInfo = new CacheInfo(1,0);

    }
    public static CacheInfo getLastFibo() {
           return lastFibo.cacheInfo;
    }
    public static void clearLastFibo() {
        lastFibo = null;
    }

    public static void main(String[] args) {

    }

}



