package ru.progwards.java1.lessons.helloworld;

public class Task3 {
    public static int addition(int x,int y){
        System.out.println("Вызвана функция addition()");
        return x+y;
    }
    public static int subtraction(int x,int y){
        System.out.println("Вызвана функция subtraction()");
        return x-y;
    }
    public static int multiplication(int x,int y){
        System.out.println("Вызвана функция multiplication()");
        return x*y;
    }
    public static void main(String[] args){
        int a=34,b=55,c=0;
        System.out.println("a=34");
        System.out.println("b=55");
        c=addition(34,55);
        System.out.print("a+b=");
        System.out.println(c);
        c=subtraction(34,55);
        System.out.print("a-b=");
        System.out.println(c);
        c=multiplication(34,55);
        System.out.print("a*b=");
        System.out.println(c);
    }
}
