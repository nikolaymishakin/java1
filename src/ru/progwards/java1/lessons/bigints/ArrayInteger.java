package ru.progwards.java1.lessons.bigints;

import java.math.BigInteger;

public class ArrayInteger {
    byte[] digits;
    int signif;

    ArrayInteger() {
        int n = 10;
        digits = new byte[n];
        clear(n);
    }

    ArrayInteger(int n) {
        digits = new byte[n];
        clear(n);
    }

    ArrayInteger(String value) {
        this();
        fromString(value);
    }

    private void clear() {
        clear(signif);
    }

    private void clear(int count) {
        for (int i = 0; i < count; i++) digits[i] = 0;
        signif = 0;
    }

    void fromString(String value) {
        char[] s = value.toCharArray();
        int sig = s.length;

        for (int i = sig - 1, k = 0; i >= 0; i--, k++) {
            digits[k] = (byte) (s[i] - '0');
        }

        for (int i = sig; i < signif; i++) {
            digits[i] = 0;
        }
        signif = sig;
    }

    void fromInt(BigInteger value) {
        fromString(value.toString());
    }

    BigInteger toInt() {
        char[] s = new char[signif];
        for (int i = signif - 1, k = 0; i >= 0; i--, k++) {
            s[i] = (char) ((digits[k] + '0') & 0xFF);
        }
        return new BigInteger(String.valueOf(s));
    }

    boolean raiseCalcError() {
        clear(digits.length);
        return false;
    }

    boolean add(ArrayInteger num) {
        int sigMax = num.signif >= signif ? num.signif : signif;
        int l = digits.length;
        int ln = num.digits.length;
        int p = 0;
        int r;
        int sig = 0;
        for (int i = 0; i <= sigMax; i++) {
            r = p;
            if (i < l) r += digits[i];
            if (i < ln) r += num.digits[i];
            if (r > 0) {
                sig = i;
                if (sig >= l) return raiseCalcError();
                digits[sig] = (byte) (r % 10);
            } else {
                if (i < l) digits[i] = 0;
            }
            p = r / 10;
        }
        signif = sig + 1;
        return true;
    }

    @Override
    public String toString() {
        byte[] r = new byte[signif];
        for (int i = signif - 1, k = 0; i >= 0; i--, k++) {
            r[k] = (byte) (digits[i] + '0');
        }
        return new String(r);
    }
}