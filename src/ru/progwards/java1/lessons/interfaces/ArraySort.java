package ru.progwards.java1.lessons.interfaces;

public class ArraySort {

    public static void sort(CompareWeight[] a) {
        CompareWeight tmp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareWeight(a[j]) == CompareWeight.CompareResult.LESS) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

        public static void main (String[]args){
            Animal[] animal = {new Animal(50), new Animal(20)};
            sort(animal);
        }
}

