package ru.progwards.java1.lessons.interfaces;

    public class Duck extends Animal {
        public Duck(double weight) {
            super(weight);
        }
        @Override
        public AnimalKind getKind(){
            return AnimalKind.DUCK;
        }
        @Override
        public FoodKind getFoodKind(){
            return FoodKind.CORN;
        }

        @Override
        public String toString() {
            return "I am "+AnimalKind.DUCK+", eat "+FoodKind.CORN;
        }

        @Override
        public double getFoodCoeff(){
            return 0.04;
        }
        public String toStringFull(){
            return "I am "+AnimalKind.DUCK+", eat "+FoodKind.CORN+" "+calculateFoodWeight();
        }
    }

