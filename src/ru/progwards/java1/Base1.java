package ru.progwards.java1;

public class Base1 {
    public static void printJava(){
        String str1 = "Хорошо идут дела",str2 = "Изучаю Java я!",str3 = " ";
        System.out.println(str1);
        System.out.println(str2);
        System.out.print(str1);
        System.out.print(str3);
        System.out.println(str2);
        System.out.print(str2);
        System.out.print(str3);
        System.out.println(str1);
    }

    public static void printJava(String java1, String java2){
        System.out.println(java1);
       String str1 = ", ",str2 = "!";
        System.out.print(java2);
        System.out.println(str2);
        System.out.print(java1);
        System.out.print(str1);
        System.out.print(java2);
        System.out.println(str2);
        System.out.print(java2);
        System.out.print(str1);
        System.out.print(java1);
        System.out.println(str2);
    }

    public static String plusJava(String message){
        String str1 = "Java - ",str2 = " язык программирования";
        return str1+message+str2;
    }


    public static void main(String[] args) {
        printJava();
        printJava("Чтобы Java понимать","Надо функции писать");
        printJava("Буду, буду программистом","Код пишу я чисто, чисто");
        String str = plusJava("самый популярный");
        System.out.println(plusJava("самый популярный"));
        System.out.println("str = "+str);
        str = plusJava("объектно-ориентированный");
        System.out.println("str = "+str);
        System.out.println(plusJava("очень интересный"));
    }
}
