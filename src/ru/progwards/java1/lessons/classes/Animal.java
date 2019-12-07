package ru.progwards.java1.lessons.classes;

public class Animal {

    public  Animal(double weight){
    }
    public  AnimalKind getKind(){
        return getKind().ANIMAL;
    }
    public enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}
    public FoodKind getFoodKind(){
        return getFoodKind().UNKNOWN;
    }
    public enum FoodKind {UNKNOWN, HAY, CORN}
    public String toString(){
        return "I am"+AnimalKind.ANIMAL+","+"eat"+FoodKind.UNKNOWN;
    }

    public  double getWeight(){
       return getWeight();
    }

    public double getFoodCoeff(){
        return 0.02;
    }

    public  double calculateFoodWeight(){
        return getWeight()*getFoodCoeff();
    }

    public String toStringFull(){
        return "I am"+AnimalKind.ANIMAL+"eat"+FoodKind.CORN+calculateFoodWeight();
    }

    public static void main(String[] args) {

    }
}
