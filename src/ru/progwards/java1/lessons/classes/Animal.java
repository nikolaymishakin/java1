package ru.progwards.java1.lessons.classes;

public class Animal {

    public  Animal(double weight){

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

    public enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}

    public  AnimalKind getKind(){
        return AnimalKind.ANIMAL;
    }

    public enum FoodKind {UNKNOWN, HAY, CORN}

    public FoodKind getFoodKind(){
        return FoodKind.UNKNOWN;
    }

    public String toString(){
        return "I am"+AnimalKind.ANIMAL+","+"eat"+FoodKind.UNKNOWN;
    }

    public String toStringFull(){
        return "I am"+AnimalKind.ANIMAL+"eat"+FoodKind.CORN+calculateFoodWeight();
    }

    public static void main(String[] args) {

    }
}
