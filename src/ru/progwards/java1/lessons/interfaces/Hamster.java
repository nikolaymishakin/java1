package ru.progwards.java1.lessons.interfaces;

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
    @Override
    public double getFood1kgPrice() {
        switch (foodKind) {
            case UNKNOWN:
                return 0.0;
            case HAY:
                return 20.0;
            case CORN:
                return 50.0;
        }
        return 50.0;
    }
}

