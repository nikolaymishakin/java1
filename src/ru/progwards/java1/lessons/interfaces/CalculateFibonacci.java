package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;

    public static int fiboNumber (int n) {
        if (getLastFibo().fibo == 0) {
            if (getLastFibo().n == 0 || getLastFibo().n == 1) {
                getLastFibo().fibo = 1;
            } else {
                getLastFibo().fibo = fiboNumber(getLastFibo().n - 1) + fiboNumber(getLastFibo().n - 2);
            }
        }
        return getLastFibo().fibo;
    }

    public static class CacheInfo {
        public int n;
        public int fibo;
        CacheInfo(int n, int fibo){
            this.n = getLastFibo().n;
            this.fibo = getLastFibo().fibo;
        }
        CacheInfo cacheInfo = new CacheInfo(1,0);
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



