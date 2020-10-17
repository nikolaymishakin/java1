package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    private int num;

    public Binary(int num) {

        this.num = num;

        }

    public String toString() {
        return String.format("%32s", Integer.toBinaryString(num).replace(' ', '0'));
    }

    public static void main(String[] args) {
        Binary a = new Binary(1);
    }
}
