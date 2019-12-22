package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius){
        double pi=3.14, R=6371.2;
        return 4./3*pi*R*R*R;
    }
    public static float volumeBallFloat(float radius){
        float pi=3.14f, R=6371.2f;
        return (float)4./3*pi*R*R*R;
    }
    public static double calculateAccuracy(double radius){
        double a=volumeBallDouble(1);
        float b=volumeBallFloat(1);
        return (float)a-b;
    }

    public static void main(String[] args) {
        double a=volumeBallDouble(1);
        System.out.println(a);
        float b=volumeBallFloat(1);
        System.out.println(b);
        System.out.println(calculateAccuracy(1));
    }
}