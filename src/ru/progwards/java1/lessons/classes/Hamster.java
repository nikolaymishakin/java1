package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal{
    public Hamster(double weight) {
        super(weight);
    }
    @Override
    public AnimalKind getKind(){
        return AnimalKind.HAMSTER;
    }
    @Override
    public FoodKind getFoodKind(){
        return FoodKind.CORN;
    }
    @Override
    public String toString() {
        return "I am "+AnimalKind.HAMSTER+", eat "+FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff(){
        return 0.03;
    }

    public String toStringFull(){
        return "I am "+AnimalKind.HAMSTER+", eat "+FoodKind.CORN+" "+calculateFoodWeight();
    }
}
