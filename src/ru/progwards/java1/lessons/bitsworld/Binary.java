package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    private int num;
    public Binary(byte num) {
        this.num= num&0b0000_0000_0000_0000_0000_0000_1111_1111;
    }

    public String toString() {

        return String.format("%8s", Integer.toBinaryString(num)).replace( ' ', '0');
    }

        public static void main (String[]args){
            Binary a = new Binary((byte) -1);
            System.out.println(a);
        }

}

