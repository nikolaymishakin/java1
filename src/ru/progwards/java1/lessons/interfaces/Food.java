package ru.progwards.java1.lessons.interfaces;

 public class Food implements CompareWeight{
    private int weight;

    public Food(int weight) {
        this.weight = weight;
    }
    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        Food food = (Food)smthHasWeigt;
        if (getWeight() < food.getWeight()) return CompareWeight.CompareResult.LESS;
        else if (getWeight() == food.getWeight()) return CompareWeight.CompareResult.EQUAL;
        else return CompareWeight.CompareResult.GREATER;
    }
     public static void sort(CompareWeight[] a) {
         for (int i = 0; i < a.length; i++) {
             for (int j = 0; j < a.length; j++) {
                 if (a[j].getWeight() > a[i].getWeight()) {
                     CompareWeight tmp = a[i];
                     a[i] = a[j];
                     a[j] = tmp;
                 }
             }
         }
     }
}
