package ru.nik.mish;

public class HelloWorld {
    static void println(String Str) {
        System.out.println(Str);
    }
    static int addition (int x, int y) {
        return x+y ;
    }
    static int addition1 (int x, int y) {
        return x+y ;
    }
   public static void main (String [] args) {
        println("Привет мир!");
        println("Мир, ты слышишь меня?");
        System.out.print("Я знаю что 5 + 7 =");
        System.out.print(addition(5,7));

    }
}
