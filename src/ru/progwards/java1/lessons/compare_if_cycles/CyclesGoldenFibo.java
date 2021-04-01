package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        int i = 0, num = number, num1;
        if (number % 10 == digit) return true;
        for (; i < num; i++) {
            num /= 10;
            num1 = num % 10;
            if (num1 == digit) return true;
        }

        return false;
    }

    public static int fiboNumber(int n) {
        int i = 1, c = 0, a, b = 1;
        for (; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        double d = (double) a / c, e = (double) a / b, f = (double) b / a, g = 1.61703, h = 1.61903;
        if (a == b && d >= g && d <= h) return true;
        else if (a == c && e >= g && e <= h) return true;
        else if (b == c && f >= g && f <= h) return true;
        else return false;
    }

    public static void main(String[] args) {
        int i = 0, j = 0;
          //for(i=1;i<=15;i++) {
             // System.out.println("Число"+i+" = "+fiboNumber(i));
         // }

        for (i = 1; i <= 100; i++) {
            for (j = 1; j <= 100; j++) {
                if(isGoldenTriangle(i,j,j)==true){
                    System.out.println(i);
                    System.out.println(j);
                }
                }
            }
        }

    }


