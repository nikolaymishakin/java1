package ru.progwards.java1.lessons.interfaces;

public interface CompareWeight {

    enum CompareResult {
        LESS, EQUAL, GREATER
    }
    CompareResult compareWeight(CompareWeight smthHasWeigt);
     public static void sort(CompareResult[] a) {
         for (int i = 0; i < a.length; i++) {
             for (int j = 0; j < a.length; j++) {
                 if (a[j].compareTo(a[i]) > 0) {
                     CompareResult tmp = a[i];
                     a[i] = a[j];
                     a[j] = tmp;
                 }
             }
         }
     }

}
