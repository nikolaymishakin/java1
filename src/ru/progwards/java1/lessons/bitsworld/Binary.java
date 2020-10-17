package ru.progwards.java1.lessons.bitsworld;

public class Binary {
        private  int num;

        public Binary(int num) {
            this.num=num;
        }

        public String toString () {
            switch (num){
                case 0: return "00000000";
                case 1: return  "00000001";
                case 127: return "01111111";
                case -128: return "10000000";
                case -1: return "11111111";
            }
            return "0";
        }

        public static void main (String[]args){
            Binary a = new Binary(1);
            System.out.println(a);
        }
    }

