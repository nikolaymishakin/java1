package ru.progwards.java1.lessons.interfaces;

import java.util.Objects;

public  class Animal implements FoodCompare, CompareWeight {
    public double weight;

    public Animal(double weight) {
        this.weight = weight;
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

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        Animal animal = (Animal) smthHasWeigt;
        if (getWeight() < animal.getWeight()) return CompareWeight.CompareResult.LESS;
        else if (getWeight() == animal.getWeight()) return CompareWeight.CompareResult.EQUAL;
        else return CompareWeight.CompareResult.GREATER;
    }

    enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}

    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    enum FoodKind {UNKNOWN, HAY, CORN}

    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }

    public String toString() {
        return "I am " + AnimalKind.ANIMAL + ", eat " + FoodKind.UNKNOWN;
    }

    public double getWeight() {
        return weight;
    }

    public double getFoodCoeff() {
        return 0.02;
    }

    public double calculateFoodWeight() {
        return getWeight() * getFoodCoeff();
    }

    public String toStringFull() {
        return "I am " + AnimalKind.ANIMAL + ", eat " + FoodKind.UNKNOWN + " " + calculateFoodWeight();
    }

    public double getFood1kgPrice() {
        switch (getFoodKind()) {
            case UNKNOWN:
                return 0.0;
            case HAY:
                return 20.0;
            case CORN:
                return 50.0;
        }
        return 0.0;
    }

    public double getFoodPrice() {
        return calculateFoodWeight() * getFood1kgPrice();
    }

    @Override
    public int compareFoodPrice(Animal aminal) {
        return Double.compare(this.getFoodPrice(), aminal.getFoodPrice());
    }

    public static void main(String[] args) {

    }
    public static void sort(CompareResult[] a){
        for(int i = 0;i<a.length;i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j].compareTo(a[i])>0) {
                    CompareResult tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
}




