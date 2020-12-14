package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;

    public static int fiboNumber (int n) {
        CacheInfo cacheInfo = new CacheInfo();
        cacheInfo.n = 0;
        cacheInfo.fibo = 0;
        while (cacheInfo.n != n) {
            if (cacheInfo.n == 0 || cacheInfo.n == 1) {
                cacheInfo.fibo = 1;
                cacheInfo.n++;
            } else {
                int a = 0, c;
                for (int i = 2; i <= n; i++) {
                    c = a + cacheInfo.fibo;
                    a = cacheInfo.fibo;
                    cacheInfo.fibo = c;
                }
            }
        }
        return cacheInfo.fibo;
    }

    public static class CacheInfo {
        public int n;
        public int fibo;
       void setFibo(int n, int fibo){
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
        CacheInfo test = new CacheInfo();
        test.setFibo(1,1);
        System.out.println(fiboNumber(test.n));
    }

}



