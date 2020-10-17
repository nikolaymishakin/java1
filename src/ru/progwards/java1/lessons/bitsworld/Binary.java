package ru.progwards.java1.lessons.bitsworld;

public class Binary {
        private  byte num;

        public Binary(byte num) {
            this.num=num;
        }

        public String toString () {
            return String.format("%32s", Integer.toBinaryString(num).replace(' ', '0'));
        }

        public static void main (String[]args){

            System.out.println();
        }
    }

