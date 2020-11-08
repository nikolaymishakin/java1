package ru.progwards.java1.lessons.interfaces;

import java.util.Objects;

public class Animal implements FoodCompare{
    public double weight;
    FoodKind foodKind;

    public  Animal(double weight){
        this.weight=weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
         Animal animal = (Animal) o;
        return Double.compare(animal.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
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
        return "I am "+AnimalKind.ANIMAL+", eat "+FoodKind.UNKNOWN;
    }

    public double getWeight(){
        return weight ;
    }

    public double getFoodCoeff(){
        return 0.02;
    }

    public double calculateFoodWeight(){
        return getWeight()*getFoodCoeff();
    }
    public String toStringFull(){
        return "I am "+AnimalKind.ANIMAL+", eat "+FoodKind.UNKNOWN+" "+calculateFoodWeight();
    }
    public double getFood1kgPrice(){
            switch (foodKind){
                case UNKNOWN: return 0.0;
                case HAY: return 20.0;
                case CORN: return 50.0;
            }
            return 0.0;
    }

    public double getFoodPrice(){
        return calculateFoodWeight();
    }
    @Override
    public int compareFoodPrice(Animal aminal){
        return Double.compare(this.getFood1kgPrice(),getFood1kgPrice());
    }

    public static void main(String[] args) {
        Cow cow = new Cow(480);
        Duck duck = new Duck(480);
        Hamster hamster = new Hamster(480);
        System.out.println(cow.compareFoodPrice(duck));
        System.out.println(cow.equals(hamster));
        System.out.println(duck.equals(hamster));
    }
}
