package ru.progwards.java1.lessons.helloworld;

public class Task2 {
    public static void printJava() {
        String str1 = "Хорошо идут дела";
        String str2 = "Изучаю Java я!";
        String str3 = " ";
        System.out.println(str1);
        System.out.println(str2);
        System.out.print(str1);
        System.out.print(str3);
        System.out.println(str2);
        System.out.print(str2);
        System.out.print(str3);
        System.out.println(str1);

    }
  public static int subtraction (int x, int y){
        System.out.print("Вызвана функция subtraction() с параметрами x = ");
        System.out.print(x + ",");
        System.out.print(" y = ");
        System.out.println(y);
        return x-y;
    }
    public static int addition(int x,int y){
        System.out.print("Вызвана функция addition() с параметрами x = ");
        System.out.print(x + ",");
        System.out.print(" y = ");
        System.out.println(y);
        return x+y;
    }
    public static int multiplication(int x,int y){
        System.out.print("Вызвана функция multiplication() с параметрами x = ");
        System.out.print(x + ",");
        System.out.print(" y = ");
        System.out.println(y);
        return x*y;
    }
    public static void calculation(){
        int a = 34,b = 55,c;
        System.out.print("a = ");
        System.out.println(a);
        System.out.print("b = ");
        System.out.println(b);
        c = addition(a,b);
        System.out.print("a + b = ");
        System.out.println(c);
        c = subtraction(a,b);
        System.out.print("a - b = ");
        System.out.println(c);
        c = multiplication(a,b);
        System.out.print("a * b = ");
        System.out.println(c);
    }
    public static void main (String[] args){
        printJava();
        subtraction(45,12);
        subtraction(23,55);
        addition(128,787);
        addition(528,387);
        multiplication(124,87);
        multiplication(1528,3);
}
}

