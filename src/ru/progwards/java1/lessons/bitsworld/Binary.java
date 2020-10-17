package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    public byte num;

    public Binary(byte num) {
        this.num = num;

        }

    public String toString() {
        return String.format("%8s", Integer.toBinaryString(num).replace(' ', '0'));
    }

    public static void main(String[] args) {

    }
}
