package ru.progwards.java1.lessons.classes;

public class Duck extends Animal {
    public Duck(double weight) {
        super(weight);
    }
    @Override
    public AnimalKind getKind(){
        return getKind().DUCK;
    }
    @Override
    public FoodKind getFoodKind(){
        return getFoodKind().CORN;
    }

    public static void main(String[] args) {

    }
}
