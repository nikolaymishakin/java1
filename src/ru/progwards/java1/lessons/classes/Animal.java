package ru.progwards.java1.lessons.classes;

public class Animal {

    public  Animal(double weight){
    }
    enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}
    public  AnimalKind getKind(){
        return AnimalKind.ANIMAL;
    }
    enum FoodKind {UNKNOWN, HAY, CORN}
    public FoodKind getFoodKind(){
        return FoodKind.UNKNOWN;
    }
    public String toString(){
        return "I"+" "+"am"+" "+AnimalKind.ANIMAL+","+" "+"eat"+" "+FoodKind.UNKNOWN;
    }

    public  double getWeight(){
        return 0;
    }

    public double getFoodCoeff(){
        return 0.02;
    }

    public double calculateFoodWeight(){
        return 2.;
    }
    public String toStringFull(){
        return "I"+" "+"am"+" "+AnimalKind.ANIMAL+","+" "+"eat"+" "+FoodKind.UNKNOWN+" "+calculateFoodWeight();
    }
    public static void main(String[] args) {

    }
}