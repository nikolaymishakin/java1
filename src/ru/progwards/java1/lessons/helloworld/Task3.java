package ru.progwards.java1.lessons.helloworld;

public class Task3 {
    public static int addition(int x,int y){
        return x+y;
    }
    public static int subtraction(int x,int y){
        return x-y;
    }
    public static int multiplication(int x,int y){
        return x*y;
    }
    public static void main(String[] args){
        int a=34,b=55,c=0;
        System.out.println("a=34");
        System.out.println("b=55");
        System.out.println("Вызвана функция addition()");
        c=addition(34,55);
        System.out.println(c);
        System.out.println("Вызвана функция subtraction()");
        c=subtraction(34,55);
        System.out.println(c);
        System.out.println("Вызвана функция multiplication()");
        c=multiplication(34,55);
        System.out.println(c);
    }
}
