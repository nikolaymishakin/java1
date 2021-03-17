package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigAlgebra {

    static BigDecimal fastPow(BigDecimal num, int pow){
         BigDecimal res = BigDecimal.ONE;
        while (pow > 0) {
            if ((pow & 1) == 1) {
                res = res.multiply(num);
            }
            num = num.multiply(num);
            pow >>= 1;
        }
        return res;
    }
    static BigInteger fibonacci(int n){
        BigInteger a;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ZERO;
        for (int i = 1; i <= n; i++){
            a = b;
            b = c;
            c = a.add(b);
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println((fastPow(BigDecimal.valueOf(2),5)));
    }
}
