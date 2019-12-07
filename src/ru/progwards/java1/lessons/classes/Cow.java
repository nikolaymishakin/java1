package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {

    public Cow(double weight) {
        super(weight);
    }
    @Override
    public AnimalKind getKind(){
        return getKind().COW;
    }
    @Override
    public FoodKind getFoodKind(){

        return getFoodKind().HAY;

    }
    @Override
    public double getFoodCoeff(){
        return 0.05 ;
    }
}
