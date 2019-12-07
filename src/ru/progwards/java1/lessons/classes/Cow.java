package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {
    public Cow(double weight) {
        super(weight);
    }
    @Override
    public AnimalKind getKind(){
        return AnimalKind.COW;
    }
    @Override
    public FoodKind getFoodKind(){
        return FoodKind.HAY;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getFoodCoeff(){
        return 0.05 ;
    }
}
