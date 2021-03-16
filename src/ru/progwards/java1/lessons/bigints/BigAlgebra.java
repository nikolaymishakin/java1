package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigAlgebra {
    static BigDecimal fastPow(BigDecimal num, int pow){
        BigDecimal a = new BigDecimal(String.valueOf(num));
        return BigDecimal.valueOf(a.pow(pow).doubleValue());
    }
    static BigInteger fibonacci(int n){
       if (n == 0 || n == 1) return BigInteger.ONE;
       return fibonacci(n - 2).add(fibonacci(n - 1));
    }

    public static void main(String[] args) {

    }
}
