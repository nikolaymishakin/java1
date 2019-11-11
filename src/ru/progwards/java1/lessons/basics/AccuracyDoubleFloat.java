package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius){
        double pi=3.14, R=6371.2;
        return 4/3*pi*R*R*R;
    }
    public static float volumeBallFloat(float radius){
        float pi=3.14f, R=6371.2f;
        return 4/3*pi*R*R*R;
    }

    public static void main(String[] args) {
        double d=volumeBallDouble(1);
        double d1=volumeBallFloat(1);
        System.out.println(d);
        System.out.println(d1);

    }
}
