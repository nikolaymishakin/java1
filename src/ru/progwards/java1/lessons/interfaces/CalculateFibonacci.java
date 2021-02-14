package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;

    public static int fiboNumber(int n) {
        int i = 1, c = 0, a, b = 1;
        for (; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
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



