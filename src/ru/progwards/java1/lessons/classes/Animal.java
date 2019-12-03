package ru.progwards.java1.lessons.classes;
public class Animal {
    public  Animal(double weight){

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

    public static void main(String[] args) {

    }
}
