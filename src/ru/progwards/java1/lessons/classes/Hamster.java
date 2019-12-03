package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal{
    public Hamster(double weight) {
        super(weight);
    }
    @Override
    public AnimalKind getKind(){
        return getKind().HAMSTER;
    }
    @Override
    public FoodKind getFoodKind(){
        return getFoodKind().CORN;
    }
}
