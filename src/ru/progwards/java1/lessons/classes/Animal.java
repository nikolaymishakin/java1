package ru.progwards.java1.lessons.classes;

public  class Animal {
    public double weight;
    public  Animal(double weight){
        this.weight=weight;
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

    public static void main(String[] args) {
        Cow cow = new Cow(480);
        Duck duck = new Duck(480);
        Hamster hamster = new Hamster(480);
        System.out.println(cow.equals(duck));
        System.out.println(cow.equals(hamster));
        System.out.println(duck.equals(hamster));
    }
}
