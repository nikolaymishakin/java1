package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    private byte num;

    public Binary(byte num) {
        this.num = num;
    }

    public String toString() {
        String str = "";
                for( byte i = 7;i>=0;i--){
                    str = (num&1)+str;
                    num>>=1;
                    }
        return str;
    }

            public static void main (String[]args){
                Binary a = new Binary((byte) -128);
                System.out.println(a);
            }

    }


