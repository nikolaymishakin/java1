package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
        public static int reverseDigits(int number) {
            int num = number % 10;
            String int1 = Integer.toString(num);
            int num1 = number / 10 % 10;
            String int2 = Integer.toString(num1);
            int num2 = number / 100;
            String int3 = Integer.toString(num2);
            String int4 = int1 + int2 + int3;
            int num5 = Integer.parseInt(int4);
            return num5;
        }


        public static void main(String[] args) {
            int num=reverseDigits(123);
            System.out.println(num);

        }

    }


