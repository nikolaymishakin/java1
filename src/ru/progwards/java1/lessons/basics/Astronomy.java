package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static Double sphereSquare(Double r){
        double S;
        final double pi=3.14;
        S=4*pi*r*r;
        return S;
    }
    public static Double earthSquare(){
        double e=sphereSquare(6371.2);
        return e;
    }
    public static Double mercurySquare(){
        double m=sphereSquare(2439.7);
        return m;
    }
    public static Double jupiterSquare(){
        double j=sphereSquare(71492.);
        return j;
    }
    public static Double earthVsMercury(){
        double e= earthSquare(),m=mercurySquare();
        return e/m;
    }
    public static Double earthVsJupiter(){
        double e=earthSquare(),j=jupiterSquare();
        return e/j;
    }
    public static void main(String[] args) {

    }
}

