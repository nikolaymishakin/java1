package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
        public static int reverseDigits(int number) {
            int num = number % 10;
            int num1=number/10;
            int num2=num1%10;
            int num3=num1/10;

            return num*100+num2*10+num3;
        }


        public static void main(String[] args) {
            int num=reverseDigits(254);
            System.out.println(num);

        }

    }


