package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigAlgebra {
    static BigDecimal fastPow(BigDecimal num, int pow){
        BigDecimal result = BigDecimal.ONE;
        for (int i = 1; i <= pow; i++){
            result = result.multiply(num);
        }
        return result;
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
        System.out.println((fibonacci(38)));
    }
}
