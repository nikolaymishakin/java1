package ru.progwards.java1.lessons.interfaces;

    public class Cow extends Animal {
        public Cow(double weight){
            super(weight);
            this.weight=weight;
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
            return "I am "+AnimalKind.COW+", eat "+FoodKind.HAY;
        }
        @Override
        public double getWeight(){
            return weight ;
        }
        @Override
        public double getFoodCoeff(){
            return 0.05;
        }
        public String toStringFull(){
            return "I am "+AnimalKind.COW+", eat "+FoodKind.HAY+" "+calculateFoodWeight();
        }

    }

